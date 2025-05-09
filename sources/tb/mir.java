package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.nir;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mir implements nir.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile mir c;
    public final ArrayList<nir> b = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    public final Handler f24068a = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a(String str);

        void b(String str);
    }

    static {
        t2o.a(779093674);
        t2o.a(779093678);
    }

    public static mir b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mir) ipChange.ipc$dispatch("d1cb8a6d", new Object[0]);
        }
        if (c == null) {
            synchronized (mir.class) {
                try {
                    if (c == null) {
                        c = new mir();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    @Override // tb.nir.b
    public void a(nir nirVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b132d672", new Object[]{this, nirVar});
        } else if (nirVar != null) {
            l6s.a("TBLVObjectSharedManager", "onFinish start playContextKey = " + nirVar.h());
            this.b.remove(nirVar);
        }
    }

    public String c(Context context, String str, jgi jgiVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("181917a2", new Object[]{this, context, str, jgiVar, aVar});
        }
        if (context == null || str == null || jgiVar == null || aVar == null) {
            return null;
        }
        l6s.a("TBLVObjectSharedManager", "reuseAndReleasePlayer start playContextKey = ".concat(str));
        nir nirVar = new nir(context, str, jgiVar, this.f24068a, aVar, this);
        this.b.add(nirVar);
        return nirVar.j();
    }
}
