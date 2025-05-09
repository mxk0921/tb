package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wd9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a f30631a;
    public final File[] b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void accept(File file);
    }

    public wd9(File[] fileArr, a aVar) {
        this.b = fileArr;
        this.f30631a = aVar;
    }

    public static wd9 b(File[] fileArr, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wd9) ipChange.ipc$dispatch("635b9ae9", new Object[]{fileArr, aVar});
        }
        return new wd9(fileArr, aVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        File[] fileArr = this.b;
        if (!(fileArr == null || this.f30631a == null)) {
            for (File file : fileArr) {
                this.f30631a.accept(file);
            }
        }
    }
}
