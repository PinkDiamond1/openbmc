# Copyright 2015-present Facebook. All Rights Reserved.
SUMMARY = "Bridge IC Utility"
DESCRIPTION = "Util for checking with Bridge IC on fbttn"
SECTION = "base"
PR = "r1"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://bic-util.c;beginline=4;endline=16;md5=b395943ba8a0717a83e62ca123a8d238"

SRC_URI = "file://bic-util \
          "

S = "${WORKDIR}/bic-util"

do_install() {
	  install -d ${D}${bindir}
    install -m 0755 bic-util ${D}${bindir}/bic-util
}

DEPENDS += "libbic libfbttn-gpio"
RDEPENDS:${PN} += "libbic libfbttn-gpio"

FILES:${PN} = "${bindir}"
