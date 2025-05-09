package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ot8 implements e8q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<File> f25637a;
    public final ocq b;
    public final ZipFile c;

    static {
        t2o.a(677380211);
        t2o.a(677380220);
    }

    public ot8(Set<File> set, ocq ocqVar, ZipFile zipFile) {
        this.f25637a = set;
        this.b = ocqVar;
        this.c = zipFile;
    }

    @Override // tb.e8q
    public void a(tjj tjjVar, File file, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea576dbf", new Object[]{this, tjjVar, file, new Boolean(z)});
            return;
        }
        this.f25637a.add(file);
        if (!z) {
            mkj.e(this.c, tjjVar.b, file);
        }
    }
}
