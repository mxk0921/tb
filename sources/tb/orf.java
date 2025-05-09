package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.json.alipay.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class orf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f25597a;
    public final Reader b;
    public char c;
    public boolean d;

    public orf(Reader reader) {
        this.b = !reader.markSupported() ? new BufferedReader(reader) : reader;
        this.d = false;
        this.f25597a = 0;
    }

    public void a() throws JSONException {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58bdee", new Object[]{this});
        } else if (this.d || (i = this.f25597a) <= 0) {
            throw new JSONException("Stepping back two steps is not supported");
        } else {
            this.f25597a = i - 1;
            this.d = true;
        }
    }

    public char b() throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Character) ipChange.ipc$dispatch("54d45de7", new Object[]{this})).charValue();
        }
        if (this.d) {
            this.d = false;
            char c = this.c;
            if (c != 0) {
                this.f25597a++;
            }
            return c;
        }
        try {
            int read = this.b.read();
            if (read <= 0) {
                this.c = (char) 0;
                return (char) 0;
            }
            this.f25597a++;
            char c2 = (char) read;
            this.c = c2;
            return c2;
        } catch (IOException e) {
            throw new JSONException(e);
        }
    }

    public String c(int i) throws JSONException {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("253e1b77", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return "";
        }
        char[] cArr = new char[i];
        if (this.d) {
            this.d = false;
            cArr[0] = this.c;
            i2 = 1;
        }
        while (i2 < i) {
            try {
                int read = this.b.read(cArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            } catch (IOException e) {
                throw new JSONException(e);
            }
        }
        this.f25597a += i2;
        if (i2 >= i) {
            this.c = cArr[i - 1];
            return new String(cArr);
        }
        throw g("Substring bounds error");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public char d() throws org.json.alipay.JSONException {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.orf.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0019
            java.lang.String r1 = "2d45248a"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.Object r0 = r0.ipc$dispatch(r1, r2)
            java.lang.Character r0 = (java.lang.Character) r0
            char r0 = r0.charValue()
            return r0
        L_0x0019:
            char r0 = r5.b()
            r1 = 13
            r2 = 10
            r3 = 47
            if (r0 != r3) goto L_0x0058
            char r0 = r5.b()
            r4 = 42
            if (r0 == r4) goto L_0x003e
            if (r0 == r3) goto L_0x0033
            r5.a()
            return r3
        L_0x0033:
            char r0 = r5.b()
            if (r0 == r2) goto L_0x0019
            if (r0 == r1) goto L_0x0019
            if (r0 != 0) goto L_0x0033
            goto L_0x0019
        L_0x003e:
            char r0 = r5.b()
            if (r0 == 0) goto L_0x0051
            if (r0 != r4) goto L_0x003e
            char r0 = r5.b()
            if (r0 != r3) goto L_0x004d
            goto L_0x0019
        L_0x004d:
            r5.a()
            goto L_0x003e
        L_0x0051:
            java.lang.String r0 = "Unclosed comment"
            org.json.alipay.JSONException r0 = r5.g(r0)
            throw r0
        L_0x0058:
            r3 = 35
            if (r0 != r3) goto L_0x0067
        L_0x005c:
            char r0 = r5.b()
            if (r0 == r2) goto L_0x0019
            if (r0 == r1) goto L_0x0019
            if (r0 != 0) goto L_0x005c
            goto L_0x0019
        L_0x0067:
            if (r0 == 0) goto L_0x006d
            r1 = 32
            if (r0 <= r1) goto L_0x0019
        L_0x006d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.orf.d():char");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
        throw g("Unterminated string");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String e(char r7) throws org.json.alipay.JSONException {
        /*
            r6 = this;
            r0 = 2
            com.android.alibaba.ip.runtime.IpChange r1 = tb.orf.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001d
            java.lang.Character r2 = new java.lang.Character
            r2.<init>(r7)
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r0 = 0
            r7[r0] = r6
            r0 = 1
            r7[r0] = r2
            java.lang.String r0 = "d3ca46e"
            java.lang.Object r7 = r1.ipc$dispatch(r0, r7)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L_0x001d:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
        L_0x0022:
            char r2 = r6.b()
            if (r2 == 0) goto L_0x009a
            r3 = 10
            if (r2 == r3) goto L_0x009a
            r4 = 13
            if (r2 == r4) goto L_0x009a
            r5 = 92
            if (r2 == r5) goto L_0x003f
            if (r2 != r7) goto L_0x003b
            java.lang.String r7 = r1.toString()
            return r7
        L_0x003b:
            r1.append(r2)
            goto L_0x0022
        L_0x003f:
            char r2 = r6.b()
            r5 = 98
            if (r2 == r5) goto L_0x0094
            r5 = 102(0x66, float:1.43E-43)
            if (r2 == r5) goto L_0x008e
            r5 = 110(0x6e, float:1.54E-43)
            if (r2 == r5) goto L_0x008a
            r3 = 114(0x72, float:1.6E-43)
            if (r2 == r3) goto L_0x0086
            r3 = 120(0x78, float:1.68E-43)
            r4 = 16
            if (r2 == r3) goto L_0x0079
            r3 = 116(0x74, float:1.63E-43)
            if (r2 == r3) goto L_0x0073
            r3 = 117(0x75, float:1.64E-43)
            if (r2 == r3) goto L_0x0065
            r1.append(r2)
            goto L_0x0022
        L_0x0065:
            r2 = 4
            java.lang.String r2 = r6.c(r2)
            int r2 = java.lang.Integer.parseInt(r2, r4)
            char r2 = (char) r2
            r1.append(r2)
            goto L_0x0022
        L_0x0073:
            r2 = 9
            r1.append(r2)
            goto L_0x0022
        L_0x0079:
            java.lang.String r2 = r6.c(r0)
            int r2 = java.lang.Integer.parseInt(r2, r4)
            char r2 = (char) r2
            r1.append(r2)
            goto L_0x0022
        L_0x0086:
            r1.append(r4)
            goto L_0x0022
        L_0x008a:
            r1.append(r3)
            goto L_0x0022
        L_0x008e:
            r2 = 12
            r1.append(r2)
            goto L_0x0022
        L_0x0094:
            r2 = 8
            r1.append(r2)
            goto L_0x0022
        L_0x009a:
            java.lang.String r7 = "Unterminated string"
            org.json.alipay.JSONException r7 = r6.g(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.orf.e(char):java.lang.String");
    }

    public Object f() throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("375b4e0d", new Object[]{this});
        }
        char d = d();
        if (d != '\"') {
            if (d != '[') {
                if (d == '{') {
                    a();
                    return new erf(this);
                } else if (d != '\'') {
                    if (d != '(') {
                        StringBuffer stringBuffer = new StringBuffer();
                        char c = d;
                        while (c >= ' ' && ",:]}/\\\"[{;=#".indexOf(c) < 0) {
                            stringBuffer.append(c);
                            c = b();
                        }
                        a();
                        String trim = stringBuffer.toString().trim();
                        if (trim.equals("")) {
                            throw g("Missing value");
                        } else if (trim.equalsIgnoreCase("true")) {
                            return Boolean.TRUE;
                        } else {
                            if (trim.equalsIgnoreCase("false")) {
                                return Boolean.FALSE;
                            }
                            if (trim.equalsIgnoreCase("null")) {
                                return erf.NULL;
                            }
                            if ((d < '0' || d > '9') && d != '.' && d != '-' && d != '+') {
                                return trim;
                            }
                            if (d == '0') {
                                try {
                                    if (trim.length() <= 2 || (trim.charAt(1) != 'x' && trim.charAt(1) != 'X')) {
                                        return new Integer(Integer.parseInt(trim, 8));
                                    }
                                    return new Integer(Integer.parseInt(trim.substring(2), 16));
                                } catch (Exception unused) {
                                }
                            }
                            try {
                                try {
                                    try {
                                        return new Integer(trim);
                                    } catch (Exception unused2) {
                                        return new Double(trim);
                                    }
                                } catch (Exception unused3) {
                                    return new Long(trim);
                                }
                            } catch (Exception unused4) {
                                return trim;
                            }
                        }
                    }
                }
            }
            a();
            return new xqf(this);
        }
        return e(d);
    }

    public JSONException g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONException) ipChange.ipc$dispatch("8d768309", new Object[]{this, str});
        }
        return new JSONException(str + toString());
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return " at character " + this.f25597a;
    }

    public orf(String str) {
        this(new StringReader(str));
    }
}
