package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class w9p implements v9p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final w9p f30544a = new w9p();

    static {
        t2o.a(962592918);
        t2o.a(962592917);
    }

    public static w9p a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w9p) ipChange.ipc$dispatch("bbe4f4e4", new Object[0]);
        }
        return f30544a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    @Override // tb.v9p
    public void onEvent(u9p u9pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("223bc06c", new Object[]{this, u9pVar});
            return;
        }
        throw null;
    }
}
