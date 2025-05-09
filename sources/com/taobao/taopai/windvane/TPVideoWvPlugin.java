package com.taobao.taopai.windvane;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.taopai.business.common.ReturnType;
import java.util.HashMap;
import java.util.Map;
import tb.h8u;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.tep;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TPVideoWvPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION = "openRecord";
    public static final String KEY_PAGE_URL = "pageUrl";
    public static final String PLUGIN_NAME = "TaoPaiWVPlugin";
    private static final int REQUEST_CODE_FROM_EDIT = 60001;
    private static final String TAG = "TPVideoWvPlugin";
    private String mBizScene = "";
    private WVCallBackContext mWVCallBackContext;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends TypeReference<HashMap<String, String>> {
        public a(TPVideoWvPlugin tPVideoWvPlugin) {
        }
    }

    static {
        t2o.a(623902811);
    }

    public static /* synthetic */ Object ipc$super(TPVideoWvPlugin tPVideoWvPlugin, String str, Object... objArr) {
        if (str.hashCode() == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai/windvane/TPVideoWvPlugin");
    }

    @Override // tb.kpw
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        TLog.loge(TAG, "onActivityResult resultCode = " + i2);
        if (i == 60001) {
            if (i2 != -1 || intent == null) {
                this.mWVCallBackContext.error("HY_SUCCESS");
                if (intent != null) {
                    TLog.loge(TAG, "onActivityResult Cancel " + intent.toString());
                }
                h8u.b(this.mBizScene, "cancel");
                return;
            }
            nsw nswVar = new nsw();
            tep.a(intent, nswVar);
            HashMap hashMap = (HashMap) JSON.parseObject(intent.getStringExtra("other_params_map"), HashMap.class);
            if (hashMap != null) {
                for (String str : hashMap.keySet()) {
                    nswVar.b(str, (String) hashMap.get(str));
                }
            }
            TLog.loge(TAG, "onActivityResult Success " + nswVar.m());
            h8u.c(this.mBizScene);
            this.mWVCallBackContext.success(nswVar);
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (ACTION.equals(str) && !TextUtils.isEmpty(str2)) {
            this.mWVCallBackContext = wVCallBackContext;
            HashMap hashMap = (HashMap) JSON.parseObject(str2, new a(this), new Feature[0]);
            if (hashMap == null || hashMap.isEmpty()) {
                if (this.mWVCallBackContext != null) {
                    nsw nswVar = new nsw();
                    nswVar.b("message", this.mContext.getString(R.string.pissarro_params_error));
                    this.mWVCallBackContext.error(nswVar);
                }
                TLog.loge(TAG, "input params error, " + str2);
            } else {
                String str3 = (String) hashMap.get("biz_scene");
                this.mBizScene = str3;
                if (TextUtils.isEmpty(str3)) {
                    this.mBizScene = (String) hashMap.get(z9u.KEY_TAOKE_BIZSCENE);
                }
                h8u.a(this.mBizScene);
                if (!hashMap.containsKey("return_page")) {
                    hashMap.put("return_page", ReturnType.EDIT.desc);
                }
                String str4 = (String) hashMap.get("pageUrl");
                Uri.Builder buildUpon = (str4 == null || (parse = Uri.parse(str4)) == null) ? null : parse.buildUpon();
                if (buildUpon == null) {
                    buildUpon = new Uri.Builder().scheme("http").authority("h5.m.taobao.com").path("/taopai/record.html");
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                        buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                Context context = this.mContext;
                if (context instanceof Activity) {
                    Nav.from(context).forResult(60001).toUri(buildUpon.build());
                }
                return true;
            }
        }
        return false;
    }
}
