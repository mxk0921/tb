package com.uc.webview.export.multiprocess;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface b {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static String a(int i) {
            if (i == 0) {
                return "NormalRenderProc";
            }
            if (i == 1) {
                return "IsolateRenderProc";
            }
            if (i == 2) {
                return "GPUProc";
            }
            return "UnknownProc";
        }
    }
}
