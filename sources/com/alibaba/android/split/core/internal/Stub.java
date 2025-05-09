package com.alibaba.android.split.core.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Stub extends Binder implements IInterface {
    static {
        t2o.a(677380170);
    }

    public Stub(String str) {
        attachInterface(this, str);
    }

    public boolean onTransact(int i, Parcel parcel) throws RemoteException {
        return false;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return onTransact(i, parcel);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
