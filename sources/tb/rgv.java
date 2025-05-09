package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rgv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f27372a = new HashMap();
    public final Map<String, String> b = new HashMap();
    public String c;
    public boolean d;
    public long e;
    public boolean f;
    public JSONObject g;
    public List<String> h;

    static {
        t2o.a(157286914);
    }

    public static boolean b(String str) {
        List<String> i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbfdb3ba", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (i = i()) != null && !i.isEmpty()) {
            return i.contains(str);
        }
        return false;
    }

    public static List<String> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1f7a6fc0", new Object[0]);
        }
        String g = v9v.g(UltronTradeHybridSwitcherHelper.ORANGE_KEY_UNEXPECTED_REACH, "unexpectedReachBizList", "");
        if (TextUtils.isEmpty(g)) {
            return null;
        }
        try {
            return JSON.parseArray(g, String.class);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public boolean a(String str) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59866954", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (list = this.h) == null || list.isEmpty()) {
            return false;
        }
        return this.h.contains(str);
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab851b4e", new Object[]{this, str});
        } else {
            c("", str);
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487276aa", new Object[]{this, str});
        } else {
            c(str, "");
        }
    }

    public void f(View view, List<DXRootView> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eff2f8b7", new Object[]{this, view, list});
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    f(viewGroup.getChildAt(i), list);
                }
            }
        }
        if (view instanceof DXRootView) {
            DXRootView dXRootView = (DXRootView) view;
            if (!TextUtils.isEmpty(m(dXRootView))) {
                list.add(dXRootView);
            }
        }
    }

    public final String h(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bba2859e", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String g = v9v.g(UltronTradeHybridSwitcherHelper.ORANGE_KEY_UNEXPECTED_REACH, "unexpectedReachBizMap", "");
        if (TextUtils.isEmpty(g)) {
            return null;
        }
        try {
            JSONObject parseObject = JSON.parseObject(g);
            if (parseObject != null && !parseObject.isEmpty() && parseObject.containsKey("urlPath") && (jSONObject = parseObject.getJSONObject("urlPath")) != null && !jSONObject.isEmpty() && jSONObject.containsKey(str)) {
                return jSONObject.getString(str);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public final float l(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b5991aa", new Object[]{this, new Boolean(z), str})).floatValue();
        }
        String str2 = str + "_weex_container";
        if (z) {
            return v9v.d(str2, "unexpectedReachSamplingInSuccess", 0.01f);
        }
        return v9v.d(str2, "unexpectedReachSampling", 1.0f);
    }

    public String m(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee18a8b4", new Object[]{this, dXRootView});
        }
        if (dXRootView == null || dXRootView.getData() == null) {
            return "";
        }
        String string = dXRootView.getData().getString("tag");
        return TextUtils.isEmpty(string) ? "" : string;
    }

    public final float n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19984e29", new Object[]{this, str})).floatValue();
        }
        return v9v.d(str + "_weex_container", "unexpectedReachMonitorGap", 0.0f);
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a21a29a0", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd7d1c2", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1551b71f", new Object[]{this});
            return;
        }
        this.e = System.currentTimeMillis();
        this.f = false;
        this.d = false;
        this.c = "";
        ((HashMap) this.f27372a).clear();
        ((HashMap) this.b).clear();
        this.h = i();
    }

    public void r(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("764ddc6f", new Object[]{this, jSONObject});
        } else {
            this.g = jSONObject;
        }
    }

    public void s(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292cdc00", new Object[]{this, str, str2});
        } else if (str != null && str2 != null) {
            ((HashMap) this.b).put(str, str2);
        }
    }

    public void t(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2d8fa9", new Object[]{this, str, str2});
        } else if (str != null && str2 != null) {
            ((HashMap) this.f27372a).put(str, str2);
        }
    }

    public final void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2337471a", new Object[]{this, str, str2});
        } else if (this.f) {
            hav.g("unexpectedReachMonitor", "endMonitor:", "has submitted");
        } else {
            this.f = true;
            if (TextUtils.isEmpty(str)) {
                str = k(str2);
                if (TextUtils.isEmpty(str)) {
                    hav.g("unexpectedReachMonitor", "endMonitor:", "pageUrl is null");
                    return;
                }
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = g(str);
                if (TextUtils.isEmpty(str2)) {
                    hav.g("unexpectedReachMonitor", "endMonitor:", "bizName is null");
                    return;
                }
            }
            if (!a(str2)) {
                hav.g("unexpectedReachMonitor", "endMonitor:", "not hit orange");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.e;
            if (((float) currentTimeMillis) >= n(str2)) {
                String str3 = "容器非预期触达";
                if (!this.d) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("url", str);
                    StringBuilder sb = new StringBuilder(str3);
                    sb.append(TextUtils.isEmpty(this.c) ? str3 : this.c);
                    hashMap.put("message", sb.toString());
                    hav.g("unexpectedReachMonitor", "endMonitor:", "UnexpectedReach!!! bizName is " + str2 + ", args " + hashMap);
                }
                HashMap hashMap2 = new HashMap();
                Object obj = this.g;
                if (obj == null) {
                    obj = "no preRenderData";
                }
                hashMap2.put("preRenderData", obj);
                hashMap2.put("url", str);
                hav.g("unexpectedReachMonitor", "endMonitor:", "args are " + hashMap2);
                h15 create = h15.create(str, "tradeContainerUnexpectedReach", "28927-tracker", "");
                create.success(this.d);
                if (this.d) {
                    str3 = "渲染完成";
                } else if (!TextUtils.isEmpty(this.c)) {
                    str3 = this.c;
                }
                create.message(str3);
                create.indicator("c1", String.valueOf(currentTimeMillis));
                create.sampling(cw6.b() ? 1.0f : l(this.d, str2));
                Map<String, String> map = this.f27372a;
                if (map != null && !((HashMap) map).isEmpty()) {
                    for (Map.Entry entry : ((HashMap) this.f27372a).entrySet()) {
                        create.indicator((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                Map<String, String> map2 = this.b;
                if (map2 != null && !((HashMap) map2).isEmpty()) {
                    for (Map.Entry entry2 : ((HashMap) this.b).entrySet()) {
                        create.dimension((String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
                if (!this.d && create.getIndicators() != null) {
                    hav.g("unexpectedReachMonitor", "endMonitor:", "indicatiorMap: " + create.getIndicators().toString());
                }
                f9v.p(create);
                if (!this.d && v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_UNEXPECTED_REACH, "enableReportUnexpectedReachTLog", false)) {
                    nzb.b().c("trade_container_unexpected_reach", null);
                    hav.d("unexpectedReachMonitor", "report miniTLog");
                }
            }
        }
    }

    public final String g(String str) {
        char c = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0c8f3bf", new Object[]{this, str});
        }
        try {
            URI uri = new URI(str);
            String path = uri.getPath();
            switch (path.hashCode()) {
                case -1727974879:
                    if (path.equals("/app/tb-trade/supercart/cart")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1708462848:
                    if (path.equals("/app/mtb/taobao-ugc/ask/list")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -1379086885:
                    if (path.equals("/app/tb-trade/odetail/home")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -888062291:
                    if (path.equals("/app/mtb/app-success-new/success")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -887026106:
                    if (path.equals("/wow/z/app/mtb/refund-project/detail")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 579613507:
                    if (path.equals("/app/mtb/pay-success-v2/confirm-success")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1601597570:
                    if (path.equals("/app/mtb/logisticsV2/detail")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1753068588:
                    if (path.equals("/app/tb-trade/light-buy/home")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1791660962:
                    if (path.equals("/app/mtb/taobao-ugc/rate/home")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 2124169781:
                    if (path.equals("/app/mtb/pay-success-v3/simple-pay-success")) {
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    return ae2.BizKeyPaysuccess;
                case 2:
                    return "supercart";
                case 3:
                    return "confirmsuccess";
                case 4:
                    return ae2.BizKeyOrderDetail;
                case 5:
                    return "logisticsDetail";
                case 6:
                    return "lightbuy";
                case 7:
                    return ae2.BizKeyRefundDetail;
                case '\b':
                    return "rate";
                case '\t':
                    return "askList";
                default:
                    if (!TextUtils.equals(uri.getHost(), "go") || !TextUtils.equals(uri.getScheme(), "taobao") || !TextUtils.equals(uri.getPath(), "/alipay")) {
                        return h(path);
                    }
                    return "alipay";
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r8.equals("cart") == false) goto L_0x0053;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<java.lang.String> j(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.rgv.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "19e82929"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            java.lang.Object r8 = r3.ipc$dispatch(r4, r2)
            java.util.List r8 = (java.util.List) r8
            return r8
        L_0x0018:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r4 = "_weex_container"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "nativeComponentBlacklist"
            java.lang.String r5 = ""
            java.lang.String r3 = tb.v9v.g(r3, r4, r5)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r5 = 0
            if (r4 != 0) goto L_0x0045
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.util.List r8 = com.alibaba.fastjson.JSON.parseArray(r3, r8)     // Catch: all -> 0x0040
            return r8
        L_0x0040:
            r8 = move-exception
            r8.printStackTrace()
            return r5
        L_0x0045:
            r8.hashCode()
            java.lang.String r3 = "item"
            r4 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -391817972: goto L_0x006a;
                case 3046176: goto L_0x0061;
                case 1743324417: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            r0 = -1
            goto L_0x0075
        L_0x0055:
            java.lang.String r0 = "purchase"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x005f
            goto L_0x0053
        L_0x005f:
            r0 = 2
            goto L_0x0075
        L_0x0061:
            java.lang.String r1 = "cart"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x0075
            goto L_0x0053
        L_0x006a:
            java.lang.String r0 = "orderList"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0074
            goto L_0x0053
        L_0x0074:
            r0 = 0
        L_0x0075:
            switch(r0) {
                case 0: goto L_0x0097;
                case 1: goto L_0x0089;
                case 2: goto L_0x0079;
                default: goto L_0x0078;
            }
        L_0x0078:
            return r5
        L_0x0079:
            java.lang.String r8 = "itemInfo_"
            java.lang.String r0 = "footer"
            java.lang.String r1 = "address"
            java.lang.String[] r8 = new java.lang.String[]{r1, r8, r0}
            java.util.List r8 = java.util.Arrays.asList(r8)
            return r8
        L_0x0089:
            java.lang.String r8 = "header"
            java.lang.String r0 = "submit"
            java.lang.String[] r8 = new java.lang.String[]{r3, r8, r0}
            java.util.List r8 = java.util.Arrays.asList(r8)
            return r8
        L_0x0097:
            java.lang.String r8 = "tab3"
            java.lang.String r0 = "orderop"
            java.lang.String r1 = "query3"
            java.lang.String[] r8 = new java.lang.String[]{r1, r8, r3, r0}
            java.util.List r8 = java.util.Arrays.asList(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rgv.j(java.lang.String):java.util.List");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r6.equals("cart") == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String k(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.rgv.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "dc9582bd"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L_0x0018:
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -391817972: goto L_0x003a;
                case 3046176: goto L_0x0031;
                case 1743324417: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x0045
        L_0x0025:
            java.lang.String r0 = "purchase"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x002f
            goto L_0x0023
        L_0x002f:
            r0 = 2
            goto L_0x0045
        L_0x0031:
            java.lang.String r1 = "cart"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0045
            goto L_0x0023
        L_0x003a:
            java.lang.String r0 = "orderList"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0044
            goto L_0x0023
        L_0x0044:
            r0 = 0
        L_0x0045:
            switch(r0) {
                case 0: goto L_0x0051;
                case 1: goto L_0x004e;
                case 2: goto L_0x004b;
                default: goto L_0x0048;
            }
        L_0x0048:
            java.lang.String r6 = ""
            return r6
        L_0x004b:
            java.lang.String r6 = "http://taobao.com/jstracker/android/tbbuy.html"
            return r6
        L_0x004e:
            java.lang.String r6 = "http://taobao.com/jstracker/android/cart.html"
            return r6
        L_0x0051:
            java.lang.String r6 = "http://taobao.com/jstracker/android/orderlist.html"
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rgv.k(java.lang.String):java.lang.String");
    }
}
