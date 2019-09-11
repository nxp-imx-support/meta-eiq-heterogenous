#####################################################
# Copyright (C) 2019 NXP Semiconductors
# Dan Brezeanu <dan.brezeanu@nxp.com>
#####################################################

DESCRIPTION = "Python Web framework"
LICENSE = "BSD"
SRCNAME = "Django"

HOMEPAGE = "https://www.djangoproject.com/"

inherit pypi
inherit setuptools3

LIC_FILES_CHKSUM = "file://LICENSE;md5=f09eb47206614a4954c51db8a94840fa"

SRC_URI[md5sum] = "4a01d9325ac60e8d329762ecb9c9d2ea"
SRC_URI[sha256sum] = "7f246078d5a546f63c28fc03ce71f4d7a23677ce42109219c24c9ffb28416137"

PYPI_PACKAGE = "Django"
