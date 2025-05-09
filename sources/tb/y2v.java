package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class y2v implements b5e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final y2v b = new y2v();

    /* renamed from: a  reason: collision with root package name */
    public b5e f31816a = null;

    public static y2v b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y2v) ipChange.ipc$dispatch("4127dad6", new Object[0]);
        }
        return b;
    }

    @Override // tb.b5e
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f70c80", new Object[]{this});
        }
        b5e b5eVar = this.f31816a;
        if (b5eVar == null) {
            return "";
        }
        return b5eVar.a();
    }

    public void c(b5e b5eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b9977d6", new Object[]{this, b5eVar});
        } else {
            this.f31816a = b5eVar;
        }
    }
}
