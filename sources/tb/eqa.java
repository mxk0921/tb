package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class eqa extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long HREFRESHIMAGE = -613601828156924633L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(729808996);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public eqa build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (eqa) ipChange.ipc$dispatch("69a0dc5e", new Object[]{this, obj});
            }
            return new eqa();
        }
    }

    static {
        t2o.a(729808995);
    }

    public static /* synthetic */ Object ipc$super(eqa eqaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/ability/HRefreshImageAbility");
    }

    /* renamed from: i */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        if (n8Var == null || tk6Var == null) {
            return null;
        }
        String i = n8Var.i("userId");
        if (TextUtils.isEmpty(i)) {
            bqa.d("HRefreshImageAbility", "userId is empty");
            return null;
        }
        String i2 = n8Var.i("imageUrl");
        if (TextUtils.isEmpty(i2)) {
            bqa.d("HRefreshImageAbility", "imageUrl is empty");
            return null;
        }
        DXRootView o = tk6Var.o();
        if (o == null) {
            return null;
        }
        DXWidgetNode queryWidgetNodeByUserId = o.getExpandWidgetNode().queryWidgetNodeByUserId(i);
        if (queryWidgetNodeByUserId == null) {
            bqa.d("HRefreshImageAbility", "imageNode is null");
            return null;
        }
        View D = queryWidgetNodeByUserId.getDXRuntimeContext().D();
        if (!(D instanceof TUrlImageView)) {
            bqa.d("HRefreshImageAbility", "nativeView is not TUrlImageView");
            return null;
        }
        ((TUrlImageView) D).setImageUrl(i2);
        bqa.d("HRefreshImageAbility", "refresh image widgetNode: " + i + " imageUrl: " + i2);
        return new f8();
    }
}
