package com.taobao.search.searchdoor.activate.hotspot.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.a07;
import tb.ckf;
import tb.o1p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class HotSpotTabItemView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static final int imageHeight = o1p.b(15);
    private static final int imageHeight2024 = o1p.b(15);
    private static final float textSize = 15.0f;
    private static final float textSize2024 = 15.0f;
    private final TUrlImageView ivTab;
    private final boolean tb2024;
    private final TextView tvTab;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815793017);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815793016);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotSpotTabItemView(Context context, boolean z) {
        super(context);
        int i;
        ckf.g(context, "context");
        this.tb2024 = z;
        TextView textView = new TextView(context);
        this.tvTab = textView;
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        this.ivTab = tUrlImageView;
        tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        setClipChildren(false);
        setClipToPadding(false);
        textView.setTextSize(1, 15.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(textView, layoutParams);
        if (z) {
            i = imageHeight2024;
        } else {
            i = imageHeight;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, i);
        layoutParams2.gravity = 17;
        addView(tUrlImageView, layoutParams2);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
    }

    public static /* synthetic */ Object ipc$super(HotSpotTabItemView hotSpotTabItemView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/hotspot/impl/HotSpotTabItemView");
    }

    public final TUrlImageView getIvTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("217b3a63", new Object[]{this});
        }
        return this.ivTab;
    }

    public final TextView getTvTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("320e5278", new Object[]{this});
        }
        return this.tvTab;
    }
}
