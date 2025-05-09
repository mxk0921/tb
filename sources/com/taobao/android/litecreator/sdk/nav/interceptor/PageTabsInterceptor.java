package com.taobao.android.litecreator.sdk.nav.interceptor;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.nav.LCNavInterceptor;
import com.taobao.taopai.material.bean.MaterialDetail;
import org.json.JSONObject;
import tb.ckf;
import tb.d1a;
import tb.kdp;
import tb.lvc;
import tb.t2o;
import tb.ypc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class PageTabsInterceptor extends LCNavInterceptor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements ypc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ d1a b;

        public a(d1a d1aVar) {
            this.b = d1aVar;
        }

        @Override // tb.ypc.a
        public void a(MaterialDetail materialDetail, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62ff7e2c", new Object[]{this, materialDetail, str, str2});
                return;
            }
            lvc e = PageTabsInterceptor.this.e();
            if (e != null) {
                lvc.a.b(e, "short_chain_failed", "material_error", PageTabsInterceptor.this.f(), null, PageTabsInterceptor.this.f(), null, 40, null);
            }
        }

        @Override // tb.ypc.a
        public void b(MaterialDetail materialDetail) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8060a9d", new Object[]{this, materialDetail});
            } else {
                this.b.invoke();
            }
        }
    }

    static {
        t2o.a(511705557);
    }

    public static /* synthetic */ Object ipc$super(PageTabsInterceptor pageTabsInterceptor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/nav/interceptor/PageTabsInterceptor");
    }

    @Override // com.taobao.android.litecreator.sdk.nav.LCNavInterceptor
    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1bf6a92", new Object[]{this});
        }
        return "litecreator/tabs";
    }

    @Override // com.taobao.android.litecreator.sdk.nav.LCNavInterceptor
    public void d(JSONObject jSONObject, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c74a5aa9", new Object[]{this, jSONObject, context});
            return;
        }
        ckf.g(jSONObject, "publishConfig");
        ckf.g(context, "context");
        PageTabsInterceptor$doNav$doNavAction$1 pageTabsInterceptor$doNav$doNavAction$1 = new PageTabsInterceptor$doNav$doNavAction$1(this, jSONObject, context);
        if (jSONObject.has("fun_id")) {
            ((ypc) kdp.a(ypc.class, new Object[0])).check(context, jSONObject.optInt("fun_id"), new a(pageTabsInterceptor$doNav$doNavAction$1));
        } else {
            pageTabsInterceptor$doNav$doNavAction$1.invoke();
        }
    }
}
