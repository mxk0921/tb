package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.umipublish.draft.DraftManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class lev {

    /* renamed from: a  reason: collision with root package name */
    public final String f23302a;
    public final List<String> b;

    static {
        t2o.a(525337618);
    }

    public lev() {
    }

    public lev(Map<String, ? extends Object> map) {
        this();
        ArrayList arrayList = null;
        this.f23302a = MegaUtils.x(map, "biz", null);
        List<Object> o = MegaUtils.o(map, DraftManager.KEY_DRAFT_IDS);
        if (o != null) {
            List<Object> list = o;
            arrayList = new ArrayList(zz3.q(list, 10));
            for (Object obj : list) {
                if (obj != null) {
                    try {
                        arrayList.add((String) obj);
                    } catch (Exception e) {
                        throw new RuntimeException("draftIds 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                throw new RuntimeException("draftIds 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
            }
        }
        this.b = arrayList;
    }
}
