package com.etao.feimagesearch.intelli.realtime;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.widget.FrameLayout;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.intelli.realtime.mtop.CloudMsgFetcher;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import tb.a07;
import tb.agh;
import tb.caa;
import tb.ckf;
import tb.fne;
import tb.fxv;
import tb.i0u;
import tb.lg4;
import tb.ll0;
import tb.ml0;
import tb.mzu;
import tb.njg;
import tb.p73;
import tb.t2o;
import tb.vkn;
import tb.wkn;
import tb.wsa;
import tb.zio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class DataPool {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "realtime_DataPool";

    /* renamed from: a  reason: collision with root package name */
    public final HashSet<Integer> f4733a;
    public final HashSet<Integer> b;
    public final ConcurrentHashMap<Integer, ObjectCardWrapper> c;
    public final ConcurrentHashMap<Integer, d> d;
    public String e;
    public final AtomicBoolean f;
    public final ConcurrentHashMap<Integer, c> g;
    public final CopyOnWriteArrayList<String> h;
    public HandlerThread i;
    public final Handler j;
    public Handler k;
    public final AtomicBoolean l;
    public com.etao.feimagesearch.intelli.realtime.a m;
    public boolean n;
    public boolean o;
    public static final e Companion = new e(null);
    public static final int p = lg4.o3();
    public static final njg<DataPool> q = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, DataPool$Companion$instance$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JSONArray f4734a;
        public final b b;

        static {
            t2o.a(730857649);
        }

        public a(JSONArray jSONArray, b bVar) {
            ckf.g(jSONArray, "algoMsg");
            ckf.g(bVar, "callback");
            this.f4734a = jSONArray;
            this.b = bVar;
        }

        public final JSONArray a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("182d55df", new Object[]{this});
            }
            return this.f4734a;
        }

        public final b b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8b428c48", new Object[]{this});
            }
            return this.b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface b {
        void a(ll0 ll0Var);

        void onFailed();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final wkn f4735a;
        public final Bitmap b;

        static {
            t2o.a(730857651);
        }

        public c(wkn wknVar, Bitmap bitmap) {
            ckf.g(wknVar, "realtimeObject");
            ckf.g(bitmap, "frame");
            this.f4735a = wknVar;
            this.b = bitmap;
        }

        public final Bitmap a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("b13e959c", new Object[]{this});
            }
            return this.b;
        }

        public final wkn b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (wkn) ipChange.ipc$dispatch("c1b00d21", new Object[]{this});
            }
            return this.f4735a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f4736a;
        public final JSONArray b;
        public final Bitmap c;
        public final RectF d;
        public final String e;

        static {
            t2o.a(730857652);
        }

        public d(JSONObject jSONObject, JSONArray jSONArray, Bitmap bitmap, RectF rectF, String str) {
            ckf.g(jSONObject, "cloudObjectData");
            ckf.g(jSONArray, "templates");
            ckf.g(bitmap, "frame");
            ckf.g(rectF, "originRateBox");
            ckf.g(str, "mssid");
            this.f4736a = jSONObject;
            this.b = jSONArray;
            this.c = bitmap;
            this.d = rectF;
            this.e = str;
        }

        public final JSONObject a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("bc901d0f", new Object[]{this});
            }
            return this.f4736a;
        }

        public final Bitmap b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("b13e959c", new Object[]{this});
            }
            return this.c;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("70fc2687", new Object[]{this});
            }
            return this.e;
        }

        public final RectF d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RectF) ipChange.ipc$dispatch("e15fc091", new Object[]{this});
            }
            return this.d;
        }

        public final JSONArray e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("62ebe974", new Object[]{this});
            }
            return this.b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(730857653);
        }

        public /* synthetic */ e(a07 a07Var) {
            this();
        }

        public final DataPool a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DataPool) ipChange.ipc$dispatch("3606d5f4", new Object[]{this});
            }
            return (DataPool) DataPool.b().getValue();
        }

        public e() {
        }

        public final void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de8caeb8", new Object[]{this, new Integer(i)});
                return;
            }
            agh.h(DataPool.TAG, ckf.p("muiseCardClicked: ", Integer.valueOf(i)));
            ObjectCardWrapper objectCardWrapper = (ObjectCardWrapper) DataPool.c(a()).get(Integer.valueOf(i));
            if (objectCardWrapper != null) {
                objectCardWrapper.F(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONArray b;

        public f(JSONArray jSONArray) {
            this.b = jSONArray;
        }

        @Override // com.etao.feimagesearch.intelli.realtime.DataPool.b
        public void a(ll0 ll0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8796933", new Object[]{this, ll0Var});
                return;
            }
            ckf.g(ll0Var, "algoOutput");
            DataPool.n(DataPool.this, ll0Var);
            vkn.Companion.d(true, this.b.size(), ll0Var.a().size());
        }

        @Override // com.etao.feimagesearch.intelli.realtime.DataPool.b
        public void onFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8bb1183", new Object[]{this});
                return;
            }
            DataPool.i(DataPool.this).set(false);
            mzu.n(p73.f25916a, "metasightTppReturnProcessFailed", 2101, new String[0]);
            vkn.Companion.d(false, this.b.size(), 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class g extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ HandlerThread c;
        public final /* synthetic */ DataPool d;

        public g(HandlerThread handlerThread, DataPool dataPool) {
            this.c = handlerThread;
            this.d = dataPool;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/intelli/realtime/DataPool$release$1$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            this.c.quit();
            Handler h = DataPool.h(this.d);
            if (h != null) {
                h.removeCallbacksAndMessages(null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class h implements CloudMsgFetcher.Companion.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ HashMap<Integer, c> b;

        public h(HashMap<Integer, c> hashMap) {
            this.b = hashMap;
        }

        @Override // com.etao.feimagesearch.intelli.realtime.mtop.CloudMsgFetcher.Companion.a
        public void onFailed(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c2003aa", new Object[]{this, new Integer(i), str});
                return;
            }
            ckf.g(str, "errorMsg");
            mzu.n(p73.f25916a, "metasightRequestFailed", 2101, "errorCode", String.valueOf(i), "errorMsg", str);
            agh.c(DataPool.TAG, "onFailed: " + i + ", " + str);
            DataPool.i(DataPool.this).set(false);
            vkn.Companion.f(false, 0);
        }

        @Override // com.etao.feimagesearch.intelli.realtime.mtop.CloudMsgFetcher.Companion.a
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                return;
            }
            ckf.g(jSONObject, "data");
            agh.h(DataPool.TAG, ckf.p("onSuccess: threadName ", Thread.currentThread().getName()));
            try {
                DataPool.j(DataPool.this, jSONObject, this.b);
            } catch (Exception e) {
                e.printStackTrace();
                DataPool.i(DataPool.this).set(false);
                vkn.Companion.f(false, 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class i extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/intelli/realtime/DataPool$setRealtimeObjectDetector$1$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            ckf.g(message, "msg");
            super.handleMessage(message);
            if (!DataPool.e(DataPool.this).get() && message.what == 110001) {
                DataPool.k(DataPool.this);
            }
        }
    }

    static {
        t2o.a(730857648);
    }

    public /* synthetic */ DataPool(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ CopyOnWriteArrayList a(DataPool dataPool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("12d1acea", new Object[]{dataPool});
        }
        return dataPool.h;
    }

    public static final /* synthetic */ njg b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("59beb729", new Object[0]);
        }
        return q;
    }

    public static final /* synthetic */ ConcurrentHashMap c(DataPool dataPool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("2e2fe65a", new Object[]{dataPool});
        }
        return dataPool.c;
    }

    public static final /* synthetic */ ObjectCardWrapper d(DataPool dataPool, wkn wknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectCardWrapper) ipChange.ipc$dispatch("1181219d", new Object[]{dataPool, wknVar});
        }
        return dataPool.q(wknVar);
    }

    public static final /* synthetic */ AtomicBoolean e(DataPool dataPool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("d6527d36", new Object[]{dataPool});
        }
        return dataPool.l;
    }

    public static final /* synthetic */ boolean f(DataPool dataPool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96835cf4", new Object[]{dataPool})).booleanValue();
        }
        return dataPool.o;
    }

    public static final /* synthetic */ ConcurrentHashMap g(DataPool dataPool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("b405b2ad", new Object[]{dataPool});
        }
        return dataPool.g;
    }

    public static final /* synthetic */ Handler h(DataPool dataPool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("93af1000", new Object[]{dataPool});
        }
        return dataPool.k;
    }

    public static final /* synthetic */ AtomicBoolean i(DataPool dataPool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("b932e40", new Object[]{dataPool});
        }
        return dataPool.f;
    }

    public static final /* synthetic */ void j(DataPool dataPool, JSONObject jSONObject, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11840c15", new Object[]{dataPool, jSONObject, hashMap});
        } else {
            dataPool.r(jSONObject, hashMap);
        }
    }

    public static final /* synthetic */ void k(DataPool dataPool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf97c72", new Object[]{dataPool});
        } else {
            dataPool.t();
        }
    }

    public static final /* synthetic */ void l(DataPool dataPool, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a501f294", new Object[]{dataPool, bitmap});
        } else {
            dataPool.getClass();
        }
    }

    public static final /* synthetic */ void m(DataPool dataPool, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e77c7f0", new Object[]{dataPool, new Boolean(z)});
        } else {
            dataPool.o = z;
        }
    }

    public static final /* synthetic */ void n(DataPool dataPool, ll0 ll0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cd519a1", new Object[]{dataPool, ll0Var});
        } else {
            dataPool.v(ll0Var);
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43c02b5", new Object[]{this});
        } else if (this.c.size() >= p) {
            int i2 = -1;
            int i3 = fxv.SECOND_IN_NANOS;
            for (ObjectCardWrapper objectCardWrapper : this.c.values()) {
                Rect b2 = objectCardWrapper.E().b();
                int height = b2.height() * b2.width();
                if (height < i3) {
                    i2 = objectCardWrapper.E().f();
                    i3 = height;
                }
            }
            if (i2 > 0) {
                ObjectCardWrapper remove = this.c.remove(Integer.valueOf(i2));
                agh.c(TAG, ckf.p("remove card ", Integer.valueOf(i2)));
                if (remove != null) {
                    remove.z();
                }
            }
        }
    }

    public final Collection<ObjectCardWrapper> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("e299a9e8", new Object[]{this});
        }
        Collection<ObjectCardWrapper> values = this.c.values();
        ckf.f(values, "objectCardHashMap.values");
        return values;
    }

    public final void w(fne fneVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26b6fa15", new Object[]{this, fneVar});
            return;
        }
        ckf.g(fneVar, "output");
        if (!this.l.get()) {
            this.j.post(new j(fneVar));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ fne b;

        public j(fne fneVar) {
            this.b = fneVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!DataPool.e(DataPool.this).get() && this.b.b() != null) {
                fne fneVar = this.b;
                DataPool dataPool = DataPool.this;
                ArrayList<wkn> b = fneVar.b();
                if (b != null) {
                    Iterator<wkn> it = b.iterator();
                    while (it.hasNext()) {
                        wkn next = it.next();
                        Bitmap c = fneVar.c();
                        ckf.f(next, "realtimeObject");
                        ObjectCardWrapper d = DataPool.d(dataPool, next);
                        if (!(c == null || d == null)) {
                            Integer c2 = next.c();
                            if (c2 != null && c2.intValue() == 1) {
                                if (!DataPool.f(dataPool)) {
                                    DataPool.m(dataPool, true);
                                    vkn.Companion.b();
                                }
                                DataPool.g(dataPool).put(Integer.valueOf(next.f()), new c(next, c));
                            }
                            z = true;
                        }
                    }
                    if (z) {
                        String a2 = fneVar.a();
                        if (a2 != null) {
                            DataPool.a(dataPool).add(a2);
                        }
                        DataPool.l(dataPool, fneVar.c());
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<com.etao.feimagesearch.mnn.realtime.RealtimeObject>{ kotlin.collections.TypeAliasesKt.ArrayList<com.etao.feimagesearch.mnn.realtime.RealtimeObject> }");
            }
        }
    }

    public DataPool() {
        this.f4733a = new HashSet<>();
        this.b = new HashSet<>();
        this.c = new ConcurrentHashMap<>();
        this.d = new ConcurrentHashMap<>();
        this.e = "";
        this.f = new AtomicBoolean(false);
        this.g = new ConcurrentHashMap<>(10);
        this.h = new CopyOnWriteArrayList<>();
        this.j = new Handler(Looper.getMainLooper());
        this.l = new AtomicBoolean(false);
    }

    public final ObjectCardWrapper q(wkn wknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectCardWrapper) ipChange.ipc$dispatch("4b3a852d", new Object[]{this, wknVar});
        }
        this.f4733a.add(Integer.valueOf(wknVar.f()));
        ObjectCardWrapper objectCardWrapper = this.c.get(Integer.valueOf(wknVar.f()));
        com.etao.feimagesearch.intelli.realtime.a aVar = this.m;
        if (aVar == null) {
            return null;
        }
        if (objectCardWrapper != null) {
            objectCardWrapper.U(wknVar);
        } else if (wknVar.j() == 1) {
            o();
            Context context = aVar.getRootView().getContext();
            ckf.f(context, "it.rootView.context");
            FrameLayout rootView = aVar.getRootView();
            ckf.f(rootView, "it.rootView");
            objectCardWrapper = new ObjectCardWrapper(context, rootView, wknVar, aVar, this.e);
            this.c.put(Integer.valueOf(wknVar.f()), objectCardWrapper);
            this.b.add(Integer.valueOf(wknVar.f()));
        } else {
            objectCardWrapper = null;
        }
        return objectCardWrapper;
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9df0afc2", new Object[]{this});
            return;
        }
        Handler handler = this.k;
        if (handler != null) {
            handler.removeMessages(com.taobao.android.dinamicx.f.DX_ERROR_CODE_SIGNAL_EXCEPTION_CRASH);
            handler.sendEmptyMessageDelayed(com.taobao.android.dinamicx.f.DX_ERROR_CODE_SIGNAL_EXCEPTION_CRASH, 400L);
        }
        if (this.g.size() != 0) {
            if (this.f.get()) {
                agh.h(TAG, "is requesting");
                return;
            }
            HashMap<Integer, c> hashMap = new HashMap<>(this.g);
            String jSONString = JSON.toJSONString(this.h);
            this.h.clear();
            this.g.clear();
            if (hashMap.size() > 0) {
                agh.h(TAG, "prepare fetchCloudMsg");
                vkn.Companion.e();
                CloudMsgFetcher.Companion companion = CloudMsgFetcher.Companion;
                h hVar = new h(hashMap);
                String str = this.e;
                ckf.f(jSONString, "extraInfo");
                companion.a(hashMap, hVar, str, jSONString);
                this.f.set(true);
            }
        }
    }

    public final void u(com.etao.feimagesearch.intelli.realtime.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b68d8ff", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, "detector");
        this.m = aVar;
        this.f4733a.clear();
        this.b.clear();
        this.e = "";
        this.n = false;
        this.o = false;
        System.currentTimeMillis();
        this.l.set(false);
        HandlerThread a2 = wsa.a("realtime_image_search");
        this.i = a2;
        if (a2 != null) {
            a2.start();
            i iVar = new i(a2.getLooper());
            this.k = iVar;
            iVar.sendEmptyMessageDelayed(com.taobao.android.dinamicx.f.DX_ERROR_CODE_SIGNAL_EXCEPTION_CRASH, 400L);
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        agh.h(TAG, "destroy");
        this.f4733a.clear();
        this.b.clear();
        this.h.clear();
        this.l.set(true);
        this.e = "";
        this.n = false;
        this.o = false;
        this.f.set(false);
        this.j.removeCallbacksAndMessages(null);
        for (ObjectCardWrapper objectCardWrapper : this.c.values()) {
            objectCardWrapper.z();
        }
        this.c.clear();
        this.d.clear();
        HandlerThread handlerThread = this.i;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            Handler handler = this.k;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        }
        this.m = null;
    }

    public final void v(ll0 ll0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27814b1", new Object[]{this, ll0Var});
            return;
        }
        agh.h(TAG, ckf.p("updateAlgoMsgResult: threadName ", Thread.currentThread().getName()));
        if (!this.l.get()) {
            for (ml0 ml0Var : ll0Var.a()) {
                if (ml0Var.b() == 1) {
                    ObjectCardWrapper objectCardWrapper = this.c.get(Integer.valueOf(ml0Var.a()));
                    d dVar = this.d.get(Integer.valueOf(ml0Var.a()));
                    if (!(dVar == null || objectCardWrapper == null)) {
                        objectCardWrapper.T(dVar);
                        if (!this.n) {
                            this.n = true;
                            i0u.f(caa.c(), Localization.q(R.string.taobao_app_1007_1_19063), 0);
                        }
                    }
                }
            }
            this.d.clear();
            this.f.set(false);
        }
    }

    public final void r(JSONObject jSONObject, HashMap<Integer, c> hashMap) {
        JSONObject jSONObject2 = jSONObject;
        HashMap<Integer, c> hashMap2 = hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb5ef65", new Object[]{this, jSONObject2, hashMap2});
            return;
        }
        JSONArray jSONArray = new JSONArray();
        if (jSONObject2.get("realtimeResult") == null) {
            this.f.set(false);
            vkn.Companion.f(false, 0);
            return;
        }
        String str = (String) jSONObject2.get("mssid");
        if (str == null) {
            str = "";
        }
        Object obj = jSONObject2.get("realtimeResult");
        if (obj != null) {
            JSONArray jSONArray2 = (JSONArray) obj;
            vkn.Companion.f(true, jSONArray2.size());
            Iterator<Object> it = jSONArray2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject3 = (JSONObject) next;
                    Object obj2 = jSONObject3.get("imageId");
                    if (obj2 != null) {
                        int parseInt = Integer.parseInt((String) obj2);
                        c cVar = hashMap2.get(Integer.valueOf(parseInt));
                        if (cVar == null) {
                            continue;
                        } else {
                            Bitmap a2 = cVar.a();
                            RectF i2 = cVar.b().i();
                            JSONObject jSONObject4 = (JSONObject) jSONObject3.get("objectData");
                            if (jSONObject4 == null) {
                                continue;
                            } else {
                                JSONArray jSONArray3 = (JSONArray) jSONObject4.get("algoInfos");
                                Object obj3 = jSONObject2.get("templates");
                                if (obj3 != null) {
                                    JSONArray jSONArray4 = (JSONArray) obj3;
                                    if (jSONArray3 == null) {
                                        it = it;
                                    } else {
                                        it = it;
                                        this.d.put(Integer.valueOf(parseInt), new d(jSONObject4, jSONArray4, a2, i2, str));
                                        this.e = str;
                                        JSONObject jSONObject5 = new JSONObject();
                                        jSONObject5.put((JSONObject) "imageId", (String) Integer.valueOf(parseInt));
                                        jSONObject5.put((JSONObject) "returnList", (String) jSONArray3);
                                        jSONArray.add(jSONObject5);
                                    }
                                    jSONObject2 = jSONObject;
                                    hashMap2 = hashMap;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
                                }
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
            }
            a aVar = new a(jSONArray, new f(jSONArray));
            com.etao.feimagesearch.intelli.realtime.a aVar2 = this.m;
            if (aVar2 != null) {
                aVar2.y(aVar);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
    }
}
