package com.vivo.push;

import android.content.Intent;
import com.vivo.push.f.aa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IPushClientFactory {
    aa createReceiveTask(v vVar);

    v createReceiverCommand(Intent intent);

    s createTask(v vVar);
}
