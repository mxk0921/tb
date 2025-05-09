package com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.enter;

import com.alipay.android.msp.framework.offline.CashierOperationReceiver;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.base.TaoLiveKtBaseModel;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.List;
import kotlin.Metadata;
import tb.a07;
import tb.m09;
import tb.t2o;
import tb.vaj;
import tb.ysq;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fR$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\u0011R$\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\u0011R,\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/enter/TaoLiveKtEnterRoomModel;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/TaoLiveKtBaseModel;", "<init>", "()V", "", "enterText", "()Ljava/lang/String;", "", "fansLevel", "()I", "str", "formatSecretName", "(Ljava/lang/String;)Ljava/lang/String;", "nick", "Ljava/lang/String;", "getNick", "setNick", "(Ljava/lang/String;)V", "flowSourceText", "getFlowSourceText", "setFlowSourceText", vaj.KEY_BG_COLOR, "getBgColor", "setBgColor", "bgColor2", "getBgColor2", "setBgColor2", "", "", ChatMessage.KEY_MEDAL_LIST_DT, "Ljava/util/List;", "getMedalList", "()Ljava/util/List;", "setMedalList", "(Ljava/util/List;)V", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", CashierOperationReceiver.PARAMS_IDENTIFY, "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "getIdentify", "()Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "setIdentify", "(Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;)V", "Companion", "a", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtEnterRoomModel extends TaoLiveKtBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private KMPJsonObject identify;
    private List<? extends Object> medalList;
    private String nick = "";
    private String flowSourceText = "";
    private String bgColor = "";
    private String bgColor2 = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1010827321);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1010827320);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtEnterRoomModel taoLiveKtEnterRoomModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/liveroom/liveBizComponent/leftBottomGroup/enter/TaoLiveKtEnterRoomModel");
    }

    public final String enterText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d28813f4", new Object[]{this});
        }
        String str = this.flowSourceText;
        if (str == null || str.length() <= 0) {
            return "来了";
        }
        return this.flowSourceText;
    }

    public final int fansLevel() {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be6ebe1e", new Object[]{this})).intValue();
        }
        KMPJsonObject kMPJsonObject = this.identify;
        if (kMPJsonObject == null || (num = kMPJsonObject.getInt(m09.FANS_LEVEL_RENDER)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final String formatSecretName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39f3993d", new Object[]{this, str});
        }
        if (str == null || str.length() < 4) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char V0 = ysq.V0(str);
        sb.append(V0 + "***");
        sb.append(ysq.W0(str));
        return sb.toString();
    }

    public final String getBgColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73519e11", new Object[]{this});
        }
        return this.bgColor;
    }

    public final String getBgColor2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c23115ef", new Object[]{this});
        }
        return this.bgColor2;
    }

    public final String getFlowSourceText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b35dedcd", new Object[]{this});
        }
        return this.flowSourceText;
    }

    public final KMPJsonObject getIdentify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KMPJsonObject) ipChange.ipc$dispatch("2d95676b", new Object[]{this});
        }
        return this.identify;
    }

    public final List<Object> getMedalList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("172d701", new Object[]{this});
        }
        return this.medalList;
    }

    public final String getNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[]{this});
        }
        return this.nick;
    }

    public final void setBgColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde5aced", new Object[]{this, str});
        } else {
            this.bgColor = str;
        }
    }

    public final void setBgColor2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf0267", new Object[]{this, str});
        } else {
            this.bgColor2 = str;
        }
    }

    public final void setFlowSourceText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c92bed49", new Object[]{this, str});
        } else {
            this.flowSourceText = str;
        }
    }

    public final void setIdentify(KMPJsonObject kMPJsonObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0eca53", new Object[]{this, kMPJsonObject});
        } else {
            this.identify = kMPJsonObject;
        }
    }

    public final void setMedalList(List<? extends Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e51deb", new Object[]{this, list});
        } else {
            this.medalList = list;
        }
    }

    public final void setNick(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04e97b6", new Object[]{this, str});
        } else {
            this.nick = str;
        }
    }
}
