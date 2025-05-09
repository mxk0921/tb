package com.taobao.android.dressup.common.view.mediabrowser;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.ali.user.mobile.app.constant.UTConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;
import tb.xtn;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/taobao/android/dressup/common/view/mediabrowser/MediaBrowserViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ltb/xhv;", "onAttachedToWindow", "()V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "firstTimeAttach", "Z", "", "initialX", UTConstant.Args.UT_SUCCESS_F, "initialY", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class MediaBrowserViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean firstTimeAttach = true;
    private float initialX;
    private float initialY;

    static {
        t2o.a(918552781);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaBrowserViewPager(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    public static /* synthetic */ Object ipc$super(MediaBrowserViewPager mediaBrowserViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dressup/common/view/mediabrowser/MediaBrowserViewPager");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (!this.firstTimeAttach && getAdapter() != null) {
            xtn.Companion.c(ViewPager.class, "mFirstLayout", this, Boolean.FALSE);
        }
        this.firstTimeAttach = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r3 != 3) goto L_0x00aa;
     */
    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.dressup.common.view.mediabrowser.MediaBrowserViewPager.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "e7b587fe"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            java.lang.Object r7 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001c:
            java.lang.String r3 = "ev"
            tb.ckf.g(r7, r3)
            int r3 = r7.getAction()
            if (r3 == 0) goto L_0x0095
            if (r3 == r0) goto L_0x008b
            if (r3 == r2) goto L_0x0030
            r0 = 3
            if (r3 == r0) goto L_0x008b
            goto L_0x00aa
        L_0x0030:
            float r2 = r7.getX()
            float r3 = r6.initialX
            float r2 = r2 - r3
            float r3 = r7.getY()
            float r4 = r6.initialY
            float r3 = r3 - r4
            float r4 = java.lang.Math.abs(r2)
            float r3 = java.lang.Math.abs(r3)
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x007d
            androidx.viewpager.widget.PagerAdapter r7 = r6.getAdapter()
            if (r7 == 0) goto L_0x0055
            int r7 = r7.getCount()
            goto L_0x0056
        L_0x0055:
            r7 = 0
        L_0x0056:
            int r3 = r6.getCurrentItem()
            float r4 = (float) r1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0061
            r2 = 1
            goto L_0x0062
        L_0x0061:
            r2 = 0
        L_0x0062:
            if (r7 <= r0) goto L_0x0073
            if (r3 > 0) goto L_0x0069
            if (r2 == 0) goto L_0x0069
            goto L_0x0073
        L_0x0069:
            android.view.ViewParent r7 = r6.getParent()
            if (r7 == 0) goto L_0x007c
            r7.requestDisallowInterceptTouchEvent(r0)
            goto L_0x007c
        L_0x0073:
            android.view.ViewParent r7 = r6.getParent()
            if (r7 == 0) goto L_0x007c
            r7.requestDisallowInterceptTouchEvent(r1)
        L_0x007c:
            return r0
        L_0x007d:
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00aa
            android.view.ViewParent r7 = r6.getParent()
            if (r7 == 0) goto L_0x008a
            r7.requestDisallowInterceptTouchEvent(r1)
        L_0x008a:
            return r1
        L_0x008b:
            android.view.ViewParent r0 = r6.getParent()
            if (r0 == 0) goto L_0x00aa
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L_0x00aa
        L_0x0095:
            float r1 = r7.getX()
            r6.initialX = r1
            float r1 = r7.getY()
            r6.initialY = r1
            android.view.ViewParent r1 = r6.getParent()
            if (r1 == 0) goto L_0x00aa
            r1.requestDisallowInterceptTouchEvent(r0)
        L_0x00aa:
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dressup.common.view.mediabrowser.MediaBrowserViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaBrowserViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
    }
}
