package com.alibaba.ariver.kernel.api.extension.registry;

import com.alibaba.ariver.kernel.api.bytedata.ByteOrderDataUtil;
import com.alibaba.ariver.kernel.api.extension.registry.NebulaConfigBase;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class NebulaConfigBase<T extends NebulaConfigBase<T>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public byte mFormatVersion;

    public NebulaConfigBase(byte b) {
        this.mFormatVersion = b;
    }

    public T deserialize(BufferedInputStream bufferedInputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((NebulaConfigBase) ipChange.ipc$dispatch("3e79170d", new Object[]{this, bufferedInputStream}));
        }
        this.mFormatVersion = ByteOrderDataUtil.readByte(bufferedInputStream);
        return this;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof NebulaConfigBase) || obj.hashCode() != hashCode()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return super.hashCode();
    }

    public T serialize(BufferedOutputStream bufferedOutputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((NebulaConfigBase) ipChange.ipc$dispatch("a5ba933b", new Object[]{this, bufferedOutputStream}));
        }
        ByteOrderDataUtil.writeByte(bufferedOutputStream, this.mFormatVersion);
        return this;
    }
}
