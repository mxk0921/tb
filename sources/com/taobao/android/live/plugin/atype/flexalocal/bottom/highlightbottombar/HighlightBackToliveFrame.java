package com.taobao.android.live.plugin.atype.flexalocal.bottom.highlightbottombar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.highlightbottombar.HighlightBackToliveFrame;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.HashMap;
import tb.d4s;
import tb.giv;
import tb.hw0;
import tb.s3c;
import tb.t2o;
import tb.ux9;
import tb.uyg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HighlightBackToliveFrame extends BaseFrame implements View.OnClickListener, s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BOTTOM_DEFAULT_BG = "#4D0E1119";
    private static final String BOTTOM_RED_BG = "#FFFF3333";
    private static final String LIVE_ICON_URL = "https://img.alicdn.com/imgextra/i1/O1CN01VMlQ7m1vNKj6xUWCA_!!6000000006160-54-tps-64-64.apng";
    private static final String TAG = "HiglightBackToliveFrame";
    private ValueAnimator colorAnimation;
    private View mBackToLive;
    private AliUrlImageView mBackToLiveImg;
    private TextView mBackToLiveText;
    private final JSONObject mJsonObject;
    private TextView preDesText;
    private View preLiveLayout;
    private TextView preSubscribeText;
    private AliUrlImageView prelineSegment;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private float x = 0.0f;
    private ValueAnimator mValueAnimator1 = null;
    private ValueAnimator mValueAnimator2 = null;
    public boolean playBottomAnimation = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else if (valueAnimator != null && valueAnimator.getAnimatedValue() != null) {
                HighlightBackToliveFrame.access$002(HighlightBackToliveFrame.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                HighlightBackToliveFrame.access$100(HighlightBackToliveFrame.this, HighlightBackToliveFrame.BOTTOM_RED_BG, HighlightBackToliveFrame.BOTTOM_DEFAULT_BG);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else if (valueAnimator != null && valueAnimator.getAnimatedValue() != null) {
                    HighlightBackToliveFrame.access$002(HighlightBackToliveFrame.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                    HighlightBackToliveFrame.access$100(HighlightBackToliveFrame.this, HighlightBackToliveFrame.BOTTOM_DEFAULT_BG, HighlightBackToliveFrame.BOTTOM_RED_BG);
                }
            }
        }

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/highlightbottombar/HighlightBackToliveFrame$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            HighlightBackToliveFrame.access$202(HighlightBackToliveFrame.this, ValueAnimator.ofFloat(0.0f, 1.4f));
            HighlightBackToliveFrame.access$200(HighlightBackToliveFrame.this).addUpdateListener(new a());
            HighlightBackToliveFrame.access$200(HighlightBackToliveFrame.this).setDuration(1500L);
            HighlightBackToliveFrame.access$200(HighlightBackToliveFrame.this).start();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
            } else if (HighlightBackToliveFrame.access$300(HighlightBackToliveFrame.this) != null && HighlightBackToliveFrame.access$400(HighlightBackToliveFrame.this) != null && HighlightBackToliveFrame.access$500(HighlightBackToliveFrame.this) != null) {
                int measuredWidth = HighlightBackToliveFrame.access$300(HighlightBackToliveFrame.this).getMeasuredWidth();
                int measuredHeight = HighlightBackToliveFrame.access$300(HighlightBackToliveFrame.this).getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    int i = measuredWidth / measuredHeight;
                    if (i < 2) {
                        HighlightBackToliveFrame.access$400(HighlightBackToliveFrame.this).setText("直播");
                        HighlightBackToliveFrame.access$400(HighlightBackToliveFrame.this).setTextSize(1, 10.0f);
                        HighlightBackToliveFrame.access$500(HighlightBackToliveFrame.this).setVisibility(8);
                    } else if (i < 3) {
                        HighlightBackToliveFrame.access$400(HighlightBackToliveFrame.this).setText("回直播");
                        HighlightBackToliveFrame.access$500(HighlightBackToliveFrame.this).setVisibility(8);
                    }
                }
                HighlightBackToliveFrame.access$300(HighlightBackToliveFrame.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    static {
        t2o.a(295698550);
        t2o.a(806355016);
    }

    public HighlightBackToliveFrame(Context context, ux9 ux9Var, JSONObject jSONObject) {
        super(context, ux9Var);
        this.mJsonObject = jSONObject;
    }

    public static /* synthetic */ float access$002(HighlightBackToliveFrame highlightBackToliveFrame, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eef7f56", new Object[]{highlightBackToliveFrame, new Float(f)})).floatValue();
        }
        highlightBackToliveFrame.x = f;
        return f;
    }

    public static /* synthetic */ void access$100(HighlightBackToliveFrame highlightBackToliveFrame, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3825b8ed", new Object[]{highlightBackToliveFrame, str, str2});
        } else {
            highlightBackToliveFrame.setBg(str, str2);
        }
    }

    public static /* synthetic */ ValueAnimator access$200(HighlightBackToliveFrame highlightBackToliveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("429c647e", new Object[]{highlightBackToliveFrame});
        }
        return highlightBackToliveFrame.mValueAnimator2;
    }

    public static /* synthetic */ ValueAnimator access$202(HighlightBackToliveFrame highlightBackToliveFrame, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("5771ebfc", new Object[]{highlightBackToliveFrame, valueAnimator});
        }
        highlightBackToliveFrame.mValueAnimator2 = valueAnimator;
        return valueAnimator;
    }

    public static /* synthetic */ View access$300(HighlightBackToliveFrame highlightBackToliveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("84cdc15d", new Object[]{highlightBackToliveFrame});
        }
        return highlightBackToliveFrame.mBackToLive;
    }

    public static /* synthetic */ TextView access$400(HighlightBackToliveFrame highlightBackToliveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("c1a04510", new Object[]{highlightBackToliveFrame});
        }
        return highlightBackToliveFrame.mBackToLiveText;
    }

    public static /* synthetic */ AliUrlImageView access$500(HighlightBackToliveFrame highlightBackToliveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliUrlImageView) ipChange.ipc$dispatch("c6afb7ff", new Object[]{highlightBackToliveFrame});
        }
        return highlightBackToliveFrame.mBackToLiveImg;
    }

    private void adjustDiffScreen() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd4ab247", new Object[]{this});
        } else if (this.mBackToLiveText != null && (view = this.mBackToLive) != null && this.mBackToLiveImg != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new c());
        }
    }

    private void backToLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e3d355", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null && ux9Var.h() != null) {
            this.mFrameContext.h().d(uyg.EVENT_HIGHLIGHT_BACK_TO_LIVE_EVENT);
        }
    }

    private void destoryAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f765cf22", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.colorAnimation;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.colorAnimation.cancel();
            this.colorAnimation = null;
        }
        ValueAnimator valueAnimator2 = this.mValueAnimator1;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.mValueAnimator1.cancel();
            this.mValueAnimator1 = null;
        }
        ValueAnimator valueAnimator3 = this.mValueAnimator2;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllListeners();
            this.mValueAnimator2.cancel();
            this.mValueAnimator2 = null;
        }
    }

    private void exectGradientAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce255e1", new Object[]{this});
        } else {
            this.mHandler.postDelayed(new Runnable() { // from class: tb.qwa
                @Override // java.lang.Runnable
                public final void run() {
                    HighlightBackToliveFrame.this.lambda$exectGradientAnimator$1();
                }
            }, 10000L);
        }
    }

    private HashMap<String, String> handleSingleBottomUT(JSONObject jSONObject) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f2cfb472", new Object[]{this, jSONObject});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (jSONObject != null) {
            try {
                if (!jSONObject.getBoolean("isLiving").booleanValue()) {
                    if (jSONObject.getJSONObject("highlightLastPreLiveInfo") == null || TextUtils.isEmpty(jSONObject.getJSONObject("highlightLastPreLiveInfo").getString("latestPreLiveStartTimeDesc"))) {
                        i = 0;
                    } else {
                        i = 2;
                    }
                }
                hashMap.put("button_status", String.valueOf(i));
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    private void handleVisiableStatus(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7648662c", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            if (jSONObject.getBooleanValue("isLiving")) {
                showLiveStatus();
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("highlightLastPreLiveInfo");
            if (jSONObject2 != null && !TextUtils.isEmpty(jSONObject2.getString("latestPreLiveStartTimeDesc"))) {
                showPreLiveStatus(jSONObject2);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(HighlightBackToliveFrame highlightBackToliveFrame, String str, Object... objArr) {
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/highlightbottombar/HighlightBackToliveFrame");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$exectGradientAnimator$1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afeda11", new Object[]{this});
        } else if (this.mBackToLive != null) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), 1292767513, -52429);
            this.colorAnimation = ofObject;
            ofObject.setDuration(300L);
            this.colorAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.swa
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    HighlightBackToliveFrame.this.lambda$null$0(valueAnimator);
                }
            });
            this.colorAnimation.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$null$0(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e7abd", new Object[]{this, valueAnimator});
            return;
        }
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(intValue);
        gradientDrawable.setCornerRadius(hw0.b(this.mContext, 10.0f));
        this.mBackToLive.setBackground(gradientDrawable);
    }

    private void setBg(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c336362", new Object[]{this, str, str2});
            return;
        }
        int[] iArr = {Color.parseColor(str), Color.parseColor(str2)};
        float f = this.x;
        float[] fArr = {f - 0.4f, f};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setCornerRadius(hw0.b(this.mContext, 10.0f));
        if (Build.VERSION.SDK_INT >= 29) {
            gradientDrawable.setColors(iArr, fArr);
        } else {
            gradientDrawable.setColors(iArr);
        }
        View view = this.mBackToLive;
        if (view != null) {
            view.setBackground(gradientDrawable);
        }
    }

    private void showLiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("570289e2", new Object[]{this});
            return;
        }
        View view = this.preLiveLayout;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.mBackToLive;
        if (view2 != null) {
            view2.setVisibility(0);
            this.mBackToLive.setBackgroundResource(R.drawable.taolive_higlight_back_to_live_btn_flexalocal);
            AliUrlImageView aliUrlImageView = this.mBackToLiveImg;
            if (aliUrlImageView != null) {
                aliUrlImageView.setSkipAutoSize(true);
                this.mBackToLiveImg.setImageUrl(LIVE_ICON_URL);
            }
        }
        if (!highlightPlayNewAnimation()) {
            exectGradientAnimator();
        }
        adjustDiffScreen();
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
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return TAG;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_bottombar_highlight_back_to_live_layout_flexalocal;
    }

    public boolean highlightPlayNewAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b72ae77", new Object[]{this})).booleanValue();
        }
        return d4s.e("highlightPlayNewAnimation", true);
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_HIGHLIGHT_SUBSCRIBE_CALLBACK_EVENT, uyg.EVENT_HIGHLIGHT_PLAYER_COMPLETION};
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
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.h() == null)) {
            this.mFrameContext.h().b(this);
        }
        this.mHandler.removeCallbacksAndMessages(null);
        destoryAnimator();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (R.id.taolive_highlight_back_to_live_layout == id) {
            backToLive();
        } else if (!(R.id.taolive_highlight_pre_live_layout != id || (jSONObject = this.mJsonObject) == null || (jSONObject2 = jSONObject.getJSONObject("highlightLastPreLiveInfo")) == null || jSONObject2.getBoolean("preUserSubscribe") == null)) {
            boolean booleanValue = jSONObject2.getBooleanValue("preUserSubscribe");
            ux9 ux9Var = this.mFrameContext;
            if (!(ux9Var == null || ux9Var.h() == null)) {
                this.mFrameContext.h().e(uyg.EVENT_HIGHLIGHT_SUBSCRIBE_EVENT, Boolean.valueOf(booleanValue));
            }
        }
        if (giv.f() != null) {
            giv.f().m(this.mFrameContext, "BottomNavigationBar", handleSingleBottomUT(this.mJsonObject));
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
        if (!(ux9Var == null || ux9Var.h() == null)) {
            this.mFrameContext.h().a(this);
        }
        handleVisiableStatus(this.mJsonObject);
        if (giv.f() != null) {
            giv.f().p(this.mFrameContext, "Page_TaobaoLiveWatch_Show-BottomNavigationBar", handleSingleBottomUT(this.mJsonObject));
        }
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (uyg.EVENT_HIGHLIGHT_SUBSCRIBE_CALLBACK_EVENT.equals(str)) {
            if ((obj instanceof JSONObject) && (jSONObject = this.mJsonObject) != null) {
                jSONObject.put("highlightLastPreLiveInfo", obj);
                handleVisiableStatus(this.mJsonObject);
            }
        } else if (uyg.EVENT_HIGHLIGHT_PLAYER_COMPLETION.equals(str) && highlightPlayNewAnimation() && !this.playBottomAnimation) {
            this.playBottomAnimation = true;
            startToStopChange();
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
        View findViewById = view.findViewById(R.id.taolive_highlight_back_to_live_layout);
        this.mBackToLive = findViewById;
        ViewProxy.setOnClickListener(findViewById, this);
        this.mBackToLive.setVisibility(8);
        this.mBackToLiveImg = (AliUrlImageView) view.findViewById(R.id.tblive_highlight_icon_back_to_live_img);
        this.mBackToLiveText = (TextView) view.findViewById(R.id.tblive_highlight_icon_back_to_live_text);
        View findViewById2 = view.findViewById(R.id.taolive_highlight_pre_live_layout);
        this.preLiveLayout = findViewById2;
        ViewProxy.setOnClickListener(findViewById2, this);
        this.preLiveLayout.setVisibility(8);
        this.prelineSegment = (AliUrlImageView) view.findViewById(R.id.tblive_highlight_pre_line_segment);
        this.preDesText = (TextView) view.findViewById(R.id.tblive_highlight_pre_des_text);
        this.preSubscribeText = (TextView) view.findViewById(R.id.tblive_highlight_pre_subscribe_text);
    }

    public void startToStopChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b92f5b6", new Object[]{this});
            return;
        }
        if (this.mValueAnimator1 == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.4f);
            this.mValueAnimator1 = ofFloat;
            ofFloat.addUpdateListener(new a());
            this.mValueAnimator1.addListener(new b());
        }
        this.mValueAnimator1.setDuration(3000L);
        this.mValueAnimator1.start();
    }

    private void showPreLiveStatus(JSONObject jSONObject) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ab32c5", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            View view = this.mBackToLive;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.preLiveLayout;
            if (view2 != null) {
                view2.setVisibility(0);
                AliUrlImageView aliUrlImageView = this.prelineSegment;
                if (aliUrlImageView != null) {
                    aliUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01HAMooS1JcwgGiBUXd_!!6000000001050-2-tps-4-48.png");
                }
            }
            String string = jSONObject.getString("latestPreLiveStartTimeDesc");
            if (!TextUtils.isEmpty(string) && (textView = this.preDesText) != null) {
                textView.setText(string);
            }
            boolean booleanValue = jSONObject.getBooleanValue("preUserSubscribe");
            TextView textView2 = this.preSubscribeText;
            if (textView2 == null) {
                return;
            }
            if (booleanValue) {
                textView2.setText("已预约");
            } else {
                textView2.setText("立即预约");
            }
        }
    }
}
