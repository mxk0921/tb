package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.FileEncodingType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class gd9 {

    /* renamed from: a  reason: collision with root package name */
    public final String f19911a;
    public final String b;

    static {
        t2o.a(525336941);
    }

    public gd9() {
        this.f19911a = "";
        this.b = "UTF8";
    }

    public gd9(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "path", null);
        if (x != null) {
            this.f19911a = x;
            String str = "UTF8";
            String a2 = FileEncodingType.Companion.a(MegaUtils.x(map, "encoding", str));
            this.b = a2 != null ? a2 : str;
            return;
        }
        throw new RuntimeException("path 参数必传！");
    }
}
