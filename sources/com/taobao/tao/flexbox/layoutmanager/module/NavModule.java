package com.taobao.tao.flexbox.layoutmanager.module;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.animation.shareelement.ShareElementAnimationController;
import com.taobao.tao.flexbox.layoutmanager.container.SheetContainer;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.akt;
import tb.anl;
import tb.bjp;
import tb.bqe;
import tb.hzc;
import tb.jfw;
import tb.nwv;
import tb.od0;
import tb.reu;
import tb.t2o;
import tb.tfs;
import tb.ut2;
import tb.vhd;
import tb.w0c;
import tb.ye;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class NavModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FULL_PAGE_SEGMENT = "/app/tb-source-app/video-fullpage/pages/index2";
    public static final String FULL_PAGE_TRANSPARENT_SEGMENT = "/video-fullpage/transparent-videolist.html";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements n.e<n> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map.Entry f12328a;
        public final /* synthetic */ boolean[] b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ List e;

        public a(Map.Entry entry, boolean[] zArr, boolean z, boolean z2, List list) {
            this.f12328a = entry;
            this.b = zArr;
            this.c = z;
            this.d = z2;
            this.e = list;
        }

        /* renamed from: c */
        public boolean a(n nVar) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e13bdd0a", new Object[]{this, nVar})).booleanValue();
            }
            String str = (String) this.f12328a.getValue();
            if (str == null || !str.equals(nVar.H((String) this.f12328a.getKey()))) {
                z = false;
            }
            this.b[0] = z;
            if (!(!z || nVar.K() == null || nVar.K().getTransitionView() == null)) {
                View transitionView = nVar.K().getTransitionView();
                if (this.c) {
                    if (this.d && akt.F()) {
                        str = str + "card";
                        transitionView.setTag(R.id.layout_manager_transition_card_view, Boolean.TRUE);
                    }
                    transitionView.setTransitionName(str);
                    transitionView.setId(str.hashCode());
                    this.e.add(Pair.create(transitionView, transitionView.getTransitionName()));
                }
                NavModule.access$000(nVar);
            }
            return z;
        }

        /* renamed from: d */
        public boolean b(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("429eb190", new Object[]{this, nVar})).booleanValue();
            }
            return this.b[0];
        }
    }

    static {
        t2o.a(503317302);
        t2o.a(503316559);
    }

    public static /* synthetic */ void access$000(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907320bb", new Object[]{nVar});
        } else {
            cacheShareDrawable(nVar);
        }
    }

    private static void cacheShareDrawable(n nVar) {
        Drawable imageDrawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce1c4b50", new Object[]{nVar});
        } else if (nVar.K() instanceof com.taobao.tao.flexbox.layoutmanager.component.a) {
            Drawable imageDrawable2 = ((com.taobao.tao.flexbox.layoutmanager.component.a) nVar.K()).getImageDrawable();
            if (imageDrawable2 != null) {
                ut2.p(((bqe) ((com.taobao.tao.flexbox.layoutmanager.component.a) nVar.K()).getViewParams()).y0, nVar.w0(), imageDrawable2);
            }
        } else if ((nVar.K() instanceof w0c) && (imageDrawable = ((w0c) nVar.K()).getImageDrawable()) != null) {
            ut2.p(((w0c) nVar.K()).getImageUrl(), nVar.w0(), imageDrawable);
        }
    }

    private static void findTransitionViews(o oVar, int i, Pair<Map, List> pair, List<Pair<View, String>> list) {
        n a0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44c61e11", new Object[]{oVar, new Integer(i), pair, list});
        } else if (pair != null && (a0 = oVar.a0(i)) != null) {
            Map map = (Map) pair.first;
            List list2 = (List) pair.second;
            if (map != null) {
                searchShareElement(map, a0, list, true, true);
                if (list2 != null) {
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        Map z = nwv.z(list2.get(i2), null);
                        if (z != null) {
                            searchShareElement(z, a0, list, akt.F(), false);
                        }
                    }
                }
            } else if (list2 != null) {
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    Map z2 = nwv.z(list2.get(i3), null);
                    if (z2 != null) {
                        searchShareElement(z2, a0, list, true, false);
                    }
                }
            }
        }
    }

    public static void pop(d.j jVar) {
        anl anlVar;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e041535b", new Object[]{jVar});
        } else if (jVar.f11976a.W() instanceof SheetContainer) {
            ((SheetContainer) jVar.f11976a.W()).destroy();
        } else {
            if (jVar.f11976a.W() instanceof anl) {
                anlVar = (anl) jVar.f11976a.W();
            } else {
                anlVar = null;
            }
            if (!ye.b(jVar.c(), anlVar)) {
                JSON json = jVar.b;
                if (json instanceof Map) {
                    z = nwv.o(((Map) json).get("animated"), false);
                } else {
                    z = false;
                }
                if (anlVar != null) {
                    anlVar.finish(z);
                } else if (jVar.c() instanceof Activity) {
                    ((Activity) jVar.c()).finish();
                    if (!z) {
                        ((Activity) jVar.c()).overridePendingTransition(0, 0);
                    }
                } else if (jVar.f11976a.d0().c0().r) {
                    jVar.f11976a.D0();
                }
            }
        }
    }

    public static void push(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01de2b2", new Object[]{jVar});
        } else {
            openURL(jVar);
        }
    }

    private static void searchShareElement(Map map, n nVar, List<Pair<View, String>> list, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff6134a", new Object[]{map, nVar, list, new Boolean(z), new Boolean(z2)});
        } else if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                nVar.C(new a(entry, new boolean[1], z, z2, list), null, 2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void navOpenUrl(com.taobao.tao.flexbox.layoutmanager.ac.d.j r9, java.lang.String r10, java.util.List<android.util.Pair<android.view.View, java.lang.String>> r11, android.os.Bundle r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.module.NavModule.navOpenUrl(com.taobao.tao.flexbox.layoutmanager.ac.d$j, java.lang.String, java.util.List, android.os.Bundle, android.os.Bundle):void");
    }

    public static void openURL(d.j jVar) {
        Map map;
        String str;
        Bundle bundle;
        JSONObject parseObject;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43f7c967", new Object[]{jVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            str = ((JSONObject) json).getString("url");
            map = nwv.j0(((JSONObject) jVar.b).getJSONObject("args"), ((JSONObject) jVar.b).getJSONObject("nativeParams"));
            Object obj = ((JSONObject) jVar.b).get("target");
            boolean o = nwv.o(((JSONObject) jVar.b).get("animated"), true);
            if (obj instanceof List) {
                int i = 0;
                while (true) {
                    List list = (List) obj;
                    if (i >= list.size()) {
                        break;
                    }
                    Object obj2 = list.get(i);
                    if (obj2 instanceof Integer) {
                        arrayList.add((Integer) obj2);
                    }
                    i++;
                }
            } else if (obj instanceof Integer) {
                arrayList.add((Integer) obj);
            }
            z = o;
        } else if (json instanceof JSONArray) {
            str = ((JSONArray) json).getString(0);
            map = null;
        } else {
            str = null;
            map = null;
        }
        try {
            vhd vhdVar = (vhd) jVar.f11976a.g0(R.id.layout_manager_recorder_tag);
            if (vhdVar != null) {
                vhdVar.nav(str);
            }
        } catch (Throwable unused) {
        }
        ArrayList arrayList2 = new ArrayList();
        if (!arrayList.isEmpty() && !akt.m2() && jVar.f11976a.u0()) {
            findTransitionViews(jVar.f11976a, ((Integer) arrayList.get(0)).intValue(), reu.n(jVar.c(), str), arrayList2);
            if (arrayList2.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    findTransitionViews(jVar.f11976a.a0(((Integer) it.next()).intValue()), arrayList2);
                }
            }
            bjp.a().c(arrayList2);
            if (!arrayList2.isEmpty() && (jVar.c() instanceof Activity)) {
                jVar.f11976a.e0().r();
            }
        }
        if (map != null) {
            bundle = new Bundle();
            try {
                for (String str2 : map.keySet()) {
                    bundle.putString(str2, String.valueOf(map.get(str2)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            bundle = null;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                String queryParameter = Uri.parse(str).getQueryParameter("tnode_transition_info");
                if (!TextUtils.isEmpty(queryParameter) && (parseObject = JSON.parseObject(queryParameter)) != null) {
                    JSONObject jSONObject = parseObject.getJSONArray("positions").getJSONObject(0);
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    for (String str3 : jSONObject.keySet()) {
                        bundle.putString(str3, String.valueOf(jSONObject.get(str3)));
                    }
                }
            }
        } catch (Exception e2) {
            tfs.d("parse tnode_transition_info failed " + e2.getMessage());
            e2.printStackTrace();
        }
        if (!z) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("animated", "false");
        }
        navOpenUrl(jVar, str, arrayList2, bundle, null);
    }

    public static void popTo(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b37bd60", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof Map) {
            nwv.o(((Map) json).get("animated"), false);
            if (nwv.t(((Map) jVar.b).get("target"), -1) > 0) {
                String q = jVar.f11976a.d0().c0().q();
                String name = jVar.c().getClass().getName();
                Bundle bundle = new Bundle();
                bundle.putBoolean(hzc.EXTRA_POP_TO, true);
                bundle.putInt(hzc.EXTRA_NODE_TARGET, jVar.f11976a.d0().U());
                od0.D().s().b(jVar.c(), name, q, bundle, null, 603979776);
            }
        }
    }

    private static void findTransitionViews(n nVar, List<Pair<View, String>> list) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73a02d7c", new Object[]{nVar, list});
            return;
        }
        if (!(nVar.K() == null || nVar.K().getTransitionView() == null)) {
            View transitionView = nVar.K().getTransitionView();
            jfw viewParams = nVar.K().getViewParams();
            if (!nwv.T(viewParams.c0)) {
                transitionView.setTransitionName(viewParams.c0);
                transitionView.setId(viewParams.c0.hashCode());
                list.add(Pair.create(transitionView, transitionView.getTransitionName()));
                if (nVar.K() instanceof com.taobao.tao.flexbox.layoutmanager.component.a) {
                    drawable = ((com.taobao.tao.flexbox.layoutmanager.component.a) nVar.K()).getImageDrawable();
                } else {
                    drawable = nVar.K() instanceof w0c ? ((w0c) nVar.K()).getImageDrawable() : null;
                }
                if (drawable != null) {
                    ut2.p(viewParams.c0, transitionView, drawable);
                }
                ShareElementAnimationController.s(transitionView);
            }
        }
        Iterator it = ((ArrayList) nVar.d).iterator();
        while (it.hasNext()) {
            findTransitionViews((n) it.next(), list);
        }
    }
}
