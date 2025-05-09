package com.taobao.kirinvideoengine.album;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kirinvideoengine.album.AlbumAdapter;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import kotlin.Metadata;
import tb.azf;
import tb.b1m;
import tb.s8d;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/kirinvideoengine/album/ImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "kirinvideoengine_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ImageViewHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TUrlImageView f10879a;
    public final ArrayList<AlbumAdapter.b> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a<T extends b1m> implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        /* renamed from: a */
        public final boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent != null) {
                for (AlbumAdapter.b bVar : ImageViewHolder.b0(ImageViewHolder.this)) {
                    bVar.a(this.b, true);
                }
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b<T extends b1m> implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        /* renamed from: a */
        public final boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            if (failPhenixEvent != null) {
                for (AlbumAdapter.b bVar : ImageViewHolder.b0(ImageViewHolder.this)) {
                    bVar.a(this.b, false);
                }
            }
            return true;
        }
    }

    static {
        t2o.a(500170767);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ImageViewHolder(com.taobao.kirinvideoengine.album.AlbumAdapter r3, android.view.ViewGroup r4, java.util.ArrayList<com.taobao.kirinvideoengine.album.AlbumAdapter.b> r5) {
        /*
            r2 = this;
            java.lang.String r0 = "adapter"
            tb.ckf.g(r3, r0)
            java.lang.String r3 = "parent"
            tb.ckf.g(r4, r3)
            java.lang.String r3 = "onAlbumItemStateListeners"
            tb.ckf.g(r5, r3)
            android.widget.FrameLayout r3 = new android.widget.FrameLayout
            android.content.Context r0 = r4.getContext()
            r3.<init>(r0)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            r3.setLayoutParams(r0)
            tb.xhv r0 = tb.xhv.INSTANCE
            r2.<init>(r3)
            r2.b = r5
            com.taobao.uikit.extend.feature.view.TUrlImageView r3 = new com.taobao.uikit.extend.feature.view.TUrlImageView
            android.content.Context r4 = r4.getContext()
            r3.<init>(r4)
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r1, r1)
            r3.setLayoutParams(r4)
            r2.f10879a = r3
            android.view.View r4 = r2.itemView
            if (r4 == 0) goto L_0x0047
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r4.addView(r3)
            return
        L_0x0047:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewGroup"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.kirinvideoengine.album.ImageViewHolder.<init>(com.taobao.kirinvideoengine.album.AlbumAdapter, android.view.ViewGroup, java.util.ArrayList):void");
    }

    public static final /* synthetic */ ArrayList b0(ImageViewHolder imageViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("c31365b9", new Object[]{imageViewHolder});
        }
        return imageViewHolder.b;
    }

    public static /* synthetic */ Object ipc$super(ImageViewHolder imageViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kirinvideoengine/album/ImageViewHolder");
    }

    public final void c0(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f20bf", new Object[]{this, new Integer(i), str});
            return;
        }
        Drawable drawable = this.f10879a.getDrawable();
        Drawable background = this.f10879a.getBackground();
        azf.d(AlbumAdapter.TAG, "Carousel_Album_Item_LoadTime bindData,position=" + i + "; drawable=" + drawable + "; background=" + background, new Object[0]);
        this.f10879a.succListener(new a(i)).failListener(new b(i));
        this.f10879a.setImageUrl(str);
        this.f10879a.setScaleType(ImageView.ScaleType.FIT_CENTER);
    }
}
