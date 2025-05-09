package com.meizu.cloud.pushsdk.e.d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f5817a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f5818a = new ArrayList(20);

        public b a(String str, String str2) {
            c(str, str2);
            return b(str, str2);
        }

        public b b(String str, String str2) {
            this.f5818a.add(str);
            this.f5818a.add(str2.trim());
            return this;
        }

        public c a() {
            return new c(this);
        }

        private void c(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            } else if (!str.isEmpty()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= 31 || charAt >= 127) {
                        throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char charAt2 = str2.charAt(i2);
                        if (charAt2 <= 31 || charAt2 >= 127) {
                            throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt2), Integer.valueOf(i2), str, str2));
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("value == null");
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }
    }

    private c(b bVar) {
        this.f5817a = (String[]) bVar.f5818a.toArray(new String[bVar.f5818a.size()]);
    }

    public static c a(String... strArr) {
        if (strArr == null || strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        for (int i = 0; i < strArr2.length; i++) {
            String str = strArr2[i];
            if (str != null) {
                strArr2[i] = str.trim();
            } else {
                throw new IllegalArgumentException("Headers cannot be null");
            }
        }
        for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
            String str2 = strArr2[i2];
            String str3 = strArr2[i2 + 1];
            if (str2.length() == 0 || str2.indexOf(0) != -1 || str3.indexOf(0) != -1) {
                throw new IllegalArgumentException("Unexpected header: " + str2 + ": " + str3);
            }
        }
        return new c(strArr2);
    }

    public b b() {
        b bVar = new b();
        Collections.addAll(bVar.f5818a, this.f5817a);
        return bVar;
    }

    public int c() {
        return this.f5817a.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int c = c();
        for (int i = 0; i < c; i++) {
            sb.append(a(i));
            sb.append(": ");
            sb.append(b(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    public String a(int i) {
        return this.f5817a[i * 2];
    }

    public String b(int i) {
        return this.f5817a[(i * 2) + 1];
    }

    private c(String[] strArr) {
        this.f5817a = strArr;
    }

    public String a(String str) {
        return a(this.f5817a, str);
    }

    private static String a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public Set<String> a() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int c = c();
        for (int i = 0; i < c; i++) {
            treeSet.add(a(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }
}
