package com.alibaba.security.realidentity.ui.webview.jsbridge.exec;

import com.alibaba.security.realidentity.b;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.alibaba.security.realidentity.u4;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.alibaba.security.realidentity.ui.webview.jsbridge.JsCallbackAdapter;
import com.alibaba.security.realidentity.ui.webview.jsbridge.annotation.JSTopic;
import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
@JSTopic(topic = "rpTrace")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class OldEasyTrackApi extends BaseJsExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public OldEasyTrackApi(u4 u4Var) {
        super(u4Var);
    }

    public static /* synthetic */ Object ipc$super(OldEasyTrackApi oldEasyTrackApi, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/ui/webview/jsbridge/exec/OldEasyTrackApi");
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public String getTrackMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("145b9fe3", new Object[]{this});
        }
        return "rpTrace";
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public boolean needTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("532db860", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public boolean execute(String str, JsCallbackAdapter jsCallbackAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d162c2f", new Object[]{this, str, jsCallbackAdapter})).booleanValue();
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("pageName");
            String string2 = jSONObject.getString("eventId");
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject2.getString(next));
            }
            collectLog(TrackLog.createSdkH5Log(string, string2, b.b(hashMap)));
            jsCallbackAdapter.success();
            finishJsBridge(new WVResultWrapper("success"), true);
            return true;
        } catch (JSONException e) {
            callbackUnknowError(jsCallbackAdapter);
            trackExceptionLog("EasyTrackApi parse json error", e);
            return false;
        }
    }
}
