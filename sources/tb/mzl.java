package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.PermissionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class mzl {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f24412a;
    public final String b;
    public final String c;
    public final int d;

    static {
        t2o.a(525337376);
    }

    public mzl() {
        this.f24412a = yz3.i();
        this.b = "";
        this.d = 1;
    }

    public mzl(Map<String, ? extends Object> map) {
        this();
        List<Object> o = MegaUtils.o(map, "permissions");
        if (o != null) {
            List<Object> list = o;
            ArrayList arrayList = new ArrayList(zz3.q(list, 10));
            Iterator<T> it = list.iterator();
            while (true) {
                String str = null;
                if (it.hasNext()) {
                    Object next = it.next();
                    String a2 = PermissionType.Companion.a(next instanceof String ? next : str);
                    if (a2 != null) {
                        arrayList.add(a2);
                    } else {
                        throw new RuntimeException("permissions 参数类型错误， 必须是 List<PermissionType> 类型！");
                    }
                } else {
                    this.f24412a = arrayList;
                    String x = MegaUtils.x(map, "bizName", null);
                    if (x != null) {
                        this.b = x;
                        this.c = MegaUtils.x(map, "message", null);
                        int i = 1;
                        Integer m = MegaUtils.m(map, "timeInterval", 1);
                        this.d = m != null ? m.intValue() : i;
                        return;
                    }
                    throw new RuntimeException("bizName 参数必传！");
                }
            }
        } else {
            throw new RuntimeException("permissions 参数必传！");
        }
    }
}
