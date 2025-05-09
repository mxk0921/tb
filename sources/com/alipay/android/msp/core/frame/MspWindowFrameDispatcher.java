package com.alipay.android.msp.core.frame;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.AlertIntelligenceEngine;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspContainerContext;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventCreator;
import com.alipay.android.msp.framework.exception.DataErrorException;
import com.alipay.android.msp.framework.statistics.userfeedback.UserFeedBackUtil;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.widget.MspDialogHelper;
import com.alipay.android.msp.utils.ExceptionUtils;
import com.alipay.android.msp.utils.FingerDataUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspWindowFrameDispatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MspContext f3551a;

    public MspWindowFrameDispatcher(MspContext mspContext) {
        this.f3551a = mspContext;
        UserFeedBackUtil.getInstance().setUserFeedBackTag(null);
    }

    public final void b(final MspWindowFrame mspWindowFrame, JSONObject jSONObject, boolean z, String str) {
        String str2;
        JSONObject windowData;
        JSONObject templateContentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e139d9c", new Object[]{this, mspWindowFrame, jSONObject, new Boolean(z), str});
            return;
        }
        final MspUIClient mspUIClient = this.f3551a.getMspUIClient();
        if (mspUIClient != null) {
            mspWindowFrame.setFromSync(z);
            mspWindowFrame.setBizId(this.f3551a.getBizId());
            mspWindowFrame.setDataChannelValue(str);
            if (jSONObject.containsKey(MspFlybirdDefine.FLYBIRD_NOBACK)) {
                mspWindowFrame.setNoBackTag(jSONObject.getIntValue(MspFlybirdDefine.FLYBIRD_NOBACK));
            }
            MspContext mspContext = this.f3551a;
            if (mspContext instanceof MspContainerContext) {
                MspContainerContext.fillStartupParams(mspWindowFrame, (MspContainerContext) mspContext);
                MspContainerContext.fillSceneParams(mspWindowFrame, (MspContainerContext) this.f3551a);
            }
            LogUtil.record(2, "phonecashiermsp#flybird", "MspWindowFrameDispatcher.createWindowFrame", " frame=".concat(String.valueOf(mspWindowFrame)));
            if (!TextUtils.isEmpty(mspWindowFrame.getUserId())) {
                this.f3551a.setServerFoundUserId(mspWindowFrame.getUserId());
            }
            if (this.f3551a.isBizAppCollectMoneyPage) {
                PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "PAGE_DATA_PARSE");
                PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "PAGE_DATA_START");
            }
            String str3 = "";
            if (mspWindowFrame.getWindowType() == 11) {
                if (!(mspWindowFrame.getTplId() == null || (templateContentData = mspWindowFrame.getTemplateContentData()) == null)) {
                    str3 = templateContentData.getString("bizErrorCode");
                }
            } else if (mspWindowFrame.getWindowType() == 13 && (windowData = mspWindowFrame.getWindowData()) != null) {
                str3 = windowData.getString("bizErrorCode");
            }
            if (!TextUtils.isEmpty(str3)) {
                AlertIntelligenceEngine.startAction(this.f3551a, "err", "se_".concat(String.valueOf(str3)), mspWindowFrame.getFrameId(), mspWindowFrame.getTplId());
            } else if (MspFlybirdDefine.FLYBIRD_ERROR_TPL.equals(mspWindowFrame.getTplId())) {
                JSONObject templateContentData2 = mspWindowFrame.getTemplateContentData();
                if (templateContentData2 != null) {
                    if (templateContentData2.containsKey("title")) {
                        str2 = templateContentData2.getString("title");
                    } else if (templateContentData2.containsKey("msg")) {
                        str2 = templateContentData2.getString("msg");
                    }
                    AlertIntelligenceEngine.startAction(this.f3551a, "err", str2, mspWindowFrame.getFrameId(), mspWindowFrame.getTplId());
                }
                str2 = "兜底";
                AlertIntelligenceEngine.startAction(this.f3551a, "err", str2, mspWindowFrame.getFrameId(), mspWindowFrame.getTplId());
            }
            if (mspWindowFrame.getDelayTime() > 0) {
                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.frame.MspWindowFrameDispatcher.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            mspUIClient.getFrameStack().pushFrame(mspWindowFrame);
                        }
                    }
                }, mspWindowFrame.getDelayTime());
            } else {
                mspUIClient.getFrameStack().pushFrame(mspWindowFrame);
            }
        }
    }

    public final synchronized void a(JSONObject jSONObject, boolean z, StEvent stEvent, String str) throws DataErrorException {
        long j;
        String str2;
        boolean z2 = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3940f2f", new Object[]{this, jSONObject, new Boolean(z), stEvent, str});
            } else if (jSONObject == null) {
                LogUtil.e("MspWindowFrameDispatcher", "createWindowFrame", "params is null");
            } else {
                MspDialogHelper mspDialogHelper = this.f3551a.getMspDialogHelper();
                if (mspDialogHelper != null) {
                    mspDialogHelper.setKeepLoading(false);
                }
                MspWindowFrame mspWindowFrame = new MspWindowFrame();
                JSONObject jSONObject2 = jSONObject.getJSONObject(MspFlybirdDefine.FLYBIRD_ONLOAD);
                if (jSONObject2 != null) {
                    EventAction createMspEvent = MspEventCreator.get().createMspEvent("MspWindowFrameDispatcher.createWindowFrame", jSONObject2);
                    if (createMspEvent != null) {
                        if (jSONObject.containsKey(MspFlybirdDefine.FLYBIRD_AJAX)) {
                            createMspEvent.setAjax(jSONObject.getIntValue(MspFlybirdDefine.FLYBIRD_AJAX) == 1);
                        }
                        if (createMspEvent.isDelayEventType()) {
                            createMspEvent.setDelayTime(300);
                        }
                        ActionsCreator.get(this.f3551a).createEventActionThisThread(createMspEvent);
                    }
                    mspWindowFrame.setOnLoadData(jSONObject2);
                }
                MspContext mspContext = this.f3551a;
                if ((mspContext instanceof MspTradeContext) && ((MspTradeContext) mspContext).getTradeLogicData().isViChannelMode() && !jSONObject.toJSONString().contains("VIData")) {
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    if (z) {
                        jSONObject4.put("channelError", (Object) "-1002");
                    } else {
                        jSONObject4.put("channelError", (Object) "-1001");
                    }
                    jSONObject3.put("data", (Object) jSONObject4);
                    PluginManager.getRender().callRender(jSONObject3.toString());
                }
                if (jSONObject.containsKey("wnd")) {
                    mspWindowFrame.setStatisticEvent(stEvent);
                    JSONObject jSONObject5 = jSONObject.getJSONObject("wnd");
                    j = jSONObject5.getIntValue("time");
                    mspWindowFrame.setWindowData(jSONObject5);
                    if (MspFlybirdDefine.FLYBIRD_WIN_TYPE_DIALOG.equals(jSONObject5.getString("type"))) {
                        mspWindowFrame.setWindowType(13);
                    } else {
                        mspWindowFrame.setWindowType(12);
                        if (jSONObject.containsKey(MspFlybirdDefine.FLYBIRD_AJAX)) {
                            mspWindowFrame.setAjax(jSONObject.getIntValue(MspFlybirdDefine.FLYBIRD_AJAX));
                        }
                    }
                    b(mspWindowFrame, jSONObject, z, str);
                } else {
                    j = 0;
                    z2 = false;
                }
                if (!jSONObject.containsKey("tpl") && !jSONObject.containsKey(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID)) {
                    if (jSONObject.containsKey("page")) {
                        mspWindowFrame.setStatisticEvent(stEvent);
                        JSONObject jSONObject6 = jSONObject.getJSONObject("page");
                        mspWindowFrame.setWindowData(jSONObject6);
                        mspWindowFrame.setWindowType(14);
                        JSONObject jSONObject7 = jSONObject6.getJSONObject("data");
                        if (jSONObject7 != null) {
                            mspWindowFrame.setUserId(jSONObject7.getString("userId"));
                        }
                        mspWindowFrame.setDelayTime(j);
                        b(mspWindowFrame, jSONObject, z, str);
                        return;
                    } else if (!z2) {
                        LogUtil.record(8, "MspWindowFrameDispatcher.createWindowFrame", "frameRecognized=false");
                        LogUtil.record(8, "MspWindowFrameDispatcher#unkown", jSONObject.toJSONString());
                        String localizedStringForKey = LanguageHelper.localizedStringForKey("mini_app_error", this.f3551a.getContext().getString(R.string.mini_app_error), new Object[0]);
                        String string = jSONObject.getString("msg");
                        if (TextUtils.isEmpty(string) && jSONObject.containsKey(MUSAppMonitor.ERROR_MSG)) {
                            string = jSONObject.getString(MUSAppMonitor.ERROR_MSG);
                        }
                        if (!TextUtils.isEmpty(string)) {
                            localizedStringForKey = string;
                        }
                        throw new DataErrorException(ExceptionUtils.createExceptionMsg(localizedStringForKey, 302));
                    } else {
                        return;
                    }
                }
                mspWindowFrame.setStatisticEvent(stEvent);
                mspWindowFrame.setTplString(jSONObject.getString("tpl"));
                if (jSONObject.containsKey(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID)) {
                    mspWindowFrame.setTplId(jSONObject.getString(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID));
                }
                if (jSONObject.containsKey("data")) {
                    JSONObject jSONObject8 = jSONObject.getJSONObject("data");
                    if (jSONObject8 != null) {
                        str2 = jSONObject8.getString("userId");
                        mspWindowFrame.setUserId(str2);
                    } else {
                        str2 = null;
                    }
                    String fingerUserStatus = FingerDataUtil.getFingerUserStatus(jSONObject8, str2);
                    if (jSONObject8 != null && !TextUtils.isEmpty(fingerUserStatus)) {
                        jSONObject8.put(MspFlybirdDefine.FLYBIRD_LOCALDATA_FINGER_STATUS, (Object) fingerUserStatus);
                    }
                    mspWindowFrame.setTemplateContentData(jSONObject8);
                }
                mspWindowFrame.setWindowType(11);
                mspWindowFrame.setDelayTime(j);
                b(mspWindowFrame, jSONObject, z, str);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(42:6|(1:8)(1:9)|10|(4:12|167|13|14)(1:20)|21|(1:23)(1:24)|25|(2:27|(34:29|31|(1:33)(1:34)|165|35|36|169|37|(8:39|(1:41)|44|(1:46)|47|157|48|(1:54))(1:56)|159|60|(1:62)|65|(1:67)|68|(1:70)(1:71)|161|72|(5:74|(1:76)|79|(2:82|80)|171)|84|(2:88|(1:92))|93|(2:95|(1:97))|98|(1:100)(1:101)|102|(4:104|(1:106)|107|(1:(1:117))(2:111|112))(1:118)|119|(3:163|129|(2:133|134))|135|(4:144|155|145|(2:151|152))|141|153|154))|30|31|(0)(0)|165|35|36|169|37|(0)(0)|159|60|(0)|65|(0)|68|(0)(0)|161|72|(0)|84|(3:86|88|(2:90|92))|93|(0)|98|(0)(0)|102|(0)(0)|119|(7:121|123|125|127|163|129|(0))|135|(6:137|142|144|155|145|(0))|141|153|154) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f3, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f4, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0134, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0135, code lost:
        r20 = "MspWindowFrameDispatcher";
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014e, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014f, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017c, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019a, code lost:
        com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7 A[Catch: Exception -> 0x00f3, TryCatch #7 {Exception -> 0x00f3, blocks: (B:37:0x00d3, B:39:0x00d7, B:41:0x00df, B:44:0x00f7, B:46:0x00fd, B:47:0x0104), top: B:169:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0146 A[Catch: Exception -> 0x014e, TryCatch #2 {Exception -> 0x014e, blocks: (B:60:0x013b, B:62:0x0146, B:65:0x0152, B:67:0x0158, B:68:0x015f), top: B:159:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0158 A[Catch: Exception -> 0x014e, TryCatch #2 {Exception -> 0x014e, blocks: (B:60:0x013b, B:62:0x0146, B:65:0x0152, B:67:0x0158, B:68:0x015f), top: B:159:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016f A[Catch: Exception -> 0x017c, TryCatch #3 {Exception -> 0x017c, blocks: (B:72:0x0169, B:74:0x016f, B:76:0x0175, B:79:0x017e, B:80:0x0186, B:82:0x018c), top: B:161:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean parseRendDataFromUIShow(com.alibaba.fastjson.JSONObject r22, boolean r23, com.alipay.android.msp.framework.statisticsv2.model.StEvent r24) throws com.alipay.android.msp.framework.exception.MspServerErrorException, com.alipay.android.msp.framework.exception.DataErrorException {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.core.frame.MspWindowFrameDispatcher.parseRendDataFromUIShow(com.alibaba.fastjson.JSONObject, boolean, com.alipay.android.msp.framework.statisticsv2.model.StEvent):boolean");
    }
}
