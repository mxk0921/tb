package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import tb.i0r;
import tb.ko0;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.nextrpc.passParams")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class hn0 extends et {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301989991);
    }

    public static /* synthetic */ Object ipc$super(hn0 hn0Var, String str, Object... objArr) {
        if (str.hashCode() == 1344243487) {
            super.j0((AURANextRPCEndpoint) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/passparams/AliBuyPassParamsNextRPCExtension");
    }

    public final JSONObject J0() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c1231214", new Object[]{this});
        }
        JSONObject K0 = K0();
        if (K0 == null || (jSONObject = K0.getJSONObject("global")) == null || (jSONObject2 = jSONObject.getJSONObject("params")) == null) {
            return null;
        }
        final String string = jSONObject2.getString("itemCount");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new JSONObject(string) { // from class: com.taobao.android.buy.extension.passparams.AliBuyPassParamsNextRPCExtension$1
            public final /* synthetic */ String val$itemCount;

            {
                Map<String, Object> c;
                this.val$itemCount = string;
                put("itemCount", (Object) string);
                Map<String, Object> aBTestParams = AliBuyPerfSwitcher.getABTestParams();
                if (aBTestParams != null) {
                    putAll(aBTestParams);
                }
                if (i0r.e("uploadStyleParams", false) && (c = ko0.c()) != null) {
                    putAll(c);
                }
            }
        };
    }

    public final JSONObject K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6ca4b0b5", new Object[]{this});
        }
        AURAGlobalData B = B();
        if (B == null) {
            return null;
        }
        return (JSONObject) B.get("aura_data_protocol_json", JSONObject.class);
    }

    @Override // tb.et, tb.vbb
    public void j0(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("501f871f", new Object[]{this, aURANextRPCEndpoint});
            return;
        }
        super.j0(aURANextRPCEndpoint);
        Map<String, String> dataParams = aURANextRPCEndpoint.getDataParams();
        if (!bh.b(dataParams)) {
            String str = dataParams.get("feature");
            if (!TextUtils.isEmpty(str)) {
                JSONObject a2 = tj.a(str);
                if (!bh.b(a2)) {
                    JSONObject J0 = J0();
                    if (J0 != null) {
                        a2.putAll(J0);
                    }
                    String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
                    if (!TextUtils.isEmpty(globalProperty)) {
                        a2.put("afcId", (Object) globalProperty);
                    }
                    dataParams.put("feature", a2.toJSONString());
                }
            }
        }
    }
}
