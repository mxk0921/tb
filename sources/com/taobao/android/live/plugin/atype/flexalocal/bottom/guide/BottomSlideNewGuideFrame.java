package com.taobao.android.live.plugin.atype.flexalocal.bottom.guide;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Outline;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.BottomSlideNewGuideFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.business.recommendLiveItem.LiveItemRecommendResponse;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.business.recommendLiveItem.LiveItemRecommendResponseData;
import com.taobao.android.live.plugin.proxy.good.IGoodProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import tb.b0d;
import tb.ccc;
import tb.cv1;
import tb.d9m;
import tb.giv;
import tb.jyw;
import tb.jz9;
import tb.k0h;
import tb.kkr;
import tb.ksl;
import tb.nh4;
import tb.o3s;
import tb.s3c;
import tb.sjr;
import tb.t2o;
import tb.t54;
import tb.u0u;
import tb.ux9;
import tb.uyg;
import tb.vx9;
import tb.yac;
import tb.yf6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class BottomSlideNewGuideFrame extends BaseFrame implements ccc, s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_AUTO_DOWN = "com.taobao.taolive.room.auto_down";
    private static final String NEXT_LIVE_RECOMMEND = "4";
    private static final String SHOPPING_CART_RECOMMEND = "2";
    private static final String SIMILAR_GOOD_RECOMMEND = "3";
    private static final String TAG = "BottomSlideNewGuideFrame";
    private JSONObject actionData;
    private String behavior;
    private LiveDetailMessinfoResponseData.RecommendCardInfo bottomInfo;
    private String cardId;
    private String feedAccountIds;
    private String itemIds;
    private DXRootView mDXrootView;
    private cv1 mGlobalContext;
    private long mGuideHideTime;
    private long mGuideShowTime;
    private final jyw mHandler;
    private int mRealHeightPx;
    private ViewGroup nextMediaView;
    private String popId;
    private JSONArray preLiveIdList;
    private final Runnable reverseRunnable = new a();
    private LiveItem sabAtmosphereLiveItem;
    private ValueAnimator showAnimator;
    private int templateHeight;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (BottomSlideNewGuideFrame.access$000(BottomSlideNewGuideFrame.this) != null && BottomSlideNewGuideFrame.access$000(BottomSlideNewGuideFrame.this).d()) {
                sjr.g().c(uyg.d, "automatic", BottomSlideNewGuideFrame.this.observeUniqueIdentification());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/guide/BottomSlideNewGuideFrame$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (!BottomSlideNewGuideFrame.this.mFrameContext.j().d()) {
                View view = BottomSlideNewGuideFrame.this.mContainer;
                if (view instanceof ViewGroup) {
                    ((ViewGroup) view).removeAllViews();
                }
                if (BottomSlideNewGuideFrame.access$100(BottomSlideNewGuideFrame.this) != null) {
                    sjr.g().c(uyg.i, null, BottomSlideNewGuideFrame.this.observeUniqueIdentification());
                    BottomSlideNewGuideFrame.access$102(BottomSlideNewGuideFrame.this, null);
                }
                if (BottomSlideNewGuideFrame.access$200(BottomSlideNewGuideFrame.this) != null) {
                    sjr.g().c("com.taobao.taolive.room.init_sab_atmosphere", BottomSlideNewGuideFrame.access$200(BottomSlideNewGuideFrame.this), BottomSlideNewGuideFrame.this.observeUniqueIdentification());
                    BottomSlideNewGuideFrame.access$202(BottomSlideNewGuideFrame.this, null);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            o3s.b(BottomSlideNewGuideFrame.TAG, "requestRecommendItemData onError: " + i + " netResponse = " + netResponse + " o = " + obj);
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            o3s.a(BottomSlideNewGuideFrame.TAG, "requestRecommendItemData onSuccess: " + i + " netResponse = " + netResponse + " netBaseOutDo = " + netBaseOutDo + " o = " + obj);
            LiveItemRecommendResponseData data = ((LiveItemRecommendResponse) netBaseOutDo).getData();
            if (data != null) {
                o3s.b(BottomSlideNewGuideFrame.TAG, "相似商品推荐，服务端下发数据data不为null");
                BottomSlideNewGuideFrame.access$302(BottomSlideNewGuideFrame.this, data.model);
            }
            sjr.g().c(uyg.f, null, BottomSlideNewGuideFrame.this.observeUniqueIdentification());
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            o3s.b(BottomSlideNewGuideFrame.TAG, "requestRecommendItemData onSystemError: " + i + " netResponse = " + netResponse + " o = " + obj);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f8396a;

        public d(BottomSlideNewGuideFrame bottomSlideNewGuideFrame, float f) {
            this.f8396a = f;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/guide/BottomSlideNewGuideFrame$4");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f8396a);
            }
        }
    }

    static {
        t2o.a(295698538);
        t2o.a(806356161);
        t2o.a(806355016);
    }

    public BottomSlideNewGuideFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
        ux9 ux9Var2 = this.mFrameContext;
        if (ux9Var2 != null) {
            this.mGlobalContext = ux9Var2.j();
        }
        this.mHandler = new jyw(this);
    }

    public static /* synthetic */ cv1 access$000(BottomSlideNewGuideFrame bottomSlideNewGuideFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cv1) ipChange.ipc$dispatch("afc57271", new Object[]{bottomSlideNewGuideFrame});
        }
        return bottomSlideNewGuideFrame.mGlobalContext;
    }

    public static /* synthetic */ ViewGroup access$100(BottomSlideNewGuideFrame bottomSlideNewGuideFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("311cfb22", new Object[]{bottomSlideNewGuideFrame});
        }
        return bottomSlideNewGuideFrame.nextMediaView;
    }

    public static /* synthetic */ ViewGroup access$102(BottomSlideNewGuideFrame bottomSlideNewGuideFrame, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("157d2685", new Object[]{bottomSlideNewGuideFrame, viewGroup});
        }
        bottomSlideNewGuideFrame.nextMediaView = viewGroup;
        return viewGroup;
    }

    public static /* synthetic */ LiveItem access$200(BottomSlideNewGuideFrame bottomSlideNewGuideFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveItem) ipChange.ipc$dispatch("3e6806bf", new Object[]{bottomSlideNewGuideFrame});
        }
        return bottomSlideNewGuideFrame.sabAtmosphereLiveItem;
    }

    public static /* synthetic */ LiveItem access$202(BottomSlideNewGuideFrame bottomSlideNewGuideFrame, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveItem) ipChange.ipc$dispatch("4f10a686", new Object[]{bottomSlideNewGuideFrame, liveItem});
        }
        bottomSlideNewGuideFrame.sabAtmosphereLiveItem = liveItem;
        return liveItem;
    }

    public static /* synthetic */ LiveDetailMessinfoResponseData.RecommendCardInfo access$302(BottomSlideNewGuideFrame bottomSlideNewGuideFrame, LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailMessinfoResponseData.RecommendCardInfo) ipChange.ipc$dispatch("e8239807", new Object[]{bottomSlideNewGuideFrame, recommendCardInfo});
        }
        bottomSlideNewGuideFrame.bottomInfo = recommendCardInfo;
        return recommendCardInfo;
    }

    private void clickUT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518ea72e", new Object[]{this});
            return;
        }
        LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo = this.bottomInfo;
        if (recommendCardInfo == null || recommendCardInfo.dxData == null || kkr.i().o() == null) {
            o3s.b(TAG, "clickUT：触发判空保护 return");
            return;
        }
        HashMap<String, String> commonTrackParams = commonTrackParams(this.bottomInfo.dxData);
        commonTrackParams.put("duration", Float.toString(((float) (this.mGuideHideTime - this.mGuideShowTime)) / 1000.0f));
        if ("4".equals(this.bottomInfo.dxData.getString("bizType"))) {
            commonTrackParams.put("feed_account_id", this.bottomInfo.dxData.getString("liveId"));
        }
        giv.f().m(this.mFrameContext, "updownswitch_guideCard", commonTrackParams);
    }

    private void closeUT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("438f69e8", new Object[]{this, str});
            return;
        }
        LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo = this.bottomInfo;
        if (recommendCardInfo == null || recommendCardInfo.dxData == null || kkr.i().o() == null) {
            o3s.b(TAG, "closeUT：触发判空保护 return");
            return;
        }
        HashMap<String, String> commonTrackParams = commonTrackParams(this.bottomInfo.dxData);
        commonTrackParams.put("close_type", str);
        commonTrackParams.put("duration", Float.toString(((float) (this.mGuideHideTime - this.mGuideShowTime)) / 1000.0f));
        if ("3".equals(this.bottomInfo.dxData.getString("bizType"))) {
            commonTrackParams.put("card_id", this.cardId);
            commonTrackParams.put("item_id", this.itemIds);
            commonTrackParams.put("feed_account_id", this.feedAccountIds);
        } else if ("4".equals(this.bottomInfo.dxData.getString("bizType"))) {
            commonTrackParams.put("feed_account_id", this.bottomInfo.dxData.getString("liveId"));
        }
        giv.f().m(this.mFrameContext, "updownswitch_guideCard_close", commonTrackParams);
    }

    private HashMap<String, String> commonTrackParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("26d911e6", new Object[]{this, jSONObject});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("item_id", jSONObject.getString("itemId"));
        hashMap.put("item_type", jSONObject.getString("bizType"));
        return hashMap;
    }

    private void initShowAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f308bb", new Object[]{this});
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(-this.mRealHeightPx, 0);
        this.showAnimator = ofInt;
        ofInt.setDuration(300L);
        this.showAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.pj2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BottomSlideNewGuideFrame.this.lambda$initShowAnimator$2(valueAnimator);
            }
        });
        this.showAnimator.addListener(new b());
    }

    public static /* synthetic */ Object ipc$super(BottomSlideNewGuideFrame bottomSlideNewGuideFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else if (hashCode == 91531079) {
            super.onViewCreated((View) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/guide/BottomSlideNewGuideFrame");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initShowAnimator$2(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c28a62e", new Object[]{this, valueAnimator});
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mContainer.getLayoutParams();
        marginLayoutParams.bottomMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.mContainer.setLayoutParams(marginLayoutParams);
    }

    private void renderDx() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b74c51", new Object[]{this});
            return;
        }
        IGoodProxy n = d9m.n();
        if (n == null) {
            o3s.b(TAG, "BottomSlideNewGuideFrame: dxRenderEngine is null!");
            return;
        }
        LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo = this.bottomInfo;
        if (recommendCardInfo == null) {
            o3s.b(TAG, "BottomSlideNewGuideFrame: bottomInfo is null!");
        } else if (recommendCardInfo.dxTemplateName == null) {
            o3s.b(TAG, "BottomSlideNewGuideFrame: bottomInfo.dxTemplate is null!");
        } else {
            if (recommendCardInfo.dxData == null) {
                o3s.b(TAG, "BottomSlideNewGuideFrame: bottomInfo.dxData is null!");
            }
            LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo2 = this.bottomInfo;
            if (recommendCardInfo2 != null && (str = recommendCardInfo2.dxTemplateName) != null && recommendCardInfo2.dxData != null) {
                DXRootView createDX = n.createDX(this.mContext, str);
                this.mDXrootView = createDX;
                if (createDX != null && (this.mContainer instanceof ViewGroup)) {
                    ((ViewGroup) this.mContainer).addView(this.mDXrootView, new FrameLayout.LayoutParams(-2, -2));
                    n.renderDX(this.mDXrootView, this.bottomInfo.dxData);
                }
            }
        }
    }

    private void setContainerLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3091a36", new Object[]{this});
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.mContainer.getLayoutParams();
        float f = this.mContext.getResources().getDisplayMetrics().widthPixels / 750.0f;
        int i = (int) (this.templateHeight * f);
        this.mRealHeightPx = i;
        layoutParams.height = i;
        layoutParams.width = -1;
        this.mContainer.setLayoutParams(layoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mContainer.getLayoutParams();
        marginLayoutParams.bottomMargin = -this.mRealHeightPx;
        this.mContainer.setLayoutParams(marginLayoutParams);
        this.mContainer.setClipToOutline(true);
        this.mContainer.setOutlineProvider(new d(this, f * 12.0f));
    }

    private void similarGoodsRecommendRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5163de05", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null || ux9Var.k() == null || !(this.mFrameContext.k() instanceof yac)) {
            o3s.b(TAG, "相似商品推荐，mFrameContext为null/mFrameContext.getGoodLiveContext()不为IGoodLiveContext");
            return;
        }
        k0h k0hVar = new k0h(new c());
        if (d9m.n() == null) {
            o3s.b(TAG, "PluginProxyManager.getGoodProxy() is null 无法发起相似商品推荐请求");
            return;
        }
        HashMap<String, String> lastClickItemInfo = d9m.n().getLastClickItemInfo((yac) this.mFrameContext.k());
        if (lastClickItemInfo == null || this.preLiveIdList == null) {
            if (lastClickItemInfo == null) {
                o3s.b(TAG, "发起相似商品推荐请求失败，lastClickItemInfo为空");
            }
            if (this.preLiveIdList == null) {
                o3s.b(TAG, "发起相似商品推荐请求失败，preLiveIdList为空");
                return;
            }
            return;
        }
        o3s.b(TAG, "发起相似商品推荐请求");
        k0hVar.K(lastClickItemInfo, this.preLiveIdList);
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return TAG;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_bottom_guide_new_layout_flexalocal;
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public boolean lazyInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4de9efe", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.f29673a, uyg.b, uyg.c, uyg.d, uyg.e};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null) {
            return "";
        }
        return ux9Var.C();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        View view = this.mContainer;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
            this.mContainer.setVisibility(8);
        }
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.h() == null)) {
            this.mFrameContext.h().b(this);
        }
        jyw jywVar = this.mHandler;
        if (jywVar != null) {
            jywVar.removeCallbacksAndMessages(null);
            sjr.g().c(uyg.i, null, observeUniqueIdentification());
        }
        cv1 cv1Var = this.mGlobalContext;
        if (cv1Var != null && cv1Var.d()) {
            this.mGlobalContext.y(false);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null && ux9Var.h() != null) {
            this.mFrameContext.h().a(this);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        view.setVisibility(8);
        view.setTag("bottomSlideNewGuideFrame");
    }

    private void showUT() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("303410e3", new Object[]{this});
            return;
        }
        LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo = this.bottomInfo;
        if (recommendCardInfo == null || recommendCardInfo.dxData == null || kkr.i().o() == null) {
            o3s.b(TAG, "showUT：触发判空保护 return");
            return;
        }
        HashMap<String, String> commonTrackParams = commonTrackParams(this.bottomInfo.dxData);
        if ("3".equals(this.bottomInfo.dxData.getString("bizType"))) {
            commonTrackParams.put("card_id", this.cardId);
            JSONArray jSONArray = this.bottomInfo.dxData.getJSONArray("goodList");
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < jSONArray.size(); i++) {
                if ((jSONArray.get(i) instanceof JSONObject) && (jSONObject = jSONArray.getJSONObject(i)) != null) {
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("card_id", this.cardId);
                    sb.append(jSONObject.getString("itemId"));
                    hashMap.put("item_id", jSONObject.getString("itemId"));
                    JSONObject jSONObject2 = jSONObject.getJSONObject("liveInfo");
                    if (jSONObject2 != null) {
                        sb2.append(jSONObject2.getString("liveId"));
                        hashMap.put("feed_account_id", jSONObject2.getString("liveId"));
                    }
                    if (i != jSONArray.size() - 1) {
                        sb.append("_");
                        sb2.append("_");
                    }
                    giv.f().p(this.mFrameContext, "Show-updownswitch_guideCard_itm", hashMap);
                }
            }
            this.itemIds = sb.toString();
            this.feedAccountIds = sb2.toString();
            commonTrackParams.put("item_id", this.itemIds);
            commonTrackParams.put("feed_account_id", this.feedAccountIds);
        } else if ("4".equals(this.bottomInfo.dxData.getString("bizType"))) {
            commonTrackParams.put("feed_account_id", this.bottomInfo.dxData.getString("liveId"));
            ux9 ux9Var = this.mFrameContext;
            if (!(!(ux9Var instanceof t54) || ((t54) ux9Var).w0() == null || ((t54) this.mFrameContext).w0().mTaoLiveKtSwitchModel == null)) {
                ((t54) this.mFrameContext).w0().mTaoLiveKtSwitchModel.setNextGuideShown(true);
            }
        }
        giv.f().p(this.mFrameContext, "Show-updownswitch_guideCard", commonTrackParams);
    }

    public boolean checkExists(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8500e649", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null || jSONObject.getJSONObject("liveInfo") == null || jSONObject.getJSONObject("liveInfo").getString("liveId") == null) {
            o3s.b(TAG, "相似商品推荐，服务端下发数据不合理");
            return true;
        } else if (this.preLiveIdList == null) {
            o3s.b(TAG, "相似商品推荐，已曝光直播间列表为空");
            return true;
        } else {
            String string = jSONObject.getJSONObject("liveInfo").getString("liveId");
            for (int i = 0; i < this.preLiveIdList.size(); i++) {
                if ((this.preLiveIdList.get(i) instanceof JSONObject) && string.equals(((JSONObject) this.preLiveIdList.get(i)).getString("liveId"))) {
                    o3s.b(TAG, "相似商品推荐为已曝光直播间，不能展示");
                    return true;
                }
            }
            return false;
        }
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        cv1 cv1Var;
        int intValue;
        Context context;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        Object obj2 = null;
        if (TextUtils.equals(str, uyg.f29673a)) {
            o3s.b(TAG, "BottomSlideNewGuideFrame收到taoliveroom传递数据");
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (map.get("actionData") instanceof JSONObject) {
                    this.actionData = (JSONObject) map.get("actionData");
                    this.behavior = (String) map.get("behavior");
                    this.popId = (String) map.get("popId");
                    JSONObject jSONObject = this.actionData;
                    if (jSONObject != null && jSONObject.getJSONObject("bizData") != null) {
                        JSONObject jSONObject2 = this.actionData.getJSONObject("bizData");
                        String string = jSONObject2.getString("bizType");
                        o3s.b(TAG, "bizType = " + string);
                        if ("2".equals(string)) {
                            this.templateHeight = nh4.c().intValue();
                            if (!(jSONObject2.getJSONObject("bottomInfo") == null || jSONObject2.getJSONObject("bottomInfo").getString("dxTemplateName") == null || jSONObject2.getJSONObject("bottomInfo").getJSONObject(ksl.PARSER_KEY_DX_DATA) == null)) {
                                LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo = new LiveDetailMessinfoResponseData.RecommendCardInfo();
                                this.bottomInfo = recommendCardInfo;
                                recommendCardInfo.dxTemplateName = jSONObject2.getJSONObject("bottomInfo").getString("dxTemplateName");
                                this.bottomInfo.dxData = jSONObject2.getJSONObject("bottomInfo").getJSONObject(ksl.PARSER_KEY_DX_DATA);
                            }
                            sjr.g().c(uyg.f, null, observeUniqueIdentification());
                        } else if (nh4.I0() && "3".equals(string)) {
                            this.templateHeight = nh4.b().intValue();
                            if (map.get("preLiveIdList") instanceof JSONArray) {
                                this.preLiveIdList = (JSONArray) map.get("preLiveIdList");
                                similarGoodsRecommendRequest();
                                return;
                            }
                            o3s.b(TAG, "相似商品推荐，preLiveIdList为空，不能发起请求");
                        } else if (nh4.P0() && "4".equals(string)) {
                            this.templateHeight = nh4.b().intValue();
                            if (map.get("bottomInfo") instanceof LiveDetailMessinfoResponseData.RecommendCardInfo) {
                                this.bottomInfo = (LiveDetailMessinfoResponseData.RecommendCardInfo) map.get("bottomInfo");
                                if (!map.containsKey("enableUpDownGuideLiveBg")) {
                                    sjr g = sjr.g();
                                    String str2 = uyg.f;
                                    if (map.containsKey("isTab2")) {
                                        obj2 = "isTab2";
                                    }
                                    g.c(str2, obj2, observeUniqueIdentification());
                                }
                            }
                        } else if (!map.containsKey("hasNextCardInfo") || !(map.get("bottomInfo") instanceof LiveDetailMessinfoResponseData.RecommendCardInfo)) {
                            o3s.b(TAG, "enableSimilarRecommendGuide() = " + nh4.I0());
                            o3s.b(TAG, "enableUpDownNextLiveGuide() = " + nh4.P0());
                        } else {
                            this.templateHeight = nh4.c().intValue();
                            this.bottomInfo = (LiveDetailMessinfoResponseData.RecommendCardInfo) map.get("bottomInfo");
                            if (map.get("hasNextCardInfo") != null) {
                                sjr.g().c(uyg.f, map, observeUniqueIdentification());
                            }
                        }
                    }
                }
            }
        } else if (TextUtils.equals(str, uyg.b)) {
            o3s.b(TAG, "通过前序校验，开始渲染下滑引导");
            inflateViewOnNeed();
            LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo2 = this.bottomInfo;
            if (recommendCardInfo2 != null) {
                JSONObject jSONObject3 = recommendCardInfo2.dxData;
                if (jSONObject3 != null) {
                    String string2 = jSONObject3.getString("bizType");
                    if ("3".equals(string2)) {
                        JSONArray jSONArray = this.bottomInfo.dxData.getJSONArray("goodList");
                        JSONArray jSONArray2 = new JSONArray();
                        if (jSONArray.size() > 2) {
                            for (int i = 0; i < 2; i++) {
                                if (!(jSONArray.get(i) instanceof JSONObject) || checkExists((JSONObject) jSONArray.get(i))) {
                                    z = false;
                                    break;
                                } else {
                                    jSONArray2.add(jSONArray.get(i));
                                }
                            }
                        }
                        this.bottomInfo.dxData.put("goodList", (Object) jSONArray2);
                    }
                    if (z) {
                        if ("4".equals(string2) && (context = this.mContext) != null && this.mContainer != null && (context instanceof Activity) && !((Activity) context).isFinishing() && !((Activity) this.mContext).isDestroyed() && ((Activity) this.mContext).getWindow().isActive()) {
                            ((Activity) this.mContext).getWindow().getDecorView();
                            ViewGroup viewGroup = (ViewGroup) ((Activity) this.mContext).getWindow().getDecorView().findViewWithTag("bottomSlideNewGuideMediaView");
                            this.nextMediaView = viewGroup;
                            if (viewGroup != null) {
                                if (viewGroup.getParent() instanceof ViewGroup) {
                                    ((ViewGroup) this.nextMediaView.getParent()).removeView(this.nextMediaView);
                                }
                                ViewGroup viewGroup2 = (ViewGroup) this.mContainer.findViewById(R.id.media_view_container);
                                if (viewGroup2 != null) {
                                    viewGroup2.addView(this.nextMediaView, new FrameLayout.LayoutParams(-2, -2));
                                    viewGroup2.setLayoutParams(viewGroup2.getLayoutParams());
                                    this.nextMediaView.setVisibility(0);
                                    viewGroup2.setVisibility(0);
                                    JSONObject jSONObject4 = this.bottomInfo.dxData;
                                    if (jSONObject4 != null) {
                                        jSONObject4.put("isLiveBg", (Object) "true");
                                    }
                                }
                            }
                        }
                        renderDx();
                        if (this.mDXrootView != null) {
                            sjr.g().c(uyg.c, Integer.valueOf(this.templateHeight), observeUniqueIdentification());
                            return;
                        }
                        o3s.b(TAG, "下滑引导DX模板渲染失败 mDXrootView == null");
                        sjr.g().c(uyg.i, null, observeUniqueIdentification());
                        return;
                    }
                    return;
                }
                return;
            }
            o3s.b(TAG, "下滑引导DX模板渲染失败 bottomInfo == null");
            sjr.g().c(uyg.i, null, observeUniqueIdentification());
        } else if (TextUtils.equals(str, uyg.c)) {
            o3s.b(TAG, "下滑引导DX模板渲染成功，准备展示");
            if (this.mContainer != null) {
                setContainerLayoutParams();
                this.mContainer.setVisibility(0);
                initShowAnimator();
                if (!(this.showAnimator == null || (cv1Var = this.mGlobalContext) == null)) {
                    cv1Var.y(true);
                    this.showAnimator.start();
                    this.mGuideShowTime = System.currentTimeMillis();
                    JSONObject jSONObject5 = this.actionData;
                    if (!(jSONObject5 == null || jSONObject5.getJSONObject("bizData") == null || this.actionData.getJSONObject("bizData").getInteger("stayTime") == null || (intValue = this.actionData.getJSONObject("bizData").getInteger("stayTime").intValue()) <= 0)) {
                        this.mHandler.postDelayed(this.reverseRunnable, intValue * 1000);
                    }
                }
                this.cardId = UUID.randomUUID().toString();
                showUT();
                new jz9(null).K(this.popId);
                cv1 f = vx9.f(this.mFrameContext);
                if (!(f == null || f.u == null)) {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("name", (Object) "action_hotReservation");
                    JSONObject jSONObject7 = this.actionData;
                    if (!(jSONObject7 == null || this.popId == null || jSONObject7.getString("actionEvent") == null)) {
                        jSONObject6.put("name", (Object) this.actionData.getString("actionEvent"));
                        f.u.c(this.behavior, this.popId, true, jSONObject6);
                    }
                }
            }
        } else if (TextUtils.equals(str, uyg.d)) {
            jyw jywVar = this.mHandler;
            if (!(jywVar == null || this.showAnimator == null || this.mGlobalContext == null)) {
                jywVar.removeCallbacks(this.reverseRunnable);
                this.mGlobalContext.y(false);
                this.showAnimator.reverse();
                this.mGuideHideTime = System.currentTimeMillis();
            }
            if (obj instanceof LiveItem) {
                this.sabAtmosphereLiveItem = (LiveItem) obj;
                closeUT("assembly");
            } else if (obj instanceof String) {
                o3s.b(TAG, "下滑引导收起，关闭方式：" + obj);
                String str3 = (String) obj;
                if (TextUtils.equals(str3, yf6.ACTION_BOTTOM_CARD_SWITCH)) {
                    TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
                    if (!(tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null)) {
                        sjr.g().c("com.taobao.taolive.room.auto_down", this.mLiveDataModel.mVideoInfo.liveId, observeUniqueIdentification());
                    }
                    clickUT();
                    closeUT("click");
                } else if (TextUtils.equals(str3, yf6.ACTION_BOTTOM_CARD_HIDE)) {
                    closeUT("retract");
                } else if (TextUtils.equals(str3, yf6.ACTION_TRAIN_BOTTOM_CARD_CLICK)) {
                    clickUT();
                    closeUT("click");
                } else if (TextUtils.equals(str3, "videoViewUp")) {
                    closeUT("assembly");
                } else {
                    closeUT(str3);
                }
            } else if (obj instanceof HashMap) {
                o3s.b(TAG, "点击相似商品 下滑引导收起");
                HashMap hashMap = (HashMap) obj;
                clickUT(hashMap);
                closeUT(hashMap);
                u0u.a(this.mContext, "回滑可回到上一直播间");
            }
        } else if (TextUtils.equals(str, uyg.e)) {
            o3s.b(TAG, "下滑引导取消自动收起");
            jyw jywVar2 = this.mHandler;
            if (jywVar2 != null) {
                jywVar2.removeCallbacks(this.reverseRunnable);
            }
        }
    }

    private void clickUT(HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c70fc5", new Object[]{this, hashMap});
            return;
        }
        LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo = this.bottomInfo;
        if (recommendCardInfo == null || recommendCardInfo.dxData == null || hashMap == null || kkr.i().o() == null) {
            o3s.b(TAG, "clickUT：触发判空保护 return");
            return;
        }
        HashMap hashMap2 = new HashMap();
        if ("3".equals(this.bottomInfo.dxData.getString("bizType"))) {
            hashMap2.put("card_id", this.cardId);
            hashMap2.put("item_type", "3");
            if (hashMap.get("item_id") instanceof String) {
                hashMap2.put("item_id", (String) hashMap.get("item_id"));
            }
            if (hashMap.get("feed_account_id") instanceof String) {
                hashMap2.put("feed_account_id", (String) hashMap.get("feed_account_id"));
            }
        }
        hashMap2.put("duration", Float.toString(((float) (this.mGuideHideTime - this.mGuideShowTime)) / 1000.0f));
        giv.f().m(this.mFrameContext, "updownswitch_guideCard", hashMap2);
    }

    private void closeUT(HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a65555", new Object[]{this, hashMap});
            return;
        }
        LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo = this.bottomInfo;
        if (recommendCardInfo == null || recommendCardInfo.dxData == null || hashMap == null || kkr.i().o() == null) {
            o3s.b(TAG, "closeUT：触发判空保护 return");
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("close_type", "click");
        hashMap2.put("duration", Float.toString(((float) (this.mGuideHideTime - this.mGuideShowTime)) / 1000.0f));
        if ("3".equals(this.bottomInfo.dxData.getString("bizType"))) {
            hashMap2.put("item_type", "3");
            hashMap2.put("card_id", this.cardId);
            if (hashMap.get("item_id") instanceof String) {
                hashMap2.put("item_id", (String) hashMap.get("item_id"));
            }
            if (hashMap.get("feed_account_id") instanceof String) {
                hashMap2.put("feed_account_id", (String) hashMap.get("feed_account_id"));
            }
        }
        giv.f().m(this.mFrameContext, "updownswitch_guideCard_close", hashMap2);
    }
}
