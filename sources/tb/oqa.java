package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class oqa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ? extends Object> f25571a;
    public final String b;

    static {
        t2o.a(1022361724);
    }

    public oqa(Map<?, ?> map) {
        ckf.g(map, "data");
        ht4.c(map, "status");
        Object obj = map.get("headers");
        Map<String, ? extends Object> map2 = null;
        Map map3 = obj instanceof Map ? (Map) obj : null;
        this.f25571a = map3 != null ? ht4.h(map3) : map2;
        this.b = ht4.e(map, AgooConstants.MESSAGE_BODY);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8904be1", new Object[]{this});
        }
        return this.b;
    }
}
