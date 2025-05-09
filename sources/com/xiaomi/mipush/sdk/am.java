package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.taobao.login4android.qrcode.data.QrCodeData;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.push.bm;
import com.xiaomi.push.bu;
import com.xiaomi.push.di;
import com.xiaomi.push.fc;
import com.xiaomi.push.fd;
import com.xiaomi.push.fn;
import com.xiaomi.push.g;
import com.xiaomi.push.ic;
import com.xiaomi.push.ih;
import com.xiaomi.push.im;
import com.xiaomi.push.io;
import com.xiaomi.push.ip;
import com.xiaomi.push.iq;
import com.xiaomi.push.is;
import com.xiaomi.push.it;
import com.xiaomi.push.ix;
import com.xiaomi.push.iy;
import com.xiaomi.push.iz;
import com.xiaomi.push.ja;
import com.xiaomi.push.jb;
import com.xiaomi.push.jd;
import com.xiaomi.push.jf;
import com.xiaomi.push.jh;
import com.xiaomi.push.jj;
import com.xiaomi.push.jl;
import com.xiaomi.push.jm;
import com.xiaomi.push.jn;
import com.xiaomi.push.js;
import com.xiaomi.push.p;
import com.xiaomi.push.service.al;
import com.xiaomi.push.service.ax;
import com.xiaomi.push.service.az;
import com.xiaomi.push.service.ba;
import com.xiaomi.push.service.bj;
import com.xiaomi.push.service.bs;
import com.xiaomi.push.service.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TimeZone;
import org.android.agoo.common.AgooConstants;
import tb.cpr;
import tb.ct2;
import tb.xg4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class am {

    /* renamed from: a  reason: collision with root package name */
    private static am f14714a;

    /* renamed from: a  reason: collision with other field name */
    private static Object f675a = new Object();

    /* renamed from: a  reason: collision with other field name */
    private static Queue<String> f676a;

    /* renamed from: a  reason: collision with other field name */
    private Context f677a;

    private am(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f677a = applicationContext;
        if (applicationContext == null) {
            this.f677a = context;
        }
    }

    public static Intent a(Context context, String str, Map<String, String> map, int i) {
        return al.b(context, str, map, i);
    }

    private void b(it itVar) {
        Context context;
        e eVar;
        b.c("ASSEMBLE_PUSH : " + itVar.toString());
        String a2 = itVar.a();
        Map<String, String> a3 = itVar.m834a();
        if (a3 != null) {
            String str = a3.get(Constants.ASSEMBLE_PUSH_REG_INFO);
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("brand:" + ag.FCM.name())) {
                    b.m410a("ASSEMBLE_PUSH : receive fcm token sync ack");
                    context = this.f677a;
                    eVar = e.ASSEMBLE_PUSH_FCM;
                } else {
                    StringBuilder sb = new StringBuilder("brand:");
                    ag agVar = ag.HUAWEI;
                    sb.append(agVar.name());
                    if (!str.contains(sb.toString())) {
                        if (!str.contains("channel:" + agVar.name())) {
                            StringBuilder sb2 = new StringBuilder("brand:");
                            ag agVar2 = ag.OPPO;
                            sb2.append(agVar2.name());
                            if (!str.contains(sb2.toString())) {
                                if (!str.contains("channel:" + agVar2.name())) {
                                    StringBuilder sb3 = new StringBuilder("brand:");
                                    ag agVar3 = ag.VIVO;
                                    sb3.append(agVar3.name());
                                    if (!str.contains(sb3.toString())) {
                                        if (!str.contains("channel:" + agVar3.name())) {
                                            return;
                                        }
                                    }
                                    b.m410a("ASSEMBLE_PUSH : receive FTOS token sync ack");
                                    context = this.f677a;
                                    eVar = e.ASSEMBLE_PUSH_FTOS;
                                }
                            }
                            b.m410a("ASSEMBLE_PUSH : receive COS token sync ack");
                            context = this.f677a;
                            eVar = e.ASSEMBLE_PUSH_COS;
                        }
                    }
                    b.m410a("ASSEMBLE_PUSH : receive hw token sync ack");
                    context = this.f677a;
                    eVar = e.ASSEMBLE_PUSH_HUAWEI;
                }
                i.b(context, eVar, str);
                a(a2, itVar.f1246a, eVar);
            }
        }
    }

    private void b(iy iyVar) {
        ip a2 = iyVar.m853a();
        if (a2 != null) {
            a2 = bs.a(a2.m818a());
        }
        is isVar = new is();
        isVar.b(iyVar.m854a());
        isVar.a(a2.m819a());
        isVar.a(a2.m817a());
        if (!TextUtils.isEmpty(a2.m824b())) {
            isVar.c(a2.m824b());
        }
        isVar.a(jm.m930a(this.f677a, iyVar));
        ao.a(this.f677a).a((ao) isVar, ic.AckMessage, false, a2);
    }

    public PushMessageHandler.a a(Intent intent) {
        String str;
        String str2;
        String str3;
        fd fdVar;
        Throwable e;
        fd a2;
        String packageName;
        String format;
        String action = intent.getAction();
        b.m410a("receive an intent from server, action=" + action);
        String stringExtra = intent.getStringExtra("mrt");
        if (stringExtra == null) {
            stringExtra = Long.toString(System.currentTimeMillis());
        }
        String stringExtra2 = intent.getStringExtra("messageId");
        int intExtra = intent.getIntExtra("eventMessageType", -1);
        if ("com.xiaomi.mipush.RECEIVE_MESSAGE".equals(action)) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            boolean booleanExtra = intent.getBooleanExtra("mipush_notified", false);
            if (byteArrayExtra == null) {
                b.d("receiving an empty message, drop");
                fd.a(this.f677a).a(this.f677a.getPackageName(), intent, "12");
                return null;
            }
            iy iyVar = new iy();
            try {
                jm.a(iyVar, byteArrayExtra);
                b a3 = b.m452a(this.f677a);
                ip a4 = iyVar.m853a();
                ic a5 = iyVar.a();
                ic icVar = ic.SendMessage;
                if (a5 == icVar && a4 != null && !a3.m463e() && !booleanExtra) {
                    a4.a("mrt", stringExtra);
                    a4.a("mat", Long.toString(System.currentTimeMillis()));
                    if (!m435a(iyVar)) {
                        b(iyVar);
                    } else {
                        b.b("this is a mina's message, ack later");
                        a4.a(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS, String.valueOf(a4.m817a()));
                        a4.a(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS, String.valueOf((int) jm.m930a(this.f677a, iyVar)));
                    }
                }
                String str4 = "";
                if (iyVar.a() != icVar || iyVar.m861b()) {
                    if (iyVar.a() == icVar && iyVar.m861b() && al.m1019a(iyVar) && (!booleanExtra || a4 == null || a4.m820a() == null || !a4.m820a().containsKey("notify_effect"))) {
                        String b = iyVar.b();
                        if (a4 != null) {
                            str4 = a4.m819a();
                        }
                        b.m410a(String.format("drop a wake-up messages which not has 'notify_effect' attr. %1$s, %2$s", b, str4));
                        fd.a(this.f677a).a(this.f677a.getPackageName(), intent, String.format("25: %1$s", iyVar.b()));
                        s.b(this.f677a, iyVar, booleanExtra);
                        return null;
                    }
                    if (a3.m461c() || iyVar.f1288a == ic.Registration) {
                        if (!a3.m461c() || !a3.m464f()) {
                            return a(iyVar, booleanExtra, byteArrayExtra, stringExtra2, intExtra, intent);
                        }
                        if (iyVar.f1288a != ic.UnRegistration) {
                            s.e(this.f677a, iyVar, booleanExtra);
                            MiPushClient.unregisterPush(this.f677a);
                            return null;
                        } else if (iyVar.m861b()) {
                            a3.m454a();
                            MiPushClient.clearExtras(this.f677a);
                            PushMessageHandler.a();
                            return null;
                        } else {
                            b.d("receiving an un-encrypt unregistration message");
                            return null;
                        }
                    } else if (al.m1019a(iyVar)) {
                        return a(iyVar, booleanExtra, byteArrayExtra, stringExtra2, intExtra, intent);
                    } else {
                        s.e(this.f677a, iyVar, booleanExtra);
                        boolean d = a3.m462d();
                        b.d("receive message without registration. need re-register!registered?" + d);
                        fd.a(this.f677a).a(this.f677a.getPackageName(), intent, "15");
                        if (!d) {
                            return null;
                        }
                        a();
                        return null;
                    }
                } else {
                    if (al.m1019a(iyVar)) {
                        String b2 = iyVar.b();
                        if (a4 != null) {
                            str4 = a4.m819a();
                        }
                        b.m410a(String.format("drop an un-encrypted wake-up messages. %1$s, %2$s", b2, str4));
                        a2 = fd.a(this.f677a);
                        packageName = this.f677a.getPackageName();
                        format = String.format("13: %1$s", iyVar.b());
                    } else {
                        String b3 = iyVar.b();
                        if (a4 != null) {
                            str4 = a4.m819a();
                        }
                        b.m410a(String.format("drop an un-encrypted messages. %1$s, %2$s", b3, str4));
                        a2 = fd.a(this.f677a);
                        packageName = this.f677a.getPackageName();
                        format = String.format("14: %1$s", iyVar.b());
                    }
                    a2.a(packageName, intent, format);
                    s.a(this.f677a, iyVar, booleanExtra);
                    return null;
                }
            } catch (js e2) {
                e = e2;
                fdVar = fd.a(this.f677a);
                str3 = this.f677a.getPackageName();
                str2 = "16";
                fdVar.a(str3, intent, str2);
                b.a(e);
                return null;
            } catch (Exception e3) {
                e = e3;
                fdVar = fd.a(this.f677a);
                str3 = this.f677a.getPackageName();
                str2 = "17";
                fdVar.a(str3, intent, str2);
                b.a(e);
                return null;
            }
        } else if ("com.xiaomi.mipush.ERROR".equals(action)) {
            MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
            iy iyVar2 = new iy();
            try {
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("mipush_payload");
                if (byteArrayExtra2 != null) {
                    jm.a(iyVar2, byteArrayExtra2);
                }
            } catch (js unused) {
            }
            miPushCommandMessage.setCommand(String.valueOf(iyVar2.a()));
            miPushCommandMessage.setResultCode(intent.getIntExtra("mipush_error_code", 0));
            miPushCommandMessage.setReason(intent.getStringExtra("mipush_error_msg"));
            b.d("receive a error message. code = " + intent.getIntExtra("mipush_error_code", 0) + ", msg= " + intent.getStringExtra("mipush_error_msg"));
            return miPushCommandMessage;
        } else if (!"com.xiaomi.mipush.MESSAGE_ARRIVED".equals(action)) {
            return null;
        } else {
            byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
            if (byteArrayExtra3 == null) {
                b.d("message arrived: receiving an empty message, drop");
                return null;
            }
            iy iyVar3 = new iy();
            try {
                jm.a(iyVar3, byteArrayExtra3);
                b a6 = b.m452a(this.f677a);
                if (al.m1019a(iyVar3)) {
                    str = "message arrived: receive ignore reg message, ignore!";
                } else if (!a6.m461c()) {
                    str = "message arrived: receive message without registration. need unregister or re-register!";
                } else if (!a6.m461c() || !a6.m464f()) {
                    return a(iyVar3, byteArrayExtra3);
                } else {
                    str = "message arrived: app info is invalidated";
                }
                b.d(str);
                return null;
            } catch (Exception e4) {
                b.d("fail to deal with arrived message. " + e4);
                return null;
            }
        }
    }

    private PushMessageHandler.a a(iy iyVar, boolean z, byte[] bArr, String str, int i, Intent intent) {
        String str2;
        String str3;
        String str4;
        fd fdVar;
        String str5;
        String str6;
        jf jfVar;
        MiPushMessage miPushMessage;
        fd a2;
        String packageName;
        String a3;
        int i2;
        String str7;
        ArrayList arrayList = null;
        try {
            jn a4 = ai.a(this.f677a, iyVar);
            if (a4 == null) {
                b.d("receiving an un-recognized message. " + iyVar.f1288a);
                fd.a(this.f677a).b(this.f677a.getPackageName(), fc.m675a(i), str, "18");
                s.c(this.f677a, iyVar, z);
                return null;
            }
            ic a5 = iyVar.a();
            b.m412a("processing a message, action=", a5, ", hasNotified=", Boolean.valueOf(z));
            switch (an.f14715a[a5.ordinal()]) {
                case 1:
                    if (!iyVar.m861b()) {
                        b.d("receiving an un-encrypt message(SendMessage).");
                        return null;
                    } else if (!b.m452a(this.f677a).m463e() || z) {
                        jf jfVar2 = (jf) a4;
                        io a6 = jfVar2.a();
                        if (a6 == null) {
                            b.d("receive an empty message without push content, drop it");
                            fd.a(this.f677a).b(this.f677a.getPackageName(), fc.m675a(i), str, AgooConstants.REPORT_ENCRYPT_FAIL);
                            s.d(this.f677a, iyVar, z);
                            return null;
                        }
                        int intExtra = intent.getIntExtra("notification_click_button", 0);
                        if (z) {
                            if (al.m1019a(iyVar)) {
                                MiPushClient.reportIgnoreRegMessageClicked(this.f677a, a6.m811a(), iyVar.m853a(), iyVar.f1295b, a6.b());
                            } else {
                                ip ipVar = iyVar.m853a() != null ? new ip(iyVar.m853a()) : new ip();
                                if (ipVar.m820a() == null) {
                                    ipVar.a(new HashMap());
                                }
                                ipVar.m820a().put("notification_click_button", String.valueOf(intExtra));
                                MiPushClient.reportMessageClicked(this.f677a, a6.m811a(), ipVar, a6.b());
                            }
                        }
                        if (!z) {
                            if (!TextUtils.isEmpty(jfVar2.d()) && MiPushClient.aliasSetTime(this.f677a, jfVar2.d()) < 0) {
                                MiPushClient.addAlias(this.f677a, jfVar2.d());
                            } else if (!TextUtils.isEmpty(jfVar2.c()) && MiPushClient.topicSubscribedTime(this.f677a, jfVar2.c()) < 0) {
                                MiPushClient.addTopic(this.f677a, jfVar2.c());
                            }
                        }
                        ip ipVar2 = iyVar.f1289a;
                        if (ipVar2 == null || ipVar2.m820a() == null) {
                            str6 = null;
                            str5 = null;
                        } else {
                            str6 = iyVar.f1289a.f1203a.get("jobkey");
                            str5 = str6;
                        }
                        if (TextUtils.isEmpty(str6)) {
                            str6 = a6.m811a();
                        }
                        if (z || !m434a(this.f677a, str6)) {
                            MiPushMessage generateMessage = PushMessageHelper.generateMessage(jfVar2, iyVar.m853a(), z);
                            if (generateMessage.getPassThrough() != 0 || z || !al.m1020a(generateMessage.getExtra())) {
                                String a7 = al.a(generateMessage.getExtra(), intExtra);
                                jfVar = jfVar2;
                                b.m412a("receive a message, msgid=", a6.m811a(), ", jobkey=", str6, ", btn=", Integer.valueOf(intExtra), ", typeId=", a7, ", hasNotified=", Boolean.valueOf(z));
                                if (!z || generateMessage.getExtra() == null || TextUtils.isEmpty(a7)) {
                                    miPushMessage = generateMessage;
                                } else {
                                    Map<String, String> extra = generateMessage.getExtra();
                                    if (!(intExtra == 0 || iyVar.m853a() == null)) {
                                        ao.a(this.f677a).a(iyVar.m853a().c(), intExtra);
                                    }
                                    if (al.m1019a(iyVar)) {
                                        Intent a8 = a(this.f677a, iyVar.f1295b, extra, intExtra);
                                        a8.putExtra("eventMessageType", i);
                                        a8.putExtra("messageId", str);
                                        a8.putExtra("jobkey", str5);
                                        String c = a6.c();
                                        if (!TextUtils.isEmpty(c)) {
                                            a8.putExtra("payload", c);
                                        }
                                        this.f677a.startActivity(a8);
                                        s.a(this.f677a, iyVar);
                                        fd.a(this.f677a).a(this.f677a.getPackageName(), fc.m675a(i), str, cpr.MSG_TYPE_SWITCH_OFFICIAL, a7);
                                        b.m411a("PushMessageProcessor", "start business activity succ");
                                    } else {
                                        Context context = this.f677a;
                                        Intent a9 = a(context, context.getPackageName(), extra, intExtra);
                                        if (a9 != null) {
                                            if (!a7.equals(bj.c)) {
                                                a9.putExtra(PushMessageHelper.KEY_MESSAGE, generateMessage);
                                                a9.putExtra("eventMessageType", i);
                                                a9.putExtra("messageId", str);
                                                a9.putExtra("jobkey", str5);
                                            }
                                            this.f677a.startActivity(a9);
                                            s.a(this.f677a, iyVar);
                                            b.m411a("PushMessageProcessor", "start activity succ");
                                            fd.a(this.f677a).a(this.f677a.getPackageName(), fc.m675a(i), str, 1006, a7);
                                            if (a7.equals(bj.c)) {
                                                fd.a(this.f677a).a(this.f677a.getPackageName(), fc.m675a(i), str, "13");
                                            }
                                        } else {
                                            b.c("PushMessageProcessor", "missing target intent for message: " + a6.m811a() + ", typeId=" + a7);
                                        }
                                    }
                                    b.m411a("PushMessageProcessor", "pre-def msg process done.");
                                    return null;
                                }
                            } else {
                                al.m1015a(this.f677a, iyVar, bArr);
                                return null;
                            }
                        } else {
                            b.m410a("drop a duplicate message, key=" + str6);
                            fd a10 = fd.a(this.f677a);
                            String packageName2 = this.f677a.getPackageName();
                            String a11 = fc.m675a(i);
                            a10.c(packageName2, a11, str, "2:" + str6);
                            jfVar = jfVar2;
                            miPushMessage = null;
                        }
                        if (iyVar.m853a() == null && !z) {
                            a(jfVar, iyVar);
                        }
                        return miPushMessage;
                    } else {
                        b.m410a("receive a message in pause state. drop it");
                        fd.a(this.f677a).a(this.f677a.getPackageName(), fc.m675a(i), str, "12");
                        return null;
                    }
                case 2:
                    jd jdVar = (jd) a4;
                    String str8 = b.m452a(this.f677a).f695a;
                    if (TextUtils.isEmpty(str8) || !TextUtils.equals(str8, jdVar.m893a())) {
                        b.m410a("bad Registration result:");
                        fd.a(this.f677a).b(this.f677a.getPackageName(), fc.m675a(i), str, AgooConstants.REPORT_MESSAGE_NULL);
                        return null;
                    }
                    long a12 = ao.a(this.f677a).m441a();
                    if (a12 <= 0 || SystemClock.elapsedRealtime() - a12 <= QrCodeData.QR_CODE_VALID_PERIOD) {
                        b.m452a(this.f677a).f695a = null;
                        if (jdVar.f1352a == 0) {
                            b.m452a(this.f677a).b(jdVar.f1364e, jdVar.f1365f, jdVar.f1371l);
                            FCMPushHelper.persistIfXmsfSupDecrypt(this.f677a);
                            a2 = fd.a(this.f677a);
                            packageName = this.f677a.getPackageName();
                            a3 = fc.m675a(i);
                            i2 = 6006;
                            str7 = "1";
                        } else {
                            a2 = fd.a(this.f677a);
                            packageName = this.f677a.getPackageName();
                            a3 = fc.m675a(i);
                            i2 = 6006;
                            str7 = "2";
                        }
                        a2.a(packageName, a3, str, i2, str7);
                        if (!TextUtils.isEmpty(jdVar.f1364e)) {
                            arrayList = new ArrayList();
                            arrayList.add(jdVar.f1364e);
                        }
                        MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(fn.COMMAND_REGISTER.f992a, arrayList, jdVar.f1352a, jdVar.f1363d, null, jdVar.m894a());
                        ao.a(this.f677a).m450d();
                        return generateCommandMessage;
                    }
                    b.m410a("The received registration result has expired.");
                    fd.a(this.f677a).b(this.f677a.getPackageName(), fc.m675a(i), str, "26");
                    return null;
                case 3:
                    if (iyVar.m861b()) {
                        if (((jj) a4).f1430a == 0) {
                            b.m452a(this.f677a).m454a();
                            MiPushClient.clearExtras(this.f677a);
                        }
                        PushMessageHandler.a();
                        break;
                    } else {
                        b.d("receiving an un-encrypt message(UnRegistration).");
                        return null;
                    }
                case 4:
                    jh jhVar = (jh) a4;
                    if (jhVar.f1405a == 0) {
                        MiPushClient.addTopic(this.f677a, jhVar.b());
                    }
                    if (!TextUtils.isEmpty(jhVar.b())) {
                        arrayList = new ArrayList();
                        arrayList.add(jhVar.b());
                    }
                    StringBuilder sb = new StringBuilder("resp-cmd:");
                    fn fnVar = fn.COMMAND_SUBSCRIBE_TOPIC;
                    sb.append(fnVar);
                    sb.append(", ");
                    sb.append(jhVar.a());
                    b.e(sb.toString());
                    return PushMessageHelper.generateCommandMessage(fnVar.f992a, arrayList, jhVar.f1405a, jhVar.f1411d, jhVar.c(), null);
                case 5:
                    jl jlVar = (jl) a4;
                    if (jlVar.f1450a == 0) {
                        MiPushClient.removeTopic(this.f677a, jlVar.b());
                    }
                    if (!TextUtils.isEmpty(jlVar.b())) {
                        arrayList = new ArrayList();
                        arrayList.add(jlVar.b());
                    }
                    StringBuilder sb2 = new StringBuilder("resp-cmd:");
                    fn fnVar2 = fn.COMMAND_UNSUBSCRIBE_TOPIC;
                    sb2.append(fnVar2);
                    sb2.append(", ");
                    sb2.append(jlVar.a());
                    b.e(sb2.toString());
                    return PushMessageHelper.generateCommandMessage(fnVar2.f992a, arrayList, jlVar.f1450a, jlVar.f1456d, jlVar.c(), null);
                case 6:
                    di.a(this.f677a.getPackageName(), this.f677a, a4, ic.Command, bArr.length);
                    ix ixVar = (ix) a4;
                    String b = ixVar.b();
                    List<String> a13 = ixVar.m847a();
                    if (ixVar.f1276a == 0) {
                        if (TextUtils.equals(b, fn.COMMAND_SET_ACCEPT_TIME.f992a) && a13 != null && a13.size() > 1) {
                            MiPushClient.addAcceptTime(this.f677a, a13.get(0), a13.get(1));
                            if (!"00:00".equals(a13.get(0)) || !"00:00".equals(a13.get(1))) {
                                b.m452a(this.f677a).a(false);
                            } else {
                                b.m452a(this.f677a).a(true);
                            }
                            a13 = a(TimeZone.getTimeZone("GMT+08"), TimeZone.getDefault(), a13);
                        } else if (TextUtils.equals(b, fn.COMMAND_SET_ALIAS.f992a) && a13 != null && a13.size() > 0) {
                            MiPushClient.addAlias(this.f677a, a13.get(0));
                        } else if (TextUtils.equals(b, fn.COMMAND_UNSET_ALIAS.f992a) && a13 != null && a13.size() > 0) {
                            MiPushClient.removeAlias(this.f677a, a13.get(0));
                        } else if (TextUtils.equals(b, fn.COMMAND_SET_ACCOUNT.f992a) && a13 != null && a13.size() > 0) {
                            MiPushClient.addAccount(this.f677a, a13.get(0));
                        } else if (TextUtils.equals(b, fn.COMMAND_UNSET_ACCOUNT.f992a) && a13 != null && a13.size() > 0) {
                            MiPushClient.removeAccount(this.f677a, a13.get(0));
                        } else if (TextUtils.equals(b, fn.COMMAND_CHK_VDEVID.f992a)) {
                            return null;
                        }
                    }
                    b.e("resp-cmd:" + b + ", " + ixVar.a());
                    return PushMessageHelper.generateCommandMessage(b, a13, ixVar.f1276a, ixVar.f1284d, ixVar.c(), null);
                case 7:
                    di.a(this.f677a.getPackageName(), this.f677a, a4, ic.Notification, bArr.length);
                    if (!(a4 instanceof it)) {
                        if (a4 instanceof jb) {
                            jb jbVar = (jb) a4;
                            if (!"registration id expired".equalsIgnoreCase(jbVar.f1313d)) {
                                if (im.ClientInfoUpdateOk.f1168a.equalsIgnoreCase(jbVar.f1313d)) {
                                    if (jbVar.m880a() != null && jbVar.m880a().containsKey("app_version")) {
                                        b.m452a(this.f677a).m455a(jbVar.m880a().get("app_version"));
                                        break;
                                    }
                                } else if (im.AwakeApp.f1168a.equalsIgnoreCase(jbVar.f1313d)) {
                                    if (iyVar.m861b() && jbVar.m880a() != null && jbVar.m880a().containsKey("awake_info")) {
                                        Context context2 = this.f677a;
                                        o.a(context2, b.m452a(context2).m453a(), az.a(this.f677a).a(ih.AwakeInfoUploadWaySwitch.a(), 0), jbVar.m880a().get("awake_info"));
                                        break;
                                    }
                                } else {
                                    try {
                                        if (im.NormalClientConfigUpdate.f1168a.equalsIgnoreCase(jbVar.f1313d)) {
                                            ja jaVar = new ja();
                                            jm.a(jaVar, jbVar.m885a());
                                            ba.a(az.a(this.f677a), jaVar);
                                        } else if (!im.CustomClientConfigUpdate.f1168a.equalsIgnoreCase(jbVar.f1313d)) {
                                            if (!im.SyncInfoResult.f1168a.equalsIgnoreCase(jbVar.f1313d)) {
                                                if (!im.ForceSync.f1168a.equalsIgnoreCase(jbVar.f1313d)) {
                                                    if (im.CancelPushMessage.f1168a.equals(jbVar.f1313d)) {
                                                        b.e("resp-type:" + jbVar.f1313d + ", " + jbVar.m879a());
                                                        if (jbVar.m880a() != null) {
                                                            int i3 = -2;
                                                            if (jbVar.m880a().containsKey(bj.P)) {
                                                                String str9 = jbVar.m880a().get(bj.P);
                                                                if (!TextUtils.isEmpty(str9)) {
                                                                    try {
                                                                        i3 = Integer.parseInt(str9);
                                                                    } catch (NumberFormatException e) {
                                                                        e.printStackTrace();
                                                                    }
                                                                }
                                                            }
                                                            if (i3 >= -1) {
                                                                MiPushClient.clearNotification(this.f677a, i3);
                                                            } else {
                                                                String str10 = "";
                                                                String str11 = "";
                                                                if (jbVar.m880a().containsKey(bj.N)) {
                                                                    str10 = jbVar.m880a().get(bj.N);
                                                                }
                                                                if (jbVar.m880a().containsKey(bj.O)) {
                                                                    str11 = jbVar.m880a().get(bj.O);
                                                                }
                                                                MiPushClient.clearNotification(this.f677a, str10, str11);
                                                            }
                                                        }
                                                        a(jbVar);
                                                        break;
                                                    } else {
                                                        try {
                                                            if (im.HybridRegisterResult.f1168a.equals(jbVar.f1313d)) {
                                                                jd jdVar2 = new jd();
                                                                jm.a(jdVar2, jbVar.m885a());
                                                                MiPushClient4Hybrid.onReceiveRegisterResult(this.f677a, jdVar2);
                                                            } else if (!im.HybridUnregisterResult.f1168a.equals(jbVar.f1313d)) {
                                                                if (!im.PushLogUpload.f1168a.equals(jbVar.f1313d)) {
                                                                    if (!im.DetectAppAlive.f1168a.equals(jbVar.f1313d)) {
                                                                        if (j.a(jbVar)) {
                                                                            b.b("receive notification handle by cpra");
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        b.b("receive detect msg");
                                                                        b(jbVar);
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                jj jjVar = new jj();
                                                                jm.a(jjVar, jbVar.m885a());
                                                                MiPushClient4Hybrid.onReceiveUnregisterResult(this.f677a, jjVar);
                                                            }
                                                            break;
                                                        } catch (js e2) {
                                                            b.a(e2);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    b.m410a("receive force sync notification");
                                                    av.a(this.f677a, false);
                                                    break;
                                                }
                                            } else {
                                                av.a(this.f677a, jbVar);
                                                break;
                                            }
                                        } else {
                                            iz izVar = new iz();
                                            jm.a(izVar, jbVar.m885a());
                                            ba.a(az.a(this.f677a), izVar);
                                        }
                                        break;
                                    } catch (js unused) {
                                        break;
                                    }
                                }
                            } else {
                                List<String> allAlias = MiPushClient.getAllAlias(this.f677a);
                                List<String> allTopic = MiPushClient.getAllTopic(this.f677a);
                                List<String> allUserAccount = MiPushClient.getAllUserAccount(this.f677a);
                                String acceptTime = MiPushClient.getAcceptTime(this.f677a);
                                b.e("resp-type:" + jbVar.f1313d + ", " + jbVar.m879a());
                                MiPushClient.reInitialize(this.f677a, iq.RegIdExpired);
                                for (String str12 : allAlias) {
                                    MiPushClient.removeAlias(this.f677a, str12);
                                    MiPushClient.setAlias(this.f677a, str12, null);
                                }
                                for (String str13 : allTopic) {
                                    MiPushClient.removeTopic(this.f677a, str13);
                                    MiPushClient.subscribe(this.f677a, str13, null);
                                }
                                for (String str14 : allUserAccount) {
                                    MiPushClient.removeAccount(this.f677a, str14);
                                    MiPushClient.setUserAccount(this.f677a, str14, null);
                                }
                                String[] split = acceptTime.split(",");
                                if (split.length == 2) {
                                    MiPushClient.removeAcceptTime(this.f677a);
                                    MiPushClient.addAcceptTime(this.f677a, split[0], split[1]);
                                    break;
                                }
                            }
                        }
                    } else {
                        it itVar = (it) a4;
                        String a14 = itVar.a();
                        b.e("resp-type:" + itVar.b() + ", code:" + itVar.f1246a + ", " + a14);
                        if (im.DisablePushMessage.f1168a.equalsIgnoreCase(itVar.f1253d)) {
                            if (itVar.f1246a != 0) {
                                if ("syncing".equals(af.a(this.f677a).a(au.DISABLE_PUSH))) {
                                    synchronized (af.class) {
                                        try {
                                            if (af.a(this.f677a).m433a(a14)) {
                                                if (af.a(this.f677a).a(a14) < 10) {
                                                    af.a(this.f677a).b(a14);
                                                    ao.a(this.f677a).a(true, a14);
                                                } else {
                                                    af.a(this.f677a).c(a14);
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                    break;
                                }
                            } else {
                                synchronized (af.class) {
                                    try {
                                        if (af.a(this.f677a).m433a(a14)) {
                                            af.a(this.f677a).c(a14);
                                            af a15 = af.a(this.f677a);
                                            au auVar = au.DISABLE_PUSH;
                                            if ("syncing".equals(a15.a(auVar))) {
                                                af.a(this.f677a).a(auVar, "synced");
                                                MiPushClient.clearNotification(this.f677a);
                                                MiPushClient.clearLocalNotificationType(this.f677a);
                                                PushMessageHandler.a();
                                                ao.a(this.f677a).m447b();
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                break;
                            }
                        } else if (im.EnablePushMessage.f1168a.equalsIgnoreCase(itVar.f1253d)) {
                            if (itVar.f1246a != 0) {
                                if ("syncing".equals(af.a(this.f677a).a(au.ENABLE_PUSH))) {
                                    synchronized (af.class) {
                                        try {
                                            if (af.a(this.f677a).m433a(a14)) {
                                                if (af.a(this.f677a).a(a14) < 10) {
                                                    af.a(this.f677a).b(a14);
                                                    ao.a(this.f677a).a(false, a14);
                                                } else {
                                                    af.a(this.f677a).c(a14);
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                    break;
                                }
                            } else {
                                synchronized (af.class) {
                                    try {
                                        if (af.a(this.f677a).m433a(a14)) {
                                            af.a(this.f677a).c(a14);
                                            af a16 = af.a(this.f677a);
                                            au auVar2 = au.ENABLE_PUSH;
                                            if ("syncing".equals(a16.a(auVar2))) {
                                                af.a(this.f677a).a(auVar2, "synced");
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                break;
                            }
                        } else if (!im.ThirdPartyRegUpdate.f1168a.equalsIgnoreCase(itVar.f1253d)) {
                            if (im.UploadTinyData.f1168a.equalsIgnoreCase(itVar.f1253d)) {
                                a(itVar);
                                break;
                            }
                        } else {
                            b(itVar);
                            break;
                        }
                        af.a(this.f677a).c(a14);
                        break;
                    }
                    break;
            }
            return null;
        } catch (u e3) {
            b.a(e3);
            a(iyVar);
            fdVar = fd.a(this.f677a);
            str4 = this.f677a.getPackageName();
            str3 = fc.m675a(i);
            str2 = "19";
            fdVar.b(str4, str3, str, str2);
            s.c(this.f677a, iyVar, z);
            return null;
        } catch (js e4) {
            b.a(e4);
            b.d("receive a message which action string is not valid. is the reg expired?");
            fdVar = fd.a(this.f677a);
            str4 = this.f677a.getPackageName();
            str3 = fc.m675a(i);
            str2 = ct2.COLOR_TAG_NOT_ZCACHE_RESOURCE;
            fdVar.b(str4, str3, str, str2);
            s.c(this.f677a, iyVar, z);
            return null;
        }
    }

    private void b(jb jbVar) {
        String str;
        Map<String, String> a2 = jbVar.m880a();
        if (a2 == null) {
            str = "detect failed because null";
        } else {
            String str2 = (String) ax.a(a2, "pkgList", (Object) null);
            if (TextUtils.isEmpty(str2)) {
                str = "detect failed because empty";
            } else {
                Map<String, String> a3 = g.m703a(this.f677a, str2);
                if (a3 != null) {
                    String str3 = a3.get("alive");
                    String str4 = a3.get("notAlive");
                    if (!TextUtils.isEmpty(str3)) {
                        jb jbVar2 = new jb();
                        jbVar2.a(jbVar.m879a());
                        jbVar2.b(jbVar.b());
                        jbVar2.d(jbVar.c());
                        jbVar2.c(im.DetectAppAliveResult.f1168a);
                        HashMap hashMap = new HashMap();
                        jbVar2.f1308a = hashMap;
                        hashMap.put("alive", str3);
                        if (Boolean.parseBoolean((String) ax.a(a2, "reportNotAliveApp", "false")) && !TextUtils.isEmpty(str4)) {
                            jbVar2.f1308a.put("notAlive", str4);
                        }
                        ao.a(this.f677a).a((ao) jbVar2, ic.Notification, false, (ip) null);
                        return;
                    }
                    b.b("detect failed because no alive process");
                    return;
                }
                b.m410a("detect failed because get status illegal");
                return;
            }
        }
        b.m410a(str);
    }

    private PushMessageHandler.a a(iy iyVar, byte[] bArr) {
        String str;
        jn a2;
        String str2 = null;
        try {
            a2 = ai.a(this.f677a, iyVar);
        } catch (u e) {
            b.a(e);
            str = "message arrived: receive a message but decrypt failed. report when click.";
        } catch (js e2) {
            b.a(e2);
            str = "message arrived: receive a message which action string is not valid. is the reg expired?";
        }
        if (a2 == null) {
            b.d("message arrived: receiving an un-recognized message. " + iyVar.f1288a);
            return null;
        }
        ic a3 = iyVar.a();
        b.m410a("message arrived: processing an arrived message, action=" + a3);
        if (an.f14715a[a3.ordinal()] != 1) {
            return null;
        }
        if (!iyVar.m861b()) {
            str = "message arrived: receiving an un-encrypt message(SendMessage).";
        } else {
            jf jfVar = (jf) a2;
            io a4 = jfVar.a();
            if (a4 == null) {
                str = "message arrived: receive an empty message without push content, drop it";
            } else {
                ip ipVar = iyVar.f1289a;
                if (!(ipVar == null || ipVar.m820a() == null)) {
                    str2 = iyVar.f1289a.f1203a.get("jobkey");
                }
                MiPushMessage generateMessage = PushMessageHelper.generateMessage(jfVar, iyVar.m853a(), false);
                generateMessage.setArrivedMessage(true);
                b.m410a("message arrived: receive a message, msgid=" + a4.m811a() + ", jobkey=" + str2);
                return generateMessage;
            }
        }
        b.d(str);
        return null;
    }

    public static am a(Context context) {
        if (f14714a == null) {
            f14714a = new am(context);
        }
        return f14714a;
    }

    public List<String> a(TimeZone timeZone, TimeZone timeZone2, List<String> list) {
        if (timeZone.equals(timeZone2)) {
            return list;
        }
        long rawOffset = ((timeZone.getRawOffset() - timeZone2.getRawOffset()) / 1000) / 60;
        long parseLong = ((((Long.parseLong(list.get(0).split(":")[0]) * 60) + Long.parseLong(list.get(0).split(":")[1])) - rawOffset) + 1440) % 1440;
        long parseLong2 = ((((Long.parseLong(list.get(1).split(":")[0]) * 60) + Long.parseLong(list.get(1).split(":")[1])) - rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(parseLong / 60), Long.valueOf(parseLong % 60)));
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(parseLong2 / 60), Long.valueOf(parseLong2 % 60)));
        return arrayList;
    }

    private void a() {
        SharedPreferences sharedPreferences = this.f677a.getSharedPreferences("mipush_extra", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - sharedPreferences.getLong(Constants.SP_KEY_LAST_REINITIALIZE, 0L)) > xg4.DEFAULT_SMALL_MAX_AGE) {
            MiPushClient.reInitialize(this.f677a, iq.PackageUnregistered);
            sharedPreferences.edit().putLong(Constants.SP_KEY_LAST_REINITIALIZE, currentTimeMillis).commit();
        }
    }

    public static void a(Context context, String str) {
        synchronized (f675a) {
            f676a.remove(str);
            b.m452a(context);
            SharedPreferences a2 = b.a(context);
            String a3 = bm.a(f676a, ",");
            SharedPreferences.Editor edit = a2.edit();
            edit.putString("pref_msg_ids", a3);
            p.a(edit);
        }
    }

    private void a(it itVar) {
        String a2 = itVar.a();
        b.b("receive ack " + a2);
        Map<String, String> a3 = itVar.m834a();
        if (a3 != null) {
            String str = a3.get("real_source");
            if (!TextUtils.isEmpty(str)) {
                b.b("receive ack : messageId = " + a2 + "  realSource = " + str);
                bu.a(this.f677a).a(a2, str, Boolean.valueOf(itVar.f1246a == 0));
            }
        }
    }

    private void a(iy iyVar) {
        b.m410a("receive a message but decrypt failed. report now.");
        jb jbVar = new jb(iyVar.m853a().f1201a, false);
        jbVar.c(im.DecryptMessageFail.f1168a);
        jbVar.b(iyVar.m854a());
        jbVar.d(iyVar.f1295b);
        HashMap hashMap = new HashMap();
        jbVar.f1308a = hashMap;
        hashMap.put(Constants.SP_KEY_REG_ID, MiPushClient.getRegId(this.f677a));
        ao.a(this.f677a).a((ao) jbVar, ic.Notification, false, (ip) null);
    }

    private void a(jb jbVar) {
        it itVar = new it();
        itVar.c(im.CancelPushMessageACK.f1168a);
        itVar.a(jbVar.m879a());
        itVar.a(jbVar.a());
        itVar.b(jbVar.b());
        itVar.e(jbVar.c());
        itVar.a(0L);
        itVar.d("success clear push message.");
        ao.a(this.f677a).a(itVar, ic.Notification, false, true, null, false, this.f677a.getPackageName(), b.m452a(this.f677a).m453a(), false);
    }

    private void a(jf jfVar, iy iyVar) {
        ip a2 = iyVar.m853a();
        if (a2 != null) {
            a2 = bs.a(a2.m818a());
        }
        is isVar = new is();
        isVar.b(jfVar.b());
        isVar.a(jfVar.m902a());
        isVar.a(jfVar.a().a());
        if (!TextUtils.isEmpty(jfVar.c())) {
            isVar.c(jfVar.c());
        }
        if (!TextUtils.isEmpty(jfVar.d())) {
            isVar.d(jfVar.d());
        }
        isVar.a(jm.m930a(this.f677a, iyVar));
        ao.a(this.f677a).a((ao) isVar, ic.AckMessage, a2);
    }

    private void a(String str, long j, e eVar) {
        au a2 = l.a(eVar);
        if (a2 != null) {
            if (j == 0) {
                synchronized (af.class) {
                    try {
                        if (af.a(this.f677a).m433a(str)) {
                            af.a(this.f677a).c(str);
                            if ("syncing".equals(af.a(this.f677a).a(a2))) {
                                af.a(this.f677a).a(a2, "synced");
                            }
                        }
                    } finally {
                    }
                }
            } else if ("syncing".equals(af.a(this.f677a).a(a2))) {
                synchronized (af.class) {
                    try {
                        if (af.a(this.f677a).m433a(str)) {
                            if (af.a(this.f677a).a(str) < 10) {
                                af.a(this.f677a).b(str);
                                ao.a(this.f677a).a(str, a2, eVar, "retry");
                            } else {
                                af.a(this.f677a).c(str);
                            }
                        }
                    } finally {
                    }
                }
            } else {
                af.a(this.f677a).c(str);
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m434a(Context context, String str) {
        synchronized (f675a) {
            try {
                b.m452a(context);
                SharedPreferences a2 = b.a(context);
                if (f676a == null) {
                    String[] split = a2.getString("pref_msg_ids", "").split(",");
                    f676a = new LinkedList();
                    for (String str2 : split) {
                        f676a.add(str2);
                    }
                }
                if (f676a.contains(str)) {
                    return true;
                }
                f676a.add(str);
                if (f676a.size() > 25) {
                    f676a.poll();
                }
                String a3 = bm.a(f676a, ",");
                SharedPreferences.Editor edit = a2.edit();
                edit.putString("pref_msg_ids", a3);
                p.a(edit);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private boolean m435a(iy iyVar) {
        Map<String, String> a2 = iyVar.m853a() == null ? null : iyVar.m853a().m820a();
        if (a2 == null) {
            return false;
        }
        String str = a2.get(Constants.EXTRA_KEY_PUSH_SERVER_ACTION);
        return TextUtils.equals(str, Constants.EXTRA_VALUE_HYBRID_MESSAGE) || TextUtils.equals(str, Constants.EXTRA_VALUE_PLATFORM_MESSAGE);
    }
}
