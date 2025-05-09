package com.ta.audid.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FileUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FileUtils";

    static {
        t2o.a(966787087);
    }

    public static boolean checkFileExistOnly(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9617da54", new Object[]{str})).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return new File(str).exists();
            }
            return false;
        } catch (Exception e) {
            UtdidLogger.se("FileUtils", e, new Object[0]);
            return false;
        }
    }

    private static boolean deleteDirectory(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb99617", new Object[]{str})).booleanValue();
        }
        String str2 = File.separator;
        if (!str.endsWith(str2)) {
            str = str + str2;
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        boolean z = true;
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].isFile()) {
                z = deleteFile(listFiles[i].getAbsolutePath());
                if (!z) {
                    break;
                }
            } else {
                if (listFiles[i].isDirectory() && !(z = deleteDirectory(listFiles[i].getAbsolutePath()))) {
                    break;
                }
            }
        }
        if (!z) {
            return false;
        }
        return file.delete();
    }

    public static String readFile(String str) {
        Throwable th;
        Exception e;
        InputStreamReader inputStreamReader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa3711bd", new Object[]{str});
        }
        InputStreamReader inputStreamReader2 = null;
        try {
            try {
                inputStreamReader = new InputStreamReader(new FileInputStream(str));
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            char[] cArr = new char[100];
            StringBuilder sb = new StringBuilder("");
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    break;
                }
                sb.append(cArr, 0, read);
            }
            String sb2 = sb.toString();
            try {
                inputStreamReader.close();
            } catch (Exception e3) {
                UtdidLogger.se("FileUtils", e3, new Object[0]);
            }
            return sb2;
        } catch (Exception e4) {
            e = e4;
            inputStreamReader2 = inputStreamReader;
            UtdidLogger.se("FileUtils", e, new Object[0]);
            if (inputStreamReader2 != null) {
                try {
                    inputStreamReader2.close();
                } catch (Exception e5) {
                    UtdidLogger.se("FileUtils", e5, new Object[0]);
                }
            }
            return "";
        } catch (Throwable th3) {
            th = th3;
            inputStreamReader2 = inputStreamReader;
            if (inputStreamReader2 != null) {
                try {
                    inputStreamReader2.close();
                } catch (Exception e6) {
                    UtdidLogger.se("FileUtils", e6, new Object[0]);
                }
            }
            throw th;
        }
    }

    public static boolean saveFile(String str, String str2) {
        Throwable th;
        FileWriter fileWriter;
        Exception e;
        BufferedWriter bufferedWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76bd19b8", new Object[]{str, str2})).booleanValue();
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            fileWriter = new FileWriter(new File(str));
            try {
                try {
                    bufferedWriter = new BufferedWriter(fileWriter);
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
            fileWriter = null;
        } catch (Throwable th3) {
            th = th3;
            fileWriter = null;
        }
        try {
            bufferedWriter.write(str2);
            bufferedWriter.flush();
            try {
                bufferedWriter.close();
            } catch (Exception e4) {
                UtdidLogger.se("FileUtils", e4, new Object[0]);
            }
            try {
                fileWriter.close();
            } catch (Exception e5) {
                UtdidLogger.se("FileUtils", e5, new Object[0]);
            }
            return true;
        } catch (Exception e6) {
            e = e6;
            bufferedWriter2 = bufferedWriter;
            UtdidLogger.se("FileUtils", e, new Object[0]);
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (Exception e7) {
                    UtdidLogger.se("FileUtils", e7, new Object[0]);
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (Exception e8) {
                    UtdidLogger.se("FileUtils", e8, new Object[0]);
                }
            }
            return false;
        } catch (Throwable th4) {
            th = th4;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (Exception e9) {
                    UtdidLogger.se("FileUtils", e9, new Object[0]);
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (Exception e10) {
                    UtdidLogger.se("FileUtils", e10, new Object[0]);
                }
            }
            throw th;
        }
    }

    public static boolean delete(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea815e00", new Object[]{str})).booleanValue();
        }
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        if (file.isFile()) {
            return deleteFile(str);
        }
        return deleteDirectory(str);
    }

    private static boolean deleteFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea11bd1c", new Object[]{str})).booleanValue();
        }
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return false;
        }
        return file.delete();
    }

    public static void isDirExist(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfa3a945", new Object[]{str});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (!file.exists()) {
                    UtdidLogger.sd("FileUtils", "mkdirs path", str, "created", Boolean.valueOf(file.mkdirs()));
                } else {
                    UtdidLogger.sd("FileUtils", "path exists", str);
                }
            }
        } catch (Exception e) {
            UtdidLogger.se("FileUtils", e, new Object[0]);
        }
    }
}
