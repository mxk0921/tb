package com.taobao.android.tlog.protocol.model.reply.base;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.request.base.FileInfo;
import java.util.LinkedHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class UploadTokenInfo extends LinkedHashMap<String, String> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;
    public FileInfo fileInfo;

    static {
        t2o.a(856686618);
    }

    public static /* synthetic */ Object ipc$super(UploadTokenInfo uploadTokenInfo, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tlog/protocol/model/reply/base/UploadTokenInfo");
    }

    public UploadTokenInfo set(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UploadTokenInfo) ipChange.ipc$dispatch("dc2bebf0", new Object[]{this, str, str2});
        }
        put(str, str2);
        return this;
    }
}
