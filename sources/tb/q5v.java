package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileFilter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q5v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x0s f26529a;

    public q5v(x0s x0sVar) {
        this.f26529a = x0sVar;
    }

    public static /* synthetic */ boolean c(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e7751c3", new Object[]{file})).booleanValue();
        }
        return file.getName().endsWith("jni.log");
    }

    public File[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File[]) ipChange.ipc$dispatch("472bfd7b", new Object[]{this});
        }
        File d = new t5v(this.f26529a.g(), this.f26529a.h()).d();
        if (!d.exists()) {
            ehh.a("UcCrashFilesFilter", "uc dir not exist");
            return new File[0];
        }
        File[] listFiles = d.listFiles(new FileFilter() { // from class: tb.p5v
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                boolean c;
                c = q5v.c(file);
                return c;
            }
        });
        return (listFiles == null || listFiles.length <= 0) ? new File[0] : listFiles;
    }
}
