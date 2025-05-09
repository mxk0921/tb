package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zqi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f32948a;
    public String b;
    public String c;
    public String d;
    public String e;
    public zvd f;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MessageSubscribe{bizCode=" + this.f32948a + ", topic='" + this.b + "', channel='" + this.c + "', from='" + this.d + "', ext='" + this.e + "', iLiveMsgCallback=" + this.f + '}';
    }
}
