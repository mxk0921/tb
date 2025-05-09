package com.alipay.security.mobile.ifaa.adapter.ta;

import android.content.Context;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.PackageUtils;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.alipay.security.mobile.ifaa.adapter.IFAAManagerAdapter;
import com.alipay.security.mobile.util.ByteUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TAInterationV1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static byte[] packageSign;

    private static Result buildResult(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("6a2c52f9", new Object[]{bArr});
        }
        if (bArr == null || bArr.length < 8) {
            return new Result(405, null);
        }
        byte[] bArr2 = new byte[bArr.length - 8];
        ByteUtils.copy(bArr, 8, bArr.length - 8, bArr2, 0);
        Result result = new Result();
        result.setStatus(ByteUtils.toInt(bArr));
        result.setData(bArr2);
        return result;
    }

    private static byte[] doSendData(Context context, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("748c5932", new Object[]{context, bArr});
        }
        return IFAAManagerAdapter.getInstance(context).invokeCmd(bArr);
    }

    public static byte[] getHeader(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("7af061f", new Object[]{context});
        }
        try {
            if (packageSign == null) {
                packageSign = PackageUtils.getApkKeyHashBytes(context, context.getPackageName());
            }
            byte[] bytes = context.getPackageName().getBytes();
            int length = packageSign.length;
            int length2 = bytes.length;
            byte[] bArr = new byte[length + 12 + length2];
            System.arraycopy(ByteUtils.toBytes(1), 0, bArr, 0, 4);
            System.arraycopy(ByteUtils.toBytes(length), 0, bArr, 4, 4);
            System.arraycopy(packageSign, 0, bArr, 8, length);
            System.arraycopy(ByteUtils.toBytes(length2), 0, bArr, 8 + length, 4);
            System.arraycopy(bytes, 0, bArr, length + 12, length2);
            return bArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Result sendCommand(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("280e048d", new Object[]{context, new Integer(i)});
        }
        byte[] header = getHeader(context);
        if (header == null || header.length == 0) {
            return new Result(101, null);
        }
        int length = header.length;
        byte[] bArr = new byte[length + 4];
        System.arraycopy(header, 0, bArr, 0, length);
        System.arraycopy(ByteUtils.toBytes(i), 0, bArr, length, 4);
        return buildResult(doSendData(context, bArr));
    }

    public static Result sendCommandAndData(Context context, int i, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("982dc6eb", new Object[]{context, new Integer(i), bArr});
        }
        if (bArr == null || bArr.length == 0) {
            return sendCommand(context, i);
        }
        byte[] header = getHeader(context);
        if (header == null || header.length == 0) {
            return new Result(101, null);
        }
        int length = header.length;
        int length2 = bArr.length;
        byte[] bArr2 = new byte[length + 8 + length2];
        System.arraycopy(header, 0, bArr2, 0, length);
        System.arraycopy(ByteUtils.toBytes(i), 0, bArr2, length, 4);
        System.arraycopy(ByteUtils.toBytes(length2), 0, bArr2, length + 4, 4);
        System.arraycopy(bArr, 0, bArr2, length + 8, length2);
        return buildResult(doSendData(context, bArr2));
    }
}
