package com.heytap.msp;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;
import tb.b9j;
import tb.c3j;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface b extends IInterface {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class a extends Binder implements b {
        static {
            t2o.a(253755397);
            t2o.a(253755396);
        }

        public a() {
            attachInterface(this, "com.heytap.msp.IResult");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.heytap.msp.IResult");
                parcel.readInt();
                Collection<CountDownLatch> values = com.heytap.mspsdk.proxy.b.this.f5213a.values();
                c3j.f(b9j.TAG, "onResult latches size " + values.size());
                if (!values.isEmpty() && values.size() > 0) {
                    for (CountDownLatch countDownLatch : values) {
                        countDownLatch.countDown();
                        c3j.f(b9j.TAG, "onResult latches countDown()");
                    }
                }
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.heytap.msp.IResult");
                return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
