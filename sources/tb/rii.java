package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsImagePreviewAbility;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class rii {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final AbsImagePreviewAbility f27403a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337701);
        }

        public a() {
        }

        public static final /* synthetic */ ErrorResult a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("3584592", new Object[]{aVar});
            }
            return aVar.c();
        }

        @JvmStatic
        public final rii b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rii) ipChange.ipc$dispatch("8503130b", new Object[]{this});
            }
            try {
                Object d = yii.d(yii.INSTANCE, "ImagePreview", null, 2, null);
                if (!(d instanceof AbsImagePreviewAbility)) {
                    d = null;
                }
                return new rii((AbsImagePreviewAbility) d, null);
            } catch (Throwable th) {
                iih.INSTANCE.a("MegaImagePreview", "create internal ability error: " + th.getMessage());
                return new rii(null, null);
            }
        }

        public final ErrorResult c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("21b1e117", new Object[]{this});
            }
            return new ErrorResult("500", "internal ability is null, please check if the class '" + yii.b(yii.INSTANCE, "ImagePreview", null, 2, null) + "' exists", (Map) null, 4, (a07) null);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337700);
    }

    public rii(AbsImagePreviewAbility absImagePreviewAbility) {
        this.f27403a = absImagePreviewAbility;
    }

    @JvmStatic
    public static final rii a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rii) ipChange.ipc$dispatch("8503130b", new Object[0]);
        }
        return Companion.b();
    }

    public final void b(List<tne> list, wsc wscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d41442d1", new Object[]{this, list, wscVar});
            return;
        }
        ckf.g(list, "sources");
        sne a2 = sne.Companion.a(list);
        if (a2 != null) {
            c(a2, null, wscVar);
        } else if (wscVar != null) {
            wscVar.O(ErrorResult.a.Companion.g("params is null"));
        }
    }

    public final void c(sne sneVar, nne nneVar, wsc wscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fb1a796", new Object[]{this, sneVar, nneVar, wscVar});
            return;
        }
        ckf.g(sneVar, "params");
        xq a2 = zhi.Companion.a();
        if (nneVar != null) {
            a2.d("__mega_native__", nneVar);
        }
        AbsImagePreviewAbility absImagePreviewAbility = this.f27403a;
        if (absImagePreviewAbility != null) {
            if (wscVar == null) {
                wscVar = new sii();
            }
            absImagePreviewAbility.show(a2, sneVar, wscVar);
        } else if (wscVar != null) {
            wscVar.O(a.a(Companion));
        }
    }

    public /* synthetic */ rii(AbsImagePreviewAbility absImagePreviewAbility, a07 a07Var) {
        this(absImagePreviewAbility);
    }
}
