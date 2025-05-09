package com.taobao.android.detail.ttdetail.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class IOUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class StringBuilderWriter extends Writer implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final StringBuilder builder = new StringBuilder();

        static {
            t2o.a(912262796);
        }

        public static /* synthetic */ Object ipc$super(StringBuilderWriter stringBuilderWriter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/utils/IOUtils$StringBuilderWriter");
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            }
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.builder.toString();
        }

        @Override // java.io.Writer
        public void write(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc66d130", new Object[]{this, str});
            } else if (str != null) {
                this.builder.append(str);
            }
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ba2c8ce", new Object[]{this, cArr, new Integer(i), new Integer(i2)});
            } else if (cArr != null) {
                this.builder.append(cArr, i, i2);
            }
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(char c) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Writer) ipChange.ipc$dispatch("29d0c7fa", new Object[]{this, new Character(c)});
            }
            this.builder.append(c);
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Writer) ipChange.ipc$dispatch("d009be91", new Object[]{this, charSequence});
            }
            this.builder.append(charSequence);
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Writer) ipChange.ipc$dispatch("2d25b771", new Object[]{this, charSequence, new Integer(i), new Integer(i2)});
            }
            this.builder.append(charSequence, i, i2);
            return this;
        }
    }

    static {
        t2o.a(912262795);
    }

    public static int a(InputStream inputStream, OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad89413c", new Object[]{inputStream, outputStream})).intValue();
        }
        long b = b(inputStream, outputStream);
        if (b > 2147483647L) {
            return -1;
        }
        return (int) b;
    }

    public static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a86b0bcc", new Object[]{inputStream, outputStream})).longValue();
        }
        return c(inputStream, outputStream, new byte[4096]);
    }

    public static long c(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39edea93", new Object[]{inputStream, outputStream, bArr})).longValue();
        }
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public static byte[] d(InputStream inputStream) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d8726867", new Object[]{inputStream});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
