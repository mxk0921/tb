package com.alipay.android.phone.iifaa.did.common.security.crypto;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import tb.gtx;
import tb.lsx;
import tb.lux;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CryptoImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static native byte[] processCmd(int i, byte[] bArr);

    public byte[] a(int i, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("9e10277b", new Object[]{this, new Integer(i), bArr});
        }
        if (i == 0) {
            return processCmd(8, bArr);
        }
        if (i == 1) {
            return processCmd(9, bArr);
        }
        return null;
    }

    public byte[] b(String str, String str2, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8d5e3f59", new Object[]{this, str, str2, bArr});
        }
        if (!"SM2".equals(str)) {
            lux.a().c("CryptoImpl", "Only Support SM2 algorithm");
            return null;
        }
        byte[] n = lsx.n(str2);
        ByteBuffer order = ByteBuffer.allocate(n.length + 8 + bArr.length).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(n.length).put(n).putInt(bArr.length).put(bArr);
        return processCmd(4, order.array());
    }

    public byte[] a(String str, String str2, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ca71d5fa", new Object[]{this, str, str2, bArr});
        }
        if (!"SM2".equals(str)) {
            lux.a().c("CryptoImpl", "Only Support SM2 algorithm");
            return null;
        }
        byte[] n = lsx.n(str2);
        ByteBuffer order = ByteBuffer.allocate(n.length + 8 + bArr.length).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(n.length).put(n).putInt(bArr.length).put(bArr);
        return processCmd(5, order.array());
    }

    public byte[] b(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("4f1b995", new Object[]{this, str, bArr, bArr2, bArr3});
        }
        if (!"SM4_CBC_PKCS7Padding".equals(str)) {
            lux.a().c("CryptoImpl", "Only Support SM4_CBC_PKCS7Padding");
            return null;
        }
        ByteBuffer order = ByteBuffer.allocate(bArr.length + 8 + bArr2.length + 4 + bArr3.length).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(bArr.length).put(bArr).putInt(bArr2.length).put(bArr2).putInt(bArr3.length).put(bArr3);
        return processCmd(6, order.array());
    }

    public byte[] a(String str, byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a1b329dd", new Object[]{this, str, bArr, bArr2});
        }
        byte[] n = lsx.n(str);
        ByteBuffer order = ByteBuffer.allocate(n.length + 8 + (bArr2 == null ? 0 : bArr2.length) + 4 + bArr.length).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(n.length).put(n);
        if (bArr2 == null) {
            order.putInt(0);
        } else {
            order.putInt(bArr2.length).put(bArr2);
        }
        order.putInt(bArr.length).put(bArr);
        byte[] processCmd = processCmd(2, order.array());
        lux a2 = lux.a();
        StringBuilder sb = new StringBuilder("signSM2 res :");
        sb.append(processCmd == null ? "Faild" : lsx.g(processCmd));
        a2.c("CryptoImpl", sb.toString());
        return processCmd;
    }

    public byte[] a(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("4450df6", new Object[]{this, str, bArr, bArr2, bArr3});
        }
        if (!"SM4_CBC_PKCS7Padding".equals(str)) {
            lux.a().c("CryptoImpl", "Only Support SM4_CBC_PKCS7Padding");
            return null;
        }
        ByteBuffer order = ByteBuffer.allocate(bArr.length + 8 + bArr2.length + 4 + bArr3.length).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(bArr.length).put(bArr).putInt(bArr2.length).put(bArr2).putInt(bArr3.length).put(bArr3);
        return processCmd(7, order.array());
    }

    public gtx a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gtx) ipChange.ipc$dispatch("925140d3", new Object[]{this});
        }
        byte[] processCmd = processCmd(1, null);
        if (processCmd == null) {
            return null;
        }
        ByteBuffer order = ByteBuffer.wrap(processCmd).order(ByteOrder.LITTLE_ENDIAN);
        int i = order.getInt();
        byte[] bArr = new byte[i];
        order.get(bArr, 0, i);
        int i2 = order.getInt();
        byte[] bArr2 = new byte[i2];
        order.get(bArr2, 0, i2);
        return new gtx(lsx.k(bArr), lsx.k(bArr2));
    }
}
