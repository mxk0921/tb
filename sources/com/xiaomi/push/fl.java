package com.xiaomi.push;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.fj;
import com.xiaomi.push.service.XMJobService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fl implements fj.a {

    /* renamed from: a  reason: collision with root package name */
    JobScheduler f14879a;

    /* renamed from: a  reason: collision with other field name */
    Context f989a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f990a = false;

    public fl(Context context) {
        this.f989a = context;
        this.f14879a = (JobScheduler) context.getSystemService("jobscheduler");
    }

    @Override // com.xiaomi.push.fj.a
    /* renamed from: a */
    public void mo693a() {
        this.f990a = false;
        this.f14879a.cancel(1);
    }

    public void a(long j) {
        JobInfo.Builder builder = new JobInfo.Builder(1, new ComponentName(this.f989a.getPackageName(), XMJobService.class.getName()));
        builder.setMinimumLatency(j);
        builder.setOverrideDeadline(j);
        builder.setRequiredNetworkType(1);
        builder.setPersisted(false);
        JobInfo build = builder.build();
        b.c("schedule Job = " + build.getId() + " in " + j);
        this.f14879a.schedule(builder.build());
    }

    @Override // com.xiaomi.push.fj.a
    public void a(boolean z) {
        if (z || this.f990a) {
            long b = gw.b();
            if (z) {
                mo693a();
                b -= SystemClock.elapsedRealtime() % b;
            }
            this.f990a = true;
            a(b);
        }
    }

    @Override // com.xiaomi.push.fj.a
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo693a() {
        return this.f990a;
    }
}
