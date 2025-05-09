package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.ScanCodeScanType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class yro {

    /* renamed from: a  reason: collision with root package name */
    public final String f32306a;
    public final String b;

    static {
        t2o.a(525337476);
    }

    public yro() {
        this.f32306a = "";
    }

    public yro(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "pssource", null);
        if (x != null) {
            this.f32306a = x;
            this.b = ScanCodeScanType.Companion.a(MegaUtils.x(map, "type", null));
            return;
        }
        throw new RuntimeException("pssource 参数必传！");
    }
}
