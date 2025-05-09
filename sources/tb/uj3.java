package tb;

import com.alibaba.ariver.remoterpc.EncodingUtils;
import java.nio.charset.Charset;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class uj3 {
    public static final uj3 INSTANCE = new uj3();
    public static final Charset ISO_8859_1;
    public static final Charset US_ASCII;
    public static final Charset UTF_16;
    public static final Charset UTF_16BE;
    public static final Charset UTF_16LE;
    public static final Charset UTF_8;

    static {
        Charset forName = Charset.forName("UTF-8");
        ckf.f(forName, "forName(...)");
        UTF_8 = forName;
        Charset forName2 = Charset.forName("UTF-16");
        ckf.f(forName2, "forName(...)");
        UTF_16 = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        ckf.f(forName3, "forName(...)");
        UTF_16BE = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        ckf.f(forName4, "forName(...)");
        UTF_16LE = forName4;
        Charset forName5 = Charset.forName(EncodingUtils.US_ASCII);
        ckf.f(forName5, "forName(...)");
        US_ASCII = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        ckf.f(forName6, "forName(...)");
        ISO_8859_1 = forName6;
    }
}
