package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gqq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(970981421);
    }

    public static Set<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("c20ed6a1", new Object[]{str});
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return new HashSet(Arrays.asList(str.split(";")));
            }
        } catch (Throwable th) {
            ghh.c(th);
        }
        return new HashSet();
    }
}
