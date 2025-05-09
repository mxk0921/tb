package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.datamodel.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ws6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int AB_POST_NO_NEED = -1;
    public static final int AB_POST_POST = 2;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f30887a;
    public final ncp b;

    static {
        t2o.a(468714182);
    }

    public ws6(FluidContext fluidContext, qq6 qq6Var) {
        this.f30887a = fluidContext;
        this.b = new ncp(qq6Var);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3c11c26", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableCancelResponseWithRecommendMtopId", true);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78e76db0", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableClearListNextData", true);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e15686f6", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableFixSeekCommonError", true);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8fa23ea", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableFixDoubleDetailParse", true);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70ff8190", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableHotTopic", true);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6de4a502", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableMtopFlag", true);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d6c72a", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableSendAsac", true);
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("453249b0", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableLsbRequstParams", true);
    }

    public static int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304ebaaa", new Object[0])).intValue();
        }
        return 2;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1690da87", new Object[]{this})).booleanValue();
        }
        ncp ncpVar = this.b;
        if (ncpVar != null) {
            ncpVar.getClass();
            this.b.getClass();
        }
        return false;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("713129e2", new Object[]{this})).booleanValue();
        }
        if (pr9.j() || !this.b.z || !l() || !m()) {
            return false;
        }
        return true;
    }

    public ncp j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ncp) ipChange.ipc$dispatch("c343035d", new Object[]{this});
        }
        return this.b;
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea9af7bc", new Object[]{this})).booleanValue();
        }
        return akt.p2("ShortVideo.enablePlayRateChangeV4", true);
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e805234", new Object[]{this})).booleanValue();
        }
        a.d activeCardMediaDetail = ((ICardService) this.f30887a.getService(ICardService.class)).getActiveCardMediaDetail();
        if (activeCardMediaDetail == null) {
            return false;
        }
        return activeCardMediaDetail.C();
    }
}
