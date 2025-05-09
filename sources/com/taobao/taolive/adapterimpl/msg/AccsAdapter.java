package com.taobao.taolive.adapterimpl.msg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;
import tb.tdb;
import tb.xdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AccsAdapter implements tdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f12992a;
    public AccsStateReceiver b;
    public final List<xdb> c = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class AccsStateReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(779092327);
        }

        public AccsStateReceiver() {
        }

        public static /* synthetic */ Object ipc$super(AccsStateReceiver accsStateReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/adapterimpl/msg/AccsAdapter$AccsStateReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            try {
                TaoBaseService.ConnectInfo connectInfo = (TaoBaseService.ConnectInfo) intent.getSerializableExtra(Constants.KEY_CONNECT_INFO);
                if (connectInfo != null) {
                    for (xdb xdbVar : AccsAdapter.c(AccsAdapter.this)) {
                        if (xdbVar != null) {
                            xdbVar.b(Boolean.valueOf(connectInfo.connected), connectInfo.errorCode, connectInfo.errordetail);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static {
        t2o.a(779092325);
        t2o.a(806355918);
    }

    public static /* synthetic */ List c(AccsAdapter accsAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ccc8523b", new Object[]{accsAdapter});
        }
        return accsAdapter.c;
    }

    @Override // tb.tdb
    public void a(Context context, xdb xdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a91d37", new Object[]{this, context, xdbVar});
        } else if (xdbVar != null) {
            if (((ArrayList) this.c).isEmpty()) {
                d(context);
            }
            if (!((ArrayList) this.c).contains(xdbVar)) {
                ((ArrayList) this.c).add(xdbVar);
            }
            if (!this.f12992a) {
                xdbVar.b(null, -1, "");
            }
        }
    }

    @Override // tb.tdb
    public void b(Context context, xdb xdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97be30b4", new Object[]{this, context, xdbVar});
        } else if (xdbVar != null) {
            ((ArrayList) this.c).remove(xdbVar);
            if (((ArrayList) this.c).isEmpty()) {
                e(context);
            }
        }
    }

    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29ca89", new Object[]{this, context});
            return;
        }
        try {
            if (this.b == null) {
                this.b = new AccsStateReceiver();
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(Constants.ACTION_CONNECT_INFO);
            context.registerReceiver(this.b, intentFilter);
            this.f12992a = true;
        } catch (Exception unused) {
            this.f12992a = false;
        }
    }

    public void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e653ebc2", new Object[]{this, context});
            return;
        }
        AccsStateReceiver accsStateReceiver = this.b;
        if (accsStateReceiver != null) {
            context.unregisterReceiver(accsStateReceiver);
            this.b = null;
            this.f12992a = false;
        }
    }
}
