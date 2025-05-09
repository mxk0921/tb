package com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IFloatViewDetectService;
import com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.ut.share.business.ShareBusiness;
import tb.a5w;
import tb.cfc;
import tb.fve;
import tb.i2b;
import tb.ncw;
import tb.t2o;
import tb.w1e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class VideoCardAnimationServiceImpl implements IVideoCardAnimationService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "VideoAnimationCardService";
    private IContainerDataService<?> mDataService;
    private IFloatViewDetectService mFloatViewDetectService;
    private IContainerService<?> mIContainerService;
    private boolean mIsMeasureSuccess;
    private boolean mIsSupportRefreshType;
    private boolean mPageBackRefreshChildView;
    private boolean mPageBackRefreshRootView;
    private JSONObject mVideoAnimation;
    private a5w mVideoCardHelper;
    private final IContainerService.a uiRefreshListener = new a();
    private final IContainerDataService.c mRequestListener = new b();
    private final IContainerDataService.a mDataProcessListener = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void b(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("154ae7b7", new Object[]{this, iUiRefreshActionModel});
                return;
            }
            String requestType = iUiRefreshActionModel.getRequestType();
            if (!TextUtils.isEmpty(requestType)) {
                VideoCardAnimationServiceImpl videoCardAnimationServiceImpl = VideoCardAnimationServiceImpl.this;
                VideoCardAnimationServiceImpl.access$002(videoCardAnimationServiceImpl, VideoCardAnimationServiceImpl.access$100(videoCardAnimationServiceImpl).n(requestType));
                fve.e(VideoCardAnimationServiceImpl.TAG, "onUiRefreshStart 允许展示:" + VideoCardAnimationServiceImpl.access$000(VideoCardAnimationServiceImpl.this));
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void a(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acfd1f16", new Object[]{this, iUiRefreshActionModel});
                return;
            }
            String requestType = iUiRefreshActionModel.getRequestType();
            if (TextUtils.equals(requestType, Constant.KEY_PAGEBACK) && VideoCardAnimationServiceImpl.access$100(VideoCardAnimationServiceImpl.this).n(requestType)) {
                fve.e(VideoCardAnimationServiceImpl.TAG, "onUiRefreshFinish PAGE_BACK start");
                VideoCardAnimationServiceImpl.this.updatePageBackRootViewRefreshState(true);
                VideoCardAnimationServiceImpl.this.updatePageBackChildViewRefreshState(true);
                VideoCardAnimationServiceImpl.access$100(VideoCardAnimationServiceImpl.this).t();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void b(w1e w1eVar, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e77a97ec", new Object[]{this, w1eVar, str, str2, str3});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void c(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d49a26c0", new Object[]{this, w1eVar, str});
                return;
            }
            VideoCardAnimationServiceImpl.access$002(VideoCardAnimationServiceImpl.this, false);
            fve.e(VideoCardAnimationServiceImpl.TAG, "requestListener onStart 重置coldStart");
        }
    }

    static {
        t2o.a(491782729);
        t2o.a(488636615);
    }

    public static /* synthetic */ boolean access$000(VideoCardAnimationServiceImpl videoCardAnimationServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52d6c6da", new Object[]{videoCardAnimationServiceImpl})).booleanValue();
        }
        return videoCardAnimationServiceImpl.mIsSupportRefreshType;
    }

    public static /* synthetic */ boolean access$002(VideoCardAnimationServiceImpl videoCardAnimationServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f120cc4", new Object[]{videoCardAnimationServiceImpl, new Boolean(z)})).booleanValue();
        }
        videoCardAnimationServiceImpl.mIsSupportRefreshType = z;
        return z;
    }

    public static /* synthetic */ a5w access$100(VideoCardAnimationServiceImpl videoCardAnimationServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a5w) ipChange.ipc$dispatch("2dc4c49e", new Object[]{videoCardAnimationServiceImpl});
        }
        return videoCardAnimationServiceImpl.mVideoCardHelper;
    }

    public static /* synthetic */ JSONObject access$200(VideoCardAnimationServiceImpl videoCardAnimationServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1859c34", new Object[]{videoCardAnimationServiceImpl});
        }
        return videoCardAnimationServiceImpl.mVideoAnimation;
    }

    public static /* synthetic */ JSONObject access$202(VideoCardAnimationServiceImpl videoCardAnimationServiceImpl, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("74b9dd7e", new Object[]{videoCardAnimationServiceImpl, jSONObject});
        }
        videoCardAnimationServiceImpl.mVideoAnimation = jSONObject;
        return jSONObject;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public float getAspectRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b371754", new Object[]{this})).floatValue();
        }
        JSONObject jSONObject = this.mVideoAnimation;
        if (jSONObject == null) {
            return 0.0f;
        }
        return jSONObject.getFloatValue("aspectRatio");
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public JSONObject getExposureParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a234ffb7", new Object[]{this});
        }
        JSONObject jSONObject = this.mVideoAnimation;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject(i2b.TRACK_EXPOSURE_PARAM);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public String getFirstFrameImagePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d85ffc4c", new Object[]{this});
        }
        JSONObject jSONObject = this.mVideoAnimation;
        if (jSONObject == null) {
            return null;
        }
        return this.mVideoCardHelper.i(jSONObject.getString(a5w.FIRST_FRAME_IMAGE_URL));
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public String getLocalVideoPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("258de6ce", new Object[]{this});
        }
        JSONObject jSONObject = this.mVideoAnimation;
        if (jSONObject == null) {
            return null;
        }
        return this.mVideoCardHelper.i(jSONObject.getString("videoUrl"));
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public boolean isMeasureSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf31399a", new Object[]{this})).booleanValue();
        }
        return this.mIsMeasureSuccess;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        IContainerDataService<?> iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.mDataService = iContainerDataService;
        if (iContainerDataService != null) {
            iContainerDataService.addRequestListener(this.mRequestListener);
            this.mDataService.addDataProcessListener(this.mDataProcessListener);
        }
        IContainerService<?> iContainerService = (IContainerService) cfcVar.a(IContainerService.class);
        this.mIContainerService = iContainerService;
        if (iContainerService != null) {
            iContainerService.addUiRefreshListener(this.uiRefreshListener);
        }
        this.mVideoCardHelper = new a5w(this.mDataService, (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class));
        this.mFloatViewDetectService = (IFloatViewDetectService) cfcVar.a(IFloatViewDetectService.class);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        fve.e(TAG, "onDestroyService");
        this.mVideoAnimation = null;
        IContainerDataService<?> iContainerDataService = this.mDataService;
        if (iContainerDataService != null) {
            iContainerDataService.removeRequestListener(this.mRequestListener);
            this.mDataService.removeDataProcessListener(this.mDataProcessListener);
        }
        IContainerService<?> iContainerService = this.mIContainerService;
        if (iContainerService != null) {
            iContainerService.removeUiRefreshListener(this.uiRefreshListener);
        }
        this.mVideoCardHelper.g();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public boolean pageBackRefreshChildView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec960407", new Object[]{this})).booleanValue();
        }
        return this.mPageBackRefreshChildView;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public boolean pageBackRefreshRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c48f637", new Object[]{this})).booleanValue();
        }
        return this.mPageBackRefreshRootView;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public void recordFatigue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3004f47", new Object[]{this, str});
        } else {
            this.mVideoCardHelper.r(str);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public void setMeasureState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c13a4f8", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsMeasureSuccess = z;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public void updatePageBackChildViewRefreshState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a139f5", new Object[]{this, new Boolean(z)});
        } else {
            this.mPageBackRefreshChildView = z;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public void updatePageBackRootViewRefreshState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a53e751", new Object[]{this, new Boolean(z)});
        } else {
            this.mPageBackRefreshRootView = z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements IContainerDataService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void j(w1e w1eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c0b6e76", new Object[]{this, w1eVar});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void l(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec3ff412", new Object[]{this, w1eVar, iContainerDataModel});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void m(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e9a5c54", new Object[]{this, w1eVar, iContainerDataModel});
                return;
            }
            if (!(w1eVar == null || w1eVar.a() == null)) {
                z = true;
            }
            fve.e(VideoCardAnimationServiceImpl.TAG, "mDataProcessListener:onFinish");
            if (z) {
                VideoCardAnimationServiceImpl.access$100(VideoCardAnimationServiceImpl.this).q(iContainerDataModel);
                VideoCardAnimationServiceImpl videoCardAnimationServiceImpl = VideoCardAnimationServiceImpl.this;
                VideoCardAnimationServiceImpl.access$202(videoCardAnimationServiceImpl, VideoCardAnimationServiceImpl.access$100(videoCardAnimationServiceImpl).j(iContainerDataModel));
                if (VideoCardAnimationServiceImpl.access$200(VideoCardAnimationServiceImpl.this) == null) {
                    VideoCardAnimationServiceImpl.access$100(VideoCardAnimationServiceImpl.this).f(null, true);
                    fve.e(VideoCardAnimationServiceImpl.TAG, "dataFinish:videoAnimation null 清空本地视频");
                    return;
                }
                VideoCardAnimationServiceImpl.access$100(VideoCardAnimationServiceImpl.this).h(VideoCardAnimationServiceImpl.access$200(VideoCardAnimationServiceImpl.this));
            }
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public int getTimeOut() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1bc1805", new Object[]{this})).intValue();
        }
        JSONObject jSONObject = this.mVideoAnimation;
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.getIntValue(a5w.VIDEO_TIME);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public boolean enableShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3aefab", new Object[]{this})).booleanValue();
        }
        if (!ncw.d()) {
            fve.e(TAG, "enableShow:device not SupportVideo ");
            return false;
        } else if (!this.mIsSupportRefreshType) {
            fve.e(TAG, "enableShow:非支持展示时机");
            return false;
        } else {
            JSONObject jSONObject = this.mVideoAnimation;
            if (jSONObject == null || TextUtils.isEmpty(jSONObject.getString("videoUrl"))) {
                fve.e(TAG, "enableShow:数据为空");
                return false;
            } else if (TextUtils.isEmpty(getLocalVideoPath())) {
                fve.e(TAG, "enableShow:本地视频不存在");
                return false;
            } else if (!this.mVideoCardHelper.l(this.mVideoAnimation)) {
                fve.e(TAG, "enableShow:notInAvailablePeriod");
                return false;
            } else {
                boolean hasTaoPassword = ShareBusiness.getInstance().hasTaoPassword();
                fve.e(TAG, "enableShow:hasTaoPassword:" + hasTaoPassword);
                if (hasTaoPassword) {
                    return false;
                }
                IFloatViewDetectService iFloatViewDetectService = this.mFloatViewDetectService;
                if (iFloatViewDetectService == null) {
                    fve.e(TAG, "enableShow:mFloatViewDetectService null:");
                    return false;
                }
                boolean equals = TextUtils.equals(iFloatViewDetectService.triggerDetect(), "None");
                fve.e(TAG, "enableShow:isHasPop:" + (true ^ equals));
                return equals;
            }
        }
    }
}
