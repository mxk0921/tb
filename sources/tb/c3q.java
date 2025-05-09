package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.bizevent.SkuRequestHandler;
import com.taobao.android.sku.utils.SkuLogUtils;
import java.net.URLDecoder;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c3q extends SkuRequestHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "sku_jhs_join_request";
    public Object l;

    static {
        t2o.a(785383475);
    }

    public static /* synthetic */ Object ipc$super(c3q c3qVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2105903856) {
            super.t((b8v) objArr[0]);
            return null;
        } else if (hashCode == -1269826172) {
            return super.C((MtopResponse) objArr[0]);
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/tbsku/bizevent/SkuJHSJoinRequestHandler");
        }
    }

    @Override // com.alibaba.android.ultron.event.CommonRequestSubscriber
    public JSONObject C(MtopResponse mtopResponse) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b44ffd84", new Object[]{this, mtopResponse});
        }
        JSONObject C = super.C(mtopResponse);
        if (C == null) {
            C = new JSONObject();
        }
        if (this.l == null) {
            this.l = new JSONObject().toJSONString();
        }
        C.put("tradeExParams", this.l);
        JSONObject jSONObject2 = C.getJSONObject("data");
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("params")) == null) {
            return C;
        }
        String string = jSONObject.getString("tgKey");
        if (!TextUtils.isEmpty(string)) {
            try {
                jSONObject.put("tgKey", (Object) URLDecoder.decode(string, "utf-8"));
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = new JSONObject(JSON.parseObject(this.l.toString()));
        jSONObject3.putAll(jSONObject);
        C.put("tradeExParams", (Object) jSONObject3.toJSONString());
        return C;
    }

    @Override // com.taobao.android.sku.bizevent.SkuRequestHandler, com.alibaba.android.ultron.event.CommonRequestSubscriber, tb.l6v
    public void t(b8v b8vVar) {
        JSONObject jSONObject;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        if (cjz.a()) {
            SkuLogUtils.x("SkuJHSJoinRequestHandler.handleEvent");
        }
        super.t(b8vVar);
        JSONObject fields = j().getFields();
        if (fields != null && (jSONObject = fields.getJSONObject("mtopConfig")) != null && (obj = jSONObject.get("tradeExParams")) != null) {
            this.l = obj;
        }
    }
}
