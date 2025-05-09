package com.taobao.android.layoutmanager.setup;

import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.message.WVSubscribePlugin;
import com.taobao.android.layoutmanager.module.PreloadModule;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.module.NotifyModule;
import java.util.HashMap;
import java.util.Map;
import tb.fsw;
import tb.ggs;
import tb.j1x;
import tb.kpw;
import tb.nsw;
import tb.nwv;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class WindvanePluginRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class TBVSGlobalJSBridge extends kpw {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String CLASS_NAME = "TBVSGlobalJSBridge";
        public static final String GET_VIBRATE_SWITCH = "getVibrateSwitch";
        public static final String SET_VIBRATE_SWITCH = "setVibrateSwitch";
        public static final String TAG = "TBVSGlobalJSBridge";
        public static String VIBERATE_STATE = "viberate_state";

        public static /* synthetic */ Object ipc$super(TBVSGlobalJSBridge tBVSGlobalJSBridge, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/setup/WindvanePluginRegister$TBVSGlobalJSBridge");
        }

        private static boolean isViberate(String str, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50d896b2", new Object[]{str, wVCallBackContext})).booleanValue();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("enable", String.valueOf(nwv.o(ggs.a(VIBERATE_STATE), false)));
            if (wVCallBackContext == null) {
                return false;
            }
            wVCallBackContext.success(JSON.toJSONString(hashMap));
            return true;
        }

        @Override // tb.kpw
        public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
            }
            tfs.e("TBVSGlobalJSBridge", "TBVSGlobalJSBridge action = " + str + " params = " + str2);
            if (GET_VIBRATE_SWITCH.equals(str)) {
                return isViberate(str2, wVCallBackContext);
            }
            if (SET_VIBRATE_SWITCH.equals(str)) {
                return setViberate(str2, wVCallBackContext);
            }
            return false;
        }

        private static boolean setViberate(String str, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("778c27ea", new Object[]{str, wVCallBackContext})).booleanValue();
            }
            ggs.e(VIBERATE_STATE, Boolean.valueOf(nwv.o(JSON.parseObject(str).get("setEnable"), false)));
            if (wVCallBackContext != null) {
                wVCallBackContext.success("setViberate success");
            }
            return true;
        }

        static {
            t2o.a(502268174);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class WVWindowInfoPlugin extends kpw {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ACTION_GET_STATUS_BAR_HEIGHT = "getStatusBarHeight";
        public static final String CLASS_NAME = "WVWindowInfo";

        static {
            t2o.a(502268177);
        }

        public static /* synthetic */ Object ipc$super(WVWindowInfoPlugin wVWindowInfoPlugin, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/setup/WindvanePluginRegister$WVWindowInfoPlugin");
        }

        @Override // tb.kpw
        public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
            }
            if (!ACTION_GET_STATUS_BAR_HEIGHT.equals(str)) {
                return false;
            }
            nsw nswVar = new nsw();
            nswVar.k();
            nswVar.a("height", 0);
            wVCallBackContext.success(nswVar);
            return true;
        }
    }

    static {
        t2o.a(502268173);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        fsw.h(WVWindowInfoPlugin.CLASS_NAME, WVWindowInfoPlugin.class);
        fsw.h(WVSubscribePlugin.CLASS_NAME, WVSubscribePlugin.class);
        fsw.h(WVTNodeCachePlugin.CLASS_NAME, WVTNodeCachePlugin.class);
        fsw.h("tnode", WVTNodeWebViewJSBridge.class);
        fsw.h("TBVSGlobalJSBridge", TBVSGlobalJSBridge.class);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class WVTNodeCachePlugin extends kpw {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ACTION_GET_CACHE = "getCache";
        public static final String ACTION_POST_NOTIFY = "postNotify";
        public static final String ACTION_SAVE_CACHE = "saveCache";
        public static final String CLASS_NAME = "TNodeWindVaneBridge";

        static {
            t2o.a(502268175);
        }

        public static /* synthetic */ Object ipc$super(WVTNodeCachePlugin wVTNodeCachePlugin, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/setup/WindvanePluginRegister$WVTNodeCachePlugin");
        }

        @Override // tb.kpw
        public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
            }
            if ("saveCache".equals(str)) {
                try {
                    JSONObject parseObject = JSON.parseObject(str2);
                    String string = parseObject.getString("key");
                    Object obj2 = parseObject.get("value");
                    boolean booleanValue = parseObject.getBooleanValue("memory");
                    if (!TextUtils.isEmpty(string)) {
                        if (booleanValue) {
                            ggs.f(string, obj2);
                        } else {
                            ggs.e(string, obj2);
                        }
                    }
                    JSONArray jSONArray = parseObject.getJSONArray("$preload");
                    if (jSONArray != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("args", (Object) jSONArray);
                        PreloadModule.preload(new d.j(null, jSONObject, null));
                    }
                    nsw nswVar = new nsw();
                    nswVar.k();
                    wVCallBackContext.success(nswVar);
                } catch (Throwable th) {
                    tfs.d(th.getMessage());
                }
                return true;
            } else if ("getCache".equals(str)) {
                JSONObject parseObject2 = JSON.parseObject(str2);
                nsw nswVar2 = new nsw();
                String string2 = parseObject2.getString("key");
                if (parseObject2.getBooleanValue("memory")) {
                    obj = ggs.d(string2);
                } else {
                    obj = ggs.a(string2);
                }
                if (obj instanceof Map) {
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        nswVar2.a(nwv.I(entry.getKey(), null), entry.getValue());
                    }
                }
                nswVar2.k();
                wVCallBackContext.success(nswVar2);
                return true;
            } else {
                if ("postNotify".equals(str)) {
                    JSONObject parseObject3 = JSON.parseObject(str2);
                    String string3 = parseObject3.getString("name");
                    Object obj3 = parseObject3.get("args");
                    if (!TextUtils.isEmpty(string3)) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("name", (Object) string3);
                            jSONObject2.put("args", obj3);
                            NotifyModule.postNotify(new d.j(null, jSONObject2, null));
                        } catch (Throwable th2) {
                            tfs.g("postNotify", th2.getMessage());
                        }
                    }
                }
                return false;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class WVTNodeWebViewJSBridge extends kpw {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String CLASS_NAME = "tnode";
        public static final String TAG = "WebViewComponent";

        static {
            t2o.a(502268176);
        }

        private void doMyHandler(String str, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d30b741", new Object[]{this, str, wVCallBackContext});
                return;
            }
            try {
                JSONObject parseObject = JSON.parseObject(str);
                HashMap hashMap = new HashMap();
                for (String str2 : parseObject.keySet()) {
                    hashMap.put(str2, parseObject.get(str2));
                }
                IWVWebView webview = wVCallBackContext.getWebview();
                if (webview instanceof WVUCWebView) {
                    j1x j1xVar = (j1x) ((WVUCWebView) webview).getTag();
                    if (j1xVar != null) {
                        j1xVar.s("onmessage", hashMap);
                    } else {
                        tfs.e(TAG, "WVTNodeWebViewJSBridge doMyHandler webViewComponent is null");
                    }
                }
                wVCallBackContext.success(new nsw());
            } catch (JSONException unused) {
                wVCallBackContext.error();
            }
        }

        public static /* synthetic */ Object ipc$super(WVTNodeWebViewJSBridge wVTNodeWebViewJSBridge, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/setup/WindvanePluginRegister$WVTNodeWebViewJSBridge");
        }

        @Override // tb.kpw
        public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
            }
            tfs.e(TAG, "WVTNodeWebViewJSBridge action = " + str + " params = " + str2);
            if (!"postMessage".equals(str)) {
                return false;
            }
            doMyHandler(str2, wVCallBackContext);
            return true;
        }
    }
}
