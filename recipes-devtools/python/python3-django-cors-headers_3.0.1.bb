#####################################################
# Copyright (C) 2019 NXP Semiconductors
# Dan Brezeanu <dan.brezeanu@nxp.com>
#####################################################

DESCRIPTION = "django-cors-headers is a Django application for handling the server headers required for Cross-Origin Resource Sharing (CORS)."
LICENSE = "MIT"
SRCNAME = "django-cors-headers"

HOMEPAGE = "https://github.com/ottoyiu/django-cors-headers"

inherit pypi
inherit setuptools3

LIC_FILES_CHKSUM = "file://LICENSE;md5=f966830710283335e1c794251730dd76"

SRC_URI[md5sum] = "f97f78618a123bb8b43c10e0cc61c5f1"
SRC_URI[sha256sum] = "b57087e45e4418a6147b8a27ca9d19da2c16b3e4732b2372fe2d9774fc7c5bca"

PYPI_PACKAGE = "django-cors-headers"
