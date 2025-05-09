package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dojo.ability.log.ModuleName;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.tao.topmultitab.service.performance.basic.ScreenPosition;
import tb.qy8;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vte extends oz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final IMainFeedsViewService<?> b;
    public final IContainerDataService<?> c;

    static {
        t2o.a(491782443);
    }

    public vte(cfc cfcVar) {
        this.b = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.c = (IContainerDataService) cfcVar.a(IContainerDataService.class);
    }

    public static /* synthetic */ Object ipc$super(vte vteVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/nextpageoptimizeservice/schdule/infoflow/InfoFlowAbsUserActionScorer");
    }

    @Override // tb.oz
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    @Override // tb.oz
    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ee1b448", new Object[]{this});
        }
        return qy8.b.e(ModuleName.PRELOAD_ABILITY, "userActionBXFeature", "");
    }

    public final ScreenPosition m(String str, String str2, d7e d7eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScreenPosition) ipChange.ipc$dispatch("48eefe8f", new Object[]{this, str, str2, d7eVar});
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.b;
        if (iMainFeedsViewService == null) {
            return ScreenPosition.EDGE;
        }
        int positionBySectionBizCode = iMainFeedsViewService.getPositionBySectionBizCode(str);
        if (TextUtils.isEmpty(str2)) {
            return n(positionBySectionBizCode, d7eVar);
        }
        ScreenPosition n = n(positionBySectionBizCode, d7eVar);
        ScreenPosition screenPosition = ScreenPosition.CENTER;
        if (screenPosition != n) {
            return n;
        }
        if (p(str2, positionBySectionBizCode)) {
            return screenPosition;
        }
        return ScreenPosition.OUTSIDE;
    }

    public final double o(int i, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2493629", new Object[]{this, new Integer(i), jSONArray})).doubleValue();
        }
        if (i >= jSONArray.size()) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        Object obj = jSONArray.get(i);
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (i == 0) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        return 0.8d;
    }

    public final boolean p(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c40ad881", new Object[]{this, str, new Integer(i)})).booleanValue();
        }
        return lue.e(lue.c(str, this.b.findItemViewByPosition(i)));
    }

    @Override // tb.oz
    public int b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e91b60d", new Object[]{this, str, jSONObject})).intValue();
        }
        if (jSONObject == null) {
            sdh.b(ModuleName.PRELOAD_ABILITY, "bizScoreRules == null");
            return 0;
        } else if (TextUtils.isEmpty(str)) {
            sdh.b(ModuleName.PRELOAD_ABILITY, "blockId == null");
            return 0;
        } else {
            JSONArray a2 = mr6.a(this.c.getContainerData());
            if (a2 == null || a2.isEmpty()) {
                sdh.b(ModuleName.PRELOAD_ABILITY, "hasCoupon == null");
                return 0;
            }
            int intValue = jSONObject.getIntValue("campaignScore");
            sdh.b(ModuleName.PRELOAD_ABILITY, "campaignScore: " + intValue + ",hasCouponSectionBizCode: " + a2);
            return a2.contains(str) ? intValue : -intValue;
        }
    }

    @Override // tb.oz
    public int c(String str, String str2, d7e d7eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3512d18b", new Object[]{this, str, str2, d7eVar})).intValue();
        }
        rpv rpvVar = (rpv) d7eVar;
        int d = rpvVar.d();
        ScreenPosition m = m(str, str2, rpvVar);
        sdh.b(ModuleName.PRELOAD_ABILITY, "screenPosition:" + m.name());
        return m == ScreenPosition.CENTER ? d * 3 : m == ScreenPosition.EDGE ? d * 2 : d;
    }

    public final ScreenPosition n(int i, d7e d7eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScreenPosition) ipChange.ipc$dispatch("eae38ca", new Object[]{this, new Integer(i), d7eVar});
        }
        if (i < 0) {
            sdh.b(ModuleName.PRELOAD_ABILITY, "没有找到targetPosition");
            return ScreenPosition.OUTSIDE;
        }
        JSONArray c = ((rpv) d7eVar).c();
        if (c.size() < 2) {
            sdh.b(ModuleName.PRELOAD_ABILITY, "下发的数组不对");
            return ScreenPosition.OUTSIDE;
        }
        double viewExposureRatio = this.b.getViewExposureRatio(i);
        sdh.b(ModuleName.PRELOAD_ABILITY, "viewExposureRatio： " + viewExposureRatio);
        if (viewExposureRatio <= o(0, c)) {
            return ScreenPosition.OUTSIDE;
        }
        if (viewExposureRatio >= o(1, c)) {
            return ScreenPosition.CENTER;
        }
        return ScreenPosition.EDGE;
    }
}
