package com.alibaba.android.aura.taobao.adapter.extension.linkage.event;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ck;
import tb.fj;
import tb.hbb;
import tb.lo;
import tb.mi;
import tb.msg;
import tb.nbb;
import tb.pt;
import tb.rbb;
import tb.t2o;
import tb.ws;
import tb.xcb;
import tb.yi;
import tb.yk;
import tb.ys;
import tb.zj;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.event.submit")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AURASubmitEvent extends ws {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "submit";
    public static final String RPC_ENDPOINT = "endpoint";
    public static final String RPC_SERVICE_NAME = "service_name";
    public static volatile boolean i = false;
    public static long j;
    public xcb e;
    public AURAGlobalData f;
    public PayStateBroadcast g;
    public final boolean h = fj.d("enablePaySandbox", true);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class PayStateBroadcast extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final c f2159a;

        static {
            t2o.a(81789132);
        }

        public PayStateBroadcast(c cVar) {
            this.f2159a = cVar;
        }

        public static /* synthetic */ Object ipc$super(PayStateBroadcast payStateBroadcast, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/linkage/event/AURASubmitEvent$PayStateBroadcast");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            rbb g = ck.g();
            g.f("PayStateBroadcast 接收到action " + intent.getAction(), ck.b.b().i("AURA/ability").a());
            ((b) this.f2159a).a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pt f2160a;

        public a(AURASubmitEvent aURASubmitEvent, pt ptVar) {
            this.f2160a = ptVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/linkage/event/AURASubmitEvent$1");
        }

        @Override // tb.pt
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e3b41b3", new Object[]{this});
            } else {
                this.f2160a.a();
            }
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
                return;
            }
            this.f2160a.b(miVar);
            AURASubmitEvent.O0(false);
        }

        @Override // tb.pt
        public void c(yk ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
                return;
            }
            this.f2160a.c(ykVar);
            AURASubmitEvent.O0(true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(AURASubmitEvent aURASubmitEvent) {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("922c4ec3", new Object[]{this});
            } else {
                AURASubmitEvent.O0(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface c {
    }

    static {
        t2o.a(81789129);
    }

    public static /* synthetic */ boolean O0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        i = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(AURASubmitEvent aURASubmitEvent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        } else if (hashCode == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/extension/linkage/event/AURASubmitEvent");
        }
    }

    @Override // tb.ws
    public void K0(AURAEventIO aURAEventIO) {
        MultiTreeNode multiTreeNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a1928f", new Object[]{this, aURAEventIO});
            return;
        }
        nbb c2 = J0().c();
        if (c2 != null && this.e != null && this.f != null && !P0(aURAEventIO)) {
            if ((!i || !this.h) && (multiTreeNode = (MultiTreeNode) this.f.get(zj.GLOBAL_DATA_STATE_TREE, MultiTreeNode.class)) != null) {
                rbb g = ck.g();
                g.e("执行submit事件@" + Integer.toHexString(hashCode()), ck.b.b().i("AURA/ability").a());
                UMFLinkageTrigger a2 = msg.a(aURAEventIO);
                a2.setStateTree(multiTreeNode);
                c2.c("aura.workflow.submit", a2, new a(this, this.e.i()));
            }
        }
    }

    @Override // tb.ws
    public void N0(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1dae8b", new Object[]{this, new Long(j2)});
        } else {
            j = j2;
        }
    }

    public final boolean P0(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bc54041", new Object[]{this, aURAEventIO})).booleanValue();
        }
        for (ys ysVar : x().f(ys.class)) {
            if (ysVar.r(aURAEventIO)) {
                return true;
            }
        }
        return false;
    }

    public final void Q0(Context context, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2da63d", new Object[]{this, context, broadcastReceiver});
        } else if (broadcastReceiver != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("onPagePause");
            intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_SUCCESS");
            intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_FAILED");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            R0(context, broadcastReceiver);
            LocalBroadcastManager.getInstance(context).registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public final void R0(Context context, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16e2044", new Object[]{this, context, broadcastReceiver});
        } else if (broadcastReceiver != null) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(broadcastReceiver);
        }
    }

    @Override // tb.ws
    public long m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba78e09a", new Object[]{this})).longValue();
        }
        return j;
    }

    @Override // tb.ws, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        rbb g = ck.g();
        g.e("submit事件初始化@" + Integer.toHexString(hashCode()), ck.b.b().i("AURA/ability").a());
        this.e = (xcb) yiVar.e(xcb.class);
        if (this.h) {
            this.g = new PayStateBroadcast(new b(this));
            Q0(loVar.f(), this.g);
        }
    }

    @Override // tb.ws, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        this.f = aURAGlobalData;
    }

    @Override // tb.ws
    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b09fad", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.ibb
    public String t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return "submit";
    }

    @Override // tb.ws, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        rbb g = ck.g();
        g.e("submit事件destroy@" + Integer.toHexString(hashCode()), ck.b.b().i("AURA/ability").a());
        i = false;
        R0(J0().f(), this.g);
    }
}
