package tb;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ojv extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UPDATEDXROOTHEIGHT = "8572232953135811470";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(614465659);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public ojv build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ojv) ipChange.ipc$dispatch("234d58f9", new Object[]{this, obj});
            }
            return new ojv();
        }
    }

    static {
        t2o.a(614465658);
    }

    public static /* synthetic */ Object ipc$super(ojv ojvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/ability/UpdateDxRootSizeAbility");
    }

    public final String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92a198a", new Object[]{this, str});
        }
        if (str.contains(".")) {
            return str.split("\\.")[0];
        }
        return str;
    }

    /* renamed from: j */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        if (tk6Var == null || tk6Var.o() == null) {
            return new f8();
        }
        ViewGroup.LayoutParams layoutParams = tk6Var.o().getLayoutParams();
        if (layoutParams == null) {
            return new f8();
        }
        String i = n8Var.i("height");
        if (!TextUtils.isEmpty(i)) {
            try {
                layoutParams.height = Integer.parseInt(i(i));
            } catch (NumberFormatException unused) {
            }
        }
        String i2 = n8Var.i("width");
        if (!TextUtils.isEmpty(i2)) {
            try {
                layoutParams.width = Integer.parseInt(i(i2));
            } catch (NumberFormatException unused2) {
            }
        }
        tk6Var.o().setLayoutParams(layoutParams);
        return new f8();
    }
}
