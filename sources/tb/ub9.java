package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ub9 implements sa2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final File f29274a;

    static {
        t2o.a(374341692);
        t2o.a(374341690);
    }

    public ub9(File file) {
        this.f29274a = (File) cpm.a(file);
    }

    public static ub9 b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ub9) ipChange.ipc$dispatch("d0b2b7e6", new Object[]{file});
        }
        if (file != null) {
            return new ub9(file);
        }
        return null;
    }

    @Override // tb.sa2
    public InputStream a() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("9d31a74", new Object[]{this});
        }
        return new FileInputStream(this.f29274a);
    }

    public File c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("88881834", new Object[]{this});
        }
        return this.f29274a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null || !(obj instanceof ub9)) {
            return false;
        }
        return this.f29274a.equals(((ub9) obj).f29274a);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return this.f29274a.hashCode();
    }

    @Override // tb.sa2
    public long size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfc", new Object[]{this})).longValue();
        }
        return this.f29274a.length();
    }
}
