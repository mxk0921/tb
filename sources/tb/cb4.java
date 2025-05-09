package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActivityChooserModel;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.icart.core.view.ViewManager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import com.taobao.android.ultron.datamodel.imp.ParseModule;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.u93;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cb4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_CURRENCY_UNIT_FACTOR = 100;
    public static final int DEFAULT_PRICE_RESERVED_DECIMAL_NUMBER = 2;
    public static final String KEY_CAN_CHECK_IN_MANAGE = "canCheckInManage";
    public static final String KEY_CAN_CHECK_IN_NORMAL = "canCheck";
    public static final String KEY_DISCOUNT_TIPS = "discountTips";
    public static final String KEY_IS_CALCULATING_STATE = "_isCalculatingState";
    public static final String KEY_IS_CHECKED = "isChecked";
    public static final String KEY_IS_CHECKED_ALL_FROM_NAVIVE = "isCheckedAllFromNative";
    public static final String KEY_IS_RELATION_ITEM = "isRelationItem";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
    }

    static {
        t2o.a(479199575);
    }

    public static List<IDMComponent> A(zxb zxbVar) {
        List<IDMComponent> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("84764002", new Object[]{zxbVar});
        }
        if (zxbVar.L()) {
            list = zxbVar.x().e().h0().getComponents();
        } else {
            list = zxbVar.c().getComponents();
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (IDMComponent iDMComponent : list) {
            if (TextUtils.equals("item", iDMComponent.getTag())) {
                arrayList.add(iDMComponent);
            }
        }
        return arrayList;
    }

    public static List<IDMComponent> B(zxb zxbVar, gsb gsbVar) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f4084ef0", new Object[]{zxbVar, gsbVar});
        }
        if (gsbVar == null || (string = gsbVar.getFields().getString("nextRenderRoot")) == null) {
            return null;
        }
        List<IDMComponent> components = gsbVar.getComponents();
        if (components == null) {
            components = zxbVar.c().e(string);
            if (gsbVar instanceof DMEvent) {
                ((DMEvent) gsbVar).setComponents(components);
            }
        }
        return components;
    }

    public static String C(fsb fsbVar) {
        JSONObject o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7ce107", new Object[]{fsbVar});
        }
        if (fsbVar == null || (o = ((u55) fsbVar).o()) == null) {
            return null;
        }
        return o.getString("queryParams");
    }

    public static List<IDMComponent> D(IDMComponent iDMComponent, kmb kmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ca2e7ccd", new Object[]{iDMComponent, kmbVar});
        }
        ArrayList arrayList = new ArrayList();
        if (iDMComponent == null) {
            return arrayList;
        }
        JSONArray jSONArray = iDMComponent.getFields().getJSONArray("relationItems");
        if (jSONArray != null) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                IDMComponent componentByName = kmbVar.j().getComponentByName(String.valueOf(it.next()));
                if (componentByName != null && "item".equals(componentByName.getTag())) {
                    arrayList.add(componentByName);
                }
            }
            return arrayList;
        }
        IDMComponent parent = iDMComponent.getParent();
        if (parent == null) {
            arrayList.add(iDMComponent);
            return arrayList;
        }
        if (S(parent)) {
            for (IDMComponent iDMComponent2 : parent.getChildren()) {
                if (iDMComponent2 != null && "item".equals(iDMComponent2.getTag())) {
                    arrayList.add(iDMComponent2);
                }
            }
        } else {
            arrayList.add(iDMComponent);
        }
        return arrayList;
    }

    public static IDMComponent E(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("242225b5", new Object[]{iDMComponent});
        }
        if (!(iDMComponent == null || iDMComponent.getParent() == null || iDMComponent.getParent().getParent() == null)) {
            for (IDMComponent iDMComponent2 : iDMComponent.getParent().getParent().getChildren()) {
                if (iDMComponent2 != null && "shop".equals(iDMComponent2.getTag())) {
                    return iDMComponent2;
                }
            }
        }
        return null;
    }

    public static String F(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9eaf26b3", new Object[]{list});
        }
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : list) {
            sb.append(obj);
            sb.append(",");
        }
        if (sb.toString().endsWith(",")) {
            sb.delete(sb.length() - 1, sb.length());
        }
        return sb.toString();
    }

    public static int G(kmb kmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e67cff9b", new Object[]{kmbVar})).intValue();
        }
        return d0(kmbVar, false);
    }

    public static int I(fsb fsbVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b85cc8a", new Object[]{fsbVar})).intValue();
        }
        if (fsbVar == null) {
            return 0;
        }
        for (IDMComponent iDMComponent : fsbVar.getComponents()) {
            if (iDMComponent != null && "item".equals(iDMComponent.getTag())) {
                i++;
            }
        }
        return i;
    }

    public static boolean J(u55 u55Var, String str) {
        IDMComponent componentByName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d11570e", new Object[]{u55Var, str})).booleanValue();
        }
        if (!(u55Var == null || TextUtils.isEmpty(str) || (componentByName = u55Var.getComponentByName(str)) == null || componentByName.getChildren() == null)) {
            for (IDMComponent iDMComponent : componentByName.getChildren()) {
                if (((DMComponent) iDMComponent).isExtendBlock()) {
                    return iDMComponent.getData().getBooleanValue("hasMore");
                }
            }
        }
        return false;
    }

    public static void K(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11ae63b2", new Object[]{iDMComponent});
        } else if (iDMComponent != null && iDMComponent.getData() != null) {
            iDMComponent.getData().put("status", "hidden");
        }
    }

    public static void L(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e87a81d2", new Object[]{iDMComponent});
        } else if (iDMComponent != null && iDMComponent.getData() != null) {
            if (TextUtils.equals(iDMComponent.getData().getString("status"), "hidden")) {
                c0(iDMComponent);
            } else {
                K(iDMComponent);
            }
        }
    }

    public static boolean M(zxb zxbVar) {
        List<IDMComponent> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd72f96", new Object[]{zxbVar})).booleanValue();
        }
        if (zxbVar.t()) {
            return false;
        }
        if (!zxbVar.L() || mc3.m(null)) {
            list = zxbVar.c().getComponents();
        } else {
            list = zxbVar.x().e().h0().getComponents();
        }
        if (list == null) {
            return false;
        }
        for (IDMComponent iDMComponent : list) {
            if (iDMComponent != null && "item".equals(iDMComponent.getTag()) && !P(iDMComponent) && b(zxbVar.K(), iDMComponent)) {
                return false;
            }
        }
        return true;
    }

    public static boolean N(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40b33e40", new Object[]{iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || iDMComponent.getData() == null) {
            return false;
        }
        if ("bundle".equals(iDMComponent.getTag()) || iDMComponent.getFields().getBooleanValue("isBundle")) {
            return true;
        }
        return false;
    }

    public static boolean O(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6aefb58", new Object[]{iDMComponent})).booleanValue();
        }
        return "bundleHeader".equals(iDMComponent.getTag());
    }

    public static boolean Q(IDMComponent iDMComponent) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5787234", new Object[]{iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || (fields = iDMComponent.getFields()) == null) {
            return false;
        }
        if (!N(iDMComponent) || !fields.containsKey("isCustomBundle")) {
            return Q(iDMComponent.getParent());
        }
        return fields.getBooleanValue("isCustomBundle");
    }

    public static boolean R(IDMComponent iDMComponent) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7a376ab", new Object[]{iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || (fields = iDMComponent.getFields()) == null) {
            return false;
        }
        if (fields.containsKey(KEY_IS_RELATION_ITEM)) {
            return fields.getBooleanValue(KEY_IS_RELATION_ITEM);
        }
        return R(iDMComponent.getParent());
    }

    public static boolean S(IDMComponent iDMComponent) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf9b5d8", new Object[]{iDMComponent})).booleanValue();
        }
        if (iDMComponent == null) {
            return false;
        }
        JSONObject fields = iDMComponent.getFields();
        if (fields != null && fields.containsKey(KEY_IS_RELATION_ITEM)) {
            z = fields.getBoolean(KEY_IS_RELATION_ITEM).booleanValue();
        }
        return Boolean.TRUE.equals(Boolean.valueOf(z));
    }

    public static boolean T(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8818770", new Object[]{iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return false;
        }
        return iDMComponent.getFields().getBooleanValue("isRepeatBuy");
    }

    public static boolean U(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdb90b8f", new Object[]{iDMComponent})).booleanValue();
        }
        List<IDMComponent> q = q(iDMComponent);
        if (q == null) {
            return false;
        }
        for (IDMComponent iDMComponent2 : q) {
            if (V(iDMComponent2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean V(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a4797e4", new Object[]{iDMComponent})).booleanValue();
        }
        if (!O(iDMComponent) || Q(iDMComponent)) {
            return false;
        }
        return true;
    }

    public static void X(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7540b2dd", new Object[]{zxbVar});
            return;
        }
        IDMComponent u = zxbVar.u("submit");
        if (u != null) {
            b0(u, String.valueOf(M(zxbVar)), "isChecked");
        }
    }

    public static void Z(IDMComponent iDMComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a47b1a01", new Object[]{iDMComponent, new Boolean(z)});
        } else if (iDMComponent != null) {
            iDMComponent.getFields().put("isChecked", (Object) String.valueOf(z));
            CheckHoldManager.i().d(iDMComponent.getFields(), z);
        }
    }

    public static void a0(zxb zxbVar, String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e63e1e", new Object[]{zxbVar, str, new Boolean(z)});
            return;
        }
        IDMComponent u = zxbVar.u(str);
        if (u != null) {
            JSONObject data = u.getData();
            if (z) {
                str2 = "normal";
            } else {
                str2 = "hidden";
            }
            data.put("status", (Object) str2);
        }
    }

    public static boolean b0(IDMComponent iDMComponent, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd42013e", new Object[]{iDMComponent, obj, strArr})).booleanValue();
        }
        if (!(iDMComponent == null || iDMComponent.getFields() == null || strArr == null || strArr.length <= 0)) {
            Object fields = iDMComponent.getFields();
            for (int i = 0; i < strArr.length && (fields instanceof JSONObject); i++) {
                if (i == strArr.length - 1) {
                    ((JSONObject) fields).put(strArr[i], obj);
                    return true;
                }
                fields = ((JSONObject) fields).get(strArr[i]);
            }
            return false;
        }
        return false;
    }

    public static void c(fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04bd7fd", new Object[]{fsbVar});
        } else {
            d(fsbVar, Globals.getApplication().getString(R.string.cart_calculate_in_settlement), Globals.getApplication().getString(R.string.cart_promotion_calculate_totalTitle_heji));
        }
    }

    public static void c0(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5586ad", new Object[]{iDMComponent});
        } else if (iDMComponent != null && iDMComponent.getData() != null) {
            iDMComponent.getData().remove("status");
        }
    }

    public static void d(fsb fsbVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ab9291", new Object[]{fsbVar, str, str2});
            return;
        }
        IDMComponent w = w(fsbVar);
        if (w != null) {
            b0(w, "", "pay", "postTitle");
            b0(w, str, "pay", KEY_DISCOUNT_TIPS);
            b0(w, "", "pay", "calculatorTips");
            b0(w, "", "pay", "detailInfoText");
            b0(w, str2, "pay", "totalTitle");
            if (Globals.getApplication().getString(R.string.cart_promotion_calculate).equals(str)) {
                w.getFields().put(KEY_IS_CALCULATING_STATE, (Object) Boolean.TRUE);
            }
        }
    }

    public static void e(ct1 ct1Var, fsb fsbVar, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a11efbe", new Object[]{ct1Var, fsbVar, context, new Boolean(z)});
        } else if (ct1Var != null) {
            ct1Var.m(fsbVar);
            if (!(fsbVar == null || fsbVar.getComponents() == null)) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                for (IDMComponent iDMComponent : fsbVar.getComponents()) {
                    if (iDMComponent != null) {
                        nb3.g(iDMComponent);
                        String h = ParseModule.h(iDMComponent);
                        if ("footer".equals(h)) {
                            arrayList2.add(iDMComponent);
                        } else if ("header".equals(h)) {
                            arrayList.add(iDMComponent);
                        } else if ("stickyTop".equals(h)) {
                            arrayList4.add(iDMComponent);
                        } else if ("stickyBottom".equals(h)) {
                            arrayList5.add(iDMComponent);
                        }
                    }
                    if (!z || !(iDMComponent == null || iDMComponent.getStatus() == 0)) {
                        arrayList3.add(iDMComponent);
                    }
                }
                kcu kcuVar = new kcu(arrayList, arrayList3, arrayList2);
                kcuVar.i(arrayList4);
                kcuVar.h(arrayList5);
                ct1Var.n(kcuVar);
            }
        }
    }

    public static void f(kmb kmbVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fab45b30", new Object[]{kmbVar, str, str2});
        } else {
            g(kmbVar, str, str2, null);
        }
    }

    public static void g(kmb kmbVar, String str, String str2, View view) {
        IDMComponent componentByName;
        Map<String, List<gsb>> eventMap;
        List<gsb> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6016afa2", new Object[]{kmbVar, str, str2, view});
        } else if (kmbVar != null && kmbVar.j() != null && (componentByName = kmbVar.j().getComponentByName(str)) != null && (eventMap = componentByName.getEventMap()) != null && (list = eventMap.get(str2)) != null) {
            for (gsb gsbVar : list) {
                lcu d = kmbVar.g().d();
                d.q(str2);
                d.l(gsbVar.getType());
                d.k(gsbVar);
                d.i(componentByName);
                if (n7v.a()) {
                    d.m(na3.sKeyEventExtraCartItemView, view);
                }
                kmbVar.g().h(d);
            }
        }
    }

    public static void h(List<IDMComponent> list, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d968e1", new Object[]{list, iDMComponent});
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        if (iDMComponent != null) {
            if ((iDMComponent.getChildren() == null || iDMComponent.getChildren().isEmpty()) && ("item".equals(iDMComponent.getTag()) || "bundleHeader".equals(iDMComponent.getTag()))) {
                list.add(iDMComponent);
            }
            for (IDMComponent iDMComponent2 : iDMComponent.getChildren()) {
                h(list, iDMComponent2);
            }
        }
    }

    public static IDMComponent i(fsb fsbVar, String str) {
        List<IDMComponent> children;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("d8ea9b5", new Object[]{fsbVar, str});
        }
        IDMComponent j = j(fsbVar, str);
        if (j == null || (children = j.getChildren()) == null) {
            return null;
        }
        for (IDMComponent iDMComponent : children) {
            if ("bundleHeader".equals(iDMComponent.getTag())) {
                return iDMComponent;
            }
        }
        return null;
    }

    public static IDMComponent j(fsb fsbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("8b24f6f9", new Object[]{fsbVar, str});
        }
        return fsbVar.getComponentByName("bundle_" + str);
    }

    public static IDMComponent k(fsb fsbVar, String str) {
        List<IDMComponent> n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("a1403105", new Object[]{fsbVar, str});
        }
        if (TextUtils.isEmpty(str) || (n = ((u55) fsbVar).n()) == null) {
            return null;
        }
        for (IDMComponent iDMComponent : n) {
            if (str.equals(r(iDMComponent))) {
                return iDMComponent;
            }
        }
        return null;
    }

    public static List<IDMComponent> l(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f272b829", new Object[]{iDMComponent});
        }
        if (iDMComponent == null || iDMComponent.getChildren() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        h(arrayList, iDMComponent);
        return arrayList;
    }

    public static IDMComponent m(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("4c19b3b2", new Object[]{iDMComponent, str});
        }
        if (iDMComponent != null && !TextUtils.isEmpty(str)) {
            if (str.equals(iDMComponent.getTag())) {
                return iDMComponent;
            }
            IDMComponent parent = iDMComponent.getParent();
            if (!(parent == null || parent.getChildren() == null || parent.getChildren().isEmpty())) {
                for (IDMComponent iDMComponent2 : parent.getChildren()) {
                    if (str.equals(iDMComponent2.getTag())) {
                        return iDMComponent2;
                    }
                }
                return m(parent, str);
            }
        }
        return null;
    }

    public static String n(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b82dc32", new Object[]{new Long(j)});
        }
        String bigDecimal = new BigDecimal(j).divide(new BigDecimal("1000"), 3, 6).toString();
        return bigDecimal + "kg";
    }

    public static IDMComponent o(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("b8dfec6c", new Object[]{iDMComponent});
        }
        if (iDMComponent == null) {
            return null;
        }
        if (N(iDMComponent)) {
            return iDMComponent;
        }
        return o(iDMComponent.getParent());
    }

    public static String p(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab577206", new Object[]{iDMComponent});
        }
        if (iDMComponent == null) {
            return null;
        }
        if (N(iDMComponent)) {
            return iDMComponent.getId();
        }
        return p(iDMComponent.getParent());
    }

    public static List<IDMComponent> q(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6dd0c4ca", new Object[]{iDMComponent});
        }
        ArrayList arrayList = new ArrayList();
        if (iDMComponent == null) {
            return arrayList;
        }
        return l(o(iDMComponent));
    }

    public static String r(IDMComponent iDMComponent) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88b9d524", new Object[]{iDMComponent});
        }
        if (iDMComponent == null || (fields = iDMComponent.getFields()) == null) {
            return null;
        }
        return fields.getString("cartId");
    }

    public static String s(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1af4e626", new Object[]{list});
        }
        return t(list, null);
    }

    public static String t(List<IDMComponent> list, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ea6b955", new Object[]{list, aVar});
        }
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (IDMComponent iDMComponent : list) {
            if ("item".equals(iDMComponent.getTag())) {
                String string = iDMComponent.getFields().getString("cartId");
                if (!TextUtils.isEmpty(string) && (aVar == null || ((u93.a) aVar).a(iDMComponent))) {
                    sb.append(string);
                    sb.append(",");
                }
            }
        }
        if (sb.toString().endsWith(",")) {
            sb.delete(sb.length() - 1, sb.length());
        }
        return sb.toString();
    }

    public static int u(fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca1bba92", new Object[]{fsbVar})).intValue();
        }
        List<IDMComponent> v = v(fsbVar);
        if (v != null) {
            return v.size();
        }
        return 0;
    }

    public static List<IDMComponent> v(fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("13accd77", new Object[]{fsbVar});
        }
        ArrayList arrayList = null;
        if (!(fsbVar instanceof u55)) {
            return null;
        }
        List<IDMComponent> n = ((u55) fsbVar).n();
        if (n != null && n.size() > 0) {
            arrayList = new ArrayList();
            for (IDMComponent iDMComponent : n) {
                if ("item".equals(iDMComponent.getTag()) && P(iDMComponent)) {
                    arrayList.add(iDMComponent);
                }
            }
        }
        return arrayList;
    }

    public static IDMComponent w(fsb fsbVar) {
        List<IDMComponent> components;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("d16ba271", new Object[]{fsbVar});
        }
        if (fsbVar == null || (components = fsbVar.getComponents()) == null || components.size() <= 0) {
            return null;
        }
        for (IDMComponent iDMComponent : components) {
            if (iDMComponent != null && "submit".equals(iDMComponent.getTag())) {
                return iDMComponent;
            }
        }
        return null;
    }

    public static <T> T x(IDMComponent iDMComponent, Class<T> cls, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("799e52b3", new Object[]{iDMComponent, cls, strArr});
        }
        if (!(iDMComponent == null || cls == null || iDMComponent.getFields() == null || strArr == null || strArr.length <= 0)) {
            Object fields = iDMComponent.getFields();
            for (int i = 0; i < strArr.length && (fields instanceof JSONObject); i++) {
                if (i == strArr.length - 1) {
                    return (T) ((JSONObject) fields).getObject(strArr[i], cls);
                }
                fields = ((JSONObject) fields).get(strArr[i]);
            }
            return null;
        }
        return null;
    }

    public static gsb y(IDMComponent iDMComponent, String str, String str2) {
        Map<String, List<gsb>> eventMap;
        List<gsb> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsb) ipChange.ipc$dispatch("433d6f0a", new Object[]{iDMComponent, str, str2});
        }
        if (iDMComponent == null || str == null || str2 == null || (eventMap = iDMComponent.getEventMap()) == null || (list = eventMap.get(str)) == null) {
            return null;
        }
        for (gsb gsbVar : list) {
            if (gsbVar != null && str2.equals(gsbVar.getType())) {
                return gsbVar;
            }
        }
        return null;
    }

    public static List<IDMComponent> z(fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e17cf45c", new Object[]{fsbVar});
        }
        ArrayList arrayList = null;
        if (fsbVar == null) {
            return null;
        }
        List<IDMComponent> components = fsbVar.getComponents();
        if (components != null && components.size() > 0) {
            arrayList = new ArrayList();
            for (IDMComponent iDMComponent : components) {
                if (TextUtils.equals("item", iDMComponent.getTag())) {
                    arrayList.add(iDMComponent);
                }
            }
        }
        return arrayList;
    }

    public static int H(kmb kmbVar) {
        ViewManager Z;
        ViewGroup q;
        DXRootView c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b85c5630", new Object[]{kmbVar})).intValue();
        }
        if (kmbVar == null || (Z = kmbVar.e()) == null || (q = Z.q()) == null || (c = bd4.c(q, "submit")) == null) {
            return 0;
        }
        return c.getMeasuredHeight();
    }

    public static int d0(kmb kmbVar, boolean z) {
        kcu d;
        List<IDMComponent> c;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e923a81f", new Object[]{kmbVar, new Boolean(z)})).intValue();
        }
        if (kmbVar == null || (d = kmbVar.d().d()) == null || (c = d.c()) == null) {
            return 0;
        }
        for (IDMComponent iDMComponent : c) {
            if (iDMComponent != null && iDMComponent.isNormalComponent()) {
                String tag = iDMComponent.getTag();
                if (!"submit".equals(tag) && !"elevator".equals(tag)) {
                    JSONObject fields = iDMComponent.getFields();
                    if (!z || !fields.getBooleanValue("isIgnoreStripe")) {
                        DXRootView c2 = bd4.c(kmbVar.e().q(), tag);
                        if (c2 != null) {
                            i += c2.getMeasuredHeight();
                        }
                    }
                }
            }
        }
        return i;
    }

    public static boolean P(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0cf0cb4", new Object[]{iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return false;
        }
        JSONObject fields = iDMComponent.getFields();
        return fields.containsKey("isChecked") && "true".equals(fields.getString("isChecked"));
    }

    public static void Y(kmb kmbVar) {
        List<String> e;
        boolean z;
        IDMComponent o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0c6cd8c", new Object[]{kmbVar});
            return;
        }
        List<IDMComponent> a2 = kmbVar.d().d().a();
        u55 u55Var = (u55) kmbVar.b();
        Map<String, DMComponent> p = u55Var.p();
        ArrayList arrayList = new ArrayList();
        for (IDMComponent iDMComponent : a2) {
            if ("item".equals(iDMComponent.getTag()) && (o = o(iDMComponent)) != null) {
                arrayList.add(o.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(str) && (e = bd4.e(str, u55Var.p())) != null) {
                DMComponent dMComponent = null;
                int i = 0;
                boolean z3 = true;
                for (String str2 : e) {
                    DMComponent dMComponent2 = p.get(str2);
                    if (dMComponent2 != null) {
                        if ("shop".equals(dMComponent2.getTag()) || "bundleHeader".equals(dMComponent2.getTag())) {
                            i++;
                            dMComponent = dMComponent2;
                        } else {
                            boolean booleanValue = dMComponent2.getFields().getBooleanValue("isChecked");
                            if (!dMComponent2.getFields().getBooleanValue(KEY_CAN_CHECK_IN_NORMAL)) {
                                i++;
                            } else if (!booleanValue) {
                                z3 = false;
                                if (dMComponent != null) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                if (e.size() == i) {
                    z = false;
                    z3 = false;
                } else {
                    z = true;
                }
                if (dMComponent != null) {
                    JSONObject fields = dMComponent.getFields();
                    if (fields.getBooleanValue("isChecked") != z3) {
                        fields.put("isChecked", (Object) (z3 + ""));
                        z2 = true;
                    }
                    if (fields.getBooleanValue(KEY_CAN_CHECK_IN_NORMAL) != z) {
                        fields.put(KEY_CAN_CHECK_IN_NORMAL, (Object) (z + ""));
                        z2 = true;
                    }
                }
            }
        }
        if (z2) {
            kmbVar.e().E(2);
        }
    }

    public static boolean a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("650ed919", new Object[]{iDMComponent})).booleanValue();
        }
        if (iDMComponent == null) {
            return false;
        }
        JSONObject fields = iDMComponent.getFields();
        return fields.containsKey(KEY_CAN_CHECK_IN_NORMAL) && "true".equals(fields.getString(KEY_CAN_CHECK_IN_NORMAL));
    }

    public static boolean b(boolean z, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9b50f63", new Object[]{new Boolean(z), iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return false;
        }
        JSONObject fields = iDMComponent.getFields();
        if (z) {
            if (fields.containsKey(KEY_CAN_CHECK_IN_MANAGE) && "true".equals(fields.getString(KEY_CAN_CHECK_IN_MANAGE))) {
                return true;
            }
        } else if (fields.containsKey(KEY_CAN_CHECK_IN_NORMAL) && "true".equals(fields.getString(KEY_CAN_CHECK_IN_NORMAL))) {
            return true;
        }
        return false;
    }

    public static void W(fsb fsbVar, kmb kmbVar) {
        List<IDMComponent> n;
        String str;
        int indexOf;
        int i;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a23de76", new Object[]{fsbVar, kmbVar});
        } else if ((fsbVar instanceof u55) && (n = ((u55) fsbVar).n()) != null && n.size() > 0) {
            String str2 = "0";
            BigDecimal bigDecimal = new BigDecimal(str2);
            HashSet hashSet = new HashSet();
            Iterator<IDMComponent> it = n.iterator();
            IDMComponent iDMComponent = null;
            int i2 = 0;
            long j2 = 0;
            long j3 = 0;
            boolean z = false;
            while (true) {
                str = "￥";
                if (!it.hasNext()) {
                    break;
                }
                IDMComponent next = it.next();
                if (next != null) {
                    IDMComponent iDMComponent2 = "submit".equals(next.getTag()) ? next : iDMComponent;
                    if (!"item".equals(next.getTag()) || !P(next) || !b(false, next)) {
                        j3 = j3;
                        iDMComponent = iDMComponent2;
                        j2 = j2;
                    } else {
                        i2++;
                        Long l = (Long) x(next, Long.class, "pay", iiz.PERF_STAG_TOTAL);
                        Long l2 = (Long) x(next, Long.class, "pay", "currencyUnitFactor");
                        BigDecimal bigDecimal2 = new BigDecimal(100);
                        if (l2 != null) {
                            j = j3;
                            bigDecimal2 = new BigDecimal(l2.longValue());
                        } else {
                            j = j3;
                        }
                        JSONObject jSONObject = next.getFields().getJSONObject("pay");
                        if (jSONObject != null && jSONObject.containsKey("price") && next.getFields().containsKey("quantity")) {
                            bigDecimal = bigDecimal.add(new BigDecimal(jSONObject.getLongValue("price")).multiply(new BigDecimal(next.getFields().getLongValue("quantity"))).divide(bigDecimal2, 2, 6));
                        } else if (l != null) {
                            bigDecimal = bigDecimal.add(new BigDecimal(l.longValue()).divide(bigDecimal2, 2, 6));
                        }
                        Long l3 = (Long) x(next, Long.class, ActivityChooserModel.ATTRIBUTE_WEIGHT, "value");
                        j3 = l3 != null ? j + l3.longValue() : j;
                        String str3 = (String) x(next, String.class, "pay", "currencySymbol");
                        if (!TextUtils.isEmpty(str3)) {
                            str = str3;
                        }
                        hashSet.add(str.trim());
                        j2++;
                        iDMComponent = iDMComponent2;
                        z = true;
                    }
                } else {
                    j3 = j3;
                }
                str2 = str2;
                it = it;
            }
            if (iDMComponent != null) {
                b0(iDMComponent, Long.valueOf(bigDecimal.multiply(new BigDecimal(100)).longValue()), "pay", "price");
                if (hashSet.size() > 1) {
                    b0(iDMComponent, Localization.q(R.string.taobao_app_1028_1_21665), "pay", "priceTitle");
                    b0(iDMComponent, Boolean.TRUE, "pay", "multipleCurrencySymbol");
                    b0(iDMComponent, null, "pay", "currencySymbol");
                } else {
                    if (hashSet.iterator().hasNext()) {
                        str = (String) hashSet.iterator().next();
                    }
                    b0(iDMComponent, Boolean.FALSE, "pay", "multipleCurrencySymbol");
                    b0(iDMComponent, str, "pay", "currencySymbol");
                    if (bigDecimal.multiply(new BigDecimal(100)).longValue() == 0) {
                        b0(iDMComponent, "￥0", "pay", "priceTitle");
                        b0(iDMComponent, "", "pay", KEY_DISCOUNT_TIPS);
                    } else {
                        String str4 = str + bigDecimal.toString();
                        if (!TextUtils.isEmpty(str4) && str4.contains(".") && (indexOf = str4.indexOf(".")) != -1 && (i = indexOf + 1) < str4.length() && TextUtils.isEmpty(str4.substring(i).replace(str2, ""))) {
                            str4 = str4.substring(0, indexOf);
                        }
                        b0(iDMComponent, str4, "pay", "priceTitle");
                    }
                }
                b0(iDMComponent, Long.valueOf(j3), ActivityChooserModel.ATTRIBUTE_WEIGHT, "value");
                b0(iDMComponent, n(j3), ActivityChooserModel.ATTRIBUTE_WEIGHT, "title");
                b0(iDMComponent, Long.valueOf(j2), "quantity");
                if (!z) {
                    b0(iDMComponent, "disable", "submit", "status");
                } else {
                    b0(iDMComponent, "normal", "submit", "status");
                }
                b0(iDMComponent, Boolean.FALSE, "pay", "fromServer");
                JSONObject fields = iDMComponent.getFields();
                if (fields != null) {
                    fields.put("isHideCalculateBtn", (Object) Boolean.TRUE);
                }
                if (i2 > 0) {
                    b0(iDMComponent, String.format(Localization.q(R.string.taobao_app_1028_1_21657), Integer.valueOf(i2)), "pay", "postTitle");
                } else {
                    b0(iDMComponent, "", "pay", "postTitle");
                }
            }
        }
    }
}
