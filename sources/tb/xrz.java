package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;
import kotlin.collections.a;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class xrz {

    /* renamed from: a  reason: collision with root package name */
    public final String f31568a;
    public final Map<String, ? extends Object> b;

    static {
        t2o.a(525337574);
    }

    public xrz() {
        this.f31568a = "";
        this.b = a.h();
    }

    public xrz(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "url", null);
        if (x != null) {
            this.f31568a = x;
            if (MegaUtils.x(map, "resultURL", null) == null) {
                throw new RuntimeException("resultURL 参数必传！");
            } else if (MegaUtils.x(map, "requestCode", null) == null) {
                throw new RuntimeException("requestCode 参数必传！");
            } else if (MegaUtils.x(map, "type", null) != null) {
                Map<String, ? extends Object> s = MegaUtils.s(map, AgooConstants.MESSAGE_EXT);
                if (s != null) {
                    this.b = s;
                    return;
                }
                throw new RuntimeException("extData 参数必传！");
            } else {
                throw new RuntimeException("type 参数必传！");
            }
        } else {
            throw new RuntimeException("url 参数必传！");
        }
    }
}
