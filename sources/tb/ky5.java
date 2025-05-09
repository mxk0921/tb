package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ky5 implements jwb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public jwb f22998a = null;
    public final evb b = new pd6();
    public final evb c = new rk5();
    public final evb d = new vn5();
    public final evb e = new vo5();
    public final evb f = new ai5();
    public final evb g = new zj5();
    public final evb h = new tn5();
    public final evb i = new oo5();
    public final evb j = new wq5();
    public final evb k = new rw5();
    public final evb l = new fk5();
    public final evb m = new at5();
    public final evb n = new sq5();
    public final evb o = new dt5();
    public final evb p = new rj5();
    public final evb q = new kj5();
    public final evb r = new ji5();
    public final evb s = new gk5();
    public final evb t = new t26();
    public final evb u = new md6();
    public final evb v = new lv5();
    public final evb w = new ts5();
    public final evb x = new lk5();

    static {
        t2o.a(444596507);
        t2o.a(444596621);
    }

    @Override // tb.jwb
    public evb get(long j) {
        evb evbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (evb) ipChange.ipc$dispatch("ac447d9e", new Object[]{this, new Long(j)});
        }
        jwb jwbVar = this.f22998a;
        if (jwbVar != null && (evbVar = jwbVar.get(j)) != null) {
            return evbVar;
        }
        if (j == 33556442494L) {
            return this.k;
        }
        if (j == ts5.DX_PARSER_TOBINDINGXUNIT) {
            return this.w;
        }
        if (j == 10224770040602390L) {
            return this.o;
        }
        if (j == 8985048662794750L) {
            return this.n;
        }
        if (j == at5.DX_PARSER_TOSTR) {
            return this.m;
        }
        if (j == ai5.DX_PARSER_ADD) {
            return this.f;
        }
        if (j == oo5.DX_PARSER_MUL) {
            return this.i;
        }
        if (j == zj5.DX_PARSER_DIV) {
            return this.g;
        }
        if (j == wq5.DX_PARSER_SUB) {
            return this.j;
        }
        if (j == 522748242) {
            return this.h;
        }
        if (j == 5326177973899923051L) {
            return this.u;
        }
        if (j == 803695) {
            return this.e;
        }
        if (j == 17466137112765L) {
            return this.l;
        }
        if (j == rj5.DX_PARSER_DATAPARSERNOTFOUND) {
            return this.p;
        }
        if (j == gk5.DX_PARSER_EVENTHANDLERNOTFOUND) {
            return this.s;
        }
        if (j == 2311459087270464967L) {
            return this.r;
        }
        if (j == lv5.DX_PARSER_EVENTCHAINEVENTDATA) {
            return this.v;
        }
        if (j == -7155988592997126393L) {
            return this.c;
        }
        if (j == vn5.DX_PARSER_LESSEQUAL) {
            return this.d;
        }
        if (j == kj5.DX_PARSER_COLORMAP) {
            return this.q;
        }
        if (j == lk5.DX_PARSER_SIZEBYFACTOR) {
            return this.x;
        }
        if (j == pd6.DX_PARSER_SUBDATAINDEX) {
            return this.b;
        }
        if (j == t26.DX_PARSER_LISTDATA) {
            return this.t;
        }
        return jy5.a().get(j);
    }
}
