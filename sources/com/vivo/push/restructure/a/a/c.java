package com.vivo.push.restructure.a.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.wireless.security.SecExceptionCode;
import com.vivo.push.e.b;
import com.vivo.push.restructure.a.a;
import com.vivo.push.util.aa;
import com.vivo.push.util.ab;
import com.vivo.push.util.ag;
import com.vivo.push.util.u;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class c extends a<a> {
    private static final List<Integer> b = Arrays.asList(3);

    public c(a aVar, i iVar) {
        super("CheckNode", aVar, iVar);
    }

    private static boolean b(Intent intent) {
        try {
            Context b2 = com.vivo.push.restructure.a.a().b();
            String b3 = ag.b(b2, "com.vivo.pushservice");
            u.d("CheckNode", " 配置的验签参数 = ".concat(String.valueOf(b3)));
            if (!TextUtils.equals(b3, "1")) {
                return true;
            }
            String stringExtra = intent.getStringExtra("security_avoid_pull_rsa");
            String stringExtra2 = intent.getStringExtra("security_avoid_rsa_public_key");
            if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2)) {
                if (!TextUtils.equals(stringExtra, "com.vivo.pushservice") && !TextUtils.equals(stringExtra2, "com.vivo.pushservice")) {
                    if (b.a().a(b2).a("com.vivo.pushservice".getBytes("UTF-8"), ab.a(stringExtra2), Base64.decode(stringExtra, 2))) {
                        u.d("CheckNode", " RSA验签通过  ");
                        return true;
                    }
                    u.d("CheckNode", " RSA验签 不通过  ");
                    return false;
                }
                u.a("CheckNode", " 验签参数传入错误 securityContent = " + stringExtra + " publickKey= " + stringExtra2);
                return true;
            }
            u.a("CheckNode", "!decrypt.equals, so securityContent == " + stringExtra + " or publickKey isempty ");
            return false;
        } catch (Exception e) {
            u.a("CheckNode", "checkIntentIsSecurity Exception: " + e.getMessage());
            return true;
        }
    }

    @Override // com.vivo.push.restructure.a.a.a
    public final /* bridge */ /* synthetic */ int a(a aVar) {
        return a2(aVar);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static int a2(a aVar) {
        try {
            if (!com.vivo.push.restructure.a.a().e().l().isAgreePrivacyStatement()) {
                u.d("CheckNode", " checkNeedReportByPrivacyStatement is false  ");
                return 2809;
            }
            Intent b2 = aVar.b();
            String b3 = com.vivo.push.sdk.a.a().b();
            if (!TextUtils.isEmpty(b3) && b3.contains("CommandService") && (b2 == null || !a(b2) || !b(b2))) {
                u.a("CheckNode", " !checkIntentIsSecurity(intent)");
                return SecExceptionCode.SEC_ERROR_SENSOR_INVALID_PARA;
            }
            Context b4 = com.vivo.push.restructure.a.a().b();
            String packageName = b4.getPackageName();
            String stringExtra = b2.getStringExtra("command_type");
            if (!TextUtils.isEmpty(stringExtra) && stringExtra.equals("reflect_receiver")) {
                int intExtra = b2.getIntExtra("command", -1);
                if (intExtra < 0) {
                    intExtra = b2.getIntExtra("method", -1);
                }
                if (!b.contains(Integer.valueOf(intExtra)) || !aa.c(b4, packageName) || aa.b(b4)) {
                    String action = b2.getAction();
                    if (!TextUtils.isEmpty(com.vivo.push.restructure.a.a().e().a(b4, action))) {
                        return 0;
                    }
                    u.d("CheckNode", " reflectReceiver error: receiver for: " + action + " not found, package: " + packageName);
                    b2.setPackage(packageName);
                    b4.sendBroadcast(b2);
                    return 2802;
                }
                u.a("CheckNode", "METHOD_ON_MESSAGE is not support");
                return 2803;
            }
            u.a("CheckNode", "commandTypeStr is not satisfy == ".concat(String.valueOf(stringExtra)));
            return SecExceptionCode.SEC_ERROR_SENSOR_INVALID_PARA;
        } catch (Exception e) {
            u.a("CheckNode", e);
            return 0;
        }
    }

    private static boolean a(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("security_avoid_pull");
            if (!TextUtils.isEmpty(stringExtra)) {
                try {
                    String b2 = com.vivo.push.util.a.a(com.vivo.push.restructure.a.a().b()).b(stringExtra);
                    if ("com.vivo.pushservice".equals(b2)) {
                        return true;
                    }
                    u.a("CheckNode", "!decrypt.equals, so decrypt == ".concat(String.valueOf(b2)));
                    return false;
                } catch (Exception e) {
                    u.a("CheckNode", "checkIntentIsSecurity Exception: " + e.getMessage());
                    return false;
                }
            } else {
                u.a("CheckNode", "checkIntentIsSecurityTextUtils.isEmpty");
                return true;
            }
        } catch (Exception unused) {
            u.a("CheckNode", "getStringExtra error");
            return true;
        }
    }
}
