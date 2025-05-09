package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsOpenContainerAbility;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class zii {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final AbsOpenContainerAbility f32793a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337710);
        }

        public a() {
        }

        public static final /* synthetic */ ErrorResult a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("672922ea", new Object[]{aVar});
            }
            return aVar.c();
        }

        @JvmStatic
        public final zii b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (zii) ipChange.ipc$dispatch("3bd1da47", new Object[]{this});
            }
            try {
                Object d = yii.d(yii.INSTANCE, "OpenContainer", null, 2, null);
                if (!(d instanceof AbsOpenContainerAbility)) {
                    d = null;
                }
                return new zii((AbsOpenContainerAbility) d, null);
            } catch (Throwable th) {
                iih.INSTANCE.a("MegaOpenContainer", "create internal ability error: " + th.getMessage());
                return new zii(null, null);
            }
        }

        public final ErrorResult c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("21b1e117", new Object[]{this});
            }
            return new ErrorResult("500", "internal ability is null, please check if the class '" + yii.b(yii.INSTANCE, "OpenContainer", null, 2, null) + "' exists", (Map) null, 4, (a07) null);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337709);
    }

    public zii(AbsOpenContainerAbility absOpenContainerAbility) {
        this.f32793a = absOpenContainerAbility;
    }

    public final void b(h3l h3lVar, ysc yscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece03afc", new Object[]{this, h3lVar, yscVar});
            return;
        }
        ckf.g(h3lVar, "params");
        AbsOpenContainerAbility absOpenContainerAbility = this.f32793a;
        if (absOpenContainerAbility != null) {
            xq a2 = zhi.Companion.a();
            if (yscVar == null) {
                yscVar = new aji();
            }
            absOpenContainerAbility.preLoadAppInfo(a2, h3lVar, yscVar);
        } else if (yscVar != null) {
            yscVar.O(a.a(Companion));
        }
    }

    public /* synthetic */ zii(AbsOpenContainerAbility absOpenContainerAbility, a07 a07Var) {
        this(absOpenContainerAbility);
    }
}
