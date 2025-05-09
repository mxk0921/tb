package com.etao.feimagesearch.result;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.datapoints.StatisticalDataPoint$PageName;
import com.etao.feimagesearch.util.ImageSearchMtopUtil;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.ut.device.UTDevice;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import tb.agh;
import tb.caa;
import tb.cw1;
import tb.dwh;
import tb.gd2;
import tb.h19;
import tb.hgw;
import tb.jzu;
import tb.lg4;
import tb.mno;
import tb.p7m;
import tb.pvh;
import tb.qrl;
import tb.t2o;
import tb.v4s;
import tb.vlf;
import tb.z7m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IrpMuiseModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_IRP_USER_DATA = "IrpUserData";
    private static final String LOG_TAG = "IrpMuiseModule";
    public static final String NAME = "TBSImageSearchModule";

    static {
        t2o.a(481297417);
    }

    public IrpMuiseModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    private cw1 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cw1) ipChange.ipc$dispatch("5bb5be0c", new Object[]{this});
        }
        Context uIContext = getInstance().getUIContext();
        if (uIContext instanceof vlf) {
            return ((vlf) uIContext).getPresenter();
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(IrpMuiseModule irpMuiseModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/result/IrpMuiseModule");
    }

    private RectF parseRemoteRegion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("f6b117a9", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        if (split.length != 4) {
            return null;
        }
        try {
            return new RectF(Float.parseFloat(split[0]), Float.parseFloat(split[2]), Float.parseFloat(split[1]), Float.parseFloat(split[3]));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String parseUTArgs(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e1d6bb8", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return "";
        }
        Iterator<String> keys = jSONObject.keys();
        StringBuilder sb = new StringBuilder();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            sb.append(",");
            sb.append(next);
            sb.append("=");
            sb.append(optString);
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2) || sb2.length() <= 1) {
            return "";
        }
        return sb2.substring(1);
    }

    private void utItemClick(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bffde5fb", new Object[]{this, str, str2, str3});
            return;
        }
        StringBuilder sb = new StringBuilder("pssource=" + str3);
        sb.append(",utdid=" + UTDevice.getUtdid(getInstance().getUIContext()));
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        jzu.j(StatisticalDataPoint$PageName.PHOTO_SEARCH_RESULT.getPageName(), str2, sb.toString());
    }

    @MUSMethod
    public void clearIrpUserParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d82b2", new Object[]{this});
        } else if (c() != null) {
            mno.d(caa.c(), KEY_IRP_USER_DATA);
        }
    }

    @MUSMethod
    public void closeIrpPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93f48c05", new Object[]{this});
            return;
        }
        cw1 c = c();
        if (c != null) {
            c.a();
        }
    }

    @MUSMethod
    public void deleteRegionPageData(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4441e4", new Object[]{this, new Integer(i)});
            return;
        }
        cw1 c = c();
        if (c != null) {
            c.c().b(Integer.valueOf(i));
        }
    }

    @MUSMethod(uiThread = false)
    public void finishMonitor(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cc02662", new Object[]{this, jSONObject});
        }
    }

    @MUSMethod
    public void getCurrentObject(pvh pvhVar) {
        cw1 c;
        Bitmap q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41c53092", new Object[]{this, pvhVar});
        } else if (pvhVar != null && (c = c()) != null && (q = c.q()) != null) {
            com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
            jSONObject.put("content", (Object) ("data:image/base64," + gd2.c(q, Bitmap.CompressFormat.JPEG, 100)));
            pvhVar.b(jSONObject);
        }
    }

    @MUSMethod(uiThread = true)
    public void hideKeyboard(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d86d9a0", new Object[]{this, jSONObject});
            return;
        }
        cw1 c = c();
        if (c != null) {
            agh.a(LOG_TAG, MspEventTypes.ACTION_STRING_HIDE_KEYBOARD);
            c.hideKeyboard();
        }
    }

    @MUSMethod(uiThread = true)
    public void initSearchResult(com.alibaba.fastjson.JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        Map<String, Object> y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20cf3f66", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        cw1 c = c();
        if (c != null && (y = c.y()) != null) {
            pvhVar.b(y);
        }
    }

    @MUSMethod
    public void notifyUserRetainPop(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aff74791", new Object[]{this, jSONObject});
            return;
        }
        cw1 c = c();
        if (c != null && !TextUtils.isEmpty(h19.i(jSONObject, "popLayerUrl", ""))) {
            c.v(jSONObject);
        }
    }

    @MUSMethod(uiThread = true)
    public void recordPageOperated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("213c4287", new Object[]{this});
        } else if (getInstance() != null && !getInstance().isDestroyed()) {
            Context uIContext = getInstance().getUIContext();
            if (uIContext instanceof vlf) {
                vlf vlfVar = (vlf) uIContext;
                if (vlfVar.getPresenter() != null) {
                    vlfVar.getPresenter().d();
                }
            }
        }
    }

    @MUSMethod(uiThread = false)
    public void reportError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd48c5", new Object[]{this, str});
        } else {
            p7m.a("irpLog", str);
        }
    }

    @MUSMethod(uiThread = true)
    public void scrollTo(com.alibaba.fastjson.JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adf842b3", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        cw1 c = c();
        if (c != null) {
            agh.a(LOG_TAG, "scrollTo");
            c.C(jSONObject.getString("position"));
        }
    }

    @MUSMethod
    public void setQueryTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1d13c5", new Object[]{this, str});
            return;
        }
        cw1 c = c();
        if (c != null) {
            c.k(str);
        }
    }

    @MUSMethod
    public void setQueryText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b729aa24", new Object[]{this, str});
            return;
        }
        cw1 c = c();
        if (c != null) {
            c.f(str);
        }
    }

    @MUSMethod(uiThread = true)
    public void showSettingPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e18d9d38", new Object[]{this});
        } else if (getInstance() != null && !getInstance().isDestroyed() && getInstance().getUIContext() != null) {
            hgw.c(getInstance().getUIContext());
        }
    }

    @MUSMethod(uiThread = false)
    public void startMonitor(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238823b1", new Object[]{this, jSONObject});
        }
    }

    @MUSMethod
    public void storageIrpUserParams(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("368e3b2c", new Object[]{this, jSONObject});
        } else if (c() != null) {
            String i = h19.i(jSONObject, "params", "");
            if (!TextUtils.isEmpty(i)) {
                mno.h(caa.c(), KEY_IRP_USER_DATA, i);
            }
        }
    }

    @MUSMethod
    public void storageRegionPageData(com.alibaba.fastjson.JSONObject jSONObject) {
        int g;
        com.alibaba.fastjson.JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb487701", new Object[]{this, jSONObject});
            return;
        }
        cw1 c = c();
        if (c != null && (g = h19.g(jSONObject, "regionIndex", -1)) >= 0 && (d = h19.d(jSONObject, "data")) != null) {
            c.c().a(Integer.valueOf(g), d);
        }
    }

    @MUSMethod
    public void switchMultiObject(com.alibaba.fastjson.JSONObject jSONObject) {
        int e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8703d7c5", new Object[]{this, jSONObject});
            return;
        }
        cw1 c = c();
        if (c != null && (e = qrl.e(jSONObject.getString("imageId"), -1)) >= 0) {
            c.h(e);
        }
    }

    @MUSMethod(uiThread = false)
    public void tLog(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738db19", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            try {
                p7m.a("irpLog", jSONObject.toJSONString());
            } catch (Throwable unused) {
            }
        }
    }

    @MUSMethod(uiThread = true)
    public void updateTopbarStyle(com.alibaba.fastjson.JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5b4ff1", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        cw1 c = c();
        if (c != null) {
            String i = h19.i(jSONObject, "style", "");
            if (!TextUtils.isEmpty(i)) {
                c.E(i);
            }
        }
    }

    @MUSMethod(uiThread = true)
    public void userClickedResultViewHeader(com.alibaba.fastjson.JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("242b5bb0", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else if (jSONObject != null) {
            try {
                int parseInt = Integer.parseInt(jSONObject.getString("index"));
                cw1 c = c();
                if (c != null) {
                    c.h(parseInt);
                }
            } catch (Exception e) {
                dwh.h("userClickedResultViewHeader", e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f4861a;
        public final /* synthetic */ pvh b;

        public a(Bitmap bitmap, pvh pvhVar) {
            this.f4861a = bitmap;
            this.b = pvhVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
            jSONObject.put("isSuccess", (Object) Boolean.TRUE);
            jSONObject.put(ImageSearchMtopUtil.KEY_IMG, (Object) gd2.c(this.f4861a, Bitmap.CompressFormat.JPEG, 100));
            this.b.b(jSONObject);
            this.f4861a.recycle();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f4862a;
        public final /* synthetic */ pvh b;

        public b(Bitmap bitmap, pvh pvhVar) {
            this.f4862a = bitmap;
            this.b = pvhVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String c = gd2.c(this.f4862a, Bitmap.CompressFormat.JPEG, 100);
            com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
            jSONObject.put("isSuccess", (Object) Boolean.TRUE);
            jSONObject.put(ImageSearchMtopUtil.KEY_IMG, (Object) c);
            this.b.b(jSONObject);
        }
    }

    @MUSMethod(uiThread = true)
    public void backHandled(com.alibaba.fastjson.JSONObject jSONObject) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdffbc14", new Object[]{this, jSONObject});
            return;
        }
        cw1 c = c();
        if (c != null) {
            agh.a(LOG_TAG, "backHandled");
            if (jSONObject != null && jSONObject.containsKey("status")) {
                z = jSONObject.getBooleanValue("status");
            }
            if (!z) {
                c.u();
            }
        }
    }

    @MUSMethod(uiThread = true)
    public void loadFinished(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c7409", new Object[]{this, str});
            return;
        }
        cw1 c = c();
        if (c != null) {
            agh.a(LOG_TAG, "loadFinish");
            c.j(str, true);
        }
    }

    @MUSMethod(uiThread = true)
    public void stickyToTop(com.alibaba.fastjson.JSONObject jSONObject) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be763978", new Object[]{this, jSONObject});
            return;
        }
        cw1 c = c();
        if (c != null) {
            agh.a(LOG_TAG, "stickyToTop");
            if (jSONObject != null && jSONObject.containsKey("sticky")) {
                z = jSONObject.getBooleanValue("sticky");
            }
            c.n(z);
        }
    }

    @MUSMethod(uiThread = true)
    public void updateTextSearchStatus(com.alibaba.fastjson.JSONObject jSONObject) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f25b5cd9", new Object[]{this, jSONObject});
            return;
        }
        cw1 c = c();
        if (c != null) {
            agh.a(LOG_TAG, "updateTextSearchStatus");
            if (jSONObject != null && jSONObject.containsKey("status")) {
                z = jSONObject.getBooleanValue("status");
            }
            c.e(z);
        }
    }

    @MUSMethod
    public void updateUserAllowanceState(com.alibaba.fastjson.JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66012925", new Object[]{this, jSONObject, pvhVar});
            return;
        }
        cw1 c = c();
        if (c != null && h19.e(jSONObject, "hasAllowance", false)) {
            c.m(jSONObject);
        }
    }

    @MUSMethod(uiThread = true)
    public void utCtrlClick(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e50b80b", new Object[]{this, jSONObject});
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            String optString = jSONObject2.optString("Page");
            String optString2 = jSONObject2.optString("Ctrl");
            JSONObject optJSONObject = jSONObject2.optJSONObject("Args");
            if (TextUtils.isEmpty(optString)) {
                optString = StatisticalDataPoint$PageName.PHOTO_SEARCH_RESULT.getPageName();
            }
            if (TextUtils.isEmpty(optString2)) {
                optString2 = "unknown";
            }
            String parseUTArgs = parseUTArgs(optJSONObject);
            if ("ItemClick".equals(optString2) && (getInstance().getUIContext() instanceof vlf)) {
                utItemClick("," + parseUTArgs, "ItemClick", ((vlf) getInstance().getContext()).S());
            } else if (!TextUtils.isEmpty(parseUTArgs)) {
                jzu.j(optString, optString2, parseUTArgs);
            } else {
                jzu.j(optString, optString2, new String[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @MUSMethod
    public void cropIrpSrcImage(String str, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be0ece8", new Object[]{this, str, pvhVar});
        } else if (pvhVar != null) {
            cw1 c = c();
            if (c == null) {
                com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                jSONObject.put("isSuccess", (Object) Boolean.FALSE);
                jSONObject.put("errMsg", (Object) "native context is null");
                pvhVar.b(jSONObject);
                return;
            }
            RectF p = c.p(str);
            if (p == null) {
                com.alibaba.fastjson.JSONObject jSONObject2 = new com.alibaba.fastjson.JSONObject();
                jSONObject2.put("isSuccess", (Object) Boolean.FALSE);
                jSONObject2.put("errMsg", (Object) "region is invalid");
                pvhVar.b(jSONObject2);
                return;
            }
            Bitmap s = c.s();
            if (s == null || s.isRecycled()) {
                com.alibaba.fastjson.JSONObject jSONObject3 = new com.alibaba.fastjson.JSONObject();
                jSONObject3.put("isSuccess", (Object) Boolean.FALSE);
                jSONObject3.put("errMsg", (Object) "src img is null");
                pvhVar.b(jSONObject3);
                return;
            }
            Bitmap d = gd2.d(s, p);
            if (d == null) {
                com.alibaba.fastjson.JSONObject jSONObject4 = new com.alibaba.fastjson.JSONObject();
                jSONObject4.put("isSuccess", (Object) Boolean.FALSE);
                jSONObject4.put("errMsg", (Object) "crop exception");
                pvhVar.b(jSONObject4);
                return;
            }
            z7m.c(new a(d, pvhVar));
        }
    }

    @MUSMethod
    public void getDebugInfo(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17cf7db", new Object[]{this, pvhVar});
        } else if (pvhVar != null) {
            com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
            jSONObject.put(v4s.PARAM_IS_DEBUG, (Object) Boolean.valueOf(caa.q()));
            pvhVar.b(jSONObject);
        }
    }

    @MUSMethod
    public void getIrpSrcImage(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5c78d8", new Object[]{this, pvhVar});
        } else if (pvhVar != null) {
            cw1 c = c();
            if (c == null) {
                com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                jSONObject.put("isSuccess", (Object) Boolean.FALSE);
                jSONObject.put("errMsg", (Object) "native context is null");
                pvhVar.b(jSONObject);
                return;
            }
            Bitmap s = c.s();
            if (s == null || s.isRecycled()) {
                com.alibaba.fastjson.JSONObject jSONObject2 = new com.alibaba.fastjson.JSONObject();
                jSONObject2.put("isSuccess", (Object) Boolean.FALSE);
                jSONObject2.put("errMsg", (Object) "src img is null");
                pvhVar.b(jSONObject2);
                return;
            }
            z7m.c(new b(s, pvhVar));
        }
    }

    @MUSMethod
    public void getIrpUserParams(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ada3772", new Object[]{this, pvhVar});
        } else if (pvhVar != null) {
            String c = mno.c(caa.c(), KEY_IRP_USER_DATA);
            com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
            jSONObject.put("params", (Object) c);
            pvhVar.b(jSONObject);
        }
    }

    @MUSMethod(uiThread = false)
    public final void getOrangeConfig(com.alibaba.fastjson.JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1aaf15", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            String string = jSONObject.getString("group");
            String string2 = jSONObject.getString("config");
            String string3 = jSONObject.getString("default");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                String f2 = lg4.f2(string, string2, string3);
                com.alibaba.fastjson.JSONObject jSONObject2 = new com.alibaba.fastjson.JSONObject();
                jSONObject2.put("result", (Object) f2);
                pvhVar.b(jSONObject2);
                return;
            }
            pvhVar2.b(new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @MUSMethod(uiThread = true)
    public void initSearchParams(com.alibaba.fastjson.JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bdd7d1d", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        cw1 c = c();
        if (c != null) {
            agh.a(LOG_TAG, "initSearchParams");
            pvhVar.b(c.b());
        }
    }

    @MUSMethod(uiThread = true)
    public void updateContext(com.alibaba.fastjson.JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3151cff5", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        cw1 c = c();
        if (c != null && jSONObject != null) {
            String i = h19.i(jSONObject, "action", "");
            if (!TextUtils.isEmpty(i)) {
                if (TextUtils.equals("showListHeaderBg", i)) {
                    String i2 = h19.i(h19.d(jSONObject, "config"), "bgImgUrl", "");
                    if (!TextUtils.isEmpty(i2)) {
                        c.r(true, i2);
                    }
                } else if (TextUtils.equals("hideListHeaderBg", i)) {
                    c.r(false, "");
                } else if (TextUtils.equals("updateCurTab", i)) {
                    c.g(qrl.e(h19.i(jSONObject, "tabIndex", "0"), 0));
                } else if (TextUtils.equals("notifyTabAreaVisibleState", i)) {
                    c.i(qrl.a(h19.i(jSONObject, "isVisible", "false"), false));
                } else if (TextUtils.equals("operateAISearchBarState", i)) {
                    com.alibaba.fastjson.JSONObject d = h19.d(jSONObject, "config");
                    c.w(qrl.a(h19.i(d, "isShow", "false"), false), qrl.a(h19.i(d, "isFocus", "false"), false), h19.d(d, "params"));
                } else if (TextUtils.equals("updateAISearchBarRcmdConfig", i)) {
                    c.x(h19.d(h19.d(jSONObject, "config"), "prompt"));
                }
            }
        }
    }
}
