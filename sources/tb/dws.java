package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dws implements gac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092309);
        t2o.a(806354960);
    }

    @Override // tb.gac
    public Application getApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        return Globals.getApplication();
    }
}
