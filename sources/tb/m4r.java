package tb;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class m4r extends m8<n9> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String STARTLOCATIONSERVICE = "7458050951944093004";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(786432102);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(786432101);
    }

    public static /* synthetic */ Object ipc$super(m4r m4rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/locaition/TAKAbilityStartLocationService");
    }

    /* renamed from: i */
    public c8<?> f(n8 n8Var, n9 n9Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("21e3ce11", new Object[]{this, n8Var, n9Var, u8Var});
        }
        ckf.g(n9Var, "abilityRuntimeContext");
        ckf.g(u8Var, "callback");
        Context d = n9Var.d();
        ckf.f(d, "abilityRuntimeContext.context");
        j(d);
        return new f8();
    }

    public final void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0b7f4b", new Object[]{this, context});
            return;
        }
        try {
            Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Throwable unused) {
        }
    }
}
