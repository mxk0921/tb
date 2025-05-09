package tb;

import android.os.Build;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xfo {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f31360a = null;

    public static xfo d(String str, String str2, String str3, String str4) {
        xfo xfoVar = new xfo();
        xfoVar.a(str, str2, str3, str4);
        return xfoVar;
    }

    public final void a(String str, String str2, String str3, String str4) {
        b(str, str2, str3, sva.b(str4));
    }

    public final void b(String str, String str2, String str3, byte[] bArr) {
        if (Build.VERSION.SDK_INT < 26) {
            vwx.c("RootKeyUtil", "initRootKey: sha1");
            this.f31360a = ow1.h(str, str2, str3, bArr, false);
            return;
        }
        vwx.c("RootKeyUtil", "initRootKey: sha256");
        this.f31360a = ow1.h(str, str2, str3, bArr, true);
    }

    public byte[] c() {
        return (byte[]) this.f31360a.clone();
    }
}
