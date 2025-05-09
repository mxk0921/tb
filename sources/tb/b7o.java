package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.d;
import com.taobao.android.remoteso.resolver2.j;
import com.taobao.android.remoteso.status.RSoStatus;
import tb.lgd;
import tb.yb1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b7o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kgd f16229a;
    public final cgd b;
    public final lgd c;
    public final com.taobao.android.remoteso.resolver2.e d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements lgd.a<a7o> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z6o f16230a;

        public a(z6o z6oVar) {
            this.f16230a = z6oVar;
        }

        /* renamed from: b */
        public a7o a(RSoStatus rSoStatus, lgd.c cVar) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a7o) ipChange.ipc$dispatch("962f6b3f", new Object[]{this, rSoStatus, cVar});
            }
            RSoLog.d("PeekResolver ->  peekOneResult, enter " + this.f16230a.b());
            if (rSoStatus != RSoStatus.INITIALIZED && rSoStatus != RSoStatus.FETCHED) {
                return j.f(this.f16230a, RSoException.error(6308), "manager-peek-error");
            }
            a7o a2 = b7o.a(b7o.this, this.f16230a);
            if (a2.j()) {
                if (this.f16230a.h()) {
                    str = "cache";
                } else {
                    str = qan.FROM_EXIST;
                }
                a2.m(str);
            }
            RSoLog.d("PeekResolver ->  peekOneResult, peekOneLib get result=" + a2);
            return a2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements lgd.a<Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z6o f16231a;
        public final /* synthetic */ f b;

        public b(z6o z6oVar, f fVar) {
            this.f16231a = z6oVar;
            this.b = fVar;
        }

        /* renamed from: b */
        public Void a(RSoStatus rSoStatus, lgd.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("7121a23", new Object[]{this, rSoStatus, cVar});
            }
            RSoStatus rSoStatus2 = RSoStatus.INITIALIZED;
            if (rSoStatus == rSoStatus2 || rSoStatus == RSoStatus.FETCHED) {
                RSoLog.d("PeekResolver ->  resolveOneResult, try peek lib " + this.f16231a.b());
                a7o a2 = b7o.a(b7o.this, this.f16231a);
                if (a2.j()) {
                    RSoStatus rSoStatus3 = RSoStatus.FETCHED;
                    if (rSoStatus != rSoStatus3) {
                        cVar.a(rSoStatus3);
                    }
                    this.b.a(a2.m(qan.FROM_EXIST));
                    return null;
                } else if (rSoStatus == RSoStatus.FETCHED) {
                    rbn.e("ResolverManager, resolveOneResult, RSoStatus.FETCHED but peekOneLib failed", this.f16231a.toString());
                }
            }
            if (rSoStatus == rSoStatus2 || rSoStatus == RSoStatus.FETCHED || rSoStatus == RSoStatus.FETCH_FAILED) {
                RSoLog.d("PeekResolver ->  resolveOneResult, need resolve, " + this.f16231a.b());
                b7o.b(b7o.this, cVar, this.f16231a, this.b);
                return null;
            } else if (rSoStatus == RSoStatus.FETCHING) {
                RSoLog.d("PeekResolver ->  resolveOneResult, pending, wait for previous resolve finish. lib = " + this.f16231a.b());
                b7o.c(b7o.this, this.f16231a, this.b);
                return null;
            } else {
                RSoLog.d("PeekResolver ->  resolveOneResult, already fetched, return result " + this.f16231a.b());
                throw new RuntimeException("currentStatus not make sense, wtf " + rSoStatus);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements yb1.a<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z6o f16233a;

        public d(b7o b7oVar, z6o z6oVar) {
            this.f16233a = z6oVar;
        }

        /* renamed from: a */
        public boolean test(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a78fe5a7", new Object[]{this, str})).booleanValue();
            }
            return trq.d(this.f16233a.b(), str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z6o f16234a;
        public final /* synthetic */ d.a b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements lgd.a<Void> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a7o f16235a;

            public a(a7o a7oVar) {
                this.f16235a = a7oVar;
            }

            /* renamed from: b */
            public Void a(RSoStatus rSoStatus, lgd.c cVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Void) ipChange.ipc$dispatch("7121a23", new Object[]{this, rSoStatus, cVar});
                }
                if (this.f16235a.j()) {
                    cVar.a(RSoStatus.FETCHED);
                    this.f16235a.m("resolve");
                } else {
                    cVar.a(RSoStatus.FETCH_FAILED);
                }
                e.this.b.a(this.f16235a);
                return null;
            }
        }

        public e(z6o z6oVar, d.a aVar) {
            this.f16234a = z6oVar;
            this.b = aVar;
        }

        @Override // com.taobao.android.remoteso.resolver2.d.a
        public void a(a7o a7oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("def47b8e", new Object[]{this, a7oVar});
            } else {
                b7o.d(b7o.this).b(this.f16234a, new a(a7oVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class f implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final d.a f16236a;
        public final boolean b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a7o f16237a;

            public a(a7o a7oVar) {
                this.f16237a = a7oVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                RSoLog.d("PeekResolver -> defferCallback, result = " + this.f16237a);
                f.b(f.this).a(this.f16237a);
            }
        }

        public f(d.a aVar, boolean z) {
            this.f16236a = aVar;
            this.b = z;
        }

        public static /* synthetic */ d.a b(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d.a) ipChange.ipc$dispatch("8546b972", new Object[]{fVar});
            }
            return fVar.f16236a;
        }

        @Override // com.taobao.android.remoteso.resolver2.d.a
        public void a(a7o a7oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("def47b8e", new Object[]{this, a7oVar});
            } else if (!this.b) {
                RSoLog.d("PeekResolver -> defferCallback disable, call onResolveFinish on current thread");
                this.f16236a.a(a7oVar);
            } else {
                qbn.d(new a(a7oVar));
            }
        }
    }

    public b7o(kgd kgdVar, cgd cgdVar, lgd lgdVar, com.taobao.android.remoteso.resolver2.e eVar) {
        this.f16229a = kgdVar;
        this.b = cgdVar;
        this.c = lgdVar;
        this.d = eVar;
    }

    public static /* synthetic */ a7o a(b7o b7oVar, z6o z6oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a7o) ipChange.ipc$dispatch("8dd9c701", new Object[]{b7oVar, z6oVar});
        }
        return b7oVar.g(z6oVar);
    }

    public static /* synthetic */ void b(b7o b7oVar, lgd.c cVar, z6o z6oVar, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1d641b", new Object[]{b7oVar, cVar, z6oVar, aVar});
        } else {
            b7oVar.e(cVar, z6oVar, aVar);
        }
    }

    public static /* synthetic */ void c(b7o b7oVar, z6o z6oVar, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4398786a", new Object[]{b7oVar, z6oVar, aVar});
        } else {
            b7oVar.f(z6oVar, aVar);
        }
    }

    public static /* synthetic */ lgd d(b7o b7oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lgd) ipChange.ipc$dispatch("9bfe102c", new Object[]{b7oVar});
        }
        return b7oVar.c;
    }

    public final void e(lgd.c cVar, z6o z6oVar, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef25cb16", new Object[]{this, cVar, z6oVar, aVar});
        } else if (yb1.a(this.b.e("key_resolver_black_list"), new d(this, z6oVar))) {
            aVar.a(j.f(z6oVar, RSoException.error(ct2.ZCACHE_ERROR_CODE_MAX), "config-disabled"));
        } else if (!this.f16229a.b()) {
            a7o f2 = j.f(z6oVar, RSoException.error(6307, "process = " + this.f16229a.getProcessName()), "child-process-error");
            aVar.a(f2);
            RSoLog.d("PeekResolver -> skipped, result=fail, not in main process, pullResult=" + f2);
        } else {
            cVar.a(RSoStatus.FETCHING);
            this.d.a(z6oVar, new e(z6oVar, aVar));
        }
    }

    public final void f(z6o z6oVar, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b47870b2", new Object[]{this, z6oVar, aVar});
        } else {
            this.c.a(z6oVar, new c(z6oVar, aVar));
        }
    }

    public final a7o g(z6o z6oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a7o) ipChange.ipc$dispatch("3be84322", new Object[]{this, z6oVar});
        }
        return this.d.b(z6oVar);
    }

    public a7o h(z6o z6oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a7o) ipChange.ipc$dispatch("faae8ad4", new Object[]{this, z6oVar});
        }
        return (a7o) this.c.b(z6oVar, new a(z6oVar));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements lgd.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z6o f16232a;
        public final /* synthetic */ d.a b;

        public c(z6o z6oVar, d.a aVar) {
            this.f16232a = z6oVar;
            this.b = aVar;
        }

        @Override // tb.lgd.b
        public boolean a(RSoStatus rSoStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a3860803", new Object[]{this, rSoStatus})).booleanValue();
            }
            if (rSoStatus == RSoStatus.FETCH_FAILED) {
                RSoLog.d("PeekResolver ->  resolveOneResult, FETCH_FAILED in listener got fetched, " + this.f16232a.b());
                this.b.a(j.f(this.f16232a, RSoException.error(6309), "status-notify-error"));
                return true;
            } else if (rSoStatus == RSoStatus.FETCHED) {
                a7o a2 = b7o.a(b7o.this, this.f16232a);
                d.a aVar = this.b;
                if (a2.j()) {
                    a2 = a2.m(qan.FROM_COMBINED_RESOLVE);
                }
                aVar.a(a2);
                return true;
            } else {
                rbn.e("checkNeedResolve_" + rSoStatus, "status changed impossible " + this.f16232a.b() + ", status to =" + rSoStatus);
                return false;
            }
        }
    }

    public void i(z6o z6oVar, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adf8ce90", new Object[]{this, z6oVar, aVar});
        } else {
            this.c.b(z6oVar, new b(z6oVar, new f(aVar, this.b.a("key_deffer_resolve_callback_enabled", true))));
        }
    }
}
