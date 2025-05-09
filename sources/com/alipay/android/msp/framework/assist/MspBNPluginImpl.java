package com.alipay.android.msp.framework.assist;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.birdnest.api.MessageListener;
import com.alipay.android.app.birdnest.api.MspBNPlugin;
import com.alipay.android.app.birdnest.api.MspConstants;
import com.alipay.android.app.birdnest.api.MspViewMessageListener;
import com.alipay.android.app.birdnest.api.MspWindowLoadPoint;
import com.alipay.android.app.birdnest.api.OnFrameTplEventListener;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.context.MspContainerContext;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.core.model.BirdNestFrameEvent;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.views.MspProxyActivity;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import java.util.HashMap;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspBNPluginImpl implements MspBNPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final FBContext.JsExecOptions g = FBContext.JsExecOptions.create().setAsyncMode(1).setCallbackMode(0).setBlockTimeoutMs(60000);
    public View c;
    public MspProxyActivity d;

    /* renamed from: a  reason: collision with root package name */
    public int f3584a = 0;
    public String b = "";
    public final Random e = new Random(System.currentTimeMillis());
    public final HashMap<String, MessageListener> f = new HashMap<>(16);

    public static /* synthetic */ int access$000(MspBNPluginImpl mspBNPluginImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("35e3622d", new Object[]{mspBNPluginImpl})).intValue();
        }
        return mspBNPluginImpl.f3584a;
    }

    public static /* synthetic */ void access$100(MspBNPluginImpl mspBNPluginImpl, final MspViewMessageListener mspViewMessageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0b47a0e", new Object[]{mspBNPluginImpl, mspViewMessageListener});
            return;
        }
        if (mspViewMessageListener == null) {
            mspViewMessageListener = new MspViewMessageListener() { // from class: com.alipay.android.msp.framework.assist.MspBNPluginImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.app.birdnest.api.MspViewMessageListener
                public void onReceiveMessage(String str, JSONObject jSONObject, MessageListener messageListener) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d18b1e38", new Object[]{this, str, jSONObject, messageListener});
                        return;
                    }
                    LogUtil.record(2, "MspBNPluginImpl::onReceiveMessage", "jsonObject=" + jSONObject.toJSONString());
                }
            };
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(mspBNPluginImpl.getBizId());
        if (mspContextByBizId != null) {
            MspWindowClient mspWindowClient = (MspWindowClient) mspContextByBizId.getMspUIClient();
            if (mspWindowClient != null) {
                mspWindowClient.setOnFrameTplEventListener(new OnFrameTplEventListener() { // from class: com.alipay.android.msp.framework.assist.MspBNPluginImpl.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.android.app.birdnest.api.OnFrameTplEventListener
                    public boolean onInterceptTplEvent(Object obj, String str, EventAction.MspEvent mspEvent) {
                        JSONObject actionParamsJson;
                        MessageListener messageListener;
                        final View view;
                        MspWindowClient mspWindowClient2;
                        MspWindowFrame currentWindowFrame;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("a565d675", new Object[]{this, obj, str, mspEvent})).booleanValue();
                        }
                        LogUtil.record(2, "MspBNPluginImpl::onInterceptTplEvent", "params=".concat(String.valueOf(str)));
                        if (mspEvent == null) {
                            return false;
                        }
                        MspContext mspContextByBizId2 = MspContextManager.getInstance().getMspContextByBizId(MspBNPluginImpl.this.getBizId());
                        if (!(mspContextByBizId2 == null || !(obj instanceof FBDocument) || (mspWindowClient2 = (MspWindowClient) mspContextByBizId2.getMspUIClient()) == null || (currentWindowFrame = mspWindowClient2.getCurrentWindowFrame()) == null || currentWindowFrame.getFBDocument() != null)) {
                            currentWindowFrame.setFBDocument((FBDocument) obj);
                        }
                        if (!TextUtils.equals(mspEvent.getActionName(), MspFlybirdDefine.FLYBIRD_FRAME_EVENT)) {
                            return false;
                        }
                        try {
                            actionParamsJson = mspEvent.getActionParamsJson();
                        } catch (Throwable th) {
                            LogUtil.printExceptionStackTrace(th);
                        }
                        if (actionParamsJson == null) {
                            return false;
                        }
                        LogUtil.record(2, "MspBNPluginImpl::onInterceptTplEvent", "mspEvent=" + actionParamsJson.toJSONString());
                        final BirdNestFrameEvent birdNestFrameEvent = new BirdNestFrameEvent(actionParamsJson);
                        if (TextUtils.equals(birdNestFrameEvent.getKey(), "MQPBNFRAME_RENDER_SUCCESS")) {
                            if (!(mspContextByBizId2 == null || (view = MspBNPluginImpl.this.getView()) == null)) {
                                view.post(new Runnable() { // from class: com.alipay.android.msp.framework.assist.MspBNPluginImpl.4.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            return;
                                        }
                                        LogUtil.record(2, "MspBNPluginImpl::onInterceptTplEvent view post", "width = " + view.getMeasuredWidth() + ", height = " + view.getMeasuredHeight());
                                        view.setVisibility(0);
                                    }
                                });
                                view.setVisibility(4);
                            }
                            MspBNPluginImpl.access$300(MspBNPluginImpl.this, birdNestFrameEvent.getMqpToken());
                            mspViewMessageListener.onReceiveMessage("MQPBNFRAME_RENDER_SUCCESS", birdNestFrameEvent.getArgs(), new MessageListener() { // from class: com.alipay.android.msp.framework.assist.MspBNPluginImpl.4.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.alipay.android.app.birdnest.api.MessageListener
                                public void onResult(JSONObject jSONObject) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("2bc05ded", new Object[]{this, jSONObject});
                                    } else {
                                        MspBNPluginImpl.access$400(MspBNPluginImpl.this, birdNestFrameEvent.getId(), birdNestFrameEvent.getMqpToken(), jSONObject);
                                    }
                                }
                            });
                            return true;
                        }
                        if (birdNestFrameEvent.isOnEvent()) {
                            mspViewMessageListener.onReceiveMessage(birdNestFrameEvent.getKey(), birdNestFrameEvent.getArgs(), new MessageListener() { // from class: com.alipay.android.msp.framework.assist.MspBNPluginImpl.4.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.alipay.android.app.birdnest.api.MessageListener
                                public void onResult(JSONObject jSONObject) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("2bc05ded", new Object[]{this, jSONObject});
                                    } else {
                                        MspBNPluginImpl.access$400(MspBNPluginImpl.this, birdNestFrameEvent.getId(), birdNestFrameEvent.getMqpToken(), jSONObject);
                                    }
                                }
                            });
                        } else if (birdNestFrameEvent.isOnEventResult() && (messageListener = (MessageListener) MspBNPluginImpl.access$500(MspBNPluginImpl.this).get(birdNestFrameEvent.getId())) != null) {
                            messageListener.onResult(birdNestFrameEvent.getArgs());
                        }
                        return true;
                    }
                });
                return;
            }
            return;
        }
        LogUtil.record(8, "MspBNPluginImpl::onBeforeLoad", "mspContext null");
    }

    public static /* synthetic */ void access$200(MspBNPluginImpl mspBNPluginImpl, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ae5bda", new Object[]{mspBNPluginImpl, view});
        } else {
            mspBNPluginImpl.c = view;
        }
    }

    public static /* synthetic */ void access$300(MspBNPluginImpl mspBNPluginImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84026fe1", new Object[]{mspBNPluginImpl, str});
        } else {
            mspBNPluginImpl.b = str;
        }
    }

    public static /* synthetic */ HashMap access$500(MspBNPluginImpl mspBNPluginImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ac3b4fb8", new Object[]{mspBNPluginImpl});
        }
        return mspBNPluginImpl.f;
    }

    public static FBContext b(MspContext mspContext) {
        MspWindowClient mspWindowClient;
        MspWindowFrame currentWindowFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBContext) ipChange.ipc$dispatch("b335cb57", new Object[]{mspContext});
        }
        if (mspContext == null || (mspWindowClient = (MspWindowClient) mspContext.getMspUIClient()) == null || (currentWindowFrame = mspWindowClient.getCurrentWindowFrame()) == null) {
            return null;
        }
        FBDocument fBDocument = currentWindowFrame.getFBDocument();
        if (fBDocument == null) {
            return PluginManager.getRender().getFbContextFromView(currentWindowFrame.getContentView());
        }
        return fBDocument;
    }

    @Override // com.alipay.android.app.birdnest.api.MspBNPlugin
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f.clear();
        this.d.onDestroy();
    }

    @Override // com.alipay.android.app.birdnest.api.MspBNPlugin
    public int getBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue();
        }
        return this.f3584a;
    }

    @Override // com.alipay.android.app.birdnest.api.MspBNPlugin
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.c;
    }

    public static /* synthetic */ void access$400(MspBNPluginImpl mspBNPluginImpl, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe4d866", new Object[]{mspBNPluginImpl, str, str2, jSONObject});
            return;
        }
        LogUtil.record(2, "MspBNPluginImpl::onReceivedMessage", "mBizId=" + mspBNPluginImpl.f3584a + " id=" + str + " , mqpToken" + str2 + " , result" + jSONObject);
        if (mspBNPluginImpl.f3584a != 0 && str != null && str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT_RESULT);
            jSONObject2.put("id", (Object) str);
            jSONObject2.put("mpqToken", (Object) str2);
            if (jSONObject == null) {
                jSONObject2.put("result", "{}");
            } else {
                jSONObject2.put("result", (Object) jSONObject.toJSONString());
            }
            mspBNPluginImpl.a(jSONObject2);
        }
    }

    public final void a(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b16e04", new Object[]{this, jSONObject});
            return;
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.f3584a);
        if (mspContextByBizId == null || !mspContextByBizId.isUseSafeJsExecute()) {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.framework.assist.MspBNPluginImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    MspWindowClient mspWindowClient;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String str = "window.onFramePluginEvent&&window.onFramePluginEvent('" + Utils.toJsJsonString(jSONObject.toJSONString()) + "');";
                        LogUtil.record(2, "BNFramePlugin", "event:jsInstruction = ".concat(String.valueOf(str)));
                        MspContext mspContextByBizId2 = MspContextManager.getInstance().getMspContextByBizId(MspBNPluginImpl.access$000(MspBNPluginImpl.this));
                        if (!(mspContextByBizId2 == null || (mspWindowClient = (MspWindowClient) mspContextByBizId2.getMspUIClient()) == null)) {
                            MspWindowFrame currentWindowFrame = mspWindowClient.getCurrentWindowFrame();
                            if (currentWindowFrame != null && currentWindowFrame.getFBDocument() != null) {
                                LogUtil.record(2, "MspBNPluginImpl::sendMessageToTemplate", "event:fbctxresult = ".concat(String.valueOf(currentWindowFrame.getFBDocument().executeJs(str))));
                                return;
                            } else if (!(currentWindowFrame == null || currentWindowFrame.getContentView() == null)) {
                                LogUtil.record(2, "MspBNPluginImpl::sendMessageToTemplate", "event:viewresult = ".concat(String.valueOf(PluginManager.getRender().callExecuteJs(currentWindowFrame.getContentView(), str))));
                                return;
                            }
                        }
                        StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.WARNING, "sendMsgWhenViewGone", "message=" + jSONObject.toJSONString());
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            });
            return;
        }
        try {
            String str = "window.onFramePluginEvent&&window.onFramePluginEvent('" + Utils.toJsJsonString(jSONObject.toJSONString()) + "');";
            LogUtil.record(2, "BNFramePlugin", "event:jsInstruction = ".concat(String.valueOf(str)));
            FBContext b = b(mspContextByBizId);
            if (b != null) {
                b.safeExecuteJs(str, g, null);
                return;
            }
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.WARNING, "sendMsgWhenViewGone", "message=" + jSONObject.toJSONString());
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    @Override // com.alipay.android.app.birdnest.api.MspBNPlugin
    public void sendMessage(String str, JSONObject jSONObject, MessageListener messageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1ff9c34", new Object[]{this, str, jSONObject, messageListener});
            return;
        }
        LogUtil.record(2, "MspBNPluginImpl::onReceivedMessage", "mBizId=" + this.f3584a + " actionType=" + str + " , data" + jSONObject);
        if (this.f3584a != 0 && str != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT);
            String str2 = str + this.b + System.currentTimeMillis() + this.e.nextInt();
            if (messageListener != null) {
                this.f.put(str2, messageListener);
            }
            jSONObject2.put("id", (Object) str2);
            jSONObject2.put(MspConstants.bannerKey.MQP_TOKEN, (Object) this.b);
            jSONObject2.put("key", (Object) str);
            if (jSONObject == null) {
                jSONObject2.put("args", "{}");
            } else {
                jSONObject2.put("args", (Object) jSONObject.toJSONString());
            }
            a(jSONObject2);
        }
    }

    public void init(JSONObject jSONObject, boolean z, Bundle bundle, String str, final Activity activity, String str2, final MspViewMessageListener mspViewMessageListener) {
        String str3;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b374e154", new Object[]{this, jSONObject, new Boolean(z), bundle, str, activity, str2, mspViewMessageListener});
            return;
        }
        LogUtil.record(2, "MspBNPluginImpl::init", "mspViewMessageListener ".concat(String.valueOf(mspViewMessageListener)));
        if (jSONObject == null || str == null || activity == null || str2 == null) {
            LogUtil.record(8, "MspBNPluginImpl::init", "init failed, some params is null");
            return;
        }
        String str4 = MspContext.CONTEXT_TYPE_RENDER;
        int hashCode = str2.hashCode();
        if (hashCode == -1354814997) {
            str2.equals("common");
        } else if (hashCode == 97692013 && str2.equals("frame")) {
            JSONObject frameTplInfo2CommonTplInfo = Utils.frameTplInfo2CommonTplInfo(jSONObject);
            str3 = MspContext.CONTEXT_TYPE_BNFRAME;
            jSONObject2 = frameTplInfo2CommonTplInfo;
            MspWindowLoadPoint mspWindowLoadPoint = new MspWindowLoadPoint() { // from class: com.alipay.android.msp.framework.assist.MspBNPluginImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.app.birdnest.api.MspWindowLoadPoint
                public void beforeCreateView(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5963a8bc", new Object[]{this, new Integer(i)});
                    } else if (i == MspBNPluginImpl.this.getBizId()) {
                        MspBNPluginImpl.access$100(MspBNPluginImpl.this, mspViewMessageListener);
                    }
                }

                @Override // com.alipay.android.app.birdnest.api.MspWindowLoadListener
                public void onCloseWindow(View view, Bundle bundle2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("69ce5f72", new Object[]{this, view, bundle2});
                    } else {
                        LogUtil.record(2, "MspBNPluginImpl::init", "close window: ".concat(String.valueOf(view)));
                    }
                }

                @Override // com.alipay.android.app.birdnest.api.MspWindowLoadListener
                public void onWindowLoadFail(int i, Bundle bundle2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("13a3cbeb", new Object[]{this, new Integer(i), bundle2});
                        return;
                    }
                    LogUtil.record(8, "MspBNPluginImpl::init", "load window failed: " + activity);
                }

                @Override // com.alipay.android.app.birdnest.api.MspWindowLoadListener
                public void onWindowLoadSuccess(View view, Bundle bundle2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a9afa297", new Object[]{this, view, bundle2});
                        return;
                    }
                    LogUtil.record(2, "MspBNPluginImpl::init", "load window success: ".concat(String.valueOf(view)));
                    if (view != null && bundle2.getInt("mspBizId") == MspBNPluginImpl.this.getBizId() && MspBNPluginImpl.this.getView() == null) {
                        MspBNPluginImpl.access$200(MspBNPluginImpl.this, view);
                    }
                }

                @Override // com.alipay.android.app.birdnest.api.MspWindowLoadListener
                public void onWindowResize(int i, int i2, Bundle bundle2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b647d36a", new Object[]{this, new Integer(i), new Integer(i2), bundle2});
                        return;
                    }
                    LogUtil.record(2, "MspBNPluginImpl::init", "resize window: " + activity);
                }
            };
            int hashCode2 = (jSONObject2.toString() + System.currentTimeMillis()).hashCode();
            this.f3584a = hashCode2;
            MspContainerContext mspContainerContext = new MspContainerContext(hashCode2, jSONObject2, "", "", activity, z, bundle, null, str, false, null, str3);
            MspProxyActivity mspProxyActivity = new MspProxyActivity(activity, hashCode2);
            this.d = mspProxyActivity;
            mspContainerContext.startGenerateView(mspProxyActivity.getPresenter(), mspWindowLoadPoint);
        }
        str3 = str4;
        jSONObject2 = jSONObject;
        MspWindowLoadPoint mspWindowLoadPoint2 = new MspWindowLoadPoint() { // from class: com.alipay.android.msp.framework.assist.MspBNPluginImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.app.birdnest.api.MspWindowLoadPoint
            public void beforeCreateView(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5963a8bc", new Object[]{this, new Integer(i)});
                } else if (i == MspBNPluginImpl.this.getBizId()) {
                    MspBNPluginImpl.access$100(MspBNPluginImpl.this, mspViewMessageListener);
                }
            }

            @Override // com.alipay.android.app.birdnest.api.MspWindowLoadListener
            public void onCloseWindow(View view, Bundle bundle2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("69ce5f72", new Object[]{this, view, bundle2});
                } else {
                    LogUtil.record(2, "MspBNPluginImpl::init", "close window: ".concat(String.valueOf(view)));
                }
            }

            @Override // com.alipay.android.app.birdnest.api.MspWindowLoadListener
            public void onWindowLoadFail(int i, Bundle bundle2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("13a3cbeb", new Object[]{this, new Integer(i), bundle2});
                    return;
                }
                LogUtil.record(8, "MspBNPluginImpl::init", "load window failed: " + activity);
            }

            @Override // com.alipay.android.app.birdnest.api.MspWindowLoadListener
            public void onWindowLoadSuccess(View view, Bundle bundle2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a9afa297", new Object[]{this, view, bundle2});
                    return;
                }
                LogUtil.record(2, "MspBNPluginImpl::init", "load window success: ".concat(String.valueOf(view)));
                if (view != null && bundle2.getInt("mspBizId") == MspBNPluginImpl.this.getBizId() && MspBNPluginImpl.this.getView() == null) {
                    MspBNPluginImpl.access$200(MspBNPluginImpl.this, view);
                }
            }

            @Override // com.alipay.android.app.birdnest.api.MspWindowLoadListener
            public void onWindowResize(int i, int i2, Bundle bundle2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b647d36a", new Object[]{this, new Integer(i), new Integer(i2), bundle2});
                    return;
                }
                LogUtil.record(2, "MspBNPluginImpl::init", "resize window: " + activity);
            }
        };
        int hashCode22 = (jSONObject2.toString() + System.currentTimeMillis()).hashCode();
        this.f3584a = hashCode22;
        MspContainerContext mspContainerContext2 = new MspContainerContext(hashCode22, jSONObject2, "", "", activity, z, bundle, null, str, false, null, str3);
        MspProxyActivity mspProxyActivity2 = new MspProxyActivity(activity, hashCode22);
        this.d = mspProxyActivity2;
        mspContainerContext2.startGenerateView(mspProxyActivity2.getPresenter(), mspWindowLoadPoint2);
    }
}
