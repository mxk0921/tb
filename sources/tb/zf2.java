package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.BrowserComponent;
import com.taobao.tao.flexbox.layoutmanager.core.j;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.view.BlurViewGroup;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zf2 extends zr7 implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f32718a = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f32719a;

        /* compiled from: Taobao */
        /* renamed from: tb.zf2$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C1115a implements n.e<n> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C1115a(a aVar) {
            }

            /* renamed from: c */
            public boolean a(n nVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("e13bdd0a", new Object[]{this, nVar})).booleanValue();
                }
                if (nwv.o(nVar.H("effect-view"), false)) {
                    return true;
                }
                return false;
            }

            /* renamed from: d */
            public boolean b(n nVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("429eb190", new Object[]{this, nVar})).booleanValue();
                }
                return false;
            }
        }

        public a(n nVar) {
            this.f32719a = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            n z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (zf2.h(zf2.this) != null) {
                if (((BlurViewGroup) zf2.i(zf2.this)).getTargetBlurView() == null && (z = this.f32719a.z(com.taobao.tao.flexbox.layoutmanager.component.a.class, new C1115a(this), false)) != null) {
                    ((BlurViewGroup) zf2.j(zf2.this)).setTargetBlurView(z.w0());
                }
                ((BlurViewGroup) zf2.k(zf2.this)).refreshBG();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f32720a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements n.e<n> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(b bVar) {
            }

            /* renamed from: c */
            public boolean a(n nVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("e13bdd0a", new Object[]{this, nVar})).booleanValue();
                }
                if (nwv.o(nVar.H("effect-view"), false)) {
                    return true;
                }
                return false;
            }

            /* renamed from: d */
            public boolean b(n nVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("429eb190", new Object[]{this, nVar})).booleanValue();
                }
                return false;
            }
        }

        public b(n nVar) {
            this.f32720a = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            n z;
            n x;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (zf2.l(zf2.this) != null) {
                if (!(((BlurViewGroup) zf2.m(zf2.this)).getTargetBlurView() != null || (z = this.f32720a.z(vmp.class, null, true)) == null || (x = z.x(BrowserComponent.class)) == null)) {
                    View w0 = x.w0();
                    n y = ((BrowserComponent) x.K()).y();
                    ArrayList arrayList = new ArrayList();
                    y.C(new a(this), arrayList, 2);
                    if (!arrayList.isEmpty()) {
                        w0 = ((n) arrayList.get(0)).w0();
                    }
                    ((BlurViewGroup) zf2.n(zf2.this)).setTargetBlurView(w0);
                }
                ((BlurViewGroup) zf2.o(zf2.this)).refreshBG();
            }
        }
    }

    static {
        t2o.a(503316685);
        t2o.a(503317092);
    }

    public static /* synthetic */ View h(zf2 zf2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b16f300d", new Object[]{zf2Var});
        }
        return zf2Var.view;
    }

    public static /* synthetic */ View i(zf2 zf2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1ff6414e", new Object[]{zf2Var});
        }
        return zf2Var.view;
    }

    public static /* synthetic */ Object ipc$super(zf2 zf2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -703216504) {
            super.applyAttrForView((View) objArr[0], (jfw) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        } else if (hashCode == 1052797818) {
            super.detach(((Boolean) objArr[0]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/BlurComponent");
        }
    }

    public static /* synthetic */ View j(zf2 zf2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8e7d528f", new Object[]{zf2Var});
        }
        return zf2Var.view;
    }

    public static /* synthetic */ View k(zf2 zf2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fd0463d0", new Object[]{zf2Var});
        }
        return zf2Var.view;
    }

    public static /* synthetic */ View l(zf2 zf2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6b8b7511", new Object[]{zf2Var});
        }
        return zf2Var.view;
    }

    public static /* synthetic */ View m(zf2 zf2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("da128652", new Object[]{zf2Var});
        }
        return zf2Var.view;
    }

    public static /* synthetic */ View n(zf2 zf2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("48999793", new Object[]{zf2Var});
        }
        return zf2Var.view;
    }

    public static /* synthetic */ View o(zf2 zf2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b720a8d4", new Object[]{zf2Var});
        }
        return zf2Var.view;
    }

    @Override // tb.zr7, com.taobao.tao.flexbox.layoutmanager.core.Component
    public void applyAttrForView(View view, jfw jfwVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d615c488", new Object[]{this, view, jfwVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(view, jfwVar, map, z);
        if (this.f32718a) {
            BlurViewGroup blurViewGroup = (BlurViewGroup) view;
            blurViewGroup.setViewParams(jfwVar);
            blurViewGroup.setOriginBackground(view.getBackground());
            this.f32718a = false;
        }
    }

    @Override // tb.zr7, com.taobao.tao.flexbox.layoutmanager.core.c
    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.zr7, com.taobao.tao.flexbox.layoutmanager.core.c, com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        super.detach(z);
        this.f32718a = true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public jfw generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("c0ace32c", new Object[]{this});
        }
        return new c(this);
    }

    @Override // tb.zr7
    public boolean needRecycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98f38ff2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.zr7, com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        BlurViewGroup blurViewGroup = new BlurViewGroup(context);
        blurViewGroup.setBlurRadius(((c) this.viewParams).w0);
        blurViewGroup.setScaleRadius(((c) this.viewParams).x0);
        blurViewGroup.bindComponent(this);
        return blurViewGroup;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleMessage(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e782cf4", new Object[]{this, gVar})).booleanValue();
        }
        return onHandleTNodeMessage(gVar.b, gVar.c, gVar.d, null, gVar.e, gVar.g);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        if ("onBlurViewRefresh".equals(str)) {
            if (((c) this.viewParams).y0) {
                nwv.y0(new a(nVar));
            }
        } else if ("onstatechanged".equals(str)) {
            if (1 == nwv.t(map.get("state"), -1)) {
                nwv.y0(new b(nVar));
            }
            return true;
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int w0 = 25;
        public int x0 = 10;
        public boolean y0 = false;

        static {
            t2o.a(503316690);
        }

        public c(zf2 zf2Var) {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/BlurComponent$BlurViewParams");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
            if (r9.equals("blur-normal-state") == false) goto L_0x0026;
         */
        @Override // tb.jfw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void v(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
            /*
                r7 = this;
                r0 = 3
                r1 = 2
                r2 = 1
                r3 = 0
                com.android.alibaba.ip.runtime.IpChange r4 = tb.zf2.c.$ipChange
                boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r5 == 0) goto L_0x001b
                java.lang.String r5 = "e7bb1f3f"
                r6 = 4
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r6[r3] = r7
                r6[r2] = r8
                r6[r1] = r9
                r6[r0] = r10
                r4.ipc$dispatch(r5, r6)
                return
            L_0x001b:
                r9.hashCode()
                r8 = -1
                int r4 = r9.hashCode()
                switch(r4) {
                    case 109780401: goto L_0x0048;
                    case 681292984: goto L_0x003d;
                    case 911124085: goto L_0x0031;
                    case 1707220945: goto L_0x0028;
                    default: goto L_0x0026;
                }
            L_0x0026:
                r0 = -1
                goto L_0x0053
            L_0x0028:
                java.lang.String r1 = "blur-normal-state"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0053
                goto L_0x0026
            L_0x0031:
                java.lang.String r0 = "scale-radius"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x003b
                goto L_0x0026
            L_0x003b:
                r0 = 2
                goto L_0x0053
            L_0x003d:
                java.lang.String r0 = "blur-radius"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x0046
                goto L_0x0026
            L_0x0046:
                r0 = 1
                goto L_0x0053
            L_0x0048:
                java.lang.String r0 = "style"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x0052
                goto L_0x0026
            L_0x0052:
                r0 = 0
            L_0x0053:
                switch(r0) {
                    case 0: goto L_0x0070;
                    case 1: goto L_0x0067;
                    case 2: goto L_0x005e;
                    case 3: goto L_0x0057;
                    default: goto L_0x0056;
                }
            L_0x0056:
                goto L_0x0076
            L_0x0057:
                boolean r8 = tb.nwv.o(r10, r3)
                r7.y0 = r8
                goto L_0x0076
            L_0x005e:
                r8 = 10
                int r8 = tb.nwv.t(r10, r8)
                r7.x0 = r8
                goto L_0x0076
            L_0x0067:
                r8 = 25
                int r8 = tb.nwv.t(r10, r8)
                r7.w0 = r8
                goto L_0x0076
            L_0x0070:
                java.lang.String r8 = "light"
                tb.nwv.I(r10, r8)
            L_0x0076:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.zf2.c.v(android.content.Context, java.lang.String, java.lang.Object):void");
        }
    }
}
