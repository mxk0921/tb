package com.taobao.themis.open.packages.downloader;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Pair;
import tb.ckf;
import tb.ekl;
import tb.fkl;
import tb.gkl;
import tb.hkl;
import tb.m5d;
import tb.t2o;
import tb.u1a;
import tb.yox;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ZCacheExtKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements fkl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u1a f13650a;

        public a(u1a u1aVar) {
            this.f13650a = u1aVar;
        }

        @Override // tb.fkl
        public final /* synthetic */ void a(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b8903b4", new Object[]{this, new Long(j), new Long(j2)});
            } else {
                this.f13650a.invoke(Long.valueOf(j), Long.valueOf(j2));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements hkl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u1a f13651a;

        public b(u1a u1aVar) {
            this.f13651a = u1aVar;
        }

        @Override // tb.hkl
        public final /* synthetic */ void a(String str, gkl gklVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("493f87c0", new Object[]{this, str, gklVar});
            } else {
                this.f13651a.invoke(str, gklVar);
            }
        }
    }

    static {
        t2o.a(843055293);
    }

    public static final void a(ekl eklVar, m5d.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1eb6680", new Object[]{eklVar, cVar});
        } else {
            yox.C(eklVar, new b(new ZCacheExtKt$downloadPackageUseZCacheWithPackRequest$downloadFinishCallback$1(cVar, eklVar)), new a(new ZCacheExtKt$downloadPackageUseZCacheWithPackRequest$downloadProgressCallback$1(cVar)));
        }
    }

    public static final void c(String str, m5d.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eedc5e", new Object[]{str, cVar});
        } else if (str != null) {
            a(new ekl(str, null), cVar);
        } else if (cVar != null) {
            cVar.b(new m5d.b(0, "cdn url is null"));
        }
    }

    public static final Pair<String, JSONObject> d(JSONObject jSONObject) {
        String next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("8131495a", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.keySet().size() == 0 || (next = jSONObject.keySet().iterator().next()) == null) {
            return null;
        }
        return new Pair<>(next, jSONObject.getJSONObject(next));
    }

    public static final void b(JSONObject jSONObject, m5d.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d8a235c", new Object[]{jSONObject, cVar});
        } else if (jSONObject != null) {
            Pair<String, JSONObject> d = d(jSONObject);
            if (d != null) {
                String first = d.getFirst();
                JSONObject second = d.getSecond();
                a(new ekl(first, second == null ? null : second.toString()), cVar);
            } else if (cVar != null) {
                cVar.b(new m5d.b(0, ckf.p("packData is null ,cache info is ", jSONObject)));
            }
        } else if (cVar != null) {
            cVar.b(new m5d.b(0, "cacheInfo is null"));
        }
    }
}
