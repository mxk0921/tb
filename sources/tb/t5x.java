package tb;

import com.taobao.android.weex.WeexValue;
import tb.b6x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface t5x {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        boolean a();
    }

    b6x.a a();

    t5x addInstanceListener(j6x j6xVar);

    a b(b6x b6xVar);

    t5x c(int i, int i2);

    t5x initWithData(byte[] bArr, String str);

    t5x initWithURL(String str);

    t5x render(WeexValue weexValue);

    t5x setTag(String str, Object obj);

    t5x updateInstanceEnv(String str, WeexValue weexValue);
}
