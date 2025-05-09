package anet.channel.assist;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IAssistManager {
    ICapability getCapability(int i);

    void initialize(Context context);

    boolean isInitialized();
}
