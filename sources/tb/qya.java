package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.util.OLog;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qya implements lqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f27003a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        t2o.a(613417067);
        t2o.a(613417072);
    }

    @Override // tb.lqd
    public String a(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ae00174", new Object[]{this, context, str, str2, str3, str4});
        }
        return c(str3, str2);
    }

    public final char[] b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("cdfe3e4b", new Object[]{this, bArr});
        }
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f27003a;
            cArr[i] = cArr2[(b & 240) >>> 4];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return cArr;
    }

    public final String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85d123d9", new Object[]{this, str, str2});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                Mac instance = Mac.getInstance("HmacSHA1");
                instance.init(new SecretKeySpec(str2.getBytes("utf-8"), "HmacSHA1"));
                char[] b = b(instance.doFinal(str.getBytes("utf-8")));
                if (b != null) {
                    return new String(b);
                }
                return null;
            } catch (Exception e) {
                OLog.e("HmacSign", "hmacSha1", e, new Object[0]);
            }
        }
        return null;
    }
}
