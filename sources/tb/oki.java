package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.event.EventCenter;
import java.util.Map;
import tb.it6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class oki implements n3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final it6 f25442a = new it6.b().e(2).g(4).d();
    public final it6 b = new it6.b().e(2).g(7).d();
    public final kt6 c;

    public oki(kt6 kt6Var) {
        this.c = kt6Var;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646b5f9e", new Object[]{this});
            return;
        }
        EventCenter.f().g(15).a(this);
        EventCenter.f().g(13).a(this);
        EventCenter.f().g(14).a(this);
    }

    @Override // tb.n3c
    public void onEvent(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16fb524", new Object[]{this, new Integer(i), map});
        } else if (this.c.c()) {
            switch (i) {
                case 13:
                    this.c.a(this.b);
                    return;
                case 14:
                    this.c.a(this.f25442a);
                    return;
                case 15:
                    b(map);
                    return;
                default:
                    return;
            }
        }
    }

    public void b(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a4a8965", new Object[]{this, map});
            return;
        }
        Object obj = map.get("javaUsed");
        Object obj2 = map.get("nativeHeapAllocatedSize");
        Object obj3 = map.get("javaMax");
        Object obj4 = map.get("pss");
        if ((obj3 instanceof Long) && (obj instanceof Long) && (obj4 instanceof Long) && (obj2 instanceof Long)) {
            long longValue = ((Long) obj4).longValue();
            long longValue2 = ((Long) obj).longValue();
            long longValue3 = ((Long) obj3).longValue();
            long longValue4 = ((Long) obj2).longValue();
            this.c.a(new it6.b().g(3).e(2).f("javaUsedRate", String.valueOf((int) ((longValue2 * 100) / longValue3))).d());
            this.c.a(new it6.b().g(9).e(2).f("nativeHeapAllocatedSize", String.valueOf(longValue4)).d());
            this.c.a(new it6.b().g(8).e(2).f("pss", String.valueOf(longValue)).d());
        }
    }
}
