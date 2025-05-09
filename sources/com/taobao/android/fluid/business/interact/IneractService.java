package com.taobao.android.fluid.business.interact;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.TriggerChannelService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ReflectUtil;
import tb.ir9;
import tb.olk;
import tb.qz3;
import tb.sj4;
import tb.sv2;
import tb.t2o;
import tb.v7c;
import tb.yao;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class IneractService extends BroadcastReceiver implements IInteractService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String INTERACT_BROADCAST_ACTION = "guangguangInteractSynchronization";
    private static final String TAG = "IneractService";
    private final FluidContext mFluidContext;
    private olk<v7c> mFollowStateChangeListenerList = new olk<>();

    static {
        t2o.a(468713530);
        t2o.a(468713529);
    }

    public IneractService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    public static /* synthetic */ void access$000(IneractService ineractService, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4104b4b", new Object[]{ineractService, new Boolean(z), str});
        } else {
            ineractService.sendFollowStateChangeBroadcast(z, str);
        }
    }

    private Map<String, String> buildFollowRequestParam(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b241c37", new Object[]{this, str, str2, str3});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("spm-cnt", (Object) sj4.f28084a);
        jSONObject.put("spm-url", (Object) ((ISceneConfigService) this.mFluidContext.getService(ISceneConfigService.class)).getSessionParams().e);
        jSONObject.put("x_guangsource", (Object) ((ISceneConfigService) this.mFluidContext.getService(ISceneConfigService.class)).getSessionParams().c);
        jSONObject.put("source", (Object) ((ISceneConfigService) this.mFluidContext.getService(ISceneConfigService.class)).getSessionParams().c);
        jSONObject.put(MspGlobalDefine.APP_KEY, (Object) "21646297");
        jSONObject.put("targetUserId", (Object) str);
        jSONObject.put("content_id", (Object) str3);
        HashMap hashMap = new HashMap();
        hashMap.put("keyName", str2);
        hashMap.put("targetUserIdStr", str);
        hashMap.put("originBiz", "guangguang");
        hashMap.put("originPage", "Page_videointeract");
        hashMap.put("originFlag", jSONObject.toJSONString());
        return hashMap;
    }

    public static /* synthetic */ Object ipc$super(IneractService ineractService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/interact/IneractService");
    }

    private void notifyFollowStateChange(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f43b9c", new Object[]{this, str, new Boolean(z)});
            return;
        }
        ir9.b(TAG, "notifyFollowStateChange:" + str + " , " + z);
        if (!TextUtils.isEmpty(str)) {
            ArrayList<a> mediaSetList = ((IDataService) this.mFluidContext.getService(IDataService.class)).getMediaSetList();
            if (!qz3.a(mediaSetList)) {
                for (a aVar : mediaSetList) {
                    MediaContentDetailData.Account account = aVar.i().account;
                    if (str.equals(account.idStr)) {
                        account.followed = Boolean.valueOf(z);
                    }
                }
            }
            for (v7c v7cVar : this.mFollowStateChangeListenerList.b()) {
                try {
                    v7cVar.a(str, z);
                } catch (Exception e) {
                    FluidException.throwObserverCallbackException(this.mFluidContext, v7cVar, "onBindDataPayloads", e);
                }
            }
        }
    }

    private void sendFollowStateChangeBroadcast(boolean z, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5feab27e", new Object[]{this, new Boolean(z), str});
            return;
        }
        Intent intent = new Intent(INTERACT_BROADCAST_ACTION);
        if (z) {
            str2 = "follow";
        } else {
            str2 = com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_UNFOLLOWED;
        }
        intent.putExtra(yj4.PARAM_FANDOM_INTERACTTYPE, str2);
        intent.putExtra(TriggerChannelService.EXTRA_ORIGIN, "Page_videointeract");
        intent.putExtra("userId", str);
        LocalBroadcastManager.getInstance(this.mFluidContext.getContext()).sendBroadcast(intent);
    }

    @Override // com.taobao.android.fluid.business.interact.IInteractService
    public void addFollowStateChangeListener(v7c v7cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8b7ae9a", new Object[]{this, v7cVar});
        } else {
            this.mFollowStateChangeListenerList.a(v7cVar);
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        try {
            LocalBroadcastManager.getInstance(this.mFluidContext.getContext()).registerReceiver(this, new IntentFilter(INTERACT_BROADCAST_ACTION));
        } catch (Throwable th) {
            ir9.c(TAG, "onCreateService error:", th);
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        try {
            LocalBroadcastManager.getInstance(this.mFluidContext.getContext()).unregisterReceiver(this);
        } catch (Throwable th) {
            ir9.c(TAG, "onDestroyService error:", th);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (INTERACT_BROADCAST_ACTION.equals(intent.getAction()) && (extras = intent.getExtras()) != null) {
            Set<String> keySet = extras.keySet();
            JSONObject jSONObject = new JSONObject();
            for (String str : keySet) {
                jSONObject.put(str, extras.get(str));
            }
            String string = jSONObject.getString("userId");
            String string2 = jSONObject.getString(yj4.PARAM_FANDOM_INTERACTTYPE);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            if ("follow".equalsIgnoreCase(string2) || com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_UNFOLLOWED.equalsIgnoreCase(string2)) {
                notifyFollowStateChange(string, "follow".equalsIgnoreCase(string2));
            }
        }
    }

    @Override // com.taobao.android.fluid.business.interact.IInteractService
    public void removeFollowStateChangeListener(v7c v7cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f9a0fd", new Object[]{this, v7cVar});
        } else {
            this.mFollowStateChangeListenerList.e(v7cVar);
        }
    }

    @Override // com.taobao.android.fluid.business.interact.IInteractService
    public void cancelFollow(final String str, String str2, String str3, final sv2<yao> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("289ad522", new Object[]{this, str, str2, str3, sv2Var});
            return;
        }
        ir9.b(TAG, "cancel follow request:" + str + "," + str2);
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.social.follow.guang.remove");
        mtopRequest.setVersion("1.0");
        mtopRequest.setNeedEcode(false);
        mtopRequest.setNeedSession(false);
        Map<String, String> buildFollowRequestParam = buildFollowRequestParam(str, str2, str3);
        mtopRequest.dataParams = buildFollowRequestParam;
        mtopRequest.setData(ReflectUtil.convertMapToDataStr(buildFollowRequestParam));
        RemoteBusiness build = RemoteBusiness.build(mtopRequest);
        build.registerListener(new IRemoteListener() { // from class: com.taobao.android.fluid.business.interact.IneractService.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                sv2 sv2Var2 = sv2Var;
                if (sv2Var2 != null) {
                    sv2Var2.a(yao.a(mtopResponse.getRetCode(), mtopResponse.getRetMsg(), mtopResponse));
                }
                ir9.b(IneractService.TAG, "cancel follow error:" + mtopResponse);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                IneractService.access$000(IneractService.this, false, str);
                sv2 sv2Var2 = sv2Var;
                if (sv2Var2 != null) {
                    sv2Var2.a(yao.h(mtopResponse.getRetMsg(), null));
                }
                ir9.b(IneractService.TAG, "cancel follow success:" + mtopResponse);
            }
        });
        build.startRequest();
    }

    @Override // com.taobao.android.fluid.business.interact.IInteractService
    public void follow(final String str, String str2, String str3, final sv2<yao> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb221488", new Object[]{this, str, str2, str3, sv2Var});
            return;
        }
        ir9.b(TAG, "follow request:" + str + "," + str2);
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.social.follow.guang.add");
        mtopRequest.setVersion("1.0");
        mtopRequest.setNeedEcode(false);
        mtopRequest.setNeedSession(false);
        Map<String, String> buildFollowRequestParam = buildFollowRequestParam(str, str2, str3);
        mtopRequest.dataParams = buildFollowRequestParam;
        mtopRequest.setData(ReflectUtil.convertMapToDataStr(buildFollowRequestParam));
        RemoteBusiness build = RemoteBusiness.build(mtopRequest);
        build.registerListener(new IRemoteListener() { // from class: com.taobao.android.fluid.business.interact.IneractService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                sv2 sv2Var2 = sv2Var;
                if (sv2Var2 != null) {
                    sv2Var2.a(yao.a(mtopResponse.getRetCode(), mtopResponse.getRetMsg(), mtopResponse));
                }
                ir9.b(IneractService.TAG, "follow error:" + mtopResponse);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                IneractService.access$000(IneractService.this, true, str);
                sv2 sv2Var2 = sv2Var;
                if (sv2Var2 != null) {
                    sv2Var2.a(yao.h(mtopResponse.getRetMsg(), null));
                }
                ir9.b(IneractService.TAG, "follow success:" + mtopResponse);
            }
        });
        build.startRequest();
    }
}
