package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.input.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mw1 extends uv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(995098626);
    }

    public static /* synthetic */ Object ipc$super(mw1 mw1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/jarvis/BaseJarvisKitCallback");
    }

    @Override // tb.uv
    public void handleResult(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("246c0a04", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("action");
        if (TextUtils.isEmpty(string)) {
            c4p.n("BaseJarvisKitCallback", "action is not specified");
            return;
        }
        c4p.m("BaseJarvisKitCallback", "action:" + string + " received");
        String string2 = jSONObject.getString(a.EXTRA_ACTION_ID);
        try {
            jSONObject2 = jSONObject.getJSONObject("result");
        } catch (Throwable th) {
            c4p.o("BaseJarvisKitCallback", "parse result failed", th);
            jSONObject2 = null;
        }
        if (jSONObject2 == null) {
            c4p.n("BaseJarvisKitCallback", mx8.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR);
            return;
        }
        chc e = ntf.e(string, this.mJarvisWidget);
        if (e != null) {
            try {
                e.processAction(this.mJarvisWidget, jSONObject2, string2);
            } catch (Throwable th2) {
                if (this.mJarvisWidget.getCore().g().isDebug()) {
                    Activity activity = this.mJarvisWidget.getActivity();
                    Toast.makeText(activity, "process action " + string + " failed", 0).show();
                }
                c4p.n("BaseJarvisKitCallback", th2.getMessage());
            }
        } else {
            c4p.n("BaseJarvisKitCallback", "action " + string + " doesn't have processor");
        }
    }
}
