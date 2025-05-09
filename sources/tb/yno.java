package tb;

import anetwork.channel.Request;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class yno extends xno {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final v5p f32221a;
    public final boolean b;
    public wno c;
    public zno d;
    public String e;
    public teq f;
    public final boolean g;

    static {
        t2o.a(815792172);
    }

    public yno(v5p v5pVar) {
        boolean z;
        this.f32221a = v5pVar;
        if (rv6.a()) {
            z = b1p.INSTANCE.e(j3p.g());
            if (!z) {
                z = o4p.N1();
            }
        } else {
            z = o4p.N1();
        }
        this.b = z;
        this.g = o4p.j1();
    }

    public static /* synthetic */ Object ipc$super(yno ynoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/common/fulltrace/SRPFullTraceLifeCycleWatcherImpl");
    }

    @Override // tb.xno
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9258fee5", new Object[]{this, str, map});
            return;
        }
        ckf.g(str, "biz");
        ckf.g(map, "tagParams");
        zno znoVar = this.d;
        if (znoVar != null) {
            znoVar.a(str, map);
        }
    }

    @Override // tb.xno
    public void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f8dcdf", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, "name");
        ckf.g(obj, "value");
        zno znoVar = this.d;
        if (znoVar != null) {
            znoVar.b(str, obj);
        }
    }

    @Override // tb.xno
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d9a613", new Object[]{this, str});
            return;
        }
        ckf.g(str, BaseMnnRunUnit.KEY_TASK_NAME);
        zno znoVar = this.d;
        if (znoVar != null) {
            znoVar.r(str);
        }
    }

    @Override // tb.xno
    public void d(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0c99e0", new Object[]{this, str, map});
            return;
        }
        ckf.g(str, BaseMnnRunUnit.KEY_TASK_NAME);
        zno znoVar = this.d;
        if (znoVar != null) {
            znoVar.s(str, map);
        }
    }

    @Override // tb.xno
    public void e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15239fec", new Object[]{this, map});
            return;
        }
        teq teqVar = this.f;
        if (teqVar != null) {
            teqVar.f(teq.PARSE_DATA);
        }
        v5p.Companion.c(this.f32221a, "DataConvert", map);
        zno znoVar = this.d;
        if (znoVar != null) {
            znoVar.c(null);
        }
    }

    @Override // tb.xno
    public void f(nsj nsjVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c65b50", new Object[]{this, nsjVar, map});
            return;
        }
        teq teqVar = this.f;
        if (teqVar != null) {
            teq.d(teqVar, teq.PARSE_DATA, 0L, 2, null);
        }
        if (this.b) {
            wno wnoVar = this.c;
            if (wnoVar != null) {
                wnoVar.a(null);
            }
            zno znoVar = this.d;
            if (znoVar != null) {
                znoVar.d();
            }
        }
    }

    @Override // tb.xno
    public void g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e5f2f6f", new Object[]{this, map});
            return;
        }
        teq teqVar = this.f;
        if (teqVar != null) {
            teqVar.e();
        }
        v5p.Companion.b(this.f32221a, "Unknown", map);
        if (this.b) {
            wno wnoVar = this.c;
            if (wnoVar != null) {
                wnoVar.b();
            }
            zno znoVar = this.d;
            if (znoVar != null) {
                znoVar.e(map);
            }
        }
    }

    @Override // tb.xno
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        teq teqVar = this.f;
        if (teqVar != null) {
            teqVar.g();
        }
        if (this.b) {
            wno wnoVar = this.c;
            if (wnoVar != null) {
                wnoVar.c();
            }
            zno znoVar = this.d;
            if (znoVar != null) {
                znoVar.f();
            }
        }
    }

    @Override // tb.xno
    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcf041d", new Object[]{this, new Boolean(z)});
        } else if (this.b) {
            wno wnoVar = this.c;
            if (wnoVar != null && !wnoVar.e()) {
                wnoVar.h();
            }
            this.c = new wno(z);
            zno znoVar = this.d;
            if (znoVar != null && !znoVar.k()) {
                znoVar.v();
            }
            this.d = new zno(this.e, z);
            if (this.g && this.f == null) {
                this.f = new teq();
            }
        }
    }

    @Override // tb.xno
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf9a4f01", new Object[]{this});
        } else if (this.b) {
            wno wnoVar = this.c;
            if (wnoVar != null) {
                wnoVar.g(null);
            }
            zno znoVar = this.d;
            if (znoVar != null) {
                znoVar.o();
            }
        }
    }

    @Override // tb.xno
    public void n(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc7b2f3", new Object[]{this, map});
            return;
        }
        teq teqVar = this.f;
        if (teqVar != null) {
            teqVar.h(teq.FALLBACK, "true");
        }
        v5p.Companion.c(this.f32221a, "DataConvert", map);
    }

    @Override // tb.xno
    public void o(Request request) {
        wno wnoVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b7a49e", new Object[]{this, request});
        } else if (this.b && (wnoVar = this.c) != null) {
            wnoVar.f(null);
            Map<String, String> d = wnoVar.d();
            if (d != null && request != null) {
                request.setTraceContext(d);
            }
        }
    }

    @Override // tb.xno
    public void p(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc73ff1c", new Object[]{this, map});
            return;
        }
        teq teqVar = this.f;
        if (teqVar != null) {
            teqVar.f("mtop-request");
        }
        v5p.Companion.c(this.f32221a, "Request", map);
        zno znoVar = this.d;
        if (znoVar != null) {
            znoVar.l(null);
        }
    }

    @Override // tb.xno
    public void q(MtopBusiness mtopBusiness, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e0a9957", new Object[]{this, mtopBusiness, map});
            return;
        }
        teq teqVar = this.f;
        if (teqVar != null) {
            teq.d(teqVar, "mtop-request", 0L, 2, null);
        }
        if (this.b) {
            wno wnoVar = this.c;
            if (wnoVar != null) {
                wnoVar.f(null);
                Map<String, String> d = wnoVar.d();
                if (!(d == null || mtopBusiness == null)) {
                    mtopBusiness.setOpenTracingContext(d);
                }
            }
            zno znoVar = this.d;
            if (znoVar != null) {
                znoVar.n();
            }
        }
    }

    @Override // tb.xno
    public void r(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dfd1050", new Object[]{this, map});
            return;
        }
        v5p.Companion.b(this.f32221a, "Request", map);
        zno znoVar = this.d;
        if (znoVar != null) {
            znoVar.m(map);
        }
    }

    @Override // tb.xno
    public void s(long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef11740", new Object[]{this, new Long(j), map});
            return;
        }
        teq teqVar = this.f;
        if (teqVar != null) {
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    teqVar.h(entry.getKey(), entry.getValue());
                }
            }
            teqVar.c(teq.TEMPLATE_REQUEST, j);
        }
    }

    @Override // tb.xno
    public void u(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("928e41f2", new Object[]{this, obj, str});
            return;
        }
        String str2 = this.e;
        if (str2 == null || str2.length() == 0) {
            String b = zno.Companion.b(obj);
            this.e = b;
            zno znoVar = this.d;
            if (znoVar != null) {
                znoVar.j(b);
            }
        }
    }

    @Override // tb.xno
    public void v(boolean z) {
        teq teqVar;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7972f055", new Object[]{this, new Boolean(z)});
        } else if (y4p.f() && (teqVar = this.f) != null) {
            if (z) {
                str = "metasearch";
            } else {
                str = QueryParamsManager.CartFeedFlowType.search;
            }
            teqVar.h(teq.DIMEN_XSEARCH_TYPE, str);
        }
    }

    @Override // tb.xno
    public void w(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e203019", new Object[]{this, map});
            return;
        }
        zno znoVar = this.d;
        if (znoVar != null) {
            znoVar.t(null);
        }
    }

    @Override // tb.xno
    public void x(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("668acbb2", new Object[]{this, map});
            return;
        }
        zno znoVar = this.d;
        if (znoVar != null) {
            znoVar.u();
        }
    }
}
