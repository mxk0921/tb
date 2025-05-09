package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ybv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f31971a = false;
    public boolean b = false;
    public boolean c = false;

    static {
        t2o.a(157286869);
    }

    public static ybv a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ybv) ipChange.ipc$dispatch("b58c4e39", new Object[]{aVar});
        }
        if (aVar == null) {
            UnifyLog.e("UltronTradeHybridPreRenderStatus.getStatus", "instance is null");
            return null;
        }
        Object tag = aVar.getTag("UltronTradeHybridPreRenderStatus");
        if (tag instanceof ybv) {
            return (ybv) tag;
        }
        UnifyLog.e("UltronTradeHybridPreRenderStatus.getStatus", "invalid status");
        return null;
    }

    public static void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47b87794", new Object[]{aVar});
        } else if (aVar == null) {
            UnifyLog.e("UltronTradeHybridPreRenderStatus.initStatus", "instance is null");
        } else if (a(aVar) != null) {
            UnifyLog.e("UltronTradeHybridPreRenderStatus.initStatus", "already setup status");
        } else {
            aVar.setTag("UltronTradeHybridPreRenderStatus", new ybv());
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77cf6f25", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4d40dda", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89fd8d2e", new Object[]{this})).booleanValue();
        }
        return this.f31971a;
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5115f39b", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c7842f6", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a10a22", new Object[]{this, new Boolean(z)});
        } else {
            this.f31971a = z;
        }
    }
}
