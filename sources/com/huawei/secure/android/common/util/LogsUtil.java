package com.huawei.secure.android.common.util;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class LogsUtil {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f5534a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends Throwable {
        private static final long d = 7129050843360571879L;

        /* renamed from: a  reason: collision with root package name */
        private String f5535a;
        private Throwable b;
        private Throwable c;

        public a(Throwable th) {
            this.c = th;
        }

        public void a(Throwable th) {
            this.b = th;
        }

        @Override // java.lang.Throwable
        public synchronized Throwable getCause() {
            Throwable th;
            th = this.b;
            if (th == this) {
                th = null;
            }
            return th;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f5535a;
        }

        @Override // java.lang.Throwable
        public String toString() {
            Throwable th = this.c;
            if (th == null) {
                return "";
            }
            String name = th.getClass().getName();
            if (this.f5535a == null) {
                return name;
            }
            String concat = name.concat(": ");
            if (this.f5535a.startsWith(concat)) {
                return this.f5535a;
            }
            return concat + this.f5535a;
        }

        public void a(String str) {
            this.f5535a = str;
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 1;
        if (1 == length) {
            return String.valueOf('*');
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (f5534a.matcher(String.valueOf(charAt)).matches()) {
                if (i % 2 == 0) {
                    charAt = '*';
                }
                i++;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(a(str2));
        }
        return sb.toString();
    }

    public static String c(String str, boolean z) {
        StringBuilder sb = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                sb.append(a(str));
            } else {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static void d(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            Log.e(str, c(str2, false));
        }
    }

    public static void e(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            Log.e(str, b(str2, str3));
        }
    }

    public static void f(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            c(str2, false);
        }
    }
}
