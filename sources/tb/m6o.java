package tb;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class m6o implements o23 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public e8i f23812a;
    public final crc b;
    public final u8i c;
    public boolean d = true;

    static {
        t2o.a(782237907);
    }

    public m6o(u8i u8iVar, crc crcVar) {
        this.c = u8iVar;
        this.b = crcVar;
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        e8i e8iVar = this.f23812a;
        if (e8iVar != null) {
            e8iVar.n();
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1394d3a5", new Object[]{this});
            return;
        }
        if (this.f23812a == null) {
            this.f23812a = new e8i(this.c.m(), this.b);
        }
        if (!TextUtils.isEmpty(this.c.k())) {
            this.f23812a.B(this.c.k(), this.c.o());
        } else {
            this.f23812a.D(this.c.a(), String.valueOf(this.c.n()), this.c.o(), this.c.p(), this.d);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b890af2", new Object[]{this});
            return;
        }
        if (this.f23812a == null) {
            this.f23812a = new e8i(this.b);
        }
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: tb.k6o
            @Override // java.lang.Runnable
            public final void run() {
                m6o.this.h();
            }
        });
    }

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd97d6b4", new Object[]{this})).longValue();
        }
        return this.c.b() * 1000;
    }

    public final boolean g(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4ce1261", new Object[]{this, file})).booleanValue();
        }
        if (file == null) {
            return true;
        }
        String absolutePath = file.getAbsolutePath();
        if (TextUtils.isEmpty(absolutePath)) {
            return true;
        }
        File file2 = new File(absolutePath);
        if (!file2.exists() || System.currentTimeMillis() - file2.lastModified() > f()) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void h() {
        final File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7993dcff", new Object[]{this});
        } else if (this.c.c()) {
            if (!TextUtils.isEmpty(this.c.k())) {
                file = new File(this.c.k());
            } else {
                file = this.f23812a.r(this.c.n(), this.c.p(), this.c.o());
            }
            if (!g(file)) {
                ovu.b(new Runnable() { // from class: tb.l6o
                    @Override // java.lang.Runnable
                    public final void run() {
                        m6o.this.i(file);
                    }
                });
                dai.f(this.c.a(), "file");
                return;
            }
            d();
        } else {
            d();
        }
    }

    public final /* synthetic */ void i(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94498859", new Object[]{this, file});
        } else {
            this.b.b(String.valueOf(this.c.n()), file.getAbsolutePath());
        }
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b39763", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void k(e8i e8iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21b0893", new Object[]{this, e8iVar});
            return;
        }
        this.f23812a = e8iVar;
        e8iVar.A(this.b);
    }
}
