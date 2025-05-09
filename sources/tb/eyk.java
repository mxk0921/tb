package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.channel.OpenArchChannelName;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class eyk extends f2g<fyk> implements lky {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, g1a<Map<String, ? extends Object>, Map<String, Object>>> f18893a = new LinkedHashMap();

    static {
        t2o.a(1004535827);
        t2o.a(1003487261);
    }

    public eyk(fyk fykVar) {
        super(fykVar);
    }

    public static /* synthetic */ Object ipc$super(eyk eykVar, String str, Object... objArr) {
        if (str.hashCode() == 2024047597) {
            super.f();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/component/OpenArchChannelComponent");
    }

    /* renamed from: c */
    public void a(fyk fykVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2db284e", new Object[]{this, fykVar});
        }
    }

    public final void e(OpenArchChannelName openArchChannelName, Map<String, ? extends Object> map, u1a<? super Map<String, ? extends Object>, ? super Boolean, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156d18d", new Object[]{this, openArchChannelName, map, u1aVar});
            return;
        }
        ckf.g(openArchChannelName, "channelName");
        ckf.g(map, "data");
        ckf.g(u1aVar, "resultBlock");
        g1a g1aVar = (g1a) ((LinkedHashMap) this.f18893a).get(Integer.valueOf(openArchChannelName.getValue()));
        if (g1aVar == null) {
            u1aVar.invoke(null, Boolean.FALSE);
        } else {
            u1aVar.invoke(g1aVar.invoke(map), Boolean.TRUE);
        }
    }

    @Override // tb.f2g, tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
            return;
        }
        super.f();
        ((LinkedHashMap) this.f18893a).clear();
    }

    @Override // tb.lky
    public boolean a(int i, g1a<? super Map<String, ? extends Object>, ? extends Map<String, ? extends Object>> g1aVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded13046", new Object[]{this, new Integer(i), g1aVar})).booleanValue();
        }
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
        Iterator<E> it = OpenArchChannelName.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((OpenArchChannelName) obj).getValue() == i) {
                break;
            }
        }
        OpenArchChannelName openArchChannelName = (OpenArchChannelName) obj;
        if (openArchChannelName != null) {
            return g(openArchChannelName, g1aVar);
        }
        return false;
    }

    public final boolean g(OpenArchChannelName openArchChannelName, g1a<? super Map<String, ? extends Object>, ? extends Map<String, ? extends Object>> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a08f1558", new Object[]{this, openArchChannelName, g1aVar})).booleanValue();
        }
        ckf.g(openArchChannelName, "channelName");
        ckf.g(g1aVar, "processBlock");
        if (((LinkedHashMap) this.f18893a).get(Integer.valueOf(openArchChannelName.getValue())) != null) {
            return false;
        }
        this.f18893a.put(Integer.valueOf(openArchChannelName.getValue()), g1aVar);
        return true;
    }
}
