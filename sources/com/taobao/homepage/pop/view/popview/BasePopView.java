package com.taobao.homepage.pop.view.popview;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.view.HandlerTimer;
import com.taobao.homepage.pop.protocol.event.IPopMessageListener;
import com.taobao.homepage.pop.protocol.event.IPopViewEventListener;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.schedule.ViewProxy;
import tb.bgm;
import tb.dbd;
import tb.e3b;
import tb.mve;
import tb.shm;
import tb.vfm;
import tb.xq1;
import tb.yhm;
import tb.zbm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BasePopView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ORANGE_KEY_ENABLE_REMOVE_FINISHED_POP = "enableRemoveFinishedPopWhenResume";
    private static final String TAG = "BasePopView ";
    public xq1 mAnchorFinder;
    public View mAnchorView;
    private Boolean mFixPopWhenTabSwitchOnRecommendEnable;
    public HandlerTimer mHandlerTimer;
    public String mLastMessage;
    public IPopAnchorViewInfo mOriginViewInfo;
    public IPopData mPopData;
    public e3b mPopEngine;
    public IPopViewEventListener mPopEventListener;
    public IPopMessageListener mPopMessageListener;
    public View mPopView;
    public dbd mViewProvider;
    public int mLastEvent = -1;
    public boolean mIsScrollVisible = true;
    public boolean mIsCardVisible = true;
    public boolean mIsPageVisible = true;
    public boolean mIsTabVisible = true;
    public boolean mIsPopLayerInvisible = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(BasePopView basePopView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    public BasePopView(Context context, IPopData iPopData, dbd dbdVar, xq1 xq1Var, e3b e3bVar) {
        super(context);
        this.mPopEngine = e3bVar;
        this.mPopData = iPopData;
        this.mViewProvider = dbdVar;
        this.mAnchorFinder = xq1Var;
        if (vfm.a()) {
            setBackgroundColor(Color.parseColor("#33ffff00"));
        }
    }

    private void initPopVisible(int i) {
        IPopData iPopData;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7337abeb", new Object[]{this, new Integer(i)});
        } else if (this.mPopView != null && this.mPopEngine != null && (iPopData = this.mPopData) != null) {
            IPopConfig popConfig = iPopData.getPopConfig();
            zbm f = this.mPopEngine.f();
            if (popConfig.isPageSwitchHidden()) {
                z = f.f();
            } else {
                z = true;
            }
            this.mIsPageVisible = z;
            if (popConfig.isTabSwitchHidden()) {
                z2 = f.i();
            } else {
                z2 = true;
            }
            this.mIsTabVisible = z2;
            if (popConfig.isPopLayerHidden()) {
                z3 = f.g();
            } else {
                z3 = true;
            }
            this.mIsPopLayerInvisible = z3;
            if (popConfig.isSideslipHidden() && i != 0) {
                z4 = false;
            }
            this.mIsScrollVisible = z4;
            View view = this.mPopView;
            if (!isCurrentVisible()) {
                i2 = 4;
            }
            view.setVisibility(i2);
        }
    }

    private void initTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb3ce1c", new Object[]{this});
        } else if (this.mPopData.getPopConfig().getShowTimeMills() > 0) {
            HandlerTimer handlerTimer = new HandlerTimer(new shm(this, this.mPopData));
            this.mHandlerTimer = handlerTimer;
            handlerTimer.f(this.mPopData.getPopConfig().getRefreshInterval());
        }
    }

    public static /* synthetic */ Object ipc$super(BasePopView basePopView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/view/popview/BasePopView");
    }

    private boolean isFixPopWhenTabSwitchOnRecommend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9dddb97f", new Object[]{this})).booleanValue();
        }
        if (this.mFixPopWhenTabSwitchOnRecommendEnable == null) {
            this.mFixPopWhenTabSwitchOnRecommendEnable = Boolean.valueOf(mve.a("fixPopWhenTabSwitchOnRecommendEnable", true));
        }
        return this.mFixPopWhenTabSwitchOnRecommendEnable.booleanValue();
    }

    private boolean isRecommendTabSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("234178c9", new Object[]{this})).booleanValue();
        }
        e3b e3bVar = this.mPopEngine;
        if (e3bVar == null) {
            return false;
        }
        return e3bVar.h().e();
    }

    private boolean isTabSwitch(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("305179a1", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == 4 || i == 3) {
            return true;
        }
        return false;
    }

    private boolean shouldChangeVisible(IPopConfig iPopConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff5ee795", new Object[]{this, iPopConfig, new Integer(i)})).booleanValue();
        }
        if (iPopConfig == null) {
            return false;
        }
        if (i == 1) {
            return iPopConfig.isPopLayerHidden();
        }
        if (i == 3 || i == 4) {
            return iPopConfig.isTabSwitchHidden();
        }
        return iPopConfig.isPageSwitchHidden();
    }

    private boolean shouldProcessAttach(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af877078", new Object[]{this, view, str})).booleanValue();
        }
        if (view == null || this.mPopData.getPopConfig().getPoint() == null || !TextUtils.equals(str, this.mPopData.getPopConfig().getPoint().getSectionBizCode())) {
            return false;
        }
        return true;
    }

    private void startTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8b0a", new Object[]{this});
            return;
        }
        HandlerTimer handlerTimer = this.mHandlerTimer;
        if (handlerTimer != null) {
            handlerTimer.f(this.mPopData.getPopConfig().getRefreshInterval());
            vfm.f(TAG, "startTimer, " + this);
        }
    }

    private void stopTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b325b6a", new Object[]{this});
            return;
        }
        HandlerTimer handlerTimer = this.mHandlerTimer;
        if (handlerTimer != null) {
            handlerTimer.g();
            vfm.f(TAG, "stopTimer, " + this);
        }
    }

    public boolean checkReRender() {
        dbd dbdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4519fedc", new Object[]{this})).booleanValue();
        }
        View view = this.mPopView;
        if (view == null || (dbdVar = this.mViewProvider) == null) {
            return false;
        }
        return dbdVar.g(view, this.mPopData);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        stopTimer();
        this.mIsPopLayerInvisible = false;
        this.mIsScrollVisible = false;
        this.mIsTabVisible = false;
        this.mIsPageVisible = false;
        this.mIsCardVisible = false;
        vfm.f(TAG, "destroy pop view, " + this);
    }

    public IPopAnchorViewInfo getOriginViewInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopAnchorViewInfo) ipChange.ipc$dispatch("89e6e988", new Object[]{this});
        }
        return this.mOriginViewInfo;
    }

    public JSONObject getPopReqParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e31b0e10", new Object[]{this});
        }
        return yhm.a(3, "other", this.mPopData);
    }

    public boolean isFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
        }
        IPopData iPopData = this.mPopData;
        if (iPopData == null || !iPopData.getPopConfig().isPopMessage()) {
            return yhm.d(this.mLastEvent);
        }
        return yhm.c(this.mLastMessage);
    }

    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
            return;
        }
        dbd dbdVar = this.mViewProvider;
        if (dbdVar != null) {
            dbdVar.onAppToBackground();
        }
    }

    public void onAppToForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c3baf87", new Object[]{this});
            return;
        }
        dbd dbdVar = this.mViewProvider;
        if (dbdVar != null) {
            dbdVar.b();
        }
    }

    public void onHandlePopViewEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c3c8c11", new Object[]{this, new Integer(i)});
        }
    }

    public void onHandlePopViewMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dfaabe9", new Object[]{this, str});
        }
    }

    public void onInfoFlowEnter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb0d3df", new Object[]{this, new Integer(i)});
        } else if (isTabSwitch(i)) {
            onTabEnter(i);
        } else {
            onPageEnter(i);
        }
    }

    public void onInfoFlowLeave(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbaf9f60", new Object[]{this, new Integer(i)});
        } else if (isTabSwitch(i)) {
            onTabLeave(i);
        } else {
            onPageLeave(i);
        }
    }

    public void onPause(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb560aa8", new Object[]{this, str});
        }
    }

    public void onResume(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72eca07d", new Object[]{this, str});
        }
    }

    public void onScrollStateChange(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f0bc1a8", new Object[]{this, viewGroup, new Integer(i)});
        } else {
            this.mViewProvider.a(viewGroup, this.mPopView, i);
        }
    }

    public void pausePop(boolean z, String str, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3111978", new Object[]{this, new Boolean(z), str, new Boolean(z2)});
        } else if (this.mPopView != null) {
            if (!z) {
                vfm.f(TAG, " pop has already pause, discard pausePop");
            } else if (isFinished()) {
                vfm.f(TAG, " pausePop pop error, already finish");
            } else {
                if (z2) {
                    this.mPopView.setVisibility(4);
                }
                onPause(str);
                stopTimer();
                bgm.b(str, this.mPopData);
                vfm.c(TAG, " pausePop, " + this);
            }
        }
    }

    public void resumePop(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6ff053", new Object[]{this, new Boolean(z), str});
        } else if (this.mPopView != null) {
            if (z) {
                vfm.f(TAG, " pop has already resume, discard resumePop");
            } else if (isFinished()) {
                removeFinishedPopIfNeed();
                vfm.f(TAG, " resumePop pop error, already finish");
            } else if (!isCurrentVisible()) {
                vfm.f(TAG, " resumePop pop error, currentVisible=false");
            } else {
                onResume(str);
                this.mPopView.setVisibility(0);
                startTimer();
                bgm.b(str, this.mPopData);
                vfm.c(TAG, " resumePop, " + this);
            }
        }
    }

    @Override // android.view.View
    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append(", height=");
        sb.append(getHeight());
        sb.append(", visibility=");
        sb.append(isCurrentVisible());
        sb.append(", event=");
        sb.append(this.mLastEvent);
        sb.append(", message=");
        sb.append(this.mLastMessage);
        sb.append(", businessId=");
        IPopData iPopData = this.mPopData;
        if (iPopData != null) {
            str = iPopData.getBusinessID();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(", translationY=");
        sb.append(getTranslationY());
        return sb.toString();
    }

    public void triggerInvalidPopRemove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832b1d5d", new Object[]{this});
        } else if (this.mPopData.getPopConfig().isPopMessage()) {
            triggerPopMessage("other", this.mPopData.getBusinessID(), null);
        } else {
            triggerPopViewEvent(3, this.mPopData.getBusinessID());
        }
    }

    public void updatePopViewByTimer(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5217badc", new Object[]{this, new Long(j)});
        } else {
            this.mViewProvider.e(this, j);
        }
    }

    private void removeFinishedPopIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a563e15", new Object[]{this});
        } else if (mve.a(ORANGE_KEY_ENABLE_REMOVE_FINISHED_POP, true)) {
            triggerInvalidPopRemove();
            vfm.f(TAG, "remove finished pop when resume");
        }
    }

    public void onCardAttached(int i, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("339efcd3", new Object[]{this, new Integer(i), view, str});
        } else if (shouldProcessAttach(view, str)) {
            boolean isCurrentVisible = isCurrentVisible();
            this.mIsCardVisible = true;
            vfm.f(TAG, "setCardVisible = true, " + hashCode());
            resumePop(isCurrentVisible, "PopViewResumeByCard");
        }
    }

    public void onPageEnter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79643f32", new Object[]{this, new Integer(i)});
        } else if (this.mPopData.getPopConfig().isPageSwitchHidden()) {
            boolean isCurrentVisible = isCurrentVisible();
            this.mIsPageVisible = true;
            vfm.f(TAG, "setPageVisible = true, " + hashCode());
            resumePop(isCurrentVisible, bgm.g(true, i));
        }
    }

    public void onPageLeave(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8630ab3", new Object[]{this, new Integer(i)});
        } else if (this.mPopData.getPopConfig().isPageSwitchHidden()) {
            boolean isCurrentVisible = isCurrentVisible();
            boolean shouldChangeVisible = shouldChangeVisible(this.mPopData.getPopConfig(), i);
            this.mIsPageVisible = false;
            vfm.f(TAG, "setPageVisible = false, changeVisible=" + shouldChangeVisible + ", " + hashCode());
            pausePop(isCurrentVisible, bgm.g(false, i), shouldChangeVisible);
        }
    }

    public void onPopLayerDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26527412", new Object[]{this});
        } else if (this.mPopData.getPopConfig().isPopLayerHidden()) {
            boolean isCurrentVisible = isCurrentVisible();
            this.mIsPopLayerInvisible = true;
            vfm.f(TAG, "set popLayerInvisible = true, " + hashCode());
            resumePop(isCurrentVisible, bgm.g(true, 1));
        }
    }

    public void onTabEnter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("737ec95a", new Object[]{this, new Integer(i)});
        } else if (this.mPopData.getPopConfig().isTabSwitchHidden()) {
            if (i != 3 || isRecommendTabSelected()) {
                if (i == 3 && isRecommendTabSelected()) {
                    vfm.f(TAG, "tabSwitch enter, but recommend tab selected, discard. " + hashCode());
                    if (isFixPopWhenTabSwitchOnRecommend()) {
                        startTimer();
                        vfm.f(TAG, "startTimer " + hashCode());
                    }
                }
                boolean isCurrentVisible = isCurrentVisible();
                this.mIsTabVisible = true;
                vfm.f(TAG, "setTabVisible = true, " + hashCode());
                resumePop(isCurrentVisible, bgm.g(true, i));
                return;
            }
            vfm.f(TAG, "tabSwitch enter, but recommend tab unselected, discard. " + hashCode());
        }
    }

    public void onTabLeave(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a27d94db", new Object[]{this, new Integer(i)});
        } else if (this.mPopData.getPopConfig().isTabSwitchHidden()) {
            if (i != 3 || !isRecommendTabSelected()) {
                boolean isCurrentVisible = isCurrentVisible();
                boolean shouldChangeVisible = shouldChangeVisible(this.mPopData.getPopConfig(), i);
                this.mIsTabVisible = false;
                vfm.f(TAG, "setTabVisible = false, changeVisible=" + shouldChangeVisible + ", " + hashCode());
                pausePop(isCurrentVisible, bgm.g(false, i), shouldChangeVisible);
                return;
            }
            vfm.f(TAG, "tabSwitch leave, but recommend tab selected, discard. " + hashCode());
            if (isFixPopWhenTabSwitchOnRecommend()) {
                stopTimer();
                vfm.f(TAG, "stopTimer " + hashCode());
            }
        }
    }

    public void translate(float f, float f2) {
        IPopAnchorViewInfo c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b81b595", new Object[]{this, new Float(f), new Float(f2)});
        } else if (this.mIsCardVisible && (c = this.mAnchorFinder.c(this.mAnchorView, 0)) != null) {
            int b = this.mAnchorFinder.b(this.mPopData, c, this.mPopView);
            setTranslationY(b);
            vfm.e(TAG, "set transY=" + b + ", " + this);
        }
    }

    public void triggerPopViewEvent(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("708e292a", new Object[]{this, new Integer(i), str});
        } else if (TextUtils.equals(str, this.mPopData.getBusinessID())) {
            IPopData iPopData = this.mPopData;
            if (iPopData == null || !iPopData.getPopConfig().isPopMessage()) {
                this.mLastEvent = i;
                vfm.f(TAG, "update pop event=" + i + ", hashcode=" + this);
                onHandlePopViewEvent(i);
                this.mViewProvider.c(this.mPopView, i, this.mPopData);
                IPopViewEventListener iPopViewEventListener = this.mPopEventListener;
                if (iPopViewEventListener != null) {
                    iPopViewEventListener.onEvent(i, this.mPopData);
                }
                if (i != 3) {
                    bgm.b(bgm.h(i), this.mPopData);
                }
                if (yhm.d(i)) {
                    stopTimer();
                }
            }
        }
    }

    public boolean initPopView(View view, IPopAnchorViewInfo iPopAnchorViewInfo, int i, IPopViewEventListener iPopViewEventListener, IPopMessageListener iPopMessageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46c68cf4", new Object[]{this, view, iPopAnchorViewInfo, new Integer(i), iPopViewEventListener, iPopMessageListener})).booleanValue();
        }
        this.mAnchorView = view;
        this.mPopEventListener = iPopViewEventListener;
        this.mPopMessageListener = iPopMessageListener;
        this.mOriginViewInfo = iPopAnchorViewInfo;
        View d = this.mViewProvider.d(this, this.mPopData, this.mPopEngine);
        this.mPopView = d;
        if (d == null) {
            vfm.f(TAG, "init view failed, render pop view is null");
            bgm.a("PopViewFirstVisible", this.mPopData, "popViewCreateFailed", "");
            return false;
        }
        if (this.mPopData.getPopConfig().isInterceptClick()) {
            ViewProxy.setOnClickListener(this.mPopView, new a(this));
        }
        initPopVisible(i);
        if (this.mPopView.getVisibility() != 0) {
            vfm.f(TAG, "pop view shown, but not visible");
            bgm.b("PopViewShowInvisible", this.mPopData);
        }
        addView(this.mPopView);
        translate(0.0f, 0.0f);
        if (!yhm.b(this.mPopData.getPopConfig().getPopContentType())) {
            bgm.b("PopViewFirstVisible", this.mPopData);
        }
        initTimer();
        return true;
    }

    public boolean isCurrentVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abd1738e", new Object[]{this})).booleanValue();
        }
        vfm.c(TAG, "visibility, scroll:" + this.mIsScrollVisible + ", card:" + this.mIsCardVisible + ", page:" + this.mIsPageVisible + ", popLayer:" + this.mIsPopLayerInvisible);
        return this.mIsScrollVisible && this.mIsCardVisible && this.mIsPageVisible && this.mIsTabVisible && this.mIsPopLayerInvisible;
    }

    public void onCardDetached(int i, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8be921", new Object[]{this, new Integer(i), view, str});
        } else if (shouldProcessAttach(view, str)) {
            boolean isCurrentVisible = isCurrentVisible();
            this.mIsCardVisible = false;
            vfm.f(TAG, "setCardVisible = false, " + hashCode());
            pausePop(isCurrentVisible, "PopViewPauseByCard", true);
        }
    }

    public void onIconScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73803697", new Object[]{this, new Integer(i)});
        } else if (this.mPopData.getPopConfig().isSideslipHidden()) {
            boolean isCurrentVisible = isCurrentVisible();
            if (i == 0) {
                this.mIsScrollVisible = true;
                vfm.f(TAG, "setScrollVisible = true, " + hashCode());
                resumePop(isCurrentVisible, "PopViewResumeByIconScroll");
                return;
            }
            this.mIsScrollVisible = false;
            vfm.f(TAG, "setScrollVisible = false, " + hashCode());
            pausePop(isCurrentVisible, "PopViewPauseByIconScroll", true);
        }
    }

    public void onPopLayerShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99562ea3", new Object[]{this});
        } else if (this.mPopData.getPopConfig().isPopLayerHidden()) {
            boolean isCurrentVisible = isCurrentVisible();
            this.mIsPopLayerInvisible = false;
            vfm.f(TAG, "set popLayerInvisible = false, " + hashCode());
            pausePop(isCurrentVisible, bgm.g(false, 1), true);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
        if (r8.equals(com.taobao.android.address.themis.ThemisConfig.SCENE_SELECT) == false) goto L_0x0051;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void triggerPopMessage(java.lang.String r8, java.lang.String r9, com.alibaba.fastjson.JSONObject r10) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.homepage.pop.view.popview.BasePopView.triggerPopMessage(java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject):void");
    }
}
