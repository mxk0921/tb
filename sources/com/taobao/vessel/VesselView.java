package com.taobao.vessel;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.vessel.base.VesselBaseView;
import com.taobao.vessel.local.VesselNativeView;
import com.taobao.vessel.utils.VesselType;
import com.taobao.vessel.web.VesselWebView;
import com.taobao.vessel.weex.VesselWeexView;
import com.taobao.vessel.widget.NoDataMaskView;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.adapter.IWXComputeScreenAdapter;
import java.util.HashMap;
import java.util.Map;
import tb.ask;
import tb.bzo;
import tb.f4w;
import tb.g4w;
import tb.i4w;
import tb.st7;
import tb.t2o;
import tb.uyv;
import tb.zal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class VesselView extends VesselParentView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IWXComputeScreenAdapter mComputeScreenAdapter;
    public boolean mDowngradeEnable = true;
    private boolean mDoNotCallCoreDestroy = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$vessel$utils$VesselType;

        static {
            int[] iArr = new int[VesselType.values().length];
            $SwitchMap$com$taobao$vessel$utils$VesselType = iArr;
            try {
                iArr[VesselType.Weex.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$vessel$utils$VesselType[VesselType.Web.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$vessel$utils$VesselType[VesselType.Native.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(967835654);
    }

    public VesselView(Context context) {
        super(context);
    }

    private VesselBaseView createView(Context context, VesselType vesselType) {
        VesselBaseView vesselBaseView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselBaseView) ipChange.ipc$dispatch("fedcac08", new Object[]{this, context, vesselType});
        }
        int i = a.$SwitchMap$com$taobao$vessel$utils$VesselType[vesselType.ordinal()];
        if (i == 1) {
            vesselBaseView = new VesselWeexView(context);
        } else if (i == 2) {
            vesselBaseView = new VesselWebView(context);
        } else if (i != 3) {
            vesselBaseView = new VesselWebView(context);
        } else {
            vesselBaseView = new VesselNativeView(context);
        }
        if (vesselBaseView instanceof VesselWebView) {
            ((VesselWebView) vesselBaseView).setDoNotCallCoreDestroy(this.mDoNotCallCoreDestroy);
        }
        return vesselBaseView;
    }

    private void destroyVesselProxyViewBeforeCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11763fc5", new Object[]{this});
        } else if (this.mProxyView != null && zal.b()) {
            this.mProxyView.onDestroy();
        }
    }

    private VesselType getDowngradeType() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselType) ipChange.ipc$dispatch("8f22e371", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mDowngradeUrl)) {
            str = uyv.p(this.mOriginUrl);
        } else {
            str = this.mDowngradeUrl;
        }
        return uyv.m(str);
    }

    public static /* synthetic */ Object ipc$super(VesselView vesselView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1632570124:
                super.onScrollRightOrLeftEdge((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case -1553366115:
                super.onScrollToTop((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1406763059:
                super.setDowngradeUrl((String) objArr[0]);
                return null;
            case -1249006439:
                super.onScrollToBottom((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case -1014233709:
                super.onLoadFinish((View) objArr[0]);
                return null;
            case -847870242:
                super.setInterceptException(((Boolean) objArr[0]).booleanValue());
                return null;
            case -814458270:
                super.setOnLoadListener((ask) objArr[0]);
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -131487228:
                super.onLoadStart();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 442576194:
                return new Boolean(super.refresh(objArr[0]));
            case 797441118:
                super.onPause();
                return null;
            case 829997268:
                super.setVesselViewCallback((i4w) objArr[0]);
                return null;
            case 1230082601:
                super.setOnScrollViewListener((bzo) objArr[0]);
                return null;
            case 1252973456:
                super.setShowLoading(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1320987706:
                return super.getVesselView();
            case 1568951796:
                return super.getChildView();
            case 1785180258:
                return new Boolean(super.onScrollEnabled((View) objArr[0], ((Boolean) objArr[1]).booleanValue()));
            case 1862385775:
                super.releaseMemory();
                return null;
            case 2020098384:
                super.fireEvent((String) objArr[0], (Map) objArr[1]);
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/vessel/VesselView");
        }
    }

    @Override // com.taobao.vessel.VesselParentView, android.view.ViewGroup, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean downgrade(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a97b754a", new Object[]{this, str})).booleanValue();
        }
        String str2 = VesselParentView.TAG;
        TLog.logd(str2, "downgrade url:" + str);
        if (str == null) {
            return false;
        }
        removeAllViews();
        this.mProxyView.onDestroy();
        this.mProxyView = null;
        if (!TextUtils.isEmpty(this.mDowngradeUrl)) {
            createView(this.mDowngradeUrl);
            return true;
        } else if (this.mCurrentVesselType == VesselType.Weex) {
            VesselType vesselType = VesselType.Web;
            this.mCurrentVesselType = vesselType;
            loadUrl(vesselType, str, null);
            return true;
        } else {
            String p = uyv.p(this.mOriginUrl);
            if (this.mCurrentVesselType != VesselType.Native || p == null) {
                return false;
            }
            VesselType m = uyv.m(p);
            this.mCurrentVesselType = m;
            this.mDowngradeUrl = p;
            loadUrl(m, str, null);
            return true;
        }
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView
    public /* bridge */ /* synthetic */ void fireEvent(String str, Map map) {
        super.fireEvent(str, map);
    }

    public View getChildProxyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3329b2b6", new Object[]{this});
        }
        return this.mProxyView;
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView
    public /* bridge */ /* synthetic */ View getChildView() {
        return super.getChildView();
    }

    @Override // com.taobao.vessel.VesselParentView
    @Deprecated
    public /* bridge */ /* synthetic */ View getVesselView() {
        return super.getVesselView();
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void loadData(VesselType vesselType, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a4f349", new Object[]{this, vesselType, str, map});
            return;
        }
        if (vesselType == null) {
            vesselType = VesselType.Weex;
        }
        this.mCurrentVesselType = vesselType;
        if (this.mProxyView == null) {
            this.mProxyView = createView(getContext(), vesselType);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.mProxyView.getParent() == null) {
            addView(this.mProxyView, layoutParams);
        }
        i4w i4wVar = this.mVesselViewCallback;
        if (i4wVar != null) {
            this.mProxyView.setVesselViewCallback(i4wVar);
        }
        this.mProxyView.mInstanceId = this.mInstanceId;
        this.mProxyView.setOnLoadListener(this);
        this.mProxyView.loadData(vesselType, str, map);
        this.mProxyView.setOnScrollViewListener(this);
    }

    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else {
            loadUrl(str, null);
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        VesselBaseView vesselBaseView = this.mProxyView;
        if (vesselBaseView != null) {
            vesselBaseView.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // com.taobao.vessel.VesselParentView, android.view.ViewGroup
    public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.taobao.vessel.base.VesselBaseView, tb.ask
    public void onLoadError(g4w g4wVar) {
        String str;
        VesselType vesselType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("365c1211", new Object[]{this, g4wVar});
            return;
        }
        TLog.logd(VesselParentView.TAG, "onLoadError");
        if (g4wVar != null) {
            str = g4wVar.b + "URL =" + this.mOriginUrl;
        } else {
            str = f4w.LOAD_ERROR;
        }
        uyv.h(f4w.LOAD_ERROR, str);
        if (!this.mDowngradeEnable || (vesselType = this.mCurrentVesselType) == VesselType.Web) {
            ask askVar = this.mOnLoadListener;
            if (askVar != null) {
                askVar.onLoadError(g4wVar);
                return;
            }
            return;
        }
        ask askVar2 = this.mOnLoadListener;
        if (askVar2 != null && (askVar2 instanceof st7)) {
            ((st7) askVar2).R2(vesselType, getDowngradeType());
        }
        if (downgrade(this.mOriginUrl)) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", this.mDowngradeUrl);
            ask askVar3 = this.mOnLoadListener;
            if (askVar3 != null) {
                askVar3.onDowngrade(g4wVar, hashMap);
                return;
            }
            return;
        }
        ask askVar4 = this.mOnLoadListener;
        if (askVar4 != null) {
            askVar4.onLoadError(g4wVar);
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView, tb.ask
    public void onLoadFinish(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c38c0593", new Object[]{this, view});
            return;
        }
        super.onLoadFinish(view);
        NoDataMaskView noDataMaskView = this.mNoDataMaskView;
        if (noDataMaskView != null) {
            noDataMaskView.finish();
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView, tb.ask
    public void onLoadStart() {
        WXSDKInstance wXSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f829aa04", new Object[]{this});
            return;
        }
        super.onLoadStart();
        VesselBaseView vesselBaseView = this.mProxyView;
        if ((vesselBaseView instanceof VesselWeexView) && (wXSDKInstance = ((VesselWeexView) vesselBaseView).getWXSDKInstance()) != null) {
            wXSDKInstance.c1(this.mComputeScreenAdapter);
        }
        NoDataMaskView noDataMaskView = this.mNoDataMaskView;
        if (noDataMaskView != null) {
            noDataMaskView.startLoading();
        }
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView
    public /* bridge */ /* synthetic */ void onPause() {
        super.onPause();
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView
    public /* bridge */ /* synthetic */ void onResume() {
        super.onResume();
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView, tb.bzo
    public /* bridge */ /* synthetic */ boolean onScrollEnabled(View view, boolean z) {
        return super.onScrollEnabled(view, z);
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView, tb.bzo
    public /* bridge */ /* synthetic */ void onScrollRightOrLeftEdge(View view, int i, int i2) {
        super.onScrollRightOrLeftEdge(view, i, i2);
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView, tb.bzo
    public /* bridge */ /* synthetic */ void onScrollToBottom(View view, int i, int i2) {
        super.onScrollToBottom(view, i, i2);
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView, tb.bzo
    public /* bridge */ /* synthetic */ void onScrollToTop(View view, int i, int i2) {
        super.onScrollToTop(view, i, i2);
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView
    public /* bridge */ /* synthetic */ void onStart() {
        super.onStart();
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView
    public /* bridge */ /* synthetic */ void onStop() {
        super.onStop();
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView
    public /* bridge */ /* synthetic */ boolean refresh(Object obj) {
        return super.refresh(obj);
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView
    public /* bridge */ /* synthetic */ void releaseMemory() {
        super.releaseMemory();
    }

    public void setComputeScreenAdapter(IWXComputeScreenAdapter iWXComputeScreenAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8dbef1", new Object[]{this, iWXComputeScreenAdapter});
        } else {
            this.mComputeScreenAdapter = iWXComputeScreenAdapter;
        }
    }

    public void setDoNotCallCoreDestroy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc3e756", new Object[]{this, new Boolean(z)});
        } else {
            this.mDoNotCallCoreDestroy = z;
        }
    }

    public void setDowngradeEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73228b57", new Object[]{this, new Boolean(z)});
        } else {
            this.mDowngradeEnable = z;
        }
    }

    @Override // com.taobao.vessel.VesselParentView
    public /* bridge */ /* synthetic */ void setDowngradeUrl(String str) {
        super.setDowngradeUrl(str);
    }

    @Override // com.taobao.vessel.VesselParentView
    public /* bridge */ /* synthetic */ void setInterceptException(boolean z) {
        super.setInterceptException(z);
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView
    public /* bridge */ /* synthetic */ void setOnLoadListener(ask askVar) {
        super.setOnLoadListener(askVar);
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView
    public /* bridge */ /* synthetic */ void setOnScrollViewListener(bzo bzoVar) {
        super.setOnScrollViewListener(bzoVar);
    }

    @Override // com.taobao.vessel.VesselParentView
    public /* bridge */ /* synthetic */ void setShowLoading(boolean z) {
        super.setShowLoading(z);
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView
    public /* bridge */ /* synthetic */ void setVesselViewCallback(i4w i4wVar) {
        super.setVesselViewCallback(i4wVar);
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView
    public void loadUrl(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b60501d6", new Object[]{this, str, obj});
        } else {
            loadUrl(null, str, obj);
        }
    }

    public void loadUrl(VesselType vesselType, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f55ed11", new Object[]{this, vesselType, str, obj});
            return;
        }
        if (vesselType == null) {
            vesselType = uyv.m(str);
        }
        if (vesselType == null) {
            onLoadError(new g4w());
            return;
        }
        this.mOriginUrl = str;
        this.mOriginParams = obj;
        this.mCurrentVesselType = vesselType;
        destroyVesselProxyViewBeforeCreate();
        this.mProxyView = createView(getContext(), vesselType);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.mProxyView.getParent() == null) {
            addView(this.mProxyView, layoutParams);
        }
        i4w i4wVar = this.mVesselViewCallback;
        if (i4wVar != null) {
            this.mProxyView.setVesselViewCallback(i4wVar);
        }
        this.mProxyView.mInstanceId = this.mInstanceId;
        this.mProxyView.setOnLoadListener(this);
        this.mProxyView.loadUrl(str, obj);
        this.mProxyView.setOnScrollViewListener(this);
    }

    public VesselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VesselView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
