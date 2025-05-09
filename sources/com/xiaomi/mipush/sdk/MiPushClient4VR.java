package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.ic;
import com.xiaomi.push.im;
import com.xiaomi.push.ip;
import com.xiaomi.push.jb;
import com.xiaomi.push.service.bc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MiPushClient4VR {
    public static void uploadData(Context context, String str) {
        jb jbVar = new jb();
        jbVar.c(im.VRUpload.f1168a);
        jbVar.b(b.m452a(context).m453a());
        jbVar.d(context.getPackageName());
        jbVar.a("data", str);
        jbVar.a(bc.a());
        ao.a(context).a((ao) jbVar, ic.Notification, (ip) null);
    }
}
