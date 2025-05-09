package com.alipay.android.msp.core.frame;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.framework.track.MspTrackInfo;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import tb.s0j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspWindowFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int WINDOW_DIALOG = 13;
    public static final int WINDOW_PAGE = 14;
    public static final int WINDOW_TOAST = 12;
    public static final int WINDOW_TPL = 11;
    public static final int WINDOW_TRANSITION = 10;
    public final String D;
    public String E;

    /* renamed from: a  reason: collision with root package name */
    public int f3550a;
    public JSONObject c;
    public JSONObject d;
    public JSONObject e;
    public StEvent f;
    public String g;
    public String h;
    public JSONObject t;
    public boolean x;
    public String b = "";
    public String i = null;
    public View j = null;
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public org.json.JSONObject u = null;
    public org.json.JSONObject v = null;
    public FBDocument w = null;
    public long y = 0;
    public String z = "";
    public boolean A = false;
    public JSONArray B = new JSONArray(20);
    public int C = 0;

    public MspWindowFrame() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        this.D = hexString.length() > 10 ? hexString.substring(hexString.length() - 10) : hexString;
    }

    public static /* synthetic */ View access$000(MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("980b063f", new Object[]{mspWindowFrame});
        }
        return mspWindowFrame.j;
    }

    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        LogUtil.record(2, "MspWindowFrame::dispose", "mTplId:" + this.h + ", mContentView:" + this.j);
        if (this.h == null || this.j == null) {
            LogUtil.record(4, "MspWindowFrame::dispose", "mTplId or mContentView is null");
            return;
        }
        int i = 150;
        try {
            String walletConfig = PhoneCashierMspEngine.getMspWallet().getWalletConfig("MSP_fbdoc_destroy_delay");
            if (walletConfig != null && walletConfig.length() > 0) {
                i = Integer.parseInt(walletConfig);
            }
        } catch (Throwable unused) {
        }
        try {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.frame.MspWindowFrame.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        PluginManager.getRender().destroyView(MspWindowFrame.access$000(MspWindowFrame.this));
                    }
                }
            }, i);
            MspTrackInfo.getInstance().removeTplPageInfo(this);
        } catch (Throwable th) {
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.m);
            if (mspContextByBizId != null) {
                mspContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, th);
            }
        }
        try {
            Context context = MspContextUtil.getContext();
            if (context != null && TextUtils.equals(this.h, MspFlybirdDefine.BIZ_APP_COLLECT_ID) && isPreloadView()) {
                PluginManager.getRender().destroy(this.m, context.hashCode(), context);
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    public String getActivityConfiguration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed46db28", new Object[]{this});
        }
        return this.i;
    }

    public boolean getBackAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f8fa99", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public int getBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue();
        }
        return this.m;
    }

    public int getClickCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85959657", new Object[]{this})).intValue();
        }
        return this.C;
    }

    public String getClickInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc9ca759", new Object[]{this});
        }
        JSONArray jSONArray = this.B;
        if (jSONArray == null) {
            return "";
        }
        return jSONArray.toString();
    }

    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.j;
    }

    public String getDataChannelValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9eca554b", new Object[]{this});
        }
        return this.z;
    }

    public long getDelayTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee424fb5", new Object[]{this})).longValue();
        }
        return this.y;
    }

    public JSONObject getDiagnoseParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3e3ce881", new Object[]{this});
        }
        return this.t;
    }

    public FBDocument getFBDocument() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBDocument) ipChange.ipc$dispatch("cc27f2a9", new Object[]{this});
        }
        return this.w;
    }

    public String getFrameId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9970bb07", new Object[]{this});
        }
        return this.D;
    }

    public boolean getInPrevStack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f92d42c5", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    public JSONObject getOnLoadData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5e78c5cc", new Object[]{this});
        }
        return this.d;
    }

    public boolean getRerendStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a0643ef", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public org.json.JSONObject getSceneParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("4c5fe3f1", new Object[]{this});
        }
        return this.v;
    }

    public org.json.JSONObject getStartupParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("69dfc7a2", new Object[]{this});
        }
        return this.u;
    }

    public StEvent getStatisticEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StEvent) ipChange.ipc$dispatch("a3780888", new Object[]{this});
        }
        return this.f;
    }

    public JSONObject getTemplateContentData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e63671da", new Object[]{this});
        }
        return this.e;
    }

    public String getTplHashId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba429936", new Object[]{this});
        }
        return this.E;
    }

    public String getTplId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c71e7524", new Object[]{this});
        }
        return this.h;
    }

    public String getTplString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("186d14ee", new Object[]{this});
        }
        return this.g;
    }

    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return this.b;
    }

    public JSONObject getWindowData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("613bb57", new Object[]{this});
        }
        return this.c;
    }

    public int getWindowType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb3903ba", new Object[]{this})).intValue();
        }
        return this.f3550a;
    }

    public boolean isAjax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c094cdf5", new Object[]{this})).booleanValue();
        }
        if (this.k == 1) {
            return true;
        }
        return false;
    }

    public boolean isDefaultWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14c46992", new Object[]{this})).booleanValue();
        }
        if (this.f3550a == 11) {
            return true;
        }
        return false;
    }

    public boolean isDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f6dc040", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public boolean isExecuted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82860ee4", new Object[]{this})).booleanValue();
        }
        return this.A;
    }

    public boolean isFirstTplFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a9936ae", new Object[]{this})).booleanValue();
        }
        return this.x;
    }

    public boolean isFromSync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae4afdba", new Object[]{this})).booleanValue();
        }
        return this.r;
    }

    public boolean isNoBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44d8db9d", new Object[]{this})).booleanValue();
        }
        if (this.l == 1) {
            return true;
        }
        return false;
    }

    public boolean isPreloadView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0f30f4f", new Object[]{this})).booleanValue();
        }
        return this.s;
    }

    public void removeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82b7d50", new Object[]{this});
            return;
        }
        setContentView(null);
        setFBDocument(null);
    }

    public void setActivityConfiguration(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11efb7b6", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void setAjax(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678952fa", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public void setBackAnim(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefd7153", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public void setBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ca4090", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }

    public void setContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
        } else {
            this.j = view;
        }
    }

    public void setDataChannelValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c2e28b", new Object[]{this, str});
        } else {
            this.z = str;
        }
    }

    public void setDelayTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fe872f", new Object[]{this, new Long(j)});
        } else {
            this.y = j;
        }
    }

    public void setDestroyView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0373950", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public void setDiagnoseParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c19923", new Object[]{this, jSONObject});
        } else {
            this.t = jSONObject;
        }
    }

    public void setExecuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d334bbc", new Object[]{this, new Boolean(z)});
        } else {
            this.A = z;
        }
    }

    public void setFBDocument(FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1272907", new Object[]{this, fBDocument});
        } else {
            this.w = fBDocument;
        }
    }

    public void setFirstTplFrame(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1067a2a2", new Object[]{this, new Boolean(z)});
        } else {
            this.x = z;
        }
    }

    public void setFromSync(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0c37a6", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    public void setInPrevStack(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0785d3f", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    public void setIsPreLoadView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3796a0cb", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    public void setNoBackTag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99dff6c", new Object[]{this, new Integer(i)});
        } else {
            this.l = i;
        }
    }

    public void setOnLoadData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23ab3f38", new Object[]{this, jSONObject});
        } else {
            this.d = jSONObject;
        }
    }

    public void setRerendStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e258f8bd", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public void setSceneParams(org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24edb627", new Object[]{this, jSONObject});
        } else {
            this.v = jSONObject;
        }
    }

    public void setStartupParams(org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2e0b596", new Object[]{this, jSONObject});
        } else {
            this.u = jSONObject;
        }
    }

    public void setStatisticEvent(StEvent stEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f18a979e", new Object[]{this, stEvent});
        } else {
            this.f = stEvent;
        }
    }

    public void setTemplateContentData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("834e482", new Object[]{this, jSONObject});
        } else {
            this.e = jSONObject;
        }
    }

    public void setTplHashId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104e4968", new Object[]{this, str});
        } else {
            this.E = str;
        }
    }

    public void setTplId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c988c53a", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void setTplString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777344b0", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void setWindowData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f6efb0d", new Object[]{this, jSONObject});
        } else {
            this.c = jSONObject;
        }
    }

    public void setWindowType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2be8190", new Object[]{this, new Integer(i)});
        } else {
            this.f3550a = i;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "<MspWindowFrame id=" + getTplId() + " tag=" + getTplString() + " isPreLoadView=" + this.s + " wnd=" + getWindowData() + " type=" + this.f3550a + " onLoadData=" + this.d + ">";
    }

    public void setClickPos(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a93158a", new Object[]{this, motionEvent});
            return;
        }
        this.C++;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(s0j.MTS_TAG_CLICK_TIME, (Object) Long.valueOf(System.currentTimeMillis()));
        if (motionEvent != null) {
            jSONObject.put("clickPoint", (Object) (motionEvent.getX() + "X" + motionEvent.getY()));
        }
        if (this.j != null) {
            jSONObject.put("viewSize", (Object) (this.j.getWidth() + "X" + this.j.getHeight()));
            StringBuilder sb = new StringBuilder();
            String str = this.h;
            if (str == null) {
                str = "null";
            }
            sb.append(str);
            sb.append("@");
            sb.append(this.j.hashCode());
            jSONObject.put("viewHash", (Object) sb.toString());
        }
        if (this.B == null) {
            this.B = new JSONArray(20);
        }
        if (this.B.size() == 20) {
            this.B.remove(0);
        }
        LogUtil.i("MspWindowFrame", "setClickPos", jSONObject.toString());
        this.B.add(jSONObject);
    }
}
