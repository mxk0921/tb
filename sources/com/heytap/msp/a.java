package com.heytap.msp;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface a extends IInterface {

    /* compiled from: Taobao */
    /* renamed from: com.heytap.msp.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class AbstractBinderC0261a extends Binder implements a {

        /* compiled from: Taobao */
        /* renamed from: com.heytap.msp.a$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static class C0262a implements a {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f5209a;

            static {
                t2o.a(253755395);
                t2o.a(253755393);
            }

            public C0262a(IBinder iBinder) {
                this.f5209a = iBinder;
            }

            @Override // com.heytap.msp.a
            public void a(String str, Bundle bundle, b bVar) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.msp.IMspCoreBinder");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bVar != null) {
                        iBinder = bVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f5209a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5209a;
            }
        }

        static {
            t2o.a(253755394);
            t2o.a(253755393);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.msp.IMspCoreBinder");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0262a(iBinder);
            }
            return (a) queryLocalInterface;
        }
    }

    void a(String str, Bundle bundle, b bVar);
}
