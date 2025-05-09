package tb;

import android.content.Context;
import android.util.TypedValue;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class dxo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final dxo INSTANCE = new dxo();

    static {
        t2o.a(1031798828);
    }

    public final int a(int i, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6fb7090d", new Object[]{this, new Integer(i), context})).intValue();
        }
        ckf.g(context, "context");
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public final int b(Context context) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{this, context})).intValue();
        }
        ckf.g(context, "context");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = context.getResources().getDimensionPixelSize(identifier);
        }
        return (int) ((i / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
