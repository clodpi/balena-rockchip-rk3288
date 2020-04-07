FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

DEPENDS += "openssl-native"

SRC_URI = " \
	git://github.com/rockchip-linux/kernel.git;branch=release-4.4; \
        file://defconfig \
        file://1001-dtsFile.patch \
        file://1012-ap6236.patch \
        file://1003-ap6236.patch \
        file://1004-ap6236.patch \
"

SRCREV = "15dbb651be03ed7f9905f2e7c54b61d55011f54a"

LINUX_VERSION = "4.4.103"
require recipes-kernel/linux/linux-yocto.inc

PV = "${LINUX_VERSION}"

KCONFIG_MODE="--alldefconfig"

#require linux-stable.inc
#deltask kernel_configme
COMPATIBLE_MACHINE = "(firefly-rk3288|aio-3288c)"
