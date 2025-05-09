package com.alibaba.ariver.kernel.common.utils;

import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.io.ByteArrayPool;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class IOUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAP_FILE_THRESHOLD_MIN = 65536;
    public static final int MAP_FILE_THRESHOOLD_MAX = 5242880;

    /* renamed from: a  reason: collision with root package name */
    public static final ByteArrayPool f2439a = new ByteArrayPool(20480);

    public static void closeQuietly(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61d37bb", new Object[]{closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                RVLogger.e("close stream exception", e);
            }
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad894149", new Object[]{inputStream, outputStream});
        } else {
            copy(inputStream, outputStream, 4096);
        }
    }

    public static void freeMappedBuffer(MappedByteBuffer mappedByteBuffer) {
        if (mappedByteBuffer != null) {
            try {
                Method declaredMethod = Class.forName("java.nio.NioUtils").getDeclaredMethod("freeDirectBuffer", ByteBuffer.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, mappedByteBuffer);
            } catch (Throwable th) {
                RVLogger.e("AriverKernel", "freeMappedBuffer Exception!", th);
            }
        }
    }

    public static byte[] getBuf(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a0197a7e", new Object[]{new Integer(i)});
        }
        return getByteArrayPool().getBuf(i);
    }

    public static ByteArrayPool getByteArrayPool() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteArrayPool) ipChange.ipc$dispatch("f43f1d56", new Object[0]);
        }
        return f2439a;
    }

    public static boolean isNIOEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("258c3c62", new Object[0])).booleanValue();
        }
        return Constants.VAL_YES.equalsIgnoreCase(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigWithProcessCache("h5_nebulaUseNIO", "no"));
    }

    public static String read(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b2827ca", new Object[]{inputStream});
        }
        if (inputStream == null) {
            return null;
        }
        return new String(readToByte(inputStream));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String readAsset(android.content.res.Resources r4, java.lang.String r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ariver.kernel.common.utils.IOUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "3ef52956"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0018:
            r0 = 0
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch: all -> 0x002e, IOException -> 0x0030
            java.io.InputStream r4 = com.taobao.codetrack.sdk.assets.AssetsDelegate.proxy_open(r4, r5)     // Catch: all -> 0x002e, IOException -> 0x0030
            java.lang.String r5 = read(r4)     // Catch: all -> 0x0029, IOException -> 0x002c
            closeQuietly(r4)
            return r5
        L_0x0029:
            r5 = move-exception
            r0 = r4
            goto L_0x003c
        L_0x002c:
            r5 = move-exception
            goto L_0x0032
        L_0x002e:
            r5 = move-exception
            goto L_0x003c
        L_0x0030:
            r5 = move-exception
            r4 = r0
        L_0x0032:
            java.lang.String r1 = "read asset exception"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r1, r5)     // Catch: all -> 0x0029
            closeQuietly(r4)
            return r0
        L_0x003c:
            closeQuietly(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.IOUtils.readAsset(android.content.res.Resources, java.lang.String):java.lang.String");
    }

    public static void returnBuf(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15524871", new Object[]{bArr});
        } else {
            getByteArrayPool().returnBuf(bArr);
        }
    }

    public static void write(String str, String str2, boolean z) throws IOException {
        Throwable th;
        BufferedWriter bufferedWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5216831a", new Object[]{str, str2, new Boolean(z)});
            return;
        }
        File file = new File(str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException unused) {
            }
        }
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, z)));
            try {
                bufferedWriter.write(str2);
                try {
                    bufferedWriter.flush();
                    bufferedWriter.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (bufferedWriter != null) {
                    try {
                        bufferedWriter.flush();
                        bufferedWriter.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            bufferedWriter = null;
            th = th3;
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f5ada", new Object[]{inputStream, outputStream, new Integer(i)});
            return;
        }
        byte[] buf = getBuf(i);
        while (true) {
            int read = inputStream.read(buf);
            if (-1 != read) {
                outputStream.write(buf, 0, read);
            } else {
                return;
            }
        }
    }

    public static String read(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a0eb7d9", new Object[]{str});
        }
        try {
            return read(new FileInputStream(str));
        } catch (Exception e) {
            RVLogger.e("read exception", e);
            return null;
        }
    }

    public static byte[] readToByte(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e0ed5c0a", new Object[]{inputStream});
        }
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 2048);
                if (read < 0) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Exception e) {
                RVLogger.e("read exception", e);
                return null;
            } finally {
                closeQuietly(inputStream);
            }
        }
    }
}
