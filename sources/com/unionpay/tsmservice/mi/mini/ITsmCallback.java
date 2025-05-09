package com.unionpay.tsmservice.mi.mini;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ITsmCallback extends IInterface {
    void onError(String str, String str2);

    void onResult(Bundle bundle);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public abstract class Stub extends Binder implements ITsmCallback {
        private static final String DESCRIPTOR = "com.unionpay.tsmservice.mi.mini.ITsmCallback";
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onResult = 1;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public final class a implements ITsmCallback {
            public static ITsmCallback b;

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f14534a;

            public a(IBinder iBinder) {
                this.f14534a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f14534a;
            }

            @Override // com.unionpay.tsmservice.mi.mini.ITsmCallback
            public final void onError(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.f14534a.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onError(str, str2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.unionpay.tsmservice.mi.mini.ITsmCallback
            public final void onResult(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f14534a.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onResult(bundle);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ITsmCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ITsmCallback)) {
                return new a(iBinder);
            }
            return (ITsmCallback) queryLocalInterface;
        }

        public static ITsmCallback getDefaultImpl() {
            return a.b;
        }

        public static boolean setDefaultImpl(ITsmCallback iTsmCallback) {
            if (a.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iTsmCallback == null) {
                return false;
            } else {
                a.b = iTsmCallback;
                return true;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Bundle bundle;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                onResult(bundle);
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onError(parcel.readString(), parcel.readString());
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
