package com.taobao.android.tlog.protocol.model.reply.base;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class StorageInfo extends LinkedHashMap<String, String> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;

    static {
        t2o.a(856686617);
    }

    public static /* synthetic */ Object ipc$super(StorageInfo storageInfo, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tlog/protocol/model/reply/base/StorageInfo");
    }

    public StorageInfo set(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StorageInfo) ipChange.ipc$dispatch("21d9d4d", new Object[]{this, str, str2});
        }
        put(str, str2);
        return this;
    }
}
