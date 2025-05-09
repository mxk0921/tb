package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class znk implements c7o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f32894a;

    static {
        t2o.a(843055390);
        t2o.a(843055393);
    }

    public znk(String str, byte[] bArr) {
        ckf.g(str, "url");
        this.f32894a = bArr;
    }

    @Override // tb.c7o
    public byte[] getBytes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3e6c8fa1", new Object[]{this});
        }
        return this.f32894a;
    }

    @Override // tb.c7o
    public InputStream getStream() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("99ec2680", new Object[]{this});
        }
        if (this.f32894a == null) {
            return null;
        }
        return new ByteArrayInputStream(this.f32894a);
    }

    @Override // tb.c7o
    public String getString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f06a652", new Object[]{this});
        }
        byte[] bArr = this.f32894a;
        if (bArr == null) {
            return null;
        }
        return new String(bArr, uj3.UTF_8);
    }
}
