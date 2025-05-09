package com.vivo.push.f;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.vivo.push.util.u;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f14597a;
    final /* synthetic */ Map b;
    final /* synthetic */ e c;

    public f(e eVar, Context context, Map map) {
        this.c = eVar;
        this.f14597a = context;
        this.b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ComponentName componentName;
        String packageName = this.f14597a.getPackageName();
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) this.f14597a.getSystemService("activity")).getRunningTasks(100);
            if (runningTasks != null) {
                for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
                    componentName = runningTaskInfo.topActivity;
                    if (componentName.getPackageName().equals(packageName)) {
                        u.d("NotifyOpenClientTask", "topClassName=" + componentName.getClassName());
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        intent.setFlags(335544320);
                        e.b(intent, this.b);
                        this.f14597a.startActivity(intent);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            u.a("NotifyOpenClientTask", "start recentIntent is error", e);
        }
        Intent launchIntentForPackage = this.f14597a.getPackageManager().getLaunchIntentForPackage(this.f14597a.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(268435456);
            e.b(launchIntentForPackage, this.b);
            this.f14597a.startActivity(launchIntentForPackage);
            return;
        }
        u.a("NotifyOpenClientTask", "LaunchIntent is null");
    }
}
