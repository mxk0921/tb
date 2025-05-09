package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class oa7 implements dbn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile boolean c;
    public static volatile boolean d;

    /* renamed from: a  reason: collision with root package name */
    public final dbn f25244a;
    public final cgd b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25245a;
        public final /* synthetic */ y69 b;

        public a(String str, y69 y69Var) {
            this.f25245a = str;
            this.b = y69Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RSoLog.d("link-delay-fetch, isLinkBootFinish = true, real do fetchAsync " + this.f25245a);
            oa7.f(oa7.this).b(this.f25245a, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements c52 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c52 f25246a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ long f25247a;
            public final /* synthetic */ d52 b;

            public a(long j, d52 d52Var) {
                this.f25247a = j;
                this.b = d52Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                RSoLog.d("delegate-> call onFetchFinished after " + this.f25247a);
                b.this.f25246a.b(this.b);
            }
        }

        public b(c52 c52Var) {
            this.f25246a = c52Var;
        }

        @Override // tb.c52
        public void b(d52 d52Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f4b58cf", new Object[]{this, d52Var});
                return;
            }
            long c = oa7.g(oa7.this).c("key_delay_callback_interval", 0L);
            if (c <= 0) {
                RSoLog.d("delegate-> call onFetchFinished immediately");
                this.f25246a.b(d52Var);
                return;
            }
            qbn.e(new a(c, d52Var), c);
        }
    }

    public oa7(dbn dbnVar, cgd cgdVar, kgd kgdVar) {
        this.f25244a = dbnVar;
        this.b = cgdVar;
    }

    public static /* synthetic */ dbn f(oa7 oa7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dbn) ipChange.ipc$dispatch("d65b0c20", new Object[]{oa7Var});
        }
        return oa7Var.f25244a;
    }

    public static /* synthetic */ cgd g(oa7 oa7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cgd) ipChange.ipc$dispatch("189d81e1", new Object[]{oa7Var});
        }
        return oa7Var.b;
    }

    @Override // tb.dbn
    public d52 a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d52) ipChange.ipc$dispatch("b9db9619", new Object[]{this, list});
        }
        return this.f25244a.a(list);
    }

    @Override // tb.dbn
    public void b(String str, y69 y69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dc04a6", new Object[]{this, str, y69Var});
        } else if (!this.b.b("key_link_delay_fetch_list", "kernelu4_7z_uc").contains(str) || !c) {
            this.f25244a.b(str, y69Var);
        } else if (!d) {
            RSoLog.d("link-delay-fetch, isLinkBootFinish = false, intercept fetchAsync " + str);
            y69Var.onFetchFinished(b79.b(str, RSoException.error(6312)));
        } else {
            RSoLog.d("link-delay-fetch, isLinkBootFinish = true, schedule fetchAsync " + str + ", interval=3000");
            qbn.e(new a(str, y69Var), 3000L);
        }
    }

    @Override // tb.dbn
    public b79 c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b79) ipChange.ipc$dispatch("b1bac3d7", new Object[]{this, str});
        }
        return this.f25244a.c(str);
    }

    @Override // tb.dbn
    public b79 d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b79) ipChange.ipc$dispatch("d96d27dc", new Object[]{this, str});
        }
        return this.f25244a.d(str);
    }

    @Override // tb.dbn
    public void e(List<String> list, c52 c52Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7032327", new Object[]{this, list, c52Var});
        } else {
            this.f25244a.e(list, new b(c52Var));
        }
    }
}
