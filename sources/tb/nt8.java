package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nt8 implements c8q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<File> f24939a;
    public final ocq b;
    public final mkj c;

    static {
        t2o.a(677380210);
        t2o.a(677380219);
    }

    public nt8(mkj mkjVar, Set<File> set, ocq ocqVar) {
        this.c = mkjVar;
        this.f24939a = set;
        this.b = ocqVar;
    }

    @Override // tb.c8q
    public void a(ZipFile zipFile, Set<tjj> set) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4440da", new Object[]{this, zipFile, set});
        } else {
            this.f24939a.addAll(this.c.g(set, this.b, zipFile));
        }
    }
}
