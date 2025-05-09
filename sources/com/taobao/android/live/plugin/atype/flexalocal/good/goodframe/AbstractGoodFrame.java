package com.taobao.android.live.plugin.atype.flexalocal.good.goodframe;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.EnterGoodsData;
import com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.GoodsView;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.LiveGoodDataCenter;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.ItemGroupPageInfo;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.ItemGroupPopupView;
import com.taobao.schedule.ViewProxy;
import com.taobao.taolive.launcherx.TaoLiveIdleTask;
import com.taobao.taolive.room.launch.TaoLiveLaunchInitializer;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.wangxin.utils.WXConstantsOut;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.azd;
import tb.bia;
import tb.bjo;
import tb.cv1;
import tb.deb;
import tb.e9m;
import tb.giv;
import tb.hha;
import tb.hmc;
import tb.ibt;
import tb.iha;
import tb.kbc;
import tb.kkr;
import tb.mac;
import tb.mug;
import tb.nh4;
import tb.oac;
import tb.pfa;
import tb.qvs;
import tb.s3c;
import tb.s3d;
import tb.sjr;
import tb.t2o;
import tb.uea;
import tb.ux9;
import tb.uyg;
import tb.wda;
import tb.xea;
import tb.yga;
import tb.yj4;
import tb.z9u;
import tb.zqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class AbstractGoodFrame extends BaseFrame implements deb<EnterGoodsData>, s3c, s3d<EnterGoodsData>, mac {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AbstractGoodListFrame";
    private final boolean enableLandscapeShowTopOperation = yga.s();
    private Application.ActivityLifecycleCallbacks mActivityLifecycleCallbacks;
    public View mCover;
    private String mDefaultCategoryId;
    private oac mFrameEventListener;
    public ItemGroupPopupView mGoodGroupPopupView;
    public xea mGoodLiveContext;
    public ViewGroup mGoodsListContainer;
    public kbc mGoodsView;
    private long mInitTime;
    public ViewGroup mItemGroupContainer;
    public String mLiveId;
    private JSONObject mPreTopUserBuyInfoData;
    private boolean mShowingInsideDetail;
    public String presetTopItemId;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ux9 ux9Var = AbstractGoodFrame.this.mFrameContext;
            if (!(ux9Var == null || ux9Var.j() == null || !AbstractGoodFrame.this.mFrameContext.j().d())) {
                AbstractGoodFrame.this.mFrameContext.h().c(uyg.d, "assembly", AbstractGoodFrame.this.mFrameContext.C());
            }
            hha.b(AbstractGoodFrame.TAG, "initCover | click mGoodLiveContext=" + AbstractGoodFrame.this.mGoodLiveContext + "    this=" + AbstractGoodFrame.this);
            AbstractGoodFrame.this.hide();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                return;
            }
            AbstractGoodFrame abstractGoodFrame = AbstractGoodFrame.this;
            if (abstractGoodFrame.mContext == activity && abstractGoodFrame.mGoodsView != null) {
                hha.c(AbstractGoodFrame.TAG, "onActivityResumed | this=" + AbstractGoodFrame.this);
                ((GoodsView) AbstractGoodFrame.this.mGoodsView).I();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }
    }

    static {
        t2o.a(295699001);
        t2o.a(806356045);
        t2o.a(806355016);
        t2o.a(295699012);
        t2o.a(806356110);
    }

    public AbstractGoodFrame(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, ux9 ux9Var) {
        super(activity, z, tBLiveDataModel, ux9Var);
        this.mContext = activity;
        this.mLiveId = str;
        initCover(view);
        hha.b(TAG, "AbstractGoodFrame | liveId=" + str + " cover=" + view + "  this=" + this);
    }

    private static void delegateToButton(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb5de279", new Object[]{view});
        } else if (view != null) {
            ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                    if (str.hashCode() == -672710132) {
                        super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfoCompat) objArr[1]);
                        return null;
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/goodframe/AbstractGoodFrame$3");
                }

                @Override // androidx.core.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d7e7420c", new Object[]{this, view2, accessibilityNodeInfoCompat});
                        return;
                    }
                    super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                }
            });
        }
    }

    private String getOrderUrl(List<VideoInfo.GoodTopEntrance> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f470dd1", new Object[]{this, list});
        }
        if (list != null && !list.isEmpty()) {
            for (VideoInfo.GoodTopEntrance goodTopEntrance : list) {
                if (goodTopEntrance.type == 3) {
                    return goodTopEntrance.entranceUrl;
                }
            }
        }
        return null;
    }

    private static String getTransparentParams(TBLiveDataModel tBLiveDataModel) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9379d1de", new Object[]{tBLiveDataModel});
        }
        if (tBLiveDataModel == null || (map = tBLiveDataModel.mInitParams) == null) {
            return null;
        }
        return map.get(yj4.PARAM_TRANSPARENT_PARAMS);
    }

    private void goodRelatedInitNew() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eedd7969", new Object[]{this});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null) {
            iha.g(this.mLiveId, null, null);
            this.mInitTime = System.currentTimeMillis();
            TBLiveDataModel tBLiveDataModel2 = this.mLiveDataModel;
            this.mLiveId = tBLiveDataModel2.mVideoInfo.liveId;
            Map<String, String> map = tBLiveDataModel2.mInitParams;
            if (map != null) {
                this.mDefaultCategoryId = map.get(yj4.PARAM_CATEGORY_ID);
            }
            ux9 ux9Var = this.mFrameContext;
            if (!(ux9Var == null || ux9Var.D() == null || !TextUtils.isEmpty(this.mDefaultCategoryId))) {
                this.mDefaultCategoryId = this.mFrameContext.D().get(yj4.PARAM_CATEGORY_ID);
            }
            xea J = xea.J(this.mFrameContext, this.mContext, this.mLiveDataModel, this.mLandscape, isKandian(), bjo.GL_MEM);
            this.mGoodLiveContext = J;
            J.d0(isKandian());
            oac oacVar = this.mFrameEventListener;
            if (oacVar != null) {
                ((uea) oacVar).f(this.mLiveDataModel);
            }
            registerLifeCycle();
            xea xeaVar = this.mGoodLiveContext;
            if (xeaVar == null || xeaVar.j() == null) {
                hha.b(TAG, "goodRelatedInitNew | error init.");
                return;
            }
            this.mGoodLiveContext.j().q(this);
            this.mGoodLiveContext.j().t(this);
        }
    }

    public static /* synthetic */ Object ipc$super(AbstractGoodFrame abstractGoodFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/goodframe/AbstractGoodFrame");
        }
    }

    private void registerLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e41e8ee", new Object[]{this});
        } else if (wda.l()) {
            unregisterLifeCycle();
            this.mActivityLifecycleCallbacks = new b();
            Context context = this.mContext;
            if (context instanceof Activity) {
                ((Activity) context).getApplication().registerActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
            }
        }
    }

    private void unregisterLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("546323f5", new Object[]{this});
        } else if (this.mActivityLifecycleCallbacks != null) {
            Context context = this.mContext;
            if (context instanceof Activity) {
                ((Activity) context).getApplication().unregisterActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
                this.mActivityLifecycleCallbacks = null;
            }
        }
    }

    @Override // tb.s3c
    public abstract /* synthetic */ String bizCode();

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "GoodsFrame";
    }

    @Override // tb.mac
    public BaseFrame getFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("3229a038", new Object[]{this});
        }
        return this;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        xea xeaVar = this.mGoodLiveContext;
        if (!(xeaVar == null || xeaVar.I() == null)) {
            this.mGoodLiveContext.I().j().n();
        }
        ItemGroupPopupView itemGroupPopupView = this.mGoodGroupPopupView;
        if (itemGroupPopupView != null) {
            itemGroupPopupView.destroyWithAnimation();
            this.mGoodGroupPopupView = null;
        }
        kbc kbcVar = this.mGoodsView;
        if (kbcVar != null && ((GoodsView) kbcVar).D()) {
            ((GoodsView) this.mGoodsView).w();
        }
        View view = this.mCover;
        if (view != null) {
            view.setVisibility(8);
        }
        oac oacVar = this.mFrameEventListener;
        if (oacVar != null) {
            ((uea) oacVar).c();
        }
        this.mPreTopUserBuyInfoData = null;
        pfa.R(this.mFrameContext, false);
        iha.f();
    }

    public abstract /* synthetic */ void init();

    public void initCover(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a087084", new Object[]{this, view});
            return;
        }
        this.mCover = view;
        if (view != null) {
            ViewProxy.setOnClickListener(view, new a());
            delegateToButton(this.mCover);
        }
    }

    public abstract boolean isKandian();

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.goods.force_goods_timeout"};
    }

    @Override // tb.s3c
    public abstract /* synthetic */ String observeUniqueIdentification();

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        hha.b(TAG, "onCleanUp this=" + this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        hha.b(TAG, "onDataReceived this=" + this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        hha.b(TAG, "onDestroy | this=" + this);
        this.mDefaultCategoryId = null;
        unregisterLifeCycle();
        kbc kbcVar = this.mGoodsView;
        if (kbcVar != null) {
            if (((GoodsView) kbcVar).D()) {
                ((GoodsView) this.mGoodsView).w();
            }
            ((GoodsView) this.mGoodsView).s();
            this.mGoodsView = null;
        }
        View view = this.mCover;
        if (view != null) {
            view.setVisibility(8);
        }
        xea xeaVar = this.mGoodLiveContext;
        if (xeaVar != null) {
            xeaVar.b();
        }
        kkr i = kkr.i();
        ux9 ux9Var = this.mFrameContext;
        i.a(ux9Var == null ? null : (xea) ux9Var.k());
        this.presetTopItemId = null;
        this.mPreTopUserBuyInfoData = null;
        if (nh4.z()) {
            this.mFrameContext.W(null);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        super.onDidDisappear();
        onDestroy();
    }

    @Override // tb.deb
    public void onError(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
        }
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        kbc kbcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (nh4.h() && "com.taobao.taolive.goods.force_goods_timeout".equals(str) && (kbcVar = this.mGoodsView) != null) {
            ((GoodsView) kbcVar).O();
        } else if ("com.taobao.taolive.goods.get.user_buy.data".equals(str) && (obj instanceof JSONObject)) {
            xea xeaVar = this.mGoodLiveContext;
            if (xeaVar == null || !xeaVar.O() || this.enableLandscapeShowTopOperation) {
                JSONObject jSONObject = (JSONObject) obj;
                kbc kbcVar2 = this.mGoodsView;
                if (kbcVar2 == null) {
                    this.mPreTopUserBuyInfoData = jSONObject;
                } else if (!this.mShowingInsideDetail) {
                    ((GoodsView) kbcVar2).M(jSONObject);
                }
            }
        } else if ("com.taobao.taolive.inside.detail.open".equals(str)) {
            ux9 ux9Var = this.mFrameContext;
            if (ux9Var != null) {
                ux9Var.b0(true);
            }
            this.mShowingInsideDetail = true;
            kbc kbcVar3 = this.mGoodsView;
            if (kbcVar3 != null) {
                ((GoodsView) kbcVar3).v(false);
            }
        } else if ("com.taobao.taolive.inside.detail.close".equals(str)) {
            ux9 ux9Var2 = this.mFrameContext;
            if (ux9Var2 != null) {
                ux9Var2.b0(false);
            }
            this.mShowingInsideDetail = false;
            kbc kbcVar4 = this.mGoodsView;
            if (kbcVar4 != null) {
                ((GoodsView) kbcVar4).v(true);
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (!wda.l()) {
            hha.c(TAG, "onResume | this=" + this);
            kbc kbcVar = this.mGoodsView;
            if (kbcVar != null) {
                ((GoodsView) kbcVar).I();
            }
        }
    }

    @Override // tb.s3d
    public void openGoodsPackage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e84fb01", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("from", "openInsideDetailError");
        sjr.g().c(uyg.EVENT_SHOW_GOODSPACKAGE, hashMap, this.mFrameContext.C());
    }

    @Override // tb.mac
    public void setContainer(ViewGroup viewGroup, ViewGroup viewGroup2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6df32c4", new Object[]{this, viewGroup, viewGroup2});
            return;
        }
        this.mGoodsListContainer = viewGroup;
        this.mItemGroupContainer = viewGroup2;
    }

    @Override // tb.mac
    public void setFrameEventListener(oac oacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c53a9b", new Object[]{this, oacVar});
        } else {
            this.mFrameEventListener = oacVar;
        }
    }

    public void showMemberPoplayer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dff1208", new Object[]{this, str});
            return;
        }
        String str2 = "poplayer://joinmember?sellerId=" + str + "&source=liveroom&autoGetGiftPackage=true";
        Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
        intent.putExtra("event", str2);
        intent.putExtra("param", str2);
        LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent);
    }

    public void checkEnterUnderTakeNew(EnterGoodsData enterGoodsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb3bd76", new Object[]{this, enterGoodsData});
        } else if (enterGoodsData == null) {
            hha.b(TAG, "checkEnterUnderTakeNew | enterLiveItemData is null.");
        } else {
            TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
            if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null) {
                this.mGoodLiveContext.O = enterGoodsData.itemHoldType;
                if (yga.o() && bia.b(this.mFrameContext, (Activity) this.mContext, this.mLiveDataModel.mVideoInfo, enterGoodsData)) {
                    if (pfa.C(this.mGoodLiveContext)) {
                        this.mGoodLiveContext.V = true;
                    }
                    iha.r(enterGoodsData);
                } else if (!TextUtils.equals(bia.UNDER_TAKE_ITEM_GROUP_LIST, enterGoodsData.itemHoldType) || enterGoodsData.itemGroupListInfo == null) {
                    if (qvs.A() && TextUtils.equals(bia.UNDER_TAKE_GOODS_LIST, enterGoodsData.itemHoldType)) {
                        long c = bia.c(enterGoodsData);
                        HashMap<String, String> hashMap = new HashMap<>();
                        hashMap.put("bizTopItemId", Long.toString(c));
                        hashMap.put("from", "wyswyg");
                        hashMap.put("behavior", enterGoodsData.behavior);
                        hashMap.put("popId", enterGoodsData.popId);
                        show(false, hashMap, c, false);
                        iha.q(enterGoodsData);
                    }
                } else if (!yga.r()) {
                    hha.b(TAG, "checkEnterUnderTakeNew| type=itemGroupList, orange is false.");
                } else {
                    hha.b(TAG, "checkEnterUnderTakeNew| type=itemGroupList    id=" + enterGoodsData.itemGroupListInfo);
                    HashMap<String, String> hashMap2 = new HashMap<>();
                    hashMap2.put("from", "wyswyg");
                    hashMap2.put("behavior", enterGoodsData.behavior);
                    hashMap2.put("popId", enterGoodsData.popId);
                    hashMap2.put("data", enterGoodsData.itemGroupListInfo.toJSONString());
                    show(true, hashMap2, -1L, false);
                    iha.e(enterGoodsData);
                }
            }
        }
    }

    public void initGoodListPopup(xea xeaVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36a7f5c7", new Object[]{this, xeaVar, hashMap});
            return;
        }
        ViewGroup viewGroup = this.mGoodsListContainer;
        if (viewGroup != null && this.mGoodLiveContext != null) {
            if (viewGroup.getParent() == null && this.mItemGroupContainer != null && this.mGoodLiveContext.M()) {
                ((ViewGroup) this.mItemGroupContainer.getParent()).addView(this.mGoodsListContainer, 0);
            }
            try {
                this.mGoodsListContainer.removeAllViews();
            } catch (Exception e) {
                hha.b(TAG, "initGoodListPopup | e=" + e);
            }
            this.mGoodsListContainer.setVisibility(8);
            TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
            VideoInfo videoInfo = tBLiveDataModel == null ? null : tBLiveDataModel.mVideoInfo;
            if (videoInfo != null && videoInfo.broadCaster != null) {
                this.mGoodsView = new GoodsView(xeaVar, this.mGoodsListContainer);
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                }
                AccountInfo accountInfo = videoInfo.broadCaster;
                if (accountInfo != null) {
                    hashMap.put(WXConstantsOut.SHOPID, accountInfo.shopId);
                    hashMap.put("creatorId", videoInfo.broadCaster.accountId);
                }
                hashMap.put("orderUrl", getOrderUrl(videoInfo.topBarEntranceUrl));
                hashMap.put("cartsEntranceUrl", videoInfo.cartsEntranceUrl);
                hashMap.put("roomStatus", videoInfo.roomStatus);
                hashMap.put("extraWeexUrlList", JSON.toJSONString(videoInfo.extraWeexUrlList));
                hashMap.put("itemListType", videoInfo.itemListType);
                hashMap.put("itemListShowType", videoInfo.itemListShowType);
                List<VideoInfo.ExtraGoodsTabItem> list = videoInfo.extraGoodsTabList;
                if (list == null || list.isEmpty()) {
                    hha.b(TAG, "extraGoodsTabList null or empty");
                } else {
                    try {
                        hashMap.put("extraGoodsTabList", JSON.toJSONString(videoInfo.extraGoodsTabList));
                    } catch (Throwable th) {
                        hha.b(TAG, "extraGoodsTabList to json error: " + th.getMessage());
                    }
                }
                ((GoodsView) this.mGoodsView).J(hashMap);
            }
        }
    }

    public void onResult(EnterGoodsData enterGoodsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94422f21", new Object[]{this, enterGoodsData});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.D() == null)) {
            this.mFrameContext.D().remove(yj4.PARAM_ITEM_HOLD_TYPE);
            this.mFrameContext.D().remove(yj4.PARAM_ITEM_IDS);
        }
        sjr.g().c(uyg.h, null, this.mFrameContext.C());
        checkEnterUnderTakeNew(enterGoodsData);
    }

    public void openInsideDetail(EnterGoodsData enterGoodsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6034925c", new Object[]{this, enterGoodsData});
        } else {
            checkEnterUnderTakeNew(enterGoodsData);
        }
    }

    public void goodRelatedInit() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ed8c65", new Object[]{this});
        } else if (nh4.z()) {
            hha.b(TAG, "goodRelatedInitNew.");
            goodRelatedInitNew();
        } else {
            TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
            if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null) {
                this.mInitTime = System.currentTimeMillis();
                TBLiveDataModel tBLiveDataModel2 = this.mLiveDataModel;
                this.mLiveId = tBLiveDataModel2.mVideoInfo.liveId;
                Map<String, String> map = tBLiveDataModel2.mInitParams;
                if (map != null) {
                    this.mDefaultCategoryId = map.get(yj4.PARAM_CATEGORY_ID);
                }
                hmc hmcVar = null;
                if (kkr.i().d() == null || kkr.i().g() == null) {
                    str2 = null;
                    str = null;
                } else {
                    str2 = kkr.i().g().g();
                    str = kkr.i().g().c();
                }
                iha.g(this.mLiveId, str2, str);
                ux9 ux9Var = this.mFrameContext;
                xea p = xea.U(this.mContext, this.mLiveDataModel, this.mLandscape).u(false).t(isKandian()).s(pfa.G(this.mFrameContext)).r(new LiveGoodDataCenter()).v(str2, str, getTransparentParams(this.mLiveDataModel)).w(ux9Var != null ? ux9Var.j() : null).p();
                this.mGoodLiveContext = p;
                p.X(this.mFrameContext);
                ux9 ux9Var2 = this.mFrameContext;
                if (ux9Var2 != null) {
                    this.mGoodLiveContext.a0(ux9Var2.f29656a);
                    this.mFrameContext.W(this.mGoodLiveContext);
                    if (this.mFrameContext.D() != null) {
                        xea xeaVar = this.mGoodLiveContext;
                        this.mFrameContext.D().get(yj4.PARAM_ITEM_IDS);
                        xeaVar.getClass();
                        this.mGoodLiveContext.P = this.mFrameContext.D().get(yj4.PARAM_SJSD_ITEM_ID);
                        if (TextUtils.isEmpty(this.mDefaultCategoryId)) {
                            this.mDefaultCategoryId = this.mFrameContext.D().get(yj4.PARAM_CATEGORY_ID);
                        }
                    }
                }
                ux9 ux9Var3 = this.mFrameContext;
                if (ux9Var3 != null) {
                    hmcVar = ux9Var3.t();
                }
                LiveGoodDataCenter j = this.mGoodLiveContext.j();
                xea xeaVar2 = this.mGoodLiveContext;
                j.G(xeaVar2, hmcVar, xeaVar2.g, this, this);
                kkr.i().q(this.mContext, this.mLiveDataModel, this.mGoodLiveContext, true);
                oac oacVar = this.mFrameEventListener;
                if (oacVar != null) {
                    ((uea) oacVar).f(this.mLiveDataModel);
                }
                registerLifeCycle();
            }
        }
    }

    @Override // tb.mac
    public void show(boolean z, HashMap<String, String> hashMap, long j, boolean z2) {
        cv1 cv1Var;
        String str;
        String str2;
        String str3;
        long j2;
        String str4;
        ux9 ux9Var;
        ATaoLiveOpenEntity A;
        azd azdVar;
        long j3 = j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb45d33", new Object[]{this, new Boolean(z), hashMap, new Long(j3), new Boolean(z2)});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null) {
            hha.b(TAG, "show | mLiveDataModel is null. mLiveId=" + this.mLiveId + " this=" + this);
            return;
        }
        HashMap<String, String> hashMap2 = hashMap == null ? new HashMap<>() : hashMap;
        boolean z3 = !z ? this.mGoodsView != null : this.mItemGroupContainer != null;
        boolean equals = !TextUtils.isEmpty(hashMap2.get("from")) ? "wyswyg".equals(hashMap2.get("from")) : false;
        boolean z4 = !z3;
        mug.f(z4, this.mGoodLiveContext, equals);
        ux9 ux9Var2 = this.mFrameContext;
        if (ux9Var2 == null) {
            cv1Var = null;
        } else if (!ux9Var2.b()) {
            hha.b(TAG, "setCanShowPopFlag,GoodFrame处理，禁止显示浮层，canShowPop=false");
            return;
        } else {
            cv1Var = this.mFrameContext.j();
        }
        xea xeaVar = this.mGoodLiveContext;
        if (xeaVar == null) {
            xea p = xea.U(this.mContext, this.mLiveDataModel, this.mLandscape).u(z2).t(isKandian()).s(pfa.G(this.mFrameContext)).q(kkr.i().g().h()).r(new LiveGoodDataCenter()).w(cv1Var).p();
            this.mGoodLiveContext = p;
            p.X(this.mFrameContext);
        } else {
            xeaVar.b0(z2);
        }
        if (!z2) {
            this.mGoodLiveContext.T.h(z4, this.mLiveDataModel.mVideoInfo.roomStatus);
        }
        if (!(giv.c().b() || (ux9Var = this.mFrameContext) == null || (A = ux9Var.A()) == null || (azdVar = A.abilityCompontent) == null || ((ibt) azdVar).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Goods_Highlight_Frame))) {
            this.mGoodLiveContext.V(true);
            hha.b(TAG, "setDisableExplainFunction");
        }
        String str5 = hashMap2.get("glopenfrom");
        String str6 = TextUtils.isEmpty(str5) ? hashMap2.get("from") : str5;
        if (!z || !yga.q()) {
            if (this.mGoodsView == null) {
                initGoodListPopup(this.mGoodLiveContext, hashMap2);
            }
            if (this.mGoodsView != null) {
                if (j3 <= 0) {
                    j2 = -1;
                    j3 = zqq.i(hashMap2.get("bizTopItemId"), -1L);
                } else {
                    j2 = -1;
                }
                if (j3 <= 0) {
                    j3 = zqq.i(this.presetTopItemId, j2);
                }
                this.presetTopItemId = null;
                if (TextUtils.isEmpty(this.mDefaultCategoryId)) {
                    str4 = j3 > 0 ? "0" : null;
                } else {
                    str4 = this.mDefaultCategoryId;
                }
                String str7 = hashMap2.get(yj4.PARAM_CATEGORY_ID);
                if (!TextUtils.isEmpty(str7)) {
                    str4 = str7;
                }
                JSONObject jSONObject = this.mPreTopUserBuyInfoData;
                if (jSONObject != null) {
                    ((GoodsView) this.mGoodsView).K(jSONObject);
                }
                ((GoodsView) this.mGoodsView).L(str4, j3, str6);
                this.mDefaultCategoryId = null;
            }
        } else {
            this.mItemGroupContainer.setVisibility(0);
            ItemGroupPopupView itemGroupPopupView = this.mGoodGroupPopupView;
            if (itemGroupPopupView != null) {
                itemGroupPopupView.destroy();
            }
            ItemGroupPageInfo itemGroupPageInfo = hashMap2.containsKey("data") ? (ItemGroupPageInfo) JSON.parseObject(hashMap2.get("data"), ItemGroupPageInfo.class) : null;
            if (itemGroupPageInfo == null || !itemGroupPageInfo.checkInfo()) {
                hha.b(TAG, "show | pageInfo is null or params is empty. pageInfo=" + itemGroupPageInfo);
                return;
            }
            ItemGroupPopupView itemGroupPopupView2 = new ItemGroupPopupView(this.mGoodLiveContext, this.mItemGroupContainer);
            this.mGoodGroupPopupView = itemGroupPopupView2;
            itemGroupPopupView2.setPageInfo(this.mGoodsView, itemGroupPageInfo);
            this.mGoodGroupPopupView.show();
        }
        View view = this.mCover;
        if (view != null) {
            view.setVisibility(0);
        }
        oac oacVar = this.mFrameEventListener;
        if (oacVar != null) {
            ((uea) oacVar).g(z, hashMap2, str6);
        }
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("clickSource", str6);
        hashMap3.put("glopenfrom", str6);
        hashMap3.put("glShowTime", "" + (System.currentTimeMillis() - this.mInitTime));
        if (e9m.b()) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap3.put("remote", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        hashMap3.put("isItemGroup", str2);
        if (xea.W) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        hashMap3.put("appFirstTime", str3);
        long currentTimeMillis = System.currentTimeMillis();
        if (-1 == TaoLiveLaunchInitializer.sLaunchInitializerTime) {
            hashMap3.put("fromAppStart", "-1");
        } else {
            hashMap3.put("fromAppStart", Long.toString(currentTimeMillis - TaoLiveLaunchInitializer.sLaunchInitializerTime));
        }
        if (-1 == TaoLiveIdleTask.sLiveInitTime) {
            hashMap3.put("fromInitTask", "-1");
        } else {
            hashMap3.put("fromInitTask", Long.toString(currentTimeMillis - TaoLiveIdleTask.sLiveInitTime));
        }
        if (kkr.i().g() != null) {
            hashMap3.put("session_id", kkr.i().g().h());
        }
        if (kkr.i().o() != null) {
            kkr.i().o().b(z9u.CLICK_GOODS_LIST, hashMap3);
        }
        iha.j(str6, z, z3, equals, j3, z2);
        if (this.mGoodLiveContext.I() != null) {
            this.mGoodLiveContext.I().j().o();
        }
        pfa.R(this.mFrameContext, true);
        if (!z) {
            xea.W = true;
        }
    }
}
