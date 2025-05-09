package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.TradeHybridStage;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class qcu {

    /* renamed from: a  reason: collision with root package name */
    public final String f26673a;
    public final String b;
    public final Map<String, ? extends Object> c;

    static {
        t2o.a(525337569);
    }

    public qcu() {
        this.f26673a = "";
        this.b = "";
    }

    public qcu(Map<String, ? extends Object> map) {
        this();
        String a2 = TradeHybridStage.Companion.a(MegaUtils.x(map, v4s.PARAM_UPLOAD_STAGE, null));
        if (a2 != null) {
            this.f26673a = a2;
            String x = MegaUtils.x(map, "sceneName", null);
            if (x != null) {
                this.b = x;
                this.c = MegaUtils.s(map, "extParams");
                return;
            }
            throw new RuntimeException("sceneName 参数必传！");
        }
        throw new RuntimeException("stage 参数必传！");
    }
}
