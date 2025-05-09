package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class d52 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<b79> f17584a;

    public d52(List<b79> list, RSoException rSoException) {
        this.f17584a = list;
    }

    public static d52 a(RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d52) ipChange.ipc$dispatch("614d91c1", new Object[]{rSoException});
        }
        return new d52(Collections.emptyList(), rSoException);
    }

    public static d52 e(List<b79> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d52) ipChange.ipc$dispatch("bfab1a96", new Object[]{list});
        }
        return new d52(list, null);
    }

    public List<b79> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("442667b0", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (b79 b79Var : this.f17584a) {
            if (!b79Var.i()) {
                arrayList.add(b79Var);
            }
        }
        return arrayList;
    }

    public List<b79> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("97f2bf20", new Object[]{this});
        }
        return this.f17584a;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31ac2277", new Object[]{this})).booleanValue();
        }
        if (this.f17584a.isEmpty()) {
            return false;
        }
        for (b79 b79Var : this.f17584a) {
            if (!b79Var.i()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "BatchFetchResult{results=" + this.f17584a + "}";
    }
}
