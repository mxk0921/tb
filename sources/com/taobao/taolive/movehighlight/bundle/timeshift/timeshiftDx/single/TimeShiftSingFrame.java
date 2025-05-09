package com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.single;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.AbstractTimeShiftDXFrame;
import com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a;
import com.taobao.taolive.movehighlight.dx.widget.bottomGroup.HighlightBottomFrame;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;
import tb.axa;
import tb.bia;
import tb.bte;
import tb.cxg;
import tb.d9m;
import tb.dxa;
import tb.fkx;
import tb.fut;
import tb.gut;
import tb.gw0;
import tb.hut;
import tb.iut;
import tb.iz1;
import tb.o0e;
import tb.s3c;
import tb.sbu;
import tb.t2o;
import tb.uwa;
import tb.ux9;
import tb.uyg;
import tb.vc;
import tb.wwa;
import tb.wxc;
import tb.ztt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TimeShiftSingFrame extends AbstractTimeShiftDXFrame implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = TimeShiftSingFrame.class.getSimpleName();
    private DXRootView bottomDxView;
    private Runnable bottomRunnable;
    private DXRootView dxCardRootView;
    private FrameLayout frameLayout;
    public HighlightBottomFrame highlightBottomFrame;
    public TUrlImageView muteImage;
    private FrameLayout singBottomLayout;
    private FrameLayout singCardItemLayout;
    private fut timeShiftBottomUtils;
    private gut timeShiftModel;
    private com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a timeShiftRequestDx;
    private o0e timeshiftDxUtils;
    private VideoInfo videoInfo;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            wxc u;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ux9 ux9Var = TimeShiftSingFrame.this.mFrameContext;
            if (ux9Var != null && (u = ux9Var.u()) != null) {
                u.i(false);
                TimeShiftSingFrame.this.muteImage.setVisibility(8);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements a.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13063a;

        public b(String str) {
            this.f13063a = str;
        }

        @Override // com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a.c
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25db8289", new Object[]{this, jSONObject});
                return;
            }
            TimeShiftSingFrame timeShiftSingFrame = TimeShiftSingFrame.this;
            ux9 ux9Var = timeShiftSingFrame.mFrameContext;
            if (ux9Var == null || !ux9Var.f || !uwa.G(TimeShiftSingFrame.access$000(timeShiftSingFrame))) {
                TimeShiftSingFrame.access$200(TimeShiftSingFrame.this, jSONObject);
            } else {
                TimeShiftSingFrame.access$100(TimeShiftSingFrame.this, jSONObject);
            }
            TimeShiftSingFrame.access$300(TimeShiftSingFrame.this, jSONObject);
            dxa.b(TimeShiftSingFrame.this.mFrameContext).m(jSONObject);
            ux9 ux9Var2 = TimeShiftSingFrame.this.mFrameContext;
            if (ux9Var2 != null && (ux9Var2.l() instanceof wwa)) {
                ((wwa) TimeShiftSingFrame.this.mFrameContext.l()).d = this.f13063a;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f13064a;

        public c(Object obj) {
            this.f13064a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TimeShiftSingFrame.access$400(TimeShiftSingFrame.this) != null && TimeShiftSingFrame.access$400(TimeShiftSingFrame.this).getLayoutParams() != null) {
                Object obj = this.f13064a;
                if ((obj instanceof Boolean) && TimeShiftSingFrame.this.mContext != null) {
                    if (((Boolean) obj).booleanValue()) {
                        i = gw0.a(TimeShiftSingFrame.this.mContext, 60.0f);
                    } else {
                        i = gw0.a(TimeShiftSingFrame.this.mContext, 82.0f);
                    }
                    if (TimeShiftSingFrame.access$400(TimeShiftSingFrame.this).getLayoutParams() instanceof LinearLayout.LayoutParams) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) TimeShiftSingFrame.access$400(TimeShiftSingFrame.this).getLayoutParams();
                        layoutParams.setMargins(0, 0, 0, i);
                        TimeShiftSingFrame.access$400(TimeShiftSingFrame.this).setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HighlightBottomFrame highlightBottomFrame = TimeShiftSingFrame.this.highlightBottomFrame;
            if (highlightBottomFrame != null && highlightBottomFrame.getContainerView() != null && TimeShiftSingFrame.access$400(TimeShiftSingFrame.this) != null && TimeShiftSingFrame.access$400(TimeShiftSingFrame.this).getLayoutParams() != null) {
                int height = TimeShiftSingFrame.this.highlightBottomFrame.getContainerView().getHeight();
                if (height == 0) {
                    height = gw0.a(TimeShiftSingFrame.this.mContext, 85.0f);
                }
                if (TimeShiftSingFrame.access$400(TimeShiftSingFrame.this).getLayoutParams() instanceof LinearLayout.LayoutParams) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) TimeShiftSingFrame.access$400(TimeShiftSingFrame.this).getLayoutParams();
                    layoutParams.setMargins(0, 0, 0, height);
                    TimeShiftSingFrame.access$400(TimeShiftSingFrame.this).setLayoutParams(layoutParams);
                }
            }
        }
    }

    static {
        t2o.a(779092534);
        t2o.a(806355016);
    }

    public TimeShiftSingFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
    }

    public static /* synthetic */ VideoInfo access$000(TimeShiftSingFrame timeShiftSingFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("d1f864c4", new Object[]{timeShiftSingFrame});
        }
        return timeShiftSingFrame.videoInfo;
    }

    public static /* synthetic */ void access$100(TimeShiftSingFrame timeShiftSingFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55ea164a", new Object[]{timeShiftSingFrame, jSONObject});
        } else {
            timeShiftSingFrame.renderSingleCardByGoods(jSONObject);
        }
    }

    public static /* synthetic */ void access$200(TimeShiftSingFrame timeShiftSingFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39a9064b", new Object[]{timeShiftSingFrame, jSONObject});
        } else {
            timeShiftSingFrame.renderSingleCard(jSONObject);
        }
    }

    public static /* synthetic */ void access$300(TimeShiftSingFrame timeShiftSingFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d67f64c", new Object[]{timeShiftSingFrame, jSONObject});
        } else {
            timeShiftSingFrame.renderSingleBottom(jSONObject);
        }
    }

    public static /* synthetic */ FrameLayout access$400(TimeShiftSingFrame timeShiftSingFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("2337bdf6", new Object[]{timeShiftSingFrame});
        }
        return timeShiftSingFrame.singCardItemLayout;
    }

    private void adjustCardListMargin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("759cdb92", new Object[]{this});
            return;
        }
        View view = this.mContainer;
        if (view != null) {
            view.post(new d());
        }
    }

    private void adjustNewCardListMargin(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32c9d5f0", new Object[]{this, obj});
            return;
        }
        View view = this.mContainer;
        if (view != null) {
            view.post(new c(obj));
        }
    }

    private void checkMuteStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b323719a", new Object[]{this});
        } else if (this.muteImage == null) {
        } else {
            if (bte.b(this.mFrameContext)) {
                this.muteImage.setVisibility(0);
            } else {
                this.muteImage.setVisibility(8);
            }
        }
    }

    private void clearScreenFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f055c65b", new Object[]{this});
            return;
        }
        if (this.bottomRunnable != null) {
            this.bottomRunnable = null;
        }
        FrameLayout frameLayout = this.singCardItemLayout;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        if (this.dxCardRootView != null) {
            this.dxCardRootView = null;
        }
    }

    private void handleGoodsCardParams(LiveItem liveItem, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c4920ea", new Object[]{this, liveItem, jSONObject});
            return;
        }
        LiveTimemovingModel liveTimemovingModel = (LiveTimemovingModel) fkx.f(jSONObject.toJSONString(), LiveTimemovingModel.class);
        liveItem.clickSource = "timeshift";
        if (liveItem.extraUTParams == null) {
            liveItem.extraUTParams = new HashMap();
        }
        if (liveTimemovingModel != null) {
            Map<String, String> map = liveItem.extraUTParams;
            if (liveTimemovingModel.rightInfo != null) {
                str = "1";
            } else {
                str = "0";
            }
            map.put("highlight_coupon_type", str);
            Map<String, String> map2 = liveItem.extraUTParams;
            LiveTimemovingModel.RightInfo rightInfo = liveTimemovingModel.rightInfo;
            String str2 = null;
            map2.put("highlight_strategy_code", rightInfo != null ? rightInfo.strategyCode : null);
            Map<String, String> map3 = liveItem.extraUTParams;
            LiveTimemovingModel.RightInfo rightInfo2 = liveTimemovingModel.rightInfo;
            if (rightInfo2 != null) {
                str2 = rightInfo2.benefitCode;
            }
            map3.put("highlight_coupon_id", str2);
            liveItem.extraUTParams.put("highlight_card_clickPos", "timemove_cart");
        }
    }

    private void initMuteIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d7a0ae9", new Object[]{this});
        } else if (this.mContainer.getRootView() != null) {
            TUrlImageView tUrlImageView = (TUrlImageView) ((ViewGroup) this.mContainer.getRootView()).findViewById(R.id.taolive_highlight_sing_mute_icon);
            this.muteImage = tUrlImageView;
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01iU5mUX1scxPhNoiCq_!!6000000005788-2-tps-144-144.png");
                this.muteImage.setOnClickListener(new a());
                checkMuteStatus();
            }
        }
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        VideoInfo e = cxg.e(this.mLiveDataModel);
        this.videoInfo = e;
        if (e != null) {
            this.timeShiftRequestDx = new com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a(this.mLiveDataModel, this.frameLayout, this.mFrameContext);
            this.timeshiftDxUtils = new hut(this.dxCardRootView, this.mFrameContext);
            this.timeShiftRequestDx.k(null);
            gut gutVar = new gut();
            this.timeShiftModel = gutVar;
            initTimeShiftAction(this.timeShiftRequestDx, this.timeshiftDxUtils, gutVar);
            View view = this.mContainer;
            if (view != null) {
                this.singCardItemLayout = (FrameLayout) view.findViewById(R.id.taolive_highlight_sing_card);
            }
            sbu.k(this.mFrameContext, "Page_TaobaoLiveWatch_Show_timemove_cardA", null);
        }
    }

    public static /* synthetic */ Object ipc$super(TimeShiftSingFrame timeShiftSingFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case -236809011:
                super.onWillAppear();
                return null;
            case 1342702087:
                super.createView((ViewGroup) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bundle/timeshift/timeshiftDx/single/TimeShiftSingFrame");
        }
    }

    private void renderSingleBottom(JSONObject jSONObject) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95a853a0", new Object[]{this, jSONObject});
            return;
        }
        this.bottomDxView = axa.f().a(this.mContext, "highlight_single_bottom_guide_model");
        fut futVar = new fut(this.mFrameContext, this.mLiveDataModel, this.mContext, this.bottomDxView);
        this.timeShiftBottomUtils = futVar;
        futVar.m(jSONObject);
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null || !ux9Var.f) {
            View view = this.mContainer;
            if (view != null) {
                FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.taolive_highlight_sing_bottom);
                this.singBottomLayout = frameLayout2;
                if (frameLayout2 != null && this.bottomDxView != null) {
                    frameLayout2.removeAllViews();
                    this.singBottomLayout.setVisibility(0);
                    initMuteIcon();
                    this.singBottomLayout.addView(this.bottomDxView);
                    axa.f().h(this.bottomDxView, jSONObject, this.mFrameContext);
                    sbu.k(this.mFrameContext, "Page_TaobaoLiveWatch_Show-BottomNavigationBar", iut.a(jSONObject));
                    return;
                }
                return;
            }
            return;
        }
        View view2 = this.mContainer;
        if (!(view2 == null || view2.getRootView() == null)) {
            this.singBottomLayout = (FrameLayout) this.mContainer.getRootView().findViewById(R.id.taolive_highlight_base_bottom_layout);
        }
        FrameLayout frameLayout3 = this.singBottomLayout;
        if (frameLayout3 != null && this.frameLayout != null) {
            frameLayout3.removeAllViews();
            this.singBottomLayout.setVisibility(0);
            this.frameLayout.setBackground(null);
            View view3 = this.mContainer;
            if (!(view3 == null || view3.getRootView() == null || (frameLayout = (FrameLayout) this.mContainer.getRootView().findViewById(R.id.taolive_highlight_base_bottom_background)) == null)) {
                frameLayout.setVisibility(0);
            }
            if (this.mContext != null && jSONObject != null) {
                HighlightBottomFrame highlightBottomFrame = new HighlightBottomFrame(this.mContext, this.mFrameContext, jSONObject);
                this.highlightBottomFrame = highlightBottomFrame;
                highlightBottomFrame.createView(this.singBottomLayout);
                addComponent(this.highlightBottomFrame);
            }
        }
    }

    private void renderSingleCard(JSONObject jSONObject) {
        LiveTimemovingModel liveTimemovingModel;
        String str;
        String str2;
        LiveItem.Ext ext;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16980e5b", new Object[]{this, jSONObject});
            return;
        }
        ztt.c(jSONObject);
        if (jSONObject != null && this.mContext != null) {
            JSONObject handleTimeMovingSource = handleTimeMovingSource(jSONObject);
            if (handleTimeMovingSource != null) {
                ux9 ux9Var = this.mFrameContext;
                if (ux9Var == null || !ux9Var.f) {
                    str2 = "taolive_highlight_single_bigcard";
                    str = "taolive_highlight_single_seckill";
                } else {
                    str2 = "taolive_highlight_single_bigcard_2025";
                    str = "taolive_highlight_single_seckill_2025";
                }
                liveTimemovingModel = (LiveTimemovingModel) fkx.f(handleTimeMovingSource.toJSONString(), LiveTimemovingModel.class);
                this.dxCardRootView = axa.f().a(this.mContext, str2);
                if (!(liveTimemovingModel == null || (ext = liveTimemovingModel.extendVal) == null || (str3 = ext.secKillInfo) == null || JSON.parseObject(str3) == null || !"secKill".equals(liveTimemovingModel.extendVal.itemBizType))) {
                    this.dxCardRootView = axa.f().a(this.mContext, str);
                }
                DXRootView dXRootView = this.dxCardRootView;
                if (!(dXRootView == null || this.singCardItemLayout == null)) {
                    o0e o0eVar = this.timeshiftDxUtils;
                    if (o0eVar instanceof hut) {
                        ((hut) o0eVar).d(dXRootView);
                    }
                    this.singCardItemLayout.removeAllViews();
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    if (!uwa.q() || !vc.a() || !vc.h(this.mContext)) {
                        layoutParams.gravity = 17;
                    } else {
                        layoutParams.setMarginEnd(30);
                        layoutParams.gravity = 5;
                    }
                    this.singCardItemLayout.addView(this.dxCardRootView, layoutParams);
                    axa.f().h(this.dxCardRootView, (JSONObject) handleTimeMovingSource.clone(), this.mFrameContext);
                }
            } else {
                renderSingleEmptyCard();
                liveTimemovingModel = null;
            }
            if (liveTimemovingModel != null) {
                showBigCardUt(liveTimemovingModel.itemId);
            }
        }
    }

    private void renderSingleCardByGoods(JSONObject jSONObject) {
        LiveItem liveItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54f4638", new Object[]{this, jSONObject});
        } else if ((this.mContext instanceof Activity) && this.mFrameContext != null && this.singCardItemLayout != null && jSONObject != null) {
            JSONObject handleTimeMovingSource = handleTimeMovingSource(jSONObject);
            if (handleTimeMovingSource != null) {
                JSONObject jSONObject2 = handleTimeMovingSource.getJSONObject(bia.UNDER_TAKE_EXPLOSION_CARD);
                if (jSONObject2 != null && (liveItem = (LiveItem) fkx.f(jSONObject2.toJSONString(), LiveItem.class)) != null) {
                    handleGoodsCardParams(liveItem, handleTimeMovingSource);
                    BaseFrame createBigCardKandianFrame = d9m.n().createBigCardKandianFrame((Activity) this.mContext, this.mFrameContext, liveItem, this.singCardItemLayout);
                    if (createBigCardKandianFrame != null) {
                        addComponent(createBigCardKandianFrame);
                    }
                    showBigCardUt(String.valueOf(liveItem.itemId));
                    return;
                }
                return;
            }
            renderSingleEmptyCard();
        }
    }

    private void renderSingleEmptyCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10d5a726", new Object[]{this});
        } else if (uwa.f()) {
            DXRootView a2 = axa.f().a(this.mContext, "taolive_highlight_single_empty_card");
            this.dxCardRootView = a2;
            FrameLayout frameLayout = this.singCardItemLayout;
            if (frameLayout != null && a2 != null) {
                frameLayout.removeAllViews();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.setMarginEnd(30);
                layoutParams.gravity = 5;
                this.singCardItemLayout.addView(this.dxCardRootView, layoutParams);
                axa.f().h(this.dxCardRootView, new JSONObject(), this.mFrameContext);
            }
        }
    }

    private void showBigCardUt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87237583", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            hashMap.put("itemId", str);
        }
        sbu.k(this.mFrameContext, "highlightSingCardShow", hashMap);
    }

    private void showTimeShift(String str, String str2, String str3, String str4, iz1 iz1Var) {
        com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87fe091d", new Object[]{this, str, str2, str3, str4, iz1Var});
        } else if (this.timeshiftDxUtils != null && (aVar = this.timeShiftRequestDx) != null) {
            aVar.i(this.mFrameContext, iz1Var, str3, str4, new b(str3));
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return TAG;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void createView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50080207", new Object[]{this, viewGroup});
            return;
        }
        super.createView(viewGroup);
        if ((viewGroup instanceof FrameLayout) && this.mContext != null) {
            FrameLayout frameLayout = (FrameLayout) viewGroup;
            this.frameLayout = frameLayout;
            frameLayout.setVisibility(0);
            View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_higlight_dx_timeshift_single, (ViewGroup) null);
            this.mContainer = inflate;
            this.frameLayout.addView(inflate);
        }
        if (vc.a() && (vc.i(this.mContext) || vc.d(this.mContext))) {
            vc.k(this);
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null && ux9Var.h() != null) {
            this.mFrameContext.h().a(this);
        }
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_HIGHLIGHT_NOTIFY_CARD_RENDER};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null) {
            return null;
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
        clearScreenFrame();
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null && ux9Var.h() != null) {
            this.mFrameContext.h().b(this);
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
        initView();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (vc.a() && (vc.i(this.mContext) || vc.d(this.mContext))) {
            vc.l(this);
        }
        com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a aVar = this.timeShiftRequestDx;
        if (aVar != null) {
            aVar.c();
            this.timeShiftRequestDx = null;
        }
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (!uyg.EVENT_HIGHLIGHT_NOTIFY_CARD_RENDER.equals(str)) {
        } else {
            if (uwa.y()) {
                adjustNewCardListMargin(obj);
            } else {
                adjustCardListMargin();
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
        checkMuteStatus();
    }

    @Override // com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.AbstractTimeShiftDXFrame, tb.huk
    public void onScreenOrientationChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c2a98", new Object[]{this, new Boolean(z)});
        } else if (this.dxCardRootView != null) {
            axa f = axa.f();
            DXRootView dXRootView = this.dxCardRootView;
            f.h(dXRootView, dXRootView.getData(), this.mFrameContext);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
            return;
        }
        super.onWillAppear();
        clearScreenFrame();
    }

    @Override // com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.AbstractTimeShiftDXFrame
    public void showTimeShiftLayerCallBack(Map<String, String> map, boolean z, iz1 iz1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("550e2130", new Object[]{this, map, new Boolean(z), iz1Var});
        } else if (map != null) {
            showTimeShift(map.get("timeShiftSoure"), map.get("timeMovingId"), map.get("itemId"), map.get("keyPointId"), iz1Var);
        }
    }

    public JSONObject handleTimeMovingSource(JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6cbbb96b", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("model");
            if (jSONObject2 == null || (jSONArray = jSONObject2.getJSONArray("timeMovingList")) == null || jSONArray.isEmpty()) {
                return null;
            }
            return jSONArray.getJSONObject(0);
        } catch (Exception unused) {
            return null;
        }
    }
}
