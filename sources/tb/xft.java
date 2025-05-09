package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileFilter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xft {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x0s f31363a;

    public xft(x0s x0sVar) {
        this.f31363a = x0sVar;
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
        return new rgt(this.f31363a.g(), this.f31363a.h()).e().listFiles(new FileFilter() { // from class: tb.wft
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                boolean c;
                c = xft.c(file);
                return c;
            }
        });
    }
}
