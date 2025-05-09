package com.taobao.android.searchbaseframe.meta.uikit;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.core.view.NestedScrollingParent2;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.buc;
import tb.bva;
import tb.frk;
import tb.fsi;
import tb.guc;
import tb.kuc;
import tb.rsi;
import tb.t2o;
import tb.tsi;
import tb.woz;
import tb.ytc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MetaLayout extends FrameLayout implements NestedScrollingParent2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int FLING_FLAG = 2;
    public static final int LAYOUT_MODE_ABSOLUTE = 1;
    public static final int LAYOUT_MODE_RELATIVE = 0;
    public static final int LAYOUT_MODE_RELATIVE_BUT_MATCH_PARENT = 2;
    private static final int SCROLL_STATE_FLAG = 1;
    public static final int TYPE_CUSTOM = 2;
    private int currentHeight;
    private boolean enableOverScroll;
    private boolean hasImmersiveHeader;
    private f headerChangeListener;
    private int headerHeight;
    private int headerOffset;
    private bva headerScroller;
    private ytc immersiveHeader;
    private boolean layoutListFirst;
    private int layoutType;
    private boolean listChanged;
    private View listContainer;
    private int listStart;
    private boolean listStartSet;
    private View listView;
    private d listener;
    public final List<ytc> originHeaders;
    private Set<View.OnTouchListener> outerListeners;
    private Animator overScrollAnim;
    private guc overScrollListener;
    private int overScrollY;
    public final Set<ytc> parentHeaders;
    private MetaLayout parentMetaLayout;
    private int privateFlags;
    private boolean scrollDone;
    private fsi scrollDownCurrentNode;
    private fsi scrollDownHeadNode;
    private final c scrollDownHeaders;
    private final e scrollDownImpl;
    private kuc scrollListener;
    private List<ytc> scrollStateNodes;
    private fsi scrollUpCurrentNode;
    private fsi scrollUpHeadNode;
    private final c scrollUpHeaders;
    private final e scrollUpImpl;
    private boolean scrollable;
    private boolean startTouch;
    private int totalHeight;
    private rsi touchHelper;
    private boolean waitForLayoutDone;
    public static int HEIGHT_MATCH_TAG = MetaLayout.class.hashCode();
    private static final int HEADER_KEY = R.color.libsf_black;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.searchbaseframe.meta.uikit.MetaLayout.e
        public void a(fsi fsiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce6a82f9", new Object[]{this, fsiVar});
            } else {
                MetaLayout.access$002(MetaLayout.this, fsiVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.searchbaseframe.meta.uikit.MetaLayout.e
        public void a(fsi fsiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce6a82f9", new Object[]{this, fsiVar});
            } else {
                MetaLayout.access$102(MetaLayout.this, fsiVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<List<ytc>> f9345a = new SparseArray<>();
        public final List<Integer> b = new ArrayList();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Comparator<Integer> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(c cVar) {
            }

            /* renamed from: a */
            public int compare(Integer num, Integer num2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("dc099c7f", new Object[]{this, num, num2})).intValue();
                }
                if (!(num == null || num2 == null)) {
                    if (num.intValue() > num2.intValue()) {
                        return 1;
                    }
                    if (num.intValue() < num2.intValue()) {
                        return -1;
                    }
                }
                return 0;
            }
        }

        static {
            t2o.a(993001856);
        }

        public void a(ytc ytcVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42e3faee", new Object[]{this, ytcVar, new Integer(i)});
                return;
            }
            List<ytc> list = this.f9345a.get(i);
            if (list == null) {
                list = new ArrayList<>();
                this.f9345a.put(i, list);
                ((ArrayList) this.b).add(Integer.valueOf(i));
            }
            list.add(ytcVar);
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
                return;
            }
            this.f9345a.clear();
            ((ArrayList) this.b).clear();
        }

        public int c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("df0d8b8", new Object[]{this, new Integer(i)})).intValue();
            }
            if (i >= d()) {
                return -1;
            }
            return ((Integer) ((ArrayList) this.b).get(i)).intValue();
        }

        public int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
            }
            return ((ArrayList) this.b).size();
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62fb7b25", new Object[]{this});
            } else {
                Collections.sort(this.b, new a(this));
            }
        }

        public List<ytc> f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("f4aa46ef", new Object[]{this, new Integer(i)});
            }
            if (i >= d()) {
                return null;
            }
            return this.f9345a.get(((Integer) ((ArrayList) this.b).get(i)).intValue());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface d {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface e {
        void a(fsi fsiVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface f {
        void m();
    }

    static {
        t2o.a(993001853);
    }

    public MetaLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ fsi access$002(MetaLayout metaLayout, fsi fsiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fsi) ipChange.ipc$dispatch("b31ca986", new Object[]{metaLayout, fsiVar});
        }
        metaLayout.scrollUpCurrentNode = fsiVar;
        return fsiVar;
    }

    public static /* synthetic */ fsi access$102(MetaLayout metaLayout, fsi fsiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fsi) ipChange.ipc$dispatch("c52a5b65", new Object[]{metaLayout, fsiVar});
        }
        metaLayout.scrollDownCurrentNode = fsiVar;
        return fsiVar;
    }

    private int adjustHeaders(boolean z) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b345c089", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (this.hasImmersiveHeader) {
            i = 0;
        } else {
            i = this.listStart;
        }
        int i3 = this.headerOffset;
        this.totalHeight = i3;
        this.currentHeight = i3;
        for (int i4 = 0; i4 < this.originHeaders.size(); i4++) {
            ytc ytcVar = this.originHeaders.get(i4);
            int c2 = i + ytcVar.c();
            if (i4 == 0) {
                i2 = ytcVar.c();
            } else {
                i2 = c2;
            }
            int i5 = i2 + this.headerOffset;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ytcVar.getView().getLayoutParams();
            if (ytcVar.getView().getVisibility() == 0) {
                if (z || isMatchParentHeader(ytcVar.getView())) {
                    ytcVar.getView().layout(0, layoutParams.topMargin, ytcVar.getView().getMeasuredWidth(), layoutParams.topMargin + ytcVar.getView().getMeasuredHeight());
                }
                tsi.c(ytcVar.getView(), i5);
            }
            i = (c2 + ytcVar.getHeight()) - ytcVar.f();
            if (!ytcVar.q()) {
                this.totalHeight = this.totalHeight + ytcVar.getHeight() + layoutParams.topMargin;
                this.currentHeight = (((this.currentHeight + ytcVar.getHeight()) + ytcVar.c()) - ytcVar.f()) + layoutParams.topMargin;
            }
        }
        return i;
    }

    private void buildScrollNode(boolean z, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14519f7f", new Object[]{this, new Boolean(z), cVar});
            return;
        }
        fsi fsiVar = null;
        for (int d2 = cVar.d() - 1; d2 >= 0; d2--) {
            List<ytc> f2 = cVar.f(d2);
            if (f2 != null) {
                int c2 = cVar.c(d2);
                if (z) {
                    for (ytc ytcVar : f2) {
                        fsiVar = createNode(ytcVar, c2, fsiVar, true);
                    }
                } else {
                    for (int size = f2.size() - 1; size >= 0; size--) {
                        fsiVar = createNode(f2.get(size), c2, fsiVar, false);
                    }
                }
            }
        }
    }

    private boolean canFling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d82edf7", new Object[]{this})).booleanValue();
        }
        if ((this.privateFlags & 4) == 4) {
            return true;
        }
        return false;
    }

    private void cancelScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5c8f6ee", new Object[]{this});
            return;
        }
        bva bvaVar = this.headerScroller;
        if (bvaVar != null) {
            bvaVar.g();
            this.headerScroller = null;
        }
    }

    private void clearViewParent(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c38338f", new Object[]{this, view});
        } else if (view != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    private int correctListPosition(View view, int i, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1f762aa", new Object[]{this, view, new Integer(i), iArr})).intValue();
        }
        if (view != null && this.enableOverScroll && i < 0) {
            float f2 = 0.0f;
            if (view.getTranslationY() < 0.0f) {
                float translationY = view.getTranslationY();
                float f3 = i;
                float f4 = translationY - f3;
                if (f4 <= 0.0f) {
                    f2 = f4;
                }
                float f5 = translationY - f2;
                view.setTranslationY(f2);
                i = (int) (f3 - f5);
                if (iArr != null) {
                    iArr[1] = (int) f5;
                }
            }
        }
        return i;
    }

    private fsi createNode(ytc ytcVar, int i, fsi fsiVar, boolean z) {
        MetaLayout metaLayout;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fsi) ipChange.ipc$dispatch("645cc511", new Object[]{this, ytcVar, new Integer(i), fsiVar, new Boolean(z)});
        }
        fsi fsiVar2 = new fsi(ytcVar);
        if (!this.parentHeaders.contains(ytcVar) || (metaLayout = this.parentMetaLayout) == null) {
            fsiVar2.g(this);
        } else {
            fsiVar2.g(metaLayout);
        }
        if (i <= 2000) {
            z2 = false;
        }
        fsiVar2.f(z2);
        if (fsiVar != null) {
            fsiVar.e(fsiVar2);
        } else if (z) {
            this.scrollDownHeadNode = fsiVar2;
        } else {
            this.scrollUpHeadNode = fsiVar2;
        }
        return fsiVar2;
    }

    private fsi getScrollNode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fsi) ipChange.ipc$dispatch("166a69be", new Object[]{this, new Integer(i)});
        }
        if (i >= 0) {
            if (this.scrollUpCurrentNode != null) {
                this.scrollDone = false;
            }
            this.scrollUpCurrentNode = null;
            fsi fsiVar = this.scrollDownCurrentNode;
            if (fsiVar == null) {
                return this.scrollDownHeadNode;
            }
            return fsiVar;
        }
        if (this.scrollDownCurrentNode != null) {
            this.scrollDone = false;
        }
        this.scrollDownCurrentNode = null;
        fsi fsiVar2 = this.scrollUpCurrentNode;
        if (fsiVar2 == null) {
            return this.scrollUpHeadNode;
        }
        return fsiVar2;
    }

    public static /* synthetic */ Object ipc$super(MetaLayout metaLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1533054272:
                return new Boolean(super.onNestedPreFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue()));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1604649632:
                super.requestLayout();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            case 2114251219:
                return new Boolean(super.onNestedFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Boolean) objArr[3]).booleanValue()));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/meta/uikit/MetaLayout");
        }
    }

    private boolean isMatchParentHeader(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64b49e7d", new Object[]{this, view})).booleanValue();
        }
        Object tag = view.getTag();
        if (!(tag instanceof Integer) || ((Integer) tag).intValue() != HEIGHT_MATCH_TAG) {
            return false;
        }
        return true;
    }

    private boolean isScrollStart(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3824c35", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int i2 = 1 << i;
        if ((this.privateFlags & i2) == i2) {
            return true;
        }
        return false;
    }

    private void modifyScrollState(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70cd3a6", new Object[]{this, recyclerView});
        } else if (recyclerView.getScrollState() != 1) {
            tsi.b(recyclerView, 1);
        }
    }

    private int nestedScrollInternal(int i, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("96dcdfac", new Object[]{this, new Integer(i), new Boolean(z)})).intValue() : nestedScrollInternal(i, z, 0);
    }

    private void notifyOuterTouchListener(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0c7379d", new Object[]{this, motionEvent});
            return;
        }
        for (View.OnTouchListener onTouchListener : this.outerListeners) {
            if (onTouchListener != null) {
                onTouchListener.onTouch(this, motionEvent);
            }
        }
    }

    private void notifyScrollListener(frk frkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50d4ae3c", new Object[]{this, frkVar});
        } else if (frkVar != null) {
            frkVar.r();
        }
    }

    private void notifyScrollState(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6174e573", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        kuc kucVar = this.scrollListener;
        if (kucVar != null) {
            if (z) {
                kucVar.a(getTotalScrollDistance());
            } else {
                kucVar.d(getTotalScrollDistance());
            }
        }
        for (ytc ytcVar : this.scrollStateNodes) {
            if (z) {
                ytcVar.a(i);
            } else {
                ytcVar.b(i);
            }
        }
        MetaLayout metaLayout = this.parentMetaLayout;
        if (metaLayout != null) {
            metaLayout.notifyScrollState(i, z);
        }
    }

    private void onListStartChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5609d5c", new Object[]{this});
            return;
        }
        updateFirstHeaderMargin();
        for (ytc ytcVar : this.originHeaders) {
            ytcVar.e(0, this.listStart, -1);
        }
        updateListTranslation(false);
    }

    private void resetListPosition() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5154c5d", new Object[]{this});
        } else if (this.enableOverScroll && (view = this.listView) != null && view.getTranslationY() < 0.0f) {
            this.overScrollListener.F(-((int) this.listView.getTranslationY()));
            View view2 = this.listView;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, view2.getTranslationY(), 0.0f);
            this.overScrollAnim = ofFloat;
            ofFloat.setInterpolator(new DecelerateInterpolator());
            this.overScrollAnim.start();
        }
    }

    private void setFlag(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44fe366", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        int i2 = 1 << i;
        if (z) {
            this.privateFlags = i2 | this.privateFlags;
        } else {
            this.privateFlags = (~i2) & this.privateFlags;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
        r12.a(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int traverseHeaders(tb.fsi r5, android.view.View r6, int r7, int[] r8, int r9, boolean r10, boolean r11, com.taobao.android.searchbaseframe.meta.uikit.MetaLayout.e r12) {
        /*
            r4 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.searchbaseframe.meta.uikit.MetaLayout.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0047
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r9)
            java.lang.Boolean r9 = new java.lang.Boolean
            r9.<init>(r10)
            java.lang.Boolean r10 = new java.lang.Boolean
            r10.<init>(r11)
            r11 = 9
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r3 = 0
            r11[r3] = r4
            r11[r0] = r5
            r5 = 2
            r11[r5] = r6
            r5 = 3
            r11[r5] = r2
            r5 = 4
            r11[r5] = r8
            r5 = 5
            r11[r5] = r7
            r5 = 6
            r11[r5] = r9
            r5 = 7
            r11[r5] = r10
            r5 = 8
            r11[r5] = r12
            java.lang.String r5 = "d4a08d67"
            java.lang.Object r5 = r1.ipc$dispatch(r5, r11)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            return r5
        L_0x0047:
            r1 = r7
        L_0x0048:
            if (r5 == 0) goto L_0x008f
            boolean r2 = r4.scrollDone
            if (r2 != 0) goto L_0x008f
            if (r10 == 0) goto L_0x0060
            boolean r2 = r5.c()
            if (r2 != 0) goto L_0x0060
            if (r6 == 0) goto L_0x0060
            r2 = -1
            boolean r2 = r6.canScrollVertically(r2)
            if (r2 == 0) goto L_0x0060
            goto L_0x008f
        L_0x0060:
            tb.ytc r2 = r5.a()
            com.taobao.android.searchbaseframe.meta.uikit.MetaLayout r3 = r5.d()
            int r3 = r3.getListStart()
            int r2 = r2.e(r1, r3, r9)
            if (r8 == 0) goto L_0x0077
            r3 = r8[r0]
            int r3 = r3 + r2
            r8[r0] = r3
        L_0x0077:
            int r1 = r1 - r2
            if (r2 == 0) goto L_0x007e
            int r2 = r2 * r7
            if (r2 >= 0) goto L_0x008b
        L_0x007e:
            tb.fsi r2 = r5.b()
            if (r2 == 0) goto L_0x0089
            tb.fsi r5 = r5.b()
            goto L_0x008b
        L_0x0089:
            r4.scrollDone = r0
        L_0x008b:
            if (r1 != 0) goto L_0x0048
            if (r11 == 0) goto L_0x0048
        L_0x008f:
            if (r12 == 0) goto L_0x0094
            r12.a(r5)
        L_0x0094:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.searchbaseframe.meta.uikit.MetaLayout.traverseHeaders(tb.fsi, android.view.View, int, int[], int, boolean, boolean, com.taobao.android.searchbaseframe.meta.uikit.MetaLayout$e):int");
    }

    private void updateFirstHeaderMargin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d618b29", new Object[]{this});
            return;
        }
        for (ytc ytcVar : this.originHeaders) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ytcVar.getView().getLayoutParams();
            if (layoutParams.topMargin != 0) {
                ytcVar.getView().requestLayout();
            }
            layoutParams.topMargin = 0;
        }
        if (this.originHeaders.size() > 0 && !this.hasImmersiveHeader) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.originHeaders.get(0).getView().getLayoutParams();
            if (layoutParams2.topMargin != this.listStart) {
                this.originHeaders.get(0).getView().requestLayout();
            }
            layoutParams2.topMargin = this.listStart;
        }
    }

    public void addHeader(ytc ytcVar) {
        ytc ytcVar2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86d92e2", new Object[]{this, ytcVar});
            return;
        }
        this.originHeaders.add(ytcVar);
        if (this.originHeaders.size() == 1) {
            if (!this.hasImmersiveHeader && !ytcVar.p()) {
                z = false;
            }
            this.hasImmersiveHeader = z;
            if (ytcVar.p()) {
                ytcVar2 = ytcVar;
            } else {
                ytcVar2 = null;
            }
            this.immersiveHeader = ytcVar2;
        } else if (ytcVar.p()) {
            throw new RuntimeException("Only first header can be immersive");
        }
        ytcVar.g(this);
        if (ytcVar.d()) {
            this.scrollStateNodes.add(ytcVar);
        }
    }

    public void addListContainer(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d82049", new Object[]{this, view});
            return;
        }
        this.listContainer = view;
        this.touchHelper = new rsi(getContext(), this);
    }

    public void addTouchListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf82a09", new Object[]{this, onTouchListener});
        } else {
            this.outerListeners.add(onTouchListener);
        }
    }

    public int calculateDyToMakeListTotalVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97bcf26a", new Object[]{this})).intValue();
        }
        return getCurrentHeaderHeight();
    }

    public void clearHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b832b080", new Object[]{this});
        } else {
            clearHeaders(false);
        }
    }

    public void commit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
        } else {
            commit(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        ytc ytcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        int i = this.listStart + this.headerOffset;
        boolean z = this.hasImmersiveHeader;
        if (!z && i > 0 && this.layoutType != 1) {
            canvas.clipRect(0, i, getWidth(), getHeight());
        } else if (z && (ytcVar = this.immersiveHeader) != null) {
            View view = ytcVar.getView();
            if (((int) ((view.getBottom() + view.getTranslationY()) - this.immersiveHeader.f())) <= i) {
                canvas.clipRect(0, i, getWidth(), getHeight());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            this.startTouch = false;
            resetListPosition();
        } else if (motionEvent.getActionMasked() == 0) {
            this.startTouch = true;
            Animator animator = this.overScrollAnim;
            if (animator != null) {
                animator.cancel();
                this.overScrollAnim = null;
            }
        }
        notifyOuterTouchListener(motionEvent);
        if (this.waitForLayoutDone) {
            return false;
        }
        cancelScroll();
        if (!this.scrollable) {
            return super.dispatchTouchEvent(motionEvent);
        }
        rsi rsiVar = this.touchHelper;
        if (rsiVar != null) {
            rsiVar.a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void fold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116da808", new Object[]{this});
            return;
        }
        nestedScrollInternal(Integer.MAX_VALUE, true, 2);
        resetScrollNode();
    }

    public int getCurrentHeaderHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1ae33f1", new Object[]{this})).intValue();
        }
        return this.currentHeight;
    }

    public int getHiddenHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eda7ee1", new Object[]{this})).intValue();
        }
        if (this.layoutType != 0 || this.listContainer == null) {
            return getTotalHeaderHeight() - getCurrentHeaderHeight();
        }
        return getTotalHeaderHeight() - tsi.a(this.listContainer);
    }

    public int getListStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10fc4528", new Object[]{this})).intValue();
        }
        return this.listStart;
    }

    public MetaLayout getParentMetaLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaLayout) ipChange.ipc$dispatch("115623b7", new Object[]{this});
        }
        return this.parentMetaLayout;
    }

    public int getTotalHeaderHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af9dc63c", new Object[]{this})).intValue();
        }
        return this.totalHeight;
    }

    public int getTotalScrollDistance() {
        buc bucVar;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db6b38a", new Object[]{this})).intValue();
        }
        MetaLayout metaLayout = this.parentMetaLayout;
        if (metaLayout != null) {
            i = metaLayout.getHiddenHeight();
        }
        int hiddenHeight = i + getHiddenHeight();
        rsi rsiVar = this.touchHelper;
        if (rsiVar == null || (bucVar = rsiVar.f27585a) == null) {
            return hiddenHeight;
        }
        return hiddenHeight + bucVar.v1();
    }

    public void layoutListFirst() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18be92f", new Object[]{this});
        } else {
            this.layoutListFirst = true;
        }
    }

    public void notifyHeaderScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cda18aa", new Object[]{this});
            return;
        }
        d dVar = this.listener;
        if (dVar != null) {
            ((woz) dVar).a();
        }
        MetaLayout metaLayout = this.parentMetaLayout;
        if (metaLayout != null) {
            metaLayout.notifyHeaderScroll();
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
        ViewParent viewParent = (ViewGroup) getParent();
        while (true) {
            if (!(viewParent instanceof ViewGroup)) {
                break;
            } else if (viewParent instanceof MetaLayout) {
                this.parentMetaLayout = (MetaLayout) viewParent;
                break;
            } else {
                viewParent = viewParent.getParent();
            }
        }
        rebuildScrollHeaders();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.parentMetaLayout = null;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.scrollable) {
            return false;
        }
        rsi rsiVar = this.touchHelper;
        if (rsiVar == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return rsiVar.c(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        updateListTranslation(true);
        this.waitForLayoutDone = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        f fVar;
        int i4;
        int i5;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        int i6 = this.headerHeight;
        this.headerHeight = 0;
        if (this.hasImmersiveHeader) {
            i3 = 0;
        } else {
            i3 = this.listStart;
        }
        for (int i7 = 0; i7 < this.originHeaders.size(); i7++) {
            ytc ytcVar = this.originHeaders.get(i7);
            if (isMatchParentHeader(ytcVar.getView())) {
                if (!ytcVar.p()) {
                    i5 = size - this.listStart;
                } else {
                    i5 = size;
                }
                i4 = View.MeasureSpec.makeMeasureSpec(i5 - this.headerOffset, 1073741824);
            } else {
                i4 = i2;
            }
            if (ytcVar.getView().getVisibility() == 0) {
                measureChild(ytcVar.getView(), i, i4);
            }
            i3 = ((i3 + ytcVar.c()) + ytcVar.getHeight()) - ytcVar.f();
            this.headerHeight += ytcVar.getHeight();
        }
        int max = Math.max(0, size - Math.max(i3, this.listStart)) - this.headerOffset;
        int i8 = this.layoutType;
        if (!(i8 == 1 || i8 == 2)) {
            size = max;
        }
        View view = this.listContainer;
        if (view != null) {
            view.measure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            if (this.listContainer.getMeasuredHeight() != size) {
                z = true;
            }
            this.listChanged = z;
        }
        if (!(i6 == this.headerHeight || (fVar = this.headerChangeListener) == null)) {
            fVar.m();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e04e9d3", new Object[]{this, view, new Float(f2), new Float(f3), new Boolean(z)})).booleanValue();
        }
        try {
            return super.onNestedFling(view, f2, f3, z);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a49f72c0", new Object[]{this, view, new Float(f2), new Float(f3)})).booleanValue();
        }
        if (!canFling()) {
            return true;
        }
        try {
            return super.onNestedPreFling(view, f2, f3);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        boolean z;
        kuc kucVar;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472edc84", new Object[]{this, view, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
        } else if (iArr != null) {
            if (i3 == 0 && !isScrollStart(i3) && (view instanceof RecyclerView)) {
                modifyScrollState((RecyclerView) view);
            }
            if (!isScrollStart(i3)) {
                setFlag(i3, true);
                notifyScrollState(i3, true);
            }
            fsi scrollNode = getScrollNode(i2);
            if (i2 > 0) {
                i4 = traverseHeaders(scrollNode, view, i2, iArr, i3, false, true, this.scrollDownImpl);
            } else if (i2 < 0) {
                i4 = traverseHeaders(scrollNode, view, i2, iArr, i3, true, true, this.scrollUpImpl);
            } else {
                i4 = i2;
            }
            if (i4 != i2) {
                MetaLayout metaLayout = this.parentMetaLayout;
                if (metaLayout != null) {
                    metaLayout.updateListTranslation(false);
                }
                updateListTranslation(false);
                notifyHeaderScroll();
            }
            if (!(i4 != 0 || i2 == 0 || (kucVar = this.scrollListener) == null)) {
                kucVar.b(getTotalScrollDistance());
            }
            if (this.enableOverScroll && i3 == 0) {
                if (i4 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.touchHelper != null) {
                    z2 = true;
                }
                if ((z && z2) && !view.canScrollVertically(1)) {
                    this.touchHelper.b();
                }
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        kuc kucVar;
        int i6 = i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bba3db", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i6), new Integer(i5)});
            return;
        }
        fsi scrollNode = getScrollNode(i6);
        if (i6 < 0) {
            int traverseHeaders = traverseHeaders(scrollNode, null, i4, null, i5, false, true, this.scrollUpImpl);
            if (i6 != traverseHeaders) {
                MetaLayout metaLayout = this.parentMetaLayout;
                if (metaLayout != null) {
                    metaLayout.updateListTranslation(false);
                }
                updateListTranslation(false);
                notifyHeaderScroll();
                return;
            }
            i6 = traverseHeaders;
        }
        kuc kucVar2 = this.scrollListener;
        if (kucVar2 != null) {
            kucVar2.b(getTotalScrollDistance());
        }
        if ((view instanceof RecyclerView) && i2 == 0) {
            ((RecyclerView) view).stopScroll();
        }
        if (i2 != 0) {
            if (!(this.overScrollY == 0 || (kucVar = this.scrollListener) == null)) {
                kucVar.c(0);
            }
            this.overScrollY = 0;
        } else if (i6 != 0 && i5 == 0) {
            int i7 = this.overScrollY + i6;
            this.overScrollY = i7;
            kuc kucVar3 = this.scrollListener;
            if (kucVar3 != null) {
                kucVar3.c(i7);
            }
        }
        if (this.enableOverScroll && i6 > 0 && i5 == 0 && this.startTouch) {
            rsi rsiVar = this.touchHelper;
            if (rsiVar != null) {
                rsiVar.b();
            }
            View view2 = this.listView;
            view2.setTranslationY(Math.max(view2.getTranslationY() - i6, -this.overScrollListener.e0()));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da61a091", new Object[]{this, view, view2, new Integer(i), new Integer(i2)});
        } else if (i2 == 0) {
            this.overScrollY = 0;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3643ce32", new Object[]{this, view, view2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i != 2 || !this.scrollable) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf68c3d", new Object[]{this, view, new Integer(i)});
        } else if (isScrollStart(i)) {
            notifyScrollState(i, false);
            setFlag(i, false);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        rsi rsiVar = this.touchHelper;
        if (rsiVar == null) {
            return false;
        }
        return rsiVar.d(motionEvent);
    }

    public void rebuildScrollHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c26a925", new Object[]{this});
            return;
        }
        this.scrollUpHeaders.b();
        this.scrollDownHeaders.b();
        this.parentHeaders.clear();
        for (ytc ytcVar : this.originHeaders) {
            this.scrollUpHeaders.a(ytcVar, ytcVar.getPriority().b);
            this.scrollDownHeaders.a(ytcVar, ytcVar.getPriority().c);
        }
        MetaLayout metaLayout = this.parentMetaLayout;
        if (metaLayout != null) {
            for (ytc ytcVar2 : metaLayout.originHeaders) {
                this.scrollUpHeaders.a(ytcVar2, ytcVar2.getPriority().b);
                this.scrollDownHeaders.a(ytcVar2, ytcVar2.getPriority().c);
                this.parentHeaders.add(ytcVar2);
            }
        }
        this.scrollUpHeaders.e();
        this.scrollDownHeaders.e();
        buildScrollNode(true, this.scrollDownHeaders);
        buildScrollNode(false, this.scrollUpHeaders);
        this.scrollUpCurrentNode = null;
        this.scrollDownCurrentNode = null;
        this.scrollDone = false;
    }

    public void removeTouchListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79db8e6c", new Object[]{this, onTouchListener});
        } else {
            this.outerListeners.remove(onTouchListener);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
            return;
        }
        ViewParent parent = getParent();
        if (parent == null || !parent.isLayoutRequested() || !isLayoutRequested()) {
            super.requestLayout();
            return;
        }
        while (parent != null) {
            if (!parent.isLayoutRequested()) {
                parent.requestLayout();
                return;
            }
            parent = parent.getParent();
        }
    }

    public void resetScrollNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2182a5", new Object[]{this});
            return;
        }
        this.scrollUpCurrentNode = null;
        this.scrollDownCurrentNode = null;
        this.scrollDone = false;
    }

    public int scrollBy(int i) {
        kuc kucVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c8d71cb", new Object[]{this, new Integer(i)})).intValue();
        }
        this.scrollDone = false;
        int[] iArr = new int[2];
        int traverseHeaders = traverseHeaders(getScrollNode(i), null, i, iArr, 0, false, true, null);
        if (traverseHeaders != i) {
            updateListTranslation(false);
            notifyHeaderScroll();
            if (traverseHeaders == 0 && (kucVar = this.scrollListener) != null) {
                kucVar.b(getTotalScrollDistance());
            }
        }
        this.scrollDone = false;
        return iArr[1];
    }

    public void scrollHeaderToTop(ytc ytcVar, boolean z, frk frkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eee3bab", new Object[]{this, ytcVar, new Boolean(z), frkVar});
        } else {
            scrollHeaderToTop(ytcVar, z, frkVar, 0);
        }
    }

    public void setCanFling(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d311a5ff", new Object[]{this, new Boolean(z)});
        } else {
            setFlag(2, z);
        }
    }

    public void setCurrentList(buc bucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c092ced", new Object[]{this, bucVar});
            return;
        }
        this.listView = bucVar.getView();
        rsi rsiVar = this.touchHelper;
        if (rsiVar != null) {
            rsiVar.e(bucVar);
            this.touchHelper.f(this.overScrollListener);
        }
    }

    public void setHeaderChangeListener(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("654a240b", new Object[]{this, fVar});
        } else {
            this.headerChangeListener = fVar;
        }
    }

    public void setHeaderOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c912d9a", new Object[]{this, new Integer(i)});
        } else if (this.headerOffset != i) {
            this.headerOffset = i;
            updateListTranslation(false);
        }
    }

    public void setLayoutType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc25e396", new Object[]{this, new Integer(i)});
        } else {
            this.layoutType = i;
        }
    }

    public void setListStart(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6833c7a", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.listStart;
        this.listStart = i;
        if (!this.listStartSet) {
            this.listStartSet = true;
        } else if (i2 != i) {
            onListStartChange();
        }
    }

    public void setOnHeaderScrollListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e357485a", new Object[]{this, dVar});
        } else {
            this.listener = dVar;
        }
    }

    public void setOverScrollListener(guc gucVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("444846f7", new Object[]{this, gucVar});
            return;
        }
        this.overScrollListener = gucVar;
        if (gucVar == null) {
            z = false;
        }
        this.enableOverScroll = z;
        rsi rsiVar = this.touchHelper;
        if (rsiVar != null) {
            rsiVar.f(gucVar);
        }
    }

    public void setScrollListener(kuc kucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e7e791", new Object[]{this, kucVar});
        } else {
            this.scrollListener = kucVar;
        }
    }

    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
        } else {
            this.scrollable = z;
        }
    }

    public void setUseHiddenHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa6cf5d", new Object[]{this});
        } else {
            this.touchHelper.g();
        }
    }

    public void unfold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c660da1", new Object[]{this});
            return;
        }
        nestedScrollInternal(-2147483647, true, 2);
        resetScrollNode();
    }

    public void updateHeaderOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9790e4f0", new Object[]{this});
            return;
        }
        nestedScrollInternal(0, false);
        resetScrollNode();
    }

    public void updateListTranslation(boolean z) {
        View view;
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c2fa43", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.layoutListFirst && (view2 = this.listContainer) != null && (z || this.listChanged)) {
            view2.layout(0, 0, view2.getMeasuredWidth(), this.listContainer.getMeasuredHeight());
            this.listChanged = false;
        }
        int max = Math.max(adjustHeaders(z), this.listStart) + this.headerOffset;
        if (this.layoutType == 1) {
            max = 0;
        }
        if (!this.layoutListFirst && (view = this.listContainer) != null && (z || this.listChanged)) {
            view.layout(0, 0, view.getMeasuredWidth(), this.listContainer.getMeasuredHeight());
            this.listChanged = false;
        }
        View view3 = this.listContainer;
        if (view3 != null && tsi.a(view3) != max) {
            tsi.c(this.listContainer, max);
            if (!z) {
                this.listContainer.requestLayout();
            }
        }
    }

    public MetaLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.scrollUpImpl = new a();
        this.scrollDownImpl = new b();
        this.listStartSet = false;
        this.layoutListFirst = false;
        this.overScrollAnim = null;
        this.enableOverScroll = false;
        this.startTouch = false;
        this.originHeaders = new ArrayList();
        this.parentHeaders = new HashSet();
        this.scrollUpHeaders = new c();
        this.scrollDownHeaders = new c();
        this.scrollUpCurrentNode = null;
        this.scrollUpHeadNode = null;
        this.scrollDone = false;
        this.scrollDownCurrentNode = null;
        this.scrollDownHeadNode = null;
        this.scrollStateNodes = new ArrayList(1);
        this.listChanged = false;
        this.layoutType = 0;
        this.scrollable = true;
        this.totalHeight = 0;
        this.currentHeight = 0;
        this.waitForLayoutDone = false;
        this.outerListeners = new HashSet();
        setCanFling(true);
        setWillNotDraw(true);
    }

    private int nestedScrollInternal(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44bf8a5d", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)})).intValue();
        }
        this.scrollDone = false;
        int traverseHeaders = traverseHeaders(this.scrollUpHeadNode, null, i, null, i2, false, z, null);
        if (i != traverseHeaders) {
            MetaLayout metaLayout = this.parentMetaLayout;
            if (metaLayout != null) {
                metaLayout.updateListTranslation(false);
            }
            updateListTranslation(false);
            notifyHeaderScroll();
        }
        return traverseHeaders;
    }

    public void clearHeaders(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e241254", new Object[]{this, new Boolean(z)});
            return;
        }
        this.originHeaders.clear();
        this.scrollStateNodes.clear();
        this.hasImmersiveHeader = false;
        this.immersiveHeader = null;
        commit(z);
    }

    public void commit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5748c056", new Object[]{this, new Boolean(z)});
            return;
        }
        this.waitForLayoutDone = true;
        setCanFling(true);
        if (z) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                if (childAt != this.listContainer) {
                    removeView(childAt);
                }
            }
        } else {
            removeAllViews();
        }
        c cVar = new c();
        for (ytc ytcVar : this.originHeaders) {
            cVar.a(ytcVar, ytcVar.getPriority().f33066a);
        }
        cVar.e();
        rebuildScrollHeaders();
        for (int i = 0; i < cVar.d(); i++) {
            List<ytc> f2 = cVar.f(i);
            if (f2 != null) {
                for (ytc ytcVar2 : f2) {
                    ytcVar2.getView().setTag(HEADER_KEY, ytcVar2);
                    clearViewParent(ytcVar2.getView());
                    if (ytcVar2.getView().getLayoutParams() != null) {
                        addView(ytcVar2.getView());
                    } else {
                        addView(ytcVar2.getView(), new FrameLayout.LayoutParams(-1, -2));
                    }
                }
            }
        }
        updateFirstHeaderMargin();
        if (!z || this.listContainer.getParent() != this) {
            clearViewParent(this.listContainer);
            if (this.layoutType == 1) {
                addView(this.listContainer, 0, new FrameLayout.LayoutParams(-1, -1));
            } else {
                addView(this.listContainer, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    public void scrollHeaderToTop(ytc ytcVar, boolean z, frk frkVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed9acb8", new Object[]{this, ytcVar, new Boolean(z), frkVar, new Integer(i)});
            return;
        }
        cancelScroll();
        if (ytcVar.getView().getLayoutParams() instanceof FrameLayout.LayoutParams) {
            int a2 = tsi.a(ytcVar.getView()) + ((FrameLayout.LayoutParams) ytcVar.getView().getLayoutParams()).topMargin;
            int i2 = this.listStart + this.headerOffset + i;
            if (a2 == i2) {
                notifyScrollListener(frkVar);
                return;
            }
            resetScrollNode();
            bva bvaVar = new bva(a2 - i2, z, frkVar, this);
            this.headerScroller = bvaVar;
            bvaVar.i();
            return;
        }
        notifyScrollListener(frkVar);
    }
}
