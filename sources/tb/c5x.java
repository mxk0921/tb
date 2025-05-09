package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c5x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final du1 f16882a;
    public final uu7 b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends uu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weexdownloader/downloader/weex/WeexDownloader$1");
        }

        @Override // tb.uu7
        public void a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90d7edfe", new Object[]{this, new Float(f)});
            } else {
                c5x.b(c5x.this, f);
            }
        }

        @Override // tb.uu7
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
            } else {
                c5x.d(c5x.this, str);
            }
        }

        @Override // tb.uu7
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            } else {
                c5x.a(c5x.this);
            }
        }

        @Override // tb.uu7
        public void d(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b6b55e2", new Object[]{this, file});
            } else {
                c5x.c(c5x.this);
            }
        }
    }

    public c5x(Context context, String str, String str2, String str3, uu7 uu7Var) {
        this.b = uu7Var;
        if (nrq.d(str3)) {
            this.e = str2;
            String absolutePath = context.getApplicationContext().getFilesDir().getAbsolutePath();
            this.c = absolutePath;
            String d = jh9.d(str);
            this.d = d;
            this.f16882a = new du1(absolutePath, d, str3, new a());
        }
    }

    public static /* synthetic */ void a(c5x c5xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c704536", new Object[]{c5xVar});
        } else {
            c5xVar.h();
        }
    }

    public static /* synthetic */ void b(c5x c5xVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c09c269", new Object[]{c5xVar, new Float(f)});
        } else {
            c5xVar.f(f);
        }
    }

    public static /* synthetic */ void c(c5x c5xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba881338", new Object[]{c5xVar});
        } else {
            c5xVar.i();
        }
    }

    public static /* synthetic */ void d(c5x c5xVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da28f084", new Object[]{c5xVar, str});
        } else {
            c5xVar.g(str);
        }
    }

    public final boolean e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d40f2303", new Object[]{this, str, str2, str3})).booleanValue();
        }
        if (!nrq.a(str) && !nrq.a(str2) && !nrq.a(str3)) {
            File file = new File(str + File.separator + str2);
            if (file.exists() && file.isFile()) {
                return str3.equals(qu7.b(file));
            }
        }
        return false;
    }

    public final void f(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefa228b", new Object[]{this, new Float(f)});
            return;
        }
        uu7 uu7Var = this.b;
        if (uu7Var != null) {
            uu7Var.a(f);
        }
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac87a38f", new Object[]{this, str});
            return;
        }
        File file = new File(this.c + File.separator + this.d);
        if (file.exists()) {
            file.delete();
        }
        uu7 uu7Var = this.b;
        if (uu7Var != null) {
            uu7Var.b(str);
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a65da4dd", new Object[]{this});
            return;
        }
        uu7 uu7Var = this.b;
        if (uu7Var != null) {
            uu7Var.c();
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec8bfafe", new Object[]{this});
        } else if (!nrq.c(this.e) || e(this.c, this.d, this.e)) {
            uu7 uu7Var = this.b;
            if (uu7Var != null) {
                uu7Var.d(new File(this.c + File.separator + this.d));
            }
        } else {
            g("md5CheckFail");
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4208c90f", new Object[]{this});
        } else if (this.f16882a == null) {
            g("invalidUrl");
        } else {
            k();
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29732cb", new Object[]{this});
        } else if (!e(this.c, this.d, this.e)) {
            this.f16882a.l();
        } else {
            uu7 uu7Var = this.b;
            if (uu7Var != null) {
                uu7Var.d(new File(this.c + File.separator + this.d));
            }
        }
    }
}
