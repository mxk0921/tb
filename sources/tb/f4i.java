package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class f4i implements c8q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ocq f18996a;
    public final Set<File> b;
    public final AtomicBoolean c;
    public final mkj d;

    static {
        t2o.a(677380215);
        t2o.a(677380219);
    }

    public f4i(mkj mkjVar, ocq ocqVar, Set<File> set, AtomicBoolean atomicBoolean) {
        this.d = mkjVar;
        this.f18996a = ocqVar;
        this.b = set;
        this.c = atomicBoolean;
    }

    @Override // tb.c8q
    public void a(ZipFile zipFile, Set<tjj> set) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4440da", new Object[]{this, zipFile, set});
        } else {
            this.d.j(this.f18996a, set, new e4i(this));
        }
    }
}
