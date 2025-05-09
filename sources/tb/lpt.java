package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import tb.fuk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lpt extends ihj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements fuk.a<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(lpt lptVar) {
        }

        @Override // tb.fuk.a
        public void a(v35<String> v35Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0335d16", new Object[]{this, v35Var});
                return;
            }
            v35Var.d("InitBasicParam", "InitUCSoInjectB");
            v35Var.d("InitBasicParam", "InitRevisionSwitch");
            v35Var.d("InitRevisionSwitch", "InitLogin");
            v35Var.d("InitBasicParam", "InitURLRewrite");
            v35Var.d("InitLogin", "InitLoginParam");
            v35Var.d("InitLogin", "InitLoginLifeCycle");
            v35Var.d("InitBasicParam", "InitDeviceScore");
            v35Var.d("InitBasicParam", "InitAbilityKit");
            v35Var.d("InitBasicParam", "InitUCParamB");
            v35Var.d("InitBasicParam", "InitPopMin");
            v35Var.d("InitBasicParam", "InitMetricKit");
            v35Var.d("InitBasicParam", "InitPhenixHeif");
            v35Var.d("InitBasicParam", "InitPhenixApng");
            v35Var.d("InitNetworkStrategy", "InitMtop");
            v35Var.d("InitBasicParam", "InitUCParam");
            v35Var.d("InitMtop", "InitMtopSSRLink");
            v35Var.d("InitMtop", "InitMtopLifeCycle");
            v35Var.d("InitMtop", "InitMtopDelay");
            v35Var.d("InitMtop", "InitLinkManagerC");
            v35Var.d("InitMtopSSRLink", "InitTriverLightWeight");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements fuk.a<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(lpt lptVar) {
        }

        @Override // tb.fuk.a
        public void a(v35<String> v35Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0335d16", new Object[]{this, v35Var});
                return;
            }
            v35Var.c("InitAPMMin");
            v35Var.c("InitPermissionBridge");
            v35Var.c("InitUCParam");
            v35Var.c("InitABTest");
            v35Var.c("InitUCSoInject");
            v35Var.c("InitFontSetting");
            v35Var.c("InitWeexSmoothOpt");
        }
    }

    public lpt(Context context, sgg sggVar, int i) {
        super(context, sggVar, i);
    }

    public static /* synthetic */ Object ipc$super(lpt lptVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/bootstrap/tao/perf/schedulers/ThemisNGNextScheduler");
    }

    @Override // tb.hhj
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7617c0", new Object[]{this});
        }
    }

    @Override // tb.hhj
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c762be7e", new Object[]{this});
            return;
        }
        iqk iqkVar = this.f21312a;
        if (iqkVar instanceof fuk) {
            ((fuk) iqkVar).t("APM", new b(this));
        }
    }

    @Override // tb.hhj
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4532f39e", new Object[]{this});
            return;
        }
        iqk iqkVar = this.f21312a;
        if (iqkVar instanceof fuk) {
            ((fuk) iqkVar).t(TMSCalendarBridge.namespace, new a(this));
        }
    }

    @Override // tb.hhj
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("404e3750", new Object[]{this});
        }
    }
}
