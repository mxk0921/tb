package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ma2 implements ky3<ka2> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f23882a = Charset.forName("UTF-8");

    static {
        t2o.a(315621419);
        t2o.a(315621420);
    }

    public final byte[] c(int i, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d8e54165", new Object[]{this, new Integer(i), bArr});
        }
        if (i <= bArr.length) {
            return bArr;
        }
        return new byte[i];
    }

    /* renamed from: d */
    public dck a(ka2 ka2Var) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dck) ipChange.ipc$dispatch("f4bda8cc", new Object[]{this, ka2Var});
        }
        ByteBuffer a2 = ka2Var.a();
        a2.rewind();
        if (a2.order() == ByteOrder.BIG_ENDIAN) {
            int i = a2.getInt();
            byte[] bArr = new byte[i];
            a2.get(bArr, 0, i);
            Charset charset = f23882a;
            String str = new String(bArr, 0, i, charset);
            int i2 = a2.getInt();
            byte[] bArr2 = new byte[i2];
            a2.get(bArr2, 0, i2);
            String str2 = new String(bArr2, 0, i2, charset);
            int i3 = a2.getInt();
            if (i3 > 0) {
                hashMap = new HashMap(i3);
                byte[] bArr3 = new byte[32];
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = a2.getInt();
                    byte[] c = c(i5, bArr3);
                    a2.get(c, 0, i5);
                    Charset charset2 = f23882a;
                    String str3 = new String(c, 0, i5, charset2);
                    int i6 = a2.getInt();
                    bArr3 = c(i6, c);
                    a2.get(bArr3, 0, i6);
                    hashMap.put(str3, new String(bArr3, 0, i6, charset2));
                }
            } else {
                hashMap = null;
            }
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                return null;
            }
            return new dck(str, str2, hashMap);
        }
        throw new IllegalStateException("Carrier byte order must be big endian.");
    }

    /* renamed from: e */
    public void b(dck dckVar, ka2 ka2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321cd0b0", new Object[]{this, dckVar, ka2Var});
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        h(byteArrayOutputStream, dckVar.b());
        h(byteArrayOutputStream, dckVar.c());
        f(byteArrayOutputStream, dckVar.e());
        for (Map.Entry<String, String> entry : dckVar.a()) {
            g(byteArrayOutputStream, entry.getKey(), entry.getValue());
        }
        int size = byteArrayOutputStream.size();
        ByteBuffer b = ka2Var.b(size);
        if (b.order() == ByteOrder.BIG_ENDIAN) {
            b.put(byteArrayOutputStream.toByteArray(), 0, size);
            return;
        }
        throw new IllegalStateException("Carrier byte order must be big endian.");
    }

    public final void f(ByteArrayOutputStream byteArrayOutputStream, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1673f9ef", new Object[]{this, byteArrayOutputStream, new Integer(i)});
            return;
        }
        byteArrayOutputStream.write((byte) (i >> 24));
        byteArrayOutputStream.write((byte) (i >> 16));
        byteArrayOutputStream.write((byte) (i >> 8));
        byteArrayOutputStream.write((byte) i);
    }

    public final void g(ByteArrayOutputStream byteArrayOutputStream, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("291bf814", new Object[]{this, byteArrayOutputStream, str, str2});
            return;
        }
        Charset charset = f23882a;
        byte[] bytes = str.getBytes(charset);
        int length = bytes.length;
        f(byteArrayOutputStream, length);
        byteArrayOutputStream.write(bytes, 0, length);
        byte[] bytes2 = str2.getBytes(charset);
        int length2 = str2.length();
        f(byteArrayOutputStream, length2);
        byteArrayOutputStream.write(bytes2, 0, length2);
    }

    public final void h(ByteArrayOutputStream byteArrayOutputStream, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24dfe71e", new Object[]{this, byteArrayOutputStream, str});
            return;
        }
        byte[] bytes = str.getBytes(f23882a);
        int length = bytes.length;
        f(byteArrayOutputStream, length);
        byteArrayOutputStream.write(bytes, 0, length);
    }
}
