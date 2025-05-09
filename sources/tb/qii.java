package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsGeneralSettingAbility;
import com.taobao.mytaobao.newsetting.GeneralSetting;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class qii {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final AbsGeneralSettingAbility f26770a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337698);
        }

        public a() {
        }

        public static final /* synthetic */ ErrorResult a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("e3065e2d", new Object[]{aVar});
            }
            return aVar.c();
        }

        @JvmStatic
        public final qii b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qii) ipChange.ipc$dispatch("2c8068d0", new Object[]{this});
            }
            try {
                Object d = yii.d(yii.INSTANCE, GeneralSetting.TAG, null, 2, null);
                if (!(d instanceof AbsGeneralSettingAbility)) {
                    d = null;
                }
                return new qii((AbsGeneralSettingAbility) d, null);
            } catch (Throwable th) {
                iih.INSTANCE.a("MegaGeneralSetting", "create internal ability error: " + th.getMessage());
                return new qii(null, null);
            }
        }

        public final ErrorResult c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("21b1e117", new Object[]{this});
            }
            return new ErrorResult("500", "internal ability is null, please check if the class '" + yii.b(yii.INSTANCE, GeneralSetting.TAG, null, 2, null) + "' exists", (Map) null, 4, (a07) null);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337697);
    }

    public qii(AbsGeneralSettingAbility absGeneralSettingAbility) {
        this.f26770a = absGeneralSettingAbility;
    }

    @JvmStatic
    public static final qii a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qii) ipChange.ipc$dispatch("2c8068d0", new Object[0]);
        }
        return Companion.b();
    }

    public final tao<String, ErrorResult> b(String str) {
        tao<String, ErrorResult> taoVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("e76cdbaf", new Object[]{this, str});
        }
        ckf.g(str, "key");
        f6a a2 = f6a.Companion.a(str);
        if (a2 == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("params invalid"));
        }
        AbsGeneralSettingAbility absGeneralSettingAbility = this.f26770a;
        return (absGeneralSettingAbility == null || (taoVar = absGeneralSettingAbility.get(zhi.Companion.a(), a2)) == null) ? new tao<>(null, a.a(Companion)) : taoVar;
    }

    public /* synthetic */ qii(AbsGeneralSettingAbility absGeneralSettingAbility, a07 a07Var) {
        this(absGeneralSettingAbility);
    }
}
