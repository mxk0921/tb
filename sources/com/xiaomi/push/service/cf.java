package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.ic;
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

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class cf {
    public static jn a(Context context, iy iyVar) {
        if (iyVar.m861b()) {
            return null;
        }
        byte[] a2 = iyVar.m859a();
        jn a3 = a(iyVar.a(), iyVar.f1296b);
        if (a3 != null) {
            jm.a(a3, a2);
        }
        return a3;
    }

    private static jn a(ic icVar, boolean z) {
        switch (cg.f15096a[icVar.ordinal()]) {
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
