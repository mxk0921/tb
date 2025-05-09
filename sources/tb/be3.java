package tb;

import android.content.Context;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class be3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final be3 INSTANCE = new be3();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements msc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
                return;
            }
            ckf.g(errorResult, "result");
            ub3.g("CartToast", "MegaToast出错:" + errorResult.getMsg());
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f16343a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public b(Context context, String str, String str2) {
            this.f16343a = context;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                be3.a(be3.INSTANCE, this.f16343a, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(479199625);
    }

    public static final /* synthetic */ void a(be3 be3Var, Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9c6c8af", new Object[]{be3Var, context, str, str2});
        } else {
            be3Var.b(context, str, str2);
        }
    }

    @JvmStatic
    public static final void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa33c00e", new Object[]{context, str});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, "message");
        d(context, str, null);
    }

    @JvmStatic
    public static final void d(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eda4258", new Object[]{context, str, str2});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, "message");
        pav.i(new b(context, str, str2), 0L);
    }

    public final void b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b043c8d", new Object[]{this, context, str, str2});
            return;
        }
        try {
            hji.a().c(new g0u(kotlin.collections.a.i(jpu.a("content", str), jpu.a("iconURL", str2))), new a());
            xhv xhvVar = xhv.INSTANCE;
        } catch (Throwable th) {
            hav.a("UltronCatchException", th.getMessage());
            ub3.g("CartToast", "MegaToast出错1:" + th.getMessage());
            xhv xhvVar2 = xhv.INSTANCE;
        }
    }
}
