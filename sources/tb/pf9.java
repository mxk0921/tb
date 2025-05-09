package tb;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.zip.ZipInputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final /* synthetic */ class pf9 {
    public static /* synthetic */ ZipInputStream a(InputStream inputStream, Charset charset) {
        return new ZipInputStream(inputStream, charset);
    }
}
