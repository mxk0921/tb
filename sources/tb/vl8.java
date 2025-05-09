package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vl8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int kRaiseFromExecuteJS = 1;
    public static final int kRaiseFromFunctionCall = 2;
    public static final int kRaiseFromJSIInternal = 12;
    public static final int kRaiseFromJSObjectGet = 6;
    public static final int kRaiseFromJSObjectSet = 7;
    public static final int kRaiseFromJSPromise = 5;
    public static final int kRaiseFromJSTimer = 4;
    public static final int kRaiseFromNewInstance = 3;
    public static final int kRaiseFromOtherApiCall = 11;
    public static final int kRaiseFromWasmFunctionCall = 9;
    public static final int kRaiseFromWasmInstanceMake = 10;
    public static final int kRaiseFromWasmModuleMake = 8;

    static {
        t2o.a(921698306);
    }

    public String onGetSourceMapFilePath(dqf dqfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("908ba239", new Object[]{this, dqfVar, str});
        }
        return null;
    }

    public boolean onJSSupportException(dqf dqfVar, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aaba9d9f", new Object[]{this, dqfVar, th})).booleanValue();
        }
        return false;
    }

    public void onReload(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46b30a2a", new Object[]{this, dqfVar});
        }
    }

    public boolean onUncaughtJSException(dqf dqfVar, kqf kqfVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e997ac", new Object[]{this, dqfVar, kqfVar, new Integer(i)})).booleanValue();
        }
        if (kqfVar != null) {
            kqfVar.delete();
        }
        return false;
    }
}
