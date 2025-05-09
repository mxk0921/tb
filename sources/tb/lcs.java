package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.bbs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class lcs implements bbs.f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final CopyOnWriteArraySet<Integer> c = new CopyOnWriteArraySet<>();

    /* renamed from: a  reason: collision with root package name */
    public final bbs f23262a;
    public int b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909677);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final CopyOnWriteArraySet<Integer> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CopyOnWriteArraySet) ipChange.ipc$dispatch("1a807225", new Object[]{this});
            }
            return lcs.a();
        }

        public a() {
        }
    }

    static {
        t2o.a(839909676);
        t2o.a(839909407);
    }

    public lcs(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
        this.f23262a = bbsVar;
    }

    public static final /* synthetic */ CopyOnWriteArraySet a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArraySet) ipChange.ipc$dispatch("b208c18e", new Object[0]);
        }
        return c;
    }

    @Override // tb.bbs.f
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    @Override // tb.bbs.f
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.bbs.f
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    @Override // tb.bbs.f
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        boolean z = this.f23262a.O() == TMSContainerType.EMBEDDED || this.f23262a.a0() == TMSSolutionType.WEB_SINGLE_PAGE || this.f23262a.a0() == TMSSolutionType.UNIAPP;
        CopyOnWriteArraySet<Integer> copyOnWriteArraySet = c;
        if (!copyOnWriteArraySet.isEmpty() && this.b < q9s.q3("themis_common_config", "retryReloadNumber", 0) && z) {
            this.f23262a.o0();
            this.f23262a.f0();
            copyOnWriteArraySet.clear();
            this.b++;
        }
    }
}
