package tb;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.mainpic.MainPicContainer;
import com.taobao.android.detail2.core.mainpic.a;
import com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder;
import com.taobao.android.detail2.core.mainpic.viewholder.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class t0i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, a> f28389a = new HashMap();
    public final Map<Integer, String> b = new HashMap();

    static {
        t2o.a(352322157);
    }

    public MainPicAbsViewHolder a(MainPicContainer mainPicContainer, a.b bVar, MainPicAbsViewHolder.a aVar, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainPicAbsViewHolder) ipChange.ipc$dispatch("71d9f4cc", new Object[]{this, mainPicContainer, bVar, aVar, viewGroup, new Integer(i)});
        }
        com.taobao.android.detail2.core.mainpic.viewholder.a aVar2 = (com.taobao.android.detail2.core.mainpic.viewholder.a) ((HashMap) this.f28389a).get((String) ((HashMap) this.b).get(Integer.valueOf(i)));
        if (aVar2 == null) {
            return null;
        }
        try {
            return aVar2.a(viewGroup, mainPicContainer, bVar, aVar, i);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c7c85b9", new Object[]{this, str})).intValue();
        }
        if (str == null) {
            return -1;
        }
        ((HashMap) this.b).put(Integer.valueOf(str.hashCode()), str);
        return str.hashCode();
    }

    public void c(String str, com.taobao.android.detail2.core.mainpic.viewholder.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96e93cb6", new Object[]{this, str, aVar});
        } else {
            ((HashMap) this.f28389a).put(str, aVar);
        }
    }
}
