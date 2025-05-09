package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class zsn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806354991);
    }

    public static /* synthetic */ void a(zsn zsnVar, RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3df695e7", new Object[]{zsnVar, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        throw null;
    }
}
