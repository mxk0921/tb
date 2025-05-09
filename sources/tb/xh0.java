package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.inspector.MessagePriority;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xh0 extends com.taobao.android.riverlogger.inspector.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final com.taobao.android.riverlogger.inspector.a[] i;
    public final ConcurrentHashMap<Integer, a> j = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f31392a;
        public final com.taobao.android.riverlogger.inspector.a b;

        static {
            t2o.a(649068562);
        }

        public a(int i, com.taobao.android.riverlogger.inspector.a aVar) {
            this.f31392a = i;
            this.b = aVar;
        }
    }

    static {
        t2o.a(649068561);
    }

    public xh0(com.taobao.android.riverlogger.inspector.a... aVarArr) {
        this.i = aVarArr;
    }

    public static /* synthetic */ Object ipc$super(xh0 xh0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/riverlogger/inspector/AggregatedChannel");
    }

    @Override // com.taobao.android.riverlogger.inspector.a
    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aaf8ff53", new Object[]{this})).booleanValue();
        }
        for (com.taobao.android.riverlogger.inspector.a aVar : this.i) {
            if (aVar.B()) {
                return true;
            }
        }
        return false;
    }

    public xh0 E(com.taobao.android.riverlogger.inspector.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xh0) ipChange.ipc$dispatch("ca827a32", new Object[]{this, aVar});
        }
        com.taobao.android.riverlogger.inspector.a[] aVarArr = this.i;
        int length = aVarArr.length;
        com.taobao.android.riverlogger.inspector.a[] aVarArr2 = (com.taobao.android.riverlogger.inspector.a[]) Arrays.copyOf(aVarArr, 1 + length);
        aVarArr2[length] = aVar;
        return new xh0(aVarArr2);
    }

    public com.taobao.android.riverlogger.inspector.a F(com.taobao.android.riverlogger.inspector.a aVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.riverlogger.inspector.a) ipChange.ipc$dispatch("70fb0170", new Object[]{this, aVar});
        }
        while (true) {
            com.taobao.android.riverlogger.inspector.a[] aVarArr = this.i;
            if (i >= aVarArr.length) {
                return this;
            }
            if (aVarArr[i] != aVar) {
                i++;
            } else if (aVarArr.length == 2) {
                return aVarArr[1 - i];
            } else {
                com.taobao.android.riverlogger.inspector.a[] aVarArr2 = (com.taobao.android.riverlogger.inspector.a[]) Arrays.copyOf(aVarArr, aVarArr.length - 1);
                int i2 = i + 1;
                while (true) {
                    com.taobao.android.riverlogger.inspector.a[] aVarArr3 = this.i;
                    if (i2 >= aVarArr3.length) {
                        return new xh0(aVarArr2);
                    }
                    aVarArr2[i] = aVarArr3[i2];
                    i++;
                    i2++;
                }
            }
        }
    }

    @Override // com.taobao.android.riverlogger.inspector.a
    public void h(int i, String str, JSONObject jSONObject, MessagePriority messagePriority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7821ac40", new Object[]{this, new Integer(i), str, jSONObject, messagePriority});
            return;
        }
        a remove = this.j.remove(Integer.valueOf(i));
        if (remove != null) {
            remove.b.h(remove.f31392a, str, jSONObject, messagePriority);
        }
    }

    @Override // com.taobao.android.riverlogger.inspector.a
    public Set<String> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("99b3a281", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        for (com.taobao.android.riverlogger.inspector.a aVar : this.i) {
            hashSet.addAll(aVar.l());
        }
        return hashSet;
    }

    @Override // com.taobao.android.riverlogger.inspector.a
    public ArrayList<dcf> m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e2c3fad5", new Object[]{this, str});
        }
        ArrayList<dcf> arrayList = new ArrayList<>();
        HashSet hashSet = new HashSet();
        for (com.taobao.android.riverlogger.inspector.a aVar : this.i) {
            ArrayList<dcf> m = aVar.m(str);
            if (m != null) {
                Iterator<dcf> it = m.iterator();
                while (it.hasNext()) {
                    dcf next = it.next();
                    if (hashSet.add(next.f17724a)) {
                        arrayList.add(next);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.taobao.android.riverlogger.inspector.a
    public void n(String str, int i, String str2, JSONObject jSONObject, com.taobao.android.riverlogger.inspector.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d942f68f", new Object[]{this, str, new Integer(i), str2, jSONObject, aVar});
            return;
        }
        int o = o();
        this.j.put(Integer.valueOf(o), new a(i, aVar));
        zbf.c(str, o, str2, jSONObject);
    }

    @Override // com.taobao.android.riverlogger.inspector.a
    public void v(String str, MessagePriority messagePriority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a31fa92", new Object[]{this, str, messagePriority});
            return;
        }
        throw new RuntimeException("AggregatedChannel.sendMessage should unreachable");
    }

    @Override // com.taobao.android.riverlogger.inspector.a
    public void w(String str, String str2, String str3, MessagePriority messagePriority, x24 x24Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633db103", new Object[]{this, str, str2, str3, messagePriority, x24Var});
        } else if (str != null) {
            for (com.taobao.android.riverlogger.inspector.a aVar : this.i) {
                aVar.w(str, str2, str3, messagePriority, x24Var);
            }
        }
    }
}
