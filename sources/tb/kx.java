package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.mtop.a;
import com.taobao.homepage.pop.protocol.model.pop.IPopConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.PopConst;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bbd f22978a;

    public kx(bbd bbdVar) {
        this.f22978a = bbdVar;
    }

    public void a(IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("985a119e", new Object[]{this, iPopData});
        } else if (iPopData == null) {
            vfm.f("AbsPopListener ", "fatigueReport popData == null");
        } else {
            IPopConfig popConfig = iPopData.getPopConfig();
            if (popConfig == null) {
                vfm.f("AbsPopListener ", "fatigueReport popConfig == null");
            } else if ("active".equals(popConfig.getFatigueReportStyle())) {
                new a().d(iPopData);
            }
        }
    }

    public boolean b(String str) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c171beb5", new Object[]{this, str})).booleanValue();
        }
        if (this.f22978a == null || TextUtils.isEmpty(str) || (a2 = this.f22978a.a(str)) < 0) {
            return false;
        }
        return this.f22978a.h(a2);
    }

    public void c(int i, String str, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("665663ba", new Object[]{this, new Integer(i), str, iPopData});
        } else if (this.f22978a != null) {
            String businessID = iPopData.getBusinessID();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(businessID, (Object) yhm.a(i, str, iPopData));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(PopConst.POP_BIZ_PARAMS_KEY, (Object) JSON.toJSONString(jSONObject));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("bizParam", (Object) jSONObject2);
            this.f22978a.b(iPopData.getPopConfig().getRequestType(), jSONObject3);
            bgm.b("PopViewReqSendSuccess", iPopData);
            vfm.f("AbsPopListener ", "send req to server. BusinessId:" + businessID);
        }
    }

    public void d(IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a3a460", new Object[]{this, iPopData});
        } else if (this.f22978a != null && iPopData != null) {
            String scrollToSection = iPopData.getPopConfig().getScrollToSection();
            int a2 = !TextUtils.isEmpty(scrollToSection) ? this.f22978a.a(scrollToSection) : -1;
            if (a2 < 0) {
                vfm.f("AbsPopListener ", "scroll to position invalid, return");
            } else {
                this.f22978a.scrollToPositionWithOffset(a2, 0);
            }
        }
    }
}
