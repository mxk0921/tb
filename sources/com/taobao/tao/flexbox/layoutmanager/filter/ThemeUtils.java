package com.taobao.tao.flexbox.layoutmanager.filter;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.em7;
import tb.od0;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ThemeUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503317251);
    }

    public static Object a(String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a0cdb2ad", new Object[]{str, list});
        }
        try {
            if (str.hashCode() == 2057998080 && str.equals(em7.IS_ELDER)) {
                return Boolean.valueOf(isElder());
            }
            return "";
        } catch (Throwable th) {
            tfs.e("theme.filter", "error:" + str + th.getMessage());
            return "";
        }
    }

    @FilterHandler(name = em7.IS_ELDER)
    public static boolean isElder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4e0938b", new Object[0])).booleanValue();
        }
        return od0.D().A().a();
    }
}
