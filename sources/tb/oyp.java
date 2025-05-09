package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class oyp implements wet {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<Integer, m0c> f25753a = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f25754a;
        public final /* synthetic */ m0c b;
        public final /* synthetic */ zet c;

        public a(List list, m0c m0cVar, zet zetVar) {
            this.f25754a = list;
            this.b = m0cVar;
            this.c = zetVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (zzp zzpVar : this.f25754a) {
                this.b.a(zzpVar, this.c.d);
            }
            oyp.a(oyp.this).remove(Integer.valueOf(this.c.b));
        }
    }

    public static /* synthetic */ ConcurrentHashMap a(oyp oypVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("e5452bd0", new Object[]{oypVar});
        }
        return oypVar.f25753a;
    }

    @Override // tb.wet
    public void addTask(List<zzp> list, zet zetVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31182468", new Object[]{this, list, zetVar});
            return;
        }
        m0c a2 = new jxp().a(zetVar.c);
        this.f25753a.put(Integer.valueOf(zetVar.b), a2);
        srt.a(new a(list, a2, zetVar), false);
    }

    @Override // tb.wet
    public void modifyTask(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edbd5146", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        m0c m0cVar = this.f25753a.get(Integer.valueOf(i));
        if (m0cVar == null) {
            return;
        }
        if (1 == i2) {
            m0cVar.pause();
        } else if (2 == i2) {
            m0cVar.cancel();
        }
    }
}
