package com.taobao.android.behavir.fatigue;

import android.text.TextUtils;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.bhxbridge.BHXCXXBaseBridge;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.t2o;
import tb.v82;
import tb.xm1;
import tb.y19;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class FatigueManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FATIGUE = "fatigue";
    public static final String LIMIT_STATE = "limitState";
    public static final String TAG = "PopFatigueManager";
    private static final AtomicBoolean isInit = new AtomicBoolean(false);
    private static JSONArray sFatigueSummary = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum FrequencyActionType {
        kExpose,
        kClick,
        kCancel;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(FrequencyActionType frequencyActionType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/fatigue/FatigueManager$FrequencyActionType");
        }

        public static FrequencyActionType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FrequencyActionType) ipChange.ipc$dispatch("93206935", new Object[]{str});
            }
            return (FrequencyActionType) Enum.valueOf(FrequencyActionType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum FrequencyBizType {
        kBiz,
        kScheme,
        kBizPlan,
        kMaterial,
        kMaterialDelivery,
        kUnknown;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(FrequencyBizType frequencyBizType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/fatigue/FatigueManager$FrequencyBizType");
        }

        public static FrequencyBizType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FrequencyBizType) ipChange.ipc$dispatch("b4da0da4", new Object[]{str});
            }
            return (FrequencyBizType) Enum.valueOf(FrequencyBizType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum LimitState {
        NOT_LIMIT,
        LIMIT_FOR_ALG,
        HAS_LIMIT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(LimitState limitState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/fatigue/FatigueManager$LimitState");
        }

        public static LimitState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LimitState) ipChange.ipc$dispatch("97f7221f", new Object[]{str});
            }
            return (LimitState) Enum.valueOf(LimitState.class, str);
        }
    }

    static {
        t2o.a(404750376);
    }

    public static void NotifyFatigueSummaryChanged(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("211e4c7d", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            if (sFatigueSummary == null) {
                String l = v82.l("fatigueSummaryList", "[\"Page_Home\", \"Page_MyTaobao\"]");
                if (!TextUtils.isEmpty(l)) {
                    sFatigueSummary = JSON.parseArray(l);
                }
            }
            JSONArray jSONArray = sFatigueSummary;
            if (jSONArray != null && jSONArray.contains(str)) {
                xm1 i = xm1.i();
                i.h("fatigue" + str, queryFatigueSummary(str));
            }
        }
    }

    private static void ensureInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("759cc3f5", new Object[0]);
        } else {
            isInit.compareAndSet(false, true);
        }
    }

    public static String getIdentifierFromSchemeId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54211466", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(64);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    private static native synchronized void increaseCount(int i, long j, long j2, long j3, long j4, long j5, String str);

    public static void increaseCount(FrequencyActionType frequencyActionType, long j, long j2, long j3, long j4, long j5, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("996fb136", new Object[]{frequencyActionType, new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5), str});
        } else if (frequencyActionType != null && isEnableFatigue()) {
            if (j != 0 || j2 != 0 || j3 != 0 || j4 != 0 || j5 != 0) {
                ensureInit();
                increaseCount(frequencyActionType.ordinal(), j, j2, j3, j4, j5, str);
            }
        }
    }

    private static native synchronized long[] innerIsLimit(int i, long j);

    private static boolean isEnableFatigue() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4f05a45", new Object[0])).booleanValue();
        }
        if (v82.h("enableUCPPopFatigue", true) && BHXCXXBaseBridge.LoadCXXLib()) {
            z = true;
        }
        if (!z) {
            UmbrellaTracker.commitFailureStability("eventProcess", "user_action_track_error", "1.0", "BehaviX", "JNI", null, "fatigue disable", "");
        }
        return z;
    }

    private static native String nativeQuerySummary(String str);

    public static String queryFatigueSummary(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee618688", new Object[]{str});
        }
        if (isEnableFatigue()) {
            return nativeQuerySummary(str);
        }
        return "";
    }

    private static native synchronized int updateUCPDB(String str);

    public static int updateUCPDBByJSBridge(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a82bdc4", new Object[]{str})).intValue();
        }
        if (isEnableFatigue()) {
            return updateUCPDB(str);
        }
        return -1;
    }

    public static void increaseCount(FrequencyActionType frequencyActionType, y19 y19Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc776bdb", new Object[]{frequencyActionType, y19Var, str});
        } else if (y19Var != null) {
            increaseCount(frequencyActionType, y19Var.f31783a, y19Var.b, y19Var.c, y19Var.d, y19Var.e, str);
            NotifyFatigueSummaryChanged(str);
        }
    }
}
