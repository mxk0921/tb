package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileFilter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class s5v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x0s f27813a;

    public s5v(x0s x0sVar) {
        this.f27813a = x0sVar;
    }

    public static /* synthetic */ boolean c(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e7751c3", new Object[]{file})).booleanValue();
        }
        String name = file.getName();
        return !name.endsWith("jni.log") && !name.endsWith("anr.log");
    }

    public File[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File[]) ipChange.ipc$dispatch("472bfd7b", new Object[]{this});
        }
        File d = new t5v(this.f27813a.g(), this.f27813a.h()).d();
        if (d.exists()) {
            return d.listFiles(new FileFilter() { // from class: tb.r5v
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    boolean c;
                    c = s5v.c(file);
                    return c;
                }
            });
        }
        ehh.a("UcOtherFileFilter", "uc dir not exist");
        return new File[0];
    }
}
