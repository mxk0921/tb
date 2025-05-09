package com.taobao.android.dressup.base;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.acq;
import tb.g1c;
import tb.jz7;
import tb.t2o;
import tb.xod;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/taobao/android/dressup/base/DressupFeedFlowActivity;", "Lcom/taobao/android/dressup/base/BaseDressupActivity;", "<init>", "()V", "Companion", "a", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DressupFeedFlowActivity extends BaseDressupActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "DressupFeedFlowActivity";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552591);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552590);
    }

    public static /* synthetic */ Object ipc$super(DressupFeedFlowActivity dressupFeedFlowActivity, String str, Object... objArr) {
        if (str.hashCode() == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/base/DressupFeedFlowActivity");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // com.taobao.android.dressup.base.BaseDressupActivity
    public xod n3(g1c g1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xod) ipChange.ipc$dispatch("fdc2f3d3", new Object[]{this, g1cVar});
        }
        return jz7.Companion.g(g1cVar);
    }
}
