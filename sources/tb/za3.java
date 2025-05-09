package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.android.icart.BaseICartFragment;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.TBMainHost;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class za3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_UMBRELLA_TYPE_VERSION = "1.0";

    static {
        t2o.a(478150775);
    }

    public static /* synthetic */ Object ipc$super(za3 za3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/event/CartDowngradeSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        fdv.d(lcuVar);
        MtopResponse mtopResponse = (MtopResponse) lcuVar.e("mtopResponse");
        if (mtopResponse != null) {
            mtopResponse.getBytedata();
        }
        q();
        p("ultron-cart", mtopResponse);
    }

    public final void p(String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7fd3f5c", new Object[]{this, str, mtopResponse});
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            String str2 = (String) this.f23048a.e("downgradeType");
            hashMap.put("traceId", f9u.a(mtopResponse));
            HashMap hashMap2 = new HashMap();
            Context context = this.b;
            if (context instanceof Activity) {
                hashMap2.put("intentParam", ((Activity) context).getIntent().getExtras());
            }
            hashMap.put("bizInfo", JSON.toJSONString(hashMap2));
            hashMap.put("downgradeType", str2);
            UmbrellaTracker.commitFailureStability("downgrade", "ultronCartDownGraded", "1.0", c9x.CART_BIZ_NAME, str, hashMap, mtopResponse.getRetCode(), mtopResponse.getRetMsg());
        } catch (Throwable th) {
            UnifyLog.e("CartDowngradeSubscriber", th.getMessage());
            hashMap.put("downgradeException", th.getMessage());
            UmbrellaTracker.commitFailureStability("eventProcess", "commitDownGraded", "1.0", c9x.CART_BIZ_NAME, str, hashMap, "", "");
        }
    }

    public final void q() {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("704de58b", new Object[]{this});
            return;
        }
        String str2 = (String) this.f23048a.e("downgradeType");
        if (ya3.TYPE_RENDER_ERROR_DOWNGRADE.equals(str2)) {
            str = "组件渲染异常，降级老购物车";
        } else {
            str = "新购物车协议降级";
        }
        if (Versions.isDebug()) {
            be3.c(this.b.getApplicationContext(), str);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("downgradeMsg", str);
        hashMap.put("downgradeType", str);
        if (this.b == TBMainHost.b().getContext()) {
            z = true;
        }
        hashMap.put("isMainCart", String.valueOf(z));
        hashMap.put("activityName", this.b.getClass().getName());
        fdv.a(fdv.F_PAGE_RENDER_TAG, "", "", "cart", "render", hashMap, "CartDegradeH5", "购物车被动降级H5，服务端处理失败降级老奥创协议，客户端降级H5. 具体原因是".concat(str));
        ub3.g("CartDegradeH5", "downgradeMsg=" + str + ",downgradeType=" + str2);
        ((BaseICartFragment) this.j.R()).r2().a("NativeToH5");
    }
}
