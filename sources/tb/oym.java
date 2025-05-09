package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class oym {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f25751a;
    public final String b;
    public final String c;

    public oym(Context context, String str, String str2) {
        this.f25751a = context;
        this.b = str;
        this.c = str2;
    }

    public File a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("333f9a64", new Object[]{this});
        }
        return kg9.b(new File(b(), "backup"));
    }

    public File b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("be7b5133", new Object[]{this});
        }
        return kg9.b(new File(e(), "crashsdk"));
    }

    public File c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("6891b204", new Object[]{this});
        }
        return kg9.b(new File(b(), "java"));
    }

    public File d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("f1e38217", new Object[]{this});
        }
        return kg9.b(new File(b(), "logs"));
    }

    public File e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("7f7ddf71", new Object[]{this});
        }
        return kg9.b(new File(this.f25751a.getDir(this.b, 0), this.c));
    }
}
