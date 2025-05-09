package com.taobao.android.alinnkit.net;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.exception.AliNNKitLibraryLoadException;
import tb.asj;
import tb.bzf;
import tb.bzn;
import tb.l6h;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AliNNKitBaseNet {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean sNativeLibAvailable;
    public String mBizName;
    public String mModelFiles;
    public String mModelId;

    static {
        boolean z;
        t2o.a(367001645);
        sNativeLibAvailable = false;
        try {
            l6h c = bzn.d().c("MNN");
            l6h c2 = bzn.d().c("mnnkitcore");
            l6h c3 = bzn.d().c("MNN_CL");
            l6h c4 = bzn.d().c("MNN_Express");
            if (!c.i()) {
                bzf.g("AliNNJava", "Load Remote libMNN.so failed.", new Object[0]);
            }
            if (!c2.i()) {
                bzf.g("AliNNJava", "Load Remote libmnnkitcore.so failed.", new Object[0]);
            }
            if (!c3.i()) {
                bzf.g("AliNNJava", "Load Remote libMNN_CL.so failed.", new Object[0]);
            }
            if (!c4.i()) {
                bzf.g("AliNNJava", "Load Remote libMNN_Express.so failed.", new Object[0]);
            }
            if (!c.i() || !c2.i()) {
                z = false;
            } else {
                z = true;
            }
            sNativeLibAvailable = z;
        } catch (Throwable th) {
            sNativeLibAvailable = false;
            bzf.b("AliNNJava", "Load libmnnkitcore.so failed with exception=%s", th);
        }
    }

    public static boolean checkIfNativeUnavailable(asj asjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9255ff4", new Object[]{asjVar})).booleanValue();
        }
        boolean z = sNativeLibAvailable;
        boolean z2 = true ^ z;
        if (!z) {
            asjVar.a(new AliNNKitLibraryLoadException());
        }
        return z2;
    }

    public static boolean isCpuAbiSupported(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0a93f9", new Object[]{str})).booleanValue();
        }
        for (String str2 : Build.SUPPORTED_ABIS) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNativeLibAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a7eb450", new Object[0])).booleanValue();
        }
        return sNativeLibAvailable;
    }

    public abstract void release();
}
