package com.airbnb.lottie.model.layer;

import com.airbnb.lottie.model.content.Mask;
import java.util.List;
import java.util.Locale;
import tb.ag2;
import tb.e08;
import tb.jx0;
import tb.kkh;
import tb.sx0;
import tb.tp4;
import tb.tx0;
import tb.vx0;
import tb.w4g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Layer {

    /* renamed from: a  reason: collision with root package name */
    public final List<tp4> f1854a;
    public final kkh b;
    public final String c;
    public final long d;
    public final LayerType e;
    public final long f;
    public final String g;
    public final List<Mask> h;
    public final vx0 i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final int o;
    public final int p;
    public final sx0 q;
    public final tx0 r;
    public final jx0 s;
    public final List<w4g<Float>> t;
    public final MatteType u;
    public final boolean v;
    public final ag2 w;
    public final e08 x;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<tp4> list, kkh kkhVar, String str, long j, LayerType layerType, long j2, String str2, List<Mask> list2, vx0 vx0Var, int i, int i2, int i3, float f, float f2, int i4, int i5, sx0 sx0Var, tx0 tx0Var, List<w4g<Float>> list3, MatteType matteType, jx0 jx0Var, boolean z, ag2 ag2Var, e08 e08Var) {
        this.f1854a = list;
        this.b = kkhVar;
        this.c = str;
        this.d = j;
        this.e = layerType;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = vx0Var;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = i4;
        this.p = i5;
        this.q = sx0Var;
        this.r = tx0Var;
        this.t = list3;
        this.u = matteType;
        this.s = jx0Var;
        this.v = z;
        this.w = ag2Var;
        this.x = e08Var;
    }

    public ag2 a() {
        return this.w;
    }

    public kkh b() {
        return this.b;
    }

    public e08 c() {
        return this.x;
    }

    public long d() {
        return this.d;
    }

    public List<w4g<Float>> e() {
        return this.t;
    }

    public LayerType f() {
        return this.e;
    }

    public List<Mask> g() {
        return this.h;
    }

    public MatteType h() {
        return this.u;
    }

    public String i() {
        return this.c;
    }

    public long j() {
        return this.f;
    }

    public int k() {
        return this.p;
    }

    public int l() {
        return this.o;
    }

    public String m() {
        return this.g;
    }

    public List<tp4> n() {
        return this.f1854a;
    }

    public int o() {
        return this.l;
    }

    public int p() {
        return this.k;
    }

    public int q() {
        return this.j;
    }

    public float r() {
        return this.n / this.b.e();
    }

    public sx0 s() {
        return this.q;
    }

    public tx0 t() {
        return this.r;
    }

    public String toString() {
        return y("");
    }

    public jx0 u() {
        return this.s;
    }

    public float v() {
        return this.m;
    }

    public vx0 w() {
        return this.i;
    }

    public boolean x() {
        return this.v;
    }

    public String y(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i());
        sb.append("\n");
        long j = j();
        kkh kkhVar = this.b;
        Layer t = kkhVar.t(j);
        if (t != null) {
            sb.append("\t\tParents: ");
            sb.append(t.i());
            for (Layer t2 = kkhVar.t(t.j()); t2 != null; t2 = kkhVar.t(t2.j())) {
                sb.append("->");
                sb.append(t2.i());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!g().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(g().size());
            sb.append("\n");
        }
        if (!(q() == 0 || p() == 0)) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(q()), Integer.valueOf(p()), Integer.valueOf(o())));
        }
        List<tp4> list = this.f1854a;
        if (!list.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (tp4 tp4Var : list) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(tp4Var);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
