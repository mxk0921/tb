package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class JsonWriter implements Closeable, Flushable {
    private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
    private static final String[] REPLACEMENT_CHARS = new String[128];
    private String deferredName;
    private boolean htmlSafe;
    private String indent;
    private boolean lenient;
    private final Writer out;
    private int[] stack = new int[32];
    private int stackSize = 0;
    private String separator = ":";
    private boolean serializeNulls = true;

    static {
        for (int i = 0; i <= 31; i++) {
            REPLACEMENT_CHARS[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        HTML_SAFE_REPLACEMENT_CHARS = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        push(6);
        if (writer != null) {
            this.out = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private void beforeName() throws IOException {
        int peek = peek();
        if (peek == 5) {
            this.out.write(44);
        } else if (peek != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        newline();
        replaceTop(4);
    }

    private void beforeValue() throws IOException {
        int peek = peek();
        if (peek == 1) {
            replaceTop(2);
            newline();
        } else if (peek == 2) {
            this.out.append(',');
            newline();
        } else if (peek != 4) {
            if (peek != 6) {
                if (peek != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.lenient) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            replaceTop(7);
        } else {
            this.out.append((CharSequence) this.separator);
            replaceTop(5);
        }
    }

    private JsonWriter close(int i, int i2, String str) throws IOException {
        int peek = peek();
        if (peek != i2 && peek != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.deferredName == null) {
            this.stackSize--;
            if (peek == i2) {
                newline();
            }
            this.out.write(str);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.deferredName);
        }
    }

    private void newline() throws IOException {
        if (this.indent != null) {
            this.out.write("\n");
            int i = this.stackSize;
            for (int i2 = 1; i2 < i; i2++) {
                this.out.write(this.indent);
            }
        }
    }

    private JsonWriter open(int i, String str) throws IOException {
        beforeValue();
        push(i);
        this.out.write(str);
        return this;
    }

    private int peek() {
        int i = this.stackSize;
        if (i != 0) {
            return this.stack[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void push(int i) {
        int i2 = this.stackSize;
        int[] iArr = this.stack;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.stack = iArr2;
        }
        int[] iArr3 = this.stack;
        int i3 = this.stackSize;
        this.stackSize = i3 + 1;
        iArr3[i3] = i;
    }

    private void replaceTop(int i) {
        this.stack[this.stackSize - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void string(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.htmlSafe
            if (r0 == 0) goto L_0x0007
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.HTML_SAFE_REPLACEMENT_CHARS
            goto L_0x0009
        L_0x0007:
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.REPLACEMENT_CHARS
        L_0x0009:
            java.io.Writer r1 = r8.out
            java.lang.String r2 = "\""
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L_0x0016:
            if (r3 >= r1) goto L_0x0045
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L_0x0025
            r5 = r0[r5]
            if (r5 != 0) goto L_0x0032
            goto L_0x0042
        L_0x0025:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L_0x002c
            java.lang.String r5 = "\\u2028"
            goto L_0x0032
        L_0x002c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L_0x0042
            java.lang.String r5 = "\\u2029"
        L_0x0032:
            if (r4 >= r3) goto L_0x003b
            java.io.Writer r6 = r8.out
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L_0x003b:
            java.io.Writer r4 = r8.out
            r4.write(r5)
            int r4 = r3 + 1
        L_0x0042:
            int r3 = r3 + 1
            goto L_0x0016
        L_0x0045:
            if (r4 >= r1) goto L_0x004d
            java.io.Writer r0 = r8.out
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L_0x004d:
            java.io.Writer r9 = r8.out
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonWriter.string(java.lang.String):void");
    }

    private void writeDeferredName() throws IOException {
        if (this.deferredName != null) {
            beforeName();
            string(this.deferredName);
            this.deferredName = null;
        }
    }

    public JsonWriter beginArray() throws IOException {
        writeDeferredName();
        return open(1, "[");
    }

    public JsonWriter beginObject() throws IOException {
        writeDeferredName();
        return open(3, "{");
    }

    public JsonWriter endArray() throws IOException {
        return close(1, 2, "]");
    }

    public void flush() throws IOException {
        if (this.stackSize != 0) {
            this.out.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    public final boolean isHtmlSafe() {
        return this.htmlSafe;
    }

    public boolean isLenient() {
        return this.lenient;
    }

    public JsonWriter jsonValue(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.append((CharSequence) str);
        return this;
    }

    public JsonWriter nullValue() throws IOException {
        if (this.deferredName != null) {
            if (this.serializeNulls) {
                writeDeferredName();
            } else {
                this.deferredName = null;
                return this;
            }
        }
        beforeValue();
        this.out.write("null");
        return this;
    }

    public final void setHtmlSafe(boolean z) {
        this.htmlSafe = z;
    }

    public final void setIndent(String str) {
        if (str.length() == 0) {
            this.indent = null;
            this.separator = ":";
            return;
        }
        this.indent = str;
        this.separator = ": ";
    }

    public final void setLenient(boolean z) {
        this.lenient = z;
    }

    public final void setSerializeNulls(boolean z) {
        this.serializeNulls = z;
    }

    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        string(str);
        return this;
    }

    public JsonWriter endObject() throws IOException {
        return close(3, 5, "}");
    }

    public JsonWriter name(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.deferredName != null) {
            throw new IllegalStateException();
        } else if (this.stackSize != 0) {
            this.deferredName = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public JsonWriter value(boolean z) throws IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(z ? "true" : "false");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
        int i = this.stackSize;
        if (i > 1 || (i == 1 && this.stack[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.stackSize = 0;
    }

    public JsonWriter value(double d) throws IOException {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        writeDeferredName();
        beforeValue();
        this.out.append((CharSequence) Double.toString(d));
        return this;
    }

    public JsonWriter value(long j) throws IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(Long.toString(j));
        return this;
    }

    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        writeDeferredName();
        String obj = number.toString();
        if (this.lenient || (!obj.equals("-Infinity") && !obj.equals(pg1.ATOM_EXT_Infinity) && !obj.equals(pg1.ATOM_EXT_NaN))) {
            beforeValue();
            this.out.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }
}
