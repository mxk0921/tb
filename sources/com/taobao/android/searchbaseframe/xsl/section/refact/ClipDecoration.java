package com.taobao.android.searchbaseframe.xsl.section.refact;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.xsearchplugin.muise.MuiseHolderContainer;
import java.lang.reflect.Method;
import tb.dod;
import tb.t2o;
import tb.vdc;
import tb.w7p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ClipDecoration extends RecyclerView.ItemDecoration implements vdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Rect g = new Rect();
    public static Method h;

    /* renamed from: a  reason: collision with root package name */
    public dod f9364a;
    public PartnerRecyclerView b;
    public boolean c = false;
    public boolean d = false;
    public int e;
    public int f;

    static {
        t2o.a(993002104);
        t2o.a(993002095);
    }

    public static /* synthetic */ int a(ClipDecoration clipDecoration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("299335bf", new Object[]{clipDecoration})).intValue();
        }
        return clipDecoration.f;
    }

    public static /* synthetic */ int b(ClipDecoration clipDecoration, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d025168", new Object[]{clipDecoration, new Integer(i)})).intValue();
        }
        clipDecoration.f = i;
        return i;
    }

    public static /* synthetic */ int c(ClipDecoration clipDecoration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7048bc7", new Object[]{clipDecoration})).intValue();
        }
        int i = clipDecoration.f;
        clipDecoration.f = 1 + i;
        return i;
    }

    public static /* synthetic */ void d(ClipDecoration clipDecoration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a61b44d", new Object[]{clipDecoration});
        } else {
            clipDecoration.f();
        }
    }

    public static /* synthetic */ Object ipc$super(ClipDecoration clipDecoration, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/section/refact/ClipDecoration");
    }

    public void e(PartnerRecyclerView partnerRecyclerView, dod dodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d8a700", new Object[]{this, partnerRecyclerView, dodVar});
            return;
        }
        this.f9364a = dodVar;
        this.b = partnerRecyclerView;
        partnerRecyclerView.addItemDecoration(this);
        partnerRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.searchbaseframe.xsl.section.refact.ClipDecoration.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/section/refact/ClipDecoration$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                } else if (i == 0) {
                    ClipDecoration.d(ClipDecoration.this);
                    ClipDecoration.b(ClipDecoration.this, 0);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                ClipDecoration.c(ClipDecoration.this);
                if (ClipDecoration.a(ClipDecoration.this) > 2) {
                    ClipDecoration.d(ClipDecoration.this);
                    ClipDecoration.b(ClipDecoration.this, 0);
                }
            }
        });
    }

    public final void f() {
        try {
            if (h == null) {
                Method declaredMethod = StaggeredGridLayoutManager.class.getDeclaredMethod("checkForGaps", new Class[0]);
                h = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            h.invoke(this.b.getLayoutManager(), new Object[0]);
        } catch (Exception unused) {
        }
    }

    public final void g(int i, RecyclerView recyclerView, int i2) {
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1a43047", new Object[]{this, new Integer(i), recyclerView, new Integer(i2)});
        } else if (i > 0) {
            View childAt = recyclerView.getChildAt(i - 1);
            if (childAt != null) {
                View childAt2 = recyclerView.getChildAt(i - 2);
                BaseCellBean t = this.f9364a.t(i2 - 1);
                BaseCellBean t2 = this.f9364a.t(i2 - 2);
                if (t != null) {
                    if (childAt2 == null || t2 == null) {
                        i3 = childAt.getBottom();
                    } else {
                        i3 = (childAt.getBottom() - t.clipHeight) - (childAt2.getBottom() - t2.clipHeight);
                    }
                    if (i3 > 0 || t2 == null) {
                        i4 = this.e + (childAt.getBottom() - t.clipHeight);
                    } else if (childAt2 != null) {
                        i4 = (childAt2.getBottom() - t2.clipHeight) + this.e;
                    } else {
                        i4 = 0;
                    }
                    if (childAt.getBottom() <= i4) {
                        j(childAt, 0);
                    } else {
                        j(childAt, (childAt.getBottom() - i4) - this.e);
                    }
                    if (childAt2 == null) {
                        return;
                    }
                    if (childAt2.getBottom() <= i4) {
                        j(childAt2, 0);
                    } else {
                        j(childAt2, (childAt2.getBottom() - i4) - this.e);
                    }
                }
            }
        } else {
            this.d = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
        } else if (!this.c) {
            int headerViewsCount = this.b.getHeaderViewsCount();
            int footerViewsCount = this.b.getFooterViewsCount();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition >= headerViewsCount && childAdapterPosition < recyclerView.getAdapter().getItemCount() - footerViewsCount) {
                int i2 = childAdapterPosition - headerViewsCount;
                if (h(i2)) {
                    w7p r = this.f9364a.r(i2);
                    if (r != null && r.h()) {
                        g(recyclerView.indexOfChild(view), recyclerView, i2);
                        return;
                    }
                    return;
                }
                BaseCellBean t = this.f9364a.t(i2);
                if (t.clipHeight > 0) {
                    this.c = true;
                    RecyclerView.LayoutManager layoutManager = this.b.getLayoutManager();
                    Rect rect2 = g;
                    layoutManager.calculateItemDecorationsForChild(view, rect2);
                    this.c = false;
                    int i3 = rect2.bottom;
                    this.e = i3;
                    rect.set(0, 0, 0, (-i3) - t.clipHeight);
                } else {
                    j(view, 0);
                }
                if (!this.d) {
                    return;
                }
                if ((i(1 + i2) || i(i2 + 2)) && (i = t.clipHeight) > 0) {
                    this.d = false;
                    j(view, i);
                }
            }
        }
    }

    public final boolean h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f68f79e5", new Object[]{this, new Integer(i)})).booleanValue();
        }
        dod dodVar = this.f9364a;
        if (dodVar == null || !dodVar.A(i)) {
            return false;
        }
        return true;
    }

    public final boolean i(int i) {
        BaseCellBean baseCellBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1c9bdf5", new Object[]{this, new Integer(i)})).booleanValue();
        }
        dod dodVar = this.f9364a;
        if (dodVar != null) {
            baseCellBean = dodVar.t(i);
        } else {
            baseCellBean = null;
        }
        if (baseCellBean == null || !baseCellBean.isSectionClip()) {
            return false;
        }
        return true;
    }

    public final void j(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("510b3f11", new Object[]{this, view, new Integer(i)});
        } else if (view instanceof MuiseHolderContainer) {
            ((MuiseHolderContainer) view).setClipHeight(i);
        }
    }
}
