package com.taobao.search.searchdoor.activate.hotspot.impl;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.a07;
import tb.ckf;
import tb.sda;
import tb.t2o;
import tb.x6b;
import tb.xho;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class HotSpotTopTabViewHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final int g = Color.parseColor("#FF5F00");
    public static final int h = Color.parseColor("#11192D");
    public static final int i = Color.parseColor("#545454");
    public static final int j = Color.parseColor("#50607A");

    /* renamed from: a  reason: collision with root package name */
    public final Rect f11625a = new Rect();
    public final TextView b;
    public final TUrlImageView c;
    public final int d;
    public final int e;
    public x6b f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815793020);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815793019);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotSpotTopTabViewHolder(HotSpotTabItemView hotSpotTabItemView, boolean z) {
        super(hotSpotTabItemView);
        int i2;
        int i3;
        ckf.g(hotSpotTabItemView, "itemView");
        this.b = hotSpotTabItemView.getTvTab();
        this.c = hotSpotTabItemView.getIvTab();
        if (z) {
            i2 = h;
        } else {
            i2 = g;
        }
        this.d = i2;
        if (z) {
            i3 = j;
        } else {
            i3 = i;
        }
        this.e = i3;
    }

    public static /* synthetic */ Object ipc$super(HotSpotTopTabViewHolder hotSpotTopTabViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/hotspot/impl/HotSpotTopTabViewHolder");
    }

    public final void d0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b493eb", new Object[]{this, view});
        } else if (view.getLayoutParams().width > 0) {
            view.setPivotX(view.getLayoutParams().width / 2.0f);
            view.setPivotY(view.getLayoutParams().height / 2.0f);
        } else {
            view.setPivotX(view.getMeasuredWidth() / 2.0f);
            view.setPivotY(view.getMeasuredHeight() / 2.0f);
        }
    }

    public final void e0(View view, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf3e8437", new Object[]{this, view, new Float(f), new Boolean(z)});
        } else if (z) {
            view.animate().scaleX(f).scaleY(f).start();
        } else {
            view.setScaleX(f);
            view.setScaleY(f);
        }
    }

    public final void f0(TextView textView) {
        Typeface typeface;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd370449", new Object[]{this, textView});
            return;
        }
        Typeface create = Typeface.create("PingFangSC-Medium", 1);
        if (create != null) {
            typeface = Typeface.create(create, 1);
        } else {
            typeface = Typeface.defaultFromStyle(1);
        }
        textView.setTypeface(typeface);
    }

    public final void g0(String str, x6b x6bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba17cdb8", new Object[]{this, str, x6bVar});
            return;
        }
        this.c.setVisibility(0);
        this.b.setVisibility(4);
        this.c.setImageUrl(str);
        this.f = x6bVar;
    }

    public final void h0(x6b x6bVar) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49baf96", new Object[]{this, x6bVar});
            return;
        }
        this.f = x6bVar;
        this.c.setVisibility(4);
        this.b.setVisibility(0);
        this.b.setText(x6bVar.l());
        TextView textView = this.b;
        if (x6bVar.g()) {
            i2 = this.d;
        } else {
            i2 = this.e;
        }
        textView.setTextColor(i2);
        if (x6bVar.g()) {
            f0(this.b);
        } else {
            this.b.setTypeface(Typeface.DEFAULT);
        }
    }

    public final void b0(x6b x6bVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("411d56c3", new Object[]{this, x6bVar});
            return;
        }
        ckf.g(x6bVar, "tabItem");
        View view = this.itemView;
        StringBuilder sb = new StringBuilder();
        sb.append(x6bVar.l());
        sb.append(',');
        if (x6bVar.g()) {
            str = "已选中";
        } else {
            str = "未选中";
        }
        sb.append(str);
        view.setContentDescription(sb.toString());
        if (x6bVar.e() != null && x6bVar.d() != null && x6bVar.e().intValue() > 0 && x6bVar.d().intValue() > 0) {
            this.c.getLayoutParams().width = (int) ((x6bVar.e().intValue() / x6bVar.d().intValue()) * this.c.getLayoutParams().height);
        }
        if (x6bVar.g()) {
            String k = x6bVar.k();
            if (k == null || k.length() <= 0 || x6bVar.e() == null || x6bVar.d() == null) {
                h0(x6bVar);
            } else {
                g0(x6bVar.k(), x6bVar);
            }
        } else {
            String i2 = x6bVar.i();
            if (i2 == null || i2.length() <= 0 || x6bVar.e() == null || x6bVar.d() == null) {
                h0(x6bVar);
            } else {
                g0(x6bVar.i(), x6bVar);
            }
        }
        xho.a(this.b);
        xho.c(this.c);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        d0(this.b);
        d0(this.c);
        float f = x6bVar.g() ? 1.0f : 0.94f;
        e0(this.b, f, x6bVar.a());
        e0(this.c, f, x6bVar.a());
        x6bVar.n(false);
    }

    public final void c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d47164b", new Object[]{this});
            return;
        }
        x6b x6bVar = this.f;
        if (x6bVar != null && this.itemView.getParent() != null && !x6bVar.c()) {
            this.itemView.getGlobalVisibleRect(this.f11625a);
            if (this.f11625a.width() > 0 && this.f11625a.height() > 0) {
                Context context = this.itemView.getContext();
                ckf.e(context, "null cannot be cast to non-null type android.app.Activity");
                sda sdaVar = new sda((Activity) context);
                sdaVar.b("/trend_guide.jihuoye.tab", "EXP", z9u.ARG_TABNAME + x6bVar.j());
                x6bVar.o(true);
            }
        }
    }
}
