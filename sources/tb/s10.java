package tb;

import com.alibaba.ut.abtest.internal.util.hash.HashCode;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.Charset;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class s10 implements eua {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544389);
        t2o.a(961544393);
    }

    public HashCode hashBytes(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashCode) ipChange.ipc$dispatch("bcc8c7c8", new Object[]{this, bArr}) : hashBytes(bArr, 0, bArr.length);
    }

    @Override // tb.eua
    public HashCode hashString(CharSequence charSequence, Charset charset) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashCode) ipChange.ipc$dispatch("ac2330f5", new Object[]{this, charSequence, charset});
        }
        return newHasher().b(charSequence, charset).hash();
    }

    public hua newHasher(int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hua) ipChange.ipc$dispatch("2b7bbe1e", new Object[]{this, new Integer(i)});
        }
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        bpm.d(z, "expectedInputSize must be >= 0 but was %s", Integer.valueOf(i));
        return newHasher();
    }

    public HashCode hashBytes(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashCode) ipChange.ipc$dispatch("4d663968", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        }
        bpm.f(i, i + i2, bArr.length);
        return newHasher(i2).a(bArr, i, i2).hash();
    }
}
