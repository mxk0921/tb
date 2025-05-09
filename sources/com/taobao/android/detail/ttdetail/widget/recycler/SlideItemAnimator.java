package com.taobao.android.detail.ttdetail.widget.recycler;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.oaz;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SlideItemAnimator extends SimpleItemAnimator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static TimeInterpolator x;
    public final ArrayList<RecyclerView.ViewHolder> m = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> n = new ArrayList<>();
    public final ArrayList<j> o = new ArrayList<>();
    public final ArrayList<i> p = new ArrayList<>();
    public final ArrayList<ArrayList<RecyclerView.ViewHolder>> q = new ArrayList<>();
    public final ArrayList<ArrayList<j>> r = new ArrayList<>();
    public final ArrayList<ArrayList<i>> s = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> t = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> u = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> v = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> w = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f7023a;

        public a(ArrayList arrayList) {
            this.f7023a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Iterator it = this.f7023a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                SlideItemAnimator.this.animateMoveImpl(jVar.f7032a, jVar.b, jVar.c, jVar.d, jVar.e);
            }
            this.f7023a.clear();
            SlideItemAnimator.this.r.remove(this.f7023a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f7024a;

        public b(ArrayList arrayList) {
            this.f7024a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Iterator it = this.f7024a.iterator();
            while (it.hasNext()) {
                SlideItemAnimator.this.a((i) it.next());
            }
            this.f7024a.clear();
            SlideItemAnimator.this.s.remove(this.f7024a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f7025a;

        public c(ArrayList arrayList) {
            this.f7025a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Iterator it = this.f7025a.iterator();
            while (it.hasNext()) {
                SlideItemAnimator.this.animateAddImpl((RecyclerView.ViewHolder) it.next());
            }
            this.f7025a.clear();
            SlideItemAnimator.this.q.remove(this.f7025a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.ViewHolder f7026a;
        public final /* synthetic */ ViewPropertyAnimator b;
        public final /* synthetic */ View c;

        public d(RecyclerView.ViewHolder viewHolder, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f7026a = viewHolder;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/recycler/SlideItemAnimator$4");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            this.b.setListener(null);
            this.c.setTranslationX(0.0f);
            SlideItemAnimator.this.dispatchRemoveFinished(this.f7026a);
            SlideItemAnimator.this.v.remove(this.f7026a);
            SlideItemAnimator.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else {
                SlideItemAnimator.this.dispatchRemoveStarting(this.f7026a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.ViewHolder f7027a;
        public final /* synthetic */ View b;
        public final /* synthetic */ ViewPropertyAnimator c;

        public e(RecyclerView.ViewHolder viewHolder, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f7027a = viewHolder;
            this.b = view;
            this.c = viewPropertyAnimator;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/recycler/SlideItemAnimator$5");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            this.b.setAlpha(1.0f);
            this.b.setTranslationX(0.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            this.c.setListener(null);
            this.b.setAlpha(1.0f);
            SlideItemAnimator.this.dispatchAddFinished(this.f7027a);
            SlideItemAnimator.this.t.remove(this.f7027a);
            SlideItemAnimator.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            SlideItemAnimator.this.dispatchAddStarting(this.f7027a);
            this.b.setAlpha(1.0f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.ViewHolder f7028a;
        public final /* synthetic */ int b;
        public final /* synthetic */ View c;
        public final /* synthetic */ int d;
        public final /* synthetic */ ViewPropertyAnimator e;

        public f(RecyclerView.ViewHolder viewHolder, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f7028a = viewHolder;
            this.b = i;
            this.c = view;
            this.d = i2;
            this.e = viewPropertyAnimator;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/recycler/SlideItemAnimator$6");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            if (this.b != 0) {
                this.c.setTranslationX(0.0f);
            }
            if (this.d != 0) {
                this.c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            this.e.setListener(null);
            SlideItemAnimator.this.dispatchMoveFinished(this.f7028a);
            SlideItemAnimator.this.u.remove(this.f7028a);
            SlideItemAnimator.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else {
                SlideItemAnimator.this.dispatchMoveStarting(this.f7028a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f7029a;
        public final /* synthetic */ ViewPropertyAnimator b;
        public final /* synthetic */ View c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f7029a = iVar;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/recycler/SlideItemAnimator$7");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            this.b.setListener(null);
            this.c.setTranslationX(0.0f);
            SlideItemAnimator.this.dispatchChangeFinished(this.f7029a.f7031a, true);
            SlideItemAnimator.this.w.remove(this.f7029a.f7031a);
            SlideItemAnimator.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else {
                SlideItemAnimator.this.dispatchChangeStarting(this.f7029a.f7031a, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f7030a;
        public final /* synthetic */ View b;
        public final /* synthetic */ ViewPropertyAnimator c;

        public h(i iVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f7030a = iVar;
            this.b = view;
            this.c = viewPropertyAnimator;
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/recycler/SlideItemAnimator$8");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            this.c.setListener(null);
            this.b.setAlpha(1.0f);
            this.b.setTranslationX(0.0f);
            SlideItemAnimator.this.dispatchChangeFinished(this.f7030a.b, false);
            SlideItemAnimator.this.w.remove(this.f7030a.b);
            SlideItemAnimator.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            SlideItemAnimator.this.dispatchChangeStarting(this.f7030a.b, false);
            this.b.setAlpha(1.0f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public final RecyclerView.ViewHolder f7032a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        static {
            t2o.a(912263086);
        }

        public j(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            this.f7032a = viewHolder;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    static {
        t2o.a(912263076);
    }

    public static /* synthetic */ Object ipc$super(SlideItemAnimator slideItemAnimator, String str, Object... objArr) {
        if (str.hashCode() == -163964024) {
            return new Boolean(super.canReuseUpdatedViewHolder((RecyclerView.ViewHolder) objArr[0], (List) objArr[1]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/recycler/SlideItemAnimator");
    }

    public void a(i iVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20c2a73a", new Object[]{this, iVar});
            return;
        }
        RecyclerView.ViewHolder viewHolder = iVar.f7031a;
        View view2 = null;
        if (viewHolder == null) {
            view = null;
        } else {
            view = viewHolder.itemView;
        }
        RecyclerView.ViewHolder viewHolder2 = iVar.b;
        if (viewHolder2 != null) {
            view2 = viewHolder2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.w.add(iVar.f7031a);
            duration.translationX(iVar.c);
            duration.setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.w.add(iVar.b);
            animate.translationX(iVar.e);
            animate.setDuration(getChangeDuration()).setListener(new h(iVar, view2, animate)).start();
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b67518ef", new Object[]{this, viewHolder})).booleanValue();
        }
        resetAnimation(viewHolder);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setAlpha(0.0f);
        this.n.add(viewHolder);
        return true;
    }

    public void animateAddImpl(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb989f2b", new Object[]{this, viewHolder});
            return;
        }
        View view = viewHolder.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.t.add(viewHolder);
        animate.translationX(d(viewHolder, 1)).setDuration(getAddDuration()).setListener(new e(viewHolder, view, animate)).start();
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cb08f04", new Object[]{this, viewHolder, viewHolder2, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)})).booleanValue();
        }
        if (viewHolder == viewHolder2) {
            return animateMove(viewHolder, i2, i3, i4, i5);
        }
        if (viewHolder.getItemViewType() == viewHolder2.getItemViewType()) {
            return animateMove(viewHolder, i2, i3, i2, i3) | animateMove(viewHolder2, i4, i5, i4, i5);
        }
        float d2 = d(viewHolder, 2);
        float d3 = d(viewHolder2, 1);
        resetAnimation(viewHolder);
        resetAnimation(viewHolder2);
        viewHolder2.itemView.setAlpha(0.0f);
        this.p.add(new i(viewHolder, viewHolder2, d2, i3, d3, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateMove(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc68e501", new Object[]{this, viewHolder, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)})).booleanValue();
        }
        View view = viewHolder.itemView;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) viewHolder.itemView.getTranslationY());
        resetAnimation(viewHolder);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.o.add(new j(viewHolder, translationX, translationY, i4, i5));
        return true;
    }

    public void animateMoveImpl(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33e6923d", new Object[]{this, viewHolder, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        View view = viewHolder.itemView;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.u.add(viewHolder);
        animate.setDuration(getMoveDuration()).setListener(new f(viewHolder, i6, view, i7, animate)).start();
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("763d7d74", new Object[]{this, viewHolder})).booleanValue();
        }
        resetAnimation(viewHolder);
        this.m.add(viewHolder);
        return true;
    }

    public final void animateRemoveImpl(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe13930", new Object[]{this, viewHolder});
            return;
        }
        View view = viewHolder.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.v.add(viewHolder);
        animate.setDuration(getRemoveDuration()).translationX(d(viewHolder, 2)).setListener(new d(viewHolder, animate, view)).start();
    }

    public final void b(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b574e52", new Object[]{this, iVar});
            return;
        }
        RecyclerView.ViewHolder viewHolder = iVar.f7031a;
        if (viewHolder != null) {
            c(iVar, viewHolder);
        }
        RecyclerView.ViewHolder viewHolder2 = iVar.b;
        if (viewHolder2 != null) {
            c(iVar, viewHolder2);
        }
    }

    public final boolean c(i iVar, RecyclerView.ViewHolder viewHolder) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5427667a", new Object[]{this, iVar, viewHolder})).booleanValue();
        }
        if (iVar.b == viewHolder) {
            iVar.b = null;
        } else if (iVar.f7031a != viewHolder) {
            return false;
        } else {
            iVar.f7031a = null;
            z = true;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        dispatchChangeFinished(viewHolder, z);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f63a1b88", new Object[]{this, viewHolder, list})).booleanValue();
        }
        if (!list.isEmpty() || super.canReuseUpdatedViewHolder(viewHolder, list)) {
            return true;
        }
        return false;
    }

    public void cancelAll(List<RecyclerView.ViewHolder> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f14a82bf", new Object[]{this, list});
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    public final float d(RecyclerView.ViewHolder viewHolder, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c99863c", new Object[]{this, viewHolder, new Integer(i2)})).floatValue();
        }
        View view = viewHolder.itemView;
        int width = view.getWidth();
        if (!(viewHolder instanceof oaz)) {
            return 0.0f;
        }
        int a2 = ((oaz) viewHolder).a(i2);
        if (a2 == 1) {
            return -width;
        }
        if (a2 == 2) {
            view.setTranslationX(-width);
            return 0.0f;
        } else if (a2 == 3) {
            return width;
        } else {
            if (a2 != 4) {
                return 0.0f;
            }
            view.setTranslationX(width);
            return 0.0f;
        }
    }

    public void dispatchFinishedWhenDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5111bd8f", new Object[]{this});
        } else if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c709694", new Object[]{this, viewHolder});
            return;
        }
        View view = viewHolder.itemView;
        view.animate().cancel();
        for (int size = this.o.size() - 1; size >= 0; size--) {
            if (this.o.get(size).f7032a == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(viewHolder);
                this.o.remove(size);
            }
        }
        endChangeAnimation(this.p, viewHolder);
        if (this.m.remove(viewHolder)) {
            view.setTranslationX(0.0f);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.n.remove(viewHolder)) {
            view.setAlpha(1.0f);
            view.setTranslationX(0.0f);
            dispatchAddFinished(viewHolder);
        }
        for (int size2 = this.s.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.s.get(size2);
            endChangeAnimation(arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.s.remove(size2);
            }
        }
        for (int size3 = this.r.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.r.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f7032a == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(viewHolder);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.r.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.q.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.ViewHolder> arrayList3 = this.q.get(size5);
            if (arrayList3.remove(viewHolder)) {
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                dispatchAddFinished(viewHolder);
                if (arrayList3.isEmpty()) {
                    this.q.remove(size5);
                }
            }
        }
        this.v.remove(viewHolder);
        this.t.remove(viewHolder);
        this.w.remove(viewHolder);
        this.u.remove(viewHolder);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4865c431", new Object[]{this});
            return;
        }
        for (int size = this.o.size() - 1; size >= 0; size--) {
            j jVar = this.o.get(size);
            View view = jVar.f7032a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(jVar.f7032a);
            this.o.remove(size);
        }
        for (int size2 = this.m.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.m.get(size2));
            this.m.remove(size2);
        }
        for (int size3 = this.n.size() - 1; size3 >= 0; size3--) {
            RecyclerView.ViewHolder viewHolder = this.n.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            viewHolder.itemView.setTranslationX(0.0f);
            dispatchAddFinished(viewHolder);
            this.n.remove(size3);
        }
        for (int size4 = this.p.size() - 1; size4 >= 0; size4--) {
            b(this.p.get(size4));
        }
        this.p.clear();
        if (isRunning()) {
            for (int size5 = this.r.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.r.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f7032a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(jVar2.f7032a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.r.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.q.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.ViewHolder> arrayList2 = this.q.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder2 = arrayList2.get(size8);
                    View view3 = viewHolder2.itemView;
                    view3.setAlpha(1.0f);
                    view3.setTranslationX(0.0f);
                    dispatchAddFinished(viewHolder2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.q.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.s.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.s.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    b(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.s.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.v);
            cancelAll(this.u);
            cancelAll(this.t);
            cancelAll(this.w);
            dispatchAnimationsFinished();
        }
    }

    public final void endChangeAnimation(List<i> list, RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4088b35", new Object[]{this, list, viewHolder});
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (c(iVar, viewHolder) && iVar.f7031a == null && iVar.b == null) {
                list.remove(iVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6a3f40", new Object[]{this})).booleanValue();
        }
        if (!this.n.isEmpty() || !this.p.isEmpty() || !this.o.isEmpty() || !this.m.isEmpty() || !this.u.isEmpty() || !this.v.isEmpty() || !this.t.isEmpty() || !this.w.isEmpty() || !this.r.isEmpty() || !this.q.isEmpty() || !this.s.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void resetAnimation(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8939dda0", new Object[]{this, viewHolder});
            return;
        }
        if (x == null) {
            x = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(x);
        endAnimation(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24af622", new Object[]{this});
            return;
        }
        boolean isEmpty = this.m.isEmpty();
        boolean isEmpty2 = this.o.isEmpty();
        boolean isEmpty3 = this.p.isEmpty();
        boolean isEmpty4 = this.n.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            Iterator<RecyclerView.ViewHolder> it = this.m.iterator();
            while (it.hasNext()) {
                animateRemoveImpl(it.next());
            }
            this.m.clear();
            if (!isEmpty2) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.o);
                this.r.add(arrayList);
                this.o.clear();
                new a(arrayList).run();
            }
            if (!isEmpty3) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.p);
                this.s.add(arrayList2);
                this.p.clear();
                new b(arrayList2).run();
            }
            if (!isEmpty4) {
                ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.n);
                this.q.add(arrayList3);
                this.n.clear();
                new c(arrayList3).run();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.ViewHolder f7031a;
        public RecyclerView.ViewHolder b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        static {
            t2o.a(912263085);
        }

        public i(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            this.f7031a = viewHolder;
            this.b = viewHolder2;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ChangeInfo{oldHolder=" + this.f7031a + ", newHolder=" + this.b + ", oldToX=" + this.c + ", oldToY=" + this.d + ", newToX=" + this.e + ", newToY=" + this.f + '}';
        }

        public i(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, float f, float f2, float f3, float f4) {
            this(viewHolder, viewHolder2);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }
    }
}
