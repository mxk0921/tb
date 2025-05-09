package anet.channel.assist;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IOperator {
    ICapability getCapability(int i);

    boolean isEnable();

    void register(Context context);
}
