package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.cache.OriginInfoMultiLevelCache;
import com.taobao.android.nanocompose.runtime.context.RenderContext;
import com.taobao.android.nanocompose.runtime.node.origin_node.OriginNode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class xiz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final t2z f31418a;
    public final i6z b;
    public final q7z c;
    public final WeakReference<RenderContext> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737445);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }

        public final void a(OriginNode originNode, d0z d0zVar, WeakReference<RenderContext> weakReference, hjz hjzVar, StringBuilder sb) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de2c1908", new Object[]{this, originNode, d0zVar, weakReference, hjzVar, sb});
                return;
            }
            ckf.g(originNode, "originNode");
            ckf.g(d0zVar, "bytesReader");
            ckf.g(weakReference, "renderContext");
            ckf.g(hjzVar, "originNodeParams");
            ckf.g(sb, "error");
            int x = d0zVar.x();
            if (x > 0) {
                do {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    OriginNode b = b(d0zVar, weakReference, hjzVar, sb2);
                    if (sb2.length() > 0) {
                        sb.append((CharSequence) sb2);
                    }
                    if (b != null) {
                        originNode.a(b);
                        continue;
                    }
                } while (i < x);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x016f  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01fb A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.taobao.android.nanocompose.runtime.node.origin_node.OriginNode b(tb.d0z r18, java.lang.ref.WeakReference<com.taobao.android.nanocompose.runtime.context.RenderContext> r19, tb.hjz r20, java.lang.StringBuilder r21) {
            /*
                Method dump skipped, instructions count: 533
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.xiz.a.b(tb.d0z, java.lang.ref.WeakReference, tb.hjz, java.lang.StringBuilder):com.taobao.android.nanocompose.runtime.node.origin_node.OriginNode");
        }
    }

    static {
        t2o.a(598737444);
    }

    public xiz(t2z t2zVar, i6z i6zVar, q7z q7zVar, WeakReference<RenderContext> weakReference) {
        ckf.g(t2zVar, "mConstantSectionResult");
        ckf.g(i6zVar, "mExpressionSectionResult");
        ckf.g(q7zVar, "mFunctionSectionResult");
        ckf.g(weakReference, "mRenderContext");
        this.f31418a = t2zVar;
        this.b = i6zVar;
        this.c = q7zVar;
        this.d = weakReference;
    }

    public final onz<OriginNode, String> a(byte[] bArr, int i, int i2) {
        fjz fjzVar;
        OriginNode originNode;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (onz) ipChange.ipc$dispatch("6a0e389e", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        }
        ckf.g(bArr, "data");
        int i4 = i2 + i;
        d0z d0zVar = new d0z(bArr, i, i4);
        if (i4 > bArr.length) {
            return new onz<>(4, null, "node section length is not enough");
        }
        int s = d0zVar.s();
        if (s <= 0) {
            return new onz<>(4, null, "node section count is not enough");
        }
        RenderContext renderContext = this.d.get();
        if (renderContext == null) {
            return new onz<>(4, null, "render context is null");
        }
        ArrayList arrayList = new ArrayList();
        fjz fjzVar2 = new fjz(arrayList);
        if (s > 0) {
            OriginNode originNode2 = null;
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                boolean z = i5 == 0;
                hjz hjzVar = r13;
                fjzVar = fjzVar2;
                hjz hjzVar2 = new hjz(d0zVar.x(), this.f31418a, this.b, this.c, fjzVar2, null);
                int x = d0zVar.x();
                if (x <= 0) {
                    return new onz<>(4, null, "node section count is not enough");
                }
                i2z c = renderContext.c(-73401881);
                if (c == null) {
                    return new onz<>(4, null, "Cannot find component descriptor for root view");
                }
                OriginNode originNode3 = new OriginNode(c, hjzVar, gjz.Companion.c(), !z, null);
                StringBuilder sb = new StringBuilder();
                if (x > 0) {
                    int i7 = 0;
                    while (true) {
                        i7 += i3;
                        psq.j(sb);
                        OriginNode b = Companion.b(d0zVar, this.d, hjzVar, sb);
                        if (sb.length() > 0) {
                            return new onz<>(4, null, sb.toString());
                        }
                        if (b != null) {
                            originNode3.a(b);
                        }
                        if (i7 >= x) {
                            break;
                        }
                        hjzVar = hjzVar;
                        i3 = 1;
                    }
                }
                arrayList.add(originNode3);
                if (i5 == 0) {
                    originNode2 = originNode3;
                }
                if (i6 >= s) {
                    originNode = originNode2;
                    break;
                }
                fjzVar2 = fjzVar;
                i5 = i6;
                i3 = 1;
            }
        } else {
            fjzVar = fjzVar2;
            originNode = null;
        }
        OriginInfoMultiLevelCache.INSTANCE.b(renderContext.a().a(), renderContext.m().b(), fjzVar);
        onz<OriginNode, String> onzVar = new onz<>(4, originNode, null);
        if (ciz.Companion.c()) {
            iiz.Companion.p("NODE_SECTION  read susscee");
        }
        return onzVar;
    }
}
