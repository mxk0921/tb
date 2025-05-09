package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import tb.dym;
import tb.k1d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wmp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
    }

    static {
        t2o.a(737149076);
    }

    public static void a(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f98573", new Object[]{str, bVar});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Process exec = Runtime.getRuntime().exec(str);
            if (bVar != null) {
                ((k1d.a) bVar).b(b(exec.getInputStream()));
            }
            Log.e("ShellUtil", String.format("excShell: execute shell [%s] success, consume %d ms.", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
        } catch (Throwable th) {
            TLog.loge(yr2.MODULE, "ShellUtil", String.format("exec shell %s with exception %s", str, th));
        }
    }

    public static String b(InputStream inputStream) {
        Object th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5da2c7b4", new Object[]{inputStream});
        }
        if (inputStream == null) {
            TLog.loge(yr2.MODULE, "ShellUtil", "readFromStream: input stream is empty.");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                        sb.append("\n");
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        try {
                            TLog.loge(yr2.MODULE, "ShellUtil", "readFromStream: read from input stream with exception " + th);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return sb.toString();
                        } catch (Throwable th3) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused) {
                                    TLog.loge(yr2.MODULE, "ShellUtil", "readFromStream: close input stream with IOException.");
                                }
                            }
                            throw th3;
                        }
                    }
                }
                bufferedReader2.close();
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (IOException unused2) {
            TLog.loge(yr2.MODULE, "ShellUtil", "readFromStream: close input stream with IOException.");
        }
        return sb.toString();
    }

    public static void c(InputStream inputStream, a aVar) {
        Object th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6a8201", new Object[]{inputStream, aVar});
        } else if (inputStream == null) {
            TLog.loge(yr2.MODULE, "ShellUtil", "readFromStream: input stream is empty.");
        } else {
            BufferedReader bufferedReader = null;
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            } else if (aVar != null) {
                                ((dym.a) aVar).a(readLine);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            try {
                                TLog.loge(yr2.MODULE, "ShellUtil", "readFromStream: read from input stream with exception " + th);
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                return;
                            } catch (Throwable th3) {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException unused) {
                                        TLog.loge(yr2.MODULE, "ShellUtil", "readFromStream: close input stream with IOException.");
                                    }
                                }
                                throw th3;
                            }
                        }
                    }
                    bufferedReader2.close();
                } catch (IOException unused2) {
                    TLog.loge(yr2.MODULE, "ShellUtil", "readFromStream: close input stream with IOException.");
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static void d(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fa1a008", new Object[]{str, bVar});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            File file = new File(str);
            if (!file.exists()) {
                TLog.loge(yr2.MODULE, "ShellUtil", "readProcessFile: file " + str + " is not exist.");
                return;
            }
            String b2 = b(new FileInputStream(file));
            if (bVar != null) {
                ((k1d.a) bVar).b(b2);
            }
            Log.e("ShellUtil", String.format("readProcessFile: read proc [%s] success, consume %d ms.", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
        } catch (Throwable th) {
            TLog.loge(yr2.MODULE, "ShellUtil", String.format("read process file %s with exception %s", str, th));
        }
    }

    public static void e(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57e8d98d", new Object[]{str, aVar});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            File file = new File(str);
            if (!file.exists()) {
                TLog.loge(yr2.MODULE, "ShellUtil", "readProcessFile: file " + str + " is not exist.");
                return;
            }
            c(new FileInputStream(file), aVar);
            Log.e("ShellUtil", String.format("readProcessFile: read proc [%s] success, consume %d ms.", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
        } catch (Throwable th) {
            TLog.loge(yr2.MODULE, "ShellUtil", String.format("read process file %s with exception %s", str, th));
        }
    }
}
