package com.taobao.android.opencart.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.c9x;
import tb.hav;
import tb.jji;
import tb.s2d;
import tb.shv;
import tb.xq;
import tb.zq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CartRefreshCheckBroadcast extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f9064a = new AtomicBoolean();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f9065a;

        public a(Context context) {
            this.f9065a = context;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            Map map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
            } else if (executeResult != null) {
                if (executeResult.getData() == null || !"true".equals(String.valueOf(executeResult.getData().get("isOpenCart")))) {
                    hav.d("CartRefreshCheckBroadcast", "OpenCart 回调,type=" + executeResult.getType() + ",statusCode=" + executeResult.getStatusCode() + ",data=" + executeResult.getData());
                    Map<String, Object> data = executeResult.getData();
                    if (data != null) {
                        if ("fail".equals(data.get("result"))) {
                            hav.d("CartRefreshCheckBroadcast", "OpenCart排除加购失败");
                            return;
                        }
                        Object obj = data.get("detail");
                        if (obj instanceof Map) {
                            map = (Map) obj;
                        } else {
                            map = new HashMap();
                        }
                        boolean parseBoolean = Boolean.parseBoolean(String.valueOf(map.get("itemCountChanged")));
                        CartRefreshCheckBroadcast.a(this.f9065a, parseBoolean);
                        Bundle bundle = new Bundle();
                        try {
                            if (map.containsKey("itemCount")) {
                                bundle.putInt("itemCount", Integer.parseInt(String.valueOf(map.get("itemCount"))));
                            }
                        } catch (Exception unused) {
                        }
                        bundle.putBoolean("itemCountChanged", parseBoolean);
                        CartRefreshCheckBroadcast.b(this.f9065a, bundle, null);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c9db0c3", new Object[]{context, new Boolean(z)});
        } else {
            h(context, z);
        }
    }

    public static /* synthetic */ void b(Context context, Bundle bundle, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f18120ac", new Object[]{context, bundle, jSONObject});
        } else {
            g(context, bundle, jSONObject);
        }
    }

    public static /* synthetic */ void c(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4723b7e", new Object[]{mtopResponse});
        } else {
            e(mtopResponse);
        }
    }

    public static void e(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa1ae77", new Object[]{mtopResponse});
            return;
        }
        String str = "";
        String retCode = mtopResponse != null ? mtopResponse.getRetCode() : str;
        if (mtopResponse != null) {
            str = mtopResponse.getRetMsg();
        }
        shv.c("CartRefreshCheckBroadcast", "sendItemCountMtopRequery onError code=" + retCode + ",msg=" + str);
    }

    public static void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381c355e", new Object[]{context});
        } else if (!f9064a.getAndSet(true)) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("cartRefreshData");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            LocalBroadcastManager.getInstance(context).registerReceiver(new CartRefreshCheckBroadcast(), intentFilter);
            AbilityHubAdapter abilityHubAdapter = new AbilityHubAdapter(new zq(c9x.CART_BIZ_NAME, "cart").a(Globals.getApplication()));
            HashMap hashMap = new HashMap();
            hashMap.put("bizId", c9x.CART_BIZ_NAME);
            hashMap.put("eventName", "cartRefreshData");
            abilityHubAdapter.j("broadcast", "addEventListener", new xq().p(null), hashMap, new a(context));
        }
    }

    public static void h(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("404cb3e3", new Object[]{context, new Boolean(z)});
            return;
        }
        Intent intent = new Intent("openCartUpdate");
        intent.putExtra("itemCountChanged", z);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void i(IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("815a9d96", new Object[]{iRemoteBaseListener});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.trade.queryBagCount");
        mtopRequest.setVersion("1.0");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cartFrom", (Object) QueryParamsManager.DEFAULT_CART_FROM);
        mtopRequest.setData(jSONObject.toJSONString());
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.setUnitStrategy("UNIT_TRADE");
        build.registerListener((IRemoteListener) iRemoteBaseListener);
        build.startRequest();
    }

    public static /* synthetic */ Object ipc$super(CartRefreshCheckBroadcast cartRefreshCheckBroadcast, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/opencart/broadcast/CartRefreshCheckBroadcast");
    }

    public final void j(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f19c9277", new Object[]{this, context, bundle});
            return;
        }
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                hashMap.put(str, bundle.get(str));
            }
        }
        jji.a(context, hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(final android.content.Context r5, android.os.Bundle r6, com.alibaba.fastjson.JSONObject r7) {
        /*
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.opencart.broadcast.CartRefreshCheckBroadcast.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "ef0d8060"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r5
            r3[r0] = r6
            r5 = 2
            r3[r5] = r7
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0018:
            if (r6 == 0) goto L_0x0032
            java.lang.String r1 = "stringifyAddCartResult"
            boolean r2 = r6.containsKey(r1)
            if (r2 == 0) goto L_0x0032
            java.lang.Object r1 = r6.get(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0032
            return
        L_0x0032:
            if (r6 == 0) goto L_0x003f
            java.lang.String r1 = "itemCountChanged"
            boolean r0 = r6.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            return
        L_0x003f:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "OpenCartItemCountChange"
            r0.<init>(r1)
            java.lang.String r1 = "itemCount"
            r2 = -1
            if (r7 == 0) goto L_0x005c
            java.lang.String r6 = "taoItemCount"
            java.lang.Integer r6 = r7.getInteger(r6)
            if (r6 == 0) goto L_0x005a
            int r6 = r6.intValue()
            goto L_0x0062
        L_0x005a:
            r6 = -1
            goto L_0x0062
        L_0x005c:
            if (r6 == 0) goto L_0x005a
            int r6 = r6.getInt(r1, r2)
        L_0x0062:
            if (r6 == r2) goto L_0x006f
            r0.putExtra(r1, r6)
            androidx.localbroadcastmanager.content.LocalBroadcastManager r5 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r5)
            r5.sendBroadcast(r0)
            goto L_0x0077
        L_0x006f:
            com.taobao.android.opencart.broadcast.CartRefreshCheckBroadcast$2 r6 = new com.taobao.android.opencart.broadcast.CartRefreshCheckBroadcast$2
            r6.<init>()
            i(r6)
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.opencart.broadcast.CartRefreshCheckBroadcast.g(android.content.Context, android.os.Bundle, com.alibaba.fastjson.JSONObject):void");
    }

    public static void d(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe3a874", new Object[]{context, str, bundle});
        } else if (TextUtils.isEmpty(str)) {
            g(context, bundle, null);
        } else {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                g(context, bundle, parseObject);
                JSONArray jSONArray = parseObject.getJSONArray("cartIds");
                if (parseObject.getBooleanValue("rememberCheck")) {
                    HashSet hashSet = new HashSet();
                    if (jSONArray == null || jSONArray.isEmpty()) {
                        hashSet.add(parseObject.getString("cartId"));
                    } else {
                        Iterator<Object> it = jSONArray.iterator();
                        while (it.hasNext()) {
                            hashSet.add(String.valueOf(it.next()));
                        }
                    }
                    CheckHoldManager.i().n(3, hashSet, null, true);
                }
            } catch (Exception e) {
                shv.c("CartRefreshCheckBroadcast", "parse stringifyAddCartResult error msg=" + e.getMessage());
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null && (action = intent.getAction()) != null) {
            hav.d("CartRefreshCheckBroadcast", "刷新，onReceive intent=" + intent.getExtras());
            if ("cartRefreshData".equals(action)) {
                Bundle extras = intent.getExtras();
                if (extras != null && !extras.getBoolean("itemCountChanged", true)) {
                    z = false;
                }
                h(context, z);
                j(context, extras);
                d(context, intent.getStringExtra("stringifyAddCartResult"), extras);
            }
        }
    }
}
