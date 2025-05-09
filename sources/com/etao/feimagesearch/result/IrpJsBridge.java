package com.etao.feimagesearch.result;

import android.content.Context;
import android.graphics.RectF;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.datapoints.StatisticalDataPoint$PageName;
import com.ut.device.UTDevice;
import java.util.Iterator;
import org.json.JSONObject;
import tb.agh;
import tb.cw1;
import tb.jzu;
import tb.kpw;
import tb.t2o;
import tb.vlf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IrpJsBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "IrpJsBridge";
    public static final String NAME = "TBSImageSearchBridge";

    static {
        t2o.a(481297416);
    }

    private cw1 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cw1) ipChange.ipc$dispatch("5bb5be0c", new Object[]{this});
        }
        Context context = this.mContext;
        if (context instanceof vlf) {
            return ((vlf) context).getPresenter();
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(IrpJsBridge irpJsBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/result/IrpJsBridge");
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
        sb.append(",utdid=" + UTDevice.getUtdid(this.mContext));
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        jzu.j(StatisticalDataPoint$PageName.PHOTO_SEARCH_RESULT.getPageName(), str2, sb.toString());
    }

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

    public void initSearchParams(com.alibaba.fastjson.JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a72b348", new Object[]{this, jSONObject, wVCallBackContext});
            return;
        }
        cw1 c = c();
        if (c != null) {
            agh.a(LOG_TAG, "initSearchParams");
            com.alibaba.fastjson.JSONObject b = c.b();
            if (b == null) {
                str = "";
            } else {
                str = b.toString();
            }
            wVCallBackContext.success(str);
        }
    }

    public void loadFinished(com.alibaba.fastjson.JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c4f4ad1", new Object[]{this, jSONObject});
            return;
        }
        cw1 c = c();
        if (c != null) {
            if (jSONObject == null) {
                str = "";
            } else {
                str = jSONObject.toJSONString();
            }
            c.j(str, false);
        }
    }

    public void scrollTo(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8119ea21", new Object[]{this, jSONObject});
            return;
        }
        cw1 c = c();
        if (c != null) {
            agh.a(LOG_TAG, "scrollTo");
            c.C(jSONObject.getString("position"));
        }
    }

    public void updateTopbarStyle(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5961cc5f", new Object[]{this, jSONObject});
            return;
        }
        cw1 c = c();
        if (c != null) {
            agh.a(LOG_TAG, "updateTopbarStyle");
            c.E(jSONObject.getString("style"));
        }
    }

    public void backHandled(com.alibaba.fastjson.JSONObject jSONObject) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdffbc14", new Object[]{this, jSONObject});
            return;
        }
        cw1 c = c();
        if (c != null) {
            if (jSONObject != null && jSONObject.containsKey("status")) {
                z = jSONObject.getBooleanValue("status");
            }
            if (!z) {
                agh.a(LOG_TAG, "backHandled");
                c.u();
            }
        }
    }

    public void contentReachTop(com.alibaba.fastjson.JSONObject jSONObject) {
        Boolean bool;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42f7dae", new Object[]{this, jSONObject});
            return;
        }
        cw1 c = c();
        if (c != null) {
            agh.a(LOG_TAG, "contentReachTop");
            if (!(jSONObject == null || !jSONObject.containsKey("status") || (bool = jSONObject.getBoolean("status")) == null)) {
                z = bool.booleanValue();
            }
            c.l(z);
        }
    }

    public final void onUTCtrlClicked(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ecefe6b", new Object[]{this, jSONObject});
            return;
        }
        try {
            String json = jSONObject.toString();
            agh.a(LOG_TAG, "UTCtrlClicked: " + json);
            JSONObject jSONObject2 = new JSONObject(json);
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
            if ("ItemClick".equals(optString2) && (this.mContext instanceof vlf)) {
                utItemClick("," + parseUTArgs, "ItemClick", ((vlf) this.mContext).S());
            } else if (!TextUtils.isEmpty(parseUTArgs)) {
                jzu.j(optString, optString2, parseUTArgs);
            } else {
                jzu.j(optString, optString2, new String[0]);
            }
        } catch (Exception unused) {
        }
    }

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

    public void updateContext(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e06263", new Object[]{this, jSONObject});
            return;
        }
        cw1 c = c();
        if (c != null && jSONObject != null) {
            agh.a(LOG_TAG, "updateContext " + jSONObject.toJSONString());
            String string = jSONObject.getString("region");
            if (!TextUtils.isEmpty(string)) {
                String[] split = string.split(",");
                if (split.length == 4) {
                    try {
                        c.D(new RectF(Float.parseFloat(split[0]), Float.parseFloat(split[2]), Float.parseFloat(split[1]), Float.parseFloat(split[3])));
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
        if (r8.equals("updateContext") == false) goto L_0x0045;
     */
    @Override // tb.kpw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r8, java.lang.String r9, android.taobao.windvane.jsbridge.WVCallBackContext r10) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.result.IrpJsBridge.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }
}
