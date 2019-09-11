#####################################################
# Copyright (C) 2019 NXP Semiconductors
# Claudiu Lataretu <claudiuion.lataretu@nxp.com>
# Raluca Popa <raluca.popa@nxp.com>
#####################################################

DESCRIPTION = "Heterogenous eIQ demo"
LICENSE = "MIT"

require dynamic-layers/qt5-layer/recipes-fsl/images/fsl-image-qt5.bb


INSANE_SKIP_python3-dlib_append = "already-stripped"

LICENSE_FLAGS_WHITELIST = "commercial"

IMAGE_INSTALL_append = " packagegroup-core-buildessential"
IMAGE_INSTALL_append = " gstreamer1.0-plugins-bad"

IMAGE_INSTALL_append = " vim sqlite3 libsqlite3-dev"

IMAGE_INSTALL_append = " \
                        opencv \
                        opencv-dev \
"

IMAGE_INSTALL_append = " \
                        espeak \
"

IMAGE_INSTALL_append = " \
                        python3-django \
                        python3-pillow \
                        python3-django-cors-headers \
                        python3-pytz \
"

IMAGE_INSTALL_append = " \
			qt5-pin-pad \
			eiq-hetero \
"

# Security
IMAGE_ROOTFS_EXTRA_SPACE = "1048576"

IMAGE_OVERHEAD_FACTOR = "1.0"

IMAGE_INSTALL_append = " e2fsprogs util-linux libdevmapper lvm2 cryptsetup cryptodev-module cryptodev-tests"
FSL_USE_GIT = ""

# Include custom kernel headers in the SDK, required for internal development"
TOOLCHAIN_TARGET_TASK_append = " kernel-devsrc"

IMAGE_FEATURES_append = " debug-tweaks dev-pkgs package-management staticdev-pkgs tools-sdk"

