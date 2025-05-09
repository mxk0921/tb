package com.taobao.android.waitpay.notification;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import java.util.List;
import tb.ck;
import tb.nbb;
import tb.pi;
import tb.qi;
import tb.qj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBWaitBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IntentFilter f9909a;
    public final Activity b;
    public final String c;
    public String d;

    static {
        t2o.a(725614634);
    }

    public TBWaitBroadcastReceiver(Activity activity, String str) {
        this.b = activity;
        this.c = str;
    }

    public static /* synthetic */ Object ipc$super(TBWaitBroadcastReceiver tBWaitBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/waitpay/notification/TBWaitBroadcastReceiver");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
            return;
        }
        if (this.f9909a == null) {
            IntentFilter intentFilter = new IntentFilter();
            this.f9909a = intentFilter;
            intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_SUCCESS");
            this.f9909a.addAction("com.alipay.android.app.pay.ACTION_PAY_FAILED");
            this.f9909a.addAction(IAKPopRender.LifecycleType.BLOCK_CLOSE);
            this.f9909a.addAction("auraEventNotification");
            this.f9909a.addCategory("android.intent.category.DEFAULT");
        }
        d();
        LocalBroadcastManager.getInstance(this.b).registerReceiver(this, this.f9909a);
    }

    public final void b(Context context, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f30f09", new Object[]{this, context, str, str2, jSONObject});
            return;
        }
        qi qiVar = new qi();
        qiVar.n(jSONObject);
        nbb d = qj.h().d(str);
        if (d != null) {
            pi.b(d, str2, qiVar);
            return;
        }
        List<nbb> c = qj.h().c(context);
        if (c == null) {
            ck.g().d("AURAJsStandardEvent instancePool is null");
            c = qj.h().b();
        }
        for (nbb nbbVar : c) {
            if (str.equals(nbbVar.getUserContext().d())) {
                pi.b(nbbVar, str2, qiVar);
            }
        }
    }

    public TBWaitBroadcastReceiver c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBWaitBroadcastReceiver) ipChange.ipc$dispatch("4f886468", new Object[]{this, str});
        }
        this.d = str;
        return this;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a98eee3", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r4.equals("com.alipay.android.app.pay.ACTION_PAY_SUCCESS") == false) goto L_0x0030;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.android.waitpay.notification.TBWaitBroadcastReceiver.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0018
            java.lang.String r5 = "3c04d85a"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r8
            r3[r1] = r9
            r3[r0] = r10
            r4.ipc$dispatch(r5, r3)
            return
        L_0x0018:
            java.lang.String r4 = r10.getAction()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x0023
            return
        L_0x0023:
            r4.hashCode()
            java.lang.String r5 = "halfPageMode"
            r6 = -1
            int r7 = r4.hashCode()
            switch(r7) {
                case -1240590794: goto L_0x0051;
                case -669219308: goto L_0x0046;
                case -51541780: goto L_0x003d;
                case 748268930: goto L_0x0032;
                default: goto L_0x0030;
            }
        L_0x0030:
            r0 = -1
            goto L_0x005c
        L_0x0032:
            java.lang.String r0 = "auraEventNotification"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x003b
            goto L_0x0030
        L_0x003b:
            r0 = 3
            goto L_0x005c
        L_0x003d:
            java.lang.String r1 = "com.alipay.android.app.pay.ACTION_PAY_SUCCESS"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x005c
            goto L_0x0030
        L_0x0046:
            java.lang.String r0 = "com.alipay.android.app.pay.ACTION_PAY_FAILED"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x004f
            goto L_0x0030
        L_0x004f:
            r0 = 1
            goto L_0x005c
        L_0x0051:
            java.lang.String r0 = "std_pop_should_close"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x005b
            goto L_0x0030
        L_0x005b:
            r0 = 0
        L_0x005c:
            switch(r0) {
                case 0: goto L_0x0097;
                case 1: goto L_0x0083;
                case 2: goto L_0x0083;
                case 3: goto L_0x006a;
                default: goto L_0x005f;
            }
        L_0x005f:
            tb.rbb r9 = tb.ck.g()
            java.lang.String r10 = "undefined action"
            r9.d(r10)
            goto L_0x00cc
        L_0x006a:
            java.lang.String r0 = "type"
            java.lang.String r0 = r10.getStringExtra(r0)
            java.lang.String r1 = "fields"
            java.lang.String r10 = r10.getStringExtra(r1)
            com.alibaba.fastjson.JSONObject r10 = tb.tj.a(r10)
            java.lang.String r1 = r8.d
            if (r1 == 0) goto L_0x00cc
            r8.b(r9, r1, r0, r10)
            goto L_0x00cc
        L_0x0083:
            boolean r9 = tb.y8r.d()
            if (r9 == 0) goto L_0x00cc
            java.lang.String r9 = r8.c
            boolean r9 = r5.equals(r9)
            if (r9 == 0) goto L_0x00cc
            android.app.Activity r9 = r8.b
            r9.finish()
            goto L_0x00cc
        L_0x0097:
            android.app.Activity r9 = r8.b
            boolean r9 = r9 instanceof tb.lud
            if (r9 == 0) goto L_0x00cc
            java.lang.String r9 = r8.c
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L_0x00a6
            goto L_0x00cc
        L_0x00a6:
            android.app.Activity r9 = r8.b
            tb.lud r9 = (tb.lud) r9
            java.lang.String r9 = r9.g1()
            java.lang.String r10 = "native"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x00bd
            android.app.Activity r9 = r8.b
            r9.finish()
            goto L_0x00cc
        L_0x00bd:
            tb.qap r9 = tb.qap.a()
            boolean r9 = r9.b()
            if (r9 != 0) goto L_0x00cc
            android.app.Activity r9 = r8.b
            r9.finish()
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.waitpay.notification.TBWaitBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
