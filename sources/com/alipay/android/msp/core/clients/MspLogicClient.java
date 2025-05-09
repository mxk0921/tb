package com.alipay.android.msp.core.clients;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContainerContext;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.Action;
import com.alipay.android.msp.drivers.actions.ActionTypes;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.NetAction;
import com.alipay.android.msp.drivers.actions.UIAction;
import com.alipay.android.msp.drivers.dipatchers.Call;
import com.alipay.android.msp.drivers.dipatchers.MspDispatcher;
import com.alipay.android.msp.drivers.dipatchers.RealCall;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspLogicClient implements Call.Factory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MspDispatcher f3542a;
    public final ReentrantLock b = new ReentrantLock();
    public final int mBizId;
    public MspContext mMspContext;

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.core.clients.MspLogicClient$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$alipay$android$msp$drivers$actions$ActionTypes;

        static {
            int[] iArr = new int[ActionTypes.values().length];
            $SwitchMap$com$alipay$android$msp$drivers$actions$ActionTypes = iArr;
            try {
                iArr[ActionTypes.UI_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$drivers$actions$ActionTypes[ActionTypes.UI_SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$drivers$actions$ActionTypes[ActionTypes.COMMAND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$drivers$actions$ActionTypes[ActionTypes.NET_RETRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$drivers$actions$ActionTypes[ActionTypes.NET_REQUEST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$drivers$actions$ActionTypes[ActionTypes.NET_RESPONSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$drivers$actions$ActionTypes[ActionTypes.EXIT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$drivers$actions$ActionTypes[ActionTypes.EXCEPTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public MspLogicClient(MspContext mspContext) {
        this.f3542a = new MspDispatcher(mspContext);
        this.mBizId = mspContext.getBizId();
        this.mMspContext = mspContext;
    }

    public MspDispatcher dispatcher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspDispatcher) ipChange.ipc$dispatch("93b9d85a", new Object[]{this});
        }
        return this.f3542a;
    }

    public MspContext getMspContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("a6abce0a", new Object[]{this});
        }
        return this.mMspContext;
    }

    public ReentrantLock getUiLock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReentrantLock) ipChange.ipc$dispatch("106f7f50", new Object[]{this});
        }
        return this.b;
    }

    @Override // com.alipay.android.msp.drivers.dipatchers.Call.Factory
    public Call newCall(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Call) ipChange.ipc$dispatch("b52b7b87", new Object[]{this, action});
        }
        return RealCall.newRealCall(this, action);
    }

    public void onExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
            return;
        }
        synchronized (this.b) {
            try {
                MspDispatcher mspDispatcher = this.f3542a;
                if (mspDispatcher != null) {
                    mspDispatcher.onExit();
                    LogUtil.i("MspLogicClient", "onExit", "ctx=" + this.mMspContext + ", this=" + this);
                    this.f3542a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public JSONObject processAction(Action action) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5a4a858d", new Object[]{this, action});
        }
        JSONObject jSONObject = new JSONObject();
        if (this.mMspContext == null) {
            LogUtil.e("MspLogicClient", "processAction", "mMspContext is null");
            jSONObject.put("success", (Object) Boolean.TRUE);
            return jSONObject;
        } else if (action == null) {
            jSONObject.put("result", (Object) Boolean.FALSE);
            LogUtil.e("MspLogicClient", "processAction", "action is null");
            return jSONObject;
        } else {
            LogUtil.i("MspLogicClient", "processAction.request", action.toString());
            MspUIClient mspUIClient = this.mMspContext.getMspUIClient();
            String str = null;
            switch (AnonymousClass1.$SwitchMap$com$alipay$android$msp$drivers$actions$ActionTypes[action.getType().ordinal()]) {
                case 1:
                    if (action instanceof UIAction) {
                        MspContext mspContext = this.mMspContext;
                        if (!(mspContext instanceof MspTradeContext)) {
                            if (mspContext instanceof MspContainerContext) {
                                jSONObject = mspUIClient.handleUiStartWithoutData((UIAction) action, (MspContainerContext) mspContext);
                                break;
                            }
                        } else {
                            jSONObject = mspUIClient.handleUiStartWithoutData((UIAction) action, (MspTradeContext) mspContext);
                            break;
                        }
                    } else {
                        throw new Exception("action type not match!");
                    }
                    break;
                case 2:
                    if (action instanceof UIAction) {
                        jSONObject = mspUIClient.handleUiShow((UIAction) action);
                        break;
                    } else {
                        throw new Exception("action type not match!");
                    }
                case 3:
                    if (action instanceof EventAction) {
                        MspContext mspContext2 = this.mMspContext;
                        if (!(mspContext2 == null || mspContext2.getStoreCenter() == null)) {
                            str = this.mMspContext.getStoreCenter().handleAction((EventAction) action);
                        }
                        if (str == null) {
                            jSONObject.put("success", (Object) Boolean.FALSE);
                            break;
                        } else {
                            jSONObject.put("result", (Object) str);
                            jSONObject.put("success", (Object) Boolean.TRUE);
                            break;
                        }
                    } else {
                        throw new Exception("action type not match!");
                    }
                    break;
                case 4:
                case 5:
                    if (action instanceof NetAction) {
                        MspContext mspContext3 = this.mMspContext;
                        if (mspContext3 instanceof MspTradeContext) {
                            jSONObject.put("success", (Object) Boolean.valueOf(((MspTradeContext) mspContext3).getMspNetworkClient().handleAction((NetAction) action)));
                            break;
                        }
                    }
                    throw new Exception("action type not match!");
                case 6:
                    break;
                case 7:
                    MspContext mspContext4 = this.mMspContext;
                    if (mspContext4 == null) {
                        jSONObject.put("success", (Object) Boolean.FALSE);
                        break;
                    } else {
                        mspContext4.exit(0);
                        jSONObject.put("success", (Object) Boolean.TRUE);
                        break;
                    }
                case 8:
                    if (action instanceof UIAction) {
                        Throwable th = (Throwable) ((UIAction) action).getData().get(UIAction.DataKeys.exception, null);
                        MspBasePresenter mspBasePresenter = this.mMspContext.getMspBasePresenter();
                        if (mspBasePresenter != null) {
                            mspBasePresenter.onException(th);
                        } else {
                            this.mMspContext.setThrowableWhenNoPresenter(th);
                        }
                        jSONObject.put("success", (Object) Boolean.TRUE);
                        break;
                    } else {
                        throw new Exception("action type not match!");
                    }
                default:
                    jSONObject.put("success", (Object) Boolean.FALSE);
                    break;
            }
            LogUtil.i("MspLogicClient", "processAction.result", action.hashCode() + " " + action.getType().toString() + " " + jSONObject.toJSONString());
            return jSONObject;
        }
    }
}
