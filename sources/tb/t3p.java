package tb;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.infoflow.SearchInfoFlowImpl;
import com.taobao.search.infoflow.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class t3p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792268);
    }

    public static a a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3426c5f0", new Object[]{str, context});
        }
        if (context instanceof LifecycleOwner) {
            return new SearchInfoFlowImpl(str, context, (LifecycleOwner) context);
        }
        return new SearchInfoFlowImpl(str, context, null);
    }
}
