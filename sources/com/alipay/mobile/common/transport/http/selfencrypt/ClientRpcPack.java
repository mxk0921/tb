package com.alipay.mobile.common.transport.http.selfencrypt;

import com.alipay.mobile.common.mpaas_crypto.Client;
import com.alipay.mobile.common.transport.utils.GzipUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.MpaasNetConfigUtil;
import com.alipay.mobile.common.transport.utils.NumArrayUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ClientRpcPack {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte ASYMMETRIC_ENCRYPT_ECC = 2;
    public static final byte ASYMMETRIC_ENCRYPT_RSA = 1;
    public static final byte ASYMMETRIC_ENCRYPT_SM2 = 3;
    public static final byte ASYMMETRIC_ENCRYPT_SM4 = 13;
    public static final byte SYMMETRIC_ENCRYPT_3DES = 12;
    public static final byte SYMMETRIC_ENCRYPT_AES = 11;

    /* renamed from: a  reason: collision with root package name */
    public final byte f4096a;
    public final byte b;
    public final int c;
    public final Client d;
    public byte[] e;

    public ClientRpcPack() {
        this.b = (byte) 11;
        boolean z = false;
        this.c = 0;
        if (MpaasNetConfigUtil.isCrypt(TransportEnvUtil.getContext())) {
            byte asymmetricEncryptMethod = MpaasNetConfigUtil.getAsymmetricEncryptMethod(TransportEnvUtil.getContext());
            this.f4096a = asymmetricEncryptMethod;
            if (asymmetricEncryptMethod == 3) {
                this.b = (byte) 13;
            } else {
                this.b = (byte) 11;
            }
            String a2 = a();
            Client client = new Client();
            this.d = client;
            if (asymmetricEncryptMethod == 1) {
                this.c = 0;
                z = client.init(a2, null, null);
            } else if (asymmetricEncryptMethod == 2) {
                this.c = 1;
                z = client.init(null, a2, null);
            } else if (asymmetricEncryptMethod == 3) {
                this.c = 2;
                z = client.init(null, null, a2);
            }
            if (!z) {
                LogCatUtil.error("ClientRpcPack", "fail to init client,error: " + client.error());
            }
        }
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String publicKey = MpaasNetConfigUtil.getPublicKey(TransportEnvUtil.getContext());
        if (MiscUtils.isDebugger(TransportEnvUtil.getContext())) {
            LogCatUtil.printInfo("ClientRpcPack", "pubKey: \n" + publicKey);
        }
        return publicKey;
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        Throwable th;
        DataOutputStream dataOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b2e6bb67", new Object[]{this, bArr, bArr2});
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                dataOutputStream = new DataOutputStream(byteArrayOutputStream2);
                try {
                    byte b = this.f4096a;
                    byte[] mediumToByteArray = NumArrayUtils.mediumToByteArray(bArr.length);
                    byte b2 = this.b;
                    byte[] mediumToByteArray2 = NumArrayUtils.mediumToByteArray(bArr2.length);
                    dataOutputStream.write(b);
                    dataOutputStream.write(mediumToByteArray);
                    dataOutputStream.write(bArr);
                    dataOutputStream.write(b2);
                    dataOutputStream.write(mediumToByteArray2);
                    dataOutputStream.write(bArr2);
                    LogCatUtil.debug("ClientRpcPack", "asymType: " + ((int) b) + ",encryptedKeyLen: " + bArr.length + ",symType: " + ((int) b2) + ",encryptedBodyLen: " + bArr2.length);
                    dataOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception e) {
                        LogCatUtil.error("ClientRpcPack", e);
                    }
                    try {
                        dataOutputStream.close();
                    } catch (Exception e2) {
                        LogCatUtil.error("ClientRpcPack", e2);
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception e3) {
                            LogCatUtil.error("ClientRpcPack", e3);
                        }
                    }
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (Exception e4) {
                            LogCatUtil.error("ClientRpcPack", e4);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                dataOutputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            dataOutputStream = null;
        }
    }

    public byte[] decrypt(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("cd4fbce2", new Object[]{this, bArr});
        }
        try {
            return GzipUtils.unGzip(this.d.decode(this.e, bArr, this.c));
        } catch (Exception e) {
            LogCatUtil.error("ClientRpcPack", "decrypt ex: " + e.toString() + " ,error: " + this.d.error());
            throw e;
        }
    }

    public byte[] encrypt(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("11c8c10a", new Object[]{this, bArr});
        }
        try {
            byte[][] encode = this.d.encode(MiscUtils.generateRandomStr(16).getBytes(), GzipUtils.toGzip(bArr), this.c);
            this.e = encode[0];
            return b(encode[2], encode[1]);
        } catch (Exception e) {
            LogCatUtil.error("ClientRpcPack", "encrypt ex: " + e.toString() + " ,error: " + this.d.error());
            throw e;
        }
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            Client client = this.d;
            if (client != null) {
                client.exit();
                LogCatUtil.debug("ClientRpcPack", "client exit");
            }
            super.finalize();
        } catch (Throwable th) {
            LogCatUtil.error("ClientRpcPack", "finalize ex:" + th.toString());
        }
    }
}
