package com.meizu.cloud.pushsdk.e.h;

import com.alipay.android.msp.framework.okio.SegmentPool;
import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static j f5850a;
    private static long b;

    private k() {
    }

    public static j a() {
        synchronized (k.class) {
            try {
                j jVar = f5850a;
                if (jVar == null) {
                    return new j();
                }
                f5850a = jVar.f;
                jVar.f = null;
                b -= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
                return jVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(j jVar) {
        if (jVar.f != null || jVar.g != null) {
            throw new IllegalArgumentException();
        } else if (!jVar.d) {
            synchronized (k.class) {
                try {
                    long j = b + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
                    if (j <= SegmentPool.MAX_SIZE) {
                        b = j;
                        jVar.f = f5850a;
                        jVar.c = 0;
                        jVar.b = 0;
                        f5850a = jVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
