package com.taobao.android.tbsku.container;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.android.sku.network.SkuRequestParams;
import com.taobao.android.sku.presenter.AliXSkuPresenterEngine;
import com.taobao.android.sku.presenter.a;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.tbsku.TBXSkuCore;
import com.taobao.android.tbsku.model.IntentModel;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.ut.share.utils.Constants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a58;
import tb.h0c;
import tb.hxj;
import tb.k3q;
import tb.m0u;
import tb.n2q;
import tb.n4v;
import tb.owc;
import tb.p2q;
import tb.q2q;
import tb.t2o;
import tb.to8;
import tb.txl;
import tb.uwl;
import tb.v7j;
import tb.vkb;
import tb.y0i;
import tb.ybl;
import tb.yo0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBXSkuContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9577a;
    public IntentModel b;
    public TBXSkuCore c;
    public volatile boolean d;
    public volatile boolean e;
    public vkb f;
    public final Handler g = new Handler(Looper.getMainLooper());
    public String h = hxj.UNIQID + System.currentTimeMillis();
    public SkuUpdateDataReceiver i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class SkuUpdateDataReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(785383498);
        }

        public SkuUpdateDataReceiver() {
        }

        public static /* synthetic */ Object ipc$super(SkuUpdateDataReceiver skuUpdateDataReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbsku/container/TBXSkuContainer$SkuUpdateDataReceiver");
        }

        public /* synthetic */ SkuUpdateDataReceiver(TBXSkuContainer tBXSkuContainer, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (TBXSkuContainer.m(TBXSkuContainer.this) != null) {
                String p = TBXSkuContainer.m(TBXSkuContainer.this).p();
                if (!TextUtils.isEmpty(p) && TBXSkuContainer.n(TBXSkuContainer.this).equals(intent.getStringExtra("skuToken")) && p.equals(intent.getStringExtra("originalItemId"))) {
                    String stringExtra = intent.getStringExtra("targetItemId");
                    String stringExtra2 = intent.getStringExtra(q2q.KEY_AREA_ID);
                    String stringExtra3 = intent.getStringExtra("addressId");
                    String stringExtra4 = intent.getStringExtra("params");
                    String stringExtra5 = intent.getStringExtra("forbidLoading");
                    HashMap<String, String> hashMap = new HashMap<String, String>() { // from class: com.taobao.android.tbsku.container.TBXSkuContainer.SkuUpdateDataReceiver.1
                        {
                            if (TBXSkuContainer.o(TBXSkuContainer.this) != null) {
                                putAll(TBXSkuContainer.o(TBXSkuContainer.this).g);
                            }
                        }
                    };
                    if (!TextUtils.isEmpty(stringExtra2)) {
                        hashMap.put(q2q.KEY_AREA_ID, stringExtra2);
                    }
                    if (!TextUtils.isEmpty(stringExtra3)) {
                        hashMap.put("addressId", stringExtra3);
                    }
                    if (!TextUtils.isEmpty(stringExtra4)) {
                        hashMap.put("params", stringExtra4);
                    }
                    if (TBXSkuContainer.p(TBXSkuContainer.this, stringExtra, hashMap, false) && !"true".equalsIgnoreCase(stringExtra5)) {
                        TBXSkuContainer.m(TBXSkuContainer.this).q().d0();
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements AliXSkuPresenterEngine.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.sku.presenter.AliXSkuPresenterEngine.b
        public boolean onBackPressed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
            }
            AliXSkuPresenterEngine.b m = TBXSkuContainer.m(TBXSkuContainer.this).q().I().m();
            if (m == null || !m.onBackPressed()) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements a.j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.android.sku.presenter.a.j
        public void a(com.taobao.android.sku.presenter.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c77bbee", new Object[]{this, aVar});
            } else {
                TBXSkuContainer.m(TBXSkuContainer.this).q().a0();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements owc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IRemoteBaseListener f9584a;
        public final /* synthetic */ String b;

        public d(TBXSkuContainer tBXSkuContainer, IRemoteBaseListener iRemoteBaseListener, String str) {
            this.f9584a = iRemoteBaseListener;
            this.b = str;
        }

        @Override // tb.owc
        public void a(MtopInfo mtopInfo, int i, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d223f4a0", new Object[]{this, mtopInfo, new Integer(i), baseOutDo, obj});
                return;
            }
            this.f9584a.onSuccess(i, mtopInfo.a(), baseOutDo, obj);
            if (!y0i.API_NAME.equals(mtopInfo.a().getApi())) {
                HashMap hashMap = new HashMap();
                hashMap.put("outType", "skuContainer");
                hashMap.put("itemId", this.b);
                n4v.b(19999, "Request_Degrade", hashMap);
            }
        }

        @Override // tb.owc
        public void b(MtopInfo mtopInfo, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e6c9079", new Object[]{this, mtopInfo, new Integer(i), obj});
            } else {
                this.f9584a.onError(i, mtopInfo.a(), obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements vkb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(785383497);
            t2o.a(442499149);
        }

        public e() {
        }

        public /* synthetic */ e(TBXSkuContainer tBXSkuContainer, a aVar) {
            this();
        }

        @Override // tb.vkb
        public void a(JSONObject jSONObject) {
            char c = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2df2da85", new Object[]{this, jSONObject});
            } else if (jSONObject != null) {
                try {
                    String string = jSONObject.getString("actionFrom");
                    if (TextUtils.isEmpty(string)) {
                        string = "NULL";
                    }
                    switch (string.hashCode()) {
                        case -1989579947:
                            if (string.equals("CLOSE_BTN")) {
                                break;
                            }
                            c = 65535;
                            break;
                        case -1519039294:
                            if (string.equals("ADD_CART_SUCCESS")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1270747266:
                            if (string.equals("ADD_CART_FAILED")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 964279645:
                            if (string.equals("BUY_NOW")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1722726347:
                            if (string.equals("CONFIRM_DISMISS")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1970224683:
                            if (string.equals("CUSTOM_RIGHT_BTN")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c != 2) {
                        if (c != 3) {
                            if (c == 4) {
                                TBXSkuContainer tBXSkuContainer = TBXSkuContainer.this;
                                TBXSkuContainer.k(tBXSkuContainer, TBXSkuContainer.b(tBXSkuContainer, jSONObject));
                            } else if (!(c == 5 || c == 6)) {
                                TBXSkuContainer.a(TBXSkuContainer.this);
                            }
                        } else if (!"native_addCart".equals(jSONObject.getString("addCartScene"))) {
                            TBXSkuContainer tBXSkuContainer2 = TBXSkuContainer.this;
                            TBXSkuContainer.j(tBXSkuContainer2, TBXSkuContainer.b(tBXSkuContainer2, jSONObject));
                        }
                    }
                    if (TBXSkuContainer.l(TBXSkuContainer.this) != null) {
                        TBXSkuContainer.l(TBXSkuContainer.this).a(jSONObject);
                    }
                } catch (Throwable th) {
                    if (TBXSkuContainer.l(TBXSkuContainer.this) != null) {
                        TBXSkuContainer.l(TBXSkuContainer.this).a(jSONObject);
                    }
                    throw th;
                }
            } else if (TBXSkuContainer.l(TBXSkuContainer.this) != null) {
                TBXSkuContainer.l(TBXSkuContainer.this).a(jSONObject);
            }
        }
    }

    static {
        t2o.a(785383490);
    }

    public TBXSkuContainer(Context context) {
        txl.h().q("beforeMtop", "container");
        this.f9577a = context;
        I();
        F();
    }

    public static /* synthetic */ void a(TBXSkuContainer tBXSkuContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20970839", new Object[]{tBXSkuContainer});
        } else {
            tBXSkuContainer.t();
        }
    }

    public static /* synthetic */ String b(TBXSkuContainer tBXSkuContainer, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9315da2a", new Object[]{tBXSkuContainer, jSONObject});
        }
        return tBXSkuContainer.y(jSONObject);
    }

    public static /* synthetic */ Context c(TBXSkuContainer tBXSkuContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("98e732e0", new Object[]{tBXSkuContainer});
        }
        return tBXSkuContainer.f9577a;
    }

    public static /* synthetic */ void d(TBXSkuContainer tBXSkuContainer, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cf6f29a", new Object[]{tBXSkuContainer, new Integer(i), new Boolean(z)});
        } else {
            tBXSkuContainer.u(i, z);
        }
    }

    public static /* synthetic */ JSONObject e(TBXSkuContainer tBXSkuContainer, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3426a6d1", new Object[]{tBXSkuContainer, mtopResponse});
        }
        return tBXSkuContainer.H(mtopResponse);
    }

    public static /* synthetic */ String f(TBXSkuContainer tBXSkuContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37ab45f2", new Object[]{tBXSkuContainer});
        }
        return tBXSkuContainer.B();
    }

    public static /* synthetic */ String g(TBXSkuContainer tBXSkuContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79c27351", new Object[]{tBXSkuContainer});
        }
        return tBXSkuContainer.C();
    }

    public static /* synthetic */ void h(TBXSkuContainer tBXSkuContainer, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef13c700", new Object[]{tBXSkuContainer, jSONObject});
        } else {
            tBXSkuContainer.R(jSONObject);
        }
    }

    public static /* synthetic */ void i(TBXSkuContainer tBXSkuContainer, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee3a565f", new Object[]{tBXSkuContainer, jSONObject});
        } else {
            tBXSkuContainer.P(jSONObject);
        }
    }

    public static /* synthetic */ void j(TBXSkuContainer tBXSkuContainer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b36f2c5", new Object[]{tBXSkuContainer, str});
        } else {
            tBXSkuContainer.s(str);
        }
    }

    public static /* synthetic */ void k(TBXSkuContainer tBXSkuContainer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c057146", new Object[]{tBXSkuContainer, str});
        } else {
            tBXSkuContainer.r(str);
        }
    }

    public static /* synthetic */ vkb l(TBXSkuContainer tBXSkuContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vkb) ipChange.ipc$dispatch("a93efda5", new Object[]{tBXSkuContainer});
        }
        return tBXSkuContainer.f;
    }

    public static /* synthetic */ TBXSkuCore m(TBXSkuContainer tBXSkuContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBXSkuCore) ipChange.ipc$dispatch("201348a", new Object[]{tBXSkuContainer});
        }
        return tBXSkuContainer.c;
    }

    public static /* synthetic */ String n(TBXSkuContainer tBXSkuContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("699a55c1", new Object[]{tBXSkuContainer});
        }
        return tBXSkuContainer.h;
    }

    public static /* synthetic */ IntentModel o(TBXSkuContainer tBXSkuContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntentModel) ipChange.ipc$dispatch("dc3af1f1", new Object[]{tBXSkuContainer});
        }
        return tBXSkuContainer.b;
    }

    public static /* synthetic */ boolean p(TBXSkuContainer tBXSkuContainer, String str, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19b93bbe", new Object[]{tBXSkuContainer, str, map, new Boolean(z)})).booleanValue();
        }
        return tBXSkuContainer.J(str, map, z);
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20d855e8", new Object[0])).booleanValue();
        }
        AliConfigInterface b2 = yo0.b();
        if (b2 != null) {
            return Boolean.parseBoolean(b2.getConfig("android_sku", "enableInterceptBackPress", "true"));
        }
        return true;
    }

    public final String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("140c133a", new Object[]{this});
        }
        IntentModel intentModel = this.b;
        if (intentModel != null) {
            return intentModel.s;
        }
        return p2q.SKU_MSG_DEPRESS_SHOW_H5_SKU;
    }

    public final String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        IntentModel intentModel = this.b;
        if (intentModel != null) {
            return intentModel.f9595a;
        }
        return null;
    }

    public final String C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fc3e7ca", new Object[]{this});
        }
        IntentModel intentModel = this.b;
        if (intentModel != null) {
            return intentModel.f;
        }
        return null;
    }

    public final String D(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10c3db74", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty() || (jSONObject2 = jSONObject.getJSONObject(DnsPreference.KEY_TRADE)) == null || jSONObject2.isEmpty()) {
            return null;
        }
        return jSONObject2.getString(Constants.WEIBO_REDIRECTURL_KEY);
    }

    public IntentModel E(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntentModel) ipChange.ipc$dispatch("1d450962", new Object[]{this, jSONObject});
        }
        IntentModel intentModel = new IntentModel(MsoaDataConverter.a(jSONObject));
        this.b = intentModel;
        if (!TextUtils.isEmpty(intentModel.d)) {
            this.h = this.b.d;
        }
        S();
        return this.b;
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("449679b3", new Object[]{this});
            return;
        }
        TBXSkuCore tBXSkuCore = new TBXSkuCore(this.f9577a, this.h);
        this.c = tBXSkuCore;
        tBXSkuCore.L(new e(this, null));
        this.c.J(new a());
    }

    public final boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e98ede26", new Object[]{this})).booleanValue();
        }
        IntentModel intentModel = this.b;
        if (intentModel != null) {
            return intentModel.r;
        }
        return false;
    }

    public final JSONObject H(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8d14731", new Object[]{this, mtopResponse});
        }
        if (mtopResponse == null) {
            return null;
        }
        String str = new String(mtopResponse.getBytedata());
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a58.f(str);
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5358779", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.taobao.sku.intent.action.updateData");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        this.i = new SkuUpdateDataReceiver(this, null);
        LocalBroadcastManager.getInstance(this.f9577a).registerReceiver(this.i, intentFilter);
    }

    public void M(vkb vkbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e48b11", new Object[]{this, vkbVar});
        } else {
            this.f = vkbVar;
        }
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11dc0b32", new Object[]{this});
        } else {
            this.c.q().A0();
        }
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdcacb80", new Object[]{this});
            return;
        }
        try {
            if (this.i != null) {
                LocalBroadcastManager.getInstance(this.f9577a).unregisterReceiver(this.i);
            }
        } catch (Throwable unused) {
        }
    }

    public final void R(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2021a435", new Object[]{this, jSONObject});
            return;
        }
        q(jSONObject);
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore != null) {
            tBXSkuCore.V(jSONObject);
        }
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a8f95a4", new Object[]{this});
            return;
        }
        txl.h().m(this.b.l, "FirstScreenPaint");
        this.c.I(this.b.l);
        this.c.N(this.b.k);
        this.c.K(this.b.c());
    }

    public final void q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b986cb4", new Object[]{this, jSONObject});
            return;
        }
        String D = D(jSONObject);
        if (!TextUtils.isEmpty(D)) {
            IntentModel intentModel = this.b;
            SkuLogUtils.c(SkuLogUtils.DEFAULT_BIZ_NAME, SkuLogUtils.UM_URL_DOWNGRADE_REDIRECT_URL_E, "商品出现降级 redirectUrl: " + D, intentModel.f9595a, intentModel.f);
        }
    }

    public final void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("697d4a8e", new Object[]{this, str});
            return;
        }
        IntentModel intentModel = this.b;
        if (intentModel == null || !intentModel.b()) {
            Intent intent = new Intent();
            intent.setAction("cartRefreshData");
            intent.putExtra("result", "fail");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            intent.putExtra("stringifyAddCartResult", str);
            LocalBroadcastManager.getInstance(this.f9577a).sendBroadcast(intent);
        }
    }

    public final void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31b33ed4", new Object[]{this, str});
            return;
        }
        IntentModel intentModel = this.b;
        if (intentModel == null || !intentModel.b()) {
            Intent intent = new Intent();
            intent.setAction("cartRefreshData");
            intent.putExtra("result", "success");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            intent.putExtra("stringifyAddCartResult", str);
            LocalBroadcastManager.getInstance(this.f9577a).sendBroadcast(intent);
            SkuLogUtils.k("SkuContainer.broadcastAddCartSuccess");
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d535775c", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("detailSKU");
        intent.putExtra("result", "cancel");
        LocalBroadcastManager.getInstance(this.f9577a).sendBroadcast(intent);
    }

    public final void u(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e79ebe63", new Object[]{this, new Integer(i), new Boolean(z)});
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (!this.e) {
            this.e = true;
            Q();
            this.c.m();
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de0cc00a", new Object[]{this});
            return;
        }
        com.taobao.android.sku.presenter.a aVar = new com.taobao.android.sku.presenter.a(this.f9577a);
        if (x()) {
            aVar.B(new b());
        }
        aVar.C(new c());
        this.c.q().e0(aVar);
    }

    public final String y(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("825a373a", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject(to8.ADD_CART)) == null) {
            return null;
        }
        return jSONObject2.getString("addCartResult");
    }

    public Context z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f9577a;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class TBXSkuResponseListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean mInit;
        private Handler mMainHandler;
        private String mOpenFrom;
        private WeakReference<TBXSkuContainer> mWeakReference;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ TBXSkuContainer f9579a;
            public final /* synthetic */ MtopResponse b;

            public a(TBXSkuContainer tBXSkuContainer, MtopResponse mtopResponse) {
                this.f9579a = tBXSkuContainer;
                this.b = mtopResponse;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (TBXSkuResponseListener.access$1300(TBXSkuResponseListener.this, this.f9579a)) {
                    TBXSkuResponseListener.access$1500(TBXSkuResponseListener.this, TBXSkuContainer.e(this.f9579a, this.b));
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ JSONObject f9580a;

            public b(JSONObject jSONObject) {
                this.f9580a = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TBXSkuContainer tBXSkuContainer = (TBXSkuContainer) TBXSkuResponseListener.access$2000(TBXSkuResponseListener.this).get();
                if (TBXSkuResponseListener.access$1300(TBXSkuResponseListener.this, tBXSkuContainer)) {
                    TBXSkuResponseListener.this.dealMtopSuccess(tBXSkuContainer, this.f9580a);
                }
            }
        }

        static {
            t2o.a(785383500);
            t2o.a(589299719);
        }

        public TBXSkuResponseListener(TBXSkuContainer tBXSkuContainer, Handler handler, boolean z, String str) {
            this.mWeakReference = new WeakReference<>(tBXSkuContainer);
            this.mMainHandler = handler;
            this.mInit = z;
            this.mOpenFrom = str;
        }

        public static /* synthetic */ boolean access$1300(TBXSkuResponseListener tBXSkuResponseListener, TBXSkuContainer tBXSkuContainer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5137ffdf", new Object[]{tBXSkuResponseListener, tBXSkuContainer})).booleanValue();
            }
            return tBXSkuResponseListener.isPresenterValid(tBXSkuContainer);
        }

        public static /* synthetic */ void access$1500(TBXSkuResponseListener tBXSkuResponseListener, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("696a6179", new Object[]{tBXSkuResponseListener, jSONObject});
            } else {
                tBXSkuResponseListener.dealResultInMainThread(jSONObject);
            }
        }

        public static /* synthetic */ WeakReference access$2000(TBXSkuResponseListener tBXSkuResponseListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakReference) ipChange.ipc$dispatch("5dbdc6cb", new Object[]{tBXSkuResponseListener});
            }
            return tBXSkuResponseListener.mWeakReference;
        }

        private void dealResultInMainThread(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4ac2778", new Object[]{this, jSONObject});
            } else {
                this.mMainHandler.post(new b(jSONObject));
            }
        }

        private boolean isPresenterValid(TBXSkuContainer tBXSkuContainer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56d3594b", new Object[]{this, tBXSkuContainer})).booleanValue();
            }
            if (tBXSkuContainer == null || !TBXSkuContainer.m(tBXSkuContainer).q().I().o()) {
                return false;
            }
            return true;
        }

        public void dealMtopSuccess(TBXSkuContainer tBXSkuContainer, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8d8b898", new Object[]{this, tBXSkuContainer, jSONObject});
                return;
            }
            if (this.mInit) {
                TBXSkuContainer.i(tBXSkuContainer, jSONObject);
            } else {
                TBXSkuContainer.h(tBXSkuContainer, jSONObject);
            }
            v7j.b(tBXSkuContainer.z(), jSONObject, this.mOpenFrom);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            TBXSkuContainer tBXSkuContainer = this.mWeakReference.get();
            if (isPresenterValid(tBXSkuContainer)) {
                dealMtopError(tBXSkuContainer, mtopResponse);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            TBXSkuContainer tBXSkuContainer = this.mWeakReference.get();
            if (isPresenterValid(tBXSkuContainer)) {
                txl.h().p("mtop", new HashMap<String, String>(mtopResponse) { // from class: com.taobao.android.tbsku.container.TBXSkuContainer.TBXSkuResponseListener.1
                    public final /* synthetic */ MtopResponse val$mtopResponse;

                    {
                        this.val$mtopResponse = mtopResponse;
                        put("api", mtopResponse.getApi());
                        put("v", mtopResponse.getV());
                        put("eagleEyeTraceId", uwl.b(mtopResponse));
                        put("mtopState", mtopResponse.getMtopStat().toString());
                    }
                });
                txl.h().q("afterMtop", "container");
                new Thread(new a(tBXSkuContainer, mtopResponse), "TBXSkuContainer.TBXSkuResponseListener").start();
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            TBXSkuContainer tBXSkuContainer = this.mWeakReference.get();
            if (isPresenterValid(tBXSkuContainer)) {
                dealMtopError(tBXSkuContainer, mtopResponse);
            }
        }

        public void dealMtopError(TBXSkuContainer tBXSkuContainer, MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4c883e2", new Object[]{this, tBXSkuContainer, mtopResponse});
                return;
            }
            String retMsg = mtopResponse.getRetMsg();
            if (TextUtils.isEmpty(retMsg)) {
                retMsg = p2q.SKU_MSG_QUERYDATA_FAILED;
            }
            m0u.b(TBXSkuContainer.c(tBXSkuContainer), p2q.SKU_MSG_QUERYDATA_FAILED, 1);
            if (this.mInit) {
                SkuLogUtils.c(SkuLogUtils.DEFAULT_BIZ_NAME, SkuLogUtils.UM_URL_DOWNGRADE_MTOP_E, retMsg, TBXSkuContainer.f(tBXSkuContainer), TBXSkuContainer.g(tBXSkuContainer));
                TBXSkuContainer.d(tBXSkuContainer, 8, true);
                tBXSkuContainer.v();
                TBXSkuContainer.d(tBXSkuContainer, 8, false);
                return;
            }
            TBXSkuContainer.h(tBXSkuContainer, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements h0c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.h0c
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a97b7546", new Object[]{this, str});
                return;
            }
            m0u.b(TBXSkuContainer.c(TBXSkuContainer.this), p2q.SKU_MSG_JS_CRASHED, 1);
            TBXSkuContainer.d(TBXSkuContainer.this, 16, true);
            TBXSkuContainer.this.v();
            TBXSkuContainer.d(TBXSkuContainer.this, 16, false);
        }
    }

    public final boolean K(String str, Map<String, String> map, boolean z, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5421ccc", new Object[]{this, str, map, new Boolean(z), iRemoteBaseListener})).booleanValue();
        }
        k3q k3qVar = new k3q(this.f9577a, new SkuRequestParams(str, map));
        k3qVar.b(iRemoteBaseListener);
        boolean a2 = k3qVar.a();
        if (!a2) {
            m0u.b(this.f9577a, p2q.SKU_MSG_MTOP_INIT_FAILED, 1);
        }
        return a2;
    }

    public final boolean L(String str, Map<String, String> map, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("935b805b", new Object[]{this, str, map, iRemoteBaseListener})).booleanValue();
        }
        Intent intent = new Intent();
        intent.putExtra("id", str);
        MainRequestParams mainRequestParams = new MainRequestParams(intent);
        map.put("skuOutSdk", "true");
        map.put("container_type", "sku");
        IntentModel intentModel = this.b;
        if (intentModel != null && !TextUtils.isEmpty(intentModel.e)) {
            map.put("skuType", this.b.e.toLowerCase());
        }
        mainRequestParams.getExParams().remove("openFrom");
        mainRequestParams.updateRefreshParams(map);
        y0i y0iVar = new y0i(mainRequestParams);
        y0iVar.q(new MainRequestCallback(mainRequestParams, new d(this, iRemoteBaseListener, str)));
        y0iVar.c();
        return true;
    }

    public final boolean J(String str, Map<String, String> map, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a51ddf2", new Object[]{this, str, map, new Boolean(z)})).booleanValue();
        }
        txl.h().p("beforeMtop", null);
        txl.h().q("mtop", "container");
        String str2 = (String) ((HashMap) this.b.g).get("openFrom");
        if (map == null || !"true".equals(map.get("enableFastSku"))) {
            z2 = false;
        }
        boolean a2 = v7j.a(this.f9577a, str2);
        if (z2 || (a2 && ybl.b())) {
            return L(str, map, new TBXSkuResponseListener(this, this.g, z, str2));
        }
        return K(str, map, z, new TBXSkuResponseListener(this, this.g, z, str2));
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ac4167", new Object[]{this});
        } else if (!this.d) {
            this.d = true;
            IntentModel intentModel = this.b;
            if (intentModel == null) {
                SkuLogUtils.c(SkuLogUtils.DEFAULT_BIZ_NAME, SkuLogUtils.UM_URL_DOWNGRADE_INIT_E, "not init data", null, null);
                m0u.b(this.f9577a, "please set data before show", 1);
                u(9, true);
                v();
                u(9, false);
            } else if (intentModel.m) {
                SkuLogUtils.c(SkuLogUtils.DEFAULT_BIZ_NAME, SkuLogUtils.UM_URL_DOWNGRADE_INIT_E, intentModel.o, intentModel.f9595a, intentModel.f);
                m0u.b(this.f9577a, this.b.o, 1);
                u(this.b.n, true);
                v();
                u(this.b.n, false);
            } else if (!J(intentModel.f9595a, intentModel.g, true)) {
                IntentModel intentModel2 = this.b;
                SkuLogUtils.c(SkuLogUtils.DEFAULT_BIZ_NAME, SkuLogUtils.UM_URL_DOWNGRADE_INIT_E, "Mtop初始化失败!", intentModel2.f9595a, intentModel2.f);
                u(14, true);
                v();
                u(14, false);
            }
        }
    }

    public final void P(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25160269", new Object[]{this, jSONObject});
            return;
        }
        q(jSONObject);
        if (!G() || !n2q.c(jSONObject, this.b.l)) {
            IntentModel intentModel = this.b;
            if (intentModel != null && intentModel.t && !TextUtils.isEmpty(D(jSONObject))) {
                m0u.b(this.f9577a, this.b.u, 1);
                u(18, true);
                v();
                u(18, false);
            } else if (!n2q.d(jSONObject, this.b.l)) {
                m0u.b(this.f9577a, p2q.SKU_MSG_NOT_SUPPORT, 1);
                u(15, true);
                v();
                u(15, false);
            } else {
                this.c.F("userBehaviorData", new JSONObject() { // from class: com.taobao.android.tbsku.container.TBXSkuContainer.4
                    {
                        String str;
                        if (TextUtils.isEmpty(TBXSkuContainer.o(TBXSkuContainer.this).y)) {
                            str = TBXSkuContainer.n(TBXSkuContainer.this);
                        } else {
                            str = TBXSkuContainer.o(TBXSkuContainer.this).y;
                        }
                        put("UniqueId", (Object) str);
                    }
                });
                this.c.s(jSONObject);
                this.c.O();
            }
        } else {
            m0u.b(this.f9577a, A(), 1);
            u(18, true);
            v();
            u(18, false);
        }
    }
}
