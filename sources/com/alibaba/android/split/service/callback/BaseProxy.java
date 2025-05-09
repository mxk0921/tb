package com.alibaba.android.split.service.callback;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BaseProxy implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final String f2245a;
    public final IBinder b;

    static {
        t2o.a(683671566);
    }

    public BaseProxy(IBinder iBinder, String str) {
        this.b = iBinder;
        this.f2245a = str;
    }

    public Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2245a);
        return obtain;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.b;
    }

    public void b(int i, Parcel parcel) {
        try {
            try {
                this.b.transact(i, parcel, null, 1);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        } finally {
            parcel.recycle();
        }
    }
}
