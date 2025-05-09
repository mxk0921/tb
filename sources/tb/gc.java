package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gc implements bgb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final gc b = new gc();

    /* renamed from: a  reason: collision with root package name */
    public bgb f19885a = new qx6();

    public static gc b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gc) ipChange.ipc$dispatch("c12a9b31", new Object[0]);
        }
        return b;
    }

    @Override // tb.bgb
    public abe a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (abe) ipChange.ipc$dispatch("32a4839d", new Object[]{this});
        }
        return this.f19885a.a();
    }

    public void c(bgb bgbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c92a5e3b", new Object[]{this, bgbVar});
        } else {
            this.f19885a = bgbVar;
        }
    }
}
