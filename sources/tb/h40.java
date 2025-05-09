package tb;

import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.impl.hapticsengine.HapticsEngineAbility;
import com.taobao.android.abilityidl.ability.AccelerometerShakeAxis;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class h40 {

    /* renamed from: a  reason: collision with root package name */
    public final String f20400a;
    public final double b;
    public final int c;
    public final int d;
    public final boolean e;

    static {
        t2o.a(525336671);
    }

    public h40() {
        this.f20400a = "ANY";
        this.b = 2.0d;
        this.c = 1000;
        this.d = 3;
        this.e = true;
    }

    public h40(Map<String, ? extends Object> map) {
        this();
        String str = "ANY";
        String a2 = AccelerometerShakeAxis.Companion.a(MegaUtils.x(map, "axis", str));
        this.f20400a = a2 != null ? a2 : str;
        double d = 2.0d;
        Double j = MegaUtils.j(map, "intensity", Double.valueOf(2.0d));
        this.b = j != null ? j.doubleValue() : d;
        int i = 1000;
        Integer m = MegaUtils.m(map, "duration", 1000);
        this.c = m != null ? m.intValue() : i;
        int i2 = 3;
        Integer m2 = MegaUtils.m(map, "count", 3);
        this.d = m2 != null ? m2.intValue() : i2;
        Boolean h = MegaUtils.h(map, HapticsEngineAbility.API_VIBRATE, Boolean.TRUE);
        this.e = h != null ? h.booleanValue() : true;
    }
}
