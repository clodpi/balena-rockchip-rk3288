# Copyright (C) 2015 Romain Perier
# Released under the MIT license (see COPYING.MIT for the terms)

SOC_FAMILY = "rk3288"

require conf/machine/include/tune-cortexa17.inc
require conf/machine/include/soc-family.inc

MACHINEOVERRIDES =. "mali-gpu:mali-midgard:"
PREFERRED_PROVIDER_virtual/kernel = "linux-rk3288"
#PREFERRED_VERSION_linux-rk3288-board = "4.4.103"

SERIAL_CONSOLES = "115200;ttyS2"
KERNEL_IMAGETYPE = "zImage"
#KBUILD_DEFCONFIG = "multi_v7_defconfig"
#KBUILD_DEFCONFIG = "rockchip_linux_defconfig"
PREFERRED_PROVIDER_virtual/bootloader ?= "u-boot-rk3288"
SPL_BINARY ?= "u-boot-spl-dtb.bin"

#KERNEL_DEVICETREE = "rk3288-firefly-aioc.dtb"
#KERNEL_DEVICETREE = "rk3288-firefly.dtb"
UBOOT_MACHINE = "firefly-rk3288_defconfig"
