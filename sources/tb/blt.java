package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class blt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(395313330);
    }

    public static String a(String[] strArr, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c912aeb", new Object[]{strArr, str});
        }
        for (String str2 : strArr) {
            if (str2.startsWith(str)) {
                return str2;
            }
        }
        return null;
    }

    public static int b(String str, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c542fbec", new Object[]{str, new Integer(i)})).intValue();
        }
        return Integer.parseInt(e(str), i);
    }

    public static int[] c(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("79f47d13", new Object[]{str});
        }
        return i(e(str).split(" "));
    }

    public static int[] d(String str, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("cdabbbfd", new Object[]{str, new Integer(i)});
        }
        String[] f = f(str);
        for (int i2 = 0; i2 < f.length; i2++) {
            f[i2] = f[i2].split(" ")[i];
        }
        return i(f);
    }

    public static String e(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("23000045", new Object[]{str});
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            String readLine = new BufferedReader(new InputStreamReader(fileInputStream, StandardCharsets.US_ASCII)).readLine();
            fileInputStream.close();
            return readLine;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String[] f(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("66360229", new Object[]{str});
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, StandardCharsets.US_ASCII));
            ArrayList arrayList = new ArrayList();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    fileInputStream.close();
                    return (String[]) arrayList.toArray(new String[0]);
                }
                arrayList.add(readLine);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String g(InputStream inputStream, Charset charset) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a439ed", new Object[]{inputStream, charset});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[40960];
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                return new String(byteArrayOutputStream.toByteArray(), charset);
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static String h(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4929f08", new Object[]{str});
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            String g = g(fileInputStream, StandardCharsets.US_ASCII);
            fileInputStream.close();
            return g;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int[] i(String[] strArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("2de86af1", new Object[]{strArr});
        }
        int[] iArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            iArr[i] = Integer.parseInt(strArr[i]);
        }
        return iArr;
    }
}
