package tb;

import android.util.Pair;
import com.airbnb.lottie.network.FileExtension;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mtj {

    /* renamed from: a  reason: collision with root package name */
    public final ftj f24297a;
    public final tlh b;

    public mtj(ftj ftjVar, tlh tlhVar) {
        this.f24297a = ftjVar;
        this.b = tlhVar;
    }

    public final kkh a(String str, String str2) {
        Pair<FileExtension, InputStream> a2;
        zlh<kkh> zlhVar;
        if (str2 == null || (a2 = this.f24297a.a(str)) == null) {
            return null;
        }
        FileExtension fileExtension = (FileExtension) a2.first;
        InputStream inputStream = (InputStream) a2.second;
        if (fileExtension == FileExtension.ZIP) {
            zlhVar = ukh.A(new ZipInputStream(inputStream), str);
        } else {
            zlhVar = ukh.p(inputStream, str);
        }
        if (zlhVar.b() != null) {
            return zlhVar.b();
        }
        return null;
    }

    public final zlh<kkh> b(String str, String str2) {
        boolean z;
        zhh.b("Fetching " + str);
        try {
            try {
                por porVar = (por) ((qor) this.b).a(str);
                if (porVar.C()) {
                    zlh<kkh> d = d(str, porVar.e(), porVar.g(), str2);
                    StringBuilder sb = new StringBuilder("Completed fetch from network. Success: ");
                    if (d.b() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(z);
                    zhh.a(sb.toString());
                    try {
                        porVar.close();
                    } catch (IOException e) {
                        zhh.c("LottieFetchResult close failed ", e);
                    }
                    return d;
                }
                zlh<kkh> zlhVar = new zlh<>(new IllegalArgumentException(porVar.w()));
                try {
                    porVar.close();
                } catch (IOException e2) {
                    zhh.c("LottieFetchResult close failed ", e2);
                }
                return zlhVar;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        null.close();
                    } catch (IOException e3) {
                        zhh.c("LottieFetchResult close failed ", e3);
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            zlh<kkh> zlhVar2 = new zlh<>(e4);
            if (0 != 0) {
                try {
                    null.close();
                } catch (IOException e5) {
                    zhh.c("LottieFetchResult close failed ", e5);
                }
            }
            return zlhVar2;
        }
    }

    public zlh<kkh> c(String str, String str2) {
        kkh a2 = a(str, str2);
        if (a2 != null) {
            return new zlh<>(a2);
        }
        zhh.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(str, str2);
    }

    public final zlh<kkh> d(String str, InputStream inputStream, String str2, String str3) throws IOException {
        FileExtension fileExtension;
        zlh<kkh> zlhVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            zhh.a("Handling zip response.");
            fileExtension = FileExtension.ZIP;
            zlhVar = f(str, inputStream, str3);
        } else {
            zhh.a("Received json response.");
            fileExtension = FileExtension.JSON;
            zlhVar = e(str, inputStream, str3);
        }
        if (!(str3 == null || zlhVar.b() == null)) {
            this.f24297a.e(str, fileExtension);
        }
        return zlhVar;
    }

    public final zlh<kkh> e(String str, InputStream inputStream, String str2) throws IOException {
        if (str2 == null) {
            return ukh.p(inputStream, null);
        }
        return ukh.p(new FileInputStream(this.f24297a.f(str, inputStream, FileExtension.JSON).getAbsolutePath()), str);
    }

    public final zlh<kkh> f(String str, InputStream inputStream, String str2) throws IOException {
        if (str2 == null) {
            return ukh.A(new ZipInputStream(inputStream), null);
        }
        return ukh.A(new ZipInputStream(new FileInputStream(this.f24297a.f(str, inputStream, FileExtension.ZIP))), str);
    }
}
