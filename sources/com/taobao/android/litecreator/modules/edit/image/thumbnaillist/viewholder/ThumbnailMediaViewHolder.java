package com.taobao.android.litecreator.modules.edit.image.thumbnaillist.viewholder;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailItem;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailListAdapter;
import com.taobao.android.litecreator.widgets.SqTUrlImageView;
import com.taobao.taobao.R;
import tb.a65;
import tb.dtt;
import tb.qbg;
import tb.t2o;
import tb.yst;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ThumbnailMediaViewHolder extends ThumbnailBaseViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int n = a65.a(28.8f);
    public static final int o = a65.a(34.56f);
    public Bitmap d;
    public final ImageView e;
    public final SqTUrlImageView f;
    public final SqTUrlImageView g;
    public final FrameLayout h;
    public final ImageView i;
    public final ImageView j;
    public final dtt k;
    public final boolean l;
    public final boolean m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/modules/edit/image/thumbnaillist/viewholder/ThumbnailMediaViewHolder$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ThumbnailMediaViewHolder.this.e.getContext().getResources().getDimensionPixelSize(R.dimen.lc_thumbnail_item_radius));
            }
        }
    }

    static {
        t2o.a(511705275);
    }

    public ThumbnailMediaViewHolder(View view, boolean z, boolean z2) {
        super(view);
        this.l = z;
        this.m = z2;
        this.f = (SqTUrlImageView) view.findViewById(R.id.select_mask);
        this.g = (SqTUrlImageView) view.findViewById(R.id.select_mask_layer);
        this.e = (ImageView) view.findViewById(R.id.iv_thumbnail);
        this.h = (FrameLayout) view.findViewById(R.id.iv_thumbnail_container);
        this.i = (ImageView) view.findViewById(R.id.video_play_icon);
        this.j = (ImageView) view.findViewById(R.id.ivWarn);
        int i = o;
        int i2 = n;
        dtt dttVar = new dtt(i, i2, i, i2, 250);
        this.k = dttVar;
        dttVar.l(new AccelerateDecelerateInterpolator());
    }

    public static /* synthetic */ Object ipc$super(ThumbnailMediaViewHolder thumbnailMediaViewHolder, String str, Object... objArr) {
        if (str.hashCode() == -2122718884) {
            super.b0((ThumbnailItem) objArr[0], ((Number) objArr[1]).intValue(), ((Boolean) objArr[2]).booleanValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/modules/edit/image/thumbnaillist/viewholder/ThumbnailMediaViewHolder");
    }

    @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.viewholder.ThumbnailBaseViewHolder
    public void b0(ThumbnailItem thumbnailItem, int i, boolean z) {
        boolean z2;
        int i2;
        int i3;
        yst ystVar;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8179e15c", new Object[]{this, thumbnailItem, new Integer(i), new Boolean(z)});
            return;
        }
        super.b0(thumbnailItem, i, z);
        this.f.setBackgroundResource(R.drawable.drawable_thumbnail_item_selected_bg);
        this.g.setBackgroundResource(R.drawable.drawable_thumbnail_item_selected_mask_layer);
        Bitmap bitmap = thumbnailItem.coverThumbnail;
        if (bitmap == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            bitmap = this.d;
        }
        this.e.setOutlineProvider(new a());
        this.e.setClipToOutline(true);
        this.e.setImageBitmap(bitmap);
        if (this.m) {
            SqTUrlImageView sqTUrlImageView = this.g;
            if (z) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            sqTUrlImageView.setVisibility(i4);
        }
        SqTUrlImageView sqTUrlImageView2 = this.f;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        sqTUrlImageView2.setVisibility(i2);
        if (z2 && (ystVar = thumbnailItem.imageLoader) != null) {
            ystVar.e(this.e);
        }
        ImageView imageView = this.i;
        if (ThumbnailListAdapter.TYPE_TAG_MEDIA_VIDEO.equals(c0())) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        if (this.l) {
            if (!this.k.i()) {
                this.k.k();
            }
            this.k.m(this.h, z);
        }
        if (thumbnailItem.isNeedCrop) {
            this.j.setVisibility(0);
            this.j.setAlpha(0.8f);
            this.j.setBackground(qbg.Companion.a(a65.a(4.0f), Color.parseColor("#80FF6200")));
            return;
        }
        this.j.setVisibility(8);
    }

    public void f0(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57741f27", new Object[]{this, bitmap});
        } else {
            this.d = bitmap;
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.k.j();
        }
    }
}
