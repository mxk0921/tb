package me.leolin.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import tb.po1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class SonyHomeBadger implements po1 {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f15404a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");
    public AsyncQueryHandler b;

    public static void d(Context context, ComponentName componentName, int i) {
        boolean z;
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z);
        context.sendBroadcast(intent);
    }

    public static boolean h(Context context) {
        if (context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null) {
            return true;
        }
        return false;
    }

    @Override // tb.po1
    public List<String> a() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }

    @Override // tb.po1
    public void b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (h(context)) {
            e(context, componentName, i);
        } else {
            d(context, componentName, i);
        }
    }

    public final ContentValues c(int i, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i));
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        return contentValues;
    }

    public final void e(Context context, ComponentName componentName, int i) {
        if (i >= 0) {
            ContentValues c = c(i, componentName);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.b == null) {
                    this.b = new AsyncQueryHandler(this, context.getApplicationContext().getContentResolver()) { // from class: me.leolin.shortcutbadger.impl.SonyHomeBadger.1
                    };
                }
                f(c);
                return;
            }
            g(context, c);
        }
    }

    public final void f(ContentValues contentValues) {
        this.b.startInsert(0, null, this.f15404a, contentValues);
    }

    public final void g(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(this.f15404a, contentValues);
    }
}
