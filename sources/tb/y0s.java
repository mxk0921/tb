package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Map;
import tb.n1s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y0s implements h1s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x0s f31771a;

    public y0s(x0s x0sVar) {
        this.f31771a = x0sVar;
    }

    @Override // tb.h1s
    public File a(Thread thread, Throwable th, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("9852cef7", new Object[]{this, thread, th, map});
        }
        return c(thread, th, map);
    }

    public final String b(String str, Thread thread, Throwable th, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7c9738e", new Object[]{this, str, thread, th, map});
        }
        v0s v0sVar = new v0s();
        Throwable a2 = ust.a(th);
        v0sVar.d(this.f31771a, str, "java").k(this.f31771a.h(), th, thread);
        v0sVar.f(map).j();
        v0sVar.g().c(this.f31771a.g(), a2 instanceof OutOfMemoryError).i().l();
        return v0sVar.toString();
    }

    public final File c(Thread thread, Throwable th, Map<String, Object> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("83c5f7f5", new Object[]{this, thread, th, map});
        }
        if ("true".equals(map.get("REPORT_IGNORE"))) {
            str = jwi.MATCH_IGNORE;
        } else {
            str = pg1.ATOM_catch;
        }
        String a2 = n1s.a.a(this.f31771a, "java", str);
        File file = new File(new rgt(this.f31771a.g(), this.f31771a.h()).e(), a2);
        kg9.g(file, b(a2, thread, th, map));
        return file;
    }
}
