package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.b0;
import com.taobao.android.megadesign.priceview.MegaPriceView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v5z extends nu<MegaPriceView, a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends an6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public float l;
        public String m;
        public float n;
        public String o;
        public String p;
        public String q;
        public int r;
        public int k = 0;
        public float t = b0.DEFAULT_TEXT_SIZE;
        public int s = b0.DEFAULT_COLOR;

        public static /* synthetic */ int i(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e598646e", new Object[]{aVar})).intValue();
            }
            return aVar.k;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1764761226) {
                super.b((fae) objArr[0]);
                return null;
            } else if (hashCode == 111792625) {
                super.d(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            } else if (hashCode == 1589527152) {
                super.g(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/DxNanoPriceViewDesc$DxNanoPriceViewProps");
            }
        }

        public static /* synthetic */ float j(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2d97c2ca", new Object[]{aVar})).floatValue();
            }
            return aVar.l;
        }

        public static /* synthetic */ float k(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("75972129", new Object[]{aVar})).floatValue();
            }
            return aVar.n;
        }

        public static /* synthetic */ float l(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bd967f88", new Object[]{aVar})).floatValue();
            }
            return aVar.t;
        }

        public static /* synthetic */ String m(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("193ae389", new Object[]{aVar});
            }
            return aVar.m;
        }

        public static /* synthetic */ String n(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("72462f0a", new Object[]{aVar});
            }
            return aVar.o;
        }

        public static /* synthetic */ String o(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cb517a8b", new Object[]{aVar});
            }
            return aVar.q;
        }

        public static /* synthetic */ int p(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dd93f907", new Object[]{aVar})).intValue();
            }
            return aVar.r;
        }

        public static /* synthetic */ int q(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("25935766", new Object[]{aVar})).intValue();
            }
            return aVar.s;
        }

        public static /* synthetic */ String r(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d6735d0e", new Object[]{aVar});
            }
            return aVar.p;
        }

        @Override // tb.an6, tb.fae
        public void b(fae faeVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96cfe176", new Object[]{this, faeVar});
                return;
            }
            super.b(faeVar);
            if (faeVar instanceof a) {
                a aVar = (a) faeVar;
                this.k = aVar.k;
                this.l = aVar.l;
                this.m = aVar.m;
                this.n = aVar.n;
                this.o = aVar.o;
                this.p = aVar.p;
                this.q = aVar.q;
                this.r = aVar.r;
                this.s = aVar.s;
                this.t = aVar.t;
            }
        }

        @Override // tb.an6, tb.fae
        public void d(long j, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a9d1f1", new Object[]{this, new Long(j), new Integer(i)});
            } else if (j == b0.DXMEGAPRICEVIEW_CURRENCYPOSITION) {
                this.k = i;
            } else if (j == b0.DXMEGAPRICEVIEW_CURRENCYSIZE) {
                if (i > 0) {
                    this.l = i;
                }
            } else if (j == b0.DXMEGAPRICEVIEW_DECIMALSIZE) {
                if (i > 0) {
                    this.n = i;
                }
            } else if (j == b0.DXMEGAPRICEVIEW_PRICESTYLE) {
                this.r = i;
            } else if (j == 5737767606580872653L) {
                this.s = i;
            } else if (j != 6751005219504497256L) {
                super.d(j, i);
            } else if (i > 0) {
                this.t = i;
            }
        }

        @Override // tb.an6, tb.fae
        public void g(long j, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ebe4270", new Object[]{this, new Long(j), str});
            } else if (j == b0.DXMEGAPRICEVIEW_CURRENCYSYMBOL) {
                this.m = str;
            } else if (j == b0.DXMEGAPRICEVIEW_DECIMALSYMBOL) {
                this.o = str;
            } else if (j == 34149272427L) {
                this.p = str;
            } else if (j == b0.DXMEGAPRICEVIEW_FORMATTEDPRICE) {
                this.q = str;
            } else {
                super.g(j, str);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(v5z v5zVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DxNanoPriceViewDesc");
    }

    @Override // tb.nu
    public lrb c(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lrb) ipChange.ipc$dispatch("bf1820b2", new Object[]{this, tn6Var});
        }
        return null;
    }

    @Override // tb.nu
    public wij d(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wij) ipChange.ipc$dispatch("83bb1c71", new Object[]{this, tn6Var});
        }
        return null;
    }

    @Override // tb.nu
    public void h(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98922cf0", new Object[]{this, tn6Var});
        }
    }

    @Override // tb.nu
    public void i(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("255ebac0", new Object[]{this, tn6Var});
        }
    }

    /* renamed from: o */
    public a e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("72f9a1eb", new Object[]{this});
        }
        return new a();
    }

    /* renamed from: p */
    public MegaPriceView f(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MegaPriceView) ipChange.ipc$dispatch("b6301353", new Object[]{this, tn6Var});
        }
        return new MegaPriceView(tn6Var.a());
    }

    /* renamed from: q */
    public void l(tn6 tn6Var, MegaPriceView megaPriceView, a aVar, a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b72d6bc", new Object[]{this, tn6Var, megaPriceView, aVar, aVar2});
        } else if (aVar2 != null && aVar2 != aVar && megaPriceView != null) {
            com.taobao.android.megadesign.priceview.a aVar3 = new com.taobao.android.megadesign.priceview.a();
            aVar3.f = a.i(aVar2);
            aVar3.e = a.j(aVar2);
            aVar3.c = a.k(aVar2);
            aVar3.h = a.l(aVar2);
            aVar3.d = a.m(aVar2);
            aVar3.b = a.n(aVar2);
            aVar3.f8927a = a.o(aVar2);
            aVar3.g = a.p(aVar2);
            if (aVar3.h <= 0.0f) {
                megaPriceView.setTextSize(b0.DEFAULT_TEXT_SIZE);
            }
            megaPriceView.setTextColor(a.q(aVar2));
            megaPriceView.setFont(a.r(aVar2));
            megaPriceView.setPrice(aVar3);
        }
    }
}
