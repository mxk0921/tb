package tb;

import android.util.Log;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class x1d {
    public static void a(File file) {
        if (file != null && file.exists() && !file.delete()) {
            Log.e("IOUtil", "deleteSecure exception");
        }
    }
}
