package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tracker.page.page.data.AttrArg;
import com.taobao.android.tracker.page.page.data.ConfData;
import com.taobao.android.tracker.page.page.data.Intercepts;
import com.taobao.android.tracker.page.page.data.Point;
import com.taobao.android.tracker.util.TrackerType;
import com.taobao.weex.dom.WXAttr;
import com.taobao.weex.ui.component.WXComponent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bll {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public je8 f16467a;
    public String b;
    public String c;
    public boolean d;
    public String f;
    public String l;
    public String m;
    public String n;
    public boolean e = false;
    public final Map<String, Point> g = new HashMap();
    public final Map<String, Point> h = new HashMap();
    public final Map<String, Map<String, Point>> i = new HashMap();
    public final Map<String[], Point> j = new HashMap();
    public final Map<String[], Map<String[], Point>> k = new HashMap();
    public boolean o = true;
    public boolean p = false;
    public boolean q = false;

    static {
        t2o.a(455082024);
    }

    public String A(Point point, String str, View view) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30376834", new Object[]{this, point, str, view});
        }
        if (point == null) {
            str2 = null;
        } else if (!TextUtils.isEmpty(point.getArg1())) {
            str2 = point.getArg1();
        } else if (!TextUtils.isEmpty(point.getLogkey())) {
            str2 = point.getLogkey();
        } else {
            str2 = j();
        }
        if (TextUtils.isEmpty(str2)) {
            return ydq.b(f(), g(point, str), l(point, view), "");
        }
        return str2;
    }

    public final Map<String, String> B(List<AttrArg> list, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f60b9804", new Object[]{this, list, view});
        }
        HashMap hashMap = new HashMap();
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AttrArg attrArg = list.get(i);
                if (attrArg != null) {
                    String c = c(view, attrArg);
                    String commitKey = attrArg.getCommitKey();
                    if (!TextUtils.isEmpty(commitKey) && !TextUtils.isEmpty(c)) {
                        hashMap.put(commitKey, c);
                    }
                }
            }
        }
        return hashMap;
    }

    public final Map<String, String> C(Point point, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("daa39f3e", new Object[]{this, point, view});
        }
        return B(point.getAttrArgs(), view);
    }

    public final Map<String, String> D(Point point, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("84b10ab9", new Object[]{this, point, view});
        }
        return B(point.getClickAttrArgs(), view);
    }

    public Map<String, String> E(Point point) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b9c565de", new Object[]{this, point});
        }
        return x22.f(point.getCustomArgs());
    }

    public final Map<String, String> F(Point point, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b465cbd4", new Object[]{this, point, view});
        }
        return B(point.getExpourseAttrArgs(), view);
    }

    public final Map<String, String> G(Point point, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("87adcf3b", new Object[]{this, point, view});
        }
        return B(point.getJumpAttrArgs(), view);
    }

    public String H(Point point, String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("636ecb67", new Object[]{this, point, str, view});
        }
        if (point != null) {
            return A(point, str, view);
        }
        return null;
    }

    public void I(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac0e40a", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public void J(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2312e08e", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    public void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca4526e", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void M(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a57f82", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public void N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2cbc264", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void O(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cfd5ba5", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final Point P(View view, String[] strArr, String str, Map<String[], Map<String[], Point>> map) {
        String[] strArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("d3df17f4", new Object[]{this, view, strArr, str, map});
        }
        if (!(strArr == null || TextUtils.isEmpty(str) || map == null)) {
            WXComponent j = e9x.j(view);
            Map map2 = (Map) o(strArr, map);
            if (!(map2 == null || map2.size() == 0)) {
                Point point = null;
                while (j != null) {
                    WXAttr d = e9x.d(j);
                    if (d != null) {
                        strArr2 = W(e9x.g(d, str), " ");
                    } else {
                        strArr2 = null;
                    }
                    if (strArr2 != null) {
                        point = (Point) o(strArr2, map2);
                        if (point != null) {
                            break;
                        }
                        j = j.getParent();
                    } else {
                        j = j.getParent();
                    }
                }
                return point;
            }
        }
        return null;
    }

    public final Point Q(View view, String str, String str2, Map<String, Map<String, Point>> map) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("bda7fe27", new Object[]{this, view, str, str2, map});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || map == null) {
            return null;
        }
        Map<String, Point> map2 = map.get(str);
        if (map2 == null || map2.size() == 0) {
            return null;
        }
        for (WXComponent j = e9x.j(view); j != null; j = j.getParent()) {
            WXAttr d = e9x.d(j);
            if (d != null) {
                str3 = e9x.g(d, str2);
            } else {
                str3 = null;
            }
            if (!TextUtils.isEmpty(str3) && map2.containsKey(str3)) {
                return map2.get(str3);
            }
        }
        return null;
    }

    public void R(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f52c69a", new Object[]{this, str});
            return;
        }
        ConfData confData = (ConfData) x22.g(str, ConfData.class);
        if (confData != null) {
            s(confData.getIntercept());
            t(confData.getRule());
            this.e = true;
        }
    }

    public void S(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c48c8", new Object[]{this, map});
        } else if (map != null) {
            if (map.containsKey("url")) {
                String str = map.get("url");
                if (!TextUtils.isEmpty(str)) {
                    x22.c(str);
                }
            }
            if (map.containsKey("pageName")) {
                this.n = map.get("pageName");
            }
            if (map.containsKey(o65.SPM_A)) {
                this.l = map.get(o65.SPM_A);
            }
            if (map.containsKey(o65.SPM_B)) {
                this.m = map.get(o65.SPM_B);
            }
        }
    }

    public final void T(Intercepts intercepts) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b2e2119", new Object[]{this, intercepts});
        } else if (intercepts != null) {
            N(intercepts.getSpmA());
            O(intercepts.getSpmB());
            J(intercepts.getEnableMatchKey());
            I(intercepts.getEnableMatchKey());
            V(intercepts.getPoints());
            K(intercepts.getEnabled());
            L(intercepts.getLogkey());
            M(intercepts.isNeedExposureBackView());
        }
    }

    public final void U(Point point) {
        String[] W;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c3e8bf0", new Object[]{this, point});
        } else if (point != null) {
            String[] W2 = W(point.getSelector(), ":");
            if (W2 != null && W2.length > 0) {
                if (W2.length > 1) {
                    if (!TextUtils.isEmpty(W2[0]) && !TextUtils.isEmpty(W2[1])) {
                        if (((HashMap) this.i).get(W2[1]) != null) {
                            ((Map) ((HashMap) this.i).get(W2[1])).put(W2[0], point);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put(W2[0], point);
                            ((HashMap) this.i).put(W2[1], hashMap);
                        }
                    }
                } else if (!TextUtils.isEmpty(W2[0])) {
                    ((HashMap) this.h).put(W2[0], point);
                }
            }
            o65 g = p58.m().g();
            if (g != null && g.d() && this.p) {
                String selector = point.getSelector();
                if (!TextUtils.isEmpty(selector)) {
                    if (selector.startsWith("#") && selector.length() > 1) {
                        ((HashMap) this.g).put(selector, point);
                    } else if (selector.startsWith(".") && selector.length() > 1 && (W = W(selector, " ")) != null && W.length != 0) {
                        if (W.length > 1) {
                            String[] a2 = a(W(W[0], "\\."));
                            String[] a3 = a(W(W[1], "\\."));
                            if (a3 != null && a2 != null) {
                                Map p = p(a3, this.k);
                                if (p != null) {
                                    p.put(a2, point);
                                    return;
                                }
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put(a2, point);
                                ((HashMap) this.k).put(a3, hashMap2);
                                return;
                            }
                            return;
                        }
                        String[] a4 = a(W(W[0], "\\."));
                        if (a4 != null) {
                            ((HashMap) this.j).put(a4, point);
                        }
                    }
                }
            }
        }
    }

    public final void V(List<Point> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7e2c84", new Object[]{this, list});
        } else if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Point point = list.get(i);
                if (point != null) {
                    U(point);
                }
            }
        }
    }

    public final String[] W(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("6b4d30d7", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return str.split(str2);
    }

    public final String[] a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("da87f512", new Object[]{this, strArr});
        }
        if (strArr == null || strArr.length < 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < strArr.length; i++) {
            if (!TextUtils.isEmpty(strArr[i])) {
                arrayList.add("." + strArr[i]);
            }
        }
        if (arrayList.size() < 1) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final boolean b(String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82f1fb32", new Object[]{this, strArr, str})).booleanValue();
        }
        if (strArr != null && !TextUtils.isEmpty(str)) {
            for (String str2 : strArr) {
                if (("." + str2).equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String c(View view, AttrArg attrArg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2cae98a", new Object[]{this, view, attrArg});
        }
        if (attrArg != null) {
            return e9x.h(view, attrArg.getAttrName(), attrArg.isRecursive());
        }
        return null;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b448b0fe", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    public String e(Point point) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6dab8145", new Object[]{this, point});
        }
        String i = i();
        if (!TextUtils.isEmpty(i)) {
            return i;
        }
        if (point == null || TextUtils.isEmpty(point.getPageName())) {
            return i;
        }
        return point.getPageName();
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e8adad8", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.l)) {
            return this.l;
        }
        return this.b;
    }

    public String g(Point point, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9753c53", new Object[]{this, point, str});
        }
        if (!TextUtils.isEmpty(this.m)) {
            return this.m;
        }
        if (point == null || TextUtils.isEmpty(point.getSpmB())) {
            return this.c;
        }
        return point.getSpmB();
    }

    public final String h(Point point, View view) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86df13af", new Object[]{this, point, view});
        }
        if (point != null) {
            str = point.getSpmD();
        } else {
            str = null;
        }
        String h = e9x.h(view, "index", true);
        if (TextUtils.isEmpty(h)) {
            h = e9x.h(view, e9x.ATTR_KEY_DATA_POINT_INDEX, true);
        }
        return ydq.a(str, h);
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4ad9166", new Object[]{this});
        }
        return this.n;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98291c08", new Object[]{this});
        }
        return this.f;
    }

    public final Point k(View view, TrackerType trackerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("2787bc8e", new Object[]{this, view, trackerType});
        }
        if (view == null) {
            return null;
        }
        while (view != null) {
            Point q = q(view, trackerType);
            if (q != null && ecu.a(trackerType, q.getTrackerType())) {
                return q;
            }
            view = e9x.f(view);
        }
        return null;
    }

    public String l(Point point, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcffc90a", new Object[]{this, point, view});
        }
        if (point == null || TextUtils.isEmpty(point.getSpmC())) {
            return e9x.b(view, e9x.ATTR_KEY_DATA_SPM);
        }
        return point.getSpmC();
    }

    public final acu m(View view, String str, TrackerType trackerType) {
        Point point;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (acu) ipChange.ipc$dispatch("d64b2145", new Object[]{this, view, str, trackerType});
        }
        acu acuVar = null;
        if (trackerType == null || trackerType != TrackerType.TrackerType_Click) {
            point = (trackerType == null || trackerType != TrackerType.TrackerType_Exposure) ? null : q(view, trackerType);
        } else {
            point = k(view, trackerType);
        }
        if (point != null) {
            acuVar = new acu();
            acuVar.f = H(point, str, view);
            acuVar.f15667a = f();
            acuVar.b = g(point, str);
            acuVar.c = l(point, view);
            acuVar.d = h(point, view);
            acuVar.e = e(point);
            acuVar.k = point.getTrackerType();
            Map<String, String> D = D(point, view);
            Map<String, String> G = G(point, view);
            Map<String, String> F = F(point, view);
            acuVar.h = D;
            acuVar.i = G;
            acuVar.j = F;
            HashMap hashMap = new HashMap();
            Map<String, String> C = C(point, view);
            Map<String, String> E = E(point);
            if (E != null) {
                hashMap.putAll(E);
            }
            if (C != null) {
                hashMap.putAll(C);
            }
            if (trackerType == null || trackerType != TrackerType.TrackerType_Click || TextUtils.isEmpty(point.getJumpSpmKey())) {
                str2 = "spm";
            } else {
                str2 = point.getJumpSpmKey();
            }
            String c = ydq.c(acuVar);
            if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(str2)) {
                hashMap.put(str2, c);
            }
            acuVar.g = hashMap;
        }
        return acuVar;
    }

    public acu n(View view, String str, TrackerType trackerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (acu) ipChange.ipc$dispatch("3e1e48bb", new Object[]{this, view, str, trackerType});
        }
        return m(view, str, trackerType);
    }

    public final Object o(String[] strArr, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d7825d9f", new Object[]{this, strArr, map});
        }
        Object obj = null;
        if (!(strArr == null || map == null)) {
            for (Map.Entry entry : map.entrySet()) {
                String[] strArr2 = (String[]) entry.getKey();
                int i = 0;
                for (int i2 = 0; i2 < strArr2.length && b(strArr, strArr2[i2]); i2++) {
                    i++;
                }
                if (i == strArr2.length) {
                    obj = entry.getValue();
                }
            }
        }
        return obj;
    }

    public final Map p(String[] strArr, Map<String[], Map<String[], Point>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("604ef659", new Object[]{this, strArr, map});
        }
        if (!(strArr == null || strArr.length == 0 || map == null || map.size() == 0)) {
            Iterator<Map.Entry<String[], Map<String[], Point>>> it = map.entrySet().iterator();
            while (it != null && it.hasNext()) {
                Map.Entry<String[], Map<String[], Point>> next = it.next();
                String[] key = next.getKey();
                if (key != null && key.length > 0 && Arrays.equals(key, strArr)) {
                    return next.getValue();
                }
            }
        }
        return null;
    }

    public final Point q(View view, TrackerType trackerType) {
        Point point;
        Point point2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("a16c7d6c", new Object[]{this, view, trackerType});
        }
        if (view == null) {
            return null;
        }
        String i = e9x.i(view, e9x.ATTR_KEY_DATA_TRACKER);
        if (!TextUtils.isEmpty(i) && (point2 = (Point) ((HashMap) this.h).get(i)) != null && ecu.a(trackerType, point2.getTrackerType())) {
            return point2;
        }
        Point Q = Q(view, i, e9x.ATTR_KEY_DATA_TRACKER, this.i);
        if (Q != null && ecu.a(trackerType, Q.getTrackerType())) {
            return Q;
        }
        Object tag = view.getTag(o65.TAG_DYNAMIC_TRACKER_VIEW_ENABLE_MATCH_KEY);
        if ((tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            String i2 = e9x.i(view, "id");
            if (!TextUtils.isEmpty(i2)) {
                Map<String, Point> map = this.g;
                Point point3 = (Point) ((HashMap) map).get("#" + i2);
                if (point3 != null && ecu.a(trackerType, point3.getTrackerType())) {
                    return point3;
                }
            }
            String[] W = W(e9x.i(view, "class"), " ");
            if (W != null && (point = (Point) o(W, this.j)) != null && ecu.a(trackerType, point.getTrackerType())) {
                return point;
            }
            Q = P(view, W, "class", this.k);
            if (Q == null || ecu.a(trackerType, Q.getTrackerType())) {
            }
        }
        return Q;
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            u();
        }
    }

    public final void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db5a6ea3", new Object[]{this, str});
        } else {
            T((Intercepts) x22.g(str, Intercepts.class));
        }
    }

    public final void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3462f9bd", new Object[]{this, str});
        } else {
            z(str);
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4542502", new Object[]{this});
        } else if (this.f16467a == null) {
            je8 je8Var = new je8();
            this.f16467a = je8Var;
            je8Var.a();
        }
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f924eec7", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49fe7046", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37225e5e", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public final void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a4b522", new Object[]{this, str});
            return;
        }
        je8 je8Var = this.f16467a;
        if (je8Var != null) {
            je8Var.b(str);
        }
    }
}
