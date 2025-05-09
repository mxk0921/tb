package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class jb3 {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f21880a;

    static {
        t2o.a(525336763);
    }

    public jb3() {
    }

    public jb3(Map<String, ? extends Object> map) {
        this();
        ArrayList arrayList;
        List<Object> o = MegaUtils.o(map, SmartLandingTask.Operation.STR_INCLUDE);
        if (o != null) {
            List<Object> list = o;
            arrayList = new ArrayList(zz3.q(list, 10));
            for (Object obj : list) {
                if (obj != null) {
                    try {
                        arrayList.add((String) obj);
                    } catch (Exception e) {
                        throw new RuntimeException("include 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                throw new RuntimeException("include 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
            }
        }
        arrayList = null;
        this.f21880a = arrayList;
    }
}
