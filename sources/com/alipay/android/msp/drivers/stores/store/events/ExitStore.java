package com.alipay.android.msp.drivers.stores.store.events;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.pay.results.MspPayResult;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.widget.dialog.ThirdH5PageExitDialog;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ExitStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3573a = false;

    public ExitStore(int i) {
        super(i);
    }

    public static /* synthetic */ MspTradeContext access$000(ExitStore exitStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTradeContext) ipChange.ipc$dispatch("3123469e", new Object[]{exitStore});
        }
        return exitStore.mMspTradeContext;
    }

    public static /* synthetic */ Object ipc$super(ExitStore exitStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/ExitStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspContext mspContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (a(eventAction, mspEvent)) {
            return "";
        }
        int logFieldEndCode = eventAction.getLogFieldEndCode();
        if (!(logFieldEndCode == 0 || (mspContext = this.mMspContext) == null)) {
            mspContext.getStatisticInfo().updateAttr(Vector.Result, "clientEndCode", String.valueOf(logFieldEndCode));
        }
        MspContext mspContext2 = this.mMspContext;
        if (mspContext2 != null) {
            mspContext2.exit(0);
        }
        return String.valueOf(logFieldEndCode);
    }

    public final boolean a(final EventAction eventAction, final EventAction.MspEvent mspEvent) {
        MspUIClient mspUIClient;
        MspTradeContext mspTradeContext;
        final MspPayResult mspPayResult;
        boolean booleanValue;
        final MspBasePresenter currentPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f6f19d6", new Object[]{this, eventAction, mspEvent})).booleanValue();
        }
        if (this.f3573a) {
            return false;
        }
        this.f3573a = true;
        MspContext mspContext = this.mMspContext;
        if (mspContext == null || this.mContext == null || (mspUIClient = mspContext.getMspUIClient()) == null || (mspTradeContext = this.mMspTradeContext) == null || (mspPayResult = mspTradeContext.getMspPayResult()) == null) {
            return false;
        }
        JSONObject extendInfo = mspPayResult.getExtendInfo();
        if (extendInfo.containsKey(MspFlybirdDefine.THIRDPROMPT)) {
            try {
                booleanValue = extendInfo.getBooleanValue(MspFlybirdDefine.THIRDPROMPT);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
            currentPresenter = mspUIClient.getCurrentPresenter();
            if (currentPresenter == null && booleanValue && mspPayResult.isSuccess() && this.mMspTradeContext.isFromThirdDomainJsApi() && currentPresenter.getIView() != null && currentPresenter.getActivity() != null) {
                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.ExitStore.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (currentPresenter.getIView() != null && currentPresenter.getActivity() != null) {
                            ThirdH5PageExitDialog thirdH5PageExitDialog = new ThirdH5PageExitDialog(currentPresenter.getActivity(), ExitStore.access$000(ExitStore.this).getDomain());
                            thirdH5PageExitDialog.show();
                            thirdH5PageExitDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.alipay.android.msp.drivers.stores.store.events.ExitStore.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.content.DialogInterface.OnKeyListener
                                public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        return ((Boolean) ipChange3.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue();
                                    }
                                    if (i != 4) {
                                        return false;
                                    }
                                    PhoneCashierMspEngine.getMspJump().processScheme(GlobalConstant.SCHEME_TO_WALLET_HOME);
                                    mspPayResult.addExtendInfoByKeyAndValue(MspGlobalDefine.EXITMODE, MspGlobalDefine.NOCALLBACK);
                                    AnonymousClass1 r6 = AnonymousClass1.this;
                                    ExitStore.this.onstMspAction(eventAction, mspEvent);
                                    return true;
                                }
                            });
                            thirdH5PageExitDialog.setLeftOnClickListener(new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.drivers.stores.store.events.ExitStore.1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.content.DialogInterface.OnClickListener
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                        return;
                                    }
                                    PhoneCashierMspEngine.getMspJump().processScheme(GlobalConstant.SCHEME_TO_WALLET_HOME);
                                    mspPayResult.addExtendInfoByKeyAndValue(MspGlobalDefine.EXITMODE, MspGlobalDefine.NOCALLBACK);
                                    AnonymousClass1 r4 = AnonymousClass1.this;
                                    ExitStore.this.onstMspAction(eventAction, mspEvent);
                                }
                            });
                            thirdH5PageExitDialog.setRightOnClickListener(new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.drivers.stores.store.events.ExitStore.1.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.content.DialogInterface.OnClickListener
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                        return;
                                    }
                                    AnonymousClass1 r4 = AnonymousClass1.this;
                                    ExitStore.this.onstMspAction(eventAction, mspEvent);
                                }
                            });
                        }
                    }
                });
                return true;
            }
            return false;
        }
        booleanValue = false;
        currentPresenter = mspUIClient.getCurrentPresenter();
        if (currentPresenter == null) {
            return false;
        }
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.ExitStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (currentPresenter.getIView() != null && currentPresenter.getActivity() != null) {
                    ThirdH5PageExitDialog thirdH5PageExitDialog = new ThirdH5PageExitDialog(currentPresenter.getActivity(), ExitStore.access$000(ExitStore.this).getDomain());
                    thirdH5PageExitDialog.show();
                    thirdH5PageExitDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.alipay.android.msp.drivers.stores.store.events.ExitStore.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnKeyListener
                        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return ((Boolean) ipChange3.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue();
                            }
                            if (i != 4) {
                                return false;
                            }
                            PhoneCashierMspEngine.getMspJump().processScheme(GlobalConstant.SCHEME_TO_WALLET_HOME);
                            mspPayResult.addExtendInfoByKeyAndValue(MspGlobalDefine.EXITMODE, MspGlobalDefine.NOCALLBACK);
                            AnonymousClass1 r6 = AnonymousClass1.this;
                            ExitStore.this.onstMspAction(eventAction, mspEvent);
                            return true;
                        }
                    });
                    thirdH5PageExitDialog.setLeftOnClickListener(new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.drivers.stores.store.events.ExitStore.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                return;
                            }
                            PhoneCashierMspEngine.getMspJump().processScheme(GlobalConstant.SCHEME_TO_WALLET_HOME);
                            mspPayResult.addExtendInfoByKeyAndValue(MspGlobalDefine.EXITMODE, MspGlobalDefine.NOCALLBACK);
                            AnonymousClass1 r4 = AnonymousClass1.this;
                            ExitStore.this.onstMspAction(eventAction, mspEvent);
                        }
                    });
                    thirdH5PageExitDialog.setRightOnClickListener(new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.drivers.stores.store.events.ExitStore.1.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                return;
                            }
                            AnonymousClass1 r4 = AnonymousClass1.this;
                            ExitStore.this.onstMspAction(eventAction, mspEvent);
                        }
                    });
                }
            }
        });
        return true;
    }
}
