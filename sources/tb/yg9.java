package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yg9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(153092149);
    }

    public static byte[] a(Context context, String str) {
        InputStream inputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("fc80871", new Object[]{context, str});
        }
        InputStream inputStream2 = null;
        try {
            inputStream = AssetsDelegate.proxy_open(context.getResources().getAssets(), str);
        } catch (Exception unused) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return bArr;
        } catch (Exception unused2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d95cf18", new Object[]{context, str});
        }
        try {
            return new String(a(context, str), "utf-8");
        } catch (Exception unused) {
            return null;
        }
    }
}
