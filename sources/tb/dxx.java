package tb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dxx {
    public static final dxx e = new dxx();

    /* renamed from: a  reason: collision with root package name */
    public final List<t3y> f18145a = new CopyOnWriteArrayList();
    public final List<t6y> b = new CopyOnWriteArrayList();
    public final Map<String, List<ktx>> c = new ConcurrentHashMap();
    public final List<ktx> d = Collections.synchronizedList(new ArrayList());

    static {
        t2o.a(253755474);
    }

    public dxx() {
        new CopyOnWriteArrayList();
        Collections.synchronizedList(new ArrayList());
    }

    public void a(String str, String str2, int i, String str3) {
        List<ktx> list = (List) ((ConcurrentHashMap) this.c).get(str);
        if (list != null && list.size() > 0) {
            for (ktx ktxVar : list) {
                ktxVar.getClass();
                ktxVar.a(str2, i, str3);
            }
        }
        List<ktx> list2 = this.d;
        if (list2.size() > 0) {
            for (ktx ktxVar2 : list2) {
                ktxVar2.getClass();
                ktxVar2.a(str2, i, str3);
            }
        }
    }
}
