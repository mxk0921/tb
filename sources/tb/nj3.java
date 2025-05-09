package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.taopai.charge.data.TpChargeBean;
import com.taobao.android.taopai.charge.net.ChargeReportBusiness;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nj3 implements wmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final oj3 f24768a = new oj3();
    public final int b = t9l.c(2);

    static {
        t2o.a(782237706);
        t2o.a(782237699);
        t2o.a(782237717);
    }

    public final void a(List<TpChargeBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4949797", new Object[]{this, list});
        } else {
            new ChargeReportBusiness(list, this).start();
        }
    }

    public void b(List<TpChargeBean> list, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3944d329", new Object[]{this, list, str, str2});
            return;
        }
        if (!act.e()) {
            Log.e("TaopaiCharge", "onFail, error = " + str + " | " + str2);
        }
        if (t9l.f() && TextUtils.equals(str, ChargeReportBusiness.CODE_ERROR_SYSTEM) && list.size() < 50) {
            this.f24768a.c(list);
            this.f24768a.h();
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
        } else if (!act.e()) {
            new StringBuilder("onSuccess , traceId = ").append(str);
        }
    }

    public void d(TpChargeBean tpChargeBean) {
        List<TpChargeBean> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18087ead", new Object[]{this, tpChargeBean});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f24768a.e());
        arrayList.add(tpChargeBean);
        if (arrayList.size() >= this.b) {
            int size = arrayList.size() / this.b;
            for (int i = 1; i <= size; i++) {
                if (i != size) {
                    int i2 = this.b;
                    list = arrayList.subList((i - 1) * i2, i2 * i);
                } else {
                    list = arrayList.subList(this.b * (i - 1), arrayList.size());
                }
                a(list);
            }
            this.f24768a.d();
            return;
        }
        this.f24768a.e().add(tpChargeBean);
        this.f24768a.h();
    }
}
