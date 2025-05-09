package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.weex.utils.OrangeUtil;
import com.taobao.media.MediaConstant;
import com.taobao.themis.kernel.adapter.IABTestAdapter;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.ut.device.UTDevice;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class h8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final h8s INSTANCE = new h8s();

    /* renamed from: a  reason: collision with root package name */
    public static int f20476a = -1;
    public static final AtomicLong sTMSEarlyInitTime = new AtomicLong(-1);
    public static final AtomicLong sTMSNecessaryInitTime = new AtomicLong(-1);
    public static final AtomicLong sTMSIDLEInitTime = new AtomicLong(-1);
    public static final AtomicLong sTMSFORGROUNDTime = new AtomicLong(-1);
    public static final AtomicLong sTMSRESUMEDTime = new AtomicLong(-1);
    public static final AtomicLong sTMSTBHomeSecondRefreshEndTime = new AtomicLong(-1);
    public static final AtomicBoolean sTMSAfcMiniKernel = new AtomicBoolean(false);
    public static final AtomicReference<no8> sPreloadWeexSoFeature = new AtomicReference<>(new no8("preloadWeexSoFeature_DEFAULT", false, -1));
    public static final AtomicReference<no8> sEnableInstanceLaunchNG = new AtomicReference<>();

    @JvmStatic
    public static final boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f99a6668", new Object[]{context})).booleanValue();
        }
        return bba.a(context);
    }

    @JvmStatic
    public static final boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("814fac2c", new Object[]{context})).booleanValue();
        }
        ckf.g(context, "context");
        if (!d(context).d() || n(context).d()) {
            return false;
        }
        return true;
    }

    @JvmStatic
    public static final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46ccbd15", new Object[0])).intValue();
        }
        return f20476a;
    }

    @JvmStatic
    public static final no8 e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (no8) ipChange.ipc$dispatch("d105a3d8", new Object[]{context});
        }
        ckf.g(context, "context");
        AtomicReference<no8> atomicReference = sEnableInstanceLaunchNG;
        if (atomicReference.get() != null) {
            no8 no8Var = atomicReference.get();
            ckf.d(no8Var);
            return no8Var;
        }
        no8 k = k(context, "EnableTMSLaunchNG", "[-1,-1]", "[-1,-1]", null, null, null, 112, null);
        if (sng.a(atomicReference, null, k)) {
            return k;
        }
        no8 no8Var2 = atomicReference.get();
        ckf.d(no8Var2);
        return no8Var2;
    }

    @JvmStatic
    public static final no8 f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (no8) ipChange.ipc$dispatch("753fa95e", new Object[]{context, str});
        }
        ckf.g(str, ru1.FEATURE_NAME);
        return INSTANCE.g(context, str, q9s.J3("themis_common_config", str, ""));
    }

    @JvmStatic
    public static final no8 h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (no8) ipChange.ipc$dispatch("642edaba", new Object[]{context, str});
        }
        ckf.g(str, ru1.FEATURE_NAME);
        return i(context, str, q9s.J3("themis_common_config", str, ""));
    }

    @JvmStatic
    public static final no8 i(Context context, String str, String str2) {
        int i;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (no8) ipChange.ipc$dispatch("e871e3b0", new Object[]{context, str, str2});
        }
        ckf.g(str, ru1.FEATURE_NAME);
        ckf.g(str2, "config");
        try {
            w(context);
            if (f20476a >= 0) {
                h8s h8sVar = INSTANCE;
                int length = str2.length() - 1;
                int i2 = 0;
                boolean z2 = false;
                while (i2 <= length) {
                    if (!z2) {
                        i = i2;
                    } else {
                        i = length;
                    }
                    if (ckf.i(str2.charAt(i), 32) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z2) {
                        if (!z) {
                            z2 = true;
                        } else {
                            i2++;
                        }
                    } else if (!z) {
                        break;
                    } else {
                        length--;
                    }
                }
                int i3 = 0;
                for (Pair<Integer, Integer> pair : h8sVar.x(str2.subSequence(i2, length + 1).toString())) {
                    int intValue = pair.component1().intValue();
                    int intValue2 = pair.component2().intValue();
                    int i4 = f20476a;
                    if (i4 < intValue || i4 > intValue2) {
                        i3++;
                    } else {
                        return new no8(str + "_EXP_" + i3, true, i3);
                    }
                }
            }
        } catch (Exception e) {
            TMSLogger.b("TMSABTestUtils", e.getLocalizedMessage());
        }
        return new no8(ckf.p(str, "_DEFAULT"), false, -1);
    }

    @JvmStatic
    public static final no8 j(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (no8) ipChange.ipc$dispatch("dcd8cc9", new Object[]{context, str, str2, str3, str4, str5, str6});
        }
        ckf.g(context, "context");
        ckf.g(str, ru1.FEATURE_NAME);
        ckf.g(str2, "defaultExpConfig");
        ckf.g(str3, "defaultCtrlConfig");
        ckf.g(str4, "expConfig");
        ckf.g(str5, "ctrlConfig");
        ckf.g(str6, "bucketName");
        try {
            int a2 = f8s.INSTANCE.a(context, str6);
            if (a2 >= 0) {
                h8s h8sVar = INSTANCE;
                int length = str4.length() - 1;
                int i3 = 0;
                boolean z3 = false;
                while (i3 <= length) {
                    if (!z3) {
                        i2 = i3;
                    } else {
                        i2 = length;
                    }
                    if (ckf.i(str4.charAt(i2), 32) <= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z3) {
                        if (!z2) {
                            z3 = true;
                        } else {
                            i3++;
                        }
                    } else if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                }
                int i4 = 0;
                for (Pair<Integer, Integer> pair : h8sVar.x(str4.subSequence(i3, length + 1).toString())) {
                    int intValue = pair.component1().intValue();
                    int intValue2 = pair.component2().intValue();
                    if (intValue > a2 || a2 > intValue2) {
                        i4++;
                    } else {
                        return new no8(str + "_EXP_" + i4, true, i4);
                    }
                }
                h8s h8sVar2 = INSTANCE;
                int length2 = str5.length() - 1;
                int i5 = 0;
                boolean z4 = false;
                while (i5 <= length2) {
                    if (!z4) {
                        i = i5;
                    } else {
                        i = length2;
                    }
                    if (ckf.i(str5.charAt(i), 32) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z4) {
                        if (!z) {
                            z4 = true;
                        } else {
                            i5++;
                        }
                    } else if (!z) {
                        break;
                    } else {
                        length2--;
                    }
                }
                int i6 = 0;
                for (Pair<Integer, Integer> pair2 : h8sVar2.x(str5.subSequence(i5, length2 + 1).toString())) {
                    int intValue3 = pair2.component1().intValue();
                    int intValue4 = pair2.component2().intValue();
                    if (intValue3 > a2 || a2 > intValue4) {
                        i6++;
                    } else {
                        return new no8(str + "_CTRL_" + i6, false, i6);
                    }
                }
            }
        } catch (Exception e) {
            TMSLogger.c("TMSABTestUtils", e.getLocalizedMessage(), e);
        }
        return new no8(ckf.p(str, "_DEFAULT"), false, 0);
    }

    @JvmStatic
    public static final no8 l(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (no8) ipChange.ipc$dispatch("e4d1e0d7", new Object[]{context, str, str2});
        }
        ckf.g(str, ru1.FEATURE_NAME);
        ckf.g(str2, "defaultConfig");
        return INSTANCE.g(context, str, q9s.J3("themis_common_config", str, str2));
    }

    @JvmStatic
    public static final String m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9fc9eb57", new Object[]{context});
        }
        if (bba.a(context)) {
            return "ThemisLaunchTaskReorder_A1";
        }
        return "ThemisLaunchTaskOld_B1";
    }

    @JvmStatic
    public static final no8 o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (no8) ipChange.ipc$dispatch("5c894b1", new Object[]{context});
        }
        AtomicReference<no8> atomicReference = sPreloadWeexSoFeature;
        if (atomicReference.get().c() < 0) {
            atomicReference.set(h(context, "preloadWeexSoFeature"));
        }
        TMSLogger.b("TMSABTestUtils", "PreloadWeexSoFeature: isExperimentGroup is " + atomicReference.get().d() + ", groupName is " + atomicReference.get().b() + ", index is " + atomicReference.get().c());
        no8 no8Var = atomicReference.get();
        ckf.f(no8Var, "sPreloadWeexSoFeature.get()");
        return no8Var;
    }

    @JvmStatic
    public static final no8 p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (no8) ipChange.ipc$dispatch("958a7e8c", new Object[]{context});
        }
        ckf.g(context, "context");
        return k(context, "getUseHomeFragmentABV2", "[-1,-1]", "[-1,-1]", null, null, null, 112, null);
    }

    @JvmStatic
    public static final no8 s(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (no8) ipChange.ipc$dispatch("7b5e0464", new Object[]{context});
        }
        return l(context, "getWriteChunkAsyncAB", "[-1,-1],[-1,-1]");
    }

    @JvmStatic
    public static final void w(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c24ac14e", new Object[]{context});
            return;
        }
        try {
            if (f20476a < 0) {
                String utdid = UTDevice.getUtdid(context);
                if (!TextUtils.isEmpty(utdid)) {
                    int abs = (int) Math.abs((utdid.hashCode() % 49993) % 100);
                    f20476a = abs;
                    TMSLogger.b("TMSBucket", ckf.p("BucketId: ", Integer.valueOf(abs)));
                }
            }
        } catch (Throwable th) {
            TMSLogger.b("TMSBucket", th.getLocalizedMessage());
        }
    }

    public final no8 g(Context context, String str, String str2) {
        int i;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (no8) ipChange.ipc$dispatch("b151d154", new Object[]{this, context, str, str2});
        }
        try {
            if (f20476a >= 0) {
                int length = str2.length() - 1;
                int i2 = 0;
                boolean z2 = false;
                while (i2 <= length) {
                    if (!z2) {
                        i = i2;
                    } else {
                        i = length;
                    }
                    if (ckf.i(str2.charAt(i), 32) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z2) {
                        if (!z) {
                            z2 = true;
                        } else {
                            i2++;
                        }
                    } else if (!z) {
                        break;
                    } else {
                        length--;
                    }
                }
                List<Pair<Integer, Integer>> x = x(str2.subSequence(i2, length + 1).toString());
                if (x.size() == 2) {
                    if (f20476a >= x.get(0).getFirst().intValue() && f20476a <= x.get(0).getSecond().intValue()) {
                        return new no8(ckf.p(str, "_EXP"), true, 0);
                    }
                    if (f20476a >= x.get(1).getFirst().intValue() && f20476a <= x.get(1).getSecond().intValue()) {
                        return new no8(ckf.p(str, "_CTRL"), false, 0);
                    }
                }
            }
        } catch (Exception e) {
            TMSLogger.b("TMSABTestUtils", e.getLocalizedMessage());
        }
        return new no8(ckf.p(str, "_DEFAULT"), false, 0);
    }

    public final JSONArray q() {
        VariationSet variationSet;
        String valueAsString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("a4ca94e8", new Object[]{this});
        }
        IABTestAdapter iABTestAdapter = (IABTestAdapter) p8s.b(IABTestAdapter.class);
        if (iABTestAdapter == null) {
            variationSet = null;
        } else {
            variationSet = iABTestAdapter.getExperimentByModule("MINIGAME_", "highPerformanceMode");
        }
        if (variationSet == null) {
            return null;
        }
        try {
            Variation variation = variationSet.getVariation("appIds");
            if (!(variation == null || (valueAsString = variation.getValueAsString(MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264)) == null)) {
                TMSLogger.a("TMSABTestUtils", ckf.p("appIds: ", valueAsString));
                return JSON.parseArray(valueAsString);
            }
            Result.m1108constructorimpl(null);
        } catch (Throwable th) {
            Result.m1108constructorimpl(b.a(th));
        }
        return null;
    }

    public final boolean u(String str, String str2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("791299b9", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            if (f20476a < 0) {
                return false;
            }
            if (TextUtils.isEmpty(str)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = JSON.parseObject(str);
            }
            if (jSONObject != null && jSONObject.containsKey(str2)) {
                if (f20476a < jSONObject.getIntValue(str2)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final boolean z(String str, String str2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("691ef3a3", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            if (f20476a < 0) {
                return false;
            }
            if (TextUtils.isEmpty(str)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = JSON.parseObject(str);
            }
            if (jSONObject != null && jSONObject.containsKey(str2)) {
                if (f20476a < jSONObject.getIntValue(str2) / 10) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @JvmStatic
    public static final Map<String, String> r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3da6bc6f", new Object[]{str});
        }
        ckf.g(str, ru1.FEATURE_NAME);
        HashMap hashMap = new HashMap();
        try {
            Object parseObject = JSON.parseObject(q9s.J3("themis_common_config", str, ""), (Type) Map.class, new Feature[0]);
            ckf.f(parseObject, "parseObject<Map<String, …igLocal, Map::class.java)");
            return (Map) parseObject;
        } catch (Exception e) {
            TMSLogger.b("getWhiteMap", e.getLocalizedMessage());
            return hashMap;
        }
    }

    @JvmStatic
    public static final boolean t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("617f24af", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "appId");
        try {
            String configByGroupAndNameFromLocal = ((IConfigAdapter) p8s.g(IConfigAdapter.class)).getConfigByGroupAndNameFromLocal("ariver_common_config", "tms_white_list", "");
            h8s h8sVar = INSTANCE;
            ckf.f(configByGroupAndNameFromLocal, rb.RESULT_KEY);
            return h8sVar.u(configByGroupAndNameFromLocal, str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @JvmStatic
    public static final boolean v() {
        try {
            IpChange ipChange = OrangeUtil.$ipChange;
            Method method = OrangeUtil.class.getMethod("isWeexCart", new Class[0]);
            ckf.f(method, "orangeUtilClass.getMethod(\"isWeexCart\")");
            Object invoke = method.invoke(null, new Object[0]);
            if (invoke != null) {
                return ((Boolean) invoke).booleanValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        } catch (Throwable th) {
            TMSLogger.d("TMSABTestUtils", th);
            return false;
        }
    }

    @JvmStatic
    public static final boolean y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73370519", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "appId");
        try {
            String configByGroupAndNameFromLocal = ((IConfigAdapter) p8s.g(IConfigAdapter.class)).getConfigByGroupAndNameFromLocal("themis_common_config", "poly_open_window_list", "");
            h8s h8sVar = INSTANCE;
            ckf.f(configByGroupAndNameFromLocal, rb.RESULT_KEY);
            return h8sVar.z(configByGroupAndNameFromLocal, str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @JvmStatic
    public static final no8 d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (no8) ipChange.ipc$dispatch("484a2ae1", new Object[]{context});
        }
        ckf.g(context, "context");
        if (!q9s.B2()) {
            return k(context, "DelayPreCreateWebViewToHomeSecondRefreshEnd", "[-1,-1]", "[-1,-1]", null, null, null, 112, null);
        }
        IABTestAdapter iABTestAdapter = (IABTestAdapter) p8s.b(IABTestAdapter.class);
        String str = null;
        VariationSet experimentBySwitch = iABTestAdapter == null ? null : iABTestAdapter.getExperimentBySwitch(context, "DelayPreCreateWebViewToHomeSecondRefreshEnd");
        if (experimentBySwitch == null) {
            return new no8(ckf.p("DelayPreCreateWebViewToHomeSecondRefreshEnd", "_DEFAULT"), false, 0);
        }
        Variation variation = experimentBySwitch.getVariation("DelayPreCreateWebViewToHomeSecondRefreshEnd");
        if (variation != null) {
            str = variation.getValueAsString("");
        }
        if (ckf.b(str, "true")) {
            return new no8("DelayPreCreateWebViewToHomeSecondRefreshEnd_EXP_" + experimentBySwitch.getExperimentBucketId(), true, 0);
        } else if (ckf.b(str, "false")) {
            return new no8("DelayPreCreateWebViewToHomeSecondRefreshEnd_CTRL_" + experimentBySwitch.getExperimentBucketId(), false, 0);
        } else {
            return new no8("DelayPreCreateWebViewToHomeSecondRefreshEnd_DEFAULT_" + experimentBySwitch.getExperimentBucketId(), false, 0);
        }
    }

    @JvmStatic
    public static final no8 n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (no8) ipChange.ipc$dispatch("8c778a5c", new Object[]{context});
        }
        ckf.g(context, "context");
        if (!q9s.B2()) {
            return k(context, "PreCreateWebViewABV2", "[-1,-1]", "[-1,-1]", null, null, null, 112, null);
        }
        IABTestAdapter iABTestAdapter = (IABTestAdapter) p8s.b(IABTestAdapter.class);
        String str = null;
        VariationSet experimentBySwitch = iABTestAdapter == null ? null : iABTestAdapter.getExperimentBySwitch(context, "PreCreateWebViewABV3");
        if (experimentBySwitch == null) {
            return new no8(ckf.p("PreCreateWebViewABV3", "_DEFAULT"), false, 0);
        }
        Variation variation = experimentBySwitch.getVariation("PreCreateWebViewABV3");
        if (variation != null) {
            str = variation.getValueAsString("");
        }
        if (ckf.b(str, "true")) {
            return new no8("PreCreateWebViewABV3_EXP_" + experimentBySwitch.getExperimentBucketId(), true, 0);
        } else if (ckf.b(str, "false")) {
            return new no8("PreCreateWebViewABV3_CTRL_" + experimentBySwitch.getExperimentBucketId(), false, 0);
        } else {
            return new no8("PreCreateWebViewABV3_DEFAULT_" + experimentBySwitch.getExperimentBucketId(), false, 0);
        }
    }

    public final List<Pair<Integer, Integer>> x(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("74942b89", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        while (i < str.length()) {
            if (str.charAt(i) == '[') {
                int i2 = i + 1;
                StringBuilder sb = new StringBuilder();
                while (str.charAt(i2) != ',') {
                    sb.append(str.charAt(i2));
                    i2++;
                }
                i = i2 + 1;
                StringBuilder sb2 = new StringBuilder();
                while (str.charAt(i) != ']') {
                    sb2.append(str.charAt(i));
                    i++;
                }
                String sb3 = sb.toString();
                ckf.f(sb3, "key.toString()");
                Integer valueOf = Integer.valueOf(Integer.parseInt(sb3));
                String sb4 = sb2.toString();
                ckf.f(sb4, "value.toString()");
                arrayList.add(new Pair(valueOf, Integer.valueOf(Integer.parseInt(sb4))));
            }
            i++;
        }
        return arrayList;
    }

    static {
        t2o.a(839909958);
    }

    @JvmStatic
    public static final boolean A(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e52cb282", new Object[]{str, str2, str3})).booleanValue();
        }
        try {
            if (f20476a < 0 || !ckf.b("true", q9s.I3("widget_common_config", "enableThemisWidget", "true"))) {
                return false;
            }
            String I3 = q9s.I3("widget_common_config", "themisWidgetIdBlackList", "");
            ckf.d(str3);
            if (wsq.O(I3, str3, false, 2, null)) {
                return false;
            }
            String I32 = q9s.I3("widget_common_config", "themisWidgetSceneIdList", ct2.COLOR_TAG_NOT_ZCACHE_RESOURCE);
            ckf.d(str);
            if (!wsq.O(I32, str, false, 2, null)) {
                return false;
            }
            int r3 = q9s.r3("widget_common_config", "themisFullSwitchRate", 0);
            if (r3 > 0) {
                return (str2 == null || !JSON.parseObject(q9s.I3("widget_common_config", "themisWidgetSellerIdBlackList", "{}")).containsKey(str2)) && f20476a <= r3;
            }
            JSONObject parseObject = JSON.parseObject(q9s.I3("widget_common_config", "themisWidgetSellerIdListV2", "{}"));
            return str2 != null && parseObject.containsKey(str2) && f20476a <= parseObject.getIntValue(str2);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static /* synthetic */ no8 k(Context context, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (no8) ipChange.ipc$dispatch("2098ff33", new Object[]{context, str, str2, str3, str4, str5, str6, new Integer(i), obj});
        }
        String str7 = "";
        String str8 = (4 & i) != 0 ? str7 : str2;
        if ((8 & i) == 0) {
            str7 = str3;
        }
        return j(context, str, str8, str7, (i & 16) != 0 ? q9s.J3("themis_common_config", ckf.p(str, "_EXP"), str8) : str4, (i & 32) != 0 ? q9s.J3("themis_common_config", ckf.p(str, "_CTRL"), str7) : str5, (i & 64) != 0 ? str : str6);
    }
}
