package com.etao.feimagesearch.structure;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.t2o;
import tb.zb7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class OuterAlbumHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297489);
    }

    public OuterAlbumHolder(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.feis_view_outer_album, viewGroup, false));
        TUrlImageView tUrlImageView = (TUrlImageView) this.itemView.findViewById(R.id.iv_image);
        float a2 = zb7.a(60.0f) / 2.0f;
        tUrlImageView.setPivotX(a2);
        tUrlImageView.setPivotY(a2);
    }

    public static /* synthetic */ Object ipc$super(OuterAlbumHolder outerAlbumHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/structure/OuterAlbumHolder");
    }
}
