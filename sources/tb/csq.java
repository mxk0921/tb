package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class csq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750529);
    }

    public static char a(StringBuilder sb, int i, int i2, String str) throws URISyntaxException {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Character) ipChange.ipc$dispatch("3a85235a", new Object[]{sb, new Integer(i), new Integer(i2), str})).charValue();
        }
        if (i < i2) {
            return sb.charAt(i);
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = " in [" + str + "]";
        }
        throw new URISyntaxException(sb.toString(), "Unexpected end of string" + str2, i);
    }

    public static int b(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8217d08", new Object[]{new Character(c)})).intValue();
        }
        if ('0' <= c && c <= '9') {
            return c - '0';
        }
        if ('a' <= c && c <= 'f') {
            return c - 'W';
        }
        if ('A' > c || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public static String c(StringBuilder sb, boolean z, Charset charset, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7bb5500b", new Object[]{sb, new Boolean(z), charset, new Boolean(z2)});
        }
        StringBuilder sb2 = new StringBuilder(sb.length());
        e(sb2, sb, z, charset, z2);
        return sb2.toString();
    }

    public static URISyntaxException d(StringBuilder sb, String str, char c, int i) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URISyntaxException) ipChange.ipc$dispatch("786afa45", new Object[]{sb, str, new Character(c), new Integer(i)});
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = " in [" + str + "]";
        }
        return new URISyntaxException(sb.toString(), "Unexpected character" + str2 + ": " + c, i);
    }

    public static void f(StringBuilder sb, CharsetDecoder charsetDecoder, ByteBuffer byteBuffer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3edbade", new Object[]{sb, charsetDecoder, byteBuffer, new Boolean(z)});
        } else if (byteBuffer.position() != 0) {
            byteBuffer.flip();
            try {
                try {
                    sb.append((CharSequence) charsetDecoder.decode(byteBuffer));
                } catch (CharacterCodingException e) {
                    if (!z) {
                        sb.append((char) 65533);
                    } else {
                        throw new IllegalArgumentException(e);
                    }
                }
            } finally {
                byteBuffer.flip();
                byteBuffer.limit(byteBuffer.capacity());
            }
        }
    }

    public static String g(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfd1250a", new Object[]{sb});
        }
        return c(sb, false, StandardCharsets.UTF_8, false);
    }

    public static int h(StringBuilder sb, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6710b2b1", new Object[]{sb, str, new Integer(i)})).intValue();
        }
        int length = sb.length();
        int length2 = str.length();
        if (i < length) {
            if (i < 0) {
                i = 0;
            }
            if (length2 == 0) {
                return i;
            }
            char charAt = str.charAt(0);
            int i2 = length - length2;
            while (i <= i2) {
                if (sb.charAt(i) != charAt) {
                    do {
                        i++;
                        if (i > i2) {
                            break;
                        }
                    } while (sb.charAt(i) != charAt);
                }
                if (i <= i2) {
                    int i3 = i + 1;
                    int i4 = (i3 + length2) - 1;
                    for (int i5 = 1; i3 < i4 && sb.charAt(i3) == str.charAt(i5); i5++) {
                        i3++;
                    }
                    if (i3 == i4) {
                        return i;
                    }
                }
                i++;
            }
            return -1;
        } else if (length2 == 0) {
            return length;
        } else {
            return -1;
        }
    }

    public static int i(String str, String str2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66e23915", new Object[]{str, str2})).intValue();
        }
        int i2 = 0;
        while (true) {
            int indexOf = str.indexOf(str2, i);
            if (indexOf <= -1) {
                return i2;
            }
            i2++;
            i = indexOf + str2.length();
        }
    }

    public static void j(StringBuilder sb, String str, String str2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29cdf064", new Object[]{sb, str, str2});
            return;
        }
        while (true) {
            int h = h(sb, str, i);
            if (h > -1) {
                sb.replace(h, str.length() + h, str2);
                i = h + str2.length();
            } else {
                return;
            }
        }
    }

    public static void e(StringBuilder sb, StringBuilder sb2, boolean z, Charset charset, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("140813ba", new Object[]{sb, sb2, new Boolean(z), charset, new Boolean(z2)});
            return;
        }
        CharsetDecoder onUnmappableCharacter = charset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).replaceWith("�").onUnmappableCharacter(CodingErrorAction.REPORT);
        ByteBuffer allocate = ByteBuffer.allocate(sb2.length());
        int i = 0;
        while (i < sb2.length()) {
            char charAt = sb2.charAt(i);
            i++;
            if (charAt != '%') {
                char c = '+';
                if (charAt != '+') {
                    f(sb, onUnmappableCharacter, allocate, z2);
                    sb.append(charAt);
                } else {
                    f(sb, onUnmappableCharacter, allocate, z2);
                    if (z) {
                        c = ' ';
                    }
                    sb.append(c);
                }
            } else {
                int i2 = 0;
                byte b = 0;
                while (true) {
                    if (i2 >= 2) {
                        break;
                    }
                    try {
                        char a2 = a(sb2, i, sb2.length(), null);
                        int i3 = i + 1;
                        int b2 = b(a2);
                        if (b2 >= 0) {
                            b = (byte) ((b * 16) + b2);
                            i2++;
                            i = i3;
                        } else if (!z2) {
                            f(sb, onUnmappableCharacter, allocate, z2);
                            sb.append((char) 65533);
                            i = i3;
                        } else {
                            throw new IllegalArgumentException(d(sb2, null, a2, i));
                        }
                    } catch (URISyntaxException e) {
                        if (!z2) {
                            f(sb, onUnmappableCharacter, allocate, z2);
                            sb.append((char) 65533);
                            return;
                        }
                        throw new IllegalArgumentException(e);
                    }
                }
                allocate.put(b);
            }
        }
        f(sb, onUnmappableCharacter, allocate, z2);
    }
}
