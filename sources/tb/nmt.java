package tb;

import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class nmt {
    public static final long a(Reader reader, Writer writer, int i) {
        ckf.g(reader, "<this>");
        ckf.g(writer, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += read;
            read = reader.read(cArr);
        }
        return j;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return a(reader, writer, i);
    }

    public static final String c(Reader reader) {
        ckf.g(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        ckf.f(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
