package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b71 implements xgb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f16222a = "";
    public boolean b = false;

    static {
        t2o.a(790626491);
        t2o.a(625999991);
    }

    @Override // tb.xgb
    public void a(String str, Map<String, String> map, Map<String, Double> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90eb5085", new Object[]{this, str, map, map2});
            return;
        }
        try {
            if (!this.b) {
                e();
            }
            if (y9u.f().a() && y9u.f().b(str)) {
                b(map);
                DimensionValueSet create = DimensionValueSet.create();
                create.setMap(map);
                MeasureValueSet create2 = MeasureValueSet.create();
                if (map2 == null) {
                    map2 = new HashMap<>();
                }
                for (String str2 : map2.keySet()) {
                    if (!TextUtils.isEmpty(str2)) {
                        create2.setValue(str2, map2.get(str2).doubleValue());
                    }
                }
                AppMonitor.Stat.commit("PopLayer", str, create, create2);
                wdm.g("pageLifeCycle", "", "[Stat][point]" + str + "-[arg]" + map);
            }
        } catch (Throwable th) {
            wdm.h("AppMonitorAdapter stat error.", th);
        }
    }

    public final void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ffb893f", new Object[]{this, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        try {
            String userId = Login.getUserId();
            String str = "none_value";
            if (TextUtils.isEmpty(userId)) {
                userId = str;
            }
            map.put("userId", userId);
            if (TextUtils.isEmpty(this.f16222a)) {
                this.f16222a = vem.c();
            }
            if (!TextUtils.isEmpty(this.f16222a)) {
                str = this.f16222a;
            }
            map.put("deviceLevel", str);
        } catch (Throwable th) {
            wdm.h("AppMonitorAdapter addBaseDimensions error.", th);
        }
    }

    public final DimensionSet c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionSet) ipChange.ipc$dispatch("e3aa7b24", new Object[]{this});
        }
        return DimensionSet.create().addDimension("uuid").addDimension("indexId").addDimension("pageName").addDimension("pageUrl").addDimension(wdm.CATEGORY_TRIGGER_EVENT).addDimension("sceneId").addDimension("bizId").addDimension("orangeVersion").addDimension("userId").addDimension("popTimeStamp").addDimension("popTraceId").addDimension("mainProcess").addDimension("abGroupID").addDimension("startTimeStamp");
    }

    public final DimensionSet d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionSet) ipChange.ipc$dispatch("1b6f42aa", new Object[]{this});
        }
        return c().addDimension("configCheckSuccess").addDimension("LMCheckSuccess").addDimension("crowdCheckSuccess").addDimension("mtopCheckSuccess").addDimension("viewCreated").addDimension("displayed").addDimension("LMEnqueueWaitTime").addDimension("LMEnqueueWaitEachTime").addDimension("continuousDisplayIndex").addDimension("crowdCheckSuccessReason").addDimension("mtopCheckSuccessReason").addDimension("mtopCheckTraceId").addDimension("configCheckTime").addDimension("LMTime").addDimension("viewLoadDelayTime").addDimension("crowdCheckTime").addDimension("preCheckTime").addDimension(z9u.KEY_LOAD_TIME).addDimension("invisibleTime").addDimension("retainTime").addDimension("increaseTimes").addDimension("jumpTimes").addDimension(rg0.JUMP_URL).addDimension("finished").addDimension("loseReasonCode").addDimension("loseSubErrorCode").addDimension("viewRequestCostTime").addDimension("viewLoadMaterialCostTime").addDimension("viewMtopCostTime").addDimension("viewPrepareCostTime").addDimension("contentId").addDimension("contentID").addDimension("extras").addDimension("preDealResult").addDimension("preDealTraceId").addDimension("preDealCostTime").addDimension("receiveEventTime").addDimension(ufu.KEY_SDK_WAIT_TIME).addDimension("userResult").addDimension("deviceLevel").addDimension("gradualExposeABBucketId").addDimension("nativePopABBucketId").addDimension("viewRenderType").addDimension("triggerToDisplayCostTime").addDimension(s0j.MTS_TAG_IS_COLD_LAUNCH).addDimension("preDealConfigName");
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b816583", new Object[]{this});
            return;
        }
        AppMonitor.register("PopLayer", "OnePop", MeasureSet.create(), d(), true);
        AppMonitor.register("PopLayer", "PopProcess", MeasureSet.create(), d(), true);
        AppMonitor.register("PopLayer", o71.POINT_POP_DISPLAY, MeasureSet.create(), d(), true);
        AppMonitor.register("PopLayer", o71.POINT_CONFIG_FAIL, MeasureSet.create(), d(), true);
        AppMonitor.register("PopLayer", "PopError", MeasureSet.create(), c().addDimension("errorCode").addDimension("subErrorCode").addDimension("errorMessage").addDimension("errorInfo").addDimension("useFileHelperFix"), true);
        AppMonitor.register("PopLayer", "JumpLose", MeasureSet.create(), c().addDimension("jumpTimes").addDimension("firstJumpPageUrl").addDimension("firstJumpPage").addDimension("secondJumpPageUrl").addDimension("secondJumpPage").addDimension("thirdJumpPageUrl").addDimension("thirdJumpPage").addDimension("fourthJumpPageUrl").addDimension("fourthJumpPage").addDimension("fifthJumpPageUrl").addDimension("fifthJumpPage").addDimension("sixthJumpPageUrl").addDimension("sixthJumpPage").addDimension("seventhJumpPageUrl").addDimension("seventhJumpPage").addDimension("firstStayDuration").addDimension("secondStayDuration").addDimension("thirdStayDuration").addDimension("fourthStayDuration").addDimension("fifthStayDuration").addDimension("sixthStayDuration"), true);
        AppMonitor.register("PopLayer", o71.POINT_TEMPLATE_CACHE, MeasureSet.create(), DimensionSet.create().addDimension("downloadType").addDimension(wzi.DOWNLOAD_SUCCESS).addDimension("failReason").addDimension("costTime"), true);
        AppMonitor.register("PopLayer", o71.POINT_COLD_LAUNCH_REOPEN, MeasureSet.create(), DimensionSet.create().addDimension("lastPageUrl").addDimension("lastPage").addDimension("lastRecordTime").addDimension("lastRecordType").addDimension("popCurTime"), true);
        AppMonitor.register("PopLayer", o71.POINT_CONFIG_PARSE_TIME, MeasureSet.create(), DimensionSet.create().addDimension("configParseTime").addDimension("deviceLevel"), true);
        this.b = true;
    }
}
