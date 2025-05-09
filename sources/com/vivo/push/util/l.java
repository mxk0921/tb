package com.vivo.push.util;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;
import tb.zk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class l implements BaseNotifyDataAdapter {
    private static int e;
    private static int f;

    /* renamed from: a  reason: collision with root package name */
    private Resources f14667a;
    private String b;
    private String c;
    private String d;

    private static boolean a(int i) {
        return (i == -1 || i == 0) ? false : true;
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getDefaultNotifyIcon() {
        if (a(e)) {
            return e;
        }
        String str = this.d;
        int a2 = !a(str) ? -1 : a(str, "_notifyicon");
        e = a2;
        if (a(a2)) {
            return e;
        }
        for (String str2 = this.c; !TextUtils.isEmpty(str2); str2 = str2.substring(0, str2.length() - 1)) {
            Resources resources = this.f14667a;
            int identifier = resources.getIdentifier("vivo_push_rom" + str2 + "_notifyicon", zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, this.b);
            if (identifier > 0) {
                return identifier;
            }
        }
        return this.f14667a.getIdentifier("vivo_push_notifyicon", zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, this.b);
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getDefaultSmallIconId() {
        if (a(f)) {
            return f;
        }
        String str = this.d;
        int a2 = !a(str) ? -1 : a(str, "_icon");
        f = a2;
        if (a(a2)) {
            return f;
        }
        for (String str2 = this.c; !TextUtils.isEmpty(str2); str2 = str2.substring(0, str2.length() - 1)) {
            Resources resources = this.f14667a;
            int identifier = resources.getIdentifier("vivo_push_rom" + str2 + "_icon", zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, this.b);
            if (identifier > 0) {
                return identifier;
            }
        }
        return this.f14667a.getIdentifier("vivo_push_icon", zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, this.b);
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getNotifyMode(InsideNotificationItem insideNotificationItem) {
        return 2;
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final void init(Context context) {
        this.b = context.getPackageName();
        this.f14667a = context.getResources();
        this.c = n.a();
        this.d = Build.VERSION.RELEASE;
    }

    private static boolean a(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        u.d("DefaultNotifyDataAdapter", "systemVersion is not suit ");
        return false;
    }

    private int a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String[] split = str.split("\\.");
            if (split != null && split.length > 0) {
                str = split[0];
            }
            try {
                for (int parseInt = Integer.parseInt(str); parseInt > 0; parseInt--) {
                    String str3 = "vivo_push_ard" + parseInt + str2;
                    u.c("DefaultNotifyDataAdapter", "get notify icon : ".concat(String.valueOf(str3)));
                    int identifier = this.f14667a.getIdentifier(str3, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, this.b);
                    if (identifier > 0) {
                        u.c("DefaultNotifyDataAdapter", "find notify icon : ".concat(String.valueOf(str3)));
                        return identifier;
                    }
                }
            } catch (Exception e2) {
                u.a("DefaultNotifyDataAdapter", e2);
            }
        }
        return -1;
    }
}
