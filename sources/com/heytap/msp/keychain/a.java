package com.heytap.msp.keychain;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface a extends IInterface {

    /* compiled from: Taobao */
    /* renamed from: com.heytap.msp.keychain.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class AbstractBinderC0263a extends Binder implements a {
        static {
            t2o.a(253755402);
            t2o.a(253755401);
        }

        public AbstractBinderC0263a() {
            attachInterface(this, "com.heytap.msp.keychain.ICallback");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            b bVar;
            if (i == 1) {
                parcel.enforceInterface("com.heytap.msp.keychain.ICallback");
                if (parcel.readInt() != 0) {
                    bVar = b.CREATOR.createFromParcel(parcel);
                } else {
                    bVar = null;
                }
                ((com.heytap.mspsdk.keychain.impl.a) this).a(bVar);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.heytap.msp.keychain.ICallback");
                return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
