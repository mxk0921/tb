package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.procedure.ProcedureImpl;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xxm implements ProcedureImpl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_SAVE_DIR = "apm";

    public static File h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("b77818c", new Object[0]);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ProcedureGlobal.f().a().getCacheDir());
        String str = File.separator;
        sb.append(str);
        sb.append("apm");
        sb.append(str);
        return new File(sb.toString());
    }

    public static void i(File[] fileArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e9636ba", new Object[]{fileArr, new Integer(i), new Integer(i2)});
        } else if (i < i2) {
            File file = fileArr[i];
            int i3 = i;
            int i4 = i2;
            while (i3 < i4) {
                while (fileArr[i4].lastModified() >= file.lastModified() && i3 < i4) {
                    i4--;
                }
                while (fileArr[i3].lastModified() <= file.lastModified() && i3 < i4) {
                    i3++;
                }
                File file2 = fileArr[i4];
                fileArr[i4] = fileArr[i3];
                fileArr[i3] = file2;
            }
            fileArr[i] = fileArr[i3];
            fileArr[i3] = file;
            i(fileArr, i, i4 - 1);
            i(fileArr, i4 + 1, i2);
        }
    }

    @Override // com.taobao.monitor.procedure.ProcedureImpl.b
    public void a(r1w r1wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50322ff2", new Object[]{this, r1wVar});
        }
    }

    @Override // com.taobao.monitor.procedure.ProcedureImpl.b
    public void b(r1w r1wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1397a624", new Object[]{this, r1wVar});
            return;
        }
        try {
            j(r1wVar);
        } catch (Exception e) {
            zq6.a("ProcedureStorage", e);
        }
    }

    @Override // com.taobao.monitor.procedure.ProcedureImpl.b
    public void c(r1w r1wVar, cj8 cj8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece8aa82", new Object[]{this, r1wVar, cj8Var});
        }
    }

    @Override // com.taobao.monitor.procedure.ProcedureImpl.b
    public void d(r1w r1wVar, ugq ugqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2612f02", new Object[]{this, r1wVar, ugqVar});
        }
    }

    public final void e(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ade760b2", new Object[]{this, file});
        } else if (file != null && file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length >= 10) {
            i(listFiles, 0, listFiles.length - 1);
            for (int i = 0; i < listFiles.length - 9; i++) {
                listFiles[i].delete();
            }
        }
    }

    public final void f(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("906e6d6", new Object[]{this, file});
        } else if (!file.exists()) {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public final String g(r1w r1wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2be2247", new Object[]{this, r1wVar});
        }
        Object obj = r1wVar.n().get("pageName");
        if (obj == null) {
            return "null";
        }
        return (String) obj;
    }

    public final void j(r1w r1wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68f14c6", new Object[]{this, r1wVar});
        } else if (r1wVar.x() != null) {
            if ("pageLoad".equals(r1wVar.p()) || "startup".equals(r1wVar.p())) {
                File h = h();
                e(h);
                k(h, r1wVar.p() + "_" + g(r1wVar) + "_" + r1wVar.o() + q2s.JSON, uxm.e(r1wVar));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void k(File file, String str, String str2) {
        FileOutputStream fileOutputStream;
        FileNotFoundException e;
        IOException e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e090346", new Object[]{this, file, str, str2});
            return;
        }
        File file2 = new File(file, str);
        f(file2);
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    do {
                    } while (fileOutputStream.getChannel().write(Charset.forName("utf8").encode(str2)) != 0);
                    fileOutputStream.close();
                    str = fileOutputStream;
                } catch (FileNotFoundException e3) {
                    e = e3;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                        str = fileOutputStream;
                    }
                } catch (IOException e4) {
                    e2 = e4;
                    e2.printStackTrace();
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                        str = fileOutputStream;
                    }
                }
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        } catch (FileNotFoundException e6) {
            e = e6;
            fileOutputStream = null;
        } catch (IOException e7) {
            e2 = e7;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            str = 0;
            if (str != 0) {
                try {
                    str.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            throw th;
        }
    }
}
