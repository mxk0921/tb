package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.export.PayPasswrdValidateBridge;
import com.taobao.taobao.internal.PayRequest;
import com.taobao.taobao.utils.CashDeskLog;
import tb.bf3;
import tb.xhi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hf3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile hf3 c;

    /* renamed from: a  reason: collision with root package name */
    public a8d f20591a;
    public PayRequest b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements xhi.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.xhi.d
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6558de82", new Object[]{this, str, str2, str3});
            } else {
                PayPasswrdValidateBridge.handleAlipayResult("8100", "LAUNCH_CASHIER_FAIL", "", "拉起后置收银台失败", "");
            }
        }

        @Override // tb.xhi.d
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
                return;
            }
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "后置收银台:" + str);
            PayPasswrdValidateBridge.handleAlipayResult("8100", "LAUNCH_CASHIER_SUCCESS", "", "拉起后置收银台成功", "");
            if ("onClose".equals(str)) {
                hf3.a(hf3.this, null);
            }
        }
    }

    public static /* synthetic */ PayRequest a(hf3 hf3Var, PayRequest payRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PayRequest) ipChange.ipc$dispatch("43ddafb4", new Object[]{hf3Var, payRequest});
        }
        hf3Var.b = payRequest;
        return payRequest;
    }

    public static hf3 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hf3) ipChange.ipc$dispatch("f94a60f3", new Object[0]);
        }
        if (c == null) {
            synchronized (hf3.class) {
                try {
                    if (c == null) {
                        c = new hf3();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public PayRequest c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PayRequest) ipChange.ipc$dispatch("528d8b4a", new Object[]{this});
        }
        return this.b;
    }

    public void d(a8d a8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac95b07", new Object[]{this, a8dVar});
        } else {
            this.f20591a = a8dVar;
        }
    }

    public void e(PayRequest payRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b5e6c6", new Object[]{this, payRequest});
        } else {
            this.b = payRequest;
        }
    }

    public void f(Activity activity, PayRequest payRequest) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dcc5180", new Object[]{this, activity, payRequest});
            return;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "打开后置收银台");
        String str3 = payRequest.getExtAttrMap().get("cashierParam");
        if (str3 == null) {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "cashierParamsStr 为null");
            return;
        }
        JSONObject a2 = cf3.a(str3);
        if (a2 == null) {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "cashierParams 为null");
            return;
        }
        JSONObject jSONObject = a2.getJSONObject("postCashierParam");
        if (jSONObject == null) {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "popConfig 为null");
            return;
        }
        String f = xp3.f(activity, false);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("installApp", (Object) f);
        jSONObject2.put("unSuccessUrl", (Object) this.b.getUnSuccessUrl());
        jSONObject2.put("backUrl", (Object) this.b.getSuccessUrl());
        if (this.b.getExtAttrMap() != null) {
            jSONObject2.putAll(this.b.getExtAttrMap());
        }
        xhi.j(activity, jSONObject, jSONObject2, new a());
        h15 tag = bf3.a.a("cashdesk_pv").tag("后置收银台");
        PayRequest payRequest2 = this.b;
        if (payRequest2 != null) {
            str = payRequest2.getFrom();
        } else {
            str = "";
        }
        h15 dimension = tag.dimension("d1", str);
        PayRequest payRequest3 = this.b;
        if (payRequest3 != null) {
            str2 = payRequest3.getInstitutionCode();
        } else {
            str2 = "alipay";
        }
        bf3.f(dimension.dimension("d2", str2).sampling(1.0f));
    }
}
