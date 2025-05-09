package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wby {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f30598a;

    public wby(Context context, String str) {
        Context createDeviceProtectedStorageContext;
        boolean moveSharedPreferencesFrom;
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("move_to_de_records", 0);
                if (!sharedPreferences.getBoolean(str, false)) {
                    moveSharedPreferencesFrom = createDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, str);
                    if (moveSharedPreferencesFrom) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putBoolean(str, true);
                        edit.apply();
                    }
                }
                context = createDeviceProtectedStorageContext;
            }
            this.f30598a = context.getSharedPreferences(str, 0);
            return;
        }
        throw new NullPointerException("context is null!");
    }

    public boolean a(String str) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.f30598a;
        if (sharedPreferences == null || !sharedPreferences.contains(str) || (edit = sharedPreferences.edit()) == null) {
            return false;
        }
        return edit.remove(str).commit();
    }

    public boolean b(String str, String str2) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.f30598a;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return false;
        }
        return edit.putString(str, str2).commit();
    }
}
