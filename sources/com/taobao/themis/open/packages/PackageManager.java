package com.taobao.themis.open.packages;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.open.resource.PackageInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import tb.acs;
import tb.bbs;
import tb.ckf;
import tb.cpx;
import tb.d1a;
import tb.ekd;
import tb.hpx;
import tb.ica;
import tb.jkl;
import tb.m5d;
import tb.n5d;
import tb.q9s;
import tb.s8o;
import tb.t2o;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PackageManager implements n5d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bbs f13645a;
    public final m5d b = new hpx();
    public final m5d c = new cpx();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements m5d.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jkl f13647a;
        public final /* synthetic */ PackageInfo.TYPE b;
        public final /* synthetic */ PackageManager c;
        public final /* synthetic */ n5d.b d;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ jkl f13648a;
            public final /* synthetic */ PackageInfo.TYPE b;
            public final /* synthetic */ String c;
            public final /* synthetic */ PackageManager d;
            public final /* synthetic */ n5d.b e;
            public final /* synthetic */ boolean f;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.themis.open.packages.PackageManager$b$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
            public /* synthetic */ class C0778a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    t2o.a(843055282);
                    int[] iArr = new int[PackageInfo.TYPE.values().length];
                    iArr[PackageInfo.TYPE.MAIN.ordinal()] = 1;
                    iArr[PackageInfo.TYPE.FRAMEWORK.ordinal()] = 2;
                    iArr[PackageInfo.TYPE.PLUGIN.ordinal()] = 3;
                    iArr[PackageInfo.TYPE.SUBPACKAGE.ordinal()] = 4;
                    iArr[PackageInfo.TYPE.OTHER.ordinal()] = 5;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public a(jkl jklVar, PackageInfo.TYPE type, String str, PackageManager packageManager, n5d.b bVar, boolean z) {
                this.f13648a = jklVar;
                this.b = type;
                this.c = str;
                this.d = packageManager;
                this.e = bVar;
                this.f = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                s8o s8oVar = new s8o(new PackageInfo(this.f13648a.c(), this.f13648a.a(), this.f13648a.d(), this.b, this.c));
                PackageInfo.TYPE type = this.b;
                PackageManager packageManager = this.d;
                n5d.b bVar = this.e;
                String str = this.c;
                boolean z = this.f;
                if (s8oVar.d()) {
                    int i = C0778a.$EnumSwitchMapping$0[type.ordinal()];
                    if (i == 1) {
                        ekd ekdVar = (ekd) packageManager.W().getExtension(ekd.class);
                        if (ekdVar != null) {
                            ekdVar.l0(s8oVar);
                        }
                    } else if (i == 2) {
                        ekd ekdVar2 = (ekd) packageManager.W().getExtension(ekd.class);
                        if (ekdVar2 != null) {
                            ekdVar2.r(s8oVar);
                        }
                        if (!q9s.m()) {
                            ica.a().b(s8oVar);
                        }
                    } else if (i == 3) {
                        ekd ekdVar3 = (ekd) packageManager.W().getExtension(ekd.class);
                        if (ekdVar3 != null) {
                            ekdVar3.u(s8oVar);
                        }
                    } else if (i == 4) {
                        ekd ekdVar4 = (ekd) packageManager.W().getExtension(ekd.class);
                        if (ekdVar4 != null) {
                            ekdVar4.m(s8oVar);
                        }
                    } else if (i != 5) {
                        TMSLogger.b("PackageManager", "current not support unknown type");
                    } else {
                        TMSLogger.b("PackageManager", "current not support other type package");
                    }
                    if (bVar != null) {
                        bVar.a(str, z);
                    }
                } else if (bVar != null) {
                    bVar.b(2, "parse error");
                }
            }
        }

        public b(jkl jklVar, PackageInfo.TYPE type, PackageManager packageManager, n5d.b bVar) {
            this.f13647a = jklVar;
            this.b = type;
            this.c = packageManager;
            this.d = bVar;
        }

        @Override // tb.m5d.c
        public void a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a53ae29", new Object[]{this, str, new Boolean(z)});
                return;
            }
            ckf.g(str, "filePath");
            new Thread(new a(this.f13647a, this.b, str, this.c, this.d, z)).start();
        }

        @Override // tb.m5d.c
        public void b(m5d.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79bd4dfc", new Object[]{this, bVar});
                return;
            }
            ckf.g(bVar, "error");
            n5d.b bVar2 = this.d;
            if (bVar2 != null) {
                bVar2.b(bVar.a(), bVar.b());
            }
        }

        @Override // tb.m5d.c
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                return;
            }
            n5d.b bVar = this.d;
            if (bVar != null) {
                bVar.onDownloadProgress(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements m5d.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m5d.c f13649a;
        public final /* synthetic */ Ref$BooleanRef b;
        public final /* synthetic */ PackageManager c;
        public final /* synthetic */ jkl d;

        public c(m5d.c cVar, Ref$BooleanRef ref$BooleanRef, PackageManager packageManager, jkl jklVar) {
            this.f13649a = cVar;
            this.b = ref$BooleanRef;
            this.c = packageManager;
            this.d = jklVar;
        }

        @Override // tb.m5d.c
        public void a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a53ae29", new Object[]{this, str, new Boolean(z)});
                return;
            }
            ckf.g(str, "filePath");
            this.f13649a.a(str, z);
        }

        @Override // tb.m5d.c
        public void b(m5d.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79bd4dfc", new Object[]{this, bVar});
                return;
            }
            ckf.g(bVar, "error");
            Ref$BooleanRef ref$BooleanRef = this.b;
            if (ref$BooleanRef.element) {
                this.f13649a.b(bVar);
                return;
            }
            ref$BooleanRef.element = true;
            PackageManager.t(this.c).a(this.d, this);
        }

        @Override // tb.m5d.c
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
            } else {
                this.f13649a.onDownloadProgress(i);
            }
        }
    }

    static {
        t2o.a(843055276);
        t2o.a(843055253);
    }

    public PackageManager(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
        this.f13645a = bbsVar;
    }

    public static final /* synthetic */ m5d.a b(PackageManager packageManager, jkl jklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m5d.a) ipChange.ipc$dispatch("37fe1b06", new Object[]{packageManager, jklVar});
        }
        return packageManager.U(jklVar);
    }

    public static final /* synthetic */ m5d t(PackageManager packageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m5d) ipChange.ipc$dispatch("6c0b9b2c", new Object[]{packageManager});
        }
        return packageManager.c;
    }

    public static final /* synthetic */ String y(PackageManager packageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84a04514", new Object[]{packageManager});
        }
        packageManager.getClass();
        return "PackageManager";
    }

    public final void I(jkl jklVar, PackageInfo.TYPE type, n5d.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2740eb79", new Object[]{this, jklVar, type, bVar});
        } else {
            O(jklVar, new b(jklVar, type, this, bVar));
        }
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
        } else {
            n5d.c.a(this, bbsVar);
        }
    }

    public final void O(jkl jklVar, m5d.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1dc3d9a", new Object[]{this, jklVar, cVar});
        } else {
            ((hpx) this.b).a(jklVar, new c(cVar, new Ref$BooleanRef(), this, jklVar));
        }
    }

    public final m5d.a U(jkl jklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m5d.a) ipChange.ipc$dispatch("e7c62cbb", new Object[]{this, jklVar});
        }
        m5d.a b2 = ((hpx) this.b).b(jklVar);
        if (b2.c()) {
            return b2;
        }
        return ((cpx) this.c).b(jklVar);
    }

    public final bbs W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("57ded820", new Object[]{this});
        }
        return this.f13645a;
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            n5d.c.b(this);
        }
    }

    @Override // tb.n5d
    public void d0(jkl jklVar, jkl jklVar2, List<jkl> list, n5d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("338a8090", new Object[]{this, jklVar, jklVar2, list, aVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (jklVar != null && !z(jklVar)) {
            arrayList.add(new Pair(jklVar, PackageInfo.TYPE.FRAMEWORK));
        }
        if (jklVar2 != null) {
            arrayList.add(new Pair(jklVar2, PackageInfo.TYPE.MAIN));
        }
        if (list != null) {
            for (jkl jklVar3 : list) {
                arrayList.add(new Pair(jklVar3, PackageInfo.TYPE.PLUGIN));
            }
        }
        int size = arrayList.size();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        PackageManager$starLoadAppPackage$checkCountFunction$1 packageManager$starLoadAppPackage$checkCountFunction$1 = new PackageManager$starLoadAppPackage$checkCountFunction$1(ref$IntRef, size, this, aVar);
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        PackageManager$starLoadAppPackage$finishCall$1 packageManager$starLoadAppPackage$finishCall$1 = new PackageManager$starLoadAppPackage$finishCall$1(this, ref$BooleanRef, ref$IntRef, packageManager$starLoadAppPackage$checkCountFunction$1);
        PackageManager$starLoadAppPackage$failedCallback$1 packageManager$starLoadAppPackage$failedCallback$1 = new PackageManager$starLoadAppPackage$failedCallback$1(this, ref$BooleanRef, aVar);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            I((jkl) pair.getFirst(), (PackageInfo.TYPE) pair.getSecond(), new a(this, (jkl) pair.getFirst(), (PackageInfo.TYPE) pair.getSecond(), aVar, packageManager$starLoadAppPackage$finishCall$1, packageManager$starLoadAppPackage$failedCallback$1));
        }
    }

    @Override // tb.n5d
    public void k0(jkl jklVar, n5d.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5674a3a2", new Object[]{this, jklVar, bVar});
            return;
        }
        ckf.g(jklVar, "subPackageDownloadInfo");
        I(jklVar, PackageInfo.TYPE.SUBPACKAGE, bVar);
    }

    public final boolean z(jkl jklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5e9d86b", new Object[]{this, jklVar})).booleanValue();
        }
        if (jklVar == null) {
            return true;
        }
        for (s8o s8oVar : ica.a().a(jklVar.a())) {
            if (s8oVar != null && ckf.b(jklVar.d(), s8oVar.a().c())) {
                ekd ekdVar = (ekd) W().getExtension(ekd.class);
                if (ekdVar != null) {
                    ekdVar.r(s8oVar);
                }
                TMSLogger.b("PackageManager", "check framework valid in mem");
                return true;
            }
        }
        TMSLogger.b("PackageManager", "check framework not valid in mem");
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public final class a implements n5d.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final jkl f13646a;
        public final PackageInfo.TYPE b;
        public final n5d.a c;
        public final d1a<xhv> d;
        public final u1a<Integer, String, xhv> e;
        public final /* synthetic */ PackageManager f;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.themis.open.packages.PackageManager$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public /* synthetic */ class C0777a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                t2o.a(843055278);
                int[] iArr = new int[PackageInfo.TYPE.values().length];
                iArr[PackageInfo.TYPE.FRAMEWORK.ordinal()] = 1;
                iArr[PackageInfo.TYPE.PLUGIN.ordinal()] = 2;
                iArr[PackageInfo.TYPE.MAIN.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        static {
            t2o.a(843055277);
            t2o.a(843055255);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(PackageManager packageManager, jkl jklVar, PackageInfo.TYPE type, n5d.a aVar, d1a<xhv> d1aVar, u1a<? super Integer, ? super String, xhv> u1aVar) {
            ckf.g(packageManager, "this$0");
            ckf.g(jklVar, "packageDownloadInfo");
            ckf.g(type, "type");
            this.f = packageManager;
            this.f13646a = jklVar;
            this.b = type;
            this.c = aVar;
            this.d = d1aVar;
            this.e = u1aVar;
        }

        @Override // tb.n5d.b
        public void b(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f34c6e45", new Object[]{this, new Integer(i), str});
                return;
            }
            u1a<Integer, String, xhv> u1aVar = this.e;
            if (u1aVar != null) {
                u1aVar.invoke(Integer.valueOf(i), str);
            }
            String y = PackageManager.y(this.f);
            TMSLogger.b(y, "package : " + this.f13646a.a() + " download error : " + i + ", " + ((Object) str));
        }

        @Override // tb.n5d.b
        public void onDownloadProgress(int i) {
            n5d.a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                return;
            }
            int i2 = C0777a.$EnumSwitchMapping$0[this.b.ordinal()];
            if (i2 == 1) {
                n5d.a aVar2 = this.c;
                if (aVar2 != null) {
                    ((acs.a) aVar2).b(i);
                }
            } else if (i2 == 2) {
                n5d.a aVar3 = this.c;
                if (aVar3 != null) {
                    ((acs.a) aVar3).f(this.f13646a.a(), i);
                }
            } else if (i2 == 3 && (aVar = this.c) != null) {
                ((acs.a) aVar).d(i);
            }
        }

        @Override // tb.n5d.b
        public void a(String str, boolean z) {
            n5d.a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a53ae29", new Object[]{this, str, new Boolean(z)});
                return;
            }
            int i = C0777a.$EnumSwitchMapping$0[this.b.ordinal()];
            if (i == 1) {
                n5d.a aVar2 = this.c;
                if (aVar2 != null) {
                    ((acs.a) aVar2).a(z);
                }
            } else if (i == 2) {
                n5d.a aVar3 = this.c;
                if (aVar3 != null) {
                    ((acs.a) aVar3).e(this.f13646a.a(), z);
                }
            } else if (i == 3 && (aVar = this.c) != null) {
                ((acs.a) aVar).c(z);
            }
            d1a<xhv> d1aVar = this.d;
            if (d1aVar != null) {
                d1aVar.invoke();
            }
            String y = PackageManager.y(this.f);
            TMSLogger.b(y, "package : " + this.f13646a.a() + " download finish");
        }
    }
}
