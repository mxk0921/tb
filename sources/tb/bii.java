package tb;

import android.app.Activity;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsAlertAbility;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class bii {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final AbsAlertAbility f16404a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337685);
        }

        public a() {
        }

        public static final /* synthetic */ ErrorResult a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("bb6a616f", new Object[]{aVar});
            }
            return aVar.c();
        }

        @JvmStatic
        public final bii b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bii) ipChange.ipc$dispatch("e2ed3de2", new Object[]{this});
            }
            try {
                Object d = yii.d(yii.INSTANCE, "Alert", null, 2, null);
                if (!(d instanceof AbsAlertAbility)) {
                    d = null;
                }
                return new bii((AbsAlertAbility) d, null);
            } catch (Throwable th) {
                iih.INSTANCE.a("MegaAlert", "create internal ability error: " + th.getMessage());
                return new bii(null, null);
            }
        }

        public final ErrorResult c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("21b1e117", new Object[]{this});
            }
            return new ErrorResult("500", "internal ability is null, please check if the class '" + yii.b(yii.INSTANCE, "Alert", null, 2, null) + "' exists", (Map) null, 4, (a07) null);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337684);
    }

    public bii(AbsAlertAbility absAlertAbility) {
        this.f16404a = absAlertAbility;
    }

    @JvmStatic
    public static final bii a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bii) ipChange.ipc$dispatch("e2ed3de2", new Object[0]);
        }
        return Companion.b();
    }

    public final void b(Activity activity, xk0 xk0Var, osc oscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78e73115", new Object[]{this, activity, xk0Var, oscVar});
            return;
        }
        ckf.g(activity, "activity");
        ckf.g(xk0Var, "params");
        AbsAlertAbility absAlertAbility = this.f16404a;
        if (absAlertAbility != null) {
            xq b = zhi.Companion.b(activity);
            if (oscVar == null) {
                oscVar = new cii();
            }
            absAlertAbility.show(b, xk0Var, oscVar);
        } else if (oscVar != null) {
            oscVar.O(a.a(Companion));
        }
    }

    public /* synthetic */ bii(AbsAlertAbility absAlertAbility, a07 a07Var) {
        this(absAlertAbility);
    }
}
