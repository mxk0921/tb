package com.ali.alidatabasees;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DBConnection extends NativeBridgedObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public DBConnection(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(DBConnection dBConnection, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/alidatabasees/DBConnection");
    }

    private native long nativeCreateStatement(String str);

    private native long nativePrepareStatement(String str);
}
