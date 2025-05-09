package tb;

import android.content.Context;
import com.taobao.android.turbo.TurboEngineConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface qpu {
    TurboEngineConfig a();

    Context getContext();

    String getInstanceId();

    <T extends sod> T getService(Class<T> cls);
}
