package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gg6 extends l10 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TAOLIVEROOMCOMMONHANDLER = -1187530548089360752L;

    static {
        t2o.a(295698938);
    }

    public static /* synthetic */ Object ipc$super(gg6 gg6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXTaoLiveRoomCommonHandlerEventHandler");
    }

    public final HashMap<String, String> d(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f383ba85", new Object[]{this, str});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            for (String str2 : str.split(",")) {
                if (str2.contains("=")) {
                    String[] split2 = str2.split("=");
                    hashMap.put(split2[0], split2[1]);
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
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

    public final void e(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b86f9a37", new Object[]{this, objArr});
        } else if (objArr != null && objArr.length > 1) {
            Object obj = objArr[1];
            if ((obj instanceof JSONObject) && "productRecommend".equals(((JSONObject) obj).getString("bizType"))) {
                sjr.g().d("com.taobao.taolive.room.important_event_goods_recommend_click");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // tb.l10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(com.taobao.android.dinamicx.expression.event.DXEvent r11, java.lang.Object[] r12, com.taobao.android.dinamicx.DXRuntimeContext r13, tb.xea r14) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gg6.c(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext, tb.xea):void");
    }
}
