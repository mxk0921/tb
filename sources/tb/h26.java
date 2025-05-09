package tb;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.task.Coordinator;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class h26 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_LTAP = 35850307557L;
    public static final String EVENT_TAP_EVENT_HANDLER = "com.taobao.taolive.tap.event.handler";
    public static final String EVENT_TAP_EVENT_UT_COMMIT = "com.taobao.taolive.livehome.commit.ltap";

    /* renamed from: a  reason: collision with root package name */
    public static final String f20367a = h26.class.getSimpleName();

    static {
        t2o.a(806355418);
    }

    public static /* synthetic */ void a(h26 h26Var, String str, JSONObject jSONObject, JSONObject jSONObject2, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("187b9ebe", new Object[]{h26Var, str, jSONObject, jSONObject2, objArr, dXRuntimeContext});
        } else {
            h26Var.b(str, jSONObject, jSONObject2, objArr, dXRuntimeContext);
        }
    }

    public static ArrayList<cpb> d(View view) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("f7c7219c", new Object[]{view});
        }
        ArrayList<cpb> arrayList = new ArrayList<>();
        if (view != null) {
            if (view instanceof tlc) {
                arrayList.add((cpb) view);
            }
            if (view instanceof ViewGroup) {
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    ArrayList<cpb> d = d(viewGroup.getChildAt(i));
                    if (!d.isEmpty()) {
                        arrayList.addAll(d);
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ Object ipc$super(h26 h26Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/event/DXLTapEventHandler");
    }

    public final void c(String str, JSONObject jSONObject, JSONObject jSONObject2, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b3638d0", new Object[]{this, str, jSONObject, jSONObject2, objArr, dXRuntimeContext});
        } else {
            Coordinator.execute(new g26(this, str, jSONObject, jSONObject2, objArr, dXRuntimeContext));
        }
    }

    public final String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13f71508", new Object[]{this, str, str2});
        }
        if (!arq.a(str)) {
            return str;
        }
        return str2;
    }

    public final void f(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d13001e", new Object[]{this, activity});
            return;
        }
        View findViewById = activity.findViewById(R.id.live_fragment_vp);
        if (Build.VERSION.SDK_INT >= 29 && (findViewById instanceof ViewGroup)) {
            ((ViewGroup) findViewById).suppressLayout(true);
        }
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r6, com.alibaba.fastjson.JSONObject r7, com.alibaba.fastjson.JSONObject r8, java.lang.Object[] r9, com.taobao.android.dinamicx.DXRuntimeContext r10) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.h26.b(java.lang.String, com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONObject, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String str;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length > 1) {
            if (dXRuntimeContext.h() == null) {
                r0h.b(f20367a, "context is null.");
                return;
            }
            Trace.beginSection("TLiveFFTrace -- parse params");
            JSONObject jSONObject3 = (JSONObject) objArr[0];
            JSONObject jSONObject4 = (JSONObject) objArr[1];
            if (jSONObject3 == null) {
                r0h.b(f20367a, "args[0] dataInfo is null.");
                return;
            }
            if (e2h.h()) {
                ADaemon.boostCpu(2);
                r0h.b(f20367a, "enableCPUAdeMonBootsCpu true");
            }
            JSONObject jSONObject5 = null;
            if (jSONObject4 != null) {
                String string = jSONObject4.getString("trackInfo");
                JSONObject jSONObject6 = jSONObject4.getJSONObject("liveInfo");
                JSONObject jSONObject7 = jSONObject4.getJSONObject("clickMaidian");
                if (jSONObject7 == null || jSONObject7.get("params") == null || arq.a(jSONObject7.getString("pageName"))) {
                    str2 = string;
                    jSONObject2 = jSONObject6;
                    jSONObject = jSONObject7;
                    str = "Page_TaobaoLive";
                } else {
                    str2 = string;
                    jSONObject2 = jSONObject6;
                    jSONObject = jSONObject7;
                    str = jSONObject7.getString("pageName");
                }
            } else {
                str = "Page_TaobaoLive";
                str2 = null;
                jSONObject2 = null;
                jSONObject = null;
            }
            Trace.endSection();
            c(str, jSONObject3, jSONObject4, objArr, dXRuntimeContext);
            String string2 = jSONObject3.getString(rg0.JUMP_URL);
            if (!arq.a(string2)) {
                Trace.beginSection("TLiveFFTrace build jump url");
                if (qvs.z() && string2.startsWith(itw.URL_SEPARATOR)) {
                    string2 = uyv.HTTPS_SCHEMA.concat(string2);
                }
                qyg.c().e("com.taobao.taolive.livehome.commit.ltap", jSONObject3);
                if (!arq.a(str2)) {
                    String encode = Uri.encode(str2);
                    if (!string2.contains("trackInfo")) {
                        if (string2.contains("?")) {
                            string2 = string2 + "&trackInfo=" + encode;
                        } else {
                            string2 = string2 + "?trackInfo=" + encode;
                        }
                    }
                }
                if (e2h.j()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!string2.contains("enterClickTs")) {
                        if (string2.contains("?")) {
                            string2 = string2 + "&enterClickTs=" + currentTimeMillis;
                        } else {
                            string2 = string2 + "?enterClickTs=" + currentTimeMillis;
                        }
                    }
                }
                Trace.endSection();
                if (jSONObject2 != null) {
                    Trace.beginSection("TLiveFFTrace - liveInfo not null");
                    if (qvs.z() && (dXRuntimeContext.h() instanceof Activity) && sj7.a()) {
                        f((Activity) dXRuntimeContext.h());
                    }
                    if (jSONObject != null) {
                        String string3 = jSONObject.getString(mh1.PRD_P4P_URL);
                        if (!arq.a(string3)) {
                            String handleAdUrlForClickid = AlimamaAdvertising.instance().handleAdUrlForClickid(string3);
                            if (!arq.a(handleAdUrlForClickid)) {
                                if (string2.contains("?")) {
                                    string2 = string2 + "&clickid=" + handleAdUrlForClickid;
                                } else {
                                    string2 = string2 + "?clickid=" + handleAdUrlForClickid;
                                }
                            }
                        }
                    }
                    Trace.endSection();
                    String string4 = jSONObject2.getString("liveId");
                    Trace.beginSection("TLiveFFTrace - token reuse");
                    if (!arq.a(string4)) {
                        qyg.c().e("com.taobao.live.home.card.onclick.ltap", string4);
                    }
                    Trace.endSection();
                    String string5 = jSONObject2.getString(yj4.PARAM_COVER_IMG);
                    boolean c = arq.c(jSONObject2.getString("landScape"));
                    JSONObject jSONObject8 = (1 != jSONObject2.getIntValue("roomStatus") || !jSONObject2.containsKey("queryParams")) ? null : jSONObject2.getJSONObject("queryParams");
                    if (jSONObject2.containsKey(yj4.PARAM_MEDIA_INFO_ADTRANSPARAMS)) {
                        jSONObject5 = jSONObject2.getJSONObject(yj4.PARAM_MEDIA_INFO_ADTRANSPARAMS);
                    }
                    Trace.beginSection("TLiveFFTrace - destroy allplayer");
                    bjr.d().c(zzg.PLAY_PAGEID, true);
                    Trace.endSection();
                    Trace.endSection();
                    Trace.beginSection("TLiveFFTrace - navi to live watch");
                    v90.b(dXRuntimeContext.h(), string2, null, string5, jSONObject8, c, null, jSONObject5, true, 240);
                    Trace.endSection();
                } else {
                    Trace.beginSection("TLiveFFTrace - liveInfo null. navi to url");
                    if ("Page_TaobaoLive".equals(str)) {
                        a2h.b(dXRuntimeContext.h(), string2, 240);
                    } else {
                        a2h.a(dXRuntimeContext.h(), string2);
                    }
                    Trace.endSection();
                }
                Trace.beginSection("TLiveFFTrace - update next page UT");
                String string6 = jSONObject3.getString(yj4.PARAM_TRACK_LIVEOPRT_ID);
                HashMap hashMap = new HashMap();
                if (!arq.a(str2)) {
                    hashMap.put("trackInfo", str2);
                }
                if (!arq.a(string6)) {
                    hashMap.put(yj4.PARAM_TRACK_LIVEOPRT_ID, string6);
                }
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap));
                Trace.endSection();
                return;
            }
            r0h.b(f20367a, "jump url is empty.");
        }
    }
}
