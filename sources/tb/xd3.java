package tb;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.uc.webview.export.extension.UCClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import tb.ub3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xd3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUY_PARAM = "buyParam";
    public static final String CARTIDS = "cartIds";
    public static final String NAV_URL_PURCHASE = "http://h5.m.taobao.com/awp/base/buy.htm";
    public static final String PURCHASE_FROM = "purchase_from";
    public static final int PURCHASE_FROM_CART = 1;
    public static final int REQUEST_CODE_TO_ORDER = 101;
    public static final int REQUEST_CODE_TO_ORDER_H5 = 102;
    public boolean l;
    public String m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ lcu f31317a;
        public final /* synthetic */ String b;

        public a(lcu lcuVar, String str) {
            this.f31317a = lcuVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                fdv.d(this.f31317a);
                xd3.p(xd3.this, this.f31317a, this.b);
                TBS.Adv.ctrlClickedOnPage(xd3.q(xd3.this).W().o(), CT.Button, "Pay");
            } catch (Throwable th) {
                ub3.g("AsyncChargeTrackException", th.toString());
            }
        }
    }

    static {
        t2o.a(479199427);
    }

    public static /* synthetic */ Object ipc$super(xd3 xd3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartSubmitSubscriber");
    }

    public static /* synthetic */ void p(xd3 xd3Var, lcu lcuVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3ac48b", new Object[]{xd3Var, lcuVar, str});
        } else {
            xd3Var.t(lcuVar, str);
        }
    }

    public static /* synthetic */ kmb q(xd3 xd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("2bf98d74", new Object[]{xd3Var});
        }
        return xd3Var.j;
    }

    public final void A(String str, String str2, String str3, z0n z0nVar, String str4, long j) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21fa38d", new Object[]{this, str, str2, str3, z0nVar, str4, new Long(j)});
        } else if (this.b != null) {
            Bundle s = s(str, str2, str3, str4, j);
            if (this.l) {
                str5 = "http://h5.m.taobao.com/awp/base/buy.htm?pageType=float&openFrom=carts";
            } else {
                str5 = "http://h5.m.taobao.com/awp/base/buy.htm";
            }
            z0nVar.b(this.e, str5, REQUEST_CODE_TO_ORDER, s, false);
            UmbrellaTracker.traceProcessEnd("clickSubmitError", "submit", "1.0");
        }
    }

    public final String B(String str, String str2, String str3, z0n z0nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aec85016", new Object[]{this, str, str2, str3, z0nVar});
        }
        if (this.b == null) {
            return "context_is_null";
        }
        return z0nVar.c(this.e, s(str, str2, str3, null, -1L));
    }

    public final b D(List<IDMComponent> list) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f4bdfa4b", new Object[]{this, list});
        }
        b bVar = new b(null);
        bVar.f(false);
        CartGlobal w = this.k.w();
        if (w == null) {
            return bVar;
        }
        CartGlobal.ControlParas controlParas = w.getControlParas();
        if (!(controlParas == null || (controlParas.getOrderByH5Urls() == null && controlParas.getOrderByNative() == null))) {
            HashSet hashSet = new HashSet();
            if (list == null) {
                return bVar;
            }
            Iterator<IDMComponent> it = list.iterator();
            b bVar2 = null;
            while (true) {
                if (it.hasNext()) {
                    IDMComponent next = it.next();
                    if (next != null) {
                        String str = (String) cb4.x(next, String.class, "exclude");
                        if (!TextUtils.isEmpty(str)) {
                            String w2 = w(str, controlParas);
                            String e = zuq.e(str, controlParas);
                            b bVar3 = new b(null);
                            bVar3.f(false);
                            if (!(w2 == null && e == null)) {
                                bVar3.f(true);
                                bVar3.d(e);
                                bVar3.e(w2);
                                bVar2 = bVar3;
                            }
                            if (hashSet.size() > 0 && !hashSet.contains(bVar3)) {
                                z = false;
                                break;
                            }
                            hashSet.add(bVar3);
                        } else {
                            continue;
                        }
                    }
                } else {
                    break;
                }
            }
            if (z) {
                if (bVar2 == null) {
                    return bVar;
                }
                return bVar2;
            }
        }
        return bVar;
    }

    public final void t(lcu lcuVar, String str) {
        List<IDMComponent> list;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645bd6bd", new Object[]{this, lcuVar, str});
        } else if (lcuVar != null && (list = (List) lcuVar.c()) != null && list.size() > 0) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            for (IDMComponent iDMComponent : list) {
                if (iDMComponent.getFields() != null) {
                    String string = iDMComponent.getFields().getString("bizCode");
                    if (!TextUtils.isEmpty(string) && !arrayList.contains(string)) {
                        arrayList.add(string);
                        sb.append(string);
                        sb.append(",");
                    }
                }
            }
            if (lcuVar.a() == null || lcuVar.a().getFields() == null) {
                str2 = "";
            } else {
                str2 = lcuVar.a().getFields().getString("isChecked");
            }
            juv.b(this.j, "Page_ShoppingCart_Button-Pay", "selectedBizCode=" + sb.toString(), "isSelectAll=" + str2, "item=" + str);
        }
    }

    public final HashMap<String, Object> u(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("16a33b2b", new Object[]{this, str, str2, str3});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        if (zuq.f(this.d)) {
            hashMap.put("buyParam", str);
            hashMap.put("isSettlementAlone", "true");
        } else {
            hashMap.put("cartIds", str2);
        }
        if (str3 != null) {
            hashMap.put("exParams", "{\"novad\":\"" + str3 + "\"}");
        }
        r(hashMap);
        return hashMap;
    }

    public final String v(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88b9d524", new Object[]{this, iDMComponent});
        }
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return "";
        }
        return iDMComponent.getFields().getString("cartId");
    }

    public final String w(String str, CartGlobal.ControlParas controlParas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e012d0f", new Object[]{this, str, controlParas});
        }
        JSONObject orderByH5Urls = controlParas.getOrderByH5Urls();
        if (orderByH5Urls != null) {
            return orderByH5Urls.getString(str);
        }
        return null;
    }

    public final String x(lcu lcuVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15cfbc89", new Object[]{this, lcuVar});
        }
        JSONObject jSONObject2 = (JSONObject) lcuVar.e("eventFields");
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject(h9.KEY_POP_CONFIG)) == null) {
            return null;
        }
        return jSONObject.toJSONString();
    }

    public final String y(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7dc6dd72", new Object[]{this, iDMComponent});
        }
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return "";
        }
        return iDMComponent.getFields().getString("settlement");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f31318a;
        public String b;
        public String c;

        static {
            t2o.a(479199429);
        }

        public b() {
            this.f31318a = true;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e903c9b3", new Object[]{this});
            }
            return this.b;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("71b2ca8f", new Object[]{this});
            }
            return this.c;
        }

        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
            }
            return this.f31318a;
        }

        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c154e8b", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b900ec7", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (c() != bVar.c()) {
                return false;
            }
            if (a() == null && bVar.a() == null) {
                if (b() == null && bVar.b() == null) {
                    return true;
                }
                if (b() == null || bVar.b() == null) {
                    return false;
                }
                return b().equals(bVar.b());
            } else if (a() == null || bVar.a() == null) {
                return false;
            } else {
                return a().equals(bVar.a());
            }
        }

        public void f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d88968c", new Object[]{this, new Boolean(z)});
            } else {
                this.f31318a = z;
            }
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return 1 ^ (this.f31318a ? 1 : 0);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public final Bundle s(String str, String str2, String str3, String str4, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("6c6b7a17", new Object[]{this, str, str2, str3, str4, new Long(j)});
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("buildOrderParams", u(str, str2, str3));
        bundle.putInt("purchase_from", 1);
        if (j != -1) {
            bundle.putLong("START_CLICK_TIME", j);
        }
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("PRELOAD", str4);
        }
        if (this.l) {
            bundle.putString("pageType", "float");
            bundle.putString("openFrom", "carts");
        }
        if (!TextUtils.isEmpty(this.m)) {
            bundle.putString(h9.KEY_POP_CONFIG, this.m);
        }
        return bundle;
    }

    public final String C(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa3dd0b4", new Object[]{this, list});
        }
        if (list == null) {
            return "toChargeList_is_null";
        }
        String str = "";
        String str2 = str;
        for (IDMComponent iDMComponent : list) {
            str2 = str2 + v(iDMComponent) + ",";
            str = str + y(iDMComponent) + ",";
        }
        String substring = str.substring(0, str.length() - 1);
        String substring2 = str2.substring(0, str2.length() - 1);
        b D = D(list);
        String a2 = D.a();
        if (!D.c() || a2 != null) {
            return B(substring, substring2, a2, new z0n(this.j));
        }
        return "order_buy_h5";
    }

    public final void r(HashMap<String, Object> hashMap) {
        JSONObject jSONObject;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf3885c", new Object[]{this, hashMap});
        } else if (hashMap != null) {
            Object obj = hashMap.get("exParams");
            if (obj instanceof String) {
                jSONObject = JSON.parseObject((String) obj);
            } else {
                jSONObject = new JSONObject();
            }
            boolean d = this.j.Y().d();
            IDMComponent iDMComponent = this.e;
            if (iDMComponent == null || iDMComponent.getFields() == null || !this.e.getFields().getBooleanValue("isHideCalculateBtn")) {
                z = false;
            }
            JSONObject m = sca.m(this.k);
            if (d) {
                jSONObject.put("cartIsLoading", (Object) Boolean.valueOf(d));
            }
            if (z) {
                jSONObject.put("cartIsLocalCalculate", (Object) Boolean.valueOf(z));
            }
            if (!(m == null || m.getString("traceId") == null)) {
                jSONObject.put("cartTraceId", (Object) m.getString("traceId"));
            }
            JSONObject c = sca.c(this.k);
            if (c != null) {
                jSONObject.putAll(c);
            }
            hashMap.put("exParams", jSONObject.toJSONString());
        }
    }

    public final boolean z(lcu lcuVar, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a69ee23", new Object[]{this, lcuVar, list})).booleanValue();
        }
        if (!"onActionDown".equals(lcuVar.e(UCClient.UI_PARAMS_KEY_GESTURE))) {
            return false;
        }
        "true".equals(C(list));
        return true;
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        List<IDMComponent> list = (List) lcuVar.c();
        this.l = zuq.h(list, this.k);
        if (!z(lcuVar, list)) {
            ub3.e(ub3.a.a("settlementClick").message("结算按钮点击").sampling(0.001f));
            this.j.e().k(true);
            this.m = x(lcuVar);
            String str = "";
            String str2 = str;
            for (IDMComponent iDMComponent : list) {
                str = str + y(iDMComponent) + ",";
                str2 = str2 + v(iDMComponent) + ",";
            }
            String substring = str.substring(0, str.length() - 1);
            String substring2 = str2.substring(0, str2.length() - 1);
            String f = m5n.f(lcuVar.a(), list);
            b D = D(list);
            z0n z0nVar = new z0n(this.j);
            if (D.c()) {
                String a2 = D.a();
                if (a2 != null) {
                    A(substring, substring2, a2, z0nVar, f, currentTimeMillis);
                    return;
                }
                String b2 = D.b();
                if (b2 != null && b2.length() > 0) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("isPostUrl", true);
                    String str3 = "cartId=" + substring2;
                    String str4 = "{\"items\":[";
                    for (IDMComponent iDMComponent2 : list) {
                        String str5 = (String) cb4.x(iDMComponent2, String.class, "h5CartParam");
                        if (!TextUtils.isEmpty(str5)) {
                            str4 = str4 + str5 + ",";
                        }
                    }
                    bundle.putString("postdata", str3 + "&cart_param=" + str4.substring(0, str4.length() - 1) + "]}");
                    z0nVar.b(this.e, b2, REQUEST_CODE_TO_ORDER_H5, bundle, true);
                    UmbrellaTracker.traceProcessEnd("clickSubmitError", "submit", "1.0");
                    return;
                }
                return;
            }
            A(substring, substring2, null, z0nVar, f, currentTimeMillis);
            pav.k(new a(lcuVar, substring2));
        }
    }
}
