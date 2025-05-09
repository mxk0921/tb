package com.unionpay.tsmservice.mini;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.unionpay.tsmservice.mini.ITsmCallback;
import com.unionpay.tsmservice.mini.ITsmProgressCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ITsmServiceMini extends IInterface {
    int commonInterface(String str, String str2, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public abstract class Stub extends Binder implements ITsmServiceMini {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public final class a implements ITsmServiceMini {
            public static ITsmServiceMini b;

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f14540a;

            public a(IBinder iBinder) {
                this.f14540a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f14540a;
            }

            @Override // com.unionpay.tsmservice.mini.ITsmServiceMini
            public final int commonInterface(String str, String str2, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.unionpay.tsmservice.mini.ITsmServiceMini");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    IBinder iBinder2 = null;
                    if (iTsmCallback != null) {
                        iBinder = iTsmCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (iTsmProgressCallback != null) {
                        iBinder2 = iTsmProgressCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder2);
                    if (this.f14540a.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    }
                    int commonInterface = Stub.getDefaultImpl().commonInterface(str, str2, iTsmCallback, iTsmProgressCallback);
                    obtain2.recycle();
                    obtain.recycle();
                    return commonInterface;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.unionpay.tsmservice.mini.ITsmServiceMini");
        }

        public static ITsmServiceMini asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.unionpay.tsmservice.mini.ITsmServiceMini");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ITsmServiceMini)) {
                return new a(iBinder);
            }
            return (ITsmServiceMini) queryLocalInterface;
        }

        public static ITsmServiceMini getDefaultImpl() {
            return a.b;
        }

        public static boolean setDefaultImpl(ITsmServiceMini iTsmServiceMini) {
            if (a.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iTsmServiceMini == null) {
                return false;
            } else {
                a.b = iTsmServiceMini;
                return true;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.unionpay.tsmservice.mini.ITsmServiceMini");
                int commonInterface = commonInterface(parcel.readString(), parcel.readString(), ITsmCallback.Stub.asInterface(parcel.readStrongBinder()), ITsmProgressCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(commonInterface);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.unionpay.tsmservice.mini.ITsmServiceMini");
                return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
