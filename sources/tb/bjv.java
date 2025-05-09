package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.orange.OrangeConfig;
import java.io.Serializable;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bjv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean d = false;

    /* renamed from: a  reason: collision with root package name */
    public Boolean f16436a;
    public Boolean b;
    public Boolean c;
    public boolean subscribed = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Runnable val$runnable;

        public a(Runnable runnable) {
            this.val$runnable = runnable;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/adapter/UpdateAdapter$1");
        }

        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            this.val$runnable.run();
            return null;
        }
    }

    static {
        t2o.a(950009859);
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e81159f3", new Object[]{this})).booleanValue();
        }
        if (this.f16436a == null) {
            try {
                Class.forName(OrangeConfig.class.getName());
                this.f16436a = Boolean.TRUE;
            } catch (Throwable unused) {
                this.f16436a = Boolean.FALSE;
            }
        }
        return this.f16436a.booleanValue();
    }

    public void commitSuccess(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3416f1", new Object[]{this, str, str2, str3});
        } else if (hasAppMonitor()) {
            AppMonitor.Alarm.commitSuccess(str, str2, str3);
        }
    }

    public void executeThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9abe64", new Object[]{this, runnable});
        } else {
            new a(runnable).execute(new Void[0]);
        }
    }

    public String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        if (a()) {
            return OrangeConfig.getInstance().getConfig(str, str2, str3);
        }
        return str3;
    }

    public boolean hasAccs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c098057", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean hasAppMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cb10d3e", new Object[]{this})).booleanValue();
        }
        if (this.c == null) {
            try {
                Class.forName(AppMonitor.class.getName());
                this.c = Boolean.TRUE;
            } catch (Throwable unused) {
                this.c = Boolean.FALSE;
            }
        }
        return this.c.booleanValue();
    }

    public boolean hasMtop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2316b0d", new Object[]{this})).booleanValue();
        }
        if (this.b == null) {
            try {
                Class.forName(Mtop.class.getName());
                this.b = Boolean.TRUE;
            } catch (Throwable unused) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue();
    }

    public JSONObject invokePullApi(Serializable serializable, Context context, String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("81f439ba", new Object[]{this, serializable, context, str, new Boolean(z)});
        }
        if (!hasMtop()) {
            Log.e("UpdateAdapter", "mtop is not found");
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            str = "600000";
        }
        if (z) {
            str2 = Mtop.Id.OPEN;
        } else {
            str2 = Mtop.Id.INNER;
        }
        MtopBuilder build = Mtop.instance(str2, context).build(serializable, str);
        build.reqMethod(MethodEnum.GET);
        MtopResponse syncRequest = build.syncRequest();
        if (syncRequest.isApiSuccess()) {
            try {
                String str3 = new String(syncRequest.getBytedata());
                if (!TextUtils.isEmpty(str3)) {
                    JSONObject parseObject = JSON.parseObject(str3);
                    if (parseObject.containsKey("data")) {
                        return parseObject.getJSONObject("data");
                    }
                }
            } catch (Exception e) {
                Log.e("UpdateAdapter", "get mtop data exception", e);
            }
        } else if (TextUtils.isEmpty(syncRequest.getRetCode()) || TextUtils.isEmpty(syncRequest.getRetMsg()) || !syncRequest.getRetCode().equals("USE_ALTER_SYSTEM_DATA") || !syncRequest.getRetMsg().equals("走变更sdk")) {
            Log.e("UpdateAdapter", "invoke mtop api error, " + syncRequest.getRetMsg());
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("degrade", (Object) Boolean.TRUE);
            return jSONObject;
        }
        return null;
    }

    public void onData(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3948f44", new Object[]{this, str, str2});
        } else if (kjv.inited) {
            kjv.getInstance().onUpdate(str, null, true, str2, new String[0]);
        }
    }

    public synchronized void registerPushApi(Context context, AccsAbstractDataListener accsAbstractDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b388a737", new Object[]{this, context, accsAbstractDataListener});
            return;
        }
        if (hasAccs()) {
            if (!d) {
                d = true;
                ACCSManager.registerDataListener(context, o70.SERVICE_ID, accsAbstractDataListener);
            }
        }
    }
}
