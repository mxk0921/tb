package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class bf9 {

    /* renamed from: a  reason: collision with root package name */
    public final String f16352a;
    public final String b;

    static {
        t2o.a(525336949);
    }

    public bf9() {
        this.f16352a = "";
        this.b = "";
    }

    public bf9(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "zipFilePath", null);
        if (x != null) {
            this.f16352a = x;
            String x2 = MegaUtils.x(map, "targetPath", null);
            if (x2 != null) {
                this.b = x2;
                return;
            }
            throw new RuntimeException("targetPath 参数必传！");
        }
        throw new RuntimeException("zipFilePath 参数必传！");
    }
}
