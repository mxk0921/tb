package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.SymbolExpUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class eps {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f18745a = gbr.a();
    public static final Map<String, Boolean> b = new HashMap();
    public static final Map<String, Integer> c = new HashMap();

    static {
        t2o.a(468714607);
    }

    public static int A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40693b9a", new Object[0])).intValue();
        }
        return h("warmUpDataGapWhenListSpeedNormal", 3);
    }

    public static boolean B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d491d8c6", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i = f18745a;
        if (i == 0) {
            return str.contains("H");
        }
        if (i == 1) {
            return str.contains("M");
        }
        if (i == 2) {
            return str.contains("L");
        }
        return true;
    }

    public static boolean a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eec251c0", new Object[]{fluidContext})).booleanValue();
        }
        if (n(fluidContext) > 0) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97b1fbfe", new Object[0])).booleanValue();
        }
        if (vr9.c() || k("cardWarmup2", false)) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("335a5447", new Object[0])).booleanValue();
        }
        if (vr9.c() || k("enableChangeFastScroll2", false)) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb653be9", new Object[0])).booleanValue();
        }
        return k("closeFastScroll", vr9.c());
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdc9574f", new Object[0])).booleanValue();
        }
        if (vr9.c() || k("createDWFastWithCardWarmup2", false)) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a99bc72", new Object[0])).booleanValue();
        }
        if (vr9.c() || k("enableOptCover2", false)) {
            return true;
        }
        return false;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6eec0d0c", new Object[0])).booleanValue();
        }
        return vr9.c() || k("p2ffAddView2", false);
    }

    public static int h(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("daf0150d", new Object[]{str, new Integer(i)})).intValue();
        }
        Map<String, Integer> map = c;
        if (((HashMap) map).get(str) != null) {
            return ((Integer) ((HashMap) map).get(str)).intValue();
        }
        int t = nwv.t(t(akt.G2("AB_fullscreenpage_android.UpdownOpt2412." + str, String.valueOf(i))), i);
        ((HashMap) map).put(str, Integer.valueOf(t));
        ir9.b("Tab2UpdownOpt", "ab result:" + str + "," + t);
        return t;
    }

    public static int i() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("161d95dc", new Object[0])).intValue();
        }
        if (vr9.c()) {
            i = 17;
        } else {
            i = -1;
        }
        return h("cardBindToDWOPT2", i);
    }

    public static int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8e77b72", new Object[0])).intValue();
        }
        return h("cardBindToDWOPTWithGap2", 2000);
    }

    public static boolean k(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75321e12", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        Map<String, Boolean> map = b;
        if (((HashMap) map).get(str) != null) {
            return ((Boolean) ((HashMap) map).get(str)).booleanValue();
        }
        boolean o = nwv.o(t(akt.G2("AB_fullscreenpage_android.UpdownOpt2412." + str, String.valueOf(z))), z);
        ((HashMap) map).put(str, Boolean.valueOf(o));
        ir9.b("Tab2UpdownOpt", "ab result:" + str + "," + o);
        return o;
    }

    public static int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7f511da", new Object[0])).intValue();
        }
        return h("cardBindDelayWhenActive2", 1500);
    }

    public static int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb5b8377", new Object[0])).intValue();
        }
        return h("cardBindDelayWhenDataAdd", 500);
    }

    public static int n(FluidContext fluidContext) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc0d6f2c", new Object[]{fluidContext})).intValue();
        }
        if (fluidContext == null || (!FluidInstanceConfig.CONTAINER_NAME_GG_TAG3.equals(fluidContext.getInstanceConfig().getBizType()) && !mr9.BIZ_NAME_RECOMMEND_TAB.equals(fluidContext.getInstanceConfig().getBizName()))) {
            return 0;
        }
        if (vr9.c()) {
            i = 2;
        }
        return h("cardBindPreloadNum", i);
    }

    public static int o() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58f59213", new Object[0])).intValue();
        }
        if (vr9.c()) {
            i = 500;
        } else {
            i = -1;
        }
        return h("checkLoadingDelay2", i);
    }

    public static int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76fe1b01", new Object[0])).intValue();
        }
        return h("healthyGoodThreshold", 6000);
    }

    public static int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dcc80d7", new Object[0])).intValue();
        }
        return h("healthyNormalThreshold", 2000);
    }

    public static int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6cdefd16", new Object[0])).intValue();
        }
        return h("listSpeedFastThreshold", 800);
    }

    public static int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90dc9b2b", new Object[0])).intValue();
        }
        return h("listSpeedNormalThreshold", 2000);
    }

    public static String t(String str) {
        String[] split;
        String[] strArr;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61a274e2", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            for (String str3 : str.split(SymbolExpUtil.SYMBOL_VERTICALBAR)) {
                if (!TextUtils.isEmpty(str3)) {
                    strArr = str3.split("_");
                } else {
                    strArr = null;
                }
                if (strArr != null) {
                    String str4 = "LMH";
                    if (strArr.length == 1) {
                        str2 = strArr[0];
                    } else {
                        str4 = strArr[0];
                        str2 = strArr[1];
                    }
                    if (B(str4)) {
                        ir9.b("Tab2UpdownOpt", "getMatchABResult:" + str + "=>" + str2);
                        return str2;
                    }
                }
            }
        } catch (Exception e) {
            ir9.c("Tab2UpdownOpt", "getMatchABResult", e);
        }
        return null;
    }

    public static int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5ace18", new Object[0])).intValue();
        }
        return h("warmUpDWGapWhenListSpeedFast", 1);
    }

    public static int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ceccc5", new Object[0])).intValue();
        }
        return h("warmUpDWGapWhenListSpeedFaster", 1);
    }

    public static int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0024604", new Object[0])).intValue();
        }
        return h("warmUpDataGapWhenHealthyGood", 3);
    }

    public static int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e50dbdee", new Object[0])).intValue();
        }
        return h("warmUpDataGapWhenHealthyNormal", 2);
    }

    public static int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4875aecf", new Object[0])).intValue();
        }
        return h("warmUpDataGapWhenListSpeedFast", 4);
    }

    public static int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63b45bbc", new Object[0])).intValue();
        }
        return h("warmUpDataGapWhenListSpeedFaster", 6);
    }
}
