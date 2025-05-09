package tb;

import android.view.View;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.subscriber.data.OperateFields;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mc1 extends n6v implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "arrowMoreClick";
    public lc1 j;
    public b8v k;

    static {
        t2o.a(614465748);
    }

    public static /* synthetic */ Object ipc$super(mc1 mc1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/ArrowMoreClickSubscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "-92876773701590212";
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68d6f386", new Object[]{this});
            return;
        }
        lc1 lc1Var = this.j;
        if (lc1Var != null && lc1Var.d()) {
            this.j.a();
            this.j = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        try {
            J();
            sj8.g(this.k, ((OperateFields) view.getTag()).getEvent());
        } catch (Exception unused) {
        }
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
        } else if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enableHandleArrowMoreClick", true)) {
            if (b8vVar == null) {
                uj8.a(mc1.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "ultronEvent is null");
                return;
            }
            this.k = b8vVar;
            JSONObject fields = b8vVar.d().getFields();
            if (fields == null) {
                uj8.a(mc1.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "ultronEvent is null");
                return;
            }
            J();
            try {
                new ArrayList();
                kor.a("ArrowMoreClickSubscriber", "onHandleEventChain", fields.toJSONString());
                ArrayList arrayList = (ArrayList) JSON.parseArray(fields.get("moreValues").toString(), OperateFields.class);
                if (!arrayList.isEmpty()) {
                    HashMap hashMap = (HashMap) b8vVar.i("bizParams");
                    if (hashMap.get("nativeView") instanceof View) {
                        View view = (View) hashMap.get("nativeView");
                        if (view == null) {
                            uj8.a(mc1.class.getSimpleName(), "RECYCLER_VIEW_HOLDER_IS_NULL", "RECYCLER_VIEW_HOLDER_IS_NULL");
                            return;
                        }
                        kor.a("ArrowMoreClickSubscriber", "load popWinodw", arrayList.toString());
                        lc1 lc1Var = new lc1(b8vVar.e(), arrayList, this);
                        this.j = lc1Var;
                        lc1Var.e(view);
                    }
                }
            } catch (Throwable th) {
                uj8.a(mc1.class.getSimpleName(), "EVENT_CHAIN_TRY_EXCEPTION_ERROR", uj8.d(th));
            }
        }
    }
}
