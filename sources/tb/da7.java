package tb;

import android.content.Context;
import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class da7 extends m8<k8> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String DELAY = "17315434034580";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(336592957);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k8 f17678a;
        public final /* synthetic */ u8 b;

        public b(k8 k8Var, u8 u8Var) {
            this.f17678a = k8Var;
            this.b = u8Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            u8 u8Var = this.b;
            if (u8Var != null) {
                u8Var.callback("onComplete", new f8());
            }
        }
    }

    static {
        t2o.a(336592956);
    }

    public static /* synthetic */ Object ipc$super(da7 da7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/DelayAbility");
    }

    @Override // tb.m8
    public c8<?> f(n8 n8Var, k8 k8Var, u8 u8Var) {
        long j;
        String i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        ckf.g(k8Var, "akAbilityRuntimeContext");
        if (n8Var != null) {
            Context d = k8Var.d();
            if (d == null) {
                return new b8(new a8(10016, "context is null"), false);
            }
            try {
                i = n8Var.i("duration");
            } catch (NumberFormatException unused) {
            }
            if (i != null) {
                j = Long.parseLong(i);
                new Handler(d.getMainLooper()).postDelayed(new b(k8Var, u8Var), j);
            }
            j = 0;
            new Handler(d.getMainLooper()).postDelayed(new b(k8Var, u8Var), j);
        }
        return new f8();
    }
}
