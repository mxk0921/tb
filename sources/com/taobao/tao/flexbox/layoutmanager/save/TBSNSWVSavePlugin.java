package com.taobao.tao.flexbox.layoutmanager.save;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.umipublish.draft.DraftManager;
import org.json.JSONObject;
import tb.k8h;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBSNSWVSavePlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String SAVE = DraftManager.ACTION_TYPE_SAVE;

    static {
        t2o.a(502268329);
    }

    public static /* synthetic */ Object ipc$super(TBSNSWVSavePlugin tBSNSWVSavePlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/save/TBSNSWVSavePlugin");
    }

    private boolean save(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30121052", new Object[]{this, str})).booleanValue();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("src");
            String optString2 = jSONObject.optString("waterMarkText");
            String optString3 = jSONObject.optString("waterMarkIconUrl");
            k8h k8hVar = new k8h(this.mContext, optString);
            k8hVar.t(optString2, optString3);
            k8hVar.o();
        } catch (Exception e) {
            TLog.loge("TBSNSWVSavePlugin", "save exception", e);
        }
        return false;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (DraftManager.ACTION_TYPE_SAVE.equals(str)) {
            return save(str2);
        }
        return false;
    }
}
