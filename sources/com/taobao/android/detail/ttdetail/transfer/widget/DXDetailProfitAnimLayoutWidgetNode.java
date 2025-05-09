package com.taobao.android.detail.ttdetail.transfer.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailBaseActivity;
import com.taobao.android.dinamicx.view.DXLinearLayoutManager;
import com.taobao.android.dinamicx.view.DXNativeRecyclerView;
import com.taobao.android.dinamicx.widget.DXScrollerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.qub;
import tb.t26;
import tb.t2o;
import tb.tgh;
import tb.tq4;
import tb.vbn;
import tb.viq;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DXDetailProfitAnimLayoutWidgetNode extends DXScrollerLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXDETAILPROFITANIMLAYOUT_ANIMOPERATOR = -8952543838621140739L;
    public static final long DXDETAILPROFITANIMLAYOUT_DETAILPROFITANIMLAYOUT = -4767309073635094048L;
    public static final long DXDETAILPROFITANIMLAYOUT_SOURCE = 10151057539444055L;
    public String C0;
    public String D0;
    public List<f> E0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class DetailProfitAnimRecyclerView extends DXNativeRecyclerView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Runnable mAddAnimRunnable;

        static {
            t2o.a(912262686);
        }

        public DetailProfitAnimRecyclerView(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(DetailProfitAnimRecyclerView detailProfitAnimRecyclerView, String str, Object... objArr) {
            if (str.hashCode() == 949399698) {
                super.onDetachedFromWindow();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/widget/DXDetailProfitAnimLayoutWidgetNode$DetailProfitAnimRecyclerView");
        }

        private void onDetachedFromWindowInternal() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e7ae9ef", new Object[]{this});
                return;
            }
            Runnable runnable = this.mAddAnimRunnable;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            if (getAdapter() instanceof ProfitAnimAdapter) {
                ((ProfitAnimAdapter) getAdapter()).c();
            }
        }

        @Override // com.taobao.android.dinamicx.view.DXNativeRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3896b092", new Object[]{this});
                return;
            }
            super.onDetachedFromWindow();
            onDetachedFromWindowInternal();
        }

        public void removeAddAnimRunnable() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8908b972", new Object[]{this});
                return;
            }
            Runnable runnable = this.mAddAnimRunnable;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
        }

        public void setAddAnimRunnable(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2f93552", new Object[]{this, runnable});
            } else {
                this.mAddAnimRunnable = runnable;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class DetailProfitLinearLayoutManager extends DXLinearLayoutManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262687);
        }

        public DetailProfitLinearLayoutManager(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(DetailProfitLinearLayoutManager detailProfitLinearLayoutManager, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/widget/DXDetailProfitAnimLayoutWidgetNode$DetailProfitLinearLayoutManager");
        }

        public float a(DisplayMetrics displayMetrics) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("36b844a2", new Object[]{this, displayMetrics})).floatValue();
            }
            if (displayMetrics == null || (i = displayMetrics.densityDpi) == 0) {
                return 0.0f;
            }
            return 120.0f / i;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a873752a", new Object[]{this, recyclerView, state, new Integer(i)});
                return;
            }
            LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(tq4.d(recyclerView)) { // from class: com.taobao.android.detail.ttdetail.transfer.widget.DXDetailProfitAnimLayoutWidgetNode.DetailProfitLinearLayoutManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/widget/DXDetailProfitAnimLayoutWidgetNode$DetailProfitLinearLayoutManager$1");
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue();
                    }
                    return 120.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
                public PointF computeScrollVectorForPosition(int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (PointF) ipChange2.ipc$dispatch("d3d13928", new Object[]{this, new Integer(i2)});
                    }
                    return DetailProfitLinearLayoutManager.this.computeScrollVectorForPosition(i2);
                }
            };
            linearSmoothScroller.setTargetPosition(i);
            startSmoothScroll(linearSmoothScroller);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class ProfitAnimAdapter extends DXScrollerLayout.ScrollerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public ValueAnimator K;
        public List<ValueAnimator> L;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f6955a;
            public final /* synthetic */ int b;

            public a(View view, int i) {
                this.f6955a = view;
                this.b = i;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f6955a.setAlpha(floatValue);
                this.f6955a.getLayoutParams().width = (int) (this.b * floatValue);
                this.f6955a.requestLayout();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements Animator.AnimatorListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ List f6956a;
            public final /* synthetic */ f b;

            public b(ProfitAnimAdapter profitAnimAdapter, List list, f fVar) {
                this.f6956a = list;
                this.b = fVar;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    return;
                }
                this.f6956a.remove(this.b);
                tgh.b("DXDetailProfitAnimLayoutWidgetNode", "addAnimator cancel");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                this.f6956a.remove(this.b);
                tgh.b("DXDetailProfitAnimLayoutWidgetNode", "addAnimator end");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }
        }

        static {
            t2o.a(912262690);
        }

        public ProfitAnimAdapter(Context context, DXScrollerLayout dXScrollerLayout) {
            super(context, dXScrollerLayout);
        }

        public static /* synthetic */ Object ipc$super(ProfitAnimAdapter profitAnimAdapter, String str, Object... objArr) {
            if (str.hashCode() == -1441289013) {
                super.onBindViewHolder((RecyclerView.ViewHolder) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/widget/DXDetailProfitAnimLayoutWidgetNode$ProfitAnimAdapter");
        }

        public void a(RecyclerView.ViewHolder viewHolder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd54c96e", new Object[]{this, viewHolder, new Integer(i)});
            } else {
                b(viewHolder, i);
            }
        }

        public void b(RecyclerView.ViewHolder viewHolder, int i) {
            List b2;
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cb69a71", new Object[]{this, viewHolder, new Integer(i)});
            } else if (viewHolder instanceof DXScrollerLayout.ScrollerAdapter.ItemViewHolder) {
                DXScrollerLayout.ScrollerAdapter.ItemViewHolder itemViewHolder = (DXScrollerLayout.ScrollerAdapter.ItemViewHolder) viewHolder;
                DXWidgetNode dXWidgetNode = itemViewHolder.f7392a;
                DXWidgetNode item = getItem(i);
                if (!(dXWidgetNode == null || item == null)) {
                    String userId = dXWidgetNode.getUserId();
                    if (TextUtils.equals(userId, item.getUserId())) {
                        DXScrollerLayout dXScrollerLayout = this.scrollerLayout;
                        if ((dXScrollerLayout instanceof DXDetailProfitAnimLayoutWidgetNode) && (b2 = DXDetailProfitAnimLayoutWidgetNode.b((DXDetailProfitAnimLayoutWidgetNode) dXScrollerLayout)) != null) {
                            for (int i3 = 0; i3 < b2.size(); i3++) {
                                f fVar = (f) b2.get(i3);
                                if (fVar != null && fVar.f6962a == i && TextUtils.equals(fVar.b, userId)) {
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    View view = itemViewHolder.itemView;
                                    if (!(view == null || (i2 = view.getLayoutParams().width) == 0)) {
                                        ofFloat.setDuration(500L);
                                        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                                        ofFloat.addUpdateListener(new a(view, i2));
                                        ofFloat.addListener(new b(this, b2, fVar));
                                        if (this.L == null) {
                                            this.L = new ArrayList();
                                        }
                                        ((ArrayList) this.L).add(ofFloat);
                                        ofFloat.start();
                                        tgh.b("DXDetailProfitAnimLayoutWidgetNode", "addAnimator start");
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3896b092", new Object[]{this});
            } else {
                d();
            }
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e7ae9ef", new Object[]{this});
                return;
            }
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K.removeAllUpdateListeners();
                this.K.removeAllListeners();
            }
            List<ValueAnimator> list = this.L;
            if (list != null) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    ValueAnimator valueAnimator2 = (ValueAnimator) it.next();
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        valueAnimator2.removeAllUpdateListeners();
                        valueAnimator2.removeAllListeners();
                    }
                }
                ((ArrayList) this.L).clear();
            }
        }

        public void e(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75d2c20", new Object[]{this, valueAnimator});
            } else {
                this.K = valueAnimator;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            String userId;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
            }
            DXWidgetNode item = getItem(i);
            if (item == null || (userId = item.getUserId()) == null) {
                return 0;
            }
            return userId.hashCode();
        }

        @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout.ScrollerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
                return;
            }
            super.onBindViewHolder(viewHolder, i);
            a(viewHolder, i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ze7 f6957a;
        public final /* synthetic */ RecyclerView b;
        public final /* synthetic */ DXScrollerLayout.ScrollerAdapter c;
        public final /* synthetic */ DXScrollerLayout d;
        public final /* synthetic */ Context e;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.detail.ttdetail.transfer.widget.DXDetailProfitAnimLayoutWidgetNode$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC0385a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0385a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                DXDetailProfitAnimLayoutWidgetNode.a(DXDetailProfitAnimLayoutWidgetNode.this, aVar.b, aVar.c, aVar.d, aVar.e);
            }
        }

        public a(ze7 ze7Var, RecyclerView recyclerView, DXScrollerLayout.ScrollerAdapter scrollerAdapter, DXScrollerLayout dXScrollerLayout, Context context) {
            this.f6957a = ze7Var;
            this.b = recyclerView;
            this.c = scrollerAdapter;
            this.d = dXScrollerLayout;
            this.e = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (vbn.a(this.f6957a)) {
                RunnableC0385a aVar = new RunnableC0385a();
                RecyclerView recyclerView = this.b;
                if (recyclerView instanceof DetailProfitAnimRecyclerView) {
                    ((DetailProfitAnimRecyclerView) recyclerView).removeAddAnimRunnable();
                    ((DetailProfitAnimRecyclerView) this.b).setAddAnimRunnable(aVar);
                }
                this.b.postDelayed(aVar, 500L);
                tgh.b("DXDetailProfitAnimLayoutWidgetNode", "triggerAddAnim delayAnim");
            } else {
                RecyclerView recyclerView2 = this.b;
                if (recyclerView2 instanceof DetailProfitAnimRecyclerView) {
                    ((DetailProfitAnimRecyclerView) recyclerView2).removeAddAnimRunnable();
                }
                DXDetailProfitAnimLayoutWidgetNode.a(DXDetailProfitAnimLayoutWidgetNode.this, this.b, this.c, this.d, this.e);
                tgh.b("DXDetailProfitAnimLayoutWidgetNode", "triggerAddAnim not delayAnim");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXScrollerLayout.ScrollerAdapter f6959a;
        public final /* synthetic */ DXScrollerLayout b;
        public final /* synthetic */ RecyclerView c;

        public b(DXScrollerLayout.ScrollerAdapter scrollerAdapter, DXScrollerLayout dXScrollerLayout, RecyclerView recyclerView) {
            this.f6959a = scrollerAdapter;
            this.b = dXScrollerLayout;
            this.c = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            DXScrollerLayout dXScrollerLayout;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DXScrollerLayout.ScrollerAdapter scrollerAdapter = this.f6959a;
            if (scrollerAdapter != null && (dXScrollerLayout = this.b) != null) {
                scrollerAdapter.setScrollerLayout(dXScrollerLayout);
                this.f6959a.setDataSource(this.b._getItemWidgetNodes());
                this.f6959a.notifyDataSetChanged();
                this.c.scrollToPosition(0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f6960a;
        public final /* synthetic */ List b;

        public c(List list, List list2) {
            this.f6960a = list;
            this.b = list2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (int i = 0; i < this.f6960a.size(); i++) {
                View view = (View) this.f6960a.get(i);
                if (view != null) {
                    view.getLayoutParams().width = (int) (((Integer) this.b.get(i)).intValue() * floatValue);
                    view.setAlpha(floatValue);
                    view.requestLayout();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXScrollerLayout.ScrollerAdapter f6961a;
        public final /* synthetic */ DXScrollerLayout b;

        public d(DXDetailProfitAnimLayoutWidgetNode dXDetailProfitAnimLayoutWidgetNode, DXScrollerLayout.ScrollerAdapter scrollerAdapter, DXScrollerLayout dXScrollerLayout) {
            this.f6961a = scrollerAdapter;
            this.b = dXScrollerLayout;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            DXScrollerLayout dXScrollerLayout;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            DXScrollerLayout.ScrollerAdapter scrollerAdapter = this.f6961a;
            if (scrollerAdapter != null && (dXScrollerLayout = this.b) != null) {
                scrollerAdapter.setScrollerLayout(dXScrollerLayout);
                this.f6961a.setDataSource(this.b._getItemWidgetNodes());
                this.f6961a.notifyDataSetChanged();
                tgh.b("DXDetailProfitAnimLayoutWidgetNode", "triggerRemoveAnim onAnimationCancel");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            DXScrollerLayout dXScrollerLayout;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            DXScrollerLayout.ScrollerAdapter scrollerAdapter = this.f6961a;
            if (scrollerAdapter != null && (dXScrollerLayout = this.b) != null) {
                scrollerAdapter.setScrollerLayout(dXScrollerLayout);
                this.f6961a.setDataSource(this.b._getItemWidgetNodes());
                this.f6961a.notifyDataSetChanged();
                tgh.b("DXDetailProfitAnimLayoutWidgetNode", "triggerRemoveAnim onAnimationEnd");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262685);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXDetailProfitAnimLayoutWidgetNode();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f6962a;
        public final String b;

        static {
            t2o.a(912262689);
        }

        public f(int i, String str) {
            this.f6962a = i;
            this.b = str;
        }
    }

    static {
        t2o.a(912262679);
    }

    public static /* synthetic */ void a(DXDetailProfitAnimLayoutWidgetNode dXDetailProfitAnimLayoutWidgetNode, RecyclerView recyclerView, DXScrollerLayout.ScrollerAdapter scrollerAdapter, DXScrollerLayout dXScrollerLayout, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be117fa6", new Object[]{dXDetailProfitAnimLayoutWidgetNode, recyclerView, scrollerAdapter, dXScrollerLayout, context});
        } else {
            dXDetailProfitAnimLayoutWidgetNode.s0(recyclerView, scrollerAdapter, dXScrollerLayout, context);
        }
    }

    public static /* synthetic */ List b(DXDetailProfitAnimLayoutWidgetNode dXDetailProfitAnimLayoutWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("17588862", new Object[]{dXDetailProfitAnimLayoutWidgetNode});
        }
        return dXDetailProfitAnimLayoutWidgetNode.E0;
    }

    public static /* synthetic */ Object ipc$super(DXDetailProfitAnimLayoutWidgetNode dXDetailProfitAnimLayoutWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/widget/DXDetailProfitAnimLayoutWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXDetailProfitAnimLayoutWidgetNode();
    }

    public final JSONArray c(JSONArray jSONArray) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("1da4681a", new Object[]{this, jSONArray});
        }
        if (jSONArray == null || jSONArray.size() == 0) {
            return jSONArray;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        JSONArray jSONArray2 = new JSONArray();
        e(jSONArray, jSONArray2, arrayList, arrayList2);
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return jSONArray;
        }
        if (jSONArray2.isEmpty()) {
            return jSONArray;
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            int intValue = arrayList2.get(i).intValue();
            if (intValue >= 0 && intValue < jSONArray2.size() && jSONArray2.get(intValue) != null) {
                jSONArray2.remove(intValue);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            int intValue2 = arrayList.get(i2).intValue();
            if (intValue2 >= 0 && intValue2 < jSONArray.size() && (obj = jSONArray.get(intValue2)) != null) {
                arrayList3.add(obj);
            }
        }
        if (!arrayList3.isEmpty()) {
            jSONArray2.addAll(0, arrayList3);
        }
        return jSONArray2;
    }

    public final boolean d(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23351124", new Object[]{this, jSONArray})).booleanValue();
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        e(jSONArray, null, arrayList, arrayList2);
        if (!arrayList.isEmpty() || arrayList2.isEmpty()) {
            return false;
        }
        return true;
    }

    public final ze7 m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("ee649aeb", new Object[]{this});
        }
        Context h = getDXRuntimeContext().h();
        if (!(h instanceof TTDetailBaseActivity)) {
            return null;
        }
        return ((TTDetailBaseActivity) h).q3();
    }

    public final float n0(Context context, int i, DetailProfitLinearLayoutManager detailProfitLinearLayoutManager) {
        Resources resources;
        DisplayMetrics displayMetrics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de906d6f", new Object[]{this, context, new Integer(i), detailProfitLinearLayoutManager})).floatValue();
        }
        if (detailProfitLinearLayoutManager == null || i == 0 || context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return 0.0f;
        }
        return detailProfitLinearLayoutManager.a(displayMetrics) * i;
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout
    public DXLinearLayoutManager newLinearLayoutManager(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXLinearLayoutManager) ipChange.ipc$dispatch("ab4f4def", new Object[]{this, context});
        }
        return new DetailProfitLinearLayoutManager(context);
    }

    public final boolean o0(JSONArray jSONArray, JSONArray jSONArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13a2e37e", new Object[]{this, jSONArray, jSONArray2})).booleanValue();
        }
        if (jSONArray == null || jSONArray2 == null || jSONArray.size() == 0 || jSONArray2.size() == 0 || jSONArray == jSONArray2 || jSONArray.size() != jSONArray2.size()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            String string = jSONArray.getString(i);
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            arrayList.add(string);
        }
        for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
            String string2 = jSONArray2.getString(i2);
            if (TextUtils.isEmpty(string2)) {
                return false;
            }
            arrayList2.add(string2);
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (!arrayList2.contains(arrayList.get(i3))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof DXDetailProfitAnimLayoutWidgetNode)) {
            super.onClone(dXWidgetNode, z);
            DXDetailProfitAnimLayoutWidgetNode dXDetailProfitAnimLayoutWidgetNode = (DXDetailProfitAnimLayoutWidgetNode) dXWidgetNode;
            this.C0 = dXDetailProfitAnimLayoutWidgetNode.C0;
            this.D0 = dXDetailProfitAnimLayoutWidgetNode.D0;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        View onCreateView = super.onCreateView(context);
        if (onCreateView instanceof RecyclerView) {
            ((RecyclerView) onCreateView).setItemAnimator(null);
        }
        if (onCreateView instanceof DXNativeRecyclerView) {
            ((DXNativeRecyclerView) onCreateView).setEnableSmoothScroll(true);
        }
        return onCreateView;
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else {
            super.onRenderView(context, view);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
            return;
        }
        if (j == t26.DX_PARSER_LISTDATA) {
            if (TextUtils.equals(this.C0, "add")) {
                JSONArray c2 = c(jSONArray);
                if (o0(jSONArray, c2)) {
                    tgh.b("DXDetailProfitAnimLayoutWidgetNode", "adjustListDataOrderAndCopy success");
                    jSONArray = c2;
                }
            } else if (TextUtils.equals(this.C0, "remove")) {
                vbn.b(m0(), d(jSONArray));
            }
            u0(jSONArray);
        }
        super.onSetListAttribute(j, jSONArray);
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXDETAILPROFITANIMLAYOUT_ANIMOPERATOR) {
            this.C0 = str;
        } else if (j == 10151057539444055L) {
            this.D0 = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final boolean p0(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b69b2470", new Object[]{this, arrayList, arrayList2})).booleanValue();
        }
        int[] iArr = new int[arrayList2.size() + 3];
        for (int i = 0; i < arrayList2.size(); i++) {
            iArr[i] = -1;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                if (TextUtils.equals(arrayList.get(i2), arrayList2.get(i3))) {
                    iArr[i3] = i2;
                }
            }
        }
        int i4 = -1;
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            int i6 = iArr[i5];
            if (i6 > -1) {
                if (i4 > i6) {
                    return true;
                }
                i4 = i6;
            }
        }
        return false;
    }

    public final ArrayList<String> r0(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ab8e7c44", new Object[]{this, jSONArray});
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (!(jSONArray == null || jSONArray.size() == 0)) {
            for (int i = 0; i < jSONArray.size(); i++) {
                if (!TextUtils.isEmpty(jSONArray.getString(i))) {
                    arrayList.add(jSONArray.getString(i));
                }
            }
        }
        return arrayList;
    }

    public final void u0(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c33554f", new Object[]{this, jSONArray});
            return;
        }
        ze7 m0 = m0();
        if (m0 != null) {
            try {
                if (!m0.e().o()) {
                    m0.i().f("realData" + this.D0, jSONArray);
                }
            } catch (Exception e2) {
                tgh.c("DXDetailProfitAnimLayoutWidgetNode", "setLastListData error", e2);
            }
        }
    }

    public final void s0(RecyclerView recyclerView, DXScrollerLayout.ScrollerAdapter scrollerAdapter, DXScrollerLayout dXScrollerLayout, Context context) {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9691953a", new Object[]{this, recyclerView, scrollerAdapter, dXScrollerLayout, context});
            return;
        }
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (computeHorizontalScrollOffset <= 0 || !(layoutManager instanceof DetailProfitLinearLayoutManager)) {
            f2 = 0.0f;
        } else {
            f2 = n0(context, computeHorizontalScrollOffset, (DetailProfitLinearLayoutManager) layoutManager);
            tgh.b("DXDetailProfitAnimLayoutWidgetNode", "scrollAndUpdate duration: " + f2);
        }
        if (f2 > 0.0f && recyclerView.getChildCount() > 0) {
            recyclerView.smoothScrollToPosition(0);
            recyclerView.postDelayed(new b(scrollerAdapter, dXScrollerLayout, recyclerView), f2);
        } else if (scrollerAdapter != null && dXScrollerLayout != null) {
            scrollerAdapter.setScrollerLayout(dXScrollerLayout);
            scrollerAdapter.setDataSource(this.itemWidgetNodes);
            scrollerAdapter.notifyDataSetChanged();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout
    public void setAdapter(DXScrollerLayout dXScrollerLayout, RecyclerView recyclerView, Context context) {
        ze7 q3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c19e8ee", new Object[]{this, dXScrollerLayout, recyclerView, context});
            return;
        }
        DXScrollerLayout.ScrollerAdapter scrollerAdapter = (DXScrollerLayout.ScrollerAdapter) recyclerView.getAdapter();
        ArrayList<String> r0 = r0(getListData());
        List<f> list = this.E0;
        if (list != null) {
            ((ArrayList) list).clear();
        }
        if (scrollerAdapter == null) {
            ProfitAnimAdapter profitAnimAdapter = new ProfitAnimAdapter(context, dXScrollerLayout);
            profitAnimAdapter.setHasStableIds(true);
            profitAnimAdapter.setDataSource(dXScrollerLayout._getItemWidgetNodes());
            recyclerView.setAdapter(profitAnimAdapter);
        } else if (!q0(dXScrollerLayout, scrollerAdapter, context, r0, recyclerView)) {
            scrollerAdapter.setScrollerLayout(dXScrollerLayout);
            scrollerAdapter.setDataSource(dXScrollerLayout._getItemWidgetNodes());
            scrollerAdapter.notifyDataSetChanged();
            tgh.b("DXDetailProfitAnimLayoutWidgetNode", "setAdapter notifyDataSetChanged not anim");
        }
        if ((context instanceof TTDetailBaseActivity) && (q3 = ((TTDetailBaseActivity) context).q3()) != null) {
            try {
                if (!q3.e().o()) {
                    q3.i().f("DXDetailProfitAnimLayoutWidgetNode" + this.D0, r0);
                }
            } catch (Exception e2) {
                tgh.c("DXDetailProfitAnimLayoutWidgetNode", "setAdapter store state err", e2);
            }
        }
    }

    public final void e(JSONArray jSONArray, JSONArray jSONArray2, ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef3fa4a5", new Object[]{this, jSONArray, jSONArray2, arrayList, arrayList2});
            return;
        }
        ze7 m0 = m0();
        if (m0 != null) {
            try {
                viq i = m0.i();
                JSONArray jSONArray3 = (JSONArray) i.c("realData" + this.D0);
                if (!(jSONArray3 == null || jSONArray == null || jSONArray3.size() == 0 || jSONArray.size() == 0)) {
                    if (jSONArray2 != null) {
                        jSONArray2.addAll(jSONArray3);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (int i2 = 0; i2 < jSONArray3.size(); i2++) {
                        String string = jSONArray3.getString(i2);
                        if (!TextUtils.isEmpty(string)) {
                            arrayList3.add(string);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (int i3 = 0; i3 < jSONArray.size(); i3++) {
                        String string2 = jSONArray.getString(i3);
                        if (!TextUtils.isEmpty(string2)) {
                            arrayList4.add(string2);
                        }
                    }
                    for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                        if (!arrayList4.contains(arrayList3.get(i4))) {
                            arrayList2.add(Integer.valueOf(i4));
                        }
                    }
                    for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                        if (!arrayList3.contains(arrayList4.get(i5))) {
                            arrayList.add(Integer.valueOf(i5));
                        }
                    }
                }
            } catch (Exception e2) {
                tgh.c("DXDetailProfitAnimLayoutWidgetNode", "getLastListData error", e2);
            }
        }
    }

    public final boolean q0(DXScrollerLayout dXScrollerLayout, DXScrollerLayout.ScrollerAdapter scrollerAdapter, Context context, ArrayList<String> arrayList, RecyclerView recyclerView) {
        ze7 q3;
        ArrayList<String> arrayList2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b698a87", new Object[]{this, dXScrollerLayout, scrollerAdapter, context, arrayList, recyclerView})).booleanValue();
        }
        if (!(context instanceof TTDetailBaseActivity) || arrayList == null || arrayList.size() == 0 || (q3 = ((TTDetailBaseActivity) context).q3()) == null) {
            return false;
        }
        try {
            arrayList2 = (ArrayList) q3.i().c("DXDetailProfitAnimLayoutWidgetNode" + this.D0);
        } catch (Exception unused) {
            arrayList2 = null;
        }
        if (arrayList2 == null || arrayList2.size() == 0 || p0(arrayList2, arrayList)) {
            return false;
        }
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (!arrayList2.contains(arrayList.get(i))) {
                arrayList3.add(Integer.valueOf(i));
            }
        }
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            if (!arrayList.contains(arrayList2.get(i2))) {
                arrayList4.add(Integer.valueOf(i2));
            }
        }
        if (!(arrayList3.isEmpty() || arrayList4.isEmpty())) {
            return false;
        }
        if (arrayList3.isEmpty() || !TextUtils.equals(this.C0, "add")) {
            if (!arrayList4.isEmpty() && TextUtils.equals(this.C0, "remove")) {
                w0(recyclerView, scrollerAdapter, dXScrollerLayout, arrayList4);
                return true;
            }
            return false;
        }
        v0(recyclerView, scrollerAdapter, dXScrollerLayout, arrayList3, context, q3);
        return true;
    }

    public final void w0(RecyclerView recyclerView, DXScrollerLayout.ScrollerAdapter scrollerAdapter, DXScrollerLayout dXScrollerLayout, ArrayList<Integer> arrayList) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        View view;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aec51f6", new Object[]{this, recyclerView, scrollerAdapter, dXScrollerLayout, arrayList});
            return;
        }
        tgh.b("DXDetailProfitAnimLayoutWidgetNode", "triggerRemoveAnim start");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            int intValue = arrayList.get(i2).intValue();
            if (!(intValue < 0 || intValue >= recyclerView.getChildCount() || (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(intValue)) == null || (view = findViewHolderForAdapterPosition.itemView) == null || (i = view.getLayoutParams().width) == 0)) {
                arrayList2.add(view);
                arrayList3.add(Integer.valueOf(i));
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new c(arrayList2, arrayList3));
        ofFloat.addListener(new d(this, scrollerAdapter, dXScrollerLayout));
        if (scrollerAdapter instanceof ProfitAnimAdapter) {
            ((ProfitAnimAdapter) scrollerAdapter).e(ofFloat);
        }
        ofFloat.start();
        tgh.b("DXDetailProfitAnimLayoutWidgetNode", "triggerRemoveAnim end");
    }

    public final void v0(RecyclerView recyclerView, DXScrollerLayout.ScrollerAdapter scrollerAdapter, DXScrollerLayout dXScrollerLayout, ArrayList<Integer> arrayList, Context context, ze7 ze7Var) {
        DXWidgetNode dXWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0f7b569", new Object[]{this, recyclerView, scrollerAdapter, dXScrollerLayout, arrayList, context, ze7Var});
            return;
        }
        tgh.b("DXDetailProfitAnimLayoutWidgetNode", "triggerAddAnim start");
        ArrayList<DXWidgetNode> _getItemWidgetNodes = dXScrollerLayout._getItemWidgetNodes();
        if (this.E0 == null) {
            this.E0 = new ArrayList();
        }
        ((ArrayList) this.E0).clear();
        for (int i = 0; i < arrayList.size(); i++) {
            int intValue = arrayList.get(i).intValue();
            if (intValue >= 0 && intValue < _getItemWidgetNodes.size() && (dXWidgetNode = _getItemWidgetNodes.get(intValue)) != null) {
                String userId = dXWidgetNode.getUserId();
                if (!TextUtils.isEmpty(userId)) {
                    ((ArrayList) this.E0).add(new f(arrayList.get(i).intValue(), userId));
                }
            }
        }
        recyclerView.post(new a(ze7Var, recyclerView, scrollerAdapter, dXScrollerLayout, context));
        tgh.b("DXDetailProfitAnimLayoutWidgetNode", "triggerAddAnim end");
    }
}
