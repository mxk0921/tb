package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsKVStorageAbility;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class uii {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final AbsKVStorageAbility f29400a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337704);
        }

        public a() {
        }

        public static final /* synthetic */ ErrorResult a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("848c8d43", new Object[]{aVar});
            }
            return aVar.c();
        }

        @JvmStatic
        public final uii b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (uii) ipChange.ipc$dispatch("f018258e", new Object[]{this});
            }
            try {
                Object d = yii.d(yii.INSTANCE, "kvStorage", null, 2, null);
                if (!(d instanceof AbsKVStorageAbility)) {
                    d = null;
                }
                return new uii((AbsKVStorageAbility) d, null);
            } catch (Throwable th) {
                iih.INSTANCE.a("MegaKVStorage", "create internal ability error: " + th.getMessage());
                return new uii(null, null);
            }
        }

        public final ErrorResult c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("21b1e117", new Object[]{this});
            }
            return new ErrorResult("500", "internal ability is null, please check if the class '" + yii.b(yii.INSTANCE, "kvStorage", null, 2, null) + "' exists", (Map) null, 4, (a07) null);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337703);
    }

    public uii(AbsKVStorageAbility absKVStorageAbility) {
        this.f29400a = absKVStorageAbility;
    }

    public final tao<String, ErrorResult> a(String str, String str2) {
        tao<String, ErrorResult> item;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("ee08efac", new Object[]{this, str, str2});
        }
        ckf.g(str, "bizID");
        ckf.g(str2, "key");
        l1g a2 = l1g.Companion.a(str, str2);
        if (a2 == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("params invalid"));
        }
        AbsKVStorageAbility absKVStorageAbility = this.f29400a;
        return (absKVStorageAbility == null || (item = absKVStorageAbility.getItem(zhi.Companion.a(), a2)) == null) ? new tao<>(null, a.a(Companion)) : item;
    }

    public /* synthetic */ uii(AbsKVStorageAbility absKVStorageAbility, a07 a07Var) {
        this(absKVStorageAbility);
    }
}
