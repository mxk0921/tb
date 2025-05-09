package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.tanx.exposer.achieve.AdMonitorCommitResult;
import com.tanx.exposer.achieve.AdMonitorType;
import java.util.List;
import tb.rcy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gcy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f19903a;
    public final AdMonitorType b;
    public final bd0 c;
    public final ad0 d = ed0.h().e();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19904a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(String str, String str2, String str3) {
            this.f19904a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                gcy.b(gcy.this, this.f19904a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements szc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f19905a;
        public final tcy b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                rcy rcyVar = rcy.e.tanxc_do;
                b bVar = b.this;
                rcyVar.f(bVar.b, bVar.f19905a);
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.gcy$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC0934b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f19907a;
            public final /* synthetic */ String b;

            public RunnableC0934b(int i, String str) {
                this.f19907a = i;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                rcy rcyVar = rcy.e.tanxc_do;
                b bVar = b.this;
                rcyVar.e(bVar.b, this.f19907a, this.b, bVar.f19905a);
            }
        }

        static {
            t2o.a(283115540);
            t2o.a(283115570);
        }

        public b(tcy tcyVar, boolean z) {
            this.b = tcyVar;
            this.f19905a = z;
        }

        @Override // tb.szc
        public void onFail(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
            } else {
                pcy.a(new RunnableC0934b(i, str), 0L);
            }
        }

        @Override // tb.szc
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
            } else {
                pcy.a(new a(), 0L);
            }
        }
    }

    static {
        t2o.a(283115538);
        t2o.a(283115537);
    }

    public gcy(AdMonitorType adMonitorType, List<String> list, bd0 bd0Var) {
        this.b = adMonitorType;
        this.f19903a = list;
        this.c = bd0Var;
    }

    public static /* synthetic */ void b(gcy gcyVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b95c9c0e", new Object[]{gcyVar, str, str2, str3});
        } else {
            gcyVar.c(str, str2, str3);
        }
    }

    public AdMonitorCommitResult a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AdMonitorCommitResult) ipChange.ipc$dispatch("f7ebc899", new Object[]{this});
        }
        for (String str : this.f19903a) {
            String e = wzo.e(str);
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(e)) {
                ocy.i(this.c, this.b, "url_is_empty_or_hash_error");
            } else {
                String host = Uri.parse(str).getHost();
                if (TextUtils.isEmpty(host)) {
                    ocy.i(this.c, this.b, "domain_not_right");
                } else {
                    pcy.a(new a(str, host, e), 0L);
                }
            }
        }
        return AdMonitorCommitResult.COMMITED;
    }

    public final void c(String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67defd03", new Object[]{this, str, str2, str3});
            return;
        }
        bd0 bd0Var = this.c;
        if (bd0Var == null) {
            str4 = str;
        } else {
            str4 = wzo.f(str, bd0Var.a());
        }
        ocy.f(this.c, this.b, str2, str3);
        tcy tcyVar = new tcy(str, str4, this.b, str2, str3, this.d.c());
        tcyVar.g(this.c);
        new lcy(this.d.d()).a(this.b, str4, new b(tcyVar, false));
    }
}
