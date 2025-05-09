package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.vm0;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.component.userMonitor")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class po0 extends ms {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<String> f;
    public List<String> g;
    public List<String> h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURAInputData f26208a;

        public a(AURAInputData aURAInputData) {
            this.f26208a = aURAInputData;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                po0.P0(po0.this, this.f26208a);
            } catch (Throwable th) {
                rbb g = ck.g();
                g.e("AliBuyUserMonitorAspectLifecycleExtension exception :" + th.getMessage());
            }
        }
    }

    static {
        t2o.a(301989988);
    }

    public static /* synthetic */ void P0(po0 po0Var, AURAInputData aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d44511c", new Object[]{po0Var, aURAInputData});
        } else {
            po0Var.Q0(aURAInputData);
        }
    }

    public static /* synthetic */ Object ipc$super(po0 po0Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        } else if (hashCode == 1111077198) {
            super.beforeServiceExecute((AURAInputData) objArr[0], (cg) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/buy/extension/monitor/AliBuyUserMonitorAspectLifecycleExtension");
        }
    }

    public final void Q0(AURAInputData aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebd2953", new Object[]{this, aURAInputData});
            return;
        }
        Serializable data = aURAInputData.getData();
        if (data instanceof AURAEventIO) {
            AURAEventIO aURAEventIO = (AURAEventIO) data;
            AURARenderComponent j = aURAEventIO.getEventModel().j();
            String eventType = aURAEventIO.getEventType();
            JSONObject c = aURAEventIO.getEventModel().c();
            if (c == null) {
                ck.g().e("AliBuyUserMonitorAspectLifecycleExtension", " eventFields is null");
            } else if (TextUtils.equals(eventType, "userTrack")) {
                S0(c);
            } else {
                R0(eventType, j);
            }
        }
    }

    public final void R0(String str, AURARenderComponent aURARenderComponent) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be04dad", new Object[]{this, str, aURARenderComponent});
            return;
        }
        List<String> list = this.f;
        if (list == null || !list.contains(str)) {
            h15 tag = vm0.a.a("buyEventMonitor").tag(str);
            if (aURARenderComponent == null) {
                str2 = "";
            } else {
                str2 = aURARenderComponent.key;
            }
            vm0.d(tag.message(str2).success(true).sampling(0.01f));
            return;
        }
        rbb g = ck.g();
        g.e("AliBuyAlarmMonitorExtension", str + " 在黑名单");
    }

    public final void S0(JSONObject jSONObject) {
        List<String> list;
        List<String> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb5255ff", new Object[]{this, jSONObject});
            return;
        }
        int intValue = jSONObject.getIntValue("eventId");
        if (intValue == 0) {
            ck.g().e("AliBuyUserMonitorAspectLifecycleExtension", " eventId is null");
            return;
        }
        String string = jSONObject.getString("arg1");
        String string2 = jSONObject.getString("arg2");
        if (intValue == 2201 && (list2 = this.g) != null && list2.contains(string)) {
            vm0.d(vm0.a.a(string).tag("曝光").message(string2).sampling(0.001f));
        } else if (intValue == 2101 && (list = this.h) != null && list.contains(string)) {
            vm0.d(vm0.a.a(string).tag("点击").message(string2).sampling(0.001f));
        }
    }

    @Override // tb.ms, tb.xab
    public void beforeServiceExecute(AURAInputData aURAInputData, cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4239b14e", new Object[]{this, aURAInputData, cgVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, cgVar);
        if (ri.CODE.equals(cgVar.b())) {
            dn.h(new a(aURAInputData));
        }
    }

    @Override // tb.ms, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        this.f = qo0.b();
        this.g = qo0.c();
        this.h = qo0.a();
    }
}
