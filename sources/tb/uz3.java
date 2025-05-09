package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class uz3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(758120560);
    }

    public static boolean a(Collection collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b35377f", new Object[]{collection})).booleanValue();
        }
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }
}
