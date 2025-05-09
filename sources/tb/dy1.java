package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class dy1<M> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String bizCode;
    private final String collectionUrl;
    public String from;
    public String message;
    private final String pid;
    public float sampling = 0.001f;
    private String uuid;

    static {
        t2o.a(83886302);
    }

    public dy1(String str, String str2, String str3) {
        this.pid = str2;
        this.bizCode = str == null ? "Ultron" : str;
        this.collectionUrl = str3;
    }

    public M from(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M) ipChange.ipc$dispatch("c92e2dd7", new Object[]{this, str});
        }
        this.from = str;
        return this;
    }

    public String getBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        return this.bizCode;
    }

    public String getCollectionUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd61839e", new Object[]{this});
        }
        return this.collectionUrl;
    }

    public String getFrom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df3302d9", new Object[]{this});
        }
        return this.from;
    }

    public String getMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
        }
        String str = this.message;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getPid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("229b03c4", new Object[]{this});
        }
        return this.pid;
    }

    public float getSampling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68809b54", new Object[]{this})).floatValue();
        }
        return this.sampling;
    }

    public String getUuid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a2f0b68", new Object[]{this});
        }
        return this.uuid;
    }

    public M message(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M) ipChange.ipc$dispatch("5b5ec6da", new Object[]{this, str});
        }
        this.message = str;
        return this;
    }

    public M sampling(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M) ipChange.ipc$dispatch("7d5e10e0", new Object[]{this, new Float(f)});
        }
        this.sampling = f;
        return this;
    }

    public dy1<M> setUuid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dy1) ipChange.ipc$dispatch("2127a2ac", new Object[]{this, str});
        }
        this.uuid = str;
        return this;
    }
}
