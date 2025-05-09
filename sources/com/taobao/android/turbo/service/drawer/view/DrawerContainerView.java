package com.taobao.android.turbo.service.drawer.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.view.ScrollControlViewPager;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001dB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/taobao/android/turbo/service/drawer/view/DrawerContainerView;", "Lcom/taobao/android/turbo/view/ScrollControlViewPager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ltb/xhv;", "init", "()V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "x", "y", "scrollTo", "(II)V", "scrollState", TLogTracker.LEVEL_INFO, "isScrollingOnLeftDrawer", "Z", "isScrollingOnRightDrawer", "Companion", "a", "OnDrawerChangeListener", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DrawerContainerView extends ScrollControlViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static final double OFFSET_THRESHOLD = 0.001d;
    private boolean isScrollingOnLeftDrawer;
    private boolean isScrollingOnRightDrawer;
    private int scrollState;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455544);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455543);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DrawerContainerView(Context context) {
        this(context, null);
        ckf.g(context, "context");
    }

    public static final /* synthetic */ int access$getScrollState$p(DrawerContainerView drawerContainerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("914a6d78", new Object[]{drawerContainerView})).intValue();
        }
        return drawerContainerView.scrollState;
    }

    public static final /* synthetic */ boolean access$isScrollingOnLeftDrawer$p(DrawerContainerView drawerContainerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b78d91d", new Object[]{drawerContainerView})).booleanValue();
        }
        return drawerContainerView.isScrollingOnLeftDrawer;
    }

    public static final /* synthetic */ boolean access$isScrollingOnRightDrawer$p(DrawerContainerView drawerContainerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("666fd09e", new Object[]{drawerContainerView})).booleanValue();
        }
        return drawerContainerView.isScrollingOnRightDrawer;
    }

    public static final /* synthetic */ void access$setScrollState$p(DrawerContainerView drawerContainerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c658852a", new Object[]{drawerContainerView, new Integer(i)});
        } else {
            drawerContainerView.scrollState = i;
        }
    }

    public static final /* synthetic */ void access$setScrollingOnLeftDrawer$p(DrawerContainerView drawerContainerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9d7393", new Object[]{drawerContainerView, new Boolean(z)});
        } else {
            drawerContainerView.isScrollingOnLeftDrawer = z;
        }
    }

    public static final /* synthetic */ void access$setScrollingOnRightDrawer$p(DrawerContainerView drawerContainerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ddf55c2", new Object[]{drawerContainerView, new Boolean(z)});
        } else {
            drawerContainerView.isScrollingOnRightDrawer = z;
        }
    }

    private final void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            addOnPageChangeListener(new OnDrawerChangeListener());
        }
    }

    public static /* synthetic */ Object ipc$super(DrawerContainerView drawerContainerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1577577649) {
            super.scrollTo(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/turbo/service/drawer/view/DrawerContainerView");
        }
    }

    @Override // com.taobao.android.turbo.view.ScrollControlViewPager, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.scrollState == 2) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f8134f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (!this.isScrollingOnLeftDrawer ? !(!this.isScrollingOnRightDrawer || i >= 0) : i > 0) {
            i = 0;
        }
        super.scrollTo(i, i2);
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/android/turbo/service/drawer/view/DrawerContainerView$OnDrawerChangeListener;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public final class OnDrawerChangeListener implements ViewPager.OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(916455545);
        }

        public OnDrawerChangeListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                return;
            }
            DrawerContainerView.access$setScrollState$p(DrawerContainerView.this, i);
            if (i == 0) {
                DrawerContainerView.access$setScrollingOnLeftDrawer$p(DrawerContainerView.this, false);
                DrawerContainerView.access$setScrollingOnRightDrawer$p(DrawerContainerView.this, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
            if (r7 <= 0.999d) goto L_0x0073;
         */
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onPageScrolled(int r10, float r11, int r12) {
            /*
                r9 = this;
                r0 = 0
                r1 = 1
                com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.turbo.service.drawer.view.DrawerContainerView.OnDrawerChangeListener.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r3 == 0) goto L_0x002a
                java.lang.Integer r3 = new java.lang.Integer
                r3.<init>(r10)
                java.lang.Float r10 = new java.lang.Float
                r10.<init>(r11)
                java.lang.Integer r11 = new java.lang.Integer
                r11.<init>(r12)
                r12 = 4
                java.lang.Object[] r12 = new java.lang.Object[r12]
                r12[r0] = r9
                r12[r1] = r3
                r0 = 2
                r12[r0] = r10
                r10 = 3
                r12[r10] = r11
                java.lang.String r10 = "f4c13b05"
                r2.ipc$dispatch(r10, r12)
                return
            L_0x002a:
                com.taobao.android.turbo.service.drawer.view.DrawerContainerView r12 = com.taobao.android.turbo.service.drawer.view.DrawerContainerView.this
                int r12 = com.taobao.android.turbo.service.drawer.view.DrawerContainerView.access$getScrollState$p(r12)
                if (r12 != 0) goto L_0x0087
                com.taobao.android.turbo.service.drawer.view.DrawerContainerView r12 = com.taobao.android.turbo.service.drawer.view.DrawerContainerView.this
                androidx.viewpager.widget.PagerAdapter r12 = r12.getAdapter()
                if (r12 == 0) goto L_0x007e
                com.taobao.android.turbo.service.drawer.adapter.DrawerContainerAdapter r12 = (com.taobao.android.turbo.service.drawer.adapter.DrawerContainerAdapter) r12
                int r2 = r12.m()
                int r12 = r12.p()
                r3 = 4607173411600762667(0x3feff7ced916872b, double:0.999)
                r5 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
                if (r10 != r2) goto L_0x0064
                double r7 = (double) r11
                int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r2 < 0) goto L_0x0064
                int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r2 > 0) goto L_0x0064
                com.taobao.android.turbo.service.drawer.view.DrawerContainerView r10 = com.taobao.android.turbo.service.drawer.view.DrawerContainerView.this
                com.taobao.android.turbo.service.drawer.view.DrawerContainerView.access$setScrollingOnLeftDrawer$p(r10, r1)
                com.taobao.android.turbo.service.drawer.view.DrawerContainerView r10 = com.taobao.android.turbo.service.drawer.view.DrawerContainerView.this
                com.taobao.android.turbo.service.drawer.view.DrawerContainerView.access$setScrollingOnRightDrawer$p(r10, r0)
                goto L_0x0087
            L_0x0064:
                int r2 = r12 + (-1)
                if (r10 != r2) goto L_0x0071
                double r7 = (double) r11
                int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r11 < 0) goto L_0x0071
                int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r11 <= 0) goto L_0x0073
            L_0x0071:
                if (r10 != r12) goto L_0x0087
            L_0x0073:
                com.taobao.android.turbo.service.drawer.view.DrawerContainerView r10 = com.taobao.android.turbo.service.drawer.view.DrawerContainerView.this
                com.taobao.android.turbo.service.drawer.view.DrawerContainerView.access$setScrollingOnLeftDrawer$p(r10, r0)
                com.taobao.android.turbo.service.drawer.view.DrawerContainerView r10 = com.taobao.android.turbo.service.drawer.view.DrawerContainerView.this
                com.taobao.android.turbo.service.drawer.view.DrawerContainerView.access$setScrollingOnRightDrawer$p(r10, r1)
                goto L_0x0087
            L_0x007e:
                java.lang.NullPointerException r10 = new java.lang.NullPointerException
                java.lang.String r11 = "null cannot be cast to non-null type com.taobao.android.turbo.service.drawer.adapter.DrawerContainerAdapter"
                r10.<init>(r11)
                throw r10
            L_0x0087:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.turbo.service.drawer.view.DrawerContainerView.OnDrawerChangeListener.onPageScrolled(int, float, int):void");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
        init();
    }
}
