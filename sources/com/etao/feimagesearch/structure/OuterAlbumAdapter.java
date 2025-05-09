package com.etao.feimagesearch.structure;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class OuterAlbumAdapter extends RecyclerView.Adapter<OuterAlbumHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297486);
    }

    public static /* synthetic */ Object ipc$super(OuterAlbumAdapter outerAlbumAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/structure/OuterAlbumAdapter");
    }

    /* renamed from: M */
    public void onBindViewHolder(OuterAlbumHolder outerAlbumHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c20bb661", new Object[]{this, outerAlbumHolder, new Integer(i)});
            return;
        }
        throw null;
    }

    /* renamed from: N */
    public OuterAlbumHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OuterAlbumHolder) ipChange.ipc$dispatch("80f142d7", new Object[]{this, viewGroup, new Integer(i)});
        }
        return new OuterAlbumHolder(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        throw null;
    }
}
