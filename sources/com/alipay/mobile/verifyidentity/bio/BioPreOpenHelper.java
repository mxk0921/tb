package com.alipay.mobile.verifyidentity.bio;

import android.text.TextUtils;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BioPreOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final StringBuffer f4283a = new StringBuffer();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static String c = "";
    public static String d = "";
    public static String e = "";
    public static String f = "fp";

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            f = str;
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        VerifyLogCat.e("Verifyidentity", "预开通本地信息：" + str);
        f4283a.append(str);
    }

    public static Boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("5a4bcb31", new Object[]{str});
        }
        d = str;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(c)) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(d.equals(c));
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else {
            b.set(false);
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else {
            b.set(true);
        }
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
        }
        if (f.equalsIgnoreCase("faceId")) {
            return "4";
        }
        return "1";
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[0]);
        }
        if (f.equalsIgnoreCase("faceId")) {
            return CommonConstant.FACEID_PAY;
        }
        return CommonConstant.FINGERPRINT_PAY;
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]);
        }
        return e;
    }

    public static int a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{str, str2})).intValue();
        }
        VerifyLogCat.i("Verifyidentity", "预开通启动.......");
        if (TextUtils.isEmpty(str)) {
            VerifyLogCat.i("Verifyidentity", "bizId为空，预开通启动失败");
            return 1;
        } else if (c.equals(str)) {
            VerifyLogCat.i("Verifyidentity", "bizId和上次传入一致，不做重复预开通");
            return 2;
        } else if (TextUtils.isEmpty(str2)) {
            VerifyLogCat.i("Verifyidentity", "userId为空，预开通失败");
            return 1;
        } else {
            a();
            c = str;
            e = str2;
            b.set(true);
            VerifyLogCat.i("Verifyidentity", "bizId：" + c + "预开通启动正常");
            return 0;
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : f4283a.toString();
    }

    public static Boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("efdd6667", new Object[0]);
        }
        StringBuilder sb = new StringBuilder("SubmitOpenBio judge:bizId:");
        sb.append(c);
        sb.append(" isNeedPreOpenBioPay:");
        AtomicBoolean atomicBoolean = b;
        sb.append(atomicBoolean);
        sb.append(" preOpenResult:");
        StringBuffer stringBuffer = f4283a;
        sb.append(stringBuffer.toString());
        sb.append(" mTbsid:");
        sb.append(e);
        VerifyLogCat.e("Verifyidentity", sb.toString());
        if (!atomicBoolean.get()) {
            VerifyLogCat.e("Verifyidentity", "开通条件不满足：开关关闭");
            return Boolean.FALSE;
        } else if (TextUtils.isEmpty(c)) {
            VerifyLogCat.e("Verifyidentity", "开通条件不满足：bizId为空");
            return Boolean.FALSE;
        } else if (TextUtils.isEmpty(d)) {
            VerifyLogCat.e("Verifyidentity", "开通条件不满足：验证阶段bizId为空");
            return Boolean.FALSE;
        } else if (!d.equalsIgnoreCase(c)) {
            VerifyLogCat.e("Verifyidentity", "开通条件不满足：verifyBizId与bizId不一致");
            return Boolean.FALSE;
        } else if (TextUtils.isEmpty(stringBuffer.toString())) {
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-240620-7", Constants.VI_ENGINE_APPID, "obfp", "", "", null, new HashMap());
            VerifyLogCat.e("Verifyidentity", "开通条件不满足：本地生物预开通信息为空,可能是由于超时导致的");
            return Boolean.FALSE;
        } else if (TextUtils.isEmpty(e)) {
            VerifyLogCat.e("Verifyidentity", "开通条件不满足：用户2088为空");
            return Boolean.FALSE;
        } else {
            VerifyLogCat.e("Verifyidentity", "满足预开通条件");
            return Boolean.TRUE;
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        b.set(false);
        StringBuffer stringBuffer = f4283a;
        if (stringBuffer.length() > 0) {
            stringBuffer.setLength(0);
        }
        c = "";
        e = "";
        d = "";
        VerifyLogCat.d("Verifyidentity", "预开通结束 重置标记信息 resetPreOpenBio done ");
    }
}
