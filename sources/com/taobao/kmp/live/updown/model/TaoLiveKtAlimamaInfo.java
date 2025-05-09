package com.taobao.kmp.live.updown.model;

import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.base.TaoLiveKtBaseModel;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.js0;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\f\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR2\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\b\"\u0004\b(\u0010\n¨\u0006+"}, d2 = {"Lcom/taobao/kmp/live/updown/model/TaoLiveKtAlimamaInfo;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/TaoLiveKtBaseModel;", "<init>", "()V", "", "clickid", "Ljava/lang/String;", "getClickid", "()Ljava/lang/String;", "setClickid", "(Ljava/lang/String;)V", "interactiveid", "getInteractiveid", "setInteractiveid", "context", "getContext", "setContext", "ifsUrl", "getIfsUrl", "setIfsUrl", MspDBHelper.BizEntry.COLUMN_NAME_PID, "getPid", "setPid", "", "pay_time", "J", "getPay_time", "()J", "setPay_time", "(J)V", "", "", "clickInfo", "Ljava/util/Map;", "getClickInfo", "()Ljava/util/Map;", "setClickInfo", "(Ljava/util/Map;)V", js0.E_URL, "getEurl", "setEurl", "Companion", "a", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtAlimamaInfo extends TaoLiveKtBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private Map<String, ? extends Object> clickInfo;
    private String clickid;
    private String context;
    private String eurl;
    private String ifsUrl;
    private String interactiveid;
    private long pay_time;
    private String pid;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1003487373);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1003487372);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtAlimamaInfo taoLiveKtAlimamaInfo, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/live/updown/model/TaoLiveKtAlimamaInfo");
    }

    public final Map<String, Object> getClickInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("177e021c", new Object[]{this});
        }
        return this.clickInfo;
    }

    public final String getClickid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("823b58ac", new Object[]{this});
        }
        return this.clickid;
    }

    public final String getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7dc9320", new Object[]{this});
        }
        return this.context;
    }

    public final String getEurl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7167399", new Object[]{this});
        }
        return this.eurl;
    }

    public final String getIfsUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("556da0ca", new Object[]{this});
        }
        return this.ifsUrl;
    }

    public final String getInteractiveid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2c33992", new Object[]{this});
        }
        return this.interactiveid;
    }

    public final long getPay_time() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2989f8f5", new Object[]{this})).longValue();
        }
        return this.pay_time;
    }

    public final String getPid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("229b03c4", new Object[]{this});
        }
        return this.pid;
    }

    public final void setClickInfo(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caed4b8a", new Object[]{this, map});
        } else {
            this.clickInfo = map;
        }
    }

    public final void setClickid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc3345b2", new Object[]{this, str});
        } else {
            this.clickid = str;
        }
    }

    public final void setContext(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ab959be", new Object[]{this, str});
        } else {
            this.context = str;
        }
    }

    public final void setEurl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0373ffd", new Object[]{this, str});
        } else {
            this.eurl = str;
        }
    }

    public final void setIfsUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f065ec", new Object[]{this, str});
        } else {
            this.ifsUrl = str;
        }
    }

    public final void setInteractiveid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da43da8c", new Object[]{this, str});
        } else {
            this.interactiveid = str;
        }
    }

    public final void setPay_time(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a8c0457", new Object[]{this, new Long(j)});
        } else {
            this.pay_time = j;
        }
    }

    public final void setPid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f52579a", new Object[]{this, str});
        } else {
            this.pid = str;
        }
    }
}
