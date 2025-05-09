package com.alibaba.alibity.container.ssr;

import android.net.Uri;
import android.taobao.windvane.export.network.Request;
import android.taobao.windvane.export.network.RequestCallback;
import android.taobao.windvane.export.network.b;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.storage.FccStorageType;
import android.taobao.windvane.extra.storage.FirstChunkStorage;
import android.taobao.windvane.extra.storage.ResponseContext;
import android.taobao.windvane.thread.WVThreadPool;
import android.text.TextUtils;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.taobao.impl.TMS;
import com.taobao.themis.web.utils.HTMLPrefetchJob;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.a07;
import tb.ckf;
import tb.cu;
import tb.d1a;
import tb.h8s;
import tb.jpu;
import tb.kdb;
import tb.q9s;
import tb.v3i;
import tb.vpw;
import tb.vq;
import tb.wsq;
import tb.xhv;
import tb.xpc;
import tb.yaa;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t0\bj\u0002`\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/alibaba/alibity/container/ssr/FirstChunkCacheAbility;", "Ltb/cu;", "<init>", "()V", "", "api", "Ltb/kdb;", "context", "", "", "Lcom/alibaba/ability/AbilityData;", "params", "Ltb/vq;", "callback", "Lcom/alibaba/ability/result/ExecuteResult;", xpc.RECORD_EXECUTE, "(Ljava/lang/String;Ltb/kdb;Ljava/util/Map;Ltb/vq;)Lcom/alibaba/ability/result/ExecuteResult;", "megability-kit-container-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FirstChunkCacheAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a extends RequestCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f2091a;
        public final /* synthetic */ vq b;

        public a(Ref$ObjectRef ref$ObjectRef, vq vqVar) {
            this.f2091a = ref$ObjectRef;
            this.b = vqVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 195948249) {
                super.onFinish();
                return null;
            } else if (hashCode == 2053577885) {
                super.onError(((Number) objArr[0]).intValue(), (String) objArr[1]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/alibity/container/ssr/FirstChunkCacheAbility$preloadFirstChunk$1");
            }
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onError(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str});
                return;
            }
            super.onError(i, str);
            Integer num = (Integer) this.f2091a.element;
            if (num != null) {
                b.j(num.intValue());
            }
            this.b.b(new ErrorResult("500", "网络错误", (Map) null, 4, (a07) null));
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
                return;
            }
            super.onFinish();
            Integer num = (Integer) this.f2091a.element;
            if (num != null) {
                b.j(num.intValue());
            }
            this.b.c(new FinishResult(null, null, 3, null));
        }
    }

    public static /* synthetic */ Object ipc$super(FirstChunkCacheAbility firstChunkCacheAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/alibity/container/ssr/FirstChunkCacheAbility");
    }

    public final long a(Map<String, ? extends Object> map, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e0897af", new Object[]{this, map, str, new Long(j)})).longValue();
        }
        Object obj = map.get(str);
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        return j;
    }

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
        if (!q9s.a3("themis_common_config", "enableSSR_".concat(str), Boolean.TRUE)) {
            vqVar.b(ErrorResult.a.Companion.e("api is disabled"));
            return null;
        }
        switch (str.hashCode()) {
            case -950587911:
                if (str.equals("prerender")) {
                    b(kdbVar, map, vqVar);
                    break;
                }
                break;
            case -910911709:
                if (str.equals("setFirstChunkCache")) {
                    f(kdbVar, map, vqVar);
                    break;
                }
                break;
            case -318476791:
                if (str.equals("preload")) {
                    c(kdbVar, map, vqVar);
                    break;
                }
                break;
            case 1686741126:
                if (str.equals("preloadFirstChunk")) {
                    d(kdbVar, map, vqVar);
                    break;
                }
                break;
            case 1806389953:
                if (str.equals("removeFirstChunkCache")) {
                    e(kdbVar, map, vqVar);
                    break;
                }
                break;
        }
        return null;
    }

    public final void c(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1caabe", new Object[]{this, kdbVar, map, vqVar});
            return;
        }
        String w = MegaUtils.w(map, "url", null);
        if (TextUtils.isEmpty(w)) {
            vqVar.b(ErrorResult.a.Companion.g("url is empty"));
            return;
        }
        ckf.d(w);
        if (HTMLPrefetchJob.preloadJSAPI(w)) {
            vqVar.c(new FinishResult(null, null, 3, null));
        } else {
            vqVar.b(new ErrorResult("500", "preload failed", (Map) null, 4, (a07) null));
        }
    }

    public final void e(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd9c6976", new Object[]{this, kdbVar, map, vqVar});
            return;
        }
        String w = MegaUtils.w(map, "url", null);
        if (w == null) {
            w = (String) kdbVar.m("url");
        }
        if (TextUtils.isEmpty(w)) {
            vqVar.b(ErrorResult.a.Companion.g("url is empty"));
            return;
        }
        new FirstChunkStorage(w).remove();
        vqVar.c(new FinishResult(null, null, 3, null));
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [T, java.lang.Integer] */
    public final void d(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        ResponseContext read;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("196608fb", new Object[]{this, kdbVar, map, vqVar});
            return;
        }
        String w = MegaUtils.w(map, "url", null);
        Boolean g = MegaUtils.g(map, "forceUpdate", Boolean.FALSE);
        if (TextUtils.isEmpty(w)) {
            vqVar.b(ErrorResult.a.Companion.g("url is empty"));
        } else if (g == null) {
            vqVar.b(ErrorResult.a.Companion.g("forceUpdate shouldn't be null"));
        } else if (yaa.n == null) {
            vqVar.b(ErrorResult.a.Companion.g("context is null"));
        } else {
            FirstChunkStorage firstChunkStorage = new FirstChunkStorage(w);
            if (firstChunkStorage.shouldDisableSnapshot()) {
                vqVar.b(ErrorResult.a.Companion.g("disable snapshot"));
            } else if (g.booleanValue() || (read = firstChunkStorage.read()) == null || read.isExpired()) {
                Request.b bVar = new Request.b();
                ckf.d(w);
                Request f = bVar.l(w).i("GET").h(true).f();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = null;
                ref$ObjectRef.element = Integer.valueOf(b.g(f, new a(ref$ObjectRef, vqVar)));
            } else {
                vqVar.c(new FinishResult(v3i.f(jpu.a("msg", "don't update cache")), null, 2, null));
            }
        }
    }

    public final void f(final kdb kdbVar, Map<String, ? extends Object> map, final vq vqVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae1d0358", new Object[]{this, kdbVar, map, vqVar});
            return;
        }
        String w = MegaUtils.w(map, "url", null);
        if (w == null) {
            w = (String) kdbVar.m("url");
        }
        if (TextUtils.isEmpty(w)) {
            vqVar.b(ErrorResult.a.Companion.g("url is empty"));
            return;
        }
        String w2 = MegaUtils.w(map, "html", null);
        final FirstChunkStorage firstChunkStorage = new FirstChunkStorage(w);
        final ResponseContext read = firstChunkStorage.read();
        if (read == null) {
            read = new ResponseContext();
        }
        if (read.getExpiredTime() == 0) {
            read.setExpiredTime(ResponseContext.getDefaultExpiredTime());
        }
        read.setExpiredTime(a(map, "expireTime", read.getExpiredTime()));
        if (!TextUtils.isEmpty(w2)) {
            read.setHtml(w2);
            if (w2 != null) {
                i = w2.length();
            }
            read.setHtmlLength(i);
            read.setStorageType(FccStorageType.SNAPSHOT);
        }
        read.setPriority(1);
        try {
            if (h8s.s(kdbVar.l().getContext()).d()) {
                WVThreadPool.getInstance().execute(new Runnable() { // from class: com.alibaba.alibity.container.ssr.FirstChunkCacheAbility$setFirstChunkCache$$inlined$runCatching$lambda$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* compiled from: Taobao */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "invoke", "()V", "com/alibaba/alibity/container/ssr/FirstChunkCacheAbility$setFirstChunkCache$1$1$$special$$inlined$runCatching$lambda$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
                    /* renamed from: com.alibaba.alibity.container.ssr.FirstChunkCacheAbility$setFirstChunkCache$$inlined$runCatching$lambda$1$1  reason: invalid class name */
                    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
                    public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
                        public static volatile transient /* synthetic */ IpChange $ipChange;
                        public final /* synthetic */ boolean $success;
                        public final /* synthetic */ FirstChunkCacheAbility$setFirstChunkCache$$inlined$runCatching$lambda$1 this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(boolean z, FirstChunkCacheAbility$setFirstChunkCache$$inlined$runCatching$lambda$1 firstChunkCacheAbility$setFirstChunkCache$$inlined$runCatching$lambda$1) {
                            super(0);
                            this.$success = z;
                            this.this$0 = firstChunkCacheAbility$setFirstChunkCache$$inlined$runCatching$lambda$1;
                        }

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                            str.hashCode();
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/alibity/container/ssr/FirstChunkCacheAbility$setFirstChunkCache$$inlined$runCatching$lambda$1$1");
                        }

                        @Override // tb.d1a
                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                                return;
                            }
                            try {
                                if (this.$success) {
                                    vqVar.c(new FinishResult(null, null, 3, null));
                                } else {
                                    vqVar.b(new ErrorResult("500", "内部未知错误", (Map) null, 4, (a07) null));
                                }
                                Result.m1108constructorimpl(xhv.INSTANCE);
                            } catch (Throwable th) {
                                Result.m1108constructorimpl(kotlin.b.a(th));
                            }
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            TLog.loge("WindVane", "FirstChunkCacheAbility", "setFirstChunkCacheAsync");
                            CommonExtKt.o(new AnonymousClass1(firstChunkStorage.write(read), this));
                            Result.m1108constructorimpl(xhv.INSTANCE);
                        } catch (Throwable th) {
                            Result.m1108constructorimpl(kotlin.b.a(th));
                        }
                    }
                });
            } else {
                TLog.loge("WindVane", "FirstChunkCacheAbility", "setFirstChunkCacheSync");
                if (firstChunkStorage.write(read)) {
                    vqVar.c(new FinishResult(null, null, 3, null));
                } else {
                    vqVar.b(new ErrorResult("500", "内部未知错误", (Map) null, 4, (a07) null));
                }
            }
            Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            Result.m1108constructorimpl(kotlin.b.a(th));
        }
    }

    public final void b(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76cbc2ce", new Object[]{this, kdbVar, map, vqVar});
            return;
        }
        String w = MegaUtils.w(map, "url", null);
        if (w == null) {
            vqVar.b(ErrorResult.a.Companion.g("url is empty"));
        } else if (!vpw.commonConfig.U1) {
            vqVar.b(ErrorResult.a.Companion.g("api is disabled"));
        } else {
            WVCore instance = WVCore.getInstance();
            ckf.f(instance, "WVCore.getInstance()");
            if (!instance.isUCSupport()) {
                vqVar.b(ErrorResult.a.Companion.g("uc is not support"));
                return;
            }
            if (wsq.O(w, "_ariver_appid", false, 2, null)) {
                TMS tms = TMS.INSTANCE;
                Uri parse = Uri.parse(w);
                ckf.f(parse, "Uri.parse(url)");
                tms.prefetch(parse, true);
            } else {
                HTMLPrefetchJob.preloadHTMLResource(w, true);
            }
            vqVar.c(new FinishResult(null, null, 3, null));
        }
    }
}
