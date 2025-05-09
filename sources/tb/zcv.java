package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class zcv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886368);
    }

    public static byte[] a(byte[] bArr) {
        GZIPOutputStream gZIPOutputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("58fe616d", new Object[]{bArr});
        }
        GZIPOutputStream gZIPOutputStream2 = null;
        if (!(bArr == null || bArr.length == 0)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
            try {
                try {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException unused) {
                            }
                            return byteArray;
                        } catch (IOException unused2) {
                            if (gZIPOutputStream != null) {
                                gZIPOutputStream.close();
                            }
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException unused3) {
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            gZIPOutputStream2 = gZIPOutputStream;
                            if (gZIPOutputStream2 != null) {
                                try {
                                    gZIPOutputStream2.close();
                                } catch (IOException unused4) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException unused5) {
                        }
                        throw th3;
                    }
                } catch (IOException unused6) {
                    gZIPOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (IOException unused7) {
            }
        }
        return null;
    }
}
