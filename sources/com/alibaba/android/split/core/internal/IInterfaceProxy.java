package com.alibaba.android.split.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class IInterfaceProxy implements IInterface {
    private final IBinder mRemote;
    private final String serviceName;

    static {
        t2o.a(677380142);
    }

    public IInterfaceProxy(IBinder iBinder, String str) {
        this.mRemote = iBinder;
        this.serviceName = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.mRemote;
    }

    public final Parcel obtainData() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.serviceName);
        return obtain;
    }

    public final void transact(int i, Parcel parcel) throws RemoteException {
        try {
            this.mRemote.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
