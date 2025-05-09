package com.taobao.tao.flexbox.layoutmanager.module;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.scancode.common.object.ScancodeResult;
import com.taobao.android.scancode.common.util.Scancode;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent;
import com.taobao.tao.flexbox.layoutmanager.component.e;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.f;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.core.q;
import com.taobao.tao.flexbox.layoutmanager.view.FeedToastView;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView;
import com.taobao.taobao.R;
import com.taobao.weex.ui.view.gesture.WXGestureType;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import tb.ah9;
import tb.akt;
import tb.anl;
import tb.bod;
import tb.gwf;
import tb.hk8;
import tb.igs;
import tb.m9h;
import tb.mx7;
import tb.noh;
import tb.nov;
import tb.nwv;
import tb.od0;
import tb.pg1;
import tb.qan;
import tb.rb;
import tb.s6o;
import tb.t2o;
import tb.tfs;
import tb.xw0;
import tb.ye;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AppModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SCAN_ACTION = "guangguang_scan";
    private static final String SCAN_RESULT = "callback_result";
    private static final String SCAN_URL = "https://m.taobao.com/scancode/scan";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends anl.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ n c;
        public final /* synthetic */ String d;
        public final /* synthetic */ JSONArray e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ d.j g;
        public final /* synthetic */ long h;
        public final /* synthetic */ Object i;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.flexbox.layoutmanager.module.AppModule$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0699a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0699a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z = false;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("data", a.this.c.t0());
                try {
                    z = gwf.a(a.this.e, jSONObject);
                } catch (Exception e) {
                    tfs.e("TNode", "jsonpatch:" + e.getMessage());
                }
                if (z || a.this.f) {
                    a aVar = a.this;
                    String F = aVar.c.F(aVar.d);
                    a aVar2 = a.this;
                    n nVar = aVar2.c;
                    d.j jVar = aVar2.g;
                    long j = aVar2.h;
                    Object t0 = nVar.t0();
                    a aVar3 = a.this;
                    nVar.c(jVar, F, j, t0, aVar3.i, aVar3.f);
                }
                a.this.a();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.this.c.P().h0().flick(a.this.c);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, boolean z, n nVar, String str, JSONArray jSONArray, boolean z2, d.j jVar, long j, Object obj2) {
            super(obj, z);
            this.c = nVar;
            this.d = str;
            this.e = jSONArray;
            this.f = z2;
            this.g = jVar;
            this.h = j;
            this.i = obj2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/module/AppModule$10");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AppModule.access$100(this.c, this.d);
            JSONArray jSONArray = this.e;
            if (jSONArray == null || jSONArray.isEmpty()) {
                a();
            } else {
                this.c.P().l1(new RunnableC0699a());
            }
            if (akt.y1()) {
                nwv.z0(new b(), true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.j f12311a;
        public final /* synthetic */ JSONObject b;

        public b(d.j jVar, JSONObject jSONObject) {
            this.f12311a = jVar;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (nwv.R(this.f12311a.c())) {
                Toast.makeText(this.f12311a.c(), "app.commit node is null", 0).show();
            }
            tfs.d("app.commit node is null, args: " + this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f12312a;
        public final /* synthetic */ String b;

        public c(n nVar, String str) {
            this.f12312a = nVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            hk8 a1 = this.f12312a.a1(this.b);
            if (a1 != null) {
                a1.onSuccess(null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONArray f12313a;
        public final /* synthetic */ d.j b;

        public d(JSONArray jSONArray, d.j jVar) {
            this.f12313a = jSONArray;
            this.b = jVar;
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements f.g {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f12314a;
            public final /* synthetic */ Map b;
            public final /* synthetic */ int[] c;

            public a(String str, Map map, int[] iArr) {
                this.f12314a = str;
                this.b = map;
                this.c = iArr;
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.f.g
            public void a(Map map, String str) {
                d.j jVar;
                d.k kVar;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ccc9f5b1", new Object[]{this, map, str});
                    return;
                }
                HashMap hashMap = new HashMap();
                if (map == null || map.isEmpty()) {
                    hashMap.put("succeed", Boolean.FALSE);
                } else {
                    hashMap.put("succeed", Boolean.TRUE);
                }
                hashMap.put("type", str);
                if (com.taobao.tao.flexbox.layoutmanager.core.f.k(this.f12314a)) {
                    hashMap.put("succeed", Boolean.FALSE);
                    hashMap.put("type", LogContext.RELEASETYPE_DEV);
                }
                this.b.put(this.f12314a, hashMap);
                int[] iArr = this.c;
                int i = iArr[0] - 1;
                iArr[0] = i;
                if (i == 0 && (kVar = (jVar = d.this.b).c) != null) {
                    kVar.a(jVar, this.b);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            d.j jVar;
            d.k kVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            igs.a("preloadDSL");
            try {
                int[] iArr = {this.f12313a.size()};
                HashMap hashMap = new HashMap();
                for (int i = 0; i < this.f12313a.size(); i++) {
                    String string = this.f12313a.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        com.taobao.tao.flexbox.layoutmanager.core.f.q(this.b.f11976a, string, null, null, new a(string, hashMap, iArr));
                    } else {
                        int i2 = iArr[0] - 1;
                        iArr[0] = i2;
                        if (i2 == 0 && (kVar = (jVar = this.b).c) != null) {
                            kVar.a(jVar, hashMap);
                        }
                    }
                }
            } catch (Exception e) {
                tfs.d(e.getMessage());
            }
            igs.c();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f12315a;
        public final /* synthetic */ d.j b;

        public e(List list, d.j jVar) {
            this.f12315a = list;
            this.b = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (n nVar : this.f12315a) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (nVar.v0() != null) {
                        jSONObject.put("attrs", (Object) nVar.v0());
                    }
                    jSONObject.put("target", (Object) Integer.valueOf(nVar.U()));
                    if (nVar.b0() != null) {
                        jSONObject.put("props", (Object) nVar.b0());
                    }
                    View w0 = nVar.w0();
                    if (w0 != null) {
                        jSONObject.put("view", (Object) AppModule.access$000(w0));
                    }
                    arrayList.add(jSONObject);
                } catch (Throwable th) {
                    tfs.d(th.getMessage());
                }
            }
            d.j jVar = this.b;
            jVar.c.a(jVar, arrayList);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12316a;
        public final /* synthetic */ d.j b;
        public final /* synthetic */ String c;
        public final /* synthetic */ d.k d;

        public f(String str, d.j jVar, String str2, d.k kVar) {
            this.f12316a = str;
            this.b = jVar;
            this.c = str2;
            this.d = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TextUtils.isEmpty(this.f12316a)) {
                n a0 = this.b.f11976a.a0(Integer.valueOf(this.c).intValue());
                if (a0 != null) {
                    Object t0 = a0.g0().t0();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("target", (Object) Integer.valueOf(a0.g0().U()));
                    jSONObject.put("data", t0);
                    this.d.a(this.b, jSONObject);
                }
            } else {
                n a02 = this.b.f11976a.a0(Integer.valueOf(this.c).intValue());
                if (a02 != null) {
                    try {
                        Object d = a02.u0().d(this.f12316a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("target", (Object) this.c);
                        jSONObject2.put("data", d);
                        this.d.a(this.b, jSONObject2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONArray f12317a;
        public final /* synthetic */ n b;
        public final /* synthetic */ boolean c;

        public g(JSONArray jSONArray, n nVar, boolean z) {
            this.f12317a = jSONArray;
            this.b = nVar;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            gwf.a(this.f12317a, (JSON) this.b.t0());
            n nVar = this.b;
            nVar.d(nVar.t0(), this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class h implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f12318a;
        public final /* synthetic */ d.j b;

        public h(List list, d.j jVar) {
            this.f12318a = list;
            this.b = jVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (view.getTag() instanceof String) {
                String valueOf = String.valueOf(view.getTag());
                int indexOf = this.f12318a.indexOf(valueOf);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("index", (Object) Integer.valueOf(indexOf));
                jSONObject.put("title", (Object) valueOf);
                d.j jVar = this.b;
                jVar.c.a(jVar, jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class i implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.j f12319a;

        public i(d.j jVar) {
            this.f12319a = jVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            d.j jVar = this.f12319a;
            jVar.c.a(jVar, "cancel");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class j implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.k f12320a;
        public final /* synthetic */ d.j b;

        public j(d.k kVar, d.j jVar) {
            this.f12320a = kVar;
            this.b = jVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(rb.RESULT_KEY, "confirm");
            this.f12320a.a(this.b, hashMap);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class k implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.k f12321a;
        public final /* synthetic */ d.j b;

        public k(d.k kVar, d.j jVar) {
            this.f12321a = kVar;
            this.b = jVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(rb.RESULT_KEY, "cancel");
            this.f12321a.a(this.b, hashMap);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class l implements DialogInterface.OnCancelListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.k f12322a;
        public final /* synthetic */ d.j b;

        public l(d.k kVar, d.j jVar) {
            this.f12322a = kVar;
            this.b = jVar;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(rb.RESULT_KEY, "cancel");
            this.f12322a.a(this.b, hashMap);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class m implements d.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.k f12323a;
        public final /* synthetic */ d.j b;
        public final /* synthetic */ Context c;

        public m(d.k kVar, d.j jVar, Context context) {
            this.f12323a = kVar;
            this.b = jVar;
            this.c = context;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.ac.d.k
        public void a(d.j jVar, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("869ae5c4", new Object[]{this, jVar, obj});
                return;
            }
            this.f12323a.a(jVar, obj);
            if (!this.b.f11976a.f12249a) {
                this.b.f11976a.f12249a = true;
                if (jVar.f11976a.W() instanceof anl) {
                    ((anl) jVar.f11976a.W()).startPostponedEnterTransition(jVar.f11976a.e0().h());
                } else {
                    ((Activity) this.c).startPostponedEnterTransition();
                }
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.ac.d.k
        public void b(d.j jVar, d.h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95924ef2", new Object[]{this, jVar, hVar});
            } else {
                this.f12323a.b(jVar, hVar);
            }
        }
    }

    static {
        t2o.a(503317275);
        t2o.a(503316559);
    }

    public static /* synthetic */ JSONObject access$000(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf67f71b", new Object[]{view});
        }
        return getViewProperty(view);
    }

    public static /* synthetic */ void access$100(n nVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e96aae4", new Object[]{nVar, str});
        } else {
            notifyNodeEventHandler(nVar, str);
        }
    }

    public static void alert(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb863cf", new Object[]{context, str});
        } else {
            alert(context, null, str, null, null, true, null, null, null);
        }
    }

    public static void closePoplayer(d.j jVar) {
        n a0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b9e17d4", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if ((json instanceof JSONObject) && (a0 = jVar.f11976a.a0(((JSONObject) json).getInteger("target").intValue())) != null && (a0.K() instanceof PopLayerComponent)) {
            ((PopLayerComponent) a0.K()).dismiss();
        }
    }

    public static void findNodesById(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f825ff62", new Object[]{jVar});
            return;
        }
        String string = ((JSONObject) jVar.b).getString("target");
        Object obj = ((JSONObject) jVar.b).get("id");
        int t = nwv.t(((JSONObject) jVar.b).get(AgooConstants.MESSAGE_FLAG), 2);
        n a0 = jVar.f11976a.a0(nwv.t(string, -1));
        ArrayList arrayList = new ArrayList();
        a0.B(obj, t, arrayList, true, false);
        jVar.f11976a.l1(new e(arrayList, jVar));
    }

    private static TNodeRecyclerView findRecyclerViewForView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeRecyclerView) ipChange.ipc$dispatch("750ff5f2", new Object[]{view});
        }
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof TNodeRecyclerView) {
                return (TNodeRecyclerView) parent;
            }
            if (!(parent instanceof ViewGroup)) {
                return null;
            }
            view = (View) parent;
        }
        return null;
    }

    public static void generateKey(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4cd322", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof Map) {
            String generateUrlKey = generateUrlKey((String) ((Map) json).get("url"));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", (Object) generateUrlKey);
            jVar.c.a(jVar, jSONObject);
        }
    }

    public static String generateUrlKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16356e4a", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return noh.a(nov.c(str));
        }
        tfs.d("generateUrlKey url is empty");
        return "";
    }

    public static void getLaunchInfo(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67717975", new Object[]{jVar});
        } else if (jVar.c != null) {
            jVar.c.a(jVar, od0.D().f().P());
        }
    }

    private static JSONObject getListViewProperty(n nVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2a8c7f47", new Object[]{nVar, str});
        }
        n findTargetNode = ElementModule.findTargetNode(nVar, str);
        if (findTargetNode == null) {
            return null;
        }
        View w0 = findTargetNode.w0();
        JSONObject jSONObject = new JSONObject();
        if (w0 == null) {
            return jSONObject;
        }
        try {
            int[] iArr = new int[2];
            w0.getLocationOnScreen(iArr);
            jSONObject.put("listScreenX", (Object) Integer.valueOf(iArr[0]));
            jSONObject.put("listScreenY", (Object) Integer.valueOf(iArr[1]));
            jSONObject.put("listWidth", (Object) Integer.valueOf(w0.getWidth()));
            jSONObject.put("listHeight", (Object) Integer.valueOf(w0.getHeight()));
            return jSONObject;
        } catch (Exception e2) {
            tfs.d("getListViewProperty " + e2.getMessage());
            return jSONObject;
        }
    }

    public static void getLocalSetting(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("668ea11", new Object[]{jVar});
        } else if (jVar.b instanceof JSONObject) {
            Map d2 = m9h.d();
            d.k kVar = jVar.c;
            if (kVar != null) {
                kVar.a(jVar, d2);
            }
        }
    }

    public static void getPrefetchConfig(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5bb3e5d", new Object[]{jVar});
        } else if (jVar.b instanceof JSONObject) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject = od0.D().u().a(((JSONObject) jVar.b).getString(IStorage.TYPE_DSL));
            } catch (Exception e2) {
                tfs.d("getPrefetchConfig:" + e2.getMessage());
            }
            jVar.c.a(jVar, jSONObject);
        }
    }

    public static void getTNodeData(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("591d122", new Object[]{jVar});
            return;
        }
        d.k kVar = jVar.c;
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            String string = ((JSONObject) json).getString("target");
            String string2 = ((JSONObject) jVar.b).getString("keypath");
            if (!TextUtils.isEmpty(string) && TextUtils.isDigitsOnly(string)) {
                jVar.f11976a.l1(new f(string2, jVar, string, kVar));
            }
        }
    }

    public static void getTNodeInfo(d.j jVar) {
        View w0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afb8689e", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof Map) {
            int t = nwv.t(((Map) json).get("target"), -1);
            n nVar = null;
            String I = nwv.I(((Map) jVar.b).get("id"), null);
            if (t != -1) {
                nVar = jVar.f11976a.a0(t);
            }
            n j2 = q.j(nVar, I);
            if (j2 == null || (w0 = j2.w0()) == null) {
                jVar.c.a(jVar, new JSONObject());
            } else {
                jVar.c.a(jVar, getViewProperty(w0));
            }
        }
    }

    public static void ignoringInteractionEvents(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("513fdc90", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            boolean booleanValue = ((JSONObject) json).getBooleanValue("ignoring");
            View w0 = jVar.f11976a.d0().w0();
            if (w0 instanceof TNodeView) {
                ((TNodeView) w0).setIgnoreTouchEvent(booleanValue);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
        if (r3.equals("medium") == false) goto L_0x0049;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void impactFeedback(com.taobao.tao.flexbox.layoutmanager.ac.d.j r7) {
        /*
            java.lang.String r0 = "light"
            r1 = 0
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.tao.flexbox.layoutmanager.module.AppModule.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r0 = "1bce7001"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r3.ipc$dispatch(r0, r2)
            return
        L_0x0015:
            com.alibaba.fastjson.JSON r3 = r7.b
            boolean r4 = r3 instanceof com.alibaba.fastjson.JSONObject
            if (r4 == 0) goto L_0x0095
            com.alibaba.fastjson.JSONObject r3 = (com.alibaba.fastjson.JSONObject) r3
            java.lang.String r4 = "type"
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = tb.nwv.I(r3, r0)
            android.content.Context r7 = r7.c()
            java.lang.String r4 = "vibrator"
            java.lang.Object r7 = r7.getSystemService(r4)
            android.os.Vibrator r7 = (android.os.Vibrator) r7
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x003c
            r3 = r0
        L_0x003c:
            r3.hashCode()
            r4 = 60
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case -1078030475: goto L_0x0078;
                case 3535914: goto L_0x006c;
                case 99152071: goto L_0x0060;
                case 102970646: goto L_0x0057;
                case 108511787: goto L_0x004b;
                default: goto L_0x0049;
            }
        L_0x0049:
            r1 = -1
            goto L_0x0082
        L_0x004b:
            java.lang.String r0 = "rigid"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0055
            goto L_0x0049
        L_0x0055:
            r1 = 4
            goto L_0x0082
        L_0x0057:
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x005e
            goto L_0x0049
        L_0x005e:
            r1 = 3
            goto L_0x0082
        L_0x0060:
            java.lang.String r0 = "heavy"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x006a
            goto L_0x0049
        L_0x006a:
            r1 = 2
            goto L_0x0082
        L_0x006c:
            java.lang.String r0 = "soft"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0076
            goto L_0x0049
        L_0x0076:
            r1 = 1
            goto L_0x0082
        L_0x0078:
            java.lang.String r0 = "medium"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0082
            goto L_0x0049
        L_0x0082:
            switch(r1) {
                case 0: goto L_0x008f;
                case 1: goto L_0x008c;
                case 2: goto L_0x0089;
                case 3: goto L_0x0091;
                case 4: goto L_0x0086;
                default: goto L_0x0085;
            }
        L_0x0085:
            goto L_0x0091
        L_0x0086:
            r4 = 180(0xb4, float:2.52E-43)
            goto L_0x0091
        L_0x0089:
            r4 = 150(0x96, float:2.1E-43)
            goto L_0x0091
        L_0x008c:
            r4 = 90
            goto L_0x0091
        L_0x008f:
            r4 = 120(0x78, float:1.68E-43)
        L_0x0091:
            long r0 = (long) r4
            r7.vibrate(r0)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.module.AppModule.impactFeedback(com.taobao.tao.flexbox.layoutmanager.ac.d$j):void");
    }

    public static void keypathForTarget(d.j jVar) {
        d.k kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2d6c36", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            int intValue = ((JSONObject) json).getIntValue("target");
            n a0 = jVar.f11976a.a0(intValue);
            if (a0 == null || (kVar = jVar.c) == null) {
                tfs.f("keypathForTarget doesn't find node, target:" + intValue);
                return;
            }
            kVar.a(jVar, a0.R());
        }
    }

    private static void notifyNodeEventHandler(n nVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bdc27a", new Object[]{nVar, str});
        } else {
            nwv.z0(new c(nVar, str), true);
        }
    }

    public static void openTNodeTool(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c268e8", new Object[]{jVar});
            return;
        }
        o oVar = jVar.f11976a;
        o.t1(true);
        jVar.f11976a.m0();
        jVar.f11976a.h0().showTool(jVar.f11976a.I().A());
    }

    public static void playSound(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78782b1", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (!(json instanceof JSONObject)) {
            return;
        }
        if (((JSONObject) json).containsKey("type")) {
            String string = ((JSONObject) jVar.b).getString("type");
            if (!TextUtils.isEmpty(string) && TextUtils.isDigitsOnly(string)) {
                od0.D().y().b(Integer.valueOf(string).intValue());
            }
        } else if (((JSONObject) jVar.b).containsKey("url")) {
            String string2 = ((JSONObject) jVar.b).getString("url");
            if (!TextUtils.isEmpty(string2)) {
                od0.D().y().a(string2);
            }
        }
    }

    public static void postMessage(d.j jVar) {
        n a0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f88b25", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("msg");
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            HashMap hashMap = new HashMap();
            if (jSONObject2 != null) {
                for (String str : jSONObject2.keySet()) {
                    hashMap.put(str, jSONObject2.get(str));
                }
            }
            int intValue = jSONObject.getIntValue(AgooConstants.MESSAGE_FLAG);
            String string2 = jSONObject.getString("value");
            String string3 = jSONObject.getString("target");
            if (!(TextUtils.isEmpty(string3) || (a0 = jVar.f11976a.a0(Integer.valueOf(string3).intValue())) == null)) {
                jVar.f11976a.o1(intValue, a0, string, string2, hashMap, null);
            }
        }
    }

    public static void prefetchNext(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2568242", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            od0.D().u().c((JSONObject) json);
        }
    }

    public static void preloadDSL(d.j jVar) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee49818", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if ((json instanceof JSONObject) && (jSONArray = ((JSONObject) json).getJSONArray(xw0.VIEW_ANIM_KEY_URLS)) != null) {
            AsyncTask.execute(new d(jSONArray, jVar));
        }
    }

    public static void setLocalSetting(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7429485", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            m9h.f((JSONObject) json);
        }
    }

    public static void setPasteboard(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18b13f7", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            String string = ((JSONObject) json).getString("value");
            if (nwv.g()) {
                ((ClipboardManager) jVar.c().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Label", string));
            }
        }
    }

    public static void showInputMethod(d.j jVar) {
        n findTargetNode;
        View w0;
        InputMethodManager inputMethodManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fea1a3e", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            n a0 = jVar.f11976a.a0(jSONObject.getIntValue("target"));
            if (a0 != null && (findTargetNode = ElementModule.findTargetNode(a0, jSONObject.getString("id"))) != null && (w0 = findTargetNode.w0()) != null && (inputMethodManager = (InputMethodManager) w0.getContext().getSystemService("input_method")) != null) {
                w0.requestFocus();
                inputMethodManager.showSoftInput(w0, 2);
            }
        }
    }

    public static void showQR(final d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260a7c6e", new Object[]{jVar});
            return;
        }
        final d.k kVar = jVar.c;
        if (jVar.c() instanceof Activity) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(SCAN_ACTION);
            jVar.c().registerReceiver(new BroadcastReceiver() { // from class: com.taobao.tao.flexbox.layoutmanager.module.AppModule.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass14 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/module/AppModule$14");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (AppModule.SCAN_ACTION.equals(intent.getAction())) {
                        ScancodeResult scancodeResult = (ScancodeResult) intent.getSerializableExtra("callback_result");
                        JSONObject jSONObject = new JSONObject();
                        if (scancodeResult == null || TextUtils.isEmpty(scancodeResult.code)) {
                            jSONObject.put("succeed", (Object) Boolean.FALSE);
                            jSONObject.put("url", (Object) "");
                            d.k.this.b(jVar, new d.h("AC_ERR_FAILED", "get url failed", jSONObject));
                        } else {
                            jSONObject.put("url", (Object) scancodeResult.code);
                            jSONObject.put("succeed", (Object) Boolean.TRUE);
                            d.k.this.a(jVar, jSONObject);
                        }
                        jVar.c().unregisterReceiver(this);
                    }
                }
            }, intentFilter);
            Bundle bundle = new Bundle();
            bundle.putString(Scancode.GATEWAY_CALLBACK_ACTION_PARAM, SCAN_ACTION);
            od0.D().s().e(jVar.c(), SCAN_URL, bundle);
        }
    }

    public static void showTips(d.j jVar) {
        ViewGroup viewGroup;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d3e4657", new Object[]{jVar});
        } else if ((jVar.b instanceof JSONObject) && (jVar.c() instanceof Activity)) {
            String string = ((JSONObject) jVar.b).getString("message");
            String string2 = ((JSONObject) jVar.b).getString("duration");
            if (jVar.f11976a.W() instanceof Fragment) {
                viewGroup = (ViewGroup) ((Fragment) jVar.f11976a.W()).getView();
            } else {
                viewGroup = (ViewGroup) ((Activity) jVar.c()).getWindow().findViewById(16908290);
            }
            if (viewGroup != null) {
                View findViewWithTag = viewGroup.findViewWithTag("TNode_TIP_TOAST");
                if (!TextUtils.isEmpty(string2)) {
                    j2 = Long.valueOf(string2).longValue();
                } else {
                    j2 = 2500;
                }
                if (findViewWithTag == null) {
                    View inflate = ((Activity) jVar.c()).getLayoutInflater().inflate(R.layout.layout_feed_msg_toast_view, viewGroup, false);
                    inflate.setTag("TNode_TIP_TOAST");
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, s6o.c(jVar.c(), 30));
                    layoutParams.gravity = 49;
                    layoutParams.setMargins(0, s6o.c(viewGroup.getContext(), 132), 0, 0);
                    viewGroup.addView(inflate, layoutParams);
                    inflate.setVisibility(0);
                    if (!TextUtils.isEmpty(string)) {
                        ((FeedToastView) inflate).show(string, j2);
                    }
                } else if ((findViewWithTag instanceof FeedToastView) && !TextUtils.isEmpty(string)) {
                    ((FeedToastView) findViewWithTag).show(string, j2);
                }
            }
        }
    }

    public static void slideSecondPage(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68a7158", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("url");
            String string2 = jSONObject.getString("utParams");
            bod e2 = ye.e(jVar);
            if (e2 != null) {
                e2.slideSecondPage(string, string2);
            }
        }
    }

    public static void updateTabRedirectInfo(d.j jVar) {
        o oVar;
        n findTargetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ac4a76", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if ((json instanceof JSONObject) && (oVar = jVar.f11976a) != null) {
            JSONObject jSONObject = (JSONObject) json;
            n d0 = oVar.d0();
            if (d0 != null && (findTargetNode = ElementModule.findTargetNode(d0, jSONObject.getString("tabbarId"))) != null && (findTargetNode.K() instanceof com.taobao.tao.flexbox.layoutmanager.component.e)) {
                ((com.taobao.tao.flexbox.layoutmanager.component.e) findTargetNode.K()).R(e.i.c(jSONObject));
            }
        }
    }

    private static void alert(Context context, String str, String str2, String str3, String str4, boolean z, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52ae220", new Object[]{context, str, str2, str3, str4, new Boolean(z), onClickListener, onClickListener2, onCancelListener});
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (!TextUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            builder.setMessage(str2);
        }
        builder.setCancelable(z);
        if (!TextUtils.isEmpty(str3)) {
            builder.setPositiveButton(str3, onClickListener);
        }
        if (!TextUtils.isEmpty(str4)) {
            builder.setNegativeButton(str4, onClickListener2);
        }
        builder.setOnCancelListener(onCancelListener);
        builder.create().show();
    }

    public static void fileExist(d.j jVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f369211", new Object[]{jVar});
            return;
        }
        try {
            JSON json = jVar.b;
            if (json instanceof Map) {
                String str = (String) ((Map) json).get("path");
                if (!TextUtils.isEmpty(str)) {
                    z = new File(str).exists();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", (Object) Boolean.valueOf(z));
                jVar.c.a(jVar, jSONObject);
            }
        } catch (Throwable th) {
            tfs.d("fileExist error," + th.getMessage());
        }
    }

    public static void getMediaPlayDevice(d.j jVar) {
        AudioDeviceInfo[] devices;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9231814", new Object[]{jVar});
            return;
        }
        try {
            AudioManager audioManager = (AudioManager) jVar.c().getSystemService("audio");
            if (Build.VERSION.SDK_INT >= 23) {
                if (((JSONObject) jVar.b).containsKey("type")) {
                    String string = ((JSONObject) jVar.b).getString("type");
                    if (!"input".equals(string)) {
                        if ("output".equals(string)) {
                            i2 = 2;
                        }
                    }
                    devices = audioManager.getDevices(i2);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("devices", (Object) devices);
                    jVar.c.a(jVar, jSONObject);
                }
                i2 = 3;
                devices = audioManager.getDevices(i2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("devices", (Object) devices);
                jVar.c.a(jVar, jSONObject2);
            }
        } catch (Throwable th) {
            tfs.e("APPModule", "getMediaPlayDevice:" + th.getMessage());
        }
    }

    public static void getPasteboard(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d215c83", new Object[]{jVar});
            return;
        }
        d.k kVar = jVar.c;
        if (kVar != null && nwv.g()) {
            try {
                ClipData primaryClip = ((ClipboardManager) jVar.c().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null && primaryClip.getItemCount() > 0) {
                    String charSequence = primaryClip.getItemAt(0).getText().toString();
                    HashMap hashMap = new HashMap();
                    hashMap.put("value", charSequence);
                    kVar.a(jVar, hashMap);
                }
            } catch (Exception e2) {
                tfs.d(e2.getMessage());
            }
        }
    }

    public static void hideInputMethod(d.j jVar) {
        n a0;
        n findTargetNode;
        View w0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd077603", new Object[]{jVar});
        } else if (jVar.b instanceof JSONObject) {
            Context c2 = jVar.c();
            JSONObject jSONObject = (JSONObject) jVar.b;
            if (jSONObject != null && (a0 = jVar.f11976a.a0(jSONObject.getIntValue("target"))) != null && (findTargetNode = ElementModule.findTargetNode(a0, jSONObject.getString("id"))) != null && (w0 = findTargetNode.w0()) != null) {
                w0.clearFocus();
                InputMethodManager inputMethodManager = (InputMethodManager) c2.getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(w0.getWindowToken(), 0);
                }
            } else if (c2 instanceof Activity) {
                nwv.O(c2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void showLoading(com.taobao.tao.flexbox.layoutmanager.ac.d.j r7) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.tao.flexbox.layoutmanager.module.AppModule.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0012
            java.lang.String r2 = "a2de4ded"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r7
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0012:
            if (r7 == 0) goto L_0x00dd
            android.content.Context r1 = r7.c()
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L_0x00dd
            com.alibaba.fastjson.JSON r1 = r7.b
            boolean r2 = r1 instanceof com.alibaba.fastjson.JSONObject
            r3 = 0
            if (r2 == 0) goto L_0x0050
            com.alibaba.fastjson.JSONObject r1 = (com.alibaba.fastjson.JSONObject) r1
            java.lang.String r2 = "title"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x0036
            com.alibaba.fastjson.JSON r1 = r7.b
            com.alibaba.fastjson.JSONObject r1 = (com.alibaba.fastjson.JSONObject) r1
            java.lang.String r3 = r1.getString(r2)
        L_0x0036:
            com.alibaba.fastjson.JSON r1 = r7.b
            com.alibaba.fastjson.JSONObject r1 = (com.alibaba.fastjson.JSONObject) r1
            java.lang.String r2 = "show"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x0050
            com.alibaba.fastjson.JSON r1 = r7.b
            com.alibaba.fastjson.JSONObject r1 = (com.alibaba.fastjson.JSONObject) r1
            java.lang.Boolean r1 = r1.getBoolean(r2)
            boolean r1 = r1.booleanValue()
            goto L_0x0051
        L_0x0050:
            r1 = 0
        L_0x0051:
            com.taobao.tao.flexbox.layoutmanager.core.o r2 = r7.f11976a
            java.lang.Object r2 = r2.W()
            boolean r2 = r2 instanceof androidx.fragment.app.Fragment
            if (r2 == 0) goto L_0x006a
            com.taobao.tao.flexbox.layoutmanager.core.o r2 = r7.f11976a
            java.lang.Object r2 = r2.W()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.view.View r2 = r2.getView()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L_0x007d
        L_0x006a:
            android.content.Context r2 = r7.c()
            android.app.Activity r2 = (android.app.Activity) r2
            android.view.Window r2 = r2.getWindow()
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r2.findViewById(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L_0x007d:
            if (r2 == 0) goto L_0x00dd
            java.lang.String r4 = "TNode_Loading"
            android.view.View r5 = r2.findViewWithTag(r4)
            if (r5 == 0) goto L_0x00a0
            boolean r7 = r5 instanceof com.taobao.tao.flexbox.layoutmanager.uikit.view.TNodeCircularProgress
            if (r7 == 0) goto L_0x0097
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            if (r7 != 0) goto L_0x0097
            r7 = r5
            com.taobao.tao.flexbox.layoutmanager.uikit.view.TNodeCircularProgress r7 = (com.taobao.tao.flexbox.layoutmanager.uikit.view.TNodeCircularProgress) r7
            r7.setProgressText(r3)
        L_0x0097:
            if (r1 == 0) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            r0 = 8
        L_0x009c:
            r5.setVisibility(r0)
            goto L_0x00dd
        L_0x00a0:
            if (r1 == 0) goto L_0x00dd
            android.content.Context r1 = r7.c()
            r5 = 96
            int r1 = tb.s6o.c(r1, r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r1, r1)
            r1 = 17
            r5.gravity = r1
            android.content.Context r1 = r7.c()
            r6 = -50
            int r1 = tb.s6o.c(r1, r6)
            r5.setMargins(r0, r1, r0, r0)
            com.taobao.tao.flexbox.layoutmanager.uikit.view.TNodeCircularProgress r1 = new com.taobao.tao.flexbox.layoutmanager.uikit.view.TNodeCircularProgress
            android.content.Context r7 = r7.c()
            r1.<init>(r7)
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            if (r7 != 0) goto L_0x00d4
            r1.setProgressText(r3)
        L_0x00d4:
            r1.setTag(r4)
            r2.addView(r1, r5)
            r1.setVisibility(r0)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.module.AppModule.showLoading(com.taobao.tao.flexbox.layoutmanager.ac.d$j):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void toast(com.taobao.tao.flexbox.layoutmanager.ac.d.j r11) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.tao.flexbox.layoutmanager.module.AppModule.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0012
            java.lang.String r2 = "9dd0fc45"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r11
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0012:
            com.alibaba.fastjson.JSON r1 = r11.b
            boolean r2 = r1 instanceof com.alibaba.fastjson.JSONObject
            if (r2 == 0) goto L_0x00f4
            com.alibaba.fastjson.JSONObject r1 = (com.alibaba.fastjson.JSONObject) r1
            java.lang.String r2 = "message"
            java.lang.String r6 = r1.getString(r2)
            java.lang.String r2 = "duration"
            java.lang.String r2 = r1.getString(r2)
            java.lang.String r3 = "position"
            java.lang.String r3 = r1.getString(r3)
            java.lang.String r4 = "system"
            boolean r4 = r1.getBooleanValue(r4)
            java.lang.String r5 = "customStyle"
            boolean r5 = r1.getBooleanValue(r5)
            java.lang.String r7 = "target"
            int r1 = r1.getIntValue(r7)
            com.taobao.tao.flexbox.layoutmanager.core.o r7 = r11.f11976a
            com.taobao.tao.flexbox.layoutmanager.core.n r1 = r7.a0(r1)
            if (r1 == 0) goto L_0x005b
            android.view.View r1 = r1.w0()
            if (r1 == 0) goto L_0x005b
            android.view.View r1 = r1.getRootView()
            boolean r7 = r1 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x005b
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L_0x005c
        L_0x005b:
            r1 = 0
        L_0x005c:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x00f4
            boolean r7 = android.text.TextUtils.isEmpty(r2)
            if (r7 != 0) goto L_0x007c
            boolean r7 = android.text.TextUtils.isDigitsOnly(r2)
            if (r7 == 0) goto L_0x007c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = r2.intValue()
            int r7 = r2 / 1000
            r10 = r7
            r7 = r2
            r2 = r10
            goto L_0x0081
        L_0x007c:
            r2 = 1500(0x5dc, float:2.102E-42)
            r2 = 0
            r7 = 1500(0x5dc, float:2.102E-42)
        L_0x0081:
            java.lang.String r8 = "center"
            boolean r8 = r8.equals(r3)
            r9 = -1
            if (r8 == 0) goto L_0x008f
            r3 = 17
            r8 = 17
            goto L_0x00ab
        L_0x008f:
            java.lang.String r8 = "top"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x009d
            r3 = 49
            r8 = 49
            goto L_0x00ab
        L_0x009d:
            java.lang.String r8 = "bottom"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x00aa
            r3 = 81
            r8 = 81
            goto L_0x00ab
        L_0x00aa:
            r8 = -1
        L_0x00ab:
            tb.od0 r3 = tb.od0.D()
            tb.h1e r3 = r3.B()
            if (r3 == 0) goto L_0x00c8
            if (r4 != 0) goto L_0x00c8
            tb.od0 r0 = tb.od0.D()
            tb.h1e r3 = r0.B()
            android.content.Context r4 = r11.c()
            r5 = r1
            r3.a(r4, r5, r6, r7, r8)
            goto L_0x00f4
        L_0x00c8:
            tb.od0 r1 = tb.od0.D()
            tb.h1e r1 = r1.B()
            if (r1 == 0) goto L_0x00e4
            if (r5 == 0) goto L_0x00e4
            tb.od0 r0 = tb.od0.D()
            tb.h1e r0 = r0.B()
            android.content.Context r11 = r11.c()
            r0.b(r11, r6, r2, r8)
            goto L_0x00f4
        L_0x00e4:
            android.content.Context r11 = r11.c()
            android.widget.Toast r11 = android.widget.Toast.makeText(r11, r6, r2)
            if (r8 == r9) goto L_0x00f1
            r11.setGravity(r8, r0, r0)
        L_0x00f1:
            r11.show()
        L_0x00f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.module.AppModule.toast(com.taobao.tao.flexbox.layoutmanager.ac.d$j):void");
    }

    public static void updateTNodeData(d.j jVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a08545d5", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("target");
            if (!TextUtils.isEmpty(string)) {
                if (jSONObject.containsKey("force")) {
                    z = jSONObject.getBooleanValue("force");
                }
                JSONObject jSONObject2 = null;
                JSONArray jSONArray = jSONObject.containsKey("jsonpatch") ? jSONObject.getJSONArray("jsonpatch") : null;
                if (jSONObject.containsKey("data")) {
                    jSONObject2 = jSONObject.getJSONObject("data");
                }
                n a0 = jVar.f11976a.a0(Integer.valueOf(string).intValue());
                if (jSONArray == null || a0 == null) {
                    if (jSONObject2 != null && a0 != null) {
                        a0.d(jSONObject2, z);
                    }
                } else if (a0.t0() instanceof JSON) {
                    a0.P().l1(new g(jSONArray, a0, z));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void actionSheet(com.taobao.tao.flexbox.layoutmanager.ac.d.j r11) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.tao.flexbox.layoutmanager.module.AppModule.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0013
            java.lang.String r3 = "fe021be3"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r11
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0013:
            com.alibaba.fastjson.JSON r2 = r11.b
            boolean r3 = r2 instanceof com.alibaba.fastjson.JSONObject
            if (r3 == 0) goto L_0x00b7
            com.alibaba.fastjson.JSONObject r2 = (com.alibaba.fastjson.JSONObject) r2
            java.lang.String r3 = "title"
            java.lang.String r7 = r2.getString(r3)
            com.alibaba.fastjson.JSON r2 = r11.b
            com.alibaba.fastjson.JSONObject r2 = (com.alibaba.fastjson.JSONObject) r2
            java.lang.String r3 = "message"
            r2.getString(r3)
            com.alibaba.fastjson.JSON r2 = r11.b
            com.alibaba.fastjson.JSONObject r2 = (com.alibaba.fastjson.JSONObject) r2
            java.lang.String r3 = "buttons"
            com.alibaba.fastjson.JSONArray r2 = r2.getJSONArray(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            if (r2 == 0) goto L_0x006c
            int r5 = r2.size()
            if (r5 <= 0) goto L_0x006c
            r5 = 0
        L_0x0045:
            int r6 = r2.size()
            if (r5 >= r6) goto L_0x0054
            java.lang.String r6 = r2.getString(r5)
            r3.add(r6)
            int r5 = r5 + r1
            goto L_0x0045
        L_0x0054:
            int r2 = r3.size()
            java.lang.String[] r2 = new java.lang.String[r2]
        L_0x005a:
            int r5 = r3.size()
            if (r0 >= r5) goto L_0x006a
            java.lang.Object r5 = r3.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            r2[r0] = r5
            int r0 = r0 + r1
            goto L_0x005a
        L_0x006a:
            r8 = r2
            goto L_0x006d
        L_0x006c:
            r8 = r4
        L_0x006d:
            android.content.Context r0 = r11.c()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0084
            android.content.Context r0 = r11.c()
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
        L_0x0082:
            r6 = r0
            goto L_0x009e
        L_0x0084:
            com.taobao.tao.flexbox.layoutmanager.core.o r0 = r11.f11976a
            if (r0 == 0) goto L_0x009d
            java.lang.Object r0 = r0.W()
            boolean r0 = r0 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L_0x009d
            com.taobao.tao.flexbox.layoutmanager.core.o r0 = r11.f11976a
            java.lang.Object r0 = r0.W()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.view.View r0 = r0.getView()
            goto L_0x0082
        L_0x009d:
            r6 = r4
        L_0x009e:
            if (r6 == 0) goto L_0x00b7
            com.taobao.tao.flexbox.layoutmanager.view.TNodePopupWindowController r0 = new com.taobao.tao.flexbox.layoutmanager.view.TNodePopupWindowController     // Catch: Exception -> 0x00b7
            android.content.Context r5 = r11.c()     // Catch: Exception -> 0x00b7
            com.taobao.tao.flexbox.layoutmanager.module.AppModule$h r9 = new com.taobao.tao.flexbox.layoutmanager.module.AppModule$h     // Catch: Exception -> 0x00b7
            r9.<init>(r3, r11)     // Catch: Exception -> 0x00b7
            com.taobao.tao.flexbox.layoutmanager.module.AppModule$i r10 = new com.taobao.tao.flexbox.layoutmanager.module.AppModule$i     // Catch: Exception -> 0x00b7
            r10.<init>(r11)     // Catch: Exception -> 0x00b7
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: Exception -> 0x00b7
            r0.l()     // Catch: Exception -> 0x00b7
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.module.AppModule.actionSheet(com.taobao.tao.flexbox.layoutmanager.ac.d$j):void");
    }

    public static void commit(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f097b35", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("msg");
            int intValue = jSONObject.getInteger("target").intValue();
            JSONArray jSONArray = jSONObject.getJSONArray("patches");
            boolean o = nwv.o(jSONObject.get("force"), false);
            Object obj = jSONObject.get("options");
            long longValue = jSONObject.getLongValue("time");
            n a0 = jVar.f11976a.a0(intValue);
            Context c2 = jVar.c();
            if (!jVar.f11976a.f12249a && jVar.f11976a.u0() && (c2 instanceof Activity)) {
                jVar.c = new m(jVar.c, jVar, c2);
            }
            if (a0 != null) {
                Object W = a0.P().W();
                a aVar = new a(W, nwv.X(), a0, string, jSONArray, o, jVar, longValue, obj);
                if (!(W instanceof anl)) {
                    aVar.run();
                } else if (!((anl) W).checkAndAddPendingTask(aVar)) {
                    aVar.b();
                }
            } else {
                nwv.z0(new b(jVar, jSONObject), true);
            }
        }
    }

    public static void deleteFile(d.j jVar) {
        boolean z = false;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac3c4a5", new Object[]{jVar});
            return;
        }
        try {
            JSON json = jVar.b;
            if (json instanceof Map) {
                String str = (String) ((Map) json).get("path");
                if (!TextUtils.isEmpty(str)) {
                    File file = new File(str);
                    if (file.exists()) {
                        if (file.isDirectory()) {
                            ah9.a(file);
                            z = true;
                        } else {
                            z = file.delete();
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("deleteResult", (Object) Boolean.valueOf(z));
                        jSONObject.put(qan.FROM_EXIST, (Object) Boolean.valueOf(z2));
                        jVar.c.a(jVar, jSONObject);
                    }
                }
                z2 = false;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("deleteResult", (Object) Boolean.valueOf(z));
                jSONObject2.put(qan.FROM_EXIST, (Object) Boolean.valueOf(z2));
                jVar.c.a(jVar, jSONObject2);
            }
        } catch (Throwable th) {
            tfs.d("deleteFile error," + th.getMessage());
        }
    }

    public static void getNodeInfo(d.j jVar) {
        n nVar;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6646c806", new Object[]{jVar});
        } else if (jVar.b instanceof JSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = (JSONObject) jVar.b;
                String string = jSONObject3.getString("containerId");
                String string2 = jSONObject3.getString("target");
                String string3 = jSONObject3.getString("imageId");
                String string4 = jSONObject3.getString("listId");
                JSONObject jSONObject4 = null;
                n a0 = !TextUtils.isEmpty(string2) ? jVar.f11976a.a0(Integer.valueOf(string2).intValue()) : null;
                if (a0 == null || TextUtils.isEmpty(string)) {
                    nVar = !TextUtils.isEmpty(string) ? jVar.f11976a.a0(Integer.valueOf(string).intValue()) : null;
                } else {
                    nVar = a0.w(string, true);
                }
                if (nVar != null) {
                    JSONArray jSONArray = new JSONArray();
                    ArrayList arrayList = new ArrayList();
                    if (!TextUtils.isEmpty(string3)) {
                        nVar.A(string3, arrayList);
                    }
                    if (!TextUtils.isEmpty(string4)) {
                        jSONObject4 = getListViewProperty(nVar, string4);
                    }
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        n nVar2 = (n) arrayList.get(i2);
                        View w0 = nVar2.w0();
                        if (w0 != null) {
                            jSONObject = getViewProperty(w0);
                            if (jSONObject4 != null) {
                                jSONObject.putAll(jSONObject4);
                            }
                        } else {
                            jSONObject = new JSONObject();
                        }
                        jSONObject.put("target", (Object) Integer.valueOf(nVar2.U()));
                        jSONArray.add(i2, jSONObject);
                    }
                    jSONObject2.put("positions", (Object) jSONArray);
                }
            } catch (Exception e2) {
                tfs.d("getNodeInfo:" + e2.getMessage());
            }
            jVar.c.a(jVar, jSONObject2);
        }
    }

    private static JSONObject getViewProperty(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8e7f53fb", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", (Object) Float.valueOf(view.getX()));
        jSONObject.put("y", (Object) Float.valueOf(view.getY()));
        jSONObject.put("width", (Object) Integer.valueOf(view.getWidth()));
        jSONObject.put("height", (Object) Integer.valueOf(view.getHeight()));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        jSONObject.put("windowX", (Object) Integer.valueOf(iArr[0]));
        jSONObject.put("windowY", (Object) Integer.valueOf(iArr[1]));
        view.getLocationOnScreen(iArr);
        jSONObject.put(WXGestureType.GestureInfo.SCREEN_X, (Object) Integer.valueOf(iArr[0]));
        jSONObject.put(WXGestureType.GestureInfo.SCREEN_Y, (Object) Integer.valueOf(iArr[1]));
        jSONObject.put("windowWidth", (Object) Integer.valueOf(s6o.B(view.getContext())));
        jSONObject.put("windowHeight", (Object) Integer.valueOf(s6o.n(view.getContext())));
        Drawable background = view.getBackground();
        if (background instanceof mx7.b) {
            mx7.b bVar = (mx7.b) background;
            float[] a2 = bVar.a();
            float b2 = bVar.b();
            if (a2 == null) {
                a2 = new float[]{b2};
            }
            jSONObject.put(pg1.ATOM_EXT_UDL_border_radius, (Object) a2);
        }
        return jSONObject;
    }

    public static void alert(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7fac6b0", new Object[]{jVar});
            return;
        }
        d.k kVar = jVar.c;
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            String string = ((JSONObject) json).getString("title");
            String string2 = ((JSONObject) jVar.b).getString("message");
            String string3 = ((JSONObject) jVar.b).getString("confirmTitle");
            String string4 = ((JSONObject) jVar.b).getString("cancelTitle");
            alert(jVar.c(), string, string2, string3, string4, ((JSONObject) jVar.b).containsKey(pg1.ATOM_EXT_cancelable) ? ((JSONObject) jVar.b).getBooleanValue(pg1.ATOM_EXT_cancelable) : true, !TextUtils.isEmpty(string3) ? new j(kVar, jVar) : null, !TextUtils.isEmpty(string4) ? new k(kVar, jVar) : null, new l(kVar, jVar));
        }
    }
}
