package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class u0s implements yyi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f29066a = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f29067a;
        public final String b;
        public final String c;

        public c(u0s u0sVar, String str, String str2, String str3) {
            this.f29067a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    @Override // tb.yyi
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4511219c", new Object[]{this, str, str2, str3});
            return;
        }
        synchronized (this.f29066a) {
            ((ArrayList) this.f29066a).add(new c(str, str2, str3));
        }
    }

    public void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ce8aa42", new Object[]{this, bVar});
            return;
        }
        synchronized (this.f29066a) {
            try {
                Iterator it = ((ArrayList) this.f29066a).iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    ((izi) bVar).a(cVar.f29067a, cVar.b, cVar.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
