package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wd0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f30626a = -1;

    static {
        t2o.a(779092397);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7d41091", new Object[0])).booleanValue();
        }
        if (f30626a == -1) {
            f30626a = b(new err().b("tblive", "enableAdapterPack20240919", "false")) ? 1 : 0;
        }
        return f30626a == 1;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9b32eca", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        try {
            return arq.c(str);
        } catch (Exception unused) {
            return false;
        }
    }
}
