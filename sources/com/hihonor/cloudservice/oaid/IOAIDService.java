package com.hihonor.cloudservice.oaid;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.hihonor.cloudservice.oaid.IOAIDCallBack;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IOAIDService extends IInterface {
    void basicTypes(int i, long j, boolean z, float f, double d, String str) throws RemoteException;

    void getOAID(IOAIDCallBack iOAIDCallBack) throws RemoteException;

    void isOAIDTrackingLimited(IOAIDCallBack iOAIDCallBack) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class Stub extends Binder implements IOAIDService {
        private static final String DESCRIPTOR = "com.hihonor.cloudservice.oaid.IOAIDService";
        static final int TRANSACTION_basicTypes = 1;
        static final int TRANSACTION_getOAID = 2;
        static final int TRANSACTION_isOAIDTrackingLimited = 3;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static class Proxy implements IOAIDService {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f5220a;

            static {
                t2o.a(147849254);
                t2o.a(147849252);
            }

            public Proxy(IBinder iBinder) {
                this.f5220a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5220a;
            }

            @Override // com.hihonor.cloudservice.oaid.IOAIDService
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
                    this.f5220a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.hihonor.cloudservice.oaid.IOAIDService
            public void getOAID(IOAIDCallBack iOAIDCallBack) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iOAIDCallBack != null) {
                        iBinder = iOAIDCallBack.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f5220a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.hihonor.cloudservice.oaid.IOAIDService
            public void isOAIDTrackingLimited(IOAIDCallBack iOAIDCallBack) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iOAIDCallBack != null) {
                        iBinder = iOAIDCallBack.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f5220a.transact(3, obtain, obtain2, 0);
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
            t2o.a(147849253);
            t2o.a(147849252);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IOAIDService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IOAIDService)) {
                return new Proxy(iBinder);
            }
            return (IOAIDService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
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
                getOAID(IOAIDCallBack.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                isOAIDTrackingLimited(IOAIDCallBack.Stub.asInterface(parcel.readStrongBinder()));
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
