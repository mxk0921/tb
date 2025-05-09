package com.uc.webview.base.cyclone;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class BSPatchResult {
    public int ec;
    public int oldDecTime;
    public int patchDecTime;
    public int patchTime;
    public int res;

    public BSPatchResult() {
    }

    public boolean success() {
        if (this.res == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "res: " + this.res + ", ec: " + this.ec;
    }

    public BSPatchResult(int i) {
        this.res = i;
    }

    public BSPatchResult(int[] iArr) {
        if (iArr == null || iArr.length != 5) {
            this.res = -1010;
            return;
        }
        this.res = iArr[0];
        this.ec = iArr[1];
        this.oldDecTime = iArr[2];
        this.patchDecTime = iArr[3];
        this.patchTime = iArr[4];
    }
}
