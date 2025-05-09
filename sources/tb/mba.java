package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.orange.ConfigCenter;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mba {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_NAME = "mtbSettings";

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23910a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            String str = "false";
            jSONObject.put("value", (Object) (mba.a(mba.this) ? "true" : str));
            jSONObject.put("tbGlobalMuteSetting", (Object) "1");
            String jSONString = jSONObject.toJSONString();
            if (mba.a(mba.this)) {
                str = "true";
            }
            String concat = "value=".concat(str);
            TLog.loge(mba.BIZ_NAME, "静音实验：" + jSONString + " muteHitAB=" + mba.a(mba.this) + " evoValue=1");
            TBS.Ext.commitEvent(s32.MODULE_NAME, 19997, "tbGlobalMuteSetting", null, null, concat, "tbGlobalMuteSetting=1");
            AppMonitor.Counter.commit(u3j.b, "tbGlobalMuteSetting", jSONString, 1.0d);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final mba f23912a = new mba(null);

        public static /* synthetic */ mba a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mba) ipChange.ipc$dispatch("70a10df8", new Object[0]);
            }
            return f23912a;
        }
    }

    public /* synthetic */ mba(a aVar) {
        this();
    }

    public static /* synthetic */ boolean a(mba mbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88cc39fc", new Object[]{mbaVar})).booleanValue();
        }
        return mbaVar.f23910a;
    }

    public static mba b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mba) ipChange.ipc$dispatch("fdb91091", new Object[0]);
        }
        return b.a();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25645e5c", new Object[]{this})).booleanValue();
        }
        return this.f23910a;
    }

    public mba() {
        this.f23910a = TextUtils.equals("true", ConfigCenter.getInstance().getConfig("mpm_data_switch", "mtbMuteEvoEnable", "true"));
        Coordinator.execute(new a());
    }
}
