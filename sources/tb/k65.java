package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class k65 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(455082018);
    }

    public abstract void a(gpb gpbVar);

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57043f57", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract Map<String, String> getExposureViewProperties(String str, View view);

    public abstract vp8 getExposureViewTag(String str, View view);

    public abstract boolean isExposureView(String str, View view);
}
