package android.taobao.windvane.jsbridge;

import android.content.Context;
import android.os.SystemClock;
import android.taobao.windvane.extra.performance2.IPerformance;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import tb.acd;
import tb.avt;
import tb.cce;
import tb.dgw;
import tb.kpw;
import tb.l2o;
import tb.mdd;
import tb.nsw;
import tb.t2o;
import tb.tc;
import tb.v4s;
import tb.v7t;
import tb.vpw;
import tb.vxm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVH5PP extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVH5PP";
    private Set<String> launcherPropertiedSet;
    private Set<String> launcherStagedSet;
    private final List<JSONObject> mH5CustomProperties = new CopyOnWriteArrayList();
    private Set<String> procedurePropertiedSet;
    private Set<String> procedureStagedSet;

    static {
        t2o.a(989856224);
    }

    private static mdd getProcedure(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("be362f91", new Object[]{view});
        }
        return vxm.b.g(view);
    }

    public static /* synthetic */ Object ipc$super(WVH5PP wvh5pp, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/WVH5PP");
    }

    public static boolean mark(String str, WVCallBackContext wVCallBackContext) {
        IWVWebView webview;
        View view;
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35abeddf", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        if (!vpw.commonConfig.Y0 || wVCallBackContext == null || (webview = wVCallBackContext.getWebview()) == null || (view = webview.getView()) == null || (parseObject = JSON.parseObject(str)) == null) {
            return false;
        }
        String string = parseObject.getString("bizId");
        if (string == null) {
            string = "";
        }
        mdd procedure = getProcedure(view);
        if (procedure == null || !procedure.isAlive()) {
            return false;
        }
        procedure.b(string, parseObject);
        wVCallBackContext.success();
        return true;
    }

    private void procedureStage(org.json.JSONObject jSONObject, Set<String> set, IWVWebView iWVWebView) throws JSONException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f8bda57", new Object[]{this, jSONObject, set, iWVWebView});
        } else if (iWVWebView instanceof WVUCWebView) {
            cce webViewPageModel = ((WVUCWebView) iWVWebView).getWebViewContext().getWebViewPageModel();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!set.contains(next)) {
                    long a2 = avt.a(jSONObject.getLong(next));
                    Long valueOf = Long.valueOf(a2);
                    v7t.d(TAG, "stage:" + next + " time:" + valueOf);
                    if (next.startsWith("H5_JST_")) {
                        webViewPageModel.onStageIfAbsent(next, a2);
                        str = next;
                    } else {
                        str = "H5_H5_".concat(next);
                        webViewPageModel.onStageIfAbsent(str, a2);
                    }
                    if ((iWVWebView instanceof IPerformance) && vpw.commonConfig.c1) {
                        ((IPerformance) iWVWebView).receiveOnStage(str);
                    }
                    set.add(next);
                } else {
                    v7t.d(TAG, "stage add abort because added:" + next);
                }
            }
        }
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        this.launcherStagedSet = new HashSet();
        this.procedureStagedSet = new HashSet();
        this.launcherPropertiedSet = new HashSet();
        this.procedurePropertiedSet = new HashSet();
    }

    public final void onProperty(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede39322", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            IWVWebView webview = wVCallBackContext.getWebview();
            if (!(webview instanceof View) || vpw.commonConfig.J2 || tc.a((View) webview)) {
                org.json.JSONObject optJSONObject = new org.json.JSONObject(str).optJSONObject("property");
                if (optJSONObject != null && optJSONObject.length() > 0) {
                    if (wVCallBackContext.getWebview() instanceof IPerformance) {
                        if (((IPerformance) wVCallBackContext.getWebview()).isPreInit()) {
                            v7t.d(TAG, "isPreInit skip onProperty");
                            return;
                        } else if (vpw.commonConfig.c1) {
                            ((IPerformance) wVCallBackContext.getWebview()).receiveOnProperty(optJSONObject);
                        }
                    }
                    if (!(wVCallBackContext.getWebview() instanceof acd) || !((acd) wVCallBackContext.getWebview()).isPreRender()) {
                        procedureProperty(optJSONObject, this.launcherPropertiedSet, wVCallBackContext);
                    } else {
                        v7t.d(TAG, "isPreRender skip onProperty");
                        return;
                    }
                }
                wVCallBackContext.success();
                return;
            }
            nsw nswVar = new nsw();
            nswVar.b("msg", "apm report is manually disabled");
            wVCallBackContext.error(nswVar);
        } catch (Throwable unused) {
            wVCallBackContext.error();
        }
    }

    public final void onStage(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd14a0ed", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            IWVWebView webview = wVCallBackContext.getWebview();
            if (!(webview instanceof View) || vpw.commonConfig.J2 || tc.a((View) webview)) {
                org.json.JSONObject optJSONObject = new org.json.JSONObject(str).optJSONObject(v4s.PARAM_UPLOAD_STAGE);
                if (optJSONObject != null && optJSONObject.length() > 0) {
                    if ((wVCallBackContext.getWebview() instanceof IPerformance) && ((IPerformance) wVCallBackContext.getWebview()).isPreInit()) {
                        v7t.d(TAG, "isPreInit skip onStage");
                        return;
                    } else if (!(wVCallBackContext.getWebview() instanceof acd) || !((acd) wVCallBackContext.getWebview()).isPreRender()) {
                        procedureStage(optJSONObject, this.procedureStagedSet, wVCallBackContext.getWebview());
                    } else {
                        v7t.d(TAG, "isPreRender skip onStage");
                        return;
                    }
                }
                wVCallBackContext.success();
                return;
            }
            nsw nswVar = new nsw();
            nswVar.b("msg", "apm report is manually disabled");
            wVCallBackContext.error(nswVar);
        } catch (Throwable unused) {
            wVCallBackContext.error();
        }
    }

    public final void receiveFPTime(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38304a28", new Object[]{this, str, wVCallBackContext});
        } else if (this.performance != null) {
            try {
                long optLong = new org.json.JSONObject(str).optLong("time");
                if (optLong != 0) {
                    this.performance.receiveJSMessageForFP(optLong);
                }
                wVCallBackContext.success();
            } catch (Exception unused) {
                wVCallBackContext.error();
            }
        }
    }

    public final void receiveFSPTime(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa52d5b", new Object[]{this, str, wVCallBackContext});
        } else if (this.performance != null) {
            try {
                long optLong = new org.json.JSONObject(str).optLong("time");
                if (optLong != 0) {
                    this.performance.receiveJSMessageForFSP(optLong);
                }
                wVCallBackContext.success();
            } catch (Exception unused) {
                wVCallBackContext.error();
            }
        }
    }

    public final void receiveTTITime(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd1d1781", new Object[]{this, str, wVCallBackContext});
        } else if (this.performance != null) {
            try {
                long optLong = new org.json.JSONObject(str).optLong("time");
                if (optLong != 0) {
                    this.performance.receiveJSMessageForTTI(optLong);
                }
                wVCallBackContext.success();
            } catch (Exception unused) {
                wVCallBackContext.error();
            }
        }
    }

    private void procedureProperty(org.json.JSONObject jSONObject, Set<String> set, WVCallBackContext wVCallBackContext) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1c1df4d", new Object[]{this, jSONObject, set, wVCallBackContext});
            return;
        }
        IWVWebView webview = wVCallBackContext.getWebview();
        if (webview instanceof WVUCWebView) {
            cce webViewPageModel = ((WVUCWebView) webview).getWebViewContext().getWebViewPageModel();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!set.contains(next)) {
                    String string = jSONObject.getString(next);
                    v7t.d(TAG, "key:" + next + " value:" + string);
                    IWVWebView webview2 = wVCallBackContext.getWebview();
                    if ("isFinished".equals(next) && "true".equalsIgnoreCase(string)) {
                        if (webview2 instanceof WebView) {
                            ((WebView) webview2).setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
                            v7t.d(TAG, "receive isFinished setTag " + SystemClock.uptimeMillis());
                        }
                        if (webview2 instanceof IPerformance) {
                            ((IPerformance) webview2).setReportedFSP(true);
                        }
                    }
                    if (next.startsWith("H5_JST_")) {
                        webViewPageModel.onPropertyIfAbsent(next, string);
                    } else {
                        webViewPageModel.onPropertyIfAbsent("H5_H5_".concat(next), string);
                    }
                    set.add(next);
                } else {
                    v7t.d(TAG, "property add abort because added:" + next);
                }
            }
        }
    }

    public final void addH5CustomProperty(String str, WVCallBackContext wVCallBackContext) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8107a2", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            if (!vpw.commonConfig.m1) {
                wVCallBackContext.error();
                return;
            }
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject == null) {
                wVCallBackContext.error();
                return;
            }
            Long l = parseObject.getLong("id");
            if (l == null) {
                wVCallBackContext.error();
                return;
            }
            HashMap hashMap = new HashMap();
            Iterator<Map.Entry<String, Object>> it = parseObject.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> next = it.next();
                if (next != null) {
                    String key = next.getKey();
                    if (!TextUtils.isEmpty(key) && !"id".equals(key)) {
                        Object value = next.getValue();
                        if ((value instanceof Integer) || (value instanceof Long)) {
                            try {
                                long a2 = avt.a(Long.parseLong(String.valueOf(value)));
                                if (key.startsWith("H5_JST_")) {
                                    next.setValue(Long.valueOf(a2));
                                } else {
                                    hashMap.put("H5_H5_" + key, Long.valueOf(a2));
                                    it.remove();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            parseObject.putAll(hashMap);
            while (true) {
                if (i >= this.mH5CustomProperties.size()) {
                    i = -1;
                    break;
                }
                JSONObject jSONObject = this.mH5CustomProperties.get(i);
                if (jSONObject != null && l.equals(jSONObject.getLong("id"))) {
                    break;
                }
                i++;
            }
            if (i < 0 || i >= this.mH5CustomProperties.size()) {
                this.mH5CustomProperties.add(parseObject);
            } else {
                this.mH5CustomProperties.set(i, parseObject);
            }
            mdd procedure = getProcedure((View) wVCallBackContext.getWebview());
            if (procedure.isAlive()) {
                procedure.a("h5CustomProperties", this.mH5CustomProperties);
                wVCallBackContext.success();
                return;
            }
            v7t.d(TAG, "LauncherProcedure is not Alive");
            wVCallBackContext.error();
        } catch (Exception unused2) {
            wVCallBackContext.error();
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("receiveFSPTime".equals(str)) {
            receiveFSPTime(str2, wVCallBackContext);
        } else if ("receiveFPTime".equals(str)) {
            receiveFPTime(str2, wVCallBackContext);
        } else if ("receiveTTITime".equals(str)) {
            receiveTTITime(str2, wVCallBackContext);
        } else if ("onStage".equals(str)) {
            onStage(str2, wVCallBackContext);
        } else if ("onProperty".equals(str)) {
            onProperty(str2, wVCallBackContext);
        } else if (l2o.COL_MARK.equals(str)) {
            return mark(str2, wVCallBackContext);
        } else {
            if (!"addH5CustomProperty".equals(str)) {
                return false;
            }
            addH5CustomProperty(str2, wVCallBackContext);
        }
        return true;
    }
}
