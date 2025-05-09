package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.event.EventCenter;
import java.util.Map;
import tb.it6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class j52 implements n3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kt6 f21762a;

    public j52(kt6 kt6Var) {
        this.f21762a = kt6Var;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646b5f9e", new Object[]{this});
        } else {
            EventCenter.f().b(95, this);
        }
    }

    @Override // tb.n3c
    public void onEvent(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16fb524", new Object[]{this, new Integer(i), map});
        } else if (this.f21762a.c()) {
            this.f21762a.a(new it6.b().e(4).g(2).f("battery_level", String.valueOf(((Integer) map.get("battery_level")).intValue())).d());
            this.f21762a.a(new it6.b().e(4).g(5).f("battery_temperature", String.valueOf(((Integer) map.get("battery_temperature")).intValue())).d());
        }
    }
}
