package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.base.TBOrderBaseActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a4l extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPENNOTIFICATIONSETTING = "6183157295986091279";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(713031757);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public a4l build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a4l) ipChange.ipc$dispatch("820b4341", new Object[]{this, obj});
            }
            return new a4l();
        }
    }

    static {
        t2o.a(713031756);
    }

    public static /* synthetic */ Object ipc$super(a4l a4lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/dinamicX/ability/OpenNotificationSettingAbility");
    }

    /* renamed from: i */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        if (tk6Var == null) {
            return new f8();
        }
        Context d = tk6Var.d();
        if (d == null) {
            return new f8();
        }
        Intent f = c2u.f(d);
        if (d instanceof TBOrderBaseActivity) {
            ((Activity) d).startActivityForResult(f, 1001);
        } else {
            d.startActivity(f);
        }
        return new f8();
    }
}
