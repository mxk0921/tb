package com.alibaba.ability.impl.localstorage;

import android.content.Context;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.a07;
import tb.a6g;
import tb.ckf;
import tb.cu;
import tb.eji;
import tb.jpu;
import tb.kdb;
import tb.t2o;
import tb.vq;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class LocalStorageAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_GET = "get";
    public static final String API_REMOVE = "remove";
    public static final String API_SET = "set";
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final eji f1963a = new eji("mega-local-storage-stat", 1);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(114294788);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public static /* synthetic */ Object ipc$super(LocalStorageAbility localStorageAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/localstorage/LocalStorageAbility");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f1964a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Ref$ObjectRef c;
        public final /* synthetic */ kdb d;

        public b(String str, String str2, Ref$ObjectRef ref$ObjectRef, kdb kdbVar) {
            this.f1964a = str;
            this.b = str2;
            this.c = ref$ObjectRef;
            this.d = kdbVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            String obj2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Pair a2 = jpu.a("api", "get");
                Pair a3 = jpu.a("fileName", this.f1964a);
                Pair a4 = jpu.a("key", this.b);
                T t = this.c.element;
                Pair a5 = jpu.a("len", Integer.valueOf((t == 0 || (obj2 = t.toString()) == null) ? 0 : obj2.length()));
                Pair a6 = jpu.a("bizId", this.d.l().getBusinessID());
                Pair a7 = jpu.a("namespace", this.d.l().getNamespace());
                Map<String, Object> f = this.d.f();
                AppMonitor.Alarm.commitSuccess("Megability", "LocalStorageSizeStat", new JSONObject(kotlin.collections.a.k(a2, a3, a4, a5, a6, a7, jpu.a("url", (f == null || (obj = f.get("url")) == null) ? null : obj.toString()))).toJSONString());
            } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f1965a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ kdb d;

        public c(String str, String str2, Object obj, kdb kdbVar) {
            this.f1965a = str;
            this.b = str2;
            this.c = obj;
            this.d = kdbVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            String obj2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Pair a2 = jpu.a("api", "set");
                Pair a3 = jpu.a("fileName", this.f1965a);
                Pair a4 = jpu.a("key", this.b);
                Object obj3 = this.c;
                String str = null;
                Pair a5 = jpu.a("len", (obj3 == null || (obj2 = obj3.toString()) == null) ? null : Integer.valueOf(obj2.length()));
                Pair a6 = jpu.a("bizId", this.d.l().getBusinessID());
                Pair a7 = jpu.a("namespace", this.d.l().getNamespace());
                Map<String, Object> f = this.d.f();
                if (!(f == null || (obj = f.get("url")) == null)) {
                    str = obj.toString();
                }
                AppMonitor.Alarm.commitSuccess("Megability", "LocalStorageSizeStat", new JSONObject(kotlin.collections.a.k(a2, a3, a4, a5, a6, a7, jpu.a("url", str))).toJSONString());
            } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
            }
        }
    }

    static {
        t2o.a(114294787);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.Object] */
    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        String w = MegaUtils.w(map, "fileName", "");
        ckf.d(w);
        String w2 = MegaUtils.w(map, "key", null);
        Context context = kdbVar.l().getContext();
        if (w2 == null || context == null) {
            return new ErrorResult("400", "NullParams, k=" + w2 + ", ctx=" + context, (Map) null, 4, (a07) null);
        }
        int hashCode = str.hashCode();
        if (hashCode != -934610812) {
            if (hashCode != 102230) {
                if (hashCode == 113762 && str.equals("set")) {
                    Object obj = map.get("value");
                    a6g.c(context, w, w2, obj);
                    eji.j(f1963a, new c(w, w2, obj, kdbVar), 0L, null, 6, null);
                    return new FinishResult(null, null, 3, null);
                }
            } else if (str.equals("get")) {
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = a6g.a(context, w, w2);
                eji.j(f1963a, new b(w, w2, ref$ObjectRef, kdbVar), 0L, null, 6, null);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", ref$ObjectRef.element);
                xhv xhvVar = xhv.INSTANCE;
                return new FinishResult(jSONObject, null, 2, null);
            }
            return new ErrorResult("501", (String) null, (Map) null, 6, (a07) null);
        }
        if (str.equals("remove")) {
            a6g.c(context, w, w2, null);
            return new FinishResult(null, null, 3, null);
        }
        return new ErrorResult("501", (String) null, (Map) null, 6, (a07) null);
    }
}
