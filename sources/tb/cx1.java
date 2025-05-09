package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class cx1 implements hbn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final hbn f17405a;

    public cx1(hbn hbnVar) {
        this.f17405a = hbnVar;
    }

    @Override // tb.hbn
    public void a(String str, u5h u5hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27e1402", new Object[]{this, str, u5hVar});
        } else {
            this.f17405a.a(str, u5hVar);
        }
    }

    @Override // tb.hbn
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2f98724", new Object[]{this, str})).booleanValue();
        }
        return this.f17405a.b(str);
    }

    @Override // tb.hbn
    public l6h c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6h) ipChange.ipc$dispatch("8aed7eb3", new Object[]{this, str});
        }
        return this.f17405a.c(str);
    }

    @Override // tb.hbn
    public l6h load(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6h) ipChange.ipc$dispatch("e22015f8", new Object[]{this, str});
        }
        return this.f17405a.load(str);
    }
}
