package tb;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class q3y {
    public static final Map<Class<?>, ddp> b = null;
    public static final Map<Class<?>, Object> c = null;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, ddp> f26497a = new HashMap();

    static {
        new HashMap();
        new HashMap();
    }

    public q3y(List<ddp> list, Context context) {
        new HashMap();
        a(list, context);
    }

    public void a(List<ddp> list, Context context) {
        if (list != null) {
            for (ddp ddpVar : list) {
                ddpVar.getClass();
                this.f26497a.put(null, ddpVar);
            }
        }
    }
}
