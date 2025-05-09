package android.taobao.windvane.jsbridge.api;

import android.content.Context;
import android.taobao.windvane.extra.performance2.IPerformance;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import tb.abq;
import tb.kpw;
import tb.n8c;
import tb.nsw;
import tb.oz8;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.w0a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVFalco extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FAIL_REASON = "fail_reason";
    private static final int LEVEL_PHASE = 1;
    private static final int LEVEL_STAGE = 2;
    private static final String MONITOR_MODULE = "WindVane";
    private static final String MONITOR_POINT = "WVFalco";
    private static final String TAG = "WVFalco";
    private IPerformance webView;
    private abq webviewSpanWrapper;
    private abq windvaneSpanWrapper;
    public boolean webviewSpanFinished = false;
    private int stageLimit = 1000;
    private int propertyLimit = 1000;
    private Map<String, abq> phaseMap = new HashMap();
    private Map<String, abq> stageMap = new HashMap();
    private String pageName = "h5_page";

    static {
        t2o.a(989856276);
    }

    private void finishSpan(String str, WVCallBackContext wVCallBackContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e49ea2d8", new Object[]{this, str, wVCallBackContext, new Integer(i)});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("errorCode");
            if (i == 1) {
                abq remove = this.phaseMap.remove(jSONObject.optString("phaseID"));
                if (remove == null) {
                    wVCallBackContext.error(FAIL_REASON, "phase doesn't exist");
                    return;
                }
                finishSpan(optString, remove);
            } else {
                abq remove2 = this.stageMap.remove(jSONObject.optString("stageID"));
                if (remove2 == null) {
                    wVCallBackContext.error(FAIL_REASON, "stage doesn't exist");
                    return;
                }
                finishSpan(optString, remove2);
            }
            wVCallBackContext.success();
        } catch (Throwable th) {
            wVCallBackContext.error(FAIL_REASON, th.toString());
        }
    }

    public static /* synthetic */ Object ipc$super(WVFalco wVFalco, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVFalco");
    }

    public final void addLog(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e37671", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject("log");
            if (jSONObject2 == null) {
                wVCallBackContext.error(FAIL_REASON, "There is no log");
                return;
            }
            abq abqVar = new abq();
            if (findSpan(abqVar, wVCallBackContext, jSONObject)) {
                Iterator<String> keys = jSONObject2.keys();
                if (keys != null) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        abqVar.f(next + "  " + jSONObject2.getString(next));
                    }
                }
                wVCallBackContext.success();
            }
        } catch (Throwable th) {
            wVCallBackContext.error(FAIL_REASON, th.toString());
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
        vpw.b();
        if (vpw.commonConfig.I0) {
            if (iWVWebView instanceof n8c) {
                this.windvaneSpanWrapper = ((n8c) iWVWebView).getSpanWrapper();
            }
            if (iWVWebView instanceof IPerformance) {
                this.webView = (IPerformance) iWVWebView;
            }
        }
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        abq abqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (!this.webviewSpanFinished && (abqVar = this.webviewSpanWrapper) != null) {
            abqVar.c();
            this.webviewSpanFinished = true;
        }
    }

    private void startSpan(String str, WVCallBackContext wVCallBackContext, int i) {
        String str2;
        oz8 oz8Var;
        Iterator<String> keys;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aafeb29", new Object[]{this, str, wVCallBackContext, new Integer(i)});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (i == 1) {
                String optString = jSONObject.optString("phaseName");
                abq abqVar = this.webviewSpanWrapper;
                if (abqVar != null) {
                    String str3 = this.pageName;
                    oz8Var = w0a.f(str3, str3, abqVar);
                } else {
                    String str4 = this.pageName;
                    oz8 f = w0a.f(str4, str4, this.windvaneSpanWrapper);
                    v7t.d("WVFalco", "pageName not set,use windvane span to make Span");
                    String str5 = "unknown";
                    IPerformance iPerformance = this.webView;
                    if (iPerformance != null) {
                        str5 = iPerformance.getCachedUrl();
                    }
                    AppMonitor.Alarm.commitFail("WindVane", "WVFalco", str5, "1", "makeSpan");
                    oz8Var = f;
                }
                if (oz8Var == null) {
                    wVCallBackContext.error(FAIL_REASON, "fail to make new span");
                    return;
                }
                oz8Var.C(optString);
                str2 = oz8Var.a().c();
                this.phaseMap.put(str2, new abq(oz8Var));
            } else {
                String optString2 = jSONObject.optString("phaseID");
                String optString3 = jSONObject.optString("stageName");
                abq abqVar2 = this.phaseMap.get(optString2);
                if (abqVar2 == null) {
                    wVCallBackContext.error(FAIL_REASON, "phase doesn't exist");
                    return;
                }
                String str6 = this.pageName;
                oz8Var = w0a.f(str6, str6, abqVar2);
                if (oz8Var == null) {
                    wVCallBackContext.error(FAIL_REASON, "fail to make new span");
                    return;
                }
                oz8Var.C(optString3);
                str2 = oz8Var.a().c();
                this.stageMap.put(str2, new abq(oz8Var));
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("property");
            if (!(optJSONObject == null || (keys = optJSONObject.keys()) == null)) {
                while (this.propertyLimit > 0 && keys.hasNext()) {
                    String next = keys.next();
                    oz8Var.X(next, optJSONObject.getString(next));
                    this.propertyLimit--;
                }
            }
            nsw nswVar = new nsw();
            if (i == 1) {
                nswVar.b("phaseID", str2);
            } else {
                nswVar.b("stageID", str2);
            }
            wVCallBackContext.success(nswVar);
        } catch (Throwable th) {
            wVCallBackContext.error(FAIL_REASON, th.toString());
        }
    }

    public final void addProperty(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba98164", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject("property");
            if (jSONObject2 == null) {
                wVCallBackContext.error(FAIL_REASON, "There is no property");
                return;
            }
            abq abqVar = new abq();
            if (findSpan(abqVar, wVCallBackContext, jSONObject)) {
                Iterator<String> keys = jSONObject2.keys();
                if (keys != null) {
                    while (this.propertyLimit > 0 && keys.hasNext()) {
                        String next = keys.next();
                        abqVar.g(next, jSONObject2.getString(next));
                        this.propertyLimit--;
                    }
                }
                wVCallBackContext.success();
            }
        } catch (Throwable th) {
            wVCallBackContext.error(FAIL_REASON, th.toString());
        }
    }

    public void setPageName(String str) {
        abq abqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
            return;
        }
        vpw.b();
        if (vpw.commonConfig.I0 && !TextUtils.isEmpty(str)) {
            if (!TextUtils.equals("h5_" + str, this.pageName)) {
                String str2 = "h5_" + str;
                if (!this.webviewSpanFinished && (abqVar = this.webviewSpanWrapper) != null) {
                    abqVar.c();
                }
                this.pageName = str2;
                v7t.d("WVFalco", "pageName=" + str2);
                this.webviewSpanWrapper = new abq(w0a.f(str2, str2, this.windvaneSpanWrapper));
                this.webviewSpanFinished = false;
            }
        }
    }

    private boolean findSpan(abq abqVar, WVCallBackContext wVCallBackContext, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10f9f883", new Object[]{this, abqVar, wVCallBackContext, jSONObject})).booleanValue();
        }
        abq abqVar2 = this.webviewSpanWrapper;
        if (abqVar2 != null) {
            abqVar.j(abqVar2);
        } else {
            abqVar.j(this.windvaneSpanWrapper);
            v7t.d("WVFalco", "pageName not set,use windvane span to findSpan");
            IPerformance iPerformance = this.webView;
            if (iPerformance != null) {
                str = iPerformance.getCachedUrl();
            } else {
                str = "unknown";
            }
            AppMonitor.Alarm.commitFail("WindVane", "WVFalco", str, "2", "findSpan");
        }
        String optString = jSONObject.optString("phaseID");
        if (!TextUtils.isEmpty(optString)) {
            abq abqVar3 = this.phaseMap.get(optString);
            if (abqVar3 == null) {
                wVCallBackContext.error(FAIL_REASON, "no such phase");
                return false;
            }
            abqVar.j(abqVar3);
        }
        String optString2 = jSONObject.optString("stageID");
        if (!TextUtils.isEmpty(optString2)) {
            abq abqVar4 = this.stageMap.get(optString2);
            if (abqVar4 == null) {
                wVCallBackContext.error(FAIL_REASON, "no such stage");
                return false;
            }
            abqVar.j(abqVar4);
        }
        return true;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        v7t.d("WVFalco", "execute() called with: action = [" + str + "], params = [" + str2 + "], callback = [" + wVCallBackContext + "]");
        if ("addLog".equals(str)) {
            addLog(str2, wVCallBackContext);
            return true;
        } else if ("addProperties".equals(str)) {
            addProperty(str2, wVCallBackContext);
            return true;
        } else if ("startPhase".equals(str)) {
            startSpan(str2, wVCallBackContext, 1);
            return true;
        } else if ("finishPhase".equals(str)) {
            finishSpan(str2, wVCallBackContext, 1);
            return true;
        } else if ("startStage".equals(str)) {
            startSpan(str2, wVCallBackContext, 2);
            return true;
        } else if (!"finishStage".equals(str)) {
            return false;
        } else {
            finishSpan(str2, wVCallBackContext, 2);
            return true;
        }
    }

    private void finishSpan(String str, abq abqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6447706", new Object[]{this, str, abqVar});
        } else if (TextUtils.isEmpty(str)) {
            abqVar.c();
        } else {
            abqVar.h();
            abqVar.d(str);
        }
    }
}
