package tb;

import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.tao.Globals;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class s4b implements hdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27789a;

        public a(String str) {
            this.f27789a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBToast.makeText(Globals.getApplication(), this.f27789a).show();
            }
        }
    }

    static {
        t2o.a(729809381);
        t2o.a(729809365);
    }

    @Override // tb.hdc
    public boolean e(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        return a(str2, wVCallBackContext);
    }

    @Override // tb.hdc
    public List<String> getActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("39cd6eb9", new Object[]{this});
        }
        return Collections.singletonList("refreshHomePage");
    }

    public final boolean a(String str, WVCallBackContext wVCallBackContext) {
        boolean z;
        String str2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af0cdc1b", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            JSONObject jSONObject2 = null;
            float f = 0.5f;
            if (parseObject != null) {
                jSONObject = parseObject.getJSONObject("bizParam");
                str2 = parseObject.getString("toastStirng");
                z = parseObject.getBooleanValue(LoginConstants.SHOW_TOAST);
                if (parseObject.containsKey("toastDelayedTime")) {
                    f = parseObject.getFloatValue("toastDelayedTime");
                }
            } else {
                str2 = "";
                jSONObject = null;
                z = false;
            }
            if (jSONObject != null) {
                jSONObject2 = new JSONObject();
                jSONObject2.put("bizParam", (Object) jSONObject);
            }
            yyj.e().P("insertCard", jSONObject2);
            if (z && !TextUtils.isEmpty(str2) && Globals.getApplication() != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new a(str2), f * 1000.0f);
            }
            wVCallBackContext.success();
            uqa.b("Bridge", "refreshHomePage", "success");
            return true;
        } catch (Exception unused) {
            uqa.b("Bridge", "refreshHomePage", "params parse exception");
            wVCallBackContext.error();
            return false;
        }
    }
}
