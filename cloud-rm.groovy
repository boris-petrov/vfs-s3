#!/usr/bin/env groovy

@Grab(group='com.github.abashev', module='vfs-s3', version='4.1.0-SNAPSHOT')

import org.apache.commons.vfs2.*

if (args.length != 1) {
    println 'Use: cloud-rm <from commons-vfs url>'
    println 'Url example - s3://access:secret@s3.eu-central-1.amazonaws.com/s3-tests-2 or any http url'

    return
}

VFS.getManager().resolveFile(args[0]).delete()
