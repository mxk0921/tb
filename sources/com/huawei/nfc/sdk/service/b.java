package com.huawei.nfc.sdk.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.huawei.nfc.sdk.service.ICUPOnlinePayService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f5529a;

    public b(c cVar) {
        this.f5529a = cVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        byte[] bArr;
        byte[] bArr2;
        bArr = this.f5529a.f5530a;
        synchronized (bArr) {
            this.f5529a.c = ICUPOnlinePayService.Stub.asInterface(iBinder);
            bArr2 = this.f5529a.f5530a;
            bArr2.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        byte[] bArr;
        byte[] bArr2;
        bArr = this.f5529a.f5530a;
        synchronized (bArr) {
            this.f5529a.c = null;
            bArr2 = this.f5529a.f5530a;
            bArr2.notifyAll();
        }
    }
}
