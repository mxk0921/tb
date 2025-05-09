package tb;

import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.MsgRouter;
import com.taobao.tao.messagekit.base.network.AccsConnection;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.model.Report;
import java.util.Collection;
import java.util.List;
import tb.ts1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dap implements ts1.f<List<ikl>, AccsConnection.DataPackage> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements lzx<Collection<AccsConnection.DataPackage>, l5y<AccsConnection.DataPackage>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(dap dapVar) {
        }

        /* renamed from: a */
        public l5y<AccsConnection.DataPackage> apply(Collection<AccsConnection.DataPackage> collection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (l5y) ipChange.ipc$dispatch("f4794a0f", new Object[]{this, collection});
            }
            return l5y.l(collection);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements lzx<List<ikl>, Collection<AccsConnection.DataPackage>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public Collection<AccsConnection.DataPackage> apply(List<ikl> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Collection) ipChange.ipc$dispatch("29ee24a1", new Object[]{this, list});
            }
            MsgLog.i("SendConverter4ACCS", "con 0", "convert msgs to bytes:", Integer.valueOf(list.size()));
            ArrayMap arrayMap = new ArrayMap(5);
            for (ikl iklVar : list) {
                String f = dap.f((BaseMessage) iklVar.f21366a, iklVar.m);
                AccsConnection.DataPackage dataPackage = (AccsConnection.DataPackage) arrayMap.get(f);
                if (dataPackage == null) {
                    BaseMessage baseMessage = (BaseMessage) iklVar.f21366a;
                    dataPackage = new AccsConnection.DataPackage(baseMessage.routerId, iklVar.b, baseMessage.header.f18091a);
                    if (iklVar.m) {
                        dataPackage.h(((BaseMessage) iklVar.f21366a).bizCode);
                        int i = ((BaseMessage) iklVar.f21366a).msgType;
                        if (i == 8 || i == 10) {
                            dataPackage.i(true);
                        }
                    }
                    arrayMap.put(f, dataPackage);
                }
                if (dap.c(dap.this, dataPackage.d(), iklVar)) {
                    dataPackage.a(iklVar);
                } else {
                    MsgRouter.e().a().b(((BaseMessage) iklVar.f21366a).getID(), -3003, null);
                }
            }
            return arrayMap.values();
        }
    }

    static {
        t2o.a(628097253);
        t2o.a(628097080);
    }

    public static /* synthetic */ boolean c(dap dapVar, List list, ikl iklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26b51487", new Object[]{dapVar, list, iklVar})).booleanValue();
        }
        return dapVar.e(list, iklVar);
    }

    public static String f(BaseMessage baseMessage, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a212741", new Object[]{baseMessage, new Boolean(z)});
        }
        return ts1.d(baseMessage, z);
    }

    /* renamed from: d */
    public l5y<AccsConnection.DataPackage> b(l5y<List<ikl>> l5yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("720c918d", new Object[]{this, l5yVar});
        }
        return l5yVar.I(gay.b()).G(new b()).s(new a(this));
    }

    public final boolean e(List<ikl> list, ikl<BaseMessage> iklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f056ac4", new Object[]{this, list, iklVar})).booleanValue();
        }
        if (iklVar.f21366a.type == 6) {
            for (ikl iklVar2 : list) {
                M m = iklVar2.f21366a;
                if (((BaseMessage) m).type == 6 && iklVar2.d == iklVar.d) {
                    int i = ((BaseMessage) m).header.g;
                    BaseMessage baseMessage = iklVar.f21366a;
                    if (i == baseMessage.header.g && ((Report) m).body.f15735a.equals(((Report) baseMessage).body.f15735a)) {
                        MsgLog.e("SendConverter4ACCS", "drop report msg", iklVar.f21366a.header.f);
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
