package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.detail2.core.framework.data.global.NewDetailScreenConfig;
import tb.dh7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class abw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dh7 f15647a;
    public final cxj b;
    public faw c;
    public x3w d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float i;
    public float j;
    public boolean k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements dh7.l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352321641);
            t2o.a(352321930);
        }

        public b() {
        }

        @Override // tb.dh7.l
        public void a(int i, int i2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a5b043d", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            } else if (abw.r(abw.this) != null) {
                abw.r(abw.this).d();
            }
        }

        public /* synthetic */ b(abw abwVar, a aVar) {
            this();
        }
    }

    static {
        t2o.a(352321639);
    }

    public abw(dh7 dh7Var, cxj cxjVar) {
        b bVar = new b(this, null);
        this.f15647a = dh7Var;
        this.b = cxjVar;
        u();
        dh7Var.t(bVar);
    }

    public static /* synthetic */ boolean a(abw abwVar, dh7.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0f17bec", new Object[]{abwVar, jVar})).booleanValue();
        }
        return abwVar.x(jVar);
    }

    public static /* synthetic */ x3w b(abw abwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("4794b70e", new Object[]{abwVar});
        }
        return abwVar.d;
    }

    public static /* synthetic */ cxj c(abw abwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("54f917b5", new Object[]{abwVar});
        }
        return abwVar.b;
    }

    public static /* synthetic */ boolean d(abw abwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1dfad15", new Object[]{abwVar})).booleanValue();
        }
        return abwVar.k;
    }

    public static /* synthetic */ boolean e(abw abwVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b90e5b69", new Object[]{abwVar, new Boolean(z)})).booleanValue();
        }
        abwVar.k = z;
        return z;
    }

    public static /* synthetic */ float f(abw abwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8aa57dd0", new Object[]{abwVar})).floatValue();
        }
        return abwVar.i;
    }

    public static /* synthetic */ float g(abw abwVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19025952", new Object[]{abwVar, new Float(f)})).floatValue();
        }
        abwVar.i = f;
        return f;
    }

    public static /* synthetic */ float h(abw abwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2a4dc2f", new Object[]{abwVar})).floatValue();
        }
        return abwVar.j;
    }

    public static /* synthetic */ float i(abw abwVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0eec6d3", new Object[]{abwVar, new Float(f)})).floatValue();
        }
        abwVar.j = f;
        return f;
    }

    public static /* synthetic */ int j(abw abwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1aa43a91", new Object[]{abwVar})).intValue();
        }
        return abwVar.g;
    }

    public static /* synthetic */ int k(abw abwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88db3f9a", new Object[]{abwVar, new Integer(i)})).intValue();
        }
        abwVar.g = i;
        return i;
    }

    public static /* synthetic */ int l(abw abwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62a398f0", new Object[]{abwVar})).intValue();
        }
        return abwVar.h;
    }

    public static /* synthetic */ int m(abw abwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40c7ad1b", new Object[]{abwVar, new Integer(i)})).intValue();
        }
        abwVar.h = i;
        return i;
    }

    public static /* synthetic */ int n(abw abwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aaa2f74f", new Object[]{abwVar})).intValue();
        }
        return abwVar.e;
    }

    public static /* synthetic */ int o(abw abwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8b41a9c", new Object[]{abwVar, new Integer(i)})).intValue();
        }
        abwVar.e = i;
        return i;
    }

    public static /* synthetic */ int p(abw abwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2a255ae", new Object[]{abwVar})).intValue();
        }
        return abwVar.f;
    }

    public static /* synthetic */ int q(abw abwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0a0881d", new Object[]{abwVar, new Integer(i)})).intValue();
        }
        abwVar.f = i;
        return i;
    }

    public static /* synthetic */ faw r(abw abwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (faw) ipChange.ipc$dispatch("d5a996d4", new Object[]{abwVar});
        }
        return abwVar.c;
    }

    public static /* synthetic */ String s(abw abwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67930347", new Object[]{abwVar});
        }
        return abwVar.t();
    }

    public final String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("518ff4f2", new Object[]{this});
        }
        return this.b.j().B();
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b696aa", new Object[]{this});
        } else {
            this.f15647a.s(new a());
        }
    }

    public void v(x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10da218f", new Object[]{this, x3wVar});
        } else {
            this.d = x3wVar;
        }
    }

    public void w(faw fawVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f296599", new Object[]{this, fawVar});
        } else {
            this.c = fawVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements dh7.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.dh7.k
        public void a(dh7.j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fe7ec9", new Object[]{this, jVar});
            } else if (abw.a(abw.this, jVar)) {
                float f = (jVar.d - abw.f(abw.this)) / (abw.h(abw.this) - abw.f(abw.this));
                int j = (int) (abw.j(abw.this) - ((abw.j(abw.this) - abw.l(abw.this)) * f));
                int n = (int) (abw.n(abw.this) - ((abw.n(abw.this) - abw.p(abw.this)) * f));
                abw.r(abw.this).c(j, n);
                txj.e(txj.TAG_VIDEO_ZOOM, "页面：" + abw.s(abw.this) + " " + abw.b(abw.this).f31127a + "调整height: " + j + ", marginTop: " + n + ", ratio: " + f);
            }
        }

        @Override // tb.dh7.k
        public void b(String str, dh7.j jVar) {
            qrc m;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7685d0c3", new Object[]{this, str, jVar});
            } else if (!abw.a(abw.this, jVar) || (m = abw.r(abw.this).m()) == null) {
            } else {
                if (IAKPopRender.LifecycleType.IN_ANIMATION_START.equals(str)) {
                    abw.g(abw.this, jVar.f17820a);
                    abw.i(abw.this, jVar.b);
                    abw.o(abw.this, m.e);
                    abw abwVar = abw.this;
                    abw.q(abwVar, cxo.c(abw.c(abwVar).i()));
                    abw.k(abw.this, m.c);
                    abw abwVar2 = abw.this;
                    abw.m(abwVar2, ((int) jVar.b) - cxo.c(abw.c(abwVar2).i()));
                    txj.e(txj.TAG_VIDEO_ZOOM, "页面：" + abw.s(abw.this) + " " + abw.b(abw.this).f31127a + "IN_ANIMATION_START, popStartY: " + jVar.f17820a + ", popEndY: " + jVar.b + ", videoStartMarginTop: " + abw.n(abw.this) + ", videoEndMarginTop: " + abw.p(abw.this) + ", videoStartHeight: " + abw.j(abw.this) + ", videoEndHeight: " + abw.l(abw.this));
                } else if (IAKPopRender.LifecycleType.PAN_ANIMATION_RECOVER_START.equals(str)) {
                    if (jVar.b > jVar.f17820a) {
                        abw.e(abw.this, true);
                    } else {
                        abw.e(abw.this, false);
                    }
                    txj.e(txj.TAG_VIDEO_ZOOM, "页面：" + abw.s(abw.this) + " " + abw.b(abw.this).f31127a + str + ", position.startY: " + jVar.f17820a + ", position.endY: " + jVar.b);
                } else if (IAKPopRender.LifecycleType.IN_ANIMATION_END.equals(str)) {
                    txj.e(txj.TAG_VIDEO_ZOOM, "页面：" + abw.s(abw.this) + " " + abw.b(abw.this).f31127a + str + ", videoEndMarginTop: " + abw.p(abw.this) + ", videoEndHeight: " + abw.l(abw.this));
                    abw.r(abw.this).c(abw.l(abw.this), abw.p(abw.this));
                } else if (IAKPopRender.LifecycleType.PAN_ANIMATION_RECOVER_END.equals(str)) {
                    if (!abw.d(abw.this)) {
                        abw.r(abw.this).c(abw.l(abw.this), abw.p(abw.this));
                        txj.e(txj.TAG_VIDEO_ZOOM, "页面：" + abw.s(abw.this) + " " + abw.b(abw.this).f31127a + str + ", videoEndMarginTop: " + abw.p(abw.this) + ", videoEndHeight: " + abw.l(abw.this));
                    }
                } else if (IAKPopRender.LifecycleType.BEFORE_CLOSE.equals(str)) {
                    txj.e(txj.TAG_VIDEO_ZOOM, "页面：" + abw.s(abw.this) + " " + abw.b(abw.this).f31127a + str + ", size.showMarginTop: " + m.e + ", size.showHeight: " + m.c);
                    abw.r(abw.this).c(m.c, m.e);
                }
            }
        }
    }

    public final boolean x(dh7.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("827023ba", new Object[]{this, jVar})).booleanValue();
        }
        if (jVar == null) {
            txj.e(txj.TAG_VIDEO_ZOOM, "页面：" + t() + " position为空,不响应");
            return false;
        }
        x3w B = this.f15647a.B();
        if (B == null) {
            txj.e(txj.TAG_VIDEO_ZOOM, "页面：" + t() + " currentDisplayNode为空,不响应");
            return false;
        }
        x3w x3wVar = this.d;
        if (x3wVar == null) {
            txj.e(txj.TAG_VIDEO_ZOOM, "页面：" + t() + " mCurrentNode为空,不响应");
            return false;
        } else if (!x3wVar.q()) {
            txj.e(txj.TAG_VIDEO_ZOOM, "页面：" + t() + " 开关关闭,不响应");
            return false;
        } else if (this.d.f31127a != B.f31127a) {
            txj.e(txj.TAG_VIDEO_ZOOM, "页面：" + t() + " currentIndex: " + this.d.f31127a + "displayIndex: " + B.f31127a + "不匹配, 不响应");
            return false;
        } else if (this.c == null) {
            txj.e(txj.TAG_VIDEO_ZOOM, "页面：" + t() + "播放器为空, 不响应");
            return false;
        } else {
            NewDetailScreenConfig.ScreenType a2 = this.b.j().K().a();
            if (!NewDetailScreenConfig.ScreenType.FOLD_DEVICE_LANDSCAPE.equals(a2) && !NewDetailScreenConfig.ScreenType.PAD_LANDSCAPE.equals(a2)) {
                return true;
            }
            txj.e(txj.TAG_PIC_ZOOM, "页面：" + t() + " screenType不支持，不响应");
            return false;
        }
    }
}
