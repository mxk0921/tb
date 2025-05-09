package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.taobao.adapter.extension.performance.model.AURAPerformanceStageModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.performance.customStage.containerTime")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class jn0 extends ht {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String STAGE_KEY_AURA_START = "aura_start_time";
    public static final String STAGE_KEY_BUY_ON_CREATE = "buy_on_create_time";
    public static final String STAGE_KEY_CLICK_START = "start_click_time";
    public static final String STAGE_KEY_COUPON_FINISH = "coupon_finish";
    public static final String STAGE_KEY_NAV_START = "nav_start_time";
    public static final String STAGE_KEY_URL_START = "ode_url_start_time";
    public static final String USER_CONTEXT_KEY = "container_time";
    public lo e;

    static {
        t2o.a(301989995);
    }

    public static /* synthetic */ Object ipc$super(jn0 jn0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/perf/AliBuyPerformanceCustomStageExtension");
    }

    public final JSONObject J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("da53bedf", new Object[]{this});
        }
        return (JSONObject) this.e.g(USER_CONTEXT_KEY, JSONObject.class);
    }

    @Override // tb.ht
    public List<AURAPerformanceStageModel> L() {
        AURAPerformanceStageModel m0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fa0956e4", new Object[]{this});
        }
        JSONObject J0 = J0();
        if (J0 == null || (m0 = m0(J0)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(m0);
        return arrayList;
    }

    public final AURAPerformanceStageModel m0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAPerformanceStageModel) ipChange.ipc$dispatch("24e99efa", new Object[]{this, jSONObject});
        }
        try {
            Long l = jSONObject.getLong(STAGE_KEY_CLICK_START);
            Long l2 = jSONObject.getLong(STAGE_KEY_COUPON_FINISH);
            jSONObject.getLong(STAGE_KEY_URL_START);
            Long l3 = jSONObject.getLong(STAGE_KEY_NAV_START);
            Long l4 = jSONObject.getLong(STAGE_KEY_BUY_ON_CREATE);
            Long l5 = jSONObject.getLong(STAGE_KEY_AURA_START);
            AURAPerformanceStageModel aURAPerformanceStageModel = new AURAPerformanceStageModel("containerTime");
            aURAPerformanceStageModel.setStartMills((l.longValue() != 0 ? l : l3).longValue());
            aURAPerformanceStageModel.setEndMills(l5.longValue());
            if (!(l.longValue() == 0 || l2.longValue() == 0)) {
                AURAPerformanceStageModel aURAPerformanceStageModel2 = new AURAPerformanceStageModel("coupon");
                aURAPerformanceStageModel2.setStartMills(l.longValue());
                aURAPerformanceStageModel2.setEndMills(l2.longValue());
                aURAPerformanceStageModel.addChildStage(aURAPerformanceStageModel2);
            }
            if (!(l3.longValue() == 0 || l4.longValue() == 0)) {
                AURAPerformanceStageModel aURAPerformanceStageModel3 = new AURAPerformanceStageModel("newBuyNavTime");
                aURAPerformanceStageModel3.setStartMills(l3.longValue());
                aURAPerformanceStageModel3.setEndMills(l4.longValue());
                aURAPerformanceStageModel.addChildStage(aURAPerformanceStageModel3);
            }
            if (!(l5.longValue() == 0 || l4.longValue() == 0)) {
                AURAPerformanceStageModel aURAPerformanceStageModel4 = new AURAPerformanceStageModel("newBuyInit");
                aURAPerformanceStageModel4.setStartMills(l4.longValue());
                aURAPerformanceStageModel4.setEndMills(l5.longValue());
                aURAPerformanceStageModel.addChildStage(aURAPerformanceStageModel4);
            }
            return aURAPerformanceStageModel;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // tb.zs, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.e = loVar;
        }
    }
}
