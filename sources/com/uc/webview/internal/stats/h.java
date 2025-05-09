package com.uc.webview.internal.stats;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class h extends ArrayList<c> {

    /* renamed from: a  reason: collision with root package name */
    final String f14513a;

    public h(String str) {
        this.f14513a = str;
    }

    public final void a() {
        if (!isEmpty()) {
            Iterator<c> it = iterator();
            while (it.hasNext()) {
                c next = it.next();
                e.a(next.g(), next.e());
            }
            clear();
        }
    }
}
