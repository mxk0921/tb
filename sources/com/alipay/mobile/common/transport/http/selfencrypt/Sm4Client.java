package com.alipay.mobile.common.transport.http.selfencrypt;

import android.text.TextUtils;
import com.alipay.mobile.common.mpaas_crypto.Client;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Sm4Client {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Sm4Client b;

    /* renamed from: a  reason: collision with root package name */
    public final Client f4097a;

    public Sm4Client() {
        if (a()) {
            Client client = new Client();
            this.f4097a = client;
            client.init(null, null, null);
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.SM4_ENCRYPT), "T")) {
            return true;
        }
        return false;
    }

    public static Sm4Client getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Sm4Client) ipChange.ipc$dispatch("f4e8ed67", new Object[0]);
        }
        Sm4Client sm4Client = b;
        if (sm4Client != null) {
            return sm4Client;
        }
        synchronized (Sm4Client.class) {
            try {
                if (b == null) {
                    b = new Sm4Client();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public byte[] decryptSm4(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8bd500fb", new Object[]{this, bArr, bArr2});
        }
        try {
            if (!a()) {
                return bArr2;
            }
            return this.f4097a.decryptSm4(bArr, bArr2);
        } catch (Throwable th) {
            LogCatUtil.error("Sm4Client", "decryptSm4 ex: " + th.toString());
            return null;
        }
    }

    public byte[] encryptSm4(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("42a055d3", new Object[]{this, bArr, bArr2});
        }
        try {
            if (!a()) {
                return bArr2;
            }
            return this.f4097a.encryptSm4(bArr, bArr2);
        } catch (Throwable th) {
            LogCatUtil.error("Sm4Client", "encryptSm4 ex: " + th.toString());
            return null;
        }
    }
}
