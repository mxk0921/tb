package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.mipush.sdk.COSPushHelper;
import com.xiaomi.mipush.sdk.FTOSPushHelper;
import com.xiaomi.mipush.sdk.HWPushHelper;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.af;
import com.xiaomi.mipush.sdk.ao;
import com.xiaomi.mipush.sdk.au;
import com.xiaomi.mipush.sdk.b;
import com.xiaomi.mipush.sdk.e;
import com.xiaomi.push.bg;
import com.xiaomi.push.hv;
import com.xiaomi.push.l;
import com.xiaomi.push.service.ServiceClient;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class NetworkStatusReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f15126a;
    private boolean b = true;

    public NetworkStatusReceiver() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        if (!ao.a(context).m445a() && b.m452a(context).m461c() && !b.m452a(context).m464f()) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, "com.xiaomi.push.service.XMPushService"));
                intent.setAction("com.xiaomi.push.network_status_changed");
                ServiceClient.getInstance(context).startServiceSafely(intent);
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.a(e);
            }
        }
        hv.m773a(context);
        if (bg.b(context) && ao.a(context).m448b()) {
            ao.a(context).m449c();
        }
        if (bg.b(context)) {
            if ("syncing".equals(af.a(context).a(au.DISABLE_PUSH))) {
                MiPushClient.disablePush(context);
            }
            if ("syncing".equals(af.a(context).a(au.ENABLE_PUSH))) {
                MiPushClient.enablePush(context);
            }
            af a2 = af.a(context);
            au auVar = au.UPLOAD_HUAWEI_TOKEN;
            if ("syncing".equals(a2.a(auVar))) {
                ao.a(context).a((String) null, auVar, e.ASSEMBLE_PUSH_HUAWEI, "net");
            }
            if ("syncing".equals(af.a(context).a(au.UPLOAD_FCM_TOKEN))) {
                ao.a(context).a((String) null, auVar, e.ASSEMBLE_PUSH_HUAWEI, "net");
            }
            af a3 = af.a(context);
            au auVar2 = au.UPLOAD_COS_TOKEN;
            if ("syncing".equals(a3.a(auVar2))) {
                ao.a(context).a((String) null, auVar2, e.ASSEMBLE_PUSH_COS, "net");
            }
            af a4 = af.a(context);
            au auVar3 = au.UPLOAD_FTOS_TOKEN;
            if ("syncing".equals(a4.a(auVar3))) {
                ao.a(context).a((String) null, auVar3, e.ASSEMBLE_PUSH_FTOS, "net");
            }
            if (HWPushHelper.needConnect() && HWPushHelper.shouldTryConnect(context)) {
                HWPushHelper.setConnectTime(context);
                HWPushHelper.registerHuaWeiAssemblePush(context);
            }
            COSPushHelper.doInNetworkChange(context);
            FTOSPushHelper.doInNetworkChange(context);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.b) {
            l.a().post(new a(this, context));
        }
    }

    public NetworkStatusReceiver(Object obj) {
        f15126a = true;
    }

    public static boolean a() {
        return f15126a;
    }
}
