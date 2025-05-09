package com.taobao.infoflow.taobao.subservice.biz.feedbackservice;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.biz.IFeedbackService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import java.util.HashMap;
import java.util.Map;
import tb.a28;
import tb.cfc;
import tb.eue;
import tb.fve;
import tb.gb7;
import tb.h6d;
import tb.l6d;
import tb.m47;
import tb.t2o;
import tb.v12;
import tb.w1e;
import tb.z73;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FeedbackServiceImpl implements IFeedbackService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_CARD_FEATURE_ID = "cardFeatureId";
    private static final String KEY_HAS_SHOW_GRID_FEEDBACK_GUIDE = "hasShowGridFeedbackPop";
    private static final String KEY_SECTION_BIZ_CODE = "sectionBizCode";
    private static final String KEY_SECTION_UNIQUE_KEY = "sectionUniqueKey";
    private static final String KEY_TARGET_TYPE = "targetType";
    private static final String ND_FEEDBACK_PASS_PARAM = "passParam";
    private static final int ND_FEEDBACK_REQUEST_CODE = 4353;
    private static final String TAG = "FeedbackServiceImpl";
    private static final String TARGET_TYPE_LITE_DETAIL = "liteDetail";
    private static final String TARGET_TYPE_NEW_DETAIL = "newDetail";
    private IContainerDataService.e mBizParamCreator;
    private ICardOverlayService<?> mCardOverlayService;
    private IContainerDataService<?> mDataService;
    private gb7 mDeleteHostCardHelper;
    private IDxItemClickService mItemClickService;
    private IMainFeedsViewService<?> mMainFeedService;
    private IMainLifecycleService mMainLifecycleService;
    private IDxItemClickService.OnDxClickNavListener mOnDxClickNavListener;
    private h6d mPageLifecycle;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends m47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/feedbackservice/FeedbackServiceImpl$1");
        }

        @Override // tb.m47, tb.h6d
        public void onActivityResult(int i, int i2, Intent intent) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            } else if (i == FeedbackServiceImpl.ND_FEEDBACK_REQUEST_CODE && i2 == -1 && intent != null) {
                fve.e(FeedbackServiceImpl.TAG, "receive activityResult");
                try {
                    jSONObject = JSON.parseObject(intent.getStringExtra(FeedbackServiceImpl.ND_FEEDBACK_PASS_PARAM));
                } catch (Exception e) {
                    fve.c(FeedbackServiceImpl.TAG, "parse passParam error", e);
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    fve.e(FeedbackServiceImpl.TAG, "passParam is null");
                    return;
                }
                String string = jSONObject.getString("sectionBizCode");
                String string2 = jSONObject.getString(FeedbackServiceImpl.KEY_SECTION_UNIQUE_KEY);
                if (TextUtils.isEmpty(string)) {
                    fve.e(FeedbackServiceImpl.TAG, "delete card sectionBizCode is null");
                } else {
                    FeedbackServiceImpl.this.deleteHostCardByBizCodeWithUniqueKey(string, string2);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IDxItemClickService.OnDxClickNavListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.OnDxClickNavListener
        public void onNav(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, Bundle bundle, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc943dd5", new Object[]{this, baseSectionModel, baseSubItemModel, bundle, str});
                return;
            }
            String access$000 = FeedbackServiceImpl.access$000(FeedbackServiceImpl.this, baseSectionModel);
            if (TextUtils.equals("liteDetail", access$000) || TextUtils.equals("newDetail", access$000)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sectionBizCode", (Object) baseSectionModel.getSectionBizCode());
                jSONObject.put(FeedbackServiceImpl.KEY_SECTION_UNIQUE_KEY, (Object) baseSectionModel.getExt().getString(FeedbackServiceImpl.KEY_CARD_FEATURE_ID));
                bundle.putString(FeedbackServiceImpl.ND_FEEDBACK_PASS_PARAM, jSONObject.toJSONString());
                bundle.putInt(v12.KEY_NAV_REQUEST_CODE, FeedbackServiceImpl.ND_FEEDBACK_REQUEST_CODE);
                fve.e(FeedbackServiceImpl.TAG, "add feedback param for newDetail or liteDetail");
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.OnDxClickNavListener
        public void onNavFinished(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad70e197", new Object[]{this, new Boolean(z)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements IContainerDataService.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(FeedbackServiceImpl feedbackServiceImpl) {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.e
        public Map<String, String> a(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("54f7099b", new Object[]{this, w1eVar, str});
            }
            if (!Boolean.TRUE.toString().equalsIgnoreCase(a28.a(eue.a(), FeedbackServiceImpl.KEY_HAS_SHOW_GRID_FEEDBACK_GUIDE))) {
                return null;
            }
            HashMap hashMap = new HashMap(1);
            hashMap.put(FeedbackServiceImpl.KEY_HAS_SHOW_GRID_FEEDBACK_GUIDE, "true");
            return hashMap;
        }
    }

    static {
        t2o.a(491782350);
        t2o.a(488636558);
    }

    public static /* synthetic */ String access$000(FeedbackServiceImpl feedbackServiceImpl, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0af36a", new Object[]{feedbackServiceImpl, baseSectionModel});
        }
        return feedbackServiceImpl.getTargetType(baseSectionModel);
    }

    private void addNavListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e8f91d", new Object[]{this});
            return;
        }
        IDxItemClickService iDxItemClickService = this.mItemClickService;
        if (iDxItemClickService != null) {
            b bVar = new b();
            this.mOnDxClickNavListener = bVar;
            iDxItemClickService.addDxClickNavListener(bVar);
        }
    }

    private h6d createPageLifecycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6d) ipChange.ipc$dispatch("13c26aa9", new Object[]{this});
        }
        return new a();
    }

    private void registerRequestBizParamCreator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c6390d", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mDataService;
        if (iContainerDataService != null) {
            c cVar = new c(this);
            this.mBizParamCreator = cVar;
            iContainerDataService.addRequestBizParamsCreator(cVar);
        }
    }

    private void removeNavListener() {
        IDxItemClickService.OnDxClickNavListener onDxClickNavListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ee956da", new Object[]{this});
            return;
        }
        IDxItemClickService iDxItemClickService = this.mItemClickService;
        if (iDxItemClickService != null && (onDxClickNavListener = this.mOnDxClickNavListener) != null) {
            iDxItemClickService.removeDxClickNavListener(onDxClickNavListener);
        }
    }

    private void showDefaultCardOverlay(View view, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48cba337", new Object[]{this, view, baseSectionModel});
            return;
        }
        ICardOverlayService<?> iCardOverlayService = this.mCardOverlayService;
        if (iCardOverlayService != null) {
            iCardOverlayService.showOverlay("overlay", view, baseSectionModel);
            fve.e(TAG, "show feedback overlay");
        }
    }

    private void unRegisterBizParamCreator() {
        IContainerDataService.e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98dcc91d", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mDataService;
        if (iContainerDataService != null && (eVar = this.mBizParamCreator) != null) {
            iContainerDataService.removeRequestBizParamsCreator(eVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFeedbackService
    public void deleteHostCardByBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613f3af7", new Object[]{this, str});
        } else if (this.mDeleteHostCardHelper != null && this.mMainFeedService != null && !TextUtils.isEmpty(str)) {
            int positionBySectionBizCode = this.mMainFeedService.getPositionBySectionBizCode(str);
            if (positionBySectionBizCode < 0) {
                fve.e(TAG, "delete host card pos not found");
                return;
            }
            BaseSectionModel<?> findItemDataByPosition = this.mMainFeedService.findItemDataByPosition(positionBySectionBizCode);
            if (findItemDataByPosition == null) {
                fve.e(TAG, "delete host card data not found");
                return;
            }
            this.mDeleteHostCardHelper.b(findItemDataByPosition);
            fve.e(TAG, "feedback delete host card");
        }
    }

    public void deleteHostCardByBizCodeWithUniqueKey(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc8677d", new Object[]{this, str, str2});
        } else if (this.mDeleteHostCardHelper != null && this.mMainFeedService != null && !TextUtils.isEmpty(str)) {
            int positionBySectionBizCode = this.mMainFeedService.getPositionBySectionBizCode(str);
            if (positionBySectionBizCode < 0) {
                fve.e(TAG, "delete host card pos not found");
                return;
            }
            BaseSectionModel<?> findItemDataByPosition = this.mMainFeedService.findItemDataByPosition(positionBySectionBizCode);
            if (findItemDataByPosition == null) {
                fve.e(TAG, "delete host card data not found");
                return;
            }
            if (findItemDataByPosition.getExt() == null) {
                str3 = "";
            } else {
                str3 = findItemDataByPosition.getExt().getString(KEY_CARD_FEATURE_ID);
            }
            if (TextUtils.isEmpty(str2) || TextUtils.equals(str3, str2)) {
                this.mDeleteHostCardHelper.b(findItemDataByPosition);
                fve.e(TAG, "feedback delete host card");
                return;
            }
            fve.e(TAG, "feedback delete host card failed, card unique not match");
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        l6d pageLifeCycleRegister;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mCardOverlayService = (ICardOverlayService) cfcVar.a(ICardOverlayService.class);
        this.mDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.mMainFeedService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        this.mMainLifecycleService = iMainLifecycleService;
        if (!(iMainLifecycleService == null || (pageLifeCycleRegister = iMainLifecycleService.getPageLifeCycleRegister()) == null)) {
            h6d createPageLifecycle = createPageLifecycle();
            this.mPageLifecycle = createPageLifecycle;
            pageLifeCycleRegister.a(createPageLifecycle);
        }
        this.mItemClickService = (IDxItemClickService) cfcVar.a(IDxItemClickService.class);
        addNavListener();
        this.mDeleteHostCardHelper = new gb7(cfcVar);
        registerRequestBizParamCreator();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        this.mCardOverlayService = null;
        this.mDataService = null;
        this.mMainFeedService = null;
        IMainLifecycleService iMainLifecycleService = this.mMainLifecycleService;
        if (iMainLifecycleService != null) {
            iMainLifecycleService.getPageLifeCycleRegister().b(this.mPageLifecycle);
            this.mMainLifecycleService = null;
        }
        this.mDeleteHostCardHelper = null;
        removeNavListener();
        unRegisterBizParamCreator();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFeedbackService
    public void showFeedbackOverlay(View view, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b3dba5", new Object[]{this, view, baseSectionModel});
            return;
        }
        z73.e(baseSectionModel);
        showDefaultCardOverlay(view, baseSectionModel);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFeedbackService
    public void showFeedbackOverlayWithData(View view, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9e49cf5", new Object[]{this, view, baseSectionModel, baseSectionModel2, view2});
            return;
        }
        ICardOverlayService<?> iCardOverlayService = this.mCardOverlayService;
        if (iCardOverlayService != null) {
            iCardOverlayService.showOverlayWithOverlayData("overlay", view, baseSectionModel, baseSectionModel2, view2);
            fve.e(TAG, "show feedback overlay with custom overlay data");
        }
    }

    private String getTargetType(BaseSectionModel<?> baseSectionModel) {
        BaseSubItemModel baseItemModel;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("194de0f0", new Object[]{this, baseSectionModel});
        }
        BaseItemModel item = baseSectionModel.getItem();
        if (item == null || (baseItemModel = item.getBaseItemModel(0)) == null || (ext = baseItemModel.getExt()) == null) {
            return null;
        }
        return ext.getString("targetType");
    }
}
