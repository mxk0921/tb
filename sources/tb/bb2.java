package tb;

import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.motion.widget.Key;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bb2 implements gcc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, h<i3c, Context, com.alibaba.android.bindingx.core.a>> d = new HashMap(4);

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Map<String, i3c>> f16288a;
    public final Map<String, h<i3c, Context, com.alibaba.android.bindingx.core.a>> b = new HashMap(8);
    public final com.alibaba.android.bindingx.core.a c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements h<i3c, Context, com.alibaba.android.bindingx.core.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(bb2 bb2Var) {
        }

        /* renamed from: b */
        public i3c a(Context context, com.alibaba.android.bindingx.core.a aVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i3c) ipChange.ipc$dispatch("451cd0e1", new Object[]{this, context, aVar, objArr});
            }
            return new nb2(context, aVar, objArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements h<i3c, Context, com.alibaba.android.bindingx.core.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(bb2 bb2Var) {
        }

        /* renamed from: b */
        public i3c a(Context context, com.alibaba.android.bindingx.core.a aVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i3c) ipChange.ipc$dispatch("451cd0e1", new Object[]{this, context, aVar, objArr});
            }
            return new eb2(context, aVar, objArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements h<i3c, Context, com.alibaba.android.bindingx.core.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(bb2 bb2Var) {
        }

        /* renamed from: b */
        public i3c a(Context context, com.alibaba.android.bindingx.core.a aVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i3c) ipChange.ipc$dispatch("451cd0e1", new Object[]{this, context, aVar, objArr});
            }
            return new gb2(context, aVar, objArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements h<i3c, Context, com.alibaba.android.bindingx.core.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(bb2 bb2Var) {
        }

        /* renamed from: b */
        public i3c a(Context context, com.alibaba.android.bindingx.core.a aVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i3c) ipChange.ipc$dispatch("451cd0e1", new Object[]{this, context, aVar, objArr});
            }
            return new cb2(context, aVar, objArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e implements h<i3c, Context, com.alibaba.android.bindingx.core.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(bb2 bb2Var) {
        }

        /* renamed from: b */
        public i3c a(Context context, com.alibaba.android.bindingx.core.a aVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i3c) ipChange.ipc$dispatch("451cd0e1", new Object[]{this, context, aVar, objArr});
            }
            return new mb2(context, aVar, objArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class f implements h<i3c, Context, com.alibaba.android.bindingx.core.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f(bb2 bb2Var) {
        }

        /* renamed from: b */
        public i3c a(Context context, com.alibaba.android.bindingx.core.a aVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i3c) ipChange.ipc$dispatch("451cd0e1", new Object[]{this, context, aVar, objArr});
            }
            return new lb2(context, aVar, objArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface g {
        void callback(Object obj);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface h<Type, ParamA, ParamB> {
        Type a(ParamA parama, ParamB paramb, Object... objArr);
    }

    static {
        t2o.a(87031810);
        t2o.a(87031827);
    }

    public bb2(com.alibaba.android.bindingx.core.a aVar) {
        this.c = aVar;
        l("pan", new a(this));
        l("pinch", new b(this));
        l(Key.ROTATION, new c(this));
        l("orientation", new d(this));
        l("timing", new e(this));
        l(cc5.SPRING_SPEC, new f(this));
    }

    public static void m(String str, h<i3c, Context, com.alibaba.android.bindingx.core.a> hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6a75a6", new Object[]{str, hVar});
        } else if (!TextUtils.isEmpty(str) && hVar != null) {
            ((HashMap) d).put(str, hVar);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("537b2fb2", new Object[]{this, str});
            return;
        }
        Map<String, Map<String, i3c>> map = this.f16288a;
        if (map != null) {
            map.remove(str);
        }
    }

    public final i3c b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i3c) ipChange.ipc$dispatch("9621ff16", new Object[]{this, context, str, str2});
        }
        i3c i3cVar = null;
        if (!((HashMap) this.b).isEmpty() && this.c != null) {
            h hVar = (h) ((HashMap) this.b).get(str2);
            if (hVar == null) {
                hVar = (h) ((HashMap) d).get(str2);
            }
            if (hVar != null) {
                i3cVar = (i3c) hVar.a(context, this.c, str);
            }
            if (i3cVar != null) {
                i3cVar.m(this);
            }
        }
        return i3cVar;
    }

    public String d(String str, String str2, String str3, Map<String, Object> map, fr8 fr8Var, List<Map<String, Object>> list, Map<String, fr8> map2, g gVar, Context context, String str4, Map<String, Object> map3, Object... objArr) {
        String str5;
        String str6;
        Map<String, Map<String, i3c>> map4;
        Map map5;
        Map map6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afe6f3fa", new Object[]{this, str, str2, str3, map, fr8Var, list, map2, gVar, context, str4, map3, objArr});
        }
        i3c i3cVar = null;
        if (TextUtils.isEmpty(str3) || list == null) {
            gfh.b("doBind failed,illegal argument.[" + str3 + "," + list + "]");
            return null;
        }
        if (!(this.f16288a == null || TextUtils.isEmpty(str) || (map6 = (Map) ((HashMap) this.f16288a).get(str)) == null)) {
            i3cVar = (i3c) map6.get(str3);
        }
        if (i3cVar == null) {
            if (gfh.f19951a) {
                gfh.a("binding not enabled,try auto enable it.[sourceRef:" + str + ",eventType:" + str3 + "]");
            }
            str5 = "]";
            String e2 = e(context, str4, str, str2, str3, map, map3, objArr);
            if (!(TextUtils.isEmpty(e2) || (map4 = this.f16288a) == null || (map5 = (Map) ((HashMap) map4).get(e2)) == null)) {
                i3cVar = (i3c) map5.get(str3);
            }
            str6 = e2;
        } else {
            str5 = "]";
            str6 = str;
        }
        if (i3cVar != null) {
            i3cVar.d(map3);
            i3cVar.p(str3, map, fr8Var, list, gVar);
            if (gfh.f19951a) {
                gfh.a("createBinding success.[exitExp:" + fr8Var + ",args:" + list + str5);
            }
            i3cVar.f(map2);
        } else if (gfh.f19951a) {
            gfh.b("internal error.binding failed for ref:" + str + ",type:" + str3);
        }
        return str6;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1443783", new Object[]{this});
            return;
        }
        Map<String, Map<String, i3c>> map = this.f16288a;
        if (map != null) {
            try {
                for (Map map2 : ((HashMap) map).values()) {
                    if (map2 != null && !map2.isEmpty()) {
                        for (i3c i3cVar : map2.values()) {
                            if (i3cVar != null) {
                                i3cVar.onDestroy();
                            }
                        }
                    }
                }
                ((HashMap) this.f16288a).clear();
                this.f16288a = null;
            } catch (Exception e2) {
                gfh.c("release failed", e2);
            }
        }
    }

    public void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbcf0fdc", new Object[]{this, str, str2});
            return;
        }
        gfh.a("disable binding [" + str + "," + str2 + "]");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            gfh.a("disable binding failed(0x1) [" + str + "," + str2 + "]");
            return;
        }
        Map<String, Map<String, i3c>> map = this.f16288a;
        if (map == null || ((HashMap) map).isEmpty()) {
            gfh.a("disable binding failed(0x2) [" + str + "," + str2 + "]");
            return;
        }
        Map map2 = (Map) ((HashMap) this.f16288a).get(str);
        if (map2 == null || map2.isEmpty()) {
            gfh.a("disable binding failed(0x3) [" + str + "," + str2 + "]");
            return;
        }
        i3c i3cVar = (i3c) map2.get(str2);
        if (i3cVar == null) {
            gfh.a("disable binding failed(0x4) [" + str + "," + str2 + "]");
        } else if (i3cVar.b(str, str2)) {
            ((HashMap) this.f16288a).remove(str);
            gfh.a("disable binding success[" + str + "," + str2 + "]");
        } else {
            gfh.a("disabled failed(0x4) [" + str + "," + str2 + "]");
        }
    }

    public void h(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c51d3bd", new Object[]{this, map});
        } else if (map != null) {
            g(pxv.h(map, "token"), pxv.h(map, "eventType"));
        }
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd8eb3f5", new Object[]{this});
        }
        return UUID.randomUUID().toString();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        Map<String, Map<String, i3c>> map = this.f16288a;
        if (map != null) {
            try {
                for (Map map2 : ((HashMap) map).values()) {
                    for (i3c i3cVar : map2.values()) {
                        try {
                            i3cVar.onActivityPause();
                        } catch (Exception e2) {
                            gfh.c("execute activity pause failed.", e2);
                        }
                    }
                }
            } catch (Exception e3) {
                gfh.c("activity pause failed", e3);
            }
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        Map<String, Map<String, i3c>> map = this.f16288a;
        if (map != null) {
            try {
                for (Map map2 : ((HashMap) map).values()) {
                    for (i3c i3cVar : map2.values()) {
                        try {
                            i3cVar.onActivityResume();
                        } catch (Exception e2) {
                            gfh.c("execute activity pause failed.", e2);
                        }
                    }
                }
            } catch (Exception e3) {
                gfh.c("activity pause failed", e3);
            }
        }
    }

    public void l(String str, h<i3c, Context, com.alibaba.android.bindingx.core.a> hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6cbb023", new Object[]{this, str, hVar});
        } else if (!TextUtils.isEmpty(str) && hVar != null) {
            this.b.put(str, hVar);
        }
    }

    public String e(Context context, String str, String str2, String str3, String str4, Map<String, Object> map, Map<String, Object> map2, Object... objArr) {
        i3c i3cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ed5eb7c", new Object[]{this, context, str, str2, str3, str4, map, map2, objArr});
        }
        if (TextUtils.isEmpty(str4)) {
            gfh.b("[doPrepare] failed. can not found eventType");
            return null;
        } else if (context == null) {
            gfh.b("[doPrepare] failed. context or wxInstance is null");
            return null;
        } else {
            if (TextUtils.isEmpty(str2)) {
                str2 = i();
            }
            if (this.f16288a == null) {
                this.f16288a = new HashMap();
            }
            Map map3 = (Map) ((HashMap) this.f16288a).get(str2);
            if (map3 == null || (i3cVar = (i3c) map3.get(str4)) == null) {
                if (map3 == null) {
                    map3 = new HashMap(4);
                    ((HashMap) this.f16288a).put(str2, map3);
                }
                i3c b2 = b(context, str, str4);
                if (b2 != null) {
                    b2.g(str3);
                    b2.h(str2);
                    b2.c(map);
                    b2.k(objArr);
                    if (b2.j(str2, str4)) {
                        b2.e(str2, str4);
                        map3.put(str4, b2);
                        if (gfh.f19951a) {
                            gfh.a("enableBinding success.[token:" + str2 + ",type:" + str4 + "]");
                        }
                    } else {
                        if (gfh.f19951a) {
                            gfh.b("expression enabled failed. [token:" + str2 + ",type:" + str4 + "]");
                        }
                        return null;
                    }
                } else {
                    gfh.b("unknown eventType: " + str4);
                    return null;
                }
            } else {
                if (gfh.f19951a) {
                    gfh.a("you have already enabled binding,[token:" + str2 + ",type:" + str4 + "]");
                }
                i3cVar.k(objArr);
                i3cVar.e(str2, str4);
                if (gfh.f19951a) {
                    gfh.a("enableBinding success.[token:" + str2 + ",type:" + str4 + "]");
                }
            }
            return str2;
        }
    }

    public String c(Context context, String str, Map<String, Object> map, g gVar, Object... objArr) {
        Map<String, Object> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52cd34ff", new Object[]{this, context, str, map, gVar, objArr});
        }
        String h2 = pxv.h(map, "eventType");
        String h3 = pxv.h(map, "instanceId");
        gfh.d(map);
        Object obj = map.get("options");
        if (obj != null && (obj instanceof Map)) {
            try {
                map2 = pxv.o(new JSONObject((Map) obj));
            } catch (Exception e2) {
                gfh.c("parse external config failed.\n", e2);
            }
            return d(pxv.h(map, "anchor"), h3, h2, map2, pxv.e(map, "exitExpression"), pxv.g(map), pxv.c(map), gVar, context, str, map, objArr);
        }
        map2 = null;
        return d(pxv.h(map, "anchor"), h3, h2, map2, pxv.e(map, "exitExpression"), pxv.g(map), pxv.c(map), gVar, context, str, map, objArr);
    }
}
