package com.xiaomi.push;

import android.util.Log;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.gj;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gg {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f14901a = Log.isLoggable("BCompressed", 3);

    public static byte[] a(gf gfVar, byte[] bArr) {
        try {
            byte[] a2 = gj.a.a(bArr);
            if (f14901a) {
                b.m411a("BCompressed", "decompress " + bArr.length + " to " + a2.length + " for " + gfVar);
                if (gfVar.f1032a == 1) {
                    b.m411a("BCompressed", "decompress not support upStream");
                }
            }
            return a2;
        } catch (Exception e) {
            b.m411a("BCompressed", "decompress error " + e);
            return bArr;
        }
    }
}
