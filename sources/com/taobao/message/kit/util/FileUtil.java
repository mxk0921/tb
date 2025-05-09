package com.taobao.message.kit.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FileUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FileUtil";
    private static ILocalZipReader sLocalZipReader;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface ILocalZipReader {
        String loadZipFromAsset(Context context, String str);
    }

    static {
        t2o.a(529531002);
    }

    public static String checkEntryName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a33a29a", new Object[]{str});
        }
        int lastIndexOf = str.lastIndexOf("../");
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    private static void clearFileSync(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6d0b35", new Object[]{str});
        } else {
            ApplicationUtil.getApplication().getSharedPreferences(str, 0).edit().clear().commit();
        }
    }

    public static void copyFileFast(File file, File file2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1cb3942", new Object[]{file, file2});
            return;
        }
        File file3 = new File(file2.getParent());
        if (!file3.exists()) {
            file3.mkdirs();
        }
        FileChannel channel = new FileInputStream(file).getChannel();
        FileChannel channel2 = new FileOutputStream(file2).getChannel();
        try {
            try {
                channel.transferTo(0L, channel.size(), channel2);
                channel.close();
                if (channel2 != null) {
                    channel2.close();
                }
            } catch (IOException e) {
                throw e;
            }
        } catch (Throwable th) {
            if (channel != null) {
                channel.close();
            }
            if (channel2 != null) {
                channel2.close();
            }
            throw th;
        }
    }

    public static File createSDFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("2a4ae613", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            file.createNewFile();
            return file;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static long deleteFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea11bd0c", new Object[]{str})).longValue();
        }
        try {
            return removeDir(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0L;
        }
    }

    public static String getDiskCacheDir(Context context, String str) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2c35c33", new Object[]{context, str});
        }
        if (context == null) {
            return null;
        }
        if (("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) && context.getExternalCacheDir() != null) {
            file = context.getExternalCacheDir();
        } else {
            file = context.getCacheDir();
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2.getAbsolutePath();
    }

    public static String getDiskFileDir(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3f43b33", new Object[]{context, str});
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        if ((!"mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable()) || externalFilesDir == null) {
            externalFilesDir = context.getFilesDir();
        }
        File file = new File(externalFilesDir, str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static float getFreeMSpace(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76e3db09", new Object[]{file})).floatValue();
        }
        if (file != null) {
            return (((float) file.getFreeSpace()) / 1024.0f) / 1024.0f;
        }
        return 0.0f;
    }

    public static String getImageType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d81894d0", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            if (!new File(str).exists()) {
                return null;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            String str2 = options.outMimeType;
            TLog.loge("image mime type -> ", str2);
            if (str2 == null) {
                return null;
            }
            String[] split = str2.split("/");
            if (split.length == 2) {
                return split[1].toLowerCase();
            }
            return null;
        } catch (Throwable th) {
            TLog.loge("FileUtil", Log.getStackTraceString(th));
            return null;
        }
    }

    public static String getSaveDirPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c80b7a", new Object[0]);
        }
        if (Build.VERSION.SDK_INT < 29) {
            File file = new File(Environment.getExternalStorageDirectory(), "ALIMP");
            if (!file.exists()) {
                file.mkdir();
            }
            if (file.canRead()) {
                return file.getAbsolutePath();
            }
        }
        return getDiskCacheDir(ApplicationUtil.getApplication(), "ALIMP");
    }

    public static String loadZipFromAsset(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e7b12a0", new Object[]{context, str});
        }
        TLog.loge("FileUtil", "loadZipFromAsset Path: " + str);
        ILocalZipReader iLocalZipReader = sLocalZipReader;
        if (iLocalZipReader != null) {
            return iLocalZipReader.loadZipFromAsset(context, str);
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            if (Looper.myLooper() != Looper.getMainLooper() || !ApplicationUtil.isDebug()) {
                try {
                    ZipInputStream zipInputStream = new ZipInputStream(AssetsDelegate.proxy_open(context.getAssets(), str));
                    StringBuilder sb = new StringBuilder();
                    for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                        StringBuilder sb2 = new StringBuilder();
                        byte[] bArr = new byte[zipInputStream.available()];
                        while (zipInputStream.read(bArr) > 0) {
                            sb2.append(new String(bArr).trim());
                        }
                        sb.append(sb2.toString());
                    }
                    zipInputStream.close();
                    return sb.toString();
                } catch (IOException e) {
                    TLog.loge("FileUtil", Log.getStackTraceString(e));
                }
            } else {
                throw new IllegalStateException("loadZipFromAsset is time consuming, cannot running in mainThread!");
            }
        }
        return null;
    }

    public static String loadZipFromAssetWithVersionCache(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a7af5a6", new Object[]{context, str, str2});
        }
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        if (Looper.myLooper() != Looper.getMainLooper() || !ApplicationUtil.isDebug()) {
            String msgFeatureVersion = BundleSplitUtil.INSTANCE.getMsgFeatureVersion();
            if (TextUtils.isEmpty(msgFeatureVersion)) {
                msgFeatureVersion = ApplicationBuildInfo.getAppVersionName();
            }
            String stringSharedPreference = SharedPreferencesUtil.getStringSharedPreference(str2, msgFeatureVersion, "");
            if (TextUtils.isEmpty(stringSharedPreference)) {
                String loadZipFromAsset = loadZipFromAsset(context, str);
                if (!TextUtils.isEmpty(loadZipFromAsset)) {
                    clearFileSync(str2);
                    SharedPreferencesUtil.addStringSharedPreference(str2, msgFeatureVersion, loadZipFromAsset);
                    return loadZipFromAsset;
                }
            }
            return stringSharedPreference;
        }
        throw new IllegalStateException("loadZipFromAsset is time consuming, cannot running in mainThread!");
    }

    public static boolean mkDirsIfNotExists(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38fee5a3", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return true;
        }
        return false;
    }

    public static Bitmap readBitmap(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("b4f8ec14", new Object[]{str}) : readBitmap(str, null);
    }

    public static byte[] readFile(String str) {
        FileInputStream fileInputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f08cf7fa", new Object[]{str});
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return bArr;
            } catch (Exception unused) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static long removeDir(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15f46b2e", new Object[]{str})).longValue();
        }
        return removeFile(new File(str));
    }

    private static long removeFile(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cfa94dd2", new Object[]{file})).longValue();
        }
        long j = 0;
        if (file == null) {
            return 0L;
        }
        if (file.isFile()) {
            long length = file.length();
            file.delete();
            return length;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            file.delete();
            return 0L;
        }
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].isDirectory()) {
                j += removeFile(listFiles[i]);
            } else {
                j += listFiles[i].length();
                listFiles[i].delete();
            }
        }
        file.delete();
        return j;
    }

    public static boolean saveFile(InputStream inputStream, String str) {
        Throwable th;
        IOException e;
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a76ed01", new Object[]{inputStream, str})).booleanValue();
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                file = new File(str);
                new File(file.getParent()).mkdirs();
                file.createNewFile();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
        if (inputStream != null) {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, read);
                }
                fileOutputStream2.flush();
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    Log.e("WxException", e3.getMessage(), e3);
                }
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    Log.e("WxException", e4.getMessage(), e4);
                }
                return true;
            } catch (IOException e5) {
                e = e5;
                fileOutputStream = fileOutputStream2;
                Log.e("WxException", e.getMessage(), e);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e6) {
                        Log.e("WxException", e6.getMessage(), e6);
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e7) {
                        Log.e("WxException", e7.getMessage(), e7);
                    }
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e8) {
                        Log.e("WxException", e8.getMessage(), e8);
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e9) {
                        Log.e("WxException", e9.getMessage(), e9);
                    }
                }
                throw th;
            }
        } else {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    Log.e("WxException", e10.getMessage(), e10);
                }
            }
            return false;
        }
    }

    public static void setLocalZipReader(ILocalZipReader iLocalZipReader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2822e6fc", new Object[]{iLocalZipReader});
        } else {
            sLocalZipReader = iLocalZipReader;
        }
    }

    public static boolean unzip(ZipFile zipFile, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80475771", new Object[]{zipFile, str})).booleanValue();
        }
        if (zipFile != null && zipFile.size() != 0 && !TextUtils.isEmpty(str) && mkDirsIfNotExists(str)) {
            try {
                try {
                    try {
                        Enumeration<? extends ZipEntry> entries = zipFile.entries();
                        if (entries == null) {
                            try {
                                zipFile.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            return false;
                        }
                        while (entries.hasMoreElements()) {
                            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                            if (zipEntry != null) {
                                if (zipEntry.isDirectory()) {
                                    if (!mkDirsIfNotExists(str + File.separator + checkEntryName(zipEntry.getName()))) {
                                        try {
                                            zipFile.close();
                                        } catch (IOException e2) {
                                            e2.printStackTrace();
                                        }
                                        return false;
                                    }
                                } else {
                                    String str2 = str + File.separator + checkEntryName(zipEntry.getName());
                                    InputStream inputStream = zipFile.getInputStream(zipEntry);
                                    boolean saveFile = saveFile(inputStream, str2);
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Exception unused) {
                                        }
                                    }
                                    if (!saveFile) {
                                        try {
                                            zipFile.close();
                                        } catch (IOException e3) {
                                            e3.printStackTrace();
                                        }
                                        return false;
                                    }
                                }
                            }
                        }
                        try {
                            zipFile.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                        return true;
                    } catch (Throwable th) {
                        try {
                            zipFile.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                        throw th;
                    }
                } catch (Exception unused2) {
                    zipFile.close();
                }
            } catch (IOException e6) {
                e6.printStackTrace();
            }
        }
        return false;
    }

    public static void writeBitmap(String str, Bitmap bitmap, int i) {
        Exception e;
        Throwable th;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("717a93d4", new Object[]{str, bitmap, new Integer(i)});
        } else if (bitmap != null && str != null) {
            boolean endsWith = str.endsWith(".png");
            File file = new File(str);
            if (file.exists()) {
                file = new File(str.concat(".tmp"));
                file.delete();
                z = false;
            }
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            if (endsWith) {
                                bitmap.compress(Bitmap.CompressFormat.PNG, i, fileOutputStream2);
                            } else {
                                bitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream2);
                            }
                            fileOutputStream2.close();
                            if (!z) {
                                file.renameTo(new File(str));
                            }
                        } catch (Exception e2) {
                            e = e2;
                            fileOutputStream = fileOutputStream2;
                            e.printStackTrace();
                            if (fileOutputStream == null) {
                                return;
                            }
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            th.printStackTrace();
                            if (fileOutputStream == null) {
                                return;
                            }
                            fileOutputStream.close();
                        }
                    } catch (Throwable th3) {
                        if (0 != 0) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th3;
                    }
                } catch (Exception e3) {
                    e = e3;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (IOException unused2) {
            }
        }
    }

    public static boolean writeFile(String str, byte[] bArr) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a348817", new Object[]{str, bArr})).booleanValue();
        }
        File createSDFile = createSDFile(str);
        FileOutputStream fileOutputStream = null;
        if (createSDFile != null) {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(createSDFile);
                try {
                    fileOutputStream2.write(bArr);
                    fileOutputStream2.flush();
                    fileOutputStream = fileOutputStream2;
                } catch (Exception unused) {
                    fileOutputStream = fileOutputStream2;
                    try {
                        fileOutputStream.close();
                    } catch (Exception unused2) {
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    try {
                        fileOutputStream.close();
                        throw th;
                    } catch (Exception unused3) {
                        return false;
                    }
                }
            } catch (Exception unused4) {
            } catch (Throwable th3) {
                th = th3;
            }
        }
        try {
            fileOutputStream.close();
            return true;
        } catch (Exception unused5) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String copyFile(java.lang.String r6, android.net.Uri r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.kit.util.FileUtil.copyFile(java.lang.String, android.net.Uri, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static Bitmap readBitmap(String str, BitmapFactory.Options options) {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e006372", new Object[]{str, options});
        }
        Bitmap bitmap = null;
        if (str == null) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            fileInputStream = null;
        }
        if (fileInputStream != null) {
            try {
                bitmap = BitmapFactory.decodeStream(fileInputStream, null, options);
            } catch (OutOfMemoryError e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (IOException unused) {
            }
        }
        return bitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0081 -> B:81:0x00b4). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String readTextFile(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.kit.util.FileUtil.readTextFile(java.lang.String):java.lang.String");
    }
}
