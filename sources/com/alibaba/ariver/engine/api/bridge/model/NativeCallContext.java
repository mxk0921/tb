package com.alibaba.ariver.engine.api.bridge.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVOrangeConfigUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.TMSJSAPIHandler;
import java.util.concurrent.atomic.AtomicLong;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NativeCallContext<T extends Node> implements Parcelable {
    public static final String CALL_MODE_ASYNC = "async";
    public static final String CALL_MODE_SYNC = "sync";
    public static final String CALL_MODE_UNKNOWN = "unknown";
    public static final String DOMAIN_APP = "app";
    public static final String DOMAIN_APPX = "appx";
    public static final String DOMAIN_GM_BIZ = "gmBiz";
    public static final String DOMAIN_MINIAPP_FRAMEWORK = "miniappFramework";
    public static final String DOMAIN_WIDGET = "widget";
    public static final String DOMAIN_WIDGET_BIZ = "widgetBiz";
    public static final String DOMAIN_WIDGET_FRAMEWORK = "widgetFramework";
    public static final String FROM_WORKER = "fromWorker";
    private String appxDomain;
    private String callMode;
    private String contextId;
    private String id;
    private String name;
    private T node;
    private String originalData;
    private JSONObject params;
    private String pluginId;
    private Render render;
    private String source;
    private final StatData statData;
    private static final AtomicLong sCounter = new AtomicLong(Process.myPid());
    public static final Parcelable.Creator<NativeCallContext> CREATOR = new Parcelable.Creator<NativeCallContext>() { // from class: com.alibaba.ariver.engine.api.bridge.model.NativeCallContext.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NativeCallContext createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (NativeCallContext) ipChange.ipc$dispatch("d37a1", new Object[]{this, parcel}) : new NativeCallContext(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NativeCallContext[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (NativeCallContext[]) ipChange.ipc$dispatch("524500ca", new Object[]{this, new Integer(i)}) : new NativeCallContext[i];
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Builder<T extends Builder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean dispatcherOnWorkerThread;
        public String name;
        public Node node;
        public String originalData;
        public JSONObject params;
        public Render render;
        public String source;
        public StatData statData;
        public String id = "native_" + System.currentTimeMillis();
        public String callMode = "unknown";

        public NativeCallContext build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NativeCallContext) ipChange.ipc$dispatch("47c4fd23", new Object[]{this});
            }
            return new NativeCallContext(this);
        }

        public T callMode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ((Builder) ipChange.ipc$dispatch("20ab764f", new Object[]{this, str}));
            }
            this.callMode = str;
            return this;
        }

        public T dispatcherOnWorkerThread(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ((Builder) ipChange.ipc$dispatch("a90028a2", new Object[]{this, new Boolean(z)}));
            }
            this.dispatcherOnWorkerThread = z;
            return this;
        }

        public T generateLegacyNativeId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ((Builder) ipChange.ipc$dispatch("9d9a6e8a", new Object[]{this}));
            }
            this.id = "native_" + System.currentTimeMillis();
            return this;
        }

        public T id(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ((Builder) ipChange.ipc$dispatch("396c5615", new Object[]{this, str}));
            }
            this.id = str;
            return this;
        }

        public T name(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ((Builder) ipChange.ipc$dispatch("d54382a5", new Object[]{this, str}));
            }
            this.name = str;
            return this;
        }

        public T node(Node node) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ((Builder) ipChange.ipc$dispatch("31fe6234", new Object[]{this, node}));
            }
            this.node = node;
            return this;
        }

        public T originalData(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ((Builder) ipChange.ipc$dispatch("ba4ac615", new Object[]{this, str}));
            }
            this.originalData = str;
            return this;
        }

        public T params(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ((Builder) ipChange.ipc$dispatch("b02bf05e", new Object[]{this, jSONObject}));
            }
            this.params = jSONObject;
            return this;
        }

        public T render(Render render) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ((Builder) ipChange.ipc$dispatch("a8b6744a", new Object[]{this, render}));
            }
            this.render = render;
            return this;
        }

        public T source(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ((Builder) ipChange.ipc$dispatch("89d31b15", new Object[]{this, str}));
            }
            this.source = str;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class StatData implements Parcelable {
        public static final Parcelable.Creator<StatData> CREATOR = new Parcelable.Creator<StatData>() { // from class: com.alibaba.ariver.engine.api.bridge.model.NativeCallContext.StatData.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public StatData createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (StatData) ipChange.ipc$dispatch("2ecaa773", new Object[]{this, parcel}) : new StatData(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public StatData[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (StatData[]) ipChange.ipc$dispatch("34081c6a", new Object[]{this, new Integer(i)}) : new StatData[i];
            }
        };
        public long callbackTimeStamp;
        public long executeTimeStamp;
        public long triggerTimeStamp;

        public StatData() {
        }

        public void copyData(StatData statData) {
            if (statData != null) {
                this.triggerTimeStamp = statData.triggerTimeStamp;
                this.executeTimeStamp = statData.executeTimeStamp;
                this.callbackTimeStamp = statData.callbackTimeStamp;
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String print() {
            return "total(" + (this.callbackTimeStamp - this.triggerTimeStamp) + ")|dispatch(" + (this.executeTimeStamp - this.triggerTimeStamp) + f7l.BRACKET_END_STR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.triggerTimeStamp);
            parcel.writeLong(this.executeTimeStamp);
            parcel.writeLong(this.callbackTimeStamp);
        }

        public StatData(Parcel parcel) {
            this.triggerTimeStamp = parcel.readLong();
            this.executeTimeStamp = parcel.readLong();
            this.callbackTimeStamp = parcel.readLong();
        }
    }

    public NativeCallContext() {
        this.statData = new StatData();
    }

    public static long generateUniqueId() {
        return System.currentTimeMillis() + sCounter.addAndGet(1L);
    }

    public static Builder newBuilder(String str) {
        return new Builder().name(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppxDomain() {
        return this.appxDomain;
    }

    public String getCallMode() {
        return this.callMode;
    }

    public String getContextId() {
        return this.contextId;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public T getNode() {
        return this.node;
    }

    public String getOriginalData() {
        return this.originalData;
    }

    public JSONObject getParams() {
        return this.params;
    }

    public String getPluginId() {
        return this.pluginId;
    }

    public Render getRender() {
        return this.render;
    }

    public String getSource() {
        return this.source;
    }

    public StatData getStatData() {
        return this.statData;
    }

    public void setAppxDomain(String str) {
        this.appxDomain = str;
    }

    public void setCallMode(String str) {
        this.callMode = str;
    }

    public void setContextId(String str) {
        this.contextId = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNode(T t) {
        this.node = t;
    }

    public void setOriginalData(String str) {
        this.originalData = str;
    }

    public void setParams(JSONObject jSONObject) {
        this.params = jSONObject;
    }

    public void setPluginId(String str) {
        this.pluginId = str;
    }

    public void setRender(Render render) {
        this.render = render;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativeCallContext{name=");
        sb.append(this.name);
        sb.append(", params=");
        sb.append(this.params);
        sb.append(", id=");
        sb.append(this.id);
        if (this.pluginId != null) {
            sb.append(", pluginId=");
            sb.append(this.pluginId);
        }
        sb.append(", callMode=");
        sb.append(this.callMode);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.name);
        parcel.writeString(this.id);
        parcel.writeString(this.source);
        byte[] marshallJSONObject = JSONUtils.marshallJSONObject(this.params);
        if (marshallJSONObject == null) {
            i2 = 0;
        } else {
            i2 = marshallJSONObject.length;
        }
        parcel.writeInt(i2);
        if (i2 > 0) {
            parcel.writeByteArray(marshallJSONObject, 0, i2);
        }
        parcel.writeParcelable(this.node, 0);
        parcel.writeString(this.pluginId);
        parcel.writeString(this.contextId);
        parcel.writeString(this.callMode);
    }

    public NativeCallContext(Builder builder) {
        StatData statData = new StatData();
        this.statData = statData;
        this.render = builder.render;
        this.name = builder.name;
        JSONObject jSONObject = builder.params;
        this.params = jSONObject;
        this.node = (T) builder.node;
        this.id = builder.id;
        this.source = builder.source;
        this.originalData = builder.originalData;
        String string = JSONUtils.getString(jSONObject, "__appxDomain");
        if (RVOrangeConfigUtils.enableCanalDomain() && TextUtils.isEmpty(string)) {
            String string2 = JSONUtils.getString(this.params, TMSJSAPIHandler.DOMAIN_KEY);
            if (TextUtils.equals("widgetFramework", string2) || TextUtils.equals(DOMAIN_MINIAPP_FRAMEWORK, string2)) {
                string = string2;
            }
        }
        if (!TextUtils.isEmpty(string) && FROM_WORKER.equalsIgnoreCase(this.source)) {
            if (!"app".equalsIgnoreCase(string) && !DOMAIN_GM_BIZ.equalsIgnoreCase(string) && !DOMAIN_WIDGET_BIZ.equalsIgnoreCase(string) && !DOMAIN_APPX.equalsIgnoreCase(string) && !"widget".equalsIgnoreCase(string) && !"widgetFramework".equalsIgnoreCase(string) && !DOMAIN_MINIAPP_FRAMEWORK.equalsIgnoreCase(string)) {
                this.pluginId = string;
            }
            this.appxDomain = string;
        }
        this.contextId = JSONUtils.getString(this.params, "contextId");
        statData.copyData(builder.statData);
        this.callMode = builder.callMode;
    }

    public NativeCallContext(Parcel parcel) {
        this.statData = new StatData();
        this.name = parcel.readString();
        this.id = parcel.readString();
        this.source = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            this.params = JSONUtils.unmarshallJSONObject(bArr);
        }
        this.node = (T) ((Node) parcel.readParcelable(NativeCallContext.class.getClassLoader()));
        this.pluginId = parcel.readString();
        this.contextId = parcel.readString();
        this.callMode = parcel.readString();
    }
}
