package tb;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yrq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789147);
    }

    public static String a(String str) {
        Throwable th;
        GZIPOutputStream gZIPOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f06f88d", new Object[]{str});
        }
        if (str != null && !str.isEmpty()) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            GZIPOutputStream gZIPOutputStream2 = null;
            try {
                try {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    } catch (IOException unused) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e) {
                            ck.g().b("StringUtils", "compress", e.getMessage());
                        }
                        return "";
                    }
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    gZIPOutputStream.write(str.getBytes("utf-8"));
                    gZIPOutputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        ck.g().b("StringUtils", "compress", e2.getMessage());
                    }
                    return Base64.encodeToString(byteArray, 0);
                } catch (IOException unused3) {
                    gZIPOutputStream2 = gZIPOutputStream;
                    if (gZIPOutputStream2 != null) {
                        gZIPOutputStream2.close();
                    }
                    byteArrayOutputStream.close();
                    return "";
                } catch (Throwable th3) {
                    th = th3;
                    gZIPOutputStream2 = gZIPOutputStream;
                    if (gZIPOutputStream2 != null) {
                        try {
                            gZIPOutputStream2.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e3) {
                    ck.g().b("StringUtils", "compress", e3.getMessage());
                }
                throw th4;
            }
        }
        return "";
    }
}
