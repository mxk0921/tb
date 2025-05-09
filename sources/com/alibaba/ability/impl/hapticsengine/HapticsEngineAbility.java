package com.alibaba.ability.impl.hapticsengine;

import android.os.Vibrator;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.cu;
import tb.jpu;
import tb.t2o;
import tb.zz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class HapticsEngineAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_CANCEL = "cancel";
    public static final String API_IMPACT_HEAVY = "impactHeavy";
    public static final String API_IMPACT_LIGHT = "impactLight";
    public static final String API_IMPACT_MEDIUM = "impactMedium";
    public static final String API_IMPACT_RIGID = "impactRigid";
    public static final String API_IMPACT_SOFT = "impactSoft";
    public static final String API_NOTIFICATION_ERROR = "notificationError";
    public static final String API_NOTIFICATION_SUCCESS = "notificationSuccess";
    public static final String API_NOTIFICATION_WARNING = "notificationWarning";
    public static final String API_SELECTION_CHANGE = "selectionChange";
    public static final String API_VIBRATE = "vibrate";
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public Vibrator f1947a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(108003331);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(108003330);
    }

    public static /* synthetic */ Object ipc$super(HapticsEngineAbility hapticsEngineAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/hapticsengine/HapticsEngineAbility");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4792a5ba", new Object[]{this});
            return;
        }
        Vibrator vibrator = this.f1947a;
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    @Override // tb.cu
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        a();
        this.f1947a = null;
    }

    public final FinishResult b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FinishResult) ipChange.ipc$dispatch("95d461a8", new Object[]{this});
        }
        return new FinishResult(new JSONObject(kotlin.collections.a.k(jpu.a("result", Boolean.TRUE))), null, 2, null);
    }

    public final void c(List<? extends Object> list, List<Long> list2, List<Integer> list3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4afb7e00", new Object[]{this, list, list2, list3});
            return;
        }
        List<? extends Object> list4 = list;
        ArrayList<Map> arrayList = new ArrayList(zz3.q(list4, 10));
        for (Object obj : list4) {
            if (!(obj instanceof Map)) {
                obj = null;
            }
            arrayList.add((Map) obj);
        }
        long j = 0;
        for (Map map : arrayList) {
            String w = MegaUtils.w(map, "type", "continuous");
            float f = 0.0f;
            Float k = MegaUtils.k(map, "relativeTime", Float.valueOf(0.0f));
            float floatValue = k != null ? k.floatValue() : 0.0f;
            Float k2 = MegaUtils.k(map, "intensity", Float.valueOf(0.0f));
            float floatValue2 = k2 != null ? k2.floatValue() : 0.0f;
            Float k3 = MegaUtils.k(map, "duration", Float.valueOf(0.0f));
            float floatValue3 = k3 != null ? k3.floatValue() : 0.0f;
            float f2 = 0;
            if (floatValue < f2) {
                floatValue = 0.0f;
            }
            if (floatValue3 < f2) {
                floatValue3 = 0.0f;
            }
            if (floatValue2 >= f2) {
                f = floatValue2 > ((float) 1) ? 1.0f : floatValue2;
            }
            float f3 = 1000;
            long j2 = floatValue * f3;
            long j3 = floatValue3 * f3;
            if (ckf.b("transient", w)) {
                j3 = 15;
            }
            long j4 = j2 - j;
            if (j4 > 0) {
                list2.add(Long.valueOf(j4));
                j = j2;
            } else {
                long j5 = (j2 + j3) - j;
                j3 = j5 <= 0 ? 0L : j5;
                list2.add(1L);
            }
            list3.add(0);
            list2.add(Long.valueOf(j3));
            list3.add(Integer.valueOf((int) (Math.sqrt(f) * 255)));
            j += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01e5, code lost:
        if (r11.equals(com.alibaba.ability.impl.hapticsengine.HapticsEngineAbility.API_IMPACT_SOFT) != false) goto L_0x01e7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e9, code lost:
        if (android.os.Build.VERSION.SDK_INT < 26) goto L_0x01f7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01eb, code lost:
        r11 = android.os.VibrationEffect.createOneShot(20, 1);
        r12 = r10.f1947a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f1, code lost:
        if (r12 == null) goto L_0x01fe;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f3, code lost:
        r12.vibrate(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f7, code lost:
        r11 = r10.f1947a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f9, code lost:
        if (r11 == null) goto L_0x01fe;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01fb, code lost:
        r11.vibrate(20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0186, code lost:
        if (r11.equals(com.alibaba.ability.impl.hapticsengine.HapticsEngineAbility.API_IMPACT_RIGID) != false) goto L_0x019c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0190, code lost:
        if (r11.equals(com.alibaba.ability.impl.hapticsengine.HapticsEngineAbility.API_IMPACT_LIGHT) != false) goto L_0x01e7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019a, code lost:
        if (r11.equals(com.alibaba.ability.impl.hapticsengine.HapticsEngineAbility.API_IMPACT_HEAVY) != false) goto L_0x019c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019e, code lost:
        if (android.os.Build.VERSION.SDK_INT < 26) goto L_0x01ac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a0, code lost:
        r11 = android.os.VibrationEffect.createOneShot(20, 255);
        r12 = r10.f1947a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a6, code lost:
        if (r12 == null) goto L_0x01fe;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a8, code lost:
        r12.vibrate(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ac, code lost:
        r11 = r10.f1947a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ae, code lost:
        if (r11 == null) goto L_0x01fe;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b0, code lost:
        r11.vibrate(20);
     */
    @Override // tb.hdb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.ability.result.ExecuteResult execute(java.lang.String r11, tb.kdb r12, java.util.Map<java.lang.String, ? extends java.lang.Object> r13, tb.vq r14) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.hapticsengine.HapticsEngineAbility.execute(java.lang.String, tb.kdb, java.util.Map, tb.vq):com.alibaba.ability.result.ExecuteResult");
    }
}
