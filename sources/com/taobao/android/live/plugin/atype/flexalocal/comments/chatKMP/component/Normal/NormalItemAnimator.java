package com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.h7k;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class NormalItemAnimator extends SimpleItemAnimator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static TimeInterpolator l;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<RecyclerView.ViewHolder> f8423a = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> b = new ArrayList<>();
    public final ArrayList<i> c = new ArrayList<>();
    public final ArrayList<h> d = new ArrayList<>();
    public final ArrayList<ArrayList<RecyclerView.ViewHolder>> e = new ArrayList<>();
    public final ArrayList<ArrayList<i>> f = new ArrayList<>();
    public final ArrayList<ArrayList<h>> g = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> h = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> i = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> j = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> k = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f8424a;

        public a(ArrayList arrayList) {
            this.f8424a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Iterator it = this.f8424a.iterator();
            while (it.hasNext()) {
                NormalItemAnimator.this.animateAddImpl((RecyclerView.ViewHolder) it.next());
            }
            this.f8424a.clear();
            NormalItemAnimator.this.e.remove(this.f8424a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f8425a;

        public b(ArrayList arrayList) {
            this.f8425a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Iterator it = this.f8425a.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                NormalItemAnimator.this.animateMoveImpl(iVar.f8432a, iVar.b, iVar.c, iVar.d, iVar.e);
            }
            this.f8425a.clear();
            NormalItemAnimator.this.f.remove(this.f8425a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f8426a;

        public c(ArrayList arrayList) {
            this.f8426a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Iterator it = this.f8426a.iterator();
            while (it.hasNext()) {
                NormalItemAnimator.this.a((h) it.next());
            }
            this.f8426a.clear();
            NormalItemAnimator.this.g.remove(this.f8426a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.ViewHolder f8427a;
        public final /* synthetic */ View b;
        public final /* synthetic */ ViewPropertyAnimator c;

        public d(RecyclerView.ViewHolder viewHolder, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f8427a = viewHolder;
            this.b = view;
            this.c = viewPropertyAnimator;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/component/Normal/NormalItemAnimator$5");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                this.b.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            this.c.setListener(null);
            NormalItemAnimator.this.dispatchAddFinished(this.f8427a);
            NormalItemAnimator.this.h.remove(this.f8427a);
            NormalItemAnimator.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else {
                NormalItemAnimator.this.dispatchAddStarting(this.f8427a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.ViewHolder f8428a;
        public final /* synthetic */ int b;
        public final /* synthetic */ View c;
        public final /* synthetic */ int d;
        public final /* synthetic */ ViewPropertyAnimator e;

        public e(RecyclerView.ViewHolder viewHolder, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f8428a = viewHolder;
            this.b = i;
            this.c = view;
            this.d = i2;
            this.e = viewPropertyAnimator;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/component/Normal/NormalItemAnimator$6");
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
            NormalItemAnimator.this.dispatchMoveFinished(this.f8428a);
            NormalItemAnimator.this.i.remove(this.f8428a);
            NormalItemAnimator.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else {
                NormalItemAnimator.this.dispatchMoveStarting(this.f8428a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f8429a;
        public final /* synthetic */ ViewPropertyAnimator b;
        public final /* synthetic */ View c;

        public f(h hVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f8429a = hVar;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/component/Normal/NormalItemAnimator$7");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            this.b.setListener(null);
            this.c.setAlpha(1.0f);
            this.c.setTranslationX(0.0f);
            this.c.setTranslationY(0.0f);
            NormalItemAnimator.this.dispatchChangeFinished(this.f8429a.f8431a, true);
            NormalItemAnimator.this.k.remove(this.f8429a.f8431a);
            NormalItemAnimator.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else {
                NormalItemAnimator.this.dispatchChangeStarting(this.f8429a.f8431a, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f8430a;
        public final /* synthetic */ ViewPropertyAnimator b;
        public final /* synthetic */ View c;

        public g(h hVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f8430a = hVar;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/component/Normal/NormalItemAnimator$8");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            this.b.setListener(null);
            this.c.setAlpha(1.0f);
            this.c.setTranslationX(0.0f);
            this.c.setTranslationY(0.0f);
            NormalItemAnimator.this.dispatchChangeFinished(this.f8430a.b, false);
            NormalItemAnimator.this.k.remove(this.f8430a.b);
            NormalItemAnimator.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else {
                NormalItemAnimator.this.dispatchChangeStarting(this.f8430a.b, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public final RecyclerView.ViewHolder f8432a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        static {
            t2o.a(295698661);
        }

        public i(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            this.f8432a = viewHolder;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    static {
        t2o.a(295698651);
    }

    public static /* synthetic */ Object ipc$super(NormalItemAnimator normalItemAnimator, String str, Object... objArr) {
        if (str.hashCode() == -163964024) {
            return new Boolean(super.canReuseUpdatedViewHolder((RecyclerView.ViewHolder) objArr[0], (List) objArr[1]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/component/Normal/NormalItemAnimator");
    }

    public void a(h hVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c198b56", new Object[]{this, hVar});
            return;
        }
        RecyclerView.ViewHolder viewHolder = hVar.f8431a;
        View view2 = null;
        if (viewHolder == null) {
            view = null;
        } else {
            view = viewHolder.itemView;
        }
        RecyclerView.ViewHolder viewHolder2 = hVar.b;
        if (viewHolder2 != null) {
            view2 = viewHolder2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.k.add(hVar.f8431a);
            duration.translationX(hVar.e - hVar.c);
            duration.translationY(hVar.f - hVar.d);
            duration.alpha(0.0f).setListener(new f(hVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.k.add(hVar.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new g(hVar, animate, view2)).start();
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b67518ef", new Object[]{this, viewHolder})).booleanValue();
        }
        resetAnimation(viewHolder);
        viewHolder.itemView.setAlpha(1.0f);
        View view = viewHolder.itemView;
        view.setTranslationY(view.getMeasuredHeight());
        this.b.add(viewHolder);
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
        this.h.add(viewHolder);
        animate.translationY(0.0f).setDuration(getMoveDuration()).setListener(new d(viewHolder, view, animate)).start();
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
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        resetAnimation(viewHolder);
        int i6 = (int) ((i4 - i2) - translationX);
        int i7 = (int) ((i5 - i3) - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            resetAnimation(viewHolder2);
            viewHolder2.itemView.setTranslationX(-i6);
            viewHolder2.itemView.setTranslationY(-i7);
            viewHolder2.itemView.setAlpha(0.0f);
        }
        this.d.add(new h(viewHolder, viewHolder2, i2, i3, i4, i5));
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
        this.c.add(new i(viewHolder, translationX, translationY, i4, i5));
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
        this.i.add(viewHolder);
        animate.setDuration(getMoveDuration()).setListener(new e(viewHolder, i6, view, i7, animate)).start();
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("763d7d74", new Object[]{this, viewHolder})).booleanValue();
        }
        resetAnimation(viewHolder);
        this.f8423a.add(viewHolder);
        return true;
    }

    public final void b(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe13930", new Object[]{this, viewHolder});
            return;
        }
        View view = viewHolder.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.j.add(viewHolder);
        animate.setDuration(getRemoveDuration()).alpha((float) getChangeDuration()).setListener(new h7k(this, viewHolder, animate, view)).start();
    }

    public final void c(List<h> list, RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4088b35", new Object[]{this, list, viewHolder});
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            h hVar = list.get(size);
            if (e(hVar, viewHolder) && hVar.f8431a == null && hVar.b == null) {
                list.remove(hVar);
            }
        }
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

    public final void d(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8bd26e", new Object[]{this, hVar});
            return;
        }
        RecyclerView.ViewHolder viewHolder = hVar.f8431a;
        if (viewHolder != null) {
            e(hVar, viewHolder);
        }
        RecyclerView.ViewHolder viewHolder2 = hVar.b;
        if (viewHolder2 != null) {
            e(hVar, viewHolder2);
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

    public final boolean e(h hVar, RecyclerView.ViewHolder viewHolder) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c98a3d96", new Object[]{this, hVar, viewHolder})).booleanValue();
        }
        if (hVar.b == viewHolder) {
            hVar.b = null;
        } else if (hVar.f8431a != viewHolder) {
            return false;
        } else {
            hVar.f8431a = null;
            z = true;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(viewHolder, z);
        return true;
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
        for (int size = this.c.size() - 1; size >= 0; size--) {
            if (this.c.get(size).f8432a == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(viewHolder);
                this.c.remove(size);
            }
        }
        c(this.d, viewHolder);
        if (this.f8423a.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.b.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
        }
        for (int size2 = this.g.size() - 1; size2 >= 0; size2--) {
            ArrayList<h> arrayList = this.g.get(size2);
            c(arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.g.remove(size2);
            }
        }
        for (int size3 = this.f.size() - 1; size3 >= 0; size3--) {
            ArrayList<i> arrayList2 = this.f.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f8432a == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(viewHolder);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.e.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.ViewHolder> arrayList3 = this.e.get(size5);
            if (arrayList3.remove(viewHolder)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(viewHolder);
                if (arrayList3.isEmpty()) {
                    this.e.remove(size5);
                }
            }
        }
        this.j.remove(viewHolder);
        this.h.remove(viewHolder);
        this.k.remove(viewHolder);
        this.i.remove(viewHolder);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4865c431", new Object[]{this});
            return;
        }
        for (int size = this.c.size() - 1; size >= 0; size--) {
            i iVar = this.c.get(size);
            View view = iVar.f8432a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(iVar.f8432a);
            this.c.remove(size);
        }
        for (int size2 = this.f8423a.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.f8423a.get(size2));
            this.f8423a.remove(size2);
        }
        for (int size3 = this.b.size() - 1; size3 >= 0; size3--) {
            RecyclerView.ViewHolder viewHolder = this.b.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
            this.b.remove(size3);
        }
        for (int size4 = this.d.size() - 1; size4 >= 0; size4--) {
            d(this.d.get(size4));
        }
        this.d.clear();
        if (isRunning()) {
            for (int size5 = this.f.size() - 1; size5 >= 0; size5--) {
                ArrayList<i> arrayList = this.f.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    i iVar2 = arrayList.get(size6);
                    View view2 = iVar2.f8432a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(iVar2.f8432a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.e.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.ViewHolder> arrayList2 = this.e.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder2 = arrayList2.get(size8);
                    viewHolder2.itemView.setAlpha(1.0f);
                    dispatchAddFinished(viewHolder2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.e.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.g.size() - 1; size9 >= 0; size9--) {
                ArrayList<h> arrayList3 = this.g.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    d(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.g.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.j);
            cancelAll(this.i);
            cancelAll(this.h);
            cancelAll(this.k);
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6a3f40", new Object[]{this})).booleanValue();
        }
        if (!this.b.isEmpty() || !this.d.isEmpty() || !this.c.isEmpty() || !this.f8423a.isEmpty() || !this.i.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.k.isEmpty() || !this.f.isEmpty() || !this.e.isEmpty() || !this.g.isEmpty()) {
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
        if (l == null) {
            l = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(l);
        endAnimation(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24af622", new Object[]{this});
            return;
        }
        boolean isEmpty = this.f8423a.isEmpty();
        boolean isEmpty2 = this.c.isEmpty();
        boolean isEmpty3 = this.d.isEmpty();
        boolean isEmpty4 = this.b.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            Iterator<RecyclerView.ViewHolder> it = this.f8423a.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            this.f8423a.clear();
            if (!isEmpty4) {
                ArrayList<RecyclerView.ViewHolder> arrayList = new ArrayList<>(this.b);
                this.e.add(arrayList);
                this.b.clear();
                a aVar = new a(arrayList);
                if (!isEmpty || !isEmpty2 || !isEmpty3) {
                    ViewCompat.postOnAnimation(arrayList.get(0).itemView, aVar);
                } else {
                    aVar.run();
                }
            }
            if (!isEmpty2) {
                ArrayList<i> arrayList2 = new ArrayList<>(this.c);
                this.f.add(arrayList2);
                this.c.clear();
                b bVar = new b(arrayList2);
                if (!isEmpty) {
                    ViewCompat.postOnAnimationDelayed(arrayList2.get(0).f8432a.itemView, bVar, getMoveDuration());
                } else {
                    bVar.run();
                }
            }
            if (!isEmpty3) {
                ArrayList<h> arrayList3 = new ArrayList<>(this.d);
                this.g.add(arrayList3);
                this.d.clear();
                c cVar = new c(arrayList3);
                if (!isEmpty) {
                    ViewCompat.postOnAnimationDelayed(arrayList3.get(0).f8431a.itemView, cVar, getChangeDuration());
                } else {
                    cVar.run();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.ViewHolder f8431a;
        public RecyclerView.ViewHolder b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        static {
            t2o.a(295698660);
        }

        public h(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            this.f8431a = viewHolder;
            this.b = viewHolder2;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ChangeInfo{oldHolder=" + this.f8431a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
        }

        public h(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            this(viewHolder, viewHolder2);
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }
    }
}
