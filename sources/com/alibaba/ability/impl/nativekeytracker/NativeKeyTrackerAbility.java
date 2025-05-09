package com.alibaba.ability.impl.nativekeytracker;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.Window;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.cu;
import tb.gxv;
import tb.jpu;
import tb.kdb;
import tb.kqu;
import tb.t2o;
import tb.u3g;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class NativeKeyTrackerAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_SUBSCRIBE = "subscribe";
    public static final String API_UNSUBSCRIBE = "unsubscribe";
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, u3g> f1987a = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(120586243);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(120586242);
    }

    public static /* synthetic */ Object ipc$super(NativeKeyTrackerAbility nativeKeyTrackerAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/nativekeytracker/NativeKeyTrackerAbility");
    }

    @Override // tb.cu
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1987a;
            for (u3g u3gVar : linkedHashMap.values()) {
                u3gVar.c();
            }
            linkedHashMap.clear();
        } catch (Throwable unused) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements u3g.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vq f1988a;

        public b(vq vqVar) {
            this.f1988a = vqVar;
        }

        @Override // tb.u3g.d
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4a534d24", new Object[]{this, keyEvent})).booleanValue();
            }
            ckf.g(keyEvent, "e");
            if (keyEvent.getKeyCode() != 4) {
                return false;
            }
            if (keyEvent.getAction() != 1) {
                return true;
            }
            this.f1988a.a(new FinishResult(new JSONObject(kotlin.collections.a.k(jpu.a("keyCode", "back"))), "onKeyUp"));
            return true;
        }
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
        Context context = kdbVar.l().getContext();
        if (!(context instanceof Activity)) {
            context = gxv.p(kdbVar.k());
            if (!(context instanceof Activity)) {
                return new ErrorResult("500", "env.getContext is null or invalid", (Map) null, 4, (a07) null);
            }
        }
        String w = MegaUtils.w(map, "keyCode", "");
        int hashCode = str.hashCode();
        if (hashCode != 514841930) {
            if (hashCode == 583281361 && str.equals("unsubscribe")) {
                Map<String, u3g> map2 = this.f1987a;
                if (map2 != null) {
                    u3g u3gVar = (u3g) kqu.d(map2).remove(w);
                    if (u3gVar != null) {
                        u3gVar.c();
                        return new FinishResult(null, null, 3, null);
                    }
                    return new ErrorResult("400", "keyCode " + w + " is invalid or already unsubscribe", (Map) null, 4, (a07) null);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            }
        } else if (str.equals("subscribe")) {
            if (((u3g) ((LinkedHashMap) this.f1987a).get(w)) != null) {
                return new ErrorResult("500", "keyCode " + w + " is already subscribe", (Map) null, 4, (a07) null);
            } else if (w != null && w.hashCode() == 3015911 && w.equals("back")) {
                Window window = ((Activity) context).getWindow();
                ckf.f(window, "act.window");
                u3g u3gVar2 = new u3g(window, new b(vqVar));
                u3gVar2.b();
                this.f1987a.put("back", u3gVar2);
                return null;
            } else {
                return new ErrorResult("400", "keyCode " + w + " is invalid", (Map) null, 4, (a07) null);
            }
        }
        ErrorResult.a.C0055a aVar = ErrorResult.a.Companion;
        return aVar.a("api " + str + " not found");
    }
}
