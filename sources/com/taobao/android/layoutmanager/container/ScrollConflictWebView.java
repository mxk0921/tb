package com.taobao.android.layoutmanager.container;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ScrollConflictWebView extends WVUCWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502268016);
    }

    public ScrollConflictWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private ViewParent findViewParentIfNeeds(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("307f684b", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewPager) {
            return parent;
        }
        if (parent instanceof View) {
            return findViewParentIfNeeds((View) parent);
        }
        return parent;
    }

    public static /* synthetic */ Object ipc$super(ScrollConflictWebView scrollConflictWebView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1253202540) {
            return new Boolean(super.coreDispatchTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == 143825882) {
            return new Boolean(super.coreOverScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/layoutmanager/container/ScrollConflictWebView");
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b54da594", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            ViewParent findViewParentIfNeeds = findViewParentIfNeeds(this);
            if (findViewParentIfNeeds instanceof ViewPager) {
                findViewParentIfNeeds.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.coreDispatchTouchEvent(motionEvent);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8929bda", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue();
        }
        ViewParent findViewParentIfNeeds = findViewParentIfNeeds(this);
        if (findViewParentIfNeeds instanceof ViewPager) {
            findViewParentIfNeeds.requestDisallowInterceptTouchEvent(false);
        }
        return super.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    public ScrollConflictWebView(Context context) {
        super(context);
    }
}
