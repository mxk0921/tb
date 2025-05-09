package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.subscriber.data.OperateFields;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qvp extends n6v implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "moreClickV2";
    public z6l j;
    public b8v k;
    public ArrayList<OperateFields> l;

    static {
        t2o.a(614465764);
    }

    public static /* synthetic */ Object ipc$super(qvp qvpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/ShowMoreOrderOpSubscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "-3518449732871602506";
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68d6f386", new Object[]{this});
            return;
        }
        z6l z6lVar = this.j;
        if (z6lVar != null && z6lVar.d()) {
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
        J();
        Object tag = view.getTag();
        if (tag instanceof OperateFields) {
            String event = ((OperateFields) tag).getEvent();
            b8v b8vVar = this.k;
            if (b8vVar != null && b8vVar.d() != null && this.k.d().getEvents() != null && !sj8.g(this.k, event)) {
                F(this.k, oml.e(this.k.d(), event), null);
                return;
            }
            return;
        }
        uj8.a(qvp.class.getSimpleName(), "EVENT_CHAIN_TRY_EXCEPTION_ERROR", "tag is null Or cast error" + tag);
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
        } else if (b8vVar == null) {
            uj8.a(qvp.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "ultronEvent is null");
        } else {
            this.k = b8vVar;
            JSONObject fields = b8vVar.d().getFields();
            if (fields == null) {
                uj8.a(qvp.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "ultronEvent is null");
                return;
            }
            J();
            try {
                JSONObject jSONObject = fields.containsKey("suborderop") ? fields.getJSONObject("suborderop") : fields;
                this.l = new ArrayList<>();
                kor.a("ShowMoreOrderOpSubscrib", "onHandleEventChain", jSONObject.toJSONString());
                this.l = (ArrayList) JSON.parseArray(jSONObject.get(pg1.ATOM_values).toString(), OperateFields.class);
                String string = fields.getString("maxShow");
                i = TextUtils.isEmpty(string) ? 3 : Integer.parseInt(string);
                if (Localization.o()) {
                }
                ArrayList<OperateFields> arrayList = this.l;
                if (arrayList == null || arrayList.size() <= i) {
                    uj8.a(qvp.class.getSimpleName(), "EVENT_CHAIN_CODES_SMALL_ERROR", "codes list small than " + i);
                    return;
                }
                ArrayList<OperateFields> arrayList2 = this.l;
                ArrayList arrayList3 = new ArrayList(arrayList2.subList(i, arrayList2.size()));
                if (!arrayList3.isEmpty()) {
                    uj8.f(qvp.class.getSimpleName(), "onHandleEventChain", "size 正常匹配");
                    HashMap hashMap = (HashMap) b8vVar.i("bizParams");
                    if (hashMap.get("nativeView") instanceof View) {
                        View view = (View) hashMap.get("nativeView");
                        if (view == null) {
                            uj8.a(qvp.class.getSimpleName(), "RECYCLER_VIEW_HOLDER_IS_NULL", "RECYCLER_VIEW_HOLDER_IS_NULL");
                            return;
                        }
                        kor.a("ShowMoreOrderOpSubscrib", "load popWinodw", arrayList3.toString());
                        z6l z6lVar = new z6l(b8vVar.e(), arrayList3, this);
                        this.j = z6lVar;
                        z6lVar.e(view);
                    }
                }
            } catch (Throwable th) {
                uj8.a(qvp.class.getSimpleName(), "EVENT_CHAIN_TRY_EXCEPTION_ERROR", uj8.d(th));
            }
        }
    }
}
