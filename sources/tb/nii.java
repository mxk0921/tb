package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import tb.k4r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class nii {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final nii INSTANCE = new nii();

    /* renamed from: a  reason: collision with root package name */
    public static rsc f24751a;
    public static ssc b;

    public final void a(Context context, JSONObject jSONObject, String str, String str2, DinamicXEngine dinamicXEngine, j1c j1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("723a4e37", new Object[]{this, context, jSONObject, str, str2, dinamicXEngine, j1cVar});
            return;
        }
        ckf.g(context, "ctx");
        ckf.g(jSONObject, "dxConfig");
        ckf.g(str, "bizId");
        rsc rscVar = f24751a;
        if (rscVar != null) {
            ((k4r.a) rscVar).a(context, jSONObject, str, str2, dinamicXEngine, j1cVar);
        }
    }

    public final ssc b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ssc) ipChange.ipc$dispatch("c31717c9", new Object[]{this});
        }
        return b;
    }

    public final void c(rsc rscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb52c510", new Object[]{this, rscVar});
            return;
        }
        ckf.g(rscVar, "invoker");
        f24751a = rscVar;
    }

    public final void d(ssc sscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b280f4e2", new Object[]{this, sscVar});
            return;
        }
        ckf.g(sscVar, "widgetService");
        b = sscVar;
    }
}
