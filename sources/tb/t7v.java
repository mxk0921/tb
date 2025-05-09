package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import tb.w9v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class t7v extends gav {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465617);
    }

    public t7v(OrderConfigs orderConfigs) {
        this.c = orderConfigs;
    }

    public static /* synthetic */ Object ipc$super(t7v t7vVar, String str, Object... objArr) {
        if (str.hashCode() == -680330162) {
            super.k((Context) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/container/UltronDetailProxy");
    }

    @Override // tb.gav
    public void T(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c13aefce", new Object[]{this, context});
        } else {
            getInstance().V(127);
        }
    }

    @Override // tb.gav
    public void U(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("103d1c82", new Object[]{this, jSONObject});
            return;
        }
        OrderConfigs orderConfigs = this.c;
        if (orderConfigs != null && orderConfigs.u() != null) {
            this.c.u().l(jSONObject);
        }
    }

    @Override // tb.gav, tb.wqb
    public void k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d772fc4e", new Object[]{this, context});
            return;
        }
        super.k(context);
        h(w9v.ULTRONSEARCHTABCLICKV2, new w9v.a(this));
    }
}
