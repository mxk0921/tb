package com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.TaoLiveFlowLayout;
import com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.PanelViewHolder.LargeEmojiVH;
import com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.PanelViewHolder.ShortEmojiVH;
import com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.PanelViewHolder.TitleVH;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiStickerItem;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiTabItem;
import com.taobao.taobao.R;
import java.util.List;
import tb.hw0;
import tb.k2c;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ExpressionPanelAdapter extends RecyclerView.Adapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8589a;
    public final boolean b;
    public List<TaoLiveKtEmojiStickerItem> c;
    public TaoLiveKtEmojiTabItem d;
    public final k2c e;

    static {
        t2o.a(295699475);
    }

    public ExpressionPanelAdapter(Context context, boolean z, k2c k2cVar) {
        this.f8589a = context;
        this.b = z;
        this.e = k2cVar;
    }

    public static /* synthetic */ Object ipc$super(ExpressionPanelAdapter expressionPanelAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/inputPanelKMP/adapter/ExpressionPanelAdapter");
    }

    public void M(TaoLiveKtEmojiTabItem taoLiveKtEmojiTabItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4579cada", new Object[]{this, taoLiveKtEmojiTabItem});
            return;
        }
        this.d = taoLiveKtEmojiTabItem;
        this.c = taoLiveKtEmojiTabItem.getStickerList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<TaoLiveKtEmojiStickerItem> list = this.c;
        if (list != null) {
            return list.size() * 2;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i % 2 == 0) {
            List<TaoLiveKtEmojiStickerItem> list = this.c;
            if (list == null || list.size() <= 1) {
                return 4;
            }
            return 0;
        }
        TaoLiveKtEmojiTabItem taoLiveKtEmojiTabItem = this.d;
        if (taoLiveKtEmojiTabItem == null || !taoLiveKtEmojiTabItem.getLargeType()) {
            return 1;
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        List<TaoLiveKtEmojiStickerItem> list = this.c;
        if (list != null) {
            if (viewHolder instanceof TitleVH) {
                ((TitleVH) viewHolder).f8587a.setText(list.get(i / 2).getTitle());
            } else if (viewHolder instanceof ShortEmojiVH) {
                ((ShortEmojiVH) viewHolder).b0(list.get(i / 2).getEmojiList());
            } else if (viewHolder instanceof LargeEmojiVH) {
                ((LargeEmojiVH) viewHolder).h0(list.get(i / 2).getEmojiList());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder titleVH;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (i == 0) {
            View inflate = LayoutInflater.from(this.f8589a).inflate(R.layout.taolive_sticker_title_flexalocal, viewGroup, false);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) inflate.getLayoutParams();
            if (this.b) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = hw0.b(this.f8589a, 24.0f);
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = hw0.b(this.f8589a, 12.75f);
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = hw0.b(this.f8589a, 16.0f);
            inflate.setLayoutParams(layoutParams);
            titleVH = new TitleVH(inflate);
        } else if (i == 1) {
            GridView gridView = (GridView) LayoutInflater.from(this.f8589a).inflate(R.layout.taolive_official_sticker_flexalocal, viewGroup, false);
            if (this.b) {
                i2 = 10;
            } else {
                i2 = 7;
            }
            gridView.setNumColumns(i2);
            if (this.b) {
                gridView.setPadding(-hw0.b(this.f8589a, 5.0f), 0, 0, 0);
            }
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) gridView.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = hw0.b(this.f8589a, 4.0f);
            gridView.setLayoutParams(layoutParams2);
            titleVH = new ShortEmojiVH(gridView, this.e);
        } else if (i == 2) {
            TaoLiveFlowLayout taoLiveFlowLayout = (TaoLiveFlowLayout) LayoutInflater.from(this.f8589a).inflate(R.layout.taolive_anchor_custom_sticker_flexalocal, viewGroup, false);
            RecyclerView.LayoutParams layoutParams3 = (RecyclerView.LayoutParams) taoLiveFlowLayout.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = hw0.b(this.f8589a, 16.0f);
            taoLiveFlowLayout.setLayoutParams(layoutParams3);
            titleVH = new LargeEmojiVH(taoLiveFlowLayout, this.b, this.e);
        } else if (i != 4) {
            return null;
        } else {
            titleVH = new TitleVH(LayoutInflater.from(this.f8589a).inflate(R.layout.taolive_sticker_title_empty_flexalocal, viewGroup, false));
        }
        return titleVH;
    }
}
