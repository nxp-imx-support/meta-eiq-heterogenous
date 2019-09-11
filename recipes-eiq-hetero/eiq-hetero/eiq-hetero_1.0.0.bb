#####################################################
# Copyright (C) 2019 NXP Semiconductors
# Claudiu Lataretu <claudiuion.lataretu@nxp.com>
# Raluca Popa <raluca.popa@nxp.com>
#####################################################

DESCRIPTION = "Heterogenous eIQ Demo - Cortex A Project"

HOMEPAGE = "https://bitbucket.sw.nxp.com/projects/MICRSE/repos/eiq-hetero-cortexa/browse"

LICENSE = "CLOSED"

SRC_URI = "git://bitbucket.sw.nxp.com/micrse/eiq-hetero-cortexa.git;protocol=ssh;branch=master"

SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

do_install() {
	install -d ${D}/home/root/eiq-hetero-cortexa
	cp -r ${S}/* ${D}/home/root/eiq-hetero-cortexa/
}

FILES_${PN} = "/home/root/eiq-hetero-cortexa"
RDEPENDS_${PN} += "bash"
