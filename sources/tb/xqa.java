package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xqa implements o55 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f31545a;

    public xqa(InputStream inputStream) {
        this.f31545a = new BufferedInputStream(inputStream, 32768);
    }

    @Override // tb.o55
    public void close() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.f31545a.close();
        }
    }

    @Override // tb.o55
    public int read(byte[] bArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ed24497", new Object[]{this, bArr})).intValue();
        }
        return this.f31545a.read(bArr, 0, bArr.length);
    }
}
