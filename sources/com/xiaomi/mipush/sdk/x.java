package com.xiaomi.mipush.sdk;

import android.text.TextUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class x {

    /* renamed from: a  reason: collision with root package name */
    int f14743a = 0;

    /* renamed from: a  reason: collision with other field name */
    String f713a = "";

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (TextUtils.isEmpty(xVar.f713a) || !xVar.f713a.equals(this.f713a)) {
            return false;
        }
        return true;
    }
}
