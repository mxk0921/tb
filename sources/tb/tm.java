package tb;

import android.content.Context;
import android.view.View;
import android.widget.Space;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740545);
    }

    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        return new Space(context);
    }
}
