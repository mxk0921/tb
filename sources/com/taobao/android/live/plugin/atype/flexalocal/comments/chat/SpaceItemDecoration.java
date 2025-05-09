package com.taobao.android.live.plugin.atype.flexalocal.comments.chat;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SpaceItemDecoration extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f8408a;
    public final int b;

    static {
        t2o.a(295698570);
    }

    public SpaceItemDecoration(int i, int i2) {
        this.f8408a = i;
        this.b = i2;
    }

    public static /* synthetic */ Object ipc$super(SpaceItemDecoration spaceItemDecoration, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chat/SpaceItemDecoration");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
        } else if (recyclerView.getChildAdapterPosition(view) != 0) {
            int i = this.b;
            if (i == 1) {
                rect.top = this.f8408a;
            } else if (i == 0) {
                rect.left = this.f8408a;
            }
        }
    }
}
