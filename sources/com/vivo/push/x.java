package com.vivo.push;

import android.net.Uri;
import tb.vox;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f14676a = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/config");
    public static final Uri b = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/permission");
    public static final Uri c = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/clientState");
    public static final Uri d = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/debugInfo");
    public static final Uri e = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/agreePrivacyStatement");
    public static final Uri f = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/queryAppState");

    public static String a(int i) {
        switch (i) {
            case 2002:
                return "method_alias_bind";
            case 2003:
                return "method_alias_unbind";
            case 2004:
                return "method_tag_bind";
            case 2005:
                return "method_tag_unbind";
            case 2006:
                return "method_sdk_bind";
            case 2007:
                return "method_sdk_unbind";
            case vox.CLASS_2008 /* 2008 */:
                return "method_stop";
            default:
                return null;
        }
    }
}
