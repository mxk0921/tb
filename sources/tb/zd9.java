package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zd9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(487587976);
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
            inputStream = AssetsDelegate.proxy_open(rj7.a().getResources().getAssets(), str);
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
                i65.b("FileTools", "Read bytes from asset file exception", th);
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

    public static byte[] b(File file) throws IOException {
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

    public static byte[] c(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f594f96d", new Object[]{file});
        }
        try {
            return b(file);
        } catch (IOException e) {
            i65.b("FileTools", "Read all bytes exception", e);
            return null;
        }
    }

    public static boolean d(File file, byte[] bArr) {
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
                    i65.b("FileTools", "Close file output stream exception", th2);
                }
                return true;
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    i65.b("FileTools", "Write file exception", th);
                    return false;
                } finally {
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (Throwable th4) {
                            i65.b("FileTools", "Close file output stream exception", th4);
                        }
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public static boolean e(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a348817", new Object[]{str, bArr})).booleanValue();
        }
        return d(new File(str), bArr);
    }
}
