package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kcy implements veb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public veb f22575a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final kcy f22576a = new kcy();

        static {
            t2o.a(283115561);
        }
    }

    static {
        t2o.a(283115560);
        t2o.a(283115559);
    }

    public static kcy a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kcy) ipChange.ipc$dispatch("9e6cd6fe", new Object[0]);
        }
        return a.f22576a;
    }

    public void b(veb vebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d487639c", new Object[]{this, vebVar});
        } else {
            this.f22575a = vebVar;
        }
    }

    @Override // tb.veb
    public void commitFail(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c1ffee", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        qgh.d(str, str2, str3, str4, str5);
        veb vebVar = this.f22575a;
        if (vebVar != null) {
            vebVar.commitFail(str, str2, str3, str4, str5);
        }
    }

    @Override // tb.veb
    public void commitSuccess(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3416f1", new Object[]{this, str, str2, str3});
            return;
        }
        qgh.d("KeyMonitor", str, str2, str3);
        veb vebVar = this.f22575a;
        if (vebVar != null) {
            vebVar.commitSuccess(str, str2, str3);
        }
    }
}
