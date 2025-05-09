package com.taobao.message.sp.chat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStateManager;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.login4android.Login;
import com.taobao.message.SimpleFrameworkModule;
import com.taobao.message.chatv2.viewcenter.IViewCenterService;
import com.taobao.message.chatv2.viewcenter.ViewCenterEnv;
import com.taobao.message.chatv2.viewcenter.ViewCenterProps;
import com.taobao.message.chatv2.viewcenter.ViewCenterServiceImpl;
import com.taobao.message.container.dynamic.widget.CustomInsetsFrameLayout;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.lab.comfrm.aura.Container;
import com.taobao.message.lab.comfrm.aura.INeedContainer;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.inner2.ExecuteService;
import com.taobao.message.lab.comfrm.render.WidgetRenderImpl;
import com.taobao.message.message_open_api_adapter.OpenApiService;
import com.taobao.message.sp.chat.SimpleChatModule;
import com.taobao.message.sp.framework.model.SimpleConversation;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.message.sp.framework.service.SimpleProfileCache;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import com.taobao.unit.center.mdc.MsgDinamicxEngine;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import tb.a07;
import tb.acq;
import tb.ckf;
import tb.h9z;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0002>?B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\t\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\r2\n\u0010\u0011\u001a\u00060\u0010R\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\r2\n\u0010\u0011\u001a\u00060\u0010R\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\r2\n\u0010\u0011\u001a\u00060\u0010R\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001c\u0010\u0004J\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0014¢\u0006\u0004\b$\u0010\u0004R\u0018\u0010%\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00102\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u00108\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00103\u001a\u0004\b9\u00105\"\u0004\b:\u00107R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lcom/taobao/message/sp/chat/widget/SimpleChatActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/taobao/message/lab/comfrm/aura/INeedContainer;", "<init>", "()V", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/os/Bundle;", "extBundle", "parseIntent", "(Landroid/content/Intent;Landroid/os/Bundle;)Landroid/os/Bundle;", "", "throwable", "Ltb/xhv;", "processError", "(Ljava/lang/Throwable;)V", "Lcom/taobao/message/sp/chat/widget/SimpleChatActivity$ParseContext;", "ctx", "listTargetProfile", "(Lcom/taobao/message/sp/chat/widget/SimpleChatActivity$ParseContext;)V", "listSelfProfile", "onReady", "Landroid/widget/FrameLayout;", "setupContentView", "()Landroid/widget/FrameLayout;", "Lcom/taobao/message/lab/comfrm/aura/Container;", "getContainer", "()Lcom/taobao/message/lab/comfrm/aura/Container;", "onResume", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "mAuraContainer", "Lcom/taobao/message/lab/comfrm/aura/Container;", "Lcom/taobao/message/chatv2/viewcenter/IViewCenterService;", "mViewCenterService", "Lcom/taobao/message/chatv2/viewcenter/IViewCenterService;", "Lcom/taobao/message/sp/framework/model/SimpleConversation;", "mConversation", "Lcom/taobao/message/sp/framework/model/SimpleConversation;", "getMConversation", "()Lcom/taobao/message/sp/framework/model/SimpleConversation;", "setMConversation", "(Lcom/taobao/message/sp/framework/model/SimpleConversation;)V", "Lcom/taobao/message/sp/framework/model/SimpleProfile;", "mSelfProfile", "Lcom/taobao/message/sp/framework/model/SimpleProfile;", "getMSelfProfile", "()Lcom/taobao/message/sp/framework/model/SimpleProfile;", "setMSelfProfile", "(Lcom/taobao/message/sp/framework/model/SimpleProfile;)V", "mTargetProfile", "getMTargetProfile", "setMTargetProfile", "", "isResumeLast", "Z", "Companion", "ParseContext", "message_sp_chat_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SimpleChatActivity extends AppCompatActivity implements INeedContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "SimpleChatActivity";
    public static final String URL = "http://tb.cn/n/im/dynamic/simple.html";
    private HashMap _$_findViewCache;
    private boolean isResumeLast;
    private Container mAuraContainer;
    private SimpleConversation mConversation;
    private SimpleProfile mSelfProfile;
    private SimpleProfile mTargetProfile;
    private IViewCenterService mViewCenterService;

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/taobao/message/sp/chat/widget/SimpleChatActivity$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", MonitorItemConstants.KEY_URL, "message_sp_chat_debug"}, k = 1, mv = {1, 1, 15})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class Companion {
        static {
            t2o.a(551551018);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/taobao/message/sp/chat/widget/SimpleChatActivity$ParseContext;", "", "(Lcom/taobao/message/sp/chat/widget/SimpleChatActivity;)V", "bizType", "", "getBizType", "()I", "setBizType", "(I)V", "channelType", "", "getChannelType", "()Ljava/lang/String;", "setChannelType", "(Ljava/lang/String;)V", "conversationCode", "getConversationCode", "setConversationCode", "identifier", "getIdentifier", "setIdentifier", "targetId", "getTargetId", "setTargetId", "targetNick", "getTargetNick", "setTargetNick", "targetType", "getTargetType", "setTargetType", "message_sp_chat_debug"}, k = 1, mv = {1, 1, 15})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public final class ParseContext {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int bizType = -1;
        private String channelType;
        private String conversationCode;
        private String identifier;
        private String targetId;
        private String targetNick;
        private String targetType;

        static {
            t2o.a(551551019);
        }

        public ParseContext() {
        }

        public final int getBizType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8f974bb1", new Object[]{this})).intValue();
            }
            return this.bizType;
        }

        public final String getChannelType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("44447fb2", new Object[]{this});
            }
            return this.channelType;
        }

        public final String getConversationCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("15c7f233", new Object[]{this});
            }
            return this.conversationCode;
        }

        public final String getIdentifier() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this});
            }
            return this.identifier;
        }

        public final String getTargetId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2ee30c37", new Object[]{this});
            }
            return this.targetId;
        }

        public final String getTargetNick() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("146d44af", new Object[]{this});
            }
            return this.targetNick;
        }

        public final String getTargetType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8b0a6938", new Object[]{this});
            }
            return this.targetType;
        }

        public final void setBizType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("999b9a11", new Object[]{this, new Integer(i)});
            } else {
                this.bizType = i;
            }
        }

        public final void setChannelType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c02a56c", new Object[]{this, str});
            } else {
                this.channelType = str;
            }
        }

        public final void setConversationCode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df78e2a3", new Object[]{this, str});
            } else {
                this.conversationCode = str;
            }
        }

        public final void setIdentifier(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3eb8cafc", new Object[]{this, str});
            } else {
                this.identifier = str;
            }
        }

        public final void setTargetId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("385bd51f", new Object[]{this, str});
            } else {
                this.targetId = str;
            }
        }

        public final void setTargetNick(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f024d8a7", new Object[]{this, str});
            } else {
                this.targetNick = str;
            }
        }

        public final void setTargetType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d2c453e", new Object[]{this, str});
            } else {
                this.targetType = str;
            }
        }
    }

    static {
        t2o.a(551551017);
        t2o.a(537919537);
        SimpleChatModule.injectDependencies(null);
    }

    public static final /* synthetic */ void access$listSelfProfile(SimpleChatActivity simpleChatActivity, ParseContext parseContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa8ef34", new Object[]{simpleChatActivity, parseContext});
        } else {
            simpleChatActivity.listSelfProfile(parseContext);
        }
    }

    public static final /* synthetic */ void access$listTargetProfile(SimpleChatActivity simpleChatActivity, ParseContext parseContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ee00f79", new Object[]{simpleChatActivity, parseContext});
        } else {
            simpleChatActivity.listTargetProfile(parseContext);
        }
    }

    public static final /* synthetic */ void access$onReady(SimpleChatActivity simpleChatActivity, ParseContext parseContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9507b8f", new Object[]{simpleChatActivity, parseContext});
        } else {
            simpleChatActivity.onReady(parseContext);
        }
    }

    public static final /* synthetic */ void access$processError(SimpleChatActivity simpleChatActivity, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9740dc0a", new Object[]{simpleChatActivity, th});
        } else {
            simpleChatActivity.processError(th);
        }
    }

    public static /* synthetic */ Object ipc$super(SimpleChatActivity simpleChatActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/sp/chat/widget/SimpleChatActivity");
        }
    }

    private final void listSelfProfile(final ParseContext parseContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73457ff", new Object[]{this, parseContext});
        } else if (ckf.b("imba", parseContext.getChannelType())) {
            listTargetProfile(parseContext);
        } else {
            SimpleProfileCache simpleProfileCache = SimpleProfileCache.INSTANCE;
            String userId = Login.getUserId();
            ckf.c(userId, "Login.getUserId()");
            String identifier = parseContext.getIdentifier();
            if (identifier != null) {
                String channelType = parseContext.getChannelType();
                if (channelType != null) {
                    simpleProfileCache.fetch(userId, false, identifier, channelType, String.valueOf(parseContext.getBizType()), new IObserver<SimpleProfile>() { // from class: com.taobao.message.sp.chat.widget.SimpleChatActivity$listSelfProfile$1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.message.kit.core.IObserver
                        public void onComplete() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                            } else {
                                SimpleChatActivity.access$listTargetProfile(SimpleChatActivity.this, parseContext);
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
                            SimpleChatActivity.access$processError(SimpleChatActivity.this, th);
                        }

                        public void onNext(SimpleProfile simpleProfile) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("e74263bf", new Object[]{this, simpleProfile});
                                return;
                            }
                            ckf.h(simpleProfile, "p0");
                            SimpleChatActivity.this.setMSelfProfile(simpleProfile);
                        }
                    });
                } else {
                    ckf.s();
                    throw null;
                }
            } else {
                ckf.s();
                throw null;
            }
        }
    }

    private final void listTargetProfile(final ParseContext parseContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7f1e04", new Object[]{this, parseContext});
        } else if (!TextUtils.isEmpty(parseContext.getTargetNick())) {
            SimpleProfileCache simpleProfileCache = SimpleProfileCache.INSTANCE;
            String targetNick = parseContext.getTargetNick();
            if (targetNick != null) {
                String identifier = parseContext.getIdentifier();
                if (identifier != null) {
                    String channelType = parseContext.getChannelType();
                    if (channelType != null) {
                        simpleProfileCache.fetch(targetNick, true, identifier, channelType, String.valueOf(parseContext.getBizType()), new IObserver<SimpleProfile>() { // from class: com.taobao.message.sp.chat.widget.SimpleChatActivity$listTargetProfile$1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.message.kit.core.IObserver
                            public void onComplete() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                                } else {
                                    SimpleChatActivity.access$onReady(SimpleChatActivity.this, parseContext);
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
                                SimpleChatActivity.access$processError(SimpleChatActivity.this, th);
                            }

                            public void onNext(SimpleProfile simpleProfile) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("e74263bf", new Object[]{this, simpleProfile});
                                    return;
                                }
                                ckf.h(simpleProfile, "p0");
                                SimpleChatActivity.this.setMTargetProfile(simpleProfile);
                            }
                        });
                    } else {
                        ckf.s();
                        throw null;
                    }
                } else {
                    ckf.s();
                    throw null;
                }
            } else {
                ckf.s();
                throw null;
            }
        } else if (!TextUtils.isEmpty(parseContext.getTargetId())) {
            SimpleProfileCache simpleProfileCache2 = SimpleProfileCache.INSTANCE;
            String targetId = parseContext.getTargetId();
            if (targetId != null) {
                String identifier2 = parseContext.getIdentifier();
                if (identifier2 != null) {
                    String channelType2 = parseContext.getChannelType();
                    if (channelType2 != null) {
                        simpleProfileCache2.fetch(targetId, false, identifier2, channelType2, String.valueOf(parseContext.getBizType()), new IObserver<SimpleProfile>() { // from class: com.taobao.message.sp.chat.widget.SimpleChatActivity$listTargetProfile$2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.message.kit.core.IObserver
                            public void onComplete() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                                } else {
                                    SimpleChatActivity.access$onReady(SimpleChatActivity.this, parseContext);
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
                                SimpleChatActivity.access$processError(SimpleChatActivity.this, th);
                            }

                            public void onNext(SimpleProfile simpleProfile) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("e74263bf", new Object[]{this, simpleProfile});
                                    return;
                                }
                                ckf.h(simpleProfile, "p0");
                                SimpleChatActivity.this.setMTargetProfile(simpleProfile);
                            }
                        });
                    } else {
                        ckf.s();
                        throw null;
                    }
                } else {
                    ckf.s();
                    throw null;
                }
            } else {
                ckf.s();
                throw null;
            }
        } else {
            onReady(parseContext);
        }
    }

    private final Bundle parseIntent(Intent intent, Bundle bundle) {
        Bundle bundle2;
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("57173a85", new Object[]{this, intent, bundle});
        }
        if (intent == null) {
            return new Bundle();
        }
        try {
            bundle2 = intent.getExtras();
        } catch (IllegalArgumentException unused) {
            bundle2 = null;
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        Uri data = intent.getData();
        if (!(data == null || (queryParameterNames = data.getQueryParameterNames()) == null || queryParameterNames.isEmpty())) {
            for (String str : queryParameterNames) {
                if (!bundle2.containsKey(str)) {
                    bundle2.putString(str, data.getQueryParameter(str));
                }
            }
        }
        return bundle2;
    }

    public static /* synthetic */ Bundle parseIntent$default(SimpleChatActivity simpleChatActivity, Intent intent, Bundle bundle, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("d080744a", new Object[]{simpleChatActivity, intent, bundle, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        return simpleChatActivity.parseIntent(intent, bundle);
    }

    private final void processError(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97965f15", new Object[]{this, th});
            return;
        }
        TLog.loge(TAG, Log.getStackTraceString(th));
        UIHandler.post(new Runnable() { // from class: com.taobao.message.sp.chat.widget.SimpleChatActivity$processError$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TBToast.makeText(SimpleChatActivity.this, DisplayUtil.localizedString(R.string.mp_failed_to_open_the_chat_window)).show();
                }
            }
        });
        finish();
    }

    private final FrameLayout setupContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("95d3bbd1", new Object[]{this});
        }
        CustomInsetsFrameLayout customInsetsFrameLayout = new CustomInsetsFrameLayout(this);
        customInsetsFrameLayout.setId(R.id.chat_custom_insets_layout);
        customInsetsFrameLayout.setFitsSystemWindows(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = DisplayUtil.getStatusBarHeight(this);
        customInsetsFrameLayout.setLayoutParams(layoutParams);
        setContentView(customInsetsFrameLayout);
        return customInsetsFrameLayout;
    }

    public void _$_clearFindViewByIdCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677c9886", new Object[]{this});
            return;
        }
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("399f7ed2", new Object[]{this, new Integer(i)});
        }
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // com.taobao.message.lab.comfrm.aura.INeedContainer
    public Container getContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Container) ipChange.ipc$dispatch("5a54538c", new Object[]{this});
        }
        Container container = this.mAuraContainer;
        if (container != null) {
            return container;
        }
        ckf.s();
        throw null;
    }

    public final SimpleConversation getMConversation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleConversation) ipChange.ipc$dispatch("72427281", new Object[]{this});
        }
        return this.mConversation;
    }

    public final SimpleProfile getMSelfProfile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleProfile) ipChange.ipc$dispatch("7559255", new Object[]{this});
        }
        return this.mSelfProfile;
    }

    public final SimpleProfile getMTargetProfile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleProfile) ipChange.ipc$dispatch("10cad30", new Object[]{this});
        }
        return this.mTargetProfile;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        ckf.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Container container = this.mAuraContainer;
        if (container != null) {
            container.postEvent(new Event.Build("onSystemConfigurationsChanged").build());
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.mAuraContainer != null) {
            Event build = new Event.Build("onDisappear").build();
            Container container = this.mAuraContainer;
            if (container != null) {
                container.postEvent(build);
                Container container2 = this.mAuraContainer;
                if (container2 != null) {
                    container2.dispose();
                } else {
                    ckf.s();
                    throw null;
                }
            } else {
                ckf.s();
                throw null;
            }
        }
        if (this.mViewCenterService != null) {
            Event build2 = new Event.Build("onDisappear").build();
            IViewCenterService iViewCenterService = this.mViewCenterService;
            if (iViewCenterService != null) {
                iViewCenterService.postEvent(build2);
                IViewCenterService iViewCenterService2 = this.mViewCenterService;
                if (iViewCenterService2 != null) {
                    iViewCenterService2.dispose();
                } else {
                    ckf.s();
                    throw null;
                }
            } else {
                ckf.s();
                throw null;
            }
        }
    }

    public final void setMConversation(SimpleConversation simpleConversation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf7fe01", new Object[]{this, simpleConversation});
        } else {
            this.mConversation = simpleConversation;
        }
    }

    public final void setMSelfProfile(SimpleProfile simpleProfile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1183a99f", new Object[]{this, simpleProfile});
        } else {
            this.mSelfProfile = simpleProfile;
        }
    }

    public final void setMTargetProfile(SimpleProfile simpleProfile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707b1d24", new Object[]{this, simpleProfile});
        } else {
            this.mTargetProfile = simpleProfile;
        }
    }

    private final void onReady(ParseContext parseContext) {
        String str;
        long j;
        String str2;
        String str3;
        IViewCenterService iViewCenterService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f08f869a", new Object[]{this, parseContext});
            return;
        }
        Container container = this.mAuraContainer;
        if (container != null) {
            if (container != null) {
                container.dispose();
            } else {
                ckf.s();
                throw null;
            }
        }
        ViewCenterProps viewCenterProps = new ViewCenterProps();
        viewCenterProps.bizType = String.valueOf(parseContext.getBizType());
        viewCenterProps.identifier = parseContext.getIdentifier();
        viewCenterProps.targetId = parseContext.getTargetId();
        if (!TextUtils.isEmpty(parseContext.getTargetType())) {
            str = parseContext.getTargetType();
        } else {
            str = "3";
        }
        viewCenterProps.targetType = str;
        if (TextUtils.isEmpty(Login.getUserId())) {
            j = 0;
        } else {
            String userId = Login.getUserId();
            ckf.c(userId, "Login.getUserId()");
            j = Long.parseLong(userId);
        }
        viewCenterProps.userId = j;
        viewCenterProps.spm = "";
        viewCenterProps.classNamespace = SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE;
        this.mViewCenterService = new ViewCenterServiceImpl(this, viewCenterProps, ViewCenterEnv.newInstance());
        if (!isFinishing() && (iViewCenterService = this.mViewCenterService) != null) {
            if (iViewCenterService != null) {
                iViewCenterService.postEvent(new Event.Build(h9z.EVENT_ON_APPEAR).build());
            } else {
                ckf.s();
                throw null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("targetId", parseContext.getTargetId());
        linkedHashMap.put("targetType", parseContext.getTargetType());
        linkedHashMap.put("bizType", String.valueOf(parseContext.getBizType()));
        if (parseContext.getBizType() == 11001) {
            str2 = "U";
        } else {
            str2 = "PU";
        }
        linkedHashMap.put("entityType", str2);
        linkedHashMap.put("ccode", parseContext.getConversationCode());
        linkedHashMap.put("conversation", this.mConversation);
        linkedHashMap.put("selfProfile", this.mSelfProfile);
        linkedHashMap.put("targetProfile", this.mTargetProfile);
        linkedHashMap.put("accountId", Login.getUserId());
        linkedHashMap.put("targetNick", parseContext.getTargetNick());
        linkedHashMap.put("channelType", parseContext.getChannelType());
        linkedHashMap.put("isSimpleChat", Boolean.TRUE);
        if (ckf.b(parseContext.getChannelType(), "im_bc")) {
            str3 = "messageSingleSimple";
        } else {
            str3 = "messageOfficialSimple";
        }
        Container container2 = new Container(this, str3, (String) null, parseContext.getIdentifier(), linkedHashMap, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        this.mAuraContainer = container2;
        container2.setUseRemote(true);
        WidgetRenderImpl.RenderConfig renderConfig = new WidgetRenderImpl.RenderConfig();
        renderConfig.dxEngineBizType = "alimp_message_simple";
        renderConfig.reUseKey = "alimp_message_simple";
        Container container3 = this.mAuraContainer;
        if (container3 != null) {
            container3.setRenderConfig(renderConfig);
            Container container4 = this.mAuraContainer;
            if (container4 != null) {
                container4.registerService(ExecuteService.class, new OpenApiService(this));
                HashMap hashMap = new HashMap(1);
                IViewCenterService iViewCenterService2 = this.mViewCenterService;
                if (iViewCenterService2 != null) {
                    hashMap.put("viewCenterService", iViewCenterService2);
                    hashMap.put(MsgDinamicxEngine.KEY_DX_SUB_BIZTYPE, MsgDinamicxEngine.DX_SUB_BIZTYPE_MESSAGE_CHAT);
                    IViewCenterService iViewCenterService3 = this.mViewCenterService;
                    if (iViewCenterService3 != null) {
                        ((ViewCenterServiceImpl) iViewCenterService3).setRenderContext(hashMap);
                        Container container5 = this.mAuraContainer;
                        if (container5 != null) {
                            container5.setRenderContext(hashMap);
                            Container container6 = this.mAuraContainer;
                            if (container6 != null) {
                                container6.start(setupContentView(), true);
                                if (this.isResumeLast && !isFinishing()) {
                                    Event build = new Event.Build(h9z.EVENT_ON_APPEAR).build();
                                    Container container7 = this.mAuraContainer;
                                    if (container7 != null) {
                                        container7.postEvent(build);
                                    } else {
                                        ckf.s();
                                        throw null;
                                    }
                                }
                            } else {
                                ckf.s();
                                throw null;
                            }
                        } else {
                            ckf.s();
                            throw null;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.taobao.message.chatv2.viewcenter.ViewCenterServiceImpl");
                    }
                } else {
                    ckf.s();
                    throw null;
                }
            } else {
                ckf.s();
                throw null;
            }
        } else {
            ckf.s();
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (this.mAuraContainer != null) {
            Event build = new Event.Build(h9z.EVENT_ON_APPEAR).build();
            Container container = this.mAuraContainer;
            if (container != null) {
                container.postEvent(build);
            } else {
                ckf.s();
                throw null;
            }
        }
        this.isResumeLast = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
        if (tb.wsq.O(r6, ".", false, 2, null) != false) goto L_0x007a;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0160  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.sp.chat.widget.SimpleChatActivity.onCreate(android.os.Bundle):void");
    }
}
