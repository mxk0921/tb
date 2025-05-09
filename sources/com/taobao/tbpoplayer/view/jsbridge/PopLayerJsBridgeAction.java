package com.taobao.tbpoplayer.view.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.taobao.windvane.jsbridge.IJsApiFailedCallBack;
import android.taobao.windvane.jsbridge.IJsApiSucceedCallBack;
import android.taobao.windvane.jsbridge.WVJsBridge;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.factory.view.base.ClickableAreaParam;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.info.frequency.FrequencyManager;
import com.alibaba.poplayer.info.mock.PopLayerMockManager;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.tschedule.TSchedule;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bbm;
import tb.esw;
import tb.f7l;
import tb.lyv;
import tb.rgm;
import tb.spw;
import tb.t2o;
import tb.vem;
import tb.wdm;
import tb.z1x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PopLayerJsBridgeAction {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<PopLayerBaseView> f13421a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends TypeReference<ArrayList<String>> {
        public a(PopLayerJsBridgeAction popLayerJsBridgeAction) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends TypeReference<ArrayList<String>> {
        public b(PopLayerJsBridgeAction popLayerJsBridgeAction) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void a(String str);

        void b(Map<String, Object> map);

        void c(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class d implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(790626541);
            t2o.a(790626540);
        }

        @Override // com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.c
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
            }
        }

        @Override // com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.c
        public void b(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0a100b", new Object[]{this, map});
            }
        }

        @Override // com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.c
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("705c530e", new Object[]{this, str});
            }
        }
    }

    static {
        t2o.a(790626536);
    }

    public PopLayerJsBridgeAction(PopLayerBaseView popLayerBaseView) {
        this.f13421a = new WeakReference<>(popLayerBaseView);
    }

    public static /* synthetic */ void t(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38f273c7", new Object[]{cVar, str});
        } else if (cVar != null) {
            cVar.c("WVCallMethod.WVNative.openWindow.failed");
        }
    }

    public static /* synthetic */ void u(PopLayerBaseView popLayerBaseView, String str, c cVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266c1292", new Object[]{popLayerBaseView, str, cVar, str2});
            return;
        }
        popLayerBaseView.syncJumpToUrlInfo(str);
        if (cVar != null) {
            cVar.a(null);
        }
    }

    public void D(double d2, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efaefef3", new Object[]{this, new Double(d2), cVar});
            return;
        }
        PopLayerBaseView n = n(cVar);
        if (n != null) {
            n.setPenetrateAlpha((int) (d2 * 255.0d));
            if (cVar != null) {
                cVar.a(null);
            }
            wdm.d("PopLayerJsBridgeAction.setModalThreshold.done.", new Object[0]);
        }
    }

    public void E(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c02c7ad2", new Object[]{this, str, cVar});
            return;
        }
        PopLayerBaseView n = n(cVar);
        if (n != null) {
            n.setContentId(str);
            if (cVar != null) {
                cVar.a(null);
            }
            wdm.d("PopLayerJsBridgeAction.setPopContentId.done", new Object[0]);
        }
    }

    public void F(long j, long j2, long j3, long j4, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583f0a49", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4), cVar});
            return;
        }
        PopLayerBaseView n = n(cVar);
        if (n != null) {
            n.setViewTimeLineTime(j, j2, j3, j4);
            if (cVar != null) {
                cVar.a(null);
            }
            wdm.d("PopLayerJsBridgeAction.trackTimeLineCostTime.done", new Object[0]);
        }
    }

    public void e(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, long j3, long j4, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6accd957", new Object[]{this, str, str2, str3, str4, str5, str6, new Long(j), new Long(j2), new Long(j3), new Long(j4), cVar});
            return;
        }
        PopLayerBaseView n = n(cVar);
        if (n != null) {
            String str7 = TextUtils.isEmpty(str) ? "commonJsClose" : str;
            if (!TextUtils.isEmpty(str6)) {
                n.setContentId(str6);
            }
            if (!TextUtils.isEmpty(str4)) {
                try {
                    n.putOnePopExtras(JSON.parseObject(str4));
                } catch (Throwable th) {
                    wdm.h("close.putOnePopExtras.error.", th);
                }
            }
            n.setViewTimeLineTime(j, j2, j3, j4);
            n.setUserResultInTrack(str5, false, null);
            n.close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, str7, str2, str3);
            if (cVar != null) {
                cVar.a(null);
            }
            wdm.d("PopLayerJsBridgeAction.close.done", new Object[0]);
        }
    }

    public void f(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83c59a65", new Object[]{this, cVar});
            return;
        }
        PopLayerBaseView n = n(cVar);
        if (n != null) {
            n.displayMe(false);
            if (cVar != null) {
                cVar.a(null);
            }
            wdm.d("PopLayerJsBridgeAction.display.done", new Object[0]);
        }
    }

    public void g(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1824d761", new Object[]{this, cVar});
            return;
        }
        PopLayerBaseView n = n(cVar);
        if (n != null) {
            n.getPopRequest().b();
            if (cVar != null) {
                cVar.a(null);
            }
            wdm.d("PopLayerJsBridgeAction.finishPop.done", new Object[0]);
        }
    }

    public final float j(Context context, NumberFormat numberFormat, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d156205", new Object[]{this, context, numberFormat, str, new Integer(i)})).floatValue();
        }
        float f = 0.0f;
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        if (!str.contains(f7l.MOD)) {
            return lyv.d(context, Float.parseFloat(str));
        }
        try {
            float floatValue = numberFormat.parse(str).floatValue();
            if (floatValue > 1.0f) {
                f = 1.0f;
            } else if (floatValue >= 0.0f) {
                f = floatValue;
            }
            return f * i;
        } catch (ParseException e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    public final PopLayerBaseView n(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopLayerBaseView) ipChange.ipc$dispatch("55b647b7", new Object[]{this, cVar});
        }
        PopLayerBaseView popLayerBaseView = this.f13421a.get();
        if (popLayerBaseView != null) {
            return popLayerBaseView;
        }
        if (cVar == null) {
            return null;
        }
        cVar.c("popViewNull");
        return null;
    }

    public void q(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2437e1d1", new Object[]{this, cVar});
            return;
        }
        PopLayerBaseView n = n(cVar);
        if (n != null) {
            n.getPopRequest().r();
            if (cVar != null) {
                cVar.a(null);
            }
            wdm.d("PopLayerJsBridgeAction.increaseReadTimes.done", new Object[0]);
        }
    }

    public void s(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f43218e", new Object[]{this, str, cVar});
            return;
        }
        PopLayerBaseView n = n(cVar);
        if (n != null) {
            Nav.from(n.getContext()).toUri(str);
            n.syncJumpToUrlInfo(str);
            if (cVar != null) {
                cVar.a(null);
            }
        }
    }

    public void v(String str, IWVWebView iWVWebView, final String str2, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7a6f40", new Object[]{this, str, iWVWebView, str2, cVar});
            return;
        }
        final PopLayerBaseView n = n(cVar);
        if (n != null) {
            spw spwVar = new spw();
            spwVar.d = "WVNative";
            spwVar.e = "openWindow";
            spwVar.f = str;
            spwVar.f28213a = iWVWebView;
            WVJsBridge.g().f(new esw(n.getContext(), iWVWebView), spwVar, new IJsApiFailedCallBack() { // from class: tb.tdm
                @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
                public final void fail(String str3) {
                    PopLayerJsBridgeAction.t(PopLayerJsBridgeAction.c.this, str3);
                }
            }, new IJsApiSucceedCallBack() { // from class: tb.udm
                @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
                public final void succeed(String str3) {
                    PopLayerJsBridgeAction.u(PopLayerBaseView.this, str2, cVar, str3);
                }
            });
        }
    }

    public void x(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b1cb62a", new Object[]{this, str, cVar});
            return;
        }
        PopLayerBaseView n = n(cVar);
        if (n != null) {
            n.putOnePopExtras(JSON.parseObject(str));
            if (cVar != null) {
                cVar.a(null);
            }
            wdm.d("PopLayerJsBridgeAction.putOnePopExtras.done", new Object[0]);
        }
    }

    public void z(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b7c7db", new Object[]{this, str, cVar});
            return;
        }
        PopLayerBaseView n = n(cVar);
        if (n != null) {
            n.setUserResultInTrack(str, false, null);
            if (cVar != null) {
                cVar.a(null);
            }
            wdm.d("PopLayerJsBridgeAction.recordUserBehavior.done", new Object[0]);
        }
    }

    public void A(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e939098", new Object[]{this, cVar});
            return;
        }
        PopLayerBaseView n = n(cVar);
        if (n != null) {
            if (rgm.h().r(com.alibaba.poplayer.trigger.a.P(n.getPopRequest()))) {
                if (cVar != null) {
                    cVar.a(null);
                }
            } else if (cVar != null) {
                cVar.c("pageEventDisable");
            }
            wdm.d("PopLayerJsBridgeAction.removeAllPageEventListen.done", new Object[0]);
        }
    }

    public void B(String str, String str2, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e817005", new Object[]{this, str, str2, cVar});
            return;
        }
        PopLayerBaseView n = n(cVar);
        if (n != null) {
            if (rgm.h().s(str, (List) JSON.parseObject(str2, new b(this).getType(), new Feature[0]), com.alibaba.poplayer.trigger.a.P(n.getPopRequest()))) {
                if (cVar != null) {
                    cVar.a(null);
                }
            } else if (cVar != null) {
                cVar.c("pageEventDisable");
            }
            wdm.d("PopLayerJsBridgeAction.removePageEventListen.done", new Object[0]);
        }
    }

    public void c(String str, String str2, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb03fd08", new Object[]{this, str, str2, cVar});
            return;
        }
        PopLayerBaseView n = n(cVar);
        if (n != null) {
            if (rgm.h().g(str, (List) JSON.parseObject(str2, new a(this).getType(), new Feature[0]), com.alibaba.poplayer.trigger.a.P(n.getPopRequest()), n)) {
                if (cVar != null) {
                    cVar.a(null);
                }
            } else if (cVar != null) {
                cVar.c("pageEventDisable");
            }
            wdm.d("PopLayerJsBridgeAction.addPageEventListen.done", new Object[0]);
        }
    }

    public void d(String str, c cVar) {
        String str2;
        WeakReference<Activity> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adab2b73", new Object[]{this, str, cVar});
            return;
        }
        PopLayerBaseView n = n(cVar);
        if (n != null) {
            com.alibaba.poplayer.trigger.a aVar = (com.alibaba.poplayer.trigger.a) n.getPopRequest();
            boolean d2 = (aVar == null || (weakReference = aVar.f) == null) ? false : bbm.c().d(InternalTriggerController.getActivityKeyCode(weakReference.get()), n.getUUID(), str);
            HashMap hashMap = new HashMap();
            if (d2) {
                str2 = "绑定成功";
            } else {
                str2 = "绑定失败";
            }
            hashMap.put("message", str2);
            if (cVar != null) {
                cVar.b(hashMap);
            }
            wdm.d("PopLayerJsBridgeAction.bindValueToNative.done", new Object[0]);
        }
    }

    public void h(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456a8797", new Object[]{this, cVar});
            return;
        }
        PopLayerBaseView n = n(cVar);
        if (n != null) {
            com.alibaba.poplayer.trigger.a aVar = (com.alibaba.poplayer.trigger.a) n.getPopRequest();
            FrequencyManager.FrequencyInfo r = com.alibaba.poplayer.info.frequency.a.t().r(aVar.K());
            if (r != null) {
                HashMap hashMap = new HashMap();
                long intValue = r.popInfoMap.containsKey(Long.valueOf(r.curFIndex)) ? r.popInfoMap.get(Long.valueOf(r.curFIndex)).intValue() : 0L;
                hashMap.put("curFrequencyIndex", Long.valueOf(r.curFIndex));
                hashMap.put("curFrequencyPopTimes", Long.valueOf(intValue));
                if (aVar.K().freqConfigs != null) {
                    hashMap.put("curFrequencyRemainPopTimes", Long.valueOf(aVar.K().freqConfigs.freqMaxCount - intValue));
                }
                if (cVar != null) {
                    cVar.b(hashMap);
                }
            } else if (cVar != null) {
                cVar.c("noData");
            }
            wdm.d("PopLayerJsBridgeAction.getFrequencyInfo.done", new Object[0]);
        }
    }

    public void i(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18831d6b", new Object[]{this, cVar});
            return;
        }
        PopLayerBaseView n = n(cVar);
        if (n != null) {
            Map<String, Object> f = n.getPopRequest().f();
            if (f != null) {
                if (cVar != null) {
                    cVar.b(f);
                }
            } else if (cVar != null) {
                cVar.c("noData");
            }
            wdm.d("PopLayerJsBridgeAction.getLocalCrowdReturn.done", new Object[0]);
        }
    }

    public void k(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1a7ca20", new Object[]{this, cVar});
            return;
        }
        PopLayerBaseView n = n(cVar);
        if (n != null) {
            Map<String, Object> l = ((com.alibaba.poplayer.trigger.a) n.getPopRequest()).l();
            if (l != null) {
                if (cVar != null) {
                    cVar.b(l);
                }
            } else if (cVar != null) {
                cVar.c("noData");
            }
            wdm.d("PopLayerJsBridgeAction.getPopCheckReturn.done", new Object[0]);
        }
    }

    public void l(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("237296ee", new Object[]{this, cVar});
            return;
        }
        PopLayerBaseView n = n(cVar);
        if (n != null) {
            String str = ((com.alibaba.poplayer.trigger.a) n.getPopRequest()).K().json;
            HashMap hashMap = new HashMap();
            hashMap.put("result", str);
            if (cVar != null) {
                cVar.b(hashMap);
            }
            wdm.d("PopLayerJsBridgeAction.getPopConfigInfo.done", new Object[0]);
        }
    }

    public void m(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2078aa5", new Object[]{this, cVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", (Object) ("\"PopLayer/" + PopLayer.getReference().getVersion() + "\""));
        String json = jSONObject.toString();
        if (cVar != null) {
            cVar.a(json);
        }
        wdm.d("PopLayerJsBridgeAction.getPopLayerVersion.done", new Object[0]);
    }

    public void o(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("307399f7", new Object[]{this, cVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timeTravelSec", (Object) Long.valueOf(PopLayerMockManager.instance().getTimeTravelSec()));
        if (cVar != null) {
            cVar.a(jSONObject.toString());
        }
        wdm.d("PopLayerJsBridgeAction.getTimeTravelSec.done", new Object[0]);
    }

    public void p(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e2eba9", new Object[]{this, cVar});
            return;
        }
        PopLayerBaseView n = n(cVar);
        if (n != null) {
            JSONObject jSONObject = new JSONObject();
            com.alibaba.poplayer.trigger.a aVar = (com.alibaba.poplayer.trigger.a) n.getPopRequest();
            Event L = aVar.L();
            jSONObject.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, (Object) L.uri);
            jSONObject.put("param", (Object) aVar.N());
            jSONObject.put("nativeUri", (Object) L.curPage);
            jSONObject.put("nativeUrl", (Object) L.curPageUrl);
            String json = jSONObject.toString();
            if (cVar != null) {
                cVar.a(json);
            }
            wdm.d("PopLayerJsBridgeAction.getTriggerEventInfo.done", new Object[0]);
        }
    }

    public void y(String str, c cVar) {
        String str2;
        WeakReference<Activity> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1abc0e9", new Object[]{this, str, cVar});
            return;
        }
        PopLayerBaseView n = n(cVar);
        if (n != null) {
            com.alibaba.poplayer.trigger.a aVar = (com.alibaba.poplayer.trigger.a) n.getPopRequest();
            if (aVar == null || (weakReference = aVar.f) == null) {
                str2 = "";
            } else {
                str2 = bbm.c().b(InternalTriggerController.getActivityKeyCode(weakReference.get()), n.getUUID(), str);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("value", str2);
            if (cVar != null) {
                cVar.b(hashMap);
            }
            wdm.d("PopLayerJsBridgeAction.readValueFromNative.done", new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void G(java.lang.String r9, java.lang.String r10, java.lang.String r11, com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.c r12) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.G(java.lang.String, java.lang.String, java.lang.String, com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction$c):void");
    }

    public boolean r(String str, String str2, c cVar) {
        PopLayerBaseView n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77d7f6fb", new Object[]{this, str, str2, cVar})).booleanValue();
        }
        if (TextUtils.isEmpty(str2) || ((!str2.equals("allowJumpOut") && !str2.equals("market")) || (n = n(cVar)) == null)) {
            return false;
        }
        if (str2.equals("allowJumpOut")) {
            try {
                Nav.from(n.getContext()).allowEscape().toUri(str);
                n.syncJumpToUrlInfo(str);
                if (cVar != null) {
                    cVar.a(null);
                }
            } catch (Throwable th) {
                wdm.h("PopLayerWVPlugin.NavToUrl.allowJumpOut.error.", th);
                if (cVar != null) {
                    cVar.c("NavToUrl.allowJumpOut.error.");
                }
            }
        } else {
            boolean i = vem.i(n.getContext(), null);
            if (cVar != null) {
                if (i) {
                    cVar.a(null);
                } else {
                    cVar.c("market not found");
                }
                cVar.c("NavToUrl.market.error.");
            }
        }
        return true;
    }

    public void w(String str, JSONObject jSONObject, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3609b45", new Object[]{this, str, jSONObject, cVar});
        } else if (!TextUtils.isEmpty(str) && jSONObject != null) {
            jSONObject.put("type", z1x.PRE_RENDER);
            jSONObject.put("trigger", "PopLayer");
            if (TSchedule.preloadWithConfig("PopLayer", str, Collections.singletonList(jSONObject), new ScheduleProtocolCallback() { // from class: com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
                public void onPreload(ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType, HashMap<String, String> hashMap) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df1a7672", new Object[]{this, scheduleProtocolCallbackType, hashMap});
                    }
                }

                @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
                public boolean resolveParameter(String str2, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("1ba0efdb", new Object[]{this, str2, map})).booleanValue();
                    }
                    return true;
                }

                @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
                public boolean resolveType(ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("8945bdc1", new Object[]{this, scheduleProtocolCallbackType})).booleanValue();
                    }
                    return true;
                }
            })) {
                if (cVar != null) {
                    cVar.a(null);
                }
            } else if (cVar != null) {
                cVar.c("preloadFailed");
            }
            wdm.d("PopLayerJsBridgeAction.preRenderUrl.done", new Object[0]);
        } else if (cVar != null) {
            cVar.c("paramInvalid");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void C(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, c cVar) {
        char c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc350a6", new Object[]{this, str, str2, str3, str4, str5, str6, str7, str8, cVar});
            return;
        }
        PopLayerBaseView n = n(cVar);
        if (n != null) {
            Context context = n.getContext();
            NumberFormat percentInstance = NumberFormat.getPercentInstance();
            int width = n.getWidth();
            int height = n.getHeight();
            ClickableAreaParam clickableAreaParam = new ClickableAreaParam();
            boolean z = TextUtils.isEmpty(str) || Boolean.parseBoolean(str);
            n.setEnableClickArea(z);
            if (z) {
                clickableAreaParam.width = (int) j(context, percentInstance, str2, width);
                clickableAreaParam.height = (int) j(context, percentInstance, str3, height);
                clickableAreaParam.left = (int) j(context, percentInstance, str5, width);
                clickableAreaParam.right = (int) j(context, percentInstance, str6, width);
                clickableAreaParam.top = (int) j(context, percentInstance, str7, height);
                clickableAreaParam.bottom = (int) j(context, percentInstance, str8, height);
                str4.hashCode();
                switch (str4.hashCode()) {
                    case -1436089959:
                        if (str4.equals("rightTop")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1364013995:
                        if (str4.equals("center")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -901823641:
                        if (str4.equals("rightBottom")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 55433166:
                        if (str4.equals("leftTop")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1626916114:
                        if (str4.equals("leftBottom")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        clickableAreaParam.layoutX = "right";
                        clickableAreaParam.layoutY = "top";
                        break;
                    case 1:
                        clickableAreaParam.layoutX = "center";
                        clickableAreaParam.layoutY = "center";
                        break;
                    case 2:
                        clickableAreaParam.layoutX = "right";
                        clickableAreaParam.layoutY = "bottom";
                        break;
                    case 3:
                        clickableAreaParam.layoutX = "left";
                        clickableAreaParam.layoutY = "top";
                        break;
                    case 4:
                        clickableAreaParam.layoutX = "left";
                        clickableAreaParam.layoutY = "bottom";
                        break;
                }
            }
            n.setClickableAreaFrame(clickableAreaParam);
            if (cVar != null) {
                cVar.a("");
            }
            wdm.d("PopLayerJsBridgeAction.setClickArea.success.enable=%s.width=%s.height=%s.layout=%s.left=%s.right=%s.top=%s.bottom=%s", str, str2, str3, str4, str5, str6, str7, str8);
        } else if (cVar != null) {
            cVar.c("");
        }
    }
}
