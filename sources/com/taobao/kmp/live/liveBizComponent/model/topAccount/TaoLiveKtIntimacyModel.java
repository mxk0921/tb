package com.taobao.kmp.live.liveBizComponent.model.topAccount;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.base.TaoLiveKtBaseModel;
import kotlin.Metadata;
import tb.a07;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtIntimacyModel;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/TaoLiveKtBaseModel;", "<init>", "()V", "", "intimacyIconNormal", "Ljava/lang/String;", "getIntimacyIconNormal", "()Ljava/lang/String;", "setIntimacyIconNormal", "(Ljava/lang/String;)V", "intimacyIconFavor", "getIntimacyIconFavor", "setIntimacyIconFavor", "shopWindowUrl", "getShopWindowUrl", "setShopWindowUrl", "levelDesc", "getLevelDesc", "setLevelDesc", "enableNewStyle", "getEnableNewStyle", "setEnableNewStyle", "Companion", "a", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtIntimacyModel extends TaoLiveKtBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private String enableNewStyle;
    private String intimacyIconFavor;
    private String intimacyIconNormal;
    private String levelDesc;
    private String shopWindowUrl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1003487320);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1003487319);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtIntimacyModel taoLiveKtIntimacyModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtIntimacyModel");
    }

    public final String getEnableNewStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a43fdaf", new Object[]{this});
        }
        return this.enableNewStyle;
    }

    public final String getIntimacyIconFavor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1942654e", new Object[]{this});
        }
        return this.intimacyIconFavor;
    }

    public final String getIntimacyIconNormal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("430110ff", new Object[]{this});
        }
        return this.intimacyIconNormal;
    }

    public final String getLevelDesc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d8c6da", new Object[]{this});
        }
        return this.levelDesc;
    }

    public final String getShopWindowUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb50af86", new Object[]{this});
        }
        return this.shopWindowUrl;
    }

    public final void setEnableNewStyle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef07d9a7", new Object[]{this, str});
        } else {
            this.enableNewStyle = str;
        }
    }

    public final void setIntimacyIconFavor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c894c50", new Object[]{this, str});
        } else {
            this.intimacyIconFavor = str;
        }
    }

    public final void setIntimacyIconNormal(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f2ca57", new Object[]{this, str});
        } else {
            this.intimacyIconNormal = str;
        }
    }

    public final void setLevelDesc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77dd044", new Object[]{this, str});
        } else {
            this.levelDesc = str;
        }
    }

    public final void setShopWindowUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3652318", new Object[]{this, str});
        } else {
            this.shopWindowUrl = str;
        }
    }
}
