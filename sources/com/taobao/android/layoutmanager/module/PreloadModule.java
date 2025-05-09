package com.taobao.android.layoutmanager.module;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.adapter.internal.CommonCode;
import com.taobao.tao.flexbox.layoutmanager.ac.a;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.weex.common.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.bqe;
import tb.dmh;
import tb.gpe;
import tb.iqx;
import tb.jfw;
import tb.kkh;
import tb.noh;
import tb.nwv;
import tb.od0;
import tb.pg1;
import tb.plh;
import tb.t2o;
import tb.ukh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PreloadModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements n.e<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n.e
        public boolean a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("22da08ac", new Object[]{this, obj})).booleanValue();
            }
            if (!(obj instanceof Map) || ((Map) obj).isEmpty()) {
                return true;
            }
            return false;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n.e
        public boolean b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("70812ce6", new Object[]{this, obj})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements n.e<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n.e
        public boolean a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("22da08ac", new Object[]{this, obj})).booleanValue();
            }
            if (!(obj instanceof String) || TextUtils.isEmpty((String) obj)) {
                return true;
            }
            return false;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n.e
        public boolean b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("70812ce6", new Object[]{this, obj})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements n.e<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n.e
        public boolean a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("22da08ac", new Object[]{this, obj})).booleanValue();
            }
            if (!(obj instanceof String) || TextUtils.isEmpty((String) obj)) {
                return true;
            }
            return false;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n.e
        public boolean b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("70812ce6", new Object[]{this, obj})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements a.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8212a;
        public final /* synthetic */ List b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ Map d;
        public final /* synthetic */ int e;
        public final /* synthetic */ d.j f;

        public d(String str, List list, Object obj, Map map, int i, d.j jVar) {
            this.f8212a = str;
            this.b = list;
            this.c = obj;
            this.d = map;
            this.e = i;
            this.f = jVar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.ac.a.c
        public void a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8041160", new Object[]{this, bArr});
                return;
            }
            PreloadModule.a(this.f8212a, bArr);
            PreloadModule.b(this.b, (String) this.c, true, this.d, this.e, this.f);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.ac.a.c
        public void onFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8bb1183", new Object[]{this});
            } else {
                PreloadModule.b(this.b, (String) this.c, false, this.d, this.e, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e implements n.e<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n.e
        public boolean a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("22da08ac", new Object[]{this, obj})).booleanValue();
            }
            if (!(obj instanceof String) || TextUtils.isEmpty((String) obj)) {
                return true;
            }
            return false;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n.e
        public boolean b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("70812ce6", new Object[]{this, obj})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class f implements plh<Throwable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f8213a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ int d;
        public final /* synthetic */ d.j e;

        public f(List list, Object obj, Map map, int i, d.j jVar) {
            this.f8213a = list;
            this.b = obj;
            this.c = map;
            this.d = i;
            this.e = jVar;
        }

        /* renamed from: a */
        public void onResult(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f750ea72", new Object[]{this, th});
            } else {
                PreloadModule.b(this.f8213a, (String) this.b, false, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class g implements plh<kkh> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f8214a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ int d;
        public final /* synthetic */ d.j e;

        public g(List list, Object obj, Map map, int i, d.j jVar) {
            this.f8214a = list;
            this.b = obj;
            this.c = map;
            this.d = i;
            this.e = jVar;
        }

        /* renamed from: a */
        public void onResult(kkh kkhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1419bbae", new Object[]{this, kkhVar});
            } else {
                PreloadModule.b(this.f8214a, (String) this.b, true, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class i implements gpe.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f8215a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ int d;
        public final /* synthetic */ d.j e;

        public i(List list, String str, Map map, int i, d.j jVar) {
            this.f8215a = list;
            this.b = str;
            this.c = map;
            this.d = i;
            this.e = jVar;
        }

        @Override // tb.gpe.b
        public void a(Object obj, Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49f720e8", new Object[]{this, obj, drawable});
            } else {
                PreloadModule.b(this.f8215a, this.b, true, this.c, this.d, this.e);
            }
        }

        @Override // tb.gpe.b
        public void b(Object obj, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7545a341", new Object[]{this, obj, new Integer(i)});
            } else {
                PreloadModule.b(this.f8215a, this.b, false, this.c, this.d, this.e);
            }
        }
    }

    static {
        t2o.a(502268124);
        t2o.a(503316559);
    }

    public static /* synthetic */ void a(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5defa08", new Object[]{str, bArr});
        } else {
            g(str, bArr);
        }
    }

    public static /* synthetic */ void b(List list, String str, boolean z, Map map, int i2, d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7fb5f4", new Object[]{list, str, new Boolean(z), map, new Integer(i2), jVar});
        } else {
            h(list, str, z, map, i2, jVar);
        }
    }

    public static void c(List list, Map map, d.j jVar, List list2) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fdea2dc", new Object[]{list, map, jVar, list2});
        } else if (list2 != null) {
            nwv.s0(list2, new c());
            int size = list2.size();
            for (Object obj : list2) {
                if (obj instanceof String) {
                    IStorage z = od0.D().z();
                    String str = (String) obj;
                    String a2 = noh.a(str);
                    File g2 = z.g(a2);
                    if (g2 == null || !g2.exists()) {
                        if (list == null || map == null) {
                            dVar = null;
                        } else {
                            dVar = new d(a2, list, obj, map, size, jVar);
                        }
                        com.taobao.tao.flexbox.layoutmanager.ac.a.d().c(str, false, dVar);
                    } else {
                        h(list, str, true, map, size, jVar);
                    }
                }
            }
        }
    }

    public static void e(List list, Map map, d.j jVar, List list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b033bf", new Object[]{list, map, jVar, list2});
        } else if (list2 != null) {
            nwv.s0(list2, new e());
            int size = list2.size();
            for (Object obj : list2) {
                dmh<kkh> x = ukh.x(jVar.c(), (String) obj);
                if (!(list == null || map == null)) {
                    x.c(new f(list, obj, map, size, jVar));
                    x.d(new g(list, obj, map, size, jVar));
                }
            }
        }
    }

    public static void f(List list, Map map, d.j jVar, List list2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b1f648", new Object[]{list, map, jVar, list2});
        } else if (list2 != null) {
            nwv.s0(list2, new b());
            int size = list2.size();
            for (Object obj : list2) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (iqx.getInputStreamByUrl(str) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    h(list, str, z, map, size, jVar);
                }
            }
        }
    }

    public static void g(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2f78b1", new Object[]{str, bArr});
        } else {
            od0.D().z().c(str, bArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class h implements n.e<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n.e
        public boolean b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("70812ce6", new Object[]{this, obj})).booleanValue();
            }
            return false;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n.e
        public boolean a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("22da08ac", new Object[]{this, obj})).booleanValue();
            }
            return !(obj instanceof JSONObject) || !((Map) obj).containsKey("url");
        }
    }

    public static void h(List<Map> list, String str, boolean z, Map map, int i2, d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d805425e", new Object[]{list, str, new Boolean(z), map, new Integer(i2), jVar});
        } else if (list != null && map != null) {
            Map map2 = (Map) map.get("result");
            HashMap hashMap = new HashMap();
            hashMap.put("succeed", Boolean.valueOf(z));
            map2.put(str, hashMap);
            if (map2.size() == i2) {
                map.put(pg1.ATOM_done, Boolean.TRUE);
                if (jVar.c != null) {
                    for (Map map3 : list) {
                        if (!nwv.o(map3.get(pg1.ATOM_done), false)) {
                            return;
                        }
                    }
                    jVar.c.a(jVar, list);
                }
            }
        }
    }

    public static void preload(d.j jVar) {
        List<Map> v;
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eac76a3", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if ((json instanceof Map) && (v = nwv.v(((Map) json).get("args"), null)) != null) {
            nwv.s0(v, new a());
            ArrayList arrayList = jVar.e ? new ArrayList(v.size()) : null;
            for (Map map : v) {
                String I = nwv.I(map.get("type"), null);
                if (I != null) {
                    if (arrayList != null) {
                        hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        hashMap.put("type", I);
                        hashMap.put("result", hashMap2);
                        arrayList.add(hashMap);
                    } else {
                        hashMap = null;
                    }
                    char c2 = 65535;
                    switch (I.hashCode()) {
                        case -1096937569:
                            if (I.equals("lottie")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -707794104:
                            if (I.equals("zcache")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 104387:
                            if (I.equals("img")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 3143036:
                            if (I.equals("file")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c2) {
                        case 0:
                            e(arrayList, hashMap, jVar, nwv.v(map.get("list"), null));
                            continue;
                        case 1:
                            f(arrayList, hashMap, jVar, nwv.v(map.get("list"), null));
                            continue;
                        case 2:
                            d(arrayList, hashMap, jVar, nwv.v(map.get("list"), null));
                            continue;
                        case 3:
                            c(arrayList, hashMap, jVar, nwv.v(map.get("list"), null));
                            continue;
                    }
                }
            }
        }
    }

    public static void d(List list, Map map, d.j jVar, List list2) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b3ed389", new Object[]{list, map, jVar, list2});
        } else if (list2 != null) {
            nwv.s0(list2, new h());
            int size = list2.size();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                String string = jSONObject.getString("url");
                int intValue = jSONObject.getIntValue("width");
                int intValue2 = jSONObject.getIntValue("height");
                o oVar = jVar.f11976a;
                n d0 = oVar != null ? oVar.d0() : null;
                int G = intValue > 0 ? jfw.G(d0, jVar.c(), Integer.valueOf(intValue)) : -1;
                int G2 = intValue2 > 0 ? jfw.G(d0, jVar.c(), Integer.valueOf(intValue2)) : -1;
                String string2 = jSONObject.getString("type");
                String string3 = jSONObject.getString("mode");
                boolean booleanValue = jSONObject.getBooleanValue("webp");
                Boolean bool = jSONObject.getBoolean("enable-quality");
                Boolean bool2 = jSONObject.getBoolean("enable-sharpen");
                Boolean bool3 = jSONObject.getBoolean("enable-level-model");
                String string4 = jSONObject.getString("image-quality");
                String string5 = jSONObject.getString("image-sharpen");
                int I = bqe.I(jSONObject.getString("priority"));
                if (Constants.Value.ORIGINAL.equals(string3)) {
                    i2 = 1;
                } else if (CommonCode.MapKey.HAS_RESOLUTION.equals(string3)) {
                    i2 = 512;
                } else {
                    i2 = "shortside".equals(string3) ? 2 : 0;
                }
                if (booleanValue) {
                    i2 |= 4;
                }
                if (bool != null) {
                    i2 = bool.booleanValue() ? i2 | 8 : i2 | 16;
                }
                if (bool2 != null) {
                    i2 = bool2.booleanValue() ? i2 | 32 : i2 | 64;
                }
                if (bool3 != null) {
                    i2 = bool3.booleanValue() ? i2 | 128 : i2 | 256;
                }
                ImageLoader.b l = new ImageLoader.b.a().r(i2).p(string4).q(string5).w(string2).m(true).u(false).v("preload").s(d0 != null ? d0.c0().r().a() : null).t(I).l();
                gpe.g(od0.D().a(), jVar.f11976a, string, gpe.i(jVar.f11976a, jVar.c(), string, G, G2, l, false), G, G2, l, null, false, true, (list == null || map == null) ? null : new i(list, string, map, size, jVar));
            }
        }
    }
}
