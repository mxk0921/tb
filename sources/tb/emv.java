package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class emv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile emv c;

    /* renamed from: a  reason: collision with root package name */
    public String f18687a;
    public a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
    }

    public static emv a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (emv) ipChange.ipc$dispatch("778827a2", new Object[0]);
        }
        if (c == null) {
            synchronized (emv.class) {
                try {
                    if (c == null) {
                        c = new emv();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final String b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60942489", new Object[]{this, file});
        }
        String name = file.getName();
        if (TextUtils.isEmpty(name)) {
            return this.f18687a + "/error";
        }
        return this.f18687a + "/" + name.split("_")[0];
    }

    public final String c(File file) throws Exception {
        Throwable th;
        IOException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("242cc95b", new Object[]{this, file});
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
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
                            if (sb.length() > 0) {
                                sb.append("\n");
                            }
                            sb.append(readLine);
                        } catch (IOException e2) {
                            e = e2;
                            bufferedReader = bufferedReader2;
                            e.printStackTrace();
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return sb.toString();
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            } catch (IOException e5) {
                e = e5;
            }
            return sb.toString();
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e878ea", new Object[]{this, str});
        } else {
            this.f18687a = str;
        }
    }

    public void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1adba707", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca549cc", new Object[]{this, new Boolean(z)});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            ((ikv) aVar).e(z);
        }
        File h = xxm.h();
        if (!h.exists() || !h.isDirectory()) {
            a aVar2 = this.b;
            if (aVar2 != null) {
                ((ikv) aVar2).c();
                return;
            }
            return;
        }
        File[] listFiles = h.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            a aVar3 = this.b;
            if (aVar3 != null) {
                ((ikv) aVar3).c();
                return;
            }
            return;
        }
        for (File file : listFiles) {
            try {
                String c2 = c(file);
                file.delete();
                a aVar4 = this.b;
                if (aVar4 != null) {
                    c2 = ((ikv) aVar4).b(file, c2);
                }
                String b = b(file);
                luj.c().a(b, c2, false);
                a aVar5 = this.b;
                if (aVar5 != null) {
                    ((ikv) aVar5).d(b, c2);
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (z) {
                    file.delete();
                    zq6.a("UploadStorage", "上传文件失败：", file.getName());
                }
            }
        }
        a aVar6 = this.b;
        if (aVar6 != null) {
            ((ikv) aVar6).c();
        }
    }
}
