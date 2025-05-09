package com.taobao.tao.flexbox.layoutmanager.core;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.f;
import com.taobao.tao.flexbox.layoutmanager.core.h;
import com.taobao.tao.flexbox.layoutmanager.filter.Utils;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.akt;
import tb.eq8;
import tb.hqq;
import tb.igs;
import tb.iuo;
import tb.nwv;
import tb.pg1;
import tb.qtl;
import tb.t2o;
import tb.tfs;
import tb.zh9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class r implements iuo, Utils.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CELL_DIFF_NAME = "cell_diff";
    public static final HashMap<String, List<String>> w = new HashMap<>();
    public static final String[] x = {pg1.ATOM_EXT_repeat, "if", "elseif", "key", Constants.Name.SCOPE};
    public static final String[] y = {pg1.ATOM_EXT_repeat, "if", "elseif", Constants.Name.SCOPE};

    /* renamed from: a  reason: collision with root package name */
    public o f12286a;
    public final r b;
    public r c;
    public final Map d;
    public n f;
    public final Map g;
    public final f.h h;
    public final f.h i;
    public final String j;
    public final c k;
    public final Object l;
    public final String m;
    public final Map o;
    public HashMap<String, Object> p;
    public Object q;
    public Utils.b s;
    public volatile boolean t;
    public boolean u;
    public final b r = new b();
    public final e v = new a();
    public final List<r> e = new LinkedList();
    public final HashMap<String, Object> n = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(r rVar, s sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("872841b6", new Object[]{this, rVar, sVar});
                return;
            }
            rVar.F(sVar.b);
            rVar.k.b = sVar.d.b;
            if (sVar.g != null) {
                if (rVar.s == null) {
                    rVar.s = new Utils.a();
                }
                ((Utils.a) rVar.s).c(sVar.g);
            }
        }

        public boolean b(r rVar, s sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f22ac862", new Object[]{this, rVar, sVar})).booleanValue();
            }
            if (rVar.i == sVar.f12291a) {
                return true;
            }
            return false;
        }

        public r c(s sVar) {
            Map jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (r) ipChange.ipc$dispatch("8d74fd3d", new Object[]{this, sVar});
            }
            f.h hVar = sVar.e;
            r rVar = r.this;
            if (hVar == rVar.h) {
                jSONObject = rVar.o;
            } else {
                jSONObject = new JSONObject();
                Map map = sVar.f12291a.j;
                if (map != null) {
                    jSONObject.putAll(map);
                }
            }
            r rVar2 = r.this;
            r rVar3 = new r(rVar2.f12286a, rVar2.g, sVar.e, sVar.f12291a, sVar.b, rVar2.d, jSONObject, rVar2, sVar.f, sVar.c, sVar.d);
            rVar3.s = sVar.g;
            return rVar3;
        }

        public Object d(r rVar, s sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("381510da", new Object[]{this, rVar, sVar});
            }
            if (sVar != null) {
                if (sVar.c != null) {
                    return new h.a(sVar.f12291a, sVar.c);
                }
                if (r.e(sVar.f12291a, pg1.ATOM_EXT_repeat) != null) {
                    return new h.a(sVar.f12291a, sVar.b);
                }
                f.h hVar = sVar.f12291a;
                return new h.a(hVar, hVar);
            } else if (rVar == null) {
                return null;
            } else {
                if (rVar.l != null) {
                    return new h.a(rVar.i, rVar.l);
                }
                HashMap<String, Object> hashMap = rVar.n;
                if (hashMap != null && hashMap.containsKey("key")) {
                    return new h.a(rVar.i, rVar.n.get("key"));
                }
                if (r.e(rVar.i, pg1.ATOM_EXT_repeat) != null) {
                    return new h.a(rVar.i, rVar.q);
                }
                f.h hVar2 = rVar.i;
                return new h.a(hVar2, hVar2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final r f12290a;
        public final List<qtl> b;

        static {
            t2o.a(503317206);
        }

        public d(r rVar, List<qtl> list) {
            this.f12290a = rVar;
            this.b = list;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e {
    }

    public r(o oVar, Map map, f.h hVar, f.h hVar2, Object obj, Map map2, Map map3, r rVar, String str, Object obj2, c cVar) {
        this.f12286a = oVar;
        this.g = map;
        this.h = hVar;
        this.i = hVar2;
        this.m = hVar2.f12215a;
        this.q = obj;
        this.c = rVar;
        this.o = map3;
        this.d = map2;
        this.j = str;
        this.l = obj2;
        this.k = cVar;
        if (rVar == null) {
            this.b = this;
            i(hVar2);
            return;
        }
        this.b = rVar.b;
    }

    public static /* synthetic */ Object e(f.h hVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("fcfff052", new Object[]{hVar, str});
        }
        return q(hVar, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object n(com.taobao.tao.flexbox.layoutmanager.core.r r12, java.lang.Object r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.r.n(com.taobao.tao.flexbox.layoutmanager.core.r, java.lang.Object, java.lang.String):java.lang.Object");
    }

    public static Object q(f.h hVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("da9290be", new Object[]{hVar, str});
        }
        Map map = hVar.i;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final boolean A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7f54970", new Object[]{this, str})).booleanValue();
        }
        n nVar = this.f;
        if (nVar == null) {
            nVar = null;
        }
        if (nVar == null || nVar.K() == null || !nVar.K().interceptVNodeDiff(str)) {
            return false;
        }
        return true;
    }

    public final boolean C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5560ce2", new Object[]{this, str})).booleanValue();
        }
        if (str == null || !str.startsWith("[") || !str.endsWith("]")) {
            return false;
        }
        for (int i = 1; i < str.length() - 1; i++) {
            char charAt = str.charAt(i);
            if ('0' > charAt || charAt > '9') {
                return false;
            }
        }
        return true;
    }

    public final String D(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90a0e1d", new Object[]{this, obj, obj2});
        }
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            for (Object obj3 : map.keySet()) {
                Object obj4 = map.get(obj3);
                if (obj == obj4) {
                    return (String) obj3;
                }
                if ((obj4 instanceof List) || (obj4 instanceof Map)) {
                    String D = D(obj, obj4);
                    if (D != null) {
                        if (D.startsWith("[")) {
                            return obj3 + D;
                        }
                        return obj3 + "." + D;
                    }
                }
            }
            return null;
        } else if (!(obj2 instanceof List)) {
            return null;
        } else {
            List list = (List) obj2;
            int s = nwv.s(list, obj, true);
            if (s != -1) {
                return "[" + s + "]";
            }
            for (int i = 0; i < list.size(); i++) {
                String D2 = D(obj, list.get(i));
                if (D2 != null) {
                    return "[" + i + "]." + D2;
                }
            }
            return null;
        }
    }

    public void F(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2d64e7c", new Object[]{this, obj});
        } else if (obj == this.q) {
        } else {
            if (pg1.ATOM_EXT_freeze.equals(q(this.i, Constants.Name.SCOPE))) {
                if (this.q == null) {
                    this.q = new JSONObject();
                }
            } else if (obj != null) {
                this.q = obj;
            } else {
                this.q = new JSONObject();
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.filter.Utils.b
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e95f827", new Object[]{this, str, obj});
            return;
        }
        if (this.s == null) {
            this.s = new Utils.a();
        }
        this.s.a(str, obj);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.filter.Utils.b
    public Object b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("645ce260", new Object[]{this, str});
        }
        Utils.b bVar = this.s;
        if (bVar != null) {
            return bVar.b(str);
        }
        return null;
    }

    @Override // tb.iuo
    public Object c(String str, String str2, List list) {
        Class H;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("902f32e", new Object[]{this, str, str2, list});
        }
        List<String> H2 = nwv.H(str2.substring(2), '.');
        if (H2 == null || H2.size() != 2 || (H = this.f12286a.H(H2.get(0))) == null) {
            return null;
        }
        list.add(this);
        return zh9.b(this, str, this.f12286a, H2.get(0), H, H2.get(1), list);
    }

    public final void j(String[] strArr, Map map, f.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e737ab3", new Object[]{this, strArr, map, hVar});
            return;
        }
        Map map2 = hVar.i;
        if (map2 == null) {
            map2 = new JSONObject();
            hVar.i = map2;
        }
        for (String str : strArr) {
            Object remove = map.remove(str);
            if (remove != null) {
                map2.put(str, remove);
            }
        }
    }

    public final void k(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c52e3e7", new Object[]{this, map});
            return;
        }
        Iterator it = map.keySet().iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("ios-")) {
                it.remove();
            } else if (str.startsWith("android-")) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(str);
            }
        }
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                Object obj = map.get(str2);
                map.remove(str2);
                map.put(str2.substring(8), obj);
            }
            arrayList.clear();
        }
    }

    public final void l(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f35509", new Object[]{this, map});
        } else if (map != null && !map.containsKey("compiled")) {
            for (Object obj : map.values()) {
                if (obj instanceof Map) {
                    k((Map) obj);
                }
            }
            map.put("compiled", Boolean.TRUE);
        }
    }

    public final void m(String[] strArr, Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d021c8b", new Object[]{this, strArr, map, map2});
            return;
        }
        for (String str : strArr) {
            Object obj = map.get(str);
            if (obj != null) {
                map2.put(str, obj);
                map.remove(str);
            }
        }
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e592e9b1", new Object[]{this});
        }
        return this.j;
    }

    public o r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("49f66b1f", new Object[]{this});
        }
        return this.f12286a;
    }

    public String s() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37b484cb", new Object[]{this});
        }
        Object obj = this.q;
        ArrayList arrayList = new ArrayList(5);
        r rVar = this;
        while (true) {
            r rVar2 = rVar.c;
            if (rVar2 == null) {
                break;
            }
            Object obj2 = rVar2.q;
            if (obj != obj2) {
                String D = D(obj, obj2);
                if (D == null) {
                    if (akt.Z()) {
                        rVar = rVar2;
                        break;
                    }
                } else {
                    arrayList.add(0, D);
                }
                obj = rVar2.q;
            }
            rVar = rVar2;
        }
        n p = this.f.f12238a.p();
        if (akt.Z() && (p == null || p.c != rVar)) {
            return null;
        }
        int size = arrayList.size();
        while (true) {
            int i2 = size - 1;
            if (size <= 0) {
                break;
            }
            String str = (String) arrayList.get(i2);
            if (C(str) && i2 >= 1) {
                arrayList.set(size - 2, ((String) arrayList.get(i)) + str);
                arrayList.remove(i2);
            }
            size = i2;
        }
        hqq.b a2 = hqq.a();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            a2.b((String) arrayList.get(i3));
            if (i3 < arrayList.size() - 1) {
                a2.b(".");
            }
        }
        return a2.toString();
    }

    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a2b0675", new Object[]{this});
        }
        LinkedList linkedList = new LinkedList();
        r rVar = this;
        while (rVar.c != null) {
            c cVar = rVar.k;
            if (!cVar.c) {
                return s();
            }
            String str = cVar.f12289a;
            if (str != null) {
                if (cVar.b >= 0) {
                    str = str + "[" + rVar.k.b + "]";
                }
                linkedList.add(0, str);
            }
            rVar = rVar.c;
        }
        n p = this.f.f12238a.p();
        if (akt.Z() && (p == null || p.c != rVar)) {
            return null;
        }
        hqq.b a2 = hqq.a();
        for (int i = 0; i < linkedList.size(); i++) {
            a2.b((String) linkedList.get(i));
            if (i < linkedList.size() - 1) {
                a2.b(".");
            }
        }
        return a2.toString();
    }

    public String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        String str = this.m;
        if (str != null) {
            return str;
        }
        return "";
    }

    public final Map v(String str, List<Map> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("178718b2", new Object[]{this, str, list});
        }
        if (list == null) {
            return null;
        }
        Map map = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            Map map2 = list.get(size);
            if (!(map2 == null || (map = nwv.z(map2.get(str), null)) == null)) {
                break;
            }
        }
        return map;
    }

    public List w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dd3649b9", new Object[]{this});
        }
        return this.e;
    }

    public final Object x(f.h hVar, Object obj, f.h hVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7b36ee50", new Object[]{this, hVar, obj, hVar2});
        }
        Object q = q(hVar, Constants.Name.SCOPE);
        if (q != null) {
            if (q instanceof List) {
                return this.r.e(null, null, this, obj, hVar2, 0, q);
            }
            if ("copy".equals(q)) {
                return nwv.f(obj);
            }
            if (pg1.ATOM_EXT_freeze.equals(q)) {
                return null;
            }
            if (obj instanceof Map) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putAll((Map) obj);
                return jSONObject;
            }
        }
        return obj;
    }

    public n y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("45ec8f69", new Object[]{this});
        }
        return this.f;
    }

    public final HashMap z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8cc9520a", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        Map map = this.i.b;
        if (map != null) {
            hashMap.putAll(map);
        }
        HashMap<String, Object> hashMap2 = this.n;
        if (hashMap2 != null) {
            hashMap.putAll(hashMap2);
        }
        return hashMap;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements iuo, Utils.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public o f12288a;
        public Object b;
        public f.h c;
        public int d;
        public r e;
        public Map f;
        public Utils.b g;

        static {
            t2o.a(503317204);
            t2o.a(503317116);
            t2o.a(503317255);
        }

        public b() {
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.filter.Utils.b
        public void a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e95f827", new Object[]{this, str, obj});
                return;
            }
            Utils.b bVar = this.g;
            if (bVar != null) {
                bVar.a(str, obj);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.filter.Utils.b
        public Object b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("645ce260", new Object[]{this, str});
            }
            Utils.b bVar = this.g;
            if (bVar != null) {
                return bVar.b(str);
            }
            return null;
        }

        @Override // tb.iuo
        public Object c(String str, String str2, List list) {
            Class H;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("902f32e", new Object[]{this, str, str2, list});
            }
            List<String> H2 = nwv.H(str2.substring(2), '.');
            if (H2 == null || H2.size() != 2 || (H = this.f12288a.H(H2.get(0))) == null) {
                return null;
            }
            return zh9.b(this, str, this.f12288a, H2.get(0), H, H2.get(1), list);
        }

        public Object e(Utils.b bVar, String str, r rVar, Object obj, f.h hVar, int i, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("c54e6a62", new Object[]{this, bVar, str, rVar, obj, hVar, new Integer(i), obj2});
            }
            this.e = rVar;
            this.f12288a = rVar.f12286a;
            this.f = rVar.d;
            this.b = obj;
            this.c = hVar;
            this.d = i;
            this.g = bVar;
            Object e = eq8.e(str, obj2, this);
            this.e = null;
            this.f12288a = null;
            this.b = null;
            this.c = null;
            this.d = 0;
            this.f = null;
            this.g = null;
            return e;
        }

        @Override // tb.iuo
        public Object d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("746ce3c7", new Object[]{this, str});
            }
            if (str.equals(".")) {
                return this.b;
            }
            if ('.' == str.charAt(0)) {
                r rVar = this.e;
                while (true) {
                    r rVar2 = rVar.c;
                    if (rVar2 == null) {
                        return rVar.d(str.substring(1));
                    }
                    rVar = rVar2;
                }
            } else {
                if ('$' == str.charAt(0)) {
                    if (str.equals("$")) {
                        return this.f12288a;
                    }
                    if (str.startsWith("$.")) {
                        String substring = str.substring(2);
                        if (substring.equals("index")) {
                            return Integer.valueOf(this.d);
                        }
                        if (substring.startsWith("vm.")) {
                            return r.n(r.this, this.f, substring.substring(3));
                        }
                        if (!substring.equals(Constants.Weex.INSTANCEID)) {
                            return r.n(r.this, this.f12288a.T(), substring);
                        }
                        r rVar3 = this.e;
                        while (true) {
                            r rVar4 = rVar3.c;
                            if (rVar4 == null) {
                                break;
                            }
                            rVar3 = rVar4;
                        }
                        if (rVar3.y() != null) {
                            return Integer.valueOf(rVar3.y().U());
                        }
                        return Integer.valueOf(this.f12288a.d0().U());
                    }
                }
                Object n = r.n(r.this, this.b, str);
                return n == null ? r.n(null, this.c.h, str) : n;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f12289a;
        public int b;
        public boolean c;

        static {
            t2o.a(503317205);
        }

        public c() {
            this.b = -1;
            this.c = true;
        }

        public c(String str, int i) {
            this.c = true;
            this.f12289a = str;
            this.b = i;
        }
    }

    public final boolean B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b369b36c", new Object[]{this, str})).booleanValue();
        }
        return "onpageselected".equals(str) || "ontabselected".equals(str) || "onloading".equals(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d1, code lost:
        r7.t = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.taobao.tao.flexbox.layoutmanager.core.r.d> E(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.r.E(java.lang.String):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(String str, List<qtl> list) {
        String str2;
        Map map;
        Map map2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee6cf72", new Object[]{this, str, list});
            return;
        }
        if (this.p == null) {
            this.p = new HashMap<>();
        } else {
            z = false;
        }
        HashMap hashMap = null;
        List<String> H = str != null ? nwv.H(str, ' ') : null;
        Map z2 = nwv.z(this.g.get("."), null);
        r rVar = this.b;
        if (rVar == null || (map = rVar.i.b) == null) {
            str2 = null;
        } else {
            str2 = nwv.I(map.get("skin-name"), null);
            if (str2 == null && (map2 = this.b.i.g) != null) {
                str2 = nwv.I(eq8.e("skin-name", map2.get("skin-name"), this.b), null);
            }
        }
        ArrayList arrayList = new ArrayList();
        Map map3 = z2 != null ? (Map) z2.get("theme") : null;
        if (map3 != null) {
            if (!TextUtils.isEmpty(str2)) {
                List<String> H2 = nwv.H(str2, ' ');
                if (H2 != null) {
                    for (String str3 : H2) {
                        Map z3 = nwv.z(map3.get(str3), null);
                        if (z3 != null) {
                            arrayList.add(z3);
                        }
                    }
                }
            } else {
                arrayList.add(map3);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l((Map) it.next());
        }
        Map map4 = this.h.d;
        if (map4 != null) {
            l(map4);
            arrayList.add(map4);
        }
        if (H != null) {
            hashMap = new HashMap();
            Iterator<String> it2 = H.iterator();
            while (it2.hasNext()) {
                Map v = v("." + it2.next(), arrayList);
                if (v != null) {
                    hashMap.putAll(v);
                }
            }
        }
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                Object value = entry.getValue();
                if (z) {
                    this.p.put(entry.getKey(), value);
                    list.add(new qtl(5, entry.getKey(), value));
                } else if (!Utils.isEqual(this.p.get(entry.getKey()), value)) {
                    this.p.put(entry.getKey(), value);
                    list.add(new qtl(5, entry.getKey(), value));
                }
            }
        }
    }

    public final void i(f.h hVar) {
        String str;
        String I;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27c48cd9", new Object[]{this, hVar});
        } else if (!hVar.n) {
            igs.a(pg1.ATOM_EXT_compile);
            if ("template".equals(hVar.f12215a)) {
                f.h hVar2 = new f.h();
                Map<? extends String, ? extends Object> map = hVar.b;
                String str2 = hVar.e;
                if (map != null) {
                    String str3 = (String) map.get("src");
                    if (this.g.get(str3) instanceof f.h) {
                        f.h.a(hVar2, (f.h) this.g.get(str3));
                    } else {
                        tfs.e("VNode", "templates map is null for src : " + str3);
                    }
                    map.remove("src");
                }
                List list = hVar.c;
                if (list != null && list.size() > 0) {
                    JSONObject jSONObject = null;
                    ArrayList arrayList = null;
                    for (int i = 0; i < list.size(); i++) {
                        f.h hVar3 = (f.h) list.get(i);
                        Map map2 = hVar3.b;
                        if (map2 == null || (I = nwv.I(map2.get("slot"), null)) == null) {
                            if (arrayList == null) {
                                List list2 = hVar2.c;
                                ArrayList arrayList2 = new ArrayList();
                                if (list2 != null) {
                                    arrayList2.addAll(list2);
                                }
                                arrayList = arrayList2;
                            }
                            arrayList.add(hVar3);
                        } else {
                            if (jSONObject == null) {
                                jSONObject = new JSONObject();
                            }
                            jSONObject.put((JSONObject) I, (String) hVar3);
                        }
                    }
                    if (jSONObject != null) {
                        hVar2.l = jSONObject;
                    }
                    if (arrayList != null) {
                        hVar2.c = arrayList;
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                Map map3 = hVar2.g;
                if (map3 != null) {
                    jSONObject2.putAll(map3);
                }
                Map map4 = hVar.g;
                if (map4 != null) {
                    m(x, map4, jSONObject2);
                }
                if (map4 != null) {
                    hVar2.k = map4;
                }
                if (map != null && !map.isEmpty()) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.putAll(map);
                    hVar2.j = jSONObject3;
                }
                hVar2.g = jSONObject2;
                hVar2.m = true;
                f.h.a(hVar, hVar2);
                if (!TextUtils.isEmpty(str2)) {
                    hVar.e = str2;
                }
            }
            Map h = h("attrs", hVar);
            if (!(h == null || (str = (String) h.get("alias")) == null)) {
                hVar.f12215a = str;
            }
            h("bindattrs", hVar);
            h("parentattrs", hVar);
            h("bindparentattrs", hVar);
            Map map5 = hVar.g;
            if (map5 != null) {
                j(y, map5, hVar);
            }
            hVar.n = true;
            igs.c();
        }
    }

    static {
        t2o.a(503317202);
        t2o.a(503317116);
        t2o.a(503317255);
    }

    @Override // tb.iuo
    public Object d(String str) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("746ce3c7", new Object[]{this, str});
        }
        if (".".equals(str)) {
            return this.q;
        }
        if ('.' == str.charAt(0)) {
            r rVar = this;
            while (true) {
                r rVar2 = rVar.c;
                if (rVar2 == null) {
                    return rVar.d(str.substring(1));
                }
                rVar = rVar2;
            }
        } else {
            if ('$' == str.charAt(0)) {
                if ("$".equals(str)) {
                    return this.f12286a;
                }
                if (str.startsWith("$.")) {
                    String substring = str.substring(2);
                    if ("index".equals(substring)) {
                        r rVar3 = this;
                        while (true) {
                            r rVar4 = rVar3.c;
                            if (rVar4 == null || rVar4.c == null || ((map = rVar3.i.i) != null && map.containsKey(pg1.ATOM_EXT_repeat))) {
                                break;
                            }
                            rVar3 = rVar3.c;
                        }
                        int i = 0;
                        for (r rVar5 : rVar3.c.e) {
                            if (rVar5.i == rVar3.i) {
                                if (rVar5 == rVar3) {
                                    return Integer.valueOf(i);
                                }
                                i++;
                            }
                        }
                        return 0;
                    } else if (substring.equals("props")) {
                        return this.o;
                    } else {
                        if (substring.startsWith("props.")) {
                            return n(this, this.o, substring.substring(6));
                        }
                        if (substring.startsWith("attrs.")) {
                            return n(this, z(), substring.substring(6));
                        }
                        if (substring.startsWith("vm.")) {
                            return n(this, this.d, substring.substring(3));
                        }
                        if (!substring.equals(Constants.Weex.INSTANCEID)) {
                            return n(this, this.f12286a.T(), substring);
                        }
                        r rVar6 = this;
                        while (true) {
                            r rVar7 = rVar6.c;
                            if (rVar7 == null) {
                                break;
                            }
                            rVar6 = rVar7;
                        }
                        if (rVar6.y() != null) {
                            return Integer.valueOf(rVar6.y().U());
                        }
                        return Integer.valueOf(this.f12286a.d0().U());
                    }
                }
            }
            Object n = n(this, this.q, str);
            if (n == null) {
                n = n(this, this.o, str);
            }
            return n == null ? n(null, this.h.h, str) : n;
        }
    }

    public final c g(Object obj, Object obj2, Object obj3, int i, Object obj4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("2f84a226", new Object[]{this, obj, obj2, obj3, new Integer(i), obj4});
        }
        c cVar = new c();
        if (obj3 == obj2) {
            cVar.f12289a = null;
            cVar.b = i;
        } else {
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.size() == 1 && (list.get(0) instanceof String)) {
                    String str = (String) list.get(0);
                    if (str.startsWith("{{") && str.endsWith("}}")) {
                        String substring = str.substring(2, str.length() - 2);
                        if (substring.startsWith("$.") || substring.startsWith(".") || substring.startsWith("*.")) {
                            cVar.f12289a = null;
                        } else {
                            cVar.f12289a = substring;
                        }
                        cVar.b = i;
                        if (cVar.f12289a == null) {
                            cVar.c = false;
                        }
                    }
                }
            }
            if (i == -1) {
                cVar.f12289a = D(obj2, obj3);
                cVar.b = i;
            } else if (i >= 0) {
                String D = D(obj4, obj3);
                cVar.f12289a = D;
                cVar.b = i;
                if (D != null && D.endsWith("]")) {
                    int lastIndexOf = cVar.f12289a.lastIndexOf("[");
                    String str2 = cVar.f12289a;
                    cVar.b = Integer.parseInt(str2.substring(lastIndexOf + 1, str2.length() - 1));
                    cVar.f12289a = cVar.f12289a.substring(0, lastIndexOf);
                }
            }
            if (cVar.f12289a == null) {
                cVar.c = false;
            }
        }
        return cVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r7.equals("attrs") == false) goto L_0x0026;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map h(java.lang.String r7, com.taobao.tao.flexbox.layoutmanager.core.f.h r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.tao.flexbox.layoutmanager.core.r.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001b
            java.lang.String r5 = "b1f2c418"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r6
            r3[r1] = r7
            r3[r0] = r8
            java.lang.Object r7 = r4.ipc$dispatch(r5, r3)
            java.util.Map r7 = (java.util.Map) r7
            return r7
        L_0x001b:
            r7.hashCode()
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1001981477: goto L_0x0048;
                case -928162171: goto L_0x003d;
                case 93152418: goto L_0x0034;
                case 1017067064: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            r0 = -1
            goto L_0x0052
        L_0x0028:
            java.lang.String r0 = "parentattrs"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0032
            goto L_0x0026
        L_0x0032:
            r0 = 3
            goto L_0x0052
        L_0x0034:
            java.lang.String r1 = "attrs"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0052
            goto L_0x0026
        L_0x003d:
            java.lang.String r0 = "bindattrs"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0046
            goto L_0x0026
        L_0x0046:
            r0 = 1
            goto L_0x0052
        L_0x0048:
            java.lang.String r0 = "bindparentattrs"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0051
            goto L_0x0026
        L_0x0051:
            r0 = 0
        L_0x0052:
            switch(r0) {
                case 0: goto L_0x0060;
                case 1: goto L_0x005d;
                case 2: goto L_0x005a;
                case 3: goto L_0x0057;
                default: goto L_0x0055;
            }
        L_0x0055:
            r7 = 0
            goto L_0x0062
        L_0x0057:
            java.util.Map r7 = r8.j
            goto L_0x0062
        L_0x005a:
            java.util.Map r7 = r8.b
            goto L_0x0062
        L_0x005d:
            java.util.Map r7 = r8.g
            goto L_0x0062
        L_0x0060:
            java.util.Map r7 = r8.k
        L_0x0062:
            if (r7 == 0) goto L_0x0067
            r6.k(r7)
        L_0x0067:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.r.h(java.lang.String, com.taobao.tao.flexbox.layoutmanager.core.f$h):java.util.Map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0274 A[EDGE_INSN: B:127:0x0274->B:102:0x0274 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01df  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<tb.qtl> o() {
        /*
            Method dump skipped, instructions count: 723
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.r.o():java.util.List");
    }
}
