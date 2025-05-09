package com.alipay.mobile.common.logging.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HybridEncryption {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static HybridEncryption g;

    /* renamed from: a  reason: collision with root package name */
    public final String f3989a;
    public byte[] b;
    public byte[] c;
    public boolean d;
    public boolean e;
    public boolean f;

    public HybridEncryption(Context context) {
        this.f3989a = a(context);
    }

    public static String a(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            applicationInfo = null;
        }
        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
            return null;
        }
        return bundle.getString("setting.logging.encryption.pubkey");
    }

    public static synchronized HybridEncryption createInstance(Context context) {
        synchronized (HybridEncryption.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HybridEncryption) ipChange.ipc$dispatch("aefe7887", new Object[]{context});
            }
            if (g == null) {
                g = new HybridEncryption(context);
            }
            return g;
        }
    }

    public static HybridEncryption getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HybridEncryption) ipChange.ipc$dispatch("4eb90e45", new Object[0]);
        }
        HybridEncryption hybridEncryption = g;
        if (hybridEncryption != null) {
            return hybridEncryption;
        }
        throw new IllegalStateException("need createInstance befor use");
    }

    public byte[] encrypt(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c457156a", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        }
        if (this.b == null || this.c == null) {
            try {
                bArr2 = UUID.randomUUID().toString().getBytes();
            } catch (Throwable unused) {
                if (!this.d) {
                    this.d = true;
                }
                bArr2 = null;
            }
            if (bArr2 == null) {
                try {
                    bArr2 = String.valueOf(System.currentTimeMillis()).getBytes();
                } catch (Throwable unused2) {
                    if (!this.e) {
                        this.e = true;
                    }
                }
            }
            byte[] rawKey = AESUtil.getRawKey(bArr2);
            this.b = rawKey;
            this.c = RSAUtil.encrypt(rawKey, this.f3989a);
        }
        byte[] bArr3 = this.b;
        if (!(bArr3 == null || this.c == null)) {
            try {
                return AESUtil.encrypt(bArr3, bArr, i, i2);
            } catch (Throwable unused3) {
                if (!this.f) {
                    this.f = true;
                }
            }
        }
        return null;
    }

    public byte[] getSecureSeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("683c2978", new Object[]{this});
        }
        return this.c;
    }
}
