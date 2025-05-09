package com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.PanelViewHolder;

import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.adapter.ShortEmojiGridAdapter;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiIconItem;
import java.util.List;
import tb.k2c;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ShortEmojiVH extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final GridView f8586a;
    public ShortEmojiGridAdapter b;
    public final k2c c;

    static {
        t2o.a(295699472);
    }

    public ShortEmojiVH(View view, k2c k2cVar) {
        super(view);
        this.f8586a = (GridView) view;
        this.c = k2cVar;
    }

    public static /* synthetic */ Object ipc$super(ShortEmojiVH shortEmojiVH, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/inputPanelKMP/PanelViewHolder/ShortEmojiVH");
    }

    public void b0(List<TaoLiveKtEmojiIconItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a07cf23a", new Object[]{this, list});
            return;
        }
        ShortEmojiGridAdapter shortEmojiGridAdapter = this.b;
        if (shortEmojiGridAdapter == null) {
            ShortEmojiGridAdapter shortEmojiGridAdapter2 = new ShortEmojiGridAdapter(this.itemView.getContext(), this.c);
            this.b = shortEmojiGridAdapter2;
            shortEmojiGridAdapter2.setData(list);
            this.f8586a.setAdapter((ListAdapter) this.b);
            return;
        }
        shortEmojiGridAdapter.setData(list);
        this.b.notifyDataSetChanged();
    }
}
