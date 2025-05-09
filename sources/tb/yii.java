package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class yii {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final yii INSTANCE = new yii();

    static {
        t2o.a(144703498);
    }

    public static /* synthetic */ String b(yii yiiVar, String str, String str2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d86c825", new Object[]{yiiVar, str, str2, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        return yiiVar.a(str, str2);
    }

    public static /* synthetic */ Object d(yii yiiVar, String str, String str2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("21a16550", new Object[]{yiiVar, str, str2, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        return yiiVar.c(str, str2);
    }

    public final String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13d2e226", new Object[]{this, str, str2});
        }
        ckf.g(str, "name");
        ckf.g(str2, DxContainerActivity.PARAMS_NAMESPACE);
        c2f.a();
        try {
            idb idbVar = er.a().get(str, str2, "");
            if (idbVar == null || !(idbVar instanceof hun)) {
                return "";
            }
            return ((hun) idbVar).e();
        } catch (Throwable th) {
            iih.INSTANCE.a("MegaNativeAbilityLoader", "获取能力实现类失败，错误原因：".concat(sm8.b(th)));
            return "";
        }
    }

    public final Object c(String str, String str2) {
        ckf.g(str, "name");
        ckf.g(str2, DxContainerActivity.PARAMS_NAMESPACE);
        String a2 = a(str, str2);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            return Class.forName(a2).newInstance();
        } catch (Throwable th) {
            iih.INSTANCE.a("MegaNativeAbilityLoader", "加载能力实现类失败，错误原因：".concat(sm8.b(th)));
            return null;
        }
    }
}
