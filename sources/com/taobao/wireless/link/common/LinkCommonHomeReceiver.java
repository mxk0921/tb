package com.taobao.wireless.link.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cno;
import tb.esg;
import tb.irg;
import tb.jsg;
import tb.q9k;
import tb.rqg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LinkCommonHomeReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f14170a;

        public a(Context context) {
            this.f14170a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                long longValue = ((Long) cno.b(this.f14170a).a("float_permission", 0L)).longValue();
                long f = jsg.f();
                if (f - longValue > 86400000) {
                    boolean a2 = jsg.a(this.f14170a);
                    esg.b(esg.ARG1_HAS_FLOAT_PERMISSION, a2 + "", "", null);
                    cno.b(this.f14170a).d("float_permission", Long.valueOf(f));
                    irg.a("link_tag", "LinkCommonHomeReceiver === sendFloatPermission === 距上次大于一天，上报埋点");
                }
            } catch (Exception e) {
                irg.a("link_tag", "LinkCommonHomeReceiver === sendFloatPermission === 上报埋点异常：" + e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final LinkCommonHomeReceiver f14171a = new LinkCommonHomeReceiver();

        static {
            t2o.a(1030750254);
        }
    }

    static {
        t2o.a(1030750252);
    }

    public static /* synthetic */ Object ipc$super(LinkCommonHomeReceiver linkCommonHomeReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/common/LinkCommonHomeReceiver");
    }

    public final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98023b5e", new Object[]{this, context});
        } else {
            rqg.b.a(new a(context));
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        irg.a("link_tag", "LinkCommonHomeReceiver === onReceive: context：" + context + "action: " + intent.getAction());
        q9k.c(context, false);
        a(context);
    }
}
