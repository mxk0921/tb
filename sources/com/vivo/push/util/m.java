package com.vivo.push.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class m implements BaseNotifyLayoutAdapter {

    /* renamed from: a  reason: collision with root package name */
    private Resources f14668a;
    private String b;

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getNotificationLayout() {
        return this.f14668a.getIdentifier("push_notify", "layout", this.b);
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getSuitIconId() {
        Resources resources;
        String str;
        if (n.d) {
            resources = this.f14668a;
            str = "notify_icon_rom30";
        } else if (n.c) {
            resources = this.f14668a;
            str = "notify_icon_rom20";
        } else {
            resources = this.f14668a;
            str = "notify_icon";
        }
        return resources.getIdentifier(str, "id", this.b);
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getTitleColor() {
        int i;
        try {
            i = ((Integer) ag.a("com.android.internal.R$color", "vivo_notification_title_text_color")).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        if (i > 0) {
            return this.f14668a.getColor(i);
        }
        boolean z = n.d;
        if (z) {
            return -1;
        }
        if (!n.c) {
            return -16777216;
        }
        if (z) {
            return Color.parseColor("#ff999999");
        }
        return -1;
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final void init(Context context) {
        this.b = context.getPackageName();
        this.f14668a = context.getResources();
    }
}
