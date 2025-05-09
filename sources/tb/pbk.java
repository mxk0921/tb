package tb;

import android.content.Context;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class pbk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final File f25999a = a();
    public final Context b;

    static {
        t2o.a(768606221);
    }

    public pbk(Context context) {
        this.b = context;
    }

    public static long b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8f3015a", new Object[]{context})).longValue();
        }
        try {
            File file = new pbk(context).f25999a;
            if (file != null) {
                return file.length();
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public final File a() {
        File file;
        File file2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("979c3c90", new Object[]{this});
        }
        try {
            file = new File(this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 0).applicationInfo.publicSourceDir);
            file2 = new File(file.getParentFile(), "/oat/arm/base.odex");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(file.getParentFile(), "/oat/arm64/base.odex");
        if (file3.exists()) {
            return file3;
        }
        return null;
    }
}
