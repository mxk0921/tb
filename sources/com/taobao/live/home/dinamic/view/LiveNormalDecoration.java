package com.taobao.live.home.dinamic.view;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.dinamic.model.DinamicDataObject;
import tb.r0h;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LiveNormalDecoration extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INVALID_POS = -1;
    public static final int MAX_SPAN = 2;
    public static final String e = LiveNormalDecoration.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final int f10961a;
    public final int b;
    public final int c;
    public final int d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
    }

    static {
        t2o.a(806355453);
    }

    public LiveNormalDecoration(int i, int i2, int i3) {
        this(i, i2, i3, null);
    }

    public static /* synthetic */ Object ipc$super(LiveNormalDecoration liveNormalDecoration, String str, Object... objArr) {
        if (str.hashCode() == -2066002230) {
            super.getItemOffsets((Rect) objArr[0], (View) objArr[1], (RecyclerView) objArr[2], (RecyclerView.State) objArr[3]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/view/LiveNormalDecoration");
    }

    public final boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93aac16b", new Object[]{this, view})).booleanValue();
        }
        try {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
                return true;
            }
            if (((StaggeredGridLayoutManager.LayoutParams) layoutParams).getSpanIndex() == 0) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            r0h.c(e, "isLeftItem exp.", e2);
            return true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        DinamicDataObject g0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        rect.top = this.c;
        if (!(recyclerView.getChildViewHolder(view) instanceof LiveListViewHolder) || (g0 = ((LiveListViewHolder) recyclerView.getChildViewHolder(view)).g0()) == null || !g0.noLeftRightSpace) {
            int i = this.d;
            if (-1 != i && childAdapterPosition == i) {
                rect.left = 0;
                rect.right = 0;
            } else if (a(view)) {
                rect.left = this.f10961a;
                rect.right = this.b;
            } else {
                rect.left = this.b;
                rect.right = this.f10961a;
            }
        } else {
            rect.left = 0;
            rect.right = 0;
        }
    }

    public LiveNormalDecoration(int i, int i2, int i3, a aVar) {
        this.d = -1;
        this.f10961a = i;
        this.b = i2;
        this.c = i3;
    }
}
