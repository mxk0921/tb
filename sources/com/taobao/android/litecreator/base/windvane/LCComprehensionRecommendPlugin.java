package com.taobao.android.litecreator.base.windvane;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.comprehension.ContentComprehensionResult;
import com.taobao.android.litecreator.comprehension.ContentComprehensionTool;
import com.taobao.umipublish.extension.windvane.call.WindvaneCall;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import tb.kpw;
import tb.m3v;
import tb.mkd;
import tb.muu;
import tb.n3e;
import tb.nsw;
import tb.odg;
import tb.sug;
import tb.t2o;
import tb.trt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LCComprehensionRecommendPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLASS_NAME = "GGComprehensionTool";
    public static final String METHOD_NAME_QUERY_COPYRIGHT_INFO = "queryContentAudioCopyrightInfo";
    public static final String METHOD_NAME_QUERY_RESULT = "queryResult";
    public static final String METHOD_OFFER_CONTENT = "offerContent";
    public static final String METHOD_OFFER_INFOS = "offerPublishInfos";
    public static final String METHOD_OFFER_ITEMS = "offerItems";
    public static final String TAG = "LCComprehensionRecommendPlugin";
    public static String MATERIAL_LE_VERSION = "";
    private static boolean mIsQuerying = false;
    private static ArrayList<Runnable> mPendingQueryTasks = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements sug.a<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f8243a;

        public a(LCComprehensionRecommendPlugin lCComprehensionRecommendPlugin, List list) {
            this.f8243a = list;
        }

        @Override // tb.sug.a
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5fa5979f", new Object[]{this, obj});
            } else if (obj instanceof String) {
                this.f8243a.add((String) obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8245a;
        public final /* synthetic */ WVCallBackContext b;

        public c(String str, WVCallBackContext wVCallBackContext) {
            this.f8245a = str;
            this.b = wVCallBackContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                LCComprehensionRecommendPlugin.access$300(LCComprehensionRecommendPlugin.this, this.f8245a, this.b);
            }
        }
    }

    static {
        t2o.a(511705150);
    }

    public static /* synthetic */ void access$000(LCComprehensionRecommendPlugin lCComprehensionRecommendPlugin, ContentComprehensionResult contentComprehensionResult, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db516c6a", new Object[]{lCComprehensionRecommendPlugin, contentComprehensionResult, wVCallBackContext});
        } else {
            lCComprehensionRecommendPlugin.callbackWindVane(contentComprehensionResult, wVCallBackContext);
        }
    }

    public static /* synthetic */ boolean access$102(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z)})).booleanValue();
        }
        mIsQuerying = z;
        return z;
    }

    public static /* synthetic */ void access$200(LCComprehensionRecommendPlugin lCComprehensionRecommendPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5626ab7b", new Object[]{lCComprehensionRecommendPlugin});
        } else {
            lCComprehensionRecommendPlugin.scheduleNextQueryTask();
        }
    }

    public static /* synthetic */ void access$300(LCComprehensionRecommendPlugin lCComprehensionRecommendPlugin, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e71c0e61", new Object[]{lCComprehensionRecommendPlugin, str, wVCallBackContext});
        } else {
            lCComprehensionRecommendPlugin.queryResultSafe(str, wVCallBackContext);
        }
    }

    private Runnable buildQueryTask(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("ce500847", new Object[]{this, str, wVCallBackContext});
        }
        return new c(str, wVCallBackContext);
    }

    private void callbackWindVane(ContentComprehensionResult contentComprehensionResult, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23618391", new Object[]{this, contentComprehensionResult, wVCallBackContext});
        } else if (contentComprehensionResult == null) {
            wVCallBackContext.error(new nsw("HY_FAILED"));
        } else {
            nsw nswVar = new nsw("HY_SUCCESS");
            nswVar.h(contentComprehensionResult.bizData);
            wVCallBackContext.success(nswVar);
        }
    }

    private long getLong(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{this, str, new Long(j)})).longValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return j;
            }
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return j;
        }
    }

    public static /* synthetic */ Object ipc$super(LCComprehensionRecommendPlugin lCComprehensionRecommendPlugin, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/base/windvane/LCComprehensionRecommendPlugin");
    }

    private void offerContent(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c84b1d8b", new Object[]{this, str, wVCallBackContext});
            return;
        }
        ContentComprehensionTool findComprehensionTool = findComprehensionTool();
        if (findComprehensionTool == null || TextUtils.isEmpty(str)) {
            wVCallBackContext.error();
        } else {
            findComprehensionTool.B(JSON.parseObject(str).getString("content"));
        }
    }

    private void offerItems(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("399a5d12", new Object[]{this, str, wVCallBackContext});
            return;
        }
        ContentComprehensionTool findComprehensionTool = findComprehensionTool();
        if (findComprehensionTool == null || TextUtils.isEmpty(str)) {
            wVCallBackContext.error();
            return;
        }
        JSONArray jSONArray = JSON.parseObject(str).getJSONArray("itemIds");
        ArrayList arrayList = new ArrayList();
        sug.a(jSONArray, new a(this, arrayList));
        findComprehensionTool.H(arrayList);
    }

    private void offerPublishInfos(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bbd3f00", new Object[]{this, str, wVCallBackContext});
            return;
        }
        ContentComprehensionTool findComprehensionTool = findComprehensionTool();
        if (findComprehensionTool == null || TextUtils.isEmpty(str)) {
            wVCallBackContext.error();
        } else {
            findComprehensionTool.I(JSON.parseObject(str));
        }
    }

    private void scheduleNextQueryTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3463a6a", new Object[]{this});
        } else if (mPendingQueryTasks.size() > 0) {
            odg.d(TAG, "execute next query task.");
            Runnable runnable = mPendingQueryTasks.get(0);
            trt.c(runnable);
            mPendingQueryTasks.remove(runnable);
        }
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements mkd<ContentComprehensionResult> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f8244a;

        public b(WVCallBackContext wVCallBackContext) {
            this.f8244a = wVCallBackContext;
        }

        /* renamed from: b */
        public void a(ContentComprehensionResult contentComprehensionResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7bd3166", new Object[]{this, contentComprehensionResult});
                return;
            }
            odg.d(LCComprehensionRecommendPlugin.TAG, "query result finished. data = " + contentComprehensionResult);
            LCComprehensionRecommendPlugin.access$000(LCComprehensionRecommendPlugin.this, contentComprehensionResult, this.f8244a);
            LCComprehensionRecommendPlugin.access$102(false);
            LCComprehensionRecommendPlugin.access$200(LCComprehensionRecommendPlugin.this);
        }
    }

    private void queryResult(String str, mkd<ContentComprehensionResult> mkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("172a4ea9", new Object[]{this, str, mkdVar});
            return;
        }
        ContentComprehensionTool findComprehensionTool = findComprehensionTool();
        JSONObject parseObject = JSON.parseObject(str);
        JSONArray jSONArray = parseObject.getJSONArray("recommendKeys");
        long j = getLong(parseObject.getString("timeout"), 5000L);
        JSONObject jSONObject = new JSONObject();
        JSONArray parseArray = JSON.parseArray(findComprehensionLabel());
        jSONObject.put("materialVersion", (Object) MATERIAL_LE_VERSION);
        jSONObject.put("labels", (Object) parseArray);
        JSONArray jSONArray2 = new JSONArray();
        String str2 = "topic";
        jSONArray2.add(str2);
        if (jSONArray == null) {
            jSONArray = jSONArray2;
        }
        String string = jSONArray.getString(0);
        if (!TextUtils.isEmpty(string)) {
            str2 = string;
        }
        if (j <= 0) {
            mkdVar.a(findComprehensionTool.Q(str2));
            return;
        }
        findComprehensionTool.X(str2, jSONArray, jSONObject);
        findComprehensionTool.N(str2, mkdVar);
    }

    private String findComprehensionLabel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c18a5930", new Object[]{this});
        }
        Context context = this.mContext;
        if (!(context instanceof n3e)) {
            odg.c(TAG, "the host is not a ugc node.");
            return "";
        }
        IUGCMedia n = muu.n(context);
        if (n != null) {
            return (String) n.getMeta("ugc_labels");
        }
        odg.c(TAG, "can not find label!");
        return "";
    }

    private ContentComprehensionTool findComprehensionTool() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentComprehensionTool) ipChange.ipc$dispatch("d8ba6e69", new Object[]{this});
        }
        Context context = this.mContext;
        if (!(context instanceof n3e)) {
            odg.c(TAG, "the host is not a ugc node.");
            return null;
        }
        IUGCMedia n = muu.n(context);
        if (n != null) {
            return ContentComprehensionTool.s(n.getPublishSessionId());
        }
        odg.c(TAG, "can not find data!");
        return null;
    }

    private void queryContentAudioCopyrightInfo(String str, WVCallBackContext wVCallBackContext) {
        JSONException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d411b49e", new Object[]{this, str, wVCallBackContext});
            return;
        }
        ContentComprehensionTool findComprehensionTool = findComprehensionTool();
        if (findComprehensionTool == null || TextUtils.isEmpty(str)) {
            wVCallBackContext.error();
            return;
        }
        ContentComprehensionResult Q = findComprehensionTool.Q("recognizeVideoMusic");
        nsw nswVar = new nsw("HY_SUCCESS");
        org.json.JSONObject jSONObject = Q.bizData;
        try {
        } catch (JSONException e2) {
            e = e2;
            jSONObject = jSONObject;
        }
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("isValid", false);
            } catch (JSONException e3) {
                e = e3;
                e.printStackTrace();
                nswVar.h(jSONObject);
                wVCallBackContext.success(nswVar);
            }
            nswVar.h(jSONObject);
            wVCallBackContext.success(nswVar);
        }
        jSONObject.put("isValid", true);
        nswVar.h(jSONObject);
        wVCallBackContext.success(nswVar);
    }

    private void queryResultOneByOne(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c02f7bc", new Object[]{this, str, wVCallBackContext});
            return;
        }
        Runnable buildQueryTask = buildQueryTask(str, wVCallBackContext);
        if (mIsQuerying) {
            mPendingQueryTasks.add(buildQueryTask);
            odg.d(TAG, "query task was running, then waiting.");
            return;
        }
        trt.h(buildQueryTask);
    }

    private void queryResultSafe(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4cc500", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            odg.d(TAG, "query result start.");
            mIsQuerying = true;
            queryResult(str, new b(wVCallBackContext));
        } catch (Throwable unused) {
            odg.c(TAG, "query result exception.");
            callbackWindVane(null, wVCallBackContext);
            mIsQuerying = false;
            scheduleNextQueryTask();
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("className", CLASS_NAME);
        hashMap.put("funcName", str);
        new m3v("Page_GGTabs", "gg111.19920601").a(WindvaneCall.TAG, hashMap, true);
        if (METHOD_NAME_QUERY_RESULT.equals(str)) {
            queryResultOneByOne(str2, wVCallBackContext);
            return true;
        } else if (METHOD_OFFER_CONTENT.equals(str)) {
            offerContent(str2, wVCallBackContext);
            return true;
        } else if (METHOD_OFFER_ITEMS.equals(str)) {
            offerItems(str2, wVCallBackContext);
            return true;
        } else if (METHOD_OFFER_INFOS.equals(str)) {
            offerPublishInfos(str2, wVCallBackContext);
            return true;
        } else if (!METHOD_NAME_QUERY_COPYRIGHT_INFO.equals(str)) {
            return false;
        } else {
            queryContentAudioCopyrightInfo(str2, wVCallBackContext);
            return true;
        }
    }
}
