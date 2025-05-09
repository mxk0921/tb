package tb;

import com.alibaba.ability.MegaUtils;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.taobao.android.abilityidl.ability.LocalizationLanguage;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class vah {

    /* renamed from: a  reason: collision with root package name */
    public final String f29889a;
    public final String b;

    static {
        t2o.a(525337254);
    }

    public vah() {
        this.f29889a = "";
        this.b = "";
    }

    public vah(Map<String, ? extends Object> map) {
        this();
        String a2 = LocalizationLanguage.Companion.a(MegaUtils.x(map, LoggingSPCache.STORAGE_LANGUAGE, null));
        if (a2 != null) {
            this.f29889a = a2;
            String x = MegaUtils.x(map, "location", null);
            if (x != null) {
                this.b = x;
                return;
            }
            throw new RuntimeException("location 参数必传！");
        }
        throw new RuntimeException("language 参数必传！");
    }
}
