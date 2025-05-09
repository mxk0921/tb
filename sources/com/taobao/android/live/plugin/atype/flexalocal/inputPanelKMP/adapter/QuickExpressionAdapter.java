package com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiIconItem;
import com.taobao.message.chat.aura.messageflow.input.ChatInputConstant;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.giv;
import tb.iw0;
import tb.k2c;
import tb.o3s;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class QuickExpressionAdapter extends RecyclerView.Adapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8590a;
    public final ux9 b;
    public final List<TaoLiveKtEmojiIconItem> c = new ArrayList();
    public final k2c d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class LongExpressionHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TUrlImageView f8591a;

        static {
            t2o.a(295699478);
        }

        public LongExpressionHolder(View view) {
            super(view);
            this.f8591a = (TUrlImageView) view.findViewById(R.id.taolive_quick_long_item_image);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class ShortExpressionHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TUrlImageView f8592a;

        static {
            t2o.a(295699479);
        }

        public ShortExpressionHolder(View view) {
            super(view);
            this.f8592a = (TUrlImageView) view.findViewById(R.id.taolive_quick_short_item_image);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.ViewHolder f8593a;
        public final /* synthetic */ TaoLiveKtEmojiIconItem b;

        public a(RecyclerView.ViewHolder viewHolder, TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem) {
            this.f8593a = viewHolder;
            this.b = taoLiveKtEmojiIconItem;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (QuickExpressionAdapter.M(QuickExpressionAdapter.this) != null) {
                RecyclerView.ViewHolder viewHolder = this.f8593a;
                if (viewHolder instanceof ShortExpressionHolder) {
                    QuickExpressionAdapter.M(QuickExpressionAdapter.this).clickEmoji(this.b, ((ShortExpressionHolder) this.f8593a).f8592a.getDrawable(), "", true);
                } else if (viewHolder instanceof LongExpressionHolder) {
                    QuickExpressionAdapter.M(QuickExpressionAdapter.this).clickEmoji(this.b, ((LongExpressionHolder) this.f8593a).f8591a.getDrawable(), "quickExpression", true);
                }
            }
        }
    }

    static {
        t2o.a(295699476);
    }

    public QuickExpressionAdapter(Context context, ux9 ux9Var, k2c k2cVar) {
        this.f8590a = context;
        this.b = ux9Var;
        this.d = k2cVar;
    }

    public static /* synthetic */ k2c M(QuickExpressionAdapter quickExpressionAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k2c) ipChange.ipc$dispatch("c2bb6b82", new Object[]{quickExpressionAdapter});
        }
        return quickExpressionAdapter.d;
    }

    public static /* synthetic */ Object ipc$super(QuickExpressionAdapter quickExpressionAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/inputPanelKMP/adapter/QuickExpressionAdapter");
    }

    public void N(List<TaoLiveKtEmojiIconItem> list, FrameLayout frameLayout) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad42b620", new Object[]{this, list, frameLayout});
            return;
        }
        int h = iw0.h(this.f8590a);
        int a3 = iw0.a(this.f8590a, 14.0f);
        ArrayList arrayList = new ArrayList();
        for (TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem : list) {
            if (taoLiveKtEmojiIconItem.getLargeType()) {
                a2 = iw0.a(this.f8590a, 90.0f);
            } else {
                a2 = iw0.a(this.f8590a, 24.0f);
            }
            a3 = a3 + a2 + iw0.a(this.f8590a, 24.0f);
            if (a3 > h || arrayList.size() > 9) {
                break;
            }
            arrayList.add(taoLiveKtEmojiIconItem);
            O(taoLiveKtEmojiIconItem);
        }
        ((ArrayList) this.c).clear();
        ((ArrayList) this.c).addAll(arrayList);
        if (!((ArrayList) this.c).isEmpty()) {
            notifyDataSetChanged();
            frameLayout.setVisibility(0);
            return;
        }
        frameLayout.setVisibility(8);
    }

    public final void O(TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44455800", new Object[]{this, taoLiveKtEmojiIconItem});
            return;
        }
        try {
            HashMap<String, String> hashMap = new HashMap<>();
            if (taoLiveKtEmojiIconItem.getLargeType()) {
                str = "longword";
            } else {
                str = ChatInputConstant.PANEL_ID_EMOJI;
            }
            hashMap.put("type", str);
            hashMap.put("emoticon_id", taoLiveKtEmojiIconItem.getStickerId());
            giv.f().p(this.b, "Comment_EmoticonConvenient", hashMap);
        } catch (Exception e) {
            o3s.d("QuickExpressionAdapterKMP", "trackShowItem catch exception:" + e.getMessage());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.c).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem = (TaoLiveKtEmojiIconItem) ((ArrayList) this.c).get(i);
        if (taoLiveKtEmojiIconItem != null) {
            return !taoLiveKtEmojiIconItem.getNormalType();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
        } else if (!((ArrayList) this.c).isEmpty() && (taoLiveKtEmojiIconItem = (TaoLiveKtEmojiIconItem) ((ArrayList) this.c).get(i)) != null) {
            if (viewHolder instanceof ShortExpressionHolder) {
                if (!TextUtils.isEmpty(taoLiveKtEmojiIconItem.getThumbnail())) {
                    ((ShortExpressionHolder) viewHolder).f8592a.setImageUrl(taoLiveKtEmojiIconItem.getThumbnail());
                }
            } else if ((viewHolder instanceof LongExpressionHolder) && !TextUtils.isEmpty(taoLiveKtEmojiIconItem.getThumbnail())) {
                ((LongExpressionHolder) viewHolder).f8591a.setImageUrl(taoLiveKtEmojiIconItem.getThumbnail());
            }
            ViewProxy.setOnClickListener(viewHolder.itemView, new a(viewHolder, taoLiveKtEmojiIconItem));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (i == 1) {
            return new LongExpressionHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_quick_item_long_flexalocal, (ViewGroup) null));
        }
        return new ShortExpressionHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_quick_item_short_flexalocal, (ViewGroup) null));
    }
}
