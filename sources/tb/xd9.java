package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.tao.Globals;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xd9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f31320a = null;

    static {
        t2o.a(473956385);
    }

    public static byte[] a(String str) {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("7b68c5f2", new Object[]{str});
        }
        try {
            inputStream = AssetsDelegate.proxy_open(Globals.getApplication().getResources().getAssets(), str);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            byteArrayOutputStream = null;
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th4) {
            th = th4;
            try {
                bqa.b("FileTools", "Read bytes from asset file exception", th);
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable unused) {
                    }
                }
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                inputStream.close();
            } catch (Throwable unused3) {
            }
            try {
                byteArrayOutputStream.close();
            } catch (Throwable unused4) {
            }
            return byteArray;
        }
        try {
            inputStream.close();
        } catch (Throwable unused5) {
        }
        try {
        } catch (Throwable unused6) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(android.content.Context r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.xd9.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "1516638f"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            java.lang.String r0 = tb.xd9.f31320a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0020
            java.lang.String r4 = tb.xd9.f31320a
            return r4
        L_0x0020:
            java.io.File r0 = r4.getFilesDir()
            r1 = 0
            if (r0 == 0) goto L_0x002e
            boolean r2 = r0.canWrite()
            if (r2 != 0) goto L_0x002e
            r0 = r1
        L_0x002e:
            if (r0 != 0) goto L_0x003d
            java.io.File r0 = r4.getCacheDir()
            if (r0 == 0) goto L_0x003d
            boolean r2 = r0.canWrite()
            if (r2 != 0) goto L_0x003d
            r0 = r1
        L_0x003d:
            java.lang.String r2 = ""
            if (r0 != 0) goto L_0x0078
            java.io.File r0 = r4.getExternalFilesDir(r1)     // Catch: Exception -> 0x0046
            goto L_0x005e
        L_0x0046:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x004e
            r0 = r2
        L_0x004e:
            java.lang.String r3 = "AndroidFileSystemInitDirError"
            java.lang.String r0 = r3.concat(r0)
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r3 = "FileStore"
            tb.bqa.d(r3, r0)
            r0 = r1
        L_0x005e:
            if (r0 == 0) goto L_0x0067
            boolean r3 = r0.canWrite()
            if (r3 != 0) goto L_0x0067
            r0 = r1
        L_0x0067:
            if (r0 != 0) goto L_0x0078
            java.io.File r4 = r4.getExternalCacheDir()
            if (r4 == 0) goto L_0x0076
            boolean r0 = r4.canWrite()
            if (r0 != 0) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            r1 = r4
            goto L_0x0079
        L_0x0078:
            r1 = r0
        L_0x0079:
            if (r1 == 0) goto L_0x0089
            java.io.File r4 = new java.io.File
            java.lang.String r0 = "fast_store"
            r4.<init>(r1, r0)
            java.lang.String r4 = r4.getAbsolutePath()
            tb.xd9.f31320a = r4
            return r4
        L_0x0089:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xd9.b(android.content.Context):java.lang.String");
    }

    public static byte[] c(File file) throws IOException {
        int read;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("6ee147df", new Object[]{file});
        }
        long length = file.length();
        if (length <= 2147483639) {
            FileInputStream fileInputStream = new FileInputStream(file);
            int i2 = (int) length;
            byte[] bArr = new byte[i2];
            while (true) {
                int read2 = fileInputStream.read(bArr, i, i2 - i);
                if (read2 > 0) {
                    i += read2;
                } else if (read2 < 0 || (read = fileInputStream.read()) < 0) {
                    break;
                } else {
                    if (i2 <= 2147483639 - i2) {
                        i2 = Math.max(i2 << 1, 8192);
                    } else if (i2 != 2147483639) {
                        i2 = 2147483639;
                    } else {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                    bArr = Arrays.copyOf(bArr, i2);
                    bArr[i] = (byte) read;
                    i++;
                }
            }
            fileInputStream.close();
            if (i2 == i) {
                return bArr;
            }
            return Arrays.copyOf(bArr, i);
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    public static byte[] d(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f594f96d", new Object[]{file});
        }
        try {
            return c(file);
        } catch (IOException e) {
            bqa.b("FileTools", "Read all bytes exception", e);
            return null;
        }
    }

    public static boolean e(File file, byte[] bArr) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dd98184", new Object[]{file, bArr})).booleanValue();
        }
        if (bArr == null || file == null) {
            return false;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bufferedOutputStream2.write(bArr);
                try {
                    bufferedOutputStream2.close();
                } catch (Throwable th2) {
                    bqa.b("FileTools", "Close file output stream exception", th2);
                }
                return true;
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    bqa.b("FileTools", "Write file exception", th);
                    return false;
                } finally {
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (Throwable th4) {
                            bqa.b("FileTools", "Close file output stream exception", th4);
                        }
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public static boolean f(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a348817", new Object[]{str, bArr})).booleanValue();
        }
        return e(new File(str), bArr);
    }
}
