package com.taobao.themis.pub_kit.guide;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.c8;
import tb.ckf;
import tb.d1a;
import tb.n8;
import tb.n9;
import tb.u8;
import tb.xhv;
import tb.y7;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubIconChangeGuide$doShowICONChangeStrongGuide$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ JSONObject $inputJson;
    public final /* synthetic */ n9 $runtimeContext;
    public final /* synthetic */ PubIconChangeGuide this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements u8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // tb.u8
        public final void callback(String str, c8 c8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc026703", new Object[]{this, str, c8Var});
            } else {
                TMSLogger.f("iconChangeGuidePopup", ckf.p(str, c8Var));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubIconChangeGuide$doShowICONChangeStrongGuide$1(PubIconChangeGuide pubIconChangeGuide, JSONObject jSONObject, n9 n9Var) {
        super(0);
        this.this$0 = pubIconChangeGuide;
        this.$inputJson = jSONObject;
        this.$runtimeContext = n9Var;
    }

    public static /* synthetic */ Object ipc$super(PubIconChangeGuide$doShowICONChangeStrongGuide$1 pubIconChangeGuide$doShowICONChangeStrongGuide$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub_kit/guide/PubIconChangeGuide$doShowICONChangeStrongGuide$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (!((Activity) PubIconChangeGuide.a(this.this$0)).isFinishing()) {
            new y7().b(new n8(this.$inputJson), this.$runtimeContext, a.INSTANCE);
        }
    }
}
