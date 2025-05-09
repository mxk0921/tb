package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.module.MUSModule;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class uo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f29523a;
    public JSONObject b;

    static {
        t2o.a(81789244);
    }

    public uo(String str) {
        this.f29523a = str;
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("47876bef", new Object[]{this});
        }
        return null;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("559b43ff", new Object[]{this});
        }
        return this.b;
    }

    public Map<String, Object> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("426496e4", new Object[]{this});
        }
        return null;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.f29523a;
    }

    public Map<String, Class<? extends MUSModule>> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("281a8d8c", new Object[]{this});
        }
        return null;
    }

    public Map<String, Class<? extends WeexPlatformView>> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5d737800", new Object[]{this});
        }
        return null;
    }

    public void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e30bfa65", new Object[]{this, jSONObject});
        } else {
            this.b = jSONObject;
        }
    }
}
