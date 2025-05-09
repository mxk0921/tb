package tb;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.statistics.ErrorCode;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.vsu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q74 implements e5s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_CODE = "common_file_upload";

    static {
        t2o.a(767557727);
        t2o.a(767557728);
    }

    public static List<File> c(Context context, String str) {
        File file;
        String[] split;
        File file2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("12f8a51", new Object[]{context, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File parentFile = context.getFilesDir().getParentFile();
        if ("mounted".equals(Environment.getExternalStorageState())) {
            file = context.getExternalCacheDir().getParentFile();
        } else {
            file = null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(",")) {
            int i = 10;
            if (str2.toLowerCase().startsWith("$internal/")) {
                file2 = parentFile;
            } else if (str2.startsWith("$external/") && file != null) {
                file2 = file;
            } else if (str2.startsWith("$data_app/")) {
                file2 = new File(context.getPackageCodePath()).getParentFile();
            } else if (str2.startsWith("$system/")) {
                file2 = Environment.getRootDirectory();
                i = 8;
            } else {
                continue;
            }
            if (file2 == null) {
                return null;
            }
            File file3 = new File(file2, str2.substring(i));
            String name = file3.getName();
            if (name.endsWith("$")) {
                List<File> l = n6s.l(file3.getParentFile(), name.substring(0, name.length() - 1));
                if (l != null) {
                    arrayList.addAll(l);
                }
            } else if (file3.exists() && file3.length() > 0) {
                arrayList.add(file3);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void d(Context context, i6s i6sVar, f5s f5sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc305eea", new Object[]{context, i6sVar, f5sVar});
            return;
        }
        try {
            b(context, i6sVar, f5sVar);
        } catch (Exception unused) {
            ((vsu.a) f5sVar).b(null);
        }
    }

    public static void e(h6s h6sVar, f5s f5sVar, ErrorCode errorCode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be3ed5aa", new Object[]{h6sVar, f5sVar, errorCode, str});
            return;
        }
        h6sVar.d = errorCode.getValue();
        h6sVar.e = str;
        ((vsu.a) f5sVar).b(h6sVar);
    }

    @Override // tb.e5s
    public void executeUploadTask(final Context context, final i6s i6sVar, final f5s f5sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5595bbb", new Object[]{this, context, i6sVar, f5sVar});
        } else {
            e6s.d().c(new Runnable() { // from class: tb.p74
                @Override // java.lang.Runnable
                public final void run() {
                    q74.d(context, i6sVar, f5sVar);
                }
            });
        }
    }

    @Override // tb.e5s
    public String getBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        return BIZ_CODE;
    }

    @Override // tb.e5s
    public void onUploadDone(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca026d15", new Object[]{this, new Boolean(z), str});
        }
    }

    public static void b(Context context, i6s i6sVar, f5s f5sVar) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46286135", new Object[]{context, i6sVar, f5sVar});
            return;
        }
        h6s h6sVar = new h6s();
        h6sVar.b = BIZ_CODE;
        if (i6sVar == null || (map = i6sVar.f21130a) == null) {
            e(h6sVar, f5sVar, ErrorCode.DATA_EMPTY, "uploadMsg is null");
            return;
        }
        h6sVar.c = map;
        try {
            List<File> c = c(context, (String) ((HashMap) map).get("path"));
            if (c == null || c.isEmpty()) {
                e(h6sVar, f5sVar, ErrorCode.UPLOAD_NO_FILE, "can't find files!");
                return;
            }
            h6sVar.f20447a = new ArrayList();
            File file = new File(context.getCacheDir(), "udf");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, System.currentTimeMillis() + "_udf.zip");
            if (!n6s.n(c, file2) || !file2.exists()) {
                e(h6sVar, f5sVar, ErrorCode.FILE_ZIP_ERROR, "failed to zip files");
            } else if (file2.length() > 99614720) {
                file2.delete();
                e(h6sVar, f5sVar, ErrorCode.UDF_FILE_LARGE, "file is large than 95M");
            } else {
                ((ArrayList) h6sVar.f20447a).add(file2.getAbsolutePath());
                h6sVar.f = true;
                ((vsu.a) f5sVar).b(h6sVar);
            }
        } catch (Exception e) {
            e(h6sVar, f5sVar, ErrorCode.CODE_EXC, e.getMessage());
        }
    }
}
