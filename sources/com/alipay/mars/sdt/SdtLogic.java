package com.alipay.mars.sdt;

import com.alipay.mars.Mars;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SdtLogic {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "bifrost.SdtLogic";

    /* renamed from: a  reason: collision with root package name */
    public static ICallBack f3870a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface ICallBack {
        void reportSignalDetectResults(String str);
    }

    public static void checkLibrary() {
        ArrayList<String> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bf8a19a", new Object[0]);
            return;
        }
        try {
            arrayList = getLoadLibraries();
        } catch (Throwable unused) {
            Mars.loadDefaultMarsLibrary();
            arrayList = null;
        }
        Mars.checkLoadedModules(arrayList, TAG);
    }

    private static native ArrayList<String> getLoadLibraries();

    public static void reportSignalDetectResults(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23ef5788", new Object[]{str});
            return;
        }
        ICallBack iCallBack = f3870a;
        if (iCallBack != null) {
            iCallBack.reportSignalDetectResults(str);
        }
    }

    public static void setCallBack(ICallBack iCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54007ee9", new Object[]{iCallBack});
        } else {
            f3870a = iCallBack;
        }
    }

    public static native void setHttpNetcheckCGI(String str);
}
