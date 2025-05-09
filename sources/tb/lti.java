package tb;

import com.alibaba.appmonitor.model.Metric;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lti {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static lti b;

    /* renamed from: a  reason: collision with root package name */
    public final List<Metric> f23556a;

    static {
        t2o.a(962593045);
    }

    public lti(int i) {
        this.f23556a = new ArrayList(i);
    }

    public static lti d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lti) ipChange.ipc$dispatch("16620dc3", new Object[0]);
        }
        if (b == null) {
            b = new lti(3);
        }
        return b;
    }

    public void a(Metric metric) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e32d04e", new Object[]{this, metric});
            return;
        }
        if (((ArrayList) this.f23556a).contains(metric)) {
            ((ArrayList) this.f23556a).remove(metric);
        }
        ((ArrayList) this.f23556a).add(metric);
    }

    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ad57423", new Object[]{this, str, str2})).booleanValue();
        }
        if (hsq.f(str) || hsq.f(str2)) {
            return false;
        }
        ArrayList arrayList = (ArrayList) this.f23556a;
        if (arrayList.isEmpty()) {
            return true;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Metric metric = (Metric) it.next();
                if (str.equals(metric.getModule()) && str2.equals(metric.getMonitorPoint())) {
                    return false;
                }
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public Metric c(String str, String str2) {
        List<Metric> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Metric) ipChange.ipc$dispatch("590a4f67", new Object[]{this, str, str2});
        }
        if (str == null || str2 == null || (list = this.f23556a) == null) {
            return null;
        }
        int size = ((ArrayList) list).size();
        for (int i = 0; i < size; i++) {
            Metric metric = (Metric) ((ArrayList) this.f23556a).get(i);
            if (metric != null && metric.getModule().equals(str) && metric.getMonitorPoint().equals(str2)) {
                return metric;
            }
        }
        Metric w = ait.v().w(str, str2);
        if (w != null) {
            ((ArrayList) this.f23556a).add(w);
        }
        return w;
    }
}
