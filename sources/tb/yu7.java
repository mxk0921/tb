package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yu7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static yu7 b;

    /* renamed from: a  reason: collision with root package name */
    public final String f32354a;

    static {
        t2o.a(961544230);
    }

    public yu7() {
        StringBuilder sb = new StringBuilder();
        String str = File.separator;
        sb.append(str);
        sb.append("UTABTest");
        sb.append(str);
        sb.append("Experiment");
        this.f32354a = sb.toString();
    }

    public static synchronized yu7 f() {
        synchronized (yu7.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (yu7) ipChange.ipc$dispatch("38655cf8", new Object[0]);
            }
            if (b == null) {
                b = new yu7();
                if (xh4.f31395a == null) {
                    rv7.g(n.j().b());
                }
                xh4.k = n.j().q();
            }
            return b;
        }
    }

    public int a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("519823cc", new Object[]{this, str, str2, new Long(j)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        ogh.i("DownloadManager", "【Beta实验数据】数据文件开始下载，文件地址：" + str + "，文件MD5：" + str2);
        return c(str, str2, e().getAbsolutePath(), null, new k92(j, str2));
    }

    public int b(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa33f7dc", new Object[]{this, str, str2, new Long(j)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        ogh.i("DownloadManager", "【实验数据】数据文件开始下载，文件地址：" + str + "，文件MD5：" + str2);
        return c(str, str2, e().getAbsolutePath(), null, new mo8(j));
    }

    public int c(String str, String str2, String str3, String str4, tu7 tu7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1961a12", new Object[]{this, str, str2, str3, str4, tu7Var})).intValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return -1;
        }
        return rv7.e().b(d(str, str2, str3, str4), tu7Var);
    }

    public final zu7 d(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zu7) ipChange.ipc$dispatch("b4f356b1", new Object[]{this, str, str2, str3, str4});
        }
        zu7 zu7Var = new zu7();
        zu7Var.f33016a = new ArrayList();
        onf onfVar = new onf();
        onfVar.f25507a = str;
        onfVar.c = str2;
        onfVar.d = str4;
        zu7Var.f33016a.add(onfVar);
        upl uplVar = new upl();
        uplVar.g = str3;
        uplVar.c = 7;
        uplVar.f29547a = "UTABTest";
        zu7Var.b = uplVar;
        return zu7Var;
    }

    public File e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("2d53d192", new Object[]{this});
        }
        return new File(n.j().b().getFilesDir() + this.f32354a);
    }
}
