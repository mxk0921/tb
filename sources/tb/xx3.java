package tb;

import android.os.Process;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.Iterator;
import tb.yjv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xx3 extends vjv implements yjv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f31654a = false;

    static {
        t2o.a(954204178);
        t2o.a(950009883);
    }

    public xx3() {
        kjv.getInstance().registerListener("cmd", this);
    }

    public static /* synthetic */ Object ipc$super(xx3 xx3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/cmd/CmdAction");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d30fe0", new Object[]{this});
        } else if (this.f31654a) {
            this.f31654a = false;
            Process.killProcess(Process.myPid());
        }
    }

    @Override // tb.vjv
    public boolean doUpdate(JSONObject jSONObject, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14471eed", new Object[]{this, jSONObject, new Boolean(z), str})).booleanValue();
        }
        return false;
    }

    @Override // tb.vjv
    public void onBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[]{this});
        } else {
            a();
        }
    }

    @Override // tb.vjv
    public void onExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
        } else {
            a();
        }
    }

    @Override // tb.yjv
    public void patchProcessListener(yjv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d04f53", new Object[]{this, aVar});
        }
    }

    @Override // tb.yjv
    public void onUpdate(boolean z, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ba63f5", new Object[]{this, new Boolean(z), jSONObject, str});
            return;
        }
        kjv.getInstance().invalidUpdateInfo("cmd");
        try {
            Iterator<Object> it = jSONObject.getJSONArray("cmds").iterator();
            while (it.hasNext()) {
                if (((JSONObject) it.next()).containsValue(DMComponent.RESET)) {
                    this.f31654a = true;
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
