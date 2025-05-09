package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.PermissionKeyType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class myl {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f24393a;
    public final String b;

    static {
        t2o.a(525337367);
    }

    public myl() {
        this.f24393a = yz3.i();
        this.b = "";
    }

    public myl(Map<String, ? extends Object> map) {
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
                    String a2 = PermissionKeyType.Companion.a(next instanceof String ? next : str);
                    if (a2 != null) {
                        arrayList.add(a2);
                    } else {
                        throw new RuntimeException("permissions 参数类型错误， 必须是 List<PermissionKeyType> 类型！");
                    }
                } else {
                    this.f24393a = arrayList;
                    String x = MegaUtils.x(map, "privacyID", null);
                    if (x != null) {
                        this.b = x;
                        return;
                    }
                    throw new RuntimeException("privacyID 参数必传！");
                }
            }
        } else {
            throw new RuntimeException("permissions 参数必传！");
        }
    }
}
