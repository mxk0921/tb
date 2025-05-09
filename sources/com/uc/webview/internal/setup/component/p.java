package com.uc.webview.internal.setup.component;

import android.content.Context;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.KeyIdMap;
import com.uc.webview.base.io.PathUtils;
import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    final String f14436a;
    final int b;
    final boolean c;
    final int d;
    final int e;
    final String f;
    final String g;
    final int h;
    final File i;
    final String[] j;

    public p(String str, int i) {
        this(str, i, true, 0, str, "", null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14436a);
        sb.append("/");
        sb.append(this.b);
        if (this.e == 1) {
            str = "/" + this.f;
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public p(String str, int i, int i2, String str2, String str3) {
        this(str, i, true, i2, str2, str3, null);
    }

    public p(String str, int i, boolean z, int i2, String str2, String str3, String[] strArr) {
        this.f14436a = str;
        this.b = i;
        this.c = z;
        this.d = 0;
        this.e = i2;
        Context context = EnvInfo.getContext();
        this.h = KeyIdMap.getId(str + "Dir");
        this.i = new File(PathUtils.g(context), str);
        this.j = strArr;
        if (i2 == 1) {
            String a2 = y.a(str2, str);
            this.f = a2;
            this.g = (str3 + "/" + a2).toLowerCase();
            return;
        }
        this.f = "";
        this.g = "";
    }
}
