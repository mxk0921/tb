package tb;

import android.content.Intent;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;
import com.taobao.android.icart.broadcast.cartRefresh.ModalOrderRefreshProcessor;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fd3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kmb f19208a;
    public final mh3<Intent> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            Map<Object, ? extends Object> map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
            } else if (executeResult != null) {
                hav.d("CartRefreshMagabilityBroadcast", "回调,type=" + executeResult.getType() + ",statusCode=" + executeResult.getStatusCode() + ",data=" + executeResult.getData());
                Map<String, Object> data = executeResult.getData();
                if (data != null) {
                    Object obj = data.get("detail");
                    if (obj instanceof Map) {
                        map = (Map) obj;
                    } else {
                        map = new HashMap<>();
                    }
                    if ("fail".equals(data.get("result"))) {
                        hav.d("CartRefreshMagabilityBroadcast", "#失败");
                        return;
                    }
                    hav.d("CartRefreshMagabilityBroadcast", ResultCode.MSG_SUCCESS);
                    if (!vav.a(c9x.CART_BIZ_NAME, "compensatingCheckResultOnRefreshBroadcast", true) || !"fail".equals(map.get("result"))) {
                        r93.INSTANCE.a(map);
                        if (fd3.a(fd3.this).R() != null && !Objects.equals(fd3.a(fd3.this).O(), String.valueOf(map.get("cartInstanceId")))) {
                            fd3.a(fd3.this).W().x();
                            juv.d(fd3.a(fd3.this), "Page_ShoppingCart_Notification", "mega=true");
                            fd3.a(fd3.this).W().x();
                            Intent intent = new Intent();
                            for (Object obj2 : map.keySet()) {
                                intent.putExtra(String.valueOf(obj2), String.valueOf(map.get(obj2)));
                            }
                            if (!fd3.b(fd3.this).b(intent)) {
                                g8e T = fd3.a(fd3.this).T();
                                if (!fd3.a(fd3.this).R().isResumed() || ((T instanceof f8e) && !((f8e) T).isSupportVisible())) {
                                    zxb P = fd3.a(fd3.this).d();
                                    P.B().S(true);
                                    if (vav.a(c9x.CART_BIZ_NAME, "resetFilterWhenAddBag", true)) {
                                        Object obj3 = map.get(hd3.e);
                                        if ((obj3 instanceof String) && to8.ADD_CART.equals(obj3)) {
                                            P.W("");
                                        }
                                    }
                                    hav.d("CartRefreshMagabilityBroadcast", "#成功,延迟到onResume刷新");
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    hav.d("CartRefreshMagabilityBroadcast", "补偿判断result=fail");
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(fd3 fd3Var) {
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
            } else {
                hav.d(c9x.CART_BIZ_NAME, "CartRefreshMagabilityBroadcast removeEventListener");
            }
        }
    }

    static {
        t2o.a(478150668);
    }

    public fd3(kmb kmbVar) {
        this.f19208a = kmbVar;
        mh3<Intent> mh3Var = new mh3<>();
        this.b = mh3Var;
        mh3Var.a(new ofl(kmbVar));
        mh3Var.a(new ve0(kmbVar));
        mh3Var.a(new ModalOrderRefreshProcessor(kmbVar));
        mh3Var.a(new oe0(kmbVar));
    }

    public static /* synthetic */ kmb a(fd3 fd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("6e4ff1bd", new Object[]{fd3Var});
        }
        return fd3Var.f19208a;
    }

    public static /* synthetic */ mh3 b(fd3 fd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mh3) ipChange.ipc$dispatch("6f8afbfa", new Object[]{fd3Var});
        }
        return fd3Var.b;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bizId", c9x.CART_BIZ_NAME);
        hashMap.put("eventName", "cartRefreshData");
        this.f19208a.K().j("broadcast", "addEventListener", new xq().p(null), hashMap, new a());
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cd9ac3", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bizId", c9x.CART_BIZ_NAME);
        hashMap.put("eventName", "cartRefreshData");
        this.f19208a.K().j("broadcast", "removeEventListener", new xq().p(null), hashMap, new b(this));
    }
}
