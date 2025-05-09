package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.boutique.fastsp.face.KVManager;
import com.taobao.android.boutique.fastsp.face.a;
import com.taobao.android.boutique.fastsp.face.b;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kr2 implements JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final KVManager f22864a;

    public kr2(x0s x0sVar, koq koqVar) {
        if (o1r.a(x0sVar.g()).b("OpenCSwitcher", koqVar.defaultValue())) {
            a aVar = new a(50);
            this.f22864a = aVar;
            b.b(aVar);
            return;
        }
        this.f22864a = null;
    }

    public static /* synthetic */ void b(StringBuilder sb, a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5403b1ef", new Object[]{sb, cVar});
            return;
        }
        sb.append(cVar);
        sb.append(";");
    }

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        if (this.f22864a == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        ((a) this.f22864a).a(new jr2(sb));
        hashMap.put("CSwitcher", sb.toString());
        return hashMap;
    }
}
