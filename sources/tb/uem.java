package tb;

import android.text.TextUtils;
import com.alibaba.poplayer.trigger.page.PageTriggerService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.hst;
import tb.uem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class uem {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ThreadPoolExecutor f;

    /* renamed from: a  reason: collision with root package name */
    public final String f29327a;
    public final String b;
    public String c;
    public b d;
    public boolean e = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements abd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.abd
        public void a(final String str, final String str2, final String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30005e67", new Object[]{this, str, str2, str3});
            } else if (uem.e(uem.this) != null) {
                uem.f().execute(new Runnable() { // from class: tb.tem
                    @Override // java.lang.Runnable
                    public final void run() {
                        uem.a.this.j(str, str2, str3);
                    }
                });
            }
        }

        @Override // tb.abd
        public void b(final String str, final boolean z, final boolean z2, final String str2, final String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e12c310", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, str3});
            } else if (!uem.c(uem.this)) {
                uem.d(uem.this, true);
                if (uem.e(uem.this) != null) {
                    uem.f().execute(new Runnable() { // from class: tb.rem
                        @Override // java.lang.Runnable
                        public final void run() {
                            uem.a.this.i(str, z, z2, str2, str3);
                        }
                    });
                }
            }
        }

        @Override // tb.abd
        public void c(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c24585a", new Object[]{this, str});
            } else if (!uem.c(uem.this)) {
                uem.d(uem.this, true);
                if (uem.e(uem.this) != null) {
                    uem.f().execute(new Runnable() { // from class: tb.sem
                        @Override // java.lang.Runnable
                        public final void run() {
                            uem.a.this.k(str);
                        }
                    });
                }
            }
        }

        @Override // tb.abd
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad6b63ab", new Object[]{this});
            }
        }

        public final /* synthetic */ void i(String str, boolean z, boolean z2, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e497ca47", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, str3});
            } else if (uem.e(uem.this) != null) {
                uem.e(uem.this).b(str, z, z2, str2, str3);
            }
        }

        public final /* synthetic */ void j(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("122318e9", new Object[]{this, str, str2, str3});
            } else if (uem.e(uem.this) != null) {
                uem.e(uem.this).a(str, str2, str3);
            }
        }

        public final /* synthetic */ void k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8017fd53", new Object[]{this, str});
            } else if (uem.e(uem.this) != null) {
                uem.e(uem.this).c(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
        void a(String str, String str2, String str3);

        void b(String str, boolean z, boolean z2, String str2, String str3);

        void c(String str);
    }

    static {
        t2o.a(626000019);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new hst.a("TriggerCallBackThreadPool"));
        f = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public uem(String str, String str2) {
        this.f29327a = str;
        this.b = str2;
    }

    public static /* synthetic */ boolean c(uem uemVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("397f8977", new Object[]{uemVar})).booleanValue();
        }
        return uemVar.e;
    }

    public static /* synthetic */ boolean d(uem uemVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52238c83", new Object[]{uemVar, new Boolean(z)})).booleanValue();
        }
        uemVar.e = z;
        return z;
    }

    public static /* synthetic */ b e(uem uemVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("a75aaa33", new Object[]{uemVar});
        }
        return uemVar.d;
    }

    public static /* synthetic */ ThreadPoolExecutor f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("a311e3d9", new Object[0]);
        }
        return f;
    }

    public static uem g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uem) ipChange.ipc$dispatch("84e85f29", new Object[]{str, str2});
        }
        return new uem(str, str2);
    }

    public static uem m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uem) ipChange.ipc$dispatch("77819bd1", new Object[]{str, str2});
        }
        return g(str, str2);
    }

    public final /* synthetic */ void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86323169", new Object[]{this});
            return;
        }
        b bVar = this.d;
        if (bVar != null) {
            bVar.c("paramInvalid");
        }
    }

    public final /* synthetic */ void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("866a8f6d", new Object[]{this});
        } else {
            PageTriggerService.instance().triggerAccept(this.f29327a, this.b, this.c, new a());
        }
    }

    public uem j(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uem) ipChange.ipc$dispatch("cf8d611e", new Object[]{this, bVar});
        }
        this.d = bVar;
        return this;
    }

    public uem k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uem) ipChange.ipc$dispatch("df3b7d30", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.f29327a) && this.f29327a.startsWith(PageTriggerService.PAGE_SCHEME)) {
            hst.b(new Runnable() { // from class: tb.qem
                @Override // java.lang.Runnable
                public final void run() {
                    uem.this.i();
                }
            });
        } else if (this.d != null) {
            f.execute(new Runnable() { // from class: tb.pem
                @Override // java.lang.Runnable
                public final void run() {
                    uem.this.h();
                }
            });
        }
    }
}
