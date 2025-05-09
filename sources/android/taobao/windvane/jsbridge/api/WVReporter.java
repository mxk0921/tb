package android.taobao.windvane.jsbridge.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kpw;
import tb.lcn;
import tb.t2o;
import tb.trw;
import tb.vpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVReporter extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856298);
    }

    public static /* synthetic */ Object ipc$super(WVReporter wVReporter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVReporter");
    }

    public synchronized void reportDomLoad(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4145382", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String url = wVCallBackContext.getWebview().getUrl();
            long optLong = jSONObject.optLong("time", 0L);
            long optLong2 = jSONObject.optLong("firstByte", 0L);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next.startsWith("self_")) {
                    long optLong3 = jSONObject.optLong(next);
                    if (trw.getPerformanceMonitor() != null) {
                        trw.getPerformanceMonitor().didPageOccurSelfDefinedEvent(url, next.substring(5), optLong3);
                    }
                }
            }
            if (trw.getPerformanceMonitor() != null) {
                trw.getPerformanceMonitor().didPageDomLoadAtTime(url, optLong);
                trw.getPerformanceMonitor().didPageReceiveFirstByteAtTime(url, optLong2);
            }
            wVCallBackContext.success();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("reportError".equals(str)) {
            reportError(wVCallBackContext, str2);
        } else if (!"reportDomLoad".equals(str)) {
            return false;
        } else {
            reportDomLoad(wVCallBackContext, str2);
        }
        return true;
    }

    public synchronized void reportError(WVCallBackContext wVCallBackContext, String str) {
        boolean z = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51534342", new Object[]{this, wVCallBackContext, str});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String url = wVCallBackContext.getWebview().getUrl();
                if (trw.getErrorMonitor() != null) {
                    trw.getErrorMonitor().didOccurJSError(url, jSONObject.optString("msg"), jSONObject.optString("file"), jSONObject.optString("line"));
                }
                if (this.mWebView == null) {
                    z = false;
                }
                if (z && vpw.commonConfig.c1) {
                    lcn.a(RVLLevel.Error, "JS/Log").j("log").m(wVCallBackContext.getPid()).a("content", str).f();
                }
                wVCallBackContext.success();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
