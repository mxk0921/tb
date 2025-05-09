package android.taobao.windvane.extra.launch;

import android.app.Application;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface ILaunchInitTask {
    String getName();

    void init(Application application, HashMap<String, Object> hashMap);
}
