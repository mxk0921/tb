package tb;

import com.alibaba.ut.abtest.internal.util.hash.Murmur3_32HashFunction;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.Charset;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class t10 implements hua {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544390);
        t2o.a(961544394);
    }

    @Override // tb.hua
    public hua b(CharSequence charSequence, Charset charset) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hua) ipChange.ipc$dispatch("b77ae496", new Object[]{this, charSequence, charset});
        }
        return c(charSequence.toString().getBytes(charset));
    }

    public hua c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hua) ipChange.ipc$dispatch("2a778107", new Object[]{this, bArr});
        }
        return ((Murmur3_32HashFunction.a) this).a(bArr, 0, bArr.length);
    }
}
