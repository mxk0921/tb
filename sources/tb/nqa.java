package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.HTTPRequestDataType;
import com.taobao.android.abilityidl.ability.HTTPRequestMethod;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class nqa {

    /* renamed from: a  reason: collision with root package name */
    public final String f24891a;
    public final Map<String, ? extends Object> b;
    public String c;
    public final Map<String, ? extends Object> d;
    public final int e;
    public final String f;

    static {
        t2o.a(525336982);
    }

    public nqa() {
        this.f24891a = "";
        this.e = 30000;
    }

    public nqa(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "url", null);
        if (x != null) {
            this.f24891a = x;
            this.b = MegaUtils.s(map, "headers");
            this.c = HTTPRequestMethod.Companion.a(MegaUtils.x(map, "method", null));
            this.d = MegaUtils.s(map, "data");
            int i = 30000;
            Integer m = MegaUtils.m(map, "timeout", 30000);
            this.e = m != null ? m.intValue() : i;
            this.f = HTTPRequestDataType.Companion.a(MegaUtils.x(map, "dataType", null));
            return;
        }
        throw new RuntimeException("url 参数必传！");
    }
}
