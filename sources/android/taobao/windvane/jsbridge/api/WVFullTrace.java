package android.taobao.windvane.jsbridge.api;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import org.json.JSONObject;
import tb.abq;
import tb.kpw;
import tb.n8c;
import tb.qz8;
import tb.t2o;
import tb.v4s;
import tb.vpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVFullTrace extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVFullTrace";
    private abq spanWrapper;
    private int stageLimit = 1000;
    private int propertyLimit = 1000;

    static {
        t2o.a(989856278);
    }

    public static /* synthetic */ Object ipc$super(WVFullTrace wVFullTrace, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVFullTrace");
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
        if (vpw.commonConfig.I0 && (iWVWebView instanceof n8c)) {
            this.spanWrapper = ((n8c) iWVWebView).getSpanWrapper();
        }
    }

    public final void log(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd6992", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            if (!(keys == null || this.spanWrapper == null)) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    abq abqVar = this.spanWrapper;
                    abqVar.f(next + " " + jSONObject.getString(next));
                }
            }
            wVCallBackContext.success();
        } catch (Throwable th) {
            wVCallBackContext.error(th.toString());
        }
    }

    public final void property(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("951f5ae3", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            if (!(keys == null || this.spanWrapper == null)) {
                while (this.propertyLimit > 0 && keys.hasNext()) {
                    String next = keys.next();
                    this.spanWrapper.g(next, jSONObject.getString(next));
                    this.propertyLimit--;
                }
            }
            wVCallBackContext.success();
        } catch (Throwable th) {
            wVCallBackContext.error(th.toString());
        }
    }

    public final void stage(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efed8cc", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            if (!(keys == null || this.spanWrapper == null)) {
                while (this.stageLimit > 0 && keys.hasNext()) {
                    String next = keys.next();
                    qz8 b = this.spanWrapper.b(next);
                    if (b != null) {
                        Long valueOf = Long.valueOf(jSONObject.getLong(next));
                        b.b(valueOf);
                        b.c(valueOf);
                    }
                    this.stageLimit--;
                }
            }
            wVCallBackContext.success();
        } catch (Throwable th) {
            wVCallBackContext.error(th.toString());
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("log".equals(str)) {
            log(str2, wVCallBackContext);
            return true;
        } else if (v4s.PARAM_UPLOAD_STAGE.equals(str)) {
            stage(str2, wVCallBackContext);
            return true;
        } else if (!"property".equals(str)) {
            return false;
        } else {
            property(str2, wVCallBackContext);
            return true;
        }
    }
}
