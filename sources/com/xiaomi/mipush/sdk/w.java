package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f14742a;

    public w(Context context) {
        this.f14742a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            PackageInfo packageInfo = this.f14742a.getPackageManager().getPackageInfo(this.f14742a.getPackageName(), 4612);
            v.c(this.f14742a);
            v.d(this.f14742a, packageInfo);
            v.c(this.f14742a, packageInfo);
        } catch (Throwable th) {
            Log.e("ManifestChecker", "", th);
        }
    }
}
