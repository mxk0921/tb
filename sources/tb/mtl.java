package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Paster;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mtl extends hu1<List<Paster>> implements x7d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705469);
        t2o.a(511705363);
    }

    public static /* synthetic */ Object ipc$super(mtl mtlVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/impl/PasterEditorImpl");
    }

    public final List<Paster> G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("32d28e1d", new Object[]{this});
        }
        List<Paster> list = D().get();
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    @Override // tb.x7d
    public void H(Paster paster, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbae4cc", new Object[]{this, paster, new Integer(i)});
            return;
        }
        List<Paster> list = D().get();
        if (list != null && i >= 0 && list.size() > 0 && list.size() > i) {
            t();
            list.remove(i);
            list.add(i, paster.clone());
            g().b(list);
        }
    }

    @Override // tb.x7d
    public void P(List<Paster> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92004a64", new Object[]{this, list});
            return;
        }
        t();
        List<Paster> G = G();
        G.clear();
        if (list == null) {
            list = new ArrayList<>();
        }
        for (Paster paster : list) {
            G.add(paster.clone());
        }
        g().b(G);
    }

    @Override // tb.x7d
    public void R(Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc752c3f", new Object[]{this, paster});
            return;
        }
        t();
        List<Paster> G = G();
        G.add(paster.clone());
        g().b(G);
    }

    @Override // tb.x7d
    public List<Paster> X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("75448117", new Object[]{this});
        }
        List<Paster> u = u();
        if (u == null) {
            return null;
        }
        return new ArrayList(u);
    }

    @Override // tb.x7d
    public void q(Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f940bc", new Object[]{this, paster});
            return;
        }
        List<Paster> list = D().get();
        if (list != null && list.size() > 0) {
            list.remove(paster);
            g().b(list);
        }
    }

    @Override // tb.x7d
    public List<Paster> u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("72734642", new Object[]{this});
        }
        return D().get();
    }
}
