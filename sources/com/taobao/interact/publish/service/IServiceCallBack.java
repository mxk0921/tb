package com.taobao.interact.publish.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IServiceCallBack extends IInterface {
    void onResult(List<Image> list) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static abstract class Stub extends Binder implements IServiceCallBack {
        private static final String DESCRIPTOR = "com.taobao.interact.publish.service.IServiceCallBack";
        static final int TRANSACTION_onResult = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static class Proxy implements IServiceCallBack {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f10844a;

            static {
                t2o.a(495976473);
                t2o.a(495976471);
            }

            public Proxy(IBinder iBinder) {
                this.f10844a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10844a;
            }

            @Override // com.taobao.interact.publish.service.IServiceCallBack
            public void onResult(List<Image> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeTypedList(list);
                    this.f10844a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        static {
            t2o.a(495976472);
            t2o.a(495976471);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IServiceCallBack asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IServiceCallBack)) {
                return new Proxy(iBinder);
            }
            return (IServiceCallBack) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onResult(parcel.createTypedArrayList(Image.CREATOR));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
