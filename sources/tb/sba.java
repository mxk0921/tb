package tb;

import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sba extends HandlerThread {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public sba(String str) {
        super(str);
        super.start();
    }

    public static /* synthetic */ Object ipc$super(sba sbaVar, String str, Object... objArr) {
        if (str.hashCode() == -2130491415) {
            super.start();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbexecutor/config/GlobalHandlerThread");
    }

    @Override // android.os.HandlerThread
    public boolean quit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c142e75a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // android.os.HandlerThread
    public boolean quitSafely() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b79acd14", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // java.lang.Thread
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        }
    }
}
