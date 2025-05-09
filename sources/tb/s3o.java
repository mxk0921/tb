package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.core.OrderConfigs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class s3o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public gs7 f27780a;
    public qho b;
    public zpq c;

    static {
        t2o.a(614465632);
    }

    public k4d a(Context context, OrderConfigs.BizNameType bizNameType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k4d) ipChange.ipc$dispatch("48f876f", new Object[]{this, context, bizNameType, str});
        }
        if (OrderConfigs.BizNameType.ORDER_LIST != bizNameType || !wbl.e() || TextUtils.isEmpty(str) || !str.toLowerCase().startsWith(CoreConstants.API_NAME_LIST)) {
            if (this.f27780a == null) {
                this.f27780a = new gs7();
            }
            return this.f27780a;
        } else if (str.toLowerCase().startsWith("mtop.taobao.order.queryboughtlistv2")) {
            if (this.b == null) {
                this.b = new qho(context, "nextrpc-TM2");
            }
            return this.b;
        } else {
            if (this.c == null) {
                this.c = new zpq(context, "nextrpc-TM2");
            }
            return this.c;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        gs7 gs7Var = this.f27780a;
        if (gs7Var != null) {
            gs7Var.d();
            this.f27780a = null;
        }
        qho qhoVar = this.b;
        if (qhoVar != null) {
            qhoVar.d();
            this.b = null;
        }
    }
}
