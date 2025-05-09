package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class onm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final onm INSTANCE = new onm();

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f25514a;

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a636b235", new Object[]{this})).booleanValue();
        }
        n9l n9lVar = n9l.INSTANCE;
        JSONObject r = n9lVar.r();
        Long l = r != null ? r.getLong("version") : null;
        return l != null && l.longValue() >= ((long) n9lVar.a0());
    }

    public final boolean b() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6864cb0e", new Object[]{this})).booleanValue();
        }
        if (f25514a == null) {
            if (xgn.INSTANCE.j() && a()) {
                z = true;
            }
            f25514a = Boolean.valueOf(z);
        }
        Boolean bool = f25514a;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
    }
}
