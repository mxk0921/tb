package com.xiaomi.push;

import android.os.Looper;
import android.text.TextUtils;
import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class s {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f15007a;

        /* renamed from: a  reason: collision with other field name */
        private final StringBuilder f1488a;
        private final String b;

        public a() {
            this(":", ",");
        }

        public a a(String str, Object obj) {
            if (!TextUtils.isEmpty(str)) {
                if (this.f1488a.length() > 0) {
                    this.f1488a.append(this.b);
                }
                StringBuilder sb = this.f1488a;
                sb.append(str);
                sb.append(this.f15007a);
                sb.append(obj);
            }
            return this;
        }

        public String toString() {
            return this.f1488a.toString();
        }

        public a(String str, String str2) {
            this.f1488a = new StringBuilder();
            this.f15007a = str;
            this.b = str2;
        }
    }

    public static int a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static int b(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            return ((str.hashCode() / 10) * 10) + i;
        }
        return i;
    }

    public static long a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return j;
        }
    }

    public static boolean a() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static boolean a(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }
}
