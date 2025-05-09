package com.alipay.mobile.common.transport.ext;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ProtobufCodecFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static WireProtobufCodecImpl f4063a;
    public static GoogleProtobuf3CodecImpl b;
    public static ProtobufCodecImpl c;

    public static final ProtobufCodec getDefaultProtobufCodec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProtobufCodec) ipChange.ipc$dispatch("88970ff5", new Object[0]);
        }
        ProtobufCodecImpl protobufCodecImpl = c;
        if (protobufCodecImpl != null) {
            return protobufCodecImpl;
        }
        synchronized (ProtobufCodecImpl.class) {
            try {
                ProtobufCodecImpl protobufCodecImpl2 = c;
                if (protobufCodecImpl2 != null) {
                    return protobufCodecImpl2;
                }
                ProtobufCodecImpl protobufCodecImpl3 = new ProtobufCodecImpl();
                c = protobufCodecImpl3;
                return protobufCodecImpl3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final ProtobufCodec getGoogleProtobufCodec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProtobufCodec) ipChange.ipc$dispatch("4bfe7419", new Object[0]);
        }
        GoogleProtobuf3CodecImpl googleProtobuf3CodecImpl = b;
        if (googleProtobuf3CodecImpl != null) {
            return googleProtobuf3CodecImpl;
        }
        synchronized (GoogleProtobuf3CodecImpl.class) {
            try {
                GoogleProtobuf3CodecImpl googleProtobuf3CodecImpl2 = b;
                if (googleProtobuf3CodecImpl2 != null) {
                    return googleProtobuf3CodecImpl2;
                }
                GoogleProtobuf3CodecImpl googleProtobuf3CodecImpl3 = new GoogleProtobuf3CodecImpl();
                b = googleProtobuf3CodecImpl3;
                return googleProtobuf3CodecImpl3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final ProtobufCodec getWireProtobufCodec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProtobufCodec) ipChange.ipc$dispatch("64e8a2e5", new Object[0]);
        }
        WireProtobufCodecImpl wireProtobufCodecImpl = f4063a;
        if (wireProtobufCodecImpl != null) {
            return wireProtobufCodecImpl;
        }
        synchronized (WireProtobufCodecImpl.class) {
            try {
                WireProtobufCodecImpl wireProtobufCodecImpl2 = f4063a;
                if (wireProtobufCodecImpl2 != null) {
                    return wireProtobufCodecImpl2;
                }
                WireProtobufCodecImpl wireProtobufCodecImpl3 = new WireProtobufCodecImpl();
                f4063a = wireProtobufCodecImpl3;
                return wireProtobufCodecImpl3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
