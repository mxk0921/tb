package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.utils.TMSSwitchUtils;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class tas extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28604a;
        public final /* synthetic */ tas b;

        public a(String str, tas tasVar) {
            this.f28604a = str;
            this.b = tasVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String a2 = uas.a(URLDecoder.decode(this.f28604a, "utf-8"));
                ekd ekdVar = (ekd) this.b.b.getExtension(ekd.class);
                if (ekdVar != null) {
                    ekdVar.X(a2);
                }
            } catch (UnsupportedEncodingException unused) {
            }
            tas.k(this.b);
        }
    }

    static {
        t2o.a(834666579);
    }

    public tas(bbs bbsVar, a9s a9sVar) {
        super(bbsVar, a9sVar);
    }

    public static /* synthetic */ Object ipc$super(tas tasVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/canvas/launch_step/TMSHotPatchJSFrameWorkStep");
    }

    public static final /* synthetic */ void k(tas tasVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6afd84d2", new Object[]{tasVar});
        } else {
            tasVar.i();
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "TMSHotPatchJSFrameWorkStep";
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
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67daaada", new Object[]{this});
            return;
        }
        bbs bbsVar = this.b;
        if (bbsVar != null && !bbsVar.g0()) {
            if (TMSSwitchUtils.useDevJSFramework()) {
                str = "https://unpkg.alibaba-inc.com/@ali/tb-widget-jsapi@1.0.48-beta.2/build/gm.fm.dev.js";
            } else {
                str = ies.c(this.b.e0(), "jsfm");
            }
            IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
            if (TextUtils.isEmpty(str) || iExecutorService == null) {
                i();
            } else {
                iExecutorService.getExecutor(ExecutorType.NETWORK).execute(new a(str, this));
            }
        }
    }
}
