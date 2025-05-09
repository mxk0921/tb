package com.taobao.android.detail2.core.framework.base.weex;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.hxj;
import tb.pt1;
import tb.r19;
import tb.rj8;
import tb.t2o;
import tb.txj;
import tb.uce;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DetailWeexModule extends WXModule implements uce {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static HashMap<Integer, Integer> sCacheBatchCount = null;
    private static HashMap<Integer, Boolean> sCacheHasPostCheck = null;
    private static HashMap<Integer, JSONObject> sCacheMap = null;
    public List<JSCallback> mCallbacks = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7101a;
        public final /* synthetic */ com.taobao.android.weex_framework.a b;
        public final /* synthetic */ uce c;

        public a(int i, com.taobao.android.weex_framework.a aVar, uce uceVar) {
            this.f7101a = i;
            this.b = aVar;
            this.c = uceVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DetailWeexModule.access$000().put(Integer.valueOf(this.f7101a), Boolean.FALSE);
            Integer num = (Integer) DetailWeexModule.access$100().get(Integer.valueOf(this.f7101a));
            if (num == null) {
                num = 0;
            }
            if (!r19.C0()) {
                txj.e(txj.TAG_TIP, "static batchFireEvent , delayCheck , eventCount = " + num);
            }
            if (num.intValue() > 0) {
                JSONObject jSONObject = (JSONObject) DetailWeexModule.access$200().get(Integer.valueOf(this.f7101a));
                if (jSONObject != null) {
                    DetailWeexModule.access$200().remove(Integer.valueOf(this.f7101a));
                    com.taobao.android.weex_framework.a aVar = this.b;
                    if (aVar != null) {
                        aVar.fireEvent(2, "newdetailcallback", jSONObject);
                    } else {
                        uce uceVar = this.c;
                        if (uceVar != null) {
                            uceVar.fireEvent("newdetailcallback", jSONObject);
                        }
                    }
                    if (!r19.C0()) {
                        txj.e(txj.TAG_RENDER, "weex数据流 向weex发消息：" + JSON.toJSONString(jSONObject.keySet()));
                    }
                }
                DetailWeexModule.access$100().put(Integer.valueOf(this.f7101a), 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements pt1.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7102a;
        public final /* synthetic */ uce b;

        public b(int i, uce uceVar, com.taobao.android.weex_framework.a aVar) {
            this.f7102a = i;
            this.b = uceVar;
        }

        @Override // tb.pt1.a
        public void a(JSONObject jSONObject) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7adbb21", new Object[]{this, jSONObject});
            } else if (!r19.w0() || (i = this.f7102a) <= 0) {
                uce uceVar = this.b;
                if (uceVar != null) {
                    uceVar.fireEvent("newdetailcallback", jSONObject);
                    txj.e(txj.TAG_RENDER, "weex数据流 向weex发消息：" + JSON.toJSONString(jSONObject.keySet()));
                }
            } else {
                DetailWeexModule.access$300(i, jSONObject, this.b, null);
            }
        }
    }

    static {
        t2o.a(352321743);
        t2o.a(352321747);
    }

    public static /* synthetic */ HashMap access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3d0ed1a", new Object[0]);
        }
        return sCacheHasPostCheck;
    }

    public static /* synthetic */ HashMap access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("88013a1b", new Object[0]);
        }
        return sCacheBatchCount;
    }

    public static /* synthetic */ HashMap access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c31871c", new Object[0]);
        }
        return sCacheMap;
    }

    public static /* synthetic */ void access$300(int i, JSONObject jSONObject, uce uceVar, com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1854c49", new Object[]{new Integer(i), jSONObject, uceVar, aVar});
        } else {
            processBatchDispatchMessage(i, jSONObject, uceVar, aVar);
        }
    }

    public static /* synthetic */ Object ipc$super(DetailWeexModule detailWeexModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/base/weex/DetailWeexModule");
    }

    @JSMethod
    public void dispatchMessage(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763590d1", new Object[]{this, map});
        } else {
            dispatchMessage(map, this);
        }
    }

    @Override // tb.uce
    public void fireEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f0e3fb", new Object[]{this, str, jSONObject});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if (wXSDKInstance != null && wXSDKInstance.getRootComponent() != null) {
            WXSDKInstance wXSDKInstance2 = this.mWXSDKInstance;
            wXSDKInstance2.y(wXSDKInstance2.getRootComponent().getRef(), str, jSONObject);
        }
    }

    @Override // tb.uce
    public String getBundleUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dee20482", new Object[]{this});
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if (wXSDKInstance != null) {
            return wXSDKInstance.getBundleUrl();
        }
        return "";
    }

    @Override // tb.uce
    public View getContainerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3268c19", new Object[]{this});
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if (wXSDKInstance != null) {
            return wXSDKInstance.getContainerView();
        }
        return null;
    }

    @Override // tb.uce
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if (wXSDKInstance != null) {
            return wXSDKInstance.getContext();
        }
        return null;
    }

    @JSMethod
    public void onMessage(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce0e879", new Object[]{this, jSCallback});
            return;
        }
        this.mWXSDKInstance.getBundleUrl();
        this.mCallbacks.add(jSCallback);
    }

    public static void dispatchMessage(Map<String, Object> map, uce uceVar) {
        List<Event> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f0f40a", new Object[]{map, uceVar});
        } else if (map != null && uceVar != null) {
            View containerView = uceVar.getContainerView();
            int i = -1;
            if (r19.w0() && (uceVar instanceof DetailWeexV2Module)) {
                i = uceVar.hashCode();
            }
            if (containerView != null) {
                Object tag = containerView.getTag(1188984821);
                Object tag2 = containerView.getTag(-1607140204);
                JSONObject jSONObject = new JSONObject(map);
                if (tag != null) {
                    jSONObject.put(hxj.UNIQID, tag);
                } else {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                    if (jSONObject2 != null) {
                        String string = jSONObject2.getString("nid");
                        if (!TextUtils.isEmpty(string)) {
                            jSONObject.put(hxj.UNIQID, (Object) string);
                        } else {
                            jSONObject.put(hxj.UNIQID, (Object) jSONObject2.getString("itemId"));
                        }
                    }
                }
                try {
                    txj.e(txj.TAG_RENDER, "收到来自weex: " + uceVar.getBundleUrl() + "的消息：" + JSON.toJSONString(map));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jSONObject.put("callback", (Object) new b(i, uceVar, null));
                if (tag2 instanceof String) {
                    list = hxj.c((String) tag2, jSONObject);
                } else {
                    list = hxj.c(null, jSONObject);
                }
                if (list != null) {
                    Object tag3 = containerView.getTag(1882865001);
                    if (tag3 != null) {
                        for (Event event : list) {
                            rj8.d(tag3, event);
                        }
                        return;
                    }
                    for (Event event2 : list) {
                        rj8.d(uceVar.getContext(), event2);
                    }
                }
            }
        }
    }

    private static void processBatchDispatchMessage(int i, JSONObject jSONObject, uce uceVar, com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96980978", new Object[]{new Integer(i), jSONObject, uceVar, aVar});
            return;
        }
        if (sCacheBatchCount == null) {
            sCacheBatchCount = new HashMap<>();
        }
        if (sCacheHasPostCheck == null) {
            sCacheHasPostCheck = new HashMap<>();
        }
        if (sCacheMap == null) {
            sCacheMap = new HashMap<>();
        }
        JSONObject jSONObject2 = sCacheMap.get(Integer.valueOf(i));
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
            sCacheMap.put(Integer.valueOf(i), jSONObject2);
        }
        Boolean bool = sCacheHasPostCheck.get(Integer.valueOf(i));
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        jSONObject2.putAll(jSONObject);
        Integer num = sCacheBatchCount.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue() + 1;
        Integer valueOf = Integer.valueOf(intValue);
        sCacheBatchCount.put(Integer.valueOf(i), valueOf);
        if (intValue >= 8) {
            if (!r19.C0()) {
                txj.e(txj.TAG_TIP, "static batchFireEvent , batchCountFull , eventCount = " + valueOf);
            }
            sCacheMap.put(Integer.valueOf(i), new JSONObject());
            if (aVar != null) {
                aVar.fireEvent(2, "newdetailcallback", jSONObject2);
            } else if (uceVar != null) {
                uceVar.fireEvent("newdetailcallback", jSONObject2);
            }
            if (!r19.C0()) {
                txj.e(txj.TAG_RENDER, "[缓存] weex数据流 向weex发消息：" + JSON.toJSONString(jSONObject2.keySet()));
            }
            sCacheBatchCount.put(Integer.valueOf(i), 0);
        } else if (!bool.booleanValue() || intValue == 1) {
            r19.d0().postDelayed(new a(i, aVar, uceVar), r19.f0());
        }
    }
}
