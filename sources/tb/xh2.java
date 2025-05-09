package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xh2 extends vh2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean d;

    static {
        t2o.a(573571124);
    }

    public xh2(Context context, BootImageInfo bootImageInfo, BootImageInteractBaseView bootImageInteractBaseView) {
        super(context, bootImageInfo);
    }

    public static /* synthetic */ Object ipc$super(xh2 xh2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/biz/interact/presenter/BootImageInteractCouponPresenter");
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7c28f0", new Object[]{this});
            return;
        }
        try {
            if (this.b == null) {
                tm1.a("BootImageInteractCouponPresenter", "receiveCoupon mBootImageInfo == null");
                return;
            }
            tm1.a("BootImageInteractCouponPresenter", "receiveCoupon领券接口请求 mBootImageInfo == " + this.b);
            if (this.d) {
                tm1.a("BootImageInteractCouponPresenter", "领取优惠券请求中");
            } else {
                this.d = true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
