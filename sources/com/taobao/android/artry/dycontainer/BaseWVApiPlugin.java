package com.taobao.android.artry.dycontainer;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.constants.ResultCode;
import com.taobao.android.artry.resource.ResourceManager;
import com.taobao.android.artry.tblife.WVARCameraView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.a2i;
import tb.dxv;
import tb.fsw;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.txq;
import tb.uae;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BaseWVApiPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DOWNLOAD_RESOURCE = "downloadResources";
    private static final String IS_SUPPORT = "isSupport";
    public static final String RESOURCE_LIST_KEY = "resourceList";
    public static final String RESULT_CODE = "resultCode";
    private static final String TAG = "BaseWVApiPlugin";
    private static final String WV_PLUGIN_NAME = "ARTry";
    private static final String WV_PLUGIN_SKIN_ANALYSIS = "ARSkinAnalysis";
    private static Map<String, uae> mWVActionListenerMap;
    private static BaseWVApiPlugin sInstance;

    static {
        t2o.a(396361779);
    }

    private BaseWVApiPlugin() {
    }

    public static void addWVActionListener(IWVWebView iWVWebView, uae uaeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dd5fc2d", new Object[]{iWVWebView, uaeVar});
        } else if (iWVWebView != null && uaeVar != null) {
            if (mWVActionListenerMap == null) {
                mWVActionListenerMap = new HashMap();
                BaseWVApiPlugin baseWVApiPlugin = new BaseWVApiPlugin();
                sInstance = baseWVApiPlugin;
                fsw.k(WV_PLUGIN_NAME, baseWVApiPlugin);
                fsw.k(WV_PLUGIN_SKIN_ANALYSIS, sInstance);
                fsw.k(WVARCameraView.AR_CAMERA_WV_PLUGIN_TYPE, sInstance);
            }
            Map<String, uae> map = mWVActionListenerMap;
            map.put(iWVWebView.hashCode() + "", uaeVar);
        }
    }

    public static void fireWVEventSafety(String str, String str2, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da4aaf6", new Object[]{str, str2, iWVWebView});
        } else {
            new b(str, str2, iWVWebView).run();
        }
    }

    public static void invokeWVCallbackSafety(boolean z, nsw nswVar, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d59a8a", new Object[]{new Boolean(z), nswVar, wVCallBackContext});
        } else {
            new b(z, nswVar, wVCallBackContext).run();
        }
    }

    public static /* synthetic */ Object ipc$super(BaseWVApiPlugin baseWVApiPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/artry/dycontainer/BaseWVApiPlugin");
    }

    public static void removeWVActionListener(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ab4df8", new Object[]{iWVWebView});
        } else if (iWVWebView != null && !dxv.i(mWVActionListenerMap)) {
            Map<String, uae> map = mWVActionListenerMap;
            map.remove(iWVWebView.hashCode() + "");
            if (dxv.i(mWVActionListenerMap)) {
                fsw.p(WV_PLUGIN_NAME);
                fsw.p(WV_PLUGIN_SKIN_ANALYSIS);
                fsw.p(WVARCameraView.AR_CAMERA_WV_PLUGIN_TYPE);
                mWVActionListenerMap = null;
                sInstance = null;
            }
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IWVWebView webview;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(str, DOWNLOAD_RESOURCE)) {
            try {
                downloadResource(this.mContext, dxv.c(str2), wVCallBackContext);
            } catch (Throwable th) {
                Log.e(TAG, "failed to invoke the downloadResource..." + th);
            }
            return true;
        } else if (TextUtils.equals(str, "isSupport")) {
            try {
                JSONObject c = txq.c(false, dxv.c(str2));
                nsw nswVar = new nsw("HY_SUCCESS");
                nswVar.h(dxv.b(c));
                invokeWVCallbackSafety(true, nswVar, wVCallBackContext);
            } catch (Throwable th2) {
                Log.e(TAG, "failed to invoke the downloadResource..." + th2);
            }
            return true;
        } else {
            if (!(wVCallBackContext == null || (webview = wVCallBackContext.getWebview()) == null)) {
                String str3 = webview.hashCode() + "";
                if (!dxv.i(mWVActionListenerMap) && mWVActionListenerMap.containsKey(str3)) {
                    try {
                        uae uaeVar = mWVActionListenerMap.get(str3);
                        if (uaeVar != null) {
                            return uaeVar.onAction(str, str2, wVCallBackContext);
                        }
                    } catch (Throwable th3) {
                        Log.e(TAG, "failed to invoke the IWVActionListener..." + th3);
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f6377a;
        private nsw b;
        private WVCallBackContext c;
        private String d;
        private String e;
        private IWVWebView f;

        static {
            t2o.a(396361781);
        }

        @Override // java.lang.Runnable
        public void run() {
            nsw nswVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (dxv.k()) {
                try {
                    WVCallBackContext wVCallBackContext = this.c;
                    if (!(wVCallBackContext == null || (nswVar = this.b) == null)) {
                        if (this.f6377a) {
                            wVCallBackContext.success(nswVar);
                        } else {
                            wVCallBackContext.error(nswVar);
                        }
                    }
                    if (this.f != null && !TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(this.e)) {
                        WVCallBackContext.fireEvent(this.f, this.d, this.e);
                    }
                } catch (Throwable th) {
                    Log.e(BaseWVApiPlugin.TAG, "failed to invoke wv call back..." + th);
                }
            } else {
                a2i.a().post(this);
            }
        }

        private b(boolean z, nsw nswVar, WVCallBackContext wVCallBackContext) {
            this.f6377a = z;
            this.b = nswVar;
            this.c = wVCallBackContext;
        }

        private b(String str, String str2, IWVWebView iWVWebView) {
            this.d = str;
            this.e = str2;
            this.f = iWVWebView;
        }
    }

    private void downloadResource(Context context, JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8864c2e2", new Object[]{this, context, jSONObject, wVCallBackContext});
            return;
        }
        JSONArray jSONArray = null;
        String string = jSONObject == null ? null : jSONObject.getString("bizCode");
        if (jSONObject != null) {
            jSONArray = jSONObject.getJSONArray(RESOURCE_LIST_KEY);
        }
        if (TextUtils.isEmpty(string) || dxv.h(jSONArray)) {
            nsw nswVar = new nsw("HY_FAILED");
            nswVar.b("resultCode", ResultCode.FAILURE_INVALIDATE_PARAM.name());
            invokeWVCallbackSafety(false, nswVar, wVCallBackContext);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                String obj = next.toString();
                if (dxv.j(obj) && !arrayList.contains(obj)) {
                    arrayList.add(obj);
                }
            }
        }
        ResourceManager.d().f(context);
        ResourceManager.d().i(string, arrayList);
        nsw nswVar2 = new nsw("HY_SUCCESS");
        nswVar2.b("resultCode", ResultCode.SUCCESS.name());
        invokeWVCallbackSafety(true, nswVar2, wVCallBackContext);
    }
}
