package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.g;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup;
import tb.jfw;
import tb.t2o;
import tb.ut2;
import tb.zr7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f extends zr7 implements g.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public g f12154a;

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
            } else if (f.h(f.this) != null) {
                f.j(f.this).b1(f.i(f.this).getContext());
            }
        }
    }

    static {
        t2o.a(503316867);
        t2o.a(503316875);
    }

    public static /* synthetic */ View h(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("80864011", new Object[]{fVar});
        }
        return fVar.view;
    }

    public static /* synthetic */ View i(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a8cc8052", new Object[]{fVar});
        }
        return fVar.view;
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1015965122) {
            super.onLayoutChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Boolean) objArr[4]).booleanValue());
            return null;
        } else if (hashCode == 1052797818) {
            super.detach(((Boolean) objArr[0]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/TabBarHeaderComponent");
        }
    }

    public static /* synthetic */ n j(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("711e9a93", new Object[]{fVar});
        }
        return fVar.node;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.g.e
    public void b(int i, int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdc6e4f7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
            return;
        }
        V v = this.view;
        if (v != 0) {
            v.setTranslationY(i);
        }
        m(1.0f - ((-i) / i2));
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
        g gVar = this.f12154a;
        if (gVar != null) {
            gVar.o(this);
        }
    }

    /* renamed from: k */
    public b generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("7625b05a", new Object[]{this});
        }
        return new b();
    }

    /* renamed from: l */
    public FlatViewGroup onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlatViewGroup) ipChange.ipc$dispatch("58c6c4f2", new Object[]{this, context});
        }
        FlatViewGroup c = ut2.c(context);
        c.bindComponent(this);
        return c;
    }

    public final void m(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144f37d", new Object[]{this, new Float(f)});
        } else if (!((b) this.viewParams).x0) {
            V v = this.view;
            if (v != 0) {
                v.setAlpha(f);
            }
            P p = this.viewParams;
            if (p != 0) {
                p.T = f;
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutChanged(int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8e65c2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        super.onLayoutChanged(i, i2, i3, i4, z);
        V v = this.view;
        if (v != 0 && i != i3 && !z) {
            v.setTranslationY(0.0f);
            m(1.0f);
            g gVar = this.f12154a;
            if (gVar != null) {
                gVar.p();
                this.f12154a.post(new a());
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onViewCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6b63ab", new Object[]{this});
            return;
        }
        g d = g.d(this.node.P(), this, ((b) this.viewParams).w0);
        this.f12154a = d;
        d.e(this);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String[] w0;
        public boolean x0;
        public boolean y0;
        public int z0 = 0;

        static {
            t2o.a(503316869);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TabBarHeaderComponent$TabBarHeaderParams");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
            if (r9.equals("group") == false) goto L_0x0026;
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
                com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.tao.flexbox.layoutmanager.component.f.b.$ipChange
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
                r4 = -1
                int r5 = r9.hashCode()
                switch(r5) {
                    case -1545477013: goto L_0x004a;
                    case -892259863: goto L_0x003e;
                    case 46097734: goto L_0x0032;
                    case 98629247: goto L_0x0028;
                    default: goto L_0x0026;
                }
            L_0x0026:
                r0 = -1
                goto L_0x0055
            L_0x0028:
                java.lang.String r1 = "group"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0055
                goto L_0x0026
            L_0x0032:
                java.lang.String r0 = "init-sticky"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x003c
                goto L_0x0026
            L_0x003c:
                r0 = 2
                goto L_0x0055
            L_0x003e:
                java.lang.String r0 = "sticky"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x0048
                goto L_0x0026
            L_0x0048:
                r0 = 1
                goto L_0x0055
            L_0x004a:
                java.lang.String r0 = "threshold"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x0054
                goto L_0x0026
            L_0x0054:
                r0 = 0
            L_0x0055:
                switch(r0) {
                    case 0: goto L_0x0071;
                    case 1: goto L_0x006a;
                    case 2: goto L_0x0060;
                    case 3: goto L_0x0059;
                    default: goto L_0x0058;
                }
            L_0x0058:
                goto L_0x007b
            L_0x0059:
                java.lang.String[] r8 = tb.ir2.s(r10)
                r7.w0 = r8
                goto L_0x007b
            L_0x0060:
                java.lang.String r8 = "hidden"
                boolean r8 = r8.equals(r10)
                r7.y0 = r8
                goto L_0x007b
            L_0x006a:
                boolean r8 = tb.nwv.o(r10, r3)
                r7.x0 = r8
                goto L_0x007b
            L_0x0071:
                com.taobao.tao.flexbox.layoutmanager.core.n r9 = r7.g()
                int r8 = tb.jfw.G(r9, r8, r10)
                r7.z0 = r8
            L_0x007b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.f.b.v(android.content.Context, java.lang.String, java.lang.Object):void");
        }
    }
}
