package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import anetwork.channel.Param;
import anetwork.channel.entity.StringParam;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.net.NetError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class f8b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final r7b f19101a;
        private final b b;
        private final yko c;
        private volatile boolean d = false;
        private boolean e;

        /* compiled from: Taobao */
        /* renamed from: tb.f8b$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class RunnableC0922a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ nsj f19102a;

            public RunnableC0922a(nsj nsjVar) {
                this.f19102a = nsjVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (this.f19102a.h()) {
                    a.a(a.this).a(this.f19102a);
                } else {
                    try {
                        a.a(a.this).b(this.f19102a);
                    } catch (Exception e) {
                        e.printStackTrace();
                        nsj nsjVar = new nsj();
                        NetError netError = new NetError(4);
                        netError.setException(e);
                        nsjVar.j(netError);
                        a.a(a.this).a(nsjVar);
                    }
                }
            }
        }

        static {
            t2o.a(993001888);
        }

        public a(yko ykoVar, r7b r7bVar, b bVar, boolean z) {
            this.c = ykoVar;
            this.f19101a = r7bVar;
            this.b = bVar;
            this.e = z;
        }

        public static /* synthetic */ b a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d5859658", new Object[]{aVar});
            }
            return aVar.b;
        }

        private void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cacde1e5", new Object[]{this});
            } else if (!this.d) {
                nsj e = e();
                if (!this.d) {
                    RunnableC0922a aVar = new RunnableC0922a(e);
                    if (this.e) {
                        new Handler(Looper.getMainLooper()).post(aVar);
                    } else {
                        aVar.run();
                    }
                }
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
            } else {
                this.d = true;
            }
        }

        public a d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("44644fc5", new Object[]{this});
            }
            f8b.b(this.c.f().j().b, this);
            this.c.l().b("HttpUtil", (String) this.f19101a.f16602a);
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c();
            }
        }

        private nsj e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nsj) ipChange.ipc$dispatch("e8dd03d0", new Object[]{this});
            }
            qrj<r7b, nsj> b = this.c.o().b();
            if (b != null) {
                return b.b(this.f19101a);
            }
            nsj nsjVar = new nsj();
            nsjVar.j(new NetError(0, "no httpAdapter"));
            return nsjVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(993001890);
        }

        public void a(nsj nsjVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d34fd645", new Object[]{this, nsjVar});
                return;
            }
            NetError b = nsjVar.b();
            if (b != null) {
                c4p.n("HttpUtil", "net result:" + b.getCode() + " " + b.getMsg());
            }
        }

        public abstract void b(nsj nsjVar);
    }

    static {
        t2o.a(993001887);
    }

    public static List<Param> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("28fb2542", new Object[]{map});
        }
        if (map == null || map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                arrayList.add(new StringParam(key, value));
            }
        }
        return arrayList;
    }

    public static void b(Executor executor, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7467fd8f", new Object[]{executor, runnable});
        } else {
            executor.execute(runnable);
        }
    }

    public static a c(yko ykoVar, r7b r7bVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("7f9606f2", new Object[]{ykoVar, r7bVar, bVar});
        }
        a aVar = new a(ykoVar, r7bVar, bVar, true);
        aVar.d();
        return aVar;
    }
}
