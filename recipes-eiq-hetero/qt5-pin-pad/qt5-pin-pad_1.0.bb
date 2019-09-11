#####################################################
# Copyright (C) 2019 NXP Semiconductors
# Claudiu Lataretu <claudiuion.lataretu@nxp.com>
# Raluca Popa <raluca.popa@nxp.com>
#####################################################

DESCRIPTION = "QT5 application based on WebEngine"
LICENSE = "CLOSED"

SRC_URI = "https://bitbucket.sw.nxp.com/projects/MICRSE/repos/eiq-hetero-qt5-pin-pad/browse"
SRCREV = "master"
S = "${WORKDIR}/git"

DEPENDS = "qtdeclarative qtquickcontrols2"
RDEPENDS_${PN} = "qtwebengine qtquickcontrols2 qtmultimedia libjs-jquery"

require recipes-qt/qt5/qt5.inc

FILES_${PN} = "/opt/src/bin/src"
