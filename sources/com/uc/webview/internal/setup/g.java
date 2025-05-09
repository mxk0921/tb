package com.uc.webview.internal.setup;

import android.text.TextUtils;
import com.uc.webview.export.extension.ICoreVersion;
import com.uc.webview.internal.setup.component.y;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f14465a = {"未知", "小核", "大核", "旧小核", "旧大核"};

    public static int a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int b = y.b(str, str2);
        if (b == 0) {
            return 0;
        }
        if (b > 0) {
            return 1;
        }
        return str.endsWith(".0") ? 2 : 3;
    }

    public static String a(int i) {
        return f14465a[i + 1];
    }

    public static int a(ICoreVersion iCoreVersion) {
        return a(iCoreVersion == null ? null : iCoreVersion.version(), "5.18.6.0");
    }
}
