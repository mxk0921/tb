package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jpo<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(689963205);
    }

    public static /* synthetic */ List a(jpo jpoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5555a56d", new Object[]{jpoVar});
        }
        throw null;
    }
}
