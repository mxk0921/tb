package com.taobao.orange;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class OConfig implements Parcelable {
    public static final Parcelable.Creator<OConfig> CREATOR = new a();
    public String ackHost;
    public String[] ackVips;
    public String appKey;
    public String appSecret;
    public String appVersion;
    public String authCode;
    public boolean channelIndexUpdate;
    public String dcHost;
    public String[] dcVips;
    public boolean enableDiffIndex;
    public int env;
    public int indexUpdateMode;
    public String[] probeHosts;
    public boolean reportAck;
    public int serverType;
    public boolean statUsedConfig;
    public long time;
    public String userId;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String[] l;
        public String m;
        public String[] n;
        public String o;
        public String[] p;

        /* renamed from: a  reason: collision with root package name */
        public int f11379a = OConstant.ENV.ONLINE.getEnvMode();
        public String b = "";
        public String c = "";
        public String d = "";
        public String e = "";
        public String f = "";
        public int g = OConstant.SERVER.TAOBAO.ordinal();
        public int h = OConstant.UPDMODE.O_XMD.ordinal();
        public boolean i = false;
        public boolean j = false;
        public boolean k = false;
        public long q = 2000;

        static {
            t2o.a(613416994);
        }

        public OConfig build() {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OConfig) ipChange.ipc$dispatch("d090ca43", new Object[]{this});
            }
            OConfig oConfig = new OConfig((a) null);
            int i = this.f11379a;
            oConfig.env = i;
            oConfig.appKey = this.b;
            oConfig.appSecret = this.d;
            oConfig.authCode = this.e;
            oConfig.userId = this.f;
            oConfig.appVersion = this.c;
            oConfig.serverType = this.g;
            oConfig.indexUpdateMode = this.h;
            oConfig.reportAck = this.i;
            oConfig.statUsedConfig = this.j;
            oConfig.time = this.q;
            String[] strArr = this.l;
            if (strArr == null || strArr.length == 0) {
                oConfig.probeHosts = OConstant.PROBE_HOSTS[i];
            } else {
                oConfig.probeHosts = strArr;
            }
            if (TextUtils.isEmpty(this.m)) {
                if (this.g == OConstant.SERVER.TAOBAO.ordinal()) {
                    str2 = OConstant.DC_TAOBAO_HOSTS[this.f11379a];
                } else {
                    str2 = OConstant.DC_YOUKU_HOSTS[this.f11379a];
                }
                oConfig.dcHost = str2;
            } else {
                oConfig.dcHost = this.m;
            }
            oConfig.dcVips = this.n;
            if (TextUtils.isEmpty(this.o)) {
                if (this.g == OConstant.SERVER.TAOBAO.ordinal()) {
                    str = OConstant.ACK_TAOBAO_HOSTS[this.f11379a];
                } else {
                    str = OConstant.ACK_YOUKU_HOSTS[this.f11379a];
                }
                oConfig.ackHost = str;
            } else {
                oConfig.ackHost = this.o;
            }
            oConfig.ackVips = this.p;
            oConfig.enableDiffIndex = this.k;
            return oConfig;
        }

        public Builder setAckHost(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("59e0fbf7", new Object[]{this, str});
            }
            this.o = str;
            return this;
        }

        public Builder setAckVips(String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("18b2e012", new Object[]{this, strArr});
            }
            this.p = strArr;
            return this;
        }

        public Builder setAppKey(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("96dcb968", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public Builder setAppSecret(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("89ee6d7", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public Builder setAppVersion(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("72b08061", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public Builder setAuthCode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("325def1f", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public Builder setDcHost(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3daafcb1", new Object[]{this, str});
            }
            this.m = str;
            return this;
        }

        public Builder setDcVips(String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ae28f698", new Object[]{this, strArr});
            }
            this.n = strArr;
            return this;
        }

        public Builder setEnableDiffIndex(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("255e31bc", new Object[]{this, new Boolean(z)});
            }
            this.k = z;
            return this;
        }

        public Builder setEnv(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("8465bc68", new Object[]{this, new Integer(i)});
            }
            this.f11379a = i;
            return this;
        }

        public Builder setIndexUpdateMode(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("79fee0b7", new Object[]{this, new Integer(i)});
            }
            this.h = i;
            return this;
        }

        @Deprecated
        public Builder setOnlineAckHost(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("da9858a4", new Object[]{this, str});
            }
            this.o = str;
            return this;
        }

        @Deprecated
        public Builder setOnlineHost(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f4f2bf85", new Object[]{this, str});
            }
            this.m = str;
            return this;
        }

        public Builder setProbeHosts(String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("324bfd72", new Object[]{this, strArr});
            }
            this.l = strArr;
            return this;
        }

        public Builder setReportAck(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e176a7b1", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public Builder setServerType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("515f33f4", new Object[]{this, new Integer(i)});
            }
            this.g = i;
            return this;
        }

        public Builder setStatUsedConfig(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("1dc4460f", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public Builder setTime(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ec422e45", new Object[]{this, new Long(j)});
            }
            this.q = j;
            return this;
        }

        public Builder setUserId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("25938330", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Parcelable.Creator<OConfig> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public OConfig createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OConfig) ipChange.ipc$dispatch("593a5885", new Object[]{this, parcel});
            }
            return new OConfig(parcel);
        }

        /* renamed from: b */
        public OConfig[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OConfig[]) ipChange.ipc$dispatch("72a1e3fc", new Object[]{this, new Integer(i)});
            }
            return new OConfig[i];
        }
    }

    static {
        t2o.a(613416992);
    }

    public /* synthetic */ OConfig(a aVar) {
        this();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.env);
        parcel.writeString(this.appKey);
        parcel.writeString(this.appVersion);
        parcel.writeString(this.appSecret);
        parcel.writeString(this.authCode);
        parcel.writeString(this.userId);
        parcel.writeInt(this.serverType);
        parcel.writeInt(this.indexUpdateMode);
        parcel.writeByte(this.reportAck ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.statUsedConfig ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.probeHosts);
        parcel.writeString(this.dcHost);
        parcel.writeStringArray(this.dcVips);
        parcel.writeString(this.ackHost);
        parcel.writeStringArray(this.ackVips);
        parcel.writeLong(this.time);
        parcel.writeByte(this.channelIndexUpdate ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableDiffIndex ? (byte) 1 : (byte) 0);
    }

    private OConfig() {
        this.time = 2000L;
        this.channelIndexUpdate = false;
    }

    public OConfig(Parcel parcel) {
        this.time = 2000L;
        boolean z = false;
        this.channelIndexUpdate = false;
        this.env = parcel.readInt();
        this.appKey = parcel.readString();
        this.appVersion = parcel.readString();
        this.appSecret = parcel.readString();
        this.authCode = parcel.readString();
        this.userId = parcel.readString();
        this.serverType = parcel.readInt();
        this.indexUpdateMode = parcel.readInt();
        this.reportAck = parcel.readByte() != 0;
        this.statUsedConfig = parcel.readByte() != 0;
        this.probeHosts = parcel.createStringArray();
        this.dcHost = parcel.readString();
        this.dcVips = parcel.createStringArray();
        this.ackHost = parcel.readString();
        this.ackVips = parcel.createStringArray();
        this.time = parcel.readLong();
        this.channelIndexUpdate = parcel.readByte() != 0;
        this.enableDiffIndex = parcel.readByte() != 0 ? true : z;
    }
}
