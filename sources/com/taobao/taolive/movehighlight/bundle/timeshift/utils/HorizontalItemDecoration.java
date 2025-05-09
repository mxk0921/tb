package com.taobao.taolive.movehighlight.bundle.timeshift.utils;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HorizontalItemDecoration extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092561);
    }

    public static /* synthetic */ Object ipc$super(HorizontalItemDecoration horizontalItemDecoration, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bundle/timeshift/utils/HorizontalItemDecoration");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int itemCount = recyclerView.getAdapter().getItemCount();
        if (childAdapterPosition == 0) {
            rect.left = 0;
            rect.right = 0;
        } else if (childAdapterPosition == itemCount - 1) {
            rect.left = 0;
            rect.right = 0;
        } else {
            rect.left = 0;
            rect.right = 0;
        }
    }
}
