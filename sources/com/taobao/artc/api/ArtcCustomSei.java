package com.taobao.artc.api;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ArtcCustomSei {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_SEI_DATA_LEN = 1024;
    private boolean forceKeyFrame;
    private int payloadType;
    private String seiData;
    private boolean send;
    private boolean sendOnce;
    private String targetUserId;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean forceKeyFrame;
        private int payloadType;
        private String seiData;
        private boolean send;
        private boolean sendOnce;
        private String targetUserId;

        static {
            t2o.a(395313175);
        }

        public static /* synthetic */ String access$000(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("dd565a62", new Object[]{builder});
            }
            return builder.seiData;
        }

        public static /* synthetic */ boolean access$100(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("aaa83c21", new Object[]{builder})).booleanValue();
            }
            return builder.forceKeyFrame;
        }

        public static /* synthetic */ int access$200(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9c51e22f", new Object[]{builder})).intValue();
            }
            return builder.payloadType;
        }

        public static /* synthetic */ boolean access$300(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8dfb885f", new Object[]{builder})).booleanValue();
            }
            return builder.send;
        }

        public static /* synthetic */ boolean access$400(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7fa52e7e", new Object[]{builder})).booleanValue();
            }
            return builder.sendOnce;
        }

        public static /* synthetic */ String access$500(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("281dc527", new Object[]{builder});
            }
            return builder.targetUserId;
        }

        public Builder SetForceKeyFrame(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("561083db", new Object[]{this, new Boolean(z)});
            }
            this.forceKeyFrame = z;
            return this;
        }

        public Builder SetTargetUserId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("66cfacef", new Object[]{this, str});
            }
            this.targetUserId = str;
            return this;
        }

        public ArtcCustomSei build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArtcCustomSei) ipChange.ipc$dispatch("ffc552b1", new Object[]{this});
            }
            return new ArtcCustomSei(this);
        }

        public Builder setPayloadType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3d6a4a7b", new Object[]{this, new Integer(i)});
            }
            this.payloadType = i;
            return this;
        }

        public Builder setSeiData(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c6838235", new Object[]{this, str});
            }
            this.seiData = str;
            return this;
        }

        public Builder setSendPolicy(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("357c2868", new Object[]{this, new Boolean(z), new Boolean(z2)});
            }
            this.send = z;
            this.sendOnce = z2;
            return this;
        }
    }

    static {
        t2o.a(395313173);
    }

    public boolean getForceKeyFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c92849ae", new Object[]{this})).booleanValue();
        }
        return this.forceKeyFrame;
    }

    public int getMaxSeiDataLen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cddc01fc", new Object[]{this})).intValue();
        }
        return 1024;
    }

    public String getSeiData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0bbd76e", new Object[]{this});
        }
        return this.seiData;
    }

    public String getTargetUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98c07f6c", new Object[]{this});
        }
        return this.targetUserId;
    }

    public void setForceKeyFrame(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f30d2076", new Object[]{this, new Boolean(z)});
        } else {
            this.forceKeyFrame = z;
        }
    }

    public void setSendPolicy(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fe56523", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.send = z;
        this.sendOnce = z2;
    }

    private ArtcCustomSei(Builder builder) {
        this.seiData = Builder.access$000(builder);
        this.forceKeyFrame = Builder.access$100(builder);
        this.payloadType = Builder.access$200(builder);
        this.send = Builder.access$300(builder);
        this.sendOnce = Builder.access$400(builder);
        this.targetUserId = Builder.access$500(builder);
    }
}
