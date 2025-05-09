package com.meizu.cloud.pushsdk.e.d;

import anet.channel.util.HttpConstant;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import tb.f7l;
import tb.ohh;
import tb.uyv;
import tb.wh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f5820a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F'};
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final List<String> g;
    private final List<String> h;
    private final String i;
    private final String j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        String f5821a;
        String d;
        final List<String> f;
        List<String> g;
        String h;
        String b = "";
        String c = "";
        int e = -1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public enum a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public b() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        private static int c(String str, int i, int i2) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(f.b(str, i, i2, "", false, false, false, true));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        private static int d(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i < i2) {
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0029 -> B:9:0x001d). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void e(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001f
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001f
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
            L_0x001d:
                r6 = r12
                goto L_0x002c
            L_0x001f:
                java.util.List<java.lang.String> r0 = r10.f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f
                r0.add(r2)
            L_0x0029:
                int r12 = r12 + 1
                goto L_0x001d
            L_0x002c:
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = com.meizu.cloud.pushsdk.e.d.m.a(r11, r6, r13, r12)
                if (r12 >= r13) goto L_0x0038
                r0 = 1
                goto L_0x0039
            L_0x0038:
                r0 = 0
            L_0x0039:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.a(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x001d
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.e.d.f.b.e(java.lang.String, int, int):void");
        }

        private static int f(String str, int i, int i2) {
            boolean z;
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            boolean z2 = false;
            if (charAt < 'a' || charAt > 'z') {
                z = true;
            } else {
                z = false;
            }
            if (charAt < 'A' || charAt > 'Z') {
                z2 = true;
            }
            if (z && z2) {
                return -1;
            }
            while (true) {
                i++;
                if (i >= i2) {
                    break;
                }
                char charAt2 = str.charAt(i);
                if (charAt2 < 'a' || charAt2 > 'z') {
                    if (charAt2 < 'A' || charAt2 > 'Z') {
                        if (charAt2 < '0' || charAt2 > '9') {
                            if (!(charAt2 == '+' || charAt2 == '-' || charAt2 == '.')) {
                                if (charAt2 == ':') {
                                    return i;
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int g(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        public a a(f fVar, String str) {
            int a2;
            int i;
            int a3 = m.a(str, 0, str.length());
            int b = m.b(str, a3, str.length());
            if (f(str, a3, b) != -1) {
                if (str.regionMatches(true, a3, uyv.HTTPS_SCHEMA, 0, 6)) {
                    this.f5821a = "https";
                    a3 += 6;
                } else if (!str.regionMatches(true, a3, "http:", 0, 5)) {
                    return a.UNSUPPORTED_SCHEME;
                } else {
                    this.f5821a = "http";
                    a3 += 5;
                }
            } else if (fVar == null) {
                return a.MISSING_SCHEME;
            } else {
                this.f5821a = fVar.b;
            }
            int g = g(str, a3, b);
            char c = f7l.CONDITION_IF;
            char c2 = '#';
            if (g >= 2 || fVar == null || !fVar.b.equals(this.f5821a)) {
                int i2 = a3 + g;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    a2 = m.a(str, i2, b, "@/\\?#");
                    char charAt = a2 != b ? str.charAt(a2) : (char) 65535;
                    if (charAt == 65535 || charAt == c2 || charAt == '/' || charAt == '\\' || charAt == c) {
                        break;
                    } else if (charAt == '@') {
                        if (!z) {
                            int a4 = m.a(str, i2, a2, (char) f7l.CONDITION_IF_MIDDLE);
                            i = a2;
                            String b2 = f.b(str, i2, a4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                            if (z2) {
                                b2 = this.b + "%40" + b2;
                            }
                            this.b = b2;
                            if (a4 != i) {
                                this.c = f.b(str, a4 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                z = true;
                            }
                            z2 = true;
                        } else {
                            i = a2;
                            this.c += "%40" + f.b(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                        }
                        i2 = i + 1;
                        c = f7l.CONDITION_IF;
                        c2 = '#';
                    }
                }
                int d = d(str, i2, a2);
                int i3 = d + 1;
                this.d = a(str, i2, d);
                if (i3 < a2) {
                    int c3 = c(str, i3, a2);
                    this.e = c3;
                    if (c3 == -1) {
                        return a.INVALID_PORT;
                    }
                } else {
                    this.e = f.a(this.f5821a);
                }
                if (this.d == null) {
                    return a.INVALID_HOST;
                }
                a3 = a2;
            } else {
                this.b = fVar.e();
                this.c = fVar.b();
                this.d = fVar.e;
                this.e = fVar.f;
                this.f.clear();
                this.f.addAll(fVar.c());
                if (a3 == b || str.charAt(a3) == '#') {
                    a(fVar.d());
                }
            }
            int a5 = m.a(str, a3, b, "?#");
            e(str, a3, a5);
            if (a5 < b && str.charAt(a5) == '?') {
                int a6 = m.a(str, a5, b, '#');
                this.g = f.c(f.b(str, a5 + 1, a6, " \"'<>#", true, false, true, true));
                a5 = a6;
            }
            if (a5 < b && str.charAt(a5) == '#') {
                this.h = f.b(str, 1 + a5, b, "", true, false, false, false);
            }
            return a.SUCCESS;
        }

        public int b() {
            int i = this.e;
            return i != -1 ? i : f.a(this.f5821a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f5821a);
            sb.append(HttpConstant.SCHEME_SPLIT);
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.b);
                if (!this.c.isEmpty()) {
                    sb.append(f7l.CONDITION_IF_MIDDLE);
                    sb.append(this.c);
                }
                sb.append('@');
            }
            if (this.d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
            int b = b();
            if (b != f.a(this.f5821a)) {
                sb.append(f7l.CONDITION_IF_MIDDLE);
                sb.append(b);
            }
            f.b(sb, this.f);
            if (this.g != null) {
                sb.append(f7l.CONDITION_IF);
                f.a(sb, this.g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
            return null;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.net.InetAddress b(java.lang.String r12, int r13, int r14) {
            /*
                r0 = 16
                byte[] r1 = new byte[r0]
                r2 = 0
                r3 = -1
                r4 = 0
                r5 = -1
                r6 = -1
            L_0x0009:
                r7 = 0
                if (r13 >= r14) goto L_0x0079
                if (r4 != r0) goto L_0x000f
                return r7
            L_0x000f:
                int r8 = r13 + 2
                r9 = 2
                if (r8 > r14) goto L_0x0027
                java.lang.String r10 = "::"
                boolean r10 = r12.regionMatches(r13, r10, r2, r9)
                if (r10 == 0) goto L_0x0027
                if (r5 == r3) goto L_0x001f
                return r7
            L_0x001f:
                int r4 = r4 + 2
                r5 = r4
                if (r8 != r14) goto L_0x0025
                goto L_0x0079
            L_0x0025:
                r6 = r8
                goto L_0x004b
            L_0x0027:
                if (r4 == 0) goto L_0x0034
                java.lang.String r8 = ":"
                r10 = 1
                boolean r8 = r12.regionMatches(r13, r8, r2, r10)
                if (r8 == 0) goto L_0x0036
                int r13 = r13 + 1
            L_0x0034:
                r6 = r13
                goto L_0x004b
            L_0x0036:
                java.lang.String r8 = "."
                boolean r13 = r12.regionMatches(r13, r8, r2, r10)
                if (r13 == 0) goto L_0x004a
                int r13 = r4 + (-2)
                boolean r12 = a(r12, r6, r14, r1, r13)
                if (r12 != 0) goto L_0x0047
                return r7
            L_0x0047:
                int r4 = r4 + 2
                goto L_0x0079
            L_0x004a:
                return r7
            L_0x004b:
                r13 = r6
                r8 = 0
            L_0x004d:
                if (r13 >= r14) goto L_0x0060
                char r10 = r12.charAt(r13)
                int r10 = com.meizu.cloud.pushsdk.e.d.f.a(r10)
                if (r10 != r3) goto L_0x005a
                goto L_0x0060
            L_0x005a:
                int r8 = r8 << 4
                int r8 = r8 + r10
                int r13 = r13 + 1
                goto L_0x004d
            L_0x0060:
                int r10 = r13 - r6
                if (r10 == 0) goto L_0x0078
                r11 = 4
                if (r10 <= r11) goto L_0x0068
                goto L_0x0078
            L_0x0068:
                int r7 = r4 + 1
                int r10 = r8 >>> 8
                r10 = r10 & 255(0xff, float:3.57E-43)
                byte r10 = (byte) r10
                r1[r4] = r10
                int r4 = r4 + r9
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte r8 = (byte) r8
                r1[r7] = r8
                goto L_0x0009
            L_0x0078:
                return r7
            L_0x0079:
                if (r4 == r0) goto L_0x008a
                if (r5 != r3) goto L_0x007e
                return r7
            L_0x007e:
                int r12 = r4 - r5
                int r13 = 16 - r12
                java.lang.System.arraycopy(r1, r5, r1, r13, r12)
                int r0 = r0 - r4
                int r0 = r0 + r5
                java.util.Arrays.fill(r1, r5, r0, r2)
            L_0x008a:
                java.net.InetAddress r12 = java.net.InetAddress.getByAddress(r1)     // Catch: UnknownHostException -> 0x008f
                return r12
            L_0x008f:
                java.lang.AssertionError r12 = new java.lang.AssertionError
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.e.d.f.b.b(java.lang.String, int, int):java.net.InetAddress");
        }

        private void c() {
            List<String> list = this.f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f.isEmpty()) {
                this.f.add("");
                return;
            }
            List<String> list2 = this.f;
            list2.set(list2.size() - 1, "");
        }

        public b a(String str) {
            this.g = str != null ? f.c(f.a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        private boolean b(String str) {
            return ".".equals(str) || "%2e".equalsIgnoreCase(str);
        }

        private boolean c(String str) {
            return "..".equals(str) || "%2e.".equalsIgnoreCase(str) || ".%2e".equalsIgnoreCase(str) || "%2e%2e".equalsIgnoreCase(str);
        }

        public b a(String str, String str2) {
            if (str != null) {
                if (this.g == null) {
                    this.g = new ArrayList();
                }
                this.g.add(f.a(str, " \"'<>#&=", false, false, true, true));
                this.g.add(str2 != null ? f.a(str2, " \"'<>#&=", false, false, true, true) : null);
                return this;
            }
            throw new IllegalArgumentException("name == null");
        }

        public f a() {
            if (this.f5821a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.d != null) {
                return new f(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        private static String a(String str, int i, int i2) {
            String b = f.b(str, i, i2, false);
            if (!b.contains(":")) {
                return m.b(b);
            }
            InetAddress b2 = (!b.startsWith("[") || !b.endsWith("]")) ? b(b, 0, b.length()) : b(b, 1, b.length() - 1);
            if (b2 == null) {
                return null;
            }
            byte[] address = b2.getAddress();
            if (address.length == 16) {
                return a(address);
            }
            throw new AssertionError();
        }

        private static String a(byte[] bArr) {
            int i = -1;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i3 < bArr.length) {
                int i5 = i3;
                while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                    i5 += 2;
                }
                int i6 = i5 - i3;
                if (i6 > i4) {
                    i = i3;
                    i4 = i6;
                }
                i3 = i5 + 2;
            }
            com.meizu.cloud.pushsdk.e.h.b bVar = new com.meizu.cloud.pushsdk.e.h.b();
            while (i2 < bArr.length) {
                if (i2 == i) {
                    bVar.b(58);
                    i2 += i4;
                    if (i2 == 16) {
                        bVar.b(58);
                    }
                } else {
                    if (i2 > 0) {
                        bVar.b(58);
                    }
                    bVar.e(((bArr[i2] & 255) << 8) | (bArr[i2 + 1] & 255));
                    i2 += 2;
                }
            }
            return bVar.a();
        }

        private void a(String str, int i, int i2, boolean z, boolean z2) {
            String b = f.b(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true);
            if (!b(b)) {
                if (c(b)) {
                    c();
                    return;
                }
                List<String> list = this.f;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f;
                    list2.set(list2.size() - 1, b);
                } else {
                    this.f.add(b);
                }
                if (z) {
                    this.f.add("");
                }
            }
        }

        private static boolean a(String str, int i, int i2, byte[] bArr, int i3) {
            int i4 = i3;
            while (i < i2) {
                if (i4 == bArr.length) {
                    return false;
                }
                if (i4 != i3) {
                    if (str.charAt(i) != '.') {
                        return false;
                    }
                    i++;
                }
                int i5 = i;
                int i6 = 0;
                while (i5 < i2) {
                    char charAt = str.charAt(i5);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                        return false;
                    } else {
                        i5++;
                    }
                }
                if (i5 - i == 0) {
                    return false;
                }
                i4++;
                bArr[i4] = (byte) i6;
                i = i5;
            }
            return i4 == i3 + 4;
        }
    }

    private f(b bVar) {
        this.b = bVar.f5821a;
        this.c = a(bVar.b, false);
        this.d = a(bVar.c, false);
        this.e = bVar.d;
        this.f = bVar.b();
        this.g = a(bVar.f, false);
        List<String> list = bVar.g;
        String str = null;
        this.h = list != null ? a(list, true) : null;
        String str2 = bVar.h;
        this.i = str2 != null ? a(str2, false) : str;
        this.j = bVar.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public String d() {
        if (this.h == null) {
            return null;
        }
        int indexOf = this.j.indexOf(63);
        int i = indexOf + 1;
        String str = this.j;
        return this.j.substring(i, m.a(str, indexOf + 2, str.length(), '#'));
    }

    public String e() {
        if (this.c.isEmpty()) {
            return "";
        }
        int length = this.b.length() + 3;
        String str = this.j;
        return this.j.substring(length, m.a(str, length, str.length(), ":@"));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f) || !((f) obj).j.equals(this.j)) {
            return false;
        }
        return true;
    }

    public b f() {
        int i;
        b bVar = new b();
        bVar.f5821a = this.b;
        bVar.b = e();
        bVar.c = b();
        bVar.d = this.e;
        if (this.f != a(this.b)) {
            i = this.f;
        } else {
            i = -1;
        }
        bVar.e = i;
        bVar.f.clear();
        bVar.f.addAll(c());
        bVar.a(d());
        bVar.h = a();
        return bVar;
    }

    public int hashCode() {
        return this.j.hashCode();
    }

    public String toString() {
        return this.j;
    }

    public static int a(String str) {
        if ("http".equals(str)) {
            return 80;
        }
        return "https".equals(str) ? 443 : -1;
    }

    public static f b(String str) {
        b bVar = new b();
        if (bVar.a((f) null, str) == b.a.SUCCESS) {
            return bVar.a();
        }
        return null;
    }

    public List<String> c() {
        int indexOf = this.j.indexOf(47, this.b.length() + 3);
        String str = this.j;
        int a2 = m.a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a2) {
            int i = indexOf + 1;
            int a3 = m.a(this.j, i, a2, (char) wh6.DIR);
            arrayList.add(this.j.substring(i, a3));
            indexOf = a3;
        }
        return arrayList;
    }

    public static List<String> c(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i = indexOf + 1;
        }
        return arrayList;
    }

    public String a() {
        if (this.i == null) {
            return null;
        }
        return this.j.substring(this.j.indexOf(35) + 1);
    }

    public String b() {
        if (this.d.isEmpty()) {
            return "";
        }
        int indexOf = this.j.indexOf(64);
        return this.j.substring(this.j.indexOf(58, this.b.length() + 3) + 1, indexOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (a(codePointAt, i3, str, i2, str2, z, z2, z3, z4)) {
                com.meizu.cloud.pushsdk.e.h.b bVar = new com.meizu.cloud.pushsdk.e.h.b();
                bVar.a(str, i, i3);
                a(bVar, str, i3, i2, str2, z, z2, z3, z4);
                return bVar.a();
            }
            i3 += Character.charCount(codePointAt);
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            boolean z2 = false;
            boolean z3 = charAt == '%';
            if (charAt == '+' && z) {
                z2 = true;
            }
            if (z3 || z2) {
                com.meizu.cloud.pushsdk.e.h.b bVar = new com.meizu.cloud.pushsdk.e.h.b();
                bVar.a(str, i, i3);
                a(bVar, str, i3, i2, z);
                return bVar.a();
            }
        }
        return str.substring(i, i2);
    }

    public static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return b(str, 0, str.length(), str2, z, z2, z3, z4);
    }

    public static void b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(wh6.DIR);
            sb.append(list.get(i));
        }
    }

    public static String a(String str, boolean z) {
        return b(str, 0, str.length(), z);
    }

    private List<String> a(List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(next != null ? a(next, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void a(com.meizu.cloud.pushsdk.e.h.b bVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        com.meizu.cloud.pushsdk.e.h.b bVar2 = null;
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt == 43 && z3) {
                bVar.a(z ? f7l.PLUS : "%2B");
            } else if (a(codePointAt, i3, str, i2, str2, z, z2, z3, z4)) {
                if (bVar2 == null) {
                    bVar2 = new com.meizu.cloud.pushsdk.e.h.b();
                }
                bVar2.c(codePointAt);
                while (!bVar2.h()) {
                    byte i4 = bVar2.i();
                    bVar.b(37);
                    char[] cArr = f5820a;
                    bVar.b((int) cArr[((i4 & 255) >> 4) & 15]);
                    bVar.b((int) cArr[i4 & 15]);
                }
            } else {
                bVar.c(codePointAt);
            }
            i3 += Character.charCount(codePointAt);
        }
    }

    private static void a(com.meizu.cloud.pushsdk.e.h.b bVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt != 37 || (i3 = i + 2) >= i2) {
                if (codePointAt == 43 && z) {
                    bVar.b(32);
                    i += Character.charCount(codePointAt);
                }
                bVar.c(codePointAt);
                i += Character.charCount(codePointAt);
            } else {
                int b2 = b(str.charAt(i + 1));
                int b3 = b(str.charAt(i3));
                if (!(b2 == -1 || b3 == -1)) {
                    bVar.b((b2 << 4) + b3);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
                bVar.c(codePointAt);
                i += Character.charCount(codePointAt);
            }
        }
    }

    public static void a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    private static boolean a(int i, int i2, String str, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        if (i < 32 || i == 127) {
            return true;
        }
        if ((i >= 128 && z4) || str2.indexOf(i) != -1) {
            return true;
        }
        boolean z5 = !z || (z2 && !a(str, i2, i3));
        if (i != 37 || !z5) {
            return i == 43 && z3;
        }
        return true;
    }

    private static boolean a(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && b(str.charAt(i + 1)) != -1 && b(str.charAt(i3)) != -1;
    }
}
