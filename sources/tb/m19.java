package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.boutique.fastsp.monitor.Monitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class m19 implements Monitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f23713a = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f23714a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final long f;

        static {
            t2o.a(407896101);
        }

        public b(m19 m19Var, String str, String str2, String str3, String str4, String str5, long j) {
            this.f23714a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = j;
        }
    }

    static {
        t2o.a(407896099);
        t2o.a(407896106);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de51618d", new Object[]{this, aVar});
            return;
        }
        synchronized (this.f23713a) {
            try {
                Iterator it = ((ArrayList) this.f23713a).iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    ((kzi) aVar).a(bVar.f23714a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.taobao.android.boutique.fastsp.monitor.Monitor
    public void commit(String str, String str2, String str3, String str4, String str5, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f21ad414", new Object[]{this, str, str2, str3, str4, str5, new Long(j)});
            return;
        }
        synchronized (this.f23713a) {
            ((ArrayList) this.f23713a).add(new b(this, str, str2, str3, str4, str5, j));
        }
    }
}
