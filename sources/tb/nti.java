package tb;

import com.alibaba.appmonitor.event.EventType;
import com.alibaba.appmonitor.model.Metric;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nti implements rbo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<Metric, ej8> f24940a = Collections.synchronizedMap(new HashMap());

    static {
        t2o.a(962593046);
        t2o.a(962593059);
    }

    public ej8 a(Integer num, String str, String str2, String str3, Class<? extends ej8> cls) {
        boolean z;
        Metric metric;
        ej8 ej8Var;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ej8) ipChange.ipc$dispatch("31b1d302", new Object[]{this, num, str, str2, str3, cls});
        }
        if (num.intValue() == EventType.STAT.getEventId()) {
            metric = lti.d().c(str, str2);
            z = false;
        } else {
            metric = (Metric) to1.a().d(Metric.class, str, str2, str3);
            z = true;
        }
        if (metric == null) {
            return null;
        }
        if (this.f24940a.containsKey(metric)) {
            ej8Var = this.f24940a.get(metric);
            z2 = z;
        } else {
            synchronized (nti.class) {
                ej8Var = (ej8) to1.a().d(cls, num, str, str2, str3);
                this.f24940a.put(metric, ej8Var);
            }
        }
        if (!z2) {
            return ej8Var;
        }
        to1.a().c(metric);
        return ej8Var;
    }

    public List<ej8> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9579da71", new Object[]{this});
        }
        return new ArrayList(this.f24940a.values());
    }

    @Override // tb.rbo
    public void clean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
            return;
        }
        for (ej8 ej8Var : this.f24940a.values()) {
            to1.a().c(ej8Var);
        }
        this.f24940a.clear();
    }

    @Override // tb.rbo
    public void fill(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7129a67", new Object[]{this, objArr});
        } else if (this.f24940a == null) {
            this.f24940a = Collections.synchronizedMap(new HashMap());
        }
    }
}
