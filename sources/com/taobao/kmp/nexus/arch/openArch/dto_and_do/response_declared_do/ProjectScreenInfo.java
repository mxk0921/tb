package com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import tb.a07;
import tb.a0g;
import tb.dun;
import tb.mzf;
import tb.qjg;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0001\u0018\u0000 \u00172\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR/\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ProjectScreenInfo;", "Ltb/mzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "<set-?>", "enableProjectScreen$delegate", "Ltb/qjg;", "getEnableProjectScreen", "()Ljava/lang/String;", "setEnableProjectScreen", "(Ljava/lang/String;)V", "enableProjectScreen", "projectScreenPlayUrl$delegate", "getProjectScreenPlayUrl", "setProjectScreenPlayUrl", "projectScreenPlayUrl", "projectScreenPlayUrlBackup$delegate", "getProjectScreenPlayUrlBackup", "setProjectScreenPlayUrlBackup", "projectScreenPlayUrlBackup", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ProjectScreenInfo extends mzf implements Serializable {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final qjg enableProjectScreen$delegate = new qjg(null, this, ProjectScreenInfo$enableProjectScreen$2.INSTANCE);
    private final qjg projectScreenPlayUrl$delegate = new qjg(null, this, ProjectScreenInfo$projectScreenPlayUrl$2.INSTANCE);
    private final qjg projectScreenPlayUrlBackup$delegate = new qjg(null, this, ProjectScreenInfo$projectScreenPlayUrlBackup$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536427);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(ProjectScreenInfo projectScreenInfo, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ProjectScreenInfo");
    }

    public final String getEnableProjectScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55dd058d", new Object[]{this});
        }
        return (String) this.enableProjectScreen$delegate.b(this, $$delegatedProperties[0]);
    }

    public final String getProjectScreenPlayUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec328d0d", new Object[]{this});
        }
        return (String) this.projectScreenPlayUrl$delegate.b(this, $$delegatedProperties[1]);
    }

    public final String getProjectScreenPlayUrlBackup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf70ad6b", new Object[]{this});
        }
        return (String) this.projectScreenPlayUrlBackup$delegate.b(this, $$delegatedProperties[2]);
    }

    public final void setEnableProjectScreen(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d9926f1", new Object[]{this, str});
        } else {
            this.enableProjectScreen$delegate.a(this, $$delegatedProperties[0], str);
        }
    }

    public final void setProjectScreenPlayUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e68bd09", new Object[]{this, str});
        } else {
            this.projectScreenPlayUrl$delegate.a(this, $$delegatedProperties[1], str);
        }
    }

    public final void setProjectScreenPlayUrlBackup(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdeaef6b", new Object[]{this, str});
        } else {
            this.projectScreenPlayUrlBackup$delegate.a(this, $$delegatedProperties[2], str);
        }
    }

    static {
        t2o.a(1004536426);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ProjectScreenInfo.class, "enableProjectScreen", "getEnableProjectScreen()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl);
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(ProjectScreenInfo.class, "projectScreenPlayUrl", "getProjectScreenPlayUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl2);
        MutablePropertyReference1Impl mutablePropertyReference1Impl3 = new MutablePropertyReference1Impl(ProjectScreenInfo.class, "projectScreenPlayUrlBackup", "getProjectScreenPlayUrlBackup()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl3);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, mutablePropertyReference1Impl3};
    }
}
