package com.taobao.kmp.render;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import tb.a07;
import tb.a0g;
import tb.alk;
import tb.by1;
import tb.ckf;
import tb.dun;
import tb.t2o;
import tb.yew;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000 \u00172\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001\u0018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR+\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/taobao/kmp/render/ErrorModel;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ltb/by1;", "<init>", "()V", "", "<set-?>", "title$delegate", "Ltb/alk;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "message$delegate", "getMessage", "setMessage", "message", "buttonText$delegate", "getButtonText", "setButtonText", "buttonText", "Companion", "a", "cmp-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ErrorModel extends by1 implements Serializable {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final alk title$delegate = yew.a("");
    private final alk message$delegate = yew.a("");
    private final alk buttonText$delegate = yew.a("");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1001390084);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(ErrorModel errorModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/render/ErrorModel");
    }

    public final String getButtonText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62bd2aa4", new Object[]{this});
        }
        return (String) this.buttonText$delegate.a(this, $$delegatedProperties[2]);
    }

    public final String getMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
        }
        return (String) this.message$delegate.a(this, $$delegatedProperties[1]);
    }

    public final String getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return (String) this.title$delegate.a(this, $$delegatedProperties[0]);
    }

    public final void setButtonText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bd1b152", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.buttonText$delegate.b(this, $$delegatedProperties[2], str);
    }

    public final void setMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a65216", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.message$delegate.b(this, $$delegatedProperties[1], str);
    }

    public final void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.title$delegate.b(this, $$delegatedProperties[0], str);
    }

    static {
        t2o.a(1001390083);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ErrorModel.class, "title", "getTitle()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl);
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(ErrorModel.class, "message", "getMessage()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl2);
        MutablePropertyReference1Impl mutablePropertyReference1Impl3 = new MutablePropertyReference1Impl(ErrorModel.class, "buttonText", "getButtonText()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl3);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, mutablePropertyReference1Impl3};
    }
}
