package com.vivo.push;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private Bundle f14582a;
    private String b;
    private String c;

    public d(String str, String str2, Bundle bundle) {
        this.b = str;
        this.c = str2;
        this.f14582a = bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x001f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.vivo.push.d a(android.content.Intent r6) {
        /*
            r0 = 0
            java.lang.String r1 = "BundleWapper"
            if (r6 != 0) goto L_0x000b
            java.lang.String r6 = "create error : intent is null"
            com.vivo.push.util.u.a(r1, r6)
            return r0
        L_0x000b:
            android.os.Bundle r2 = r6.getExtras()
            if (r2 == 0) goto L_0x001e
            java.lang.String r3 = "client_pkgname"
            java.lang.String r3 = r2.getString(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r3 = r0
        L_0x001f:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x002a
            java.lang.String r4 = "create warning: pkgName is null"
            com.vivo.push.util.u.b(r1, r4)
        L_0x002a:
            java.lang.String r4 = r6.getPackage()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x004f
            android.content.ComponentName r4 = r6.getComponent()
            if (r4 != 0) goto L_0x003b
            goto L_0x0043
        L_0x003b:
            android.content.ComponentName r6 = r6.getComponent()
            java.lang.String r0 = r6.getPackageName()
        L_0x0043:
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 == 0) goto L_0x004e
            java.lang.String r6 = "create warning: targetPkgName is null"
            com.vivo.push.util.u.b(r1, r6)
        L_0x004e:
            r4 = r0
        L_0x004f:
            com.vivo.push.d r6 = new com.vivo.push.d
            r6.<init>(r3, r4, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.d.a(android.content.Intent):com.vivo.push.d");
    }

    public final int b(String str, int i) {
        Bundle bundle = this.f14582a;
        return bundle == null ? i : bundle.getInt(str, i);
    }

    public final ArrayList<String> c(String str) {
        Bundle bundle = this.f14582a;
        if (bundle == null) {
            return null;
        }
        return bundle.getStringArrayList(str);
    }

    public final Serializable d(String str) {
        Bundle bundle = this.f14582a;
        if (bundle == null) {
            return null;
        }
        return bundle.getSerializable(str);
    }

    public final boolean e(String str) {
        Bundle bundle = this.f14582a;
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean(str, false);
    }

    public final byte[] b(String str) {
        Bundle bundle = this.f14582a;
        if (bundle == null) {
            return null;
        }
        return bundle.getByteArray(str);
    }

    public final long b(String str, long j) {
        Bundle bundle = this.f14582a;
        return bundle == null ? j : bundle.getLong(str, j);
    }

    public final Bundle b() {
        return this.f14582a;
    }

    public final void a(String str, int i) {
        if (this.f14582a == null) {
            this.f14582a = new Bundle();
        }
        this.f14582a.putInt(str, i);
    }

    public final void a(String str, long j) {
        if (this.f14582a == null) {
            this.f14582a = new Bundle();
        }
        this.f14582a.putLong(str, j);
    }

    public final void a(String str, String str2) {
        if (this.f14582a == null) {
            this.f14582a = new Bundle();
        }
        this.f14582a.putString(str, str2);
    }

    public final void a(String str, byte[] bArr) {
        if (this.f14582a == null) {
            this.f14582a = new Bundle();
        }
        this.f14582a.putByteArray(str, bArr);
    }

    public final void a(String str, Serializable serializable) {
        if (this.f14582a == null) {
            this.f14582a = new Bundle();
        }
        this.f14582a.putSerializable(str, serializable);
    }

    public final void a(String str, boolean z) {
        if (this.f14582a == null) {
            this.f14582a = new Bundle();
        }
        this.f14582a.putBoolean(str, z);
    }

    public final void a(String str, ArrayList<String> arrayList) {
        if (this.f14582a == null) {
            this.f14582a = new Bundle();
        }
        this.f14582a.putStringArrayList(str, arrayList);
    }

    public final String a(String str) {
        Bundle bundle = this.f14582a;
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str);
    }

    public final String a() {
        return this.b;
    }
}
