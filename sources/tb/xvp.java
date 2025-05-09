package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.MemoryLog;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.a;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.b;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xvp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String f = xvp.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final String f31628a;
    public final MemoryLog b;
    public final MemoryLog c;
    public b d = null;
    public a e = null;

    static {
        t2o.a(295699707);
    }

    public xvp(String str) {
        this.f31628a = str;
        this.b = new MemoryLog(str);
        this.c = new MemoryLog(str);
    }

    public nib a(SmartLandingTask smartLandingTask) {
        SmartLandingTask.ShowStrategy showStrategy;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nib) ipChange.ipc$dispatch("67ccde9d", new Object[]{this, smartLandingTask});
        }
        if (smartLandingTask == null || (showStrategy = smartLandingTask.showStrategy) == null) {
            return null;
        }
        if ("page".equals(showStrategy.life)) {
            return this.b;
        }
        if ("app".equals(showStrategy.life)) {
            return this.c;
        }
        if ("global".equals(showStrategy.life)) {
            return this.d;
        }
        if (APower.e.KEY_DAY.equals(showStrategy.life)) {
            return this.e;
        }
        return null;
    }

    public void b(List<SmartLandingTask> list) {
        nib a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1fb5980", new Object[]{this, list});
        } else if (list != null) {
            try {
                for (SmartLandingTask smartLandingTask : list) {
                    if (!(smartLandingTask == null || smartLandingTask.showStrategy == null || (a2 = a(smartLandingTask)) == null)) {
                        a2.b(smartLandingTask);
                    }
                }
            } catch (Exception e) {
                o3s.c(f, "initConfigWithShowStrategy exp", e);
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2501fd", new Object[]{this});
            return;
        }
        if (this.d == null) {
            this.d = new b("taobao_live_ubee_global_persistent_log", this.f31628a);
        }
        if (this.e == null) {
            this.e = new a("taobao_live_ubee_day_persistent_log", this.f31628a);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3915b876", new Object[]{this});
        } else {
            this.b.e();
        }
    }
}
