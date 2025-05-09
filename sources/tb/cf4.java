package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cf4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final File f17023a;
    public final nq7 b;

    static {
        t2o.a(774897872);
    }

    public cf4(File file, nq7 nq7Var) {
        this.f17023a = file;
        this.b = nq7Var;
    }

    public File a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("e9a7c28d", new Object[]{this, str});
        }
        String h = e2n.h(str);
        File file = this.f17023a;
        File file2 = new File(file, "0_" + h);
        File file3 = this.f17023a;
        File file4 = new File(file3, file2.getName() + wb9.TEMP_POSTFIX);
        if ((!file2.exists() || !file2.canRead()) && (!file4.exists() || !file4.canRead())) {
            return new File(this.f17023a, h);
        }
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, "PreDownloadManager: get the prefix 0_ file = " + file2.getAbsolutePath());
        return file2;
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b41c5dc", new Object[]{this, str});
        }
        return e2n.h(str);
    }
}
