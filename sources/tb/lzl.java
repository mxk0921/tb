package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.PermissionKeyType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class lzl {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f23665a;
    public final String b;
    public final String c;
    public final int d;

    static {
        t2o.a(525337373);
    }

    public lzl() {
        this.f23665a = yz3.i();
        this.b = "";
        this.c = "";
        this.d = 1;
    }

    public lzl(Map<String, ? extends Object> map) {
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
                    this.f23665a = arrayList;
                    String x = MegaUtils.x(map, "privacyID", null);
                    if (x != null) {
                        this.b = x;
                        String x2 = MegaUtils.x(map, "description", null);
                        if (x2 != null) {
                            this.c = x2;
                            int i = 1;
                            Integer m = MegaUtils.m(map, "silenceTime", 1);
                            this.d = m != null ? m.intValue() : i;
                            return;
                        }
                        throw new RuntimeException("description 参数必传！");
                    }
                    throw new RuntimeException("privacyID 参数必传！");
                }
            }
        } else {
            throw new RuntimeException("permissions 参数必传！");
        }
    }
}
