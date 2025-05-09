package com.alipay.android.phone.mobilesdk.socketcraft.client;

import com.alipay.android.phone.mobilesdk.socketcraft.AbstractWrappedByteChannel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class AbstractClientProxyChannel extends AbstractWrappedByteChannel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ByteBuffer proxyHandshake;

    public AbstractClientProxyChannel(ByteChannel byteChannel) {
        super(byteChannel);
        try {
            this.proxyHandshake = ByteBuffer.wrap(buildHandShake().getBytes("ASCII"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static /* synthetic */ Object ipc$super(AbstractClientProxyChannel abstractClientProxyChannel, String str, Object... objArr) {
        if (str.hashCode() == -1457964002) {
            return new Integer(super.write((ByteBuffer) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/phone/mobilesdk/socketcraft/client/AbstractClientProxyChannel");
    }

    public abstract String buildHandShake();

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.AbstractWrappedByteChannel, java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9193c1e", new Object[]{this, byteBuffer})).intValue();
        }
        if (!this.proxyHandshake.hasRemaining()) {
            return super.write(byteBuffer);
        }
        return super.write(this.proxyHandshake);
    }
}
