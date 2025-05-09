package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bd4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199578);
    }

    public static List<String> a(List<String> list, Map<String, DMComponent> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("60d28a2f", new Object[]{list, map});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (String str : list) {
            IDMComponent o = cb4.o(map.get(str));
            if (o != null) {
                hashSet.add(o.getKey());
            }
        }
        return new ArrayList(hashSet);
    }

    public static List<String> b(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2951d571", new Object[]{list});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (IDMComponent iDMComponent : list) {
            if (iDMComponent != null && !TextUtils.isEmpty(iDMComponent.getKey())) {
                String key = iDMComponent.getKey();
                if (!arrayList.contains(key)) {
                    arrayList.add(key);
                }
            }
        }
        return arrayList;
    }

    public static List<IDMComponent> d(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2f02e419", new Object[]{iDMComponent});
        }
        if (iDMComponent == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        List<IDMComponent> children = iDMComponent.getChildren();
        if (children == null || children.isEmpty()) {
            return null;
        }
        for (IDMComponent iDMComponent2 : children) {
            if (iDMComponent2 != null) {
                hashSet.add(iDMComponent2);
                List<IDMComponent> d = d(iDMComponent2);
                if (d != null) {
                    hashSet.addAll(d);
                }
            }
        }
        return new ArrayList(hashSet);
    }

    public static List<String> e(String str, Map<String, DMComponent> map) {
        List<IDMComponent> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fbee606f", new Object[]{str, map});
        }
        if (map == null || map.isEmpty() || (d = d(map.get(str))) == null || d.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (IDMComponent iDMComponent : d) {
            if (iDMComponent != null && ("item".equals(iDMComponent.getTag()) || "invalidItem".equals(iDMComponent.getTag()) || "shop".equals(iDMComponent.getTag()) || "bundleHeader".equals(iDMComponent.getTag()))) {
                arrayList.add(iDMComponent.getKey());
            }
        }
        return arrayList;
    }

    public static ArrayList<String> f(List<String> list, u55 u55Var, List<IDMComponent> list2) {
        List<String> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("fd14740", new Object[]{list, u55Var, list2});
        }
        HashSet hashSet = new HashSet();
        List<String> b = b(list2);
        if (b != null && !b.isEmpty()) {
            hashSet.addAll(b);
        }
        if (list == null || list.isEmpty()) {
            return new ArrayList<>(hashSet);
        }
        Map<String, DMComponent> p = u55Var.p();
        List<String> a2 = a(list, p);
        if (a2 == null) {
            return new ArrayList<>(hashSet);
        }
        for (String str : a2) {
            if (!TextUtils.isEmpty(str) && (e = e(str, p)) != null) {
                hashSet.addAll(e);
            }
        }
        hashSet.addAll(list);
        return new ArrayList<>(hashSet);
    }

    public static void g(kmb kmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("257b622c", new Object[]{kmbVar});
            return;
        }
        try {
            for (IDMComponent iDMComponent : kmbVar.d().d().c()) {
                if (iDMComponent != null && "submitPromotion".equals(iDMComponent.getTag())) {
                    kmbVar.e().z0(iDMComponent);
                }
            }
        } catch (Exception e) {
            ub3.g("refreshSubmitPromotionComponents", e.getMessage());
        }
    }

    public static DXRootView c(ViewGroup viewGroup, String str) {
        DXRootView dXRootView;
        JSONObject data;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("63a239d6", new Object[]{viewGroup, str});
        }
        if (viewGroup != null && !TextUtils.isEmpty(str)) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if ((childAt instanceof DXRootView) && (data = (dXRootView = (DXRootView) childAt).getData()) != null && (string = data.getString("tag")) != null && string.startsWith(str)) {
                    return dXRootView;
                }
            }
        }
        return null;
    }
}
