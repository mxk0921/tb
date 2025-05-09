package com.meizu.cloud.pushsdk.notification.g;

import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import tb.cg9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {

    /* compiled from: Taobao */
    /* renamed from: com.meizu.cloud.pushsdk.notification.g.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class C0293a implements FileFilter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5908a;

        public C0293a(String str) {
            this.f5908a = str;
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            try {
                if (Long.valueOf(this.f5908a).longValue() > Long.valueOf(file.getName().split("-")[1]).longValue()) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                DebugLogger.e(cg9.TAG, "filters file error " + e.getMessage());
                return true;
            }
        }
    }

    public static void a(String str, String str2) {
        String[] list;
        try {
            new File(str2).mkdirs();
            for (String str3 : new File(str).list()) {
                String str4 = File.separator;
                File file = str.endsWith(str4) ? new File(str + str3) : new File(str + str4 + str3);
                if (file.isFile()) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    FileOutputStream fileOutputStream = new FileOutputStream(str2 + "/" + file.getName());
                    byte[] bArr = new byte[5120];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    fileInputStream.close();
                } else if (file.isDirectory()) {
                    a(str + "/" + str3, str2 + "/" + str3);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean b(String str) {
        if (!TextUtils.isEmpty(str) && !str.contains("../")) {
            File file = new File(str);
            if (file.isFile() && file.exists()) {
                return file.delete();
            }
        }
        return false;
    }

    public static String c(String str) {
        BufferedReader bufferedReader;
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            bufferedReader = null;
        }
        if (bufferedReader == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                try {
                    break;
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    public static boolean a(String str) {
        File[] listFiles;
        if (!TextUtils.isEmpty(str) && !str.contains("../")) {
            String str2 = File.separator;
            if (!str.endsWith(str2)) {
                str = str + str2;
            }
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                boolean z = true;
                for (File file2 : file.listFiles()) {
                    boolean isFile = file2.isFile();
                    String absolutePath = file2.getAbsolutePath();
                    if (isFile) {
                        z = b(absolutePath);
                        if (!z) {
                            break;
                        }
                    } else {
                        z = a(absolutePath);
                        if (!z) {
                            break;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
                return file.delete();
            }
        }
        return false;
    }

    public static File[] b(String str, String str2) {
        File file = new File(str);
        return file.isDirectory() ? file.listFiles(new C0293a(str2)) : new File[0];
    }

    public static void c(String str, String str2) {
        Throwable th;
        IOException e;
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                try {
                    File file = new File(str);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    bufferedWriter = new BufferedWriter(new FileWriter(file));
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e2) {
                e = e2;
            }
            try {
                bufferedWriter.write(str2.toCharArray());
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException e3) {
                e = e3;
                bufferedWriter2 = bufferedWriter;
                e.printStackTrace();
                if (bufferedWriter2 != null) {
                    bufferedWriter2.close();
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }
}
