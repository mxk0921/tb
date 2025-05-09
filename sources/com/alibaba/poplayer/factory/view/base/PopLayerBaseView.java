package com.alibaba.poplayer.factory.view.base;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.layermanager.d;
import com.alibaba.poplayer.track.UserResultTrack;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.b;
import com.alibaba.poplayer.utils.ConsoleLogger$Level;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.taobao.R;
import tb.abd;
import tb.d0j;
import tb.hst;
import tb.jl1;
import tb.kim;
import tb.lw7;
import tb.lyv;
import tb.nsu;
import tb.qwk;
import tb.qy3;
import tb.swk;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class PopLayerBaseView<InnerView, Request extends PopRequest> extends PenetrateFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String POPLAYER_VIEW_TAG = "poplayer_view_tag";
    private jl1 mAutoSize;
    public ImageView mBtnClose;
    private lw7 mDragHelper;
    public a mEventListener;
    public InnerView mInnerView;
    private OnScreenChangedListener mOnScreenChangedListener;
    public Request mPopRequest;
    private kim mPopViewStyle;
    private boolean mIsRetaining = false;
    private long mRetainTime = 0;
    private int mViewAddTimes = 0;
    public boolean mIsDisplaying = false;
    private boolean mIsVisibled = false;
    public boolean mIsClosed = false;
    private boolean mIsHiding = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
    }

    static {
        t2o.a(625999912);
    }

    public PopLayerBaseView(Context context) {
        super(context);
    }

    private void dealCloseOnTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9e045df", new Object[]{this});
            return;
        }
        BaseConfigItem J = com.alibaba.poplayer.trigger.a.J(this.mPopRequest);
        if (J != null && J.closeOnTime > 1) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.rdm
                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerBaseView.this.lambda$dealCloseOnTime$13();
                }
            }, J.closeOnTime * 1000);
        }
    }

    public static /* synthetic */ Object ipc$super(PopLayerBaseView popLayerBaseView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2143807755:
                super.setClickableAreaFrame((ClickableAreaParam) objArr[0]);
                return null;
            case -1983604863:
                super.destroy();
                return null;
            case -1683596603:
                super.setUseTouchIntercept(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1448304568:
                super.setUseTouchPointBitmap(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -530651030:
                super.clearClickableInfo();
                return null;
            case -446122783:
                return new Boolean(super.onInterceptHoverEvent((MotionEvent) objArr[0]));
            case -444150275:
                super.setEnableClickArea(((Boolean) objArr[0]).booleanValue());
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case -169170370:
                super.setFindTextureSurfaceViewRectWhenTouch(((Boolean) objArr[0]).booleanValue());
                return null;
            case 683045380:
                super.addClickableArea((Rect) objArr[0]);
                return null;
            case 1701519427:
                super.setUseCacheMark(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/poplayer/factory/view/base/PopLayerBaseView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dealCloseOnTime$13() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c887f2", new Object[]{this});
        } else {
            close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "CloseOnTime", "", "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$10(int i, Configuration configuration) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b214e96a", new Object[]{this, new Integer(i), configuration});
            return;
        }
        try {
            wdm.d("PopLayerBaseView.OnScreenChanged.changeType=%s", Integer.valueOf(i));
            if (1 != i) {
                z = false;
            }
            if (this.mAutoSize.d(z)) {
                setLayoutParams(this.mPopViewStyle.a(this, this.mPopRequest, this.mAutoSize));
            }
        } catch (Throwable th) {
            wdm.h("PopLayerBaseView.OnScreenChanged.error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeCloseButton$12() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d1a02a3", new Object[]{this});
            return;
        }
        try {
            removeView(this.mBtnClose);
            this.mBtnClose = null;
            wdm.d("PopLayerBaseView.removeCloseButton.", new Object[0]);
        } catch (Throwable th) {
            wdm.h("PopLayerBaseView.removeCloseButton.error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showCloseButton$11(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93bd1857", new Object[]{this, view});
        } else {
            close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "poplayerCloseBtn", null, null);
        }
    }

    private void trackMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4408e96", new Object[]{this});
            return;
        }
        Request request = this.mPopRequest;
        if (request instanceof com.alibaba.poplayer.trigger.a) {
            com.alibaba.poplayer.trigger.a aVar = (com.alibaba.poplayer.trigger.a) request;
            d0j.h(aVar);
            if (aVar.k().c0 == OnePopModule.OnePopLoseReasonCode.OnViewErrorClose || aVar.k().c0 == OnePopModule.OnePopLoseReasonCode.OnViewJSClose) {
                d0j.j(aVar);
            }
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame
    public /* bridge */ /* synthetic */ void addClickableArea(Rect rect) {
        super.addClickableArea(rect);
    }

    public void addInnerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb166601", new Object[]{this});
            return;
        }
        InnerView innerview = this.mInnerView;
        if (innerview instanceof View) {
            View view = (View) innerview;
            view.setId(R.id.poplayer_inner_view);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            view.setImportantForAccessibility(2);
            addView(view, layoutParams);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame
    public /* bridge */ /* synthetic */ void clearClickableInfo() {
        super.clearClickableInfo();
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "commonJsClose", null, null);
        }
    }

    public final void consoleLog(String str, ConsoleLogger$Level consoleLogger$Level) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb31712", new Object[]{this, str, consoleLogger$Level});
        } else {
            wdm.d("%s.%s.%s", "Console", Character.valueOf(consoleLogger$Level.sign), str);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame
    public /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }

    public void displayMe() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f5f181", new Object[]{this});
        } else {
            displayMe(false);
        }
    }

    public void finishPop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7649f645", new Object[]{this});
        } else {
            this.mPopRequest.b();
        }
    }

    public JSONObject getCurBizTrackInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ee79b897", new Object[]{this});
        }
        return new JSONObject();
    }

    public String getIndexId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ec6ba02", new Object[]{this});
        }
        return com.alibaba.poplayer.trigger.a.P(getPopRequest());
    }

    public SpannableStringBuilder getInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("e6e304e", new Object[]{this});
        }
        return new SpannableStringBuilder("");
    }

    public String getNativeNotifyInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58e6e2f5", new Object[]{this});
        }
        return "null";
    }

    public Request getPopRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ((PopRequest) ipChange.ipc$dispatch("8afce747", new Object[]{this}));
        }
        return this.mPopRequest;
    }

    public String getUUID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8312b388", new Object[]{this});
        }
        return com.alibaba.poplayer.trigger.a.R(getPopRequest());
    }

    public void increaseReadTimes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7d14b5", new Object[]{this});
        } else {
            this.mPopRequest.r();
        }
    }

    public boolean isClosed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6afccc1", new Object[]{this})).booleanValue();
        }
        return this.mIsClosed;
    }

    public boolean isDisplaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1823cc35", new Object[]{this})).booleanValue();
        }
        return this.mIsDisplaying;
    }

    public boolean isHiding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("972c5b54", new Object[]{this})).booleanValue();
        }
        return this.mIsHiding;
    }

    public boolean isViewCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31498504", new Object[]{this})).booleanValue();
        }
        return "true".equals(this.mPopRequest.k().B);
    }

    public void navToUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce285562", new Object[]{this, str});
            return;
        }
        syncJumpToUrlInfo(str);
        PopLayer.getReference().getFaceAdapter().navToUrl(getContext(), str);
    }

    public void onActivityPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
        } else if (isDisplaying()) {
            this.mRetainTime += SystemClock.elapsedRealtime() - this.mPopRequest.k().u0;
            this.mIsRetaining = false;
        }
    }

    public void onActivityResumed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a0dbf0", new Object[]{this});
        } else if (isDisplaying()) {
            this.mPopRequest.k().u0 = SystemClock.elapsedRealtime();
            this.mIsRetaining = true;
        }
    }

    public void onActivityStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
        }
    }

    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame, android.view.ViewGroup
    public /* bridge */ /* synthetic */ boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        return super.onInterceptHoverEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        lw7 lw7Var = this.mDragHelper;
        if (lw7Var != null) {
            lw7Var.b(this, z, i, i2, i3, i4);
        }
    }

    public void onReceiveEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12978511", new Object[]{this, str, str2});
        } else {
            wdm.d("PopLayerBaseView.onReceiveEvent:{eventName:%s,params:%s},You should overwrite this method to hold event.", str, str2);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        lw7 lw7Var = this.mDragHelper;
        if (lw7Var == null || !lw7Var.c(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        wdm.d("PopLayerBaseView.onTouchEvent.onTouchEvent=%s.", Boolean.TRUE);
        return true;
    }

    @Deprecated
    public void onViewAdded(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51d80465", new Object[]{this, context});
        }
    }

    @Deprecated
    public void onViewRemoved(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd08805", new Object[]{this, context});
        }
    }

    public void onViewUIDisplay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcd2a71", new Object[]{this});
        }
    }

    public void onViewUIHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1e23a1", new Object[]{this});
        }
    }

    public void onViewUIShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a7cbdc", new Object[]{this});
        }
    }

    public void putOnePopExtras(JSONObject jSONObject) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ff746c", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            try {
                for (String str : jSONObject.keySet()) {
                    if (!TextUtils.isEmpty(str) && (obj = jSONObject.get(str)) != null) {
                        this.mPopRequest.k().w0.put(str, obj);
                    }
                }
            } catch (Throwable th) {
                wdm.h("PopLayerBaseView.putOnePopExtras.error.", th);
            }
        }
    }

    public void resetContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18396fc1", new Object[]{this, context});
        }
    }

    @Deprecated
    public void selectAndOperate(org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d48dbdee", new Object[]{this, jSONObject});
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame
    public /* bridge */ /* synthetic */ void setClickableAreaFrame(ClickableAreaParam clickableAreaParam) {
        super.setClickableAreaFrame(clickableAreaParam);
    }

    public void setContentId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71029e43", new Object[]{this, str});
        } else {
            this.mPopRequest.k().b0 = str;
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame
    public /* bridge */ /* synthetic */ void setEnableClickArea(boolean z) {
        super.setEnableClickArea(z);
    }

    public void setEventListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fb013c6", new Object[]{this, aVar});
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame
    public /* bridge */ /* synthetic */ void setFindTextureSurfaceViewRectWhenTouch(boolean z) {
        super.setFindTextureSurfaceViewRectWhenTouch(z);
    }

    public void setHardwareAcceleration(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36251763", new Object[]{this, new Boolean(z)});
        } else if (!z) {
            setLayerType(1, null);
        }
    }

    public void setPopRequest(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8fa5953", new Object[]{this, request});
        } else {
            this.mPopRequest = request;
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame
    public /* bridge */ /* synthetic */ void setUseCacheMark(boolean z) {
        super.setUseCacheMark(z);
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame
    public /* bridge */ /* synthetic */ void setUseTouchIntercept(boolean z) {
        super.setUseTouchIntercept(z);
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame
    public /* bridge */ /* synthetic */ void setUseTouchPointBitmap(boolean z) {
        super.setUseTouchPointBitmap(z);
    }

    public void setUserResultInTrack(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d4e903", new Object[]{this, str, jSONObject});
        } else {
            setUserResultInTrack(str, false, jSONObject);
        }
    }

    public void setViewTimeLineTime(long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca76c79c", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
            return;
        }
        if (j > 0) {
            this.mPopRequest.k().P = String.valueOf(j);
        }
        if (j2 > 0) {
            this.mPopRequest.k().Q = String.valueOf(j2);
        }
        if (j3 > 0) {
            this.mPopRequest.k().R = String.valueOf(j3);
        }
        if (j4 > 0) {
            this.mPopRequest.k().S = String.valueOf(j4);
        }
    }

    public boolean shouldViewUIAdd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("312780", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void syncJumpToUrlInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef2922a", new Object[]{this, str});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && str.startsWith("poplayer")) {
                return;
            }
            this.mPopRequest.k().d(str);
        } catch (Throwable th) {
            wdm.h("syncJumpToUrlInfo.error.", th);
        }
    }

    public void close(OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c84d9553", new Object[]{this, onePopLoseReasonCode, str, str2, str3});
            return;
        }
        try {
            this.mIsClosed = true;
            Request request = this.mPopRequest;
            if (request != null) {
                request.k().c0 = onePopLoseReasonCode;
                this.mPopRequest.k().d0 = str;
                this.mPopRequest.k().e0 = str2;
                this.mPopRequest.k().f0 = str3;
            }
            PopLayer.getReference().removeRequest(this.mPopRequest);
            trackMonitor();
            wdm.d("close.success", new Object[0]);
        } catch (Throwable th) {
            wdm.h("close.error.", th);
        }
    }

    public void destroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        this.mIsClosed = true;
        Request request = this.mPopRequest;
        if (request instanceof com.alibaba.poplayer.trigger.a) {
            b.g((com.alibaba.poplayer.trigger.a) request, this);
        }
        if (this.mOnScreenChangedListener != null) {
            wdm.g("pageLifeCycle", com.alibaba.poplayer.trigger.a.P(this.mPopRequest), "unregisterOnScreenChangedListener");
            TBAutoSizeConfig.x().h0(this.mOnScreenChangedListener);
            this.mOnScreenChangedListener = null;
        }
    }

    public void displayMe(boolean z) {
        Event M;
        abd processCallBack;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95c8f173", new Object[]{this, new Boolean(z)});
        } else if (!isDisplaying()) {
            this.mIsDisplaying = true;
            setVisibility(0);
            if (!this.mIsVisibled) {
                dealCloseOnTime();
            }
            this.mIsVisibled = true;
            if (z) {
                increaseReadTimes();
            }
            OnePopModule k = this.mPopRequest.k();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String str = (elapsedRealtime - k.t0) + "";
            k.N = str;
            k.C = "true";
            boolean z2 = this.mPopRequest instanceof com.alibaba.poplayer.trigger.a;
            wdm.d("PopLayerBaseView.displayMe.invisibleTime=%s", str);
            if (z2) {
                k.V = ((com.alibaba.poplayer.trigger.a) this.mPopRequest).L().getCreateSystemTime() > 0 ? String.valueOf(elapsedRealtime - ((com.alibaba.poplayer.trigger.a) this.mPopRequest).L().getCreateSystemTime()) : null;
            }
            k.u0 = elapsedRealtime;
            this.mIsRetaining = true;
            if (z2) {
                BaseConfigItem J = com.alibaba.poplayer.trigger.a.J(this.mPopRequest);
                qy3.b().c(J);
                Event L = ((com.alibaba.poplayer.trigger.a) this.mPopRequest).L();
                if (J != null) {
                    com.alibaba.poplayer.info.frequency.b.e().b(L.curPage, L.curPageUrl, J.layerType);
                }
                qwk.c().b((com.alibaba.poplayer.trigger.a) this.mPopRequest);
            }
            try {
                k.D = d.t().y(this.mPopRequest);
            } catch (Throwable th) {
                wdm.h("PopLayerBaseView.displayMe.notifyDisplay.error.", th);
            }
            onReceiveEvent("PopLayer.Displayed", null);
            if (z2) {
                b.h((com.alibaba.poplayer.trigger.a) this.mPopRequest);
            }
            if (z2) {
                d0j.i((com.alibaba.poplayer.trigger.a) this.mPopRequest);
                UserResultTrack.b((com.alibaba.poplayer.trigger.a) this.mPopRequest, getCurBizTrackInfo(), z);
            }
            if (!(!z2 || (M = com.alibaba.poplayer.trigger.a.M(this.mPopRequest)) == null || (processCallBack = M.getProcessCallBack()) == null)) {
                processCallBack.a(((com.alibaba.poplayer.trigger.a) this.mPopRequest).O(), M.uri, M.curPage);
            }
            onViewUIDisplay();
        }
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        this.mIsHiding = true;
        if (getVisibility() != 4) {
            setVisibility(4);
            onViewUIHide();
            if (!swk.c().a((com.alibaba.poplayer.trigger.a) this.mPopRequest)) {
                close(OnePopModule.OnePopLoseReasonCode.LMLifeCycleCheckFail, "onceShowCount", "", "");
            }
        }
    }

    public void removeCloseButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0908dad", new Object[]{this});
        } else if (this.mBtnClose == null) {
            wdm.d("removeCloseButton.Not use closeButton.", new Object[0]);
        } else {
            hst.c(new Runnable() { // from class: tb.odm
                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerBaseView.this.lambda$removeCloseButton$12();
                }
            });
        }
    }

    public void setUserResultInTrack(String str, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620946e9", new Object[]{this, str, new Boolean(z), jSONObject});
        } else if (!TextUtils.isEmpty(str)) {
            Request request = this.mPopRequest;
            if (request instanceof com.alibaba.poplayer.trigger.a) {
                UserResultTrack.c(request, str, z, jSONObject);
            }
        }
    }

    public void init(Context context, Request request) {
        abd processCallBack;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2216f45d", new Object[]{this, context, request});
            return;
        }
        this.mIsClosed = false;
        OnePopModule k = request.k();
        k.z = "true";
        k.A = "true";
        k.B = "true";
        long elapsedRealtime = SystemClock.elapsedRealtime();
        k.s0 = elapsedRealtime;
        k.t0 = elapsedRealtime;
        wdm.d("PopLayerBaseView.init.start.loadStartTimeStamp=%s", Long.valueOf(elapsedRealtime));
        if (request.s() || request.x() || request.v()) {
            k.f = String.valueOf(System.currentTimeMillis());
        }
        Event M = com.alibaba.poplayer.trigger.a.M(request);
        if (!(M == null || (processCallBack = M.getProcessCallBack()) == null)) {
            processCallBack.e();
        }
        BaseConfigItem J = com.alibaba.poplayer.trigger.a.J(request);
        if (!(J == null || J.styleConfigs == null)) {
            this.mDragHelper = new lw7(request, request.u() && J.styleConfigs.isValid() && J.styleConfigs.drag, J.styleConfigs.dragMode);
        }
        nsu.i(0, "track", (com.alibaba.poplayer.trigger.a) request, "PopViewLoaded", "");
        boolean T = TBAutoSizeConfig.x().T(context);
        this.mAutoSize = new jl1(context, T, true);
        wdm.d("PopLayerBaseView.init.isPortraitLayout=%s", Boolean.valueOf(T));
        kim kimVar = new kim();
        this.mPopViewStyle = kimVar;
        setLayoutParams(kimVar.a(this, this.mPopRequest, this.mAutoSize));
        this.mOnScreenChangedListener = new OnScreenChangedListener() { // from class: tb.pdm
            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                guk.a(this, activity, i, configuration);
            }

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public final void onScreenChanged(int i, Configuration configuration) {
                PopLayerBaseView.this.lambda$init$10(i, configuration);
            }
        };
        TBAutoSizeConfig.x().d0(this.mOnScreenChangedListener);
        wdm.g("pageLifeCycle", com.alibaba.poplayer.trigger.a.P(this.mPopRequest), "registerOnScreenChangedListener");
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        lw7 lw7Var = this.mDragHelper;
        if (lw7Var != null) {
            lw7Var.d(false);
        }
        if (super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        lw7 lw7Var2 = this.mDragHelper;
        if (lw7Var2 == null) {
            return false;
        }
        boolean a2 = lw7Var2.a(this, motionEvent);
        wdm.d("PopLayerBaseView.DragHelper.onInterceptTouchEvent.onInterceptTouchEvent=%s.", Boolean.valueOf(a2));
        return a2;
    }

    public void onViewUIAdded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155d0daf", new Object[]{this});
            return;
        }
        try {
            this.mViewAddTimes++;
            OnePopModule k = this.mPopRequest.k();
            k.v = false;
            k.j0 = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (isDisplaying()) {
                this.mRetainTime = 0L;
                k.u0 = elapsedRealtime;
                if (this.mPopRequest.t()) {
                    wdm.g("pageLifeCycle", k.b, "onViewUIAdded.isEmbedShowing");
                    k.g = "embedAdd";
                } else if (this.mPopRequest.w() || this.mPopRequest.y()) {
                    wdm.g("pageLifeCycle", k.b, "onViewUIAdded.isLiveShowing");
                    k.g = "appModeAdd";
                }
                k.f = String.valueOf(System.currentTimeMillis());
                if (this.mViewAddTimes > 1) {
                    k.N = null;
                }
                Request request = this.mPopRequest;
                if (request instanceof com.alibaba.poplayer.trigger.a) {
                    UserResultTrack.b((com.alibaba.poplayer.trigger.a) request, getCurBizTrackInfo(), false);
                    qwk.c().b((com.alibaba.poplayer.trigger.a) this.mPopRequest);
                }
            } else if (this.mViewAddTimes > 1) {
                k.t0 = elapsedRealtime;
            }
            wdm.f("pageLifeCycle", com.alibaba.poplayer.trigger.a.P(this.mPopRequest), "PopLayerBaseView.onViewAdded.");
            onReceiveEvent("PopLayer.onViewAdded", null);
            Request request2 = this.mPopRequest;
            if (request2 instanceof com.alibaba.poplayer.trigger.a) {
                b.i((com.alibaba.poplayer.trigger.a) request2);
            }
        } catch (Throwable th) {
            wdm.h("PopLayerBaseVieww.onViewUIAdded.error.", th);
        }
    }

    public void onViewUIRemoved() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68572b0f", new Object[]{this});
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (isDisplaying()) {
                if (this.mIsRetaining) {
                    this.mRetainTime += elapsedRealtime - this.mPopRequest.k().u0;
                }
                this.mPopRequest.k().O = this.mRetainTime + "";
                wdm.d("PopLayerBaseView.onViewUIRemoved.retainTime=%s", Long.valueOf(this.mRetainTime));
            } else {
                this.mPopRequest.k().N = (elapsedRealtime - this.mPopRequest.k().t0) + "";
                wdm.d("PopLayerBaseView.onViewUIRemoved.invisibleTime=%s", this.mPopRequest.k().N);
            }
            trackMonitor();
            wdm.f("pageLifeCycle", com.alibaba.poplayer.trigger.a.P(this.mPopRequest), "PopLayerBaseView.onViewRemoved.");
            onReceiveEvent("PopLayer.onViewRemoved", null);
            Request request = this.mPopRequest;
            if (request instanceof com.alibaba.poplayer.trigger.a) {
                b.j((com.alibaba.poplayer.trigger.a) request, this);
            }
        } catch (Throwable th) {
            wdm.h("PopLayerBaseView.onViewUIRemoved.error.", th);
        }
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        this.mIsHiding = false;
        if (this.mIsDisplaying) {
            if (getVisibility() != 0) {
                setVisibility(0);
                swk.c().b((com.alibaba.poplayer.trigger.a) this.mPopRequest);
                onViewUIShow();
            }
            if (!this.mIsVisibled) {
                dealCloseOnTime();
            }
            this.mIsVisibled = true;
        }
    }

    public void showCloseButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb2ab40", new Object[]{this, new Boolean(z)});
        } else if (!z && this.mBtnClose == null) {
            wdm.d("showCloseButton.Not use closeButton.", Boolean.valueOf(z));
        } else if (this.mPopRequest.u()) {
            wdm.d("showCloseButton.isFloatStyle.return", Boolean.valueOf(z));
        } else {
            int i = z ? 0 : 8;
            if (this.mBtnClose == null) {
                ImageView imageView = new ImageView(getContext());
                this.mBtnClose = imageView;
                imageView.setBackgroundResource(R.drawable.poplayer_close_btn);
                this.mBtnClose.setContentDescription("关闭弹窗");
                this.mBtnClose.setOnClickListener(new View.OnClickListener() { // from class: tb.qdm
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PopLayerBaseView.this.lambda$showCloseButton$11(view);
                    }
                });
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(80, 80);
                layoutParams.rightMargin = lyv.a(getContext(), 20);
                layoutParams.topMargin = lyv.a(getContext(), 20);
                layoutParams.gravity = 53;
                addView(this.mBtnClose, layoutParams);
            }
            this.mBtnClose.setVisibility(i);
            wdm.d("PopLayerBaseView.showCloseButton.show{%s}", Boolean.valueOf(z));
        }
    }
}
