package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexData;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final z6o f25978a;
    public final a7o b;
    public final List<a7o> c;

    public pan(z6o z6oVar, a7o a7oVar) {
        this.f25978a = z6oVar;
        this.b = a7oVar;
        this.c = Collections.singletonList(a7oVar);
    }

    public static void e(List<a7o> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ddd0150", new Object[]{list});
        } else if (list.size() < 1) {
            throw new IllegalArgumentException("do not create RSResolveResult with empty results");
        }
    }

    public List<a7o> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9ac3f9f5", new Object[]{this});
        }
        return this.c;
    }

    public a7o b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a7o) ipChange.ipc$dispatch("2d4324a9", new Object[]{this});
        }
        return this.b;
    }

    public SoIndexData.SoFileInfo c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("53af0199", new Object[]{this});
        }
        return this.f25978a.j();
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ff65cbf", new Object[]{this});
        }
        return this.f25978a.b();
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.b.j();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RSPullResult{, finalResult=" + this.b + '}';
    }

    public pan(z6o z6oVar, List<a7o> list) {
        e(list);
        this.f25978a = z6oVar;
        this.b = list.get(list.size() - 1);
        this.c = list;
    }
}
