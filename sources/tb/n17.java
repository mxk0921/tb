package tb;

import android.content.Context;
import android.graphics.Typeface;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n17 implements sdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503316570);
        t2o.a(503316588);
    }

    @Override // tb.sdc
    public Typeface a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("e099d6c4", new Object[]{this, context});
        }
        return Typeface.createFromAsset(context.getAssets(), "uik_iconfont.ttf");
    }
}
