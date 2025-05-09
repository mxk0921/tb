package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.IProcessName;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.TaobaoConstants;
import com.taobao.android.fluid.core.exception.FluidException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rd0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SECURITY_OFF = 2;
    public static final int SECURITY_OPEN = 1;
    public static final int SECURITY_TAOBAO = 0;
    public static String c;
    public static String d;
    public static IProcessName e;

    /* renamed from: a  reason: collision with root package name */
    public static int f27290a = 0;
    public static String b = null;
    public static final AtomicInteger f = new AtomicInteger(-1);

    static {
        t2o.a(343933031);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eaf015d", new Object[0])).booleanValue();
        }
        if (f.intValue() == 0) {
            return true;
        }
        return false;
    }

    public static String a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0d5f9bc", new Object[]{str});
        }
        if (TextUtils.isEmpty(b)) {
            str2 = str + TaobaoConstants.DEFAULT_INTENT_SERVICE_CLASS_NAME;
        } else {
            str2 = b;
        }
        ALog.d("AdapterGlobalClientInfo", "getAgooCustomServiceName", FluidException.SERVICE_NAME, str2);
        return str2;
    }
}
