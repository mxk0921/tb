package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class s85 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(452985182);
    }

    public static Drawable a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("572cf643", new Object[]{str, context});
        }
        return context.getResources().getDrawable(R.drawable.dw_bubble_item);
    }
}
