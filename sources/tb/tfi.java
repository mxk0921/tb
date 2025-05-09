package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.s;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import tb.wg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tfi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MOCK_MEDIA_INFO_WHAT_RECYCLED = "MOCK_MEDIA_INFO_WHAT_RECYCLED";
    public static final int REASON_BY_TOKEN = 0;
    public static final int REASON_BY_TOPIC_ID = 1;
    public static final int REASON_NEW = 2;
    public static tfi b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, wg1<IMediaPlayer>> f28687a = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements wg1.a<IMediaPlayer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ywg f28688a;
        public final /* synthetic */ String b;

        public a(ywg ywgVar, String str) {
            this.f28688a = ywgVar;
            this.b = str;
        }

        public void a(wg1<IMediaPlayer> wg1Var, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f91b7d6", new Object[]{this, wg1Var, new Integer(i)});
                return;
            }
            IMediaPlayer b = wg1Var.b();
            if (tfi.a(tfi.this, this.f28688a) && b != null) {
                b.release();
                b.destroy();
            }
            tfi.b(tfi.this, this.b, b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final wg1<IMediaPlayer> f28689a;
        public final int b;

        static {
            t2o.a(779093490);
        }

        public b(wg1<IMediaPlayer> wg1Var, int i) {
            this.f28689a = wg1Var;
            this.b = i;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "FindPlayerRefRet{mPlayerAtomicRefCounted=" + this.f28689a + ", reason=" + this.b + '}';
        }
    }

    static {
        t2o.a(779093487);
    }

    public static /* synthetic */ boolean a(tfi tfiVar, ywg ywgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7613dcba", new Object[]{tfiVar, ywgVar})).booleanValue();
        }
        return tfiVar.f(ywgVar);
    }

    public static /* synthetic */ void b(tfi tfiVar, String str, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3670b42f", new Object[]{tfiVar, str, iMediaPlayer});
        } else {
            tfiVar.n(str, iMediaPlayer);
        }
    }

    @Deprecated
    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c61935ce", new Object[0]);
        }
        return UUID.randomUUID().toString();
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5bf6e9c4", new Object[]{str});
        }
        return str + UUID.randomUUID().toString();
    }

    public static tfi i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tfi) ipChange.ipc$dispatch("5fef1769", new Object[0]);
        }
        if (b == null) {
            b = new tfi();
        }
        return b;
    }

    public String c(IMediaPlayer iMediaPlayer, ywg ywgVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aafc92a6", new Object[]{this, iMediaPlayer, ywgVar, str});
        }
        String g = g();
        if (TextUtils.isEmpty(str)) {
            str = g;
        }
        this.f28687a.put(str, new wg1<>(iMediaPlayer, new a(ywgVar, str)));
        return str;
    }

    public void d(IMediaPlayer iMediaPlayer) {
        HashMap<String, wg1<IMediaPlayer>> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7758b7cb", new Object[]{this, iMediaPlayer});
        } else if (iMediaPlayer != null && (hashMap = this.f28687a) != null) {
            Iterator<Map.Entry<String, wg1<IMediaPlayer>>> it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                wg1<IMediaPlayer> value = it.next().getValue();
                if (value != null && value.b() == iMediaPlayer) {
                    it.remove();
                }
            }
        }
    }

    public void e(IMediaPlayer iMediaPlayer) {
        wg1<IMediaPlayer> wg1Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84c1b678", new Object[]{this, iMediaPlayer});
        } else if (iMediaPlayer != null) {
            Iterator<Map.Entry<String, wg1<IMediaPlayer>>> it = this.f28687a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    wg1Var = null;
                    break;
                }
                wg1Var = it.next().getValue();
                if (wg1Var != null && wg1Var.b() == iMediaPlayer) {
                    break;
                }
            }
            if (wg1Var != null) {
                wg1Var.a();
                return;
            }
            iMediaPlayer.release();
            iMediaPlayer.destroy();
        }
    }

    public final boolean f(ywg ywgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe90ef3b", new Object[]{this, ywgVar})).booleanValue();
        }
        if (!nqo.m() || ywgVar == null) {
            return true;
        }
        return false;
    }

    public boolean j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff05093a", new Object[]{this, str, str2})).booleanValue();
        }
        if (nqo.m()) {
            return k(str2);
        }
        ufi ufiVar = new ufi();
        ufiVar.b = str2;
        ufiVar.f29342a = str;
        b l = l(ufiVar);
        if (l == null) {
            return false;
        }
        cir.a("PlayerRecycle", "hasPlayer refRet = " + l.b);
        if (l.f28689a != null) {
            return true;
        }
        return false;
    }

    public final b l(ufi ufiVar) {
        wg1<IMediaPlayer> wg1Var;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("30dcb404", new Object[]{this, ufiVar});
        }
        if (TextUtils.isEmpty(ufiVar.f29342a) || !this.f28687a.containsKey(ufiVar.f29342a)) {
            if (!TextUtils.isEmpty(ufiVar.b)) {
                for (Map.Entry<String, wg1<IMediaPlayer>> entry : this.f28687a.entrySet()) {
                    if (entry.getKey() != null && entry.getKey().startsWith(ufiVar.b)) {
                        cir.a("PlayerRecycle", "hasPlayerRef by topicID = " + ufiVar.b);
                        wg1Var = entry.getValue();
                        i = 1;
                        break;
                    }
                }
            }
            wg1Var = null;
            i = -1;
        } else {
            wg1Var = this.f28687a.get(ufiVar.f29342a);
            cir.a("PlayerRecycle", "hasPlayerRef by token = " + ufiVar.f29342a);
        }
        return new b(wg1Var, i);
    }

    public boolean m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c1ec8d4", new Object[]{this, str})).booleanValue();
        }
        if (nqo.m()) {
            return k(str);
        }
        return this.f28687a.containsKey(str);
    }

    public final void n(String str, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("657a1268", new Object[]{this, str, iMediaPlayer});
        } else if (!nqo.g()) {
            this.f28687a.remove(str);
        } else {
            d(iMediaPlayer);
        }
    }

    public static boolean k(String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfb86698", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            z = s.c.g(str);
        }
        o3s.b("PlayerRecycle", "播放器标准化，是否有在播的实例？" + z + ", topicID: " + str);
        return z;
    }
}
