package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.taobao.cus.WVCusPlugin;
import com.taobao.cus.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final /* synthetic */ class cqw implements b.AbstractC0548b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ nsw f17252a;
    public final /* synthetic */ WVCallBackContext b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ cqw(nsw nswVar, WVCallBackContext wVCallBackContext, String str, String str2, String str3) {
        this.f17252a = nswVar;
        this.b = wVCallBackContext;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final void a(boolean z, String str) {
        WVCusPlugin.lambda$execute$6(this.f17252a, this.b, this.c, this.d, this.e, z, str);
    }
}
