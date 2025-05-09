package com.taobao.tab2interact.plugin.jsbridge;

import android.content.Intent;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.adapter.IStorageAdapter;
import com.taobao.tab2interact.core.layer.h5.view.H5InteractLayerWebView;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.a07;
import tb.bmi;
import tb.ckf;
import tb.fll;
import tb.gg8;
import tb.jmi;
import tb.kpw;
import tb.nsw;
import tb.nwv;
import tb.t2o;
import tb.tfs;
import tb.ud0;
import tb.vff;
import tb.vgh;
import tb.vv1;
import tb.wa;
import tb.xoi;
import tb.yps;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class H5InteractLayerJsBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_GET_CACHE = "getCache";
    private static final String ACTION_GET_ENVINFO = "getEnvInfo";
    public static final String ACTION_POST_NOTIFY = "postNotify";
    public static final String ACTION_SAVE_CACHE = "saveCache";
    private static final String ACTION_SEND_MESSAGE = "sendMessage";
    private static final String TAG = "H5InteractLayerJsBridge";
    public static final a Companion = new a(null);
    private static final Map<String, Object> memoryCache = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963235);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements bmi.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WVCallBackContext f11866a;

        static {
            t2o.a(689963236);
            t2o.a(689963138);
        }

        public b(WVCallBackContext wVCallBackContext) {
            ckf.g(wVCallBackContext, "wvCallBackContext");
            this.f11866a = wVCallBackContext;
        }

        @Override // tb.bmi.a
        public void onResult(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2bc05ded", new Object[]{this, jSONObject});
                return;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            String jSONString = JSON.toJSONString(jSONObject);
            vgh.c(this, H5InteractLayerJsBridge.TAG, "收到消息结果回调，finalResultJSONString=" + jSONString);
            this.f11866a.success(jSONString);
        }
    }

    static {
        t2o.a(689963234);
    }

    private final boolean executeGetEnvInfo(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3df572c", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "envInfo", (String) gg8.a());
        if (wVCallBackContext != null) {
            wVCallBackContext.success(jSONObject.toJSONString());
        }
        return true;
    }

    private final void getCache(String str, WVCallBackContext wVCallBackContext) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7a521a", new Object[]{this, str, wVCallBackContext});
            return;
        }
        JSONObject parseObject = JSON.parseObject(str);
        nsw nswVar = new nsw();
        String string = parseObject.getString("key");
        if (parseObject.getBooleanValue("memory")) {
            obj = memoryCache.get(string);
        } else {
            IStorageAdapter f = ud0.Companion.f();
            ckf.f(string, "key");
            obj = f.a(string);
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                nswVar.a(nwv.I(entry.getKey(), null), entry.getValue());
            }
        }
        nswVar.k();
        if (wVCallBackContext != null) {
            wVCallBackContext.success(nswVar);
        }
    }

    private final Object getWebViewTag(WVCallBackContext wVCallBackContext, int i) {
        IWVWebView iWVWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3847e3ca", new Object[]{this, wVCallBackContext, new Integer(i)});
        }
        if (wVCallBackContext != null) {
            iWVWebView = wVCallBackContext.getWebview();
        } else {
            iWVWebView = null;
        }
        if (!(iWVWebView instanceof H5InteractLayerWebView)) {
            return null;
        }
        return ((H5InteractLayerWebView) iWVWebView).getTag(i);
    }

    public static /* synthetic */ Object ipc$super(H5InteractLayerJsBridge h5InteractLayerJsBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/plugin/jsbridge/H5InteractLayerJsBridge");
    }

    private final void postNotify(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f96d017", new Object[]{this, str, wVCallBackContext});
            return;
        }
        JSONObject parseObject = JSON.parseObject(str);
        String string = parseObject.getString("name");
        JSONObject jSONObject = parseObject.getJSONObject("args");
        if (!TextUtils.isEmpty(string)) {
            try {
                Intent intent = new Intent(string);
                if (!(jSONObject == null || jSONObject.keySet() == null)) {
                    Set<String> keySet = jSONObject.keySet();
                    ckf.f(keySet, "args.keys");
                    for (String str2 : keySet) {
                        putIntentExtra(intent, str2, jSONObject.get(str2));
                    }
                }
                LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(intent);
            } catch (Throwable th) {
                tfs.g("postNotify", th.getMessage());
            }
        }
    }

    private final void putIntentExtra(Intent intent, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13939caf", new Object[]{this, intent, str, obj});
        } else if (obj == null) {
        } else {
            if (obj instanceof Integer) {
                intent.putExtra(str, ((Number) obj).intValue());
            } else if (obj instanceof Float) {
                intent.putExtra(str, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                intent.putExtra(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                intent.putExtra(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                intent.putExtra(str, ((Number) obj).shortValue());
            } else if (obj instanceof String) {
                intent.putExtra(str, (String) obj);
            } else if (obj instanceof CharSequence) {
                intent.putExtra(str, (CharSequence) obj);
            } else if (obj instanceof Character) {
                intent.putExtra(str, ((Character) obj).charValue());
            } else if (obj instanceof Boolean) {
                intent.putExtra(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                intent.putExtra(str, ((Number) obj).byteValue());
            } else {
                intent.putExtra(str, obj.toString());
            }
        }
    }

    private final void saveCache(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c06513", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("key");
            Object obj = parseObject.get("value");
            if (parseObject.getBooleanValue("memory")) {
                Map<String, Object> map = memoryCache;
                ckf.f(string, "key");
                map.put(string, obj);
            } else {
                IStorageAdapter f = ud0.Companion.f();
                ckf.f(string, "key");
                f.b(string, obj);
            }
            nsw nswVar = new nsw();
            nswVar.k();
            if (wVCallBackContext != null) {
                wVCallBackContext.success(nswVar);
            }
        } catch (Exception e) {
            vgh.d(this, TAG, "收到并处理来自前端的消息异常", e);
        }
    }

    private final boolean executeSendMessage(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8913337c", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        Object webViewTag = getWebViewTag(wVCallBackContext, R.id.h5_interact_layer_message_center_tag);
        Object webViewTag2 = getWebViewTag(wVCallBackContext, R.id.h5_interact_layer_base_info_manager_tag);
        Object webViewTag3 = getWebViewTag(wVCallBackContext, R.id.h5_interact_layer_tab_base_info_manager_tag);
        Object webViewTag4 = getWebViewTag(wVCallBackContext, R.id.h5_interact_layer_page_base_info_manager_tag);
        JSONObject parseObject = JSON.parseObject(str);
        vgh.c(this, TAG, "收到并处理来自前端的消息");
        if ((webViewTag instanceof jmi) && (webViewTag2 instanceof vv1) && (webViewTag3 instanceof yps) && (webViewTag4 instanceof fll) && parseObject != null && wVCallBackContext != null) {
            Object obj = parseObject.get("name");
            if (ckf.b(obj, vff.REGISTER_MESSAGES_NAME) || ckf.b(obj, vff.UNREGISTER_MESSAGES_NAME)) {
                handleRegisterOrUnregister((jmi) webViewTag, (vv1) webViewTag2, parseObject, wVCallBackContext, (yps) webViewTag3);
            } else {
                xoi.INSTANCE.b((jmi) webViewTag, (vv1) webViewTag2, parseObject, new b(wVCallBackContext), (yps) webViewTag3, (fll) webViewTag4);
            }
        }
        return true;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        vgh.c(this, TAG, "收到前端调用，action=" + str + "，params=" + str2);
        if (str != null) {
            try {
                switch (str.hashCode()) {
                    case -554082555:
                        if (str.equals(ACTION_GET_ENVINFO)) {
                            return executeGetEnvInfo(str2, wVCallBackContext);
                        }
                        break;
                    case 157705221:
                        if (str.equals("saveCache")) {
                            saveCache(str2, wVCallBackContext);
                            return true;
                        }
                        break;
                    case 691453791:
                        if (str.equals(ACTION_SEND_MESSAGE)) {
                            return executeSendMessage(str2, wVCallBackContext);
                        }
                        break;
                    case 1471423497:
                        if (str.equals("postNotify")) {
                            postNotify(str2, wVCallBackContext);
                            return true;
                        }
                        break;
                    case 1950242252:
                        if (str.equals("getCache")) {
                            getCache(str2, wVCallBackContext);
                            return true;
                        }
                        break;
                }
            } catch (Exception e) {
                vgh.d(this, TAG, "收到并处理来自前端的消息异常", e);
            }
        }
        return false;
    }

    private final void handleRegisterOrUnregister(jmi jmiVar, vv1 vv1Var, JSONObject jSONObject, WVCallBackContext wVCallBackContext, yps ypsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea304b5", new Object[]{this, jmiVar, vv1Var, jSONObject, wVCallBackContext, ypsVar});
            return;
        }
        vgh.c(this, TAG, "处理注册或解注册");
        Object obj = jSONObject.get("args");
        if (!(obj instanceof JSONObject)) {
            vgh.c(this, TAG, "处理注册或解注册，args无效");
            return;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        Object obj2 = jSONObject2.get("target");
        if (!(obj2 instanceof String) || ((CharSequence) obj2).length() == 0) {
            vgh.c(this, TAG, "处理注册或解注册，target无效");
            return;
        }
        Object obj3 = jSONObject2.get(vff.REGISTER_OR_UNREGISTER_MESSAGES_ARGS_MESSAGE_NAMES);
        if (!(obj3 instanceof JSONArray)) {
            vgh.c(this, TAG, "处理注册或解注册，messageNames无效");
            return;
        }
        List<String> parseArray = JSON.parseArray(((JSONArray) obj3).toJSONString(), String.class);
        if (parseArray == null || parseArray.isEmpty()) {
            vgh.c(this, TAG, "处理注册或解注册，messageNameList为空");
            return;
        }
        Object webViewTag = getWebViewTag(wVCallBackContext, R.id.h5_interact_layer_message_observer_tag);
        if (webViewTag instanceof wa) {
            Object obj4 = jSONObject.get("name");
            if (ckf.b(obj4, vff.REGISTER_MESSAGES_NAME)) {
                xoi.INSTANCE.a(jmiVar, vv1Var, (String) obj2, parseArray, (wa) webViewTag, ypsVar);
            } else if (ckf.b(obj4, vff.UNREGISTER_MESSAGES_NAME)) {
                xoi.INSTANCE.c(jmiVar, vv1Var, (String) obj2, parseArray, (wa) webViewTag, ypsVar);
            }
        }
    }
}
