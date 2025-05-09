package tb;

import android.app.Activity;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsLoadingAbility;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class vii {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final AbsLoadingAbility f30033a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337706);
        }

        public a() {
        }

        public static final /* synthetic */ ErrorResult a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("e4f0238f", new Object[]{aVar});
            }
            return aVar.c();
        }

        @JvmStatic
        public final vii b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vii) ipChange.ipc$dispatch("ea580d42", new Object[]{this});
            }
            try {
                Object d = yii.d(yii.INSTANCE, "loading", null, 2, null);
                if (!(d instanceof AbsLoadingAbility)) {
                    d = null;
                }
                return new vii((AbsLoadingAbility) d, null);
            } catch (Throwable th) {
                iih.INSTANCE.a("MegaLoading", "create internal ability error: " + th.getMessage());
                return new vii(null, null);
            }
        }

        public final ErrorResult c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("21b1e117", new Object[]{this});
            }
            return new ErrorResult("500", "internal ability is null, please check if the class '" + yii.b(yii.INSTANCE, "loading", null, 2, null) + "' exists", (Map) null, 4, (a07) null);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337705);
    }

    public vii(AbsLoadingAbility absLoadingAbility) {
        this.f30033a = absLoadingAbility;
    }

    @JvmStatic
    public static final vii a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vii) ipChange.ipc$dispatch("ea580d42", new Object[0]);
        }
        return Companion.b();
    }

    public final void b(msc mscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef6f52f", new Object[]{this, mscVar});
            return;
        }
        AbsLoadingAbility absLoadingAbility = this.f30033a;
        if (absLoadingAbility != null) {
            xq a2 = zhi.Companion.a();
            if (mscVar == null) {
                mscVar = new yhi();
            }
            absLoadingAbility.hide(a2, mscVar);
        } else if (mscVar != null) {
            mscVar.O(a.a(Companion));
        }
    }

    public final void c(Activity activity, u6h u6hVar, msc mscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18de9535", new Object[]{this, activity, u6hVar, mscVar});
            return;
        }
        ckf.g(activity, "activity");
        ckf.g(u6hVar, "params");
        AbsLoadingAbility absLoadingAbility = this.f30033a;
        if (absLoadingAbility != null) {
            xq b = zhi.Companion.b(activity);
            if (mscVar == null) {
                mscVar = new yhi();
            }
            absLoadingAbility.show(b, u6hVar, mscVar);
        } else if (mscVar != null) {
            mscVar.O(a.a(Companion));
        }
    }

    public /* synthetic */ vii(AbsLoadingAbility absLoadingAbility, a07 a07Var) {
        this(absLoadingAbility);
    }
}
