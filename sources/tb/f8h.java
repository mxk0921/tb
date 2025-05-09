package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class f8h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
    }

    static {
        t2o.a(729809149);
    }

    public static int a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("409026f", new Object[]{context, str})).intValue();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return context.getResources().getIdentifier(str, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, context.getPackageName());
        } catch (Exception e) {
            bqa.b(i8h.TAG, "Get layout parser exception", e);
            return 0;
        }
    }

    public static Drawable b(String str, Context context) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("37cb8662", new Object[]{str, context});
        }
        if (!TextUtils.isEmpty(str) && (a2 = a(context, str)) != 0) {
            return context.getDrawable(a2);
        }
        return null;
    }
}
