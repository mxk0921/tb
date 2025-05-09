package com.xiaomi.push.service;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.bh;
import com.xiaomi.push.j;
import com.xiaomi.push.r;
import com.xiaomi.push.s;
import com.xiaomi.push.service.ax;
import java.util.ArrayList;
import java.util.List;
import tb.u8k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class f {

    /* renamed from: a  reason: collision with other field name */
    private static final int[] f1632a = {1, 2, 4, 8, 16};

    /* renamed from: a  reason: collision with root package name */
    private static final SparseArray<ax.a<String, String, String>> f15114a = new g(5);
    private static final SparseArray<Integer> b = new h(5);

    public static int a(String str, String str2) {
        int i = 8;
        if (!m1073a(str, str2, 8)) {
            i = 0;
        }
        if (m1073a(str, str2, 16)) {
            i |= 16;
        }
        if (m1073a(str, str2, 1)) {
            i |= 1;
        }
        if (m1073a(str, str2, 2)) {
            i |= 2;
        }
        return m1073a(str, str2, 4) ? i | 4 : i;
    }

    public static int a(String str, String str2, int i) {
        return ax.a(r.m963a(), str, str2, f15114a.get(i));
    }

    private static SharedPreferences a(Context context) {
        return context.getSharedPreferences("ch_permission_cache_file", 0);
    }

    public static void a(Context context, String str) {
        List<NotificationChannel> a2;
        if (!(!j.m869a(context) || TextUtils.isEmpty(str) || (a2 = aw.a(context, str).m1038a()) == null)) {
            synchronized (f.class) {
                try {
                    SharedPreferences a3 = a(context);
                    ArrayList arrayList = new ArrayList();
                    for (NotificationChannel notificationChannel : a2) {
                        String str2 = (String) bh.a(u8k.a(notificationChannel), "mId");
                        if (!TextUtils.isEmpty(str2) && a3.contains(str2)) {
                            arrayList.add(str2);
                        }
                    }
                    if (arrayList.size() > 0) {
                        a(a3, arrayList);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void a(Context context, String str, String str2, int i, String str3, boolean z, int i2) {
        if (j.m869a(context) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            int a2 = s.a(str3, 0);
            boolean a3 = a(i, a2);
            if (z) {
                a(str, str2, a2, i2);
                if (a3) {
                    synchronized (f.class) {
                        a(a(context), a2, str2);
                    }
                    return;
                }
                return;
            }
            synchronized (f.class) {
                try {
                    SharedPreferences a4 = a(context);
                    if (!a3) {
                        if (a4.contains(str2)) {
                        }
                    }
                    a(a4, a2, str, str2, i2);
                    if (a3) {
                        a(a4, a2, str2);
                    } else {
                        a(a4, str2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (j.m869a(context)) {
            b.m410a("ChannelPC: can`t setup permission with permissionCode:" + String.valueOf(str3) + " channelId:" + String.valueOf(str2) + " targetPkg:" + str);
        }
    }

    private static void a(SharedPreferences sharedPreferences, int i, String str) {
        sharedPreferences.edit().putInt(str, i).commit();
    }

    private static void a(SharedPreferences sharedPreferences, int i, String str, String str2, int i2) {
        if (sharedPreferences.getInt(str2, 0) != i) {
            a(str, str2, i, i2);
        }
    }

    private static void a(SharedPreferences sharedPreferences, String str) {
        a(sharedPreferences, new i(str));
    }

    private static void a(SharedPreferences sharedPreferences, List<String> list) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String str : list) {
            edit.remove(str);
        }
        edit.commit();
    }

    public static void a(String str, String str2, int i, int i2) {
        int[] iArr;
        for (int i3 : f1632a) {
            if ((b.get(i3).intValue() & i2) == 0) {
                a(str, str2, i3, (i & i3) > 0);
            } else {
                b.m410a("ChannelPermissions.grantPermission:" + str + ":" + str2 + ": <" + i3 + "> :stoped by userLock");
            }
        }
    }

    private static void a(String str, String str2, int i, boolean z) {
        boolean a2 = ax.a(r.m963a(), str, str2, f15114a.get(i), z);
        b.m410a("ChannelPermissions.grantPermission:" + str + ":" + str2 + ": <" + i + "=" + z + "> :" + a2);
    }

    private static boolean a(int i, int i2) {
        return i >= 4 || (i2 & 2) > 0 || (i2 & 1) > 0 || (i2 & 8) > 0 || (i2 & 16) > 0;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m1073a(String str, String str2, int i) {
        boolean z = true;
        if (ax.a(r.m963a(), str, str2, f15114a.get(i)) != 1) {
            z = false;
        }
        b.m410a("ChannelPermissions.checkPermission:" + str + ":" + str2 + ": <" + i + "=" + z + ">");
        return z;
    }
}
