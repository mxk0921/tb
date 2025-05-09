package tb;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface hfc {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        String onIntercept(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        Fragment a();

        Bundle b();

        boolean c();

        Bundle getExtras();

        int getRequestCode();
    }

    boolean a(Context context, b bVar, String str, View view, peu peuVar);

    boolean b(Context context, String str);

    boolean c(Context context, b bVar, String str, View view, boolean z);
}
