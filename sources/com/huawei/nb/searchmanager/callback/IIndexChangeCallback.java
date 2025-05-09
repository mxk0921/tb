package com.huawei.nb.searchmanager.callback;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SharedMemory;
import com.huawei.nb.searchmanager.client.model.ChangedIndexContent;
import tb.sec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface IIndexChangeCallback extends IInterface {
    void onDataChanged(String str, ChangedIndexContent changedIndexContent) throws RemoteException;

    void onDataChangedLarge(String str, SharedMemory sharedMemory, int i) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class Stub extends Binder implements IIndexChangeCallback {
        private static final String DESCRIPTOR = "com.huawei.nb.searchmanager.callback.IIndexChangeCallback";
        static final int TRANSACTION_onDataChanged = 1;
        static final int TRANSACTION_onDataChangedLarge = 2;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class Proxy implements IIndexChangeCallback {
            public static IIndexChangeCallback b;

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f5524a;

            public Proxy(IBinder iBinder) {
                this.f5524a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5524a;
            }

            @Override // com.huawei.nb.searchmanager.callback.IIndexChangeCallback
            public void onDataChanged(String str, ChangedIndexContent changedIndexContent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (changedIndexContent != null) {
                        obtain.writeInt(1);
                        changedIndexContent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f5524a.transact(1, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onDataChanged(str, changedIndexContent);
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.huawei.nb.searchmanager.callback.IIndexChangeCallback
            public void onDataChangedLarge(String str, SharedMemory sharedMemory, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (sharedMemory != null) {
                        obtain.writeInt(1);
                        sharedMemory.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    if (this.f5524a.transact(2, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onDataChangedLarge(str, sharedMemory, i);
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IIndexChangeCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IIndexChangeCallback)) {
                return new Proxy(iBinder);
            }
            return (IIndexChangeCallback) queryLocalInterface;
        }

        public static IIndexChangeCallback getDefaultImpl() {
            return Proxy.b;
        }

        public static boolean setDefaultImpl(IIndexChangeCallback iIndexChangeCallback) {
            if (Proxy.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iIndexChangeCallback == null) {
                return false;
            } else {
                Proxy.b = iIndexChangeCallback;
                return true;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Parcelable.Creator creator;
            ChangedIndexContent changedIndexContent = null;
            SharedMemory sharedMemory = null;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    changedIndexContent = ChangedIndexContent.CREATOR.createFromParcel(parcel);
                }
                onDataChanged(readString, changedIndexContent);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    creator = SharedMemory.CREATOR;
                    sharedMemory = sec.a(creator.createFromParcel(parcel));
                }
                onDataChangedLarge(readString2, sharedMemory, parcel.readInt());
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class Default implements IIndexChangeCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.nb.searchmanager.callback.IIndexChangeCallback
        public void onDataChanged(String str, ChangedIndexContent changedIndexContent) throws RemoteException {
        }

        @Override // com.huawei.nb.searchmanager.callback.IIndexChangeCallback
        public void onDataChangedLarge(String str, SharedMemory sharedMemory, int i) throws RemoteException {
        }
    }
}
