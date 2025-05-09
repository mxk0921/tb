package com.alipay.mobile.common.transport.ext;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.c;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class WireProtobufCodecImpl implements ProtobufCodec {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public boolean isPBBean(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66457613", new Object[]{this, obj})).booleanValue();
        }
        try {
            return obj instanceof Message;
        } catch (Throwable th) {
            LogCatUtil.warn("WireProtobufCodecImpl", "isPBBean object " + th.toString());
            return false;
        }
    }

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public byte[] serialize(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e93ef1ba", new Object[]{this, obj});
        }
        if (obj instanceof Message) {
            return ((Message) obj).toByteArray();
        }
        return null;
    }

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public String toString(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3cf5fa71", new Object[]{this, obj});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public Object deserialize(Type type, byte[] bArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d52caa36", new Object[]{this, type, bArr});
        }
        if (type == null) {
            throw new IllegalArgumentException("type maybe null.");
        } else if (type instanceof Class) {
            try {
                return new c(new Class[0]).e(bArr, (Class) type);
            } catch (Throwable th) {
                String exportBase64RawResp = ProtobufCodecImpl.exportBase64RawResp(bArr);
                StringBuilder sb = new StringBuilder("deserialize fail. type is ");
                sb.append(type.toString());
                sb.append(", ");
                if (!TextUtils.isEmpty(exportBase64RawResp)) {
                    str = "pb data:[" + exportBase64RawResp + "]";
                } else {
                    str = "";
                }
                sb.append(str);
                LogCatUtil.error("WireProtobufCodecImpl", sb.toString(), th);
                throw new RuntimeException(th);
            }
        } else {
            throw new IllegalArgumentException("type is not Class Type.");
        }
    }

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public boolean isPBBean(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16a8beae", new Object[]{this, cls})).booleanValue();
        }
        try {
            return Message.class.isAssignableFrom(cls);
        } catch (Throwable th) {
            LogCatUtil.warn("WireProtobufCodecImpl", "isPBBean class " + th.toString());
            return false;
        }
    }
}
