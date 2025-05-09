package com.taobao.android.searchbaseframe.xsl.module;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class XslWaterFallItemDecoration extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f9362a;
    public int b;
    public int c = -1;
    public int d = -1;

    static {
        t2o.a(993002061);
    }

    public XslWaterFallItemDecoration(int i) {
        this.f9362a = i;
    }

    public static /* synthetic */ Object ipc$super(XslWaterFallItemDecoration xslWaterFallItemDecoration, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/module/XslWaterFallItemDecoration");
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a22b91", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c62f3f4", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public void c(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a7daa93", new Object[]{this, rect});
        } else {
            rect.bottom = 0;
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff5138b2", new Object[]{this, new Integer(i)});
        } else {
            this.f9362a = i;
        }
    }

    public void e(View view, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645b879b", new Object[]{this, view, rect});
        } else {
            rect.bottom = this.f9362a * 2;
        }
    }

    public void f(ViewGroup viewGroup, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df9f989", new Object[]{this, viewGroup, rect});
        } else {
            rect.bottom = 0;
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ec1be5", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
            return;
        }
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                View childAt = frameLayout.getChildAt(0);
                int id = childAt.getId();
                if (id == R.id.libsf_srp_list_blank) {
                    c(rect);
                    h(rect);
                    return;
                } else if (id == R.id.libsf_srp_list_header_container) {
                    i((FrameLayout) childAt, rect);
                    h(rect);
                    return;
                } else if (id == R.id.libsf_srp_list_footer_container) {
                    f((FrameLayout) childAt, rect);
                    h(rect);
                    return;
                }
            }
        }
        if (!(view.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) || !((StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams()).isFullSpan()) {
            k(rect);
            e(view, rect);
            return;
        }
        h(rect);
    }

    public void h(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adf6f277", new Object[]{this, rect});
            return;
        }
        int i = this.b;
        rect.left = i;
        rect.right = i;
    }

    public void i(ViewGroup viewGroup, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc3f657", new Object[]{this, viewGroup, rect});
        } else {
            rect.bottom = 0;
        }
    }

    public void j(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23cda756", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.c = i;
        this.d = i2;
    }

    public void k(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f75b844", new Object[]{this, rect});
            return;
        }
        int i = this.f9362a;
        rect.left = i;
        rect.right = i;
    }
}
