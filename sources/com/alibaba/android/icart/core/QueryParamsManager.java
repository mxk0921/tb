package com.alibaba.android.icart.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.AddBagRequester;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.tao.TBMainHost;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import tb.na3;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class QueryParamsManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_CART_FROM = "taobao_client";
    public static final String KEY_CART_FROM_BIZ = "cartFromBiz";
    public static final String KEY_QUERY_PARAM_CART_FROM = "cartfrom";
    public static final String TMALL_MARKET_CART_FROM = "tsm_native_taobao";

    /* renamed from: a  reason: collision with root package name */
    public String f2188a;
    public JSONObject b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public List<String> j;
    public final Activity k;
    public final Context l;
    public String m;
    public String n;
    public String o;
    public String p;
    public boolean q;
    public String r = "recmd";
    public final Intent s;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface CartFeedFlowType {
        public static final String none = "none";
        public static final String recmd = "recmd";
        public static final String search = "xsearch";
    }

    static {
        t2o.a(479199250);
    }

    public QueryParamsManager(Activity activity) {
        this.k = activity;
        this.l = activity;
        s();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442307fd", new Object[]{this});
        } else {
            this.p = null;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb70176", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public final List<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bff69a1", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject parseObject = JSON.parseObject(p("customParams"));
            String string = parseObject.getString("headerStartBg");
            String string2 = parseObject.getString("headerEndBg");
            if (!TextUtils.isEmpty(string)) {
                arrayList.add(string);
            }
            if (!TextUtils.isEmpty(string2)) {
                arrayList.add(string2);
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x0035;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String d() {
        /*
            r5 = this;
            java.lang.String r0 = "cartfrom"
            com.android.alibaba.ip.runtime.IpChange r1 = com.alibaba.android.icart.core.QueryParamsManager.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0017
            java.lang.String r0 = "c0e09d4e"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.Object r0 = r1.ipc$dispatch(r0, r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0017:
            android.content.Intent r1 = r5.m()
            java.lang.String r2 = "taobao_client"
            if (r1 != 0) goto L_0x0021
            return r2
        L_0x0021:
            android.net.Uri r3 = r1.getData()
            if (r3 == 0) goto L_0x0034
            java.lang.String r4 = "cartFromBiz"
            java.lang.String r3 = r3.getQueryParameter(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r3 = r2
        L_0x0035:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x004d
            android.os.Bundle r1 = r1.getExtras()     // Catch: Exception -> 0x004c
            if (r1 == 0) goto L_0x004d
            boolean r4 = r1.containsKey(r0)     // Catch: Exception -> 0x004c
            if (r4 == 0) goto L_0x004d
            java.lang.String r3 = r1.getString(r0)     // Catch: Exception -> 0x004c
            goto L_0x004d
        L_0x004c:
        L_0x004d:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r2 = r3
        L_0x0055:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.icart.core.QueryParamsManager.d():java.lang.String");
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("217f35e6", new Object[]{this});
        }
        return this.c;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4cd1f699", new Object[]{this});
        }
        return this.f2188a;
    }

    public JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3a3c47a1", new Object[]{this});
        }
        return this.b;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8cd91c19", new Object[]{this});
        }
        return this.n;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e28f3af", new Object[]{this});
        }
        return this.d;
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6c05981", new Object[]{this});
        }
        String str = null;
        try {
            Intent m = m();
            Uri data = m.getData();
            str = p("newCartDefaultTab");
            if (!TextUtils.isEmpty(str)) {
                Set<String> queryParameterNames = data.getQueryParameterNames();
                Uri.Builder clearQuery = data.buildUpon().clearQuery();
                for (String str2 : queryParameterNames) {
                    if (!str2.equals("newCartDefaultTab")) {
                        clearQuery.appendQueryParameter(str2, data.getQueryParameter(str2));
                    }
                }
                m.setData(clearQuery.build());
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93300bd", new Object[]{this});
        }
        return this.r;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8751c51a", new Object[]{this});
        }
        return this.p;
    }

    public final Intent m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("cdc34bda", new Object[]{this});
        }
        Activity activity = this.k;
        if (activity != null) {
            return activity.getIntent();
        }
        return this.s;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("685eb418", new Object[]{this});
        }
        String str = this.o;
        this.o = null;
        return str;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return this.e;
    }

    public String p(String str) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28d85598", new Object[]{this, str});
        }
        Intent m = m();
        if (m == null || (data = m.getData()) == null) {
            return null;
        }
        return data.getQueryParameter(str);
    }

    public final boolean q(String str) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd63cf46", new Object[]{this, str})).booleanValue();
        }
        Intent m = m();
        if (m == null || (data = m.getData()) == null) {
            return false;
        }
        return data.getBooleanQueryParameter(str, false);
    }

    public final JSONObject r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9827e98f", new Object[]{this, str});
        }
        String p = p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return JSON.parseObject(p);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.f2188a = d();
        r("customParams");
        this.b = r("cartSortParams");
        this.c = p("cartCustomExParam");
        this.m = p("cart_page_name");
        this.d = j();
        this.f = q("removeRecmd");
        this.g = q(RequestConfig.IS_FULL_DATA_QUERY);
        this.n = p("cart_spm_cnt");
        this.h = DEFAULT_CART_FROM.equals(this.f2188a);
        this.p = p("holdCustomExParams");
        String p = p(na3.sKeyFeedFlowType);
        if ("recmd".equals(p) || CartFeedFlowType.search.equals(p) || "none".equals(p)) {
            this.r = p;
        }
        if (!TextUtils.isEmpty(this.c)) {
            try {
                this.i = JSON.parseObject(this.c).getBooleanValue("preheat");
            } catch (Exception unused) {
            }
        }
        this.j = c();
        this.o = p("onceCustomExParams");
        this.q = q("disableFirstPageCache");
        z();
        if (TextUtils.isEmpty(this.p) && TBMainHost.b().getContext() == this.l) {
            this.p = CheckHoldManager.i().h();
            CheckHoldManager.i().r(null);
        }
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58e90270", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a546c71f", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e391e884", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("920f4ec3", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3cc423a", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b8999c", new Object[]{this, str});
        } else {
            this.p = str;
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1597736a", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.m)) {
            this.e = this.m;
        } else {
            this.e = AddBagRequester.sUTPageShoppingCart;
        }
    }

    public QueryParamsManager(Context context, Intent intent) {
        this.l = context;
        this.s = intent;
        s();
    }
}
