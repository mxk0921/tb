package tb;

import android.net.Uri;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface dnv {
    boolean hostFilter(String str);

    boolean pathFilter(String str);

    boolean queryFilter(Uri uri);

    boolean schemeFilter(String str);
}
