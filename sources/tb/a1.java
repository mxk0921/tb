package tb;

import android.text.TextUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.ut.abtest.internal.bucketing.ExperimentRoutingType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class a1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544365);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26a83ed8", new Object[]{str, str2});
        }
        return str + "##" + str2;
    }

    public static String b(ExperimentRoutingType experimentRoutingType, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3306fcd1", new Object[]{experimentRoutingType, str, str2});
        }
        if (experimentRoutingType == ExperimentRoutingType.UserId) {
            String o = n.j().o();
            if (!TextUtils.isEmpty(o)) {
                return d(o, str, str2);
            }
            ogh.f("ABUtils", "userId 获取失败，请检查是否登陆！");
            return null;
        }
        String d = d3r.c().d();
        if (!TextUtils.isEmpty(d)) {
            return d(d, str, str2);
        }
        ogh.f("ABUtils", "utdid 获取失败");
        return null;
    }

    public static boolean c(ExperimentV5 experimentV5, Set<Long> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72638f3", new Object[]{experimentV5, set})).booleanValue();
        }
        if (experimentV5 == null || experimentV5.getExpPublishType() != 2 || (set != null && set.contains(Long.valueOf(experimentV5.getReleaseId())))) {
            return false;
        }
        return true;
    }

    public static String d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8641b87b", new Object[]{str, str2, str3});
        }
        if ("motu_md5".equals(str3)) {
            return str2 + str;
        }
        return str + str2;
    }

    public static String[] e(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("25c68e4f", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str) && (split = TextUtils.split(str, "##")) != null && split.length == 2) {
            return split;
        }
        return null;
    }
}
