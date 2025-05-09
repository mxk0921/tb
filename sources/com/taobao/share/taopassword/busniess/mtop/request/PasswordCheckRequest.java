package com.taobao.share.taopassword.busniess.mtop.request;

import android.content.Context;
import android.text.TextUtils;
import androidx.appcompat.taobao.util.Globals;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.taopassword.busniess.mtop.response.MtopTaobaoWirelessSharePasswordGetResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bwr;
import tb.fwr;
import tb.htl;
import tb.j8t;
import tb.jhs;
import tb.r9;
import tb.ryd;
import tb.t2o;
import tb.w9;
import tb.y9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PasswordCheckRequest implements IRemoteBaseListener, ryd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int GET_TAOPASSWORD = 110;
    private static final String TAG = "PasswordCheckRequest";
    private RemoteBusiness remoteBusiness;
    private a requestContent;
    private htl rlistener;

    static {
        t2o.a(665845885);
        t2o.a(589299719);
        t2o.a(665845874);
    }

    private String getErrorCode(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4f0bf55", new Object[]{this, mtopResponse});
        }
        if (mtopResponse == null) {
            return "TPShareError_Others";
        }
        if (mtopResponse.isIllegelSign()) {
            return "TPShareError_IllegelSign";
        }
        if (mtopResponse.isSessionInvalid()) {
            return "TPShareError_SessionExpired";
        }
        if (mtopResponse.isNetworkError()) {
            return "TPShareError_NetworkTimeout";
        }
        if (mtopResponse.isMtopSdkError() || mtopResponse.isExpiredRequest() || mtopResponse.isSystemError()) {
            return "TPError_NetworkSysError";
        }
        if (mtopResponse.is41XResult() || mtopResponse.isApiLockedResult()) {
            return "TPShareError_NetworkLimit";
        }
        return mtopResponse.getRetCode();
    }

    private w9 parseRecResult(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w9) ipChange.ipc$dispatch("bdc090cc", new Object[]{this, map});
        }
        w9 w9Var = new w9();
        w9Var.b(new y9());
        w9Var.f = map.get("isTaoFriend");
        w9Var.g = map.get("taoFriendIcon");
        w9Var.s = map.get("bizId");
        map.get("content");
        w9Var.r = map.get("createAppkey");
        map.get(MspGlobalDefine.EXTENDINFO);
        map.get("leftButtonText");
        map.get("myTaopwdToast");
        map.get("ownerFace");
        map.get("ownerName");
        map.get("password");
        map.get("picUrl");
        w9Var.t = map.get("popType");
        map.get("popUrl");
        map.get("pricev");
        map.get("rankNum");
        map.get("rankPic");
        map.get("rightButtonText");
        map.get("taopwdOwnerId");
        map.get("title");
        w9Var.c = map.get("url");
        w9Var.b = map.get("templateId");
        map.get("validDate");
        map.get("weakShow");
        w9Var.u = map.get("shareDataTrack");
        String str = map.get("chatPopMap");
        if (!TextUtils.isEmpty(str)) {
            r9 r9Var = (r9) JSON.parseObject(str, r9.class);
            w9Var.n = r9Var;
            if (r9Var != null && !TextUtils.isEmpty(w9Var.f)) {
                "true".equals(w9Var.f);
            }
        }
        try {
            JSONObject parseObject = JSON.parseObject(map.get("chatParams"));
            if (parseObject != null) {
                parseObject.put("userId", (Object) SecurityGuardManager.getInstance(Globals.getApplication()).getStaticDataEncryptComp().staticSafeDecrypt(16, "amp-relation_user_signcheck", parseObject.getString("encryptSharerId")));
                parseObject.remove("encryptSharerId");
                map.put("chatParams", parseObject.toJSONString());
            }
        } catch (Throwable th) {
            fwr.b(TAG, th.toString());
        }
        return w9Var;
    }

    @Override // tb.ryd
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.remoteBusiness;
        if (remoteBusiness != null) {
            remoteBusiness.cancelRequest();
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            this.rlistener.a(getErrorCode(mtopResponse), mtopResponse.getRetMsg());
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        Map map = (Map) baseOutDo.getData();
        w9 parseRecResult = parseRecResult((Map) baseOutDo.getData());
        y9 a2 = parseRecResult.a();
        bwr.h().w(bwr.QUERYPASSEORD, parseRecResult.u);
        a aVar = this.requestContent;
        String str = aVar.f11767a;
        if (str != null) {
            a2.f31916a = str;
        }
        String str2 = aVar.d;
        if (str2 != null) {
            a2.b = str2;
        }
        this.rlistener.b(parseRecResult, map);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            this.rlistener.a(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
        }
    }

    @Override // tb.ryd
    public void request(Context context, Object obj, jhs jhsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0e5a749", new Object[]{this, context, obj, jhsVar});
            return;
        }
        this.rlistener = (htl) jhsVar;
        if (jhsVar != null && obj != null) {
            try {
                this.requestContent = (a) obj;
                MtopCheckPasswordHashRequest mtopCheckPasswordHashRequest = new MtopCheckPasswordHashRequest();
                mtopCheckPasswordHashRequest.setPasswordContent(this.requestContent.f11767a);
                mtopCheckPasswordHashRequest.setPasswordKeyList(JSON.toJSONString(this.requestContent.c));
                mtopCheckPasswordHashRequest.setOpenHash(this.requestContent.b.booleanValue());
                mtopCheckPasswordHashRequest.setCopyFromTb(this.requestContent.e);
                String str = this.requestContent.d;
                if ("pic".equals(str)) {
                    str = "copy";
                }
                mtopCheckPasswordHashRequest.setPasswordType(str);
                RemoteBusiness registeListener = RemoteBusiness.build(context, mtopCheckPasswordHashRequest, j8t.a()).registeListener((MtopListener) this);
                this.remoteBusiness = registeListener;
                registeListener.setBizId(67);
                if ("true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "queryShareLogin", "false"))) {
                    this.remoteBusiness.showLoginUI(true);
                } else {
                    this.remoteBusiness.showLoginUI(false);
                }
                this.remoteBusiness.startRequest(110, MtopTaobaoWirelessSharePasswordGetResponse.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f11767a;
        public final Boolean b;
        public final List<String> c;
        public final String d;
        public final boolean e;

        static {
            t2o.a(665845886);
        }

        public a(String str, String str2, boolean z) {
            this.b = Boolean.FALSE;
            this.f11767a = str;
            this.d = str2;
            this.e = z;
        }

        public a(String str, String str2, List<String> list, boolean z, boolean z2) {
            this.b = Boolean.FALSE;
            this.f11767a = str;
            this.d = str2;
            this.c = list;
            this.b = Boolean.valueOf(z);
            this.e = z2;
        }

        public a() {
            this.b = Boolean.FALSE;
        }
    }
}
