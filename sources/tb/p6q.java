package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant.SmartLayerConstant$SmartLayerStage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class p6q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_MAJOR = "SmartLayerLogM";
    public static final String TAG_NORMAL = "SmartLayerLogN";

    static {
        t2o.a(295699808);
    }

    public static void a(String str, SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage, String str2, String str3, String str4) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3287194", new Object[]{str, smartLayerConstant$SmartLayerStage, str2, str3, str4});
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            str5 = "-" + str2;
        } else {
            str5 = "";
        }
        String str6 = str5 + "-" + smartLayerConstant$SmartLayerStage.stage;
        if (!TextUtils.isEmpty(str3)) {
            str6 = str6 + "-" + str3;
        }
        o3s.b(str, str6 + "-" + str4);
    }

    public static void b(SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a590530e", new Object[]{smartLayerConstant$SmartLayerStage, str, str2});
        } else {
            c(smartLayerConstant$SmartLayerStage, null, str, str2);
        }
    }

    public static void c(SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage, g6q g6qVar, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa914c1", new Object[]{smartLayerConstant$SmartLayerStage, g6qVar, str, str2});
            return;
        }
        if (g6qVar != null) {
            str3 = "id = " + g6qVar.f19759a + "bizId = " + g6qVar.c + "-" + g6qVar.d;
        } else {
            str3 = null;
        }
        a(TAG_NORMAL, smartLayerConstant$SmartLayerStage, str3, str, str2);
    }

    public static void d(SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage, g6q g6qVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9842ba04", new Object[]{smartLayerConstant$SmartLayerStage, g6qVar, str, str2});
        } else {
            e(smartLayerConstant$SmartLayerStage, g6qVar, str, str2, null, true);
        }
    }

    public static void e(SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage, g6q g6qVar, String str, String str2, String str3, boolean z) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6a721c6", new Object[]{smartLayerConstant$SmartLayerStage, g6qVar, str, str2, str3, new Boolean(z)});
            return;
        }
        if (g6qVar != null) {
            str4 = "id = " + g6qVar.f19759a + "bizId = " + g6qVar.c + "-" + g6qVar.d;
        } else {
            str4 = null;
        }
        if (!TextUtils.isEmpty(str3)) {
            str2 = str2 + "-" + str3;
        }
        if (!z) {
            str2 = str2 + "-false";
        }
        a(TAG_MAJOR, smartLayerConstant$SmartLayerStage, str4, str, str2);
    }
}
