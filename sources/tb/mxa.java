package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mxa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092720);
    }

    public static List<String> a(ux9 ux9Var, String... strArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3ca21118", new Object[]{ux9Var, strArr});
        }
        ArrayList arrayList = new ArrayList();
        VideoInfo c0 = up6.c0(ux9Var);
        arrayList.add("feedId=" + d(ux9Var));
        arrayList.add("liveSource=" + up6.L(ux9Var));
        arrayList.add("entrySource=" + up6.v(ux9Var));
        arrayList.add("timestamp=" + System.currentTimeMillis());
        arrayList.add("timeShiftEntry=" + up6.Y(ux9Var));
        arrayList.add("jiangjie_ID=" + up6.H(ux9Var));
        arrayList.add("oneproduct_jiangjie=" + up6.M(ux9Var));
        arrayList.add("oneproduct_mounting=" + up6.N(ux9Var));
        if (c0 != null) {
            AccountInfo accountInfo = c0.broadCaster;
            if (accountInfo != null) {
                str = accountInfo.accountId;
            } else {
                str = "";
            }
            arrayList.add("accountId=" + str);
            arrayList.add("roomStatus=" + c0.roomStatus);
        }
        if (!TextUtils.isEmpty(up6.a0(ux9Var))) {
            arrayList.add("trackInfo=" + up6.a0(ux9Var));
        }
        arrayList.add("serverParams=" + up6.S(ux9Var));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return arrayList;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98b754ed", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.contains("goodstimemove")) {
            str = str.replaceAll("goodstimemove.", "");
        }
        if (str.contains("timemoveReturn")) {
            str = str.replaceAll("timemoveReturn.", "");
        }
        if (str.contains("PlayBackToLive")) {
            str = str.replaceAll("PlayBackToLive.", "");
        }
        return str.contains("switchTimemove") ? str.replaceAll("switchTimemove.", "") : str;
    }

    public static String d(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8b9e6d4", new Object[]{ux9Var});
        }
        VideoInfo c0 = up6.c0(ux9Var);
        if (c0 != null) {
            return c0.liveId;
        }
        return null;
    }

    public static void c(String str, ux9 ux9Var, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5daeb76e", new Object[]{str, ux9Var, strArr});
        } else {
            gq0.p().b("taobaolive", str, up6.a0(ux9Var), (String[]) a(ux9Var, strArr).toArray(new String[0]));
        }
    }
}
