package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.event.EventCenter;
import java.util.Map;
import tb.it6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ar2 implements n3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kt6 f15944a;

    public ar2(kt6 kt6Var) {
        this.f15944a = kt6Var;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646b5f9e", new Object[]{this});
        } else {
            EventCenter.f().b(81, this);
        }
    }

    @Override // tb.n3c
    public void onEvent(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16fb524", new Object[]{this, new Integer(i), map});
        } else if (this.f15944a.c() && i == 81) {
            Object obj = map.get("mainThreadSTime");
            Object obj2 = map.get("mainThreadUTime");
            Object obj3 = map.get("totalCpuTime");
            Object obj4 = map.get("processSTime");
            Object obj5 = map.get("processUTime");
            if ((obj instanceof Long) && (obj2 instanceof Long) && (obj3 instanceof Long) && (obj4 instanceof Long) && (obj5 instanceof Long)) {
                this.f15944a.a(new it6.b().g(6).e(1).f("main_thread_s_time", String.valueOf(obj)).f("main_thread_u_time", String.valueOf(obj2)).f("process_s_time", String.valueOf(obj4)).f("process_u_time", String.valueOf(obj5)).f("total_cpu_time", String.valueOf(obj3)).d());
            }
        }
    }
}
