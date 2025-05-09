package com.taobao.android.remoteso.index;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SoInfo2 {
    public static final int VAL_SYNC_TIMEOUT = 5;
    public Ext ext = new Ext();
    public String advancedInfo = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Ext {
        public int syncTimeoutSeconds = 5;
        public boolean allowPreFetch = true;
        public boolean allowLastIndex = false;
        public boolean remoteDiffPatch = false;
        public boolean remoteCompressed = true;
        public boolean compressedDiffPatch = false;
        public boolean inApkDiffPatch = false;
        public String diffBaseLibName = "";
    }
}
