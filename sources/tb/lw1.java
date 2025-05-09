package tb;

import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class lw1 implements chc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject mActionObject;
    public otf mJarvisKit;

    static {
        t2o.a(815792281);
        t2o.a(995098633);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void triggerSubActions$lambda$0(chc chcVar, lw1 lw1Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96372173", new Object[]{chcVar, lw1Var, jSONObject});
            return;
        }
        ckf.g(chcVar, "$processor");
        ckf.g(lw1Var, "this$0");
        chcVar.processAction(lw1Var.getMJarvisKit(), jSONObject, "");
    }

    public final JSONObject getMActionObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("13107013", new Object[]{this});
        }
        JSONObject jSONObject = this.mActionObject;
        if (jSONObject != null) {
            return jSONObject;
        }
        ckf.y("mActionObject");
        throw null;
    }

    public final otf getMJarvisKit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (otf) ipChange.ipc$dispatch("35fcc4d8", new Object[]{this});
        }
        otf otfVar = this.mJarvisKit;
        if (otfVar != null) {
            return otfVar;
        }
        ckf.y("mJarvisKit");
        throw null;
    }

    @Override // tb.chc
    public void processAction(otf otfVar, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b923ff", new Object[]{this, otfVar, jSONObject, str});
            return;
        }
        ckf.g(otfVar, "jarvis");
        ckf.g(jSONObject, "actionResult");
        setMJarvisKit(otfVar);
        setMActionObject(jSONObject);
    }

    public final void setMActionObject(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd56669", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "<set-?>");
        this.mActionObject = jSONObject;
    }

    public final void setMJarvisKit(otf otfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a0a697a", new Object[]{this, otfVar});
            return;
        }
        ckf.g(otfVar, "<set-?>");
        this.mJarvisKit = otfVar;
    }

    public final void triggerSubActions() {
        final chc e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b523487c", new Object[]{this});
            return;
        }
        JSONArray c = h19.c(getMActionObject(), "sub_actions");
        if (!(c == null || c.isEmpty())) {
            int size = c.size();
            for (int i = 0; i < size; i++) {
                final JSONObject jSONObject = c.getJSONObject(i);
                String string = jSONObject.getString("action");
                if (!TextUtils.isEmpty(string) && (e = ntf.e(string, getMJarvisKit())) != null) {
                    if (ckf.b(Looper.myLooper(), Looper.getMainLooper())) {
                        Coordinator.execute(new Runnable() { // from class: tb.wyy
                            @Override // java.lang.Runnable
                            public final void run() {
                                lw1.triggerSubActions$lambda$0(chc.this, this, jSONObject);
                            }
                        });
                    } else {
                        e.processAction(getMJarvisKit(), jSONObject, "");
                    }
                }
            }
        }
    }
}
