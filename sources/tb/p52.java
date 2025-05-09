package tb;

import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class p52 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f25879a;
    public String b;
    public long c;
    public jft d;
    public float e;
    public long[] f;

    public static p52 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p52) ipChange.ipc$dispatch("eb8434b5", new Object[0]);
        }
        return new p52();
    }

    public final int c(List<jft> list) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dac49024", new Object[]{this, list})).intValue();
        }
        if (list == null) {
            return 0;
        }
        for (jft jftVar : list) {
            if (jftVar != null && jftVar.j) {
                i++;
            }
        }
        return i;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816ea47b", new Object[]{this});
        } else {
            zq6.a("BatteryDumper", b(false));
        }
    }

    public p52 e(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p52) ipChange.ipc$dispatch("22558e7d", new Object[]{this, new Float(f)});
        }
        this.e = f;
        return this;
    }

    public p52 f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p52) ipChange.ipc$dispatch("7d7e3250", new Object[]{this, new Long(j)});
        }
        this.c = j;
        return this;
    }

    public p52 g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p52) ipChange.ipc$dispatch("b9448918", new Object[]{this, str});
        }
        this.f25879a = str;
        return this;
    }

    public p52 h(jft jftVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p52) ipChange.ipc$dispatch("865b210", new Object[]{this, jftVar});
        }
        this.d = jftVar;
        return this;
    }

    public p52 i(long[] jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p52) ipChange.ipc$dispatch("35393246", new Object[]{this, jArr});
        }
        this.f = jArr;
        return this;
    }

    public p52 j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p52) ipChange.ipc$dispatch("f20f510a", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public final String b(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a284a26a", new Object[]{this, new Boolean(z)});
        }
        ywm ywmVar = new ywm();
        ywmVar.c();
        long max = Math.max(1L, this.c / 1000);
        ywmVar.h("BatteryDumper").a("| ").a("pid=").a(Integer.valueOf(Process.myPid())).d().a("flag=").a(this.f25879a).d().a("type=").a(this.b).c().a("| ").a("BatteryTemp=").a(Float.valueOf(this.e)).d().a("during(seconds)=").a(Long.valueOf(max)).d().a("diff(jiffies)=").a(Long.valueOf(this.d.k)).d().a("avg(jiffies/seconds)=").a(new Formatter().format("%.2f", Double.valueOf((this.d.k * 1.0d) / max))).c();
        ArrayList arrayList = new ArrayList();
        Collections.sort(arrayList);
        ywmVar.b("thread").f("desc", "(status)name(tid)\tavg/total").f("inc_thread_num", String.valueOf(c(arrayList))).f("cur_thread_num", String.valueOf(arrayList.size()));
        for (Iterator it = (z ? arrayList : arrayList.subList(0, Math.min(arrayList.size(), 10))).iterator(); it.hasNext(); it = it) {
            jft jftVar = (jft) it.next();
            ywm a2 = ywmVar.g().a(f7l.BRACKET_START_STR);
            if (jftVar.j) {
                str = f7l.PLUS;
            } else {
                str = Constants.WAVE_SEPARATOR;
            }
            a2.a(str).a("/").a(jftVar.e).a(f7l.BRACKET_END_STR).a(jftVar.d).a(f7l.BRACKET_START_STR).a(Long.valueOf(jftVar.c)).a(f7l.BRACKET_END_STR).d().a(Long.valueOf(jftVar.k / max)).a("/").a(Long.valueOf(jftVar.k)).a(" jiffies").c();
        }
        if (!z && arrayList.size() > 10) {
            ywmVar.a("|\t\t......\n");
        }
        long[] jArr = this.f;
        if (jArr != null && jArr.length == 2) {
            ywmVar.b("network").g().a("uid=").a(Integer.valueOf(Process.myUid())).c().g().a("Rx(received)=").a(new Formatter().format("%.2f", Double.valueOf(this.f[0] / 1048576.0d))).a("M").c().g().a("Tx(transmitted)=").a(new Formatter().format("%.2f", Double.valueOf(this.f[1] / 1048576.0d))).a("M").c();
        }
        ywmVar.e();
        return ywmVar.toString();
    }
}
