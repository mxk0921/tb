package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fg9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286730);
    }

    public static byte[] a(Context context, String str) {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c478f327", new Object[]{context, str});
        }
        try {
            InputStream proxy_open = AssetsDelegate.proxy_open(context.getAssets(), str);
            if (proxy_open == null) {
                return "".getBytes();
            }
            BufferedInputStream bufferedInputStream2 = null;
            try {
                bufferedInputStream = new BufferedInputStream(proxy_open);
            } catch (IOException unused) {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                byte[] bArr = new byte[bufferedInputStream.available()];
                bufferedInputStream.read(bArr);
                try {
                    bufferedInputStream.close();
                } catch (Exception unused2) {
                }
                return bArr;
            } catch (IOException unused3) {
                bufferedInputStream2 = bufferedInputStream;
                if (bufferedInputStream2 != null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (Exception unused4) {
                    }
                }
                return "".getBytes();
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream2 = bufferedInputStream;
                if (bufferedInputStream2 != null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (Exception unused5) {
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "".getBytes();
        }
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ec45b1", new Object[]{context, str});
        }
        return new String(a(context, str));
    }

    public static byte[] c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b0eaff4e", new Object[]{context, str});
        }
        try {
            return g2d.a(new FileInputStream(str));
        } catch (Throwable th) {
            th.printStackTrace();
            return "".getBytes();
        }
    }

    public static String d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0ee622a", new Object[]{context, str});
        }
        return new String(c(context, str));
    }
}
