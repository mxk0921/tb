package tb;

import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class u19 implements XmlSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String[] l = {"&#0;", "&#1;", "&#2;", "&#3;", "&#4;", "&#5;", "&#6;", "&#7;", "&#8;", "&#9;", "&#10;", "&#11;", "&#12;", "&#13;", "&#14;", "&#15;", "&#16;", "&#17;", "&#18;", "&#19;", "&#20;", "&#21;", "&#22;", "&#23;", "&#24;", "&#25;", "&#26;", "&#27;", "&#28;", "&#29;", "&#30;", "&#31;", null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};
    public static final String m = "                                                              ";

    /* renamed from: a  reason: collision with root package name */
    public final int f29072a;
    public final char[] b;
    public int c;
    public Writer d;
    public OutputStream e;
    public CharsetEncoder f;
    public final ByteBuffer g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;

    static {
        t2o.a(407896111);
    }

    public u19() {
        this(32768);
    }

    public final void a(char c) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cbdf9fc", new Object[]{this, new Character(c)});
            return;
        }
        int i = this.c;
        if (i >= this.f29072a - 1) {
            flush();
            i = this.c;
        }
        this.b[i] = c;
        this.c = i + 1;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer attribute(String str, String str2, String str3) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlSerializer) ipChange.ipc$dispatch("f9decb51", new Object[]{this, str, str2, str3});
        }
        a(' ');
        if (str != null) {
            b(str);
            a(f7l.CONDITION_IF_MIDDLE);
        }
        b(str2);
        b("=\"");
        f(str3);
        a('\"');
        this.k = false;
        return this;
    }

    public final void b(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b45a2b", new Object[]{this, str});
        } else {
            c(str, 0, str.length());
        }
    }

    public final void c(String str, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4814dbcb", new Object[]{this, str, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = this.f29072a;
        if (i2 > i3) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = this.f29072a;
                int i6 = i + i5;
                if (i6 >= i4) {
                    i5 = i4 - i;
                }
                c(str, i, i5);
                i = i6;
            }
            return;
        }
        int i7 = this.c;
        if (i7 + i2 > i3) {
            flush();
            i7 = this.c;
        }
        str.getChars(i, i + i2, this.b, i7);
        this.c = i7 + i2;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void cdsect(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a1e09b5", new Object[]{this, str});
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void comment(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa287b0", new Object[]{this, str});
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(char[] cArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a23d509", new Object[]{this, cArr, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = this.f29072a;
        if (i2 > i3) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = this.f29072a;
                int i6 = i + i5;
                if (i6 >= i4) {
                    i5 = i4 - i;
                }
                d(cArr, i, i5);
                i = i6;
            }
            return;
        }
        int i7 = this.c;
        if (i7 + i2 > i3) {
            flush();
            i7 = this.c;
        }
        System.arraycopy(cArr, i, this.b, i7, i2);
        this.c = i7 + i2;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void docdecl(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3085eaf3", new Object[]{this, str});
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void e(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1315eb6", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = i * 4;
        String str = m;
        if (i2 > str.length()) {
            i2 = str.length();
        }
        c(str, 0, i2);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void endDocument() throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df5bc9d", new Object[]{this});
        } else {
            flush();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer endTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlSerializer) ipChange.ipc$dispatch("6298b4d8", new Object[]{this, str, str2});
        }
        int i = this.j - 1;
        this.j = i;
        if (this.i) {
            b(" />\n");
        } else {
            if (this.h && this.k) {
                e(i);
            }
            b("</");
            if (str != null) {
                b(str);
                a(f7l.CONDITION_IF_MIDDLE);
            }
            b(str2);
            b(">\n");
        }
        this.k = true;
        this.i = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void entityRef(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b208441", new Object[]{this, str});
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void f(String str) throws IOException {
        String str2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83661c52", new Object[]{this, str});
            return;
        }
        int length = str.length();
        String[] strArr = l;
        char length2 = (char) strArr.length;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < length2 && (str2 = strArr[charAt]) != null) {
                if (i2 < i) {
                    c(str, i2, i - i2);
                }
                i2 = i + 1;
                b(str2);
            }
            i++;
        }
        if (i2 < i) {
            c(str, i2, i - i2);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void flush() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
            return;
        }
        int i = this.c;
        if (i > 0) {
            if (this.e != null) {
                CharBuffer wrap = CharBuffer.wrap(this.b, 0, i);
                CoderResult encode = this.f.encode(wrap, this.g, true);
                while (!encode.isError()) {
                    if (encode.isOverflow()) {
                        h();
                        encode = this.f.encode(wrap, this.g, true);
                    } else {
                        h();
                        this.e.flush();
                    }
                }
                throw new IOException(encode.toString());
            }
            this.d.write(this.b, 0, i);
            this.d.flush();
            this.c = 0;
        }
    }

    public final void g(char[] cArr, int i, int i2) throws IOException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7595770", new Object[]{this, cArr, new Integer(i), new Integer(i2)});
            return;
        }
        String[] strArr = l;
        char length = (char) strArr.length;
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            char c = cArr[i];
            if (c < length && (str = strArr[c]) != null) {
                if (i4 < i) {
                    d(cArr, i4, i - i4);
                }
                i4 = i + 1;
                b(str);
            }
            i++;
        }
        if (i4 < i) {
            d(cArr, i4, i - i4);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public int getDepth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d67aa707", new Object[]{this})).intValue();
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public boolean getFeature(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5316155", new Object[]{this, str})).booleanValue();
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getNamespace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79c37174", new Object[]{this});
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getPrefix(String str, boolean z) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b8e8a25", new Object[]{this, str, new Boolean(z)});
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public Object getProperty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("955d4716", new Object[]{this, str});
        }
        throw new UnsupportedOperationException();
    }

    public final void h() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409120ce", new Object[]{this});
            return;
        }
        int position = this.g.position();
        if (position > 0) {
            this.g.flip();
            this.e.write(this.g.array(), 0, position);
            this.g.clear();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void ignorableWhitespace(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56f7a3b", new Object[]{this, str});
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void processingInstruction(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5719e7cc", new Object[]{this, str});
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setFeature(String str, boolean z) throws IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97184baf", new Object[]{this, str, new Boolean(z)});
        } else if (str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            this.h = true;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(OutputStream outputStream, String str) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f3b3846", new Object[]{this, outputStream, str});
        } else if (outputStream != null) {
            try {
                CharsetEncoder newEncoder = Charset.forName(str).newEncoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
                this.f = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
                this.e = outputStream;
            } catch (IllegalCharsetNameException e) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e));
            } catch (UnsupportedCharsetException e2) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e2));
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setPrefix(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678427af", new Object[]{this, str, str2});
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setProperty(String str, Object obj) throws IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda92184", new Object[]{this, str, obj});
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer startTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlSerializer) ipChange.ipc$dispatch("bda5c15f", new Object[]{this, str, str2});
        }
        if (this.i) {
            b(">\n");
        }
        if (this.h) {
            e(this.j);
        }
        this.j++;
        a('<');
        if (str != null) {
            b(str);
            a(f7l.CONDITION_IF_MIDDLE);
        }
        b(str2);
        this.i = true;
        this.k = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(char[] cArr, int i, int i2) throws IOException, IllegalArgumentException, IllegalStateException {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlSerializer) ipChange.ipc$dispatch("99458fd6", new Object[]{this, cArr, new Integer(i), new Integer(i2)});
        }
        if (this.i) {
            b(">");
            this.i = false;
        }
        g(cArr, i, i2);
        if (this.h) {
            if (cArr[(i + i2) - 1] != '\n') {
                z = false;
            }
            this.k = z;
        }
        return this;
    }

    public u19(int i) {
        this.h = false;
        this.j = 0;
        this.k = true;
        i = i <= 0 ? 32768 : i;
        this.f29072a = i;
        this.b = new char[i];
        this.g = ByteBuffer.allocate(i);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void startDocument(String str, Boolean bool) throws IOException, IllegalArgumentException, IllegalStateException {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2173be1f", new Object[]{this, str, bool});
            return;
        }
        StringBuilder sb = new StringBuilder("<?xml version='1.0' encoding='utf-8' standalone='");
        if (bool.booleanValue()) {
            str2 = Constants.VAL_YES;
        } else {
            str2 = "no";
        }
        sb.append(str2);
        sb.append("' ?>\n");
        b(sb.toString());
        this.k = true;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlSerializer) ipChange.ipc$dispatch("e0764b34", new Object[]{this, str});
        }
        if (this.i) {
            b(">");
            this.i = false;
        }
        f(str);
        if (this.h) {
            if (str.length() <= 0 || str.charAt(str.length() - 1) != '\n') {
                z = false;
            }
            this.k = z;
        }
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(Writer writer) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7170b6a", new Object[]{this, writer});
        } else {
            this.d = writer;
        }
    }
}
