package tb;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.utils.TMSSwitchUtils;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.kernel.utils.CommonExtKt;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class w9s extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(834666571);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f30548a;
        public final /* synthetic */ String b;

        public b(Activity activity, String str) {
            this.f30548a = activity;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Toast.makeText(this.f30548a, this.b, 1).show();
            }
        }
    }

    static {
        t2o.a(834666570);
    }

    public w9s(bbs bbsVar, a9s a9sVar) {
        super(bbsVar, a9sVar);
    }

    public static /* synthetic */ Object ipc$super(w9s w9sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/canvas/launch_step/TMSDowngradeOn32Step");
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "DowngradeOn32";
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef60dff", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e2985e", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67daaada", new Object[]{this});
            return;
        }
        try {
            k();
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dac4afd", new Object[]{this});
            return;
        }
        String e0 = this.b.e0();
        Activity I = this.b.I();
        ckf.f(I, "mInstance.activity");
        if (e0 != null) {
            Uri parse = Uri.parse(e0);
            ckf.f(parse, "targetUri");
            if (TMSSwitchUtils.downgradeOn32(parse)) {
                TMSLogger.b("TMSDowngradeOn32Step", "32位设备降级");
                if (l() && q9s.Y1()) {
                    m(I, "当前淘宝为32位包，运行时可能出现卡顿、闪退等问题，请检查是否有更新");
                } else if (q9s.U1()) {
                    m(I, "当前淘宝为32位包，运行时可能出现卡顿、闪退等问题");
                } else if (o9s.h(I)) {
                    m(I, "32位设备降级");
                }
                this.b.W().e();
            }
        }
    }

    public final boolean l() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac5b47b4", new Object[]{this})).booleanValue();
        }
        String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
        ckf.f(strArr, "SUPPORTED_64_BIT_ABIS");
        if (strArr.length == 0) {
            z = true;
        }
        return !z;
    }

    public final void m(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af33ec4d", new Object[]{this, activity, str});
        } else {
            CommonExtKt.n(new b(activity, str));
        }
    }
}
