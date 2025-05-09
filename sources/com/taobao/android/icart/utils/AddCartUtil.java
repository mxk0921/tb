package com.taobao.android.icart.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.umbrella.link.export.UmTypeKey;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.weex.DismissPopWeexModule;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.taobao.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a3l;
import tb.be3;
import tb.c9x;
import tb.hav;
import tb.hd3;
import tb.hdv;
import tb.juv;
import tb.kmb;
import tb.l2q;
import tb.nuv;
import tb.q2q;
import tb.t2o;
import tb.u2q;
import tb.ub3;
import tb.z2q;
import tb.zvj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class AddCartUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADD_ON_MODULE = "addon";
    public static final String API_ADD_CART = "mtop.trade.addBag";
    public static final String CART_CHANNEL = "cart";
    public static final String DETAIL_CHANNEL = "detail";
    public static final String FEED_FLOW_MODULE = "feedflow";
    public static final String SEARCH_FLOW_MODULE = "searchFlow";
    public static final String SKU_CHANNEL = "sku";
    public static final String SKU_EDITABLE_TAG = "1";
    public static final String STRINGIFY_ADD_CART_RESULT = "stringifyAddCartResult";
    public static final String VERSION_ADD_CART = "3.1";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface Channel {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface Module {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements l2q {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.l2q
        public void a(u2q u2qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc6a6ad6", new Object[]{this, u2qVar});
            }
        }

        @Override // tb.l2q
        public void onFailed(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c2003aa", new Object[]{this, new Integer(i), str});
            }
        }
    }

    static {
        t2o.a(478150882);
    }

    public static /* synthetic */ void a(Context context, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d43b37b6", new Object[]{context, mtopResponse});
        } else {
            i(context, mtopResponse);
        }
    }

    public static /* synthetic */ void b(long j, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cef43d1", new Object[]{new Long(j), mtopResponse});
        } else {
            h(j, mtopResponse);
        }
    }

    public static Map<String, String> e(Activity activity, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cfb7918e", new Object[]{activity, str, str2, str3});
        }
        return f(activity, "addBagExParamFromCartFeedFlow", str, str2, str3);
    }

    public static Map<String, String> f(Activity activity, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("105d0d98", new Object[]{activity, str, str2, str3, str4});
        }
        return g(String.valueOf(activity.hashCode()), str, str2, str3, str4);
    }

    public static void h(long j, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("133f5220", new Object[]{new Long(j), mtopResponse});
        } else if (mtopResponse != null) {
            hav.a("AddCartUtil", "加购失败," + mtopResponse.getRetMsg());
            a3l.a("mtop.trade.addBag", j, false, mtopResponse.getRetCode(), mtopResponse.getRetMsg());
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", mtopResponse.getRetCode());
            hashMap.put("errorMsg", mtopResponse.getRetMsg());
            nuv.j(DismissPopWeexModule.MODULE_NAME, "AddBagFail", 19999, hashMap);
        }
    }

    public static void i(Context context, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de0e142", new Object[]{context, mtopResponse});
        } else if (mtopResponse != null) {
            String retMsg = mtopResponse.getRetMsg();
            if (TextUtils.isEmpty(retMsg)) {
                retMsg = Localization.q(R.string.app_busy_system_tired);
                if (mtopResponse.isApiLockedResult()) {
                    retMsg = Localization.q(R.string.taobao_app_1028_1_21641);
                }
            }
            be3.c(context, retMsg);
            ub3.g("sxcAddBagError", "省心凑加购失败");
        }
    }

    public static void j(kmb kmbVar, JSONObject jSONObject, String str, String str2) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e08f6d0f", new Object[]{kmbVar, jSONObject, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("scm", str2);
        JSONObject jSONObject2 = jSONObject.getJSONObject("utArgs");
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            for (String str3 : jSONObject2.keySet()) {
                if (!(str3 == null || (string = jSONObject2.getString(str3)) == null)) {
                    hashMap.put(str3, string);
                }
            }
        }
        juv.a(kmbVar, "Page_ShoppingCart_Button-AddRecomm", hashMap);
    }

    public static void d(kmb kmbVar, JSONObject jSONObject, String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b38297f0", new Object[]{kmbVar, jSONObject, str, new Boolean(z)});
        } else if (jSONObject != null && kmbVar != null) {
            final Application application = Globals.getApplication();
            if (!zvj.a(application)) {
                int i = R.string.app_network_error;
                be3.c(application, Localization.q(i));
                hdv.a().commitFeedback(c9x.CART_BIZ_NAME, Localization.q(i), UmTypeKey.TOAST, "biz", "network not available");
            }
            String string = jSONObject.getString("itemId");
            String str2 = "sku";
            boolean equals = TextUtils.equals("1", jSONObject.getString(str2));
            String string2 = jSONObject.getString("scm");
            if (!equals) {
                str2 = "cart";
            }
            Map<String, String> e = e(kmbVar.getContext(), str2, str, jSONObject.getString("customParam"));
            String str3 = "";
            if (equals) {
                u2q a2 = u2q.a(string, str3, str3, str3);
                if (e != null) {
                    a2.f = new JSONObject(new HashMap(e));
                    a2.h.add("addBagExParamFromCartFeedFlow");
                }
                z2q.b(a2).f("1", new a(), false);
            } else {
                if (jSONObject.containsKey(q2q.KEY_SKU_ID)) {
                    str3 = jSONObject.getString(q2q.KEY_SKU_ID);
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("addBagExParams");
                if (jSONObject2 != null) {
                    for (String str4 : jSONObject2.keySet()) {
                        e.put(str4, String.valueOf(jSONObject2.get(str4)));
                    }
                }
                c(string, str3, 1, new IRemoteBaseListener() { // from class: com.taobao.android.icart.utils.AddCartUtil.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        Context context = application;
                        int i3 = R.string.ack_msg_add_bag_success;
                        be3.c(context, context.getString(i3));
                        hdv.a().commitFeedback(c9x.CART_BIZ_NAME, application.getString(i3), UmTypeKey.TOAST, "biz", "normal");
                        if (z) {
                            org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                            Intent intent = new Intent(hd3.f20557a);
                            intent.putExtra("stringifyAddCartResult", dataJsonObject.toString());
                            LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcastSync(intent);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                        }
                    }
                }, kmbVar.W().f(), kmbVar, e);
            }
            try {
                j(kmbVar, jSONObject, string, string2);
            } catch (Throwable unused) {
            }
        }
    }

    public static void c(String str, String str2, int i, final IRemoteBaseListener iRemoteBaseListener, String str3, final kmb kmbVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28bf6325", new Object[]{str, str2, new Integer(i), iRemoteBaseListener, str3, kmbVar, map});
            return;
        }
        kmbVar.Y().i(4);
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.trade.addBag");
        mtopRequest.setVersion("3.1");
        mtopRequest.setNeedSession(true);
        mtopRequest.setNeedEcode(true);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("itemId", (Object) str);
        jSONObject.put(q2q.KEY_SKU_ID, (Object) str2);
        jSONObject.put("quantity", (Object) Integer.valueOf(i));
        jSONObject.put("cartFrom", (Object) str3);
        HashMap hashMap = new HashMap();
        hashMap.put("serviceId", "");
        hashMap.put("divisionId", "");
        if (map != null) {
            hashMap.putAll(map);
        }
        jSONObject.put("exParams", (Object) JSON.toJSONString(hashMap));
        mtopRequest.setData(jSONObject.toJSONString());
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.reqMethod(MethodEnum.POST);
        build.setUnitStrategy("UNIT_TRADE");
        final long currentTimeMillis = System.currentTimeMillis();
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.icart.utils.AddCartUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    return;
                }
                kmb.this.Y().a(4);
                AddCartUtil.a(kmb.this.getContext(), mtopResponse);
                IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                if (iRemoteBaseListener2 != null) {
                    iRemoteBaseListener2.onError(i2, mtopResponse, obj);
                }
                AddCartUtil.b(currentTimeMillis, mtopResponse);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    return;
                }
                kmb.this.Y().a(4);
                AddCartUtil.a(kmb.this.getContext(), mtopResponse);
                IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                if (iRemoteBaseListener2 != null) {
                    iRemoteBaseListener2.onSystemError(i2, mtopResponse, obj);
                }
                AddCartUtil.b(currentTimeMillis, mtopResponse);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                    return;
                }
                kmb.this.Y().a(4);
                hav.d("AddCartUtil", "加购成功");
                IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                if (iRemoteBaseListener2 != null) {
                    iRemoteBaseListener2.onSuccess(i2, mtopResponse, baseOutDo, obj);
                }
                nuv.j(DismissPopWeexModule.MODULE_NAME, "AddBagSuccess", 19999, null);
                a3l.a("mtop.trade.addBag", currentTimeMillis, true, "", mtopResponse.getRetMsg());
            }
        }).startRequest();
        nuv.j(DismissPopWeexModule.MODULE_NAME, "AddBagRequest", 19999, null);
        hav.f("AddCartUtil", "开始加购", jSONObject);
    }

    public static Map<String, String> g(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fc8c7290", new Object[]{str, str2, str3, str4, str5});
        }
        JSONObject jSONObject = new JSONObject(4);
        jSONObject.put("cartInstanceId", (Object) str);
        jSONObject.put("channel", (Object) str3);
        jSONObject.put("module", (Object) str4);
        if (str5 != null) {
            jSONObject.put("customParam", (Object) str5);
        }
        return Collections.singletonMap(str2, Base64.encodeToString(JSON.toJSONBytes(jSONObject, new SerializerFeature[0]), 0));
    }
}
