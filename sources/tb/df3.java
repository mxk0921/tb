package tb;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.alipayapi.AsyncQueryPay;
import com.taobao.taobao.b;
import com.taobao.taobao.internal.PayRequest;
import com.taobao.taobao.internal.PayResultInfo;
import com.taobao.taobao.utils.CashDeskLog;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class df3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f17770a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements a8d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final a8d f17771a;
        public final com.taobao.taobao.utils.a b;

        public a(df3 df3Var, a8d a8dVar, com.taobao.taobao.utils.a aVar) {
            this.f17771a = a8dVar;
            this.b = aVar;
        }

        @Override // tb.a8d
        public void a(String str, PayResultInfo payResultInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34ccc958", new Object[]{this, str, payResultInfo});
                return;
            }
            a8d a8dVar = this.f17771a;
            if (a8dVar != null) {
                a8dVar.a(str, payResultInfo);
            }
            this.b.a(payResultInfo.resultStatus);
        }

        @Override // tb.a8d
        public void b(String str, PayResultInfo payResultInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf1415f2", new Object[]{this, str, payResultInfo});
                return;
            }
            a8d a8dVar = this.f17771a;
            if (a8dVar != null) {
                a8dVar.b(str, payResultInfo);
            }
            this.b.a(payResultInfo.resultStatus);
        }

        @Override // tb.a8d
        public void c(String str, PayResultInfo payResultInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("809cdc6b", new Object[]{this, str, payResultInfo});
                return;
            }
            a8d a8dVar = this.f17771a;
            if (a8dVar != null) {
                a8dVar.c(str, payResultInfo);
            }
            this.b.c();
        }

        @Override // tb.a8d
        public void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ee48ca9", new Object[]{this, str});
                return;
            }
            a8d a8dVar = this.f17771a;
            if (a8dVar != null) {
                a8dVar.e(str);
            }
        }
    }

    public final void a(Context context, PayRequest payRequest, a8d a8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82e7bcef", new Object[]{this, context, payRequest, a8dVar});
            return;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "doAliPay");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            new us0(activity).k(new b(activity, payRequest, a8dVar)).a(payRequest);
            return;
        }
        bf3.g("ASYNC_QUERY_NOT_ACTIVITY", "context必须是activity");
    }

    public final void b(Context context, PayRequest payRequest, a8d a8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c23aa73", new Object[]{this, context, payRequest, a8dVar});
            return;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "executePay: step2 开启异步支付");
        bf3.e("asyncPay", 5, payRequest.getFrom());
        com.taobao.taobao.utils.a aVar = new com.taobao.taobao.utils.a(payRequest.getInstitutionCode(), payRequest.getExtAttrMap());
        aVar.b();
        a aVar2 = new a(this, a8dVar, aVar);
        if (context instanceof Activity) {
            new AsyncQueryPay((Activity) context).j(new b(context, payRequest, aVar2)).a(payRequest);
        } else {
            bf3.g("ASYNC_QUERY_NOT_ACTIVITY", "context必须是activity");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r3.equals(com.taobao.taobao.internal.PayRequest.CALL_LAUNCH_CASHIER_PAGE) == false) goto L_0x003d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(android.content.Context r7, com.taobao.taobao.internal.PayRequest r8, tb.a8d r9) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.df3.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = "32a8f351"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r7 = 3
            r5[r7] = r9
            r3.ipc$dispatch(r4, r5)
            return
        L_0x001b:
            boolean r3 = r6.i()
            if (r3 == 0) goto L_0x0022
            return
        L_0x0022:
            java.lang.String r3 = r8.getFrom()
            java.lang.String r4 = "enterCashDesk"
            tb.bf3.e(r4, r2, r3)
            tb.rvl.g(r7)
            java.lang.String r3 = r8.getNextAction()
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -2130099906: goto L_0x0053;
                case 1154452644: goto L_0x0048;
                case 1731124514: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            r0 = -1
            goto L_0x005d
        L_0x003f:
            java.lang.String r1 = "CALL_LAUNCH_CASHIER_FRONT"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x005d
            goto L_0x003d
        L_0x0048:
            java.lang.String r0 = "CALL_ASYNC_QUERY"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0051
            goto L_0x003d
        L_0x0051:
            r0 = 1
            goto L_0x005d
        L_0x0053:
            java.lang.String r0 = "CALL_WEIXIN_SDK"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x005c
            goto L_0x003d
        L_0x005c:
            r0 = 0
        L_0x005d:
            switch(r0) {
                case 0: goto L_0x006c;
                case 1: goto L_0x0068;
                case 2: goto L_0x0064;
                default: goto L_0x0060;
            }
        L_0x0060:
            r6.a(r7, r8, r9)
            goto L_0x006f
        L_0x0064:
            r6.h(r7, r8, r9)
            goto L_0x006f
        L_0x0068:
            r6.b(r7, r8, r9)
            goto L_0x006f
        L_0x006c:
            r6.c(r7, r8, r9)
        L_0x006f:
            tb.af3.b(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.df3.d(android.content.Context, com.taobao.taobao.internal.PayRequest, tb.a8d):void");
    }

    public void e(Context context, Map<String, String> map, a8d a8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ac6da0", new Object[]{this, context, map, a8dVar});
            return;
        }
        PayRequest payRequest = new PayRequest();
        payRequest.setExtAttrMap(map);
        payRequest.setActionParams(map.get("signStr"));
        payRequest.setFrom(map.get(map.get("from")));
        payRequest.setOrderIds(g(map));
        payRequest.setSuccessUrl(map.get("backURL"));
        payRequest.setUnSuccessUrl(map.get("unSuccessUrl"));
        payRequest.setNextAction(map.get("cashierType"));
        d(context, payRequest, a8dVar);
    }

    public void f(Context context, Map<String, String> map, a8d a8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d53bf4c1", new Object[]{this, context, map, a8dVar});
            return;
        }
        PayRequest payRequest = new PayRequest();
        payRequest.setExtAttrMap(map);
        payRequest.setActionParams(map.get("signStr"));
        payRequest.setOrderIds(g(map));
        payRequest.setSuccessUrl(map.get("backURL"));
        payRequest.setUnSuccessUrl(map.get("unSuccessUrl"));
        payRequest.setNextAction(PayRequest.CALL_WEIXIN_SDK);
        d(context, payRequest, a8dVar);
    }

    public final String g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a24c8642", new Object[]{this, map});
        }
        String str = map.get("orderids");
        return TextUtils.isEmpty(str) ? map.get("orderIds") : str;
    }

    public final void h(Context context, PayRequest payRequest, a8d a8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18767b6", new Object[]{this, context, payRequest, a8dVar});
            return;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "lunchCashDeskPage");
        hf3 b = hf3.b();
        b.e(payRequest);
        b.d(new b(context, payRequest, a8dVar));
        bf3.e("launchCashier", 7, payRequest.getFrom());
        if (context instanceof Activity) {
            b.f((Activity) context, payRequest);
        } else {
            bf3.g("LAUNCH_CASH_FRONT_NOT_ACTIVITY", "context必须是activity");
        }
    }

    public final void c(Context context, PayRequest payRequest, a8d a8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef863aa8", new Object[]{this, context, payRequest, a8dVar});
            return;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "doWxPay");
        bf3.e("wxPay", 4, payRequest.getFrom());
        payRequest.setInstitutionCode("wechat");
        com.taobao.taobao.utils.a aVar = new com.taobao.taobao.utils.a("wechat", payRequest.getExtAttrMap());
        aVar.b();
        a aVar2 = new a(this, a8dVar, aVar);
        gvw.l(context);
        gvw.b().m(new b(context, payRequest, aVar2)).a(payRequest);
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7099bb40", new Object[]{this})).booleanValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f17770a < 2000) {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "操作太频繁，限制操作2000ms, 上次执行时间：" + this.f17770a + " 当前执行时间：" + elapsedRealtime);
            return true;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "操作间隔大于2000ms, 上次执行时间：" + this.f17770a + " 当前执行时间：" + elapsedRealtime);
        this.f17770a = elapsedRealtime;
        return false;
    }
}
