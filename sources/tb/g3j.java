package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.ultron.event.AsyncRefreshSubscriber;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.mytaobao.base.MtbGlobalEnv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class g3j extends AsyncRefreshSubscriber {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745538128);
    }

    public static /* synthetic */ Object ipc$super(g3j g3jVar, String str, Object... objArr) {
        if (str.hashCode() == -2105903856) {
            super.t((b8v) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/event/MtbAsyncRefreshSubscriber");
    }

    public final void D() {
        JSONObject fields;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20338c9f", new Object[]{this});
            return;
        }
        try {
            b8v b8vVar = this.f23143a;
            Object f = b8vVar != null ? b8vVar.f() : null;
            if (!(f instanceof gsb)) {
                f = null;
            }
            gsb gsbVar = (gsb) f;
            if (gsbVar != null && (fields = gsbVar.getFields()) != null && (jSONObject = fields.getJSONObject("mtopConfig")) != null) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("data");
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                jSONObject.put("data", (Object) jSONObject3);
                String string = jSONObject3.getString(PushConstants.PARAMS);
                if (TextUtils.isEmpty(string)) {
                    jSONObject2 = new JSONObject();
                } else {
                    jSONObject2 = JSON.parseObject(string);
                    ckf.c(jSONObject2, "JSON.parseObject(paramsStr)");
                }
                String str = MtbGlobalEnv.i;
                if (str == null) {
                    str = "";
                }
                jSONObject2.put((JSONObject) "pageLeaveUrl", str);
                Float k = MtbGlobalEnv.k();
                if (k != null) {
                    jSONObject2.put((JSONObject) "aspectRatio", (String) k);
                }
                jSONObject3.put(PushConstants.PARAMS, (Object) JSON.toJSONString(jSONObject2));
                MtbGlobalEnv.i = null;
            }
        } catch (Throwable th) {
            Log.e("MtbAsyncRefreshSsb", "considerProcessQueryParams error" + th.toString());
        }
    }

    @Override // com.alibaba.android.ultron.event.AsyncRefreshSubscriber, tb.l6v
    public void t(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        D();
        super.t(b8vVar);
    }
}
