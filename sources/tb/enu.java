package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.Utils;
import com.taobao.android.behavir.util.bridge.TryDecisionPassParam;
import com.taobao.android.behavir.util.bridge.UCPJSBridge;
import org.ifaa.android.manager.face.IFAAFaceManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class enu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Utils.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f18704a;

        public a(WVCallBackContext wVCallBackContext) {
            this.f18704a = wVCallBackContext;
        }

        public void a(boolean z, int i, JSONObject jSONObject, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9c00d0f", new Object[]{this, new Boolean(z), new Integer(i), jSONObject, new Long(j)});
            } else {
                this.f18704a.success(com.taobao.android.behavir.util.a.d("checkResult", Boolean.valueOf(z), jk.KEY_RET_CODE, Integer.valueOf(i), "trackInfo", jSONObject).toString());
            }
        }
    }

    static {
        t2o.a(404750437);
    }

    public static boolean a(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e8d2ec9", new Object[]{jSONObject, wVCallBackContext})).booleanValue();
        }
        String string = jSONObject.getString("id");
        if (!TextUtils.isEmpty(string)) {
            String[] split = TextUtils.split(string, "\\.");
            if (split.length >= 5) {
                Utils.d(split[1], split[2], split[3], split[4], new a(wVCallBackContext));
                return true;
            }
        }
        wVCallBackContext.success(com.taobao.android.behavir.util.a.c("checkResult", Boolean.FALSE, jk.KEY_RET_CODE, Integer.valueOf((int) IFAAFaceManager.STATUS_FACE_OFFSET_TOP)).toString());
        return false;
    }

    public static boolean b(UCPJSBridge uCPJSBridge, IWVWebView iWVWebView, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98282fca", new Object[]{uCPJSBridge, iWVWebView, str, wVCallBackContext})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && wVCallBackContext != null) {
            TryDecisionPassParam tryDecisionPassParam = (TryDecisionPassParam) JSON.parseObject(str, TryDecisionPassParam.class);
            if (tryDecisionPassParam == null || TextUtils.isEmpty(tryDecisionPassParam.schemeId) || TextUtils.isEmpty(tryDecisionPassParam.bizId)) {
                wVCallBackContext.error("入参异常");
            } else {
                String str2 = tryDecisionPassParam.schemeId;
                String str3 = tryDecisionPassParam.bizId;
                String valueOf = String.valueOf(bwt.b());
                JSONObject jSONObject = new JSONObject(4);
                jSONObject.put("algParams", (Object) bnv.a(str2, str3, valueOf, null).toJSONString());
                nsw nswVar = new nsw();
                nswVar.d("trackInfo", new org.json.JSONObject(jSONObject));
                nswVar.b("schemeId", str2);
                nswVar.b("bizId", str3);
                nswVar.b("traceId", valueOf);
                nswVar.a("decisionResult", Boolean.TRUE);
                wVCallBackContext.success(nswVar);
                return true;
            }
        }
        return false;
    }
}
