package com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import tb.a07;
import tb.a0g;
import tb.dun;
import tb.hnn;
import tb.mzf;
import tb.qjg;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \"2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001#B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR/\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR/\u0010\u001d\u001a\u0004\u0018\u00010\u00172\b\u0010\u0007\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR/\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010\r¨\u0006$"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/SpfPlayVideo;", "Ltb/mzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "<set-?>", "playInfo$delegate", "Ltb/qjg;", "getPlayInfo", "()Ljava/lang/String;", "setPlayInfo", "(Ljava/lang/String;)V", "playInfo", "playMaterialType$delegate", "getPlayMaterialType", "setPlayMaterialType", "playMaterialType", "playMaterialVersion$delegate", "getPlayMaterialVersion", "setPlayMaterialVersion", "playMaterialVersion", "Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/TimeMovingUtParams;", "timeMovingUtParams$delegate", "getTimeMovingUtParams", "()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/TimeMovingUtParams;", "setTimeMovingUtParams", "(Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/TimeMovingUtParams;)V", "timeMovingUtParams", "videoType$delegate", "getVideoType", "setVideoType", hnn.KEY_VIDEO_TYPE, "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SpfPlayVideo extends mzf implements Serializable {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final qjg playInfo$delegate = new qjg(null, this, SpfPlayVideo$playInfo$2.INSTANCE);
    private final qjg playMaterialType$delegate = new qjg(null, this, SpfPlayVideo$playMaterialType$2.INSTANCE);
    private final qjg playMaterialVersion$delegate = new qjg(null, this, SpfPlayVideo$playMaterialVersion$2.INSTANCE);
    private final qjg timeMovingUtParams$delegate = new qjg(null, this, SpfPlayVideo$timeMovingUtParams$2.INSTANCE);
    private final qjg videoType$delegate = new qjg(null, this, SpfPlayVideo$videoType$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536436);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(SpfPlayVideo spfPlayVideo, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/SpfPlayVideo");
    }

    public final String getPlayInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7902281", new Object[]{this});
        }
        return (String) this.playInfo$delegate.b(this, $$delegatedProperties[0]);
    }

    public final String getPlayMaterialType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17f1b60e", new Object[]{this});
        }
        return (String) this.playMaterialType$delegate.b(this, $$delegatedProperties[1]);
    }

    public final String getPlayMaterialVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58bacb2", new Object[]{this});
        }
        return (String) this.playMaterialVersion$delegate.b(this, $$delegatedProperties[2]);
    }

    public final TimeMovingUtParams getTimeMovingUtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeMovingUtParams) ipChange.ipc$dispatch("b072b213", new Object[]{this});
        }
        return (TimeMovingUtParams) this.timeMovingUtParams$delegate.b(this, $$delegatedProperties[3]);
    }

    public final String getVideoType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a4b24ba", new Object[]{this});
        }
        return (String) this.videoType$delegate.b(this, $$delegatedProperties[4]);
    }

    public final void setPlayInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75518815", new Object[]{this, str});
        } else {
            this.playInfo$delegate.a(this, $$delegatedProperties[0], str);
        }
    }

    public final void setPlayMaterialType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22879a28", new Object[]{this, str});
        } else {
            this.playMaterialType$delegate.a(this, $$delegatedProperties[1], str);
        }
    }

    public final void setPlayMaterialVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73bf646c", new Object[]{this, str});
        } else {
            this.playMaterialVersion$delegate.a(this, $$delegatedProperties[2], str);
        }
    }

    public final void setTimeMovingUtParams(TimeMovingUtParams timeMovingUtParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de34cf7d", new Object[]{this, timeMovingUtParams});
        } else {
            this.timeMovingUtParams$delegate.a(this, $$delegatedProperties[3], timeMovingUtParams);
        }
    }

    public final void setVideoType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91572e64", new Object[]{this, str});
        } else {
            this.videoType$delegate.a(this, $$delegatedProperties[4], str);
        }
    }

    static {
        t2o.a(1004536435);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(SpfPlayVideo.class, "playInfo", "getPlayInfo()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl);
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(SpfPlayVideo.class, "playMaterialType", "getPlayMaterialType()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl2);
        MutablePropertyReference1Impl mutablePropertyReference1Impl3 = new MutablePropertyReference1Impl(SpfPlayVideo.class, "playMaterialVersion", "getPlayMaterialVersion()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl3);
        MutablePropertyReference1Impl mutablePropertyReference1Impl4 = new MutablePropertyReference1Impl(SpfPlayVideo.class, "timeMovingUtParams", "getTimeMovingUtParams()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/TimeMovingUtParams;", 0);
        dun.f(mutablePropertyReference1Impl4);
        MutablePropertyReference1Impl mutablePropertyReference1Impl5 = new MutablePropertyReference1Impl(SpfPlayVideo.class, hnn.KEY_VIDEO_TYPE, "getVideoType()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl5);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, mutablePropertyReference1Impl3, mutablePropertyReference1Impl4, mutablePropertyReference1Impl5};
    }
}
