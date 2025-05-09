package com.taobao.search.mmd.onesearch;

import android.content.Context;
import android.os.Handler;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebSettings;
import tb.b4p;
import tb.b6p;
import tb.c6p;
import tb.fmo;
import tb.t2o;
import tb.xnv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchWidgetUCWebView extends WVUCWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int INVALID_POINTER = -1;
    public static final int MSG_KEYBOARD_WILL_HIDE = 1501;
    public static final int MSG_KEYBOARD_WILL_SHOW = 1500;
    private Context mContext;
    private int mLastMotionX;
    private c6p mSearchUCWebViewClient;
    private fmo widget;
    private int mPreBottom = 0;
    private int mSoftImHeight = 0;
    private int mTouchSlop = -1;
    private boolean mIsBeingDragged = false;
    private int mActivePointerId = -1;

    static {
        t2o.a(815792548);
    }

    public SearchWidgetUCWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        init();
    }

    public static /* synthetic */ Object ipc$super(SearchWidgetUCWebView searchWidgetUCWebView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/mmd/onesearch/SearchWidgetUCWebView");
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, android.taobao.windvane.webview.IWVWebView
    public boolean back() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e58bdf2", new Object[]{this})).booleanValue();
        }
        if (canGoBack()) {
            goBack();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r3 != 3) goto L_0x0085;
     */
    @Override // com.uc.webview.export.WebView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.search.mmd.onesearch.SearchWidgetUCWebView.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "e7b587fe"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            int r3 = r5.mTouchSlop
            if (r3 >= 0) goto L_0x002e
            android.content.Context r3 = r5.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r3 = r3.getScaledTouchSlop()
            r5.mTouchSlop = r3
        L_0x002e:
            int r3 = r6.getAction()
            if (r3 != r2) goto L_0x0039
            boolean r3 = r5.mIsBeingDragged
            if (r3 == 0) goto L_0x0039
            return r1
        L_0x0039:
            int r3 = androidx.core.view.MotionEventCompat.getActionMasked(r6)
            if (r3 == 0) goto L_0x0076
            r4 = -1
            if (r3 == r0) goto L_0x0071
            if (r3 == r2) goto L_0x0048
            r6 = 3
            if (r3 == r6) goto L_0x0071
            goto L_0x0085
        L_0x0048:
            int r2 = r5.mActivePointerId
            if (r2 != r4) goto L_0x004d
            goto L_0x0085
        L_0x004d:
            int r2 = androidx.core.view.MotionEventCompat.findPointerIndex(r6, r2)
            if (r2 != r4) goto L_0x0054
            goto L_0x0085
        L_0x0054:
            float r6 = androidx.core.view.MotionEventCompat.getX(r6, r2)
            int r6 = (int) r6
            int r2 = r5.mLastMotionX
            int r2 = r6 - r2
            int r2 = java.lang.Math.abs(r2)
            int r3 = r5.mTouchSlop
            if (r2 <= r3) goto L_0x0085
            boolean r2 = r5.mIsBeingDragged
            if (r2 != 0) goto L_0x006c
            r5.requestDisallowInterceptTouchEvent(r0)
        L_0x006c:
            r5.mIsBeingDragged = r0
            r5.mLastMotionX = r6
            goto L_0x0085
        L_0x0071:
            r5.mIsBeingDragged = r1
            r5.mActivePointerId = r4
            goto L_0x0085
        L_0x0076:
            r5.mIsBeingDragged = r1
            float r0 = r6.getX()
            int r0 = (int) r0
            r5.mLastMotionX = r0
            int r6 = androidx.core.view.MotionEventCompat.getPointerId(r6, r1)
            r5.mActivePointerId = r6
        L_0x0085:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.mmd.onesearch.SearchWidgetUCWebView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int i5 = this.mPreBottom;
        if (i5 > i4) {
            if (i5 - i4 > this.mSoftImHeight) {
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.sendEmptyMessage(1500);
                }
                b4p.a("wwwap", "softimshowed ");
            }
        } else if (i4 - i5 > this.mSoftImHeight) {
            Handler handler2 = this.mHandler;
            if (handler2 != null) {
                handler2.sendEmptyMessage(1501);
            }
            b4p.a("wwwap", "softim hide ");
        }
        this.mPreBottom = i4;
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r4 != 3) goto L_0x0086;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.search.mmd.onesearch.SearchWidgetUCWebView.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "a9b14c3a"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            java.lang.Object r7 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001c:
            boolean r3 = super.onTouchEvent(r7)
            int r4 = androidx.core.view.MotionEventCompat.getActionMasked(r7)
            boolean r5 = r6.mIsBeingDragged
            if (r5 == 0) goto L_0x0029
            return r0
        L_0x0029:
            if (r3 == 0) goto L_0x002c
            return r0
        L_0x002c:
            int r5 = r6.mTouchSlop
            if (r5 >= 0) goto L_0x003e
            android.content.Context r5 = r6.getContext()
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            int r5 = r5.getScaledTouchSlop()
            r6.mTouchSlop = r5
        L_0x003e:
            if (r4 == 0) goto L_0x0079
            r5 = -1
            if (r4 == r0) goto L_0x0074
            if (r4 == r2) goto L_0x0049
            r7 = 3
            if (r4 == r7) goto L_0x0074
            goto L_0x0086
        L_0x0049:
            int r2 = r6.mActivePointerId
            int r2 = androidx.core.view.MotionEventCompat.findPointerIndex(r7, r2)
            if (r2 != r5) goto L_0x0052
            return r1
        L_0x0052:
            float r7 = androidx.core.view.MotionEventCompat.getX(r7, r2)
            int r7 = (int) r7
            int r1 = r6.mLastMotionX
            int r1 = r1 - r7
            boolean r2 = r6.mIsBeingDragged
            if (r2 != 0) goto L_0x006c
            int r1 = java.lang.Math.abs(r1)
            int r2 = r6.mTouchSlop
            if (r1 <= r2) goto L_0x006c
            r6.requestDisallowInterceptTouchEvent(r0)
            r6.mIsBeingDragged = r0
            goto L_0x006d
        L_0x006c:
            r0 = r3
        L_0x006d:
            boolean r1 = r6.mIsBeingDragged
            if (r1 == 0) goto L_0x0087
            r6.mLastMotionX = r7
            goto L_0x0087
        L_0x0074:
            r6.mIsBeingDragged = r1
            r6.mActivePointerId = r5
            goto L_0x0087
        L_0x0079:
            float r0 = r7.getX()
            int r0 = (int) r0
            r6.mLastMotionX = r0
            int r7 = androidx.core.view.MotionEventCompat.getPointerId(r7, r1)
            r6.mActivePointerId = r7
        L_0x0086:
            r0 = r3
        L_0x0087:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.mmd.onesearch.SearchWidgetUCWebView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setFilter(xnv xnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fc6de59", new Object[]{this, xnvVar});
            return;
        }
        c6p c6pVar = new c6p(this.mContext, xnvVar);
        this.mSearchUCWebViewClient = c6pVar;
        c6pVar.d(this.widget);
        setWebViewClient(this.mSearchUCWebViewClient);
    }

    public void setIntercept(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d5fcad", new Object[]{this, new Boolean(z)});
        } else {
            this.mSearchUCWebViewClient.c(z);
        }
    }

    public void setWidget(fmo fmoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c7244e9", new Object[]{this, fmoVar});
        } else {
            this.widget = fmoVar;
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        WebSettings settings = getSettings();
        setWebChromeClient(new b6p());
        this.mSoftImHeight = (int) (getResources().getDisplayMetrics().density * 120.0f);
        setBackgroundColor(0);
        try {
            settings.setBuiltInZoomControls(false);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
        } catch (Throwable unused) {
            b4p.b("SearchWidgetWebView", "初始化webview设置失败");
        }
    }

    public SearchWidgetUCWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
        init();
    }

    public SearchWidgetUCWebView(Context context) {
        super(context);
        this.mContext = context;
        init();
    }
}
