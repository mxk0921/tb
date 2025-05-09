package com.opos.process.bridge;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface a extends IInterface {

    /* compiled from: Taobao */
    /* renamed from: com.opos.process.bridge.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class AbstractBinderC0301a extends Binder implements a {

        /* compiled from: Taobao */
        /* renamed from: com.opos.process.bridge.a$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class C0302a implements a {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f5981a;

            static {
                t2o.a(253755443);
                t2o.a(253755441);
            }

            public C0302a(IBinder iBinder) {
                this.f5981a = iBinder;
            }

            @Override // com.opos.process.bridge.a
            public Bundle a(Bundle bundle) {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.opos.process.bridge.IBridgeInterface");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5981a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle2 = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle2;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5981a;
            }
        }

        static {
            t2o.a(253755442);
            t2o.a(253755441);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.opos.process.bridge.IBridgeInterface");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0302a(iBinder);
            }
            return (a) queryLocalInterface;
        }
    }

    Bundle a(Bundle bundle);
}
