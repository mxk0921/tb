package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import tb.cw3;
import tb.po1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class SamsungHomeBadger implements po1 {
    public static final String[] b = {"_id", "class"};

    /* renamed from: a  reason: collision with root package name */
    public final DefaultBadger f15403a = new DefaultBadger();

    @Override // tb.po1
    public List<String> a() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    @Override // tb.po1
    public void b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        DefaultBadger defaultBadger = this.f15403a;
        if (defaultBadger == null || !defaultBadger.c(context)) {
            Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
            ContentResolver contentResolver = context.getContentResolver();
            Cursor cursor = null;
            try {
                cursor = contentResolver.query(parse, b, "package=?", new String[]{componentName.getPackageName()}, null);
                if (cursor != null) {
                    String className = componentName.getClassName();
                    boolean z = false;
                    while (cursor.moveToNext()) {
                        contentResolver.update(parse, c(componentName, i, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                        if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                            z = true;
                        }
                    }
                    if (!z) {
                        contentResolver.insert(parse, c(componentName, i, true));
                    }
                }
                cw3.a(cursor);
            } catch (Throwable th) {
                cw3.a(cursor);
                throw th;
            }
        } else {
            defaultBadger.b(context, componentName, i);
        }
    }

    public final ContentValues c(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }
}
