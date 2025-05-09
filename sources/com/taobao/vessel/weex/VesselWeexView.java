package com.taobao.vessel.weex;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.base.VesselBaseView;
import com.taobao.vessel.utils.VesselType;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.adapter.IWXComputeScreenAdapter;
import com.taobao.weex.common.WXException;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.ui.view.WXScrollView;
import java.util.HashMap;
import java.util.Map;
import tb.bzo;
import tb.e4w;
import tb.f4w;
import tb.g4w;
import tb.gbe;
import tb.t2o;
import tb.uyv;
import tb.zal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class VesselWeexView extends VesselBaseView implements gbe, WXScrollView.WXScrollViewListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = VesselView.class.getSimpleName();
    private boolean isViewLoaded;
    private Handler mHandler;
    private IWXComputeScreenAdapter mInnerComputeScreenAdapter;
    private String mOriginJsBundleData;
    private Rect mRect;
    private String mRequestUrl;
    private WXSDKInstance mTBWXSDKInstance;
    private View weexView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements IWXComputeScreenAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.weex.adapter.IWXComputeScreenAdapter
        public Rect computeCurrentScreenMetrics() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("e162c6e5", new Object[]{this});
            }
            return VesselWeexView.access$000(VesselWeexView.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f14097a;
        private Map<String, Object> b;

        static {
            t2o.a(967835684);
        }

        public b(String str, Map<String, Object> map) {
            this.f14097a = str;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!uyv.b(VesselWeexView.this.getContext()) && VesselWeexView.access$100(VesselWeexView.this) != null && !TextUtils.isEmpty(this.f14097a)) {
                VesselWeexView.access$100(VesselWeexView.this).X0(VesselWeexView.access$200(VesselWeexView.this), this.f14097a, this.b, null, WXRenderStrategy.APPEND_ASYNC);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f14098a;
        private Map<String, Object> b;

        static {
            t2o.a(967835685);
        }

        public c(String str, Map<String, Object> map) {
            this.f14098a = str;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!uyv.b(VesselWeexView.this.getContext()) && VesselWeexView.access$100(VesselWeexView.this) != null && !TextUtils.isEmpty(this.f14098a)) {
                VesselWeexView.access$100(VesselWeexView.this).T0(uyv.l(this.b), this.f14098a, this.b, null, WXRenderStrategy.APPEND_ASYNC);
            }
        }
    }

    static {
        t2o.a(967835682);
        t2o.a(985661443);
        t2o.a(985661737);
    }

    public VesselWeexView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Rect access$000(VesselWeexView vesselWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("4c654e4f", new Object[]{vesselWeexView});
        }
        return vesselWeexView.mRect;
    }

    public static /* synthetic */ WXSDKInstance access$100(VesselWeexView vesselWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("be87f143", new Object[]{vesselWeexView});
        }
        return vesselWeexView.mTBWXSDKInstance;
    }

    public static /* synthetic */ String access$200(VesselWeexView vesselWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e26df45c", new Object[]{vesselWeexView});
        }
        return vesselWeexView.mRequestUrl;
    }

    private void createWxSdkInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258e7139", new Object[]{this});
            return;
        }
        if (this.mTBWXSDKInstance != null) {
            e4w.b().d(this.mTBWXSDKInstance);
            this.mTBWXSDKInstance.destroy();
        }
        WXSDKInstance wXSDKInstance = new WXSDKInstance(getContext());
        this.mTBWXSDKInstance = wXSDKInstance;
        wXSDKInstance.registerRenderListener(this);
        this.mTBWXSDKInstance.M0(this);
        this.mTBWXSDKInstance.onActivityCreate();
        e4w.b().a(this.mTBWXSDKInstance, this);
    }

    private void initModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a44223", new Object[]{this});
            return;
        }
        try {
            WXSDKEngine.registerModule("vessel", VesselWeexModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ Object ipc$super(VesselWeexView vesselWeexView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/vessel/weex/VesselWeexView");
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void fireEvent(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78684150", new Object[]{this, str, map});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mTBWXSDKInstance;
        if (wXSDKInstance != null) {
            wXSDKInstance.B(str, map);
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public View getChildView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5d844df4", new Object[]{this});
        }
        return this.weexView;
    }

    public WXSDKInstance getWXSDKInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("169676dd", new Object[]{this});
        }
        return this.mTBWXSDKInstance;
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void loadData(VesselType vesselType, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a4f349", new Object[]{this, vesselType, str, map});
            return;
        }
        this.mOriginJsBundleData = str;
        createWxSdkInstance();
        if (str == null) {
            onLoadError(new g4w(f4w.LOAD_ERROR, f4w.LOAD_DATA_NULL, f4w.WEEX_TYPE));
        } else {
            startWxRender(str, map);
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void loadUrl(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b60501d6", new Object[]{this, str, obj});
            return;
        }
        this.mRequestUrl = str;
        this.mOriginUrl = str;
        this.mOriginParams = obj;
        createWxSdkInstance();
        onLoadStart();
        String n = uyv.n(str);
        HashMap hashMap = new HashMap();
        hashMap.put("bundleUrl", this.mRequestUrl);
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new b(n, hashMap));
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mTBWXSDKInstance;
        if (wXSDKInstance != null) {
            wXSDKInstance.onActivityResult(i, i2, intent);
        }
    }

    public void onAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321cdedb", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mTBWXSDKInstance;
        if (wXSDKInstance != null && this.isViewLoaded) {
            wXSDKInstance.onViewAppear();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (zal.d()) {
            onAppear();
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        e4w.b().d(this.mTBWXSDKInstance);
        WXSDKInstance wXSDKInstance = this.mTBWXSDKInstance;
        if (wXSDKInstance != null) {
            wXSDKInstance.M0(null);
            this.mTBWXSDKInstance.onActivityDestroy();
        }
        this.mScrollViewListener = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        if (zal.d()) {
            onDisappear();
        }
    }

    public void onDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d60f0b", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mTBWXSDKInstance;
        if (wXSDKInstance != null && this.isViewLoaded) {
            wXSDKInstance.onViewDisappear();
        }
    }

    @Override // tb.gbe
    public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
        } else {
            onLoadError(new g4w(str, str2, f4w.WEEX_TYPE));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WXSDKInstance wXSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (isAutoResize()) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (measuredWidth != 0 && measuredHeight != 0) {
                if (this.mRect == null) {
                    this.mRect = new Rect();
                }
                Rect rect = this.mRect;
                if (rect.right != measuredWidth || rect.bottom != measuredHeight) {
                    rect.right = measuredWidth;
                    rect.bottom = measuredHeight;
                    if (this.mInnerComputeScreenAdapter == null && (wXSDKInstance = this.mTBWXSDKInstance) != null) {
                        a aVar = new a();
                        this.mInnerComputeScreenAdapter = aVar;
                        wXSDKInstance.c1(aVar);
                    }
                }
            }
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mTBWXSDKInstance;
        if (wXSDKInstance != null) {
            wXSDKInstance.onActivityPause();
        }
    }

    @Override // tb.gbe
    public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.gbe
    public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            return;
        }
        this.isViewLoaded = true;
        onLoadFinish(this.weexView);
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mTBWXSDKInstance;
        if (wXSDKInstance != null) {
            wXSDKInstance.onActivityResume();
        }
    }

    @Override // com.taobao.weex.ui.view.WXScrollView.WXScrollViewListener
    public void onScroll(WXScrollView wXScrollView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0964985", new Object[]{this, wXScrollView, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.weex.ui.view.WXScrollView.WXScrollViewListener
    public void onScrollChanged(WXScrollView wXScrollView, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40baada1", new Object[]{this, wXScrollView, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.mScrollViewListener != null) {
            if (wXScrollView.getHeight() - wXScrollView.getScrollY() < 1) {
                this.mScrollViewListener.onScrollToBottom(wXScrollView, i, i2);
            } else if (wXScrollView.getScrollY() == 0) {
                this.mScrollViewListener.onScrollToTop(wXScrollView, i, i2);
            } else {
                this.mScrollViewListener.onScrollChanged(wXScrollView, i, i2, i3, i4);
            }
        }
    }

    @Override // com.taobao.weex.ui.view.WXScrollView.WXScrollViewListener
    public void onScrollStopped(WXScrollView wXScrollView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("253d571a", new Object[]{this, wXScrollView, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.weex.ui.view.WXScrollView.WXScrollViewListener
    public void onScrollToBottom(WXScrollView wXScrollView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3770d2b", new Object[]{this, wXScrollView, new Integer(i), new Integer(i2)});
            return;
        }
        bzo bzoVar = this.mScrollViewListener;
        if (bzoVar != null) {
            bzoVar.onScrollToBottom(wXScrollView, i, i2);
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mTBWXSDKInstance;
        if (wXSDKInstance != null) {
            wXSDKInstance.onActivityStart();
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mTBWXSDKInstance;
        if (wXSDKInstance != null) {
            wXSDKInstance.onActivityStop();
        }
    }

    @Override // tb.gbe
    public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            return;
        }
        removeAllViews();
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        this.weexView = view;
        WXSDKInstance wXSDKInstance2 = this.mTBWXSDKInstance;
        if (wXSDKInstance2 != null && this.mScrollViewListener != null && wXSDKInstance2.X() == null) {
            this.mScrollViewListener.onScrollEnabled(this.weexView, false);
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public boolean refresh(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a612d42", new Object[]{this, obj})).booleanValue();
        }
        if (!TextUtils.isEmpty(this.mOriginUrl)) {
            loadUrl(this.mOriginUrl, this.mOriginParams);
            return true;
        } else if (TextUtils.isEmpty(this.mOriginJsBundleData)) {
            return false;
        } else {
            loadData(this.mOriginJsBundleData);
            return true;
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void releaseMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f01c06f", new Object[]{this});
            return;
        }
        onDestroy();
        this.weexView = null;
        removeAllViews();
    }

    public void startWxRender(String str, Map<String, Object> map) {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e8ca1b", new Object[]{this, str, map});
        } else if (!TextUtils.isEmpty(str) && (handler = this.mHandler) != null) {
            handler.post(new c(str, map));
        }
    }

    public VesselWeexView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VesselWeexView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isViewLoaded = false;
        this.mHandler = new Handler();
        initModule();
    }
}
