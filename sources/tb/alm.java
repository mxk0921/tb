package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class alm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<ulm> f15826a;
    public final List<vkm> b;
    public final List<blm> c;
    public final List<dlm> d;

    static {
        t2o.a(1022361866);
    }

    public alm(Map<?, ?> map) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ckf.g(map, "data");
        ht4.c(map, "code");
        Object obj = map.get("textMessages");
        ArrayList arrayList4 = null;
        List list = obj instanceof List ? (List) obj : null;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
                ulm ulmVar = map2 != null ? new ulm(map2) : null;
                if (ulmVar != null) {
                    arrayList.add(ulmVar);
                }
            }
        } else {
            arrayList = null;
        }
        this.f15826a = arrayList;
        Object obj3 = map.get("countMessages");
        List list2 = obj3 instanceof List ? (List) obj3 : null;
        if (list2 != null) {
            arrayList2 = new ArrayList();
            for (Object obj4 : list2) {
                Map map3 = obj4 instanceof Map ? (Map) obj4 : null;
                vkm vkmVar = map3 != null ? new vkm(map3) : null;
                if (vkmVar != null) {
                    arrayList2.add(vkmVar);
                }
            }
        } else {
            arrayList2 = null;
        }
        this.b = arrayList2;
        Object obj5 = map.get("joinMessages");
        List list3 = obj5 instanceof List ? (List) obj5 : null;
        if (list3 != null) {
            arrayList3 = new ArrayList();
            for (Object obj6 : list3) {
                Map map4 = obj6 instanceof Map ? (Map) obj6 : null;
                blm blmVar = map4 != null ? new blm(map4) : null;
                if (blmVar != null) {
                    arrayList3.add(blmVar);
                }
            }
        } else {
            arrayList3 = null;
        }
        this.c = arrayList3;
        Object obj7 = map.get("commonMessages");
        List list4 = obj7 instanceof List ? (List) obj7 : null;
        if (list4 != null) {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj8 : list4) {
                Map map5 = obj8 instanceof Map ? (Map) obj8 : null;
                dlm dlmVar = map5 != null ? new dlm(map5) : null;
                if (dlmVar != null) {
                    arrayList5.add(dlmVar);
                }
            }
            arrayList4 = arrayList5;
        }
        this.d = arrayList4;
    }

    public final List<dlm> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b206873", new Object[]{this});
        }
        return this.d;
    }

    public final List<vkm> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d752f2fb", new Object[]{this});
        }
        return this.b;
    }

    public final List<blm> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("24cef054", new Object[]{this});
        }
        return this.c;
    }

    public final List<ulm> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ffbc9e71", new Object[]{this});
        }
        return this.f15826a;
    }
}
