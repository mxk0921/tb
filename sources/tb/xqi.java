package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xqi extends ByteArrayInputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(343933241);
    }

    public xqi(byte[] bArr) {
        super(bArr);
    }

    public static /* synthetic */ Object ipc$super(xqi xqiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/utl/MessageStreamReader");
    }

    public String A(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f746f6cb", new Object[]{this, new Integer(i)});
        }
        byte[] bArr = new byte[i];
        int read = read(bArr);
        if (read == i) {
            return new String(bArr, "utf-8");
        }
        throw new IOException("read len not match. ask for " + i + " but read for " + read);
    }

    public byte[] e() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("121937eb", new Object[]{this});
        }
        byte[] bArr = new byte[available()];
        read(bArr);
        return bArr;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a5be938", new Object[]{this})).intValue();
        }
        return read() & 255;
    }

    public int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15459a00", new Object[]{this})).intValue();
        }
        return (g() << 8) | g();
    }
}
