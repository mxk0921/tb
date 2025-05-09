package com.taobao.android.purchase.aura.notification;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.tao.alipay.export.CashdeskConstants;
import java.util.List;
import tb.nbb;
import tb.pi;
import tb.qi;
import tb.qj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBBuyBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IntentFilter f9223a;
    public final Activity b;
    public final String c;
    public String d;

    static {
        t2o.a(708837518);
    }

    public TBBuyBroadcastReceiver(Activity activity, String str) {
        this.b = activity;
        this.c = str;
    }

    public static /* synthetic */ Object ipc$super(TBBuyBroadcastReceiver tBBuyBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/notification/TBBuyBroadcastReceiver");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
            return;
        }
        if (this.f9223a == null) {
            IntentFilter intentFilter = new IntentFilter();
            this.f9223a = intentFilter;
            intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_SUCCESS");
            this.f9223a.addAction("com.alipay.android.app.pay.ACTION_PAY_FAILED");
            this.f9223a.addAction(CashdeskConstants.TB_CASH_DESK_BROADCAST_RESULT_ACTION);
            this.f9223a.addAction("auraEventNotification");
            this.f9223a.addAction(IAKPopRender.LifecycleType.BLOCK_CLOSE);
            this.f9223a.addCategory("android.intent.category.DEFAULT");
        }
        d();
        LocalBroadcastManager.getInstance(this.b).registerReceiver(this, this.f9223a);
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
            c = qj.h().b();
        }
        for (nbb nbbVar : c) {
            if (str.equals(nbbVar.getUserContext().d())) {
                pi.b(nbbVar, str2, qiVar);
            }
        }
    }

    public TBBuyBroadcastReceiver c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBBuyBroadcastReceiver) ipChange.ipc$dispatch("9be6348b", new Object[]{this, str});
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
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
        if (r4.equals("com.alipay.android.app.pay.ACTION_PAY_SUCCESS") == false) goto L_0x0054;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceive(android.content.Context r10, android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.purchase.aura.notification.TBBuyBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
