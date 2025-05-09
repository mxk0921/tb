package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class c6i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699706);
    }

    public static boolean a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42ff03f2", new Object[]{charSequence})).booleanValue();
        }
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    public static int e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19d449c0", new Object[]{str})).intValue();
        }
        try {
            if (a(str)) {
                return 0;
            }
            return Integer.parseInt(str);
        } catch (Exception e) {
            o3s.c("SmartLanding", "parseInt exp", e);
            return 0;
        }
    }

    public static boolean b(HashMap<String, String> hashMap, SmartLandingTask.Condition condition) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2bd5c5", new Object[]{hashMap, condition})).booleanValue();
        }
        if (condition != null) {
            if (hashMap != null) {
                str = hashMap.get(condition.paramKey);
            } else {
                str = "";
            }
            o3s.b("SmartLanding", condition.behavior + " " + condition.paramKey + " : [" + str + "] " + condition.operation + " " + condition.paramValue);
            if (a(condition.paramValue) || a(str)) {
                o3s.b("SmartLanding", "matchCondition: condition.paramValue or behaviorValue is empty.");
                return false;
            } else if ("==".equals(condition.operation)) {
                return e(str) == e(condition.paramValue);
            } else {
                if (">".equals(condition.operation)) {
                    return e(str) > e(condition.paramValue);
                }
                if ("<".equals(condition.operation)) {
                    return e(str) < e(condition.paramValue);
                }
                if (">=".equals(condition.operation)) {
                    return e(str) >= e(condition.paramValue);
                }
                if ("<=".equals(condition.operation)) {
                    return e(str) <= e(condition.paramValue);
                }
                if ("!=".equals(condition.operation)) {
                    return e(str) != e(condition.paramValue);
                }
                if (SmartLandingTask.Operation.STR_EQUAL.equals(condition.operation)) {
                    return condition.paramValue.equals(str);
                }
                if (SmartLandingTask.Operation.STR_UNEQUAL.equals(condition.operation)) {
                    return !condition.paramValue.equals(str);
                }
                if (SmartLandingTask.Operation.STR_INCLUDE.equals(condition.operation)) {
                    if (!TextUtils.isEmpty(str)) {
                        return Arrays.asList(str.split(",")).contains(condition.paramValue);
                    }
                    return false;
                } else if ("in".equals(condition.operation)) {
                    return Arrays.asList(condition.paramValue.split(",")).contains(str);
                }
            }
        } else {
            o3s.b("SmartLanding", "matchCondition: condition is null");
        }
        return false;
    }

    public static boolean c(HashMap<String, String> hashMap, ArrayList<SmartLandingTask.Condition> arrayList) {
        Exception e;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a5acf38", new Object[]{hashMap, arrayList})).booleanValue();
        }
        if (arrayList != null) {
            try {
                Iterator<SmartLandingTask.Condition> it = arrayList.iterator();
                while (true) {
                    boolean z2 = true;
                    while (it.hasNext()) {
                        try {
                            SmartLandingTask.Condition next = it.next();
                            if (!z2 || !b(hashMap, next)) {
                                z2 = false;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            z = z2;
                            o3s.c("SmartLanding", "matchCondition exp", e);
                            return z;
                        }
                    }
                    return z2;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } else {
            o3s.b("SmartLanding", "matchCondition: conditions is null. default result is FALSE.");
            return false;
        }
    }

    public static boolean d(HashMap<String, String> hashMap, ArrayList<ArrayList<SmartLandingTask.Condition>> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63903a3f", new Object[]{hashMap, arrayList})).booleanValue();
        }
        if (arrayList == null || arrayList.isEmpty()) {
            o3s.b("SmartLanding", "matchConditions: conditions is empty: default result is FALSE.");
            return false;
        }
        boolean z = false;
        for (int i = 0; i < arrayList.size(); i++) {
            z = z || c(hashMap, arrayList.get(i));
        }
        return z;
    }
}
