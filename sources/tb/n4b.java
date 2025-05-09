package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n4b implements hdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends ypk<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f24507a;

        public a(n4b n4bVar, WVCallBackContext wVCallBackContext) {
            this.f24507a = wVCallBackContext;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/homepage/windvane/feature/HomeTaoWiseJsFeature$1");
        }

        @Override // tb.ypk
        public void a(bdt<Integer> bdtVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c289c882", new Object[]{this, bdtVar});
                return;
            }
            this.f24507a.success();
            bqa.d("HomeTaoWiseJsFeature", "远程化下载好了");
        }
    }

    static {
        t2o.a(729809378);
        t2o.a(729809365);
    }

    public final void a(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a33af246", new Object[]{this, wVCallBackContext});
        } else {
            vcq.a(Globals.getApplication()).c(xcq.c().l("taowise_android_aar").n()).a(new a(this, wVCallBackContext));
        }
    }

    @Override // tb.hdc
    public List<String> getActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("39cd6eb9", new Object[]{this});
        }
        return Collections.singletonList("isCanShowTaoWise");
    }

    @Override // tb.hdc
    public boolean e(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        bqa.d("HomeTaoWiseJsFeature", "想要出语音搜入口了");
        ddv.c("showTaoWise", "1.0");
        a(wVCallBackContext);
        return true;
    }
}
