package tb;

import android.os.Bundle;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final /* synthetic */ class tmb {
    public static Bundle a(boolean z, boolean z2, int i) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("result", z);
        boolean z3 = true;
        if (i <= 1) {
            z3 = false;
        }
        bundle.putBoolean("moreIcons", z3);
        bundle.putInt("enableLaunchers", i);
        bundle.putBoolean("timeOut", z2);
        return bundle;
    }
}
