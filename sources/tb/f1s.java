package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileFilter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class f1s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x0s f18948a;

    public f1s(x0s x0sVar) {
        this.f18948a = x0sVar;
    }

    public static /* synthetic */ boolean c(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e7751c3", new Object[]{file})).booleanValue();
        }
        String name = file.getName();
        return name.endsWith("jni.log") || name.endsWith("anr.log");
    }

    public File[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File[]) ipChange.ipc$dispatch("472bfd7b", new Object[]{this});
        }
        File b = new q1s(this.f18948a.g(), this.f18948a.h()).b();
        if (!b.exists()) {
            ehh.a("TCrashFilesFilter", "uc dir not exist");
            return new File[0];
        }
        File[] listFiles = b.listFiles(new FileFilter() { // from class: tb.e1s
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                boolean c;
                c = f1s.c(file);
                return c;
            }
        });
        return (listFiles == null || listFiles.length <= 0) ? new File[0] : listFiles;
    }
}
