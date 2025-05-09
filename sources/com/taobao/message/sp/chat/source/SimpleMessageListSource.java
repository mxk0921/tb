package com.taobao.message.sp.chat.source;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.p1;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.message.chatv2.viewcenter.ITemplateService;
import com.taobao.message.chatv2.viewcenter.TemplateInfoServiceImpl;
import com.taobao.message.chatv2.viewcenter.config.LayoutInfo;
import com.taobao.message.datasdk.facade.model.ResultData;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.Source;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.support.UserIdentifier;
import com.taobao.message.launcher.server_time.AmpTimeStampManager;
import com.taobao.message.sp.chat.transformer.SimpleMessageSenderViewDataTransformer;
import com.taobao.message.sp.framework.model.SimpleMessage;
import com.taobao.message.sp.framework.model.SimpleMessageListData;
import com.taobao.message.sp.framework.model.SimpleMessageListResult;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.message.sp.framework.model.SimpleTarget;
import com.taobao.message.sp.framework.service.ISimpleMessageService;
import com.taobao.message.sp.framework.service.SimpleServiceFactory;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.ckf;
import tb.d1i;
import tb.kfp;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005JG\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u0005J5\u0010&\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020$\u0018\u00010#2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010'J%\u0010*\u001a\u0004\u0018\u00010\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010-R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:R\u0016\u0010<\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00060@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010=¨\u0006G"}, d2 = {"Lcom/taobao/message/sp/chat/source/SimpleMessageListSource;", "Lcom/taobao/message/lab/comfrm/inner2/Source;", "Lcom/taobao/message/sp/framework/model/SimpleMessageListData;", "Lcom/taobao/message/lab/comfrm/support/UserIdentifier;", "<init>", "()V", "", "syncReason", "targetNick", "accountId", "entityType", "Lcom/taobao/message/sp/framework/model/SimpleMessageListResult;", "result", "Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;", "actionDispatcher", "Ltb/xhv;", "dispatchAction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/message/sp/framework/model/SimpleMessageListResult;Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;)V", "id", "", "isNick", "channelType", "ccode", "Lcom/taobao/message/kit/core/IObserver;", "observer", "loadMessages", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/taobao/message/kit/core/IObserver;)V", "syncMessages", "(Ljava/lang/String;ZLjava/lang/String;Lcom/taobao/message/kit/core/IObserver;)V", "p0", "subscribe", "(Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;)V", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "Lcom/taobao/message/lab/comfrm/inner2/Command;", "command", "", "", "props", "use", "(Lcom/taobao/message/lab/comfrm/inner2/Command;Ljava/util/Map;Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;)V", "Lcom/taobao/message/lab/comfrm/core/Action;", p1.d, "updateOriginalData", "(Lcom/taobao/message/lab/comfrm/core/Action;Lcom/taobao/message/sp/framework/model/SimpleMessageListData;)Lcom/taobao/message/sp/framework/model/SimpleMessageListData;", "identifier", "(Ljava/lang/String;)V", "Ljava/lang/String;", "", "mCursor", "J", "", "mTotalCount", TLogTracker.LEVEL_INFO, "Lcom/taobao/message/chatv2/viewcenter/ITemplateService;", "viewCenterService", "Lcom/taobao/message/chatv2/viewcenter/ITemplateService;", "Lcom/taobao/message/sp/framework/model/SimpleProfile;", "mSelfProfile", "Lcom/taobao/message/sp/framework/model/SimpleProfile;", "mTargetProfile", "isLoading", "Z", "mProps", "Ljava/util/Map;", "", "mWhiteLayoutSet", "Ljava/util/Set;", "Ljava/lang/Runnable;", "mRunnable", "Ljava/lang/Runnable;", "mTerminal", "message_sp_chat_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SimpleMessageListSource implements Source<SimpleMessageListData>, UserIdentifier {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String identifier;
    private boolean isLoading;
    private long mCursor;
    private Map<String, Object> mProps;
    private Runnable mRunnable;
    private SimpleProfile mSelfProfile;
    private SimpleProfile mTargetProfile;
    private boolean mTerminal;
    private int mTotalCount;
    private final ITemplateService viewCenterService = new TemplateInfoServiceImpl();
    private final Set<String> mWhiteLayoutSet = kfp.h("widget.message.common.text", "widget.message.common.image", "widget.message.common.video", "widget.message.common.system");

    static {
        t2o.a(551550996);
        t2o.a(537919645);
        t2o.a(537919771);
    }

    public static final /* synthetic */ void access$dispatchAction(SimpleMessageListSource simpleMessageListSource, String str, String str2, String str3, String str4, SimpleMessageListResult simpleMessageListResult, ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61580df", new Object[]{simpleMessageListSource, str, str2, str3, str4, simpleMessageListResult, actionDispatcher});
        } else {
            simpleMessageListSource.dispatchAction(str, str2, str3, str4, simpleMessageListResult, actionDispatcher);
        }
    }

    public static final /* synthetic */ Map access$getMProps$p(SimpleMessageListSource simpleMessageListSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d78d0370", new Object[]{simpleMessageListSource});
        }
        return simpleMessageListSource.mProps;
    }

    public static final /* synthetic */ Runnable access$getMRunnable$p(SimpleMessageListSource simpleMessageListSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("cde57834", new Object[]{simpleMessageListSource});
        }
        return simpleMessageListSource.mRunnable;
    }

    public static final /* synthetic */ boolean access$getMTerminal$p(SimpleMessageListSource simpleMessageListSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7c995e5", new Object[]{simpleMessageListSource})).booleanValue();
        }
        return simpleMessageListSource.mTerminal;
    }

    public static final /* synthetic */ int access$getMTotalCount$p(SimpleMessageListSource simpleMessageListSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f9357c5", new Object[]{simpleMessageListSource})).intValue();
        }
        return simpleMessageListSource.mTotalCount;
    }

    public static final /* synthetic */ boolean access$isLoading$p(SimpleMessageListSource simpleMessageListSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("255752e6", new Object[]{simpleMessageListSource})).booleanValue();
        }
        return simpleMessageListSource.isLoading;
    }

    public static final /* synthetic */ void access$setLoading$p(SimpleMessageListSource simpleMessageListSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2d827a", new Object[]{simpleMessageListSource, new Boolean(z)});
        } else {
            simpleMessageListSource.isLoading = z;
        }
    }

    public static final /* synthetic */ void access$setMProps$p(SimpleMessageListSource simpleMessageListSource, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe324db6", new Object[]{simpleMessageListSource, map});
        } else {
            simpleMessageListSource.mProps = map;
        }
    }

    public static final /* synthetic */ void access$setMRunnable$p(SimpleMessageListSource simpleMessageListSource, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdcdbea", new Object[]{simpleMessageListSource, runnable});
        } else {
            simpleMessageListSource.mRunnable = runnable;
        }
    }

    public static final /* synthetic */ void access$setMTerminal$p(SimpleMessageListSource simpleMessageListSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d79ac87", new Object[]{simpleMessageListSource, new Boolean(z)});
        } else {
            simpleMessageListSource.mTerminal = z;
        }
    }

    public static final /* synthetic */ void access$setMTotalCount$p(SimpleMessageListSource simpleMessageListSource, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca40dbe5", new Object[]{simpleMessageListSource, new Integer(i)});
        } else {
            simpleMessageListSource.mTotalCount = i;
        }
    }

    private final void loadMessages(String str, boolean z, String str2, String str3, final IObserver<SimpleMessageListResult> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b72479", new Object[]{this, str, new Boolean(z), str2, str3, iObserver});
            return;
        }
        IObserver<SimpleMessageListResult> simpleMessageListSource$loadMessages$myObserver$1 = new IObserver<SimpleMessageListResult>() { // from class: com.taobao.message.sp.chat.source.SimpleMessageListSource$loadMessages$myObserver$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.kit.core.IObserver
            public void onComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                } else {
                    iObserver.onComplete();
                }
            }

            @Override // com.taobao.message.kit.core.IObserver
            public void onError(Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                    return;
                }
                ckf.h(th, "p0");
                iObserver.onError(th);
            }

            public void onNext(SimpleMessageListResult simpleMessageListResult) {
                int i = 0;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56510506", new Object[]{this, simpleMessageListResult});
                    return;
                }
                ckf.h(simpleMessageListResult, "p0");
                SimpleMessageListSource simpleMessageListSource = SimpleMessageListSource.this;
                int access$getMTotalCount$p = SimpleMessageListSource.access$getMTotalCount$p(simpleMessageListSource);
                List<SimpleMessage> list = simpleMessageListResult.messageList;
                if (list != null) {
                    i = list.size();
                }
                SimpleMessageListSource.access$setMTotalCount$p(simpleMessageListSource, access$getMTotalCount$p + i);
                iObserver.onNext(simpleMessageListResult);
            }
        };
        if (ckf.b(str2, "imba")) {
            String str4 = this.identifier;
            if (str4 != null) {
                ISimpleMessageService iSimpleMessageService = (ISimpleMessageService) SimpleServiceFactory.obtain(str4, str2, ISimpleMessageService.class);
                if (iSimpleMessageService == null) {
                    return;
                }
                if (str3 != null) {
                    iSimpleMessageService.listMessagesByCCode(str3, this.mCursor, false, 20, simpleMessageListSource$loadMessages$myObserver$1);
                } else {
                    ckf.s();
                    throw null;
                }
            } else {
                ckf.y("identifier");
                throw null;
            }
        } else if (z) {
            String str5 = this.identifier;
            if (str5 != null) {
                ISimpleMessageService iSimpleMessageService2 = (ISimpleMessageService) SimpleServiceFactory.obtain(str5, str2, ISimpleMessageService.class);
                if (iSimpleMessageService2 != null) {
                    iSimpleMessageService2.listMessagesByNick(str, this.mCursor, false, 20, simpleMessageListSource$loadMessages$myObserver$1);
                    return;
                }
                return;
            }
            ckf.y("identifier");
            throw null;
        } else {
            String str6 = this.identifier;
            if (str6 != null) {
                ISimpleMessageService iSimpleMessageService3 = (ISimpleMessageService) SimpleServiceFactory.obtain(str6, str2, ISimpleMessageService.class);
                if (iSimpleMessageService3 != null) {
                    iSimpleMessageService3.listMessages(str, this.mCursor, false, 20, simpleMessageListSource$loadMessages$myObserver$1);
                    return;
                }
                return;
            }
            ckf.y("identifier");
            throw null;
        }
    }

    private final void syncMessages(String str, boolean z, String str2, IObserver<SimpleMessageListResult> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7922378", new Object[]{this, str, new Boolean(z), str2, iObserver});
        } else if (z) {
            String str3 = this.identifier;
            if (str3 != null) {
                ISimpleMessageService iSimpleMessageService = (ISimpleMessageService) SimpleServiceFactory.obtain(str3, str2, ISimpleMessageService.class);
                if (iSimpleMessageService != null) {
                    AmpTimeStampManager instance = AmpTimeStampManager.instance();
                    ckf.c(instance, "AmpTimeStampManager.instance()");
                    iSimpleMessageService.listMessagesByNick(str, instance.getCurrentTimeStamp() + 1000, false, this.mTotalCount, iObserver);
                    return;
                }
                return;
            }
            ckf.y("identifier");
            throw null;
        } else {
            String str4 = this.identifier;
            if (str4 != null) {
                ISimpleMessageService iSimpleMessageService2 = (ISimpleMessageService) SimpleServiceFactory.obtain(str4, str2, ISimpleMessageService.class);
                if (iSimpleMessageService2 != null) {
                    AmpTimeStampManager instance2 = AmpTimeStampManager.instance();
                    ckf.c(instance2, "AmpTimeStampManager.instance()");
                    iSimpleMessageService2.listMessages(str, instance2.getCurrentTimeStamp() + 1000, false, this.mTotalCount, iObserver);
                    return;
                }
                return;
            }
            ckf.y("identifier");
            throw null;
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        synchronized (this) {
            this.mTerminal = true;
            Runnable runnable = this.mRunnable;
            if (runnable != null) {
                TLog.loge("SimpleMessageListSource", "end loop request");
                UIHandler.removeCallbacks(runnable);
                this.mRunnable = null;
                xhv xhvVar = xhv.INSTANCE;
            }
        }
    }

    @Override // com.taobao.message.lab.comfrm.support.UserIdentifier
    public void identifier(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee19127a", new Object[]{this, str});
            return;
        }
        ckf.h(str, "p0");
        this.identifier = str;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void subscribe(final ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c519475", new Object[]{this, actionDispatcher});
            return;
        }
        ckf.h(actionDispatcher, "p0");
        String value = ConfigUtil.getValue("mpm_data_switch", "durationIntervalSyncMsg", "30");
        ckf.c(value, "ConfigUtil.getValue(\"mpm…onIntervalSyncMsg\", \"30\")");
        final long parseLong = Long.parseLong(value);
        if (ckf.b("1", ConfigUtil.getValue("mpm_data_switch", "useIntervalSyncMsg", "1"))) {
            this.mRunnable = new Runnable() { // from class: com.taobao.message.sp.chat.source.SimpleMessageListSource$subscribe$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TLog.loge("SimpleMessageListSource", "do loop request");
                    if (SimpleMessageListSource.access$getMProps$p(SimpleMessageListSource.this) != null) {
                        Command build = new Command.Build(null, SimpleMessageListData.SOURCE_NAME_MESSAGE, "syncMessage").build();
                        SimpleMessageListSource simpleMessageListSource = SimpleMessageListSource.this;
                        ckf.c(build, "command");
                        simpleMessageListSource.use(build, SimpleMessageListSource.access$getMProps$p(SimpleMessageListSource.this), actionDispatcher);
                        synchronized (SimpleMessageListSource.this) {
                            try {
                                if (SimpleMessageListSource.access$getMRunnable$p(SimpleMessageListSource.this) != null && !SimpleMessageListSource.access$getMTerminal$p(SimpleMessageListSource.this)) {
                                    UIHandler.postDelayed(SimpleMessageListSource.access$getMRunnable$p(SimpleMessageListSource.this), parseLong * 1000);
                                }
                                xhv xhvVar = xhv.INSTANCE;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
            };
            synchronized (this) {
                try {
                    Runnable runnable = this.mRunnable;
                    if (runnable != null && !this.mTerminal) {
                        UIHandler.postDelayed(runnable, parseLong * 1000);
                    }
                    xhv xhvVar = xhv.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public SimpleMessageListData updateOriginalData(Action action, SimpleMessageListData simpleMessageListData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleMessageListData) ipChange.ipc$dispatch("a9837232", new Object[]{this, action, simpleMessageListData}) : simpleMessageListData;
    }

    private final void dispatchAction(String str, String str2, String str3, String str4, SimpleMessageListResult simpleMessageListResult, ActionDispatcher actionDispatcher) {
        LayoutInfo layoutInfo;
        SimpleProfile simpleProfile;
        int i = 3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a03a466", new Object[]{this, str, str2, str3, str4, simpleMessageListResult, actionDispatcher});
            return;
        }
        SimpleMessageListData simpleMessageListData = new SimpleMessageListData();
        simpleMessageListData.list = new ArrayList();
        simpleMessageListData.oldHasMore = simpleMessageListResult.hasMore;
        simpleMessageListData.reason = str;
        if (TextUtils.isEmpty(str)) {
            i = 0;
        }
        simpleMessageListData.changeType = i;
        this.mCursor = simpleMessageListResult.nextCursor;
        List<SimpleMessage> list = simpleMessageListResult.messageList;
        if (list != null) {
            for (SimpleMessage simpleMessage : list) {
                RenderTemplate renderTemplate = null;
                try {
                    ITemplateService iTemplateService = this.viewCenterService;
                    ckf.c(simpleMessage, AdvanceSetting.NETWORK_TYPE);
                    layoutInfo = iTemplateService.getLayoutInfo(simpleMessage.getMsgType(), null);
                } catch (Throwable unused) {
                    layoutInfo = null;
                }
                if (layoutInfo != null) {
                    renderTemplate = layoutInfo.renderTemplate;
                }
                if (renderTemplate == null || !ckf.b("native", layoutInfo.renderTemplate.renderType) || this.mWhiteLayoutSet.contains(layoutInfo.renderTemplate.name)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(d1i.KEY_LAYOUT_INFO, layoutInfo);
                    ckf.c(simpleMessage, AdvanceSetting.NETWORK_TYPE);
                    SimpleTarget sender = simpleMessage.getSender();
                    ckf.c(sender, "it.sender");
                    if (SimpleMessageSenderViewDataTransformer.getHeadType(str2, sender.getTargetId(), str3, str4) == 1) {
                        simpleProfile = this.mTargetProfile;
                    } else {
                        simpleProfile = this.mSelfProfile;
                    }
                    linkedHashMap.put("profile", simpleProfile);
                    simpleMessageListData.list.add(new ResultData<>(simpleMessage, linkedHashMap));
                    if (layoutInfo == null) {
                        TLog.loge("SimpleMessageListSource", "layoutInfo is null: " + simpleMessage.getMsgType());
                    }
                }
            }
        }
        actionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(simpleMessageListData).build());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void use(Command command, Map<String, Object> map, final ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c59d34", new Object[]{this, command, map, actionDispatcher});
            return;
        }
        ckf.h(command, "command");
        ckf.h(actionDispatcher, "actionDispatcher");
        this.mProps = map;
        String string = ValueUtil.getString(map, "channelType");
        final String string2 = ValueUtil.getString(map, "targetNick");
        String string3 = ValueUtil.getString(map, "targetId");
        final String string4 = ValueUtil.getString(map, "accountId");
        final String string5 = ValueUtil.getString(map, "entityType");
        String string6 = ValueUtil.getString(map, "ccode");
        boolean isEmpty = TextUtils.isEmpty(string2);
        boolean z = !isEmpty;
        String str = !isEmpty ? string2 : string3;
        if (map != null) {
            if (map.get("selfProfile") instanceof SimpleProfile) {
                Object obj = map.get("selfProfile");
                if (obj != null) {
                    this.mSelfProfile = (SimpleProfile) obj;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.taobao.message.sp.framework.model.SimpleProfile");
                }
            }
            if (map.get("targetProfile") instanceof SimpleProfile) {
                Object obj2 = map.get("targetProfile");
                if (obj2 != null) {
                    this.mTargetProfile = (SimpleProfile) obj2;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.taobao.message.sp.framework.model.SimpleProfile");
                }
            }
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = null;
            if (ckf.b(StdActions.COMMAND_INIT_SOURCE, command.getName())) {
                ckf.c(str, "id");
                ckf.c(string, "channelType");
                loadMessages(str, z, string, string6, new IObserver<SimpleMessageListResult>() { // from class: com.taobao.message.sp.chat.source.SimpleMessageListSource$use$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onComplete() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                            return;
                        }
                        SimpleMessageListResult simpleMessageListResult = (SimpleMessageListResult) ref$ObjectRef.element;
                        if (simpleMessageListResult != null) {
                            SimpleMessageListSource.access$dispatchAction(SimpleMessageListSource.this, null, string2, string4, string5, simpleMessageListResult, actionDispatcher);
                        }
                    }

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onError(Throwable th) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                            return;
                        }
                        ckf.h(th, "p0");
                        SimpleMessageListResult simpleMessageListResult = new SimpleMessageListResult();
                        simpleMessageListResult.messageList = new ArrayList();
                        SimpleMessageListSource.access$dispatchAction(SimpleMessageListSource.this, null, string2, string4, string5, simpleMessageListResult, actionDispatcher);
                    }

                    public void onNext(SimpleMessageListResult simpleMessageListResult) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56510506", new Object[]{this, simpleMessageListResult});
                            return;
                        }
                        ckf.h(simpleMessageListResult, AdvanceSetting.NETWORK_TYPE);
                        ref$ObjectRef.element = simpleMessageListResult;
                    }
                });
            } else if (ckf.b("loadMessage", command.getName())) {
                if ((command.getData() instanceof JSONObject) && !this.isLoading) {
                    this.isLoading = true;
                    Object data = command.getData();
                    if (data == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                    } else if (ckf.b("1", ((JSONObject) data).get("fetchType"))) {
                        ckf.c(str, "id");
                        ckf.c(string, "channelType");
                        loadMessages(str, z, string, string6, new IObserver<SimpleMessageListResult>() { // from class: com.taobao.message.sp.chat.source.SimpleMessageListSource$use$2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.message.kit.core.IObserver
                            public void onComplete() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                                    return;
                                }
                                SimpleMessageListSource.access$setLoading$p(SimpleMessageListSource.this, false);
                                SimpleMessageListResult simpleMessageListResult = (SimpleMessageListResult) ref$ObjectRef.element;
                                if (simpleMessageListResult != null) {
                                    SimpleMessageListSource.access$dispatchAction(SimpleMessageListSource.this, null, string2, string4, string5, simpleMessageListResult, actionDispatcher);
                                }
                            }

                            @Override // com.taobao.message.kit.core.IObserver
                            public void onError(Throwable th) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                                    return;
                                }
                                ckf.h(th, "p0");
                                SimpleMessageListResult simpleMessageListResult = new SimpleMessageListResult();
                                simpleMessageListResult.messageList = new ArrayList();
                                SimpleMessageListSource.access$setLoading$p(SimpleMessageListSource.this, false);
                                SimpleMessageListSource.access$dispatchAction(SimpleMessageListSource.this, null, string2, string4, string5, simpleMessageListResult, actionDispatcher);
                            }

                            public void onNext(SimpleMessageListResult simpleMessageListResult) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("56510506", new Object[]{this, simpleMessageListResult});
                                    return;
                                }
                                ckf.h(simpleMessageListResult, AdvanceSetting.NETWORK_TYPE);
                                ref$ObjectRef.element = simpleMessageListResult;
                            }
                        });
                    }
                }
            } else if (ckf.b("syncMessage", command.getName()) && !this.isLoading) {
                ckf.c(str, "id");
                ckf.c(string, "channelType");
                syncMessages(str, z, string, new IObserver<SimpleMessageListResult>() { // from class: com.taobao.message.sp.chat.source.SimpleMessageListSource$use$3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onComplete() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                            return;
                        }
                        SimpleMessageListSource.access$setLoading$p(SimpleMessageListSource.this, false);
                        SimpleMessageListResult simpleMessageListResult = (SimpleMessageListResult) ref$ObjectRef.element;
                        if (simpleMessageListResult != null) {
                            SimpleMessageListSource.access$dispatchAction(SimpleMessageListSource.this, SimpleMessageListData.REASON_SEND, string2, string4, string5, simpleMessageListResult, actionDispatcher);
                        }
                    }

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onError(Throwable th) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                            return;
                        }
                        ckf.h(th, "p0");
                        SimpleMessageListResult simpleMessageListResult = new SimpleMessageListResult();
                        simpleMessageListResult.messageList = new ArrayList();
                        SimpleMessageListSource.access$setLoading$p(SimpleMessageListSource.this, false);
                        SimpleMessageListSource.access$dispatchAction(SimpleMessageListSource.this, SimpleMessageListData.REASON_SEND, string2, string4, string5, simpleMessageListResult, actionDispatcher);
                    }

                    public void onNext(SimpleMessageListResult simpleMessageListResult) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56510506", new Object[]{this, simpleMessageListResult});
                            return;
                        }
                        ckf.h(simpleMessageListResult, "p0");
                        ref$ObjectRef.element = simpleMessageListResult;
                    }
                });
            }
        } else {
            ckf.s();
            throw null;
        }
    }
}
