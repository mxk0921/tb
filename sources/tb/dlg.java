package tb;

import com.alilive.adapter.uikit.b;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static b f17898a;
    public static emc b;

    static {
        t2o.a(806354948);
    }

    public static emc a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (emc) ipChange.ipc$dispatch("26bfe1c", new Object[0]);
        }
        return b;
    }

    public static b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("483d537", new Object[0]);
        }
        return f17898a;
    }

    public static void c(emc emcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d35fa6", new Object[]{emcVar});
        } else {
            b = emcVar;
        }
    }

    public static void d(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86128c5d", new Object[]{bVar});
        } else {
            f17898a = bVar;
        }
    }
}
