package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.megadesign.priceview.MegaPriceView;
import tb.gi6;
import tb.pb6;
import tb.qub;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b0 extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_COLOR = -40448;
    public static final int DEFAULT_TEXT_SIZE = pb6.f(DinamicXEngine.x(), 20.0f);
    public static final long DXMEGAPRICEVIEW_CURRENCYPOSITION = 1889465652151880656L;
    public static final int DXMEGAPRICEVIEW_CURRENCYPOSITION_NONE = 0;
    public static final long DXMEGAPRICEVIEW_CURRENCYSIZE = 2412536335713470738L;
    public static final long DXMEGAPRICEVIEW_CURRENCYSYMBOL = -4294121039767016465L;
    public static final long DXMEGAPRICEVIEW_DECIMALSIZE = -8437878173453059723L;
    public static final long DXMEGAPRICEVIEW_DECIMALSYMBOL = 6361406902743078994L;
    public static final long DXMEGAPRICEVIEW_FONT = 34149272427L;
    public static final long DXMEGAPRICEVIEW_FORMATTEDPRICE = 2546470071974585799L;
    public static final long DXMEGAPRICEVIEW_MEGAPRICEVIEW = 3136096069336334357L;
    public static final long DXMEGAPRICEVIEW_PRICESTYLE = 6355001308655702062L;
    public static final long DXMEGAPRICEVIEW_TEXTCOLOR = 5737767606580872653L;
    public static final long DXMEGAPRICEVIEW_TEXTSIZE = 6751005219504497256L;
    public float D0;
    public String E0;
    public float F0;
    public String G0;
    public String H0;
    public int I0;
    public float K0;
    public int C0 = 0;
    public int J0 = DEFAULT_COLOR;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new b0();
        }
    }

    public b0() {
        int i = DEFAULT_TEXT_SIZE;
        this.K0 = i;
        setTextSize(i);
        setFont("iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf");
    }

    public static /* synthetic */ Object ipc$super(b0 b0Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 28626114:
                super.onEndParser();
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXMegaPriceViewWidgetNode");
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new b0();
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXMEGAPRICEVIEW_CURRENCYPOSITION) {
            return 0;
        }
        if (j == 6751005219504497256L) {
            return DEFAULT_TEXT_SIZE;
        }
        if (j == 5737767606580872653L) {
            return DEFAULT_COLOR;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)});
        }
        if (j == 34149272427L) {
            return "iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf";
        }
        return super.getDefaultValueForStringAttr(j);
    }

    public final void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ce4a5b", new Object[]{this});
        } else if (TextUtils.isEmpty(this.text)) {
            com.taobao.android.megadesign.priceview.a aVar = new com.taobao.android.megadesign.priceview.a();
            aVar.f = this.C0;
            aVar.e = this.D0;
            aVar.d = this.E0;
            aVar.c = this.F0;
            aVar.b = this.G0;
            aVar.h = this.K0;
            aVar.f8927a = this.H0;
            aVar.g = this.I0;
            setText(MegaPriceView.parsePrice(aVar));
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof b0)) {
            super.onClone(dXWidgetNode, z);
            b0 b0Var = (b0) dXWidgetNode;
            this.C0 = b0Var.C0;
            this.D0 = b0Var.D0;
            this.E0 = b0Var.E0;
            this.F0 = b0Var.F0;
            this.G0 = b0Var.G0;
            this.H0 = b0Var.H0;
            this.I0 = b0Var.I0;
            this.J0 = b0Var.J0;
            this.K0 = b0Var.K0;
            this.text = b0Var.text;
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onEndParser() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4ccc2", new Object[]{this});
            return;
        }
        super.onEndParser();
        m0();
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        setTextColor(this.J0);
        super.onRenderView(context, view);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXMEGAPRICEVIEW_CURRENCYPOSITION) {
            this.C0 = i;
        } else if (j == DXMEGAPRICEVIEW_CURRENCYSIZE) {
            if (i > 0) {
                this.D0 = i;
            }
        } else if (j == DXMEGAPRICEVIEW_DECIMALSIZE) {
            if (i > 0) {
                this.F0 = i;
            }
        } else if (j == DXMEGAPRICEVIEW_PRICESTYLE) {
            this.I0 = i;
        } else if (j == 5737767606580872653L) {
            this.J0 = i;
        } else if (j != 6751005219504497256L) {
            super.onSetIntAttribute(j, i);
        } else if (i > 0) {
            float f = i;
            this.K0 = f;
            setTextSize(f);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXMEGAPRICEVIEW_CURRENCYSYMBOL) {
            this.E0 = str;
        } else if (j == DXMEGAPRICEVIEW_DECIMALSYMBOL) {
            this.G0 = str;
        } else if (j == DXMEGAPRICEVIEW_FORMATTEDPRICE) {
            this.H0 = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }
}
