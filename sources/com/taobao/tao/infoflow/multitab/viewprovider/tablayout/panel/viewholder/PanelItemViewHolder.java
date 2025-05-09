package com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.viewholder;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.PanelStyleModel;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.hpl;
import tb.i2b;
import tb.nmb;
import tb.o7d;
import tb.p2b;
import tb.t2o;
import tb.trs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PanelItemViewHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TextView f12479a;
    public final TUrlImageView b;
    public final nmb c;
    public final o7d d;
    public final View e;
    public long f = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f12480a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;

        public a(boolean z, JSONObject jSONObject, boolean z2, boolean z3) {
            this.f12480a = z;
            this.b = jSONObject;
            this.c = z2;
            this.d = z3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (!this.f12480a) {
                PanelItemViewHolder.b0(PanelItemViewHolder.this).u(this.b);
            } else if (!this.c) {
                PanelItemViewHolder.b0(PanelItemViewHolder.this).n(this.b);
            } else if (this.d) {
                PanelItemViewHolder.b0(PanelItemViewHolder.this).u(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f12481a;

        public b(boolean z) {
            this.f12481a = z;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            if (this.f12481a && !PanelItemViewHolder.c0(PanelItemViewHolder.this).D()) {
                PanelItemViewHolder.c0(PanelItemViewHolder.this).f();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f12482a;
        public final /* synthetic */ boolean b;

        public c(boolean z, boolean z2) {
            this.f12482a = z;
            this.b = z2;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            boolean z2 = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            nmb b0 = PanelItemViewHolder.b0(PanelItemViewHolder.this);
            if (!this.f12482a || !this.b) {
                z = false;
            } else {
                z = true;
            }
            b0.F(z);
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (System.currentTimeMillis() - PanelItemViewHolder.d0(PanelItemViewHolder.this) >= 300) {
                z2 = false;
            }
            PanelItemViewHolder.e0(PanelItemViewHolder.this, System.currentTimeMillis());
            return z2;
        }
    }

    static {
        t2o.a(729809574);
    }

    public PanelItemViewHolder(View view, nmb nmbVar, o7d o7dVar) {
        super(view);
        this.c = nmbVar;
        this.d = o7dVar;
        this.f12479a = (TextView) view.findViewWithTag(hpl.ITEM_TV_TAG);
        this.b = (TUrlImageView) view.findViewWithTag(hpl.ITEM_IV_TAG);
        this.e = view.findViewWithTag(hpl.ITEM_PARENT_TAG);
    }

    public static /* synthetic */ nmb b0(PanelItemViewHolder panelItemViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nmb) ipChange.ipc$dispatch("614e1ccc", new Object[]{panelItemViewHolder});
        }
        return panelItemViewHolder.c;
    }

    public static /* synthetic */ o7d c0(PanelItemViewHolder panelItemViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o7d) ipChange.ipc$dispatch("15806682", new Object[]{panelItemViewHolder});
        }
        return panelItemViewHolder.d;
    }

    public static /* synthetic */ long d0(PanelItemViewHolder panelItemViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("429b1f1e", new Object[]{panelItemViewHolder})).longValue();
        }
        return panelItemViewHolder.f;
    }

    public static /* synthetic */ long e0(PanelItemViewHolder panelItemViewHolder, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81e2bd8c", new Object[]{panelItemViewHolder, new Long(j)})).longValue();
        }
        panelItemViewHolder.f = j;
        return j;
    }

    public static /* synthetic */ Object ipc$super(PanelItemViewHolder panelItemViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/multitab/viewprovider/tablayout/panel/viewholder/PanelItemViewHolder");
    }

    public void f0(JSONObject jSONObject, PanelStyleModel panelStyleModel) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e37fd37", new Object[]{this, jSONObject, panelStyleModel});
        } else if (panelStyleModel != null && (jSONObject2 = jSONObject.getJSONObject("content")) != null) {
            i0(jSONObject2, panelStyleModel);
            h0(jSONObject2, panelStyleModel);
            g0(jSONObject);
        }
    }

    public final void g0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0ffff0", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("content");
        if (jSONObject2 != null) {
            boolean equals = TextUtils.equals(hpl.MY_CHANNEL, jSONObject2.getString(hpl.CURRENT_MENU_CODE));
            boolean D = this.d.D();
            boolean booleanValue = jSONObject2.getBooleanValue(hpl.IS_EDITABLE);
            ViewProxy.setOnClickListener(this.itemView, new a(equals, jSONObject, D, booleanValue));
            ViewProxy.setOnLongClickListener(this.itemView, new b(equals));
            ViewProxy.setOnTouchListener(this.itemView, new c(equals, booleanValue));
        }
    }

    public final void h0(JSONObject jSONObject, PanelStyleModel panelStyleModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d37f026f", new Object[]{this, jSONObject, panelStyleModel});
            return;
        }
        boolean equals = TextUtils.equals(hpl.MY_CHANNEL, jSONObject.getString(hpl.CURRENT_MENU_CODE));
        boolean D = this.d.D();
        boolean booleanValue = jSONObject.getBooleanValue(hpl.IS_EDITABLE);
        if (!equals) {
            p2b.q(this.b, panelStyleModel.plusSignImgUrl, "homepage-ads", i2b.IMAGE_STRATEGY_CONFIG);
            this.b.setImageUrl(panelStyleModel.plusSignImgUrl);
            this.b.setVisibility(0);
        } else if (!D) {
            this.b.setVisibility(8);
        } else if (booleanValue) {
            p2b.q(this.b, panelStyleModel.minusSignImgUrl, "homepage-ads", i2b.IMAGE_STRATEGY_CONFIG);
            this.b.setImageUrl(panelStyleModel.minusSignImgUrl);
            this.b.setVisibility(0);
        } else {
            this.b.setVisibility(8);
        }
    }

    public final void i0(JSONObject jSONObject, PanelStyleModel panelStyleModel) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a81f6b", new Object[]{this, jSONObject, panelStyleModel});
            return;
        }
        boolean D = this.d.D();
        boolean booleanValue = jSONObject.getBooleanValue(hpl.IS_CATEGORY_SELECT);
        boolean booleanValue2 = jSONObject.getBooleanValue(hpl.IS_EDITABLE);
        if (D) {
            if (booleanValue2) {
                str2 = panelStyleModel.editableTextColor;
            } else {
                str2 = panelStyleModel.unEditableTextColor;
            }
            if (booleanValue2) {
                str = panelStyleModel.editableBgColor;
            } else {
                str = panelStyleModel.unEditableBgColor;
            }
        } else {
            if (booleanValue) {
                str2 = panelStyleModel.textSelectColor;
            } else {
                str2 = panelStyleModel.textColor;
            }
            if (booleanValue) {
                str = panelStyleModel.selectBgColor;
            } else {
                str = panelStyleModel.bgColor;
            }
        }
        this.f12479a.setTextColor(hpl.e(str2, "#333333"));
        this.f12479a.setText(jSONObject.getString("text"));
        GradientDrawable gradientDrawable = (GradientDrawable) this.e.getBackground();
        if (gradientDrawable == null) {
            gradientDrawable = new GradientDrawable();
        }
        gradientDrawable.setColor(hpl.e(str, "#F6F6F6"));
        gradientDrawable.setCornerRadius(trs.a(this.e.getContext(), 6.0f));
        this.e.setBackground(gradientDrawable);
    }
}
