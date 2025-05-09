package com.taobao.message.sp.framework.implement;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.message.sp.framework.model.SimpleTarget;
import com.taobao.message.sp.framework.mtop.MtopAmpAmpserviceGetbatchampuserinfoforimRequest;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmp2BcMessageSendResponse;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONArray;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J9\u0010\u000e\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0011\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJA\u0010\u000e\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\n¢\u0006\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/taobao/message/sp/framework/implement/SimpleBCProfileService;", "Lcom/taobao/message/sp/framework/implement/SimpleBaseProfileService;", "", "mIdentifier", "mChannelType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "targetIds", "bizType", "Lcom/taobao/message/kit/core/IObserver;", "Lcom/taobao/message/sp/framework/model/SimpleProfile;", "observer", "Ltb/xhv;", "listProfiles", "(Ljava/util/List;Ljava/lang/String;Lcom/taobao/message/kit/core/IObserver;)V", "targetNicks", "listProfilesByNick", "", "isNick", "(Ljava/util/List;Ljava/lang/String;ZLcom/taobao/message/kit/core/IObserver;)V", "Ljava/lang/String;", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SimpleBCProfileService extends SimpleBaseProfileService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mChannelType;
    private final String mIdentifier;

    static {
        t2o.a(552599648);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleBCProfileService(String str, String str2) {
        super(str, str2);
        ckf.h(str, "mIdentifier");
        ckf.h(str2, "mChannelType");
        this.mIdentifier = str;
        this.mChannelType = str2;
    }

    public static /* synthetic */ Object ipc$super(SimpleBCProfileService simpleBCProfileService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/sp/framework/implement/SimpleBCProfileService");
    }

    public static /* synthetic */ void listProfiles$default(SimpleBCProfileService simpleBCProfileService, List list, String str, boolean z, IObserver iObserver, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8816e332", new Object[]{simpleBCProfileService, list, str, new Boolean(z), iObserver, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        simpleBCProfileService.listProfiles(list, str, z, iObserver);
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleProfileService
    public void listProfiles(List<String> list, String str, IObserver<List<SimpleProfile>> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("391e4f54", new Object[]{this, list, str, iObserver});
            return;
        }
        ckf.h(list, "targetIds");
        ckf.h(str, "bizType");
        ckf.h(iObserver, "observer");
        listProfiles(list, str, false, iObserver);
    }

    public final void listProfiles(List<String> list, final String str, boolean z, final IObserver<List<SimpleProfile>> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7231f14", new Object[]{this, list, str, new Boolean(z), iObserver});
            return;
        }
        ckf.h(list, "targetIds");
        ckf.h(str, "bizType");
        ckf.h(iObserver, "observer");
        MtopAmpAmpserviceGetbatchampuserinfoforimRequest mtopAmpAmpserviceGetbatchampuserinfoforimRequest = new MtopAmpAmpserviceGetbatchampuserinfoforimRequest();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) str, (String) list);
        if (z) {
            mtopAmpAmpserviceGetbatchampuserinfoforimRequest.setTargetUserNickMapJson(JSON.toJSONString(jSONObject));
        } else {
            mtopAmpAmpserviceGetbatchampuserinfoforimRequest.setTargetUserIdMapJson(JSON.toJSONString(jSONObject));
        }
        mtopAmpAmpserviceGetbatchampuserinfoforimRequest.setChannel(1L);
        mtopAmpAmpserviceGetbatchampuserinfoforimRequest.setRole(0L);
        RemoteBusiness.build((IMTOPDataObject) mtopAmpAmpserviceGetbatchampuserinfoforimRequest).registerListener(new IRemoteListener() { // from class: com.taobao.message.sp.framework.implement.SimpleBCProfileService$listProfiles$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    iObserver.onError(new IllegalStateException(String.valueOf(i)));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                org.json.JSONObject dataJsonObject;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = (mtopResponse == null || (dataJsonObject = mtopResponse.getDataJsonObject()) == null) ? null : dataJsonObject.getJSONArray(str);
                if (jSONArray != null && jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        try {
                            SimpleProfile simpleProfile = new SimpleProfile();
                            JSONObject parseObject = JSON.parseObject(jSONArray.getString(i2));
                            simpleProfile.setDisplayName(SimpleProfile.decryptBySecurityGuard(ApplicationUtil.getApplication(), parseObject.getString(SimpleProfile.KEY_DISPLAYNAME)));
                            simpleProfile.setNick(SimpleProfile.decryptBySecurityGuard(ApplicationUtil.getApplication(), parseObject.getString("nick")));
                            simpleProfile.setAvatarURL(parseObject.getString("headImgUr"));
                            simpleProfile.setTarget(SimpleTarget.obtain(SimpleProfile.decryptBySecurityGuard(ApplicationUtil.getApplication(), parseObject.getString("sUserId"))));
                            simpleProfile.setBizType(str);
                            arrayList.add(simpleProfile);
                        } catch (Exception unused) {
                        }
                    }
                }
                iObserver.onNext(arrayList);
                iObserver.onComplete();
            }
        }).startRequest(MtopTaobaoWirelessAmp2BcMessageSendResponse.class);
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleProfileService
    public void listProfilesByNick(List<String> list, String str, IObserver<List<SimpleProfile>> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a13131a", new Object[]{this, list, str, iObserver});
            return;
        }
        ckf.h(list, "targetNicks");
        ckf.h(str, "bizType");
        ckf.h(iObserver, "observer");
        listProfiles(list, str, true, iObserver);
    }
}
