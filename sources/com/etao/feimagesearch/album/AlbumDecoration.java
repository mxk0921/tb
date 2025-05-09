package com.etao.feimagesearch.album;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.zb7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AlbumDecoration extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int PADDING = zb7.a(12.0f);
    public static final int DIVIDER = zb7.a(3.0f);

    static {
        t2o.a(481296449);
    }

    public static /* synthetic */ Object ipc$super(AlbumDecoration albumDecoration, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/album/AlbumDecoration");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
            return;
        }
        int i = DIVIDER;
        rect.left = i / 2;
        rect.right = i / 2;
        rect.bottom = i;
    }
}
