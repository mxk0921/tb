package com.taobao.adaemon;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mf;
import tb.s55;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DaemonJobService extends JobService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(349175823);
    }

    public static /* synthetic */ Object ipc$super(DaemonJobService daemonJobService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/DaemonJobService");
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55aa337d", new Object[]{this, jobParameters})).booleanValue();
        }
        mf.l(new a(jobParameters));
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JobParameters f6107a;

        public a(JobParameters jobParameters) {
            this.f6107a = jobParameters;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            s55.g("DaemonJob", "onStartJob", new Object[0]);
            int i = this.f6107a.getExtras().getInt("triggerType");
            if (System.currentTimeMillis() - DaemonWorker.u().t() < 10000) {
                g.Y(true);
            }
            DaemonWorker.u().s(i);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d429dbb", new Object[]{this, jobParameters})).booleanValue();
        }
        s55.g("DaemonJob", "onStopJob", new Object[0]);
        return false;
    }
}
