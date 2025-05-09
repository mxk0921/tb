package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.weex.call.nativehandler.impl.ItemOperateNativeHandler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ejj {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(478150937);
        }

        public a() {
        }

        public final mw a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mw) ipChange.ipc$dispatch("fae8f28", new Object[]{this, str});
            }
            ckf.g(str, "method");
            switch (str.hashCode()) {
                case -492570864:
                    if (str.equals("getCloseDate")) {
                        return new c7a();
                    }
                    return null;
                case -484978008:
                    if (str.equals("getFirstCache")) {
                        return new o7a();
                    }
                    return null;
                case -296564809:
                    if (str.equals("updateCartTabBadge")) {
                        return new ips();
                    }
                    return null;
                case -277657887:
                    if (str.equals("updateGroupName")) {
                        return new pjv();
                    }
                    return null;
                case 172561734:
                    if (str.equals("closeStdPop")) {
                        return new kw3();
                    }
                    return null;
                case 216239514:
                    if (str.equals("hideLoading")) {
                        return new cwa();
                    }
                    return null;
                case 289153204:
                    if (str.equals("setFirstCache")) {
                        return new ffp();
                    }
                    return null;
                case 305496300:
                    if (str.equals("downgradeNative")) {
                        return new tt7();
                    }
                    return null;
                case 415651455:
                    if (str.equals("saveInstanceState")) {
                        return new cro();
                    }
                    return null;
                case 674269483:
                    if (str.equals("aliPayService")) {
                        return new zq0();
                    }
                    return null;
                case 724809599:
                    if (str.equals("showLoading")) {
                        return new pvp();
                    }
                    return null;
                case 782662283:
                    if (str.equals("showStdPop")) {
                        return new vvp();
                    }
                    return null;
                case 1016031772:
                    if (str.equals("showItemOperateDialog")) {
                        return new ItemOperateNativeHandler();
                    }
                    return null;
                case 1056421764:
                    if (str.equals("setCloseDate")) {
                        return new efp();
                    }
                    return null;
                case 1266917456:
                    if (str.equals("bizReady")) {
                        return new le2();
                    }
                    return null;
                case 1511764137:
                    if (str.equals("updatePopState")) {
                        return new phm();
                    }
                    return null;
                case 1536672141:
                    if (str.equals("renderSuccess")) {
                        return new d1o();
                    }
                    return null;
                case 1716613601:
                    if (str.equals("preloadImages")) {
                        return new prm();
                    }
                    return null;
                case 2136361762:
                    if (str.equals("showIndustrySku")) {
                        return new ovp();
                    }
                    return null;
                default:
                    return null;
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(478150936);
    }
}
