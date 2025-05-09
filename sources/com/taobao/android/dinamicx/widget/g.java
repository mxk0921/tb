package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.view.DXNativeCountDownTimerView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.fv9;
import tb.pb6;
import tb.qub;
import tb.t2o;
import tb.wc6;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class g extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_TEXT_COLOR = -16777216;
    public static final long DXCOUNTDOWNVIEW_FONT = 34149272427L;
    public static final int DXCOUNTDOWNVIEW_FONTSTYLE_BOLD = 1;
    public static final int DXCOUNTDOWNVIEW_FONTSTYLE_NONE = -1;
    public static final int DXCOUNTDOWNVIEW_FONTSTYLE_NORMAL = 0;
    public static final long DXCOUNTDOWNVIEW_SHOWHOURSECOND = -8830056631125429559L;
    public static final long DXCOUNTDOWNVIEW_SHOWMINUTESECOND = 4747633075395742623L;
    public String K;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g;
    public int i;
    public int j;
    public int k;
    public int l;
    public double m;
    public int o;
    public int s;
    public int t;
    public int u;
    public int v;
    public long w;
    public long x;
    public double y;
    public double z;

    /* renamed from: a  reason: collision with root package name */
    public String f7435a = ":";
    public int b = -16777216;
    public int h = -16777216;
    public int n = -16777216;
    public int p = -1;
    public int q = 0;
    public int r = 0;
    public boolean A = true;
    public boolean B = true;
    public boolean C = true;
    public boolean D = false;
    public int E = 1;
    public String F = null;
    public boolean G = true;
    public boolean H = false;
    public boolean I = false;
    public int J = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements DXNativeCountDownTimerView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.dinamicx.view.DXNativeCountDownTimerView.b
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else {
                g.this.postEvent(new DXEvent(wc6.DXSMARTLAYERCOUNTDOWNTEXTVIEW_ONCOUNTDOWNFINISH));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597288);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new g();
        }
    }

    static {
        t2o.a(444597286);
    }

    public g() {
        this.m = 12.0d;
        this.y = 10.0d;
        this.z = 12.0d;
        if (DinamicXEngine.x() != null) {
            this.y = pb6.f(DinamicXEngine.x(), 10.0f);
            this.z = pb6.f(DinamicXEngine.x(), 12.0f);
            this.m = pb6.f(DinamicXEngine.x(), 12.0f);
        }
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1133248269) {
            return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
        }
        if (hashCode == 2119721610) {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/DXCountDownTimerWidgetNode");
    }

    public final void A(DXNativeCountDownTimerView dXNativeCountDownTimerView, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7, int i8, int i9) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        int i10;
        TextView textView5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6960c8", new Object[]{this, dXNativeCountDownTimerView, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Double(d), new Integer(i7), new Integer(i8), new Integer(i9)});
            return;
        }
        TextView hour = dXNativeCountDownTimerView.getHour();
        TextView minute = dXNativeCountDownTimerView.getMinute();
        TextView second = dXNativeCountDownTimerView.getSecond();
        TextView milli = dXNativeCountDownTimerView.getMilli();
        if (this.B) {
            textView4 = milli;
            textView2 = second;
            textView = minute;
            textView3 = hour;
            i10 = 0;
            y(hour, i, i2, i3, i4, i5, i6, d, i7);
            textView3.setVisibility(0);
        } else {
            textView4 = milli;
            textView2 = second;
            textView = minute;
            textView3 = hour;
            i10 = 0;
            textView3.setVisibility(8);
        }
        if (this.C) {
            y(textView, i, i2, i3, i4, i5, i6, d, i7);
            textView5 = textView;
            textView5.setVisibility(i10);
        } else {
            textView5 = textView;
            textView5.setVisibility(8);
        }
        y(textView2, i, i2, i3, i4, i5, i6, d, i7);
        if (this.D) {
            textView4.setVisibility(i10);
            y(textView4, i, i2, i3, i4, (this.E != 1 || !this.H || i5 <= 0) ? i5 : i5 / 2, i6, d, i7);
        } else {
            textView4.setVisibility(8);
        }
        z(textView3, textView5, textView2, textView4, i8, i9);
        if (!TextUtils.isEmpty(this.K)) {
            setNativeTextFont(textView3, this.K, this.J);
            setNativeTextFont(textView4, this.K, this.J);
            setNativeTextFont(textView5, this.K, this.J);
            setNativeTextFont(textView2, this.K, this.J);
            return;
        }
        int i11 = this.J;
        if (i11 != -1) {
            Typeface t = t(i11);
            textView3.setTypeface(t);
            textView4.setTypeface(t);
            textView5.setTypeface(t);
            textView2.setTypeface(t);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new g();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 836506953899434884L || j == -7569082268550024243L) {
            return -16777216;
        }
        if (j == 3586614778875286483L) {
            return -1;
        }
        if (j == -502340563974947291L || j == -7371269035395216254L) {
            return 1;
        }
        if (j == -8574960089337605395L) {
            return 0;
        }
        if (j == DXCOUNTDOWNVIEW_SHOWHOURSECOND || j == DXCOUNTDOWNVIEW_SHOWMINUTESECOND || j == -1618928292660898964L) {
            return 1;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof g) {
            g gVar = (g) dXWidgetNode;
            this.w = gVar.w;
            this.x = gVar.x;
            this.b = gVar.b;
            this.f7435a = gVar.f7435a;
            this.c = gVar.c;
            this.d = gVar.d;
            this.e = gVar.e;
            this.f = gVar.f;
            this.y = gVar.y;
            this.g = gVar.g;
            this.m = gVar.m;
            this.h = gVar.h;
            this.j = gVar.j;
            this.l = gVar.l;
            this.k = gVar.k;
            this.i = gVar.i;
            this.n = gVar.n;
            this.o = gVar.o;
            this.p = gVar.p;
            this.q = gVar.q;
            this.r = gVar.r;
            this.s = gVar.s;
            this.t = gVar.t;
            this.v = gVar.v;
            this.u = gVar.u;
            this.z = gVar.z;
            this.A = gVar.A;
            this.B = gVar.B;
            this.C = gVar.C;
            this.D = gVar.D;
            this.F = gVar.F;
            this.E = gVar.E;
            this.H = gVar.H;
            this.I = gVar.I;
            this.J = gVar.J;
            this.K = gVar.K;
            this.G = gVar.G;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new DXNativeCountDownTimerView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2 = true;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(i);
        int a3 = DXWidgetNode.DXMeasureSpec.a(i2);
        if (a2 == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (a3 != 1073741824) {
            z2 = false;
        }
        if (z) {
            i3 = DXWidgetNode.DXMeasureSpec.b(i);
        } else {
            i3 = 0;
        }
        if (z2) {
            i4 = DXWidgetNode.DXMeasureSpec.b(i2);
        }
        setMeasuredDimension(i3, i4);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (-7569082268550024243L == j) {
            this.b = i;
        } else if (-5446467777356887384L == j) {
            this.c = i;
        } else if (-2349968600282703684L == j) {
            this.d = i;
        } else if (-4097512581907102928L == j) {
            this.e = i;
        } else if (2974479846771431523L == j) {
            this.f = i;
        } else if (836506953899434884L == j) {
            this.h = i;
        } else if (-6389039416330352289L == j) {
            this.i = i;
        } else if (-991465590347635341L == j) {
            this.j = i;
        } else if (6878642454060075239L == j) {
            this.k = i;
        } else if (-1982127542287307750L == j) {
            this.l = i;
        } else if (-2066932502216216012L == j) {
            this.n = i;
        } else if (-7541914668888054013L == j) {
            this.o = i;
        } else if (3586614778875286483L == j) {
            this.p = i;
        } else if (-5195705055003868114L == j) {
            this.q = i;
        } else if (3588042683016644308L == j) {
            this.r = i;
        } else if (4113718844605699246L == j) {
            this.s = i;
        } else if (4975799217651406530L == j) {
            this.t = i;
        } else if (-5434794314794449098L == j) {
            this.u = i;
        } else if (-3498357187900469143L == j) {
            this.v = i;
        } else if (-5268712888762272737L == j) {
            this.m = i;
        } else if (9031654720231161192L == j) {
            this.y = i;
        } else if (5087222913038931822L == j) {
            this.z = i;
        } else if (-502340563974947291L == j) {
            if (i == 0) {
                z = false;
            }
            this.A = z;
        } else if (j == DXCOUNTDOWNVIEW_SHOWHOURSECOND) {
            if (i == 0) {
                z = false;
            }
            this.B = z;
        } else if (j == DXCOUNTDOWNVIEW_SHOWMINUTESECOND) {
            if (i == 0) {
                z = false;
            }
            this.C = z;
        } else if (-2361257553306292445L == j) {
            if (i == 0) {
                z = false;
            }
            this.D = z;
        } else if (-7371269035395216254L == j) {
            this.E = i;
        } else if (-8574960089337605395L == j) {
            if (i == 0) {
                z = false;
            }
            this.H = z;
        } else if (-1047143332071710891L == j) {
            if (i == 0) {
                z = false;
            }
            this.I = z;
        } else if (j == -435593654112940591L) {
            this.J = i;
        } else if (j == -1618928292660898964L) {
            if (i == 0) {
                z = false;
            }
            this.G = z;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetLongAttribute(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1e5bc4", new Object[]{this, new Long(j), new Long(j2)});
        } else if (8195572952744500637L == j) {
            this.w = j2;
        } else if (8766053855851211060L == j) {
            this.x = j2;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (7523271490450403529L == j) {
            this.f7435a = str;
        } else if (-7803598294486378310L == j) {
            this.F = str;
        } else if (4189101800495477120L == j) {
            this.g = str;
        } else if (j == 34149272427L) {
            this.K = str;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 3;
    }

    public void setNativeTextFont(TextView textView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b1cf11", new Object[]{this, textView, str, new Integer(i)});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                if (DinamicXEngine.x() == null) {
                    setNativeTextStyle(textView, i);
                    return;
                }
                Typeface b2 = fv9.c().b(str, u(i));
                if (b2 != null) {
                    textView.setTypeface(b2);
                } else {
                    setNativeTextStyle(textView, i);
                }
            } catch (Throwable th) {
                setNativeTextStyle(textView, i);
                xv5.c(th, false);
            }
        }
    }

    public void setNativeTextStyle(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7415a331", new Object[]{this, textView, new Integer(i)});
        } else {
            textView.setTypeface(t(i));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue();
        }
        if (getClass() == g.class) {
            return true;
        }
        return false;
    }

    public final Typeface t(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("50abf856", new Object[]{this, new Integer(i)});
        }
        return Typeface.defaultFromStyle(u(i));
    }

    public final int u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2739be5a", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i != 0) {
            return 1;
        }
        return 0;
    }

    public final void v(DXNativeCountDownTimerView dXNativeCountDownTimerView, int i, int i2, int i3, int i4, double d, int i5, String str, String str2) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7611e9f6", new Object[]{this, dXNativeCountDownTimerView, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Double(d), new Integer(i5), str, str2});
            return;
        }
        TextView colonFirst = dXNativeCountDownTimerView.getColonFirst();
        TextView colonSecond = dXNativeCountDownTimerView.getColonSecond();
        TextView colonThird = dXNativeCountDownTimerView.getColonThird();
        if (this.B) {
            textView2 = colonThird;
            textView = colonSecond;
            textView3 = colonFirst;
            y(colonFirst, i, i2, i3, i4, 0, 0, d, i5);
            textView3.setVisibility(0);
        } else {
            textView2 = colonThird;
            textView = colonSecond;
            textView3 = colonFirst;
            textView3.setVisibility(8);
        }
        if (this.C) {
            y(textView, i, i2, i3, i4, 0, 0, d, i5);
            textView4 = textView;
            textView4.setVisibility(0);
        } else {
            textView4 = textView;
            textView4.setVisibility(8);
        }
        if (this.D) {
            textView2.setVisibility(0);
            textView5 = textView2;
            textView6 = textView4;
            y(textView2, i, i2, i3, i4, 0, 0, d, i5);
        } else {
            textView6 = textView4;
            textView5 = textView2;
            textView5.setVisibility(8);
        }
        textView3.setText(str);
        textView6.setText(str);
        if (str2 != null) {
            textView5.setText(str2);
        } else {
            textView5.setText(str);
        }
        if (!this.G) {
            textView3.setIncludeFontPadding(false);
            textView6.setIncludeFontPadding(false);
            textView5.setIncludeFontPadding(false);
        }
        if (!TextUtils.isEmpty(this.K)) {
            setNativeTextFont(textView3, this.K, this.J);
            setNativeTextFont(textView6, this.K, this.J);
            setNativeTextFont(textView5, this.K, this.J);
            return;
        }
        int i6 = this.J;
        if (i6 != -1) {
            Typeface t = t(i6);
            textView3.setTypeface(t);
            textView6.setTypeface(t);
            textView5.setTypeface(t);
        }
    }

    public final void w(DXNativeCountDownTimerView dXNativeCountDownTimerView, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f6ff8ad", new Object[]{this, dXNativeCountDownTimerView, new Long(j), new Long(j2)});
            return;
        }
        dXNativeCountDownTimerView.setFutureTime(j);
        dXNativeCountDownTimerView.setCurrentTime(j2);
        if (dXNativeCountDownTimerView.getLastTime() > 0) {
            dXNativeCountDownTimerView.showCountDown();
            dXNativeCountDownTimerView.updateCountView();
            dXNativeCountDownTimerView.getTimer().e();
            dXNativeCountDownTimerView.setOnFinishListener(new a());
            return;
        }
        dXNativeCountDownTimerView.setOnFinishListener(null);
        dXNativeCountDownTimerView.hideCountDown();
        dXNativeCountDownTimerView.getTimer().g();
        postEvent(new DXEvent(wc6.DXSMARTLAYERCOUNTDOWNTEXTVIEW_ONCOUNTDOWNFINISH));
    }

    public final void x(DXNativeCountDownTimerView dXNativeCountDownTimerView, String str, int i, int i2, int i3, int i4, double d, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a241f95", new Object[]{this, dXNativeCountDownTimerView, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Double(d), new Integer(i5)});
            return;
        }
        TextView seeMoreView = dXNativeCountDownTimerView.getSeeMoreView();
        seeMoreView.setText(str);
        y(seeMoreView, i, i2, i3, i4, 0, 0, d, i5);
        if (!TextUtils.isEmpty(this.K)) {
            setNativeTextFont(seeMoreView, this.K, this.J);
        }
    }

    public final void y(TextView textView, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c352a245", new Object[]{this, textView, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Double(d), new Integer(i7)});
            return;
        }
        textView.setTextSize(0, (float) d);
        textView.setTextColor(i7);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        if (i5 != 0) {
            marginLayoutParams.width = i5;
        }
        if (i6 != 0) {
            marginLayoutParams.height = i6;
        }
        marginLayoutParams.setMargins(i, i2, i3, i4);
        textView.setLayoutParams(marginLayoutParams);
    }

    public final void z(TextView textView, TextView textView2, TextView textView3, TextView textView4, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c41845", new Object[]{this, textView, textView2, textView3, textView4, new Integer(i), new Integer(i2)});
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f = i2;
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(i);
        textView.setBackgroundDrawable(gradientDrawable);
        textView2.setBackgroundDrawable(gradientDrawable);
        textView3.setBackgroundDrawable(gradientDrawable);
        if (!this.D) {
            return;
        }
        if (this.E != 1 || !this.H) {
            textView4.setBackgroundDrawable(gradientDrawable);
            return;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(f);
        gradientDrawable2.setColor(i);
        textView4.setBackgroundDrawable(gradientDrawable2);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view != null && (view instanceof DXNativeCountDownTimerView)) {
            DXNativeCountDownTimerView dXNativeCountDownTimerView = (DXNativeCountDownTimerView) view;
            if (!(getDXRuntimeContext() == null || getDXRuntimeContext().s() == null)) {
                long a2 = getDXRuntimeContext().s().a();
                if (this.I && a2 > 0) {
                    this.w = a2;
                }
            }
            dXNativeCountDownTimerView.setShowMilliSecond(this.D);
            dXNativeCountDownTimerView.setMilliSecondDigitCount(this.E);
            int tryFetchDarkModeColor = tryFetchDarkModeColor("colonTextColor", 0, this.b);
            int tryFetchDarkModeColor2 = tryFetchDarkModeColor("seeMoreTextColor", 0, this.h);
            A(dXNativeCountDownTimerView, this.t, this.v, this.u, this.s, this.r, this.q, this.z, tryFetchDarkModeColor("timerTextColor", 0, this.p), tryFetchDarkModeColor("timerBackgroundColor", 1, this.n), this.o);
            v(dXNativeCountDownTimerView, this.d, this.f, this.e, this.c, this.y, tryFetchDarkModeColor, this.f7435a, this.F);
            x(dXNativeCountDownTimerView, this.g, this.j, this.l, this.k, this.i, this.m, tryFetchDarkModeColor2);
            dXNativeCountDownTimerView.setShowSeeMoreText(this.A);
            w(dXNativeCountDownTimerView, this.x, this.w);
        }
    }
}
