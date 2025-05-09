package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class nxo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f25021a;
    public final byte[] b;

    static {
        t2o.a(985661449);
    }

    public nxo(String str) {
        this.f25021a = str;
    }

    public byte[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("7cd7a09f", new Object[]{this});
        }
        return this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this});
        }
        return this.f25021a;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        if (!TextUtils.isEmpty(this.f25021a)) {
            return false;
        }
        byte[] bArr = this.b;
        if (bArr == null || bArr.length == 0) {
            return true;
        }
        return false;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("451fdc60", new Object[]{this})).intValue();
        }
        String str = this.f25021a;
        if (str != null) {
            return str.length();
        }
        byte[] bArr = this.b;
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    public nxo(byte[] bArr) {
        this.b = bArr;
    }
}
