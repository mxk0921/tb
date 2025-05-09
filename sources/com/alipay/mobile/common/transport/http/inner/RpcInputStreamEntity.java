package com.alipay.mobile.common.transport.http.inner;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.InputStreamEntity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RpcInputStreamEntity extends InputStreamEntity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public RpcInputStreamEntity(InputStream inputStream, long j) {
        super(inputStream, j);
    }

    public static /* synthetic */ Object ipc$super(RpcInputStreamEntity rpcInputStreamEntity, String str, Object... objArr) {
        if (str.hashCode() == -1862539917) {
            RpcInputStreamEntity.super.writeTo((OutputStream) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/http/inner/RpcInputStreamEntity");
    }

    public void writeTo(OutputStream outputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90fbe573", new Object[]{this, outputStream});
        } else {
            RpcInputStreamEntity.super.writeTo(outputStream);
        }
    }
}
