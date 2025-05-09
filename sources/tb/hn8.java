package tb;

import com.alibaba.ability.MegaUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class hn8 {

    /* renamed from: a  reason: collision with root package name */
    public final List<qn8> f20759a;

    static {
        t2o.a(525336890);
    }

    public hn8() {
        this.f20759a = yz3.i();
    }

    public hn8(Map<String, ? extends Object> map) {
        this();
        List<Object> o = MegaUtils.o(map, "tasks");
        if (o != null) {
            List<Object> list = o;
            ArrayList arrayList = new ArrayList(zz3.q(list, 10));
            for (Object obj : list) {
                try {
                    arrayList.add(new qn8((Map) (!(obj instanceof Map) ? null : obj)));
                } catch (Exception e) {
                    throw new RuntimeException("tasks 参数类型错误， 必须是 List<ExecutorTask> 类型！" + e.getMessage());
                }
            }
            this.f20759a = arrayList;
            return;
        }
        throw new RuntimeException("tasks 参数必传！");
    }
}
