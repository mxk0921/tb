package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dp2 implements sa2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f17995a;

    static {
        t2o.a(374341691);
        t2o.a(374341690);
    }

    public dp2(byte[] bArr) {
        this.f17995a = (byte[]) cpm.a(bArr);
    }

    @Override // tb.sa2
    public InputStream a() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("9d31a74", new Object[]{this});
        }
        return new ByteArrayInputStream(this.f17995a);
    }

    @Override // tb.sa2
    public long size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfc", new Object[]{this})).longValue();
        }
        return this.f17995a.length;
    }
}
