package com.taobao.tao.recommend4.recyclerview;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXButterRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend4.manager.a;
import com.taobao.taobao.R;
import java.util.List;
import tb.b9b;
import tb.evb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RecommendItemDecoration extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<SectionModel> f12700a;
    public final a b;
    public int c;
    public int d;

    static {
        t2o.a(729810044);
    }

    public RecommendItemDecoration(a aVar, List<SectionModel> list) {
        this.f12700a = list;
        this.b = aVar;
        this.c = aVar.g();
        if (!b9b.e()) {
            b9b.h();
        }
    }

    public static int c(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2639d999", new Object[]{viewGroup})).intValue();
        }
        View childAt = viewGroup.getChildAt(0);
        int i = childAt.getLayoutParams().width;
        if (i > 0) {
            return i;
        }
        if (!(childAt instanceof DXButterRootView)) {
            return i;
        }
        DXWidgetNode widgetNode = ((DXButterRootView) childAt).getWidgetNode();
        if (widgetNode == null) {
            return i;
        }
        DXRuntimeContext dXRuntimeContext = widgetNode.getDXRuntimeContext();
        if (dXRuntimeContext == null) {
            return i;
        }
        evb evbVar = dXRuntimeContext.G().get(-8936854687533104177L);
        if (evbVar == null) {
            return i;
        }
        return ((Integer) evbVar.evalWithArgs(new Object[0], dXRuntimeContext)).intValue();
    }

    public static /* synthetic */ Object ipc$super(RecommendItemDecoration recommendItemDecoration, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend4/recyclerview/RecommendItemDecoration");
    }

    public final void a(View view, int i, int i2, int i3, int i4, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a4df92", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), rect});
        } else if (i4 > 0) {
            int i5 = this.c;
            int round = Math.round(((i - (i4 * i5)) - (i3 * 2)) / (i5 - 1));
            int i6 = i3 - round;
            int i7 = this.c;
            int i8 = (((i7 + 1) * round) + (i6 * 2)) / i7;
            int spanIndex = ((StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams()).getSpanIndex();
            int i9 = (((1 + spanIndex) * round) - (spanIndex * i8)) + i6;
            rect.set(i9, i2, i8 - i9, 0);
        }
    }

    public final void b(View view, Rect rect, int i, int i2, int i3, int i4, StaggeredGridLayoutManager.LayoutParams layoutParams, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a268df1", new Object[]{this, view, rect, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), layoutParams, new Integer(i5), new Integer(i6)});
            return;
        }
        int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
        int i8 = i5 + i + i3;
        if (!(i7 == i8 || i7 == -1 || i7 == -2)) {
            view.setTag(R.id.tag_recommend_decoration_width, Integer.valueOf(i5));
            ((ViewGroup.MarginLayoutParams) layoutParams).width = i8;
        }
        int i9 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
        int i10 = i6 + i2 + i4;
        if (!(i9 == i10 || i9 == -1 || i9 == -2)) {
            view.setTag(R.id.tag_recommend_decoration_height, Integer.valueOf(i6));
            ((ViewGroup.MarginLayoutParams) layoutParams).height = i10;
        }
        rect.set(i, i2, i3, i4);
    }

    public final int d(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("692007b1", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
        }
        if (view.getTag(i) == null) {
            return i2;
        }
        return ((Integer) view.getTag(i)).intValue();
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efc5f12", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c782b44", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void g(List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1976c0b", new Object[]{this, list});
        } else {
            this.f12700a = list;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void getItemOffsets(android.graphics.Rect r13, android.view.View r14, androidx.recyclerview.widget.RecyclerView r15, androidx.recyclerview.widget.RecyclerView.State r16) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.recommend4.recyclerview.RecommendItemDecoration.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$State):void");
    }
}
