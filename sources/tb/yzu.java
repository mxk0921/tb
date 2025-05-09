package tb;

import com.android.alibaba.ip.runtime.IpChange;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class yzu implements x4e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f32439a;
    public final String b;
    public final String c;
    public byte[] d;

    static {
        t2o.a(962593270);
        t2o.a(962593268);
    }

    public yzu(String str, String str2) {
        this.f32439a = false;
        this.d = null;
        this.b = str;
        this.c = str2;
    }

    public static String calcHmac(byte[] bArr, byte[] bArr2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9391840f", new Object[]{bArr, bArr2});
        }
        Mac instance = Mac.getInstance("HmacSHA1");
        instance.init(new SecretKeySpec(bArr, instance.getAlgorithm()));
        return qoh.c(instance.doFinal(bArr2));
    }

    public final byte[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("6af5495b", new Object[]{this});
        }
        if (this.d == null) {
            this.d = o9n.c(new byte[]{66, 37, 42, -119, 118, -104, -30, 4, -95, 15, -26, -12, -75, -102, 71, 23, -3, -120, -1, -57, 42, 99, -16, -101, 103, -74, 93, -114, 112, -26, -24, -24});
        }
        return this.d;
    }

    public String getAppSecret() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96a305e", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.x4e
    public String getAppkey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9396be5", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.x4e
    public String getSign(String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b4a049c", new Object[]{this, str});
        }
        if (this.b == null || (str2 = this.c) == null) {
            nhh.i("UTBaseRequestAuthentication", "There is no appkey,please check it!");
            return null;
        } else if (str == null) {
            return null;
        } else {
            try {
                if (this.f32439a) {
                    str3 = calcHmac(str2.getBytes(), str.getBytes());
                } else {
                    str3 = calcHmac(a(), str.getBytes());
                }
                return str3;
            } catch (Exception unused) {
                return "";
            }
        }
    }

    public boolean isEncode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fdc46b", new Object[]{this})).booleanValue();
        }
        return this.f32439a;
    }

    public yzu(String str, String str2, boolean z) {
        this.d = null;
        this.b = str;
        this.c = str2;
        this.f32439a = z;
    }
}
