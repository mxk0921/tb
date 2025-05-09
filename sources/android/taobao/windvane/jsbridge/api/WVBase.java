package android.taobao.windvane.jsbridge.api;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.taobao.windvane.config.EnvEnum;
import android.taobao.windvane.jsbridge.IJsApiFailedCallBack;
import android.taobao.windvane.jsbridge.IJsApiSucceedCallBack;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WVJsBridge;
import android.taobao.windvane.webview.WVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.iuv;
import tb.kpw;
import tb.nsw;
import tb.og8;
import tb.oyl;
import tb.spw;
import tb.t2o;
import tb.t6s;
import tb.v7t;
import tb.vpw;
import tb.x74;
import tb.y71;
import tb.yaa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVBase extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements IJsApiSucceedCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(WVBase wVBase) {
        }

        @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
        public void succeed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5b77b53", new Object[]{this, str});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class b implements IJsApiFailedCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(WVBase wVBase) {
        }

        @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
        public void fail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("534fc72f", new Object[]{this, str});
            }
        }
    }

    static {
        t2o.a(989856248);
    }

    private void copyToClipboard(WVCallBackContext wVCallBackContext, String str) {
        JSONException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac239634", new Object[]{this, wVCallBackContext, str});
            return;
        }
        nsw nswVar = new nsw("HY_PARAM_ERR");
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("text")) {
                    String string = jSONObject.getString("text");
                    ((ClipboardManager) this.mWebView.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(string, string));
                    nsw nswVar2 = new nsw("HY_SUCCESS");
                    try {
                        wVCallBackContext.success(nswVar2);
                        return;
                    } catch (JSONException e2) {
                        e = e2;
                        nswVar = nswVar2;
                        e.printStackTrace();
                        nswVar.b("msg", "HY_PARAM_ERR");
                        wVCallBackContext.error(nswVar);
                    }
                }
            } catch (JSONException e3) {
                e = e3;
            }
        }
        nswVar.b("msg", "HY_PARAM_ERR");
        wVCallBackContext.error(nswVar);
    }

    public static /* synthetic */ Object ipc$super(WVBase wVBase, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVBase");
    }

    private void reportJSAPIParams(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2adfe5e", new Object[]{this, str, str2});
        } else if (vpw.commonConfig.N1) {
            com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
            jSONObject.put("apiName", (Object) str);
            jSONObject.put("params", (Object) str2);
            y71.commitSuccess("baseIsInstalled", jSONObject.toJSONString());
        }
    }

    public void addTailJSBridge(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b748fd11", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("className");
            String string2 = jSONObject.getString("handlerName");
            String string3 = jSONObject.getString("params");
            spw spwVar = new spw();
            spwVar.d = string;
            spwVar.e = string2;
            spwVar.f = string3;
            spwVar.f28213a = this.mWebView;
            spwVar.i = new a(this);
            spwVar.h = new b(this);
            if (WVJsBridge.g().c == null) {
                WVJsBridge.g().c = new ArrayList<>();
            }
            WVJsBridge.g().c.add(spwVar);
            v7t.i("Base", "addTailJSBridge : " + str);
        } catch (Exception unused) {
        }
    }

    public void isInstall(WVCallBackContext wVCallBackContext, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d42adf", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            reportJSAPIParams("isInstall", str);
            str2 = new JSONObject(str).getString("android");
        } catch (JSONException unused) {
            v7t.d("Base", "isInstall parse params error, params: " + str);
            str2 = null;
        }
        nsw nswVar = new nsw();
        boolean j = x74.j(this.mWebView.getContext(), str2);
        if (v7t.h()) {
            v7t.a("Base", "isInstall " + j + " for package " + str2);
        }
        if (j) {
            nswVar.b("version", x74.g(this.mWebView.getContext(), str2));
            wVCallBackContext.success(nswVar);
            return;
        }
        wVCallBackContext.error(nswVar);
    }

    public void isWindVaneSDK(WVCallBackContext wVCallBackContext, String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f579a14", new Object[]{this, wVCallBackContext, str});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.b("os", "android");
        nswVar.b("version", yaa.VERSION);
        nswVar.a("debug", Boolean.valueOf(og8.b()));
        if (v7t.h()) {
            v7t.a("Base", "isWindVaneSDK: version=8.5.0");
        }
        if (EnvEnum.DAILY.equals(yaa.j)) {
            str2 = "daily";
        } else if (EnvEnum.PRE.equals(yaa.j)) {
            str2 = "pre";
        } else {
            str2 = "release";
        }
        nswVar.b("env", str2);
        if (this.mWebView instanceof WVWebView) {
            str3 = "WVWebView";
        } else {
            str3 = "WVUCWebView";
        }
        nswVar.b("container", str3);
        wVCallBackContext.success(nswVar);
    }

    public void openBrowser(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("237ec70c", new Object[]{this, wVCallBackContext, str});
        } else if (!vpw.commonConfig.e1) {
            nsw nswVar = new nsw("HY_FAILED");
            nswVar.b("reason", "disable openBrowser");
            wVCallBackContext.error(nswVar);
        } else {
            try {
                String string = new JSONObject(str).getString("url");
                if (!TextUtils.isEmpty(string)) {
                    this.mContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
                    wVCallBackContext.success();
                } else {
                    nsw nswVar2 = new nsw("HY_PARAM_ERR");
                    nswVar2.b("reason", "url is null");
                    wVCallBackContext.error(nswVar2);
                }
            } catch (Exception e) {
                e.printStackTrace();
                nsw nswVar3 = new nsw("HY_PARAM_ERR");
                nswVar3.b("reason", "JSONException: " + e);
                wVCallBackContext.error(nswVar3);
            }
        }
    }

    public void isAppsInstalled(WVCallBackContext wVCallBackContext, String str) {
        PackageInfo packageInfo;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7aadac", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            reportJSAPIParams("isAppsInstalled", str);
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            nsw nswVar = new nsw();
            PackageManager packageManager = this.mWebView.getContext().getPackageManager();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    try {
                        packageInfo = packageManager.getPackageInfo(jSONObject.getJSONObject(next).optString("android"), 0);
                    } catch (Exception unused) {
                        packageInfo = null;
                    }
                    if (packageInfo == null) {
                        str2 = "0";
                    } else {
                        str2 = "1";
                    }
                    nswVar.b(next, str2);
                } catch (JSONException e) {
                    e.printStackTrace();
                    nswVar.b(next, "0");
                }
            }
            nswVar.k();
            wVCallBackContext.success(nswVar);
        } catch (JSONException e2) {
            e2.printStackTrace();
            wVCallBackContext.error();
        }
    }

    public void checkPermissions(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea1c66a", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("permissions");
                if (jSONArray.length() < 1) {
                    wVCallBackContext.error("HY_PARAM_ERR");
                    return;
                }
                String[] strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = (String) jSONArray.get(i);
                }
                Map<String, String> b2 = oyl.b(this.mContext, strArr);
                if (b2 == null || b2.size() <= 0) {
                    wVCallBackContext.error(new nsw("HY_FAILED"));
                    return;
                }
                nsw nswVar = new nsw("HY_SUCCESS");
                nswVar.d("result", new JSONObject(b2));
                wVCallBackContext.success(nswVar);
            } catch (JSONException e) {
                e.printStackTrace();
                nsw nswVar2 = new nsw("HY_PARAM_ERR");
                nswVar2.b("reason", "JSONException: " + e);
                wVCallBackContext.error(nswVar2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
            nsw nswVar3 = new nsw("HY_PARAM_ERR");
            nswVar3.b("reason", "JSONException: " + e2);
            wVCallBackContext.error(nswVar3);
        }
    }

    public void commitUTEvent(WVCallBackContext wVCallBackContext, String str) {
        String[] strArr;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908e4832", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("eventId");
            String string = jSONObject.getString("arg1");
            String string2 = jSONObject.getString("arg2");
            String string3 = jSONObject.getString("arg3");
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            if (jSONObject2 != null) {
                strArr = new String[jSONObject2.length()];
                Iterator<String> keys = jSONObject2.keys();
                int i2 = 0;
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string4 = jSONObject2.getString(next);
                    strArr[i2] = next + "=" + string4;
                    i2++;
                }
            } else {
                strArr = null;
            }
            if (64403 == i) {
                try {
                    iuv.commitEvent(i, string, string2, string3, strArr);
                } catch (JSONException unused) {
                }
                z = true;
            }
        } catch (JSONException unused2) {
        }
        nsw nswVar = new nsw();
        if (z) {
            wVCallBackContext.success(nswVar);
            if (v7t.h()) {
                v7t.a("Base", "commitUTEvent: param=" + str);
                return;
            }
            return;
        }
        v7t.d("Base", "commitUTEvent: parameter error, param=" + str);
        nswVar.j("HY_PARAM_ERR");
        wVCallBackContext.error(nswVar);
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("isWindVaneSDK".equals(str)) {
            isWindVaneSDK(wVCallBackContext, str2);
        } else if ("plusUT".equals(str)) {
            plusUT(wVCallBackContext, str2);
        } else if ("commitUTEvent".equals(str)) {
            commitUTEvent(wVCallBackContext, str2);
        } else if ("isInstall".equals(str)) {
            isInstall(wVCallBackContext, str2);
        } else if ("isAppsInstalled".equals(str)) {
            isAppsInstalled(wVCallBackContext, str2);
        } else if ("copyToClipboard".equals(str)) {
            copyToClipboard(wVCallBackContext, str2);
        } else if ("addTailJSBridge".equals(str)) {
            addTailJSBridge(wVCallBackContext, str2);
        } else if ("checkPermissions".equals(str)) {
            checkPermissions(wVCallBackContext, str2);
        } else if (!t6s.BRIDGE_ACTION_OPENBROWSER.equals(str)) {
            return false;
        } else {
            openBrowser(wVCallBackContext, str2);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void plusUT(android.taobao.windvane.jsbridge.WVCallBackContext r14, java.lang.String r15) {
        /*
            r13 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "args"
            com.android.alibaba.ip.runtime.IpChange r3 = android.taobao.windvane.jsbridge.api.WVBase.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001a
            java.lang.String r2 = "ada16587"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r13
            r4[r1] = r14
            r14 = 2
            r4[r14] = r15
            r3.ipc$dispatch(r2, r4)
            return
        L_0x001a:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: JSONException -> 0x0079
            r3.<init>(r15)     // Catch: JSONException -> 0x0079
            java.lang.String r4 = "eid"
            int r4 = r3.getInt(r4)     // Catch: JSONException -> 0x0079
            java.lang.String r5 = "a1"
            java.lang.String r5 = r3.getString(r5)     // Catch: JSONException -> 0x0079
            java.lang.String r6 = "a2"
            java.lang.String r6 = r3.getString(r6)     // Catch: JSONException -> 0x0079
            java.lang.String r7 = "a3"
            java.lang.String r7 = r3.getString(r7)     // Catch: JSONException -> 0x0079
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch: JSONException -> 0x0079
            boolean r9 = r3.has(r2)     // Catch: JSONException -> 0x0079
            if (r9 == 0) goto L_0x007b
            org.json.JSONObject r2 = r3.getJSONObject(r2)     // Catch: JSONException -> 0x0079
            if (r2 == 0) goto L_0x007b
            int r3 = r2.length()     // Catch: JSONException -> 0x0079
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch: JSONException -> 0x0079
            java.util.Iterator r3 = r2.keys()     // Catch: JSONException -> 0x0079
            r9 = 0
        L_0x0051:
            boolean r10 = r3.hasNext()     // Catch: JSONException -> 0x0079
            if (r10 == 0) goto L_0x007b
            java.lang.Object r10 = r3.next()     // Catch: JSONException -> 0x0079
            java.lang.String r10 = (java.lang.String) r10     // Catch: JSONException -> 0x0079
            java.lang.String r11 = r2.getString(r10)     // Catch: JSONException -> 0x0079
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: JSONException -> 0x0079
            r12.<init>()     // Catch: JSONException -> 0x0079
            r12.append(r10)     // Catch: JSONException -> 0x0079
            java.lang.String r10 = "="
            r12.append(r10)     // Catch: JSONException -> 0x0079
            r12.append(r11)     // Catch: JSONException -> 0x0079
            java.lang.String r10 = r12.toString()     // Catch: JSONException -> 0x0079
            r8[r9] = r10     // Catch: JSONException -> 0x0079
            int r9 = r9 + r1
            goto L_0x0051
        L_0x0079:
            r1 = move-exception
            goto L_0x008f
        L_0x007b:
            r2 = 9100(0x238c, float:1.2752E-41)
            if (r4 < r2) goto L_0x0083
            r2 = 9200(0x23f0, float:1.2892E-41)
            if (r4 < r2) goto L_0x0087
        L_0x0083:
            r2 = 19999(0x4e1f, float:2.8025E-41)
            if (r4 != r2) goto L_0x0092
        L_0x0087:
            tb.iuv.commitEvent(r4, r5, r6, r7, r8)     // Catch: JSONException -> 0x008c
            r0 = 1
            goto L_0x0092
        L_0x008c:
            r0 = move-exception
            r1 = r0
            r0 = 1
        L_0x008f:
            r1.printStackTrace()
        L_0x0092:
            tb.nsw r1 = new tb.nsw
            r1.<init>()
            java.lang.String r2 = "Base"
            if (r0 == 0) goto L_0x00b7
            r14.success(r1)
            boolean r14 = tb.v7t.h()
            if (r14 == 0) goto L_0x00d1
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "plusUT: param="
            r14.<init>(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            tb.v7t.a(r2, r14)
            goto L_0x00d1
        L_0x00b7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "plusUT: parameter error, param="
            r0.<init>(r3)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            tb.v7t.d(r2, r15)
            java.lang.String r15 = "HY_PARAM_ERR"
            r1.j(r15)
            r14.error(r1)
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.jsbridge.api.WVBase.plusUT(android.taobao.windvane.jsbridge.WVCallBackContext, java.lang.String):void");
    }
}
