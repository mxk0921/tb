package com.taobao.search.jarvis;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.search.common.SearchSdk;
import tb.chc;
import tb.ckf;
import tb.g6p;
import tb.h19;
import tb.ntf;
import tb.otf;
import tb.sen;
import tb.t2o;
import tb.uv;
import tb.xpo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SearchJarvisCallback extends uv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ chc c;
        public final /* synthetic */ SearchJarvisCallback d;
        public final /* synthetic */ JSONObject e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(chc chcVar, SearchJarvisCallback searchJarvisCallback, JSONObject jSONObject, String str) {
            super("JarvisActionProcessor");
            this.c = chcVar;
            this.d = searchJarvisCallback;
            this.e = jSONObject;
            this.f = str;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/jarvis/SearchJarvisCallback$handleResult$1");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                this.c.processAction(SearchJarvisCallback.access$getMJarvisWidget$p(this.d), this.e, this.f);
            }
        }
    }

    static {
        t2o.a(815792277);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchJarvisCallback(otf otfVar) {
        super(otfVar);
        ckf.g(otfVar, "widget");
    }

    public static final /* synthetic */ otf access$getMJarvisWidget$p(SearchJarvisCallback searchJarvisCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (otf) ipChange.ipc$dispatch("cc44cb1d", new Object[]{searchJarvisCallback});
        }
        return searchJarvisCallback.mJarvisWidget;
    }

    public static /* synthetic */ Object ipc$super(SearchJarvisCallback searchJarvisCallback, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/jarvis/SearchJarvisCallback");
    }

    @Override // tb.uv
    public void handleResult(JSONObject jSONObject) {
        chc e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("246c0a04", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "result");
        JSONArray c = h19.c(jSONObject, "results");
        if (SearchSdk.Companion.h()) {
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("result", g6p.d(jSONObject.toJSONString()));
            sen.f("SearchJarvisCallback", arrayMap);
        }
        if (!(c == null || c.isEmpty())) {
            int size = c.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = c.getJSONObject(i);
                String string = jSONObject2.getString("action");
                String string2 = jSONObject2.getString(com.taobao.android.weex_uikit.widget.input.a.EXTRA_ACTION_ID);
                if (!TextUtils.isEmpty(string) && (e = ntf.e(string, this.mJarvisWidget)) != null) {
                    Coordinator.execute(new a(e, this, jSONObject2, string2));
                }
            }
        }
    }
}
