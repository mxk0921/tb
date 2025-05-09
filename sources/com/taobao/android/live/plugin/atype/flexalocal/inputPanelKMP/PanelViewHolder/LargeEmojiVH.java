package com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.PanelViewHolder;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.TaoLiveFlowLayout;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiIconItem;
import com.taobao.taobao.R;
import java.util.List;
import tb.bec;
import tb.hw0;
import tb.k2c;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LargeEmojiVH extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TaoLiveFlowLayout f8583a;
    public final boolean b;
    public final k2c c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TaoLiveKtEmojiIconItem f8584a;
        public final /* synthetic */ AliUrlImageView b;

        public a(TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem, AliUrlImageView aliUrlImageView) {
            this.f8584a = taoLiveKtEmojiIconItem;
            this.b = aliUrlImageView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                LargeEmojiVH.b0(LargeEmojiVH.this).clickEmoji(this.f8584a, this.b.getDrawable(), this.f8584a.getType(), false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements bec {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AliUrlImageView f8585a;
        public final /* synthetic */ int b;

        public b(AliUrlImageView aliUrlImageView, int i) {
            this.f8585a = aliUrlImageView;
            this.b = i;
        }

        @Override // tb.bec
        public void a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f7d4f", new Object[]{this, drawable});
            } else if (LargeEmojiVH.c0(LargeEmojiVH.this)) {
                LargeEmojiVH.d0(LargeEmojiVH.this, this.f8585a, this.b);
            } else {
                LargeEmojiVH.e0(LargeEmojiVH.this, this.f8585a, this.b);
            }
        }

        @Override // tb.bec
        public void onFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8bb1183", new Object[]{this});
                return;
            }
            int b = hw0.b(this.f8585a.getContext(), 40.5f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8585a.getLayoutParams();
            int i = this.b;
            if (i % 3 == 0) {
                marginLayoutParams.leftMargin = hw0.b(this.f8585a.getContext(), 12.0f);
                marginLayoutParams.rightMargin = b;
            } else if (i % 3 == 1) {
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = b;
            } else {
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = hw0.b(this.f8585a.getContext(), 12.0f);
            }
            this.f8585a.setLayoutParams(marginLayoutParams);
        }
    }

    static {
        t2o.a(295699469);
    }

    public LargeEmojiVH(View view, boolean z, k2c k2cVar) {
        super(view);
        this.f8583a = (TaoLiveFlowLayout) view;
        this.b = z;
        this.c = k2cVar;
    }

    public static /* synthetic */ k2c b0(LargeEmojiVH largeEmojiVH) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k2c) ipChange.ipc$dispatch("47307475", new Object[]{largeEmojiVH});
        }
        return largeEmojiVH.c;
    }

    public static /* synthetic */ boolean c0(LargeEmojiVH largeEmojiVH) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f111ceed", new Object[]{largeEmojiVH})).booleanValue();
        }
        return largeEmojiVH.b;
    }

    public static /* synthetic */ void d0(LargeEmojiVH largeEmojiVH, AliUrlImageView aliUrlImageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8406c7b", new Object[]{largeEmojiVH, aliUrlImageView, new Integer(i)});
        } else {
            largeEmojiVH.f0(aliUrlImageView, i);
        }
    }

    public static /* synthetic */ void e0(LargeEmojiVH largeEmojiVH, AliUrlImageView aliUrlImageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54f6c6bc", new Object[]{largeEmojiVH, aliUrlImageView, new Integer(i)});
        } else {
            largeEmojiVH.g0(aliUrlImageView, i);
        }
    }

    public static /* synthetic */ Object ipc$super(LargeEmojiVH largeEmojiVH, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/inputPanelKMP/PanelViewHolder/LargeEmojiVH");
    }

    public final void f0(AliUrlImageView aliUrlImageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46fc35bd", new Object[]{this, aliUrlImageView, new Integer(i)});
            return;
        }
        int measuredWidth = aliUrlImageView.getMeasuredWidth();
        if (measuredWidth > 0) {
            int i2 = (int) (((hw0.i() - hw0.b(aliUrlImageView.getContext(), 69.0f)) - (measuredWidth * 6)) / 5.0f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aliUrlImageView.getLayoutParams();
            int i3 = i % 6;
            if (i3 == 0) {
                marginLayoutParams.leftMargin = hw0.b(aliUrlImageView.getContext(), 24.0f);
                marginLayoutParams.rightMargin = i2;
            } else if (i3 <= 4) {
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = i2;
            } else {
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = hw0.b(aliUrlImageView.getContext(), 0.0f);
            }
            aliUrlImageView.setLayoutParams(marginLayoutParams);
        }
    }

    public final void g0(AliUrlImageView aliUrlImageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("242fed09", new Object[]{this, aliUrlImageView, new Integer(i)});
            return;
        }
        int measuredWidth = aliUrlImageView.getMeasuredWidth();
        if (measuredWidth > 0) {
            int i2 = (int) (((hw0.i() - hw0.b(aliUrlImageView.getContext(), 24.0f)) - (measuredWidth * 3)) / 2.0f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aliUrlImageView.getLayoutParams();
            int i3 = i % 3;
            if (i3 == 0) {
                marginLayoutParams.leftMargin = hw0.b(aliUrlImageView.getContext(), 12.0f);
                marginLayoutParams.rightMargin = i2;
            } else if (i3 == 1) {
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = i2;
            } else {
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = hw0.b(aliUrlImageView.getContext(), 12.0f);
            }
            aliUrlImageView.setLayoutParams(marginLayoutParams);
        }
    }

    public void h0(List<TaoLiveKtEmojiIconItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a07cf23a", new Object[]{this, list});
            return;
        }
        this.f8583a.removeAllViews();
        int i = -1;
        for (TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem : list) {
            i++;
            AliUrlImageView aliUrlImageView = (AliUrlImageView) LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.taolive_custom_sticker_item_flexalocal, (ViewGroup) this.f8583a, false);
            aliUrlImageView.setImageUrl(taoLiveKtEmojiIconItem.getThumbnail());
            aliUrlImageView.setTag(taoLiveKtEmojiIconItem.getStickerId());
            aliUrlImageView.setOnClickListener(new a(taoLiveKtEmojiIconItem, aliUrlImageView));
            this.f8583a.addView(aliUrlImageView);
            aliUrlImageView.setImageLoadListener(new b(aliUrlImageView, i));
        }
    }
}
