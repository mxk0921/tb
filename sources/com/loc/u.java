package com.loc;

import com.loc.t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final t.c f5760a;
    public final String b;

    /* compiled from: Taobao */
    /* renamed from: com.loc.u$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5761a;

        static {
            int[] iArr = new int[t.c.values().length];
            f5761a = iArr;
            try {
                iArr[t.c.ShowUnknowCode.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5761a[t.c.ShowNoShowCode.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5761a[t.c.InfoUnknowCode.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5761a[t.c.InfoNotContainCode.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5761a[t.c.AgreeUnknowCode.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5761a[t.c.AgreeNotAgreeCode.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5761a[t.c.InvaildUserKeyCode.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5761a[t.c.IllegalArgument.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5761a[t.c.SuccessCode.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public u(t.c cVar, w wVar) {
        String str;
        StringBuilder sb;
        String str2;
        this.f5760a = cVar;
        switch (AnonymousClass1.f5761a[cVar.ordinal()]) {
            case 1:
                String a2 = wVar.a();
                sb = new StringBuilder("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用");
                sb.append(a2);
                str2 = " SDK 功能前请设置隐私权政策是否弹窗告知用户";
                sb.append(str2);
                str = sb.toString();
                break;
            case 2:
                String a3 = wVar.a();
                sb = new StringBuilder("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用");
                sb.append(a3);
                str2 = " SDK 功能前请确保隐私权政策已弹窗告知用户";
                sb.append(str2);
                str = sb.toString();
                break;
            case 3:
                String a4 = wVar.a();
                sb = new StringBuilder("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用");
                sb.append(a4);
                str2 = " SDK 功能前请确保设置隐私权政策是否包含高德开平隐私权政策";
                sb.append(str2);
                str = sb.toString();
                break;
            case 4:
                String a5 = wVar.a();
                sb = new StringBuilder("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用");
                sb.append(a5);
                str2 = " SDK 功能前请确保隐私权政策已经包含高德开平隐私权政策";
                sb.append(str2);
                str = sb.toString();
                break;
            case 5:
                String a6 = wVar.a();
                sb = new StringBuilder("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用");
                sb.append(a6);
                str2 = " SDK 功能前请确保设置隐私权政策是否取得用户同意";
                sb.append(str2);
                str = sb.toString();
                break;
            case 6:
                String a7 = wVar.a();
                sb = new StringBuilder("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用");
                sb.append(a7);
                str2 = " SDK 功能前请确保隐私权政策已取得用户同意";
                sb.append(str2);
                str = sb.toString();
                break;
            case 7:
                String a8 = wVar.a();
                sb = new StringBuilder("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用");
                sb.append(a8);
                str2 = " SDK 功能使用前请确保已经正确设置apiKey，如有疑问请在高德开放平台官网中搜索【INVALID_USER_KEY】相关内容进行解决。";
                sb.append(str2);
                str = sb.toString();
                break;
            case 8:
                str = "***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n参数非法，context 或 sdkInfo为空";
                break;
            case 9:
                str = "设置隐私政策成功";
                break;
            default:
                str = "";
                break;
        }
        this.b = str;
    }
}
