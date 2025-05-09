package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e26 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_LOPENCHANNEL = -4425606707209420349L;

    static {
        t2o.a(310378651);
    }

    public static /* synthetic */ Object ipc$super(e26 e26Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/dinamic/event/DXLOpenChannelEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length > 1 && dXRuntimeContext.h() != null && (jSONObject = (JSONObject) objArr[0]) != null) {
            if (jSONObject.get("channelId") != null) {
                JSONObject jSONObject3 = (JSONObject) objArr[1];
                if (!(jSONObject3 == null || (jSONObject2 = jSONObject3.getJSONObject("clickMaidian")) == null || jSONObject2.get("params") == null)) {
                    String string = jSONObject3.getString("trackInfo");
                    if (!TextUtils.isEmpty(string)) {
                        String string2 = jSONObject2.getString("name");
                        p9m.b(string2, jSONObject2.getString("params") + ",trackInfo=" + string);
                    } else {
                        p9m.b(jSONObject2.getString("name"), jSONObject2.getString("params"));
                    }
                }
                a2h.a(dXRuntimeContext.h(), "https://h5.m.taobao.com/live/channel.html?channelId=" + jSONObject.getIntValue("channelId") + "&title=" + jSONObject.getString("channelTitle") + "&feedId=" + jSONObject.getString("feedId") + "&itemId=" + jSONObject.getString("itemId"));
                return;
            }
            p9m.b(mbu.CLICK_CHANNEL, "all=true,spm-cnt=a2141.8001240");
            qyg.c().h("com.taobao.taolive.homepage.open.sub.channel.list");
        }
    }
}
