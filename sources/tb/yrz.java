package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class yrz {

    /* renamed from: a  reason: collision with root package name */
    public final String f32312a;

    static {
        t2o.a(525337575);
    }

    public yrz() {
        this.f32312a = "";
    }

    public yrz(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "preEntrustWebID", null);
        if (x != null) {
            this.f32312a = x;
            return;
        }
        throw new RuntimeException("preEntrustWebID 参数必传！");
    }
}
