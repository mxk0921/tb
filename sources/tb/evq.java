package tb;

import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.alibaba.android.icart.core.groupcharge.GroupChargeType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class evq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Comparator<ska> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(ska skaVar, ska skaVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("589af6cd", new Object[]{this, skaVar, skaVar2})).intValue();
            }
            return skaVar.d().a() - skaVar2.d().a();
        }
    }

    static {
        t2o.a(479199593);
    }

    public static String a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48713e74", new Object[]{iDMComponent});
        }
        if (iDMComponent != null) {
            return iDMComponent.getFields().getString("exclude");
        }
        return "";
    }

    public static String b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79adf599", new Object[]{iDMComponent});
        }
        if (iDMComponent != null) {
            return iDMComponent.getFields().getString("mutex");
        }
        return "";
    }

    public static tka d(zxb zxbVar, List<IDMComponent> list) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tka) ipChange.ipc$dispatch("2088264f", new Object[]{zxbVar, list});
        }
        if (list == null || list.isEmpty() || zxbVar == null || zxbVar.w() == null) {
            return null;
        }
        tka tkaVar = new tka();
        CartGlobal.Excludes excludes = zxbVar.w().getExcludes();
        if (!(excludes == null || excludes.getTip() == null)) {
            tkaVar.d(excludes.getTip().getString("DEFAULT"));
        }
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        for (IDMComponent iDMComponent : list) {
            String e = e(excludes, a(iDMComponent), b(iDMComponent));
            if (hashSet.add(e)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iDMComponent);
                hashMap.put(e, arrayList);
            } else {
                ((List) hashMap.get(e)).add(iDMComponent);
            }
        }
        JSONArray includes = zxbVar.w().getIncludes();
        if (includes != null && includes.size() > 0) {
            HashMap hashMap2 = new HashMap();
            for (String str : hashMap.keySet()) {
                List list2 = (List) hashMap.get(str);
                if (list2 != null && list2.size() > 0) {
                    Iterator it = list2.iterator();
                    String str2 = null;
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        String a2 = a((IDMComponent) it.next());
                        if (str2 == null) {
                            str2 = a2;
                        } else if (!str2.equals(a2)) {
                            str2 = a2;
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        hashMap2.put(str, str2);
                    }
                }
            }
            if (hashMap2.size() > 0) {
                for (int i = 0; i < includes.size(); i++) {
                    JSONArray jSONArray = includes.getJSONArray(i);
                    HashSet hashSet2 = new HashSet();
                    for (String str3 : hashMap2.keySet()) {
                        if (jSONArray.contains((String) hashMap2.get(str3))) {
                            hashSet2.add(str3);
                        }
                    }
                    if (hashSet2.size() > 0) {
                        String str4 = (String) hashSet2.iterator().next();
                        List list3 = (List) hashMap.get(str4);
                        if (list3 == null) {
                            list3 = new ArrayList();
                        }
                        Iterator it2 = hashSet2.iterator();
                        while (it2.hasNext()) {
                            String str5 = (String) it2.next();
                            hashMap2.remove(str5);
                            if (!str4.equals(str5) && hashMap.get(str5) != null) {
                                list3.addAll((Collection) hashMap.get(str5));
                                hashSet.remove(str5);
                                hashMap.remove(str5);
                            }
                        }
                    }
                }
            }
        }
        tkaVar.c(c(zxbVar, hashSet, hashMap, excludes));
        return tkaVar;
    }

    public static String e(CartGlobal.Excludes excludes, String str, String str2) {
        boolean z;
        boolean z2;
        JSONArray jSONArray;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48bf424c", new Object[]{excludes, str, str2});
        }
        String code = GroupChargeType.BC.getCode();
        if (excludes != null) {
            List<String> global = excludes.getGlobal();
            JSONObject inner = excludes.getInner();
            List<String> innerGlobal = excludes.getInnerGlobal();
            if (!(global == null && inner == null && innerGlobal == null)) {
                if (global == null || str == null || !global.contains(str)) {
                    z = false;
                } else {
                    z = true;
                }
                if (inner == null || str == null || str2 == null || !inner.containsKey(str) || (jSONArray = inner.getJSONArray(str)) == null || !jSONArray.contains(str2)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (innerGlobal == null || str == null || str2 == null || !innerGlobal.contains(str)) {
                    z3 = false;
                }
                if (z2 || z3) {
                    return str + str2;
                } else if (z) {
                    return str;
                }
            }
        }
        return code;
    }

    public static String f(HashSet<String> hashSet) {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8bdcac83", new Object[]{hashSet});
        }
        if (hashSet == null || hashSet.isEmpty()) {
            str = null;
        } else {
            Iterator<String> it = hashSet.iterator();
            str = null;
            while (it.hasNext()) {
                String next = it.next();
                if (next.startsWith(GroupChargeType.SM.getCode())) {
                    i++;
                    str = next;
                }
            }
        }
        if (i == 1) {
            return str;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g(tb.zxb r13, java.util.List<com.taobao.android.ultron.common.model.IDMComponent> r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.evq.g(tb.zxb, java.util.List):boolean");
    }

    public static void h(String str, ska skaVar, CartGlobal.Excludes excludes) {
        GroupChargeType[] values;
        JSONArray groupSettlementTitleList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2354114a", new Object[]{str, skaVar, excludes});
            return;
        }
        if (!(excludes == null || (groupSettlementTitleList = excludes.getGroupSettlementTitleList()) == null || groupSettlementTitleList.size() <= 0)) {
            for (int i = 0; i < groupSettlementTitleList.size(); i++) {
                vka vkaVar = new vka(groupSettlementTitleList.getJSONObject(i));
                if (str.startsWith(vkaVar.a())) {
                    skaVar.k(new uka(vkaVar.a(), vkaVar.c(), vkaVar.b()));
                    return;
                }
            }
        }
        for (GroupChargeType groupChargeType : GroupChargeType.values()) {
            if (str.startsWith(groupChargeType.getCode())) {
                skaVar.k(new uka(groupChargeType.getCode(), groupChargeType.getTitle(), groupChargeType.getPriority()));
                return;
            }
        }
    }

    public static List<ska> c(zxb zxbVar, HashSet<String> hashSet, Map<String, List<IDMComponent>> map, CartGlobal.Excludes excludes) {
        Long l;
        Map<String, List<IDMComponent>> map2 = map;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("46fcbec2", new Object[]{zxbVar, hashSet, map2, excludes});
        }
        ArrayList arrayList = new ArrayList();
        String f = f(hashSet);
        if (!(hashSet == null || f == null || !hashSet.contains(f))) {
            GroupChargeType groupChargeType = GroupChargeType.BC;
            if (hashSet.contains(groupChargeType.getCode())) {
                map2.get(groupChargeType.getCode()).addAll(map2.get(f));
                hashSet.remove(f);
            }
        }
        IDMComponent u = zxbVar.u("submit");
        if (!(hashSet == null || map2 == null || map.isEmpty())) {
            Iterator<String> it = hashSet.iterator();
            while (it.hasNext()) {
                String next = it.next();
                ska skaVar = new ska();
                List<IDMComponent> list = map2.get(next);
                if (list == null || list.isEmpty()) {
                    u = u;
                    it = it;
                } else {
                    boolean a2 = vav.a(c9x.CART_BIZ_NAME, "groupChargePrice", z);
                    boolean z2 = !a2 || (u != null && !u.getFields().getBooleanValue("isHideCalculateBtn"));
                    long j = 0;
                    for (IDMComponent iDMComponent : list) {
                        try {
                            l = (Long) cb4.x(iDMComponent, Long.class, "pay", "afterPromPrice");
                        } catch (Exception unused) {
                            l = null;
                        }
                        if (l == null || !z2) {
                            if (a2) {
                                JSONObject jSONObject = iDMComponent.getFields().getJSONObject("pay");
                                if (jSONObject == null || !jSONObject.containsKey("price")) {
                                    it = it;
                                    a2 = a2;
                                    l = l;
                                } else {
                                    it = it;
                                    a2 = a2;
                                    l = Long.valueOf(new BigDecimal(jSONObject.getLongValue("price")).multiply(new BigDecimal(iDMComponent.getFields().getLongValue("quantity"))).longValue());
                                }
                            } else {
                                it = it;
                                a2 = a2;
                                l = (Long) cb4.x(iDMComponent, Long.class, "pay", iiz.PERF_STAG_TOTAL);
                            }
                            z2 = false;
                        } else {
                            it = it;
                            a2 = a2;
                        }
                        j += l.longValue();
                        IDMComponent E = cb4.E(iDMComponent);
                        if (E != null) {
                            skaVar.a(E);
                        } else {
                            skaVar.a(iDMComponent);
                        }
                        u = u;
                    }
                    u = u;
                    it = it;
                    skaVar.m(list.size());
                    skaVar.n(j);
                    skaVar.j(z2);
                    skaVar.l(list);
                    h(next, skaVar, excludes);
                }
                arrayList.add(skaVar);
                map2 = map;
                z = true;
            }
        }
        Collections.sort(arrayList, new a());
        return arrayList;
    }
}
