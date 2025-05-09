package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.w4d;
import tb.x28;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jcm extends w28 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "PopDXOverlayViewController";
    public final cfc c;
    public String d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    static {
        t2o.a(491782465);
    }

    public jcm(cfc cfcVar) {
        super(cfcVar);
        this.c = cfcVar;
    }

    public static boolean g(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3510c0b6", new Object[]{baseSectionModel})).booleanValue();
        }
        JSONObject k = k(baseSectionModel);
        if (k == null || k.isEmpty() || TextUtils.isEmpty(k.getString(PopConst.BRIDGE_KEY_BUSINESS_ID))) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(jcm jcmVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1535611339) {
            super.hideOverlay();
            return null;
        } else if (hashCode == -440727409) {
            super.c((String) objArr[0], (View) objArr[1]);
            return null;
        } else if (hashCode == 280825320) {
            super.b((View) objArr[0], (BaseSectionModel) objArr[1], (BaseSectionModel) objArr[2], (w4d.a) objArr[3], (View) objArr[4], (x28.f) objArr[5]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/infoflow/taobao/subservice/biz/overlayservice/impl/feedback/dxview/PopDXOverlayViewControllerImpl");
        }
    }

    public static BaseSectionModel<?> j(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("19be6de4", new Object[]{baseSectionModel});
        }
        if (baseSectionModel == null || baseSectionModel.getSubSection() == null) {
            return null;
        }
        return baseSectionModel.getSubSection().getOverlay();
    }

    public static JSONObject k(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("aa71e5d4", new Object[]{baseSectionModel});
        }
        BaseSubSectionModel subSection = baseSectionModel.getSubSection();
        if (subSection == null) {
            return null;
        }
        return subSection.getJSONObject(u59.KEY_POPDATA);
    }

    @Override // tb.w28, tb.w4d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("356fedae", new Object[]{this});
        } else {
            l();
        }
    }

    @Override // tb.w28, tb.w4d
    public void c(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5bb088f", new Object[]{this, str, view});
        } else {
            super.c(str, view);
        }
    }

    public final JSONObject h(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("76fd9418", new Object[]{this, baseSectionModel});
        }
        BaseSectionModel<?> j = j(baseSectionModel);
        if (j == null) {
            return null;
        }
        JSONObject ext = j.getExt();
        if (ext == null) {
            ext = new JSONObject();
        }
        ext.put("sectionBizCode", (Object) baseSectionModel.getSectionBizCode());
        JSONObject k = k(baseSectionModel);
        if (k == null) {
            fve.e(TAG, "popData is null");
            return null;
        }
        JSONObject jSONObject = (JSONObject) k.clone();
        JSONArray jSONArray = new JSONArray();
        jSONArray.add((JSONObject) j.clone());
        jSONObject.put("sections", (Object) jSONArray);
        return jSONObject;
    }

    @Override // tb.w28, tb.w4d
    public void hideOverlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4786e35", new Object[]{this});
            return;
        }
        super.hideOverlay();
        l();
    }

    public final View i(String str) {
        int positionBySectionBizCode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7e1a40d5", new Object[]{this, str});
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.c.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null || TextUtils.isEmpty(str) || (positionBySectionBizCode = iMainFeedsViewService.getPositionBySectionBizCode(str)) < 0) {
            return null;
        }
        return iMainFeedsViewService.findItemViewByPosition(positionBySectionBizCode);
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e13652b6", new Object[]{this});
        } else if (this.e.get()) {
            if (TextUtils.isEmpty(this.d)) {
                fve.e(TAG, "BusinessId is empty");
                return;
            }
            IPopViewService iPopViewService = (IPopViewService) this.c.a(IPopViewService.class);
            if (iPopViewService == null) {
                fve.e(TAG, "popViewService is null");
            } else if (iPopViewService.isPopViewOnScreen(this.d)) {
                iPopViewService.triggerPopRemove(this.d);
                this.e.set(false);
                fve.e(TAG, "remove feedback pop");
            }
        }
    }

    public static boolean f(View view, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7507e60", new Object[]{view, baseSectionModel})).booleanValue();
        }
        Context context = view.getContext();
        int z = pb6.z(context, view.getY());
        int z2 = pb6.z(context, view.getHeight());
        int z3 = pb6.z(context, view.getParent() instanceof ViewGroup ? ((ViewGroup) view.getParent()).getHeight() : 0);
        BaseSectionModel<?> j = j(baseSectionModel);
        JSONObject ext = j != null ? j.getExt() : null;
        return !(z < 0 && z2 + z < grf.a(ext, "showPopMinTopHeight", 0)) && !(z > 0 && z3 - z < grf.a(ext, "showPopMinBottomHeight", 0));
    }

    @Override // tb.w28, tb.w4d
    public void b(View view, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2, w4d.a aVar, View view2, x28.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10bd0de8", new Object[]{this, view, baseSectionModel, baseSectionModel2, aVar, view2, fVar});
            return;
        }
        IPopViewService iPopViewService = (IPopViewService) this.c.a(IPopViewService.class);
        if (!m(baseSectionModel) || iPopViewService == null) {
            super.b(view, baseSectionModel, baseSectionModel2, aVar, view2, fVar);
            return;
        }
        View i = i(baseSectionModel.getSectionBizCode());
        if (i == null) {
            fve.e(TAG, "anchor view not found");
            return;
        }
        JSONObject h = h(baseSectionModel);
        if (h == null) {
            fve.e(TAG, "popData is null");
            uve.a("Page_Home", 19999, "feedbackPopShow", "fail", "composeDataError", null);
        } else if (!f(i, baseSectionModel)) {
            fve.e(TAG, "anchor view location is not valid");
            uve.a("Page_Home", 19999, "feedbackPopShow", "fail", "anchorLocationInValid", null);
        } else {
            this.d = h.getString(PopConst.BRIDGE_KEY_BUSINESS_ID);
            phg.m("showPopOverlay");
            boolean triggerPopShowByPopData = iPopViewService.triggerPopShowByPopData(5, h);
            phg.l("showPopOverlay");
            if (!triggerPopShowByPopData) {
                super.b(view, baseSectionModel, baseSectionModel2, aVar, view2, fVar);
                uve.a("Page_Home", 19999, "feedbackPopShow", "fail", "downgrade", null);
                return;
            }
            this.e.set(true);
            fve.f(TAG, "show feedback pop");
            uve.a("Page_Home", 19999, "feedbackPopShow", "success", null, null);
        }
    }

    public final boolean m(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("429a330c", new Object[]{this, baseSectionModel})).booleanValue();
        }
        if (mve.a("homeFeedbackPopEnable", true)) {
            return g(baseSectionModel);
        }
        fve.e(TAG, "orange switch is disable");
        return false;
    }
}
