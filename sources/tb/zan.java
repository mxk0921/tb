package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class zan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ggd f32651a;
    public final m0n b;
    public final Map<String, yan> c = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends zc8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 193844431) {
                super.a((xan) objArr[0], (RSoException) objArr[1]);
                return null;
            } else if (hashCode == 880291618) {
                super.b((xan) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/remoteso/fetcher/downloader/RSoDownloader$1");
            }
        }

        @Override // tb.zc8, tb.fgd
        public void a(xan xanVar, RSoException rSoException) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8dd4cf", new Object[]{this, xanVar, rSoException});
                return;
            }
            super.a(xanVar, rSoException);
            zan.b(zan.this).remove(xanVar.b());
            RSoLog.d("downloader -> task finish, removed : " + xanVar);
        }

        @Override // tb.zc8, tb.fgd
        public void b(xan xanVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34782f22", new Object[]{this, xanVar, new Integer(i)});
                return;
            }
            super.b(xanVar, i);
            zan.a(zan.this).c(xanVar.d(), i);
        }
    }

    public zan(ggd ggdVar, m0n m0nVar) {
        this.f32651a = ggdVar;
        this.b = m0nVar;
    }

    public static /* synthetic */ m0n a(zan zanVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m0n) ipChange.ipc$dispatch("52c3fed1", new Object[]{zanVar});
        }
        return zanVar.b;
    }

    public static /* synthetic */ Map b(zan zanVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1e83a5b1", new Object[]{zanVar});
        }
        return zanVar.c;
    }

    public void c(xan xanVar, fgd fgdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb4f8", new Object[]{this, xanVar, fgdVar});
            return;
        }
        yan yanVar = (yan) ((ConcurrentHashMap) this.c).get(xanVar.b());
        if (yanVar != null) {
            yanVar.a().a(fgdVar);
            this.f32651a.a(yanVar);
            RSoLog.d("downloader -> task resumed : " + xanVar.d());
            rbn.e("downloader,taskResumed", "resume lib " + xanVar);
            return;
        }
        xanVar.a(new jv7());
        xanVar.a(new a());
        xanVar.a(fgdVar);
        ((ConcurrentHashMap) this.c).put(xanVar.b(), this.f32651a.b(xanVar));
        RSoLog.d("downloader ->  task    started:  " + xanVar.d());
    }
}
