package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class f43 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b43 f18989a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a<T> implements Comparator {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a<T> INSTANCE = new a<>();

        /* renamed from: a */
        public final int compare(pei peiVar, pei peiVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c70679ad", new Object[]{this, peiVar, peiVar2})).intValue();
            }
            return (int) (peiVar2.c() - peiVar.c());
        }
    }

    public f43(b43 b43Var) {
        this.f18989a = b43Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<pei> i = rdi.i(this.f18989a.G().E(), true, b43.O(this.f18989a));
        if (!i.isEmpty()) {
            arrayList.addAll(i);
        }
        List<pei> i2 = rdi.i(this.f18989a.G().E(), false, b43.O(this.f18989a));
        if (!i2.isEmpty()) {
            arrayList.addAll(i2);
            z = true;
        }
        b43.P(this.f18989a, -1L);
        if (!arrayList.isEmpty()) {
            if (z) {
                c04.u(arrayList, a.INSTANCE);
            }
            b43.N(this.f18989a).post(new b(this.f18989a, arrayList));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b43 f18990a;
        public final /* synthetic */ List<pei> b;

        public b(b43 b43Var, List<pei> list) {
            this.f18990a = b43Var;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            zs9 N0 = this.f18990a.G().N0();
            zs9 d = this.f18990a.Q().d();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            for (pei peiVar : this.b) {
                String b = rdi.INSTANCE.b(peiVar);
                if (!TextUtils.isEmpty(b)) {
                    String str = null;
                    if (peiVar.p()) {
                        String g = peiVar.g();
                        ckf.f(g, "mediaItem.path");
                        if (!tsq.w(g, ryp.FILE_TYPE_VIDEO_MP4, false, 2, null)) {
                        }
                    }
                    if (peiVar.p()) {
                        i5++;
                    }
                    i2++;
                    if (peiVar.m()) {
                        i3++;
                        this.f18990a.Q().e().addFirst(peiVar);
                    }
                    if (N0 != null) {
                        str = N0.h();
                    }
                    if (ckf.b(b, str)) {
                        i4++;
                        N0.f().addFirst(peiVar);
                        if (peiVar.p()) {
                            N0.i().addFirst(peiVar);
                        }
                    } else {
                        zs9 c = this.f18990a.Q().c(b);
                        if (c == null) {
                            zs9 zs9Var = new zs9(b);
                            zs9Var.f().add(peiVar);
                            if (peiVar.p()) {
                                zs9Var.i().add(peiVar);
                            }
                            this.f18990a.Q().b().add(zs9Var);
                        } else {
                            c.b(peiVar);
                        }
                    }
                    if (d != null) {
                        d.b(peiVar);
                    }
                }
            }
            int O0 = this.f18990a.G().O0();
            if (ckf.b(d, N0)) {
                i = i2;
            } else if (O0 == 2) {
                i = i3;
            } else if (O0 == 1) {
                i = i5;
            } else if (i4 > 0) {
                i = i4;
            }
            this.f18990a.G().R0(i);
        }
    }
}
