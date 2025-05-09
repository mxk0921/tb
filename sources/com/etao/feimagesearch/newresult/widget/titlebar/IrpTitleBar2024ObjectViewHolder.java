package com.etao.feimagesearch.newresult.widget.titlebar;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.CornerImageView;
import com.taobao.taobao.R;
import tb.amf;
import tb.ckf;
import tb.oxb;
import tb.p1p;
import tb.p9j;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class IrpTitleBar2024ObjectViewHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4835a;
    public final CornerImageView b;
    public final ImageView c;
    public final View d;
    public final int e;

    static {
        t2o.a(481297261);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IrpTitleBar2024ObjectViewHolder(Context context, ViewGroup viewGroup, boolean z) {
        super(LayoutInflater.from(context).inflate(R.layout.feis_view_title_bar_object_2024, viewGroup, false));
        int i;
        ckf.g(context, "ctx");
        ckf.g(viewGroup, a.MSG_SOURCE_PARENT);
        this.f4835a = z;
        boolean E1 = context instanceof oxb ? ((oxb) context).E1() : false;
        View findViewById = this.itemView.findViewById(R.id.iv_object);
        CornerImageView cornerImageView = (CornerImageView) findViewById;
        cornerImageView.setRadius(p1p.b(6.5f));
        cornerImageView.setBackgroundColor(Color.parseColor("#222222"));
        ckf.f(findViewById, "itemView.findViewById<Co…seColor(\"#222222\"))\n    }");
        this.b = (CornerImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.iv_region_hint);
        ckf.f(findViewById2, "itemView.findViewById(R.id.iv_region_hint)");
        ImageView imageView = (ImageView) findViewById2;
        this.c = imageView;
        View findViewById3 = this.itemView.findViewById(R.id.fl_scan_hint);
        ckf.f(findViewById3, "itemView.findViewById<View>(R.id.fl_scan_hint)");
        this.d = findViewById3;
        this.e = p1p.a(amf.c(z));
        if (E1) {
            i = R.drawable.feis_ic_region_change_hint_dark;
        } else {
            i = R.drawable.feis_ic_region_change_hint;
        }
        imageView.setBackgroundResource(i);
        View findViewById4 = this.itemView.findViewById(R.id.view_hint_bg);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(p1p.b(6.5f));
        gradientDrawable.setColor(Color.parseColor("#9911192D"));
        findViewById4.setBackground(gradientDrawable);
        ((CornerImageView) this.itemView.findViewById(R.id.iv_scan_hint)).setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01MPy4DH1vVZrP9vbtD_!!6000000006178-49-tps-571-571.webp");
    }

    public static /* synthetic */ Object ipc$super(IrpTitleBar2024ObjectViewHolder irpTitleBar2024ObjectViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/titlebar/IrpTitleBar2024ObjectViewHolder");
    }

    public final void b0(p9j p9jVar) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20996f18", new Object[]{this, p9jVar});
            return;
        }
        ckf.g(p9jVar, "bean");
        d0();
        if (!p9jVar.b()) {
            this.b.setImageBitmap(p9jVar.c);
        } else if (!TextUtils.isEmpty(p9jVar.i)) {
            this.b.setImageUrl(p9jVar.i);
        }
        if (p9jVar.a()) {
            this.d.setVisibility(0);
            this.c.setVisibility(0);
            View view = this.itemView;
            view.setContentDescription(Localization.q(R.string.taobao_app_1007_item_image) + ',' + Localization.q(R.string.taobao_app_1007_button));
        } else {
            this.d.setVisibility(8);
            if (p9jVar.d) {
                View view2 = this.itemView;
                if (this.f4835a) {
                    i = R.drawable.feis_ic_header_object_select_single_2024;
                } else {
                    i = R.drawable.feis_ic_header_object_select_2024;
                }
                view2.setBackgroundResource(i);
                this.c.setVisibility(8);
                View view3 = this.itemView;
                view3.setContentDescription(Localization.q(R.string.taobao_app_1007_item_image) + ',' + Localization.q(R.string.taobao_app_1007_selected) + ',' + Localization.q(R.string.taobao_app_1007_button));
            } else {
                this.itemView.setBackgroundDrawable(null);
                ImageView imageView = this.c;
                if (this.f4835a) {
                    i2 = 8;
                }
                imageView.setVisibility(i2);
                View view4 = this.itemView;
                view4.setContentDescription(Localization.q(R.string.taobao_app_1007_item_image) + ',' + Localization.q(R.string.taobao_app_1007_button));
            }
        }
        this.itemView.invalidate();
    }

    public final int c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21800ebd", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public final void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86950824", new Object[]{this});
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int i = this.e;
            layoutParams2.width = i;
            layoutParams2.height = i;
            int a2 = p1p.a(amf.f(this.f4835a));
            layoutParams2.leftMargin = a2;
            layoutParams2.topMargin = a2;
            this.b.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = this.d.getLayoutParams();
            if (layoutParams3 != null) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                int i2 = this.e;
                layoutParams4.width = i2;
                layoutParams4.height = i2;
                layoutParams4.leftMargin = a2;
                layoutParams4.topMargin = a2;
                this.d.setLayoutParams(layoutParams2);
                ViewGroup.LayoutParams layoutParams5 = this.itemView.getLayoutParams();
                layoutParams5.width = p1p.a(amf.e(this.f4835a));
                layoutParams5.height = p1p.a(amf.d(this.f4835a));
                this.itemView.setLayoutParams(layoutParams5);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }
}
