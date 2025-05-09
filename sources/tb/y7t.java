package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class y7t {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APICONNECT_TAG = "TaoSdk.ApiRequest";
    public static final String ENDCASE_TAG = "TaoSdk.EndUT";
    public static final String ETAOLOCAL_TAG = "EtaoLocal";
    public static final String ETAO_APIURL_TAG = "etao_apiurl";
    public static final String ETAO_TAG = "Etao";
    public static final String IMGPOOL_COMPRESSION_RATIO_TAG = "Image_Compression";
    public static final String IMGPOOL_TAG = "TaoSdk.ImgPool";
    public static final String MEM_TRACE = "mem_Trace";
    public static final String PANELMANAGER_TAG = "PanelManager";
    public static final String SIGN_TAG = "tag_sign";
    public static final String STARTUTCASE_TAG = "TaoSdk.StartUT";
    public static final String TAOBAO_TAG = "Taobao";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31900a = true;

    static {
        t2o.a(775946272);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4afee6dc", new Object[]{str, str2});
        } else if (str != null && str2 != null && f31900a) {
            Log.e(str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e41ecee", new Object[]{str, str2});
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2039022b", new Object[0])).booleanValue();
        }
        return f31900a;
    }

    public static void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24cc148a", new Object[]{new Boolean(z)});
        } else {
            f31900a = z;
        }
    }
}
