package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.pop.PopMessageData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class acm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1030750326);
    }

    public static acm a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (acm) ipChange.ipc$dispatch("11347233", new Object[]{new Integer(i)});
        }
        if (1 == i) {
            return ass.c();
        }
        return j0a.c();
    }

    public abstract void b(Context context, PopMessageData popMessageData);
}
