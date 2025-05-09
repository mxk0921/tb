package com.alibaba.android.ultron.ext.vlayout;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import tb.bcl;
import tb.gfl;
import tb.pg1;
import tb.t2o;
import tb.vig;
import tb.wv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ExposeLinearLayoutManagerEx extends LinearLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLAG_INVALID = 4;
    public static final int FLAG_UPDATED = 2;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    public static final int VERTICAL = 1;
    public static Field p = null;
    public static Method q = null;

    /* renamed from: a  reason: collision with root package name */
    public c f2284a;
    public gfl b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public Bundle g;
    public final a h;
    public final b i;
    public final Method j;
    public int k;
    public wv l;
    public RecyclerView m;
    public final Object[] n;
    public final vig o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f2285a;
        public int b;
        public boolean c;

        static {
            t2o.a(156237939);
        }

        public a() {
        }

        public void a() {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8efd6f47", new Object[]{this});
                return;
            }
            if (this.c) {
                i = ExposeLinearLayoutManagerEx.y(ExposeLinearLayoutManagerEx.this).i();
            } else {
                i = ExposeLinearLayoutManagerEx.y(ExposeLinearLayoutManagerEx.this).k();
            }
            this.b = i;
        }

        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5abcbad", new Object[]{this, view});
                return;
            }
            if (this.c) {
                this.b = ExposeLinearLayoutManagerEx.y(ExposeLinearLayoutManagerEx.this).d(view) + ExposeLinearLayoutManagerEx.this.C(view, this.c, true) + ExposeLinearLayoutManagerEx.y(ExposeLinearLayoutManagerEx.this).m();
            } else {
                this.b = ExposeLinearLayoutManagerEx.y(ExposeLinearLayoutManagerEx.this).g(view) + ExposeLinearLayoutManagerEx.this.C(view, this.c, true);
            }
            this.f2285a = ExposeLinearLayoutManagerEx.this.getPosition(view);
        }

        public boolean c(View view, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("48d0f444", new Object[]{this, view, state})).booleanValue();
            }
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (layoutParams.isItemRemoved() || layoutParams.getViewPosition() < 0 || layoutParams.getViewPosition() >= state.getItemCount()) {
                return false;
            }
            b(view);
            return true;
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            this.f2285a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "AnchorInfo{mPosition=" + this.f2285a + ", mCoordinate=" + this.b + ", mLayoutFromEnd=" + this.c + '}';
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int INVALID_LAYOUT = Integer.MIN_VALUE;
        public static final int ITEM_DIRECTION_HEAD = -1;
        public static final int ITEM_DIRECTION_TAIL = 1;
        public static final int LAYOUT_END = 1;
        public static final int LAYOUT_START = -1;
        public static final int SCOLLING_OFFSET_NaN = Integer.MIN_VALUE;
        public static final String TAG = "_ExposeLLayoutManager#LayoutState";

        /* renamed from: a  reason: collision with root package name */
        public final Method f2287a;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public boolean b = false;
        public boolean c = true;
        public int j = 0;
        public boolean k = false;
        public List<RecyclerView.ViewHolder> l = null;

        static {
            t2o.a(156237941);
        }

        public c() {
            this.f2287a = null;
            try {
                Method declaredMethod = RecyclerView.ViewHolder.class.getDeclaredMethod("isRemoved", new Class[0]);
                this.f2287a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }

        public boolean a(RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8c25e7f8", new Object[]{this, state})).booleanValue();
            }
            int i = this.f;
            if (i < 0 || i >= state.getItemCount()) {
                return false;
            }
            return true;
        }

        public View b(RecyclerView.Recycler recycler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("57332bd2", new Object[]{this, recycler});
            }
            if (this.l != null) {
                return c();
            }
            View viewForPosition = recycler.getViewForPosition(this.f);
            this.f += this.g;
            return viewForPosition;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0055 A[EDGE_INSN: B:29:0x0055->B:22:0x0055 ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0052 A[ADDED_TO_REGION, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final android.view.View c() {
            /*
                r9 = this;
                java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r9.l
                int r0 = r0.size()
                r1 = 0
                r2 = 2147483647(0x7fffffff, float:NaN)
                r3 = 0
                r5 = r1
                r4 = 0
            L_0x000d:
                if (r4 >= r0) goto L_0x0055
                java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r6 = r9.l
                java.lang.Object r6 = r6.get(r4)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r6 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r6
                boolean r7 = r9.k
                if (r7 != 0) goto L_0x003d
                java.lang.reflect.Method r7 = r9.f2287a     // Catch: InvocationTargetException -> 0x002a, IllegalAccessException -> 0x002c
                java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch: InvocationTargetException -> 0x002a, IllegalAccessException -> 0x002c
                java.lang.Object r7 = r7.invoke(r6, r8)     // Catch: InvocationTargetException -> 0x002a, IllegalAccessException -> 0x002c
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: InvocationTargetException -> 0x002a, IllegalAccessException -> 0x002c
                boolean r7 = r7.booleanValue()     // Catch: InvocationTargetException -> 0x002a, IllegalAccessException -> 0x002c
                goto L_0x0036
            L_0x002a:
                r7 = move-exception
                goto L_0x002e
            L_0x002c:
                r7 = move-exception
                goto L_0x0032
            L_0x002e:
                r7.printStackTrace()
                goto L_0x0035
            L_0x0032:
                r7.printStackTrace()
            L_0x0035:
                r7 = 0
            L_0x0036:
                boolean r8 = r9.k
                if (r8 != 0) goto L_0x003d
                if (r7 == 0) goto L_0x003d
                goto L_0x0052
            L_0x003d:
                int r7 = r6.getPosition()
                int r8 = r9.f
                int r7 = r7 - r8
                int r8 = r9.g
                int r7 = r7 * r8
                if (r7 >= 0) goto L_0x004b
                goto L_0x0052
            L_0x004b:
                if (r7 >= r2) goto L_0x0052
                r5 = r6
                if (r7 != 0) goto L_0x0051
                goto L_0x0055
            L_0x0051:
                r2 = r7
            L_0x0052:
                int r4 = r4 + 1
                goto L_0x000d
            L_0x0055:
                if (r5 == 0) goto L_0x0063
                int r0 = r5.getPosition()
                int r1 = r9.g
                int r0 = r0 + r1
                r9.f = r0
                android.view.View r0 = r5.itemView
                return r0
            L_0x0063:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.ext.vlayout.ExposeLinearLayoutManagerEx.c.c():android.view.View");
        }
    }

    static {
        t2o.a(156237938);
    }

    public ExposeLinearLayoutManagerEx(Context context) {
        this(context, 1, false);
    }

    public static boolean L(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb3719af", new Object[]{viewHolder})).booleanValue();
        }
        return new d(viewHolder).d();
    }

    public static /* synthetic */ Object ipc$super(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1602403907:
                super.assertNotInLayoutOrScroll((String) objArr[0]);
                return null;
            case -1447122930:
                super.setOrientation(((Number) objArr[0]).intValue());
                return null;
            case -1227808903:
                return new Integer(super.findLastVisibleItemPosition());
            case 69461489:
                return new Integer(super.findFirstVisibleItemPosition());
            case 1050392251:
                super.onDetachedFromWindow((RecyclerView) objArr[0], (RecyclerView.Recycler) objArr[1]);
                return null;
            case 1242672066:
                super.onAttachedToWindow((RecyclerView) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/ExposeLinearLayoutManagerEx");
        }
    }

    public static /* synthetic */ gfl y(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfl) ipChange.ipc$dispatch("6913e5b", new Object[]{exposeLinearLayoutManagerEx});
        }
        return exposeLinearLayoutManagerEx.b;
    }

    public static /* synthetic */ RecyclerView z(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("f48a7db8", new Object[]{exposeLinearLayoutManagerEx});
        }
        return exposeLinearLayoutManagerEx.m;
    }

    public void A(View view, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3326639", new Object[]{this, view, new Boolean(z)});
            return;
        }
        if (!z) {
            i = -1;
        }
        addView(view, i);
        this.i.b(view);
    }

    public int C(View view, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b47107d", new Object[]{this, view, new Boolean(z), new Boolean(z2)})).intValue();
        }
        return 0;
    }

    public final int D(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24d8216b", new Object[]{this, new Integer(i)})).intValue();
        }
        int orientation = getOrientation();
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130 && orientation == 1) {
                        return 1;
                    }
                    return Integer.MIN_VALUE;
                } else if (orientation == 0) {
                    return 1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (orientation == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (orientation == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public void E() {
        if (this.f2284a == null) {
            this.f2284a = new c();
        }
        if (this.b == null) {
            this.b = gfl.b(this, getOrientation());
        }
        try {
            this.j.invoke(this, this.n);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
        }
    }

    public int F(RecyclerView.Recycler recycler, c cVar, RecyclerView.State state, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c80a253", new Object[]{this, recycler, cVar, state, new Boolean(z)})).intValue();
        }
        int i = cVar.e;
        int i2 = cVar.i;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.i = i2 + i;
            }
            U(recycler, cVar);
        }
        int i3 = cVar.e + cVar.j + this.k;
        while (i3 > 0 && cVar.a(state)) {
            this.o.a();
            M(recycler, state, cVar, this.o);
            vig vigVar = this.o;
            if (!vigVar.b) {
                cVar.d += vigVar.f30032a * cVar.h;
                if (!vigVar.c || this.f2284a.l != null || !state.isPreLayout()) {
                    int i4 = cVar.e;
                    int i5 = this.o.f30032a;
                    cVar.e = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.i;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + this.o.f30032a;
                    cVar.i = i7;
                    int i8 = cVar.e;
                    if (i8 < 0) {
                        cVar.i = i7 + i8;
                    }
                    U(recycler, cVar);
                }
                if (z && this.o.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.e;
    }

    public final View G(int i, int i2, int i3) {
        int i4 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("25744857", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        E();
        int k = this.b.k();
        int i5 = this.b.i();
        if (i2 <= i) {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.b.g(childAt) < i5 && this.b.d(childAt) >= k) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    public final int H(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d10d6c91", new Object[]{this, new Integer(i), recycler, state, new Boolean(z)})).intValue();
        }
        int i3 = this.b.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -Y(-i3, recycler, state);
        int i5 = i + i4;
        if (!z || (i2 = this.b.i() - i5) <= 0) {
            return i4;
        }
        this.b.n(i2);
        return i2 + i4;
    }

    public final int I(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("351e3658", new Object[]{this, new Integer(i), recycler, state, new Boolean(z)})).intValue();
        }
        int k2 = i - this.b.k();
        if (k2 <= 0) {
            return 0;
        }
        int i2 = -Y(k2, recycler, state);
        int i3 = i + i2;
        if (!z || (k = i3 - this.b.k()) <= 0) {
            return i2;
        }
        this.b.n(-k);
        return i2 - k;
    }

    public final View J() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8954847a", new Object[]{this});
        }
        if (!this.d) {
            i = getChildCount() - 1;
        }
        return getChildAt(i);
    }

    public final View K() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d5727b01", new Object[]{this});
        }
        if (this.d) {
            i = getChildCount() - 1;
        }
        return getChildAt(i);
    }

    public void M(RecyclerView.Recycler recycler, RecyclerView.State state, c cVar, vig vigVar) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58008b8f", new Object[]{this, recycler, state, cVar, vigVar});
            return;
        }
        View b2 = cVar.b(recycler);
        if (b2 == null) {
            vigVar.b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) b2.getLayoutParams();
        if (cVar.l == null) {
            boolean z3 = this.d;
            if (cVar.h == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                addView(b2);
            } else {
                addView(b2, 0);
            }
        } else {
            boolean z4 = this.d;
            if (cVar.h == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                addDisappearingView(b2);
            } else {
                addDisappearingView(b2, 0);
            }
        }
        measureChildWithMargins(b2, 0, 0);
        vigVar.f30032a = this.b.e(b2);
        if (getOrientation() == 1) {
            if (isLayoutRTL()) {
                i4 = getWidth() - getPaddingRight();
                i2 = i4 - this.b.f(b2);
            } else {
                i2 = getPaddingLeft();
                i4 = this.b.f(b2) + i2;
            }
            if (cVar.h == -1) {
                i3 = cVar.d;
                i = i3 - vigVar.f30032a;
            } else {
                i = cVar.d;
                i3 = vigVar.f30032a + i;
            }
        } else {
            int paddingTop = getPaddingTop();
            int f = this.b.f(b2) + paddingTop;
            if (cVar.h == -1) {
                int i5 = cVar.d;
                int i6 = i5 - vigVar.f30032a;
                i = paddingTop;
                i4 = i5;
                i3 = f;
                i2 = i6;
            } else {
                int i7 = cVar.d;
                i = paddingTop;
                i4 = vigVar.f30032a + i7;
                i2 = i7;
                i3 = f;
            }
        }
        layoutDecorated(b2, i2 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, i4 - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i3 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            vigVar.c = true;
        }
        vigVar.d = b2.isFocusable();
    }

    public final void N(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
        int i3;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f0dd9c", new Object[]{this, recycler, state, new Integer(i), new Integer(i2)});
        } else if (state.willRunPredictiveAnimations() && getChildCount() != 0 && !state.isPreLayout() && supportsPredictiveItemAnimations()) {
            List<RecyclerView.ViewHolder> scrapList = recycler.getScrapList();
            int size = scrapList.size();
            int position = getPosition(getChildAt(0));
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                RecyclerView.ViewHolder viewHolder = scrapList.get(i6);
                if (viewHolder.getPosition() < position) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != this.d) {
                    i4 += this.b.e(viewHolder.itemView);
                } else {
                    i5 += this.b.e(viewHolder.itemView);
                }
            }
            this.f2284a.l = scrapList;
            int i7 = -1;
            if (i4 > 0) {
                h0(getPosition(K()), i);
                c cVar = this.f2284a;
                cVar.j = i4;
                cVar.e = 0;
                int i8 = cVar.f;
                if (this.d) {
                    i3 = 1;
                } else {
                    i3 = -1;
                }
                cVar.f = i8 + i3;
                cVar.b = true;
                F(recycler, cVar, state, false);
            }
            if (i5 > 0) {
                f0(getPosition(J()), i2);
                c cVar2 = this.f2284a;
                cVar2.j = i5;
                cVar2.e = 0;
                int i9 = cVar2.f;
                if (!this.d) {
                    i7 = 1;
                }
                cVar2.f = i9 + i7;
                cVar2.b = true;
                F(recycler, cVar2, state, false);
            }
            this.f2284a.l = null;
        }
    }

    public final View O(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("19345b82", new Object[]{this, new Integer(i)});
        }
        return G(0, getChildCount(), i);
    }

    public final View P(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b4e3f2", new Object[]{this, new Integer(i)});
        }
        return G(getChildCount() - 1, -1, i);
    }

    public final View Q(RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6f82a668", new Object[]{this, state});
        }
        boolean z = this.d;
        int itemCount = state.getItemCount();
        if (z) {
            return O(itemCount);
        }
        return P(itemCount);
    }

    public final View R(RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93594581", new Object[]{this, state});
        }
        boolean z = this.d;
        int itemCount = state.getItemCount();
        if (z) {
            return P(itemCount);
        }
        return O(itemCount);
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("308abcac", new Object[]{this});
        } else if (getOrientation() == 1 || !isLayoutRTL()) {
            this.d = getReverseLayout();
        } else {
            this.d = true ^ getReverseLayout();
        }
    }

    public void T(RecyclerView.State state, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eae423c", new Object[]{this, state, aVar});
        }
    }

    public final void U(RecyclerView.Recycler recycler, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdac94", new Object[]{this, recycler, cVar});
        } else if (cVar.c) {
            if (cVar.h == -1) {
                V(recycler, cVar.i);
            } else {
                W(recycler, cVar.i);
            }
        }
    }

    public final void V(RecyclerView.Recycler recycler, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c410b62c", new Object[]{this, recycler, new Integer(i)});
            return;
        }
        int childCount = getChildCount();
        if (i >= 0) {
            int h = this.b.h() - i;
            if (this.d) {
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (this.b.g(getChildAt(i2)) - this.k < h) {
                        recycleChildren(recycler, 0, i2);
                        return;
                    }
                }
                return;
            }
            int i3 = childCount - 1;
            for (int i4 = i3; i4 >= 0; i4--) {
                if (this.b.g(getChildAt(i4)) - this.k < h) {
                    recycleChildren(recycler, i3, i4);
                    return;
                }
            }
        }
    }

    public final void W(RecyclerView.Recycler recycler, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb40885", new Object[]{this, recycler, new Integer(i)});
        } else if (i >= 0) {
            int childCount = getChildCount();
            if (this.d) {
                int i2 = childCount - 1;
                for (int i3 = i2; i3 >= 0; i3--) {
                    if (this.b.d(getChildAt(i3)) + this.k > i) {
                        recycleChildren(recycler, i2, i3);
                        return;
                    }
                }
                return;
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                if (this.b.d(getChildAt(i4)) + this.k > i) {
                    recycleChildren(recycler, 0, i4);
                    return;
                }
            }
        }
    }

    public final void X(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce8be92", new Object[]{this, new Boolean(z)});
            return;
        }
        UnifyLog.e("ExposeLLManagerEx", "findLastVisibleItemPosition exception,,itemCount=" + getItemCount() + ",childCount=" + getChildCount() + ",crashWhenFindLastVisibleItem" + z);
    }

    public int Y(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2559c2ec", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        this.f2284a.c = true;
        E();
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        e0(i2, abs, true, state);
        c cVar = this.f2284a;
        int i3 = cVar.i;
        cVar.b = false;
        int F = i3 + F(recycler, cVar, state, false);
        if (F < 0) {
            return 0;
        }
        if (abs > F) {
            i = i2 * F;
        }
        this.b.n(-i);
        return i;
    }

    public void Z(wv wvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1aedf9c", new Object[]{this, wvVar});
        } else {
            this.l = wvVar;
        }
    }

    public void a0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6867ce18", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a07d41bd", new Object[]{this, str});
        } else if (this.g == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed177369", new Object[]{this, view});
        } else {
            this.i.c(view);
        }
    }

    public final boolean b0(RecyclerView.State state, a aVar) {
        View view;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c01dde1c", new Object[]{this, state, aVar})).booleanValue();
        }
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && aVar.c(focusedChild, state)) {
            return true;
        }
        if (this.c != getStackFromEnd()) {
            return false;
        }
        if (aVar.c) {
            view = Q(state);
        } else {
            view = R(state);
        }
        if (view == null) {
            return false;
        }
        aVar.b(view);
        if (!state.isPreLayout() && supportsPredictiveItemAnimations() && (this.b.g(view) >= this.b.i() || this.b.d(view) < this.b.k())) {
            if (aVar.c) {
                i = this.b.i();
            } else {
                i = this.b.k();
            }
            aVar.b = i;
        }
        return true;
    }

    public final boolean c0(RecyclerView.State state, a aVar) {
        int i;
        boolean z;
        int i2;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e0dcaee", new Object[]{this, state, aVar})).booleanValue();
        }
        if (!state.isPreLayout() && (i = this.e) != -1) {
            if (i < 0 || i >= state.getItemCount()) {
                this.e = -1;
                this.f = Integer.MIN_VALUE;
            } else {
                aVar.f2285a = this.e;
                Bundle bundle = this.g;
                if (bundle != null && bundle.getInt("AnchorPosition") >= 0) {
                    boolean z3 = this.g.getBoolean("AnchorLayoutFromEnd");
                    aVar.c = z3;
                    if (z3) {
                        aVar.b = this.b.i() - this.g.getInt("AnchorOffset");
                    } else {
                        aVar.b = this.b.k() + this.g.getInt("AnchorOffset");
                    }
                    return true;
                } else if (this.f == Integer.MIN_VALUE) {
                    View findViewByPosition = findViewByPosition(this.e);
                    if (findViewByPosition == null) {
                        if (getChildCount() > 0) {
                            if (this.e < getPosition(getChildAt(0))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z == this.d) {
                                z2 = true;
                            }
                            aVar.c = z2;
                        }
                        aVar.a();
                    } else if (this.b.e(findViewByPosition) > this.b.l()) {
                        aVar.a();
                        return true;
                    } else if (this.b.g(findViewByPosition) - this.b.k() < 0) {
                        aVar.b = this.b.k();
                        aVar.c = false;
                        return true;
                    } else if (this.b.i() - this.b.d(findViewByPosition) < 0) {
                        aVar.b = this.b.i();
                        aVar.c = true;
                        return true;
                    } else {
                        if (aVar.c) {
                            i2 = this.b.d(findViewByPosition) + this.b.m();
                        } else {
                            i2 = this.b.g(findViewByPosition);
                        }
                        aVar.b = i2;
                    }
                    return true;
                } else {
                    boolean z4 = this.d;
                    aVar.c = z4;
                    if (z4) {
                        aVar.b = this.b.i() - this.f;
                    } else {
                        aVar.b = this.b.k() + this.f;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i) {
        int i2 = 1;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("d3d13928", new Object[]{this, new Integer(i)});
        }
        if (getChildCount() == 0) {
            return null;
        }
        if (i < getPosition(getChildAt(0))) {
            z = true;
        }
        if (z != this.d) {
            i2 = -1;
        }
        if (getOrientation() == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    public final void d0(RecyclerView.State state, a aVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef15ce58", new Object[]{this, state, aVar});
        } else if (!c0(state, aVar) && !b0(state, aVar)) {
            aVar.a();
            if (getStackFromEnd()) {
                i = state.getItemCount() - 1;
            }
            aVar.f2285a = i;
        }
    }

    public void e0(int i, int i2, boolean z, RecyclerView.State state) {
        int i3;
        int i4 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89dd38bf", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z), state});
            return;
        }
        this.f2284a.j = getExtraLayoutSpace(state);
        c cVar = this.f2284a;
        cVar.h = i;
        int i5 = -1;
        if (i == 1) {
            cVar.j += this.b.j();
            View J = J();
            c cVar2 = this.f2284a;
            if (!this.d) {
                i5 = 1;
            }
            cVar2.g = i5;
            int position = getPosition(J);
            c cVar3 = this.f2284a;
            cVar2.f = position + cVar3.g;
            cVar3.d = this.b.d(J) + C(J, true, false);
            i3 = this.f2284a.d - this.b.i();
        } else {
            View K = K();
            this.f2284a.j += this.b.k();
            c cVar4 = this.f2284a;
            if (!this.d) {
                i4 = -1;
            }
            cVar4.g = i4;
            int position2 = getPosition(K);
            c cVar5 = this.f2284a;
            cVar4.f = position2 + cVar5.g;
            cVar5.d = this.b.g(K) + C(K, false, false);
            i3 = (-this.f2284a.d) + this.b.k();
        }
        c cVar6 = this.f2284a;
        cVar6.e = i2;
        if (z) {
            cVar6.e = i2 - i3;
        }
        cVar6.i = i3;
    }

    public final void f0(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a518a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.f2284a.e = this.b.i() - i2;
        c cVar = this.f2284a;
        if (this.d) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        cVar.g = i3;
        cVar.f = i;
        cVar.h = 1;
        cVar.d = i2;
        cVar.i = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int findFirstVisibleItemPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("423e5f1", new Object[]{this})).intValue();
        }
        E();
        return super.findFirstVisibleItemPosition();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int findLastVisibleItemPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6d11f79", new Object[]{this})).intValue();
        }
        E();
        try {
            return super.findLastVisibleItemPosition();
        } catch (Exception e) {
            boolean a2 = bcl.a();
            X(a2);
            if (!a2) {
                wv wvVar = this.l;
                if (wvVar == null) {
                    return -1;
                }
                wvVar.a(this, e);
                return -1;
            }
            throw e;
        }
    }

    public final void g0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bfd1046", new Object[]{this, aVar});
        } else {
            f0(aVar.f2285a, aVar.b);
        }
    }

    public final void h0(int i, int i2) {
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("998ac191", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.f2284a.e = i2 - this.b.k();
        c cVar = this.f2284a;
        cVar.f = i;
        if (!this.d) {
            i3 = -1;
        }
        cVar.g = i3;
        cVar.h = -1;
        cVar.d = i2;
        cVar.i = Integer.MIN_VALUE;
    }

    public void i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a22e04", new Object[]{this, view});
        } else {
            this.i.b(view);
        }
    }

    public final void i0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3bdb9f", new Object[]{this, aVar});
        } else {
            h0(aVar.f2285a, aVar.b);
        }
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6be35ad7", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a11abc2", new Object[]{this, recyclerView});
            return;
        }
        super.onAttachedToWindow(recyclerView);
        this.m = recyclerView;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9bb6bb", new Object[]{this, recyclerView, recycler});
            return;
        }
        super.onDetachedFromWindow(recyclerView, recycler);
        this.m = null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int D;
        View view2;
        View view3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c1d4fba0", new Object[]{this, view, new Integer(i), recycler, state});
        }
        S();
        if (getChildCount() == 0 || (D = D(i)) == Integer.MIN_VALUE) {
            return null;
        }
        if (D == -1) {
            view2 = R(state);
        } else {
            view2 = Q(state);
        }
        if (view2 == null) {
            return null;
        }
        E();
        e0(D, (int) (this.b.l() * 0.33f), false, state);
        c cVar = this.f2284a;
        cVar.i = Integer.MIN_VALUE;
        cVar.c = false;
        cVar.b = false;
        F(recycler, cVar, state, true);
        if (D == -1) {
            view3 = K();
        } else {
            view3 = J();
        }
        if (view3 == view2 || !view3.isFocusable()) {
            return null;
        }
        return view3;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int H;
        int i6;
        View findViewByPosition;
        int g;
        int i7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d439945", new Object[]{this, recycler, state});
            return;
        }
        Bundle bundle = this.g;
        if (bundle != null && bundle.getInt("AnchorPosition") >= 0) {
            this.e = this.g.getInt("AnchorPosition");
        }
        E();
        this.f2284a.c = false;
        S();
        this.h.d();
        this.h.c = this.d ^ getStackFromEnd();
        d0(state, this.h);
        int extraLayoutSpace = getExtraLayoutSpace(state);
        if (state.getTargetScrollPosition() < this.h.f2285a) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.d) {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        } else {
            i = 0;
        }
        int k = extraLayoutSpace + this.b.k();
        int j = i + this.b.j();
        if (!(!state.isPreLayout() || (i6 = this.e) == -1 || this.f == Integer.MIN_VALUE || (findViewByPosition = findViewByPosition(i6)) == null)) {
            if (this.d) {
                i7 = this.b.i() - this.b.d(findViewByPosition);
                g = this.f;
            } else {
                g = this.b.g(findViewByPosition) - this.b.k();
                i7 = this.f;
            }
            int i8 = i7 - g;
            if (i8 > 0) {
                k += i8;
            } else {
                j -= i8;
            }
        }
        T(state, this.h);
        detachAndScrapAttachedViews(recycler);
        this.f2284a.k = state.isPreLayout();
        this.f2284a.b = true;
        a aVar = this.h;
        if (aVar.c) {
            i0(aVar);
            c cVar = this.f2284a;
            cVar.j = k;
            F(recycler, cVar, state, false);
            c cVar2 = this.f2284a;
            i2 = cVar2.d;
            int i9 = cVar2.e;
            if (i9 > 0) {
                j += i9;
            }
            g0(this.h);
            c cVar3 = this.f2284a;
            cVar3.j = j;
            cVar3.f += cVar3.g;
            F(recycler, cVar3, state, false);
            i3 = this.f2284a.d;
        } else {
            g0(aVar);
            c cVar4 = this.f2284a;
            cVar4.j = j;
            F(recycler, cVar4, state, false);
            c cVar5 = this.f2284a;
            int i10 = cVar5.d;
            int i11 = cVar5.e;
            if (i11 > 0) {
                k += i11;
            }
            i0(this.h);
            c cVar6 = this.f2284a;
            cVar6.j = k;
            cVar6.f += cVar6.g;
            F(recycler, cVar6, state, false);
            i2 = this.f2284a.d;
            i3 = i10;
        }
        if (getChildCount() > 0) {
            if (this.d ^ getStackFromEnd()) {
                int H2 = H(i3, recycler, state, true);
                i4 = i2 + H2;
                i5 = i3 + H2;
                H = I(i4, recycler, state, false);
            } else {
                int I = I(i2, recycler, state, true);
                i4 = i2 + I;
                i5 = i3 + I;
                H = H(i5, recycler, state, false);
            }
            i2 = i4 + H;
            i3 = i5 + H;
        }
        N(recycler, state, i2, i3);
        if (!state.isPreLayout()) {
            this.e = -1;
            this.f = Integer.MIN_VALUE;
            this.b.o();
        }
        this.c = getStackFromEnd();
        this.g = null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
        } else if (parcelable instanceof Bundle) {
            this.g = (Bundle) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        if (this.g != null) {
            return new Bundle(this.g);
        }
        Bundle bundle = new Bundle();
        if (getChildCount() > 0) {
            boolean z = this.c ^ this.d;
            bundle.putBoolean("AnchorLayoutFromEnd", z);
            if (z) {
                View J = J();
                bundle.putInt("AnchorOffset", this.b.i() - this.b.d(J));
                bundle.putInt("AnchorPosition", getPosition(J));
            } else {
                View K = K();
                bundle.putInt("AnchorPosition", getPosition(K));
                bundle.putInt("AnchorOffset", this.b.g(K) - this.b.k());
            }
        } else {
            bundle.putInt("AnchorPosition", -1);
        }
        return bundle;
    }

    public void recycleChildren(RecyclerView.Recycler recycler, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b8abdef", new Object[]{this, recycler, new Integer(i), new Integer(i2)});
        } else if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    removeAndRecycleViewAt(i3, recycler);
                }
                return;
            }
            while (i > i2) {
                removeAndRecycleViewAt(i, recycler);
                i--;
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3806060", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        if (getOrientation() == 1) {
            return 0;
        }
        return Y(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
            return;
        }
        this.e = i;
        this.f = Integer.MIN_VALUE;
        Bundle bundle = this.g;
        if (bundle != null) {
            bundle.putInt("AnchorPosition", -1);
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void scrollToPositionWithOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5c5ef1", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.e = i;
        this.f = i2;
        Bundle bundle = this.g;
        if (bundle != null) {
            bundle.putInt("AnchorPosition", -1);
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7457c372", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        if (getOrientation() == 0) {
            return 0;
        }
        return Y(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bea80e", new Object[]{this, new Integer(i)});
            return;
        }
        super.setOrientation(i);
        this.b = null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4fda0d0", new Object[]{this})).booleanValue();
        }
        if (this.g == null && this.c == getStackFromEnd()) {
            return true;
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Object f2286a;
        public Method b;
        public Field c;
        public Object d;
        public Method e;
        public final Field f;
        public List g;
        public final RecyclerView.LayoutManager h;
        public final Object[] i = new Object[1];

        static {
            t2o.a(156237940);
        }

        public b(RecyclerView.LayoutManager layoutManager) {
            this.h = layoutManager;
            try {
                Field declaredField = RecyclerView.LayoutManager.class.getDeclaredField("mChildHelper");
                this.f = declaredField;
                declaredField.setAccessible(true);
                a();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void b(View view) {
            try {
                a();
                if (this.g.indexOf(view) < 0) {
                    Object[] objArr = this.i;
                    objArr[0] = view;
                    this.b.invoke(this.f2286a, objArr);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void c(View view) {
            Object[] objArr = this.i;
            try {
                a();
                objArr[0] = Integer.valueOf(ExposeLinearLayoutManagerEx.z(ExposeLinearLayoutManagerEx.this).indexOfChild(view));
                this.e.invoke(this.d, objArr);
                List list = this.g;
                if (list != null) {
                    list.remove(view);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void a() {
            try {
                if (this.f2286a == null) {
                    Object obj = this.f.get(this.h);
                    this.f2286a = obj;
                    if (obj != null) {
                        Class<?> cls = obj.getClass();
                        Method declaredMethod = cls.getDeclaredMethod("hide", View.class);
                        this.b = declaredMethod;
                        declaredMethod.setAccessible(true);
                        try {
                            Class<?> cls2 = Integer.TYPE;
                            cls.getDeclaredMethod("findHiddenNonRemovedView", cls2, cls2).setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                            cls.getDeclaredMethod("findHiddenNonRemovedView", Integer.TYPE).setAccessible(true);
                        }
                        cls.getDeclaredMethod("isHidden", View.class).setAccessible(true);
                        Field declaredField = cls.getDeclaredField("mBucket");
                        declaredField.setAccessible(true);
                        Object obj2 = declaredField.get(this.f2286a);
                        this.d = obj2;
                        Method declaredMethod2 = obj2.getClass().getDeclaredMethod(pg1.ATOM_EXT_clear, Integer.TYPE);
                        this.e = declaredMethod2;
                        declaredMethod2.setAccessible(true);
                        Field declaredField2 = cls.getDeclaredField("mHiddenViews");
                        this.c = declaredField2;
                        declaredField2.setAccessible(true);
                        this.g = (List) this.c.get(this.f2286a);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Method b;
        public static final Method c;
        public static final Method d;
        public static final Method e;

        /* renamed from: a  reason: collision with root package name */
        public final RecyclerView.ViewHolder f2288a;

        public d(RecyclerView.ViewHolder viewHolder) {
            this.f2288a = viewHolder;
        }

        public static void e(RecyclerView.ViewHolder viewHolder, int i, int i2) {
            try {
                e.invoke(viewHolder, Integer.valueOf(i), Integer.valueOf(i2));
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }

        public boolean a() {
            Method method = d;
            if (method == null) {
                return true;
            }
            try {
                return ((Boolean) method.invoke(this.f2288a, new Object[0])).booleanValue();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return true;
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
                return true;
            }
        }

        public boolean b() {
            Method method = b;
            if (method == null) {
                return true;
            }
            try {
                return ((Boolean) method.invoke(this.f2288a, new Object[0])).booleanValue();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return true;
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
                return true;
            }
        }

        public boolean c() {
            Method method = c;
            if (method == null) {
                return true;
            }
            try {
                return ((Boolean) method.invoke(this.f2288a, new Object[0])).booleanValue();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return true;
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
                return true;
            }
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("236dd521", new Object[]{this})).booleanValue();
            }
            if (b() || c() || a()) {
                return true;
            }
            return false;
        }

        static {
            t2o.a(156237942);
            try {
                RecyclerView.ViewHolder.class.getDeclaredMethod("shouldIgnore", new Class[0]).setAccessible(true);
                Method declaredMethod = RecyclerView.ViewHolder.class.getDeclaredMethod("isInvalid", new Class[0]);
                b = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = RecyclerView.ViewHolder.class.getDeclaredMethod("isRemoved", new Class[0]);
                c = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Class cls = Integer.TYPE;
                Method declaredMethod3 = RecyclerView.ViewHolder.class.getDeclaredMethod("setFlags", cls, cls);
                e = declaredMethod3;
                declaredMethod3.setAccessible(true);
                try {
                    d = RecyclerView.ViewHolder.class.getDeclaredMethod("isChanged", new Class[0]);
                } catch (NoSuchMethodException unused) {
                    d = RecyclerView.ViewHolder.class.getDeclaredMethod("isUpdated", new Class[0]);
                }
                d.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            }
        }
    }

    public ExposeLinearLayoutManagerEx(Context context, int i, boolean z) {
        super(context, i, z);
        this.d = false;
        this.e = -1;
        this.f = Integer.MIN_VALUE;
        this.g = null;
        this.n = new Object[0];
        this.o = new vig();
        this.h = new a();
        setOrientation(i);
        setReverseLayout(z);
        this.i = new b(this);
        try {
            Method declaredMethod = LinearLayoutManager.class.getDeclaredMethod("ensureLayoutState", new Class[0]);
            this.j = declaredMethod;
            declaredMethod.setAccessible(true);
            try {
                Method declaredMethod2 = RecyclerView.LayoutManager.class.getDeclaredMethod("setItemPrefetchEnabled", Boolean.TYPE);
                if (declaredMethod2 != null) {
                    declaredMethod2.invoke(this, Boolean.FALSE);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static void B(RecyclerView.LayoutParams layoutParams, RecyclerView.ViewHolder viewHolder) {
        try {
            if (p == null) {
                p = RecyclerView.LayoutParams.class.getDeclaredField("mViewHolder");
            }
            p.setAccessible(true);
            p.set(layoutParams, viewHolder);
            if (q == null) {
                Class cls = Integer.TYPE;
                Method declaredMethod = RecyclerView.ViewHolder.class.getDeclaredMethod("setFlags", cls, cls);
                q = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            q.invoke(viewHolder, 4, 4);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
    }
}
