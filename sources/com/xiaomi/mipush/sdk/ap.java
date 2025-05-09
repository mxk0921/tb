package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ap extends Handler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ao f14718a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(ao aoVar, Looper looper) {
        super(looper);
        this.f14718a = aoVar;
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        Context context;
        Context context2;
        Context context3;
        Context context4;
        Context context5;
        Context context6;
        HashMap<String, String> a2;
        ao aoVar;
        Context context7;
        Context context8;
        Context context9;
        Context context10;
        Context context11;
        Context context12;
        Context context13;
        ao aoVar2;
        Context context14;
        if (message.what == 19) {
            String str = (String) message.obj;
            int i = message.arg1;
            synchronized (af.class) {
                try {
                    context = this.f14718a.f680a;
                    if (af.a(context).m433a(str)) {
                        context2 = this.f14718a.f680a;
                        if (af.a(context2).a(str) < 10) {
                            String str2 = "";
                            if (message.getData() != null) {
                                str2 = message.getData().getString("third_sync_reason");
                            }
                            au auVar = au.DISABLE_PUSH;
                            if (auVar.ordinal() == i) {
                                context14 = this.f14718a.f680a;
                                if ("syncing".equals(af.a(context14).a(auVar))) {
                                    aoVar2 = this.f14718a;
                                    aoVar2.a(str, auVar, true, (HashMap<String, String>) null);
                                    context4 = this.f14718a.f680a;
                                    af.a(context4).b(str);
                                }
                            }
                            auVar = au.ENABLE_PUSH;
                            if (auVar.ordinal() == i) {
                                context13 = this.f14718a.f680a;
                                if ("syncing".equals(af.a(context13).a(auVar))) {
                                    aoVar2 = this.f14718a;
                                    aoVar2.a(str, auVar, true, (HashMap<String, String>) null);
                                    context4 = this.f14718a.f680a;
                                    af.a(context4).b(str);
                                }
                            }
                            au auVar2 = au.UPLOAD_HUAWEI_TOKEN;
                            if (auVar2.ordinal() == i) {
                                context11 = this.f14718a.f680a;
                                if ("syncing".equals(af.a(context11).a(auVar2))) {
                                    context12 = this.f14718a.f680a;
                                    a2 = i.m470a(context12, e.ASSEMBLE_PUSH_HUAWEI);
                                    a2.put("third_sync_reason", str2);
                                    aoVar = this.f14718a;
                                    aoVar.a(str, auVar2, false, a2);
                                    context4 = this.f14718a.f680a;
                                    af.a(context4).b(str);
                                }
                            }
                            au auVar3 = au.UPLOAD_FCM_TOKEN;
                            if (auVar3.ordinal() == i) {
                                context9 = this.f14718a.f680a;
                                if ("syncing".equals(af.a(context9).a(auVar3))) {
                                    ao aoVar3 = this.f14718a;
                                    context10 = aoVar3.f680a;
                                    aoVar3.a(str, auVar3, false, i.m470a(context10, e.ASSEMBLE_PUSH_FCM));
                                    context4 = this.f14718a.f680a;
                                    af.a(context4).b(str);
                                }
                            }
                            auVar2 = au.UPLOAD_COS_TOKEN;
                            if (auVar2.ordinal() == i) {
                                context7 = this.f14718a.f680a;
                                if ("syncing".equals(af.a(context7).a(auVar2))) {
                                    context8 = this.f14718a.f680a;
                                    a2 = i.m470a(context8, e.ASSEMBLE_PUSH_COS);
                                    a2.put("third_sync_reason", str2);
                                    aoVar = this.f14718a;
                                    aoVar.a(str, auVar2, false, a2);
                                    context4 = this.f14718a.f680a;
                                    af.a(context4).b(str);
                                }
                            }
                            auVar2 = au.UPLOAD_FTOS_TOKEN;
                            if (auVar2.ordinal() == i) {
                                context5 = this.f14718a.f680a;
                                if ("syncing".equals(af.a(context5).a(auVar2))) {
                                    context6 = this.f14718a.f680a;
                                    a2 = i.m470a(context6, e.ASSEMBLE_PUSH_FTOS);
                                    a2.put("third_sync_reason", str2);
                                    aoVar = this.f14718a;
                                    aoVar.a(str, auVar2, false, a2);
                                }
                            }
                            context4 = this.f14718a.f680a;
                            af.a(context4).b(str);
                        } else {
                            context3 = this.f14718a.f680a;
                            af.a(context3).c(str);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
