package tb;

import android.os.SystemClock;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.event.EventCenter;
import com.taobao.tao.log.TLog;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class iw4 extends kti<gw4, ew4> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long e;

    public iw4(MetricContext metricContext, c0c c0cVar, gw4 gw4Var) {
        super(metricContext, c0cVar, gw4Var);
    }

    public static /* synthetic */ Object ipc$super(iw4 iw4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/processor/cpu/CpuAbnormalProcessor");
    }

    @Override // tb.kti
    public h3c b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h3c) ipChange.ipc$dispatch("6a72feb2", new Object[]{this});
        }
        return new h3c() { // from class: tb.hw4
            @Override // tb.h3c
            public final boolean a(int i, Map map) {
                boolean k;
                k = iw4.this.k(i, map);
                return k;
            }
        };
    }

    @Override // tb.kti
    public int[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("df81d3cb", new Object[]{this});
        }
        return new int[]{80, 54};
    }

    public final float i(long j, jft jftVar, jft jftVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e973af06", new Object[]{this, new Long(j), jftVar, jftVar2})).floatValue();
        }
        long j2 = ((jftVar2.g + jftVar2.f) - jftVar.g) - jftVar.f;
        if (j <= 0) {
            return 0.0f;
        }
        return (((1000.0f / ((float) ysg.c())) * ((float) j2)) * 1.0f) / ((float) j);
    }

    /* renamed from: j */
    public void a(ew4 ew4Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("829eeeda", new Object[]{this, ew4Var});
        } else if (ew4Var.p().size() > 0) {
            ud2 ud2Var = new ud2();
            ud2Var.f29301a = "MetricKit_CPU_Exception";
            ud2Var.b = AggregationType.STACK;
            ud2Var.c = ud2Var.f29301a + SystemClock.uptimeMillis();
            ud2Var.k = p(ew4Var.m());
            ud2Var.l = ew4Var.n();
            ud2Var.e = "1.0.1";
            ud2Var.f = l(ew4Var.p());
            ud2Var.h = m(ew4Var);
            ud2Var.i = n(ew4Var);
            vd2.a().c(this.f22911a.getApplication(), ud2Var);
            StringBuilder sb = new StringBuilder();
            Throwable th = ud2Var.k;
            if (th == null) {
                str = null;
            } else {
                str = o(th);
            }
            sb.append(str);
            sb.append("\n");
            sb.append(ud2Var.f);
            sb.append("\n");
            sb.append(ud2Var.g);
            sb.append("\n\n");
            sb.append(ud2Var.h);
            TLog.loge("MetricKit.CpuAbnormalProcessor", sb.toString());
        }
    }

    public final String l(Map<String, List<StackTraceElement[]>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9e0d9a", new Object[]{this, map});
        }
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = map.isEmpty();
        if (isEmpty) {
            sb.append("\n------stack------\n");
        }
        for (Map.Entry<String, List<StackTraceElement[]>> entry : map.entrySet()) {
            List<StackTraceElement[]> value = entry.getValue();
            if (value != null && !value.isEmpty()) {
                sb.append("thread=");
                sb.append(entry.getKey());
                sb.append("\n");
                for (StackTraceElement[] stackTraceElementArr : value) {
                    sb.append(o(p(stackTraceElementArr)));
                    sb.append("\n");
                }
            }
        }
        if (isEmpty) {
            sb.append("------stack------\n");
        }
        return sb.toString();
    }

    public final String m(ew4 ew4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbb35e5a", new Object[]{this, ew4Var});
        }
        if (!ew4Var.j()) {
            return null;
        }
        StringBuilder sb = new StringBuilder("\n");
        long q = ew4Var.q();
        List<jft> a2 = ysg.a(ew4Var.l(), ew4Var.k());
        Collections.sort(a2);
        for (jft jftVar : a2.subList(0, Math.min(a2.size(), 20))) {
            for (jft jftVar2 : ew4Var.l()) {
                if (jftVar.c == jftVar2.c) {
                    sb.append("id=");
                    sb.append(jftVar.c);
                    sb.append(" name=");
                    sb.append(jftVar.d);
                    sb.append(" threadLoadRate=");
                    sb.append(i(q, jftVar2, jftVar));
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }

    public final Map<String, Object> n(ew4 ew4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7d9f0a7b", new Object[]{this, ew4Var});
        }
        HashMap hashMap = new HashMap();
        float e = ew4Var.e("processLoadRate", -1.0f);
        hashMap.put("beforeType", ew4Var.h("type"));
        hashMap.put("processLoadRateCollectingBefore", String.valueOf(e));
        hashMap.put("processLoadRateCollectingAfter", String.valueOf(ew4Var.o()));
        hashMap.put("eventType", EventCenter.e(ew4Var.i()));
        hashMap.put(StEvent.EVENT_TIME, String.valueOf(ew4Var.g("time", -1L)));
        hashMap.put("currActivityName", this.f22911a.getCurrActivityName());
        hashMap.put("schemaUrl", this.f22911a.getSchemaUrl());
        return hashMap;
    }

    public final String o(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d5368aae", new Object[]{this, th});
        }
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public final Throwable p(StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Throwable) ipChange.ipc$dispatch("14731332", new Object[]{this, stackTraceElementArr});
        }
        if (stackTraceElementArr == null) {
            return null;
        }
        Throwable th = new Throwable();
        th.setStackTrace(stackTraceElementArr);
        return th;
    }

    public final /* synthetic */ boolean k(int i, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cba1467a", new Object[]{this, new Integer(i), map})).booleanValue();
        }
        long f = rrl.f(map.get("time"), 0L);
        this.e = f;
        return f - this.e > 300000;
    }
}
