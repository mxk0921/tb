package tb;

import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class vqi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INIT = 100;
    public static final int SUBSCRIBED = 11;
    public static final int SUBSCRIBED_FAIL = 101;
    public static final int SUBSCRIBING = 10;
    public static final int UN_SUBSCRIBED = 102;
    public static final int UN_SUBSCRIBED_FAIL = 103;
    public static final int UN_SUBSCRIBING = 12;

    static {
        t2o.a(806356408);
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{new Integer(i)});
        }
        switch (i) {
            case 10:
                return "SUBSCRIBING";
            case 11:
                return "SUBSCRIBED";
            case 12:
                return "UN_SUBSCRIBING";
            default:
                switch (i) {
                    case 100:
                        return ModuleConstants.VI_MODULE_NAME_INIT;
                    case 101:
                        return "SUBSCRIBED_FAIL";
                    case 102:
                        return "UN_SUBSCRIBED";
                    case 103:
                        return "UN_SUBSCRIBED_FAIL";
                    default:
                        return "ERROR";
                }
        }
    }
}
