package com.alipay.android.msp.framework.helper;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.drivers.stores.store.events.FeedbackStore;
import com.alipay.android.msp.framework.statistics.SpmWrapper;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.framework.track.MspTrackInfo;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogImpl;
import com.alipay.android.msp.utils.FlybirdUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FlybirdRenderIntercepter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_TPL = "cashier-error-follow-action-flex";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface IntercepterCallback {
        void dismissLoading();

        void onEvent(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class SpmInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static void spmBtn(MspWindowFrame mspWindowFrame, String str, JSONObject jSONObject, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c097f7f2", new Object[]{mspWindowFrame, str, jSONObject, new Integer(i), str2});
            } else if (mspWindowFrame != null) {
                try {
                    int bizId = mspWindowFrame.getBizId();
                    String createSpmSessionId = FeedbackStore.createSpmSessionId(bizId, mspWindowFrame);
                    JSONObject jSONObject2 = new JSONObject();
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject2.put("text", str);
                    }
                    if (jSONObject != null) {
                        jSONObject2.put("act", jSONObject.toString());
                    }
                    if ("click".equals(str2)) {
                        SpmWrapper.onPageClick(mspWindowFrame, "a283.b43760.c107670.d223419_".concat(String.valueOf(i)), "pay", createSpmSessionId, jSONObject2.toString(), bizId);
                    } else if ("exposure".equals(str2)) {
                        SpmWrapper.onPageExposure(mspWindowFrame, "a283.b43760.c107670.d223419_".concat(String.valueOf(i)), "pay", "", createSpmSessionId, jSONObject2.toString(), bizId);
                    }
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
        }

        public static void spmCreate(MspWindowFrame mspWindowFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a94b219", new Object[]{mspWindowFrame});
            } else if (mspWindowFrame != null) {
                try {
                    int bizId = mspWindowFrame.getBizId();
                    String createSpmSessionId = FeedbackStore.createSpmSessionId(bizId, mspWindowFrame);
                    MspTrackInfo.SpmInfo spmInfo = new MspTrackInfo.SpmInfo();
                    spmInfo.bizCode = "pay";
                    spmInfo.spmId = "a283.b43760";
                    spmInfo.sessionId = createSpmSessionId;
                    spmInfo.param4 = "{}";
                    MspTrackInfo.getInstance().putSpmDataInfo(mspWindowFrame, spmInfo);
                    SpmWrapper.onPageStart(mspWindowFrame, bizId);
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
        }

        public static void spmDestroy(MspWindowFrame mspWindowFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e5facf7", new Object[]{mspWindowFrame});
            } else if (mspWindowFrame != null) {
                try {
                    SpmWrapper.onPageEnd(mspWindowFrame, mspWindowFrame.getBizId());
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
        }

        public static void spmExposure(MspWindowFrame mspWindowFrame, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("883816f8", new Object[]{mspWindowFrame, str, str2});
            } else if (mspWindowFrame != null) {
                try {
                    int bizId = mspWindowFrame.getBizId();
                    String createSpmSessionId = FeedbackStore.createSpmSessionId(bizId, mspWindowFrame);
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("title", str);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("message", str2);
                    }
                    SpmWrapper.onPageExposure(mspWindowFrame, "a283.b43760.c107670", "pay", "", createSpmSessionId, jSONObject.toString(), bizId);
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
        }
    }

    public boolean intercept(Context context, MspWindowFrame mspWindowFrame, String str, IntercepterCallback intercepterCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95692511", new Object[]{this, context, mspWindowFrame, str, intercepterCallback})).booleanValue();
        }
        String tplId = mspWindowFrame.getTplId();
        if (!FlybirdUtil.isErrorTpl2Native(context) || !TextUtils.equals(MspFlybirdDefine.FLYBIRD_ERROR_TPL, tplId) || !a(context, str, intercepterCallback, mspWindowFrame)) {
            return false;
        }
        return true;
    }

    public void showDialog(Context context, String str, String str2, String str3, List<FlybirdDialogEventDesc> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be75766b", new Object[]{this, context, str, str2, str3, list});
        } else {
            FlybirdDialogImpl.showDialog(context, str, str2, str3, list);
        }
    }

    public final boolean a(final Context context, String str, final IntercepterCallback intercepterCallback, final MspWindowFrame mspWindowFrame) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79d80292", new Object[]{this, context, str, intercepterCallback, mspWindowFrame})).booleanValue();
        }
        try {
            JSONObject jSONObject = new JSONObject(str == null ? "{}" : str);
            if (!TextUtils.isEmpty(jSONObject.optString("loginAccount"))) {
                return false;
            }
            final ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("btns");
            SpmInfo.spmCreate(mspWindowFrame);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            if (optJSONArray.length() == 0) {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("name", "loc:exit");
                jSONObject3.put("params", "");
                jSONObject2.put("act", jSONObject3);
                jSONObject2.put("txt", LanguageHelper.localizedStringForKey("alipay_ensure", context.getResources().getString(R.string.alipay_ensure), new Object[0]));
                optJSONArray.put(jSONObject2);
            }
            int length = optJSONArray.length();
            for (final int i2 = 0; i2 < length; i2 = i + 1) {
                JSONObject jSONObject4 = optJSONArray.getJSONObject(i2);
                if (jSONObject4 != null) {
                    final String optString = jSONObject4.optString("txt");
                    final JSONObject optJSONObject = jSONObject4.optJSONObject("act");
                    SpmInfo.spmBtn(mspWindowFrame, optString, optJSONObject, i2, "exposure");
                    i = i2;
                    length = length;
                    arrayList.add(new FlybirdDialogEventDesc(optString, new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.framework.helper.FlybirdRenderIntercepter.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i3)});
                            } else if (optJSONObject != null) {
                                try {
                                    JSONObject jSONObject5 = new JSONObject();
                                    jSONObject5.put("action", optJSONObject.toString());
                                    SpmInfo.spmBtn(mspWindowFrame, optString, optJSONObject, i2, "click");
                                    SpmInfo.spmDestroy(mspWindowFrame);
                                    IntercepterCallback intercepterCallback2 = intercepterCallback;
                                    if (intercepterCallback2 != null) {
                                        intercepterCallback2.onEvent(jSONObject5.toString());
                                    }
                                } catch (Throwable th) {
                                    LogUtil.printExceptionStackTrace(th);
                                }
                            }
                        }
                    }));
                } else {
                    i = i2;
                    length = length;
                }
            }
            arrayList.size();
            final String optString2 = jSONObject.optString("title");
            final String optString3 = jSONObject.optString("msg");
            if (TextUtils.isEmpty(optString3)) {
                optString3 = LanguageHelper.localizedStringForKey("mini_server_busy", context.getString(R.string.mini_server_busy), new Object[0]);
            }
            SpmInfo.spmExposure(mspWindowFrame, optString2, optString3);
            final String optString4 = jSONObject.optString(MspFlybirdDefine.FLYBIRD_DIALOG_BUTTON_DIRECTION);
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.framework.helper.FlybirdRenderIntercepter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    IntercepterCallback intercepterCallback2 = intercepterCallback;
                    if (intercepterCallback2 != null) {
                        intercepterCallback2.dismissLoading();
                    }
                    FlybirdRenderIntercepter.this.showDialog(context, optString2, optString3, optString4, arrayList);
                }
            });
            return true;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }
}
