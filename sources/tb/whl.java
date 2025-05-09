package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class whl implements dbn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dbn f30699a;
    public final kgd b;
    public final lbn c;

    public whl(dbn dbnVar, kgd kgdVar, lbn lbnVar) {
        this.f30699a = dbnVar;
        this.b = kgdVar;
        this.c = lbnVar;
    }

    @Override // tb.dbn
    public d52 a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d52) ipChange.ipc$dispatch("b9db9619", new Object[]{this, list});
        }
        return this.f30699a.a(list);
    }

    @Override // tb.dbn
    public void b(String str, y69 y69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dc04a6", new Object[]{this, str, y69Var});
        } else {
            this.f30699a.b(str, y69Var);
        }
    }

    @Override // tb.dbn
    public b79 c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b79) ipChange.ipc$dispatch("b1bac3d7", new Object[]{this, str});
        }
        return this.f30699a.c(str);
    }

    @Override // tb.dbn
    public b79 d(String str) {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b79) ipChange.ipc$dispatch("d96d27dc", new Object[]{this, str});
        }
        if (!str.endsWith(".prof")) {
            return this.f30699a.d(str);
        }
        if (!trq.d(this.b.d(), kgd.ABI_ARM64)) {
            return b79.a(str, 5050);
        }
        b79 d = this.f30699a.d(str);
        String d2 = d.d();
        if (!d.i() || trq.c(d2)) {
            this.c.b(str);
            return d;
        }
        File file = new File(d2);
        File file2 = new File(file.getParentFile(), str);
        if (!file2.isFile() || file.length() != file2.length()) {
            try {
                fileInputStream = new FileInputStream(d2);
                jg9.c(fileInputStream, file2);
            } catch (Throwable th) {
                rbn.g("fetch-primary.prof", th);
            }
            if (file.length() == file2.length()) {
                RSoLog.d("prof-> fetch from copy file lib=".concat(str));
                b79 j = b79.j(str, file2.getPath());
                fileInputStream.close();
                return j;
            }
            fileInputStream.close();
            return d;
        }
        RSoLog.d("prof-> fetch from exist file lib=".concat(str));
        return b79.j(str, file2.getPath());
    }

    @Override // tb.dbn
    public void e(List<String> list, c52 c52Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7032327", new Object[]{this, list, c52Var});
        } else {
            this.f30699a.e(list, c52Var);
        }
    }
}
