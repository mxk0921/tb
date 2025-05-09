package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ebp implements tkc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final File f18456a = new File(w9a.g().a().getCacheDir() + "/apm_db.db");

    public final void a() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("263fdcc", new Object[]{this});
        } else if (!this.f18456a.exists()) {
            this.f18456a.createNewFile();
        } else if (this.f18456a.isDirectory()) {
            this.f18456a.delete();
            this.f18456a.createNewFile();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691b3cb2", new Object[]{this});
        } else if (this.f18456a.exists()) {
            this.f18456a.delete();
        }
    }

    public void c(String str) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10463c8a", new Object[]{this, str});
            return;
        }
        try {
            a();
            if (this.f18456a.length() < 4194304) {
                FileWriter fileWriter = null;
                try {
                    FileWriter fileWriter2 = new FileWriter(this.f18456a, true);
                    try {
                        fileWriter2.append((CharSequence) str).append((CharSequence) "\n");
                        fileWriter2.close();
                    } catch (Throwable th2) {
                        th = th2;
                        fileWriter = fileWriter2;
                        if (fileWriter != null) {
                            fileWriter.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<String> d() {
        Throwable th;
        BufferedReader bufferedReader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a09f2064", new Object[]{this});
        }
        try {
            a();
            if (this.f18456a.length() > 0) {
                try {
                    bufferedReader = new BufferedReader(new FileReader(this.f18456a));
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                            arrayList.add(readLine);
                        }
                        bufferedReader.close();
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = null;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
