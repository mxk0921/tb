package com.hihonor.cloudservice.oaid;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IOAIDCallBack extends IInterface {
    void basicTypes(int i, long j, boolean z, float f, double d, String str) throws RemoteException;

    void handleResult(int i, Bundle bundle) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class Stub extends Binder implements IOAIDCallBack {
        private static final String DESCRIPTOR = "com.hihonor.cloudservice.oaid.IOAIDCallBack";
        static final int TRANSACTION_basicTypes = 1;
        static final int TRANSACTION_handleResult = 2;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static class Proxy implements IOAIDCallBack {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f5219a;

            static {
                t2o.a(147849251);
                t2o.a(147849249);
            }

            public Proxy(IBinder iBinder) {
                this.f5219a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5219a;
            }

            @Override // com.hihonor.cloudservice.oaid.IOAIDCallBack
            public void basicTypes(int i, long j, boolean z, float f, double d, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeFloat(f);
                    obtain.writeDouble(d);
                    obtain.writeString(str);
                    this.f5219a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.hihonor.cloudservice.oaid.IOAIDCallBack
            public void handleResult(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5219a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        static {
            t2o.a(147849250);
            t2o.a(147849249);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IOAIDCallBack asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IOAIDCallBack)) {
                return new Proxy(iBinder);
            }
            return (IOAIDCallBack) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            Bundle bundle;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                int readInt = parcel.readInt();
                long readLong = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                basicTypes(readInt, readLong, z, parcel.readFloat(), parcel.readDouble(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                int readInt2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                handleResult(readInt2, bundle);
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
