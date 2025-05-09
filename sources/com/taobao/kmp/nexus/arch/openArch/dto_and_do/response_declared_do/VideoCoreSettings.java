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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 \u000f2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/VideoCoreSettings;", "Ltb/mzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "<set-?>", "UseFrontCameraCaptureMirror$delegate", "Ltb/qjg;", "getUseFrontCameraCaptureMirror", "()Ljava/lang/String;", "setUseFrontCameraCaptureMirror", "(Ljava/lang/String;)V", "UseFrontCameraCaptureMirror", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class VideoCoreSettings extends mzf implements Serializable {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final qjg UseFrontCameraCaptureMirror$delegate = new qjg(null, this, VideoCoreSettings$UseFrontCameraCaptureMirror$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536488);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1004536487);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(VideoCoreSettings.class, "UseFrontCameraCaptureMirror", "getUseFrontCameraCaptureMirror()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl};
    }

    public static /* synthetic */ Object ipc$super(VideoCoreSettings videoCoreSettings, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/VideoCoreSettings");
    }

    public final String getUseFrontCameraCaptureMirror() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bcb49f1", new Object[]{this});
        }
        return (String) this.UseFrontCameraCaptureMirror$delegate.b(this, $$delegatedProperties[0]);
    }

    public final void setUseFrontCameraCaptureMirror(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3885bb0d", new Object[]{this, str});
        } else {
            this.UseFrontCameraCaptureMirror$delegate.a(this, $$delegatedProperties[0], str);
        }
    }
}
