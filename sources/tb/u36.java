package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.mytaobao.homepage.busniess.model.DeliverInfoBean;
import com.taobao.mytaobao.ultron.fatigue.DeliverFatigueManager;
import com.taobao.mytaobao.ultron.model.UserTrackBean;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class u36 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_MTBORDERSLIDEREVENTHANDLE = -1149665750309895767L;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f29106a;
    public DeliverInfoBean b = null;

    static {
        t2o.a(745538120);
    }

    public u36(boolean z) {
        this.f29106a = z;
    }

    public static /* synthetic */ Object ipc$super(u36 u36Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/event/DXMTBOrderSliderEventHandleEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DeliverInfoBean deliverInfoBean;
        UserTrackBean userTrackBean;
        JSONObject jSONObject;
        Integer integer;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (!this.f29106a) {
            DXPageChangeEvent dXPageChangeEvent = (DXPageChangeEvent) dXEvent;
            if (objArr != null && objArr.length >= 2) {
                try {
                    deliverInfoBean = (DeliverInfoBean) JSON.parseObject(JSON.toJSONString(((List) objArr[0]).get(dXPageChangeEvent.pageIndex)), DeliverInfoBean.class);
                } catch (Exception unused) {
                    deliverInfoBean = null;
                }
                if (deliverInfoBean != null) {
                    DeliverInfoBean deliverInfoBean2 = this.b;
                    if (deliverInfoBean2 == null || (str = deliverInfoBean2.orderId) == null || !str.equals(deliverInfoBean.orderId)) {
                        this.b = deliverInfoBean;
                        DeliverFatigueManager a2 = sb7.a();
                        if (a2 != null) {
                            a2.d(deliverInfoBean.orderId, deliverInfoBean.fatigue);
                        }
                        int i = deliverInfoBean.index;
                        List list = (List) objArr[1];
                        if (list != null && list.size() > 0) {
                            for (Object obj : list) {
                                if (!(!(obj instanceof JSONObject) || (userTrackBean = (UserTrackBean) ((JSONObject) obj).getObject("fields", UserTrackBean.class)) == null || (jSONObject = userTrackBean.args) == null || (integer = jSONObject.getInteger("index")) == null || integer.intValue() != i)) {
                                    suv.e(userTrackBean.page, 2101, userTrackBean.arg1, null, null, userTrackBean.args);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }
}
