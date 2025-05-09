package com.xiaomi.push;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ea implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private Context f14845a;

    /* renamed from: a  reason: collision with other field name */
    private String f881a;
    private String b;

    public ea(Context context, String str) {
        this.f14845a = context;
        this.f881a = str;
    }

    private void a(String str) {
        ik ikVar = new ik();
        ikVar.a(str);
        ikVar.a(System.currentTimeMillis());
        ikVar.a(ie.ActivityActiveTimeStamp);
        ei.a(this.f14845a, ikVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (!TextUtils.isEmpty(this.f881a) && !TextUtils.isEmpty(localClassName)) {
            this.b = "";
            if (TextUtils.isEmpty("") || TextUtils.equals(this.b, localClassName)) {
                a(this.f14845a.getPackageName() + "|" + localClassName + ":" + this.f881a + "," + String.valueOf(System.currentTimeMillis() / 1000));
                this.f881a = "";
                this.b = "";
                return;
            }
            this.f881a = "";
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (TextUtils.isEmpty(this.b)) {
            this.b = activity.getLocalClassName();
        }
        this.f881a = String.valueOf(System.currentTimeMillis() / 1000);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
