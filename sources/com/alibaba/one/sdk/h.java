package com.alibaba.one.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static String f2509a = "";

    /* loaded from: classes.dex */
    static final class a implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        boolean f2511a;
        final LinkedBlockingQueue<IBinder> b;

        private a() {
            this.f2511a = false;
            this.b = new LinkedBlockingQueue<>(10);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.b.offer(iBinder);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* loaded from: classes.dex */
    static final class b implements IInterface {

        /* renamed from: a  reason: collision with root package name */
        private IBinder f2512a;

        public b(IBinder iBinder) {
            this.f2512a = iBinder;
        }

        public final String a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f2512a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f2512a;
        }
    }

    public static String a(final Context context) throws UnsupportedEncodingException {
        if (!TextUtils.isEmpty(f2509a)) {
            return f2509a;
        }
        if (TextUtils.equals(Build.FINGERPRINT, new String(Base64.decode("RE9PVi9mdWxsX2JpcmRfNjc1MF9jNjZfbS9iaXJkXzY3NTBfYzY2X206Ni4wL01SQTU4Sy8xNDk5NDI5MTMyOnVzZXIvdGVzdC1rZXlzCg==", 0), "UTF-8"))) {
            return f2509a;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: com.alibaba.one.sdk.h.1
            /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
                if (r2 != false) goto L_0x004f;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
                r1.unbindService(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
                if (r1 == false) goto L_0x0063;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
                r2.countDown();
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
                return;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r6 = this;
                    com.alibaba.one.sdk.h$a r0 = new com.alibaba.one.sdk.h$a
                    r1 = 0
                    r0.<init>(r1)
                    android.content.Intent r2 = new android.content.Intent
                    java.lang.String r3 = "com.google.android.gms.ads.identifier.service.START"
                    r2.<init>(r3)
                    java.lang.String r3 = "com.google.android.gms"
                    r2.setPackage(r3)
                    android.content.Context r3 = r1     // Catch: all -> 0x0055, Exception -> 0x0060
                    r4 = 1
                    boolean r2 = r3.bindService(r2, r0, r4)     // Catch: all -> 0x0055, Exception -> 0x0060
                    if (r2 == 0) goto L_0x004d
                    android.content.Context r3 = r1     // Catch: all -> 0x0049, Exception -> 0x004b
                    android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: all -> 0x0049, Exception -> 0x004b
                    java.lang.String r5 = "com.android.vending"
                    r3.getPackageInfo(r5, r1)     // Catch: all -> 0x0049, Exception -> 0x004b
                    boolean r1 = r0.f2511a     // Catch: all -> 0x0049, Exception -> 0x004b
                    if (r1 != 0) goto L_0x0043
                    r0.f2511a = r4     // Catch: all -> 0x0049, Exception -> 0x004b
                    java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r1 = r0.b     // Catch: all -> 0x0049, Exception -> 0x004b
                    java.lang.Object r1 = r1.take()     // Catch: all -> 0x0049, Exception -> 0x004b
                    android.os.IBinder r1 = (android.os.IBinder) r1     // Catch: all -> 0x0049, Exception -> 0x004b
                    if (r1 == 0) goto L_0x004d
                    com.alibaba.one.sdk.h$b r3 = new com.alibaba.one.sdk.h$b     // Catch: all -> 0x0049, Exception -> 0x004b
                    r3.<init>(r1)     // Catch: all -> 0x0049, Exception -> 0x004b
                    java.lang.String r1 = r3.a()     // Catch: all -> 0x0049, Exception -> 0x004b
                    com.alibaba.one.sdk.h.a(r1)     // Catch: all -> 0x0049, Exception -> 0x004b
                    goto L_0x004d
                L_0x0043:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: all -> 0x0049, Exception -> 0x004b
                    r1.<init>()     // Catch: all -> 0x0049, Exception -> 0x004b
                    throw r1     // Catch: all -> 0x0049, Exception -> 0x004b
                L_0x0049:
                    r1 = move-exception
                    goto L_0x0058
                L_0x004b:
                    r1 = r2
                    goto L_0x0060
                L_0x004d:
                    if (r2 == 0) goto L_0x0063
                L_0x004f:
                    android.content.Context r1 = r1     // Catch: Exception -> 0x0063
                    r1.unbindService(r0)     // Catch: Exception -> 0x0063
                    goto L_0x0063
                L_0x0055:
                    r2 = move-exception
                    r1 = r2
                    r2 = 0
                L_0x0058:
                    if (r2 == 0) goto L_0x005f
                    android.content.Context r2 = r1     // Catch: Exception -> 0x005f
                    r2.unbindService(r0)     // Catch: Exception -> 0x005f
                L_0x005f:
                    throw r1
                L_0x0060:
                    if (r1 == 0) goto L_0x0063
                    goto L_0x004f
                L_0x0063:
                    java.util.concurrent.CountDownLatch r0 = r2
                    r0.countDown()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alibaba.one.sdk.h.AnonymousClass1.run():void");
            }
        }).start();
        try {
            countDownLatch.await(50L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
        return f2509a;
    }
}
