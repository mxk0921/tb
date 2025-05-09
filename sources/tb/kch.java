package tb;

import com.alibaba.ability.MegaUtils;
import com.alipay.android.msp.utils.UserLocation;
import com.taobao.android.abilityidl.ability.LocationAccuracy;
import com.taobao.android.abilityidl.ability.LocationExpires;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class kch {

    /* renamed from: a  reason: collision with root package name */
    public final String f22564a;
    public final String b;
    public final String c;
    public final boolean d;

    static {
        t2o.a(525337264);
    }

    public kch() {
        this.f22564a = "";
        this.b = "TWO_HOUR";
        this.c = "LOW_MODE";
        this.d = true;
    }

    public kch(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "bizName", null);
        if (x != null) {
            this.f22564a = x;
            String str = "TWO_HOUR";
            String a2 = LocationExpires.Companion.a(MegaUtils.x(map, "expires", str));
            this.b = a2 != null ? a2 : str;
            String str2 = "LOW_MODE";
            String a3 = LocationAccuracy.Companion.a(MegaUtils.x(map, UserLocation.KEY_DOUBLE_ACCURACY, str2));
            this.c = a3 != null ? a3 : str2;
            Boolean h = MegaUtils.h(map, "needAddress", Boolean.TRUE);
            this.d = h != null ? h.booleanValue() : true;
            return;
        }
        throw new RuntimeException("bizName 参数必传！");
    }
}
