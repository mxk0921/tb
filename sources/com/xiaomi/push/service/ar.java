package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import com.xiaomi.push.ff;
import com.xiaomi.push.iy;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class ar {
    public abstract ff a(Context context, int i, String str, Map<String, String> map);

    public abstract void a(iy iyVar, Map<String, String> map, int i, Notification notification);

    public abstract void a(String str);

    /* renamed from: a  reason: collision with other method in class */
    public abstract boolean m1025a(Context context, int i, String str, Map<String, String> map);

    public abstract boolean a(Map<String, String> map, int i, Notification notification);
}
