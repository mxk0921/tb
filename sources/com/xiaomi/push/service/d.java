package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import com.xiaomi.push.j;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static List<a> f15112a = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f15113a;

        /* renamed from: a  reason: collision with other field name */
        public final long f1629a;

        /* renamed from: a  reason: collision with other field name */
        public final String f1630a;

        /* renamed from: a  reason: collision with other field name */
        public final Notification.Action[] f1631a;

        public a(String str, long j, int i, Notification.Action[] actionArr) {
            this.f1630a = str;
            this.f1629a = j;
            this.f15113a = i;
            this.f1631a = actionArr;
        }
    }

    private static void a() {
        for (int size = f15112a.size() - 1; size >= 0; size--) {
            a aVar = f15112a.get(size);
            if (SystemClock.elapsedRealtime() - aVar.f1629a > 5000) {
                f15112a.remove(aVar);
            }
        }
        if (f15112a.size() > 10) {
            f15112a.remove(0);
        }
    }

    public static void a(Context context, StatusBarNotification statusBarNotification, int i) {
        if (j.m869a(context) && i > 0 && statusBarNotification != null) {
            a(new a(statusBarNotification.getKey(), SystemClock.elapsedRealtime(), i, ax.m1043a(statusBarNotification.getNotification())));
        }
    }

    private static void a(a aVar) {
        f15112a.add(aVar);
        a();
    }
}
