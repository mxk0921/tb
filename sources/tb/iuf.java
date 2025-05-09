package tb;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.internal.AccsJobService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class iuf extends gva {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEAMON_JOB_ID = 2051;
    public static final int HB_JOB_ID = 2050;
    public JobScheduler c;

    static {
        t2o.a(343933174);
    }

    public iuf(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(iuf iufVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/net/JobHeartBeatMgt");
    }

    @Override // tb.gva
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return "Job";
    }

    @Override // tb.gva
    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa6bcc8", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.c == null) {
            this.c = (JobScheduler) this.f20255a.getSystemService("jobscheduler");
        }
        long j = i * 1000;
        this.c.schedule(new JobInfo.Builder(HB_JOB_ID, new ComponentName(this.f20255a.getPackageName(), AccsJobService.class.getName())).setMinimumLatency(j).setOverrideDeadline(j).setRequiredNetworkType(1).build());
    }
}
