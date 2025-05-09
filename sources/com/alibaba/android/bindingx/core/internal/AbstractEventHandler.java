package com.alibaba.android.bindingx.core.internal;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.bindingx.core.BindingXJSFunctionRegister;
import com.alibaba.android.bindingx.core.BindingXPropertyInterceptor;
import com.alibaba.android.bindingx.core.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.bb2;
import tb.bq8;
import tb.fr8;
import tb.gcc;
import tb.gfh;
import tb.i3c;
import tb.pqf;
import tb.pxv;
import tb.t2o;
import tb.zq8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class AbstractEventHandler implements i3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile Map<String, List<zq8>> f2170a;
    public volatile Map<String, fr8> b;
    public bb2.g c;
    public final String e;
    public String f;
    public String g;
    public final a h;
    public gcc i;
    public volatile fr8 j;
    public Object[] k;
    public Map<String, Object> m;
    public final Map<String, Object> d = new HashMap(64);
    public final Cache<String, bq8> l = new Cache<>(16);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Cache<K, V> extends LinkedHashMap<K, V> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int maxSize;

        static {
            t2o.a(87031839);
        }

        public Cache(int i) {
            super(4, 0.75f, true);
            this.maxSize = Math.max(i, 4);
        }

        public static /* synthetic */ Object ipc$super(Cache cache, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/bindingx/core/internal/AbstractEventHandler$Cache");
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
            }
            if (size() > this.maxSize) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(87031838);
        t2o.a(87031825);
    }

    public AbstractEventHandler(Context context, a aVar, Object... objArr) {
        String str;
        new WeakReference(context);
        this.h = aVar;
        if (objArr != null && objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                str = (String) obj;
                this.e = str;
            }
        }
        str = null;
        this.e = str;
    }

    @Override // tb.i3c
    public void c(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca699277", new Object[]{this, map});
        }
    }

    @Override // tb.i3c
    public void d(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c829fc5", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
            this.m = Collections.emptyMap();
        } else {
            this.m = map;
        }
    }

    @Override // tb.k3c
    public void f(Map<String, fr8> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a394d5ae", new Object[]{this, map});
        } else {
            this.b = map;
        }
    }

    @Override // tb.i3c
    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52febcf8", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    @Override // tb.i3c
    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99ac208", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    @Override // tb.i3c
    public void k(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c41a207", new Object[]{this, objArr});
        } else {
            this.k = objArr;
        }
    }

    @Override // tb.i3c
    public void m(gcc gccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d214569f", new Object[]{this, gccVar});
        } else {
            this.i = gccVar;
        }
    }

    @Override // tb.i3c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.l.clear();
        BindingXPropertyInterceptor.getInstance().clearCallbacks();
    }

    @Override // tb.i3c
    public void p(String str, Map<String, Object> map, fr8 fr8Var, List<Map<String, Object>> list, bb2.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ba9a2f", new Object[]{this, str, map, fr8Var, list, gVar});
            return;
        }
        r();
        y(str, list);
        this.c = gVar;
        this.j = fr8Var;
        if (!((HashMap) this.d).isEmpty()) {
            ((HashMap) this.d).clear();
        }
        q();
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29feba93", new Object[]{this});
            return;
        }
        Map<String, pqf> jSFunctions = BindingXJSFunctionRegister.getInstance().getJSFunctions();
        if (jSFunctions != null && !jSFunctions.isEmpty()) {
            ((HashMap) this.d).putAll(jSFunctions);
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a245dd5", new Object[]{this});
            return;
        }
        gfh.a("all expression are cleared");
        if (this.f2170a != null) {
            this.f2170a.clear();
            this.f2170a = null;
        }
        this.j = null;
    }

    public abstract void v(Map<String, Object> map);

    public abstract void w(String str, Map<String, Object> map);

    public final void y(String str, List<Map<String, Object>> list) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72f0892b", new Object[]{this, str, list});
            return;
        }
        if (this.f2170a == null) {
            this.f2170a = new HashMap();
        }
        for (Map<String, Object> map2 : list) {
            String h = pxv.h(map2, "element");
            String h2 = pxv.h(map2, "instanceId");
            String h3 = pxv.h(map2, "property");
            fr8 e = pxv.e(map2, DXTraceUtil.TYPE_EXPRESSION_STRING);
            Object obj = map2.get("config");
            if (obj != null && (obj instanceof Map)) {
                try {
                    map = pxv.o(new JSONObject((Map) obj));
                } catch (Exception e2) {
                    gfh.c("parse config failed", e2);
                }
                if (!TextUtils.isEmpty(h) || TextUtils.isEmpty(h3) || e == null) {
                    gfh.b("skip illegal binding args[" + h + "," + h3 + "," + e + "]");
                } else {
                    zq8 zq8Var = new zq8(h, h2, e, h3, str, map);
                    List list2 = (List) ((HashMap) this.f2170a).get(h);
                    if (list2 == null) {
                        ArrayList arrayList = new ArrayList(4);
                        ((HashMap) this.f2170a).put(h, arrayList);
                        arrayList.add(zq8Var);
                    } else if (!list2.contains(zq8Var)) {
                        list2.add(zq8Var);
                    }
                }
            }
            map = null;
            if (!TextUtils.isEmpty(h)) {
            }
            gfh.b("skip illegal binding args[" + h + "," + h3 + "," + e + "]");
        }
    }

    public final void z(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aea872", new Object[]{this, map});
        } else if (this.b != null && !this.b.isEmpty()) {
            for (Map.Entry<String, fr8> entry : this.b.entrySet()) {
                String key = entry.getKey();
                fr8 value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    x(key, value, map);
                }
            }
        }
    }

    public boolean t(fr8 fr8Var, Map<String, Object> map) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d66b5dad", new Object[]{this, fr8Var, map})).booleanValue();
        }
        if (fr8.c(fr8Var)) {
            bq8 a2 = bq8.a(fr8Var);
            if (a2 == null) {
                return false;
            }
            try {
                z = ((Boolean) a2.c(map)).booleanValue();
            } catch (Exception e) {
                gfh.c("evaluateExitExpression failed. ", e);
            }
        }
        if (z) {
            r();
            try {
                v(map);
            } catch (Exception e2) {
                gfh.c("execute exit expression failed: ", e2);
            }
            gfh.a("exit = true,consume finished");
        }
        return z;
    }

    public void x(String str, fr8 fr8Var, Map<String, Object> map) {
        bq8 a2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee276d7", new Object[]{this, str, fr8Var, map});
        } else if (fr8.c(fr8Var) && (a2 = bq8.a(fr8Var)) != null) {
            try {
                z = ((Boolean) a2.c(map)).booleanValue();
            } catch (Exception e) {
                gfh.c("evaluate interceptor [" + str + "] expression failed. ", e);
            }
            if (z) {
                w(str, map);
            }
        }
    }

    public void s(Map<String, List<zq8>> map, Map<String, Object> map2, String str) throws IllegalArgumentException, JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f091f65", new Object[]{this, map, map2, str});
            return;
        }
        z(map2);
        if (map == null) {
            gfh.b("expression args is null");
        } else if (map.isEmpty()) {
            gfh.b("no expression need consumed");
        } else {
            if (gfh.f19951a) {
                gfh.a(String.format(Locale.getDefault(), "consume expression with %d tasks. event type is %s", Integer.valueOf(map.size()), str));
            }
            u(map, map2, str);
        }
    }

    public final void u(Map<String, List<zq8>> map, Map<String, Object> map2, String str) throws JSONException {
        int i;
        String str2;
        Map<String, Object> map3 = map2;
        String str3 = str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec247b8c", new Object[]{this, map, map3, str3});
            return;
        }
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList(map.values());
        int i2 = 0;
        while (i2 < arrayList.size()) {
            List list = (List) arrayList.get(i2);
            int i3 = 0;
            while (i3 < list.size()) {
                zq8 zq8Var = (zq8) list.get(i3);
                if (!str3.equals(zq8Var.e)) {
                    gfh.a("skip expression with wrong event type.[expected:" + str3 + ",found:" + zq8Var.e + "]");
                } else {
                    linkedList.clear();
                    Object[] objArr = this.k;
                    if (objArr != null && objArr.length > 0) {
                        Collections.addAll(linkedList, objArr);
                    }
                    if (TextUtils.isEmpty(zq8Var.b)) {
                        str2 = this.e;
                    } else {
                        str2 = zq8Var.b;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        linkedList.add(str2);
                    }
                    fr8 fr8Var = zq8Var.c;
                    if (fr8.c(fr8Var)) {
                        bq8 bq8Var = this.l.get(fr8Var.b);
                        if (bq8Var == null) {
                            bq8Var = bq8.a(fr8Var);
                            if (bq8Var != null) {
                                if (!TextUtils.isEmpty(fr8Var.b)) {
                                    this.l.put(fr8Var.b, bq8Var);
                                }
                            }
                        }
                        Object c = bq8Var.c(map3);
                        if (c == null) {
                            gfh.b("failed to execute expression,expression result is null");
                        } else if ((!(c instanceof Double) || !Double.isNaN(((Double) c).doubleValue())) && (!(c instanceof Float) || !Float.isNaN(((Float) c).floatValue()))) {
                            View a2 = this.h.g().a(zq8Var.f32945a, linkedList.toArray());
                            BindingXPropertyInterceptor.getInstance().performIntercept(a2, zq8Var.d, c, this.h.e(), zq8Var.f, zq8Var.f32945a, str2);
                            if (a2 == null) {
                                gfh.b("failed to execute expression,target view not found.[ref:" + zq8Var.f32945a + "]");
                            } else {
                                a.f h = this.h.h();
                                String str4 = zq8Var.d;
                                a.c e = this.h.e();
                                Map<String, Object> map4 = zq8Var.f;
                                i = 1;
                                h.a(a2, str4, c, e, map4, zq8Var.f32945a, str2);
                                i3 += i;
                                map3 = map2;
                                str3 = str;
                            }
                        } else {
                            gfh.b("failed to execute expression,expression result is NaN");
                        }
                    }
                }
                i = 1;
                i3 += i;
                map3 = map2;
                str3 = str;
            }
            i2++;
            map3 = map2;
            str3 = str;
        }
    }
}
