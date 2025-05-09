package com.taobao.android.detail.ttdetail.platformization.business;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailBaseActivity;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Trade;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.utils.DynamicMergeUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.MtopResponse;
import tb.b5m;
import tb.bo4;
import tb.bw7;
import tb.jov;
import tb.lba;
import tb.mng;
import tb.t2o;
import tb.tgh;
import tb.w7j;
import tb.w9e;
import tb.ym9;
import tb.yzc;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BizLifecycle extends mng {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_TYPE_FLIGGY = "fliggy";
    public static final String BIZ_TYPE_TINY_SHOP = "tinyShop";
    public static final List<String> i = new ArrayList<String>() { // from class: com.taobao.android.detail.ttdetail.platformization.business.BizLifecycle.1
        {
            add("web.m.taobao.com/app/tb-zhibo-app/dt-shop-detail/goods");
            add("web.wapa.taobao.com/app/tb-zhibo-app/dt-shop-detail/goods");
            add("diantao.cn/share-landing-page/home.html");
            add("market.wapa.taobao.com/app/tb-zhibo-app/share-landing-page/home.html");
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public Intent f6872a;
    public Context b;
    public ze7 c;
    public w9e d;
    public final TTDetailBaseActivity e;
    public BizContext g;
    public volatile int f = 0;
    public final Map<String, String> h = new ConcurrentHashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.platformization.business.BizLifecycle.2
        {
            put(BizLifecycle.BIZ_TYPE_FLIGGY, "com.taobao.android.detail.fliggyttdetail.FliggyBizContext");
            put(BizLifecycle.BIZ_TYPE_TINY_SHOP, "com.taobao.android.detail.liveshop.LiveShopDetailBizContext");
        }
    };

    static {
        t2o.a(912262144);
    }

    public BizLifecycle(TTDetailBaseActivity tTDetailBaseActivity) {
        this.e = tTDetailBaseActivity;
    }

    public static /* synthetic */ Object ipc$super(BizLifecycle bizLifecycle, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.h();
                return null;
            case -1504501726:
                super.c();
                return null;
            case -1155108085:
                super.e((ze7) objArr[0], (Context) objArr[1], (Intent) objArr[2]);
                return null;
            case -695050278:
                super.b(((Boolean) objArr[0]).booleanValue());
                return null;
            case -652467928:
                return new Boolean(super.i((Map) objArr[0], (yzc) objArr[1], ((Boolean) objArr[2]).booleanValue()));
            case 321112840:
                return new Boolean(super.f((Map) objArr[0], (MtopResponse) objArr[1], ((Number) objArr[2]).intValue()));
            case 797441118:
                super.g();
                return null;
            case 1420366644:
                super.a((w9e) objArr[0]);
                return null;
            case 2045596855:
                return new Boolean(super.d((JSONObject) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/platformization/business/BizLifecycle");
        }
    }

    @Override // tb.mng
    public void a(w9e w9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54a91334", new Object[]{this, w9eVar});
            return;
        }
        super.a(w9eVar);
        this.d = w9eVar;
    }

    @Override // tb.mng
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6925fda", new Object[]{this, new Boolean(z)});
        } else {
            super.b(z);
        }
    }

    @Override // tb.mng
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.c();
        this.f = 3;
        BizContext bizContext = this.g;
        if (bizContext != null) {
            bizContext.onDestroy();
        }
    }

    @Override // tb.mng
    public boolean d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79ed54b7", new Object[]{this, jSONObject})).booleanValue();
        }
        if (super.d(jSONObject)) {
            return true;
        }
        BizContext bizContext = this.g;
        if (bizContext == null || !bizContext.onFrameworkDowngrade(jSONObject)) {
            return false;
        }
        return true;
    }

    @Override // tb.mng
    public void e(ze7 ze7Var, Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb26730b", new Object[]{this, ze7Var, context, intent});
            return;
        }
        this.f6872a = intent;
        this.b = context;
        this.c = ze7Var;
        super.e(ze7Var, context, intent);
        this.f = 0;
    }

    @Override // tb.mng
    public boolean f(Map<String, String> map, MtopResponse mtopResponse, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1323cb08", new Object[]{this, map, mtopResponse, new Integer(i2)})).booleanValue();
        }
        boolean f = super.f(map, mtopResponse, i2);
        if (this.g == null) {
            BizContext l = l(w7j.c(mtopResponse, i2));
            this.g = l;
            if (l != null) {
                l.attachBizContext(this.c, this.b, this.f6872a, this.d, this);
                j();
            }
        }
        if (f) {
            return true;
        }
        BizContext bizContext = this.g;
        if (bizContext == null || !bizContext.onInterceptResponse(map, mtopResponse, i2)) {
            return false;
        }
        return true;
    }

    @Override // tb.mng
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.g();
        this.f = 2;
        BizContext bizContext = this.g;
        if (bizContext != null) {
            bizContext.onPause();
        }
    }

    @Override // tb.mng
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.h();
        this.f = 1;
        BizContext bizContext = this.g;
        if (bizContext != null) {
            bizContext.onResume();
        }
    }

    @Override // tb.mng
    public boolean i(Map<String, String> map, yzc yzcVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d91c2128", new Object[]{this, map, yzcVar, new Boolean(z)})).booleanValue();
        }
        if (super.i(map, yzcVar, z)) {
            return true;
        }
        BizContext bizContext = this.g;
        if (bizContext == null || !bizContext.onSendRequest(map, yzcVar, z)) {
            return false;
        }
        return true;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d33aa4c7", new Object[]{this});
        } else if (this.f <= 0) {
            this.g.onCreate();
        } else if (this.f <= 1) {
            this.g.onCreate();
            this.g.onResume();
        } else if (this.f <= 2) {
            this.g.onCreate();
            this.g.onResume();
            this.g.onPause();
        } else {
            this.g.onCreate();
            this.g.onResume();
            this.g.onPause();
            this.g.onDestroy();
        }
    }

    public final String k(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1addbb9", new Object[]{this, jSONObject});
        }
        JSONObject j = DynamicMergeUtils.j(jSONObject);
        Trade trade = (Trade) lba.a(j, Trade.class);
        String redirectUrl = trade != null ? trade.getRedirectUrl() : null;
        Item item = (Item) lba.a(j, Item.class);
        String businessId = item != null ? item.getBusinessId() : null;
        if ((!TextUtils.isEmpty(redirectUrl) && bo4.a(jov.f(redirectUrl), i)) || TextUtils.equals("liveShop", businessId)) {
            str = BIZ_TYPE_TINY_SHOP;
        } else if (!TextUtils.isEmpty(businessId)) {
            String str2 = TextUtils.equals(BIZ_TYPE_FLIGGY, businessId) ? BIZ_TYPE_FLIGGY : null;
            CharSequence charSequence = ym9.b(item) ? BIZ_TYPE_FLIGGY : null;
            String w = DataUtils.w(item, "");
            String str3 = (String) this.c.i().c("traceId");
            if (TextUtils.isEmpty(str3)) {
                str3 = "";
            }
            String n = DataUtils.n(item, "");
            HashMap hashMap = new HashMap();
            hashMap.put("itemId", w);
            hashMap.put("traceId", str3);
            hashMap.put("categoryId", n);
            hashMap.put("businessId", businessId);
            if (!TextUtils.equals(str2, charSequence)) {
                if (TextUtils.equals(BIZ_TYPE_FLIGGY, str2)) {
                    tgh.b("BizLifecycle", "-100031飞猪商品新老判定逻辑异常：IN_NEW_NOT_IN_OLD detail: " + JSON.toJSONString(hashMap));
                    bw7.b(hashMap, -100031, "IN_NEW_NOT_IN_OLD");
                } else {
                    tgh.b("BizLifecycle", "-100031飞猪商品新老判定逻辑异常：NOT_IN_NEW_IN_OLD detail: " + JSON.toJSONString(hashMap));
                    bw7.b(hashMap, -100031, "NOT_IN_NEW_IN_OLD");
                }
            }
            str = str2;
        } else {
            str = ym9.b(item) ? BIZ_TYPE_FLIGGY : null;
        }
        if (!b5m.B().a(str)) {
            return null;
        }
        return str;
    }

    public final BizContext l(JSONObject jSONObject) {
        String k = k(jSONObject);
        if (TextUtils.isEmpty(k)) {
            tgh.b("BizLifecycle", "not findBizIdFromServer");
            return null;
        }
        String str = (String) ((ConcurrentHashMap) this.h).get(k);
        if (TextUtils.isEmpty(str)) {
            tgh.b("BizLifecycle", "bizId: " + k + " not registered by framework");
            return null;
        }
        try {
            BizContext bizContext = (BizContext) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (TextUtils.equals(k, bizContext.bizId())) {
                tgh.b("BizLifecycle", "instance BizContext success with bizId: " + k + ", classPath: " + str);
                return bizContext;
            }
            tgh.b("BizLifecycle", "instance BizContext: " + bizContext + ", should set bizId with value: " + k);
            return null;
        } catch (Throwable th) {
            tgh.c("BizLifecycle", "instance BizContext error", th);
            return null;
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb9d14c", new Object[]{this, str});
        } else {
            this.e.x3(str);
        }
    }

    public String n(Map<String, String> map, MtopResponse mtopResponse, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52bb970c", new Object[]{this, map, mtopResponse, new Integer(i2)});
        }
        return this.e.y3(map, mtopResponse, i2);
    }

    public void o(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a22443", new Object[]{this, map});
        } else {
            this.e.B3(map);
        }
    }
}
