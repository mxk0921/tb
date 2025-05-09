package com.alibaba.android.aura.service.render.layout.renderhelper.aura.impl;

import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.ln;
import tb.t2o;
import tb.wn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURAReverseRenderStickyAccessibilityFixer implements View.OnLayoutChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f2140a;
    public RecyclerView.OnScrollListener b;
    public Runnable c;
    public final List<ln> d;
    public final List<ln> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AURAReverseRenderStickyAccessibilityFixer.b(AURAReverseRenderStickyAccessibilityFixer.this);
            }
        }
    }

    static {
        t2o.a(80740598);
    }

    public AURAReverseRenderStickyAccessibilityFixer(List<ln> list, List<ln> list2) {
        this.d = list;
        this.e = list2;
    }

    public static /* synthetic */ void a(AURAReverseRenderStickyAccessibilityFixer aURAReverseRenderStickyAccessibilityFixer, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f08e2", new Object[]{aURAReverseRenderStickyAccessibilityFixer, recyclerView});
        } else {
            aURAReverseRenderStickyAccessibilityFixer.e(recyclerView);
        }
    }

    public static /* synthetic */ void b(AURAReverseRenderStickyAccessibilityFixer aURAReverseRenderStickyAccessibilityFixer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe083f54", new Object[]{aURAReverseRenderStickyAccessibilityFixer});
        } else {
            aURAReverseRenderStickyAccessibilityFixer.d();
        }
    }

    public void c(View view) {
        ViewParent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f84192", new Object[]{this, view});
        } else if (view != null && wn.a(view.getContext()) && this.f2140a != (parent = view.getParent()) && (parent instanceof RecyclerView)) {
            RecyclerView recyclerView = (RecyclerView) parent;
            this.f2140a = recyclerView;
            recyclerView.addOnLayoutChangeListener(this);
            RecyclerView.OnScrollListener onScrollListener = this.b;
            if (onScrollListener != null) {
                this.f2140a.removeOnScrollListener(onScrollListener);
            }
            RecyclerView.OnScrollListener onScrollListener2 = new RecyclerView.OnScrollListener() { // from class: com.alibaba.android.aura.service.render.layout.renderhelper.aura.impl.AURAReverseRenderStickyAccessibilityFixer.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    if (str.hashCode() == 1361287682) {
                        super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                        return null;
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/layout/renderhelper/aura/impl/AURAReverseRenderStickyAccessibilityFixer$1");
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView2, new Integer(i)});
                        return;
                    }
                    super.onScrollStateChanged(recyclerView2, i);
                    if (i == 0) {
                        AURAReverseRenderStickyAccessibilityFixer.a(AURAReverseRenderStickyAccessibilityFixer.this, recyclerView2);
                    }
                }
            };
            this.b = onScrollListener2;
            this.f2140a.addOnScrollListener(onScrollListener2);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3cb83e1", new Object[]{this});
            return;
        }
        for (ln lnVar : this.d) {
            View l = lnVar.l();
            if (l != null) {
                ViewCompat.setImportantForAccessibility(l, 1);
            }
        }
        for (ln lnVar2 : this.e) {
            View l2 = lnVar2.l();
            if (l2 != null) {
                ViewCompat.setImportantForAccessibility(l2, 1);
            }
        }
    }

    public final void e(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba92bb7", new Object[]{this, recyclerView});
            return;
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            recyclerView.removeCallbacks(runnable);
        }
        a aVar = new a();
        this.c = aVar;
        recyclerView.postDelayed(aVar, 250L);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
        } else {
            d();
        }
    }
}
