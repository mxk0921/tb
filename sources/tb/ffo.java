package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ffo implements mdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public mdb f19256a;

    static {
        t2o.a(786432007);
        t2o.a(144703546);
    }

    @Override // tb.mdb
    public idb get(String str, String str2, String str3) {
        ckf.g(str, "name");
        ckf.g(str2, "namespace");
        ckf.g(str3, "businessId");
        if (this.f19256a == null) {
            try {
                Method method = Class.forName("com.alibaba.rocket.ability.RocketEntrance").getMethod("getAbilityHub", new Class[0]);
                Object invoke = method != null ? method.invoke(null, new Object[0]) : null;
                if (invoke != null) {
                    this.f19256a = (mdb) invoke;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.ability.hub.IAbilityHub");
                }
            } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
            }
        }
        mdb mdbVar = this.f19256a;
        if (mdbVar != null) {
            return mdbVar.get(str, str2, str3);
        }
        return null;
    }
}
