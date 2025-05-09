package com.alibaba.android.aura.taobao.adapter.extension.event.openUrl;

import android.content.Intent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.a;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ck;
import tb.fj;
import tb.lo;
import tb.mi;
import tb.msg;
import tb.pt;
import tb.q5l;
import tb.t2o;
import tb.tj;
import tb.yk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class b implements a.AbstractC0062a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lo f2157a;
    public final AURAEventIO b;
    public final AbstractC0063b c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/event/openUrl/DefaultOpenUrlDelegate$1");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            } else {
                b.c(b.this).onFailure("DefaultOpenUrlDelegate", miVar.e());
            }
        }

        @Override // tb.pt
        public void c(yk ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
            } else {
                b.d(b.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface AbstractC0063b {
        void onFailure(String str, String str2);
    }

    static {
        t2o.a(81789077);
        t2o.a(81789075);
    }

    public b(lo loVar, AURAEventIO aURAEventIO, AbstractC0063b bVar) {
        this.b = aURAEventIO;
        this.f2157a = loVar;
        this.c = bVar;
    }

    public static /* synthetic */ AbstractC0063b c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractC0063b) ipChange.ipc$dispatch("2a8d1a1f", new Object[]{bVar});
        }
        return bVar.c;
    }

    public static /* synthetic */ void d(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9a3f999", new Object[]{bVar});
        } else {
            bVar.g();
        }
    }

    @Override // com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.a.AbstractC0062a
    public void a(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb234172", new Object[]{this, str, intent});
        } else {
            h(intent);
        }
    }

    @Override // com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.a.AbstractC0062a
    public void b(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70969eb9", new Object[]{this, str, intent});
        } else {
            ck.g().a("DefaultOpenUrlDelegate", "onFailure", "Activity onFailure");
        }
    }

    public final JSONObject e(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("de6f1bf0", new Object[]{this, intent});
        }
        String stringExtra = intent.getStringExtra("data");
        if (stringExtra != null) {
            return tj.a(stringExtra);
        }
        ck.g().a("DefaultOpenUrlDelegate", "handleNativeResult", "从H5返回的数据为null");
        return null;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a35a5", new Object[]{this});
            return;
        }
        UMFRuleIO c = q5l.c(this.b);
        if (c != null) {
            this.f2157a.c().c("aura.workflow.adjustRules", c, new a());
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b62cfa3", new Object[]{this});
        } else {
            this.f2157a.c().c("aura.workflow.adjust", msg.a(this.b), null);
        }
    }

    public final void h(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c1cc4e", new Object[]{this, intent});
            return;
        }
        JSONObject e = e(intent);
        if (e == null) {
            return;
        }
        if (!e.isEmpty() || !fj.d("h5EmptyNotAdjust", true)) {
            JSONObject c = this.b.getEventModel().c();
            if (c == null) {
                ck.g().a("DefaultOpenUrlDelegate", "handleNativeResult", "从Native返回的eventFields数据为null");
                return;
            }
            JSONObject jSONObject = c.getJSONObject("params");
            if (jSONObject == null) {
                ck.g().a("DefaultOpenUrlDelegate", "handleNativeResult", "从Native返回的params数据为null");
                c.put("params", (Object) e);
            } else {
                jSONObject.putAll(e);
            }
            f();
        }
    }
}
