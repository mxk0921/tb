package com.alibaba.wireless.security.securitybody;

import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public class ThirdPartyBinder extends Binder {
    @Override // android.os.Binder
    protected native boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException;
}
