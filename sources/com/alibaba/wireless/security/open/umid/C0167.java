package com.alibaba.wireless.security.open.umid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.alibaba.wireless.security.open.umid.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0167 {

    /* renamed from: com.alibaba.wireless.security.open.umid.а$б  reason: contains not printable characters */
    /* loaded from: classes.dex */
    private static final class ServiceConnectionC0169 implements ServiceConnection {

        /* renamed from: а  reason: contains not printable characters */
        boolean f365;

        /* renamed from: б  reason: contains not printable characters */
        private final LinkedBlockingQueue<IBinder> f366;

        private ServiceConnectionC0169() {
            this.f365 = false;
            this.f366 = new LinkedBlockingQueue<>(1);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f366.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        /* renamed from: а  reason: contains not printable characters */
        public IBinder m231() throws InterruptedException {
            if (!this.f365) {
                this.f365 = true;
                return this.f366.take();
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.alibaba.wireless.security.open.umid.а$в  reason: contains not printable characters */
    /* loaded from: classes.dex */
    private static final class C0170 implements IInterface {

        /* renamed from: а  reason: contains not printable characters */
        private IBinder f367;

        public C0170(IBinder iBinder) {
            this.f367 = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f367;
        }

        /* renamed from: а  reason: contains not printable characters */
        public String m232() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f367.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: б  reason: contains not printable characters */
        public boolean m233(boolean z) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z2 = true;
                obtain.writeInt(z ? 1 : 0);
                this.f367.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z2 = false;
                }
                return z2;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* renamed from: а  reason: contains not printable characters */
    public static String m230(Context context) throws Exception {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return "Cannot call in the main thread, You must call in the other thread";
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        ServiceConnectionC0169 r0 = new ServiceConnectionC0169();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, r0, 1)) {
            return "";
        }
        try {
            return new C0170(r0.m231()).m232();
        } finally {
            context.unbindService(r0);
        }
    }
}
