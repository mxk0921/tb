package com.taobao.android.ultron.datamodel.imp;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import anet.channel.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.LinkageType;
import com.taobao.android.ultron.common.utils.ErrorConstants;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultronx.engine.UltronEngine;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.db7;
import tb.eav;
import tb.fbf;
import tb.gsb;
import tb.hav;
import tb.j5e;
import tb.jrl;
import tb.kz;
import tb.lbq;
import tb.n1n;
import tb.o1n;
import tb.o1o;
import tb.o58;
import tb.rb4;
import tb.t2o;
import tb.u55;
import tb.v55;
import tb.vav;
import tb.zc4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ParseModule implements j5e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String g = "CardGroupTag";
    public static final String h = "PositionTag";

    /* renamed from: a  reason: collision with root package name */
    public IDMComponent f9870a;
    public boolean b = false;
    public boolean c = true;
    public kz d;
    public boolean e;
    public boolean f;

    static {
        t2o.a(83886193);
        t2o.a(83886236);
    }

    public static String[] g(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("1814deb5", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str) && (indexOf = str.indexOf("_")) > 0 && indexOf < str.length() - 1) {
            return new String[]{str.substring(0, indexOf), str.substring(indexOf + 1, str.length())};
        }
        return null;
    }

    public static String h(IDMComponent iDMComponent) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e630fa3", new Object[]{iDMComponent});
        }
        if (iDMComponent == null || iDMComponent.getExtMap() == null || (obj = iDMComponent.getExtMap().get(h)) == null) {
            return null;
        }
        return String.valueOf(obj);
    }

    public final gsb A(u55 u55Var, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsb) ipChange.ipc$dispatch("7909254f", new Object[]{this, u55Var, jSONObject});
        }
        List<IDMComponent> list = null;
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        String string = jSONObject.getString("type");
        JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
        if (jSONObject2 == null) {
            str = "";
        } else {
            str = jSONObject2.getString("nextRenderRoot");
        }
        if (this.c && !TextUtils.isEmpty(str)) {
            list = i(u55Var, str);
        }
        return new DMEvent(string, jSONObject2, list, jSONObject.getIntValue("option"));
    }

    public final Map<String, List<gsb>> B(u55 u55Var, JSONObject jSONObject) {
        gsb A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("296cba8b", new Object[]{this, u55Var, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap(jSONObject.size());
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.isEmpty(key) && (value instanceof JSONArray)) {
                JSONArray jSONArray = (JSONArray) value;
                ArrayList arrayList = new ArrayList(jSONArray.size());
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if ((next instanceof JSONObject) && (A = A(u55Var, (JSONObject) next)) != null) {
                        arrayList.add(A);
                    }
                }
                hashMap.put(key, arrayList);
            }
        }
        return hashMap;
    }

    public final Object E(JSONObject jSONObject, String[] strArr) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f31978f5", new Object[]{this, jSONObject, strArr});
        }
        while (strArr.length > 1) {
            String str = strArr[0];
            if (str.endsWith("]")) {
                int indexOf = str.indexOf("[");
                JSONArray jSONArray = jSONObject.getJSONArray(str.substring(0, indexOf));
                try {
                    i = Integer.parseInt(str.substring(indexOf + 1, str.length() - 1));
                } catch (Throwable unused) {
                    i = 0;
                }
                if (i < jSONArray.size()) {
                    jSONObject = jSONArray.getJSONObject(i);
                    strArr = (String[]) Arrays.copyOfRange(strArr, 1, strArr.length);
                }
            } else {
                jSONObject = jSONObject.getJSONObject(str);
                strArr = (String[]) Arrays.copyOfRange(strArr, 1, strArr.length);
            }
        }
        return jSONObject.get(strArr[0]);
    }

    public void F(u55 u55Var, JSONObject jSONObject) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4fe7e3f", new Object[]{this, u55Var, jSONObject});
        } else if (this.d != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : jSONObject.keySet()) {
                Object obj = jSONObject.get(str);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (jSONObject2.containsKey("extendBlock")) {
                        z = jSONObject2.getBoolean("extendBlock").booleanValue();
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(str);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (u55Var.m(str2) && !arrayList2.contains(str2)) {
                    arrayList2.add(str2);
                }
            }
            this.d.a(arrayList2);
        }
    }

    public void G(u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df6a5aef", new Object[]{this, u55Var});
            return;
        }
        String K = u55Var.K();
        JSONObject A = u55Var.A();
        if (TextUtils.isEmpty(K)) {
            K = A.getString("root");
        }
        if (TextUtils.isEmpty(K)) {
            String bizName = u55Var.getBizName();
            ErrorConstants errorConstants = ErrorConstants.PROTOCOL_ROOT_KEY_EMPTY;
            lbq.a(bizName, "FullResponseParse", errorConstants.errorCode(), errorConstants.errorMessage());
            return;
        }
        u55Var.b(i(u55Var, K));
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.taobao.android.ultron.common.model.IDMComponent> K(tb.u55 r19, java.lang.String r20, com.taobao.android.ultron.datamodel.imp.DMComponent r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.ultron.datamodel.imp.ParseModule.K(tb.u55, java.lang.String, com.taobao.android.ultron.datamodel.imp.DMComponent, boolean, boolean):java.util.List");
    }

    public final void L(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24f3bd1", new Object[]{this, iDMComponent, str});
        } else if (!TextUtils.isEmpty(str) && iDMComponent.getExtMap() != null) {
            iDMComponent.getExtMap().put(g, str);
        }
    }

    public final void M(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260a7233", new Object[]{this, iDMComponent, str});
        } else if (!TextUtils.isEmpty(str)) {
            iDMComponent.getExtMap().put(h, str);
        }
    }

    public void N(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4bea29", new Object[]{this, list});
        } else {
            jrl.d(null, list, this.e);
        }
    }

    public void O(u55 u55Var, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("649cabcf", new Object[]{this, u55Var, list});
        } else {
            jrl.d(u55Var, list, this.e);
        }
    }

    public void P(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cc31014", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void Q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aab032bb", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void R(kz kzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61472130", new Object[]{this, kzVar});
        } else {
            this.d = kzVar;
        }
    }

    public void S(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd47f91", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public final void T(u55 u55Var, JSONObject jSONObject) {
        JSONObject r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e89711", new Object[]{this, u55Var, jSONObject});
        } else if (u55Var != null && jSONObject != null && (r = u55Var.r()) != null) {
            r.putAll(jSONObject);
        }
    }

    public void V(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9e5817b", new Object[]{this, iDMComponent});
        } else {
            this.f9870a = iDMComponent;
        }
    }

    public final void a(List<o58> list, o58 o58Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af0d70e1", new Object[]{this, list, o58Var});
            return;
        }
        for (o58 o58Var2 : list) {
            if (StringUtils.isStringEqual(o58Var2.b, o58Var.b) && StringUtils.isStringEqual(o58Var2.c, o58Var.c) && StringUtils.isStringEqual(o58Var2.e, o58Var.e)) {
                return;
            }
        }
        list.add(o58Var);
    }

    public final DMComponent b(DMComponent dMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DMComponent) ipChange.ipc$dispatch("ffbc0ee", new Object[]{this, dMComponent});
        }
        try {
            return new DMComponent(JSON.parseObject(dMComponent.getData().toJSONString()), dMComponent.getContainerType(), JSON.parseObject(dMComponent.getContainerInfo().toJSONString()));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void d(u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7774c63c", new Object[]{this, u55Var});
            return;
        }
        Map<String, DMComponent> p = u55Var.p();
        JSONArray J = u55Var.J();
        if (J == null) {
            J = new JSONArray();
            u55Var.C().put("request", (Object) J);
        }
        Iterator<Object> it = J.iterator();
        while (it.hasNext()) {
            DMComponent dMComponent = p.get((String) it.next());
            if (dMComponent != null) {
                dMComponent.setLinkageType(LinkageType.REQUEST);
            }
        }
    }

    public final void e(u55 u55Var, String str, String str2, String str3, String str4, List<rb4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("562a78dc", new Object[]{this, u55Var, str, str2, str3, str4, list});
            return;
        }
        List<IDMComponent> components = u55Var.getComponents();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) u55Var.o;
        DMComponent dMComponent = (DMComponent) concurrentHashMap.get(str2);
        if (dMComponent == null) {
            UnifyLog.m(u55Var.getBizName(), "ParseModule", "delete target is null", new String[0]);
            String bizName = u55Var.getBizName();
            ErrorConstants errorConstants = ErrorConstants.PARSE_DELTA_TARGET_NULL;
            lbq.a(bizName, "ParseModule.deleteOp", errorConstants.errorCode(), errorConstants.errorMessage());
            return;
        }
        DMComponent dMComponent2 = (DMComponent) dMComponent.getParent();
        if (dMComponent2 == null) {
            UnifyLog.m(u55Var.getBizName(), "ParseModule", "delete target's parent is null", new String[0]);
            String bizName2 = u55Var.getBizName();
            ErrorConstants errorConstants2 = ErrorConstants.PARSE_DELTA_PARENT_NULL;
            lbq.a(bizName2, "ParseModule.deleteOp", errorConstants2.errorCode(), errorConstants2.errorMessage());
            return;
        }
        int indexOf = dMComponent2.getChildren().indexOf(dMComponent);
        if (components.remove(dMComponent)) {
            db7 db7Var = new db7();
            db7Var.b(dMComponent);
            db7Var.c(indexOf);
            list.add(db7Var);
        }
        concurrentHashMap.remove(str2);
        dMComponent2.getChildren().remove(indexOf);
        dMComponent.setParent(null);
        u55Var.h0(str2, dMComponent2.componentKey);
        if (dMComponent.getChildren() != null) {
            List<IDMComponent> children = dMComponent.getChildren();
            for (int size = children.size() - 1; size >= 0; size--) {
                e(u55Var, str, children.get(size).getKey(), str2, str4, list);
            }
        }
    }

    public final String f(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("558820d8", new Object[]{this, iDMComponent, iDMComponent2});
        }
        String key = (iDMComponent == null || iDMComponent.getFields() == null || !"true".equals(iDMComponent.getCardGroup())) ? null : iDMComponent.getKey();
        if (iDMComponent2 == null || iDMComponent2.getExtMap() == null) {
            return key;
        }
        ArrayMap<String, Object> extMap = iDMComponent2.getExtMap();
        String str = g;
        return (extMap.get(str) == null || TextUtils.isEmpty(String.valueOf(iDMComponent2.getExtMap().get(str)))) ? key : (String) iDMComponent2.getExtMap().get(str);
    }

    public final JSONObject j(u55 u55Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("29dee960", new Object[]{this, u55Var, str});
        }
        if (str == null) {
            return null;
        }
        return u55Var.N().get(str);
    }

    public final String k(u55 u55Var, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bf22", new Object[]{this, u55Var, str});
        }
        if (str == null || (jSONObject = u55Var.N().get(str)) == null) {
            return "native";
        }
        return jSONObject.getString("containerType");
    }

    public final IDMComponent l(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("eb8dc895", new Object[]{this, iDMComponent, list});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(iDMComponent);
        List<IDMComponent> a2 = zc4.a(iDMComponent);
        if (a2 != null) {
            arrayList.addAll(a2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IDMComponent iDMComponent2 = (IDMComponent) it.next();
            if (list.contains(iDMComponent2)) {
                return iDMComponent2;
            }
        }
        return null;
    }

    public final IDMComponent m(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("86a39fa7", new Object[]{this, iDMComponent, list});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(iDMComponent);
        List<IDMComponent> a2 = zc4.a(iDMComponent);
        if (a2 != null) {
            arrayList.addAll(a2);
        }
        for (int size = arrayList.size() - 1; size >= 0; size++) {
            IDMComponent iDMComponent2 = (IDMComponent) arrayList.get(size);
            if (list.contains(iDMComponent2)) {
                return iDMComponent2;
            }
        }
        return null;
    }

    public final String n(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66ab54ba", new Object[]{this, iDMComponent, iDMComponent2});
        }
        if (iDMComponent == null || iDMComponent.getFields() == null || iDMComponent.getPosition() == null) {
            str = null;
        } else {
            str = iDMComponent.getPosition();
        }
        if (iDMComponent2 == null || iDMComponent2.getExtMap() == null) {
            return str;
        }
        ArrayMap<String, Object> extMap = iDMComponent2.getExtMap();
        String str2 = h;
        if (extMap.get(str2) == null || TextUtils.isEmpty(String.valueOf(iDMComponent2.getExtMap().get(str2)))) {
            return str;
        }
        return (String) iDMComponent2.getExtMap().get(str2);
    }

    public IDMComponent o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("17ba7e90", new Object[]{this});
        }
        return this.f9870a;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9ab717f", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean v(u55 u55Var, JSONObject jSONObject, UltronEngine ultronEngine, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2e7cd9e", new Object[]{this, u55Var, jSONObject, ultronEngine, str})).booleanValue();
        }
        if (jSONObject == null && ultronEngine == null) {
            return false;
        }
        n1n.e(u55Var, jSONObject);
        List<IDMComponent> D = D(u55Var, jSONObject, ultronEngine, str);
        if (D == null || D.isEmpty()) {
            return false;
        }
        u55Var.C0(jSONObject);
        u55Var.p0(D);
        return true;
    }

    public void x(u55 u55Var, JSONObject jSONObject) {
        v55 v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461b1ffb", new Object[]{this, u55Var, jSONObject});
        } else if (u55Var != null && (v = u55Var.v()) != null) {
            v.f().b(jSONObject);
        }
    }

    public final List<IDMComponent> z(u55 u55Var, UltronEngine ultronEngine, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ffb716e5", new Object[]{this, u55Var, ultronEngine, jSONObject, str});
        }
        if (TextUtils.isEmpty(str)) {
            str = jSONObject.toJSONString();
        }
        ultronEngine.parseDeltaSync(str);
        return p(u55Var, ultronEngine);
    }

    public final void I(u55 u55Var, String str, String str2, String str3, String str4, List<rb4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ccf6ae", new Object[]{this, u55Var, str, str2, str3, str4, list});
            return;
        }
        u55Var.getComponents();
        DMComponent dMComponent = (DMComponent) ((ConcurrentHashMap) u55Var.o).get(str2);
        if (dMComponent == null) {
            UnifyLog.m(u55Var.getBizName(), "ParseModule", "reload target is null", new String[0]);
            String bizName = u55Var.getBizName();
            ErrorConstants errorConstants = ErrorConstants.PARSE_DELTA_TARGET_NULL;
            lbq.a(bizName, "ParseModule.reloadOp", errorConstants.errorCode(), errorConstants.errorMessage());
        }
        JSONObject jSONObject = u55Var.r().getJSONObject(str2).getJSONObject("events");
        dMComponent.onReloadEvent(B(u55Var, jSONObject));
        dMComponent.setEvents(jSONObject);
    }

    public final void J(u55 u55Var, String str, String str2, String str3, String str4, List<rb4> list) {
        ArrayMap<String, Object> extMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43bc6ef3", new Object[]{this, u55Var, str, str2, str3, str4, list});
            return;
        }
        List<IDMComponent> components = u55Var.getComponents();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) u55Var.o;
        DMComponent dMComponent = (DMComponent) concurrentHashMap.get(str2);
        if (dMComponent == null) {
            UnifyLog.m(u55Var.getBizName(), "ParseModule", "replaceOp target is null", new String[0]);
            String bizName = u55Var.getBizName();
            ErrorConstants errorConstants = ErrorConstants.PARSE_DELTA_TARGET_NULL;
            lbq.a(bizName, "ParseModule.replaceOp", errorConstants.errorCode(), errorConstants.errorMessage());
            return;
        }
        DMComponent c = c(u55Var, u55Var.r().getJSONObject(str2), str2);
        DMComponent dMComponent2 = (DMComponent) dMComponent.getParent();
        if (dMComponent2 != null) {
            int indexOf = dMComponent2.getChildren().indexOf(dMComponent);
            if (indexOf == -1) {
                UnifyLog.m(u55Var.getBizName(), "ParseModule", "target component index is -1", new String[0]);
            }
            dMComponent2.getChildren().remove(indexOf);
            dMComponent2.getChildren().add(indexOf, c);
            c.setParent(dMComponent2);
            ArrayMap<String, Object> extMap2 = dMComponent.getExtMap();
            if (!(extMap2 == null || (extMap = c.getExtMap()) == null)) {
                for (Map.Entry<String, Object> entry : extMap2.entrySet()) {
                    extMap.put(entry.getKey(), entry.getValue());
                }
            }
            String f = f(c, dMComponent2);
            String n = n(c, dMComponent2);
            L(c, f);
            M(c, n);
            o1o o1oVar = new o1o();
            o1oVar.c(c);
            o1oVar.e(dMComponent);
            o1oVar.d(indexOf);
            list.add(o1oVar);
            int indexOf2 = components.indexOf(dMComponent);
            components.remove(indexOf2);
            components.add(indexOf2, c);
            concurrentHashMap.put(str2, c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.taobao.android.ultron.common.model.IDMComponent] */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.taobao.android.ultron.common.model.IDMComponent] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.taobao.android.ultron.datamodel.imp.DMComponent, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.taobao.android.ultron.common.model.IDMComponent> p(tb.fsb r10, com.taobao.android.ultronx.engine.UltronEngine r11) {
        /*
            r9 = this;
            r0 = 3
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.ultron.datamodel.imp.ParseModule.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001b
            java.lang.String r2 = "9bc4b3a2"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            r0[r3] = r9
            r3 = 1
            r0[r3] = r10
            r10 = 2
            r0[r10] = r11
            java.lang.Object r10 = r1.ipc$dispatch(r2, r0)
            java.util.List r10 = (java.util.List) r10
            return r10
        L_0x001b:
            com.taobao.android.ultronx.engine.UltronContext r1 = r11.getUltronContext()
            r2 = 0
            if (r1 == 0) goto L_0x00c7
            com.taobao.android.ultronx.engine.UltronContext r1 = r11.getUltronContext()
            com.taobao.android.ultronx.tree.StatusTree r1 = r1.getStatusTree()
            if (r1 != 0) goto L_0x002e
            goto L_0x00c7
        L_0x002e:
            com.taobao.android.ultronx.engine.UltronContext r11 = r11.getUltronContext()
            com.taobao.android.ultronx.tree.StatusTree r11 = r11.getStatusTree()
            com.taobao.android.ultronx.node.StatusNode r1 = r11.getRoot()
            if (r1 != 0) goto L_0x003d
            return r2
        L_0x003d:
            com.taobao.android.ultron.datamodel.imp.DMComponent r3 = new com.taobao.android.ultron.datamodel.imp.DMComponent
            r3.<init>(r1)
            r9.f9870a = r3
            java.lang.String r1 = "leaf"
            java.util.List r11 = r11.filterNode(r1)
            if (r11 == 0) goto L_0x00c7
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L_0x0055
            goto L_0x00c7
        L_0x0055:
            tb.u55 r10 = (tb.u55) r10
            java.util.Map r10 = r10.p()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0069:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x00c6
            java.lang.Object r3 = r11.next()
            com.taobao.android.ultronx.node.StatusNode r3 = (com.taobao.android.ultronx.node.StatusNode) r3
            if (r3 != 0) goto L_0x0078
            goto L_0x0069
        L_0x0078:
            com.taobao.android.ultron.datamodel.imp.DMComponent r4 = new com.taobao.android.ultron.datamodel.imp.DMComponent
            r4.<init>(r3)
            r1.add(r4)
            java.lang.String r5 = r4.getKey()
            r10.put(r5, r4)
            com.taobao.android.ultronx.node.StatusNode r3 = r3.getParent()
            r5 = 3
        L_0x008c:
            if (r5 < 0) goto L_0x0069
            if (r3 == 0) goto L_0x0069
            boolean r6 = r3.isRoot()
            if (r6 == 0) goto L_0x0097
            goto L_0x0069
        L_0x0097:
            java.lang.String r6 = r3.getName()
            java.lang.Object r7 = r2.get(r6)
            com.taobao.android.ultron.common.model.IDMComponent r7 = (com.taobao.android.ultron.common.model.IDMComponent) r7
            if (r7 != 0) goto L_0x00ab
            com.taobao.android.ultron.datamodel.imp.DMComponent r7 = new com.taobao.android.ultron.datamodel.imp.DMComponent
            r7.<init>(r3)
            r2.put(r6, r7)
        L_0x00ab:
            r6 = r4
            com.taobao.android.ultron.datamodel.imp.DMComponent r6 = (com.taobao.android.ultron.datamodel.imp.DMComponent) r6
            r8 = r7
            com.taobao.android.ultron.datamodel.imp.DMComponent r8 = (com.taobao.android.ultron.datamodel.imp.DMComponent) r8
            r6.setParent(r8)
            r8.addChild(r4)
            java.lang.String r4 = r7.getKey()
            r10.put(r4, r8)
            int r5 = r5 + (-1)
            com.taobao.android.ultronx.node.StatusNode r3 = r3.getParent()
            r4 = r7
            goto L_0x008c
        L_0x00c6:
            return r1
        L_0x00c7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.ultron.datamodel.imp.ParseModule.p(tb.fsb, com.taobao.android.ultronx.engine.UltronEngine):java.util.List");
    }

    public final void U(JSONObject jSONObject, String[] strArr, Object obj, String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335fb4f7", new Object[]{this, jSONObject, strArr, obj, str});
        } else if (strArr.length != 1) {
            String str2 = strArr[0];
            if (str2.endsWith("]")) {
                int indexOf = str2.indexOf("[");
                JSONArray jSONArray = jSONObject.getJSONArray(str2.substring(0, indexOf));
                try {
                    i = Integer.parseInt(str2.substring(indexOf + 1, str2.length() - 1));
                } catch (Throwable unused) {
                }
                if (jSONArray != null && i < jSONArray.size()) {
                    U(jSONArray.getJSONObject(i), (String[]) Arrays.copyOfRange(strArr, 1, strArr.length), obj, str);
                    return;
                }
                return;
            }
            U(jSONObject.getJSONObject(str2), (String[]) Arrays.copyOfRange(strArr, 1, strArr.length), obj, str);
        } else if ("remove".equals(str)) {
            jSONObject.remove(str);
        } else if ("add".equals(str) || "update".equals(str)) {
            jSONObject.put(strArr[0], obj);
        }
    }

    public List<IDMComponent> i(u55 u55Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6f3daf3", new Object[]{this, u55Var, str});
        }
        try {
            List<IDMComponent> K = K(u55Var, str, null, false, vav.a(u55Var.getBizName(), "ultronReuseComponentWhenDelta", false) && eav.b(u55Var.u()));
            if (K == null || K.isEmpty()) {
                String bizName = u55Var.getBizName();
                UnifyLog.m(bizName, "ParseModule", "getComponentsByRoot output is empty", "rootComponentKey:" + str);
            } else {
                O(u55Var, K);
                d(u55Var);
            }
            return K;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean u(u55 u55Var, JSONObject jSONObject) {
        List<IDMComponent> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0c078ce", new Object[]{this, u55Var, jSONObject})).booleanValue();
        }
        String str = "ultron";
        if (u55Var.F() != null) {
            try {
                this.b = o1n.a(new BigInteger(u55Var.F()), o1n.FEATURE_TAG_ID);
            } catch (Exception e) {
                UnifyLog.m(u55Var.getBizName(), "ParseModule", "parseComponents exception", e.getMessage());
                lbq.c(TextUtils.isEmpty(u55Var.getBizName()) ? str : u55Var.getBizName(), "ParseModule.protocolFeatureCheck", e);
            }
        }
        if (jSONObject == null) {
            return false;
        }
        n1n.e(u55Var, jSONObject);
        try {
            if (jSONObject.getBooleanValue("reload")) {
                list = C(u55Var, jSONObject);
            } else {
                list = t(u55Var, jSONObject);
            }
            if (!TextUtils.isEmpty(u55Var.getBizName())) {
                str = u55Var.getBizName();
            }
            if (list == null) {
                UnifyLog.m(u55Var.getBizName(), "ParseModule", "parseComponents", "新奥创协议解析为空");
                ErrorConstants errorConstants = ErrorConstants.PARSE_COMPONENT_LIST_EMPTY;
                lbq.a(str, "ParseModule.parseResponse", errorConstants.errorCode(), errorConstants.errorMessage());
                return false;
            }
            if (list.isEmpty()) {
                hav.d("ParseModule", str + "|output component list is empty");
            }
            u55Var.C0(jSONObject);
            u55Var.p0(list);
            return true;
        } catch (Throwable th) {
            if (!TextUtils.isEmpty(u55Var.getBizName())) {
                str = u55Var.getBizName();
            }
            lbq.c(str, "ParseModule.parseResponse", th);
            hav.a("ParseModule", "exception|" + str + "|parseComponents|error=" + th.getMessage());
            return false;
        }
    }

    public void w(u55 u55Var, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("201b66af", new Object[]{this, u55Var, jSONObject});
        } else if (jSONObject != null && u55Var != null) {
            if (!((u55Var.T("container") && !u55Var.N().isEmpty() && vav.a(u55Var.getBizName(), "ultronParseContainerUseCacheSwitch", true)) || (jSONObject2 = jSONObject.getJSONObject("container")) == null || (jSONArray = jSONObject2.getJSONArray("data")) == null)) {
                List<o58> h2 = u55Var.h();
                if (h2 == null) {
                    h2 = new ArrayList<>();
                    u55Var.G0(h2);
                }
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    if (jSONObject3 != null) {
                        a(h2, new o58(jSONObject3));
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("type");
                        if (jSONArray2 != null) {
                            int size2 = jSONArray2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                u55Var.N().put(jSONArray2.getString(i2), jSONObject3);
                            }
                        }
                    }
                }
            }
        }
    }

    public final DMComponent H(u55 u55Var, JSONObject jSONObject, String str, DMComponent dMComponent) {
        String[] g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DMComponent) ipChange.ipc$dispatch("c670f34c", new Object[]{this, u55Var, jSONObject, str, dMComponent});
        }
        if (jSONObject == null || dMComponent == null) {
            return null;
        }
        if (str != null && this.b && (g2 = g(str)) != null && g2.length == 2) {
            jSONObject.put("tag", (Object) g2[0]);
            jSONObject.put("id", (Object) g2[1]);
        }
        String string = jSONObject.getString("type");
        String k = k(u55Var, string);
        JSONObject j = j(u55Var, string);
        Map<String, List<gsb>> B = B(u55Var, jSONObject.getJSONObject("events"));
        dMComponent.onReload(u55Var, jSONObject);
        dMComponent.onReloadEvent(B);
        dMComponent.setContainerType(k);
        dMComponent.setContainerInfo(j);
        dMComponent.setComponentKey(str);
        if (vav.a(u55Var.getBizName(), "ultronReloadComponentClearExtMap", false)) {
            dMComponent.getExtMap().clear();
        }
        return dMComponent;
    }

    public DMComponent c(u55 u55Var, JSONObject jSONObject, String str) {
        String[] g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DMComponent) ipChange.ipc$dispatch("7e90a31b", new Object[]{this, u55Var, jSONObject, str});
        }
        if (jSONObject == null) {
            return null;
        }
        if (str != null && this.b && (g2 = g(str)) != null && g2.length == 2) {
            jSONObject.put("tag", (Object) g2[0]);
            jSONObject.put("id", (Object) g2[1]);
        }
        String string = jSONObject.getString("type");
        jSONObject.getString("tag");
        DMComponent dMComponent = new DMComponent(jSONObject, k(u55Var, string), j(u55Var, string), B(u55Var, jSONObject.getJSONObject("events")));
        dMComponent.setComponentKey(str);
        return dMComponent;
    }

    public final List<IDMComponent> t(u55 u55Var, JSONObject jSONObject) {
        String str;
        String[] g2;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dffcee1b", new Object[]{this, u55Var, jSONObject});
        }
        List<IDMComponent> components = u55Var.getComponents();
        Map<String, DMComponent> I = u55Var.I();
        if (jSONObject == null || I == null || I.size() == 0) {
            return null;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("data");
        if (jSONObject3 == null) {
            String bizName = u55Var.getBizName();
            ErrorConstants errorConstants = ErrorConstants.PROTOCOL_DATA_EMPTY;
            lbq.a(bizName, "AdjustResponseParse", errorConstants.errorCode(), errorConstants.errorMessage());
            return components;
        }
        x(u55Var, jSONObject3);
        T(u55Var, jSONObject3);
        for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObject4 = (JSONObject) entry.getValue();
            DMComponent dMComponent = I.get(key);
            if (dMComponent != null) {
                try {
                    String string = dMComponent.getFields().getString("cornerType");
                    if (!(TextUtils.isEmpty(string) || jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject("fields")) == null)) {
                        jSONObject2.put("cornerType", (Object) string);
                    }
                    if (key != null && this.b && (g2 = g(key)) != null && g2.length == 2) {
                        jSONObject4.put("tag", (Object) g2[0]);
                        jSONObject4.put("id", (Object) g2[1]);
                    }
                    dMComponent.onReload(u55Var, jSONObject4);
                    dMComponent.onReloadEvent(B(u55Var, jSONObject4.getJSONObject("events")));
                } catch (Throwable th) {
                    if (TextUtils.isEmpty(u55Var.getBizName())) {
                        str = "ultron";
                    } else {
                        str = u55Var.getBizName();
                    }
                    lbq.c(str, "parseAdjustResponseJson", th);
                }
            }
        }
        JSONObject jSONObject5 = jSONObject.getJSONObject("linkage");
        if (jSONObject5 != null) {
            for (Map.Entry<String, Object> entry2 : jSONObject5.entrySet()) {
                if ("common".equals(entry2.getKey())) {
                    JSONObject jSONObject6 = (JSONObject) entry2.getValue();
                    if (jSONObject6 != null) {
                        JSONObject o = u55Var.o();
                        if (o != null) {
                            for (Map.Entry<String, Object> entry3 : jSONObject6.entrySet()) {
                                o.put(entry3.getKey(), entry3.getValue());
                            }
                        } else {
                            u55Var.o0(jSONObject6);
                        }
                    }
                } else {
                    u55Var.C().put(entry2.getKey(), entry2.getValue());
                }
            }
        }
        d(u55Var);
        return components;
    }

    public final List<IDMComponent> y(u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7c57e03d", new Object[]{this, u55Var});
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = u55Var.A().getJSONArray("delta").iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) next;
                String string = jSONObject.getString("opType");
                String string2 = jSONObject.getString("target");
                String string3 = jSONObject.getString(a.MSG_SOURCE_PARENT);
                String string4 = jSONObject.getString("position");
                string.hashCode();
                char c = 65535;
                switch (string.hashCode()) {
                    case -1335458389:
                        if (string.equals("delete")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1183792455:
                        if (string.equals("insert")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1068795718:
                        if (string.equals("modify")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -934641255:
                        if (string.equals("reload")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1094496948:
                        if (string.equals("replace")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        e(u55Var, string, string2, string3, string4, arrayList);
                        continue;
                    case 1:
                        q(u55Var, string, string2, string3, string4, arrayList, false);
                        continue;
                    case 2:
                        s(u55Var, string2, jSONObject.getJSONArray("operations"), arrayList);
                        continue;
                    case 3:
                        I(u55Var, string, string2, string3, string4, arrayList);
                        continue;
                    case 4:
                        J(u55Var, string, string2, string3, string4, arrayList);
                        continue;
                }
            }
        }
        u55Var.t().addAll(arrayList);
        return u55Var.getComponents();
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.taobao.android.ultron.common.model.IDMComponent> C(tb.u55 r17, com.alibaba.fastjson.JSONObject r18) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.ultron.datamodel.imp.ParseModule.C(tb.u55, com.alibaba.fastjson.JSONObject):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.taobao.android.ultron.common.model.IDMComponent> D(tb.u55 r22, com.alibaba.fastjson.JSONObject r23, com.taobao.android.ultronx.engine.UltronEngine r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.ultron.datamodel.imp.ParseModule.D(tb.u55, com.alibaba.fastjson.JSONObject, com.taobao.android.ultronx.engine.UltronEngine, java.lang.String):java.util.List");
    }

    public final void s(u55 u55Var, String str, JSONArray jSONArray, List<rb4> list) {
        ArrayMap<String, Object> extMap;
        int i;
        JSONArray jSONArray2 = jSONArray;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d2d377", new Object[]{this, u55Var, str, jSONArray2, list});
        } else if (jSONArray2 == null || jSONArray.isEmpty()) {
            UnifyLog.m(u55Var.getBizName(), "ParseModule", "modify operations is null", new String[0]);
        } else {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) u55Var.o;
            DMComponent dMComponent = (DMComponent) concurrentHashMap.get(str);
            if (dMComponent == null) {
                UnifyLog.m(u55Var.getBizName(), "ParseModule", "local target component is null", new String[0]);
                String bizName = u55Var.getBizName();
                ErrorConstants errorConstants = ErrorConstants.PARSE_DELTA_TARGET_NULL;
                lbq.a(bizName, "ParseModule.modifyOp", errorConstants.errorCode(), errorConstants.errorMessage());
                return;
            }
            DMComponent b = b(dMComponent);
            if (b == null) {
                UnifyLog.m(u55Var.getBizName(), "ParseModule", "modify target component is null", new String[0]);
                return;
            }
            JSONObject jSONObject = u55Var.r().getJSONObject(str);
            if (jSONObject == null) {
                UnifyLog.m(u55Var.getBizName(), "ParseModule", "modify source component is null", new String[0]);
                return;
            }
            JSONObject data = b.getData();
            Pattern compile = Pattern.compile("[`${}]");
            int size = jSONArray.size();
            int i2 = 0;
            while (i2 < size) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                String string = jSONObject2.getString("type");
                String string2 = jSONObject2.getString("target");
                String string3 = jSONObject2.getString("source");
                if (!TextUtils.isEmpty(string)) {
                    if (TextUtils.isEmpty(string2)) {
                        compile = compile;
                        z = false;
                    } else if (!TextUtils.isEmpty(string3)) {
                        Matcher matcher = compile.matcher(string2);
                        Matcher matcher2 = compile.matcher(string3);
                        String trim = matcher.replaceAll("").trim();
                        String trim2 = matcher2.replaceAll("").trim();
                        compile = compile;
                        boolean z2 = trim.startsWith("fields") || trim.startsWith("events");
                        boolean z3 = trim2.startsWith("fields") || trim2.startsWith("events");
                        if (!z2 || !z3) {
                            z = false;
                            UnifyLog.m(u55Var.getBizName(), "ParseModule", "modify operations node path format is invalid ", new String[0]);
                        } else {
                            U(data, trim.split("\\."), E(jSONObject, trim2.split("\\.")), string);
                            i = 1;
                            z = false;
                            i2 += i;
                            jSONArray2 = jSONArray;
                        }
                    }
                    i = 1;
                    i2 += i;
                    jSONArray2 = jSONArray;
                }
                compile = compile;
                i = 1;
                z = false;
                i2 += i;
                jSONArray2 = jSONArray;
            }
            b.writeBackDataAndReloadEvent(data, z);
            u55Var.r().put(str, (Object) b.getData());
            DMComponent dMComponent2 = (DMComponent) dMComponent.getParent();
            if (dMComponent2 != null) {
                int indexOf = dMComponent2.getChildren().indexOf(dMComponent);
                if (indexOf == -1) {
                    UnifyLog.m(u55Var.getBizName(), "ParseModule", "target component index is -1", new String[0]);
                }
                dMComponent2.getChildren().remove(indexOf);
                dMComponent2.getChildren().add(indexOf, b);
                b.setParent(dMComponent2);
                ArrayMap<String, Object> extMap2 = dMComponent.getExtMap();
                if (!(extMap2 == null || (extMap = b.getExtMap()) == null)) {
                    for (Map.Entry<String, Object> entry : extMap2.entrySet()) {
                        extMap.put(entry.getKey(), entry.getValue());
                    }
                }
                String f = f(b, dMComponent2);
                String n = n(b, dMComponent2);
                L(b, f);
                M(b, n);
                o1o o1oVar = new o1o();
                o1oVar.c(b);
                o1oVar.e(dMComponent);
                o1oVar.d(indexOf);
                list.add(o1oVar);
                List<IDMComponent> components = u55Var.getComponents();
                int indexOf2 = components.indexOf(dMComponent);
                components.remove(indexOf2);
                components.add(indexOf2, b);
                concurrentHashMap.put(str, b);
            }
        }
    }

    public final void q(u55 u55Var, String str, String str2, String str3, String str4, List<rb4> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be4cb06", new Object[]{this, u55Var, str, str2, str3, str4, list, new Boolean(z)});
            return;
        }
        List<IDMComponent> components = u55Var.getComponents();
        Map<String, DMComponent> map = u55Var.o;
        DMComponent dMComponent = str4 != null ? (DMComponent) ((ConcurrentHashMap) map).get(str4) : null;
        JSONObject jSONObject = u55Var.r().getJSONObject(str2);
        if (jSONObject == null) {
            String bizName = u55Var.getBizName();
            ErrorConstants errorConstants = ErrorConstants.PARSE_DELTA_TARGET_NULL;
            lbq.a(bizName, "ParseModule.insertOp", errorConstants.errorCode(), errorConstants.errorMessage());
            return;
        }
        DMComponent c = c(u55Var, jSONObject, str2);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
        DMComponent dMComponent2 = (DMComponent) concurrentHashMap.get(str3);
        if (dMComponent2 == null) {
            String bizName2 = u55Var.getBizName();
            ErrorConstants errorConstants2 = ErrorConstants.PARSE_DELTA_PARENT_NULL;
            lbq.a(bizName2, "ParseModule.insertOp", errorConstants2.errorCode(), errorConstants2.errorMessage());
            return;
        }
        dMComponent2.getChildren().add((dMComponent != null ? dMComponent2.getChildren().indexOf(dMComponent) : -1) + 1, c);
        c.setParent(dMComponent2);
        String f = f(c, dMComponent2);
        String n = n(c, dMComponent2);
        L(c, f);
        M(c, n);
        if (!z) {
            fbf fbfVar = new fbf();
            fbfVar.c(new ArrayList<IDMComponent>(c) { // from class: com.taobao.android.ultron.datamodel.imp.ParseModule.1
                public final /* synthetic */ DMComponent val$insertComponent;

                {
                    this.val$insertComponent = c;
                    add(c);
                }
            });
            fbfVar.e(dMComponent);
            fbfVar.d(dMComponent2);
            list.add(fbfVar);
        }
        String str5 = "null";
        if (dMComponent != null) {
            IDMComponent m = m(dMComponent, components);
            if (m == null || components.indexOf(m) < 0) {
                String bizName3 = u55Var.getBizName();
                StringBuilder sb = new StringBuilder("lastRender is not in renderComponent, lastRender : ");
                if (m != null) {
                    str5 = m.getKey();
                }
                sb.append(str5);
                UnifyLog.m(bizName3, "ParseModule", "insertPosition isnot null", sb.toString());
            } else {
                components.add(components.indexOf(m) + 1, c);
            }
        } else {
            IDMComponent l = l(dMComponent2, components);
            if (l == null || components.indexOf(l) < 0) {
                String bizName4 = u55Var.getBizName();
                StringBuilder sb2 = new StringBuilder("firstRender : ");
                if (l != null) {
                    str5 = l.getKey();
                }
                sb2.append(str5);
                UnifyLog.m(bizName4, "ParseModule", "firstRender is not in renderComponent", sb2.toString());
            } else {
                components.add(components.indexOf(l), c);
            }
        }
        if (z && components.contains(dMComponent2)) {
            components.remove(dMComponent2);
        }
        concurrentHashMap.put(str2, c);
        if (u55Var.M() != null && u55Var.M().containsKey(str2)) {
            Iterator<Object> it = u55Var.M().getJSONArray(str2).iterator();
            String str6 = null;
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof String) {
                    String str7 = (String) next;
                    q(u55Var, str, str7, str2, str6, list, true);
                    str6 = str7;
                }
            }
        }
    }
}
