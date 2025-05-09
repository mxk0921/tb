package com.alipay.mobile.common.transport.ext;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class GoogleProtobuf3CodecImpl implements ProtobufCodec {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Class f4061a = null;
    public Class b = null;

    public Class getGeneratedMessageLiteClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("e530fb50", new Object[]{this});
        }
        this.b = null;
        try {
            this.b = Class.forName("com.google.protobuf.GeneratedMessageLite");
            return this.b;
        } catch (Throwable unused) {
            return this.b;
        }
    }

    public Class getGeneratedMessageV3Class() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("65aab8e1", new Object[]{this});
        }
        Class cls = this.f4061a;
        if (cls != null) {
            return cls;
        }
        try {
            this.f4061a = Class.forName("com.google.protobuf.GeneratedMessageV3");
            return this.f4061a;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean isGoogleProtobuf(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be05dac", new Object[]{this, cls})).booleanValue();
        }
        Class generatedMessageV3Class = getGeneratedMessageV3Class();
        if (generatedMessageV3Class != null && generatedMessageV3Class.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }

    public final boolean isGoogleProtobufLite(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("634e8c9e", new Object[]{this, cls})).booleanValue();
        }
        Class generatedMessageLiteClass = getGeneratedMessageLiteClass();
        if (generatedMessageLiteClass != null && generatedMessageLiteClass.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public boolean isPBBean(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66457613", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null) {
            LogCatUtil.warn("GoogleProtobuf3CodecImpl", "[isPBBean] object is null.");
            return false;
        }
        Class<?> cls = obj.getClass();
        return isGoogleProtobuf(cls) || isGoogleProtobufLite(cls);
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
    public byte[] serialize(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("object maybe null.");
        } else if (isPBBean((Class) obj.getClass())) {
            try {
                return (byte[]) obj.getClass().getMethod("toByteArray", new Class[0]).invoke(obj, new Object[0]);
            } catch (Throwable th) {
                LogCatUtil.error("GoogleProtobuf3CodecImpl", "serialize fail. type is ".concat(obj.getClass().getName()), th);
                throw new RuntimeException(th);
            }
        } else {
            throw new UnsupportedOperationException("[deserialize] Not support google protobuf , class = ".concat(obj.getClass().getName()));
        }
    }

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public boolean isPBBean(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16a8beae", new Object[]{this, cls})).booleanValue();
        }
        if (cls != null) {
            return isGoogleProtobuf(cls) || isGoogleProtobufLite(cls);
        }
        LogCatUtil.warn("GoogleProtobuf3CodecImpl", "[isPBBean] clazz is null.");
        return false;
    }

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public Object deserialize(Type type, byte[] bArr) {
        String str;
        if (type == null) {
            throw new IllegalArgumentException("type maybe null.");
        } else if (!(type instanceof Class)) {
            throw new IllegalArgumentException("type is not Class Type.");
        } else if (bArr != null) {
            Class cls = (Class) type;
            if (isPBBean(cls)) {
                try {
                    return cls.getDeclaredMethod("parseFrom", byte[].class).invoke(cls, bArr);
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
                    LogCatUtil.error("GoogleProtobuf3CodecImpl", sb.toString(), th);
                    throw new RuntimeException(th);
                }
            } else {
                throw new UnsupportedOperationException("[deserialize] Not support google protobuf , class = ".concat(cls.getName()));
            }
        } else {
            throw new IllegalArgumentException("data maybe null.");
        }
    }
}
