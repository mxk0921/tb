package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.model.MessageData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class tmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1030750264);
    }

    public static tmi a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tmi) ipChange.ipc$dispatch("83def0a", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            return w8k.c();
        }
        return omi.c();
    }

    public abstract void b(Context context, MessageData messageData);
}
