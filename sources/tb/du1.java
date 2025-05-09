package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weexdownloader.downloader.DownloadStatus;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class du1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f18068a;
    public final String b;
    public final String c;
    public final uu7 d;
    public DownloadStatus e;
    public b f;

    public du1(String str, String str2, String str3, uu7 uu7Var) {
        this.f18068a = str;
        this.b = str2;
        this.c = str3;
        this.d = uu7Var;
    }

    public static /* synthetic */ String a(du1 du1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f6f9e51", new Object[]{du1Var});
        }
        return du1Var.c;
    }

    public static /* synthetic */ void b(du1 du1Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8e5f8d8", new Object[]{du1Var, str});
        } else {
            du1Var.i(str);
        }
    }

    public static /* synthetic */ String c(du1 du1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f487953", new Object[]{du1Var});
        }
        return du1Var.f18068a;
    }

    public static /* synthetic */ String d(du1 du1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4734e6d4", new Object[]{du1Var});
        }
        return du1Var.b;
    }

    public static /* synthetic */ DownloadStatus e(du1 du1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DownloadStatus) ipChange.ipc$dispatch("8999744e", new Object[]{du1Var});
        }
        return du1Var.e;
    }

    public static /* synthetic */ void f(du1 du1Var, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511160f6", new Object[]{du1Var, new Float(f)});
        } else {
            du1Var.h(f);
        }
    }

    public static /* synthetic */ void g(du1 du1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95e0469", new Object[]{du1Var});
        } else {
            du1Var.k();
        }
    }

    public final void h(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefa228b", new Object[]{this, new Float(f)});
            return;
        }
        StringBuilder sb = new StringBuilder("download on percentage: ");
        sb.append(String.format("%.2f", Double.valueOf(f * 100.0d)));
        sb.append(f7l.MOD);
        this.e = DownloadStatus.DOWNLOAD_LOADING;
        uu7 uu7Var = this.d;
        if (uu7Var != null) {
            uu7Var.a(f);
        }
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac87a38f", new Object[]{this, str});
            return;
        }
        this.e = DownloadStatus.DOWNLOAD_FAIL;
        uu7 uu7Var = this.d;
        if (uu7Var != null) {
            uu7Var.b(str);
        }
        this.f = null;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a65da4dd", new Object[]{this});
            return;
        }
        uu7 uu7Var = this.d;
        if (uu7Var != null) {
            uu7Var.c();
        }
        this.e = DownloadStatus.DOWNLOAD_START;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec8bfafe", new Object[]{this});
            return;
        }
        this.e = DownloadStatus.DOWNLOAD_SUCCESS;
        uu7 uu7Var = this.d;
        if (uu7Var != null) {
            uu7Var.d(new File(this.f18068a + File.separator + this.b));
        }
        this.f = null;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4208c90f", new Object[]{this});
        } else if (!m()) {
            i("writeFileError");
        } else {
            j();
            this.f = new b();
            new Thread(this.f).start();
        }
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1afb612", new Object[]{this})).booleanValue();
        }
        if (nrq.a(this.f18068a) || nrq.a(this.b) || nrq.a(this.c)) {
            return false;
        }
        File file = new File(this.f18068a);
        if (!file.exists() && !file.mkdirs()) {
            return false;
        }
        File file2 = new File(this.f18068a + File.separator + this.b);
        if (!file2.exists() || file2.delete()) {
            return true;
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:64:0x012c, code lost:
            r15 = r2;
            r16 = r3;
            r12.flush();
            r12.close();
            tb.du1.g(r19.f18069a);
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x013a, code lost:
            tb.t1d.a(r11);
            tb.t1d.a(r12);
            r5 = r5;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r5v12, types: [java.net.HttpURLConnection, java.net.URLConnection] */
        /* JADX WARN: Type inference failed for: r5v8 */
        /* JADX WARN: Unknown variable types count: 1 */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 431
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.du1.b.run():void");
        }
    }
}
