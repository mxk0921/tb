package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.TriggerService;
import com.taobao.adaemon.g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qhq extends v80 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Intent c;
    public boolean d;

    static {
        t2o.a(349175907);
    }

    public qhq(String str, int i) {
        super(str, i);
    }

    public static /* synthetic */ Object ipc$super(qhq qhqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/chains/StartServiceAction");
    }

    @Override // tb.v80
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else if (this.c != null) {
            if (this.d) {
                if (g.F(g.l(), "command", "ac_ssa_day", "ac_ssa_times", "ac_ssa_minute") >= oxn.s().d()) {
                    s55.i("StartServiceAction", "execute limit", new Object[0]);
                    b();
                    return;
                }
                g.J(g.l(), "ac_ssa_day", "ac_ssa_times", "ac_ssa_minute");
            }
            lef.f(g.l(), this.c);
            c();
        } else {
            b();
        }
    }

    @Override // tb.v80
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f571fd04", new Object[]{this, str});
            return;
        }
        try {
            this.c = Intent.parseUri(str, 0);
            boolean contains = str.contains(TriggerService.class.getName());
            this.d = contains;
            s55.i("StartServiceAction", "parse", "limit", Boolean.valueOf(contains), "mIntent", this.c);
        } catch (Throwable th) {
            s55.h("StartServiceAction", "parse err", th, new Object[0]);
        }
    }
}
