package tb;

import android.util.Pair;
import com.taobao.phenix.intf.PhenixCreator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface qkd {
    Pair<String, String> getDefaultRetryUrlPair();

    String getRetryUrl(PhenixCreator phenixCreator, Throwable th);
}
