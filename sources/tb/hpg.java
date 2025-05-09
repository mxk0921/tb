package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hpg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f20799a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Queue<b> e = new LinkedList();

        /* renamed from: a  reason: collision with root package name */
        public int f20800a;
        public int b;
        public int c;
        public int d;

        public static /* synthetic */ void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c82e2d4", new Object[]{bVar});
            } else {
                bVar.d();
            }
        }

        public static /* synthetic */ b b(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f55e3c6", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)});
            }
            return c(i, i2, i3);
        }

        public static b c(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("40c8e33", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)});
            }
            b bVar = (b) ((LinkedList) e).poll();
            if (bVar == null) {
                bVar = new b();
            }
            bVar.f20800a = i;
            bVar.b = i2;
            bVar.c = i3;
            return bVar;
        }

        public final void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51af759a", new Object[]{this});
                return;
            }
            Queue<b> queue = e;
            if (((LinkedList) queue).size() < 100) {
                ((LinkedList) queue).add(this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements Comparator<b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("38692d5f", new Object[]{this, bVar, bVar2})).intValue();
            }
            int i = bVar.f20800a;
            int i2 = bVar2.f20800a;
            if (i < i2) {
                return -1;
            }
            if (i == i2) {
                int i3 = bVar.d;
                if (i3 == bVar2.d) {
                    return 0;
                }
                if (i3 == 0) {
                    return -1;
                }
            }
            return 1;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f20801a;
        public int b;
        public final int c;
        public final int d;
        public d e = null;
        public d f = null;

        public d(int i, int i2, int i3) {
            if (i > 0) {
                this.f20801a = (i3 - i2) + 1;
            }
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public hpg(int i) {
        this.f20799a = i;
    }

    public float a(View view, List<sew> list, View view2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f360534c", new Object[]{this, view, list, view2})).floatValue();
        }
        if (list == null || list.size() == 0) {
            return 0.0f;
        }
        int[] a2 = qgw.a(view, view2);
        int max = Math.max(0, a2[1]);
        int min = Math.min(qgw.screenHeight, a2[1] + view.getHeight());
        int max2 = Math.max(0, a2[0]);
        int min2 = Math.min(qgw.screenWidth, a2[0] + view.getWidth());
        int i2 = min2 - max2;
        if (i2 <= 0) {
            i2 = 0;
        }
        int i3 = min - max;
        if (i3 > 0) {
            i = i3;
        }
        int i4 = i2 * i;
        if (i4 == 0) {
            return 0.0f;
        }
        List<b> b2 = b(max, min, max2, min2, list);
        if (b2.size() == 0) {
            return 0.0f;
        }
        Collections.sort(b2, new c());
        float e = (e(max, min, b2) * 1.0f) / i4;
        for (b bVar : b2) {
            if (bVar != null) {
                b.a(bVar);
            }
        }
        return e;
    }

    public final List<b> b(int i, int i2, int i3, int i4, List<sew> list) {
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c5f2e5cc", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), list});
        }
        ArrayList arrayList = new ArrayList();
        for (sew sewVar : list) {
            int max = Math.max(i, sewVar.f27998a - this.f20799a);
            int min = Math.min(i2, sewVar.b + this.f20799a);
            if (max <= min) {
                int i6 = sewVar.c;
                int i7 = this.f20799a;
                if (i6 - i7 >= i3) {
                    i5 = i6 - i7;
                } else {
                    i5 = i3;
                }
                b b2 = b.b(i5, max, min);
                b2.d = 0;
                int i8 = sewVar.d + this.f20799a;
                if (i8 > i4) {
                    i8 = i4;
                }
                b b3 = b.b(i8, max, min);
                b3.d = 1;
                arrayList.add(b2);
                arrayList.add(b3);
            }
        }
        return arrayList;
    }

    public final void c(d dVar, b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82672c4", new Object[]{this, dVar, bVar, new Boolean(z)});
            return;
        }
        int i = dVar.c;
        int i2 = dVar.d;
        int i3 = bVar.b;
        if (i3 > i || bVar.c < i2) {
            int i4 = (i + i2) / 2;
            if (i4 >= i3) {
                if (dVar.e == null) {
                    dVar.e = new d(dVar.b, i, i4);
                }
                c(dVar.e, bVar, z);
            }
            if (i4 < bVar.c) {
                if (dVar.f == null) {
                    dVar.f = new d(dVar.b, i4 + 1, dVar.d);
                }
                c(dVar.f, bVar, z);
            }
            int d2 = d(dVar);
            dVar.b = d2;
            if (d2 > 0) {
                dVar.f20801a = (i2 - i) + 1;
                return;
            }
            dVar.f20801a = 0;
            d dVar2 = dVar.e;
            if (dVar2 != null) {
                dVar.f20801a = dVar2.f20801a;
            }
            d dVar3 = dVar.f;
            if (dVar3 != null) {
                dVar.f20801a += dVar3.f20801a;
                return;
            }
            return;
        }
        if (z) {
            dVar.b++;
        } else {
            dVar.b--;
        }
        d dVar4 = dVar.e;
        if (dVar4 != null) {
            c(dVar4, bVar, z);
        }
        d dVar5 = dVar.f;
        if (dVar5 != null) {
            c(dVar5, bVar, z);
        }
        if (dVar.b > 0) {
            dVar.f20801a = (i2 - i) + 1;
            return;
        }
        dVar.f20801a = 0;
        d dVar6 = dVar.e;
        if (dVar6 != null) {
            dVar.f20801a = dVar6.f20801a;
        }
        d dVar7 = dVar.f;
        if (dVar7 != null) {
            dVar.f20801a += dVar7.f20801a;
        }
    }

    public final int d(d dVar) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5468ebfa", new Object[]{this, dVar})).intValue();
        }
        d dVar2 = dVar.e;
        d dVar3 = dVar.f;
        if (dVar2 == null) {
            i = dVar.b;
        } else {
            i = dVar2.b;
        }
        if (dVar3 == null) {
            i2 = dVar.b;
        } else {
            i2 = dVar3.b;
        }
        return Math.min(i, i2);
    }

    public final int e(int i, int i2, List<b> list) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53896fbb", new Object[]{this, new Integer(i), new Integer(i2), list})).intValue();
        }
        d dVar = new d(0, i, i2);
        int i3 = 0;
        int i4 = 0;
        for (b bVar : list) {
            int i5 = bVar.f20800a;
            if (i5 > i4) {
                int i6 = dVar.f20801a;
                if (i6 > 1) {
                    i3 += (i5 - i4) * (i6 - 1);
                }
                i4 = i5;
            }
            if (bVar.d == 0) {
                z = true;
            } else {
                z = false;
            }
            c(dVar, bVar, z);
        }
        return i3;
    }
}
