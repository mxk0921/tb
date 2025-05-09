package com.taobao.agoo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.GetBodyMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.BaseNotifyClick;
import com.taobao.agoo.BaseNotifyClickActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.MsgDO;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;
import tb.brt;
import tb.c71;
import tb.m8l;
import tb.t2o;
import tb.vu3;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class BaseNotifyClick {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "accs.BaseNotifyClick";
    private AgooFactory agooFactory;
    private Context mContext;
    private List<MsgDO> mMsgDOList;
    private String msgSource;
    private NotifManager notifyManager;

    static {
        t2o.a(343933268);
    }

    public static /* synthetic */ String access$000(BaseNotifyClick baseNotifyClick, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("903e79d1", new Object[]{baseNotifyClick, intent});
        }
        return baseNotifyClick.parseMsgByThirdPush(intent);
    }

    public static /* synthetic */ String access$100(BaseNotifyClick baseNotifyClick) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef02c2ef", new Object[]{baseNotifyClick});
        }
        return baseNotifyClick.msgSource;
    }

    public static /* synthetic */ NotifManager access$200(BaseNotifyClick baseNotifyClick) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotifManager) ipChange.ipc$dispatch("7c517c34", new Object[]{baseNotifyClick});
        }
        return baseNotifyClick.notifyManager;
    }

    public static /* synthetic */ NotifManager access$202(BaseNotifyClick baseNotifyClick, NotifManager notifManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotifManager) ipChange.ipc$dispatch("14b1176a", new Object[]{baseNotifyClick, notifManager});
        }
        baseNotifyClick.notifyManager = notifManager;
        return notifManager;
    }

    public static /* synthetic */ AgooFactory access$300(BaseNotifyClick baseNotifyClick) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AgooFactory) ipChange.ipc$dispatch("d76d5422", new Object[]{baseNotifyClick});
        }
        return baseNotifyClick.agooFactory;
    }

    public static /* synthetic */ AgooFactory access$302(BaseNotifyClick baseNotifyClick, AgooFactory agooFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AgooFactory) ipChange.ipc$dispatch("b2027989", new Object[]{baseNotifyClick, agooFactory});
        }
        baseNotifyClick.agooFactory = agooFactory;
        return agooFactory;
    }

    public static /* synthetic */ Context access$400(BaseNotifyClick baseNotifyClick) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("64ffb566", new Object[]{baseNotifyClick});
        }
        return baseNotifyClick.mContext;
    }

    public static /* synthetic */ void access$500(BaseNotifyClick baseNotifyClick, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45cfe20a", new Object[]{baseNotifyClick, intent});
        } else {
            baseNotifyClick.reportClickNotifyMsg(intent);
        }
    }

    private void buildMessage(final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4688a17d", new Object[]{this, intent});
        } else {
            brt.b(new Runnable() { // from class: com.taobao.agoo.BaseNotifyClick.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    Throwable th;
                    boolean z = true;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Intent intent2 = null;
                    try {
                        Intent intent3 = intent;
                        if (intent3 != null) {
                            String access$000 = BaseNotifyClick.access$000(BaseNotifyClick.this, intent3);
                            if (TextUtils.isEmpty(access$000) || TextUtils.isEmpty(BaseNotifyClick.access$100(BaseNotifyClick.this))) {
                                ALog.e(BaseNotifyClick.TAG, "parseMsgFromNotifyListener null!!", "source", BaseNotifyClick.access$100(BaseNotifyClick.this));
                            } else {
                                if (BaseNotifyClick.access$200(BaseNotifyClick.this) == null) {
                                    BaseNotifyClick.access$202(BaseNotifyClick.this, new NotifManager());
                                }
                                if (BaseNotifyClick.access$300(BaseNotifyClick.this) == null) {
                                    BaseNotifyClick.access$302(BaseNotifyClick.this, new AgooFactory());
                                    BaseNotifyClick.access$300(BaseNotifyClick.this).init(BaseNotifyClick.access$400(BaseNotifyClick.this), BaseNotifyClick.access$200(BaseNotifyClick.this), null);
                                }
                                Bundle msgReceiverPreHandler = BaseNotifyClick.access$300(BaseNotifyClick.this).msgReceiverPreHandler(access$000.getBytes("UTF-8"), BaseNotifyClick.access$100(BaseNotifyClick.this), null, false);
                                String string = msgReceiverPreHandler.getString(AgooConstants.MESSAGE_BODY);
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                if (!TextUtils.isEmpty(string)) {
                                    if (TextUtils.equals(msgReceiverPreHandler.getString(AgooConstants.MESSAGE_ENCRYPTED), "0")) {
                                        ALog.e(BaseNotifyClick.TAG, "not encrypted", new Object[0]);
                                        z = false;
                                    } else {
                                        ALog.e(BaseNotifyClick.TAG, "begin parse EncryptedMsg", new Object[0]);
                                        String parseEncryptedMsg = AgooFactory.parseEncryptedMsg(string);
                                        if (!TextUtils.isEmpty(parseEncryptedMsg)) {
                                            msgReceiverPreHandler.putString(AgooConstants.MESSAGE_BODY, parseEncryptedMsg);
                                        } else {
                                            ALog.e(BaseNotifyClick.TAG, "parse EncryptedMsg fail, empty", new Object[0]);
                                        }
                                    }
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                    ALog.e(BaseNotifyClick.TAG, "get body cost " + elapsedRealtime2, new Object[0]);
                                    AppMonitor.getInstance().commitStat(new GetBodyMonitor(z, elapsedRealtime2));
                                }
                                Intent intent4 = new Intent();
                                try {
                                    intent4.putExtras(msgReceiverPreHandler);
                                    BaseNotifyClick.access$300(BaseNotifyClick.this).saveMsg(access$000.getBytes("UTF-8"), "2");
                                    BaseNotifyClick.access$500(BaseNotifyClick.this, intent4);
                                    intent2 = intent4;
                                } catch (Throwable th2) {
                                    th = th2;
                                    intent2 = intent4;
                                    try {
                                        ALog.e(BaseNotifyClick.TAG, "buildMessage", th, new Object[0]);
                                        try {
                                            BaseNotifyClick.this.onMessage(intent2);
                                            return;
                                        } catch (Throwable th3) {
                                            ALog.e(BaseNotifyClick.TAG, xpd.c.EVENT_ON_MESSAGE, th3, new Object[0]);
                                            return;
                                        }
                                    } catch (Throwable th4) {
                                        try {
                                            BaseNotifyClick.this.onMessage(intent2);
                                        } catch (Throwable th5) {
                                            ALog.e(BaseNotifyClick.TAG, xpd.c.EVENT_ON_MESSAGE, th5, new Object[0]);
                                        }
                                        throw th4;
                                    }
                                }
                            }
                        }
                        try {
                            BaseNotifyClick.this.onMessage(intent2);
                        } catch (Throwable th6) {
                            ALog.e(BaseNotifyClick.TAG, xpd.c.EVENT_ON_MESSAGE, th6, new Object[0]);
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                }
            });
        }
    }

    private void buildMessageV2(final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4f3fd9", new Object[]{this, intent});
        } else {
            brt.b(new Runnable() { // from class: tb.oy1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseNotifyClick.this.lambda$buildMessageV2$15(intent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$buildMessageV2$15(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777bd5ba", new Object[]{this, intent});
            return;
        }
        Intent handleIntent = handleIntent(this.mContext, intent, false);
        if (handleIntent != null) {
            reportClickNotifyMsg(handleIntent);
        }
        try {
            onMessage(handleIntent);
        } catch (Throwable th) {
            ALog.e(TAG, xpd.c.EVENT_ON_MESSAGE, th, new Object[0]);
        }
    }

    public void onCreate(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5363903", new Object[]{this, context, intent});
            return;
        }
        ALog.i(TAG, "onCreate", new Object[0]);
        this.mContext = context;
        if (m8l.p()) {
            buildMessageV2(intent);
        } else {
            buildMessage(intent);
        }
    }

    public abstract void onMessage(Intent intent);

    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        ALog.i(TAG, "onNewIntent", new Object[0]);
        if (m8l.p()) {
            buildMessageV2(intent);
        } else {
            buildMessage(intent);
        }
    }

    private void reportClickNotifyMsg(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("569fba68", new Object[]{this, intent});
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("id");
            String stringExtra2 = intent.getStringExtra(AgooConstants.MESSAGE_SOURCE);
            String stringExtra3 = intent.getStringExtra("report");
            String stringExtra4 = intent.getStringExtra(AgooConstants.MESSAGE_EXT);
            MsgDO msgDO = new MsgDO();
            msgDO.msgIds = stringExtra;
            msgDO.extData = stringExtra4;
            msgDO.messageSource = stringExtra2;
            msgDO.reportStr = stringExtra3;
            msgDO.msgStatus = "8";
            ALog.i(TAG, "reportClickNotifyMsg messageId:" + stringExtra + " source:" + stringExtra2 + " reportStr:" + stringExtra3 + " status:" + msgDO.msgStatus, new Object[0]);
            this.notifyManager.report(msgDO, null);
        } catch (Throwable th) {
            ALog.e(TAG, "reportClickNotifyMsg exception", th, new Object[0]);
        }
    }

    private String parseMsgByThirdPush(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ded4980", new Object[]{this, intent});
        }
        Set<BaseNotifyClickActivity.INotifyListener> set = BaseNotifyClickActivity.notifyListeners;
        if (set != null && set.size() > 0) {
            Iterator<BaseNotifyClickActivity.INotifyListener> it = BaseNotifyClickActivity.notifyListeners.iterator();
            str = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BaseNotifyClickActivity.INotifyListener next = it.next();
                String parseMsgFromIntent = next.parseMsgFromIntent(intent);
                if (!TextUtils.isEmpty(parseMsgFromIntent)) {
                    this.msgSource = next.getMsgSource();
                    str = parseMsgFromIntent;
                    break;
                }
                str = parseMsgFromIntent;
            }
        } else {
            ALog.e(TAG, "no impl, try use default impl to parse intent!", new Object[0]);
            BaseNotifyClickActivity.INotifyListener defaultHuaweiMsgParseImpl = new DefaultHuaweiMsgParseImpl();
            str = defaultHuaweiMsgParseImpl.parseMsgFromIntent(intent);
            if (TextUtils.isEmpty(str)) {
                defaultHuaweiMsgParseImpl = new DefaultXiaomiMsgParseImpl();
                str = defaultHuaweiMsgParseImpl.parseMsgFromIntent(intent);
            }
            if (TextUtils.isEmpty(str)) {
                defaultHuaweiMsgParseImpl = new DefaultHonorMsgParseImpl();
                str = defaultHuaweiMsgParseImpl.parseMsgFromIntent(intent);
            }
            if (TextUtils.isEmpty(str)) {
                defaultHuaweiMsgParseImpl = new DefaultOppoMsgParseImpl();
                str = defaultHuaweiMsgParseImpl.parseMsgFromIntent(intent);
            }
            if (TextUtils.isEmpty(str)) {
                defaultHuaweiMsgParseImpl = new DefaultVivoMsgParseImpl();
                str = defaultHuaweiMsgParseImpl.parseMsgFromIntent(intent);
            }
            if (TextUtils.isEmpty(str)) {
                defaultHuaweiMsgParseImpl = new DefaultMeizuMsgParseImpl();
                str = defaultHuaweiMsgParseImpl.parseMsgFromIntent(intent);
            }
            if (TextUtils.isEmpty(str)) {
                c71.c("accs", "error", "parse 3push error", vu3.b.GEO_NOT_SUPPORT);
            } else {
                this.msgSource = defaultHuaweiMsgParseImpl.getMsgSource();
                c71.c("accs", "error", "parse 3push default " + this.msgSource, vu3.b.GEO_NOT_SUPPORT);
            }
        }
        ALog.i(TAG, "parseMsgByThirdPush", "result", str, "msgSource", this.msgSource);
        return str;
    }

    private Intent handleIntent(Context context, Intent intent, boolean z) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("b9675339", new Object[]{this, context, intent, new Boolean(z)});
        }
        Intent intent2 = null;
        if (intent == null) {
            return null;
        }
        try {
            String parseMsgByThirdPush = parseMsgByThirdPush(intent);
            if (TextUtils.isEmpty(parseMsgByThirdPush) || TextUtils.isEmpty(this.msgSource)) {
                ALog.e(TAG, "parseMsgFromNotifyListener null!!", "source", this.msgSource);
                return null;
            }
            if (this.notifyManager == null) {
                this.notifyManager = new NotifManager();
            }
            if (this.agooFactory == null) {
                AgooFactory agooFactory = new AgooFactory();
                this.agooFactory = agooFactory;
                agooFactory.init(context, this.notifyManager, null);
            }
            if (z && this.mMsgDOList == null) {
                this.mMsgDOList = new ArrayList();
            }
            Bundle msgReceiverPreHandler = this.agooFactory.msgReceiverPreHandler(parseMsgByThirdPush.getBytes("UTF-8"), this.msgSource, null, false, this.mMsgDOList);
            if (TextUtils.equals(msgReceiverPreHandler.getString(AgooConstants.MESSAGE_ENCRYPTED), "4")) {
                String string = msgReceiverPreHandler.getString(AgooConstants.MESSAGE_BODY);
                ALog.e(TAG, "begin parse EncryptedMsg", new Object[0]);
                String parseEncryptedMsg = AgooFactory.parseEncryptedMsg(string);
                if (!TextUtils.isEmpty(parseEncryptedMsg)) {
                    msgReceiverPreHandler.putString(AgooConstants.MESSAGE_BODY, parseEncryptedMsg);
                } else {
                    ALog.e(TAG, "parse EncryptedMsg fail, empty", new Object[0]);
                }
            }
            Intent intent3 = new Intent();
            try {
                intent3.putExtras(msgReceiverPreHandler);
                this.agooFactory.saveMsg(parseMsgByThirdPush.getBytes("UTF-8"), "2");
                return intent3;
            } catch (Throwable th2) {
                th = th2;
                intent2 = intent3;
                ALog.e(TAG, "handleIntent err", th, new Object[0]);
                return intent2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
