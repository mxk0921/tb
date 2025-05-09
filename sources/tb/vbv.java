package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.common.MUSEventTarget;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vbv implements npc, xcv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a f29913a;

    static {
        t2o.a(157286883);
        t2o.a(982515990);
        t2o.a(157286773);
    }

    public vbv(a aVar) {
        this.f29913a = aVar;
        ybv.b(aVar);
    }

    @Override // tb.xcv
    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a730856", new Object[]{this});
        } else {
            b(this.f29913a);
        }
    }

    public final void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b96979fa", new Object[]{this, aVar});
            return;
        }
        ybv a2 = ybv.a(aVar);
        if (a2 != null) {
            a2.f(false);
        }
    }

    public final void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf465ffd", new Object[]{this, aVar});
            return;
        }
        ybv a2 = ybv.a(aVar);
        if (a2 != null) {
            a2.g(true);
        }
    }

    public final void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97692929", new Object[]{this, aVar});
            return;
        }
        ybv a2 = ybv.a(aVar);
        if (a2 != null) {
            a2.h(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
        if ((r5 + " errorMsg:" + r6) == null) goto L_0x002b;
     */
    @Override // tb.xcv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n0(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.vbv.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "1435fd2c"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r5 = 2
            r2[r5] = r6
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onBizFailed,errorCode:"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x002d
        L_0x002b:
            r6 = r1
            goto L_0x0044
        L_0x002d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = " errorMsg:"
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = r0.toString()
            if (r5 != 0) goto L_0x0044
            goto L_0x002b
        L_0x0044:
            java.lang.String[] r5 = new java.lang.String[]{r6}
            java.lang.String r6 = "UltronTradeHybridPreRenderListener.UltronWeex2BizLifecycleListener"
            com.taobao.android.ultron.common.utils.UnifyLog.e(r6, r5)
            com.taobao.android.weex_framework.a r5 = r4.f29913a
            r4.a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.vbv.n0(java.lang.String, java.lang.String):void");
    }

    @Override // tb.npc
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    @Override // tb.npc
    public void onJSException(a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
            return;
        }
        if (("onJSException,errorType:" + i + " errorMsg:" + str) == null) {
            str = "";
        }
        UnifyLog.e("UltronTradeHybridPreRenderListener.IMUSRenderListener", str);
        c(aVar);
    }

    @Override // tb.npc
    public void onPrepareSuccess(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRefreshFailed(a aVar, int i, String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        if (("onRefreshFailed,errorType:" + i + " errorMsg:" + str) == null) {
            str2 = "";
        } else {
            str2 = str + " fatal:" + z;
        }
        UnifyLog.e("UltronTradeHybridPreRenderListener.IMUSRenderListener", str2);
        c(aVar);
    }

    @Override // tb.npc
    public void onRefreshSuccess(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRenderFailed(a aVar, int i, String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        if (("onRenderFailed,errorType:" + i + " errorMsg:" + str) == null) {
            str2 = "";
        } else {
            str2 = str + " fatal:" + z;
        }
        UnifyLog.e("UltronTradeHybridPreRenderListener.IMUSRenderListener", str2);
        c(aVar);
    }

    @Override // tb.npc
    public void onRenderSuccess(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
        } else {
            d(aVar);
        }
    }

    public final void b(a aVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac7ac9a6", new Object[]{this, aVar});
            return;
        }
        ybv a2 = ybv.a(aVar);
        if (a2 != null) {
            a2.f(true);
        }
        JSONObject k = qbv.j().k(aVar);
        if (k != null) {
            aVar.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "trade.data.preload", k);
        }
        StringBuilder sb = new StringBuilder("cachedFrontEndParams is null? ");
        sb.append(k == null);
        hav.d("UltronTradeHybridPreRenderListener.bizReady", sb.toString());
        JSONObject l = qbv.j().l(aVar);
        if (l != null) {
            aVar.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "preload.background", l);
        }
        StringBuilder sb2 = new StringBuilder("cachedNetParams is null? ");
        if (l != null) {
            z = false;
        }
        sb2.append(z);
        hav.d("UltronTradeHybridPreRenderListener.bizReady", sb2.toString());
    }
}
