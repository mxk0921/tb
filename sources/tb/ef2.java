package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ef2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f18524a;
    public final String b;

    static {
        t2o.a(481297038);
    }

    public ef2(String str, String str2) {
        this.f18524a = str;
        this.b = str2;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ff2c1d1", new Object[]{this});
        }
        return this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30496759", new Object[]{this});
        }
        return this.f18524a;
    }
}
