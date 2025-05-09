package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import tb.po1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ZukHomeBadger implements po1 {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f15406a = Uri.parse("content://com.android.badge/badge");

    @Override // tb.po1
    public List<String> a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // tb.po1
    public void b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(this.f15406a, "setAppBadgeCount", (String) null, bundle);
    }
}
