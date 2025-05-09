package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class hvn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final hvn INSTANCE = new hvn();

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Context, ptk> f20915a = new LinkedHashMap();

    static {
        t2o.a(481297576);
    }

    public final ptk a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ptk) ipChange.ipc$dispatch("c80e911f", new Object[]{this, context});
        }
        if (context == null) {
            return null;
        }
        return (ptk) ((LinkedHashMap) f20915a).get(context);
    }

    public final void b(Context context, ptk ptkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72039f0f", new Object[]{this, context, ptkVar});
        } else if (context != null && ptkVar != null) {
            f20915a.put(context, ptkVar);
        }
    }

    public final void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de44a5f1", new Object[]{this, context});
        } else if (context != null) {
            f20915a.remove(context);
        }
    }
}
