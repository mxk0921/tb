package com.alipay.mobile.common.rpc.protocol.protobuf;

import android.util.Base64;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.rpc.protocol.AbstractSerializer;
import com.alipay.mobile.common.transport.ext.ProtobufCodec;
import com.alipay.mobile.common.transport.ext.ProtobufCodecFactory;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MonitorErrorLogHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.MessageDigest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PBSerializer extends AbstractSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte VERSION = 2;

    /* renamed from: a  reason: collision with root package name */
    public int f4039a;
    public byte[] b;

    public PBSerializer(int i, String str, Object obj) {
        super(str, obj);
        this.f4039a = i;
    }

    public static /* synthetic */ Object ipc$super(PBSerializer pBSerializer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/rpc/protocol/protobuf/PBSerializer");
    }

    public int getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
        }
        return this.f4039a;
    }

    public String getRequestDataDigest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("315012", new Object[]{this});
        }
        try {
            return new String(Base64.encode(MessageDigest.getInstance("MD5").digest(packet()), 0));
        } catch (Exception e) {
            LogCatUtil.warn("PBSerializer", e);
            return "";
        }
    }

    @Override // com.alipay.mobile.common.rpc.protocol.Serializer
    public byte[] packet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1cd955ae", new Object[]{this});
        }
        return a();
    }

    @Override // com.alipay.mobile.common.rpc.protocol.Serializer
    public void setExtParam(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e618391", new Object[]{this, obj});
        }
    }

    public void setId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ecf45f", new Object[]{this, new Integer(i)});
        } else {
            this.f4039a = i;
        }
    }

    public final byte[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a8212175", new Object[]{this});
        }
        try {
            byte[] bArr = this.b;
            if (bArr != null) {
                return bArr;
            }
            synchronized (this) {
                byte[] bArr2 = this.b;
                if (bArr2 != null) {
                    return bArr2;
                }
                Object obj = this.mParams;
                if (obj == null) {
                    LogCatUtil.warn("PBSerializer", "mParams is null.");
                    byte[] bArr3 = new byte[0];
                    this.b = bArr3;
                    return bArr3;
                } else if (!(obj instanceof Object[])) {
                    LogCatUtil.warn("PBSerializer", "mParams not instanceof Object[].");
                    byte[] bArr4 = new byte[0];
                    this.b = bArr4;
                    return bArr4;
                } else {
                    Object[] objArr = (Object[]) obj;
                    if (objArr.length <= 0) {
                        LogCatUtil.warn("PBSerializer", "Protobuf mParams length=0");
                        byte[] bArr5 = new byte[0];
                        this.b = bArr5;
                        return bArr5;
                    } else if (objArr.length != 1) {
                        LogCatUtil.warn("PBSerializer", "Protobuf mParams noly support one inParameter, params.length=" + objArr.length);
                        return null;
                    } else {
                        ProtobufCodec defaultProtobufCodec = ProtobufCodecFactory.getDefaultProtobufCodec();
                        if (!defaultProtobufCodec.isPBBean(objArr[0])) {
                            LogCatUtil.warn("PBSerializer", "mParams not protobuf bean!");
                            byte[] bArr6 = new byte[0];
                            this.b = bArr6;
                            return bArr6;
                        }
                        this.b = defaultProtobufCodec.serialize(objArr[0]);
                        try {
                            LogCatUtil.info("PBSerializer", "PB Data size=" + this.b.length + ". PB Data=" + this.b.toString() + ".PB Object String = " + defaultProtobufCodec.toString(objArr[0]));
                        } catch (Throwable unused) {
                        }
                        return this.b;
                    }
                }
            }
        } catch (Throwable th) {
            MonitorErrorLogHelper.log("PBSerializer", th);
            throw new RpcException((Integer) 20, th);
        }
    }
}
