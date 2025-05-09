package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a01 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x0s f15461a;
    public final a b;
    public final String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
    }

    public a01(x0s x0sVar, String str, a aVar) {
        this.f15461a = x0sVar;
        this.b = aVar;
        this.c = str;
    }

    public static a01 b(x0s x0sVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a01) ipChange.ipc$dispatch("b5148370", new Object[]{x0sVar, aVar});
        }
        return new a01(x0sVar, "/data/anr", aVar);
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34cab96e", new Object[]{this, str});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            synchronized (aVar) {
                try {
                    if (str.contains("trace") && d(str)) {
                        ((lmj) this.b).s(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed14d3c4", new Object[]{this, str})).booleanValue();
        }
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        return new u9u(this.f15461a.g(), file).a();
    }

    public final /* synthetic */ void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf8f898", new Object[]{this});
            return;
        }
        c(this.c + "/traces.txt");
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            v9a.c().a().execute(new Runnable() { // from class: tb.zz0
                @Override // java.lang.Runnable
                public final void run() {
                    a01.this.e();
                }
            });
        }
    }
}
