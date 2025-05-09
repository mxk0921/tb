package tb;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ael {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GROUP = "OrderListPrefetch";

    /* renamed from: a  reason: collision with root package name */
    public static fnn f15694a = null;
    public static IBizDataModel<AwesomeGetContainerData> b = null;
    public static Boolean c = Boolean.FALSE;
    public static Integer d = 0;

    static {
        t2o.a(729809619);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be74eb5", new Object[0]);
        } else {
            b = null;
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[0]);
            return;
        }
        bqa.e("OrderListPrefetchManager", "destroy");
        if (!f().booleanValue()) {
            a();
            c = Boolean.FALSE;
            d = 0;
            try {
                d().c();
                f15694a = null;
            } catch (Throwable th) {
                bqa.b("OrderListPrefetchManager", "RecommendContainer destroy", th);
            }
        }
    }

    public static IBizDataModel<AwesomeGetContainerData> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBizDataModel) ipChange.ipc$dispatch("a960c511", new Object[0]);
        }
        bqa.e("OrderListPrefetchManager", "getAndClearPrefetchData");
        IBizDataModel<AwesomeGetContainerData> iBizDataModel = b;
        a();
        if (c.booleanValue()) {
            d().r();
            c = Boolean.FALSE;
        }
        return iBizDataModel;
    }

    public static fnn d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnn) ipChange.ipc$dispatch("ef4f49b7", new Object[0]);
        }
        if (f15694a == null) {
            f15694a = fnn.e(z4a.REC_ORDER_LIST);
        }
        return f15694a;
    }

    public static Boolean e() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("f59685ff", new Object[0]);
        }
        if (b != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static Boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("598a216b", new Object[0]);
        }
        if (f4b.b("disable_order_list_prefetch", false)) {
            return Boolean.TRUE;
        }
        if (Localization.o()) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static Boolean g() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("602104bb", new Object[0]);
        }
        if (d.intValue() > 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b632fe", new Object[0]);
            return;
        }
        bqa.e("OrderListPrefetchManager", "prefetch");
        d = Integer.valueOf(d.intValue() + 1);
        if (!f().booleanValue()) {
            if (b != null) {
                c = Boolean.TRUE;
            } else {
                d().r();
            }
        }
    }

    public static void i(IBizDataModel<AwesomeGetContainerData> iBizDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6791b8c8", new Object[]{iBizDataModel});
            return;
        }
        bqa.e("OrderListPrefetchManager", "savePrefetchData");
        b = iBizDataModel;
    }
}
