LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

#FILESEXTRAPATHS_prepend := "${THISDIR}/service_file:"

SRC_URI = " \
    git://github.com/rockchip-linux/rkwifibt.git \
    file://config.txt \
"
#SRCREV = "456b6008e495d40793eba5c8abcad8d09c65f6ea"
SRCREV = "bcfe5dc630ec1a0d129101bc3abae208ba848ccc"
#RDEPENDS_${PN} += "linux-firmware-rtl8723b"

S = "${WORKDIR}/git/firmware/broadcom"
               
#PN=rkwifi-${PV}
TARGET_CC_ARCH += "${LDFLAGS}"
#PACKAGES =+ "${PN}-rkwifi"
#inherit systemd

#SYSTEMD_SERVICE_${PN} = "bluetooth_rk.service"

do_install () {
        install -d ${D}/lib/firmware
#        cp -rf ${S} ${D}/lib/firmware
#        install -m 0755 ${S}/all/wifi/fw_bcm43438a0.bin ${D}/lib/firmware/fw_bcm43438a0.bin
#        install -m 0755 ${S}/all/wifi/nvram_ap6212.txt ${D}/lib/firmware/nvram_ap6212.txt
        install -m 0755 ${S}/AP6236/wifi/fw_bcm43436b0.bin ${D}/lib/firmware/fw_bcm43438a0.bin
        install -m 0755 ${S}/AP6236/wifi/nvram_ap6236.txt ${D}/lib/firmware/nvram_ap6212.txt
        install -m 0755 ${WORKDIR}/config.txt ${D}/lib/firmware/config.txt
        install -m 0755 ${S}/AP6236/wifi/fw_bcm43436b0.bin ${D}/lib/firmware/fw_bcm43436b0.bin
        install -m 0755 ${S}/AP6236/wifi/nvram_ap6236.txt ${D}/lib/firmware/nvram_ap6236.txt

#        install -m 0755 ${S}/fw_bcm43436b0_apsta.bin ${D}/lib/firmware/fw_bcm43436b0.bin
}
FILES_SOLIBSDEV = ""
FILES_${PN} += " /lib /lib/firmware  /lib/firmware/* "

#PACKAGES = "${PN}-rkwifi"
#FILES_${PN} += " ${D}/lib/firmware/* "
