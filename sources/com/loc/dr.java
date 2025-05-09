package com.loc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class dr extends gb {
    private static int a(ga gaVar) {
        return gaVar.b();
    }

    private static void b(ga gaVar, int i) {
        gaVar.b(0, i);
    }

    public static int a(ga gaVar, int i) {
        gaVar.b(1);
        b(gaVar, i);
        return a(gaVar);
    }

    public static int a(ga gaVar, int[] iArr) {
        gaVar.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            gaVar.a(iArr[length]);
        }
        return gaVar.a();
    }
}
