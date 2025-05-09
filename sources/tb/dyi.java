package tb;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class dyi implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JSONObject f18155a;
    public final /* synthetic */ fyi b;

    public dyi(fyi fyiVar, JSONObject jSONObject) {
        this.f18155a = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            xg4.m("ModuleConfig", xg4.KEY_DATA, this.f18155a.toString());
        }
    }
}
