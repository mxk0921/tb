package org.ifaa.android.manager;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class IFAAManager {
    public abstract String getDeviceModel();

    public abstract int getSupportBIOTypes(Context context);

    public abstract int getVersion();

    public native byte[] processCmd(Context context, byte[] bArr);

    public abstract int startBIOManager(Context context, int i);
}
