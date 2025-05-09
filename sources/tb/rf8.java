package tb;

import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.Ingore;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rf8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Ingore
    private static boolean hasCheckdb = false;
    @Column("_id")
    public long _id = -1;

    static {
        t2o.a(962592859);
    }

    public void delete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691b3cb2", new Object[]{this});
        } else {
            o2w.k().h().h(this);
        }
    }

    public void store() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c724e8", new Object[]{this});
        } else {
            o2w.k().h().p(this);
        }
    }
}
