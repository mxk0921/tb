package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g94 extends f6j<MainRequestParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262172);
    }

    public g94(MainRequestParams mainRequestParams) {
        super(mainRequestParams);
    }

    public static /* synthetic */ Object ipc$super(g94 g94Var, String str, Object... objArr) {
        if (str.hashCode() == 1379936911) {
            super.a();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/request/client/CompatibleMainRequestClient");
    }

    @Override // tb.f6j
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52402a8f", new Object[]{this});
            return;
        }
        this.b.setBizId(9998);
        this.b.handler(u5o.c());
        this.b.supportStreamJson(true);
        super.a();
    }

    @Override // tb.f6j
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return "mtop.taobao.detail.getDetail";
    }

    @Override // tb.f6j
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
        }
        return j5m.API_VERSION;
    }
}
