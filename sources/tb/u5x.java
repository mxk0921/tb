package tb;

import android.content.Context;
import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexEventTarget;
import com.taobao.android.weex.WeexFactoryImpl;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.config.WeexUnicornConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import tb.b6x;
import tb.t5x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class u5x implements t5x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context b;
    public final String c;
    public final WeexInstanceMode d;
    public final WeexRenderType e;
    public final JSONObject f;
    public final WeexInstanceConfig g;
    public WeexInstance i;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<Runnable> f29169a = new LinkedList<>();
    public boolean h = false;
    public final List<j6x> j = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ i d;

        public a(i iVar) {
            this.d = iVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceAsyncBuilderImpl$10");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                u5x.e(u5x.this, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements b6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(u5x u5xVar) {
        }

        @Override // tb.b6x
        public void a(b6x.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17d54df9", new Object[]{this, aVar});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        public c(int i, int i2) {
            this.d = i;
            this.e = i2;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceAsyncBuilderImpl$1");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            u5x.d(u5x.this).updateContainerSize(this.d, this.e);
            q6x q6xVar = (q6x) u5x.d(u5x.this).getExtend(q6x.class);
            if (q6xVar != null) {
                q6xVar.b(this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;

        public d(String str) {
            this.d = str;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceAsyncBuilderImpl$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                u5x.d(u5x.this).initWithURL(this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ byte[] d;
        public final /* synthetic */ String e;

        public e(byte[] bArr, String str) {
            this.d = bArr;
            this.e = str;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceAsyncBuilderImpl$3");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                u5x.d(u5x.this).initWithData(this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue d;

        public f(WeexValue weexValue) {
            this.d = weexValue;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceAsyncBuilderImpl$4");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                u5x.d(u5x.this).render(this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;
        public final /* synthetic */ Object e;

        public g(String str, Object obj) {
            this.d = str;
            this.e = obj;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceAsyncBuilderImpl$8");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                u5x.d(u5x.this).setTag(this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;
        public final /* synthetic */ WeexValue e;

        public h(String str, WeexValue weexValue) {
            this.d = str;
            this.e = weexValue;
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceAsyncBuilderImpl$9");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                u5x.d(u5x.this).updateInstanceEnv(this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class i implements b6x.a, t5x.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final b6x f29170a;
        public volatile WeexInstance b = null;
        public boolean c = false;
        public boolean d = false;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a extends yio {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceAsyncBuilderImpl$Result$1");
            }

            @Override // tb.yio
            public void e() throws Exception {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4134b145", new Object[]{this});
                } else if (!i.e(i.this)) {
                    i.f(i.this);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b extends yio {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceAsyncBuilderImpl$Result$2");
            }

            @Override // tb.yio
            public void e() throws Exception {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4134b145", new Object[]{this});
                    return;
                }
                i.g(i.this).destroy();
                i.h(i.this, null);
            }
        }

        static {
            t2o.a(982515768);
            t2o.a(982515772);
            t2o.a(982515753);
        }

        public i(b6x b6xVar) {
            this.f29170a = b6xVar;
        }

        public static /* synthetic */ boolean e(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("371e9afb", new Object[]{iVar})).booleanValue();
            }
            return iVar.d;
        }

        public static /* synthetic */ void f(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d38c9756", new Object[]{iVar});
            } else {
                iVar.j();
            }
        }

        public static /* synthetic */ WeexInstance g(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeexInstance) ipChange.ipc$dispatch("3618b0df", new Object[]{iVar});
            }
            return iVar.b;
        }

        public static /* synthetic */ WeexInstance h(i iVar, WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeexInstance) ipChange.ipc$dispatch("dfc90943", new Object[]{iVar, weexInstance});
            }
            iVar.b = weexInstance;
            return weexInstance;
        }

        @Override // tb.t5x.a
        public synchronized boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3729165a", new Object[]{this})).booleanValue();
            }
            WeexInstance weexInstance = this.b;
            if (this.d) {
                return false;
            }
            if (weexInstance == null) {
                return false;
            }
            j();
            return true;
        }

        @Override // tb.b6x.a
        public synchronized WeexInstance b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeexInstance) ipChange.ipc$dispatch("e248edfb", new Object[]{this, context});
            }
            f9x.a(hxh.a());
            if (this.c) {
                return null;
            }
            this.c = true;
            this.b.resetContext(context);
            x8x x8xVar = (x8x) this.b.getExtend(q6x.class);
            if (x8xVar != null) {
                x8xVar.E();
            }
            return this.b;
        }

        @Override // tb.b6x.a
        public void c(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10a41b4b", new Object[]{this, str, obj});
            } else if (this.b != null) {
                this.b.setTag(str, obj);
            }
        }

        @Override // tb.b6x.a
        public void d(WeexEventTarget weexEventTarget, String str, WeexValue weexValue) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5684d091", new Object[]{this, weexEventTarget, str, weexValue});
            } else if (this.b != null) {
                this.b.dispatchEvent(weexEventTarget, str, weexValue);
            }
        }

        @Override // tb.b6x.a
        public synchronized void destroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[]{this});
            } else if (!this.c) {
                this.c = true;
                hxh.f(new b());
            }
        }

        @Override // tb.b6x.a
        public void dispatchEvent(WeexEventTarget weexEventTarget, String str, WeexValue weexValue) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef416b17", new Object[]{this, weexEventTarget, str, weexValue});
                return;
            }
            f9x.a(true ^ this.c);
            if (this.b != null) {
                this.b.dispatchEvent(weexEventTarget, str, weexValue);
            }
        }

        @Override // tb.b6x.a
        public void execute(byte[] bArr, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d1a4be4d", new Object[]{this, bArr, str});
                return;
            }
            f9x.a(true ^ this.c);
            if (this.b != null) {
                this.b.execute(bArr, str);
            }
        }

        public synchronized void i(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51fbeb37", new Object[]{this, weexInstance});
                return;
            }
            this.b = weexInstance;
            hxh.d(new a());
        }

        public final void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e1b7c9a", new Object[]{this});
                return;
            }
            this.d = true;
            this.f29170a.a(this);
        }

        @Override // tb.b6x.a
        public void render(WeexValue weexValue) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21c13e4f", new Object[]{this, weexValue});
                return;
            }
            f9x.a(true ^ this.c);
            if (this.b != null) {
                this.b.render(weexValue);
            }
        }

        @Override // tb.b6x.a
        public void updateInstanceEnv(String str, WeexValue weexValue) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40d105ac", new Object[]{this, str, weexValue});
                return;
            }
            f9x.a(true ^ this.c);
            if (this.b != null) {
                this.b.updateInstanceEnv(str, weexValue);
            }
        }
    }

    static {
        t2o.a(982515754);
        t2o.a(982515752);
    }

    public u5x(Context context, String str, WeexInstanceMode weexInstanceMode, WeexRenderType weexRenderType, JSONObject jSONObject, WeexInstanceConfig weexInstanceConfig) {
        this.b = context;
        this.c = str;
        this.d = weexInstanceMode;
        this.e = weexRenderType;
        this.f = jSONObject;
        this.g = weexInstanceConfig;
        f(str);
    }

    public static /* synthetic */ WeexInstance d(u5x u5xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("34b7de9e", new Object[]{u5xVar});
        }
        return u5xVar.i;
    }

    public static /* synthetic */ void e(u5x u5xVar, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdede99", new Object[]{u5xVar, iVar});
        } else {
            u5xVar.g(iVar);
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e656698", new Object[]{str});
            return;
        }
        try {
            Uri.parse(str);
        } catch (Exception e2) {
            dwh.g("InvalidUrl", "WeexInstanceAsyncBuilder: " + str, e2);
        }
    }

    @Override // tb.t5x
    public b6x.a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b6x.a) ipChange.ipc$dispatch("2a0af026", new Object[]{this});
        }
        f9x.a(true ^ hxh.a());
        i iVar = new i(new b(this));
        g(iVar);
        return iVar;
    }

    @Override // tb.t5x
    public t5x addInstanceListener(j6x j6xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t5x) ipChange.ipc$dispatch("afb8e4da", new Object[]{this, j6xVar});
        }
        ((ArrayList) this.j).add(j6xVar);
        return this;
    }

    @Override // tb.t5x
    public t5x.a b(b6x b6xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t5x.a) ipChange.ipc$dispatch("c2dacab7", new Object[]{this, b6xVar});
        }
        i iVar = new i(b6xVar);
        hxh.b(new a(iVar));
        return iVar;
    }

    @Override // tb.t5x
    public t5x c(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t5x) ipChange.ipc$dispatch("e76dcaf2", new Object[]{this, new Integer(i2), new Integer(i3)});
        }
        this.h = true;
        this.f29169a.add(new c(i2, i3));
        return this;
    }

    public final void g(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa702862", new Object[]{this, iVar});
            return;
        }
        WeexInstanceConfig weexInstanceConfig = this.g;
        if (this.h) {
            if (weexInstanceConfig == null) {
                weexInstanceConfig = new WeexInstanceConfig();
            }
            WeexUnicornConfig f2 = weexInstanceConfig.f();
            if (f2 == null) {
                f2 = new WeexUnicornConfig();
                weexInstanceConfig.s(f2);
            }
            f2.h(true);
        }
        this.i = ((WeexFactoryImpl) com.taobao.android.weex.a.getInstance()).createInstanceInternal(this.b, this.c, this.d, this.e, this.f, weexInstanceConfig, null, true);
        Iterator it = ((ArrayList) this.j).iterator();
        while (it.hasNext()) {
            this.i.addInstanceListener((j6x) it.next());
        }
        Iterator<Runnable> it2 = this.f29169a.iterator();
        while (it2.hasNext()) {
            it2.next().run();
        }
        iVar.i(this.i);
    }

    @Override // tb.t5x
    public t5x initWithData(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t5x) ipChange.ipc$dispatch("f1904a9d", new Object[]{this, bArr, str});
        }
        f(str);
        this.f29169a.add(new e(bArr, str));
        return this;
    }

    @Override // tb.t5x
    public t5x initWithURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t5x) ipChange.ipc$dispatch("5711d40b", new Object[]{this, str});
        }
        f(str);
        this.f29169a.add(new d(str));
        return this;
    }

    @Override // tb.t5x
    public t5x render(WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t5x) ipChange.ipc$dispatch("69dbdc6", new Object[]{this, weexValue});
        }
        this.f29169a.add(new f(weexValue));
        return this;
    }

    @Override // tb.t5x
    public t5x setTag(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t5x) ipChange.ipc$dispatch("5b1c4ed0", new Object[]{this, str, obj});
        }
        this.f29169a.add(new g(str, obj));
        return this;
    }

    @Override // tb.t5x
    public t5x updateInstanceEnv(String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t5x) ipChange.ipc$dispatch("2e323009", new Object[]{this, str, weexValue});
        }
        this.f29169a.add(new h(str, weexValue));
        return this;
    }
}
