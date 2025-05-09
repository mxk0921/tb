package tb;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import tb.tu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class e8i implements tu7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f18354a;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public crc g;
    public long h;
    public boolean i = false;
    public final Runnable j = new e();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f18355a;

        public a(int i) {
            this.f18355a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            e8i e8iVar = e8i.this;
            crc crcVar = e8iVar.g;
            if (crcVar != null) {
                crcVar.onProgress(e8iVar.c, this.f18355a);
            }
            List<WeakReference<Object>> c = y9i.b().c(e8i.i(e8i.this));
            if (c != null) {
                for (WeakReference<Object> weakReference : c) {
                    if (weakReference.get() != null && (weakReference.get() instanceof crc)) {
                        ((crc) weakReference.get()).onProgress(e8i.this.c, this.f18355a);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18356a;

        public b(String str) {
            this.f18356a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (e8i.this.g != null) {
                if (!uf9.g(this.f18356a)) {
                    e8i.m(e8i.this, "file_not_exist", "file not exist");
                } else if (!this.f18356a.endsWith(ztl.c())) {
                    dai.d(e8i.j(e8i.this), e8i.this.c, new File(this.f18356a).length());
                    e8i.k(e8i.this, this.f18356a);
                } else {
                    e8i.l(e8i.this, this.f18356a);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18357a;

        public c(String str) {
            this.f18357a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            e8i e8iVar = e8i.this;
            crc crcVar = e8iVar.g;
            if (crcVar != null) {
                crcVar.b(e8iVar.c, this.f18357a);
            }
            List<WeakReference<Object>> c = y9i.b().c(e8i.i(e8i.this));
            if (c != null) {
                for (WeakReference<Object> weakReference : c) {
                    if (weakReference.get() != null && (weakReference.get() instanceof crc)) {
                        ((crc) weakReference.get()).b(e8i.this.c, this.f18357a);
                    }
                }
            }
            y9i.b().e(e8i.i(e8i.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18358a;
        public final /* synthetic */ String b;

        public d(String str, String str2) {
            this.f18358a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            e8i e8iVar = e8i.this;
            crc crcVar = e8iVar.g;
            if (crcVar != null) {
                crcVar.a(e8iVar.c, this.f18358a, this.b);
            }
            List<WeakReference<Object>> c = y9i.b().c(e8i.i(e8i.this));
            if (c != null) {
                for (WeakReference<Object> weakReference : c) {
                    if (weakReference.get() != null && (weakReference.get() instanceof crc)) {
                        ((crc) weakReference.get()).a(e8i.this.c, this.f18358a, this.b);
                    }
                }
            }
            y9i.b().e(e8i.i(e8i.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            rv7.e().a(e8i.h(e8i.this));
            e8i e8iVar = e8i.this;
            e8iVar.g.a(e8iVar.c, String.valueOf(-103), "timeout");
        }
    }

    static {
        t2o.a(782237752);
    }

    public e8i(int i, crc crcVar) {
        this.f18354a = i;
        this.g = crcVar;
    }

    public static /* synthetic */ int h(e8i e8iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("323af980", new Object[]{e8iVar})).intValue();
        }
        return e8iVar.b;
    }

    public static /* synthetic */ String i(e8i e8iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea3b10d2", new Object[]{e8iVar});
        }
        return e8iVar.f;
    }

    public static /* synthetic */ int j(e8i e8iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cdb9e982", new Object[]{e8iVar})).intValue();
        }
        return e8iVar.f18354a;
    }

    public static /* synthetic */ void k(e8i e8iVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50df475a", new Object[]{e8iVar, str});
        } else {
            e8iVar.z(str);
        }
    }

    public static /* synthetic */ void l(e8i e8iVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f85b211b", new Object[]{e8iVar, str});
        } else {
            e8iVar.G(str);
        }
    }

    public static /* synthetic */ void m(e8i e8iVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3afda5a6", new Object[]{e8iVar, str, str2});
        } else {
            e8iVar.y(str, str2);
        }
    }

    public void A(crc crcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0421f8b", new Object[]{this, crcVar});
        } else {
            this.g = crcVar;
        }
    }

    public void B(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4e7c7d", new Object[]{this, str, str2});
        } else if (y9i.b().d(str2)) {
            y9i.b().a(str2, this.g);
        } else if (TextUtils.isEmpty(str2) && this.g != null) {
            ovu.b(new Runnable() { // from class: tb.b8i
                @Override // java.lang.Runnable
                public final void run() {
                    e8i.this.t();
                }
            });
        } else if (TextUtils.isEmpty(str)) {
            ovu.b(new Runnable() { // from class: tb.c8i
                @Override // java.lang.Runnable
                public final void run() {
                    e8i.this.u();
                }
            });
        } else {
            this.f = str2;
            this.d = str;
            q();
        }
    }

    public void C(String str, String str2, String str3, int i, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4276dda6", new Object[]{this, str, str2, str3, new Integer(i), str4});
        } else {
            E(str, str2, str3, i, TextUtils.isEmpty(str4), str4);
        }
    }

    public void D(String str, String str2, String str3, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac18db78", new Object[]{this, str, str2, str3, new Integer(i), new Boolean(z)});
        } else {
            E(str, str2, str3, i, z, "");
        }
    }

    public final void F(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2992404", new Object[]{this, str, str2, str3, new Integer(i)});
            return;
        }
        dai.b(str, "file", "tid=" + str2 + "url=" + str3 + "version=" + i, String.valueOf(-100), "start fail", SystemClock.elapsedRealtime() - this.h);
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        y9i.b().e(this.f);
        ovu.d(this.j);
        rv7.e().a(this.b);
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a31ce28", new Object[]{this});
        } else {
            this.g = null;
        }
    }

    @Override // tb.tu7
    public void onDownloadError(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        new StringBuilder("onDownloadError ").append(str2);
        y(String.valueOf(i), str2);
        dai.c(this.e, "file", "", String.valueOf(i), str2, SystemClock.elapsedRealtime() - this.h, String.valueOf(this.c));
        p();
    }

    @Override // tb.tu7
    public void onDownloadFinish(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
            return;
        }
        new StringBuilder("onDownloadSuccess ").append(str2);
        dai.g(this.e, "file", SystemClock.elapsedRealtime() - this.h);
        ovu.d(this.j);
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new b(str2));
    }

    @Override // tb.tu7
    public void onDownloadProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
        } else {
            ovu.b(new a(i));
        }
    }

    @Override // tb.tu7
    public void onDownloadStateChange(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
        }
    }

    @Override // tb.tu7
    public void onFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.tu7
    public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("588ac0bb", new Object[]{this});
        } else {
            ovu.d(this.j);
        }
    }

    public File r(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("5b06d219", new Object[]{this, str, new Integer(i), str2});
        }
        String b2 = t8i.b(str, i, str2, true);
        this.d = b2;
        if (b2 == null) {
            return null;
        }
        return new File(this.d + File.separator + str + ztl.c());
    }

    public final /* synthetic */ void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72444d2b", new Object[]{this});
        } else {
            this.g.a(this.c, String.valueOf(-100), "download fail");
        }
    }

    public final /* synthetic */ void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b811a9", new Object[]{this});
        } else {
            this.g.a(this.c, String.valueOf(-102), "url empty");
        }
    }

    public final /* synthetic */ void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c6292a", new Object[]{this});
        } else {
            this.g.a(this.c, String.valueOf(-102), "file path empty");
        }
    }

    public final /* synthetic */ void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a4ef6", new Object[]{this, str});
        } else {
            this.g.a(str, String.valueOf(-102), "url empty");
        }
    }

    public final /* synthetic */ void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("634d7a8c", new Object[]{this, str});
        } else {
            this.g.a(str, String.valueOf(-101), "获取保存路径失败，请检查是否初始化");
        }
    }

    public final /* synthetic */ void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad7f13cd", new Object[]{this, str});
        } else {
            this.g.a(str, String.valueOf(-100), "download fail");
        }
    }

    public final void y(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15248522", new Object[]{this, str, str2});
        } else {
            ovu.b(new d(str, str2));
        }
    }

    public final void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16896f8b", new Object[]{this, str});
        } else {
            ovu.b(new c(str));
        }
    }

    public void E(String str, final String str2, String str3, int i, boolean z, String str4) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("825b1742", new Object[]{this, str, str2, str3, new Integer(i), new Boolean(z), str4});
            return;
        }
        this.h = SystemClock.elapsedRealtime();
        this.e = str;
        this.c = str2;
        if (!TextUtils.isEmpty(str3) || this.g == null) {
            this.f = str3;
            String b2 = t8i.b(str2, i, str3, true);
            if (!TextUtils.isEmpty(str4)) {
                file = new File(b2 + File.separator + str4);
            } else if (str3.endsWith(".png")) {
                file = new File(b2 + File.separator + uf9.c(str3));
            } else {
                file = r(str2, i, str3);
            }
            if (file != null) {
                zu7 zu7Var = new zu7();
                zu7Var.b.f29547a = "taopai_material_download";
                onf onfVar = new onf();
                onfVar.d = file.getName();
                onfVar.f25507a = str3;
                zu7Var.b.g = file.getParent();
                zu7Var.b.h = z;
                zu7Var.f33016a.add(onfVar);
                int b3 = rv7.e().b(zu7Var, this);
                this.b = b3;
                if (b3 == -100) {
                    if (this.g != null) {
                        ovu.b(new Runnable() { // from class: tb.z7i
                            @Override // java.lang.Runnable
                            public final void run() {
                                e8i.this.x(str2);
                            }
                        });
                    }
                    F(str, str2, str3, i);
                }
                y9i.b().a(this.f, null);
            } else if (this.g != null) {
                ovu.b(new Runnable() { // from class: tb.y7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        e8i.this.w(str2);
                    }
                });
            }
        } else {
            ovu.b(new Runnable() { // from class: tb.x7i
                @Override // java.lang.Runnable
                public final void run() {
                    e8i.this.v(str2);
                }
            });
        }
    }

    public final void G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1daa9cf6", new Object[]{this, str});
            return;
        }
        try {
            uf9.k(str, this.d);
            dai.d(this.f18354a, this.c, new File(str).length());
            uf9.b(str);
            if (!t9l.g() || !uf9.e(this.d) || this.i) {
                z(this.d);
                return;
            }
            this.i = true;
            q();
            dai.i(this.e, this.c, "empty after unzip");
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4208c90f", new Object[]{this});
            return;
        }
        File file = new File(this.d);
        File file2 = new File(this.d + File.separator + file.getName() + ztl.c());
        zu7 zu7Var = new zu7();
        zu7Var.b.f29547a = "taopai_material_download";
        onf onfVar = new onf();
        onfVar.d = file2.getName();
        onfVar.f25507a = this.f;
        zu7Var.b.g = file2.getParent();
        zu7Var.b.h = false;
        zu7Var.f33016a.add(onfVar);
        int b2 = rv7.e().b(zu7Var, this);
        this.b = b2;
        if (b2 != -100) {
            y9i.b().a(this.f, null);
        } else if (this.g != null) {
            ovu.b(new Runnable() { // from class: tb.a8i
                @Override // java.lang.Runnable
                public final void run() {
                    e8i.this.s();
                }
            });
        }
    }

    public e8i(crc crcVar) {
        this.g = crcVar;
    }
}
