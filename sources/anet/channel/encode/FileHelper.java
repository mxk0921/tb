package anet.channel.encode;

import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.LaunchLoadZstdObject;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Comparator;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FileHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_CONFIG = "zstd_config";
    public static final String DEFAULT_CONFIG_PATH = "awcn_zstd_config_dir/";
    public static final String DEFAULT_PATH = "awcn_zstd_dict_dir/";
    public static final String DEFAULT_TEMPORARY_PATH = "awcn_zstd_dict_temporary_dir/";
    private static final String TAG = "awcn.FileHelper";
    public static final String ZSTD_TAG = "[zstd-d]";
    private static File defaultFilePath = null;
    private static File defaultConfigFilePath = null;
    private static Comparator<File> comparator = new Comparator<File>() { // from class: anet.channel.encode.FileHelper.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public int compare(File file, File file2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a0238d", new Object[]{this, file, file2})).intValue() : (int) (file2.lastModified() - file.lastModified());
        }
    };

    static {
        t2o.a(607125616);
    }

    public static void deleteDirectory(File file, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92541754", new Object[]{file, str, str2});
        } else if (file == null || !file.exists()) {
            ALog.e(TAG, str2 + " deleteDirectory dir null or not exist.", str, new Object[0]);
        } else {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    ALog.e(TAG, str2 + " deleteDirectory file null", str, new Object[0]);
                    return;
                }
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        deleteDirectory(file2, str, str2);
                    } else {
                        file2.delete();
                    }
                }
                file.delete();
                ALog.e(TAG, str2 + " deleteDirectory success dir=" + file.getName(), str, new Object[0]);
            } catch (Exception e) {
                ALog.e(TAG, str2 + " deleteDirectory fail e=" + e.toString(), str, new Object[0]);
            }
        }
    }

    public static synchronized File getDefaultFilePath(String str, String str2, String str3) {
        synchronized (FileHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("1584219c", new Object[]{str, str2, str3});
            }
            try {
                Context context = GlobalAppRuntimeInfo.getContext();
                if (context != null) {
                    File file = new File(context.getFilesDir().getPath() + "/" + str2);
                    if (!file.exists() && file.mkdirs()) {
                        ALog.e(TAG, str3 + " getDefaultFilePath fileDir not exist! create dir", str, new Object[0]);
                    }
                    return file;
                }
            } catch (Exception e) {
                ALog.e(TAG, str3 + " getDefaultFilePath fail! error=" + e.toString(), str, new Object[0]);
            }
            return null;
        }
    }

    public static synchronized File getFile(String str, String str2, String str3, String str4) {
        synchronized (FileHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("1a6e5a0c", new Object[]{str, str2, str3, str4});
            }
            try {
                File defaultFilePath2 = getDefaultFilePath(str, str2, str4);
                if (defaultFilePath2 != null && defaultFilePath2.exists()) {
                    String str5 = (defaultFilePath2.getAbsolutePath() + "/") + str3;
                    File file = new File(str5);
                    if (file.exists()) {
                        ALog.e(TAG, str4 + " getFile file exist! filePath =" + str5, str, new Object[0]);
                    } else if (file.createNewFile()) {
                        ALog.e(TAG, str4 + " getFile file not exist! create file success, filePath =" + str5, str, new Object[0]);
                    }
                    return file;
                }
            } catch (Exception e) {
                ALog.e(TAG, str4 + "  getFile fail! error=" + e.toString(), str, new Object[0]);
            }
            return null;
        }
    }

    public static FileOutputStream getFileOutputStream(String str, File file, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileOutputStream) ipChange.ipc$dispatch("f94107", new Object[]{str, file, str2});
        }
        if (file == null && !file.exists() && file.length() == 0) {
            ALog.e(TAG, str2 + " getFileOutputStream file null or not exist or len = 0!", str, new Object[0]);
            return null;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ALog.e(TAG, str2 + " getFileOutputStream success", str, new Object[0]);
            return fileOutputStream;
        } catch (Exception e) {
            ALog.e(TAG, str2 + " getFileOutputStream fail! error=" + e.toString(), str, new Object[0]);
            return null;
        }
    }

    public static synchronized File[] getSortedFiles() {
        synchronized (FileHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File[]) ipChange.ipc$dispatch("ac5bb387", new Object[0]);
            }
            File file = defaultFilePath;
            if (file == null) {
                return null;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                Arrays.sort(listFiles, comparator);
            }
            return listFiles;
        }
    }

    public static synchronized <T> T loadFile(String str, File file, String str2) {
        synchronized (FileHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("ca80519e", new Object[]{str, file, str2});
            }
            return (T) loadFile(null, str, file, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [byte[]] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] readFileToByteArray(anet.channel.statist.LaunchLoadZstdObject r10, java.lang.String r11, java.io.File r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.encode.FileHelper.readFileToByteArray(anet.channel.statist.LaunchLoadZstdObject, java.lang.String, java.io.File, java.lang.String):byte[]");
    }

    private static synchronized boolean renameToFile(String str, File file, File file2, String str2, String str3) {
        synchronized (FileHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("30bb810c", new Object[]{str, file, file2, str2, str3})).booleanValue();
            } else if (file == null || file2 == null) {
                return false;
            } else {
                try {
                } catch (Exception e) {
                    ALog.e(TAG, str2 + " renameToFile fail! sourceFile=" + file.getName() + " error=" + e.toString(), str, new Object[0]);
                }
                if (file.renameTo(file2)) {
                    return true;
                }
                if (str3 != null && !str3.isEmpty()) {
                    ALog.e(TAG, str2 + " renameToFile fail! sourceFile=" + file.getName() + " ,newFile=" + file2.getName(), str, new Object[0]);
                    deleteDirectory(getDefaultFilePath(str, str3, str2), str, str2);
                    return false;
                }
                ALog.e(TAG, str2 + " renameToFile fail! tmpPath null, sourceFile=" + file.getName() + " ,newFile=" + file2.getName(), str, new Object[0]);
                return false;
            }
        }
    }

    public static synchronized boolean storageFileByFileName(String str, File file, String str2, String str3) {
        synchronized (FileHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3e2bc7f5", new Object[]{str, file, str2, str3})).booleanValue();
            }
            if (file != null) {
                try {
                } catch (Exception e) {
                    ALog.e(TAG, "[zstd-d] storageFileByFileName fail! sourceFile=" + file.getName() + " error=" + e.toString(), str, new Object[0]);
                }
                if (file.exists() && file.length() != 0) {
                    if (defaultFilePath == null) {
                        defaultFilePath = getDefaultFilePath(str, DEFAULT_PATH, ZSTD_TAG);
                    }
                    renameToFile(str, file, new File(defaultFilePath, str2), ZSTD_TAG, DEFAULT_TEMPORARY_PATH);
                    updateConfigFile(str);
                    return false;
                }
            }
            ALog.e(TAG, "[zstd-d] storageFileByFileName sourceFile null or not exist or len=0", str, new Object[0]);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0 A[Catch: all -> 0x0025, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0006, B:6:0x000c, B:11:0x002a, B:22:0x0095, B:32:0x00e8, B:36:0x00f0, B:40:0x00fa, B:41:0x00fe, B:15:0x0045, B:17:0x006f, B:20:0x0076, B:25:0x00a0, B:30:0x00bc), top: B:49:0x0006, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void updateFile(java.io.Serializable r9, java.io.File r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.encode.FileHelper.updateFile(java.io.Serializable, java.io.File, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static synchronized <T> T loadFile(LaunchLoadZstdObject launchLoadZstdObject, String str, File file, String str2) {
        Throwable th;
        FileInputStream fileInputStream;
        synchronized (FileHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("ab114ec8", new Object[]{launchLoadZstdObject, str, file, str2});
            }
            FileInputStream fileInputStream2 = null;
            T t = null;
            if (!(file == null || !file.exists() || file.length() == 0)) {
                ALog.e(TAG, str2 + " loadFile start file=" + file.getName(), str, new Object[0]);
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (Throwable th2) {
                    th = th2;
                    t = null;
                }
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                    t = (T) objectInputStream.readObject();
                    objectInputStream.close();
                    if (launchLoadZstdObject != null) {
                        launchLoadZstdObject.flag = 1;
                    }
                    ALog.e(TAG, str2 + " loadFile end ", str, "size", Long.valueOf(file.length()));
                    try {
                        fileInputStream.close();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream2 = fileInputStream;
                    if (launchLoadZstdObject != null) {
                        launchLoadZstdObject.flag = 0;
                    }
                    ALog.e(TAG, str2 + " loadFile fail. e=" + th.toString(), str, new Object[0]);
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return t;
                }
                return t;
            }
            ALog.e(TAG, str2 + " loadFile file not exist or file len=0.", str, new Object[0]);
            if (launchLoadZstdObject != null) {
                launchLoadZstdObject.flag = -1;
            }
            return null;
        }
    }

    public static void updateConfigFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec434d8", new Object[]{str});
            return;
        }
        if (defaultConfigFilePath == null) {
            defaultConfigFilePath = getDefaultFilePath(str, DEFAULT_CONFIG_PATH, ZSTD_TAG);
        }
        updateFile(ZstdDictHelper.zstdAttributesMap, new File(defaultConfigFilePath, DEFAULT_CONFIG), DEFAULT_CONFIG, str, DEFAULT_TEMPORARY_PATH, ZSTD_TAG);
        ALog.e(TAG, "[zstd-d] updateConfigFile success!", str, new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0201 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x000e, B:6:0x0014, B:10:0x0033, B:12:0x0037, B:13:0x0041, B:15:0x0047, B:19:0x0054, B:21:0x0057, B:22:0x0067, B:24:0x006d, B:25:0x0077, B:26:0x007e, B:27:0x0088, B:28:0x00a7, B:30:0x00b5, B:32:0x00b8, B:34:0x00c0, B:36:0x00e3, B:38:0x00ed, B:40:0x00f3, B:42:0x00f7, B:44:0x00ff, B:46:0x0105, B:48:0x0146, B:55:0x015a, B:57:0x0162, B:58:0x016b, B:59:0x0189, B:61:0x0191, B:62:0x0195, B:64:0x019b, B:67:0x01c4, B:69:0x01cc, B:70:0x01d5, B:73:0x01f7, B:76:0x0201), top: B:81:0x000e, inners: #1, #2, #3 }] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean removeFile(java.lang.String r20, java.lang.String r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.encode.FileHelper.removeFile(java.lang.String, java.lang.String, boolean):boolean");
    }
}
