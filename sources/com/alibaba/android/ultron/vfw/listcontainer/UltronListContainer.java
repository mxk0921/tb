package com.alibaba.android.ultron.vfw.listcontainer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import tb.j9v;
import tb.k9v;
import tb.sh4;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronListContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.LayoutManager f2337a;
        public final /* synthetic */ int b;

        public a(RecyclerView.LayoutManager layoutManager, int i) {
            this.f2337a = layoutManager;
            this.b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else if (this.f2337a instanceof LinearLayoutManager) {
                ((LinearLayoutManager) this.f2337a).scrollToPositionWithOffset(this.b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j9v f2338a;

        public b(j9v j9vVar) {
            this.f2338a = j9vVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/listcontainer/UltronListContainer$3");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            k9v c = this.f2338a.c();
            if (c != null) {
                c.a();
            }
        }
    }

    static {
        t2o.a(157286674);
    }

    public static void a(RecyclerView recyclerView, int i, int i2, j9v j9vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6e5694", new Object[]{recyclerView, new Integer(i), new Integer(i2), j9vVar});
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i2, j9vVar.a());
            ofInt.setDuration(j9vVar.b());
            Interpolator d = j9vVar.d();
            if (d != null) {
                ofInt.setInterpolator(d);
            }
            ofInt.addUpdateListener(new a(layoutManager, i));
            ofInt.addListener(new b(j9vVar));
            ofInt.start();
        }
    }

    public static void c(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5414e4", new Object[]{recyclerView, new Integer(i)});
        } else {
            d(recyclerView, i, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r8.equals(com.alibaba.android.ultron.vfw.listcontainer.UltronScrollPositionType.afterLast) == false) goto L_0x002b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(androidx.recyclerview.widget.RecyclerView r5, final int r6, final tb.j9v r7, java.lang.String r8) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.alibaba.android.ultron.vfw.listcontainer.UltronListContainer.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0020
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r6)
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r2] = r5
            r6[r1] = r4
            r6[r0] = r7
            r5 = 3
            r6[r5] = r8
            java.lang.String r5 = "50a24856"
            r3.ipc$dispatch(r5, r6)
            return
        L_0x0020:
            r8.hashCode()
            r3 = -1
            int r4 = r8.hashCode()
            switch(r4) {
                case -1902702491: goto L_0x0041;
                case -1118274959: goto L_0x0036;
                case 1019002514: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            r0 = -1
            goto L_0x004b
        L_0x002d:
            java.lang.String r4 = "afterLast"
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x004b
            goto L_0x002b
        L_0x0036:
            java.lang.String r0 = "beforeFirst"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x003f
            goto L_0x002b
        L_0x003f:
            r0 = 1
            goto L_0x004b
        L_0x0041:
            java.lang.String r0 = "betweenFirstAndLast"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x004a
            goto L_0x002b
        L_0x004a:
            r0 = 0
        L_0x004b:
            switch(r0) {
                case 0: goto L_0x0065;
                case 1: goto L_0x0061;
                case 2: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x0087
        L_0x004f:
            boolean[] r8 = new boolean[r1]
            r8[r2] = r2
            com.alibaba.android.ultron.vfw.listcontainer.UltronListContainer$1 r0 = new com.alibaba.android.ultron.vfw.listcontainer.UltronListContainer$1
            r0.<init>()
            r5.addOnScrollListener(r0)
            r8[r2] = r1
            g(r5, r6, r7, r2)
            goto L_0x0087
        L_0x0061:
            g(r5, r6, r7, r1)
            goto L_0x0087
        L_0x0065:
            android.view.View r8 = r5.getChildAt(r2)
            int r8 = r5.getChildLayoutPosition(r8)
            int r8 = r6 - r8
            int r0 = r5.getChildCount()
            int r0 = r0 - r1
            int r8 = java.lang.Math.min(r0, r8)
            int r8 = java.lang.Math.max(r2, r8)
            android.view.View r8 = r5.getChildAt(r8)
            int r8 = r8.getTop()
            a(r5, r6, r8, r7)
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.vfw.listcontainer.UltronListContainer.e(androidx.recyclerview.widget.RecyclerView, int, tb.j9v, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
        if (r9.equals(com.alibaba.android.ultron.vfw.listcontainer.UltronScrollPositionType.afterLast) == false) goto L_0x0060;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(androidx.recyclerview.widget.RecyclerView r6, int r7, tb.j9v r8, java.lang.String r9) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.alibaba.android.ultron.vfw.listcontainer.UltronListContainer.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0020
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r7)
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r2] = r6
            r7[r1] = r4
            r7[r0] = r8
            r6 = 3
            r7[r6] = r9
            java.lang.String r6 = "8d776c16"
            r3.ipc$dispatch(r6, r7)
            return
        L_0x0020:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r6.getLayoutManager()
            if (r3 != 0) goto L_0x0033
            java.lang.String r6 = "layoutManager is null"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.lang.String r7 = "UltronListContainer"
            com.taobao.android.ultron.common.utils.UnifyLog.e(r7, r6)
            return
        L_0x0033:
            if (r8 != 0) goto L_0x0037
            r8 = 0
            goto L_0x003b
        L_0x0037:
            int r8 = r8.a()
        L_0x003b:
            boolean r4 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x0045
            androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
            r3.scrollToPositionWithOffset(r7, r8)
            goto L_0x00aa
        L_0x0045:
            boolean r4 = r3 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r4 == 0) goto L_0x004f
            androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r3
            r3.scrollToPositionWithOffset(r7, r8)
            goto L_0x00aa
        L_0x004f:
            boolean r4 = tb.yv6.a()
            if (r4 != 0) goto L_0x00ab
            r9.hashCode()
            r4 = -1
            int r5 = r9.hashCode()
            switch(r5) {
                case -1902702491: goto L_0x0076;
                case -1118274959: goto L_0x006b;
                case 1019002514: goto L_0x0062;
                default: goto L_0x0060;
            }
        L_0x0060:
            r0 = -1
            goto L_0x0080
        L_0x0062:
            java.lang.String r5 = "afterLast"
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto L_0x0080
            goto L_0x0060
        L_0x006b:
            java.lang.String r0 = "beforeFirst"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0074
            goto L_0x0060
        L_0x0074:
            r0 = 1
            goto L_0x0080
        L_0x0076:
            java.lang.String r0 = "betweenFirstAndLast"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x007f
            goto L_0x0060
        L_0x007f:
            r0 = 0
        L_0x0080:
            switch(r0) {
                case 0: goto L_0x0088;
                case 1: goto L_0x0084;
                case 2: goto L_0x0084;
                default: goto L_0x0083;
            }
        L_0x0083:
            goto L_0x00aa
        L_0x0084:
            r3.scrollToPosition(r7)
            goto L_0x00aa
        L_0x0088:
            android.view.View r9 = r6.getChildAt(r2)
            int r9 = r6.getChildLayoutPosition(r9)
            int r7 = r7 - r9
            int r9 = r6.getChildCount()
            int r9 = r9 - r1
            int r7 = java.lang.Math.min(r9, r7)
            int r7 = java.lang.Math.max(r2, r7)
            android.view.View r7 = r6.getChildAt(r7)
            int r7 = r7.getTop()
            int r7 = r7 - r8
            r6.scrollBy(r2, r7)
        L_0x00aa:
            return
        L_0x00ab:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "LayoutManager of RecyclerView must be LinearLayoutManager or StaggeredGridLayoutManager"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.vfw.listcontainer.UltronListContainer.f(androidx.recyclerview.widget.RecyclerView, int, tb.j9v, java.lang.String):void");
    }

    public static void g(RecyclerView recyclerView, int i, j9v j9vVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1644b65f", new Object[]{recyclerView, new Integer(i), j9vVar, new Boolean(z)});
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            UnifyLog.e("UltronListContainer", "layoutManager is null");
            return;
        }
        Interpolator d = j9vVar.d();
        UltonSmoothScroller ultonSmoothScroller = new UltonSmoothScroller(recyclerView.getContext());
        if (z) {
            ultonSmoothScroller.e(j9vVar.c());
        }
        ultonSmoothScroller.c(j9vVar.b());
        ultonSmoothScroller.setTargetPosition(i);
        ultonSmoothScroller.d(d, d);
        layoutManager.startSmoothScroll(ultonSmoothScroller);
    }

    public static void d(RecyclerView recyclerView, int i, j9v j9vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a49e390", new Object[]{recyclerView, new Integer(i), j9vVar});
        } else if (sh4.h(sh4.KEY_ENABLE_LIST_CONTAINER_SCROLLER, true)) {
            String b2 = b(recyclerView, i);
            if (!"none".equals(b2)) {
                if (j9vVar == null || j9vVar.d() == null) {
                    f(recyclerView, i, j9vVar, b2);
                } else {
                    e(recyclerView, i, j9vVar, b2);
                }
            }
        }
    }

    public static String b(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98c0ba34", new Object[]{recyclerView, new Integer(i)});
        }
        int childCount = recyclerView.getChildCount();
        if (childCount == 0) {
            return "none";
        }
        int childLayoutPosition = recyclerView.getChildLayoutPosition(recyclerView.getChildAt(0));
        int childLayoutPosition2 = recyclerView.getChildLayoutPosition(recyclerView.getChildAt(childCount - 1));
        if (i < childLayoutPosition) {
            return UltronScrollPositionType.beforeFirst;
        }
        if (i <= childLayoutPosition2) {
            return UltronScrollPositionType.betweenFirstAndLast;
        }
        return UltronScrollPositionType.afterLast;
    }
}
