package tb;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.global.NewDetailScreenConfig;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class q0i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int VALUE_PROGRESS_HEIGHT = 20;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$detail2$core$framework$data$global$NewDetailScreenConfig$ScreenType;

        static {
            int[] iArr = new int[NewDetailScreenConfig.ScreenType.values().length];
            $SwitchMap$com$taobao$android$detail2$core$framework$data$global$NewDetailScreenConfig$ScreenType = iArr;
            try {
                iArr[NewDetailScreenConfig.ScreenType.FOLD_DEVICE_LANDSCAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$detail2$core$framework$data$global$NewDetailScreenConfig$ScreenType[NewDetailScreenConfig.ScreenType.PAD_LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$detail2$core$framework$data$global$NewDetailScreenConfig$ScreenType[NewDetailScreenConfig.ScreenType.PAD_PORTRAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(352322162);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.qrc a(tb.cxj r8, tb.ue7 r9, java.lang.String r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.q0i.a(tb.cxj, tb.ue7, java.lang.String, int, boolean):tb.qrc");
    }

    public static qrc b(cxj cxjVar, ue7 ue7Var, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qrc) ipChange.ipc$dispatch("8d60437", new Object[]{cxjVar, ue7Var, str, new Integer(i), new Boolean(z)});
        }
        int i2 = a.$SwitchMap$com$taobao$android$detail2$core$framework$data$global$NewDetailScreenConfig$ScreenType[h(cxjVar).a().ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return a(cxjVar, ue7Var, str, i, z);
        }
        return c(cxjVar, ue7Var, str, i, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.qrc c(tb.cxj r8, tb.ue7 r9, java.lang.String r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.q0i.c(tb.cxj, tb.ue7, java.lang.String, int, boolean):tb.qrc");
    }

    public static int d(cxj cxjVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b9a3bc30", new Object[]{cxjVar, str, new Boolean(z)})).intValue();
        }
        int i = a.$SwitchMap$com$taobao$android$detail2$core$framework$data$global$NewDetailScreenConfig$ScreenType[h(cxjVar).a().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return f(cxjVar, str, z);
        }
        return g(cxjVar, str, z);
    }

    public static int e(cxj cxjVar, ue7 ue7Var, String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c2e7548", new Object[]{cxjVar, ue7Var, str, new Boolean(z)})).intValue();
        }
        JSONObject jSONObject = ue7Var.B().getJSONObject("mainPicContainer");
        if (jSONObject != null) {
            str2 = jSONObject.getString("bottomAreaBasic");
        } else {
            str2 = "";
        }
        return d(cxjVar, str2, z);
    }

    public static int f(cxj cxjVar, String str, boolean z) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34bc73cc", new Object[]{cxjVar, str, new Boolean(z)})).intValue();
        }
        Application application = Globals.getApplication();
        if (z) {
            f = 9.0f;
        } else {
            f = 15.0f;
        }
        int f2 = pb6.f(application, f) + pb6.f(application, 49.0f);
        if (!TextUtils.isEmpty(str)) {
            try {
                f2 += pb6.f(application, Integer.parseInt(str) / 2.0f);
            } catch (Exception e) {
                txj.f(txj.TAG_MEDIA_CONTROLLER, "bottomAreaHeight 解析出错", e);
            }
        }
        txj.e(txj.TAG_TIP, "getBottomAreaHeight bottomAreaHeight:" + f2);
        return f2;
    }

    public static int g(cxj cxjVar, String str, boolean z) {
        NewDetailScreenConfig h;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d0e36cb", new Object[]{cxjVar, str, new Boolean(z)})).intValue();
        }
        if (z) {
            h = h(cxjVar);
            i = 18;
        } else {
            h = h(cxjVar);
            i = 30;
        }
        int j = h.j(i) + h(cxjVar).j(98);
        if (!TextUtils.isEmpty(str)) {
            try {
                j += h(cxjVar).j(Integer.parseInt(str));
            } catch (Exception e) {
                txj.f(txj.TAG_MEDIA_CONTROLLER, "bottomAreaHeight 解析出错", e);
            }
        }
        txj.e(txj.TAG_TIP, "getBottomAreaHeight bottomAreaHeight:" + j);
        return j;
    }

    public static NewDetailScreenConfig h(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NewDetailScreenConfig) ipChange.ipc$dispatch("77933f3a", new Object[]{cxjVar});
        }
        return cxjVar.j().K();
    }

    public static int i(cxj cxjVar, ue7 ue7Var, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9085fea", new Object[]{cxjVar, ue7Var, str, new Integer(i), new Boolean(z)})).intValue();
        }
        return i - e(cxjVar, ue7Var, str, z);
    }
}
