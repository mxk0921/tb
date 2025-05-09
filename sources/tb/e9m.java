package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e9m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295700137);
    }

    public static View a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ff2583bc", new Object[]{context, new Integer(i)});
        }
        if (context instanceof Activity) {
            return ((Activity) context).findViewById(i);
        }
        return null;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65810845", new Object[0])).booleanValue();
        }
        return false;
    }
}
