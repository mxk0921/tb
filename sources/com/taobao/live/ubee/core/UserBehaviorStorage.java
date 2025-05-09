package com.taobao.live.ubee.core;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.ubee.mtop.report.EventModel;
import com.taobao.live.ubee.mtop.report.EventReportRequest;
import com.taobao.live.ubee.mtop.report.EventReportResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ck8;
import tb.t2o;
import tb.to8;
import tb.wvt;
import tb.zjx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UserBehaviorStorage implements wvt.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String[] FILTERABLE_ACTIONS = {to8.COMMENT};
    public static final String TAG = "BehaviorStorage";

    /* renamed from: a  reason: collision with root package name */
    public final ReportConfigManager f11000a = new ReportConfigManager();
    public final Queue<ck8> b = new LinkedList();
    public final wvt c;
    public final SparseIntArray d;

    static {
        t2o.a(779092254);
        t2o.a(779093666);
    }

    public UserBehaviorStorage() {
        wvt wvtVar = new wvt(this, 60000L, Looper.getMainLooper());
        this.c = wvtVar;
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.d = sparseIntArray;
        sparseIntArray.put(1, 60000);
        wvtVar.d(sparseIntArray);
    }

    public static boolean p(Collection collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90b05181", new Object[]{collection})).booleanValue();
        }
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean q(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42ff03f2", new Object[]{charSequence})).booleanValue();
        }
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    public static long r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6eaba914", new Object[]{str})).longValue();
        }
        try {
            if (q(str)) {
                return 0L;
            }
            return Long.parseLong(str);
        } catch (Exception e) {
            Log.e(TAG, "parseLong exp", e);
            return 0L;
        }
    }

    @Override // tb.wvt.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82685e6c", new Object[]{this});
        } else {
            l();
        }
    }

    @Override // tb.wvt.a
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68e91c96", new Object[]{this})).intValue();
        }
        return 1;
    }

    public void c(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c564b847", new Object[]{this, str, str2, obj, strArr});
        } else if (k()) {
            this.f11000a.c();
        }
    }

    public void d(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("681fdf0f", new Object[]{this, str, str2, strArr});
            return;
        }
        s(str, "exit", strArr);
        j();
    }

    public void e(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38feac8", new Object[]{this, str, str2, obj, strArr});
        }
    }

    public void f(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce026f82", new Object[]{this, str, str2, str3, strArr});
        } else {
            s(str, g4.b.i, strArr);
        }
    }

    public void g(String str, String str2, String str3, String str4, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c09eea4", new Object[]{this, str, str2, str3, str4, strArr});
        } else {
            s(str, str2, strArr);
        }
    }

    public final Map<String, String> h(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ce4c600e", new Object[]{this, strArr});
        }
        HashMap hashMap = new HashMap();
        if (strArr != null && strArr.length > 0) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    String[] split = str.split("=");
                    if (split.length == 2) {
                        hashMap.put(split[0].trim(), split[1].trim());
                    }
                }
            }
        }
        return hashMap;
    }

    public final EventModel i(ck8 ck8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventModel) ipChange.ipc$dispatch("49670bf0", new Object[]{this, ck8Var});
        }
        EventModel eventModel = new EventModel();
        eventModel.scene = ck8Var.f17114a;
        eventModel.action = ck8Var.b;
        Map<String, String> map = ck8Var.c;
        if (map != null) {
            eventModel.feedId = map.remove("feedId");
            eventModel.accountId = map.remove("accountId");
            if (map.containsKey("type")) {
                eventModel.type = map.remove("type");
            } else {
                eventModel.type = "0";
            }
            eventModel.timestamp = map.remove("timestamp");
            eventModel.extendJson = JSON.toJSONString(map);
        }
        return eventModel;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.c.removeCallbacksAndMessages(null);
        this.c.e(true);
        l();
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9e6e9a", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList(this.b);
        ((LinkedList) this.b).clear();
        m(arrayList);
    }

    public void m(List<ck8> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed2fce6d", new Object[]{this, list});
        } else if (!p(list)) {
            ArrayList arrayList = new ArrayList();
            long j = 0;
            long j2 = 0;
            for (ck8 ck8Var : list) {
                Map<String, String> map = ck8Var.c;
                if (map != null) {
                    j = r(map.get("accountId"));
                    j2 = r(ck8Var.c.get("feedId"));
                }
                arrayList.add(i(ck8Var));
            }
            EventReportRequest eventReportRequest = new EventReportRequest();
            eventReportRequest.liveEventsJson = JSON.toJSONString(arrayList);
            eventReportRequest.anchorId = Long.valueOf(j);
            eventReportRequest.liveId = Long.valueOf(j2);
            zjx.b(eventReportRequest, new IRemoteBaseListener() { // from class: com.taobao.live.ubee.core.UserBehaviorStorage.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else if (mtopResponse != null) {
                        Log.e(UserBehaviorStorage.TAG, "onError: errorMsg = " + mtopResponse.getRetMsg() + "  errorCode = " + mtopResponse.getRetCode());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else if (mtopResponse != null) {
                        Log.e(UserBehaviorStorage.TAG, "onSystemError: errorMsg = " + mtopResponse.getRetMsg() + "  errorCode = " + mtopResponse.getRetCode());
                    }
                }
            }, EventReportResponse.class, true, false);
        }
    }

    public final boolean n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea3b07e3", new Object[]{this, str})).booleanValue();
        }
        for (String str2 : FILTERABLE_ACTIONS) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public final void s(String str, String str2, String... strArr) {
        JSONObject f;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b193d9e", new Object[]{this, str, str2, strArr});
        } else if (k() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !n(str2) && (f = this.f11000a.f()) != null && (jSONObject = f.getJSONObject(str)) != null) {
            String string = jSONObject.getString(str2);
            if (!TextUtils.isEmpty(string)) {
                ck8 ck8Var = new ck8();
                ck8Var.f17114a = str;
                ck8Var.b = str2;
                ck8Var.c = h(strArr);
                ((LinkedList) this.b).add(ck8Var);
                int o = o(string);
                if (o <= 0) {
                    l();
                    return;
                }
                t(o);
                if (this.c.b()) {
                    this.c.e(false);
                    this.c.f(1);
                }
            }
        }
    }

    public final void t(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1614019c", new Object[]{this, new Integer(i)});
        } else if (i < this.d.get(1) && i > 0) {
            this.d.put(1, i * 1000);
        }
    }

    public final int o(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4fe2e7f", new Object[]{this, str})).intValue();
        }
        JSONObject e = this.f11000a.e();
        if (e == null || (jSONObject = e.getJSONObject("priority")) == null) {
            return 0;
        }
        return jSONObject.getIntValue(str);
    }
}
