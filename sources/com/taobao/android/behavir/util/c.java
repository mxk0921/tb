package com.taobao.android.behavir.util;

import android.text.TextUtils;
import com.alibaba.analytics.core.model.LogField;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.UTMini;
import com.taobao.android.behavir.fatigue.FatigueManager;
import com.taobao.android.behavir.init.BrDelayInitTask;
import com.taobao.android.behavir.util.b;
import com.taobao.android.external.UCPManager;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.hqv;
import tb.n3v;
import tb.t2o;
import tb.v82;
import tb.y19;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c extends n3v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UCP_TRACK_INFO = "ucpTrackInfo";
    public JSONArray e;
    public List<String> f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/util/UCPUTTrackerListener$1");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                FatigueManager.increaseCount(FatigueManager.FrequencyActionType.kExpose, 0L, 999999L, 0L, 0L, 0L, UTMini.PAGE_AGOO);
            }
        }
    }

    static {
        t2o.a(404750428);
    }

    public static /* synthetic */ List b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("aa149209", new Object[]{cVar});
        }
        return cVar.e();
    }

    public static /* synthetic */ JSONArray d(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("835af11f", new Object[]{cVar});
        }
        return cVar.a();
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 1613428460) {
            super.sendEvent((Map) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/util/UCPUTTrackerListener");
    }

    public final JSONArray a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("dc1f20d6", new Object[]{this});
        }
        if (this.e == null) {
            this.e = Utils.i(JSON.parseArray(v82.l("cancelArg1List", "[\"Page_Push_TBMSGPush_Cancel\"]")));
        }
        return this.e;
    }

    public final List<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        List<String> list = this.f;
        if (list != null) {
            return list;
        }
        List<String> k = com.taobao.android.behavir.util.a.k(Utils.i(JSON.parseArray(v82.l("ucpBackflowArg1BlackList", "[\"Page_Push_TBMSGPush_Dismiss\", \"Page_Push_TBMSGPush_ActualShow\"]"))), String.class);
        this.f = k;
        return k;
    }

    @Override // tb.n3v
    public int[] getAttentionEventIdsForSendEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("ec81ea0e", new Object[]{this});
        }
        return BrDelayInitTask.LISTEN_UT_IDS;
    }

    @Override // tb.n3v
    public void sendEvent(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602af6ec", new Object[]{this, map});
            return;
        }
        super.sendEvent(map);
        String str = map.get(LogField.EVENTID.toString());
        String str2 = map.get(LogField.ARG1.toString());
        if (Arrays.asList("2201", "2101").contains(str)) {
            Map<String, String> c = c(map);
            if (c != null) {
                com.taobao.android.behavir.util.b.b(new b(c, str2, str));
            } else if ("Page_Push_TBMSGPush_Show".equals(str2)) {
                com.taobao.android.behavir.util.b.b(new a());
            }
        }
    }

    @Override // tb.n3v
    public String trackerListenerName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d8246a2", new Object[]{this});
        }
        return "UCP";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public b(Map map, String str, String str2) {
            this.b = map;
            this.c = str;
            this.d = str2;
        }

        private NativeBroadcast.Callback f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NativeBroadcast.Callback) ipChange.ipc$dispatch("30c06b98", new Object[]{this});
            }
            String str = (String) this.b.get(UCPManager.UCP_CALLBACK_ID);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return NativeBroadcast.Callback.recover(Integer.parseInt(str));
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/util/UCPUTTrackerListener$2");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (v82.h("enableUtPlugin", true) && !c.b(c.this).contains(this.c)) {
                try {
                    NativeBroadcast.Callback f = f();
                    JSONArray parseArray = JSON.parseArray(URLDecoder.decode((String) this.b.get("ucpTrackInfo")));
                    if (parseArray != null) {
                        FatigueManager.FrequencyActionType frequencyActionType = FatigueManager.FrequencyActionType.kExpose;
                        if ("2101".equals(this.d)) {
                            if (c.d(c.this).contains(this.c)) {
                                frequencyActionType = FatigueManager.FrequencyActionType.kCancel;
                            } else {
                                frequencyActionType = FatigueManager.FrequencyActionType.kClick;
                            }
                        }
                        for (int i = 0; i < parseArray.size(); i++) {
                            JSONObject jSONObject = parseArray.getJSONObject(i);
                            if (f != null) {
                                jSONObject.put("actionType", (Object) Integer.valueOf(frequencyActionType.ordinal()));
                                f.callback(jSONObject, null);
                            } else {
                                FatigueManager.increaseCount(frequencyActionType, y19.a(jSONObject), FatigueManager.getIdentifierFromSchemeId(jSONObject.getString("schemeId")));
                            }
                        }
                        if (f == null) {
                            return;
                        }
                        if (frequencyActionType == FatigueManager.FrequencyActionType.kExpose) {
                            f.cache();
                        } else {
                            f.close();
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final Map<String, String> c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map});
        }
        if (!TextUtils.isEmpty(map.get("ucpTrackInfo"))) {
            return map;
        }
        String str = map.get(LogField.ARGS.toString());
        if (str == null || !str.contains("ucpTrackInfo")) {
            return null;
        }
        return hqv.p(str, ",", "=", false);
    }
}
