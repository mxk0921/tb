package com.taobao.mytaobao.pagev2.listener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.pagev2.MtbBizProxyV2;
import com.taobao.mytaobao.pagev2.dataservice.MtbDataServiceFacade;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.navigation.a;
import kotlin.Metadata;
import tb.ckf;
import tb.kgj;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/mytaobao/pagev2/listener/RefreshMtbReceiver;", "Landroid/content/BroadcastReceiver;", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class RefreshMtbReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f11295a;
    public final MtbBizProxyV2 b;

    static {
        t2o.a(745537960);
    }

    public RefreshMtbReceiver(MtbBizProxyV2 mtbBizProxyV2) {
        ckf.h(mtbBizProxyV2, pg1.ATOM_proxy);
        this.b = mtbBizProxyV2;
    }

    public static /* synthetic */ Object ipc$super(RefreshMtbReceiver refreshMtbReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/listener/RefreshMtbReceiver");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else if (this.f11295a) {
            try {
                kgj.c(true, this);
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3fb5b14", new Object[]{this})).booleanValue();
        }
        if (!this.b.m().isAdded() || !this.b.m().isResumed() || a.o() == null) {
            return false;
        }
        TBFragmentTabHost o = a.o();
        ckf.c(o, "Navigation.getFragmentTabHost()");
        if (o.getCurrentTab() == 4) {
            return true;
        }
        return false;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da1acd1", new Object[]{this});
            return;
        }
        this.f11295a = true;
        kgj.a(true, this, "MyTaobaoMainPageRefresh");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        StringBuilder sb = new StringBuilder("RefreshMtbReceiver收到广播");
        sb.append(intent != null ? intent.getAction() : null);
        TLog.loge("mytaobao", sb.toString());
        if (b()) {
            MtbDataServiceFacade.y(1);
        } else {
            MtbDataServiceFacade.v();
        }
    }
}
