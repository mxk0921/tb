package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.dynamicfeature.FeatureUpdateData;
import com.taobao.update.dynamicfeature.utils.Constants;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mt8 implements czm<q49> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(951058445);
        t2o.a(947912754);
    }

    public final void a(InputStream inputStream, String str, File file) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad4d7298", new Object[]{this, inputStream, str, file});
            return;
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(file, str + jcq.APK_EXTENSION)));
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    bufferedOutputStream.write(bArr, 0, read);
                }
                bufferedOutputStream.close();
            } catch (Exception unused) {
                bufferedOutputStream2 = bufferedOutputStream;
                if (bufferedOutputStream2 != null) {
                    bufferedOutputStream2.close();
                }
                inputStream.close();
            } catch (Throwable th2) {
                th = th2;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                inputStream.close();
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            bufferedOutputStream = null;
            th = th3;
        }
        inputStream.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(File file, File file2) {
        Throwable th;
        IOException e;
        ZipFile zipFile;
        boolean hasMoreElements;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e665336", new Object[]{this, file, file2});
            return;
        }
        ZipFile zipFile2 = null;
        try {
            try {
                try {
                    zipFile = new ZipFile(file);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e2) {
                e = e2;
            }
            try {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (true) {
                    hasMoreElements = entries.hasMoreElements();
                    if (hasMoreElements == 0) {
                        break;
                    }
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    if (zipEntry.getName().endsWith(jcq.SO_EXTENSION) && !new File(file2, TextUtils.replace(zipEntry.getName(), new String[]{jcq.SO_EXTENSION}, new String[]{jcq.APK_EXTENSION}).toString()).exists()) {
                        a(zipFile.getInputStream(zipEntry), zipEntry.getName().substring(0, zipEntry.getName().length() - 3), file2);
                    }
                }
                zipFile.close();
                zipFile2 = hasMoreElements;
            } catch (IOException e3) {
                e = e3;
                zipFile2 = zipFile;
                e.printStackTrace();
                zipFile2.close();
                zipFile2 = zipFile2;
            } catch (Throwable th3) {
                th = th3;
                zipFile2 = zipFile;
                try {
                    zipFile2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                throw th;
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    public void execute(q49 q49Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("211c1f10", new Object[]{this, q49Var});
            return;
        }
        q49Var.stage = t49.ARG_EXTRAT;
        File file = new File(q49Var.downloadPath);
        File file2 = null;
        try {
            file2 = new v49(q49Var.context, String.valueOf(q49Var.featureUpdateData.featureUpdateVersion)).O();
            b(file, file2);
            file.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Iterator<FeatureUpdateData.FeatureInfo> it = q49Var.featureUpdateData.updateFeatures.iterator();
        while (it.hasNext()) {
            if (!new File(file2, it.next().featureName + jcq.APK_EXTENSION).exists()) {
                q49Var.success = false;
                q49Var.errorCode = -5;
                q49Var.errorMsg = Constants.getMsg(-5);
                return;
            }
        }
    }
}
