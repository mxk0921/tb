package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class e64 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ListStyle f18311a;
    public asi b;

    static {
        t2o.a(993001801);
    }

    public e64(ListStyle listStyle) {
        this.f18311a = listStyle;
    }

    public static e64 a(ListStyle listStyle, asi asiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e64) ipChange.ipc$dispatch("11113aeb", new Object[]{listStyle, asiVar});
        }
        e64 e64Var = new e64(listStyle);
        e64Var.b = asiVar;
        return e64Var;
    }
}
