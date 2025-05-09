package tb;

import android.util.Pair;
import com.airbnb.lottie.network.FileExtension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import tb.k6g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ftj {

    /* renamed from: a  reason: collision with root package name */
    public final slh f19521a;

    public ftj(slh slhVar) {
        this.f19521a = slhVar;
    }

    public static String b(String str, FileExtension fileExtension, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        if (z) {
            str2 = fileExtension.tempExtension();
        } else {
            str2 = fileExtension.extension;
        }
        sb.append(str2);
        return sb.toString();
    }

    public Pair<FileExtension, InputStream> a(String str) {
        FileExtension fileExtension;
        try {
            File c = c(str);
            if (c == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(c);
            if (c.getAbsolutePath().endsWith(".zip")) {
                fileExtension = FileExtension.ZIP;
            } else {
                fileExtension = FileExtension.JSON;
            }
            zhh.b("NetworkCache hit for " + str + " at " + c.getAbsolutePath());
            return new Pair<>(fileExtension, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public final File c(String str) throws FileNotFoundException {
        File file = new File(d(), b(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(d(), b(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    public final File d() {
        File a2 = ((k6g.a) this.f19521a).a();
        if (a2.isFile()) {
            a2.delete();
        }
        if (!a2.exists()) {
            a2.mkdirs();
        }
        return a2;
    }

    public void e(String str, FileExtension fileExtension) {
        File file = new File(d(), b(str, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        zhh.a("Copying temp file to real file (" + file2 + f7l.BRACKET_END_STR);
        if (!renameTo) {
            zhh.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
        }
    }

    public File f(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        File file = new File(d(), b(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }
}
