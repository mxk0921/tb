package com.xiaomi.push.service;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.bh;
import com.xiaomi.push.fj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class XMJobService extends Service {

    /* renamed from: a  reason: collision with root package name */
    static Service f15009a;

    /* renamed from: a  reason: collision with other field name */
    private IBinder f1497a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a extends JobService {

        /* renamed from: a  reason: collision with root package name */
        Binder f15010a;

        /* renamed from: a  reason: collision with other field name */
        private Handler f1498a;

        /* compiled from: Taobao */
        /* renamed from: com.xiaomi.push.service.XMJobService$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public static class HandlerC0854a extends Handler {

            /* renamed from: a  reason: collision with root package name */
            JobService f15011a;

            public HandlerC0854a(JobService jobService) {
                super(jobService.getMainLooper());
                this.f15011a = jobService;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 1) {
                    JobParameters jobParameters = (JobParameters) message.obj;
                    b.m410a("Job finished " + jobParameters.getJobId());
                    this.f15011a.jobFinished(jobParameters, false);
                    if (jobParameters.getJobId() == 1) {
                        fj.a(false);
                    }
                }
            }
        }

        public a(Service service) {
            this.f15010a = null;
            this.f15010a = (Binder) bh.a((Object) this, "onBind", new Intent());
            bh.a((Object) this, "attachBaseContext", service);
        }

        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            b.m410a("Job started " + jobParameters.getJobId());
            Intent intent = new Intent(this, XMPushService.class);
            intent.setAction("com.xiaomi.push.timer");
            intent.setPackage(getPackageName());
            startService(intent);
            if (this.f1498a == null) {
                this.f1498a = new HandlerC0854a(this);
            }
            Handler handler = this.f1498a;
            handler.sendMessage(Message.obtain(handler, 1, jobParameters));
            return true;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            b.m410a("Job stop " + jobParameters.getJobId());
            return false;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IBinder iBinder = this.f1497a;
        if (iBinder != null) {
            return iBinder;
        }
        return new Binder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f1497a = new a(this).f15010a;
        f15009a = this;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        f15009a = null;
    }
}
