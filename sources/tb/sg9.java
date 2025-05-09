package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sg9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962592983);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea11bd1c", new Object[]{str})).booleanValue();
        }
        try {
            File file = new File(str);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
            return file.delete();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfa3a945", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
    }

    public static String c(String str) {
        Throwable th;
        InputStreamReader inputStreamReader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa3711bd", new Object[]{str});
        }
        InputStreamReader inputStreamReader2 = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(str));
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            char[] cArr = new char[100];
            StringBuilder sb = new StringBuilder();
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
            } catch (Exception e) {
                nhh.h("", e, new Object[0]);
            }
            return sb2;
        } catch (Exception unused2) {
            inputStreamReader2 = inputStreamReader;
            if (inputStreamReader2 != null) {
                try {
                    inputStreamReader2.close();
                } catch (Exception e2) {
                    nhh.h("", e2, new Object[0]);
                }
            }
            return "";
        } catch (Throwable th3) {
            th = th3;
            inputStreamReader2 = inputStreamReader;
            if (inputStreamReader2 != null) {
                try {
                    inputStreamReader2.close();
                } catch (Exception e3) {
                    nhh.h("", e3, new Object[0]);
                }
            }
            throw th;
        }
    }

    public static boolean d(String str, String str2) {
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
                nhh.h("", e4, new Object[0]);
            }
            try {
                fileWriter.close();
            } catch (Exception e5) {
                nhh.h("", e5, new Object[0]);
            }
            return true;
        } catch (Exception e6) {
            e = e6;
            bufferedWriter2 = bufferedWriter;
            nhh.h("", e, new Object[0]);
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (Exception e7) {
                    nhh.h("", e7, new Object[0]);
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (Exception e8) {
                    nhh.h("", e8, new Object[0]);
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
                    nhh.h("", e9, new Object[0]);
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (Exception e10) {
                    nhh.h("", e10, new Object[0]);
                }
            }
            throw th;
        }
    }
}
