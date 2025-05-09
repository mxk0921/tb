package tb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taobao.scancode.v2.result.MaResult;
import com.taobao.taobao.scancode.v2.result.MaType;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rso {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ScancodeLog";

    /* renamed from: a  reason: collision with root package name */
    public static final String f27586a = Boolean.FALSE.toString();

    static {
        t2o.a(760217653);
    }

    public static boolean a(Context context, String str, nmd nmdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf518c5f", new Object[]{context, str, nmdVar})).booleanValue();
        }
        Bundle bundle = new Bundle();
        bundle.putString("target_url", str);
        bundle.putString("comeFromType", "scan");
        return yoj.b(context, nmdVar).e(bundle).d("http://m.taobao.com/scancode/browser");
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cb66c3b", new Object[0])).booleanValue();
        }
        return TextUtils.isEmpty(OrangeConfig.getInstance().getConfig("image_search", "enable_anti_fraud_request", ""));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13053a33", new Object[0])).booleanValue();
        }
        return TextUtils.isEmpty(OrangeConfig.getInstance().getConfig("image_search", "createScanMtopBuilderInNewWay", ""));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a29ab872", new Object[0])).booleanValue();
        }
        return TextUtils.isEmpty(OrangeConfig.getInstance().getConfig("image_search", "enable_express_history", ""));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77ca756d", new Object[0])).booleanValue();
        }
        return TextUtils.isEmpty(OrangeConfig.getInstance().getConfig("image_search", "getScanTtidInNewWay", ""));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40065657", new Object[0])).booleanValue();
        }
        return "enable".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("image_search", "enable_barcode_qrcode_old_logic", "disable"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17887be0", new Object[0])).booleanValue();
        }
        return !TextUtils.isEmpty(OrangeConfig.getInstance().getConfig("image_search", "enable_old_uc_webview", ""));
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e41be6f", new Object[0])).booleanValue();
        }
        return !TextUtils.isEmpty(OrangeConfig.getInstance().getConfig("image_search", "enable_omit_outer_http_code", ""));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d03fb04", new Object[0])).booleanValue();
        }
        return TextUtils.isEmpty(OrangeConfig.getInstance().getConfig("image_search", "enable_qr_text_dialog", ""));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8d0209", new Object[0])).booleanValue();
        }
        return TextUtils.isEmpty(OrangeConfig.getInstance().getConfig("image_search", "enable_unify_history_processor", ""));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("926b1eab", new Object[0])).booleanValue();
        }
        return TextUtils.isEmpty(OrangeConfig.getInstance().getConfig("image_search", "enable_unknown_code_history", ""));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eef3aa1e", new Object[0])).booleanValue();
        }
        return TextUtils.isEmpty(OrangeConfig.getInstance().getConfig("image_search", "enableScanUtLogMapParam", ""));
    }

    public static void m(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("190d9064", new Object[]{str, objArr});
            return;
        }
        if (objArr != null) {
            try {
                if (objArr.length != 0) {
                    str = String.format(str, objArr);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        Log.e(TAG, str);
    }

    public static ScancodeType n(MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScancodeType) ipChange.ipc$dispatch("eeab5a2a", new Object[]{maResult});
        }
        if (maResult == null) {
            return null;
        }
        if (MaType.PRODUCT == maResult.getType()) {
            return ScancodeType.PRODUCT;
        }
        if (MaType.MEDICINE == maResult.getType()) {
            return ScancodeType.MEDICINE;
        }
        if (MaType.EXPRESS == maResult.getType()) {
            return ScancodeType.EXPRESS;
        }
        if (MaType.TB_ANTI_FAKE == maResult.getType()) {
            return ScancodeType.ANTI_FAKE;
        }
        if (MaType.GEN3 == maResult.getType()) {
            return ScancodeType.GEN3;
        }
        if (MaType.QR == maResult.getType()) {
            return ScancodeType.QR;
        }
        if (MaType.TB_4G == maResult.getType()) {
            return ScancodeType.TB_4G;
        }
        if (MaType.DM == maResult.getType()) {
            return ScancodeType.DM;
        }
        return null;
    }

    public static String o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90a487d0", new Object[]{context});
        }
        if (!e()) {
            return TaoHelper.getTTID();
        }
        MtopConfig mtopConfig = Mtop.instance(Mtop.Id.INNER, context).getMtopConfig();
        if (mtopConfig != null) {
            return mtopConfig.ttid;
        }
        return TaoHelper.getTTID();
    }

    public static void p(Object obj, Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7277d330", new Object[]{obj, map});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(obj, map);
            if (map == null) {
                str = "empty property";
            } else {
                str = map.toString();
            }
            m(str, new Object[0]);
        } catch (Throwable unused) {
        }
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34c5eb8d", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("android_scancode_client", "use_old_qr_nav", f27586a));
    }
}
