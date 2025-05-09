package tb;

import android.text.TextUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class kw6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544371);
    }

    public static double a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d6ae970", new Object[]{str})).doubleValue();
        }
        if (!TextUtils.isEmpty(str) && str.contains("_")) {
            String[] split = str.split("_");
            try {
                return Double.parseDouble(split[split.length - 1]);
            } catch (Exception unused) {
            }
        }
        return -1.0d;
    }

    public static boolean b(ExperimentV5 experimentV5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbbf5789", new Object[]{experimentV5})).booleanValue();
        }
        long a2 = mcp.a();
        if (a2 < experimentV5.getBeginTime() || a2 > experimentV5.getEndTime()) {
            return false;
        }
        return true;
    }

    public static boolean c(mwa mwaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34a36f1d", new Object[]{mwaVar})).booleanValue();
        }
        long a2 = mcp.a();
        if (a2 < mwaVar.c() || a2 > mwaVar.f()) {
            return false;
        }
        return true;
    }

    public static boolean d(int i, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c5920", new Object[]{new Integer(i), iArr})).booleanValue();
        }
        if (iArr == null || iArr.length < 2 || i < iArr[0] || i > iArr[1]) {
            return false;
        }
        return true;
    }

    public static boolean e(int i, int[][] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a576c19", new Object[]{new Integer(i), iArr})).booleanValue();
        }
        if (!(i < 0 || iArr == null || iArr.length == 0)) {
            for (int[] iArr2 : iArr) {
                if (d(i, iArr2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(int i, ExperimentGroupV5 experimentGroupV5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3b889bb", new Object[]{new Integer(i), experimentGroupV5})).booleanValue();
        }
        boolean e = e(i, experimentGroupV5.getRatioRange());
        if (e) {
            ogh.i("DecisionUtils", "【运行实验】实验分组流量计算。分组ID：" + experimentGroupV5.getId() + "，计算结果：有效流量(命中分桶)");
        } else {
            ogh.f("DecisionUtils", "【运行实验】实验分组流量计算。分组ID：" + experimentGroupV5.getId() + "，计算结果：无效流量(未命中分桶)");
        }
        return e;
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5672b2f4", new Object[]{str});
        }
        try {
            return String.format("%032X", new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())));
        } catch (NoSuchAlgorithmException e) {
            ogh.h("DecisionUtils", "motu md5 digest fail", e);
            return null;
        }
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5744755", new Object[]{str});
        }
        try {
            try {
                StringBuilder sb = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("md5").digest(str.getBytes())).toString(16));
                for (int i = 0; i < 32 - sb.length(); i++) {
                    sb.insert(0, "0");
                }
                return sb.toString();
            } catch (NoSuchAlgorithmException e) {
                ogh.h("DecisionUtils", "trade md5 digest fail", e);
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
