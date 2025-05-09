package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.FileEncodingType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ih9 {

    /* renamed from: a  reason: collision with root package name */
    public final String f21308a;
    public final String b;
    public final String c;

    static {
        t2o.a(525336952);
    }

    public ih9() {
        this.f21308a = "";
        this.b = "";
        this.c = "UTF8";
    }

    public ih9(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "path", null);
        if (x != null) {
            this.f21308a = x;
            String x2 = MegaUtils.x(map, "data", null);
            if (x2 != null) {
                this.b = x2;
                String str = "UTF8";
                String a2 = FileEncodingType.Companion.a(MegaUtils.x(map, "encoding", str));
                this.c = a2 != null ? a2 : str;
                return;
            }
            throw new RuntimeException("data 参数必传！");
        }
        throw new RuntimeException("path 参数必传！");
    }
}
