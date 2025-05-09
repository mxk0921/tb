package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class pa3 extends ku<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final a b = new a();
    public boolean c = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<Long, evb> f25972a = new HashMap();
        public final Map<String, av> b = new HashMap();

        static {
            t2o.a(479199518);
        }

        public void a(String str, av avVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fa2a5e2", new Object[]{this, str, avVar});
            } else {
                ((HashMap) this.b).put(str, avVar);
            }
        }

        public void b(long j, evb evbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9de7eba7", new Object[]{this, new Long(j), evbVar});
            } else {
                ((HashMap) this.f25972a).put(Long.valueOf(j), evbVar);
            }
        }
    }

    static {
        t2o.a(479199517);
    }

    public static Map<Long, evb> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("abcb8", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Long.valueOf(k06.a(u1s.PARSER_TAG)), new u1s());
        hashMap.put(Long.valueOf((long) ui5.DX_PARSER_CARTCURRENTFILTERITEM), new ui5());
        hashMap.put(Long.valueOf((long) mi5.DX_PARSER_ARRAY_SUB), new mi5());
        hashMap.put(6742876832553239298L, new fi5());
        hashMap.put(Long.valueOf((long) ej5.DX_PARSER_CARTPRICESPLIT), new ej5());
        hashMap.put(Long.valueOf((long) in5.DX_PARSER_ISSHOWCALCULATEBTN), new in5());
        hashMap.put(Long.valueOf((long) an5.DX_PARSER_ISCUSTOMBUNDLE), new an5());
        hashMap.put(Long.valueOf((long) bj5.DX_PARSER_CARTISPOPLAYERFILTERING), new bj5());
        hashMap.put(Long.valueOf((long) dj5.DX_PARSER_CARTMODE), new dj5());
        hashMap.put(Long.valueOf((long) ti5.DX_PARSER_CARTCHECKKEEPBUBBLESHOW), new ti5());
        hashMap.put(Long.valueOf((long) hj5.DX_PARSER_CARTSWIPEITEMS), new hj5());
        hashMap.put(Long.valueOf((long) cj5.DX_PARSER_CARTMAPUTILS), new cj5());
        hashMap.put(Long.valueOf((long) zi5.DX_PARSER_CARTGROUPCONTEXT), new zi5());
        hashMap.put(Long.valueOf((long) wi5.DX_PARSER_CARTFILTERCHECKOPTIMIZE), new wi5());
        hashMap.put(Long.valueOf((long) gj5.DX_PARSER_CARTSHOWSUBMITCHECK), new gj5());
        return hashMap;
    }

    public static /* synthetic */ Object ipc$super(pa3 pa3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/performance/preloader/task/impl/CartDXDataParserPreloader");
    }

    /* renamed from: f */
    public a b(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("dd21c306", new Object[]{this, new Boolean(z)});
        }
        if (uc3.c()) {
            boolean z2 = this.c;
            if (z2) {
                str = "命中";
            } else {
                str = "未命中";
            }
            ub3.d("hitDXDataParserPreload", str, z2, 0.001f);
        }
        if (!this.c) {
            return null;
        }
        return this.b;
    }

    @Override // tb.ku
    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781f8ee3", new Object[]{this, context});
            return;
        }
        this.b.a("gradient", new mia());
        this.b.a("theme", new qot());
        this.b.a("platform", new z4m());
        for (Map.Entry<Long, evb> entry : g().entrySet()) {
            this.b.b(entry.getKey().longValue(), entry.getValue());
        }
        this.b.b(k06.a(t1s.PARSER_TAG), new t1s());
        this.b.b(k06.a(s1s.PARSER_TAG), new s1s());
        this.b.b(k06.a("theme"), new c2s());
        this.c = true;
    }
}
