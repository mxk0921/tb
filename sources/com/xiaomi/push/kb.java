package com.xiaomi.push;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kb {

    /* renamed from: a  reason: collision with root package name */
    private static int f14993a = Integer.MAX_VALUE;

    public static void a(jy jyVar, byte b) {
        a(jyVar, b, f14993a);
    }

    public static void a(jy jyVar, byte b, int i) {
        if (i > 0) {
            int i2 = 0;
            switch (b) {
                case 2:
                    jyVar.m954a();
                    return;
                case 3:
                    jyVar.mo957a();
                    return;
                case 4:
                    jyVar.a();
                    return;
                case 5:
                case 7:
                case 9:
                default:
                    return;
                case 6:
                    jyVar.m952a();
                    return;
                case 8:
                    jyVar.m943a();
                    return;
                case 10:
                    jyVar.m944a();
                    return;
                case 11:
                    jyVar.m951a();
                    return;
                case 12:
                    jyVar.m949a();
                    while (true) {
                        byte b2 = jyVar.m945a().f14988a;
                        if (b2 == 0) {
                            jyVar.f();
                            return;
                        } else {
                            a(jyVar, b2, i - 1);
                            jyVar.g();
                        }
                    }
                case 13:
                    jx a2 = jyVar.m947a();
                    while (i2 < a2.f1472a) {
                        int i3 = i - 1;
                        a(jyVar, a2.f14990a, i3);
                        a(jyVar, a2.b, i3);
                        i2++;
                    }
                    jyVar.h();
                    return;
                case 14:
                    kc a3 = jyVar.m948a();
                    while (i2 < a3.f1473a) {
                        a(jyVar, a3.f14994a, i - 1);
                        i2++;
                    }
                    jyVar.j();
                    return;
                case 15:
                    jw a4 = jyVar.m946a();
                    while (i2 < a4.f1471a) {
                        a(jyVar, a4.f14989a, i - 1);
                        i2++;
                    }
                    jyVar.i();
                    return;
            }
        } else {
            throw new js("Maximum skip depth exceeded");
        }
    }
}
