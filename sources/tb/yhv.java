package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.datapoints.StatisticalDataPoint$PageName;
import com.etao.feimagesearch.nn.NetConfig;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class yhv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297311);
    }

    public static String c(String str, String str2) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fad273d9", new Object[]{str, str2});
        }
        if (!lg4.j() && caa.c() != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(caa.c().getCacheDir(), "festival");
            if (!file.exists()) {
                return "";
            }
            File file2 = new File(file, "festival.bin");
            if (!file2.exists() || file2.length() == 0) {
                return "";
            }
            int length = (int) file2.length();
            byte[] bArr = new byte[length];
            BufferedInputStream bufferedInputStream = null;
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file2));
                try {
                    bufferedInputStream2.read(bArr, 0, length);
                    e2d.a(bufferedInputStream2);
                    if (!TextUtils.equals(boh.c(bArr), str2)) {
                        yf9.c(file2);
                        return "";
                    }
                    jzu.i(StatisticalDataPoint$PageName.PHOTO_SEARCH_TAKE.getPageName(), "preDownload", new String[0]);
                    return file2.getAbsolutePath();
                } catch (Exception unused) {
                    bufferedInputStream = bufferedInputStream2;
                    e2d.a(bufferedInputStream);
                    return "";
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    e2d.a(bufferedInputStream);
                    throw th;
                }
            } catch (Exception unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return "";
    }

    public static String a(String str, boolean z, boolean z2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70723c5b", new Object[]{str, new Boolean(z), new Boolean(z2), str2});
        }
        agh.b("UnitBuildUtil", "downloadModelFile, ignoreWifi is %b", Boolean.valueOf(z));
        int a2 = caa.u() ? 1 : n4p.a();
        if (!z && a2 != 1) {
            return "";
        }
        agh.b("UnitBuildUtil", "model cdnUrl = %s", str);
        if (TextUtils.isEmpty(str) || !TextUtils.isEmpty(g7h.b(caa.c(), str))) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a3 = ayi.a(caa.c(), str, z2, str2);
        long currentTimeMillis2 = System.currentTimeMillis();
        if (!TextUtils.isEmpty(a3)) {
            long j = currentTimeMillis2 - currentTimeMillis;
            jzu.i(StatisticalDataPoint$PageName.PHOTO_SEARCH_TAKE.getPageName(), "detectModelDownloadFinish", "time", String.valueOf(j));
            agh.b("UnitBuildUtil", "detectModelDownloadFinish time= %d", Long.valueOf(j));
        } else {
            long j2 = currentTimeMillis2 - currentTimeMillis;
            jzu.i(StatisticalDataPoint$PageName.PHOTO_SEARCH_TAKE.getPageName(), "detectModelDownloadFailed", "time", String.valueOf(j2));
            agh.b("UnitBuildUtil", "detectModelDownloadFailed time= %d", Long.valueOf(j2));
        }
        return a3;
    }

    public static String b(String str, boolean z, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba886127", new Object[]{str, new Boolean(z), str2, str3});
        }
        String c = g7h.c(caa.c(), str, str2);
        String str4 = TextUtils.isEmpty(str3) ? "-1" : str3;
        if (TextUtils.isEmpty(c)) {
            long currentTimeMillis = System.currentTimeMillis();
            String a2 = a(str, true, z, str2);
            qq0.f(NetConfig.ALINN_BIZ_NAME, str3, "0", "", !TextUtils.isEmpty(a2), (float) (System.currentTimeMillis() - currentTimeMillis));
            String pageName = StatisticalDataPoint$PageName.PHOTO_SEARCH_TAKE.getPageName();
            jzu.i(pageName, "selfDownload" + str4, new String[0]);
            return a2;
        }
        String pageName2 = StatisticalDataPoint$PageName.PHOTO_SEARCH_TAKE.getPageName();
        jzu.i(pageName2, "cacheLoad" + str4, new String[0]);
        return c;
    }
}
