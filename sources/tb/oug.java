package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class oug {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final oug INSTANCE = new oug();

    /* renamed from: a  reason: collision with root package name */
    public static ListStyle f25663a;

    public final ListStyle a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("fbfbe301", new Object[]{this});
        }
        return f25663a;
    }

    public final void b(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ee5655", new Object[]{this, listStyle});
        } else if (listStyle != null) {
            f25663a = listStyle;
            v4p.b().edit().putString("savedListStyle", listStyle.getValue()).apply();
        }
    }

    static {
        t2o.a(815793485);
        String string = v4p.b().getString("savedListStyle", "");
        if (ckf.b("list", string)) {
            f25663a = ListStyle.LIST;
        } else if (ckf.b("wf", string)) {
            f25663a = ListStyle.WATERFALL;
        }
    }
}
