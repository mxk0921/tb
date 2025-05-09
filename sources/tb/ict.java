package tb;

import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ict {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final mct f21243a;

    static {
        t2o.a(843055305);
    }

    public ict() {
        this.f21243a = new mct();
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        String stringBuffer = this.f21243a.f23945a.toString();
        StringBuffer stringBuffer2 = this.f21243a.d;
        if (stringBuffer2 == null || stringBuffer2.toString().equals("")) {
            return stringBuffer;
        }
        return this.f21243a.d.toString() + "/" + stringBuffer;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b972", new Object[]{this})).longValue();
        }
        return this.f21243a.b;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4b5fb6e", new Object[]{this})).booleanValue();
        }
        mct mctVar = this.f21243a;
        if (mctVar == null || (mctVar.c != 53 && !mctVar.f23945a.toString().endsWith("/"))) {
            return false;
        }
        return true;
    }

    public void d(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d8a3d6d", new Object[]{this, bArr});
            return;
        }
        this.f21243a.f23945a = mct.a(bArr, 0, 100);
        mct mctVar = this.f21243a;
        slk.a(bArr, 100, 8);
        mctVar.getClass();
        mct mctVar2 = this.f21243a;
        slk.a(bArr, 108, 8);
        mctVar2.getClass();
        mct mctVar3 = this.f21243a;
        slk.a(bArr, 116, 8);
        mctVar3.getClass();
        this.f21243a.b = slk.a(bArr, 124, 12);
        mct mctVar4 = this.f21243a;
        slk.a(bArr, 136, 12);
        mctVar4.getClass();
        mct mctVar5 = this.f21243a;
        slk.a(bArr, 148, 8);
        mctVar5.getClass();
        mct mctVar6 = this.f21243a;
        mctVar6.c = bArr[156];
        mct.a(bArr, 157, 100);
        mctVar6.getClass();
        mct mctVar7 = this.f21243a;
        mct.a(bArr, 257, 8);
        mctVar7.getClass();
        mct mctVar8 = this.f21243a;
        mct.a(bArr, 265, 32);
        mctVar8.getClass();
        mct mctVar9 = this.f21243a;
        mct.a(bArr, Result.ALIPAY_TEE_GET_USERNAME_FILED, 32);
        mctVar9.getClass();
        mct mctVar10 = this.f21243a;
        slk.a(bArr, 329, 8);
        mctVar10.getClass();
        mct mctVar11 = this.f21243a;
        slk.a(bArr, 337, 8);
        mctVar11.getClass();
        this.f21243a.d = mct.a(bArr, 345, mct.USTAR_FILENAME_PREFIX);
    }

    public ict(byte[] bArr) {
        this();
        d(bArr);
    }
}
