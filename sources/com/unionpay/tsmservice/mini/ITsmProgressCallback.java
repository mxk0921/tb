package com.unionpay.tsmservice.mini;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ITsmProgressCallback extends IInterface {
    void onProgress(int i);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public abstract class Stub extends Binder implements ITsmProgressCallback {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public final class a implements ITsmProgressCallback {
            public static ITsmProgressCallback b;

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f14539a;

            public a(IBinder iBinder) {
                this.f14539a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f14539a;
            }

            @Override // com.unionpay.tsmservice.mini.ITsmProgressCallback
            public final void onProgress(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.unionpay.tsmservice.mini.ITsmProgressCallback");
                    obtain.writeInt(i);
                    if (this.f14539a.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onProgress(i);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.unionpay.tsmservice.mini.ITsmProgressCallback");
        }

        public static ITsmProgressCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.unionpay.tsmservice.mini.ITsmProgressCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ITsmProgressCallback)) {
                return new a(iBinder);
            }
            return (ITsmProgressCallback) queryLocalInterface;
        }

        public static ITsmProgressCallback getDefaultImpl() {
            return a.b;
        }

        public static boolean setDefaultImpl(ITsmProgressCallback iTsmProgressCallback) {
            if (a.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iTsmProgressCallback == null) {
                return false;
            } else {
                a.b = iTsmProgressCallback;
                return true;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.unionpay.tsmservice.mini.ITsmProgressCallback");
                onProgress(parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.unionpay.tsmservice.mini.ITsmProgressCallback");
                return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
