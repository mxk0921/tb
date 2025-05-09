package com.taobao.tao.flexbox.layoutmanager.jscore;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.l;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import tb.dk8;
import tb.hk8;
import tb.igs;
import tb.nvf;
import tb.nwv;
import tb.od0;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TNodeJSCore implements nvf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String e;

    /* renamed from: a  reason: collision with root package name */
    public d f12299a;
    public AC b;
    public boolean c = false;
    public com.taobao.tao.flexbox.layoutmanager.jscore.a d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface AC {
        void _c(String str);

        long _nanotime();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TNodeJSCore.f(TNodeJSCore.this).destroy();
            TNodeJSCore.k(TNodeJSCore.this, true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12303a;
        public final /* synthetic */ hk8 b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ((dk8) b.this.b).a();
                }
            }
        }

        public b(String str, hk8 hk8Var) {
            this.f12303a = str;
            this.b = hk8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (TNodeJSCore.j(TNodeJSCore.this)) {
                    tfs.h("tnode jscore is destroyed");
                    return;
                }
                try {
                    igs.a("dispatch JS");
                    TNodeJSCore.f(TNodeJSCore.this).dispatchJS(this.f12303a);
                    igs.c();
                } catch (Exception e) {
                    e.printStackTrace();
                    igs.c();
                    if (this.b instanceof dk8) {
                        aVar = new a();
                    } else {
                        return;
                    }
                }
                if (this.b instanceof dk8) {
                    aVar = new a();
                    nwv.y0(aVar);
                }
            } catch (Throwable th) {
                if (this.b instanceof dk8) {
                    nwv.y0(new a());
                }
                throw th;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12305a;
        public final /* synthetic */ String b;

        public c(String str, String str2) {
            this.f12305a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                tfs.f("register JS Module:" + this.f12305a);
                igs.a("register JS Module:" + this.f12305a);
                if (!TNodeJSCore.f(TNodeJSCore.this).applyModule(this.f12305a, d.f(this.b))) {
                    TNodeJSCore.this.b("$.register", d.g(this.f12305a, this.b), null);
                }
                igs.c();
            } catch (Throwable th) {
                igs.c();
                th.printStackTrace();
            }
        }
    }

    public static /* synthetic */ AC d(TNodeJSCore tNodeJSCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AC) ipChange.ipc$dispatch("fe91b555", new Object[]{tNodeJSCore});
        }
        return tNodeJSCore.b;
    }

    public static /* synthetic */ AC e(TNodeJSCore tNodeJSCore, AC ac) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AC) ipChange.ipc$dispatch("5e4ce62e", new Object[]{tNodeJSCore, ac});
        }
        tNodeJSCore.b = ac;
        return ac;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.jscore.a f(TNodeJSCore tNodeJSCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.jscore.a) ipChange.ipc$dispatch("6177ca96", new Object[]{tNodeJSCore});
        }
        return tNodeJSCore.d;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.jscore.a g(TNodeJSCore tNodeJSCore, com.taobao.tao.flexbox.layoutmanager.jscore.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.jscore.a) ipChange.ipc$dispatch("303b676f", new Object[]{tNodeJSCore, aVar});
        }
        tNodeJSCore.d = aVar;
        return aVar;
    }

    public static /* synthetic */ String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("682607c7", new Object[0]);
        }
        return e;
    }

    public static /* synthetic */ String i(TNodeJSCore tNodeJSCore, o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a175bd7", new Object[]{tNodeJSCore, oVar});
        }
        return tNodeJSCore.n(oVar);
    }

    public static /* synthetic */ boolean j(TNodeJSCore tNodeJSCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7be23a4a", new Object[]{tNodeJSCore})).booleanValue();
        }
        return tNodeJSCore.c;
    }

    public static /* synthetic */ boolean k(TNodeJSCore tNodeJSCore, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e784c9d4", new Object[]{tNodeJSCore, new Boolean(z)})).booleanValue();
        }
        tNodeJSCore.c = z;
        return z;
    }

    public static String m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32ccaa82", new Object[]{str});
        }
        return ";(function (module) { return (function (nativeModule, module) {" + str + "; return module.exports; })(module, module);  });";
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[Catch: all -> 0x0055, TryCatch #1 {, blocks: (B:10:0x001a, B:12:0x003a, B:14:0x0048, B:16:0x004b, B:19:0x0058, B:21:0x005c, B:23:0x0062, B:24:0x006c, B:25:0x0075), top: B:32:0x001a, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void o() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L_0x000f
            java.lang.String r1 = "a4f43735"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.ipc$dispatch(r1, r2)
            return
        L_0x000f:
            java.lang.String r0 = com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore.e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0079
            java.lang.Class<com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore> r0 = com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore.class
            monitor-enter(r0)
            java.lang.String r1 = "loadCoreJS"
            tb.igs.a(r1)     // Catch: all -> 0x0055
            tb.od0 r1 = tb.od0.D()     // Catch: all -> 0x0055
            tb.hpb r1 = r1.g()     // Catch: all -> 0x0055
            java.lang.String r3 = "TNodeCoreURL"
            java.lang.String r4 = ""
            java.lang.Object r1 = r1.b(r3, r4)     // Catch: all -> 0x0055
            java.lang.String r1 = r1.toString()     // Catch: all -> 0x0055
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: all -> 0x0055
            if (r3 != 0) goto L_0x005b
            tb.od0 r3 = tb.od0.D()     // Catch: all -> 0x0055
            tb.o6c r3 = r3.l()     // Catch: all -> 0x0055
            byte[] r1 = r3.a(r1)     // Catch: all -> 0x0055
            if (r1 == 0) goto L_0x005b
            int r3 = r1.length     // Catch: all -> 0x0055
            if (r3 <= 0) goto L_0x005b
            java.lang.String r3 = new java.lang.String     // Catch: all -> 0x0055, UnsupportedEncodingException -> 0x0057
            int r4 = r1.length     // Catch: all -> 0x0055, UnsupportedEncodingException -> 0x0057
            java.lang.String r5 = "utf-8"
            r3.<init>(r1, r2, r4, r5)     // Catch: all -> 0x0055, UnsupportedEncodingException -> 0x0057
            goto L_0x005c
        L_0x0055:
            r1 = move-exception
            goto L_0x0077
        L_0x0057:
            r1 = move-exception
            r1.printStackTrace()     // Catch: all -> 0x0055
        L_0x005b:
            r3 = 0
        L_0x005c:
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: all -> 0x0055
            if (r1 == 0) goto L_0x006c
            java.lang.String r1 = "entry.html"
            android.content.Context r2 = com.taobao.tao.flexbox.layoutmanager.core.o.J()     // Catch: all -> 0x0055
            java.lang.String r3 = tb.nwv.d0(r1, r2)     // Catch: all -> 0x0055
        L_0x006c:
            java.lang.String r1 = m(r3)     // Catch: all -> 0x0055
            com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore.e = r1     // Catch: all -> 0x0055
            tb.igs.c()     // Catch: all -> 0x0055
            monitor-exit(r0)     // Catch: all -> 0x0055
            goto L_0x0079
        L_0x0077:
            monitor-exit(r0)     // Catch: all -> 0x0055
            throw r1
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore.o():void");
    }

    public static int p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("758bd0b3", new Object[]{new Integer(i)})).intValue();
        }
        if (i == 0 || i == 1) {
            return 3;
        }
        if (i == 2) {
            return 5;
        }
        if (i != 3) {
            return 4;
        }
        return 6;
    }

    @Override // tb.nvf
    public void a(final Context context, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9e46973", new Object[]{this, context, dVar});
            return;
        }
        this.f12299a = dVar;
        final long nanoTime = System.nanoTime();
        dVar.s().k1(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TNodeJSCore.e(TNodeJSCore.this, new AC() { // from class: com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore.AC
                    public void _c(String str) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("c9d8375", new Object[]{this, str});
                            return;
                        }
                        igs.a("dispatch JSMessage");
                        dVar.l(str);
                        igs.c();
                    }

                    @Override // com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore.AC
                    public long _nanotime() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            return ((Number) ipChange3.ipc$dispatch("f2995b", new Object[]{this})).longValue();
                        }
                        return System.nanoTime();
                    }
                });
                TNodeJSCore.g(TNodeJSCore.this, new JSIImpl(TNodeJSCore.this));
                tfs.f("initJSCore");
                igs.a("initJSCore");
                com.taobao.tao.flexbox.layoutmanager.jscore.a f = TNodeJSCore.f(TNodeJSCore.this);
                d dVar2 = dVar;
                f.initJSCore(dVar2, dVar2.s().X());
                igs.c();
                TNodeJSCore.o();
                tfs.f("initJSContext");
                igs.a("initJSContext");
                TNodeJSCore.f(TNodeJSCore.this).initJSContext(context, this, TNodeJSCore.h(), TNodeJSCore.d(TNodeJSCore.this), TNodeJSCore.i(TNodeJSCore.this, dVar.s()));
                igs.c();
                l.i(dVar.s(), null, System.nanoTime() - nanoTime, "JSICore", true);
            }
        });
    }

    @Override // tb.nvf
    public void b(String str, String str2, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1493d4b9", new Object[]{this, str, str2, hk8Var});
        } else {
            this.f12299a.s().k1(new b(str2, hk8Var));
        }
    }

    @Override // tb.nvf
    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a7c6d3", new Object[]{this, str, str2});
        } else {
            this.f12299a.s().k1(new c(str, str2));
        }
    }

    @Override // tb.nvf
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f12299a.s().k1(new a());
        }
    }

    public void l(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eed772c", new Object[]{this, new Integer(i), str});
            return;
        }
        if (i == 2) {
            od0.D().p().a("TNodeJS", str);
        } else if (i == 3) {
            od0.D().p().logd("TNodeJS", str);
        } else if (i == 4) {
            od0.D().p().logi("TNodeJS", str);
        } else if (i == 5) {
            od0.D().p().logw("TNodeJS", str);
        } else if (i == 6) {
            od0.D().p().loge("TNodeJS", str);
        }
        this.f12299a.s().h0().appendJSLog(i, str, false);
    }

    public final String n(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d5f4588c", new Object[]{this, oVar});
        }
        String Z = oVar.Z();
        if (TextUtils.isEmpty(Z) && oVar.d0() != null) {
            Z = oVar.d0().X().f12242a;
        }
        return TextUtils.isEmpty(Z) ? "unknown" : Z;
    }
}
