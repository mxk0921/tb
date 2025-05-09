package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.utils.EncryptUtils;
import com.taobao.login4android.api.Login;
import com.ut.device.UTDevice;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class yp4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f32255a = new AtomicInteger(1000);

    public final String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4636b48a", new Object[]{this, bArr});
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i += 2;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    public String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3679b975", new Object[]{this, context});
        }
        if (!mow.a()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append(d(context));
        stringBuffer.append(c());
        return stringBuffer.toString();
    }

    public final int c() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90d778de", new Object[]{this})).intValue();
        }
        do {
            atomicInteger = f32255a;
            i = atomicInteger.get();
            if (i > 9000) {
                i2 = 1000;
            } else {
                i2 = i + 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i2;
    }

    public final String d(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fccdfee", new Object[]{this, context});
        }
        String str2 = EncryptUtils.IV_PARAMETER_SPEC;
        if (context == null) {
            return str2;
        }
        String userId = Login.getUserId();
        if (!TextUtils.isEmpty(userId)) {
            String hexString = Long.toHexString(Long.parseLong(userId));
            return str2.substring(0, 16 - hexString.length()) + hexString;
        }
        String utdid = UTDevice.getUtdid(context);
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(utdid.getBytes());
            str = a(instance.digest());
        } catch (Throwable th) {
            th.printStackTrace();
            str = "";
        }
        if (str.length() >= 25) {
            str2 = str.substring(8, 24);
        }
        return str2;
    }
}
