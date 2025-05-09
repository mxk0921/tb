package tb;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import tb.fdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class hp implements fdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fdb.a f20789a;

        public a(fdb.a aVar) {
            this.f20789a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f20789a.onAllObjectRemoveCallback(hp.this.s());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fdb.h f20790a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Object d;

        public b(fdb.h hVar, String str, String str2, Object obj) {
            this.f20790a = hVar;
            this.b = str;
            this.c = str2;
            this.d = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            fdb.h hVar = this.f20790a;
            String str = this.b;
            String str2 = this.c;
            ((c) hVar).a(str, str2, hp.this.g(str, str2, this.d));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements fdb.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fdb.i f20791a;

        public c(hp hpVar, fdb.i iVar) {
            this.f20791a = iVar;
        }

        public void a(String str, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7570cc50", new Object[]{this, str, str2, new Boolean(z)});
            } else {
                this.f20791a.onObjectSetCallback(str, z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements fdb.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fdb.g f20792a;

        public d(hp hpVar, fdb.g gVar) {
            this.f20792a = gVar;
        }

        public void a(String str, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a82d4d72", new Object[]{this, str, str2, new Boolean(z)});
            } else {
                this.f20792a.onObjectRemoveCallback(str, z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fdb.f f20793a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public e(fdb.f fVar, String str, String str2) {
            this.f20793a = fVar;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            fdb.f fVar = this.f20793a;
            String str = this.b;
            String str2 = this.c;
            ((d) fVar).a(str, str2, hp.this.J0(str, str2));
        }
    }

    static {
        t2o.a(374341634);
        t2o.a(374341667);
    }

    @Override // tb.fdb
    public boolean A0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74a4956e", new Object[]{this, str})).booleanValue();
        }
        return J0(str, null);
    }

    @Override // tb.fdb
    public void D(String str, fdb.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b68535f", new Object[]{this, str, gVar});
        } else {
            b(str, null, new d(this, gVar));
        }
    }

    @Override // tb.fdb
    public void E(fdb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c48e82c7", new Object[]{this, aVar});
        } else {
            AsyncTask.execute(new a(aVar));
        }
    }

    @Override // tb.fdb
    public InputStream H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("e71a2c74", new Object[]{this, str});
        }
        return j0(str, null);
    }

    @Override // tb.fdb
    public boolean N(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b32aefa8", new Object[]{this, str, obj})).booleanValue();
        }
        return g(str, null, obj);
    }

    @Override // tb.fdb
    public <T> T O(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ad6d1db", new Object[]{this, str, cls});
        }
        return (T) g0(str, null, cls);
    }

    @Override // tb.fdb
    public boolean T(String str, String str2, InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b92a9864", new Object[]{this, str, str2, inputStream})).booleanValue();
        }
        return W(str, str2, inputStream, 0);
    }

    @Override // tb.fdb
    public long U(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c068e1", new Object[]{this, str})).longValue();
        }
        return e0(str, null);
    }

    @Override // tb.fdb
    public boolean V(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ec1adbe", new Object[]{this, str})).booleanValue();
        }
        return y(str, null);
    }

    public void b(String str, String str2, fdb.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa329b15", new Object[]{this, str, str2, fVar});
        } else {
            AsyncTask.execute(new e(fVar, str, str2));
        }
    }

    public void c(String str, Object obj, int i, fdb.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18ae20ec", new Object[]{this, str, obj, new Integer(i), iVar});
        } else {
            e(str, null, obj, new c(this, iVar));
        }
    }

    @Override // tb.fdb
    public <T> T d0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ac08da2c", new Object[]{this, str});
        }
        return (T) I0(str, null);
    }

    public void e(String str, String str2, Object obj, fdb.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1372c41", new Object[]{this, str, str2, obj, hVar});
        } else {
            AsyncTask.execute(new b(hVar, str, str2, obj));
        }
    }

    public boolean g(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77c398f2", new Object[]{this, str, str2, obj})).booleanValue();
        }
        return G0(str, null, obj, 0);
    }

    @Override // tb.fdb
    public boolean j(String str, InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("250157ae", new Object[]{this, str, inputStream})).booleanValue();
        }
        return T(str, null, inputStream);
    }

    @Override // tb.fdb
    public void m0(String str, Object obj, fdb.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5cbca07", new Object[]{this, str, obj, iVar});
        } else {
            c(str, obj, 0, iVar);
        }
    }
}
