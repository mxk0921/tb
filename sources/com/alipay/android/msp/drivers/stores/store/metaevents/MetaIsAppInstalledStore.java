package com.alipay.android.msp.drivers.stores.store.metaevents;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.CountValue;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.PkgTools;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MetaIsAppInstalledStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaIsAppInstalledStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MetaIsAppInstalledStore metaIsAppInstalledStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/metaevents/MetaIsAppInstalledStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        String str = "";
        try {
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        if (this.mContext == null) {
            return null;
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        String string = actionParamsJson.getString("package");
        String string2 = actionParamsJson.getString(SimpleProfile.KEY_SIGNATURE);
        String string3 = actionParamsJson.getString("minVersionCode");
        PackageInfo packageInfo = this.mContext.getPackageManager().getPackageInfo(string, 64);
        if (packageInfo == null) {
            str = LanguageHelper.localizedStringForKey("ebank_errormsg_not_install", this.mContext.getString(R.string.ebank_errormsg_not_install), new Object[0]);
            this.mMspContext.getStatisticInfo().addEvent(new StEvent(this.mMspContext.getCurrentWinTpName(), CountValue.T_EBANK, "EbankNotInstall|pkg:".concat(String.valueOf(string))));
        } else if (Integer.parseInt(string3) > packageInfo.versionCode) {
            str = LanguageHelper.localizedStringForKey("ebank_errormsg_low_version", this.mContext.getString(R.string.ebank_errormsg_low_version), new Object[0]);
            this.mMspContext.getStatisticInfo().addEvent(new StEvent(this.mMspContext.getCurrentWinTpName(), CountValue.T_EBANK, "EbankLowVersion|pkg:".concat(String.valueOf(string))));
        } else {
            if (!TextUtils.isEmpty(string2) && !TextUtils.equals(string2, PkgTools.getPkgSHA256FingerPrint(this.mContext, string))) {
                str = LanguageHelper.localizedStringForKey("ebank_errormsg_informal_version", this.mContext.getString(R.string.ebank_errormsg_informal_version), new Object[0]);
                this.mMspContext.getStatisticInfo().addEvent(new StEvent(this.mMspContext.getCurrentWinTpName(), CountValue.T_EBANK, "EbankInformalVersion|pkg:".concat(String.valueOf(string))));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", (Object) Boolean.valueOf(z));
            jSONObject.put("errorMsg", (Object) str);
            return jSONObject.toJSONString();
        }
        z = false;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("success", (Object) Boolean.valueOf(z));
        jSONObject2.put("errorMsg", (Object) str);
        return jSONObject2.toJSONString();
    }
}
