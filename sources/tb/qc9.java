package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.FileAlgorithmType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class qc9 {

    /* renamed from: a  reason: collision with root package name */
    public final String f26667a;
    public final String b;

    static {
        t2o.a(525336930);
    }

    public qc9() {
        this.f26667a = "";
    }

    public qc9(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "path", null);
        if (x != null) {
            this.f26667a = x;
            this.b = FileAlgorithmType.Companion.a(MegaUtils.x(map, "digestAlgorithm", null));
            return;
        }
        throw new RuntimeException("path 参数必传！");
    }
}
