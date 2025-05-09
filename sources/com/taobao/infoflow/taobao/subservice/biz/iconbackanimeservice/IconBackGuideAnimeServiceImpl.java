package com.taobao.infoflow.taobao.subservice.biz.iconbackanimeservice;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import com.taobao.infoflow.protocol.subservice.biz.IIconBackGuideAnimeService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.List;
import tb.cfc;
import tb.dfp;
import tb.dge;
import tb.fve;
import tb.gfe;
import tb.iqb;
import tb.mve;
import tb.nfe;
import tb.qdc;
import tb.rdc;
import tb.t2o;
import tb.ukv;
import tb.w1e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class IconBackGuideAnimeServiceImpl implements IIconBackGuideAnimeService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CURRENT_ICON_VERSION = "iconVersion";
    private static final String DOUBLE_ROW_ICON = "doubleRow";
    private static final String K_ENABLE_USE_ICON_BACK_ANIME = "enablePlayIconBackAnimeService";
    private static final String TAG = "IconAnimeServiceImpl";
    private Context mContext;
    private qdc mIconBackGuideAnimeProcess;
    private nfe mIconFinderFeature;
    private dge mIconPositionFinder;
    private cfc mInfoFlowContext;
    private IJsBridgeService mJsBridgeService;
    private boolean mLastIsUpgradeIcon;
    private IContainerDataService.a mOnDataProcessListener;
    private FrameLayout mRootLayout;
    private dfp mSetBitMapFeature;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
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
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e9a5c54", new Object[]{this, w1eVar, iContainerDataModel});
            } else if (IconBackGuideAnimeServiceImpl.access$000(IconBackGuideAnimeServiceImpl.this)) {
                boolean access$100 = IconBackGuideAnimeServiceImpl.access$100(IconBackGuideAnimeServiceImpl.this, iContainerDataModel);
                if (IconBackGuideAnimeServiceImpl.access$200(IconBackGuideAnimeServiceImpl.this) == null) {
                    IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl = IconBackGuideAnimeServiceImpl.this;
                    IconBackGuideAnimeServiceImpl.access$202(iconBackGuideAnimeServiceImpl, IconBackGuideAnimeServiceImpl.access$300(iconBackGuideAnimeServiceImpl, access$100));
                    IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl2 = IconBackGuideAnimeServiceImpl.this;
                    IconBackGuideAnimeServiceImpl.access$402(iconBackGuideAnimeServiceImpl2, IconBackGuideAnimeServiceImpl.access$100(iconBackGuideAnimeServiceImpl2, iContainerDataModel));
                } else if (access$100 != IconBackGuideAnimeServiceImpl.access$400(IconBackGuideAnimeServiceImpl.this)) {
                    IconBackGuideAnimeServiceImpl.access$200(IconBackGuideAnimeServiceImpl.this).onDestroy();
                    IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl3 = IconBackGuideAnimeServiceImpl.this;
                    IconBackGuideAnimeServiceImpl.access$202(iconBackGuideAnimeServiceImpl3, IconBackGuideAnimeServiceImpl.access$300(iconBackGuideAnimeServiceImpl3, access$100));
                    IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl4 = IconBackGuideAnimeServiceImpl.this;
                    IconBackGuideAnimeServiceImpl.access$402(iconBackGuideAnimeServiceImpl4, IconBackGuideAnimeServiceImpl.access$100(iconBackGuideAnimeServiceImpl4, iContainerDataModel));
                }
            }
        }
    }

    static {
        t2o.a(491782356);
        t2o.a(488636567);
    }

    public static /* synthetic */ boolean access$000(IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84e7f026", new Object[]{iconBackGuideAnimeServiceImpl})).booleanValue();
        }
        return iconBackGuideAnimeServiceImpl.isIconAnimeOrangeEnable();
    }

    public static /* synthetic */ boolean access$100(IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("514f5bc", new Object[]{iconBackGuideAnimeServiceImpl, iContainerDataModel})).booleanValue();
        }
        return iconBackGuideAnimeServiceImpl.isUpgradeIcon(iContainerDataModel);
    }

    public static /* synthetic */ qdc access$200(IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qdc) ipChange.ipc$dispatch("e5a7fd", new Object[]{iconBackGuideAnimeServiceImpl});
        }
        return iconBackGuideAnimeServiceImpl.mIconBackGuideAnimeProcess;
    }

    public static /* synthetic */ qdc access$202(IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl, qdc qdcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qdc) ipChange.ipc$dispatch("1cd68110", new Object[]{iconBackGuideAnimeServiceImpl, qdcVar});
        }
        iconBackGuideAnimeServiceImpl.mIconBackGuideAnimeProcess = qdcVar;
        return qdcVar;
    }

    public static /* synthetic */ qdc access$300(IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qdc) ipChange.ipc$dispatch("3b35dcf2", new Object[]{iconBackGuideAnimeServiceImpl, new Boolean(z)});
        }
        return iconBackGuideAnimeServiceImpl.createIConBackGuideAnimeProcess(z);
    }

    public static /* synthetic */ boolean access$400(IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9151e2a", new Object[]{iconBackGuideAnimeServiceImpl})).booleanValue();
        }
        return iconBackGuideAnimeServiceImpl.mLastIsUpgradeIcon;
    }

    public static /* synthetic */ boolean access$402(IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aaa8da30", new Object[]{iconBackGuideAnimeServiceImpl, new Boolean(z)})).booleanValue();
        }
        iconBackGuideAnimeServiceImpl.mLastIsUpgradeIcon = z;
        return z;
    }

    private IContainerDataService.a createDataProcessListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.a) ipChange.ipc$dispatch("a5b738e0", new Object[]{this});
        }
        return new a();
    }

    private qdc createIConBackGuideAnimeProcess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qdc) ipChange.ipc$dispatch("a6e532f", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return new ukv(this.mInfoFlowContext, this.mContext, this.mSetBitMapFeature, this.mIconPositionFinder);
        }
        return new gfe(this.mInfoFlowContext, this.mContext, this.mSetBitMapFeature);
    }

    private String getIconVersion(List<?> list) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce19c8df", new Object[]{this, list});
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if ((obj instanceof SectionModel) && (string = ((SectionModel) obj).getExt().getString(CURRENT_ICON_VERSION)) != null) {
                return string;
            }
        }
        return DOUBLE_ROW_ICON;
    }

    private void initRegisterDataProcessListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecb9ed", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            IContainerDataService.a createDataProcessListener = createDataProcessListener();
            this.mOnDataProcessListener = createDataProcessListener;
            iContainerDataService.addDataProcessListener(createDataProcessListener);
        }
    }

    private boolean isIconAnimeOrangeEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff78ced", new Object[]{this})).booleanValue();
        }
        return mve.a(K_ENABLE_USE_ICON_BACK_ANIME, true);
    }

    private boolean isUpgradeIcon(IContainerDataModel<?> iContainerDataModel) {
        List<?> sections;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e8599cd", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null || (sections = base.getSections()) == null) {
            return false;
        }
        return !TextUtils.equals(getIconVersion(sections), DOUBLE_ROW_ICON);
    }

    private void registerJsFeature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca25991", new Object[]{this});
            return;
        }
        this.mSetBitMapFeature = new dfp();
        this.mIconFinderFeature = new nfe(this.mIconPositionFinder);
        IJsBridgeService iJsBridgeService = this.mJsBridgeService;
        if (iJsBridgeService == null) {
            fve.e(TAG, "registerJsNativeFeature jsBridgeService is null");
            return;
        }
        iJsBridgeService.registerJsNativeFeature(this.mSetBitMapFeature);
        this.mJsBridgeService.registerJsNativeFeature(this.mIconFinderFeature);
    }

    private void unRegisterDataProcessListener() {
        IContainerDataService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435b1f44", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null && (aVar = this.mOnDataProcessListener) != null) {
            iContainerDataService.removeDataProcessListener(aVar);
        }
    }

    private void unRegisterJsFeature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa4e478", new Object[]{this});
            return;
        }
        IJsBridgeService iJsBridgeService = this.mJsBridgeService;
        if (iJsBridgeService == null) {
            fve.e(TAG, "unRegisterJsFeature jsBridgeService is null");
            return;
        }
        dfp dfpVar = this.mSetBitMapFeature;
        if (dfpVar != null) {
            iJsBridgeService.unRegisterJsNativeFeature(dfpVar);
        }
        nfe nfeVar = this.mIconFinderFeature;
        if (nfeVar != null) {
            this.mJsBridgeService.unRegisterJsNativeFeature(nfeVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconBackGuideAnimeService
    public void addOnContainerListener(iqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c63cf3", new Object[]{this, aVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconBackGuideAnimeService, tb.iqb
    public ViewGroup createContainer(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("1c667639", new Object[]{this, context});
        }
        if (this.mRootLayout == null) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.setVisibility(8);
            this.mRootLayout = frameLayout;
        }
        ViewParent parent = this.mRootLayout.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.mRootLayout);
        }
        qdc qdcVar = this.mIconBackGuideAnimeProcess;
        if (qdcVar != null) {
            qdcVar.setContext(context);
        }
        this.mContext = context;
        return this.mRootLayout;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconBackGuideAnimeService
    public boolean currentBackWithAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c43feb22", new Object[]{this})).booleanValue();
        }
        qdc qdcVar = this.mIconBackGuideAnimeProcess;
        if (qdcVar != null) {
            return qdcVar.currentBackWithAnim();
        }
        return false;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconBackGuideAnimeService, tb.iqb
    public void destroyContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a77eae", new Object[]{this});
            return;
        }
        if (this.mContext != null) {
            this.mContext = null;
        }
        if (this.mRootLayout != null) {
            this.mRootLayout = null;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconBackGuideAnimeService
    public boolean isAnimeConfigValidate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea3c6397", new Object[]{this, str})).booleanValue();
        }
        return rdc.a.h(str);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        this.mJsBridgeService = (IJsBridgeService) cfcVar.a(IJsBridgeService.class);
        this.mIconPositionFinder = new dge(cfcVar);
        registerJsFeature();
        initRegisterDataProcessListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterDataProcessListener();
        qdc qdcVar = this.mIconBackGuideAnimeProcess;
        if (qdcVar != null) {
            qdcVar.onDestroy();
            this.mIconBackGuideAnimeProcess = null;
        }
        unRegisterJsFeature();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconBackGuideAnimeService
    public void onOutLinkTrigger(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a23a8fd", new Object[]{this, str, intent});
        } else if (!TextUtils.isEmpty(str)) {
            if (this.mIconBackGuideAnimeProcess == null) {
                this.mIconBackGuideAnimeProcess = createIConBackGuideAnimeProcess(true);
                this.mLastIsUpgradeIcon = true;
            }
            this.mIconBackGuideAnimeProcess.onOutLinkTrigger(str, intent);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconBackGuideAnimeService
    public void removeOnContainerListener(iqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb950956", new Object[]{this, aVar});
        }
    }
}
