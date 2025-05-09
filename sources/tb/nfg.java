package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.RichLabel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nfg extends hu1<List<RichLabel>> implements bjc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705467);
        t2o.a(511705360);
    }

    public static /* synthetic */ Object ipc$super(nfg nfgVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/impl/LabelEditorImpl");
    }

    @Override // tb.bjc
    public List<RichLabel> C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("889b35cb", new Object[]{this});
        }
        return D().get();
    }

    @Override // tb.bjc
    public void E(RichLabel richLabel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("141f4afe", new Object[]{this, richLabel, new Integer(i)});
            return;
        }
        List<RichLabel> list = D().get();
        if (list != null && i >= 0 && list.size() > 0 && list.size() > i) {
            t();
            list.remove(i);
            list.add(i, richLabel.clone());
            g().b(list);
        }
    }

    public final List<RichLabel> G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("32d28e1d", new Object[]{this});
        }
        List<RichLabel> list = D().get();
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    @Override // tb.bjc
    public void L(RichLabel richLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3400dcd", new Object[]{this, richLabel});
            return;
        }
        t();
        List<RichLabel> G = G();
        G.add(richLabel.clone());
        g().b(G);
    }

    @Override // tb.bjc
    public void b0(RichLabel richLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5810f70a", new Object[]{this, richLabel});
            return;
        }
        List<RichLabel> list = D().get();
        if (list != null && list.size() > 0) {
            t();
            list.remove(richLabel);
            g().b(list);
        }
    }
}
