package tb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.security.auth.x500.X500Principal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ctx {

    /* renamed from: a  reason: collision with root package name */
    public final String f17322a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public char[] g;

    public ctx(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f17322a = name;
        this.b = name.length();
    }

    public final int a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        int i5 = this.b;
        String str = this.f17322a;
        if (i4 < i5) {
            char[] cArr = this.g;
            char c = cArr[i];
            if (c >= '0' && c <= '9') {
                i2 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i2 = c - 'W';
            } else if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            } else {
                i2 = c - '7';
            }
            char c2 = cArr[i4];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            } else {
                i3 = c2 - '7';
            }
            return (i2 << 4) + i3;
        }
        throw new IllegalStateException("Malformed DN: " + str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
        return new java.lang.String(r1, r2, r9.f - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b() {
        /*
            r9 = this;
            int r0 = r9.c
            r9.d = r0
            r9.e = r0
        L_0x0006:
            int r0 = r9.c
            int r1 = r9.b
            if (r0 < r1) goto L_0x0019
            java.lang.String r0 = new java.lang.String
            char[] r1 = r9.g
            int r2 = r9.d
            int r3 = r9.e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0019:
            char[] r2 = r9.g
            char r3 = r2[r0]
            r4 = 44
            r5 = 43
            r6 = 59
            r7 = 32
            if (r3 == r7) goto L_0x005c
            if (r3 == r6) goto L_0x0051
            r1 = 92
            if (r3 == r1) goto L_0x003e
            if (r3 == r5) goto L_0x0051
            if (r3 == r4) goto L_0x0051
            int r1 = r9.e
            int r4 = r1 + 1
            r9.e = r4
            r2[r1] = r3
            int r0 = r0 + 1
            r9.c = r0
            goto L_0x0006
        L_0x003e:
            int r0 = r9.e
            int r1 = r0 + 1
            r9.e = r1
            char r1 = r9.c()
            r2[r0] = r1
            int r0 = r9.c
            int r0 = r0 + 1
            r9.c = r0
            goto L_0x0006
        L_0x0051:
            java.lang.String r0 = new java.lang.String
            int r1 = r9.d
            int r3 = r9.e
            int r3 = r3 - r1
            r0.<init>(r2, r1, r3)
            return r0
        L_0x005c:
            int r3 = r9.e
            r9.f = r3
            int r0 = r0 + 1
            r9.c = r0
            int r0 = r3 + 1
            r9.e = r0
            r2[r3] = r7
        L_0x006a:
            int r0 = r9.c
            if (r0 >= r1) goto L_0x0081
            char[] r2 = r9.g
            char r3 = r2[r0]
            if (r3 != r7) goto L_0x0081
            int r3 = r9.e
            int r8 = r3 + 1
            r9.e = r8
            r2[r3] = r7
            int r0 = r0 + 1
            r9.c = r0
            goto L_0x006a
        L_0x0081:
            if (r0 == r1) goto L_0x008d
            char[] r1 = r9.g
            char r0 = r1[r0]
            if (r0 == r4) goto L_0x008d
            if (r0 == r5) goto L_0x008d
            if (r0 != r6) goto L_0x0006
        L_0x008d:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r9.g
            int r2 = r9.d
            int r3 = r9.f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ctx.b():java.lang.String");
    }

    public final char c() {
        int i = this.c + 1;
        this.c = i;
        if (i != this.b) {
            char c = this.g[i];
            if (c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#') {
                return c;
            }
            switch (c) {
                case '*':
                case '+':
                case ',':
                    return c;
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            return c;
                        default:
                            return e();
                    }
            }
        } else {
            throw new IllegalStateException("Unexpected end of DN: " + this.f17322a);
        }
    }

    public List<String> d(String str) {
        String str2;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        String str3 = this.f17322a;
        this.g = str3.toCharArray();
        List<String> emptyList = Collections.emptyList();
        String g = g();
        if (g == null) {
            return emptyList;
        }
        do {
            int i = this.c;
            int i2 = this.b;
            if (i < i2) {
                char c = this.g[i];
                if (c == '\"') {
                    str2 = h();
                } else if (c == '#') {
                    str2 = f();
                } else if (c == '+' || c == ',' || c == ';') {
                    str2 = "";
                } else {
                    str2 = b();
                }
                if (str.equalsIgnoreCase(g)) {
                    if (emptyList.isEmpty()) {
                        emptyList = new ArrayList<>();
                    }
                    emptyList.add(str2);
                }
                int i3 = this.c;
                if (i3 < i2) {
                    char c2 = this.g[i3];
                    if (c2 == ',' || c2 == ';' || c2 == '+') {
                        this.c = i3 + 1;
                        g = g();
                    } else {
                        throw new IllegalStateException("Malformed DN: ".concat(str3));
                    }
                }
            }
            return emptyList;
        } while (g != null);
        throw new IllegalStateException("Malformed DN: ".concat(str3));
    }

    public final char e() {
        int i;
        int i2;
        int a2 = a(this.c);
        this.c++;
        if (a2 < 128) {
            return (char) a2;
        }
        if (a2 < 192 || a2 > 247) {
            return f7l.CONDITION_IF;
        }
        if (a2 <= 223) {
            i2 = a2 & 31;
            i = 1;
        } else if (a2 <= 239) {
            i2 = a2 & 15;
            i = 2;
        } else {
            i2 = a2 & 7;
            i = 3;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i5 == this.b || this.g[i5] != '\\') {
                return f7l.CONDITION_IF;
            }
            int i6 = i4 + 2;
            this.c = i6;
            int a3 = a(i6);
            this.c++;
            if ((a3 & tck.DETECT_WIDTH) != 128) {
                return f7l.CONDITION_IF;
            }
            i2 = (i2 << 6) + (a3 & 63);
        }
        return (char) i2;
    }

    public final String f() {
        int i;
        char[] cArr;
        char c;
        int i2 = this.c;
        int i3 = i2 + 4;
        String str = this.f17322a;
        int i4 = this.b;
        if (i3 < i4) {
            this.d = i2;
            this.c = i2 + 1;
            while (true) {
                i = this.c;
                if (i == i4 || (c = (cArr = this.g)[i]) == '+' || c == ',' || c == ';') {
                    break;
                } else if (c == ' ') {
                    this.e = i;
                    this.c = i + 1;
                    while (true) {
                        int i5 = this.c;
                        if (i5 >= i4 || this.g[i5] != ' ') {
                            break;
                        }
                        this.c = i5 + 1;
                    }
                } else {
                    if (c >= 'A' && c <= 'F') {
                        cArr[i] = (char) (c + ' ');
                    }
                    this.c = i + 1;
                }
            }
            this.e = i;
            int i6 = this.e;
            int i7 = this.d;
            int i8 = i6 - i7;
            if (i8 < 5 || (i8 & 1) == 0) {
                throw new IllegalStateException("Unexpected end of DN: " + str);
            }
            int i9 = i8 / 2;
            byte[] bArr = new byte[i9];
            int i10 = i7 + 1;
            for (int i11 = 0; i11 < i9; i11++) {
                bArr[i11] = (byte) a(i10);
                i10 += 2;
            }
            return new String(this.g, this.d, i8);
        }
        throw new IllegalStateException("Unexpected end of DN: " + str);
    }

    public final String g() {
        int i;
        int i2;
        int i3;
        char c;
        char c2;
        char c3;
        int i4;
        char c4;
        char c5;
        while (true) {
            i = this.c;
            i2 = this.b;
            if (i >= i2 || this.g[i] != ' ') {
                break;
            }
            this.c = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.d = i;
        this.c = i + 1;
        while (true) {
            i3 = this.c;
            if (i3 >= i2 || (c5 = this.g[i3]) == '=' || c5 == ' ') {
                break;
            }
            this.c = i3 + 1;
        }
        String str = this.f17322a;
        if (i3 < i2) {
            this.e = i3;
            if (this.g[i3] == ' ') {
                while (true) {
                    i4 = this.c;
                    if (i4 >= i2 || (c4 = this.g[i4]) == '=' || c4 != ' ') {
                        break;
                    }
                    this.c = i4 + 1;
                }
                if (this.g[i4] != '=' || i4 == i2) {
                    throw new IllegalStateException("Unexpected end of DN: " + str);
                }
            }
            this.c++;
            while (true) {
                int i5 = this.c;
                if (i5 >= i2 || this.g[i5] != ' ') {
                    break;
                }
                this.c = i5 + 1;
            }
            int i6 = this.e;
            int i7 = this.d;
            if (i6 - i7 > 4) {
                char[] cArr = this.g;
                if (cArr[i7 + 3] == '.' && (((c = cArr[i7]) == 'O' || c == 'o') && (((c2 = cArr[i7 + 1]) == 'I' || c2 == 'i') && ((c3 = cArr[i7 + 2]) == 'D' || c3 == 'd')))) {
                    this.d = i7 + 4;
                }
            }
            char[] cArr2 = this.g;
            int i8 = this.d;
            return new String(cArr2, i8, i6 - i8);
        }
        throw new IllegalStateException("Unexpected end of DN: " + str);
    }

    public final String h() {
        int i = this.c + 1;
        this.c = i;
        this.d = i;
        this.e = i;
        while (true) {
            int i2 = this.c;
            int i3 = this.b;
            if (i2 != i3) {
                char[] cArr = this.g;
                char c = cArr[i2];
                if (c == '\"') {
                    this.c = i2 + 1;
                    while (true) {
                        int i4 = this.c;
                        if (i4 >= i3 || this.g[i4] != ' ') {
                            break;
                        }
                        this.c = i4 + 1;
                    }
                    char[] cArr2 = this.g;
                    int i5 = this.d;
                    return new String(cArr2, i5, this.e - i5);
                }
                if (c == '\\') {
                    cArr[this.e] = c();
                } else {
                    cArr[this.e] = c;
                }
                this.c++;
                this.e++;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.f17322a);
            }
        }
    }
}
