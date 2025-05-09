package tb;

import android.content.Intent;
import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qd3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Integer l = 4097;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends lmb {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ lcu l;
        public final /* synthetic */ IDMComponent m;

        public a(qd3 qd3Var, lcu lcuVar, IDMComponent iDMComponent) {
            this.l = lcuVar;
            this.m = iDMComponent;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/event/CartShowIndustrySkuSubscriber$1");
        }

        @Override // tb.l12
        public void j(lcu lcuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
                return;
            }
            Object e = lcuVar.e("requestCode");
            Object e2 = lcuVar.e("resultCode");
            Object e3 = lcuVar.e("data");
            if ((e instanceof Integer) && (e2 instanceof Integer) && (e3 instanceof Intent)) {
                int intValue = ((Integer) e).intValue();
                int intValue2 = ((Integer) e2).intValue();
                Intent intent = (Intent) e3;
                if (intValue == qd3.p().intValue() && intValue2 == -1) {
                    JSONObject parseObject = JSON.parseObject(intent.getStringExtra("params"));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("skuExtParams", (Object) parseObject);
                    this.l.m("skuExtParams", jSONObject);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.m.getKey());
                    this.l.m("operateItems", arrayList);
                    this.l.m("_isSupportChangeIDMEvent", Boolean.TRUE);
                    this.j.k0(this.m, this.l, true, null, null);
                }
            }
        }
    }

    static {
        t2o.a(478150781);
    }

    public static /* synthetic */ Object ipc$super(qd3 qd3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/event/CartShowIndustrySkuSubscriber");
    }

    public static /* synthetic */ Integer p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("4b3756de", new Object[0]);
        }
        return l;
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
        } else if (this.e == null) {
            UnifyLog.e("CartShowIndustrySkuSubscriber;", "onHandleEvent mComponent=null");
        } else {
            JSONObject c = c();
            if (c != null) {
                String string = c.getString("url");
                String string2 = c.getString("params");
                this.j.g().n("cart_activity_result", new a(this, lcuVar, this.e));
                Bundle bundle = new Bundle();
                bundle.putString("contentData", string2);
                Nav.from(this.b).withFragment(this.j.R()).withExtras(bundle).forResult(l.intValue()).toUri(string);
            }
        }
    }
}
