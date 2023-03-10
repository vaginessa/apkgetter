package com.apkgetter.model;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class InstallStatus
{
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static final int STATUS_INSTALL = 0;
	public static final int STATUS_INSTALLING = 1;
	public static final int STATUS_INSTALLED = 2;

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private long mId;
	private int mStatus;

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public InstallStatus(
	) {
		setId(0);
		setStatus(0);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public InstallStatus(
		long id,
		int status
	) {
		setId(id);
		setStatus(status);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public int getStatus(
	) {
		return mStatus;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public long getId(
	) {
		return mId;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void setStatus(
		int status
	) {
		mStatus = status;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void setId(
		long id
	) {
		mId = id;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////