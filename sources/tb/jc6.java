package tb;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.triver.triver_shop.extension.dianmicX.Tab3AnimationIcon;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class jc6 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final long DXSHOPBOTTOMBARDYNAMICICON_ICONCOLOR = 2996147367631721393L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_ICONSIZE = 3509390040415201356L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_ICONTEXT = 3509390044709645142L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTCHANGEINTERVAL = 7049944458799027695L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTFLOATIMAGEURL = -8665795671564898961L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTLEFTPADDING = 6321539507945389731L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTLIST = -8683323834787387402L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTLOOPCOUNT = -3977750061979067390L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTRIGHTPADDING = 7075488932839357975L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_MAINIMAGECENTERYOFFSET = 1259256982731614911L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_MAINIMAGESIZE = 2108547873344541232L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_MAINIMAGEURL = 8579252501965633479L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_MAINOUTERIMAGESIZE = -1433620236813297852L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_MAINOUTERIMAGEURL = 7971744606345147355L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_SHOPBOTTOMBARDYNAMICICON = -4074703705987044470L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_TEXTBACKGROUNDCORNERRADIUS = -5849195966042282832L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_TEXTBACKGROUNDGRADIENTCOLOR = 5585097863839760653L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_TEXTBACKGROUNDHEIGHT = 6854205013373350962L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_TEXTBACKGROUNDMINWIDTH = 8383158790589313023L;
    public static final long DXSHOPBOTTOMBARDYNAMICICON_TEXTBACKGROUNDWIDTH = 6835572299126697432L;

    /* renamed from: a  reason: collision with root package name */
    public int f21913a;
    public int b;
    public String c;
    public int d;
    public String e;
    public int f;
    public JSONArray g;
    public int h;
    public int i;
    public int j;
    public int k;
    public String l;
    public int m;
    public int n;
    public String o;
    public int p;
    public int q;
    public int r;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766509323);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new jc6();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b {
        static {
            t2o.a(766509324);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public c(View view) {
            this.b = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int t = jc6.t(jc6.this) + jc6.u(jc6.this);
            jc6 jc6Var = jc6.this;
            TextPaint paint = ((Tab3AnimationIcon) this.b).getIconText().getPaint();
            ckf.f(paint, "weakView.iconText.paint");
            kew.g(((Tab3AnimationIcon) this.b).getIconText(), Math.max(Math.min(jc6.v(jc6Var, paint) + t, ((Tab3AnimationIcon) this.b).getWidth()), jc6.w(jc6.this)));
        }
    }

    static {
        t2o.a(766509322);
    }

    public static /* synthetic */ Object ipc$super(jc6 jc6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/extension/dianmicX/DXShopBottomBarDynamicIconWidgetNode");
        }
    }

    public static final /* synthetic */ int t(jc6 jc6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d7bbf4f", new Object[]{jc6Var})).intValue();
        }
        return jc6Var.f;
    }

    public static final /* synthetic */ int u(jc6 jc6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2acec312", new Object[]{jc6Var})).intValue();
        }
        return jc6Var.i;
    }

    public static final /* synthetic */ int v(jc6 jc6Var, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf19521e", new Object[]{jc6Var, paint})).intValue();
        }
        return jc6Var.x(paint);
    }

    public static final /* synthetic */ int w(jc6 jc6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8a9c6", new Object[]{jc6Var})).intValue();
        }
        return jc6Var.q;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new jc6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        ckf.g(context, "context");
        ckf.g(view, "weakView");
        super.onBindEvent(context, view, j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof jc6)) {
            super.onClone(dXWidgetNode, z);
            jc6 jc6Var = (jc6) dXWidgetNode;
            this.f21913a = jc6Var.f21913a;
            this.b = jc6Var.b;
            this.c = jc6Var.c;
            this.d = jc6Var.d;
            this.e = jc6Var.e;
            this.f = jc6Var.f;
            this.g = jc6Var.g;
            this.h = jc6Var.h;
            this.i = jc6Var.i;
            this.j = jc6Var.j;
            this.k = jc6Var.k;
            this.l = jc6Var.l;
            this.m = jc6Var.m;
            this.n = jc6Var.n;
            this.o = jc6Var.o;
            this.p = jc6Var.p;
            this.q = jc6Var.q;
            this.r = jc6Var.r;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        ckf.g(context, "context");
        return new Tab3AnimationIcon(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 2996147367631721393L) {
            this.f21913a = i;
        } else if (j == 3509390040415201356L) {
            this.b = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTCHANGEINTERVAL) {
            this.d = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTLEFTPADDING) {
            this.f = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTRIGHTPADDING) {
            this.i = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTLOOPCOUNT) {
            this.h = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_MAINIMAGECENTERYOFFSET) {
            this.j = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_MAINIMAGESIZE) {
            this.k = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_MAINOUTERIMAGESIZE) {
            this.m = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_TEXTBACKGROUNDCORNERRADIUS) {
            this.n = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_TEXTBACKGROUNDHEIGHT) {
            this.p = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_TEXTBACKGROUNDMINWIDTH) {
            this.q = i;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_TEXTBACKGROUNDWIDTH) {
            this.r = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTLIST) {
            this.g = jSONArray;
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        ckf.g(str, "attr");
        if (j == DXSHOPBOTTOMBARDYNAMICICON_ICONTEXT) {
            this.c = str;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_ICONTEXTFLOATIMAGEURL) {
            this.e = str;
        } else if (j == DXSHOPBOTTOMBARDYNAMICICON_MAINIMAGEURL) {
            this.l = str;
        } else if (j != DXSHOPBOTTOMBARDYNAMICICON_MAINOUTERIMAGEURL) {
            if (j == DXSHOPBOTTOMBARDYNAMICICON_TEXTBACKGROUNDGRADIENTCOLOR) {
                this.o = str;
            } else {
                super.onSetStringAttribute(j, str);
            }
        }
    }

    public final int x(Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3cff443", new Object[]{this, paint})).intValue();
        }
        JSONArray jSONArray = this.g;
        if (jSONArray == null || jSONArray.isEmpty()) {
            return 0;
        }
        float f = 0.0f;
        for (Object obj : jSONArray) {
            if (obj != null) {
                float measureText = paint.measureText((String) obj);
                if (measureText > f) {
                    f = measureText;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        return (int) f;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        ckf.g(context, "context");
        ckf.g(view, "weakView");
        if (view instanceof Tab3AnimationIcon) {
            Tab3AnimationIcon tab3AnimationIcon = (Tab3AnimationIcon) view;
            tab3AnimationIcon.getIconText().setText(this.c);
            tab3AnimationIcon.getIconText().setTextSize(0, this.b);
            tab3AnimationIcon.getIconText().setTextColor(this.f21913a);
            kew.e(tab3AnimationIcon.getIconText(), this.p);
            tab3AnimationIcon.getMainImage().setImageUrl(this.l);
            String str = this.o;
            if (str != null) {
                List y0 = wsq.y0(str, new char[]{','}, false, 0, 6, null);
                kew.S(tab3AnimationIcon.getFlIconText(), tab3AnimationIcon.getTab3IconTextBackgroundDrawable((String) i04.d0(y0, 0), (String) i04.d0(y0, 1), this.n));
            }
            tab3AnimationIcon.getIconTextFloatImage().setImageUrl(this.e);
            kew.e(tab3AnimationIcon.getMainImageLayout(), this.k);
            kew.g(tab3AnimationIcon.getMainImageLayout(), this.k);
            kew.e(tab3AnimationIcon.getBorderImageLayout(), this.m);
            kew.g(tab3AnimationIcon.getBorderImageLayout(), this.m);
            kew.e(tab3AnimationIcon.getBorderImage2(), this.m);
            kew.g(tab3AnimationIcon.getBorderImage2(), this.m);
            kew.d0(view, this.j);
            kew.e0(tab3AnimationIcon.getMainImageLayout(), true, this.k / 2);
            tab3AnimationIcon.getIconText().setPadding(this.f, 0, this.i, 0);
            int i = this.r + this.f + this.i;
            if (this.q != 0) {
                view.post(new c(view));
            } else {
                kew.g(tab3AnimationIcon.getIconText(), i);
            }
            tab3AnimationIcon.startBreathAni();
            tab3AnimationIcon.startSwitchText(this.d, this.h, this.g);
        }
    }
}
