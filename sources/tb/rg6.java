package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rg6 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLGTAP = 5360605235400031797L;

    static {
        t2o.a(806355420);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8626387", new Object[]{str, str2, str3});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            b(str, str2, xxv.a(str3));
        }
    }

    public static void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67442e8", new Object[]{str, str2, map});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder(str, "Button-" + str2);
            if (map != null && !map.isEmpty()) {
                uTHitBuilders$UTControlHitBuilder.setProperties(map);
            }
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
        }
    }

    public static /* synthetic */ Object ipc$super(rg6 rg6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/event/DXTblGTapEventHandler");
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
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length > 0) {
            String str = (String) objArr[0];
            str.hashCode();
            JSONObject jSONObject = null;
            String str2 = "Page_TaobaoLive";
            String str3 = "";
            if (str.equals(rg0.JUMP_URL)) {
                String str4 = objArr.length >= 2 ? (String) objArr[1] : str3;
                if (objArr.length >= 3) {
                    String str5 = (String) objArr[2];
                    if (!TextUtils.isEmpty(str5)) {
                        str2 = str5;
                    }
                }
                if (objArr.length >= 4) {
                    Object obj2 = objArr[3];
                    if (obj2 instanceof JSONObject) {
                        jSONObject = (JSONObject) obj2;
                    }
                }
                String str6 = objArr.length >= 5 ? (String) objArr[4] : str3;
                if (objArr.length >= 6 && (obj = objArr[5]) != null && (obj instanceof String)) {
                    str3 = (String) obj;
                }
                if (jSONObject != null) {
                    String string = jSONObject.getString("params");
                    if (!arq.a(str3)) {
                        if (!arq.a(string)) {
                            string = string + ",singleLiveTabSessionId=" + str3;
                        } else {
                            string = "singleLiveTabSessionId=" + str3;
                        }
                    }
                    if (TextUtils.isEmpty(str6)) {
                        a(str2, jSONObject.getString("name"), string);
                    } else {
                        a(str2, jSONObject.getString("name"), string + ",trackInfo=" + str6);
                    }
                }
                if (!arq.a(str4)) {
                    if (!arq.a(str6)) {
                        if (str6.equals("liveFromTopic")) {
                            qyg.c().d("com.taobao.taolive.bottom.half.frame.card.click");
                        } else {
                            String encode = Uri.encode(str6);
                            if (!str4.contains("trackInfo")) {
                                if (str4.contains("?")) {
                                    str4 = str4 + "&trackInfo=" + encode;
                                } else {
                                    str4 = str4 + "?trackInfo=" + encode;
                                }
                            }
                        }
                    }
                    if (!arq.a(str3) && !str4.contains("singleLiveTabSessionId")) {
                        str4 = str4 + "&singleLiveTabSessionId=" + str3;
                    }
                    a2h.a(dXRuntimeContext.h(), str4);
                }
            } else if (str.equals("event")) {
                String str7 = objArr.length >= 2 ? (String) objArr[1] : str3;
                Object obj3 = objArr.length >= 3 ? objArr[2] : null;
                if (objArr.length >= 4) {
                    String str8 = (String) objArr[3];
                    if (!TextUtils.isEmpty(str8)) {
                        str2 = str8;
                    }
                }
                if (objArr.length >= 5) {
                    Object obj4 = objArr[4];
                    if (obj4 instanceof JSONObject) {
                        jSONObject = (JSONObject) obj4;
                    }
                }
                if (objArr.length >= 6) {
                    str3 = (String) objArr[5];
                }
                if (jSONObject != null) {
                    if (TextUtils.isEmpty(str3)) {
                        a(str2, jSONObject.getString("name"), jSONObject.getString("params"));
                    } else {
                        a(str2, jSONObject.getString("name"), jSONObject.getString("params") + ",trackInfo=" + str3);
                    }
                }
                qyg.c().e(str7, obj3);
            }
        }
    }
}
