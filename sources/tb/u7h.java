package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.resolver2.j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class u7h implements agd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final agd f29208a;
    public final b<pan> b = new a(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements b<pan> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(u7h u7hVar) {
        }

        /* renamed from: b */
        public pan a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (pan) ipChange.ipc$dispatch("2262145a", new Object[]{this, str});
            }
            if (!d1r.a("/disabled/" + str)) {
                return null;
            }
            RSoException error = RSoException.error(6305, "lib obtain disabled by local switch, libName = " + str);
            z6o e = j.e(str);
            return new pan(e, j.f(e, error, "local-disabled"));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b<V> {
    }

    public u7h(agd agdVar) {
        this.f29208a = agdVar;
    }

    @Override // tb.agd
    public void a(String str, nan nanVar) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("202931b2", new Object[]{this, str, nanVar});
            return;
        }
        pan panVar = (pan) ((a) this.b).a(str);
        if (panVar != null) {
            nanVar.a(panVar);
        } else {
            this.f29208a.a(str, nanVar);
        }
    }

    @Override // tb.agd
    public pan b(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("74404968", new Object[]{this, str});
        }
        pan panVar = (pan) ((a) this.b).a(str);
        if (panVar != null) {
            return panVar;
        }
        return this.f29208a.b(str);
    }

    @Override // tb.agd
    public pan c(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("f3fef1e3", new Object[]{this, str});
        }
        pan panVar = (pan) ((a) this.b).a(str);
        if (panVar != null) {
            return panVar;
        }
        return this.f29208a.c(str);
    }
}
