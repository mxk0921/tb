package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsUserKVStorageAbility;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class iji {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final AbsUserKVStorageAbility f21349a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337715);
        }

        public a() {
        }

        public static final /* synthetic */ ErrorResult a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("87d959b8", new Object[]{aVar});
            }
            return aVar.c();
        }

        @JvmStatic
        public final iji b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (iji) ipChange.ipc$dispatch("f15a3239", new Object[]{this});
            }
            try {
                Object d = yii.d(yii.INSTANCE, "userKVStorage", null, 2, null);
                if (!(d instanceof AbsUserKVStorageAbility)) {
                    d = null;
                }
                return new iji((AbsUserKVStorageAbility) d, null);
            } catch (Throwable th) {
                iih.INSTANCE.a("MegaUserKVStorage", "create internal ability error: " + th.getMessage());
                return new iji(null, null);
            }
        }

        public final ErrorResult c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("21b1e117", new Object[]{this});
            }
            return new ErrorResult("500", "internal ability is null, please check if the class '" + yii.b(yii.INSTANCE, "userKVStorage", null, 2, null) + "' exists", (Map) null, 4, (a07) null);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337714);
    }

    public iji(AbsUserKVStorageAbility absUserKVStorageAbility) {
        this.f21349a = absUserKVStorageAbility;
    }

    @JvmStatic
    public static final iji a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iji) ipChange.ipc$dispatch("f15a3239", new Object[0]);
        }
        return Companion.b();
    }

    public final tao<String, ErrorResult> b(String str, String str2) {
        tao<String, ErrorResult> item;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("ee08efac", new Object[]{this, str, str2});
        }
        ckf.g(str, "bizID");
        ckf.g(str2, "key");
        wrv a2 = wrv.Companion.a(str, str2);
        if (a2 == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("params invalid"));
        }
        AbsUserKVStorageAbility absUserKVStorageAbility = this.f21349a;
        return (absUserKVStorageAbility == null || (item = absUserKVStorageAbility.getItem(zhi.Companion.a(), a2)) == null) ? new tao<>(null, a.a(Companion)) : item;
    }

    public final void c(String str, String str2) {
        AbsUserKVStorageAbility absUserKVStorageAbility;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5304d2", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "bizID");
        ckf.g(str2, "key");
        wrv a2 = wrv.Companion.a(str, str2);
        if (a2 != null && (absUserKVStorageAbility = this.f21349a) != null) {
            absUserKVStorageAbility.removeItem(zhi.Companion.a(), a2);
        }
    }

    public final void d(String str, String str2, String str3) {
        AbsUserKVStorageAbility absUserKVStorageAbility;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40b917a", new Object[]{this, str, str2, str3});
            return;
        }
        ckf.g(str, "bizID");
        ckf.g(str2, "key");
        ckf.g(str3, "value");
        xrv a2 = xrv.Companion.a(str, str2, str3);
        if (a2 != null && (absUserKVStorageAbility = this.f21349a) != null) {
            absUserKVStorageAbility.setItem(zhi.Companion.a(), a2);
        }
    }

    public /* synthetic */ iji(AbsUserKVStorageAbility absUserKVStorageAbility, a07 a07Var) {
        this(absUserKVStorageAbility);
    }
}
