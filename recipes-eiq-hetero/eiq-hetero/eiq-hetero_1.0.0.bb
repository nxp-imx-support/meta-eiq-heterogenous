#####################################################
# Copyright (C) 2019 NXP Semiconductors
# Claudiu Lataretu <claudiuion.lataretu@nxp.com>
# Raluca Popa <raluca.popa@nxp.com>
#####################################################

DESCRIPTION = "Heterogenous eIQ Demo - Cortex A Project"

HOMEPAGE = "https://bitbucket.sw.nxp.com/projects/IMXS/repos/eiq-heterogenous-cortexa/browse"

LICENSE = "CLOSED"

SRC_URI = "git://bitbucket.sw.nxp.com/imxs/eiq-heterogenous-cortexa.git;protocol=ssh;branch=master"

SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

do_install() {
	install -d ${D}/home/root/eiq-heterogenous-cortexa
	cp -r ${S}/* ${D}/home/root/eiq-heterogenous-cortexa/
}

FILES_${PN} = "/home/root/eiq-heterogenous-cortexa"
RDEPENDS_${PN} += "bash"
