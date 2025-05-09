package tb;

import com.alibaba.ability.MegaUtils;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class qlm {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f26815a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Map<String, ? extends Object> e;
    public final String f;
    public final String g;
    public final String h;
    public final Boolean i;
    public final List<String> j;
    public final Integer k;
    public final Integer l;
    public final Boolean m;
    public final String n;

    static {
        t2o.a(525337450);
    }

    public qlm() {
    }

    public qlm(Map<String, ? extends Object> map) {
        this();
        ArrayList arrayList;
        this.f26815a = MegaUtils.m(map, "bizCode", null);
        this.b = MegaUtils.x(map, "topic", null);
        this.c = MegaUtils.x(map, "streamID", null);
        this.d = MegaUtils.m(map, "type", null);
        MegaUtils.x(map, "message", null);
        this.e = MegaUtils.s(map, "params");
        this.f = MegaUtils.x(map, LoggingSPCache.STORAGE_USERID, null);
        this.g = MegaUtils.x(map, "from", null);
        this.h = MegaUtils.x(map, "to", null);
        this.i = MegaUtils.h(map, "sendFullTags", null);
        List<Object> o = MegaUtils.o(map, "tags");
        if (o != null) {
            List<Object> list = o;
            arrayList = new ArrayList(zz3.q(list, 10));
            for (Object obj : list) {
                if (obj != null) {
                    try {
                        arrayList.add((String) obj);
                    } catch (Exception e) {
                        throw new RuntimeException("tags 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                throw new RuntimeException("tags 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
            }
        }
        arrayList = null;
        this.j = arrayList;
        this.k = MegaUtils.m(map, "qosLevel", null);
        this.l = MegaUtils.m(map, "priority", null);
        this.m = MegaUtils.h(map, "needACK", null);
        this.n = MegaUtils.x(map, "data", null);
    }
}
