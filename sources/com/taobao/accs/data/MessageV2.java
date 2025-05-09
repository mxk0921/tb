package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.init.Launcher_InitPush;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import java.io.UnsupportedEncodingException;
import org.android.agoo.common.Config;
import org.json.JSONException;
import tb.j8l;
import tb.pfo;
import tb.t2o;
import tb.xd0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MessageV2 extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_AAID = "aaid";
    private static final String KEY_COMMONID = "commonDeviceId";
    private static final String KEY_FLOATENABLE = "floatingEnable";
    private static final String KEY_LANGUAGE = "language";
    private static final String KEY_NOTIFYENABLE = "notifyEnable";
    private static final String KEY_OAID = "oaid";
    private static final String KEY_REGID = "regId";
    private static final String KEY_ROMINFO = "romInfo";
    private static final String KEY_SITE = "site";
    private static final String KEY_TOKEN = "deviceToken";
    private static final String KEY_UMID = "umidToken";
    private static final String KEY_UTDID = "utdid";
    private static final String KEY_VENDOR = "supportVendor";
    private static final String KEY_VERSION = "version";
    private static final String TAG = "BindAppMessageV2";
    public String aaid;
    public String commonDeviceId;
    public String deviceToken;
    public String floatingEnable;
    public String language;
    public String notifyEnable;
    public String regId;
    public String romInfo;
    public String site;
    public String umidToken;
    public String supportVendor = "0";
    public String version = "2";

    static {
        t2o.a(343933092);
    }

    private static String getUmidToken(Context context) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("718eef", new Object[]{context});
        }
        int i2 = AccsClientConfig.mEnv;
        if (i2 == 1) {
            i = 1;
        } else if (i2 == 2) {
            i = 2;
        }
        try {
            return SecurityGuardManager.getInstance(context).getUMIDComp().getSecurityToken(i);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static /* synthetic */ Object ipc$super(MessageV2 messageV2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/data/MessageV2");
    }

    @Override // com.taobao.accs.data.Message
    public void buildData() throws JSONException, UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c486bbf", new Object[]{this});
            return;
        }
        Integer num = this.command;
        if (num != null && num.intValue() != 100 && this.command.intValue() != 102) {
            Context context = GlobalClientInfo.getContext();
            String p = j8l.p(context);
            if (TextUtils.isEmpty(p)) {
                this.regId = null;
                this.version = "1";
                ALog.e(TAG, "regid null, degrade to V1", new Object[0]);
            } else {
                ALog.i(TAG, "set again", "regId", this.regId, "id", p);
                this.regId = p;
            }
            switch (this.command.intValue()) {
                case 1:
                    this.data = buidJsonObject().d("version", this.version).d("deviceToken", this.deviceToken).d(KEY_NOTIFYENABLE, this.notifyEnable).d(KEY_ROMINFO, this.romInfo).d(KEY_FLOATENABLE, this.floatingEnable).d("umidToken", this.umidToken).d(KEY_AAID, this.aaid).d(KEY_COMMONID, this.commonDeviceId).d("regId", this.regId).d("utdid", UtilityImpl.getDeviceId(context)).d(KEY_VENDOR, this.supportVendor).d("oaid", UtilityImpl.getOAID(context)).d("language", this.language).d("site", this.site).a().toString().getBytes("utf-8");
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    this.data = buidJsonObject().d("regId", this.regId).d("utdid", UtilityImpl.getDeviceId(context)).a().toString().getBytes("utf-8");
                    return;
                default:
                    return;
            }
        }
    }

    public static MessageV2 buildBindApp(String str, String str2, Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageV2) ipChange.ipc$dispatch("9c8f83a9", new Object[]{str, str2, context, intent});
        }
        Message buildBindApp = Message.buildBindApp(str, str2, context, intent);
        if (!(buildBindApp instanceof MessageV2)) {
            return null;
        }
        MessageV2 messageV2 = (MessageV2) buildBindApp;
        messageV2.deviceToken = Config.getDeviceToken(context);
        String str3 = "0";
        String str4 = "true".equals(xd0.j(context)) ? "1" : str3;
        messageV2.notifyEnable = str4;
        UtilityImpl.saveNotificationState(context, Constants.SP_CHANNEL_FILE_NAME, str4);
        messageV2.language = UtilityImpl.getLanguageTag(context);
        messageV2.site = UtilityImpl.getSite(context);
        UtilityImpl.saveStringPairsToSp(context, Constants.SP_FILE_NAME, Pair.create(Constants.KEY_LANGUAGE_TAG, messageV2.language), Pair.create("site", messageV2.site));
        messageV2.romInfo = pfo.b().a();
        messageV2.umidToken = getUmidToken(context);
        messageV2.regId = j8l.p(context);
        messageV2.floatingEnable = "true".equals(String.valueOf(xd0.a(context))) ? "1" : str3;
        if (Launcher_InitPush.isSupportPush()) {
            str3 = "1";
        }
        messageV2.supportVendor = str3;
        return messageV2;
    }
}
