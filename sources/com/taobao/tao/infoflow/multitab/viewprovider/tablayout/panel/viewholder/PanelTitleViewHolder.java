package com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.viewholder;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import tb.d9j;
import tb.hpl;
import tb.nmb;
import tb.o7d;
import tb.t2o;
import tb.trs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PanelTitleViewHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TextView f12483a;
    public final TextView b;
    public final TextView c;
    public final o7d d;
    public final nmb e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f12484a;

        public a(boolean z) {
            this.f12484a = z;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            d9j.c("PanelTitleViewHolder", "title is myChannel:" + this.f12484a);
            if (this.f12484a && !PanelTitleViewHolder.b0(PanelTitleViewHolder.this).D()) {
                d9j.c("PanelTitleViewHolder", "title onEditingState:");
                PanelTitleViewHolder.b0(PanelTitleViewHolder.this).f();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            PanelTitleViewHolder.c0(PanelTitleViewHolder.this).F(false);
            return false;
        }
    }

    static {
        t2o.a(729809578);
    }

    public PanelTitleViewHolder(View view, nmb nmbVar, o7d o7dVar) {
        super(view);
        this.d = o7dVar;
        this.e = nmbVar;
        this.f12483a = (TextView) view.findViewWithTag(hpl.TITLE_MAIN_TAG);
        this.b = (TextView) view.findViewWithTag(hpl.TITLE_SUB_TAG);
        this.c = (TextView) view.findViewWithTag(hpl.DEFAULT_TITLE_TAG);
    }

    public static /* synthetic */ o7d b0(PanelTitleViewHolder panelTitleViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o7d) ipChange.ipc$dispatch("310f74d4", new Object[]{panelTitleViewHolder});
        }
        return panelTitleViewHolder.d;
    }

    public static /* synthetic */ nmb c0(PanelTitleViewHolder panelTitleViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nmb) ipChange.ipc$dispatch("16f2513e", new Object[]{panelTitleViewHolder});
        }
        return panelTitleViewHolder.e;
    }

    public static /* synthetic */ Object ipc$super(PanelTitleViewHolder panelTitleViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/multitab/viewprovider/tablayout/panel/viewholder/PanelTitleViewHolder");
    }

    public final int e0(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a65dccc3", new Object[]{this, jSONObject, str, str2})).intValue();
        }
        String string = jSONObject.getString(str);
        if (string == null) {
            return Color.parseColor(str2);
        }
        try {
            return Color.parseColor(string);
        } catch (Exception unused) {
            return Color.parseColor(str2);
        }
    }

    public void d0(JSONObject jSONObject) {
        TextView textView;
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde2ba22", new Object[]{this, jSONObject});
            return;
        }
        boolean equals = TextUtils.equals(jSONObject.getString(hpl.MENU_CODE), hpl.MY_CHANNEL);
        if (!equals) {
            StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) this.itemView.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = trs.a(this.itemView.getContext(), 14.0f);
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = trs.a(this.itemView.getContext(), 5.0f);
            this.itemView.setLayoutParams(layoutParams);
        }
        boolean D = this.d.D();
        TextView textView2 = this.f12483a;
        if (textView2 != null) {
            textView2.setText(jSONObject.getString(hpl.SECTION_NAME));
            this.f12483a.setTextSize(16.0f);
            this.f12483a.setTextColor(Color.parseColor("#333333"));
        }
        TextView textView3 = this.b;
        if (textView3 != null) {
            String str2 = hpl.EDIT_INTRODUCER_TEXT;
            if (D) {
                str = jSONObject.getString(str2);
            } else {
                str = jSONObject.getString(hpl.INTRODUCER_TEXT);
            }
            textView3.setText(str);
            this.b.setTextSize(12.0f);
            TextView textView4 = this.b;
            if (!D) {
                str2 = hpl.INTRODUCER_TEXT_COLOR;
            }
            textView4.setTextColor(e0(jSONObject, str2, "#999999"));
        }
        if (this.c != null) {
            int measuredWidth = (this.itemView.getMeasuredWidth() - this.c.getMeasuredWidth()) / 2;
            this.c.setPadding(measuredWidth, 0, measuredWidth, 0);
            this.c.setText(jSONObject.getString(hpl.ALL_ADDED_TEXT));
            this.c.setTextColor(jSONObject.getIntValue(hpl.ALL_ADDED_TEXT_COLOR));
            this.c.setTextSize(12.0f);
        }
        TextView textView5 = this.b;
        if (!(textView5 == null || (textView = this.c) == null)) {
            if (textView.getVisibility() == 0) {
                i = 8;
            }
            textView5.setVisibility(i);
        }
        View view = this.itemView;
        if (view != null) {
            ViewProxy.setOnLongClickListener(view, new a(equals));
            ViewProxy.setOnTouchListener(this.itemView, new b());
        }
    }
}
