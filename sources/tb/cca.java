package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class cca {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final cca INSTANCE = new cca();

    /* renamed from: a  reason: collision with root package name */
    public static final dlk f16971a = new dlk("global");

    static {
        t2o.a(815793483);
    }

    public final boolean a(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("306e525d", new Object[]{this, str, str2, obj})).booleanValue();
        }
        ckf.g(str, "namespace");
        ckf.g(str2, "key");
        ckf.g(obj, "value");
        return f16971a.a(str, str2, obj);
    }

    public final void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cf68c68", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "namespace");
        ckf.g(str2, "key");
        f16971a.b(str, str2);
    }

    public final void c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41382e6f", new Object[]{this, str, new Integer(i)});
            return;
        }
        ckf.g(str, "namespace");
        f16971a.c(str, i);
    }

    public final void d(String str, Observer observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b31269", new Object[]{this, str, observer});
            return;
        }
        ckf.g(str, "namespace");
        ckf.g(observer, "observer");
        f16971a.d(str, observer);
    }

    public final void e(String str, Observer observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7716d030", new Object[]{this, str, observer});
            return;
        }
        ckf.g(str, "namespace");
        ckf.g(observer, "observer");
        f16971a.e(str, observer);
    }
}
