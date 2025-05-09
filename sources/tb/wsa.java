package tb;

import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wsa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile a f30890a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        HandlerThread handlerThread(String str);

        HandlerThread highHandlerThread(String str);
    }

    public static HandlerThread a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("aec3b7b7", new Object[]{str});
        }
        if (f30890a != null) {
            return f30890a.handlerThread(str);
        }
        return new HandlerThread(str);
    }

    public static HandlerThread b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("90793a79", new Object[]{str});
        }
        if (f30890a != null) {
            return f30890a.highHandlerThread(str);
        }
        return new HandlerThread(str);
    }
}
