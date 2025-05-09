package tb;

import com.alibaba.ut.abtest.internal.util.hash.HashCode;
import java.nio.charset.Charset;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface eua {
    HashCode hashString(CharSequence charSequence, Charset charset);

    hua newHasher();
}
