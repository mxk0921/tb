package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class on1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f25500a = new ArrayList();
    public boolean b = false;

    static {
        t2o.a(468713875);
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1707d191", new Object[]{this})).booleanValue();
        }
        return akt.p2("ShortVideo.enableInterceptBack", true);
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6b2921b", new Object[]{this, str})).booleanValue();
        }
        if (!b() || !this.b || !((ArrayList) this.f25500a).contains(str)) {
            return false;
        }
        return true;
    }

    public void d(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8e5f4b", new Object[]{this, fluidContext, str});
        } else if (c(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("scene", str);
            ((IMessageService) fluidContext.getService(IMessageService.class)).sendMessage(new vrp("VSMSG_backClick", "-1", hashMap));
            this.b = false;
            ir9.b("BackInterceptHelper", "拦截后，发送消息给互动层 scene=" + str);
        }
    }

    public void a(vrp vrpVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456886b1", new Object[]{this, vrpVar});
        } else if (b() && vrpVar != null && vrpVar.h != null) {
            ((ArrayList) this.f25500a).clear();
            JSONArray jSONArray = (JSONArray) vrpVar.h.get("scenes");
            if (jSONArray != null && jSONArray.size() > 0) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    String I = nwv.I(jSONArray.get(i), "");
                    if (!TextUtils.isEmpty(I)) {
                        ((ArrayList) this.f25500a).add(I);
                    }
                }
            }
            ir9.b("BackInterceptHelper", "接收来自业务层注册的拦截消息 scenes=" + this.f25500a);
            if (((ArrayList) this.f25500a).size() > 0) {
                z = true;
            }
            this.b = z;
        }
    }
}
