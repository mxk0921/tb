package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbwaitpay.impl.render.component.creator.recommend")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class tzr extends ps {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String USER_CONTEXT_RECOMMEND = "userContextRecommend";
    public lo g;
    public snn h;

    static {
        t2o.a(725614614);
    }

    public static /* synthetic */ Object ipc$super(tzr tzrVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        } else if (hashCode == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/waitpay/extension/TBWaitPayRecommendCreatorExtension");
        }
    }

    public final JSONObject J0(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6468a48a", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null || (jSONArray = jSONObject.getJSONArray("subAuctionIds")) == null || (jSONArray2 = jSONObject.getJSONArray("subCatIds")) == null) {
            return jSONObject2;
        }
        String L = L(JSON.parseArray(jSONArray.toJSONString(), String.class));
        if (!TextUtils.isEmpty(L)) {
            jSONObject2.put("itemIds", (Object) L);
        }
        String string = jSONObject.getString("mainOrderId");
        if (string == null) {
            string = "";
        }
        jSONObject2.put("orderId", (Object) string);
        String L2 = L(JSON.parseArray(jSONArray2.toJSONString(), String.class));
        if (!TextUtils.isEmpty(L2)) {
            jSONObject2.put("catIds", (Object) L2);
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("data");
        if (jSONObject3 != null) {
            jSONObject2.put("statusCode", (Object) jSONObject3.getString("statusCode"));
        }
        jSONObject2.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, (Object) 1639);
        return jSONObject2;
    }

    public final String L(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9551d1e6", new Object[]{this, list});
        }
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            return sb.deleteCharAt(sb.length() - 1).toString();
        }
        return null;
    }

    @Override // tb.jcb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("533be778", new Object[]{this});
        }
        return "wait_pay_recommend";
    }

    @Override // tb.jcb
    public View f(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("19b5d83d", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        snn m0 = m0();
        if (m0 == null) {
            return new View(viewGroup.getContext());
        }
        return m0.c();
    }

    @Override // tb.jcb
    public void g(AURARenderComponent aURARenderComponent, View view, int i) {
        AURARenderComponentData aURARenderComponentData;
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a87728a", new Object[]{this, aURARenderComponent, view, new Integer(i)});
            return;
        }
        snn m0 = m0();
        if (m0 != null && (aURARenderComponentData = aURARenderComponent.data) != null && (map = aURARenderComponentData.fields) != null) {
            m0.f(J0(new JSONObject(map)));
        }
    }

    @Override // tb.jcb
    public String l(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7004174", new Object[]{this, aURARenderComponent});
        }
        return "wait_pay_recommend";
    }

    public final snn m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (snn) ipChange.ipc$dispatch("6fc321f0", new Object[]{this});
        }
        snn snnVar = this.h;
        if (snnVar != null) {
            return snnVar;
        }
        lo loVar = this.g;
        if (loVar == null) {
            return null;
        }
        snn snnVar2 = (snn) loVar.g(USER_CONTEXT_RECOMMEND, snn.class);
        this.h = snnVar2;
        return snnVar2;
    }

    @Override // tb.ps, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        this.g = loVar;
    }

    @Override // tb.ps, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        } else {
            super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        }
    }
}
