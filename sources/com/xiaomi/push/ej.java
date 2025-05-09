package com.xiaomi.push;

import android.content.Context;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ej extends ei {
    public ej(Context context, int i) {
        super(context, i);
    }

    @Override // com.xiaomi.push.ei, com.xiaomi.push.ah.a
    /* renamed from: a */
    public ie mo607a() {
        return ie.Storage;
    }

    @Override // com.xiaomi.push.ei
    public String b() {
        return "ram:" + i.m776a() + ",rom:" + i.m780b() + "|ramOriginal:" + i.c() + ",romOriginal:" + i.d();
    }

    @Override // com.xiaomi.push.ei, com.xiaomi.push.ah.a
    /* renamed from: a  reason: collision with other method in class */
    public String mo607a() {
        return AgooConstants.REPORT_DUPLICATE_FAIL;
    }
}
