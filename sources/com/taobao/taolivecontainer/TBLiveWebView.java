package com.taobao.taolivecontainer;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebSettings;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveWebView extends WVUCWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = TBLiveWebView.class.getSimpleName();
    private boolean mEnableWebViewGestureLogic = false;
    private int mScrollX = 0;
    private Object mToken;

    static {
        t2o.a(1027604489);
    }

    public TBLiveWebView(Context context) {
        super(context);
        init();
    }

    private boolean canScrollHorizontally(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad4f1921", new Object[]{this, view})).booleanValue();
        }
        if (view.canScrollHorizontally(100) || view.canScrollHorizontally(-100)) {
            return true;
        }
        return false;
    }

    private boolean canScrollVertically(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1e362cf", new Object[]{this, view})).booleanValue();
        }
        if (view.canScrollVertically(100) || view.canScrollVertically(-100)) {
            return true;
        }
        return false;
    }

    private ViewParent findViewParentIfNeed(View view, int i) {
        ViewParent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("f0cc28ab", new Object[]{this, view, new Integer(i)});
        }
        if (i < 0 || (parent = view.getParent()) == null || !(parent instanceof ViewGroup)) {
            return null;
        }
        View view2 = (View) parent;
        if (canScrollHorizontally(view2) || canScrollVertically(view2)) {
            return parent;
        }
        return findViewParentIfNeed(view2, i - 1);
    }

    public static /* synthetic */ Object ipc$super(TBLiveWebView tBLiveWebView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1253202540:
                return new Boolean(super.coreDispatchTouchEvent((MotionEvent) objArr[0]));
            case -1185152872:
                super.addJavascriptInterface(objArr[0], (String) objArr[1]);
                return null;
            case 143825882:
                return new Boolean(super.coreOverScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
            case 711821702:
                super.onOverScrolled(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolivecontainer/TBLiveWebView");
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void addJavascriptInterface(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b95c0098", new Object[]{this, obj, str});
        } else if (!"accessibility".equals(str) && !"accessibilityTraversal".equals(str)) {
            super.addJavascriptInterface(obj, str);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreDispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent findViewParentIfNeed;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b54da594", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mEnableWebViewGestureLogic && motionEvent.getAction() == 0 && (findViewParentIfNeed = findViewParentIfNeed(this, 5)) != null) {
            findViewParentIfNeed.requestDisallowInterceptTouchEvent(true);
        }
        return super.coreDispatchTouchEvent(motionEvent);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        ViewParent findViewParentIfNeed;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8929bda", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue();
        }
        if (this.mEnableWebViewGestureLogic && this.mScrollX == i3 && Math.abs(i) > 0 && (findViewParentIfNeed = findViewParentIfNeed(this, 5)) != null) {
            findViewParentIfNeed.requestDisallowInterceptTouchEvent(false);
        }
        this.mScrollX = i3;
        return super.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        this.context = null;
        this.mToken = null;
    }

    public Object getWebViewToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("77335f75", new Object[]{this});
        }
        return this.mToken;
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        ViewParent findViewParentIfNeed;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a6d8986", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2)});
            return;
        }
        if (this.mEnableWebViewGestureLogic && ((z || z2) && (findViewParentIfNeed = findViewParentIfNeed(this, 5)) != null)) {
            findViewParentIfNeed.requestDisallowInterceptTouchEvent(false);
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent findViewParentIfNeed;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mEnableWebViewGestureLogic && motionEvent.getAction() == 0 && (findViewParentIfNeed = findViewParentIfNeed(this, 5)) != null) {
            findViewParentIfNeed.requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setEnableWebViewGestureLogic(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e59f344", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableWebViewGestureLogic = z;
        }
    }

    public void setWebViewToken(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17ee9a05", new Object[]{this, obj});
        } else {
            this.mToken = obj;
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        removeJavascriptInterface("searchBoxJavaBridge_");
    }

    public TBLiveWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public TBLiveWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
