package com.alipay.android.msp.drivers.stores.store.events;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.sys.DeviceInfo;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.base.OnResultReceived;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class OpenUrlStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Activity f3575a;

    public OpenUrlStore(int i) {
        super(i);
    }

    public static /* synthetic */ void access$000(OpenUrlStore openUrlStore, String str, JSONObject jSONObject, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e486cd", new Object[]{openUrlStore, str, jSONObject, str2});
        } else {
            openUrlStore.b(str, jSONObject, str2);
        }
    }

    public static /* synthetic */ Object ipc$super(OpenUrlStore openUrlStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/OpenUrlStore");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
        if (r10.equals("5") == false) goto L_0x0059;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r10, com.alibaba.fastjson.JSONObject r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.OpenUrlStore.b(java.lang.String, com.alibaba.fastjson.JSONObject, java.lang.String):void");
    }

    public final void c(final String str, final String str2, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addCategory("android.intent.category.BROWSABLE");
        MspBasePresenter currentPresenter = this.mMspContext.getMspUIClient().getCurrentPresenter();
        if (currentPresenter == null || currentPresenter.getIView() == null) {
            Activity activity = this.f3575a;
            if (activity != null) {
                activity.startActivity(intent);
                return;
            }
            return;
        }
        currentPresenter.getIView().openActivity(intent, new OnResultReceived() { // from class: com.alipay.android.msp.drivers.stores.store.events.OpenUrlStore.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.ui.base.OnResultReceived
            public void onReceiveResult(String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e1927912", new Object[]{this, str3});
                } else {
                    OpenUrlStore.access$000(OpenUrlStore.this, str2, jSONObject, str);
                }
            }
        });
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(this.mBizId);
        if (tradeContextByBizId != null && tradeContextByBizId.getMspPayResult() != null) {
            LogUtil.record(4, "", "OpenUrlStore::processUrl", "exitNoCallback");
            tradeContextByBizId.getMspPayResult().addExtendInfoByKeyAndValue(MspGlobalDefine.EXITMODE, MspGlobalDefine.NOCALLBACK);
            this.mMspContext.exit(600);
        }
    }

    public final void d(final String str, String str2, final String str3, final JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d85c4c6", new Object[]{this, str, str2, str3, jSONObject, jSONObject2});
            return;
        }
        if ("6".equals(str3)) {
            MspContext mspContext = this.mMspContext;
            if (mspContext instanceof MspTradeContext) {
                ((MspTradeContext) mspContext).setCanMulti(false);
                MspBasePresenter currentPresenter = this.mMspContext.getMspUIClient().getCurrentPresenter();
                if (!(currentPresenter == null || currentPresenter.getIView() == null)) {
                    currentPresenter.getIView().showLoadingView(new String[0]);
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            StEvent stEvent = this.mStEvent;
            stEvent.onStatistic("action", "openUrl|" + Utils.truncateString(str, 100));
            if ("6".equals(str3) && "h5".equals(str2)) {
                LogUtil.record(4, "", "OpenUrlStore::processUrl", "OpenUrl by env h5:".concat(String.valueOf(str)));
                try {
                    MspBasePresenter currentPresenter2 = this.mMspContext.getMspUIClient().getCurrentPresenter();
                    if (currentPresenter2 == null || currentPresenter2.getIView() == null) {
                        PhoneCashierMspEngine.getMspJump().processUrl(this.f3575a, str);
                    } else if (!currentPresenter2.getIView().openUrl(str, new OnResultReceived() { // from class: com.alipay.android.msp.drivers.stores.store.events.OpenUrlStore.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.android.msp.ui.base.OnResultReceived
                        public void onReceiveResult(String str4) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("e1927912", new Object[]{this, str4});
                            } else {
                                OpenUrlStore.access$000(OpenUrlStore.this, str3, jSONObject, str);
                            }
                        }
                    })) {
                        c(str, str3, jSONObject);
                    }
                } catch (Exception e) {
                    LogUtil.record(4, "", "OpenUrlStore::processUrl", "failed to open env h5");
                    LogUtil.printExceptionStackTrace(e);
                    c(str, str3, jSONObject);
                }
            } else if ("2".equals(str3)) {
                a(str, jSONObject2);
            } else if (str.startsWith(MspGlobalDefine.AFWEALTH_SCHEME)) {
                LogUtil.record(4, "", "OpenUrlStore::processUrl", "OpenUrl by AFWEALTH_SCHEME:".concat(str));
                Intent intent = new Intent();
                intent.setAction(MspGlobalDefine.AFWEALTH_OPNEURL_ACTION);
                intent.putExtra(MspGlobalDefine.AFWEALTH_OPENURL_PARAM, str);
                LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent);
            } else if (!str.startsWith(MspGlobalDefine.ALIPAY_SCHEME) || DeviceInfo.hasAlipayWallet(this.mContext)) {
                String packageName = this.f3575a.getPackageName();
                if (TextUtils.equals(packageName, MspGlobalDefine.PACKAGE_AFWEALTH) && str.startsWith(MspGlobalDefine.ALIPAYS_SCHEME)) {
                    str = str.replaceFirst(MspGlobalDefine.ALIPAYS_SCHEME, MspGlobalDefine.AFWEALTH_SCHEME);
                } else if (TextUtils.equals(packageName, "hk.alipay.wallet") && str.startsWith(MspGlobalDefine.ALIPAYS_SCHEME)) {
                    str = str.replaceFirst(MspGlobalDefine.ALIPAYS_SCHEME, MspGlobalDefine.ALIPAYHK_SCHEME);
                }
                MspContext mspContext2 = this.mMspContext;
                if (mspContext2 != null && mspContext2.isFromWallet()) {
                    try {
                        MspBasePresenter currentPresenter3 = this.mMspContext.getMspUIClient().getCurrentPresenter();
                        if (currentPresenter3 == null || currentPresenter3.getIView() == null) {
                            PhoneCashierMspEngine.getMspJump().processUrl(this.f3575a, str);
                        } else if (!currentPresenter3.getIView().openUrl(str, new OnResultReceived() { // from class: com.alipay.android.msp.drivers.stores.store.events.OpenUrlStore.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.msp.ui.base.OnResultReceived
                            public void onReceiveResult(String str4) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("e1927912", new Object[]{this, str4});
                                } else {
                                    OpenUrlStore.access$000(OpenUrlStore.this, str3, jSONObject, str);
                                }
                            }
                        })) {
                            c(str, str3, jSONObject);
                        }
                    } catch (Exception e2) {
                        LogUtil.printExceptionStackTrace(e2);
                    }
                }
                c(str, str3, jSONObject);
            } else {
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.VIEW");
                intent2.setData(Uri.parse("https://ds.alipay.com/help/guide.htm?page=forgotpwd"));
                MspBasePresenter currentPresenter4 = this.mMspContext.getMspUIClient().getCurrentPresenter();
                if (!(currentPresenter4 == null || currentPresenter4.getIView() == null)) {
                    currentPresenter4.getIView().openActivity(intent2, null);
                }
            }
        } else {
            MspContext mspContext3 = this.mMspContext;
            if (mspContext3 != null) {
                mspContext3.getStatisticInfo().addError(ErrorType.DEFAULT, ErrorCode.DEFAULT_OPEN_URL_EMPTY, "toOpenUri:".concat(String.valueOf(str)));
            }
        }
        b(str3, null, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r7, com.alibaba.fastjson.JSONObject r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.alipay.android.msp.drivers.stores.store.events.OpenUrlStore.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "6635bcfe"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r3.ipc$dispatch(r4, r5)
            return
        L_0x0018:
            java.lang.String r3 = "alipays:"
            boolean r3 = r7.startsWith(r3)
            if (r3 == 0) goto L_0x0028
            android.content.Context r3 = r6.mContext
            boolean r3 = com.alipay.android.msp.framework.sys.DeviceInfo.hasAlipayWallet(r3)
            if (r3 == 0) goto L_0x005d
        L_0x0028:
            android.content.Intent r3 = new android.content.Intent     // Catch: Exception -> 0x004c
            r3.<init>()     // Catch: Exception -> 0x004c
            java.lang.String r4 = "android.intent.action.VIEW"
            r3.setAction(r4)     // Catch: Exception -> 0x004c
            android.net.Uri r4 = android.net.Uri.parse(r7)     // Catch: Exception -> 0x004c
            r3.setData(r4)     // Catch: Exception -> 0x004c
            android.app.Activity r4 = r6.f3575a     // Catch: Exception -> 0x004c
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: Exception -> 0x004c
            android.content.ComponentName r3 = r3.resolveActivity(r4)     // Catch: Exception -> 0x004c
            if (r3 == 0) goto L_0x004e
            java.lang.String r3 = "2"
            r4 = 0
            r6.c(r7, r3, r4)     // Catch: Exception -> 0x004c
            goto L_0x005e
        L_0x004c:
            r7 = move-exception
            goto L_0x005a
        L_0x004e:
            android.content.ActivityNotFoundException r1 = new android.content.ActivityNotFoundException     // Catch: Exception -> 0x004c
            java.lang.String r3 = "cannot resolve url: "
            java.lang.String r7 = r3.concat(r7)     // Catch: Exception -> 0x004c
            r1.<init>(r7)     // Catch: Exception -> 0x004c
            throw r1     // Catch: Exception -> 0x004c
        L_0x005a:
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r7)
        L_0x005d:
            r1 = 0
        L_0x005e:
            java.lang.String r7 = "jumpSucc: "
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r7 = r7.concat(r2)
            java.lang.String r2 = "OpenUrlStore"
            java.lang.String r3 = "sdkJumpOut"
            com.alipay.android.msp.utils.LogUtil.record(r0, r2, r3, r7)
            if (r1 == 0) goto L_0x0077
            java.lang.String r7 = "succact"
            goto L_0x0079
        L_0x0077:
            java.lang.String r7 = "failact"
        L_0x0079:
            com.alibaba.fastjson.JSONObject r7 = r8.getJSONObject(r7)
            if (r7 == 0) goto L_0x0092
            com.alipay.android.msp.drivers.actions.MspEventCreator r8 = com.alipay.android.msp.drivers.actions.MspEventCreator.get()
            java.lang.String r0 = "OpenUrlAfterAction"
            com.alipay.android.msp.drivers.actions.EventAction r7 = r8.createMspEvent(r0, r7)
            com.alipay.android.msp.core.context.MspContext r8 = r6.mMspContext
            com.alipay.android.msp.drivers.actions.ActionsCreator r8 = com.alipay.android.msp.drivers.actions.ActionsCreator.get(r8)
            r8.createEventAction(r7)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.OpenUrlStore.a(java.lang.String, com.alibaba.fastjson.JSONObject):void");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        try {
            String str = null;
            if (this.mMspContext == null) {
                return null;
            }
            MspUIClient mspUIClient = this.mMspUIClient;
            if (mspUIClient != null) {
                this.f3575a = mspUIClient.getCurrentPresenter().getActivity();
            }
            String[] actionParamsArray = mspEvent.getActionParamsArray();
            JSONObject actionParamsJson = mspEvent.getActionParamsJson();
            if (actionParamsArray != null) {
                if (actionParamsArray.length == 1) {
                    d(actionParamsArray[0], null, null, null, null);
                    return "";
                } else if (actionParamsArray.length < 2) {
                    return "";
                } else {
                    d(actionParamsArray[0], null, actionParamsArray[1], null, null);
                    return "";
                }
            } else if (actionParamsJson == null) {
                return "";
            } else {
                JSONObject parseObject = JSON.parseObject(actionParamsJson.toJSONString());
                if (parseObject.containsKey("endflag")) {
                    str = parseObject.getString("endflag");
                }
                if ("6".equals(str)) {
                    MspContext mspContext = this.mMspContext;
                    if (mspContext instanceof MspTradeContext) {
                        ((MspTradeContext) mspContext).setCanMulti(false);
                    }
                }
                if (!parseObject.containsKey("url")) {
                    return "";
                }
                d(parseObject.getString("url"), parseObject.getString("type"), str, parseObject.getJSONObject("followAct"), parseObject);
                return "";
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return "";
        }
    }
}
