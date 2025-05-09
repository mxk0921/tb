package com.taobao.tao.alipay.cashdesk.scope;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.cashdesk.scope.PayAsyncQueryScope;
import com.taobao.taobao.utils.CashDeskLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.bf3;
import tb.ckf;
import tb.g1a;
import tb.g1p;
import tb.pav;
import tb.qvl;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/taobao/tao/alipay/cashdesk/scope/PayAsyncQueryScope$b;", "response", "Ltb/xhv;", "invoke", "(Lcom/taobao/tao/alipay/cashdesk/scope/PayAsyncQueryScope$b;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class PayAsyncQueryScope$pollTask$1 extends Lambda implements g1a<PayAsyncQueryScope.b, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $curQueryTimes;
    public final /* synthetic */ g1p $searchConfig;
    public final /* synthetic */ PayAsyncQueryScope this$0;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "run", "()V", "com/taobao/tao/alipay/cashdesk/scope/PayAsyncQueryScope$pollTask$1$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            PayAsyncQueryScope$pollTask$1 payAsyncQueryScope$pollTask$1 = PayAsyncQueryScope$pollTask$1.this;
            PayAsyncQueryScope.c(payAsyncQueryScope$pollTask$1.this$0, payAsyncQueryScope$pollTask$1.$searchConfig, payAsyncQueryScope$pollTask$1.$curQueryTimes + 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayAsyncQueryScope$pollTask$1(PayAsyncQueryScope payAsyncQueryScope, int i, g1p g1pVar) {
        super(1);
        this.this$0 = payAsyncQueryScope;
        this.$curQueryTimes = i;
        this.$searchConfig = g1pVar;
    }

    public static /* synthetic */ Object ipc$super(PayAsyncQueryScope$pollTask$1 payAsyncQueryScope$pollTask$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/alipay/cashdesk/scope/PayAsyncQueryScope$pollTask$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(PayAsyncQueryScope.b bVar) {
        invoke2(bVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PayAsyncQueryScope.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f27f64", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "response");
        if (PayAsyncQueryScope.ActionType.CONTINUE_QUERY != bVar.b()) {
            bf3.a a2 = bf3.a.a("payQueryTimes");
            bf3.f(a2.tag("轮询:" + this.$curQueryTimes).sampling(0.1f));
        }
        int i = qvl.$EnumSwitchMapping$0[bVar.b().ordinal()];
        if (i == 1) {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "轮询结果：CONTINUE_QUERY " + this.$curQueryTimes + 1);
            Long c = this.$searchConfig.c();
            if (c != null) {
                pav.l(new a(), c.longValue());
            }
        } else if (i == 2) {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "轮询结果：GO_CASHIER");
            PayAsyncQueryScope.a(this.this$0).c(bVar.a());
        } else if (i == 3) {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "轮询结果：MARKETING_POP");
            PayAsyncQueryScope.a(this.this$0).b(bVar.a());
        } else if (i == 4) {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "轮询结果：SUCCESS");
            PayAsyncQueryScope.a(this.this$0).onSuccess();
        } else if (i == 5) {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "轮询结果：FAIL");
            PayAsyncQueryScope.a(this.this$0).a(bVar.a(), bVar.c(), bVar.d());
        }
    }
}
