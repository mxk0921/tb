package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class sza implements hdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809369);
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
        return Collections.singletonList("doSwitchRequest");
    }

    public final boolean a(String str, WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62082d42", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        nsw nswVar = new nsw();
        if (TextUtils.isEmpty(str)) {
            nswVar.b("errorMessage", "params is empty");
            wVCallBackContext.error(nswVar);
            return false;
        }
        try {
            jSONObject = JSON.parseObject(str);
        } catch (Exception e) {
            uqa.b("Bridge", "doSwitchRequest", "parse params exception:" + e.getMessage());
            jSONObject = null;
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            nswVar.b("errorMessage", "params is empty");
            wVCallBackContext.error(nswVar);
            return false;
        }
        String string = jSONObject.getString(ParamsConstants.Key.PARAM_SCENE_CODE);
        a3w i = a3w.i(jSONObject.getJSONObject("targetVersion"));
        if (i == null || TextUtils.isEmpty(i.c)) {
            nswVar.b("errorMessage", "versionCode is null");
            wVCallBackContext.error(nswVar);
            return false;
        }
        ((t1c) n78.a(t1c.class)).doChangeVersion(s78.d().a(string).b(i), new t7l(r78.TRIGGER_REQUEST));
        wVCallBackContext.success();
        return true;
    }
}
