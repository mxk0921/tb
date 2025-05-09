package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z7v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f32594a;
    public final String b;
    public final int c;
    public final boolean d;
    public final c e;
    public final DXEngineConfig.b f;
    public final b g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f32595a;
        public boolean d;
        public c f;
        public DXEngineConfig.b g;
        public s h;
        public int e = 0;
        public int c = -1;
        public String b = "";

        static {
            t2o.a(157286627);
        }

        public static /* synthetic */ boolean a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c34c2203", new Object[]{bVar})).booleanValue();
            }
            return bVar.f32595a;
        }

        public static /* synthetic */ int b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c41aa073", new Object[]{bVar})).intValue();
            }
            return bVar.c;
        }

        public static /* synthetic */ String c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("426497bf", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ boolean d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c5b79d86", new Object[]{bVar})).booleanValue();
            }
            return bVar.d;
        }

        public static /* synthetic */ DXEngineConfig.b e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXEngineConfig.b) ipChange.ipc$dispatch("4ff072a0", new Object[]{bVar});
            }
            return bVar.g;
        }

        public static /* synthetic */ c f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("d00e293c", new Object[]{bVar});
            }
            return bVar.f;
        }

        public static /* synthetic */ int g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c82318f8", new Object[]{bVar})).intValue();
            }
            return bVar.e;
        }

        public static /* synthetic */ s h(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (s) ipChange.ipc$dispatch("60509df8", new Object[]{bVar});
            }
            return bVar.h;
        }

        public z7v i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z7v) ipChange.ipc$dispatch("7988e4c0", new Object[]{this});
            }
            return new z7v(this);
        }

        public b j(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c5f66ba7", new Object[]{this, new Integer(i)});
            }
            this.e = i;
            return this;
        }

        public b k(s sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c1dd1d9b", new Object[]{this, sVar});
            }
            this.h = sVar;
            return this;
        }

        public b l(DXEngineConfig.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5c8c83c5", new Object[]{this, bVar});
            }
            this.g = bVar;
            return this;
        }

        public b m(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f2ea80a", new Object[]{this, new Boolean(z)});
            }
            this.f32595a = z;
            return this;
        }

        public b n(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f729a588", new Object[]{this, cVar});
            }
            this.f = cVar;
            return this;
        }

        public b o(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("dbea75e", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public b p(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ea6cf7db", new Object[]{this, new Integer(i)});
            }
            this.c = i;
            return this;
        }

        public b q(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6f236b5", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(157286628);
        }

        public void a(DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7fb238b", new Object[]{this, dXTemplateItem});
            }
        }

        public abstract void b(Context context, s sVar);

        public void c(DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6d47e47", new Object[]{this, dXTemplateItem});
            }
        }
    }

    static {
        t2o.a(157286625);
    }

    public c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("580204fa", new Object[]{this});
        }
        return this.e;
    }

    public DXEngineConfig.b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEngineConfig.b) ipChange.ipc$dispatch("d859630d", new Object[]{this});
        }
        return this.f;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21aab7e9", new Object[]{this})).intValue();
        }
        return b.g(this.g);
    }

    public s d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("3e57ea2d", new Object[]{this});
        }
        return b.h(this.g);
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e08734e3", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ea62071", new Object[]{this});
        }
        return this.b;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b57d734", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e8f500e", new Object[]{this})).booleanValue();
        }
        return this.f32594a;
    }

    public z7v(b bVar) {
        this.g = bVar;
        this.f32594a = b.a(bVar);
        this.c = b.b(bVar);
        this.b = b.c(bVar);
        this.d = b.d(bVar);
        DXEngineConfig.b e = b.e(bVar);
        this.f = e;
        this.e = b.f(bVar);
        if (e != null) {
            e.g0(b.a(bVar));
            e.X(b.b(bVar));
            e.R(b.d(bVar));
        }
    }
}
