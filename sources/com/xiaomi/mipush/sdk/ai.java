package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.bj;
import com.xiaomi.push.h;
import com.xiaomi.push.ic;
import com.xiaomi.push.ir;
import com.xiaomi.push.is;
import com.xiaomi.push.it;
import com.xiaomi.push.ix;
import com.xiaomi.push.iy;
import com.xiaomi.push.jb;
import com.xiaomi.push.jd;
import com.xiaomi.push.je;
import com.xiaomi.push.jf;
import com.xiaomi.push.jh;
import com.xiaomi.push.jj;
import com.xiaomi.push.jl;
import com.xiaomi.push.jm;
import com.xiaomi.push.jn;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ai {
    public static <T extends jn<T, ?>> iy a(Context context, T t, ic icVar) {
        return a(context, t, icVar, !icVar.equals(ic.Registration), context.getPackageName(), b.m452a(context).m453a());
    }

    public static <T extends jn<T, ?>> iy b(Context context, T t, ic icVar, boolean z, String str, String str2) {
        return a(context, t, icVar, z, str, str2, false);
    }

    public static <T extends jn<T, ?>> iy a(Context context, T t, ic icVar, boolean z, String str, String str2) {
        return a(context, t, icVar, z, str, str2, true);
    }

    public static <T extends jn<T, ?>> iy a(Context context, T t, ic icVar, boolean z, String str, String str2, boolean z2) {
        String str3;
        byte[] a2 = jm.a(t);
        if (a2 == null) {
            str3 = "invoke convertThriftObjectToBytes method, return null.";
        } else {
            iy iyVar = new iy();
            if (z) {
                String d = b.m452a(context).d();
                if (TextUtils.isEmpty(d)) {
                    str3 = "regSecret is empty, return null";
                } else {
                    try {
                        a2 = h.b(bj.m516a(d), a2);
                    } catch (Exception unused) {
                        b.d("encryption error. ");
                    }
                }
            }
            ir irVar = new ir();
            irVar.f1216a = 5L;
            irVar.f1217a = "fakeid";
            iyVar.a(irVar);
            iyVar.a(ByteBuffer.wrap(a2));
            iyVar.a(icVar);
            iyVar.b(z2);
            iyVar.b(str);
            iyVar.a(z);
            iyVar.a(str2);
            return iyVar;
        }
        b.m410a(str3);
        return null;
    }

    public static jn a(Context context, iy iyVar) {
        byte[] bArr;
        if (iyVar.m861b()) {
            byte[] a2 = i.a(context, iyVar, e.ASSEMBLE_PUSH_FCM);
            if (a2 == null) {
                a2 = bj.m516a(b.m452a(context).d());
            }
            try {
                bArr = h.a(a2, iyVar.m859a());
            } catch (Exception e) {
                throw new u("the aes decrypt failed.", e);
            }
        } else {
            bArr = iyVar.m859a();
        }
        jn a3 = a(iyVar.a(), iyVar.f1296b);
        if (a3 != null) {
            jm.a(a3, bArr);
        }
        return a3;
    }

    private static jn a(ic icVar, boolean z) {
        switch (aj.f14712a[icVar.ordinal()]) {
            case 1:
                return new jd();
            case 2:
                return new jj();
            case 3:
                return new jh();
            case 4:
                return new jl();
            case 5:
                return new jf();
            case 6:
                return new is();
            case 7:
                return new ix();
            case 8:
                return new je();
            case 9:
                if (z) {
                    return new jb();
                }
                it itVar = new it();
                itVar.a(true);
                return itVar;
            case 10:
                return new ix();
            default:
                return null;
        }
    }
}
