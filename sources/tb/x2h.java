package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x2h implements ylc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f31100a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ inr d;

        public a(Context context, String str, String str2, inr inrVar) {
            this.f31100a = context;
            this.b = str;
            this.c = str2;
            this.d = inrVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                boolean b = v2s.o().g().b(this.f31100a, this.b, this.c);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("succ", (Object) Boolean.valueOf(b));
                this.d.d(jSONObject.toJSONString());
            } catch (Error | Exception e) {
                e.printStackTrace();
                this.d.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f31101a;
        public final /* synthetic */ String b;
        public final /* synthetic */ inr c;

        public b(Context context, String str, inr inrVar) {
            this.f31101a = context;
            this.b = str;
            this.c = inrVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Object a2 = v2s.o().g().a(this.f31101a, this.b);
                String str = a2 instanceof String ? (String) a2 : null;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("succ", (Object) Boolean.valueOf(true ^ TextUtils.isEmpty(str)));
                jSONObject.put("data", (Object) str);
                this.c.d(jSONObject.toJSONString());
            } catch (Error e2) {
                e = e2;
                e.printStackTrace();
                this.c.a();
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                this.c.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements cqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ inr f31102a;

        public c(x2h x2hVar, inr inrVar) {
            this.f31102a = inrVar;
        }

        @Override // tb.cqk
        public void R1(JSONObject jSONObject) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d1f21fde", new Object[]{this, jSONObject});
                return;
            }
            try {
                if (tws.g()) {
                    inr inrVar = this.f31102a;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    inrVar.c(jSONObject);
                    return;
                }
                if (jSONObject == null) {
                    str = "{}";
                } else {
                    str = jSONObject.toJSONString();
                }
                this.f31102a.d(str);
            } catch (Exception e) {
                jbu.b("getComponentList_track", "errorCode=onSuccess " + e.toString());
                this.f31102a.b(" error onSuccessComponentListListener");
            }
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            try {
                if (netResponse.getBytedata() == null) {
                    str = "{}";
                } else {
                    str = new String(netResponse.getBytedata());
                }
                this.f31102a.b(str);
                jbu.b("getComponentList_track", "errorCode=onError_" + i);
            } catch (Exception e) {
                jbu.b("getComponentList_track", "errorCode=onError_" + i + "_" + e.toString());
                inr inrVar = this.f31102a;
                StringBuilder sb = new StringBuilder("onError_");
                sb.append(i);
                inrVar.b(sb.toString());
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            try {
                if (tws.g()) {
                    this.f31102a.e(netResponse.getBytedata());
                    return;
                }
                if (netResponse.getBytedata() == null) {
                    str = "{}";
                } else {
                    str = new String(netResponse.getBytedata());
                }
                this.f31102a.d(str);
            } catch (Exception e) {
                jbu.b("getComponentList_track", "errorCode=onSuccess " + e.toString());
                inr inrVar = this.f31102a;
                inrVar.b("onSuccess" + i);
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                onError(i, netResponse, obj);
            }
        }
    }

    static {
        t2o.a(295699922);
        t2o.a(295699900);
    }

    @Override // tb.ylc
    public void a(ukr ukrVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5619b516", new Object[]{this, ukrVar, map});
        } else if (ukrVar != null && ukrVar.d() != null) {
            cwd A = v2s.o().A();
            A.c("interactUpdateEntranceAnimateView", "interactUpdateEntranceAnimateView " + map.get("name") + " " + map);
            ukrVar.d().i(map.get("name"), map);
        }
    }

    @Override // tb.ylc
    public void b(ukr ukrVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7132aad", new Object[]{this, ukrVar, map});
        } else if (ukrVar != null && ukrVar.d() != null) {
            cwd A = v2s.o().A();
            A.c("interactUpdateEntranceView", "interactUpdateEntranceView " + map.get("name") + " " + map);
            ukrVar.d().h(map.get("name"), map);
        }
    }

    @Override // tb.ylc
    public void c(IWVWebView iWVWebView, ukr ukrVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a8126d5", new Object[]{this, iWVWebView, ukrVar, new Integer(i)});
        } else if (ukrVar != null && ukrVar.V() != null) {
            ukrVar.V().i(iWVWebView, i);
        }
    }

    @Override // tb.ylc
    public void d(ukr ukrVar, Map<String, String> map) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7696975", new Object[]{this, ukrVar, map});
            return;
        }
        int size = map.size();
        String[] strArr = new String[size];
        for (String str : map.keySet()) {
            if (size > i) {
                strArr[i] = str + "=" + map.get(str);
                i++;
            }
        }
        jbu.d(ukrVar, "interact", strArr);
    }

    public void e(ukr ukrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e72abb", new Object[]{this, ukrVar});
        } else if (ukrVar != null && ukrVar.d() != null) {
            ukrVar.d().j();
        }
    }

    public void f(ukr ukrVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54da821", new Object[]{this, ukrVar, map});
        } else if (ukrVar != null && ukrVar.d() != null) {
            ukrVar.d().b(map.get("componentName"), map);
        }
    }

    public void g(inr inrVar, Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2691750", new Object[]{this, inrVar, context, str, str2});
        } else {
            AsyncTask.execute(new a(context, str, str2, inrVar));
        }
    }

    public boolean h(inr inrVar, ukr ukrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74602e35", new Object[]{this, inrVar, ukrVar})).booleanValue();
        }
        if (ukrVar != null) {
            ukrVar.N(new c(this, inrVar), false);
            return true;
        }
        jbu.b("getComponentList_track", "errorCode=manager is null");
        return false;
    }

    public void i(inr inrVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff187fe", new Object[]{this, inrVar, context, str});
        } else {
            AsyncTask.execute(new b(context, str, inrVar));
        }
    }

    public String j(ukr ukrVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ab93db0", new Object[]{this, ukrVar, context});
        }
        if (ukrVar != null) {
            return ukrVar.c0();
        }
        return "";
    }

    public int k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8becb6f", new Object[]{this, context})).intValue();
        }
        return h5m.c(context);
    }

    public void l(ukr ukrVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dfde4a2", new Object[]{this, ukrVar, hashMap});
        } else {
            jbu.g(ukrVar, "Show-interact", hashMap);
        }
    }

    public void m(ukr ukrVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29df994", new Object[]{this, ukrVar, map});
        } else if (ukrVar != null && ukrVar.d() != null) {
            String str = map.get("componentName");
            if (!TextUtils.isEmpty(str)) {
                ukrVar.d().f(str, map);
            }
        }
    }

    public void n(ukr ukrVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("682d200a", new Object[]{this, ukrVar, map});
        } else if (ukrVar != null && ukrVar.d() != null) {
            String str = map.get("componentName");
            if (!TextUtils.isEmpty(str)) {
                ukrVar.d().k(str, map);
            }
        }
    }

    public void o(ukr ukrVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6282d38b", new Object[]{this, ukrVar, map});
        } else if (ukrVar != null && ukrVar.d() != null) {
            String str = map.get("componentName");
            if (!TextUtils.isEmpty(str)) {
                ukrVar.d().e(str, map);
            }
        }
    }

    public boolean p(inr inrVar, ukr ukrVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2a79c69", new Object[]{this, inrVar, ukrVar, str, str2})).booleanValue();
        }
        return false;
    }

    public String q(ukr ukrVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("547806ee", new Object[]{this, ukrVar, map});
        }
        if (ukrVar == null || ukrVar.d() == null) {
            return "";
        }
        String str = map.get("name");
        if (!TextUtils.isEmpty(str)) {
            return ukrVar.d().g(str, map);
        }
        return "";
    }

    public boolean r(ukr ukrVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d53112b2", new Object[]{this, ukrVar, context, str})).booleanValue();
        }
        if (ukrVar != null) {
            return TextUtils.equals(ukrVar.c0(), str);
        }
        return true;
    }

    public void t(IWVWebView iWVWebView, ukr ukrVar, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6d181f3", new Object[]{this, iWVWebView, ukrVar, strArr});
        } else if (ukrVar != null && ukrVar.V() != null && strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    ukrVar.V().i(iWVWebView, zqq.j(str));
                }
            }
        }
    }

    public void u(IWVWebView iWVWebView, ukr ukrVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8f3b4e", new Object[]{this, iWVWebView, ukrVar, new Integer(i)});
        } else if (ukrVar != null && ukrVar.V() != null) {
            ukrVar.V().j(iWVWebView, i);
        }
    }

    public void v(IWVWebView iWVWebView, ukr ukrVar, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eca05ac", new Object[]{this, iWVWebView, ukrVar, strArr});
        } else if (ukrVar != null && ukrVar.V() != null && strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    ukrVar.V().j(iWVWebView, zqq.j(str));
                }
            }
        }
    }

    public void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63586b2", new Object[]{this, str, str2});
        } else {
            sjr.g().c("com.taobao.taolive.room.component.intimacy.update", str2, str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r9.equals(com.taobao.taolive.sdk.configurable.ComponentGroupConfig.RIGHT_SIDE_INTERACTION_ENTRANCE) == false) goto L_0x0036;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.fastjson.JSONObject s(tb.ukr r7, android.content.Context r8, java.lang.String r9) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.x2h.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001e
            java.lang.String r4 = "5992e018"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r7 = 3
            r5[r7] = r9
            java.lang.Object r7 = r3.ipc$dispatch(r4, r5)
            com.alibaba.fastjson.JSONObject r7 = (com.alibaba.fastjson.JSONObject) r7
            return r7
        L_0x001e:
            com.alibaba.fastjson.JSONObject r3 = new com.alibaba.fastjson.JSONObject
            r3.<init>()
            if (r7 == 0) goto L_0x00ba
            tb.aeb r7 = r7.getActionAdapter()
            if (r7 == 0) goto L_0x00ba
            r9.hashCode()
            r4 = -1
            int r5 = r9.hashCode()
            switch(r5) {
                case -533971622: goto L_0x004c;
                case 252098227: goto L_0x0041;
                case 868569800: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            r0 = -1
            goto L_0x0056
        L_0x0038:
            java.lang.String r1 = "InteractionEntrance"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0056
            goto L_0x0036
        L_0x0041:
            java.lang.String r0 = "GoodEntrance"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x004a
            goto L_0x0036
        L_0x004a:
            r0 = 1
            goto L_0x0056
        L_0x004c:
            java.lang.String r0 = "IntimacyEntrance"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0055
            goto L_0x0036
        L_0x0055:
            r0 = 0
        L_0x0056:
            switch(r0) {
                case 0: goto L_0x0060;
                case 1: goto L_0x005d;
                case 2: goto L_0x005a;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0062
        L_0x005a:
            java.lang.String r9 = "RightComponent"
            goto L_0x0062
        L_0x005d:
            java.lang.String r9 = "goods"
            goto L_0x0062
        L_0x0060:
            java.lang.String r9 = "SystemComponent"
        L_0x0062:
            android.view.View r7 = r7.q(r9)
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            if (r7 == 0) goto L_0x0070
            r7.getGlobalVisibleRect(r9)
        L_0x0070:
            if (r8 == 0) goto L_0x007d
            android.content.res.Resources r7 = r8.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            goto L_0x007f
        L_0x007d:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x007f:
            int r8 = r9.left
            float r8 = (float) r8
            float r8 = r8 / r7
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            java.lang.String r0 = "x"
            r3.put(r0, r8)
            int r8 = r9.top
            float r8 = (float) r8
            float r8 = r8 / r7
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            java.lang.String r0 = "y"
            r3.put(r0, r8)
            int r8 = r9.width()
            float r8 = (float) r8
            float r8 = r8 / r7
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            java.lang.String r0 = "width"
            r3.put(r0, r8)
            int r8 = r9.height()
            float r8 = (float) r8
            float r8 = r8 / r7
            java.lang.Float r7 = java.lang.Float.valueOf(r8)
            java.lang.String r8 = "height"
            r3.put(r8, r7)
        L_0x00ba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.x2h.s(tb.ukr, android.content.Context, java.lang.String):com.alibaba.fastjson.JSONObject");
    }
}
