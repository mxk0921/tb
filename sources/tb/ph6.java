package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ph6 extends l10 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVEGOODCASEGOTODETAIL = 6265984300845690767L;

    static {
        t2o.a(295698964);
    }

    public static /* synthetic */ Object ipc$super(ph6 ph6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXTblivegoodCaseGoToDetailEventHandler");
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

    @Override // tb.l10
    public void c(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, xea xeaVar) {
        String str = "2";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86174a8b", new Object[]{this, dXEvent, objArr, dXRuntimeContext, xeaVar});
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) objArr[0];
            Context h = dXRuntimeContext.h();
            LiveItem liveItem = (LiveItem) fkx.f(jSONObject.toJSONString(), LiveItem.class);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.putAll(hashMap);
            if (!hashMap.containsKey("channel")) {
                hashMap2.put("channel", "goods");
            }
            hashMap2.put("itemlistType", "dx");
            hashMap.put("laiyuan", str);
            hashMap.put("item_position", jSONObject.getString("item_position"));
            LiveItem.Ext ext = liveItem.extendVal;
            if (ext == null || !"secKill".equals(ext.itemBizType)) {
                str = "1";
            }
            hashMap.put("bubbleType", str);
            if (kkr.i().d() != null) {
                kkr.i().d().h(xeaVar == null ? null : xeaVar.q(), (Activity) h, liveItem, "detail", hashMap);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
