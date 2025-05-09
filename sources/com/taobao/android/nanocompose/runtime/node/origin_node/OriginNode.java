package com.taobao.android.nanocompose.runtime.node.origin_node;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.a;
import tb.a07;
import tb.ckf;
import tb.d0z;
import tb.ejz;
import tb.hjz;
import tb.i2z;
import tb.jkz;
import tb.lfz;
import tb.mdz;
import tb.n7z;
import tb.ndz;
import tb.njg;
import tb.t2o;
import tb.y5z;
import tb.z5z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class OriginNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final i2z f9028a;
    public final hjz b;
    public final byte c;
    public final boolean d;
    public Object e;
    public final List<OriginNode> f;
    public final List<y5z> g;
    public final List<lfz> h;
    public final List<z5z> i;
    public final njg j;
    public Integer k;
    public final njg l;

    static {
        t2o.a(598737417);
    }

    public /* synthetic */ OriginNode(i2z i2zVar, hjz hjzVar, byte b, boolean z, a07 a07Var) {
        this(i2zVar, hjzVar, b, z);
    }

    public final void a(OriginNode originNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f96f163", new Object[]{this, originNode});
        } else if (originNode != null && this != originNode) {
            new WeakReference(this);
            ((ArrayList) this.f).add(originNode);
        }
    }

    public final void b(y5z y5zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8de33813", new Object[]{this, y5zVar});
            return;
        }
        ckf.g(y5zVar, "dynamicModifierInfo");
        ((ArrayList) this.g).add(y5zVar);
    }

    public final void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b0d13a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            ((ArrayList) this.i).add(new z5z(i, i2));
        }
    }

    public final void d(lfz lfzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1d06e1", new Object[]{this, lfzVar});
            return;
        }
        ckf.g(lfzVar, "modifierElement");
        ((ArrayList) this.h).add(lfzVar);
    }

    public final void e(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6daca654", new Object[]{this, new Integer(i), obj});
            return;
        }
        ckf.g(obj, "value");
        if (obj instanceof Integer) {
            s().h(i, ((Number) obj).intValue());
        } else if (obj instanceof Long) {
            s().i(i, ((Number) obj).longValue());
        } else if (obj instanceof Float) {
            s().k(i, ((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            s().j(i, ((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            s().g(i, (String) obj);
        } else if (obj instanceof Boolean) {
            s().l(i, ((Boolean) obj).booleanValue());
        } else {
            s().m(i, obj);
        }
    }

    public final mdz f(ndz ndzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdz) ipChange.ipc$dispatch("7fd5c9dd", new Object[]{this, ndzVar});
        }
        ckf.g(ndzVar, "params");
        i2z i2zVar = this.f9028a;
        mdz c = i2zVar == null ? null : i2zVar.c(ndzVar);
        ckf.d(c);
        return c;
    }

    public final List<OriginNode> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9e990726", new Object[]{this});
        }
        return this.f;
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7687a93e", new Object[]{this})).intValue();
        }
        return this.b.a();
    }

    public final i2z i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i2z) ipChange.ipc$dispatch("3406a12a", new Object[]{this});
        }
        return this.f9028a;
    }

    public final List<String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("140a7475", new Object[]{this});
        }
        return this.b.c().a();
    }

    public final List<y5z> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("efa99968", new Object[]{this});
        }
        return this.g;
    }

    public final List<z5z> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("25d1d21f", new Object[]{this});
        }
        return this.i;
    }

    public final List<d0z> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("521cd2c6", new Object[]{this});
        }
        return this.b.d().a();
    }

    public final Object n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3b2b1877", new Object[]{this});
        }
        return this.e;
    }

    public final List<n7z> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e650b8e8", new Object[]{this});
        }
        return this.b.e().a();
    }

    public final Integer p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("9640ad43", new Object[]{this});
        }
        return this.k;
    }

    public final ejz q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ejz) ipChange.ipc$dispatch("b46a5788", new Object[]{this});
        }
        return (ejz) this.l.getValue();
    }

    public final hjz r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hjz) ipChange.ipc$dispatch("63fb8d43", new Object[]{this});
        }
        return this.b;
    }

    public final jkz s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jkz) ipChange.ipc$dispatch("5f92a5e9", new Object[]{this});
        }
        return (jkz) this.j.getValue();
    }

    public final List<lfz> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("643b9a80", new Object[]{this});
        }
        return this.h;
    }

    public final byte u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76d39d16", new Object[]{this})).byteValue();
        }
        return this.c;
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14c18a11", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final void w(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f97a43", new Object[]{this, obj});
        } else {
            this.e = obj;
        }
    }

    public final void x(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35501ce7", new Object[]{this, num});
        } else {
            this.k = num;
        }
    }

    public OriginNode(i2z i2zVar, hjz hjzVar, byte b, boolean z) {
        this.f9028a = i2zVar;
        this.b = hjzVar;
        this.c = b;
        this.d = z;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = a.b(new OriginNode$props$2(this));
        this.l = a.b(new OriginNode$originNodeCoordinator$2(this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ OriginNode(tb.i2z r7, tb.hjz r8, byte r9, boolean r10, int r11, tb.a07 r12) {
        /*
            r6 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0005
            r7 = 0
        L_0x0005:
            r1 = r7
            r7 = r11 & 8
            if (r7 == 0) goto L_0x0014
            if (r1 != 0) goto L_0x000f
            r7 = 0
            r10 = 0
            goto L_0x0014
        L_0x000f:
            boolean r7 = r1.i()
            r10 = r7
        L_0x0014:
            r4 = r10
            r5 = 0
            r0 = r6
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.nanocompose.runtime.node.origin_node.OriginNode.<init>(tb.i2z, tb.hjz, byte, boolean, int, tb.a07):void");
    }
}
