package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class l87 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f23170a;

    static {
        t2o.a(665845912);
        t2o.a(665845913);
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f4c5e25", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        String c = c(str, "2138079021646297");
        this.f23170a = c;
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        if (str.contains("?")) {
            return str.concat("&sm=".concat(this.f23170a));
        }
        return str.concat("?sm=".concat(this.f23170a));
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee91d6a6", new Object[]{this});
        }
        return this.f23170a;
    }

    public final String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da560aa4", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.concat(str2).getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                int i = b & 255;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i));
            }
            String sb2 = sb.toString();
            if (TextUtils.isEmpty(sb2)) {
                return null;
            }
            return sb2.substring(0, 6);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Huh, UTF-8 should be supported?", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("Huh, MD5 should be supported?", e2);
        }
    }
}
