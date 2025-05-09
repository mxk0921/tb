package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class mqq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946271);
    }

    public static String a(qf8 qf8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcf3252", new Object[]{qf8Var, str});
        }
        if (str == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(str.length());
            if (b(qf8Var, str, stringWriter)) {
                return stringWriter.toString();
            }
        } catch (IOException unused) {
        }
        return str;
    }

    public static boolean b(qf8 qf8Var, String str, Writer writer) throws IOException {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d8789cf", new Object[]{qf8Var, str, writer})).booleanValue();
        }
        if (writer == null) {
            throw new IllegalArgumentException("The Writer must not be null");
        } else if (str == null) {
            return false;
        } else {
            boolean z = false;
            while (i4 < str.length()) {
                char charAt = str.charAt(i4);
                if (charAt == '&') {
                    int i5 = i4 + 1;
                    int indexOf = str.indexOf(59, i5);
                    if (indexOf == -1 || i5 >= indexOf - 1) {
                        writer.write(charAt);
                    } else {
                        if (str.charAt(i5) == '#') {
                            int i6 = i4 + 2;
                            if (i6 >= i) {
                                writer.write(charAt);
                                writer.write(35);
                            } else {
                                char charAt2 = str.charAt(i6);
                                if (charAt2 == 'x' || charAt2 == 'X') {
                                    i6 = i4 + 3;
                                    if (i6 >= i) {
                                        writer.write(charAt);
                                        writer.write(35);
                                    } else {
                                        i3 = 16;
                                    }
                                } else {
                                    i3 = 10;
                                }
                                try {
                                    writer.write(Integer.parseInt(str.substring(i6, indexOf), i3));
                                } catch (NumberFormatException unused) {
                                    writer.write(charAt);
                                    writer.write(35);
                                }
                            }
                            i4 = i5;
                        } else {
                            String substring = str.substring(i5, indexOf);
                            if (qf8Var != null) {
                                i2 = qf8Var.c(substring);
                            } else {
                                i2 = -1;
                            }
                            if (i2 == -1) {
                                writer.write(38);
                                writer.write(substring);
                                writer.write(59);
                                i4 = indexOf;
                            } else {
                                writer.write(i2);
                            }
                        }
                        z = true;
                        i4 = indexOf;
                    }
                } else {
                    writer.write(charAt);
                }
                i4++;
            }
            return z;
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ba0c76a", new Object[]{str});
        }
        return a(qf8.HTML40, str);
    }
}
