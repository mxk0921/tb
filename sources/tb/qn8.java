package tb;

import com.alibaba.ability.MegaUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class qn8 {

    /* renamed from: a  reason: collision with root package name */
    public final List<gn8> f26834a;
    public final boolean b;

    static {
        t2o.a(525336897);
    }

    public qn8() {
        this.f26834a = yz3.i();
    }

    public qn8(Map<String, ? extends Object> map) {
        this();
        List<Object> o = MegaUtils.o(map, "apis");
        if (o != null) {
            List<Object> list = o;
            ArrayList arrayList = new ArrayList(zz3.q(list, 10));
            for (Object obj : list) {
                try {
                    arrayList.add(new gn8((Map) (!(obj instanceof Map) ? null : obj)));
                } catch (Exception e) {
                    throw new RuntimeException("apis 参数类型错误， 必须是 List<ExecutorAPI> 类型！" + e.getMessage());
                }
            }
            this.f26834a = arrayList;
            Boolean h = MegaUtils.h(map, "blockOnError", Boolean.FALSE);
            this.b = h != null ? h.booleanValue() : false;
            return;
        }
        throw new RuntimeException("apis 参数必传！");
    }
}
