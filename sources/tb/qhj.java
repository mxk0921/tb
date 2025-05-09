package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qhj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public transient WeakReference<phj> f26757a;

    static {
        t2o.a(729809912);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        WeakReference<phj> weakReference = this.f26757a;
        if (weakReference != null) {
            phj phjVar = weakReference.get();
            if (phjVar != null) {
                phjVar.n();
            }
            this.f26757a = null;
        }
    }

    public void c(DinamicXEngine dinamicXEngine, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c429a4c", new Object[]{this, dinamicXEngine, str});
            return;
        }
        a();
        this.f26757a = new WeakReference<>(new phj(this, dinamicXEngine, str));
    }

    public void d(Context context, View view, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, JSONObject jSONObject) {
        phj phjVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5611fdf", new Object[]{this, context, view, onClickListener, onClickListener2, jSONObject});
            return;
        }
        WeakReference<phj> weakReference = this.f26757a;
        if (weakReference != null && (phjVar = weakReference.get()) != null) {
            phjVar.r(context, view, onClickListener, onClickListener2, jSONObject);
        }
    }

    public void e(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b9f3e8", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject != null && jSONObject2 != null && jSONObject2.getJSONObject("clickParam") != null) {
            r5a.e(jSONObject, jSONObject2, null);
        }
    }

    public void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349c965", new Object[]{this, jSONObject});
        } else if (jSONObject != null && jSONObject.getJSONObject(i2b.TRACK_EXPOSURE_PARAM) != null) {
            r5a.m(jSONObject, null);
        }
    }
}
