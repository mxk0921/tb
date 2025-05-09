package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class z1d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(782237725);
    }

    public static String a(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6f808b6", new Object[]{file});
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return b(fileInputStream);
        } finally {
            fileInputStream.close();
        }
    }

    public static String b(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8105b520", new Object[]{inputStream});
        }
        return c(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
    }

    public static String c(Reader reader) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9bb7f1fd", new Object[]{reader});
        }
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[4096];
        while (true) {
            int read = reader.read(cArr);
            if (read < 0) {
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, read);
        }
    }
}
