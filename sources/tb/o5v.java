package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileFilter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o5v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x0s f25157a;

    public o5v(x0s x0sVar) {
        this.f25157a = x0sVar;
    }

    public static /* synthetic */ boolean c(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e7751c3", new Object[]{file})).booleanValue();
        }
        return file.getName().endsWith("anr.log");
    }

    public File[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File[]) ipChange.ipc$dispatch("472bfd7b", new Object[]{this});
        }
        File d = new t5v(this.f25157a.g(), this.f25157a.h()).d();
        if (!d.exists()) {
            ehh.a("UcAnrFilesFilter", "uc dir not exist");
            return new File[0];
        }
        FileFilter n5vVar = new FileFilter() { // from class: tb.n5v
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                boolean c;
                c = o5v.c(file);
                return c;
            }
        };
        bgg b = bgg.b(this.f25157a);
        try {
            File[] listFiles = d.listFiles(n5vVar);
            if (listFiles == null || listFiles.length <= 0) {
                b.a();
                return new File[0];
            } else if (!b.c()) {
                return listFiles;
            } else {
                kg9.a(listFiles);
                return new File[0];
            }
        } finally {
            b.a();
        }
    }
}
