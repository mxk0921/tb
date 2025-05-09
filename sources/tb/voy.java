package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import tb.jzk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class voy extends q2g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f30150a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1004535848);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final String a(jzk jzkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("be01c436", new Object[]{this, jzkVar});
            }
            ckf.g(jzkVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            jzk.a aVar = jzk.Companion;
            if (ckf.b(jzkVar, aVar.c())) {
                return "DataServiceIntent_WhenLiveDetailResponseCallback";
            }
            if (ckf.b(jzkVar, aVar.b())) {
                return "DataServiceIntent_WhenLiveBizComponentDidAppear";
            }
            return pg1.ATOM_EXT_Undefined;
        }

        public final String b(jzk jzkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9c7c1e55", new Object[]{this, jzkVar});
            }
            ckf.g(jzkVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            jzk.a aVar = jzk.Companion;
            if (ckf.b(jzkVar, aVar.u())) {
                return "LifeCycleIntent_WhenWatchComponentCreate";
            }
            if (ckf.b(jzkVar, aVar.k())) {
                return "LifeCycleIntent_WhenSingleComponentCreate";
            }
            if (ckf.b(jzkVar, aVar.w())) {
                return "LifeCycleIntent_WhenWatchComponentDidAppear";
            }
            if (ckf.b(jzkVar, aVar.m())) {
                return "LifeCycleIntent_WhenSingleComponentDidAppear";
            }
            if (ckf.b(jzkVar, aVar.x())) {
                return "LifeCycleIntent_WhenWatchComponentDidDisappear";
            }
            if (ckf.b(jzkVar, aVar.n())) {
                return "LifeCycleIntent_WhenSingleComponentDidDisappear";
            }
            if (ckf.b(jzkVar, aVar.v())) {
                return "LifeCycleIntent_WhenWatchComponentDestroy";
            }
            if (ckf.b(jzkVar, aVar.l())) {
                return "LifeCycleIntent_WhenSingleComponentDestroy";
            }
            if (ckf.b(jzkVar, aVar.B())) {
                return "LifeCycleIntent_WhenWatchComponentWillAppear";
            }
            if (ckf.b(jzkVar, aVar.r())) {
                return "LifeCycleIntent_WhenSingleComponentWillAppear";
            }
            if (ckf.b(jzkVar, aVar.C())) {
                return "LifeCycleIntent_WhenWatchComponentWillDisappear";
            }
            if (ckf.b(jzkVar, aVar.s())) {
                return "LifeCycleIntent_WhenSingleComponentWillDisappear";
            }
            if (ckf.b(jzkVar, aVar.y())) {
                return "LifeCycleIntent_WhenWatchComponentStartTransition";
            }
            if (ckf.b(jzkVar, aVar.o())) {
                return "LifeCycleIntent_WhenSingleComponentStartTransition";
            }
            if (ckf.b(jzkVar, aVar.z())) {
                return "LifeCycleIntent_WhenWatchComponentSwipeAnimationEnd";
            }
            if (ckf.b(jzkVar, aVar.p())) {
                return "LifeCycleIntent_WhenSingleComponentSwipeAnimationEnd";
            }
            if (ckf.b(jzkVar, aVar.A())) {
                return "LifeCycleIntent_WhenWatchComponentSwipeAnimationStart";
            }
            if (ckf.b(jzkVar, aVar.q())) {
                return "LifeCycleIntent_WhenSingleComponentSwipeAnimationStart";
            }
            return pg1.ATOM_EXT_Undefined;
        }

        public a() {
        }
    }

    static {
        t2o.a(1004535847);
        new voy("ComponentListComing");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voy(String str) {
        super(str);
        ckf.g(str, "code");
        this.f30150a = str;
    }

    public static /* synthetic */ Object ipc$super(voy voyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/definition/OpenArchEventIdentifierInner");
    }

    @Override // tb.q2g
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
        }
        return this.f30150a;
    }
}
