package com.uc.webview.base.cyclone;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class BSPatch {
    public static BSPatchResult patch(String str, String str2, String str3, String str4) {
        return patch(str, null, str2, str3, str4, null);
    }

    private static native int[] patchImpl(String str, String str2, String str3, String str4, String str5, String str6);

    public static BSPatchResult patch(String str, String str2, String str3, String str4, String str5, String str6) {
        int i = a.f14264a;
        return i != -1000 ? new BSPatchResult(i) : new BSPatchResult(patchImpl(str, str2, str3, str4, str5, str6));
    }
}
