package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c6k implements vmh<String, bu2> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(620757060);
        t2o.a(620757030);
    }

    @Override // tb.vmh
    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66d7df43", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // tb.vmh
    public void b(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("695f1998", new Object[]{this, new Integer(i), new Float(f)});
        }
    }

    /* renamed from: c */
    public bu2 get(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bu2) ipChange.ipc$dispatch("f8f11dc", new Object[]{this, str});
        }
        return null;
    }

    @Override // tb.vmh
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        }
    }

    /* renamed from: d */
    public boolean f(int i, String str, bu2 bu2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28ed8208", new Object[]{this, new Integer(i), str, bu2Var})).booleanValue();
        }
        return false;
    }

    @Override // tb.vmh
    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8be17f", new Object[]{this})).intValue();
        }
        return 0;
    }

    /* renamed from: g */
    public bu2 remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bu2) ipChange.ipc$dispatch("14d8a56e", new Object[]{this, str});
        }
        return null;
    }

    @Override // tb.vmh
    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return 0;
    }
}
