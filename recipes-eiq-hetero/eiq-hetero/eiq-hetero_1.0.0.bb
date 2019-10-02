#####################################################
# Copyright (C) 2019 NXP Semiconductors
# Claudiu Lataretu <claudiuion.lataretu@nxp.com>
# Raluca Popa <raluca.popa@nxp.com>
#####################################################

DESCRIPTION = "Heterogenous eIQ Demo - Cortex A Project"

HOMEPAGE = "https://source.codeaurora.org/external/imxsupport/eiq-heterogenous-cortexa"

LICENSE = "CLOSED"

SRC_URI = "git://source.codeaurora.org/external/imxsupport/eiq-heterogenous-cortexa.git;protocol=https;branch=master"

SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

do_install() {
	install -d ${D}/home/root/eiq-heterogenous-cortexa
	cp -r ${S}/* ${D}/home/root/eiq-heterogenous-cortexa/
}

FILES_${PN} = "/home/root/eiq-heterogenous-cortexa"
RDEPENDS_${PN} += "bash"
