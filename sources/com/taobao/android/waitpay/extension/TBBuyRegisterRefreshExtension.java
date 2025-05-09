package com.taobao.android.waitpay.extension;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.lo;
import tb.lud;
import tb.t2o;
import tb.ws;
import tb.yi;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbwaitpay.impl.event.registerNotify")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class TBBuyRegisterRefreshExtension extends ws {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public InnerReceiver e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class InnerReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f9908a;

        static {
            t2o.a(725614613);
        }

        public InnerReceiver(Context context) {
            this.f9908a = context;
        }

        public static /* synthetic */ Object ipc$super(InnerReceiver innerReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/waitpay/extension/TBBuyRegisterRefreshExtension$InnerReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            Context context2 = this.f9908a;
            if (context2 instanceof lud) {
                ((lud) context2).Y2(true);
            }
        }
    }

    static {
        t2o.a(725614612);
    }

    public static /* synthetic */ Object ipc$super(TBBuyRegisterRefreshExtension tBBuyRegisterRefreshExtension, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/waitpay/extension/TBBuyRegisterRefreshExtension");
        }
    }

    @Override // tb.ws
    public void K0(AURAEventIO aURAEventIO) {
        JSONObject c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a1928f", new Object[]{this, aURAEventIO});
            return;
        }
        Boolean bool = (Boolean) B().get("hasRegistered", Boolean.class);
        if ((bool == null || !bool.booleanValue()) && (c = aURAEventIO.getEventModel().c()) != null) {
            String string = c.getString("eventName");
            if (!TextUtils.isEmpty(string)) {
                P0(J0().f(), string);
                B().update("hasRegistered", Boolean.TRUE);
            }
        }
    }

    public final InnerReceiver O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InnerReceiver) ipChange.ipc$dispatch("6cdc87ce", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new InnerReceiver(J0().f());
        }
        return this.e;
    }

    public void P0(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36ae03a8", new Object[]{this, context, str});
        } else if (O0() != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(str);
            intentFilter.addCategory("android.intent.category.DEFAULT");
            Q0(context);
            LocalBroadcastManager.getInstance(context).registerReceiver(O0(), intentFilter);
        }
    }

    public void Q0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72121245", new Object[]{this, context});
        } else if (O0() != null) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(O0());
        }
    }

    @Override // tb.ws, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            super.onCreate(loVar, yiVar);
        }
    }

    @Override // tb.ws, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        Q0(J0().f());
    }

    @Override // tb.ibb
    public String t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return "registerNotify";
    }
}
