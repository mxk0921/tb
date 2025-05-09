package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.common;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class GridItemDecoration extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6906a;

    static {
        t2o.a(912262412);
    }

    public GridItemDecoration(Context context) {
        this.f6906a = context;
    }

    public static /* synthetic */ Object ipc$super(GridItemDecoration gridItemDecoration, String str, Object... objArr) {
        if (str.hashCode() == 1452916494) {
            super.onDraw((Canvas) objArr[0], (RecyclerView) objArr[1], (RecyclerView.State) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/common/GridItemDecoration");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1107a21a", new Object[]{this, canvas, recyclerView, state});
            return;
        }
        Paint paint = new Paint();
        paint.setColor(this.f6906a.getResources().getColor(R.color.tt_detail_d));
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            float x = childAt.getX();
            float y = childAt.getY();
            childAt.getWidth();
            canvas.drawLine(x, y, x, y + childAt.getHeight(), paint);
        }
        super.onDraw(canvas, recyclerView, state);
    }
}
