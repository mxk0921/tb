package com.alibaba.android.ultron.ext.vlayout;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.ExposeLinearLayoutManagerEx;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.bjg;
import tb.bk9;
import tb.cfn;
import tb.ck9;
import tb.djg;
import tb.gfl;
import tb.ljg;
import tb.sw1;
import tb.t2o;
import tb.vig;
import tb.wv;
import tb.z17;
import tb.zen;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class VirtualLayoutManager extends ExposeLinearLayoutManagerEx implements com.alibaba.android.ultron.ext.vlayout.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HORIZONTAL = 0;
    public static final com.alibaba.android.ultron.ext.vlayout.a J = new z17();
    public static final String TAG = "VirtualLayoutManager";
    public static final int VERTICAL = 1;
    public final HashMap<Integer, com.alibaba.android.ultron.ext.vlayout.a> A;
    public final HashMap<Integer, com.alibaba.android.ultron.ext.vlayout.a> B;
    public final d C;
    public int D;
    public final f E;
    public final List<Pair<zen<Integer>, Integer>> F;
    public final com.alibaba.android.ultron.ext.vlayout.a G;
    public final ljg H;
    public final Rect I;
    public gfl r;
    public final gfl s;
    public RecyclerView t;
    public boolean u;
    public boolean v;
    public djg w;
    public final Comparator<Pair<zen<Integer>, Integer>> x;
    public bjg y;
    public final bk9 z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class InflateLayoutParams extends LayoutParams {
        static {
            t2o.a(156237967);
        }

        public InflateLayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class LayoutViewHolder extends RecyclerView.ViewHolder {
        static {
            t2o.a(156237970);
        }

        public LayoutViewHolder(View view) {
            super(view);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Comparator<Pair<zen<Integer>, Integer>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(VirtualLayoutManager virtualLayoutManager) {
        }

        /* renamed from: a */
        public int compare(Pair<zen<Integer>, Integer> pair, Pair<zen<Integer>, Integer> pair2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8d8bc39f", new Object[]{this, pair, pair2})).intValue();
            }
            if (pair == null && pair2 == null) {
                return 0;
            }
            if (pair == null) {
                return -1;
            }
            if (pair2 == null) {
                return 1;
            }
            return ((Integer) ((zen) pair.first).d()).intValue() - ((Integer) ((zen) pair2.first).d()).intValue();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (VirtualLayoutManager.j0(VirtualLayoutManager.this) != null) {
                VirtualLayoutManager.j0(VirtualLayoutManager.this).requestLayout();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements ljg {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(VirtualLayoutManager virtualLayoutManager) {
        }

        public View a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("ae16e65f", new Object[]{this, context});
            }
            return new LayoutView(context);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f2292a;
        public int b;
        public boolean c;

        static {
            t2o.a(156237965);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface e {
        boolean a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int INVALID_LAYOUT = Integer.MIN_VALUE;
        public static final int ITEM_DIRECTION_HEAD = -1;
        public static final int ITEM_DIRECTION_TAIL = 1;
        public static final int LAYOUT_END = 1;
        public static final int LAYOUT_START = -1;
        public static final int SCOLLING_OFFSET_NaN = Integer.MIN_VALUE;

        /* renamed from: a  reason: collision with root package name */
        public ExposeLinearLayoutManagerEx.c f2293a;

        static {
            t2o.a(156237969);
        }

        public static /* synthetic */ ExposeLinearLayoutManagerEx.c a(f fVar, ExposeLinearLayoutManagerEx.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExposeLinearLayoutManagerEx.c) ipChange.ipc$dispatch("59b1056e", new Object[]{fVar, cVar});
            }
            fVar.f2293a = cVar;
            return cVar;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2cf23f0d", new Object[]{this})).intValue();
            }
            return this.f2293a.e;
        }

        public int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
            }
            return this.f2293a.f;
        }

        public int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f04201d4", new Object[]{this})).intValue();
            }
            return this.f2293a.j;
        }

        public int e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4defc770", new Object[]{this})).intValue();
            }
            return this.f2293a.g;
        }

        public int f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ff9eba39", new Object[]{this})).intValue();
            }
            return this.f2293a.h;
        }

        public int g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c7531f83", new Object[]{this})).intValue();
            }
            return this.f2293a.d;
        }

        public boolean h(RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8c25e7f8", new Object[]{this, state})).booleanValue();
            }
            return this.f2293a.a(state);
        }

        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("83ce28a0", new Object[]{this})).booleanValue();
            }
            if (this.f2293a.l != null) {
                return true;
            }
            return false;
        }

        public boolean j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("910510ae", new Object[]{this})).booleanValue();
            }
            return this.f2293a.k;
        }

        public boolean k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("76149fe6", new Object[]{this})).booleanValue();
            }
            return this.f2293a.b;
        }

        public View l(RecyclerView.Recycler recycler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("57332bd2", new Object[]{this, recycler});
            }
            return this.f2293a.b(recycler);
        }

        public View m(RecyclerView.Recycler recycler, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("4d046a0c", new Object[]{this, recycler, new Integer(i)});
            }
            ExposeLinearLayoutManagerEx.c cVar = this.f2293a;
            int i2 = cVar.f;
            cVar.f = i;
            View l = l(recycler);
            this.f2293a.f = i2;
            return l;
        }

        public void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b892214a", new Object[]{this});
                return;
            }
            ExposeLinearLayoutManagerEx.c cVar = this.f2293a;
            cVar.f += cVar.g;
        }
    }

    static {
        t2o.a(156237961);
        t2o.a(156237945);
    }

    public VirtualLayoutManager(Context context) {
        this(context, 1);
    }

    public static /* synthetic */ Object ipc$super(VirtualLayoutManager virtualLayoutManager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2103993952:
                return super.findViewByPosition(((Number) objArr[0]).intValue());
            case -1889771791:
                super.scrollToPositionWithOffset(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1809655966:
                super.setStackFromEnd(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1602403907:
                super.assertNotInLayoutOrScroll((String) objArr[0]);
                return null;
            case -1530261315:
                super.moveView(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1468828374:
                super.smoothScrollToPosition((RecyclerView) objArr[0], (RecyclerView.State) objArr[1], ((Number) objArr[2]).intValue());
                return null;
            case -1447122930:
                super.setOrientation(((Number) objArr[0]).intValue());
                return null;
            case -1382357996:
                return new Integer(super.getOrientation());
            case -1227808903:
                return new Integer(super.findLastVisibleItemPosition());
            case -1078087916:
                super.offsetChildrenVertical(((Number) objArr[0]).intValue());
                return null;
            case -1043006560:
                return super.onFocusSearchFailed((View) objArr[0], ((Number) objArr[1]).intValue(), (RecyclerView.Recycler) objArr[2], (RecyclerView.State) objArr[3]);
            case -741263064:
                return super.computeScrollVectorForPosition(((Number) objArr[0]).intValue());
            case -579605410:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -574012007:
                return new Boolean(super.canScrollHorizontally());
            case -526784883:
                super.detachAndScrapViewAt(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1]);
                return null;
            case -520127601:
                super.detachAndScrapView((View) objArr[0], (RecyclerView.Recycler) objArr[1]);
                return null;
            case -508633188:
                virtualLayoutManager.Z((wv) objArr[0]);
                return null;
            case -478125984:
                return new Integer(super.scrollHorizontallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
            case -317230231:
                super.b((View) objArr[0]);
                return null;
            case -135265138:
                super.onMeasure((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case -62336886:
                return new Integer(super.getWidth());
            case 27005610:
                return super.onSaveInstanceState();
            case 69461489:
                return new Integer(super.findFirstVisibleItemPosition());
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 243344899:
                super.setReverseLayout(((Boolean) objArr[0]).booleanValue());
                return null;
            case 371177099:
                super.scrollToPosition(((Number) objArr[0]).intValue());
                return null;
            case 514551467:
                return new Boolean(super.canScrollVertically());
            case 626639596:
                return new Integer(super.Y(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
            case 761755371:
                super.onAdapterChanged((RecyclerView.Adapter) objArr[0], (RecyclerView.Adapter) objArr[1]);
                return null;
            case 783172156:
                super.T((RecyclerView.State) objArr[0], (ExposeLinearLayoutManagerEx.a) objArr[1]);
                return null;
            case 1027840325:
                super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
                return null;
            case 1050392251:
                super.onDetachedFromWindow((RecyclerView) objArr[0], (RecyclerView.Recycler) objArr[1]);
                return null;
            case 1092201946:
                super.detachAndScrapAttachedViews((RecyclerView.Recycler) objArr[0]);
                return null;
            case 1191436823:
                return new Integer(super.getHeight());
            case 1242672066:
                super.onAttachedToWindow((RecyclerView) objArr[0]);
                return null;
            case 1386360324:
                super.i((View) objArr[0]);
                return null;
            case 1659846701:
                super.onScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            case 1751633432:
                virtualLayoutManager.a0(((Number) objArr[0]).intValue());
                return null;
            case 1951908722:
                return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
            case 1956946854:
                super.offsetChildrenHorizontal(((Number) objArr[0]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/VirtualLayoutManager");
        }
    }

    public static /* synthetic */ RecyclerView j0(VirtualLayoutManager virtualLayoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("f9d0c9a2", new Object[]{virtualLayoutManager});
        }
        return virtualLayoutManager.t;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.ExposeLinearLayoutManagerEx
    public int C(View view, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b47107d", new Object[]{this, view, new Boolean(z), new Boolean(z2)})).intValue();
        }
        return k0(getPosition(view), z, z2);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.ExposeLinearLayoutManagerEx
    public void M(RecyclerView.Recycler recycler, RecyclerView.State state, ExposeLinearLayoutManagerEx.c cVar, vig vigVar) {
        com.alibaba.android.ultron.ext.vlayout.a aVar;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58008b8f", new Object[]{this, recycler, state, cVar, vigVar});
            return;
        }
        int i2 = cVar.f;
        f.a(this.E, cVar);
        bjg bjgVar = this.y;
        if (bjgVar == null) {
            aVar = null;
        } else {
            aVar = bjgVar.a(i2);
        }
        if (aVar == null) {
            aVar = this.G;
        }
        aVar.k(recycler, state, this.E, vigVar, this);
        f.a(this.E, null);
        int i3 = cVar.f;
        if (i3 == i2) {
            vigVar.b = true;
            return;
        }
        int i4 = i3 - cVar.g;
        if (!vigVar.c) {
            i = vigVar.f30032a;
        }
        zen<Integer> zenVar = new zen<>(Integer.valueOf(Math.min(i2, i4)), Integer.valueOf(Math.max(i2, i4)));
        int m0 = m0(zenVar);
        if (m0 >= 0) {
            Pair pair = (Pair) ((ArrayList) this.F).get(m0);
            if (pair == null || !((zen) pair.first).equals(zenVar) || ((Integer) pair.second).intValue() != i) {
                ((ArrayList) this.F).remove(m0);
            } else {
                return;
            }
        }
        ((ArrayList) this.F).add(Pair.create(zenVar, Integer.valueOf(i)));
        Collections.sort(this.F, this.x);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.ExposeLinearLayoutManagerEx
    public void T(RecyclerView.State state, ExposeLinearLayoutManagerEx.a aVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eae423c", new Object[]{this, state, aVar});
            return;
        }
        super.T(state, aVar);
        while (z) {
            d dVar = this.C;
            int i = aVar.f2285a;
            dVar.f2292a = i;
            dVar.b = aVar.b;
            dVar.c = aVar.c;
            com.alibaba.android.ultron.ext.vlayout.a a2 = this.y.a(i);
            if (a2 != null) {
                a2.h(state, this.C, this);
            }
            d dVar2 = this.C;
            int i2 = dVar2.f2292a;
            if (i2 == aVar.f2285a) {
                z = false;
            } else {
                aVar.f2285a = i2;
            }
            aVar.b = dVar2.b;
            dVar2.f2292a = -1;
        }
        d dVar3 = this.C;
        dVar3.f2292a = aVar.f2285a;
        dVar3.b = aVar.b;
        for (com.alibaba.android.ultron.ext.vlayout.a aVar2 : this.y.b()) {
            aVar2.v(state, this.C, this);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.ExposeLinearLayoutManagerEx
    public int Y(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2559c2ec", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        Trace.beginSection("VLM scroll");
        t0(recycler, state);
        try {
            try {
                i2 = super.Y(i, recycler, state);
            } catch (Exception e2) {
                Log.getStackTraceString(e2);
            }
            Trace.endSection();
            return i2;
        } finally {
            s0(recycler, state, 0);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54dce22f", new Object[]{this, view})).booleanValue();
        }
        RecyclerView.ViewHolder childViewHolder = getChildViewHolder(view);
        if (childViewHolder == null || ExposeLinearLayoutManagerEx.L(childViewHolder)) {
            return true;
        }
        return false;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.ExposeLinearLayoutManagerEx, com.alibaba.android.ultron.ext.vlayout.b
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed177369", new Object[]{this, view});
        } else {
            super.b(view);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public gfl c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfl) ipChange.ipc$dispatch("3bccf304", new Object[]{this});
        }
        return this.s;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddc94599", new Object[]{this})).booleanValue();
        }
        djg djgVar = this.w;
        if (djgVar != null) {
            z = djgVar.canScrollHorizontally();
        } else {
            z = true;
        }
        if (!this.u || !z) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
        }
        djg djgVar = this.w;
        if (djgVar != null) {
            z = djgVar.canScrollVertically();
        } else {
            z = true;
        }
        if (!this.v || !z) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e9a8b68", new Object[]{this, layoutParams})).booleanValue();
        }
        return layoutParams instanceof LayoutParams;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public void d(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63791b8", new Object[]{this, view, new Integer(i)});
        } else {
            super.addView(view, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void detachAndScrapAttachedViews(RecyclerView.Recycler recycler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4119adda", new Object[]{this, recycler});
            return;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            RecyclerView.ViewHolder childViewHolder = getChildViewHolder(getChildAt(childCount));
            if ((childViewHolder instanceof e) && ((e) childViewHolder).a()) {
                ExposeLinearLayoutManagerEx.d.e(childViewHolder, 0, 6);
            }
        }
        super.detachAndScrapAttachedViews(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void detachAndScrapView(View view, RecyclerView.Recycler recycler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0ff7b8f", new Object[]{this, view, recycler});
        } else {
            super.detachAndScrapView(view, recycler);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void detachAndScrapViewAt(int i, RecyclerView.Recycler recycler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e099e68d", new Object[]{this, new Integer(i), recycler});
            return;
        }
        RecyclerView.ViewHolder childViewHolder = getChildViewHolder(getChildAt(i));
        if ((childViewHolder instanceof e) && ((e) childViewHolder).a()) {
            ExposeLinearLayoutManagerEx.d.e(childViewHolder, 0, 4);
        }
        super.detachAndScrapViewAt(i, recycler);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5298ea8e", new Object[]{this, view});
        } else {
            removeView(view);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public void f(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0bde9e", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        layoutDecorated(view, i + marginLayoutParams.leftMargin, i2 + marginLayoutParams.topMargin, i3 - marginLayoutParams.rightMargin, i4 - marginLayoutParams.bottomMargin);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("829799a0", new Object[]{this, new Integer(i)});
        }
        View findViewByPosition = super.findViewByPosition(i);
        if (findViewByPosition != null && getPosition(findViewByPosition) == i) {
            return findViewByPosition;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && getPosition(childAt) == i) {
                return childAt;
            }
        }
        return null;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public gfl g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfl) ipChange.ipc$dispatch("3fde7475", new Object[]{this});
        }
        return this.r;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.LayoutParams) ipChange.ipc$dispatch("1f17b458", new Object[]{this});
        }
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.LayoutParams) ipChange.ipc$dispatch("6f80d4ea", new Object[]{this, layoutParams});
        }
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((RecyclerView.LayoutParams) ((LayoutParams) layoutParams));
        }
        if (layoutParams instanceof RecyclerView.LayoutParams) {
            return new LayoutParams((RecyclerView.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public RecyclerView.ViewHolder getChildViewHolder(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("27c24ba6", new Object[]{this, view});
        }
        RecyclerView recyclerView = this.t;
        if (recyclerView != null) {
            return recyclerView.getChildViewHolder(view);
        }
        return null;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public int getContentHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7283ec4", new Object[]{this})).intValue();
        }
        return super.getHeight();
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public int getContentWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22ffaa3d", new Object[]{this})).intValue();
        }
        return super.getWidth();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.alibaba.android.ultron.ext.vlayout.b
    public int getOrientation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad9ae414", new Object[]{this})).intValue();
        }
        return super.getOrientation();
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public void h(View view) {
        ViewParent parent;
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8575ce13", new Object[]{this, view});
        } else if (this.t != null && (parent = view.getParent()) != null && parent == (recyclerView = this.t)) {
            this.t.getRecycledViewPool().putRecycledView(recyclerView.getChildViewHolder(view));
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.ExposeLinearLayoutManagerEx, com.alibaba.android.ultron.ext.vlayout.b
    public void i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a22e04", new Object[]{this, view});
        } else {
            super.i(view);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public final View j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5d0ac64d", new Object[]{this});
        }
        RecyclerView recyclerView = this.t;
        if (recyclerView == null) {
            return null;
        }
        View a2 = ((c) this.H).a(recyclerView.getContext());
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ExposeLinearLayoutManagerEx.B(layoutParams, new LayoutViewHolder(a2));
        a2.setLayoutParams(layoutParams);
        return a2;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public com.alibaba.android.ultron.ext.vlayout.a k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.ext.vlayout.a) ipChange.ipc$dispatch("4a7d910d", new Object[]{this, new Integer(i)});
        }
        return this.y.a(i);
    }

    public int k0(int i, boolean z, boolean z2) {
        com.alibaba.android.ultron.ext.vlayout.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70b8806e", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)})).intValue();
        }
        if (i == -1 || (a2 = this.y.a(i)) == null) {
            return 0;
        }
        return a2.j(i - a2.n().d().intValue(), z, z2, this);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public void l(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8280d53", new Object[]{this, view});
        } else {
            o(view, false);
        }
    }

    public com.alibaba.android.ultron.ext.vlayout.a l0(com.alibaba.android.ultron.ext.vlayout.a aVar, boolean z) {
        List<com.alibaba.android.ultron.ext.vlayout.a> b2;
        int indexOf;
        int i;
        com.alibaba.android.ultron.ext.vlayout.a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.ext.vlayout.a) ipChange.ipc$dispatch("aef8444f", new Object[]{this, aVar, new Boolean(z)});
        }
        if (aVar == null || (indexOf = (b2 = this.y.b()).indexOf(aVar)) == -1) {
            return null;
        }
        if (z) {
            i = indexOf - 1;
        } else {
            i = indexOf + 1;
        }
        if (i < 0 || i >= b2.size() || (aVar2 = b2.get(i)) == null || aVar2.o()) {
            return null;
        }
        return aVar2;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.ExposeLinearLayoutManagerEx, com.alibaba.android.ultron.ext.vlayout.b
    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6be35ad7", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final int m0(zen<Integer> zenVar) {
        Pair pair;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8fe1e40d", new Object[]{this, zenVar})).intValue();
        }
        int size = ((ArrayList) this.F).size();
        if (size == 0) {
            return -1;
        }
        int i2 = size - 1;
        int i3 = -1;
        while (true) {
            pair = null;
            if (i > i2) {
                break;
            }
            i3 = (i + i2) / 2;
            Pair pair2 = (Pair) ((ArrayList) this.F).get(i3);
            zen<Integer> zenVar2 = (zen) pair2.first;
            if (zenVar2 == null) {
                break;
            } else if (zenVar2.a(zenVar.d()) || zenVar2.a(zenVar.e()) || zenVar.b(zenVar2)) {
                break;
            } else if (zenVar2.d().intValue() > zenVar.e().intValue()) {
                i2 = i3 - 1;
            } else if (zenVar2.e().intValue() < zenVar.d().intValue()) {
                i = i3 + 1;
            }
        }
        if (pair == null) {
            return -1;
        }
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, com.alibaba.android.ultron.ext.vlayout.b
    public void measureChild(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cfe4ded", new Object[]{this, view, new Integer(i), new Integer(i2)});
        } else {
            o0(view, i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, com.alibaba.android.ultron.ext.vlayout.b
    public void measureChildWithMargins(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e27560a", new Object[]{this, view, new Integer(i), new Integer(i2)});
        } else {
            p0(view, i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void moveView(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4ca10bd", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.moveView(i, i2);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97751e16", new Object[]{this})).booleanValue();
        }
        return isLayoutRTL();
    }

    public List<com.alibaba.android.ultron.ext.vlayout.a> n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("efcada7b", new Object[]{this});
        }
        return this.y.b();
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public void o(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b0dc86a", new Object[]{this, view, new Boolean(z)});
            return;
        }
        b(view);
        A(view, z);
    }

    public final void o0(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f80188c", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        calculateItemDecorationsForChild(view, this.I);
        Rect rect = this.I;
        int updateSpecWithExtra = updateSpecWithExtra(i, rect.left, rect.right);
        Rect rect2 = this.I;
        view.measure(updateSpecWithExtra, updateSpecWithExtra(i2, rect2.top, rect2.bottom));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenHorizontal(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74a4a3a6", new Object[]{this, new Integer(i)});
            return;
        }
        super.offsetChildrenHorizontal(i);
        for (com.alibaba.android.ultron.ext.vlayout.a aVar : this.y.b()) {
            aVar.s(i, this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenVertical(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfbdaf14", new Object[]{this, new Integer(i)});
            return;
        }
        super.offsetChildrenVertical(i);
        for (com.alibaba.android.ultron.ext.vlayout.a aVar : this.y.b()) {
            aVar.t(i, this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d6776eb", new Object[]{this, adapter, adapter2});
        } else {
            super.onAdapterChanged(adapter, adapter2);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a11abc2", new Object[]{this, recyclerView});
            return;
        }
        super.onAttachedToWindow(recyclerView);
        this.t = recyclerView;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9bb6bb", new Object[]{this, recyclerView, recycler});
            return;
        }
        super.onDetachedFromWindow(recyclerView, recycler);
        for (com.alibaba.android.ultron.ext.vlayout.a aVar : this.y.b()) {
            aVar.i(this);
        }
        this.t = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5cf371", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else {
            onItemsChanged(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e646a6dd", new Object[]{this, recyclerView});
            return;
        }
        for (com.alibaba.android.ultron.ext.vlayout.a aVar : this.y.b()) {
            aVar.r(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d84d8a5", new Object[]{this, recyclerView, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            onItemsChanged(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bae4bd1", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else {
            onItemsChanged(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461290d6", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else {
            onItemsChanged(recyclerView);
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.alibaba.android.ultron.ext.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d439945", new Object[]{this, recycler, state});
            return;
        }
        Trace.beginSection("VLM onLayoutChildren");
        t0(recycler, state);
        try {
            try {
                super.onLayoutChildren(recycler, state);
                s0(recycler, state, Integer.MAX_VALUE);
                Trace.endSection();
            } catch (Exception e2) {
                e2.printStackTrace();
                throw e2;
            }
        } catch (Throwable th) {
            s0(recycler, state, Integer.MAX_VALUE);
            throw th;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f0048e", new Object[]{this, recycler, state, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(recycler, state, i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(i);
        int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = findLastVisibleItemPosition();
        for (com.alibaba.android.ultron.ext.vlayout.a aVar : this.y.b()) {
            aVar.y(i, findFirstVisibleItemPosition, findLastVisibleItemPosition, this);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public void p(View view, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d9473d", new Object[]{this, view, new Boolean(z)});
            return;
        }
        b(view);
        if (!z) {
            i = -1;
        }
        addView(view, i);
    }

    public final void p0(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e565705", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        calculateItemDecorationsForChild(view, this.I);
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (getOrientation() == 1) {
            int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            Rect rect = this.I;
            i = updateSpecWithExtra(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        }
        if (getOrientation() == 0) {
            Rect rect2 = this.I;
            i2 = updateSpecWithExtra(i2, rect2.top, rect2.bottom);
        }
        view.measure(i, i2);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public int q(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ebece2d", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)})).intValue();
        }
        return RecyclerView.LayoutManager.getChildMeasureSpec(i, 0, i2, z);
    }

    public int q0(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed21cc35", new Object[]{this, view, new Boolean(z)})).intValue();
        }
        return r0(view, z, true);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public void r(f fVar, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47807866", new Object[]{this, fVar, view, new Integer(i)});
            return;
        }
        b(view);
        if (!fVar.i()) {
            addView(view, i);
        } else {
            addDisappearingView(view, i);
        }
    }

    public int r0(View view, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7186ec5", new Object[]{this, view, new Boolean(z), new Boolean(z2)})).intValue();
        }
        if (view != null) {
            return C(view, z, z2);
        }
        return 0;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.ExposeLinearLayoutManagerEx
    public void recycleChildren(RecyclerView.Recycler recycler, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b8abdef", new Object[]{this, recycler, new Integer(i), new Integer(i2)});
        } else if (i != i2) {
            if (i2 > i) {
                View childAt = getChildAt(i2 - 1);
                int position = getPosition(getChildAt(i));
                int position2 = getPosition(childAt);
                int i3 = i;
                while (i < i2) {
                    int position3 = getPosition(getChildAt(i3));
                    if (position3 != -1) {
                        com.alibaba.android.ultron.ext.vlayout.a a2 = this.y.a(position3);
                        if (a2 == null || a2.q(position3, position, position2, this, true)) {
                            removeAndRecycleViewAt(i3, recycler);
                        } else {
                            i3++;
                        }
                    } else {
                        removeAndRecycleViewAt(i3, recycler);
                    }
                    i++;
                }
                return;
            }
            View childAt2 = getChildAt(i);
            int position4 = getPosition(getChildAt(1 + i2));
            int position5 = getPosition(childAt2);
            while (i > i2) {
                int position6 = getPosition(getChildAt(i));
                if (position6 != -1) {
                    com.alibaba.android.ultron.ext.vlayout.a a3 = this.y.a(position6);
                    if (a3 == null || a3.q(position6, position4, position5, this, false)) {
                        removeAndRecycleViewAt(i, recycler);
                    }
                } else {
                    removeAndRecycleViewAt(i, recycler);
                }
                i--;
            }
        }
    }

    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("969c738f", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    public final void s0(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c89beb", new Object[]{this, recycler, state, new Integer(i)});
            return;
        }
        int i2 = this.D - 1;
        this.D = i2;
        if (i2 <= 0) {
            this.D = 0;
            int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = findLastVisibleItemPosition();
            for (com.alibaba.android.ultron.ext.vlayout.a aVar : this.y.b()) {
                try {
                    aVar.f(recycler, state, findFirstVisibleItemPosition, findLastVisibleItemPosition, i, this);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
        } else {
            super.scrollToPosition(i);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager
    public void scrollToPositionWithOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5c5ef1", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.scrollToPositionWithOffset(i, i2);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager
    public void setOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bea80e", new Object[]{this, new Integer(i)});
            return;
        }
        this.r = gfl.b(this, i);
        super.setOrientation(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setReverseLayout(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e812603", new Object[]{this, new Boolean(z)});
        } else if (!z) {
            super.setReverseLayout(false);
        } else {
            throw new UnsupportedOperationException("VirtualLayoutManager does not support reverse layout in current version.");
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9422d762", new Object[]{this, new Boolean(z)});
        } else if (!z) {
            super.setStackFromEnd(false);
        } else {
            throw new UnsupportedOperationException("VirtualLayoutManager does not support stack from end.");
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a873752a", new Object[]{this, recyclerView, state, new Integer(i)});
        } else {
            super.smoothScrollToPosition(recyclerView, state, i);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4fda0d0", new Object[]{this})).booleanValue();
        }
        if (this.g == null) {
            return true;
        }
        return false;
    }

    public final void t0(RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95d80c2b", new Object[]{this, recycler, state});
            return;
        }
        if (this.D == 0) {
            for (com.alibaba.android.ultron.ext.vlayout.a aVar : this.y.c()) {
                aVar.g(recycler, state, this);
            }
        }
        this.D++;
    }

    public void u0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a4ce1e1", new Object[]{this, new Boolean(z)});
        } else {
            this.u = z;
        }
    }

    public final int updateSpecWithExtra(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7849d2c9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i;
        }
        if ((View.MeasureSpec.getSize(i) - i2) - i3 < 0) {
            return View.MeasureSpec.makeMeasureSpec(0, mode);
        }
        return View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - i2) - i3, mode);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public void v(f fVar, View view) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e988423d", new Object[]{this, fVar, view});
            return;
        }
        if (fVar.e() == 1) {
            i = -1;
        }
        r(fVar, view, i);
    }

    public void v0(bjg bjgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd15b8f", new Object[]{this, bjgVar});
        } else if (bjgVar != null) {
            LinkedList linkedList = new LinkedList();
            bjg bjgVar2 = this.y;
            if (bjgVar2 != null) {
                for (com.alibaba.android.ultron.ext.vlayout.a aVar : bjgVar2.b()) {
                    linkedList.add(aVar);
                }
            }
            this.y = bjgVar;
            if (linkedList.size() > 0) {
                this.y.d(linkedList);
            }
            requestLayout();
        } else {
            throw new IllegalArgumentException("finder is null");
        }
    }

    public void w0(List<com.alibaba.android.ultron.ext.vlayout.a> list) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57412fb1", new Object[]{this, list});
            return;
        }
        for (com.alibaba.android.ultron.ext.vlayout.a aVar : this.y.b()) {
            this.B.put(Integer.valueOf(System.identityHashCode(aVar)), aVar);
        }
        if (list != null) {
            for (com.alibaba.android.ultron.ext.vlayout.a aVar2 : list) {
                if (aVar2 instanceof ck9) {
                    ((ck9) aVar2).f0(this.z);
                }
                boolean z = aVar2 instanceof sw1;
                if (aVar2.m() > 0) {
                    aVar2.A(i, (aVar2.m() + i) - 1);
                } else {
                    aVar2.A(-1, -1);
                }
                i += aVar2.m();
            }
        }
        this.y.d(list);
        for (com.alibaba.android.ultron.ext.vlayout.a aVar3 : this.y.b()) {
            this.A.put(Integer.valueOf(System.identityHashCode(aVar3)), aVar3);
        }
        Iterator<Map.Entry<Integer, com.alibaba.android.ultron.ext.vlayout.a>> it = this.B.entrySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next().getKey();
            if (this.A.containsKey(key)) {
                this.A.remove(key);
                it.remove();
            }
        }
        for (com.alibaba.android.ultron.ext.vlayout.a aVar4 : this.B.values()) {
            aVar4.i(this);
        }
        if (this.B.isEmpty()) {
            this.A.isEmpty();
        }
        this.B.clear();
        this.A.clear();
        requestLayout();
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.b
    public void x(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f40cd9", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            layoutDecorated(view, i, i2, i3, i4);
        }
    }

    public void x0(djg djgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccb7e63a", new Object[]{this, djgVar});
        } else {
            this.w = djgVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int INVALIDE_SIZE = Integer.MIN_VALUE;

        /* renamed from: a  reason: collision with root package name */
        public final float f2290a = Float.NaN;

        static {
            t2o.a(156237968);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static /* synthetic */ Object ipc$super(LayoutParams layoutParams, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/VirtualLayoutManager$LayoutParams");
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public VirtualLayoutManager(Context context, int i) {
        this(context, i, false);
    }

    public VirtualLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        this.x = new a(this);
        this.z = bk9.mDefaultAdjuster;
        this.A = new HashMap<>();
        this.B = new HashMap<>();
        this.C = new d();
        int i2 = 0;
        this.D = 0;
        this.E = new f();
        this.F = new ArrayList();
        this.G = J;
        this.H = new c(this);
        this.I = new Rect();
        this.r = gfl.b(this, i);
        this.s = gfl.b(this, i != 1 ? 1 : i2);
        this.v = super.canScrollVertically();
        this.u = super.canScrollHorizontally();
        v0(new cfn());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.LayoutParams) ipChange.ipc$dispatch("ab9dc9c9", new Object[]{this, context, attributeSet}) : new InflateLayoutParams(context, attributeSet);
    }
}
