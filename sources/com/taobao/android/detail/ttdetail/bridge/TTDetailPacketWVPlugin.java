package com.taobao.android.detail.ttdetail.bridge;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailBaseActivity;
import com.taobao.android.detail.ttdetail.TTDetailPageManager;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.bw7;
import tb.kpw;
import tb.mr7;
import tb.mwy;
import tb.nsw;
import tb.nwy;
import tb.o91;
import tb.pb6;
import tb.pl4;
import tb.q84;
import tb.t2o;
import tb.tgh;
import tb.wuy;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTDetailPacketWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CAN_DISPLAY = "canDisplay";
    private static final String DID_END_DISPLAY = "didEndDisplay";
    public static final String PLUGIN_NAME = "DetailPacket";
    private static final String TAG = "TTDetailWVPlugin";

    static {
        t2o.a(912261333);
    }

    private ze7 getDetailContext(Context context) {
        TTDetailPageManager r3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("3b0c1d61", new Object[]{this, context});
        }
        if (!(context instanceof TTDetailBaseActivity) || (r3 = ((TTDetailBaseActivity) context).r3()) == null) {
            return null;
        }
        return r3.e0();
    }

    public static /* synthetic */ Object ipc$super(TTDetailPacketWVPlugin tTDetailPacketWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/bridge/TTDetailPacketWVPlugin");
    }

    private float getRedPacketViewTop(ze7 ze7Var) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a91e60c8", new Object[]{this, ze7Var})).floatValue();
        }
        tgh.b(TAG, "getRedPacketViewTop");
        if (!(ze7Var == null || ze7Var.c() == null || !(ze7Var.c() instanceof TTDetailBaseActivity))) {
            View findViewById = ((TTDetailBaseActivity) ze7Var.c()).findViewById(R.id.tt_float_red_packet);
            mwy a2 = nwy.a(ze7Var);
            if (a2 != null) {
                i = a2.i();
            }
            int d = pb6.d(ze7Var.g().o(), ze7Var.c(), i);
            tgh.b(TAG, "getRedPacketViewTop fixedHeight=" + d);
            if (findViewById != null) {
                int[] iArr = new int[2];
                findViewById.getLocationOnScreen(iArr);
                tgh.b(TAG, "getRedPacketViewTop location=" + iArr[1] + "|" + findViewById.getHeight());
                if (findViewById.getHeight() == 0) {
                    return iArr[1] - d;
                }
                return iArr[1];
            }
        }
        return mr7.e(o91.a()) * 0.7f;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        int i;
        int i2;
        int i3;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        tgh.b(TAG, "WVApi action=" + str + ", params=" + str2);
        if (TextUtils.isEmpty(str)) {
            tgh.b(TAG, "WVApi action为空");
            return false;
        } else if (wVCallBackContext == null) {
            tgh.b(TAG, "WVApi wvCallBackContext为空");
            return false;
        } else {
            Context context = this.mContext;
            if (context == null) {
                tgh.b(TAG, "WVApi mContext为空");
                return false;
            }
            tgh.b(TAG, "mContext=" + context);
            ze7 detailContext = getDetailContext(context);
            if (detailContext == null || detailContext.i() == null) {
                wVCallBackContext.onFailure(nsw.RET_FAIL);
                tgh.b(TAG, "detailContext or detailContext.getStateCenter() is null");
                return false;
            }
            String str3 = (String) detailContext.i().c("requestItemId");
            String b = detailContext.i().b();
            if (CAN_DISPLAY.equals(str)) {
                try {
                    if (str2 == null) {
                        wVCallBackContext.onFailure(nsw.RET_FAIL);
                        return false;
                    }
                    JSONObject parseObject = JSON.parseObject(str2);
                    if (parseObject == null) {
                        wVCallBackContext.onFailure(nsw.RET_FAIL);
                        return false;
                    }
                    String string = parseObject.getString("itemId");
                    if (string == null) {
                        wVCallBackContext.onFailure(nsw.RET_FAIL);
                        return false;
                    }
                    mwy a2 = nwy.a(detailContext);
                    if (a2 != null) {
                        i2 = a2.k();
                        i = a2.i();
                        i3 = a2.j();
                    } else {
                        i3 = 0;
                        i2 = 0;
                        i = 0;
                    }
                    int d = pb6.d(detailContext.g().o(), context, i);
                    int d2 = pb6.d(detailContext.g().o(), context, i2);
                    int d3 = pb6.d(detailContext.g().o(), context, i3);
                    float f = 750.0f / mr7.f(o91.a());
                    JSONObject jSONObject2 = new JSONObject();
                    if (string.equals(str3)) {
                        float f2 = ((mr7.f(o91.a()) - d2) - d3) * f;
                        float redPacketViewTop = getRedPacketViewTop(detailContext) * f;
                        float f3 = d2 * f;
                        float f4 = d * f;
                        jSONObject2.put("isDisplay", (Object) Boolean.TRUE);
                        jSONObject2.put(pl4.KEY_PAGE_ID, (Object) b);
                        jSONObject = jSONObject2;
                        jSONObject.put("endDisplayPosition", (Object) new JSONObject(f2, redPacketViewTop, f3, f4) { // from class: com.taobao.android.detail.ttdetail.bridge.TTDetailPacketWVPlugin.1
                            public final /* synthetic */ float val$h;
                            public final /* synthetic */ float val$w;
                            public final /* synthetic */ float val$x;
                            public final /* synthetic */ float val$y;

                            {
                                this.val$x = f2;
                                this.val$y = redPacketViewTop;
                                this.val$w = f3;
                                this.val$h = f4;
                                put("x", (Object) Float.valueOf(f2));
                                put("y", (Object) Float.valueOf(redPacketViewTop));
                                put("width", (Object) Float.valueOf(f3));
                                put("height", (Object) Float.valueOf(f4));
                            }
                        });
                        tgh.b(TAG, "canDisplay:truex:" + f2 + "y:" + redPacketViewTop + "w:" + f3 + "h:" + f4);
                    } else {
                        jSONObject = jSONObject2;
                        jSONObject.put("isDisplay", (Object) Boolean.FALSE);
                        tgh.b(TAG, "canDisplay:false");
                    }
                    wVCallBackContext.success(jSONObject.toJSONString());
                    return true;
                } catch (Exception unused) {
                    tgh.b(TAG, "canDisplay 异常");
                    wVCallBackContext.onFailure(nsw.RET_FAIL);
                    return false;
                }
            } else if (!DID_END_DISPLAY.equals(str)) {
                return false;
            } else {
                try {
                    if (str2 == null) {
                        bw7.b(new HashMap<String, String>(str3) { // from class: com.taobao.android.detail.ttdetail.bridge.TTDetailPacketWVPlugin.2
                            public final /* synthetic */ String val$id;

                            {
                                this.val$id = str3;
                                put("itemId", str3);
                            }
                        }, -100043, "params is null");
                        wVCallBackContext.onFailure(nsw.RET_FAIL);
                        return false;
                    }
                    JSONObject parseObject2 = JSON.parseObject(str2);
                    if (parseObject2 == null) {
                        bw7.b(new HashMap<String, String>(str3) { // from class: com.taobao.android.detail.ttdetail.bridge.TTDetailPacketWVPlugin.3
                            public final /* synthetic */ String val$id;

                            {
                                this.val$id = str3;
                                put("itemId", str3);
                            }
                        }, -100043, "params parser is null");
                        wVCallBackContext.onFailure(nsw.RET_FAIL);
                        return false;
                    }
                    JSONObject jSONObject3 = parseObject2.getJSONObject("packetData");
                    if (jSONObject3 == null) {
                        bw7.b(new HashMap<String, String>(str3) { // from class: com.taobao.android.detail.ttdetail.bridge.TTDetailPacketWVPlugin.4
                            public final /* synthetic */ String val$id;

                            {
                                this.val$id = str3;
                                put("itemId", str3);
                            }
                        }, -100043, "params parser packetData is null");
                        wVCallBackContext.onFailure(nsw.RET_FAIL);
                        return false;
                    }
                    JSONObject jSONObject4 = parseObject2.getJSONObject("verifyParams");
                    if (jSONObject4 == null) {
                        tgh.b(TAG, "verifyParams is null");
                        wVCallBackContext.onFailure(nsw.RET_FAIL);
                        return false;
                    }
                    String string2 = jSONObject4.getString("itemId");
                    String string3 = jSONObject4.getString(pl4.KEY_PAGE_ID);
                    if (!(string2 == null || string3 == null)) {
                        if (!string2.equals(str3) || !string3.equals(b)) {
                            tgh.b(TAG, "itemId or pageId is not equal");
                            wVCallBackContext.onFailure(nsw.RET_FAIL);
                            return false;
                        }
                        tgh.b(TAG, "更新红包");
                        q84.f(detailContext.c(), new wuy(string2, string3, jSONObject3));
                        wVCallBackContext.success();
                        return true;
                    }
                    tgh.b(TAG, "itemId or pageId is null");
                    wVCallBackContext.onFailure(nsw.RET_FAIL);
                    return false;
                } catch (Exception unused2) {
                    tgh.b(TAG, "didEndDisplay 异常");
                    wVCallBackContext.onFailure(nsw.RET_FAIL);
                    return false;
                }
            }
        }
    }
}
