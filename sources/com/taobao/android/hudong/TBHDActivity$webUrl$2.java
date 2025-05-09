package com.taobao.android.hudong;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.myu;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class TBHDActivity$webUrl$2 extends Lambda implements d1a<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TBHDActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TBHDActivity$webUrl$2(TBHDActivity tBHDActivity) {
        super(0);
        this.this$0 = tBHDActivity;
    }

    public static /* synthetic */ Object ipc$super(TBHDActivity$webUrl$2 tBHDActivity$webUrl$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/hudong/TBHDActivity$webUrl$2");
    }

    @Override // tb.d1a
    public final String invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
        }
        String stringExtra = this.this$0.getIntent().getStringExtra(myu.HD_INTERCEPT_URL_KEY);
        stringExtra = null;
        if (stringExtra == null || stringExtra.length() <= 0) {
        }
        if (stringExtra != null) {
            return stringExtra;
        }
        String uri = this.this$0.getIntent().getData().toString();
        ckf.f(uri, "intent.data.toString()");
        return uri;
    }
}
