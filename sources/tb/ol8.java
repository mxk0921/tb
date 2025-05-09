package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.event.EventCenter;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class ol8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, List<n3c>> f25457a;
    public final Handler b;
    public boolean c;
    public final int[] d;
    public volatile boolean e;
    public boolean f;

    public ol8(Handler handler) {
        this.f25457a = new HashMap();
        this.c = true;
        this.e = true;
        this.b = handler;
        this.d = l();
    }

    public final /* synthetic */ void d(int i, n3c n3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f901194", new Object[]{this, new Integer(i), n3cVar});
            return;
        }
        List<n3c> list = this.f25457a.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList<>();
            this.f25457a.put(Integer.valueOf(i), list);
        }
        if (!list.contains(n3cVar)) {
            list.add(n3cVar);
        }
    }

    public final /* synthetic */ void e(int i, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288f539b", new Object[]{this, new Integer(i), map});
        } else {
            m(i, t(map));
        }
    }

    public final /* synthetic */ void f(int i, n3c n3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76a2312", new Object[]{this, new Integer(i), n3cVar});
            return;
        }
        List<n3c> list = this.f25457a.get(Integer.valueOf(i));
        if (list != null) {
            list.remove(n3cVar);
        }
    }

    public void g(final int i, final n3c n3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23b7064", new Object[]{this, new Integer(i), n3cVar});
        } else if (rz3.c(this.d, i)) {
            this.b.post(new Runnable() { // from class: tb.ml8
                @Override // java.lang.Runnable
                public final void run() {
                    ol8.this.d(i, n3cVar);
                }
            });
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4278985", new Object[]{this});
        } else {
            this.c = false;
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c630155", new Object[]{this});
        } else {
            this.e = false;
        }
    }

    public Handler j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("75542e4a", new Object[]{this});
        }
        return this.b;
    }

    public void k(final int i, final Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b492e9", new Object[]{this, new Integer(i), map});
        } else if (rz3.c(this.d, i)) {
            if (this.c) {
                this.b.post(new Runnable() { // from class: tb.nl8
                    @Override // java.lang.Runnable
                    public final void run() {
                        ol8.this.e(i, map);
                    }
                });
            } else {
                m(i, t(map));
            }
        }
    }

    public abstract int[] l();

    public final void m(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("495eae4e", new Object[]{this, new Integer(i), map});
            return;
        }
        List<n3c> list = (List) ((HashMap) this.f25457a).get(Integer.valueOf(i));
        if (!(list == null || list.size() == 0)) {
            if (this.e) {
                TLog.loge("MetricKit.EventSource", "Event: " + EventCenter.e(i) + " Data: " + new JSONObject(map));
            }
            for (n3c n3cVar : list) {
                n3cVar.onEvent(i, map);
            }
        }
    }

    public abstract void q(MetricContext metricContext);

    public void r(final int i, final n3c n3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3feb47", new Object[]{this, new Integer(i), n3cVar});
        } else {
            this.b.post(new Runnable() { // from class: tb.ll8
                @Override // java.lang.Runnable
                public final void run() {
                    ol8.this.f(i, n3cVar);
                }
            });
        }
    }

    public void s(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52713d15", new Object[]{this, metricContext});
        } else if (!this.f) {
            q(metricContext);
            this.f = true;
        }
    }

    public final Map<String, ?> t(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4c78a9f4", new Object[]{this, map});
        }
        if (Collections.emptyMap().equals(map)) {
            return map;
        }
        return Collections.unmodifiableMap(map);
    }

    public ol8(int[] iArr, Handler handler) {
        this.f25457a = new HashMap();
        this.c = true;
        this.e = true;
        this.d = iArr;
        this.b = handler;
    }
}
