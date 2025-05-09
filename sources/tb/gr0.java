package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.AliUploadServiceNetworkType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class gr0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f20175a;
    public final String b;
    public final int c;
    public final String d;
    public final Map<String, ? extends Object> e;

    static {
        t2o.a(525336708);
    }

    public gr0() {
        this.f20175a = "";
        this.b = "";
        this.c = 1000;
        this.d = "ANY";
    }

    public gr0(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "path", null);
        if (x != null) {
            this.f20175a = x;
            String x2 = MegaUtils.x(map, "bizCode", null);
            if (x2 != null) {
                this.b = x2;
                int i = 1000;
                Integer m = MegaUtils.m(map, "minUpdateInterval", 1000);
                this.c = m != null ? m.intValue() : i;
                String str = "ANY";
                String a2 = AliUploadServiceNetworkType.Companion.a(MegaUtils.x(map, "networkType", str));
                this.d = a2 != null ? a2 : str;
                this.e = MegaUtils.s(map, "xArupMeta");
                return;
            }
            throw new RuntimeException("bizCode 参数必传！");
        }
        throw new RuntimeException("path 参数必传！");
    }
}
