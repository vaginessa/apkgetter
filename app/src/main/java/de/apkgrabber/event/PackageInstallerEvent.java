package com.apkgetter.event;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import android.content.Intent;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class PackageInstallerEvent
{
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private Intent intent;
    private long id;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public PackageInstallerEvent(
        Intent intent,
        long id
    ) {
        this.intent = intent;
        this.id = id;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Intent getIntent() {
        return intent;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public long getId() {
        return id;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////