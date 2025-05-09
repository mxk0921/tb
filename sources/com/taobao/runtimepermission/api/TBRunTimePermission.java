package com.taobao.runtimepermission.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.AttributionReporter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.gjb;
import tb.kpw;
import tb.nsw;
import tb.qzl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBRunTimePermission extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_NAME_PARAM_NAME = "bizName";
    public static final String CHECK_PERMISSION_API_NAME = "checkBizPermission";
    public static final String EXPLAIN_PARAM_NAME = "explain";
    public static final String PERMISSIONS_ANDROID_PARAM_NAME = "permissions4Android";
    public static final String PERMISSIONS_PARAM_NAME = "permissions";
    public static final String REQUEST_BIZ_PERMISSION_API_NAME = "requestBizPermission";
    public static final String REQUEST_PERMISSION_API_NAME = "requestPermission";
    public static final String SILENCE_INTERVAL_NAME = "silenceInterval";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements gjb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nsw f11505a;
        public final /* synthetic */ WVCallBackContext b;

        public a(nsw nswVar, WVCallBackContext wVCallBackContext) {
            this.f11505a = nswVar;
            this.b = wVCallBackContext;
        }

        @Override // tb.gjb
        public void a(qzl qzlVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("475e28c8", new Object[]{this, qzlVar});
                return;
            }
            try {
                JSONObject access$000 = TBRunTimePermission.access$000(TBRunTimePermission.this, qzlVar);
                if (access$000 == null) {
                    this.f11505a.b("errMsg", "result json is empty.");
                    this.b.error(this.f11505a);
                }
                this.f11505a.d("result", access$000);
                this.b.success(this.f11505a);
            } catch (JSONException e) {
                nsw nswVar = this.f11505a;
                nswVar.b("errMsg", "failed: occur exception " + e);
                this.b.error(this.f11505a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f11506a;

        public b(WVCallBackContext wVCallBackContext) {
            this.f11506a = wVCallBackContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f11506a.success();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nsw f11507a;
        public final /* synthetic */ WVCallBackContext b;

        public c(nsw nswVar, WVCallBackContext wVCallBackContext) {
            this.f11507a = nswVar;
            this.b = wVCallBackContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f11507a.b("msg", "failed: permissions are denied.");
            this.b.error(this.f11507a);
        }
    }

    public static /* synthetic */ JSONObject access$000(TBRunTimePermission tBRunTimePermission, qzl qzlVar) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f932210b", new Object[]{tBRunTimePermission, qzlVar});
        }
        return tBRunTimePermission.ConvertPermissionResult2JsonObj(qzlVar);
    }

    public static /* synthetic */ Object ipc$super(TBRunTimePermission tBRunTimePermission, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/runtimepermission/api/TBRunTimePermission");
    }

    private JSONObject ConvertPermissionResult2JsonObj(qzl qzlVar) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("90759d85", new Object[]{this, qzlVar});
        }
        if (qzlVar == null || qzlVar.f27021a == null || qzlVar.b == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < qzlVar.f27021a.length; i++) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AttributionReporter.SYSTEM_PERMISSION, qzlVar.f27021a[i]);
            jSONObject2.put("grantStatus", qzlVar.b[i]);
            jSONObject2.put("msg", qzlVar.c[i]);
            jSONObject.put(qzlVar.f27021a[i], jSONObject2);
        }
        return jSONObject;
    }

    private void checkPermission(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54ef4785", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("bizName", "");
            JSONArray jSONArray = jSONObject.getJSONArray(PERMISSIONS_ANDROID_PARAM_NAME);
            if (jSONArray.length() < 1) {
                wVCallBackContext.error("HY_PARAM_ERR");
                return;
            }
            String[] strArr = new String[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                strArr[i] = (String) jSONArray.get(i);
            }
            IWVWebView webview = wVCallBackContext.getWebview();
            if (webview == null) {
                nswVar.b("errMsg", "error: webview is empty!");
                wVCallBackContext.error(nswVar);
                return;
            }
            qzl d = com.taobao.runtimepermission.a.d(webview.getContext(), optString, strArr);
            if (d == null) {
                nswVar.b("errMsg", "error: check with empty result!");
                wVCallBackContext.error(nswVar);
                return;
            }
            JSONObject ConvertPermissionResult2JsonObj = ConvertPermissionResult2JsonObj(d);
            if (ConvertPermissionResult2JsonObj == null) {
                nswVar.b("errMsg", "result json is empty.");
                wVCallBackContext.error(nswVar);
            }
            nswVar.d("result", ConvertPermissionResult2JsonObj);
            wVCallBackContext.success(nswVar);
        } catch (Throwable th) {
            nswVar.b("errMsg", "error: occur exception " + th);
            wVCallBackContext.error(nswVar);
        }
    }

    private void requestBizPermission(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318a0081", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("bizName");
            JSONArray jSONArray = jSONObject.getJSONArray(PERMISSIONS_ANDROID_PARAM_NAME);
            String string2 = jSONObject.getString(EXPLAIN_PARAM_NAME);
            long optLong = jSONObject.optLong(SILENCE_INTERVAL_NAME, -1L);
            if (!(jSONArray == null || jSONArray.length() == 0)) {
                String[] strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = jSONArray.getString(i);
                }
                IWVWebView webview = wVCallBackContext.getWebview();
                if (webview == null) {
                    nswVar.b("errMsg", "error: webview is empty!");
                    wVCallBackContext.error(nswVar);
                    return;
                }
                com.taobao.runtimepermission.a.c(webview.getContext(), strArr).x(true).B(true).w(string2).t(string).y(optLong).u(new a(nswVar, wVCallBackContext)).m();
                return;
            }
            nswVar.b("errMsg", "error: permissions are empty!");
            wVCallBackContext.error(nswVar);
        } catch (Throwable th) {
            nswVar.b("errMsg", "failed: occur exception " + th);
            wVCallBackContext.error(nswVar);
        }
    }

    private void requestPermission(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3457938c", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("bizName");
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            String string2 = jSONObject.getString(EXPLAIN_PARAM_NAME);
            long optLong = jSONObject.optLong(SILENCE_INTERVAL_NAME, -1L);
            if (!(jSONArray == null || jSONArray.length() == 0)) {
                String[] strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = jSONArray.getString(i);
                }
                IWVWebView webview = wVCallBackContext.getWebview();
                if (webview == null) {
                    nswVar.b("errMsg", "error: webview is empty!");
                    wVCallBackContext.error(nswVar);
                    return;
                }
                com.taobao.runtimepermission.a.c(webview.getContext(), strArr).x(true).B(false).w(string2).t(string).y(optLong).z(new c(nswVar, wVCallBackContext)).A(new b(wVCallBackContext)).m();
                return;
            }
            nswVar.b("errMsg", "error: permissions are empty!");
            wVCallBackContext.error(nswVar);
        } catch (Throwable th) {
            nswVar.b("errMsg", "error: occur exception " + th);
            wVCallBackContext.error(nswVar);
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(str, REQUEST_PERMISSION_API_NAME)) {
            requestPermission(str2, wVCallBackContext);
            return true;
        } else if (TextUtils.equals(str, REQUEST_BIZ_PERMISSION_API_NAME)) {
            requestBizPermission(str2, wVCallBackContext);
            return true;
        } else if (!TextUtils.equals(str, CHECK_PERMISSION_API_NAME)) {
            return false;
        } else {
            checkPermission(str2, wVCallBackContext);
            return true;
        }
    }
}
