package com.taobao.message.message_open_api_adapter;

import android.content.Context;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.CallService;
import com.taobao.message.message_open_api.core.CallException;
import com.taobao.message.message_open_api.core.CallResponse;
import com.taobao.message.message_open_api_adapter.Constants;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class OpenAPI4ARiver implements BridgeExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "OpenAPI4ARiver";

    static {
        t2o.a(529531053);
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void mpmopenapi(@BindingNode(Page.class) Page page, @BindingParam(name = {"api"}) String str, @BindingParam(name = {"params"}) Map<String, Object> map, @BindingCallback final BridgeCallback bridgeCallback) {
        final String str2;
        Map<String, ? extends Object> innerMap;
        JSONObject jSONObject;
        Context activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1cf79c0", new Object[]{this, page, str, map, bridgeCallback});
            return;
        }
        if (page != null) {
            str2 = page.getOriginalURI();
            page.setExitListener(new Page.ExitListener() { // from class: com.taobao.message.message_open_api_adapter.OpenAPI4ARiver.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.ariver.app.api.Page.ExitListener
                public void onExit() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2681a1a4", new Object[]{this});
                    } else {
                        CallService.INSTANCE.unsubscribe(str2);
                    }
                }
            });
        } else {
            str2 = "default";
        }
        JSONObject parseObject = JSON.parseObject(JSON.toJSONString(map));
        if (parseObject.getJSONObject("ext") == null) {
            innerMap = new HashMap<>();
        } else {
            innerMap = parseObject.getJSONObject("ext").getInnerMap();
        }
        if (parseObject.getJSONObject("data") == null) {
            jSONObject = new JSONObject();
        } else {
            jSONObject = parseObject.getJSONObject("data");
        }
        innerMap.put(Constants.KEY_SUBSCRIBE_TAG, str2);
        innerMap.put(Constants.KEY_CHANNEL_TAG, Constants.Modules.API_ARIVER);
        CallService callService = CallService.INSTANCE;
        if (page == null) {
            activity = ApplicationUtil.getApplication();
        } else if (page.getPageContext() == null) {
            activity = ApplicationUtil.getApplication();
        } else {
            activity = page.getPageContext().getActivity();
        }
        callService.call(activity, str, jSONObject, null, innerMap, new IObserver<Object>() { // from class: com.taobao.message.message_open_api_adapter.OpenAPI4ARiver.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.kit.core.IObserver
            public void onComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                } else {
                    bridgeCallback.sendJSONResponse(JSON.parseObject(JSON.toJSONString(CallResponse.complete())));
                }
            }

            @Override // com.taobao.message.kit.core.IObserver
            public void onError(Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                } else if (th instanceof CallException) {
                    CallException callException = (CallException) th;
                    bridgeCallback.sendJSONResponse(JSON.parseObject(JSON.toJSONString(CallResponse.error(callException.errCode, callException.errMsg))));
                } else {
                    bridgeCallback.sendJSONResponse(JSON.parseObject(JSON.toJSONString(CallResponse.error("-1", th.toString()))));
                }
            }

            @Override // com.taobao.message.kit.core.IObserver
            public void onNext(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4b8495", new Object[]{this, obj});
                    return;
                }
                try {
                    bridgeCallback.sendJSONResponse(JSON.parseObject(JSON.toJSONString(CallResponse.next(obj))), true);
                } catch (Exception e) {
                    bridgeCallback.sendJSONResponse(JSON.parseObject(JSON.toJSONString(CallResponse.error("-10013", "ariver callback json error!"))));
                    TLog.loge(OpenAPI4ARiver.TAG, e.toString());
                }
            }
        });
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.security.Guard
    public Permission permit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Permission) ipChange.ipc$dispatch("edbd77f9", new Object[]{this});
        }
        return null;
    }
}
