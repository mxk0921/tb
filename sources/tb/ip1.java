package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ip1 extends or1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BARCODE_TYPE_MEDICINE = 2;
    public static final int BARCODE_TYPE_PRODUCT = 1;
    public final Activity b;
    public final ryu c;

    static {
        t2o.a(760217691);
    }

    public ip1(Activity activity, nmd nmdVar) {
        super(nmdVar);
        this.b = activity;
    }

    public static /* synthetic */ Object ipc$super(ip1 ip1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/gateway/business/BarcodeGatewayBusiness");
    }

    public boolean a(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3dddd48", new Object[]{this, str, new Integer(i), str2})).booleanValue();
        }
        boolean c = c(str, i, str2, true, this.f25587a);
        ey3.g().h("BarcodeGateway_4g");
        return c;
    }

    public void b(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116298f4", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        c(str, i, str2, false, this.f25587a);
        ey3.g().h("BarcodeGateway_history");
    }

    public final boolean c(String str, int i, String str2, boolean z, nmd nmdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b8e2339", new Object[]{this, str, new Integer(i), str2, new Boolean(z), nmdVar})).booleanValue();
        }
        boolean b = kp1.b(this.b, this.c, str, i, str2, z, nmdVar);
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_BarCodeDetail");
        return b;
    }

    public ip1(Activity activity, ryu ryuVar, nmd nmdVar) {
        super(nmdVar);
        this.b = activity;
        this.c = ryuVar;
    }
}
