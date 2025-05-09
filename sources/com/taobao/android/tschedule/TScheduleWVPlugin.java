package com.taobao.android.tschedule;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tschedule.taskcontext.RenderTaskContext;
import java.util.List;
import org.json.JSONObject;
import tb.kpw;
import tb.nms;
import tb.nsw;
import tb.sms;
import tb.t2o;
import tb.zdh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TScheduleWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String GET_DATA = "getData";
    private static final String GET_PRE_RENDER_MODULES = "getPreRenderModules";
    private static final String NOTIFY_PAGE_READY = "notifyPageReady";
    private static final String SAVE_DATA = "saveData";
    public static final String TAG = "TS.TScheduleWVPlugin";

    static {
        t2o.a(329252887);
    }

    private String fetchPreRenderStaticData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1829938", new Object[]{this, str});
        }
        try {
            List<ScheduleTask> e = nms.e(str);
            if (e == null || e.isEmpty()) {
                return null;
            }
            T t = e.get(0).taskContext;
            if (t instanceof RenderTaskContext) {
                return ((RenderTaskContext) t).params.staticData;
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static /* synthetic */ Object ipc$super(TScheduleWVPlugin tScheduleWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/TScheduleWVPlugin");
    }

    private boolean notifyPageReady(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93d6b49d", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        zdh.a(TAG, "TS jsBridge【h5通知客户端渲染完成】     params = " + str);
        return true;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        zdh.a(TAG, "jsBridge action = " + str);
        if (GET_PRE_RENDER_MODULES.equals(str)) {
            return getPreRenderModules(str2, wVCallBackContext);
        }
        if (NOTIFY_PAGE_READY.equals(str)) {
            return notifyPageReady(str2, wVCallBackContext);
        }
        if (SAVE_DATA.equals(str)) {
            return saveData(str2, wVCallBackContext);
        }
        if (GET_DATA.equals(str)) {
            return getData(str2, wVCallBackContext);
        }
        return false;
    }

    private boolean getData(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d435db72", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        nsw nswVar = new nsw();
        try {
            String optString = new JSONObject(str).optString("key");
            if (!TextUtils.isEmpty(optString)) {
                String g = sms.f().g(optString);
                if (g != null) {
                    nswVar.b("result", g);
                    wVCallBackContext.success(nswVar);
                    zdh.a(TAG, "jsBridge getData.key = " + optString + ";success");
                    return true;
                }
                nswVar.b("errMsg", "local data not exist");
                wVCallBackContext.error(nswVar);
                return false;
            }
            nswVar.b("errMsg", "input key is empty");
            wVCallBackContext.error(nswVar);
            return false;
        } catch (Throwable th) {
            nswVar.b("errMsg", th.getMessage());
            wVCallBackContext.error(nswVar);
            return false;
        }
    }

    private boolean getPreRenderModules(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a80c3cf6", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        nsw nswVar = new nsw();
        try {
            String string = new JSONObject(str).getString("biz");
            if (!TextUtils.isEmpty(string)) {
                sms f = sms.f();
                String g = f.g(string + sms.CDN_SUFFIX);
                zdh.a(TAG, "getPreRenderModules biz = " + string + ";dataCDN = " + g);
                if (TextUtils.isEmpty(g)) {
                    nswVar.b("errMsg", "预渲染task里没有配置静态数据的cdn地址");
                    wVCallBackContext.error(nswVar);
                    return false;
                }
                String g2 = sms.f().g(g);
                if (!TextUtils.isEmpty(g2)) {
                    nswVar.d("result", new JSONObject(g2));
                    wVCallBackContext.success(nswVar);
                    zdh.a(TAG, "getPreRenderModules success biz = " + string);
                    return true;
                }
                nswVar.b("errMsg", "本地没有cdn对应的静态数据，可能还没下载完成。cdn = " + g);
                wVCallBackContext.error(nswVar);
                return false;
            }
            nswVar.b("errMsg", "bizKey is empty");
            wVCallBackContext.error(nswVar);
            return false;
        } catch (Throwable th) {
            nswVar.b("errMsg", th.getMessage());
            wVCallBackContext.error(nswVar);
            return false;
        }
    }

    private boolean saveData(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcd50559", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        nsw nswVar = new nsw();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("key");
            String string2 = parseObject.getString("value");
            if (!TextUtils.isEmpty(string)) {
                boolean i = sms.f().i(string, string2);
                zdh.a(TAG, "jsBridge saveData.key = " + string + ";isSuccess = " + i);
                StringBuilder sb = new StringBuilder("saveData success.key = ");
                sb.append(string);
                nswVar.b("result", sb.toString());
                wVCallBackContext.success(nswVar);
            } else {
                nswVar.b("errMsg", "key is empty");
                wVCallBackContext.error(nswVar);
            }
        } catch (Exception e) {
            nswVar.b("errMsg", e.getMessage());
            wVCallBackContext.error(nswVar);
        }
        return true;
    }
}
