package tb;

import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import tb.wsa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ger implements wsa.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f19934a;
    public static final sba[] b;
    public static final sba[] c;

    static {
        int i = ybr.f31969a;
        b = new sba[i];
        c = new sba[i];
    }

    @Override // tb.wsa.a
    public HandlerThread handlerThread(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("aec3b7b7", new Object[]{this, str});
        }
        if (ybr.c(str) != 2) {
            return new HandlerThread(str);
        }
        int i = f19934a;
        f19934a = 1 + i;
        sba[] sbaVarArr = b;
        int length = i % sbaVarArr.length;
        f19934a = length;
        if (sbaVarArr[length] == null) {
            synchronized (sbaVarArr) {
                try {
                    if (sbaVarArr[length] == null) {
                        sbaVarArr[length] = new sba("global-handler" + length);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sbaVarArr[length];
    }

    @Override // tb.wsa.a
    public HandlerThread highHandlerThread(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("90793a79", new Object[]{this, str});
        }
        if (ybr.c(str) != 2) {
            return new HandlerThread(str);
        }
        int i = f19934a;
        f19934a = 1 + i;
        int length = i % b.length;
        f19934a = length;
        sba[] sbaVarArr = c;
        if (sbaVarArr[length] == null) {
            synchronized (sbaVarArr) {
                try {
                    if (sbaVarArr[length] == null) {
                        sbaVarArr[length] = new sba("global-high-handler" + length);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sbaVarArr[length];
    }
}
