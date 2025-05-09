package com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiIconItem;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.List;
import tb.k2c;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ShortEmojiGridAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private k2c mClickListener;
    private Context mContext;
    private List<TaoLiveKtEmojiIconItem> mDataList;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TaoLiveKtEmojiIconItem f8594a;
        public final /* synthetic */ AliUrlImageView b;

        public a(TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem, AliUrlImageView aliUrlImageView) {
            this.f8594a = taoLiveKtEmojiIconItem;
            this.b = aliUrlImageView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                ShortEmojiGridAdapter.access$000(ShortEmojiGridAdapter.this).clickEmoji(this.f8594a, this.b.getDrawable(), this.f8594a.getType(), false);
            }
        }
    }

    static {
        t2o.a(295699480);
    }

    public ShortEmojiGridAdapter(Context context, k2c k2cVar) {
        this.mContext = context;
        this.mClickListener = k2cVar;
    }

    public static /* synthetic */ k2c access$000(ShortEmojiGridAdapter shortEmojiGridAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k2c) ipChange.ipc$dispatch("a1d08f9f", new Object[]{shortEmojiGridAdapter});
        }
        return shortEmojiGridAdapter.mClickListener;
    }

    public static /* synthetic */ Object ipc$super(ShortEmojiGridAdapter shortEmojiGridAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/inputPanelKMP/adapter/ShortEmojiGridAdapter");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<TaoLiveKtEmojiIconItem> list = this.mDataList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        List<TaoLiveKtEmojiIconItem> list = this.mDataList;
        if (list != null) {
            return list.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (view == null) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_sticker_grid_item_flexalocal, viewGroup, false);
        }
        TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem = (TaoLiveKtEmojiIconItem) getItem(i);
        AliUrlImageView aliUrlImageView = (AliUrlImageView) view.findViewById(R.id.iv_sticker);
        aliUrlImageView.setImageUrl(taoLiveKtEmojiIconItem.getThumbnail());
        ViewProxy.setOnClickListener(view, new a(taoLiveKtEmojiIconItem, aliUrlImageView));
        return view;
    }

    public void setData(List<TaoLiveKtEmojiIconItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ddf4a4", new Object[]{this, list});
        } else {
            this.mDataList = list;
        }
    }
}
