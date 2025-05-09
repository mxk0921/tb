package com.taobao.android.icart.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.utils.ICartWVService;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.c9x;
import tb.cb4;
import tb.da3;
import tb.f8e;
import tb.fsb;
import tb.gsb;
import tb.id3;
import tb.kmb;
import tb.lbq;
import tb.lcu;
import tb.t2o;
import tb.ux;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CartWVBroadcast extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_ADD_CART_NOTIFY = "action_add_cart_notify";
    public static final String ACTION_ICART_WV_SERVICE = "action_icart_wv_service";
    public static final String ACTION_QUERY_CART_PAGE = "query_cart_page";
    public static final String KEY_ICART_WV_SERVICE_ACTION = "key_icart_wv_service_action";
    public static final String KEY_ICART_WV_SERVICE_PARAMS = "key_icart_wv_service_params";
    public static final String KEY_NEED_LOADING = "key_need_loading";

    /* renamed from: a  reason: collision with root package name */
    public IntentFilter f7944a;
    public final f8e b;
    public final kmb c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ da3 f7945a;
        public final /* synthetic */ String b;
        public final /* synthetic */ JSONObject c;

        public a(da3 da3Var, String str, JSONObject jSONObject) {
            this.f7945a = da3Var;
            this.b = str;
            this.c = jSONObject;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/broadcast/CartWVBroadcast$1");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
            }
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            int a2 = this.f7945a.a(this.b);
            if (a2 != -1) {
                CartWVBroadcast.a(CartWVBroadcast.this, this.c, a2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/broadcast/CartWVBroadcast$2");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
            }
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
            } else {
                ((RecyclerView) CartWVBroadcast.b(CartWVBroadcast.this).e().o()).scrollToPosition(0);
            }
        }
    }

    static {
        t2o.a(478150671);
    }

    public CartWVBroadcast(f8e f8eVar) {
        this.b = f8eVar;
        this.c = f8eVar.g();
    }

    public static /* synthetic */ void a(CartWVBroadcast cartWVBroadcast, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac093e", new Object[]{cartWVBroadcast, jSONObject, new Integer(i)});
        } else {
            cartWVBroadcast.e(jSONObject, i);
        }
    }

    public static /* synthetic */ kmb b(CartWVBroadcast cartWVBroadcast) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("b9d8aef5", new Object[]{cartWVBroadcast});
        }
        return cartWVBroadcast.c;
    }

    public static /* synthetic */ Object ipc$super(CartWVBroadcast cartWVBroadcast, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/broadcast/CartWVBroadcast");
    }

    public final void c(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c56550b5", new Object[]{this, jSONObject, str});
            return;
        }
        String string = jSONObject.getString("componentKey");
        String string2 = jSONObject.getString("type");
        String string3 = jSONObject.getString("cartId");
        String string4 = jSONObject.getString("toBundleId");
        if (!(TextUtils.isEmpty(string2) || str == null || string == null)) {
            IDMComponent componentByName = this.c.d().c().getComponentByName(string);
            for (gsb gsbVar : componentByName.getEventMap().get(str)) {
                if ("reorderClick".equals(gsbVar.getType())) {
                    JSONObject fields = gsbVar.getFields();
                    fields.clear();
                    fields.put("type", (Object) string2);
                    fields.put("from", (Object) string3);
                    fields.put("fromBundleId", (Object) cb4.p(componentByName));
                    fields.put("toBundleId", (Object) string4);
                    lcu d = this.c.g().d();
                    d.q(str);
                    d.l(gsbVar.getType());
                    d.k(gsbVar);
                    d.i(componentByName);
                    this.c.g().h(d);
                }
            }
        }
    }

    public final void d(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc3bb52a", new Object[]{this, jSONObject, str});
            return;
        }
        String string = jSONObject.getString("componentKey");
        if (!TextUtils.isEmpty(string)) {
            da3 da3Var = new da3(this.c);
            int a2 = da3Var.a(string);
            if (a2 != -1) {
                e(jSONObject, a2);
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(RequestConfig.CUSTOM_EXPARAMS);
            if (jSONObject2 != null) {
                new id3(this.c).c(jSONObject2, new a(da3Var, string, jSONObject));
            }
        }
    }

    public final void e(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3867775", new Object[]{this, jSONObject, new Integer(i)});
            return;
        }
        String string = jSONObject.getString("componentKey");
        da3 da3Var = new da3(this.c);
        if (jSONObject.getBooleanValue("needScrollTo")) {
            da3Var.b(i);
        }
        da3Var.e(string, jSONObject);
        i(string);
    }

    public final void f(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a135cfd9", new Object[]{this, intent});
        } else if (intent != null) {
            String stringExtra = intent.getStringExtra(KEY_ICART_WV_SERVICE_PARAMS);
            String stringExtra2 = intent.getStringExtra(KEY_ICART_WV_SERVICE_ACTION);
            try {
                JSONObject parseObject = JSON.parseObject(stringExtra);
                if (!"addGroup".equals(stringExtra2) && !"reGroup".equals(stringExtra2)) {
                    if ("checkItem".equals(stringExtra2)) {
                        d(parseObject, stringExtra2);
                        return;
                    } else if ("queryFirstPage".equals(stringExtra2)) {
                        g(parseObject);
                        return;
                    } else {
                        return;
                    }
                }
                c(parseObject, stringExtra2);
            } catch (Exception e) {
                lbq.b(c9x.CART_BIZ_NAME, ICartWVService.JS_BRIDGE_NAME, "handleICartWVService", e.getMessage());
                UnifyLog.e(ICartWVService.JS_BRIDGE_NAME, "parse json error:" + e.getMessage());
            }
        }
    }

    public void g(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8d5d832", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject != null) {
            jSONObject2 = jSONObject.getJSONObject(RequestConfig.CUSTOM_EXPARAMS);
        } else {
            jSONObject2 = null;
        }
        new id3(this.c).b(jSONObject2, new b());
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
            return;
        }
        if (this.f7944a == null) {
            IntentFilter intentFilter = new IntentFilter();
            this.f7944a = intentFilter;
            intentFilter.addAction(ACTION_QUERY_CART_PAGE);
            this.f7944a.addAction(ACTION_ICART_WV_SERVICE);
            this.f7944a.addCategory("android.intent.category.DEFAULT");
        }
        j();
        LocalBroadcastManager.getInstance(this.c.getContext()).registerReceiver(this, this.f7944a);
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("863e1127", new Object[]{this, str});
            return;
        }
        IDMComponent componentByName = this.c.j().getComponentByName(str);
        if (!(componentByName == null || cb4.P(componentByName) || !cb4.a(componentByName))) {
            gsb gsbVar = null;
            for (gsb gsbVar2 : componentByName.getEventMap().get("checkClick")) {
                if ("cartSelect".equals(gsbVar2.getType())) {
                    gsbVar = gsbVar2;
                }
            }
            if (gsbVar != null) {
                lcu h = this.c.h();
                h.l("cartSelect");
                h.i(componentByName);
                h.q("checkClick");
                h.k(gsbVar);
                this.c.g().h(h);
            }
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a98eee3", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(this.c.getContext()).unregisterReceiver(this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null) {
            String action = intent.getAction();
            if (ACTION_QUERY_CART_PAGE.equals(action)) {
                this.c.h0(intent.getBooleanExtra(KEY_NEED_LOADING, false));
            } else if (ACTION_ICART_WV_SERVICE.equals(action) && this.b.isResumed()) {
                f(intent);
            }
        }
    }
}
