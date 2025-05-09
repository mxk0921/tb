package com.ta.utdid2.core.persistent;

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
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class FastXmlSerializer implements XmlSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int BUFFER_LEN = 8192;
    private static final String[] ESCAPE_TABLE = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};
    private CharsetEncoder mCharset;
    private boolean mInTag;
    private OutputStream mOutputStream;
    private int mPos;
    private Writer mWriter;
    private final char[] mText = new char[8192];
    private ByteBuffer mBytes = ByteBuffer.allocate(8192);

    static {
        t2o.a(966787111);
    }

    private void append(char c) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cbdf9fc", new Object[]{this, new Character(c)});
            return;
        }
        int i = this.mPos;
        if (i >= 8191) {
            flush();
            i = this.mPos;
        }
        this.mText[i] = c;
        this.mPos = i + 1;
    }

    private void escapeAndAppendString(String str) throws IOException {
        String str2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83661c52", new Object[]{this, str});
            return;
        }
        int length = str.length();
        String[] strArr = ESCAPE_TABLE;
        char length2 = (char) strArr.length;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < length2 && (str2 = strArr[charAt]) != null) {
                if (i2 < i) {
                    append(str, i2, i - i2);
                }
                i2 = i + 1;
                append(str2);
            }
            i++;
        }
        if (i2 < i) {
            append(str, i2, i - i2);
        }
    }

    private void flushBytes() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409120ce", new Object[]{this});
            return;
        }
        int position = this.mBytes.position();
        if (position > 0) {
            this.mBytes.flip();
            this.mOutputStream.write(this.mBytes.array(), 0, position);
            this.mBytes.clear();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer attribute(String str, String str2, String str3) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlSerializer) ipChange.ipc$dispatch("f9decb51", new Object[]{this, str, str2, str3});
        }
        append(' ');
        if (str != null) {
            append(str);
            append(f7l.CONDITION_IF_MIDDLE);
        }
        append(str2);
        append("=\"");
        escapeAndAppendString(str3);
        append('\"');
        return this;
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

    @Override // org.xmlpull.v1.XmlSerializer
    public void docdecl(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3085eaf3", new Object[]{this, str});
            return;
        }
        throw new UnsupportedOperationException();
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
        if (this.mInTag) {
            append(" />\n");
        } else {
            append("</");
            if (str != null) {
                append(str);
                append(f7l.CONDITION_IF_MIDDLE);
            }
            append(str2);
            append(">\n");
        }
        this.mInTag = false;
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

    @Override // org.xmlpull.v1.XmlSerializer
    public void flush() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
            return;
        }
        int i = this.mPos;
        if (i > 0) {
            if (this.mOutputStream != null) {
                CharBuffer wrap = CharBuffer.wrap(this.mText, 0, i);
                CoderResult encode = this.mCharset.encode(wrap, this.mBytes, true);
                while (!encode.isError()) {
                    if (encode.isOverflow()) {
                        flushBytes();
                        encode = this.mCharset.encode(wrap, this.mBytes, true);
                    } else {
                        flushBytes();
                        this.mOutputStream.flush();
                    }
                }
                throw new IOException(encode.toString());
            }
            this.mWriter.write(this.mText, 0, i);
            this.mWriter.flush();
            this.mPos = 0;
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
        } else if (!str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
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
                this.mCharset = Charset.forName(str).newEncoder();
                this.mOutputStream = outputStream;
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
        append(sb.toString());
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer startTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlSerializer) ipChange.ipc$dispatch("bda5c15f", new Object[]{this, str, str2});
        }
        if (this.mInTag) {
            append(">\n");
        }
        append('<');
        if (str != null) {
            append(str);
            append(f7l.CONDITION_IF_MIDDLE);
        }
        append(str2);
        this.mInTag = true;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(char[] cArr, int i, int i2) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlSerializer) ipChange.ipc$dispatch("99458fd6", new Object[]{this, cArr, new Integer(i), new Integer(i2)});
        }
        if (this.mInTag) {
            append(">");
            this.mInTag = false;
        }
        escapeAndAppendString(cArr, i, i2);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlSerializer) ipChange.ipc$dispatch("e0764b34", new Object[]{this, str});
        }
        if (this.mInTag) {
            append(">");
            this.mInTag = false;
        }
        escapeAndAppendString(str);
        return this;
    }

    private void append(String str, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4814dbcb", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (i2 > 8192) {
            int i3 = i2 + i;
            while (i < i3) {
                int i4 = i + 8192;
                append(str, i, i4 < i3 ? 8192 : i3 - i);
                i = i4;
            }
        } else {
            int i5 = this.mPos;
            if (i5 + i2 > 8192) {
                flush();
                i5 = this.mPos;
            }
            str.getChars(i, i + i2, this.mText, i5);
            this.mPos = i5 + i2;
        }
    }

    private void escapeAndAppendString(char[] cArr, int i, int i2) throws IOException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7595770", new Object[]{this, cArr, new Integer(i), new Integer(i2)});
            return;
        }
        String[] strArr = ESCAPE_TABLE;
        char length = (char) strArr.length;
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            char c = cArr[i];
            if (c < length && (str = strArr[c]) != null) {
                if (i4 < i) {
                    append(cArr, i4, i - i4);
                }
                i4 = i + 1;
                append(str);
            }
            i++;
        }
        if (i4 < i) {
            append(cArr, i4, i - i4);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(Writer writer) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7170b6a", new Object[]{this, writer});
        } else {
            this.mWriter = writer;
        }
    }

    private void append(char[] cArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a23d509", new Object[]{this, cArr, new Integer(i), new Integer(i2)});
        } else if (i2 > 8192) {
            int i3 = i2 + i;
            while (i < i3) {
                int i4 = i + 8192;
                append(cArr, i, i4 < i3 ? 8192 : i3 - i);
                i = i4;
            }
        } else {
            int i5 = this.mPos;
            if (i5 + i2 > 8192) {
                flush();
                i5 = this.mPos;
            }
            System.arraycopy(cArr, i, this.mText, i5, i2);
            this.mPos = i5 + i2;
        }
    }

    private void append(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b45a2b", new Object[]{this, str});
        } else {
            append(str, 0, str.length());
        }
    }
}
