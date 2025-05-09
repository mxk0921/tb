package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.MRT;
import com.taobao.mrt.task.desc.MRTCodeDescription;
import com.taobao.mrt.task.desc.MRTResourceDescription;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import com.taobao.orange.OrangeConfig;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mqh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MRTResourceFileSystemError = 3;
    public static final int MRTResourceNoExistence = 2;
    public static final int MRTResourceRemoteUpdate = 1;
    public static final int MRTResourceUpdated = 0;

    /* renamed from: a  reason: collision with root package name */
    public static String f24232a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;
    public static boolean g = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Comparator<File> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(File file, File file2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f3a0238d", new Object[]{this, file, file2})).intValue();
            }
            return file.getName().compareTo(file2.getName());
        }
    }

    static {
        t2o.a(577765419);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("934be1f8", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equalsIgnoreCase(o(new File(str2)))) {
            return true;
        }
        return false;
    }

    public static boolean b(String str, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b163cd86", new Object[]{str, file})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return str.equalsIgnoreCase(yai.f(file));
        } catch (Exception e2) {
            kgh.t("MRTFileSystem", e2.getMessage(), e2);
            return false;
        }
    }

    public static boolean e(File file, File file2) throws IOException {
        FileChannel fileChannel;
        Throwable th;
        FileChannel fileChannel2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13188d4a", new Object[]{file, file2})).booleanValue();
        }
        if (!file2.getParentFile().exists() && !file2.getParentFile().mkdirs()) {
            return false;
        }
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException unused) {
                return false;
            }
        }
        FileChannel fileChannel3 = 0;
        try {
            FileChannel channel = new FileInputStream(file).getChannel();
            try {
                fileChannel3 = new FileOutputStream(file2).getChannel();
                fileChannel3.transferFrom(channel, 0L, channel.size());
                channel.close();
                fileChannel3.close();
                return true;
            } catch (Exception unused2) {
                fileChannel3 = channel;
                fileChannel = fileChannel3;
                if (fileChannel3 != null) {
                    fileChannel3.close();
                }
                if (fileChannel != null) {
                    fileChannel.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                fileChannel3 = channel;
                fileChannel2 = fileChannel3;
                if (fileChannel3 != null) {
                    fileChannel3.close();
                }
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
                throw th;
            }
        } catch (Exception unused3) {
            fileChannel = null;
        } catch (Throwable th3) {
            th = th3;
            fileChannel2 = null;
        }
    }

    public static boolean f(File file, File file2) {
        String[] list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a444c88", new Object[]{file, file2})).booleanValue();
        }
        if (!file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            if (!file2.exists()) {
                file2.mkdirs();
            }
            for (String str : file.list()) {
                f(new File(file, str), new File(file2, str));
            }
            return true;
        }
        try {
            return e(file, file2);
        } catch (IOException unused) {
            return false;
        }
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b69f2bd2", new Object[]{str});
            return;
        }
        File file = new File(str);
        if (file.exists() && !file.isDirectory()) {
            file.delete();
        }
        file.mkdirs();
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("254c4419", new Object[0]);
            return;
        }
        g(b);
        g(f24232a);
        g(e);
        g(f);
        g(c);
        g(d);
    }

    public static boolean i(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f65e294", new Object[]{file})).booleanValue();
        }
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            if (!file.isDirectory()) {
                return false;
            }
        } else if (!file.mkdirs()) {
            return false;
        }
        return true;
    }

    public static boolean j(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9cde359", new Object[]{file})).booleanValue();
        }
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!i(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean k(File file) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("807b73c9", new Object[]{file})).booleanValue();
        }
        if (file == null || !file.exists()) {
            return false;
        }
        if (!file.isDirectory()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            boolean z2 = true;
            for (File file2 : listFiles) {
                z2 &= k(file2);
            }
            z = z2;
        }
        return file.delete() & z;
    }

    public static int l(MRTResourceDescription mRTResourceDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2ce605f", new Object[]{mRTResourceDescription})).intValue();
        }
        return d(mRTResourceDescription.resourceName, mRTResourceDescription);
    }

    public static File m(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("de83a215", new Object[]{file, str});
        }
        File file2 = new File(file, str + ".wl");
        if (!file2.exists()) {
            file2 = null;
        }
        if (file2 != null) {
            return file2;
        }
        File file3 = new File(file, str + ".pyc");
        if (file3.exists()) {
            return file3;
        }
        return file2;
    }

    public static void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        File filesDir = MRT.g().getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append(filesDir.getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("MNNRTLib");
        f24232a = sb.toString();
        b = filesDir.getAbsolutePath() + str + "MNNRTModels";
        e = f24232a + str + "core";
        f = f24232a + str + "core" + str + "innerlib";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(filesDir.getAbsolutePath());
        sb2.append(str);
        sb2.append("MNNRTResources");
        c = sb2.toString();
        d = filesDir.getAbsolutePath() + str + "MNNConfig";
        h();
        try {
            g = Boolean.valueOf(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "mainFileLastModified", "true")).booleanValue();
        } catch (Throwable unused) {
        }
    }

    public static String o(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d4054c5", new Object[]{file});
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            StringBuilder sb = new StringBuilder(file.getName());
            if (listFiles != null) {
                List<File> asList = Arrays.asList(listFiles);
                Collections.sort(asList, new a());
                for (File file2 : asList) {
                    sb.append(o(file2));
                }
            }
            return yai.h(sb.toString());
        }
        return yai.h(file.getName() + yai.f(file));
    }

    public static JSONObject q(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("55acb4c1", new Object[]{file});
        }
        String p = p(file);
        if (p == null) {
            return null;
        }
        try {
            return new JSONObject(p);
        } catch (JSONException e2) {
            kgh.t("MRTFileSystem", "to json object failed", e2);
            return null;
        }
    }

    public static void r(JSONObject jSONObject, MRTResourceDescription mRTResourceDescription, File file) {
        File m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("428157f2", new Object[]{jSONObject, mRTResourceDescription, file});
        } else if ((mRTResourceDescription instanceof MRTCodeDescription) && (m = m(file, mRTResourceDescription.resourceName)) != null) {
            try {
                jSONObject.put("mainFileLastModified", m.lastModified());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void s(MRTResourceDescription mRTResourceDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c1fb400", new Object[]{mRTResourceDescription});
        } else if (mRTResourceDescription != null && !TextUtils.isEmpty(mRTResourceDescription.uniqueKey)) {
            File file = new File(mRTResourceDescription.resourceRootDirectory, mRTResourceDescription.resourceName);
            if (file.isDirectory() && file.exists()) {
                File file2 = new File(file, "__mrtlock__.json");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("mrtuk", mRTResourceDescription.uniqueKey);
                    jSONObject.put("lastUsedTime", System.currentTimeMillis());
                    if (g) {
                        r(jSONObject, mRTResourceDescription, file);
                    }
                    v(jSONObject, file2);
                } catch (JSONException e2) {
                    kgh.t("MRTFileSystem", "write file failed", e2);
                }
            }
        }
    }

    public static boolean t(File file, List<File> list, ZipFile zipFile, ZipEntry zipEntry, String str) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("637e4e71", new Object[]{file, list, zipFile, zipEntry, str})).booleanValue();
        }
        File file2 = new File(file + File.separator + str);
        list.add(file2);
        if (zipEntry.isDirectory()) {
            if (!i(file2)) {
                return false;
            }
        } else if (!j(file2)) {
            return false;
        } else {
            try {
                bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                } catch (Throwable th2) {
                    bufferedOutputStream = null;
                    th = th2;
                }
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                    mwv.b(bufferedInputStream, bufferedOutputStream);
                } catch (Throwable th3) {
                    th = th3;
                    mwv.b(bufferedInputStream, bufferedOutputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                bufferedOutputStream = null;
                th = th4;
                bufferedInputStream = null;
            }
        }
        return true;
    }

    public static boolean u(File file, File file2) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f77763d", new Object[]{file, file2})).booleanValue();
        }
        if (file == null || file2 == null || !file.exists()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(file);
                try {
                    Enumeration<? extends ZipEntry> entries = zipFile2.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                        String name = zipEntry.getName();
                        if (name != null) {
                            if (name.contains("..")) {
                                kgh.s("MRTFileSystem", "entryName contains dangerous character");
                            } else if (!t(file2, arrayList, zipFile2, zipEntry, name)) {
                                try {
                                    mwv.b(zipFile2);
                                } catch (Exception unused) {
                                }
                                return false;
                            }
                        }
                    }
                    mwv.b(zipFile2);
                } catch (Throwable th2) {
                    th = th2;
                    zipFile = zipFile2;
                    try {
                        kgh.d("MRTFileSystem", th.getMessage(), th);
                        mwv.b(zipFile);
                        return true;
                    } catch (Throwable th3) {
                        try {
                            mwv.b(zipFile);
                        } catch (Exception unused2) {
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception unused3) {
        }
        return true;
    }

    public static boolean v(JSONObject jSONObject, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1a1b834", new Object[]{jSONObject, file})).booleanValue();
        }
        return x(jSONObject.toString(), file);
    }

    public static void w(File file, String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1cbfe3", new Object[]{file, strArr, str});
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            PrintWriter printWriter = null;
            try {
                try {
                    if (str != null) {
                        printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file), str));
                    } else {
                        printWriter = new PrintWriter(new FileWriter(file));
                    }
                    for (String str2 : strArr) {
                        printWriter.println(str2);
                    }
                    mwv.b(printWriter);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    mwv.b(printWriter);
                }
            } catch (Throwable th) {
                mwv.b(printWriter);
                throw th;
            }
        }
    }

    public static boolean x(String str, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a31cab94", new Object[]{str, file})).booleanValue();
        }
        w(file, new String[]{str}, "utf-8");
        return true;
    }

    public static boolean c(MRTResourceDescription mRTResourceDescription, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11ccc05c", new Object[]{mRTResourceDescription, jSONObject})).booleanValue();
        }
        if (mRTResourceDescription == null) {
            return false;
        }
        if (!(mRTResourceDescription instanceof MRTCodeDescription)) {
            return true;
        }
        File file = new File(mRTResourceDescription.resourceRootDirectory, mRTResourceDescription.resourceName);
        String str = mRTResourceDescription.resourceName;
        MRTTaskDescription mRTTaskDescription = mRTResourceDescription.associatedTask;
        String str2 = mRTTaskDescription != null ? mRTTaskDescription.cid : null;
        if (str2 != null && str.endsWith("_".concat(str2))) {
            str = str.substring(0, str.lastIndexOf("_".concat(str2)));
        }
        File m = m(file, str);
        if (m == null || !m.exists() || jSONObject == null) {
            return false;
        }
        if (!jSONObject.has("mainFileLastModified")) {
            try {
                jSONObject.put("mainFileLastModified", m.lastModified());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject.optLong("mainFileLastModified") == m.lastModified();
    }

    public static String p(File file) {
        Throwable th;
        Exception e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("856bcd30", new Object[]{file});
        }
        BufferedReader bufferedReader = null;
        if (file == null || !file.exists()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                            sb.append("\n");
                        } catch (Exception e3) {
                            e2 = e3;
                            bufferedReader = bufferedReader2;
                            kgh.t("MRTFileSystem", "read file failed", e2);
                            mwv.b(bufferedReader);
                            return sb.toString();
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            try {
                                mwv.b(bufferedReader);
                            } catch (Throwable unused) {
                            }
                            throw th;
                        }
                    }
                    mwv.b(bufferedReader2);
                } catch (Exception e4) {
                    e2 = e4;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable unused2) {
        }
        return sb.toString();
    }

    public static int d(String str, MRTResourceDescription mRTResourceDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb417358", new Object[]{str, mRTResourceDescription})).intValue();
        }
        if (mRTResourceDescription == null || TextUtils.isEmpty(mRTResourceDescription.uniqueKey)) {
            return 2;
        }
        if (TextUtils.isEmpty(mRTResourceDescription.resourceRootDirectory)) {
            return 3;
        }
        File file = new File(mRTResourceDescription.resourceRootDirectory, str);
        if (file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "__mrtlock__.json");
        JSONObject q = q(file2);
        if (q == null) {
            return 2;
        }
        String optString = q.optString("mrtuk");
        if (TextUtils.isEmpty(optString)) {
            return 2;
        }
        if (!optString.equalsIgnoreCase(mRTResourceDescription.uniqueKey)) {
            return 1;
        }
        if (g && !c(mRTResourceDescription, q)) {
            return 1;
        }
        try {
            q.put("lastUsedTime", System.currentTimeMillis());
            v(q, file2);
        } catch (Exception e2) {
            kgh.t("MRTFileSystem", "write json to file filed", e2);
        }
        return 0;
    }
}
