package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class km {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements rcb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.rcb
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c9e3aff5", new Object[]{this});
            }
            return "linear";
        }

        @Override // tb.rcb
        public nt b(AURARenderComponent aURARenderComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nt) ipChange.ipc$dispatch("dde87ea5", new Object[]{this, aURARenderComponent});
            }
            return new lm(aURARenderComponent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements rcb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.rcb
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c9e3aff5", new Object[]{this});
            }
            return "card";
        }

        @Override // tb.rcb
        public nt b(AURARenderComponent aURARenderComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nt) ipChange.ipc$dispatch("dde87ea5", new Object[]{this, aURARenderComponent});
            }
            return new yl(aURARenderComponent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c implements rcb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.rcb
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c9e3aff5", new Object[]{this});
            }
            return "sticky";
        }

        @Override // tb.rcb
        public nt b(AURARenderComponent aURARenderComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nt) ipChange.ipc$dispatch("dde87ea5", new Object[]{this, aURARenderComponent});
            }
            return new rm(aURARenderComponent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class d implements rcb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.rcb
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c9e3aff5", new Object[]{this});
            }
            return "overlay";
        }

        @Override // tb.rcb
        public nt b(AURARenderComponent aURARenderComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nt) ipChange.ipc$dispatch("dde87ea5", new Object[]{this, aURARenderComponent});
            }
            return new nm(aURARenderComponent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class e implements rcb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.rcb
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c9e3aff5", new Object[]{this});
            }
            return pg1.ATOM_EXT_column;
        }

        @Override // tb.rcb
        public nt b(AURARenderComponent aURARenderComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nt) ipChange.ipc$dispatch("dde87ea5", new Object[]{this, aURARenderComponent});
            }
            return new am(aURARenderComponent);
        }
    }

    static {
        t2o.a(80740575);
    }

    public static Map<String, rcb> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("414eae23", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        b(hashMap, new a());
        b(hashMap, new b());
        b(hashMap, new c());
        b(hashMap, new d());
        b(hashMap, new e());
        return hashMap;
    }

    public static void b(Map<String, rcb> map, rcb rcbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5c234b4", new Object[]{map, rcbVar});
        } else {
            map.put(rcbVar.a().toLowerCase(), rcbVar);
        }
    }
}
