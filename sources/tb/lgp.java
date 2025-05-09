package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lgp implements rkb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f23326a;
    public View b;
    public final List<a> c = new ArrayList();
    public final List<a> d = new ArrayList();
    public final List<a> e = new ArrayList();
    public final List<a> f = new ArrayList();
    public final cll g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Comparable<a> {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int c = 100;
        private static Queue<a> d = new LinkedList();

        /* renamed from: a  reason: collision with root package name */
        public int f23327a;
        public int b;

        public static a b(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b4e05976", new Object[]{new Integer(i), new Integer(i2)});
            }
            a poll = d.poll();
            if (poll == null) {
                poll = new a();
            }
            poll.f23327a = i;
            poll.b = i2;
            return poll;
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("42dc10c6", new Object[]{this, aVar})).intValue();
            }
            int i = this.f23327a;
            int i2 = aVar.f23327a;
            if (i > i2) {
                return 1;
            }
            if (i == i2) {
                return 0;
            }
            return -1;
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51af759a", new Object[]{this});
                return;
            }
            if (d.size() < 100) {
                d.add(this);
            }
            this.f23327a = 0;
            this.b = 0;
        }
    }

    public lgp(cll cllVar) {
        this.g = cllVar;
        if (cllVar.J() || cllVar.M()) {
            cllVar.o();
        } else {
            cllVar.getPageName();
        }
    }

    @Override // tb.rkb
    public void a(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b6b95", new Object[]{this, view, view2});
            return;
        }
        this.f23326a = view;
        this.b = view2;
    }

    @Override // tb.rkb
    public eu2 b() {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eu2) ipChange.ipc$dispatch("c4772dca", new Object[]{this});
        }
        tew tewVar = new tew(this.f23326a, this.b);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        tewVar.b(arrayList, arrayList2);
        View d = tewVar.d();
        e(arrayList, this.c, this.d);
        e(arrayList2, this.e, this.f);
        List<a> f2 = f(this.e);
        List<a> f3 = f(this.f);
        float c = c(this.c, f2) / this.g.B();
        float c2 = c(this.d, f3) / this.g.q();
        float f4 = 0.4f;
        if (c > 0.6f) {
            f = 0.4f;
        } else {
            f = c * 0.5f;
        }
        if (c2 <= 0.8f) {
            f4 = c2 * 0.5f;
        }
        h(arrayList, this.c, this.d);
        h(arrayList2, this.e, this.f);
        g(f2);
        g(f3);
        tewVar.k();
        float f5 = f + f4;
        boolean e = tewVar.e();
        if (d == this.b) {
            d = null;
        }
        return new eu2(lgp.class, f5, e, d);
    }

    public final int c(List<a> list, List<a> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4baebcd", new Object[]{this, list, list2})).intValue();
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            a aVar = list.get(i5);
            if (i4 <= aVar.f23327a) {
                i = (i + i2) - d(i3, i4, list2);
                int i6 = aVar.f23327a;
                int i7 = aVar.b;
                int i8 = i7 - i6;
                i3 = i6;
                i2 = i8;
                i4 = i7;
            } else {
                int i9 = aVar.b;
                if (i4 < i9) {
                    i2 = i9 - i3;
                    i4 = i9;
                }
            }
        }
        return (i + i2) - d(i3, i4, list2);
    }

    public final int d(int i, int i2, List<a> list) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d17d80c", new Object[]{this, new Integer(i), new Integer(i2), list})).intValue();
        }
        if (list != null) {
            for (a aVar : list) {
                if (aVar.b >= i) {
                    int i4 = aVar.f23327a;
                    if (i2 < i4) {
                        break;
                    }
                    i3 += Math.min(aVar.b, i2) - Math.max(i4, i);
                }
            }
        }
        return i3;
    }

    public final void e(List<sew> list, List<a> list2, List<a> list3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec1fd965", new Object[]{this, list, list2, list3});
        } else if (list != null) {
            for (sew sewVar : list) {
                a b = a.b(sewVar.c, sewVar.d);
                a b2 = a.b(sewVar.f27998a, sewVar.b);
                list2.add(b);
                list3.add(b2);
            }
            Collections.sort(list2);
            Collections.sort(list3);
        }
    }

    public final List<a> f(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4131a003", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            a aVar = list.get(i3);
            if (i2 <= aVar.f23327a) {
                arrayList.add(a.b(i, i2));
                i = aVar.f23327a;
                i2 = aVar.b;
            } else {
                int i4 = aVar.b;
                if (i2 < i4) {
                    i2 = i4;
                }
            }
        }
        if (i != i2) {
            arrayList.add(a.b(i, i2));
        }
        return arrayList;
    }

    public final void g(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7438e8b", new Object[]{this, list});
        } else if (list != null) {
            for (a aVar : list) {
                aVar.d();
            }
            list.clear();
        }
    }

    public final void h(List<sew> list, List<a> list2, List<a> list3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8ddba6d", new Object[]{this, list, list2, list3});
            return;
        }
        if (list != null) {
            for (sew sewVar : list) {
                sewVar.c();
            }
            list.clear();
        }
        g(list2);
        g(list3);
    }
}
