package com.taobao.accs;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.BaseReceiver;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import tb.brt;
import tb.m8l;
import tb.t2o;
import tb.va8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ServiceReceiver extends BaseReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f6002a;

        public a(Context context) {
            this.f6002a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                va8.getConnection(this.f6002a, "default", true, 0).C(true, false);
            } catch (Throwable th) {
                ALog.e("ServiceReceiver", "accsPing err", th, new Object[0]);
            }
        }
    }

    static {
        t2o.a(343932958);
    }

    public static /* synthetic */ Object ipc$super(ServiceReceiver serviceReceiver, String str, Object... objArr) {
        if (str.hashCode() == 1006950490) {
            super.onReceive((Context) objArr[0], (Intent) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/ServiceReceiver");
    }

    @Override // com.taobao.accs.base.BaseReceiver, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        super.onReceive(context, intent);
        if (intent == null) {
            str = "";
        } else {
            str = intent.getAction();
        }
        ALog.e("ServiceReceiver", "onReceive: " + str, new Object[0]);
        if (!TextUtils.isEmpty(str) && Constants.ACTION_COMMAND.equals(str) && m8l.x()) {
            brt.b(new a(context));
        }
    }
}
