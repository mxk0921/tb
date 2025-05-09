package com.taobao.kmp.live.liveBizComponent.model.topAccount;

import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.base.TaoLiveKtBaseModel;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000f\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R2\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010#\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\r\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011R$\u0010&\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\r\u001a\u0004\b'\u0010\u000f\"\u0004\b(\u0010\u0011¨\u0006+"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtSubscribeDataSourceModel;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/TaoLiveKtBaseModel;", "<init>", "()V", "", "showPanel", "Z", "getShowPanel", "()Z", "setShowPanel", "(Z)V", "", "buttonText", "Ljava/lang/String;", "getButtonText", "()Ljava/lang/String;", "setButtonText", "(Ljava/lang/String;)V", "startTimeStr", "getStartTimeStr", "setStartTimeStr", MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE, "getSubTitle", "setSubTitle", "icon", "getIcon", "setIcon", "", "", "jumpParam", "Ljava/util/Map;", "getJumpParam", "()Ljava/util/Map;", "setJumpParam", "(Ljava/util/Map;)V", "image", "getImage", "setImage", "title", "getTitle", "setTitle", "Companion", "a", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtSubscribeDataSourceModel extends TaoLiveKtBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private String buttonText;
    private String icon;
    private String image;
    private Map<String, ? extends Object> jumpParam;
    private boolean showPanel;
    private String startTimeStr;
    private String subTitle;
    private String title;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1003487322);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1003487321);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtSubscribeDataSourceModel taoLiveKtSubscribeDataSourceModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtSubscribeDataSourceModel");
    }

    public final String getButtonText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62bd2aa4", new Object[]{this});
        }
        return this.buttonText;
    }

    public final String getIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e32456a", new Object[]{this});
        }
        return this.icon;
    }

    public final String getImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a7b8874", new Object[]{this});
        }
        return this.image;
    }

    public final Map<String, Object> getJumpParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("70631085", new Object[]{this});
        }
        return this.jumpParam;
    }

    public final boolean getShowPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3eb6fa5c", new Object[]{this})).booleanValue();
        }
        return this.showPanel;
    }

    public final String getStartTimeStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8b30e21", new Object[]{this});
        }
        return this.startTimeStr;
    }

    public final String getSubTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9c4664b", new Object[]{this});
        }
        return this.subTitle;
    }

    public final String getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.title;
    }

    public final void setButtonText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bd1b152", new Object[]{this, str});
        } else {
            this.buttonText = str;
        }
    }

    public final void setIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c95a84c", new Object[]{this, str});
        } else {
            this.icon = str;
        }
    }

    public final void setImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ce1bea", new Object[]{this, str});
        } else {
            this.image = str;
        }
    }

    public final void setJumpParam(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eaa0a41", new Object[]{this, map});
        } else {
            this.jumpParam = map;
        }
    }

    public final void setShowPanel(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("601f6b88", new Object[]{this, new Boolean(z)});
        } else {
            this.showPanel = z;
        }
    }

    public final void setStartTimeStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be4d2a75", new Object[]{this, str});
        } else {
            this.startTimeStr = str;
        }
    }

    public final void setSubTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a5bd8b", new Object[]{this, str});
        } else {
            this.subTitle = str;
        }
    }

    public final void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.title = str;
        }
    }
}
