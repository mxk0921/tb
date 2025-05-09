package tb;

import android.content.Context;
import android.graphics.Typeface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sk6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Typeface f28105a;

    public static Typeface a(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("6719a83", new Object[]{context});
        }
        if (f28105a == null) {
            if (context != null) {
                try {
                    f28105a = Typeface.createFromAsset(context.getApplicationContext().getAssets(), "uik_iconfont.ttf");
                } catch (Throwable th) {
                    f fVar = new f("getTaoIconfont");
                    f.a aVar = new f.a("DX_GetTaoIconFont", "DX_GetTaoIconFont_Error", f.DX_GET_ICONFONT_VIEW_ERROR);
                    aVar.e = "getTaoIconfont 异常: " + xv5.a(th);
                    fVar.c.add(aVar);
                    ic5.p(fVar);
                }
            }
            StringBuilder sb = new StringBuilder("getTaoIconfont isSTaoIconfontNull = ");
            if (f28105a == null) {
                z = true;
            }
            sb.append(z);
            sb.append(" context = ");
            sb.append(context);
            la6.d(h36.TAG, h36.TAG, sb.toString());
        }
        return f28105a;
    }
}
