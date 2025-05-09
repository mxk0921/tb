package tb;

import android.content.Context;
import com.alibaba.android.icart.core.view.ViewManager;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class qa3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final qa3 INSTANCE = new qa3();

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s f26617a;
        public final /* synthetic */ JSONObject b;

        public a(s sVar, JSONObject jSONObject) {
            this.f26617a = sVar;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                qa3.a(qa3.INSTANCE, this.f26617a, this.b);
            }
        }
    }

    static {
        t2o.a(479199509);
    }

    public static final /* synthetic */ void a(qa3 qa3Var, s sVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c865345", new Object[]{qa3Var, sVar, jSONObject});
        } else {
            qa3Var.b(sVar, jSONObject);
        }
    }

    @JvmStatic
    public static final void c(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ed3a1c0", new Object[]{context, jSONObject});
        } else if (context != null && jSONObject != null && !INSTANCE.f()) {
            s sVar = new s(new DXEngineConfig.b(c9x.CART_BIZ_NAME).F());
            hav.d("CartDXPreDownloader", "downloadTemplates without presenter");
            d(sVar, jSONObject);
        }
    }

    @JvmStatic
    public static final void d(s sVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c657f6f0", new Object[]{sVar, jSONObject});
        } else {
            pav.m(true, new a(sVar, jSONObject));
        }
    }

    @JvmStatic
    public static final void e(kmb kmbVar, JSONObject jSONObject) {
        ViewManager Z;
        ViewEngine t;
        jo7 Q;
        s b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb0ba00f", new Object[]{kmbVar, jSONObject});
        } else if (jSONObject != null && !INSTANCE.f() && kmbVar != null && (Z = kmbVar.e()) != null && (t = Z.t()) != null && (Q = t.Q()) != null && (b = Q.b()) != null) {
            hav.d("CartDXPreDownloader", "downloadTemplates with presenter");
            d(b, jSONObject);
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c5abc32", new Object[]{this})).booleanValue();
        }
        return true ^ vav.a(c9x.CART_BIZ_NAME, "preDownloadDX", true);
    }

    public final void b(s sVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        DXTemplateItem a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb2689b", new Object[]{this, sVar, jSONObject});
            return;
        }
        try {
            String g = vav.g(c9x.CART_BIZ_NAME, "priorityDownloadDXContainerNameList", "icart_mix_item,icart_mix_group,icart_mix_header,icart_submit,icart_invalid_item,icart_promotion,icart_search_header,icart_tab");
            JSONObject jSONObject3 = jSONObject.getJSONObject("data");
            if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject("container")) != null && (jSONArray = jSONObject2.getJSONArray("data")) != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if ((next instanceof JSONObject) && (a2 = eb3.a((JSONObject) next)) != null) {
                        String e = a2.e();
                        if (g != null) {
                            ckf.f(e, "name");
                            if (wsq.O(g, e, false, 2, null)) {
                                arrayList.add(a2);
                            }
                        }
                        arrayList2.add(a2);
                    }
                }
                sVar.h(arrayList);
                sVar.h(arrayList2);
            }
        } catch (Throwable th) {
            xh8 c = xh8.a("Ultron").c("CartDXPreDownloader");
            String message = th.getMessage();
            if (message == null) {
                message = "出错了";
            }
            f9v.q(c.message(message));
        }
    }
}
