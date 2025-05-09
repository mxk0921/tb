package com.alibaba.wireless.security.framework.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(659554342);
    }

    public static String a(File file) {
        BufferedReader bufferedReader;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36082ea1", new Object[]{file});
        }
        BufferedReader bufferedReader2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        bufferedReader.close();
                        return sb.toString();
                    }
                }
            } catch (Exception unused) {
                if (bufferedReader == null) {
                    return null;
                }
                try {
                    bufferedReader.close();
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception unused4) {
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean a(File file, String str) {
        Throwable th;
        BufferedWriter bufferedWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fbe2fed", new Object[]{file, str})).booleanValue();
        }
        if (file == null || str == null) {
            return false;
        }
        File file2 = new File(file.getAbsolutePath() + ".tmp");
        BufferedWriter bufferedWriter2 = null;
        try {
            if (!file2.exists()) {
                file2.createNewFile();
            }
            bufferedWriter = new BufferedWriter(new FileWriter(file2, false));
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
            return file2.renameTo(file);
        } catch (Exception unused2) {
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 == null) {
                return false;
            }
            try {
                bufferedWriter2.close();
                return false;
            } catch (Exception unused3) {
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (Exception unused4) {
                }
            }
            throw th;
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !str.contains("..") && !str.contains("\\") && !str.contains(f7l.MOD);
    }
}
