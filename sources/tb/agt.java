package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class agt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x0s f15729a;
    public final List<String> b;

    public agt(x0s x0sVar) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.f15729a = x0sVar;
        arrayList.add("java");
        arrayList.add("native");
    }

    public File[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File[]) ipChange.ipc$dispatch("472bfd7b", new Object[]{this});
        }
        return new rgt(this.f15729a.g(), this.f15729a.h()).e().listFiles(new FileFilter() { // from class: tb.zft
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                boolean c;
                c = agt.this.c(file);
                return c;
            }
        });
    }

    public final /* synthetic */ boolean c(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e7751c3", new Object[]{this, file})).booleanValue();
        }
        String name = file.getName();
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            if (name.endsWith(((String) it.next()) + ".log")) {
                return true;
            }
        }
        return false;
    }
}
